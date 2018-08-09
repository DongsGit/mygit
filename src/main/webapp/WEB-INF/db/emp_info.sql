/*
 Navicat Premium Data Transfer

 Source Server         : wxd
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : emp

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 09/08/2018 18:51:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for emp_info
-- ----------------------------
DROP TABLE IF EXISTS `emp_info`;
CREATE TABLE `emp_info`  (
  `ID` int(20) NOT NULL COMMENT '用户ID',
  `USER_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `SEX` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `CITY` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '城市',
  `SIGN_NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '签名',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emp_info
-- ----------------------------
INSERT INTO `emp_info` VALUES (10001, 'user-01', '男', '南京', '签名01');
INSERT INTO `emp_info` VALUES (10002, 'user-02', '女', '常州', '签名02');
INSERT INTO `emp_info` VALUES (10003, 'user-03', '女', '南通', '签名03');

SET FOREIGN_KEY_CHECKS = 1;
