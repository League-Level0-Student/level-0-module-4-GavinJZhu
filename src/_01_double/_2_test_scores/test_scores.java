package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
	String testhold = JOptionPane.showInputDialog(null, "What score did you get on any test?");
	double scoreHolder = Double.parseDouble(testhold);
	if (scoreHolder > 0 && scoreHolder < 10) {
		JOptionPane.showMessageDialog(null, "I, I don't even know what to say. I don't think the subject you got the grade on, is for you.");
	}
	else if (scoreHolder > 10 && scoreHolder < 20) {
		JOptionPane.showMessageDialog(null, "Oof, must of not even attended!! Make sure you do good in school.");
	}
	else if (scoreHolder > 20 && scoreHolder < 30) {
		JOptionPane.showMessageDialog(null, "I recommend you study a lot more, and attend a lot more.");
	}
	else if (scoreHolder > 30 && scoreHolder < 40) {
		JOptionPane.showMessageDialog(null, "Maybe listen better and study more, better luck next time!");
	}
	else if (scoreHolder > 40 && scoreHolder < 50) {
		JOptionPane.showMessageDialog(null, "Getting close to leaving F! Study more next time and listen some more.");
	}
	else if (scoreHolder > 50 && scoreHolder < 60) {
		JOptionPane.showMessageDialog(null, "Better than some, maybe take a few more hours out of your day to study more.");
	}
	else if (scoreHolder > 60 && scoreHolder < 70) {
		JOptionPane.showMessageDialog(null, "Hey, that's not bad, but maybe study more and you will get better grades.");
	}
	else if (scoreHolder > 70 && scoreHolder < 80) {
		JOptionPane.showMessageDialog(null, "Keep up the good work! That's quite average, keep doing what your doing.");
	}
	else if (scoreHolder > 80 && scoreHolder < 90) {
		JOptionPane.showMessageDialog(null, "Nice!! You're doing a great job, I see you being pretty successful. Keep doing what you're doing");
	}
	else if (scoreHolder > 90 && scoreHolder <= 100){
		JOptionPane.showMessageDialog(null, "I bet you're the top of your class! CEOs get these grades, you will be up there in life!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Hey! Don't lie to me, I can see right through impossible scores!");
	}
}
}
