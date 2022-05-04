/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50737
 Source Host           : localhost:3306
 Source Schema         : ssmbuild

 Target Server Type    : MySQL
 Target Server Version : 50737
 File Encoding         : 65001

 Date: 04/05/2022 16:42:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for my_book
-- ----------------------------
DROP TABLE IF EXISTS `my_book`;
CREATE TABLE `my_book`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of my_book
-- ----------------------------
INSERT INTO `my_book` VALUES (1, 'sqlserver', '从跑路到入狱', 30.00);
INSERT INTO `my_book` VALUES (10, 'mysql', '从入门到跑路', 20.00);
INSERT INTO `my_book` VALUES (11, 'mysql', '从入门到跑路', 20.00);
INSERT INTO `my_book` VALUES (12, 'spring', '从入狱到越狱', 30.00);
INSERT INTO `my_book` VALUES (16, '8888', 'svdsv', 80.00);
INSERT INTO `my_book` VALUES (17, '9999', 'asdf', 99.00);
INSERT INTO `my_book` VALUES (18, '1111', 'aasa', 11.00);
INSERT INTO `my_book` VALUES (20, '2222', 'asvdf', 22.00);
INSERT INTO `my_book` VALUES (21, '3333', 'acsav', 33.00);
INSERT INTO `my_book` VALUES (22, '5555', 'sadvs', 55.00);

SET FOREIGN_KEY_CHECKS = 1;
