DROP TABLE IF EXISTS `user_t`;

CREATE TABLE `user_t` (
  `number` int(11) NOT NULL AUTO_INCREMENT,
  `uuid` varchar(40) NOT NULL,
  `name` varchar(40) NOT NULL,
  `age` int(4) NOT NULL,
  `passwd` varchar(40) NOT NULL,
 `department` varchar(255) NOT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user_t` */

insert  into `user_t`(`number`,`name`,`age`,`department`,`passwd`,`uuid`) values (1,'小花',24,'测试部','',uuid());
insert  into `user_t`(`number`,`name`,`age`,`department`,`passwd`,`uuid`) values (2,'小白',24,'开发部','',uuid());

CREATE TABLE `version_t` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `createTime` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    `editTime` TIMESTAMP Null DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `type` varchar(40) NOT NULL,
    `version` varchar(40) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

insert into `version_t`(`id`,`type`,`version`) values (1,'android','1.0.1');