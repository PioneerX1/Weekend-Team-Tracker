# _Weekend Team Tracker_

#### _Allow Weekend Hackathon Coordinator to manage teams, July 7, 2017_

#### By _**Mick Sexton**_

## Description

_This application can be used by a Weekend Hackathon Coordinator to manage and track teams. They can add teams, as well as add members to each team. There is also a page for details on the hackathon if the coordinator needs some background info on the organization._

## Setup/Installation Requirements

* _Download the Weekend-Team-Tracker folder_
* _type in "gradle run" in your command line_
* _open a browser and go to localhost:4567_

## Code Specs

|Behavior - Plain English|Input|Output|
|---|---|---|
|User sees welcome message on home page with options to view a specific team, add a new team, or learn more about the event|User selects add a new team|User goes to Add a New Team page|
|User sees welcome message on home page with options to view a specific team, add a new team, or learn more about the event|User selects add a new team|User selects learn more about event|User goes to Details page|
|User sees welcome message on home page with options to view a specific team, add a new team, or learn more about the event|User selects an individual team|User goes to the specific team page|
|User is on Add a New Team page|User types in a team name in text field and clicks submit button|User receives a success message and can then click on View All Teams again to go back to Home Page|
|User is on Details page|User can read the content to learn more about the hackathon event and then click on Click Here to view all teams|User clicks on that link and goes back to Home page with teams listed|
|User is on a specific Team page like the Rogue Yoshi's, this shows all members currently under that team|User can click on Add a New Member to add additional members to that team or go back to Home Page|IF Add a new Member clicked, they go to New Member Form page, IF they click on View All Teams, they go back to Home Page|
|User is on Add New Member page|User types in the Member name in field and clicks the submit button|User then goes to a member success page where they can go back and see all that specific team's members with the new member now added|


## Known Bugs

_No known issues or bugs at this time_

## Support and contact details

_Please contact Mick Sexton at lacrookedbeat@hotmail.com for any questions, feedback, or concerns._

## Technologies Used

_Technologies used include Java, Atom, Git, Gradle, GitHub, Spark, CSS, J-Unit, and Velocity_

### License

*This software operates under the MIT license.*

Copyright (c) 2017 **_Mick Sexton_**
