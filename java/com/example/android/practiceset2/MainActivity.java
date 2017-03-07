package com.example.android.practiceset2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

    }

    /**
     * global int variables to store all counters,
     * maybe better to create a dictionary
     */
    int homeGoal = 0;
    int awayGoal = 0;
    int redCardHomeTeam = 0;
    int redCardAwayTeam = 0;
    int yellowCardHomeTeam = 0;
    int yellowCardAwayTeam = 0;
    int shotsOnTargetHomeTeam = 0;
    int shotsOnTargetAwayTeam = 0;
    int shotsOffTargetHomeTeam = 0;
    int shotsOffTargetAwayTeam = 0;
    int switchesHomeTeam = 0;
    int switchesAwayTeam = 0;

    /**
     * note to self try to create a dynamic display method to replace all redundant method calls
     */
    /**
     * display count goals home team
     * @param number of goals home team
     */
    public void displayGoalHomeTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_goals_tag_a);
        String temp = getString(R.string.goals_tag) + " " + String.valueOf(number);
        t.setText(temp);
    }

    /**
     * display count goals away team
     * @param number of goals away team
     */
    public void displayGoalAwayTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_goals_tag_b);
        String temp = getString(R.string.goals_tag) + " "+String.valueOf(number);
        t.setText(temp);
    }
    /**
     * display count red cards home team
     * @param number of red cards home team
     */
    public void displayRedCardHomeTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_red_card_tag_a);
        String temp = getString(R.string.red_card_tag) + " "+String.valueOf(number);
        t.setText(temp);
    }
    /**
     * display count red cards away team
     * @param number of red cards away team
     */
    public void displayRedCardAwayTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_red_card_tag_b);
        String temp = getString(R.string.red_card_tag) + " "+String.valueOf(number);
        t.setText(temp);
    }
    /**
     * display count yellow cards home team
     * @param number of yellow cards home team
     */
    public void displayYellowCardHomeTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_yellow_card_tag_a);
        String temp = getString(R.string.yellow_card_tag) + " "+String.valueOf(number);
        t.setText(temp);
    }
    /**
     * display count yellow cards away team
     * @param number of yellow cards away team
     */
    public void displayYellowCardAwayTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_yellow_card_tag_b);
        String temp = getString(R.string.yellow_card_tag) + " "+String.valueOf(number);
        t.setText(temp);
    }
    /**
     * display count shots on target home team
     * @param number of shots on target home team
     */
    public void displayShotsOnTargetHomeTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_shots_on_target_tag_a);
        String temp = getString(R.string.shot_on_target_tag) + " "+String.valueOf(number);
        t.setText(temp);
    }
    /**
     * display count shots off target away team
     * @param number of shots off target away team
     */
    public void displayShotsOffTargetAwayTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_shots_off_target_tag_b);
        String temp = getString(R.string.shot_off_target_tag) + " "+String.valueOf(number);
        t.setText(temp);
    }
    /**
     * display count shots on target away team
     * @param number of shots on target away team
     */
    public void displayShotsOnTargetAwayTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_shots_on_target_tag_b);
        String temp = getString(R.string.shot_off_target_tag) + " "+String.valueOf(number);
        t.setText(temp);
    }
    /**
     * display count shots off target home team
     * @param number of shots off target home team
     */
    public void displayShotsOffTargetHomeTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_shots_off_target_tag_a);
        String temp = getString(R.string.shot_off_target_tag) + " "+String.valueOf(number);
        t.setText(temp);
    }
    /**
     * display count switches made home team
     * @param number of switches made by home team
     */
    public void displaySwitchHomeTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_switch_tag_a);
        String temp = getString(R.string.switch_tag) + " "+String.valueOf(number);
        t.setText(temp);
    }
    /**
     * display count switches made away team
     * @param number of switches made by away team
     */
    public void displaySwitchAwayTeam(int number) {
        TextView t = (TextView) findViewById(R.id.text_view_switch_tag_b);
        String temp = getString(R.string.switch_tag) + " " + String.valueOf(number);
        t.setText(temp);
    }

    /**
     * method to count goals scored by home team
     * @param v is the View, important else app will crash
     */
    public void goalA(View v){
        homeGoal += 1;
        displayGoalHomeTeam(homeGoal);
    }
    /**
     * method to count red cards given to home team
     * @param v is the View, important else app will crash
     */
    public void redCardA(View v){
        redCardHomeTeam += 1;
        displayRedCardHomeTeam(redCardHomeTeam);
    }
    /**
     * method to count yellow cards given to home team
     * @param v is the View, important else app will crash
     */
    public void yellowCardA(View v){
        yellowCardHomeTeam += 1;
        displayYellowCardHomeTeam(yellowCardHomeTeam);
    }
    /**
     * method to count shots on target for home team
     * @param v is the View, important else app will crash
     */
    public void shotsOnTargetA(View v){
        shotsOnTargetHomeTeam += 1;
        displayShotsOnTargetHomeTeam(shotsOnTargetHomeTeam);
    }
    /**
     * method to count shots off target for home team
     * @param v is the View, important else app will crash
     */
    public void shotsOffTargetA(View v){
        shotsOffTargetHomeTeam += 1;
        displayShotsOffTargetHomeTeam(shotsOffTargetHomeTeam);
    }
    /**
     * method to count switches made by home team
     * @param v is the View, important else app will crash
     */
    public void switchA(View v){
        switchesHomeTeam += 1;
        if (switchesHomeTeam > 3){
            Toast.makeText(this,getString(R.string.error_switch),Toast.LENGTH_SHORT).show();
            switchesHomeTeam = 3;
        }
        displaySwitchHomeTeam(switchesHomeTeam);
    }

    /**
     * method to count goals scored by away team
     * @param v is the View, important else app will crash
     */
    public void goalB(View v){
        awayGoal += 1;
        displayGoalAwayTeam(awayGoal);
    }
    /**
     * method to count red cards given to away team
     * @param v is the View, important else app will crash
     */
    public void redCardB(View v){
        redCardAwayTeam += 1;
        displayRedCardAwayTeam(redCardAwayTeam);
    }
    /**
     * method to count yellow cards given to away team
     * @param v is the View, important else app will crash
     */
    public void yellowCardB(View v){
        yellowCardAwayTeam += 1;
        displayYellowCardAwayTeam(yellowCardAwayTeam);

    }
    /**
     * method to count shots on target for away team
     * @param v is the View, important else app will crash
     */
    public void shotsOnTargetB(View v){
        shotsOnTargetAwayTeam += 1;
        displayShotsOnTargetAwayTeam(shotsOnTargetAwayTeam);

    }
    /**
     * method to count shots off target for away team
     * @param v is the View, important else app will crash
     */
    public void shotsOffTargetB(View v){
        shotsOffTargetAwayTeam += 1;
        displayShotsOffTargetAwayTeam(shotsOffTargetAwayTeam);

    }
    /**
     * method to count switches made by away team
     * @param v is the View, important else app will crash
     */
    public void switchB(View v) {
        switchesAwayTeam += 1;
        if (switchesAwayTeam > 3){
            Toast.makeText(this,getString(R.string.error_switch),Toast.LENGTH_SHORT).show();
            switchesAwayTeam = 3;
        }
        displaySwitchAwayTeam(switchesAwayTeam);
    }
    /**
     * This method returns the home team in a String
     */

    private String inputHomeTeam(){
        EditText nameInput = (EditText) findViewById(R.id.edit_text_input_home_team);
        return nameInput.getText().toString();
    }
    /**
     * This method returns the away team in a String
     */

    private String inputAwayTeam(){
        EditText nameInput = (EditText) findViewById(R.id.edit_text_input_away_team);
        return nameInput.getText().toString();
    }

    /**
     * This method takes two input parameters, subject and messageBody. subject is the string that will go into the subject fiel of and email
     * and messageBody is the email body containing the the whole email.
     * @param emailSubject subject of email
     * @param messageBody message body of email
     */
    public void composeEmail(String emailSubject, String messageBody) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("text/plain");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
        intent.putExtra(Intent.EXTRA_TEXT, messageBody);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }else{
            Toast.makeText(this, getString(R.string.error_email_intent), Toast.LENGTH_SHORT).show();
        }
    }
    /**
     * Method to create a String which include the message and statistics counted during the match.
     */
    private String createStatisticsMessage(){
        String emailMessage;
        emailMessage = "\n";
        emailMessage += getString(R.string.home_team)+"\n";
        emailMessage += "\n";
        emailMessage += getString(R.string.number_of_goals) + " " + homeGoal + "\n";
        emailMessage += getString(R.string.number_of_shots_on_target) + " " + shotsOnTargetHomeTeam + "\n";
        emailMessage += getString(R.string.number_of_shots_off_target) + " " + shotsOffTargetHomeTeam + "\n";
        emailMessage += getString(R.string.number_of_yellow_cards) + " " + yellowCardHomeTeam + "\n";
        emailMessage += getString(R.string.number_of_red_cards) + " " + redCardHomeTeam + "\n";
        emailMessage += getString(R.string.number_of_switch) + " " + switchesHomeTeam + "\n";

        emailMessage += "\n";

        emailMessage += getString(R.string.away_team)+"\n";
        emailMessage += "\n";
        emailMessage += getString(R.string.number_of_goals) + " " + awayGoal + "\n";
        emailMessage += getString(R.string.number_of_shots_on_target) + " " + shotsOnTargetAwayTeam + "\n";
        emailMessage += getString(R.string.number_of_shots_off_target) + " " + shotsOffTargetAwayTeam + "\n";
        emailMessage += getString(R.string.number_of_yellow_cards) + " " + yellowCardAwayTeam + "\n";
        emailMessage += getString(R.string.number_of_red_cards) + " " + redCardAwayTeam + "\n";
        emailMessage += getString(R.string.number_of_switch) + " " + switchesAwayTeam + "\n";
        return emailMessage;
    }


    /**
     * Send the message in an email
     */
    public void sendEmail(View view){
        String emailSubject;
        emailSubject = getString(R.string.match_statistics)+ " " + getString(R.string.between)+ " " + inputHomeTeam()+ " " + getString(R.string.and)+ " " + inputAwayTeam();
        composeEmail(emailSubject,createStatisticsMessage());

    }

    /**
     * method to reset all counters
     */
    public void reset(View v){
        homeGoal = 0;
        awayGoal = 0;
        redCardHomeTeam = 0;
        redCardAwayTeam = 0;
        yellowCardHomeTeam = 0;
        yellowCardAwayTeam = 0;
        shotsOnTargetHomeTeam = 0;
        shotsOnTargetAwayTeam = 0;
        shotsOffTargetHomeTeam = 0;
        shotsOffTargetAwayTeam = 0;
        switchesHomeTeam = 0;
        switchesAwayTeam = 0;
        displayGoalHomeTeam(homeGoal);
        displayRedCardHomeTeam(redCardHomeTeam);
        displayYellowCardHomeTeam(yellowCardHomeTeam);
        displayShotsOnTargetHomeTeam(shotsOnTargetHomeTeam);
        displayShotsOffTargetHomeTeam(shotsOffTargetHomeTeam);
        displaySwitchHomeTeam(switchesHomeTeam);
        displayGoalAwayTeam(awayGoal);
        displayRedCardAwayTeam(redCardAwayTeam);
        displayYellowCardAwayTeam(yellowCardAwayTeam);
        displayShotsOnTargetAwayTeam(shotsOnTargetAwayTeam);
        displayShotsOffTargetAwayTeam(shotsOffTargetAwayTeam);
        displaySwitchAwayTeam(switchesAwayTeam);
    }

}