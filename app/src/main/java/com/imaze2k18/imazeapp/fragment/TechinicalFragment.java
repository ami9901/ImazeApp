package com.imaze2k18.imazeapp.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.imaze2k18.imazeapp.Activity.DetailseventActivity;
import com.imaze2k18.imazeapp.Adapter.MyExListAdapter;
import com.imaze2k18.imazeapp.R;
import com.imaze2k18.imazeapp.logging.L;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TechinicalFragment extends Fragment {

    private View view;

    ExpandableListView explistview;
    ExpandableListAdapter listAdapter;
    List<String> dept;
    Map<String,List<String>> events;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_techinical, container, false);
        explistview=(ExpandableListView) view.findViewById(R.id.list);
        explistview.setGroupIndicator(null);
        filldata();
        listAdapter = new MyExListAdapter(getContext(),dept,events);
        explistview.setAdapter(listAdapter);

        explistview.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if(groupPosition != previousGroup)
                    explistview.collapseGroup(previousGroup);
                previousGroup = groupPosition;
            }
        });

        explistview.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                String str =events.get(dept.get(groupPosition)).get(childPosition).toLowerCase().replaceAll(" ","");
                L.m(str+" hello");

                switch (str){
                    case "pure-e-fire":
                        //code
                        Intent i =new Intent(getActivity(), DetailseventActivity.class);
                        i.putExtra("my_key","<b><h2>Pure – E – Fire</h2> </b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Chemo-enthusiasts, awaken. Identify the chemicals in the initial phase and create an" +
                                " incredible cosmos of eye-appealing reactions from them. Make your way to the final round" +
                                " by removing impurities from the liquid given to you. Brush up your constructive skills by" +
                                " making a filter. May the best creator win!.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with 2 members only.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "<b>Phase 1:</b>  A tricky question in the form of puzzle or riddle on the property or" +
                                " applicability of the concerned chemical will be given and participants must answer it" +
                                " correctly.<br/>" +
                                "<b>Phase 2:</b>  Based on the chemical identified and the set of reagent table given," +
                                " participants will have to perform a magical reaction. They will also have to explain" +
                                " the mechanism.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b> Mud or silt uniform water of known mechanism will be given and their" +
                                " filter will have to remove maximum mud or silt. Maximum five absorbent will be" +
                                " allowed.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>"+"Participants will make a filter in which a known solution of KMnO4 of" +
                                " known pH will be passed. Filter should bring down the pH closest possible to 7.<br/><br/>" +
                                "<b><h3>Constraints:</h3></b>" +
                                "No membranes allowed. Only five absorbents can be used.<br/>" +
                                "Dimensions: (0.5×0.5×0.75)m<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Answer of the question, Magical effect, Reaction Mechanism<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Concentration of Gradient, Titration techniques, pH change (should be near to 7)<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Volume of Solution Obtained. Time Taken. Change in concentration and pH as" +
                                " compared to Round 2.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                " <b>Viraj Dalsaniya </b><br/>   9601250529<br/>   virajdalsaniya1996@gmail.com<br/><br/>" +
                                " <b>Vrundan Pandya </b><br/>   9033687099<br/>    vrundan6886@gmail.com<br/><br/>" +
                                "<b><h3>Note:</h3></b> Certificate will be provided to the only participant who is registered and at the same day present " +
                                "in the event.<br/>");
                        startActivity(i);
                        break;
                    case "chemquest":
                        //code
                        Intent iv =new Intent(getActivity(), DetailseventActivity.class);
                        iv.putExtra("my_key","<b><h2>Chem Quest</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Do you know your chemicals? Prove it. Answer the riddles, mull over the puzzles given to you," +
                                " and you gain an entrance to Dexter’s Laboratory. The ones that pass Dexter’s test shall qualify" +
                                " for the quest ahead that will take them to places that hide many treasures.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with 3 members only.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>In this round there will be a set of questions related to basic chemistry in the" +
                                " form of why, what, which and where in form of riddles, videos, complete the reaction, oneline" +
                                " answers etc.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b> Every group will be given samples in which they have to react 2 chemicals and" +
                                " make a product. That product will further be reacted and that the team will have to identify" +
                                " using qualitative analysis.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>It will be a chemistry related treasure hunt.<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Top 20 groups scoring maximum marks will go for round 2.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Top 6 teams to find out the product in least time wins.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Team to first form the chemical structure wins.<br/><br/>" +
                                "<b><h3>Co-ordinator Details: </h3></b>" +
                                "<b>Nihir Patel </b><br/> 9725431222<br/> nihirpatel97@gmail.com<br/><br/>" +
                                "<b>Rutvik Patel </b><br/> 9426628898<br/> kivturpatel@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b> Certificate will be provided to the only participant who is registered and at the same day present" +
                                "in the event.<br/><br/>" +
                                "<b><h3>Note: </h3></b>Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(iv);
                        break;
                    case "pump-shoot-clean":
                        //code
                        Intent ivf =new Intent(getActivity(), DetailseventActivity.class);
                        ivf.putExtra("my_key","<b><h2>Pump-Shoot-Clean</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Make a pump. Simple isn’t it? But wait, there’s more. Can your pump endure our tests and" +
                                " be victorious? Transport water from one bucket to another, shoot water jets and filter the" +
                                " dirty water to triumph.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with 1-3 members.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Teams will have to transfer water from 1 bucket to another using their pumps<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "In this round, participants will shoot water jet from bucket using their pumps.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Teams will have to modify their pump at their own will using asy available parts.Then" +
                                " they will have to transfer 1 litre of water from 1 bucket to another along with" +
                                "cleaning it.<br/><br/>" +
                                "<b><h3>Rules:</h3></b>" +
                                "Dimensions should not be greater than 1×1 feet.<br/>" +
                                "Motor used in pump should not be greater than 6000 rpm.<br/>" +
                                "Inlet and outlet pipe should be ¼ inch level.<br/>" +
                                "Using membrane for filtration is not allowed.<br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>Volume of water transported by the pump.<br/><br/>" +
                                "<b><h4>Round 2: </h4></b>Distance covered by the water jet formed.<br/><br/>" +
                                "<b><h4>Round 3: </h4></b>The Design, the volume of water transported and magnitude of cleanliness" +
                                "of water.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Jainil Bhatt </b><br/>9725151477<br/> jainilbhatt22@gmail.com<br/><br/>" +
                                "<b>Ketul Modh </b><br/>8866643598<br/> ketulmodh107@gmail.com<br/><br/>" +
                                "<b><h3>Note:</h3></b>Certificate will be provided to the only participant who is registered and at the same day present" +
                                "in the event.<br/><br/>" +
                                "<b><h3>Note:</h3></b>Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(ivf);
                        break;
                    case "techybubble":
                        //code
                        Intent ive =new Intent(getActivity(), DetailseventActivity.class);
                        ive.putExtra("my_key","<b><h2> Techy Bubble</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Pass the technical quiz, debug the code and you’re done. Well, almost. Can you code blind? Test your coding skills in the ultimate test and you win it all.<br/><br/>"+
                                "<b><h3>Team Members:</h3></b>" +
                                "2 Members<br/><br/>"+
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>“Let’s test stylesheet” HTML and CSS Quiz.<br/><br/>" +
                                "<b><h4>Round 2: </h4></b>Crack the ZIP–Crack the code and try to build the image.<br/><br/>" +
                                "<b><h4>Round 3: </h4></b>Blind Maze– Blind coding and swapping.<br/><br/>" +
                                "<b><h3>Judgement criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b> Teams will be short listed on the basis of number of correct answers.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b> The one who collects more parts of the picture. Time and Code efficiency.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b> Number of points gained by solving puzzle and program.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Sanket Shah </b><br/> 8758480477\t Shahsanket587@gmail.com <br/><br/>" +
                                "<b>Nishith Gadhiya </b><br/> 9099022373\t gadhiyanishith@gmail.com<br/><br/>" +
                                "<b>Simranbanu Diwan </b><br/> 9601575556\t diwansimran98@gmail.com<br/><br/>" +
                                "<b><h3>Note:</h3></b> Certificate will be provided to only those participants who have registered and are present in the event.<br/><br/>" +
                                "<b><h3>Note:</h3></b> Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(ive);
                        break;
                    case "geekonfleek":
                        //code
                        Intent ivc =new Intent(getActivity(), DetailseventActivity.class);
                        ivc.putExtra("my_key","<b><h2>Geek on Fleek</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Knowledge is money. Your insides of the tech-world will get you the power to excel at the auction. The more you solve, the more you earn. Come on, Manifest your coding skills.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with maximum of 2 members in a team.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>Technical quiz on languages, recent technologies and the digital world.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>The points of previous round will be used for building their profile, which will then be used as means for programmer’s auction.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>In this round the participants will be given a problem definition and they have to develop an application on the same within 3 hours.<br/><br/>" +
                                "<b><h3>Judgement criteria:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>Number of correct answers.<br/><br/>" +
                                "<b><h4>Round 2: </h4></b>Number of programs completed successfully.<br/><br/>" +
                                "<b><h4>Round 3: </h4></b>Functionality of application and time.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Parshva Shah </b><br/> 9737825758<br/> parshvashah2014@gmail.com<br/>" +
                                "<b>Vishv Trivedi </b><br/> 8530242912<br/> vishv43@gmail.com<br/>" +
                                "<b>Vyom Shah </b><br/> 8141667815<br/> vyom0123@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificate will be provided to only those participants who have registered and are present in the event.<br/><br/>" +
                                "<b><h3>Note: </h3></b>Decision of the judges and coordinators will be final and binding to all.<br/><br/>");
                        startActivity(ivc);
                        break;
                    case "electric-era":
                        //code
                        Intent ivs =new Intent(getActivity(), DetailseventActivity.class);
                        ivs.putExtra("my_key","<b><h2>Electric-Era</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Are you a technocrat? Then open up for quiz and hunt with your technical skills and implement your circuit with unlocked achievements.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Max. 3<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Technical quiz<br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Technical Treasure Hunt<br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Troubleshooting of domestic or regular equipment.<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "The teams with more correct answers in the quiz will be selected. The number of teams shortlisted will depend on the number of entries.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Solve the circuit or problem to unveil the clue.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "The teams have to troubleshoot or implement the circuit.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Dhruv Ardeshana </b><br/> 9714503229<br/> ardeshanadhruv@gmail.com <br/><br/>" +
                                "<b>Yash Kothadia </b><br/> 9714921965<br/> kothadiyayash@gmail.com<br/>" +
                                "<b>Tejas Dobariya </b><br/> 9601039484<br/> tejasdobariy1998@gmail.com<br/>" +
                                "<b><h3>Note:</h3></b> Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/><br/>" +
                                "<b><h3>Note:</h3></b> Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(ivs);
                        break;
                    case "abhedya":
                        //code
                        Intent iva =new Intent(getActivity(), DetailseventActivity.class);
                        iva.putExtra("my_key","<b> <h2>Abhedya</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Get ready for a technical tour. Be a DORA, identify the unknown, fight challenges and save yourself from venoms. Explore the world for the treasure.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with maximum of 2 members in a team.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Visual round. Identify the pictures and mistakes from pictures or video.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "The game of snake and ladder is played based on technical quiz.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Surprise Round.<br/><br/>" +
                                "<b><h3>Judgement criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "The teams will be shortlisted on the basis of points earned by identifying the pictures/visuals and their answers.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Teams that reach the final destination faster will move to the next round.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Surprise round." +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Forum Patel </b><br/> 7405680280<br/> forumpatel98@gmail.com<br/><br/>" +
                                "<b>Priyank Patel </b><br/> 7567699151<br/> priyanknpatelcby@gmail.com<br/><br/>" +
                                "<b>Tej Shah </b><br/> 9408920985<br/> tirthtej1997@gmail.com <br/><br/>" +
                                "<b><h3>Note:</h3></b> Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/><br/>" +
                                "<b><h3>Note:</h3></b> Decision of the judges and coordinators will be final and binding to all.<br/><br/>");
                        startActivity(iva);
                        break;
                    case "carathon":
                        //code
                        Intent ivx =new Intent(getActivity(), DetailseventActivity.class);
                        ivx.putExtra("my_key","<b> <h2>Carathon</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Design your robo-cars and see if they can undergo the tasks and conditional tests designed to break it. Endure all the phases and be triumphant.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Max. 3<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Complete the pre-designed track using supply provided using rectifier/choppers circuits.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Make your car jump off slopes using choppers/rectifiers.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Use track supply collector and perform tasks.<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Two teams will race simultaneously. Whoever completes the race first will be the winner. Bonus points if rectifier circuit/ chopper is made by the participants themselves.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Slope angle × Distance between slope = Points<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Points = Weight carried by the car/time.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Vijay Helaiya </b><br/> 9601188829<br/> vmhelaiya98@gmail.com<br/><br/>" +
                                "<b>Keyur Nimavat </b><br/> 8200319563<br/> keyurnimavat97@gmail.com<br/><br/>" +
                                "<b>Viraj Hadvani</b><br/> 9724685320<br/> virajhadvani1998@gmail.com<br/><br/>" +
                                "<b><h3>Note:</h3> </b>Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/><br/>" +
                                "<b><h3>Note: </h3></b>Decision of the judges and coordinators will be final and binding to all.");
                        startActivity(ivx);
                        break;
                    case "builder'shut":
                        //code</b>
                        Intent ivd =new Intent(getActivity(), DetailseventActivity.class);
                        ivd.putExtra("my_key","<b> <h2>Builder’s Hut</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Recognise the building materials and tools from the clues given to you. Solve the puzzles that lead to more puzzles. Finish off by exhibiting your architectural abilities by planning a building onto given conditional factors.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "3 to 4 team members.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>Participant has to select 5 cards randomly from the deck, each card will have a number and each number will represent a civil material or equipment, one has to name that thing.<br/><br/>" +
                                "<b><h4>Round 2: </h4></b>Solve hints and each answer leads to another hint. Hints may include civil related clues.<br/>v" +
                                "<b><h4>Round 3:</h4></b>Teams have to design a building abiding by the bye-laws according to the given area and then draw it on a sheet. They also have to implement this using clay and other materials.<br/><br/>" +
                                "<b>Judgement Criteria:</b>" +
                                "<b><h4>Round 1: </h4></b>The students will be judged on the basis of their technical knowledge.<br/><br/>" +
                                "<b><h4>Round 2: </h4></b>In this round the teams will be shortlisted on the basis of the time taken by them to complete the task.<br/><br/>" +
                                "<b><h4>Round 3: </h4></b>In this round the participants will be judged on the basis of aspect, economy, functionality and building bye-laws.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Zeel Patel </b><br/>7874192369 <br/>patelzeel480@gmail.com<br/><br/>" +
                                "<b>Hiten Patel </b><br/>9737177810 <br/>patelhiten10@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/><br/>" +
                                "<b><h3>Note: </h3></b>Decision of the judges and coordinators will be final and binding to all.");
                        startActivity(ivd);
                        break;
                    case "paperstruct":
                        //code
                        Intent ivl =new Intent(getActivity(), DetailseventActivity.class);
                        ivl.putExtra("my_key","<b> <h2>Paper Struct</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Make the impossible possible. Use paper and tape to build an overhead tank. Make the edifice sustainable under as much load as possible.<br/><br/>" +
                                "<b>Team Members:</h3></b>" +
                                "3 to 4 members<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "1st round will be quiz. This is the elimination round.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "In this round the participants have to build a structure of overhead tank using newspaper and tape. The structure should hold as much load as possible.<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "The teams will be judged on the basis of the amount of load their structure can bear.<br/><br/>" +
                                "<b><h3>Rules:</h3></b>" +
                                " Base of the structure should not be more than 20 cm x 20 cm.<br/>" +
                                " Height of the structure should not be less than 20 cm.<br/>" +
                                " Tape should only be used to connect the ends of material. Participants can’t wrap the newspaper with tape.<br/>" +
                                " Participants must use only one paper for column/beam.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Rohan Lakhani </b><br/>9723475224 <br/>rohanlakhani.lakhani@gmail.com<br/><br/>" +
                                "<b>Kishan Thacker </b><br/>9427397442 <br/>kishanthacker98@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/>");
                        startActivity(ivl);
                        break;
                    case "thebridge":
                        //code
                        Intent ivn =new Intent(getActivity(), DetailseventActivity.class);
                        ivn.putExtra("my_key","<b> <h2>The Bridge</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Unleash the fabricator within you and design a Trussed Arch Bridge. Get as creative as possible and use Popsicle sticks and fevicol to create a bridge that can endure extreme loads without failure.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "3-4 Members per team<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Every team has to design a trussed arch bridge using Popsicle sticks and fevicol as adhesive. The bridge will be tested for strength by applying vertical loads on it. The weight of the bridge will also be checked.<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "The final scoring will be on the basis of ratio of max load to weight of the bridge.<br/>" +
                                "Dimensions of the bridge:<br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Aditya Thakkar </b><br/>9429870707 <br/>adityathakkar1234@gmail.com<br/><br/>" +
                                "<b>Pratik Kabra </b><br/>8758023088 <br/>pratikkabra@yahoo.in<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/><br/>" +
                                "<b><h3>Note: </h3></b>Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(ivn);
                        break;
                    case "ideathon":
                        //code
                        Intent ivb =new Intent(getActivity(), DetailseventActivity.class);
                        ivb.putExtra("my_key","<b><h2>Ideathon</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "If imagination and originality are the qualities on your skill-set then this is the event you’ve been looking for. Give wings to your ideas and a vision to your thoughts. Set your brain cells free and let them explore every idea on the tree.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Max. 3 team members<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b> Topics will be given to the students and they have to come up with practical possible ideas and explain it in the board.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b> Participants will choose a helping hand and then they will be given random topics with certain time criteria and they need to shape their thoughts into practical vision and perform it in a small model.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b> Participants will be alloted new topics and they have to design a model on that using the help of chosen helping hands.<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "The participants will be judged on the basis of the following:<br/><br/>" +
                                "1. Feasibility<br/>" +
                                "2. Originality<br/>" +
                                "3. Benefits to the society<br/>" +
                                "4. Stake holders<br/>" +
                                "5. Cost of unit<br/>" +
                                "6. Durability of idea<br/>" +
                                "7. Compactness<br/>" +
                                "8. Possibilities of revenue generation<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</b>" +
                                "<b>Aman Sinha </b><br/>9879553715<br/>amanssinha9@gmail.com<br/><br/>" +
                                "<b>Komal Parikh </b><br/>9909765003<br/>komalparikh.kp@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/><br/>" +
                                "<b><h3>Note:</h3> </b>Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(ivb);
                        break;
                    case "circuitrix":
                        //code
                        Intent ivk =new Intent(getActivity(), DetailseventActivity.class);
                        ivk.putExtra("my_key","<h2>Circuitrix</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Check your connections and re brush your simulation skills because this event tests your hardware and software skills at the same time. So, if you think you’ve got the precision and skills for this then this is the event for you.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Two team members.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>Technical quiz which includes the multiple choice questions regarding basics of electronics, current trends in electronics and will have some exciting questions on MATLAB debugging.<br/><br/>" +
                                "<b><h4>Round 2: </h4></b>In this round the participants have to implement a simple circuit using lab view.<br/><br/>" +
                                "<b><h4>Round 3: </h4></b>This round will have treasure hunt in the beginning where participants will have to solve technical clues to reach up to the destination. After this they will be given components and using them they need to achieve the output as per the instructions.<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>Teams will be shortlisted on the basis of marks scored in the quiz.<br/><br/>" +
                                "<b><h4>Round 2: </h4></b>60 minutes will be given to the participants to perform the task, decision will be made on time and output basis.<br/><br/>" +
                                "<b><h4>Round 3: </h4></b>90 minutes will be given in total to the participants for the treasure hunt and the circuit implementation, winner will be announced on time and output basis.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Rajnandini Tiwari </b><br/>9904755417<br/>rajnandinitiwari@gmail.com<br/><br/>" +
                                "<b>Yatri Patel</b><br/> 9016991886<br/> yatrikpatel30@gmail.com<br/><br/>" +
                                "<b><h3>Note:</h3></b> Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/><br/>" +
                                "<b><h3>Note:</h3></b> Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(ivk);
                        break;
                    case "electrovision":
                        //code
                        Intent ivp =new Intent(getActivity(), DetailseventActivity.class);
                        ivp.putExtra("my_key","<b><h2>Electrovision</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Get lost in the electrifying domain of enormous intensity. Identify components, create circuits and complete a patchy circuitry by identifying the missing components.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Two Team members<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>20+ components will be given and 10sec time will be given per component/item.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>According to the year they are studying in they will be given a circuit name, they need to draw it and implement it on the breadboard.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b> Here, circuit diagram will be given with some missing components, they have to identify that and simulate it. They have to show that the practical and theoretical values are the same.<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "Based on timing and nearest approximation of answers, participants will be qualified for next round as well as winners will be selected by the same method.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Priyansi Patel </b><br/>8758190552 <br/>priyanshipatel508@gmail.com <br/><br/>" +
                                "<b>Dhruv Joshi </b><br/>9978334992 <br/>iamdhruvjoshi@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/><br/>" +
                                "<b><h3>Note: </h3></b>Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(ivp);
                        break;
                    case "letmedetect":
                        //code
                        Intent ivo =new Intent(getActivity(), DetailseventActivity.class);
                        ivo.putExtra("my_key","<b> <h2>Let Me Detect</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Go wireless. Go automated. Sense colours and face complications. Be in queue to win the ultimate challenge.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with 3 members.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Participants have to bring their robot and make it walk on the path laid by coordinators.<br/><br/>" +
                                "Robot should detect the color of the path and move accordingly.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "This round is same as the previous one, but the path will be more complicated this time.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "In this round, robot should follow the black line in white background.<br/><br/>" +
                                "<b><h3>Judgement criteria:</h3></b>" +
                                "Team whose robot crosses the finish line in the least time wins.<br/><br/>" +
                                "<b><h3>Coordinator Details:</h3></b>" +
                                "Parth Sakariya <br/>9409529030 <br/>patelparth271@gmail.com<br/><br/>" +
                                "Dhaval Angnan <br/>7573063404 <br/>dhaval8101997@gmail.com<br/><br/>" +
                                "Abhishek Dhami <br/>7874210507 <br/>dhamiabhishek3496@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificates will be provided to participants who are registered and present in at least 1st round of the event, after the completion final round.<br/>");
                        startActivity(ivo);
                        break;
                    case "warriorrun":
                        //code
                        Intent ivj =new Intent(getActivity(), DetailseventActivity.class);
                        ivj.putExtra("my_key","<b> <h2>Warrior Run</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Want to be a Mario this year? Have a jungle run and wander in dark forest with secret goggles. Be a warrior and win over the castle." +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with 3 members only.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "This round is a basically a robot race" +
                                "In this round, participants will have to build a robot which can complete the task by avoiding hurdles.<br/><br/>" +
                                "<b><h4>Round 2:</b>“VR Experience”</h4>" +
                                "In this round, the participants have to build a mobile holder on the robot." +
                                "They will be given VR Headset which will be connected to camera placed on the holder on robot." +
                                "Participants will have to complete the task by wearing that headset and gain the maximum points.<br/><br/>" +
                                "<b><h4>Round 3: </b>“Warrior in the Castle” (Pick and Place)</h4>" +
                                "Participants will have to make a robot having pick and place mechanism." +
                                "They will have to pick and place objects and at last, they have to pick princess and keep it in the safe zone and complete the subtasks to gain maximum points.<br/><br/>" +
                                "<b><h3>Judgement criteria:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>The teams which will complete the path in the minimum will qualify for the next round.<br/><br/>" +
                                "<b><h4>Round 2: </h4></b>The teams which will complete the path in the minimum will qualify for the next round.<br/><br/>" +
                                "<b><h4>Round 3: </h4></b>The teams which will complete the path in the minimum will qualify for the next round.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Patel Ravi </b><br/>7600865526 <br/>prv205@gmail.com<br/><br/>" +
                                "<b>Shah Darshan </b><br/>9428104488 <br/>gcetmc2806@gmail.com<br/><br/>" +
                                "<b>Yash Shethwala </b><br/>9099936634 <br/>yshethwala@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificates will be provided to participants who are registered and present in at least 1st round of the event, after the completion final round.<br/>");
                        startActivity(ivj);
                        break;
                    case "deathrobot":
                        //code
                        Intent ivh =new Intent(getActivity(), DetailseventActivity.class);
                        ivh.putExtra("my_key","<b> <h2>Death Robot</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "One robot and three battle fields. Goal your colours and win the race of manacles. Defeat the enemy on Mari-go-round and claim your victory<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with 2 members only.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Participants will have to use robot to drag their ball up the slope and goal." +
                                "This round is one on one competition.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "In this round , two participants have to race on same path." +
                                "There will be hurdles that they would have to overcome while racing.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "In this round, the robots will have to fight against each other.<br/><br/>" +
                                "<b><h3>Judgement criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "First team to score goal wins.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Team to finish the race first wins.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Team to win all the wars wins.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Hardik Harsora </b><br/>8733825236 <br/>harsorah007@gmail.com<br/><br/>" +
                                "<b>Keval Patel </b><br/>7201995724 <br/>kevalpatel0179@gmail.com<br/><br/>" +
                                "<b>Shubham Gor </b><br/>8980007217 <br/>gorshubham4@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificates will be provided to participants who are registered and present in at least 1st round of the event, after the completion final round.<br/>");
                        startActivity(ivh);
                        break;
                    case "hawkeye":
                        //code
                        Intent ivr =new Intent(getActivity(), DetailseventActivity.class);
                        ivr.putExtra("my_key","<b><h2>Hawkeye</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Not the target, archery revolves around the arrow. A much focused as you are, make sure your arrow is. Make your own mechanized crossbow and hit them with your skills. Get your aim game strong, mate!<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with maximum of 3 members in a team.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "<b>Part1: </b>Teams will present the crossbow they had made.<br/>" +
                                "<b>Part2: </b>then they will use the same crossbow to aim to given targets.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Post hitting the target, participant needs to answer question attached to target.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "In this round, there will be 4-5 tasks they have to perform" +
                                " Like hitting target, hitting rotating disk, etc.<br/><br/>" +
                                "<b><h3>Constraints:</h3></b>" +
                                "1) The maximum allowed dimensions for the crossbow are 800×600 mm (l×b) (top view) and height should not exceed 400 mm.<br/>" +
                                "2) The maximum dimensions for the arrow are 400 mm length and 10 mm diameter.<br/>" +
                                "3) The motion to the arrow must be strictly given by mechanical means (i.e. by spring, elastic material, etc.) And any other means like pneumatic, electric, etc. will not be allowed.<br/><br/>" +
                                "4) The participants are required to prepare minimum 3 to maximum 5 arrows.<br/>" +
                                "5) Metallic material should strictly not be used for preparing arrows<br/><br/>" +
                                "<b><h3>Judgement criteria:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>On the basis of presentation skills and performance of their crossbow.<br/><br/>" +
                                "<b><h4>Round 2: </h4></b>On the basis of answer given by participants." +
                                "<b><h4>Round 3: </h4></b>Points will be given based on the accuracy and time taken. Team with maximum points wins.<br/><br/>" +
                                "<h3>Co-ordinators Details:</h3></b>" +
                                "<b>Bhargav R. Bhoi </b><br/>+918140084470 1977<br/>bhargav119@gmail.com<br/><br/>" +
                                "<b>Meet Upadhyay </b><br/>+918000884555 <br/>meetupadhyay.nu@gmail.com<br/><br/>" +
                                "<b>Jaynil K. Dave </b><br/>+917778997807 <br/>jaynildave2598@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificates will be provided to participants who are registered and present in at least 1st round of the event, after the completion final round.<br/><br/>" +
                                "<b><h3>Note: </h3></b>Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(ivr);
                        break;
                    case "worldwar3":
                        //code
                        Intent ivg =new Intent(getActivity(), DetailseventActivity.class);
                        ivg.putExtra("my_key","<b><h2>World War 3</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "When the going gets tough, the tough get going. One bot, three challenging platforms – Land, Water and Air. Smash the feeble. Survive the toughest. Dominate the fierce metal battlefield to rattle the floor, waves and the air. Versatility will lead you to the finish line.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with a minimum of 2 and a maximum of 3 members only.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>Do or die – Screening round. Clear the check points on land. Beat the opponent and touch the winning line first.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Get, set, and go for tearing paper rings of opponent team. Arena will be in water full of bonus points.<br/><br/>" +
                                "<b><h4>Round 3: </h4></b>Here is the final twist. Fight towards victory in air.<br/><br/>" +
                                "<b><h3>Bot Dimensions:</h3></b><br/>" +
                                "<b>Length:</b> Max 30 cm<br/>" +
                                "<b>Breadth:</b> Fixed (will be declared later)<br/>" +
                                "<b>Height: </b>Max 30 cm<br/>" +
                                "<b>Power output: </b>Max 12 volts.<br/>" +
                                "<b>Motor rpm: </b>Max 500 rpm<br/>" +
                                "Weapon is compulsory to play for the 2nd round to tear the paper rings.<br/><br/>" +
                                "<b><h3>Advices:</h3></b>" +
                                "1) 2nd round will be in water and you’ll have to tear the paper rings in air, so think about a long range weapon which can adjust its aim.(use water)<br/><br/>" +
                                "2) There are 3 different arenas so think carefully before selecting the material of the body of the bot.<br/>" +
                                "3) Use long wire or you can make it wireless.<br/>" +
                                "4) If possible use high torque motors. (regular motors are also good, So Don’t Worry)<br/>" +
                                "5) For 3rd round be simple and wise.<br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>Decision of Judges will be final and binding to all.<br/><br/>" +
                                "<b><h3>Co-ordinators Details:</h3></b>" +
                                "<b>Harsh Patel </b><br/>9428162812<br/> harshatspace@gmail.com<br/><br/>" +
                                "<b>Hiren Patel </b><br/>8347562554<br/><br/>" +
                                "<b>Raviraj Mashruwala <br/>9426494654 <br/>mashruwala_raviraj@yahoo.com<br/><br/>" +
                                "<b><h3>Note:</h3></b> Certificates will be provided to participants who are registered and present in at least 1st round of the event, after the completion final round.<br/>");
                        startActivity(ivg);
                        break;
                    case "industrialtycoons":
                        //code
                        Intent ivt =new Intent(getActivity(), DetailseventActivity.class);
                        ivt.putExtra("my_key","<b><h2>Industrial Tycoons</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Mech Freak? Help yourself with drawing skills and imagination power. Industrial Optimization is all about its plant. Amend layout and win the game.<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with 2 members only.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>"+
                                "<b><h4>Round 1: </h4></b>As all engineers are familiar with engineering drawing. First round consists of basic engineering views understanding. Teams will be given with different isometric views one side and they have to find correct matching orthographic views from other side in given 2-3 minutes. Correct match will give you point and wrong pairs are not accepted.<br/><br/>" +
                                "<b><h4>Round 2: </h4></b>In second round teams are given with some puzzles of plant-layouts. Participants have to use their common logic to optimize that layout with lesser travel distance in given time limits with maximum number of solved puzzles. This plant layout are very easy to grasp so all year students can easily understand. If required than pre-learning free workshop is also given to teams before event.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Final round is about presentation of complete making of components in industry. All teams are given with some basic objects like door-handle, screw, motor, tube. Teams have to explain how they will manufacture given component as if their own industry, like how to manufacture ,how they allocate work to different industry compartment ,packing , finishing , marketing up to delivery in less possible cost.<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>"+
                                "<b><h4>Round 1:</h4></b> Winners will be decided based on more correct pairs of views in given time limit.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b> More solving in given limits leads you to the top.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Final winners will be given by judges as per their performance.<br/><br/>" +
                                "<b><h3>Co-ordinator Details :</h3></b>" +
                                "<b>Meet Sankdecha</b> <br/>9928909590<br/>meet251998@gmail.com<br/><br/>" +
                                "<b>Himalay Patel: </b><br/>8866776426<br/>Himalay.patel102@gmail.com <br/><br/>" +
                                "<b>Paras Limbasiya: </b><br/>8000133336<br/>Pdlimbasiya1357@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificates will be provided to participants who are registered and present in at least 1st round of the event, after the completion final round.<br/>");
                        startActivity(ivt);
                        break;
                    case "scriptonic":
                        //code
                        Intent ivz =new Intent(getActivity(), DetailseventActivity.class);
                        ivz.putExtra("my_key","<b><h2> Scriptonic</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Shell scripting, SQL commands and Linux! Unleash the nerd within into this epic battleground of codes and commands. Decrypt and execute will be your soul purpose. Thin you can bear that? We dare you to find the hidden password!<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with maximum of 2 members in a team.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "This round is a pen and paper quiz. This will be a time based elimination round.Quiz will consist of technical questions only.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Teams will be given 3 problems definations. The solution will be in a file, which would be hidden in a folder, and all the solution will not be in order.<br/><br/>" +
                                "Team will have to find the file using command prompt, and then arrange the codes in a perfect order to get the solution of problems given.<br/><br/>" +
                                "<b><h4>Round 3: </b>(Surprise round)</h4>" +
                                "Teams will be allotted a computer each, which will have 1st clue, which would be encrypted. Teams will have to find all the five clues, and find a password, which will unlock the file in their pc. The file will contain a problem, which one team member will solve by coding using shell scripts. The other member will have to puzzles. They can help each other if only they have solved their given task.<br/><br/>" +
                                "<b><h3>Judgement criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Top 20 teams with most marks will proceed to next round.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Top 10 teams with most marks will proceed to next round.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "First team to successfully complete the whole task wins.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Ravi Chauhan </b><br/>8347320220 <br/>chauhanravi8618@gmail.com<br/><br/>" +
                                "<b>Darshit Dhameliya </b><br/>8866469115 <br/>darshitdhameliya007@gmail.com<br/><br/>" +
                                "<b><h3>Note: </h3></b>Certificates will be provided to participants who are registered and present in at least 1st round of the event, after the completion final round.<br/>");
                        startActivity(ivz);
                        break;
                    case "code-o-puzz":
                        //code
                        Intent ivu =new Intent(getActivity(), DetailseventActivity.class);
                        ivu.putExtra("my_key","<b><h2>Code- O -Puzz</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Puzzles are for kids, real men code. Well, Legends do both! Enter the labyrinth of puzzles where codes are your only friend. Code, encode, decode and solve puzzles to prove you are the best!<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with maximum of 2 members in a team.<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b> Technical crossword.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b> In this round the participants will solve the puzzle and will then code, time for coding will be based on their puzzle solving capability.<br/><br/>" +
                                "<b><h4>Round 3:</b> (Surprise round)</h4> Participants will compete by solving codes and puzzles in order to obtain the problem definition.<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "The participants will be judged on the basis of points they have scored in all the rounds.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                " <b>Jaini Shah </b><br/>9408123240 <br/>shahjainik12@gmail.com<br/><br/>" +
                                " <b>Sanskruti Matroja </b><br/>9173813791 <br/>sanskruti.matroja@gmail.com<br/><br/>" +
                                "<b><h3>Note:</h3></b> Certificate will be provided to only those participants who have registered and are present in the event.<br/><br/>" +
                                "<b><h3>Note:</h3></b> Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(ivu);
                        break;

                    default:
                        break;



                }
//                Toast.makeText(
//                        getActivity(),
//                        dept.get(groupPosition)
//                                + " : "
//                                + events.get(
//                                dept.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT)
//                        .show();
                return true;
            }
        });

        return view;
    }

    public void filldata()
    {
        dept=new ArrayList<>();
        events=new HashMap<>();
        dept.add("Chemical");
        dept.add("Computer");
        dept.add("Electrical");
        dept.add("Civil");
        dept.add("Electronics and Communication");
        dept.add("Mechatronics");
        dept.add("Mechanical");
        dept.add("Information Technology");
        List<String>Azeophlliacs=new ArrayList<>();
        List<String>Lemniscatrix=new ArrayList<>();
        List<String>Electroscate=new ArrayList<>();
        List<String>Constructo=new ArrayList<>();
        List<String>Intellectro=new ArrayList<>();
        List<String>Yantrika=new ArrayList<>();
        List<String>Mechnoreign=new ArrayList<>();
        List<String>Technoscaters=new ArrayList<>();


        Azeophlliacs.add("Pure-E-Fire");
        Azeophlliacs.add("Chem Quest");
        Azeophlliacs.add("Pump-Shoot-Clean");

        Lemniscatrix.add("Techy Bubble");
        Lemniscatrix.add("Geek on Fleek");

        Electroscate.add("Electric-Era");
        Electroscate.add("Abhedya");
        Electroscate.add("Carathon");

        Constructo.add("Builder's Hut");
        Constructo.add("Paper Struct");
        Constructo.add("The Bridge");

        Intellectro.add("Ideathon");
        Intellectro.add("Circuitrix");
        Intellectro.add("Electrovision");

        Yantrika.add("Let Me Detect");
        Yantrika.add("Warrior Run");
        Yantrika.add("Death Robot");

        Mechnoreign.add("Hawkeye");
        Mechnoreign.add("World War 3");
        Mechnoreign.add("Industrial Tycoons");

        Technoscaters.add("Scriptonic");
        Technoscaters.add("Code-O-Puzz");
        events.put(dept.get(0),Azeophlliacs);
        events.put(dept.get(1),Lemniscatrix);
        events.put(dept.get(2),Electroscate);
        events.put(dept.get(3),Constructo);
        events.put(dept.get(4),Intellectro);
        events.put(dept.get(5),Yantrika);
        events.put(dept.get(6),Mechnoreign);
        events.put(dept.get(7),Technoscaters);
    }

}
