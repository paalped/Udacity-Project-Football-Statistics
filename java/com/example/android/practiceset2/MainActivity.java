package com.example.android.practiceset2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.message;
import static com.example.android.practiceset2.R.string.error_email_intent;
import static com.example.android.practiceset2.R.string.switches;

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
    int goals_a = 0;
    int goals_b = 0;
    int redCard_a = 0;
    int redCard_b = 0;
    int yellowCard_a = 0;
    int yellowCard_b = 0;
    int shotsOnTarget_a = 0;
    int shotsOnTarget_b = 0;
    int shotsOffTarget_a = 0;
    int shotsOffTarget_b = 0;
    int switches_a = 0;
    int switches_b = 0;

    /**
     * note to self try to create a dynamic display method to replace all redundant method calls
     */
    /**
     * display count goals home team
     * @param text
     */
    public void display_goal_a(int text) {
        TextView t = (TextView) findViewById(R.id.goals_mark_a);
        String temp = getString(R.string.goals_mark) + " " + String.valueOf(text);
        t.setText(temp);
    }

    /**
     * display count goals away team
     * @param text
     */
    public void display_goal_b(int text) {
        TextView t = (TextView) findViewById(R.id.goals_mark_b);
        String temp = getString(R.string.goals_mark) + " "+String.valueOf(text);
        t.setText(temp);
    }
    /**
     * display count red cards home team
     * @param text
     */
    public void display_rc_a(int text) {
        TextView t = (TextView) findViewById(R.id.red_card_mark_a);
        String temp = getString(R.string.red_cards_mark) + " "+String.valueOf(text);
        t.setText(temp);
    }
    /**
     * display count red cards away team
     * @param text
     */
    public void display_rc_b(int text) {
        TextView t = (TextView) findViewById(R.id.red_card_mark_b);
        String temp = getString(R.string.red_cards_mark) + " "+String.valueOf(text);
        t.setText(temp);
    }
    /**
     * display count yellow cards home team
     * @param text
     */
    public void display_yc_a(int text) {
        TextView t = (TextView) findViewById(R.id.yellow_card_mark_a);
        String temp = getString(R.string.yellow_cards_mark) + " "+String.valueOf(text);
        t.setText(temp);
    }
    /**
     * display count yellow cards away team
     * @param text
     */
    public void display_yc_b(int text) {
        TextView t = (TextView) findViewById(R.id.yellow_card_mark_b);
        String temp = getString(R.string.yellow_cards_mark) + " "+String.valueOf(text);
        t.setText(temp);
    }
    /**
     * display count shots on target home team
     * @param text
     */
    public void display_sont_a(int text) {
        TextView t = (TextView) findViewById(R.id.shots_on_target_mark_a);
        String temp = getString(R.string.shots_on_target_mark) + " "+String.valueOf(text);
        t.setText(temp);
    }
    /**
     * display count shots off target away team
     * @param text
     */
    public void display_soft_b(int text) {
        TextView t = (TextView) findViewById(R.id.shots_off_target_mark_b);
        String temp = getString(R.string.shots_off_target_mark) + " "+String.valueOf(text);
        t.setText(temp);
    }
    /**
     * display count shots on target away team
     * @param text
     */
    public void display_sont_b(int text) {
        TextView t = (TextView) findViewById(R.id.shots_on_target_mark_b);
        String temp = getString(R.string.shots_on_target_mark) + " "+String.valueOf(text);
        t.setText(temp);
    }
    /**
     * display count shots off target home team
     * @param text
     */
    public void display_soft_a(int text) {
        TextView t = (TextView) findViewById(R.id.shots_off_target_mark_a);
        String temp = getString(R.string.shots_off_target_mark) + " "+String.valueOf(text);
        t.setText(temp);
    }
    /**
     * display count switches made home team
     * @param text
     */
    public void display_sw_a(int text) {
        TextView t = (TextView) findViewById(R.id.switch_mark_a);
        String temp = getString(R.string.switches_mark) + " "+String.valueOf(text);
        t.setText(temp);
    }
    /**
     * display count switches made away team
     * @param text
     */
    public void display_sw_b(int text) {
        TextView t = (TextView) findViewById(R.id.switch_mark_b);
        String temp = getString(R.string.switches_mark) + " " + String.valueOf(text);
        t.setText(temp);
    }

    /**
     * method to count goals scored by home team
     * @param v
     */
    public void goalA(View v){
        goals_a += 1;
        display_goal_a(goals_a);
    }
    /**
     * method to count red cards given to home team
     * @param v
     */
    public void redCardA(View v){
        redCard_a += 1;
        display_rc_a(redCard_a);
    }
    /**
     * method to count yellow cards given to home team
     * @param v
     */
    public void yellowCardA(View v){
        yellowCard_a += 1;
        display_yc_a(yellowCard_a);
    }
    /**
     * method to count shots on target for home team
     * @param v
     */
    public void shotsOnTargetA(View v){
        shotsOnTarget_a += 1;
        display_sont_a(shotsOnTarget_a);
    }
    /**
     * method to count shots off target for home team
     * @param v
     */
    public void shotsOffTargetA(View v){
        shotsOffTarget_a += 1;
        display_soft_a(shotsOffTarget_a);
    }
    /**
     * method to count switches made by home team
     * @param v
     */
    public void switchA(View v){
        switches_a += 1;
        if (switches_a > 3){
            Toast.makeText(this,getString(R.string.error_switch),Toast.LENGTH_SHORT).show();
            switches_a = 3;
        }
        display_sw_a(switches_a);
    }

    /**
     * method to count goals scored by away team
     * @param v
     */
    public void goalB(View v){
        goals_b += 1;
        display_goal_b(goals_b);
    }
    /**
     * method to count red cards given to away team
     * @param v
     */
    public void redCardB(View v){
        redCard_b += 1;
        display_rc_b(redCard_b);
    }
    /**
     * method to count yellow cards given to away team
     * @param v
     */
    public void yellowCardB(View v){
        yellowCard_b += 1;
        display_yc_b(yellowCard_b);

    }
    /**
     * method to count shots on target for away team
     * @param v
     */
    public void shotsOnTargetB(View v){
        shotsOnTarget_b += 1;
        display_sont_b(shotsOnTarget_b);

    }
    /**
     * method to count shots off target for away team
     * @param v
     */
    public void shotsOffTargetB(View v){
        shotsOffTarget_b += 1;
        display_soft_b(shotsOffTarget_b);

    }
    /**
     * method to count switches made by away team
     * @param v
     */
    public void switchB(View v) {
        switches_b += 1;
        if (switches_b > 3){
            Toast.makeText(this,getString(R.string.error_switch),Toast.LENGTH_SHORT).show();
            switches_b = 3;
        }
        display_sw_b(switches_b);
    }
    /**
     * This method returns the home team in a String
     */

    private String inputHomeTeam(){
        EditText nameInput = (EditText) findViewById(R.id.input_home_team);
        return nameInput.getText().toString();
    }
    /**
     * This method returns the away team in a String
     */

    private String inputAwayTeam(){
        EditText nameInput = (EditText) findViewById(R.id.input_away_team);
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
        emailMessage = getString(R.string.match_statistics) + " " + inputHomeTeam()+ " " + getString(R.string.vs)+ " " + inputAwayTeam();
        emailMessage += "\n";
        emailMessage += getString(R.string.team_a)+"\n";
        emailMessage += getString(R.string.home_team)+"\n";
        emailMessage += getString(R.string.n_goals) + " " + goals_a + "\n";
        emailMessage += getString(R.string.n_sont) + " " + shotsOnTarget_a + "\n";
        emailMessage += getString(R.string.n_soft) + " " + shotsOffTarget_a + "\n";
        emailMessage += getString(R.string.n_yc) + " " + yellowCard_a + "\n";
        emailMessage += getString(R.string.n_rc) + " " + redCard_a + "\n";
        emailMessage += getString(R.string.n_switches) + " " + switches_a + "\n";

        emailMessage += "\n";

        emailMessage += getString(R.string.team_b)+"\n";
        emailMessage += getString(R.string.away_team)+"\n";
        emailMessage += getString(R.string.n_goals) + " " + goals_b + "\n";
        emailMessage += getString(R.string.n_sont) + " " + shotsOnTarget_b + "\n";
        emailMessage += getString(R.string.n_soft) + " " + shotsOffTarget_b + "\n";
        emailMessage += getString(R.string.n_yc) + " " + yellowCard_b + "\n";
        emailMessage += getString(R.string.n_rc) + " " + redCard_b + "\n";
        emailMessage += getString(R.string.n_switches) + " " + switches_b + "\n";
        return emailMessage;
    }


    /**
     * Send the message in an email
     */
    public void sendEmail(View view){
        String emailSubject;
        emailSubject = getString(R.string.match_statistics) + " " + inputHomeTeam()+ " " + getString(R.string.vs)+ " " + inputAwayTeam();
        composeEmail(emailSubject,createStatisticsMessage());

    }

    /**
     * method to reset all counters
     */
    public void reset(View v){
        goals_a = 0;
        goals_b = 0;
        redCard_a = 0;
        redCard_b = 0;
        yellowCard_a = 0;
        yellowCard_b = 0;
        shotsOnTarget_a = 0;
        shotsOnTarget_b = 0;
        shotsOffTarget_a = 0;
        shotsOffTarget_b = 0;
        switches_a = 0;
        switches_b = 0;
        display_goal_a(goals_a);
        display_rc_a(redCard_a);
        display_yc_a(yellowCard_a);
        display_sont_a(shotsOnTarget_a);
        display_soft_a(shotsOffTarget_a);
        display_sw_a(switches_a);
        display_goal_b(goals_b);
        display_rc_b(redCard_b);
        display_yc_b(yellowCard_b);
        display_sont_b(shotsOnTarget_b);
        display_soft_b(shotsOffTarget_b);
        display_sw_b(switches_b);
    }

}