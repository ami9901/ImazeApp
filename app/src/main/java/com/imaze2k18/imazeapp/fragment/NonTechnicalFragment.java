package com.imaze2k18.imazeapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import com.imaze2k18.imazeapp.Activity.DetailseventActivity;
import com.imaze2k18.imazeapp.Activity.NonTechdetailActivity;
import com.imaze2k18.imazeapp.Adapter.CustomList;
import com.imaze2k18.imazeapp.R;
import com.imaze2k18.imazeapp.logging.L;

/**
 * A simple {@link Fragment} subclass.
 */
public class NonTechnicalFragment extends Fragment {

    ListView list;
    String[] web = {
            "Adverto",
            "Bid Wars",
            "Castliar",
            "Espionage",
            "Food Hunt",
            "Guftagoo",
            "Maymaykar",
            "MCN",
            "NFS",
            "Pitch Fever 2.0",
            "Question Mark",
            "Recruiting Avengers"
    };
    Integer[] imageId = {
            R.drawable.adverto,
            R.drawable.bidwars,
            R.drawable.castliar,
            R.drawable.espionage,
            R.drawable.food,
            R.drawable.guftagoo,
            R.drawable.meme,
            R.drawable.mun,
            R.drawable.nfs,
            R.drawable.pitch,
            R.drawable.question,
            R.drawable.avenger

    };
    Intent i;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_non_technical, container, false);
        CustomList adapter = new
                CustomList(getActivity(), web, imageId);
        list = (ListView) v.findViewById(R.id.list_normal);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String str = web[+position].toLowerCase().replaceAll(" ", "");
                L.m(str);
                switch (str) {
                    case "adverto":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2> Adverto</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Love marketing and crazy about business? Portray your creativity and knowledge of the famous industries and it's tycoons in the most amazing way and unveil the opportunity to showcase your interest and enthusiasm to make a dhoom in business world!<br/><br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Max. 2-5 members<br/><br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Description of logos of several companies will be displayed and identify the logo and explain and reframe it.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Different encrypted pictures will be displayed and they have to identify the logo.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Participants have to paint the shirts and do its marketing and it will based purely on voting.<br/><br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "The teams will be shortlisted on the basis of most creative and meaningful logo.<br/><br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Teams that have answered maximum questions in certain time period will move to the next round.<br/><br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "The team that has maximum votes wins.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Payal Thakkar </b><br/>9104772928<br/> palthakkar19@gmail.com<br/><br/>" +
                                "<b>Swapnil Udwadiya </b><br/>8511508447<br/> udwadiyaswapnil1997@gmail.com<br/><br/>" +
                                "<b><h4>Note:</h4></b> Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/><br/>" +
                                "<b><h4>Note:</h4></b> Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(i);
                        break;
                    case "bidwars":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2> Bid Wars</h2></b><br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Take a ride to the world of profit, loss and calculated risks. Put your bets on the unknown and bid on the basis of the words of your gut. If you think you can handle it all, then come into the field of Bid Wars.<br/><br/>" +
                                "<b><h3>Team members:</h3></b>" +
                                "The team must consist of minimum two and maximum three participants. There are no other constraints on team formation. On the spot team formation is also allowed." +
                                "<b><h3>Round description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b> Certain base amount will be provided to each team. On the basis of their knowledge and guts they will have to bid on unknown boxes for which a unique description having items which are not known to teams will be provided. There will also be a lucky draw/one minute game on the basis of which few teams will be allowed to open the box.<br/><br/>" +
                                "<b><h4>Round 2:</h4> </b>Certain base amount will be provided to each team. Now all the teams will have two options. Either to play safe or take risks. (They can even opt for both). They can play safe by investing their money to Virtual Builders/Contractors. In second option, each team will be provided a map of city that will consist of information related to p1lots and their surroundings. Then there will be auction of all the properties/plots. Afterwards some flash news will be displayed on the basis of which prices of different plots will increase or decrease. They will also be given a chance to resale the plots among different teams." +
                                "<b><h4>Round 3: </h4></b>One of the team member will answer some General Knowledge questions. The remaining team member/members will be assigned some task. On every wrong answer the other members will have to pay the penalty either by losing money or in the form of time (by waiting).<br/><br/>" +
                                "<b><h3>Judgment Criteria:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>Money based elimination. Top 8 teams having the highest amount of money will be promoted to next round.<br/><br/>" +
                                "<b><h4>Round 2:</h4> </b>Money based elimination. Top 4 teams having the highest amount of money will be promoted to next round.<br/><br/>" +
                                "<b><h4>Round 3: </h4></b>Both time and money based evaluation. Team with the best timing and highest amount of money will be declared as the Winners.<br/><br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Rutvi Vasani </b><br/>9408253643<br/>rutz311@gmail.com <br/><br/>" +
                                "<b>Abhijeetsinh Vaghela </b><br/>9998336090 <br/>abhijeet201998@gmail.com <br/><br/>" +
                                "<b><h4>Note: </h4></b>Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/><br/>" +
                                "<b><h4>Note:</h4> </b>Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(i);
                        break;
                    case "castliar":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2> Castlair</h2></b> <br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "The winner stands alone... A tough game with challenges puzzles and hurdles. Showcase Ur strength as a fighter born in u. Time to step out of Ur comfort zone, get dirty and be standalone in the battlefield of the castle. <br/> <br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Max. 1 member <br/> <br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "A case study has to be solved followed by a sack race and more case studies to find the hidden clues and answers stepping on different signs. <br/> <br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Solve a case study and find a key in a bowl of flour. <br/> <br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "Need to open the lock with the key using the mouth and solve hurdles in the mud. <br/> <br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "The top 20 will be shortlisted on the basis of time. <br/> <br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "The top 10 will be shortlisted on the basis of time and performance. <br/> <br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "The winner that solves all the case studies first wins. <br/> <br/>" +
                                "<b><h3>Details of Co-ordinators:</h3></b>" +
                                "<b>Nikhil Makwana </b><br/> 8758730697  <br/>nikhilnmakwana@gmail.com<br/><br/>" +
                                "<b>Shubham Mistry  </b><br/>8140083667  <br/>shubhammistry98@gmail.com<br/><br/>" +
                                "<b><h4>Note: </h4></b>Certificate will be provided to the only participant who is registered and at the same day present in the event. <br/> <br/>" +
                                "<b><h4>Note: </h4></b>Decision of the judges and coordinators will be final and binding to all. <br/>");
                        startActivity(i);
                        break;
                    case "espionage":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2> Espionage: A Spying Quest</h2></b> <br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "From classic character like James Bond to new hotshots like Jason Bourne, flaunt your spy kills and let the spy inside you come out with its full fury. Bomb is ticking, lives are hanging, can you save them all? “Spy” your way to the final and find it out! <br/> <br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Max 2 Members <br/> <br/>" +
                                "<b><h3>Rounds Description:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>“Ink and Dreams”" +
                                "A pen and paper quiz. <br/>" +
                                "Quiz will have questions with increasing difficulty and complexity using anagrams, skip codes, enigmas, cipher text etc. <br/> <br/>" +
                                "<b><h4>Round 2: </h4></b>“Above the Bottomless Chasm”" +
                                "This round is typically a treasure hunt but with a spy twist. <br/>" +
                                "Initial clue will be given, which will have the location of next clue and so on. <br/> <br/>" +
                                "<b><h4>Round 3: </h4></b>“D-Day”" +
                                "This round is a chase sequence. <br/>" +
                                "Teams would have to find and identify the bomber (volunteer) and diffuse the bomb <br/> <br/>" +
                                "<b><h3>Judgement criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b> Top 20 teams with most correct answers will proceed to next. <br/> <br/>" +
                                "<b><h4>Round 2:</h4></b>First 5 teams to retrieve the file wins. <br/> <br/>" +
                                "<b><h4>Round 3:</h4></b> First team to successfully diffuse the bomb wins. <br/> <br/>" +
                                "<b><h3>Co-ordinator details:</h3></b>" +
                                "<b>Saurabh H. Sachdev </b> <br/>saurabh15101998@gmail.com  <br/>Ph.No: 7984015395<br/><br/>" +
                                "<b>Femi A. Unadkat </b> <br/>femi9812@gmail.com  <br/>Ph.No: 9427968323<br/><br/>" +
                                "<b>Nilay S. Shah </b> <br/>nilays2498@gmail.com  <br/>Ph.No. 7405742565<br/><br/>" +
                                "<b><h4>Note:</h4></b> Certificate will be provided to the only participant who is registered and at the same day present in the event.<br/><br/>" +
                                "<b><h4>Note:</h4></b> Decision of the judges and coordinators will be final and binding to all.<br/>");
                        startActivity(i);
                        break;
                    case "foodhunt":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2> Food hunt</h2></b> <br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Foodies beware! Your title is in danger as Food Hunt is here again to take you on a foodalicious trip. Finish the tasks and hunt food treasures all over the city to retain your title as the ultimate foodie.. <br/> <br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Max. 5 members <br/> <br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Contains a pen paper based exam and will be asked general knowledge questions on food. <br/> <br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Picture perception based round and with a twist of eating the items in front of them. <br/> <br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "To search the restaurants based on clues in campus. <br/> <br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "The teams will be shortlisted on the basis of most correct answers. <br/> <br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Teams that have the best picture perception will qualify. <br/> <br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "The team that finds all the clues and reaches back to ground zero first wins. <br/> <br/>" +
                                "<b><h3>Details of Co-ordinators:</h3></b>" +
                                "<b>Jay Joshi </b> <br/>9638253071  <br/>jay2361997@gmail.com<br/><br/>" +
                                "<b>Karan Ladani  </b><br/>9601283201 l <br/>adanikaran95@gmail.com<br/><br/>" +
                                "<b><h4>Note: </h4></b>Certificate will be provided to the only participant who is registered and at the same day present in the event. <br/> <br/>" +
                                "<b><h4>Note: </h4></b>Decision of the judges and coordinators will be final and binding to all. <br/>");
                        startActivity(i);
                        break;
                    case "guftagoo":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2> Guftagoo - A literature Event</h2></b> <br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Keeping in mind the on-going trend of literature and poems, Guftagoo is a perfect opportunity which brings you to platform to fulfil your dreams and follow the passion for literature! No more keeping writings to yourself. Let the writer within you awaken! <br/> <br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows Individual participants only. <br/> <br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>“Open Mic” Basically an Open Mic Round. Participants will prepare their content from home only, on any topic they want. Participants can deliver their content in any language they choose or in any form of literature they want, in front of audience and judge. <br/> <br/>" +
                                "<b><h4>Round 2: </h4></b>“Live the Frame” A documentary will be shown, which participants are supposed to keenly observe. Then they have to pick a character of their choice and write the gist of whole documentary from that character`s perspective. <br/> <br/>" +
                                "<b><h4>Round 3:</h4> </b>“Improviso” This will be an Impromptu round. Finalists will be given a topic and approximately 45 minutes to prepare their content on the topic given. Then they would recite their content, in front of other participants and judge. <br/> <br/>" +
                                "<b><h3>Judgement criteria:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>Faculty judge will give points to participants on the basis of narration, content, body language, confidence, fluency, etc. <br/> <br/>" +
                                "<b><h4>Round 2:</h4> </b>Faculty judge will give points to the participant on the basis of content, grammar, etc. <br/> <br/>" +
                                "<b><h4>Round 3:</h4> </b>Faculty judge will give points to participants on the basis of narration, content, body language, confidence, fluency, etc. Participant with most points wins. <br/> <br/>" +
                                "<b><h3>Details of Co-ordinators:</h3></b>" +
                                "<b>Ruchit M. Patel  </b><br/> 9737140802  <br/>ruchitpatel12345@gmail.com <br/> <br/>" +
                                "<b>Jinesh A. Shah  </b> <br/>7016500817  <br/>jineshshah0410@yahoo.com <br/> <br/>" +
                                "<b><h4>Note: </h4></b>Decisions made by judge will be final and binding to all. <br/> <br/>" +
                                "<b><h4>Note: </h4></b>Certificates will be provided to participants who are registered and present in at least 1st round of the event, after the completion final round. <br/>");
                        startActivity(i);
                        break;
                    case "maymaykar":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2> Maymaykar</b></h2> <br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "If you think you are funny and have great sense of humour like Chandler than this is the perfect event for you. This is an event where you can showcase your sarcastic nature, creativity and critical thinking. Here is your chance to enter the world of Memes. <br/> <br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with 3 members only. <br/> <br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "In this round any random picture will be shown and the participants have to express their thoughts on the same. It should be funny, unique and out the box. <br/> <br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Round 2 has two parts." +
                                "In the first part, the participants will be given pictures and they will have to prepare suitable Memes related to that. They will be marked out of 10. <br/> <br/>" +
                                "In the second part, they will have to dub a Bollywood video given on the spot. Preparation time is 15 mins. Here also, they will be marked out of 10. <br/> <br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "This is a surprise round. <br/> <br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Kunal Raturi</b> <br/> 7984573492  <br/>kunalraturi007@gmail.com <br/> <br/>" +
                                "<b>Ronak Arya</b>  <br/>8128489950  <br/>ronak_arya15@yahoo.com <br/> <br/>" +
                                "<b><h4>Note: </h4></b>Vulgarity is strictly prohibited. <br/> <br/>" +
                                "<b><h4>Note:</h4></b> Certificate will be provided to the only participant who is registered and at the same day present in the event. <br/>");
                        startActivity(i);
                        break;
                    case "mcn":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2> Model Confederate Nations</b></h2> <br/>" +
                                "<b><h3>Event Description:</h3></b> Be a part of the UN Assembly. Form a committee, represent a country and discuss worldly issues and come to conclusions on how to resolve them. May the best diplomat win! <br/> <br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Individual entry will be allowed. <br/> <br/>" +
                                "<b><h3>Round description:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>Pen and paper quiz round. <br/> <br/>" +
                                "<b><h4>Round 2: </h4></b>Each participant will be given a committee and a debate will take place. <br/> <br/>" +
                                "<b><h3>Judgment Criteria:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>Participants with top scores will proceed to next round. <br/> <br/>" +
                                "<b><h4>Round 2: </h4></b>Participant with the maximum points wins. <br/> <br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Sumit Kuletha</b> <br/> 9510034964 <br/>sumityash999@gmail.com <br/> <br/> " +
                                "<b>Jenish Kodinariya </b> <br/>  8347802992 <br/>jenish98kodinariya@gmail.com<br/> <br/>  " +
                                "<b><h4>Note: </h4></b>Certificate will be provided to only those participants who are registered and present in the event. <br/> <br/>" +
                                "<b><h4>Note:</h4></b>Decision of the judges and coordinators will be final and binding to all. <br/>");
                        startActivity(i);
                        break;
                    case "nfs":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2> NFS – Need For Strike.</b></h2> <br/>" +
                                "<b><h3>Event Description: </h3></b>True gaming buffs shall never let this event go by. Are you a hard-core gamer? Well then this is the event for you. Compete with other gamers just like you to win the ultimate Gaming title. <br/> <br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "A Team of 5 members is mandatory. <br/> <br/>" +
                                "<b><h3>Round description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b> Casual Match between two teams in CS. <br/>" +
                                "Losing teams will have to play NFS. <br/> <br/>" +
                                "<b><h4>Round 2:</h4> </b>Deathmatch will be played. <br/> <br/>" +
                                "<b><h4>Round 3: </h4></b>Casual will played. Winner and runner up team will play NFS. <br/> <br/>" +
                                "<b><h3>Judgment Criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b> Winning team in NFS and winning teams on CS GO will proceed to round 2. <br/> <br/>" +
                                "<b><h4>Round 2: </h4></b>Team with maximum points proceeds to next round. <br/> <br/>" +
                                "<b><h4>Round 3: </h4></b>Team which wins both NFS and CS wins. <br/> <br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Patel Vrutnat</b>  <br/> 9099957371  <br/>vrutantpatel@gmail.com <br/> <br/>" +
                                "<b>Patel Parth</b> <br/> 7016562374  <br/>not given <br/> <br/>" +
                                "<b><h4>Note:</h4></b> Certificate will be provided to the only participant who is registered and at the same day present in the event. <br/> <br/>" +
                                "<b><h4>Note:</h4></b> Decision of the judges and coordinators will be final and binding to all. <br/>");
                        startActivity(i);
                        break;
                    case "pitchfever2.0":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2> Pitch Fever 2.0</b></h2> <br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "Passionate about football??" +
                                "Grab this amazing opportunity to showcase Ur infield talent and kick in for some mind-blowing football skills with the strength of 3 and unleash the Messi, Ronaldo or Neymar in you! <br/> <br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Max. 3 members <br/> <br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "It is similar to 9 ball pool and the rules will be same and instead of sticks there will be footballs. There is no elimination in this round. <br/> <br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "The game will be a normal football 3-a side tournament. <br/> <br/>" +
                                "<b><h3>Judgement Criteria:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Points will be given based on progress made in the tournament. <br/> <br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "It will a knock out game and all the members have to play in both the rounds compulsorily. <br/> <br/>" +
                                "<b><h3>Details of Co-ordinators:</h3></b>" +
                                "<b>Piyush Kabra</b> <br/>9913150588  <br/>kabrapiyush27@gmail.com <br/> <br/>" +
                                "<b>Sumit Badal</b>  <br/>9662110750  <br/>sumitbadal8@gmail.com <br/> <br/>" +
                                "<b><h4>Note:</h4></b> Certificate will be provided to the only participant who is registered and at the same day present in the event. <br/><br/>" +
                                "<b><h4>Note:</h4> </b>Decision of the judges and coordinators will be final and binding to all. <br/>");
                        startActivity(i);
                        break;
                    case "questionmark":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2> Question Mark</b></h2> <br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "This event will test your intellect. But this is no ordinary quiz. Figuring out the answers when they're hidden in plain sight is too easy. Or is it? Fabricate your own logic to the puzzle and work out the answer. <br/> <br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "Max. 2 members <br/> <br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "Contains a pen paper based exam and questions will displayed in ppt. (60 mins) <br/> <br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Contains a pen paper based exam and questions will displayed in ppt. (60 mins) <br/> <br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "On stage round. Two bounce rounds, visual round Sudoku and theme based. <br/> <br/>" +
                                "<b><h3>Judgement Criteria:</b>" +
                                "<b><h4>Round 1:</h4></b>" +
                                "The teams will be shortlisted on the basis of raw score. <br/> <br/>" +
                                "<b><h4>Round 2:</h4></b>" +
                                "Top 8 to 10 teams will move to the next round. <br/> <br/>" +
                                "<b><h4>Round 3:</h4></b>" +
                                "The team that has highest final score wins. <br/> <br/>" +
                                "<b><h3>Details of Co-ordinators:</h3></b>" +
                                "<b>Digant Bakari</b>  <br/>9429136613  <br/>bakari@hotmail.com <br/> <br/>" +
                                "<b>Dehit Garga</b>  <br/>8469899163  <br/>dehityo@gmail.com <br/> <br/>" +
                                "<b><h4>Note:</h4></b> Certificate will be provided to the only participant who is registered and at the same day present in the event. <br/> <br/>" +
                                "<b><h4>Note: </h4></b>Decision of the judges and coordinators will be final and binding to all. <br/>");
                        startActivity(i);
                        break;
                    case "recruitingavengers":
                        i =new Intent(getActivity(), NonTechdetailActivity.class);
                        i.putExtra("my_key1","<b><h2>Recruiting Avengers: The Infinity War.</b></h2> <br/>" +
                                "<b><h3>Event Description:</h3></b>" +
                                "From the ultimate Marvel Cinematic Universe, be like Captain America and lead your team to success, Be like Iron Man and make your way out of any problem, be like Thor and find your true potential, be like Hulk and smash the obstacles in the way and make your way to the Aim. <br/> <br/>" +
                                "<b><h3>Team Members:</h3></b>" +
                                "This event allows team participation with 3 members only. <br/> <br/>" +
                                "<b><h3>Round Description:</h3></b>" +
                                "<b><h4>Round 1: </h4></b>'Avengers Assemble' In this round the participants will perform different tasks individually as per the marvel character chose by them from the given options. And combined score will be generated.<br/> <br/>"+
                                " <b><h4>Round 2: </h4></b>The Avengers Initiative. In this round, a chase sequence will be created in which, every clue will have avengers’ name hidden in it and that character will be available at that checkpoint (But limited quant.) The participants need to prioritize characters as per their value and hidden messages. And collect as many as possible.<br/> <br/>"+
                                " <b><h4>Round 3: </h4></b>The Infinity Wars. We will create a storyline according to the fan theories, synopsis and Easter eggs. The participants have to take part in a real life infinity war sequence. Every spot they reach will give them a part of the original storyline up and clue to the next spot. At the end, using those messages and other criteria, they have to write their own storyline. The one most similar to original one will win. <br/> <br/>" +
                                "<b><h3>Judgement Criteria: </h3></b>"+
                                "<b><h4>Round 1:</h4></b> Top 20 teams with most combined points will make their way to Round 2.<br/><br/>"+
                                "<b><h4>Round 2:</h4></b> Top 10 teams with most character points will make their way to Round 3.<br/><br/>"+
                                "<b><h4>Round 3: </h4></b>The Team with the most similar storyline with the original one and covers maximum criteria will win! <br/> <br/>" +
                                "<b><h3>Co-ordinator Details:</h3></b>" +
                                "<b>Soham N. Dave </b> <br/>9426756475  <br/>soham6998@gmail.com <br/> <br/>" +
                                "<b>Hanif S. Vohra </b> <br/>9408117884  <br/>hanif4vohra@gmail.com <br/> <br/>" +
                                "<b><h4>Note: </h4></b>Certificates will be provided to participants who are registered and present in at least 1st round of the event, after the completion final round. <br/>");
                        startActivity(i);
                        break;
                    default:
                        break;

                }

                //Toast.makeText(getActivity(), "You Clicked at " + web[+position], Toast.LENGTH_SHORT).show();

            }
        });

        return v;
    }

}
