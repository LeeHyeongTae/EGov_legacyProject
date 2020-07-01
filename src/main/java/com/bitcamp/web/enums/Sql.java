package com.bitcamp.web.enums;

public enum Sql {
	CREATE_DB,
	CREATE_MEMBERS, DROP_MEMBERS, TRUNCATE_MEMBERS, 
	CREATE_ARTICLES, DROP_ARTICLES, TRUNCATE_ARTICLES,
	CREATE_IMAGES, DROP_IMAGES, TRUNCATE_IMAGES,
	
	
//	@Override
//	public String toString() {
//		String result = "";
//		switch(this) {
//		case CREATE_DB: result = "create database mariadb"; break;
//		case CREATE_MEMBERS: result = "create table members"; break;
//		case DROP_MEMBERS: result = "drop table members"; break;
//		case TRUNCATE_MEMBERS: result = "truncate table members"; break;
//		case CREATE_ARTICLES: result = "create table articles("
//                + "artseq int auto_increment primary key,"
//                + "imageSeq int  references images,"
//                + "userid varchar(30)  references persons,"
//                + "comments varchar(500),"
//                + "message varchar(50),"
//                + "rating varchar(50), "
//                + "boardtype varchar(50),"
//                + "title varchar(300),"
//                + "content varchar(1000))ENGINE=InnoDB DEFAULT CHARSET=UTF8"; break;
//		case DROP_ARTICLES: result = "drop table articles"; break;
//		case TRUNCATE_ARTICLES: result = "truncate table articles"; break;
//		case CREATE_IMAGES: result = "create table images("+
//                "imageSeq int auto_increment primary key"+
//                "image varchar(100)"+
//                 ")ENGINE=InnoDB DEFAULT CHARSET=UTF8"; break;
//		case DROP_IMAGES: result = "drop table images"; break;
//		case TRUNCATE_IMAGES: result = "truncate table images"; break;
//		default: break;
//	}
//		return result;	
//	}
}
