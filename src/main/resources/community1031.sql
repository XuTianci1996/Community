/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : community

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 31/10/2019 17:59:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `description` text CHARACTER SET utf8 COLLATE utf8_general_ci,
  `gmt_created` bigint(20) DEFAULT NULL,
  `gmt_modified` bigint(20) DEFAULT NULL,
  `creator` int(11) DEFAULT NULL,
  `comment_count` int(11) DEFAULT 0,
  `view_count` int(11) DEFAULT 0,
  `like_count` int(11) DEFAULT 0,
  `tag` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES (1, '3213', '123123', 1571123882062, 1571123882062, 1, 3, 5, NULL, '```');
INSERT INTO `question` VALUES (2, '这是一个测试', '问题', 1571123937774, 1571123937774, 1, 2, 4, NULL, '标签');
INSERT INTO `question` VALUES (3, '这是一个测试', '问题', 1571123937774, 1571123937774, 1, 2, 4, NULL, '标签');
INSERT INTO `question` VALUES (4, '这是一个测试', '问题', 1571123937774, 1571123937774, 1, 2, 4, NULL, '标签');
INSERT INTO `question` VALUES (5, '这是一个测试', '问题', 1571123937774, 1571123937774, 1, 2, 4, NULL, '标签');
INSERT INTO `question` VALUES (6, '这是一个测试', '问题', 1571123937774, 1571123937774, 1, 2, 4, NULL, '标签');
INSERT INTO `question` VALUES (7, '这是一个测试', '问题', 1571123937774, 1571123937774, 2, 2, 4, NULL, '标签');
INSERT INTO `question` VALUES (8, '这是一个测试', '问题', 1571123937774, 1571123937774, 2, 2, 4, NULL, '标签');
INSERT INTO `question` VALUES (9, '这是一个测试', '问题', 1571123937774, 1571123937774, 2, 2, 4, NULL, '标签');
INSERT INTO `question` VALUES (10, '这是一个测试', '问题', 1571123937774, 1571123937774, 12, 2, 4, NULL, '标签');
INSERT INTO `question` VALUES (11, '这是一个测试', '问题', 1571123937774, 1571123937774, 2, 2, 4, NULL, '标签');
INSERT INTO `question` VALUES (12, '这是一个测试', '问题', 1571123937774, 1571123937774, 1, 2, 4, NULL, '标签');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ACCOUNT_ID` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `NAME` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `TOKEN` varchar(36) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `GMT_CREATE` bigint(20) DEFAULT NULL,
  `GMT_MODIFIED` bigint(20) DEFAULT NULL,
  `bio` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `avatar_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '43103501', '徐天赐', '76159f9a-88fe-4e56-8ee0-aab47c1c2d5f', 1571122393969, 1571122393969, NULL, 'https://avatars0.githubusercontent.com/u/43103501?v=4');
INSERT INTO `user` VALUES (2, '43103501', '徐天赐', 'e07dbb91-c707-410e-aa15-d8569244c99b', 1572229182630, 1572229182630, NULL, 'https://avatars0.githubusercontent.com/u/43103501?v=4');

SET FOREIGN_KEY_CHECKS = 1;
