/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : localhost:3306
 Source Schema         : managementsystem

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 15/11/2018 18:52:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_lab
-- ----------------------------
DROP TABLE IF EXISTS `t_lab`;
CREATE TABLE `t_lab`  (
  `lab_id` int(8) NOT NULL COMMENT '实验室流水号',
  `lab_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '实验室名称',
  `lab_place` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '实验室地址',
  `lab_intro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '实验室简介',
  `lab_web` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '实验室网站',
  PRIMARY KEY (`lab_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
