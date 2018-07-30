package jp.co.internous.person;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-0000-0000";
		taro.address="xxxxx";
		taro.shusshin="東京";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		System.out.println(taro.shusshin);

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="111-1111-1111";
		jiro.address="千葉";
		jiro.shusshin="vvv";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.println(jiro.shusshin);

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="222-2222-2222";
		hanako.address="aaaaa";
		hanako.shusshin="埼玉";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println(hanako.shusshin);

		Person megumi=new Person();
		megumi.name="金澤恵";
		megumi.age=20;
		megumi.phoneNumber="333-3333-3333";
		megumi.address="wwwww";
		megumi.shusshin="兵庫";
		System.out.println(megumi.name);
		System.out.println(megumi.age);
		System.out.println(megumi.phoneNumber);
		System.out.println(megumi.address);
		System.out.println(megumi.shusshin);


		taro.talk();
		taro.walk();
		taro.run();

		Robot aibo=new Robot();
		aibo.name="アイボ";
		Robot asimo=new Robot();
		asimo.name="アシモ";
		Robot pepper=new Robot();
		pepper.name="ペッパー";
		Robot doraemon=new Robot();
		doraemon.name="ドラえもん";

		aibo.talk();
		aibo.walk();
		aibo.run();

		asimo.talk();
		asimo.walk();
		asimo.run();

		pepper.talk();
		pepper.walk();
		pepper.run();

		doraemon.talk();
		doraemon.walk();
		doraemon.run();






	}

}
