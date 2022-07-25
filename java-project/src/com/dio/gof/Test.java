package com.dio.gof;

import com.dio.gof.facade.Facade;
import com.dio.gof.singleton.SingletonEager;
import com.dio.gof.singleton.SingletonLazy;
import com.dio.gof.singleton.SingletonLazyHolder;
import com.dio.gof.strategy.AgressiveBehavior;
import com.dio.gof.strategy.Behavior;
import com.dio.gof.strategy.DefensiveBehavior;
import com.dio.gof.strategy.NormalBehavior;
import com.dio.gof.strategy.Robot;

public class Test {

	public static void main(String[] args) {
		// Singleton Design Pattern - Tests:
		System.out.println("#### Singleton - Tests ####");
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstance();
		System.out.println(holder);
		
		System.out.println("\n");
		
		// Strategy - Tests:
		System.out.println("#### Strategy - Tests ####");
		Behavior normal = new NormalBehavior();
		Behavior defensive = new DefensiveBehavior();
		Behavior agressive = new AgressiveBehavior();
		
		Robot robot = new Robot();
		robot.setBehavior(normal);
		robot.move();
		robot.setBehavior(defensive);
		robot.move();
		robot.setBehavior(agressive);
		robot.move();
		
		System.out.println("\n");
		
		// Facade - Tests:
		System.out.println("#### Facade - Tests ####");
		Facade facade = new Facade();
		facade.migrateClient("John Mills", "75500-000");
	}

}
