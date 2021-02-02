import java.util.Arrays;




import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

import java.awt.Graphics;

import javax.swing.*;

import javax.swing.JFrame;

public class MercMan extends JComponent {
	
	public void paintComponent(Graphics g) {
		
		
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g);
		
		Ellipse2D.Double hair = new Ellipse2D.Double(getWidth()/2 - ((getWidth()/4.2)/2) , 0, getWidth()/4.2, getHeight()/5);
		
		Ellipse2D.Double head = new Ellipse2D.Double(getWidth()/2 - ((getWidth()/6)/2) , hair.y + hair.height/2, getWidth()/6, getHeight()/6);
		
		Rectangle2D.Double hairline = new Rectangle2D.Double(head.x, head.y, head.width, head.width/5);
		
		Ellipse2D.Double eyebrow = new Ellipse2D.Double(hairline.x + head.width/12, hairline.y + hairline.height - head.height/13, 5*hairline.width/6, head.height/5);
		
		Ellipse2D.Double leftEyeOut = new Ellipse2D.Double(head.x + head.width/2 - head.width/3.35, head.y + head.height/4, getWidth()/27, getHeight()/27);
		
		Ellipse2D.Double rightEyeOut = new Ellipse2D.Double(head.x + head.width/2 + head.width/22, head.y + head.height/4, getWidth()/27, getHeight()/27);
		
		Ellipse2D.Double leftEyeColor = new Ellipse2D.Double(leftEyeOut.x + leftEyeOut.width/2 - leftEyeOut.width/5, leftEyeOut.y + leftEyeOut.height/2 - leftEyeOut.height/5, getWidth()/74, getHeight()/74);
		
		Ellipse2D.Double rightEyeColor = new Ellipse2D.Double(rightEyeOut.x + rightEyeOut.width/2 - rightEyeOut.width/5, rightEyeOut.y + rightEyeOut.height/2 - rightEyeOut.height/5, getWidth()/74, getHeight()/74);
		
		Ellipse2D.Double leftPupil = new Ellipse2D.Double(leftEyeOut.x + leftEyeOut.width/2 - leftEyeOut.width/9, leftEyeOut.y + leftEyeOut.height/2 - leftEyeOut.height/9, getWidth()/164, getHeight()/164);
		
		Ellipse2D.Double rightPupil = new Ellipse2D.Double(rightEyeOut.x + rightEyeOut.width/2 - rightEyeOut.width/9, rightEyeOut.y + rightEyeOut.height/2 - rightEyeOut.height/9, getWidth()/164, getHeight()/164);
		
		Arc2D.Double mouth = new Arc2D.Double(head.x + head.width/3.85, head.y + head.height/1.85, getWidth()/12, getHeight()/16, 180, 180, Arc2D.PIE);
		
		Ellipse2D.Double nose = new Ellipse2D.Double(mouth.x + mouth.width/2.9, head.y + head.height/2.1, getWidth()/48, getHeight()/36);
		
		Ellipse2D.Double leftEar = new Ellipse2D.Double(nose.x - head.width/2, nose.y - head.width/12, getWidth()/48, getHeight()/24);
		
		Ellipse2D.Double rightEar = new Ellipse2D.Double(nose.x + head.width/2, nose.y - head.width/12, getWidth()/48, getHeight()/24);
		
		Rectangle2D.Double neck = new Rectangle2D.Double(head.x + head.width/3.75, head.y + (9.5*head.height/11), head.width - head.width/2, head.height/4);
		
		Rectangle2D.Double body = new Rectangle2D.Double(head.x - head.width/12, neck.y + neck.height, head.width * 1.15, head.height * 2 );
		
		Rectangle2D.Double rightArm = new Rectangle2D.Double(body.x + body.width, body.y, body.width/4, body.height - body.height/2.5);
		
		Rectangle2D.Double leftArm = new Rectangle2D.Double(body.x - body.width/4, body.y, body.width/4, body.height - body.height/2.5);
		
		Rectangle2D.Double rightShoulder = new Rectangle2D.Double(rightArm.x , rightArm.y, rightArm.width, leftArm.height/6);
		
		Rectangle2D.Double leftShoulder = new Rectangle2D.Double(leftArm.x, leftArm.y, leftArm.width, rightArm.height/6);
		
		Rectangle2D.Double rightLeg = new Rectangle2D.Double(body.x, body.y + body.height, body.width/3, rightArm.height * 1.6);
		
		Rectangle2D.Double leftLeg = new Rectangle2D.Double(body.x + body.width - body.width/3, body.y + body.height, body.width/3, rightArm.height * 1.6);
		
		Rectangle2D.Double rightShoe = new Rectangle2D.Double(rightLeg.x, rightLeg.y + rightLeg.height, rightLeg.width, getHeight() - rightLeg.height - body.height - head.height);
		
		Rectangle2D.Double leftShoe = new Rectangle2D.Double(leftLeg.x, rightLeg.y + rightLeg.height, rightLeg.width, getHeight() - rightLeg.height - body.height - head.height);
		
		
		
		Color skin = new Color(229, 194, 152);
		Color eyes = new Color(103, 166, 197);
		Color ears = new Color(255, 220, 177);
		Color lips = new Color(255, 88, 79);
		Color shirt = new Color(127, 181, 181);
		Color shoes = new Color(66, 40, 1);
		Color jeans = new Color(0,55, 111);
		Color hairColor = new Color(51, 42, 34);
		Color eyeBack = new Color(241, 241, 241);

		
		this.setBackground(Color.BLACK);
		
		g2.setColor(skin);
		g2.fill(rightEar);
		g2.fill(leftEar);
		
		g2.setColor(Color.BLACK);
		g2.draw(rightEar);
		g2.draw(leftEar);
		
		g2.setColor(hairColor);
		g2.fill(hair);
		
		g2.setColor(Color.BLACK);
		g2.draw(hair);
		
		
		g2.setColor(skin);
		g2.fill(neck);
		g2.fill(head);
		g2.fill(rightArm);
		g2.fill(leftArm);
		
		g2.setColor(Color.BLACK);
		g2.draw(head);
		
		g2.setColor(hairColor);
		g2.fill(hairline);
		
		g2.setColor(skin);
		g2.fill(eyebrow);
		
		g2.setColor(shirt);
		g2.fill(body);
		g2.fill(rightShoulder);
		g2.fill(leftShoulder);
		
		g2.setColor(jeans);
		g2.fill(rightLeg);
		g2.fill(leftLeg);
		
		g2.setColor(eyeBack);
		g2.fill(leftEyeOut);
		g2.fill(rightEyeOut);
		
		g2.setColor(Color.BLACK);
		g2.draw(leftEyeOut);
		g2.draw(rightEyeOut);
		
		g2.setColor(eyes);
		g2.fill(leftEyeColor);
		g2.fill(rightEyeColor);
		
		g2.setColor(Color.BLACK);
		g2.fill(leftPupil);
		g2.fill(rightPupil);
		
		g2.setColor(skin);
		g2.fill(nose);
		
		g2.setColor(Color.BLACK);
		g2.draw(nose);
		
		g2.setColor(Color.WHITE);
		g2.fill(mouth);
		
		g2.setColor(Color.BLACK);
		g2.draw(mouth);
		
		g2.setColor(shoes);
		g2.fill(rightShoe);
		g2.fill(leftShoe);
		
		
		
	}
}