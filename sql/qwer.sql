/*
 Navicat Premium Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : qwer

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 12/06/2022 18:25:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for learn
-- ----------------------------
DROP TABLE IF EXISTS `learn`;
CREATE TABLE `learn`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `text` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文本',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
