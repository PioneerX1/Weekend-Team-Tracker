import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    //create a couple teams and members to get the coordinator started - demo data
    Team defaultTeam1 = new Team("The Rogue Yoshi's");
    Member defaultMember1 = new Member("Luigi");
    defaultTeam1.addMember(defaultMember1);
    Team defaultTeam2 =  new Team("Twin Peaks");
    Member defaultMember2 = new Member("Laura Palmer");
    defaultTeam2.addMember(defaultMember2);


    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      model.put("teams", Team.getAllTeams());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("teams", Team.getAllTeams());
      model.put("template", "templates/teams.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team team = Team.findTeam(Integer.parseInt(request.params(":id")));
      model.put("team", team);
      model.put("template", "templates/team.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/newteam", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/team-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String teamName = request.queryParams("team-name");
      Team newTeam = new Team(teamName);
      model.put("template", "templates/team-success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams/:id/members/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team team = Team.findTeam(Integer.parseInt(request.params(":id")));
      model.put("team", team);
      model.put("template", "templates/member-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/teams/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team team = Team.findTeam(Integer.parseInt(request.params(":id")));
      String memberName = request.queryParams("member-name");
      Member newMember = new Member(memberName);
      team.addMember(newMember);
      model.put("team", team);
      model.put("template", "templates/member-success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/details", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/details.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
