//
//  DatabaseHelper.m
//  MemoryBook
//
//  Created by Sam Tsang on 16/5/31.
//  Copyright © 2016年 Samson Tseng. All rights reserved.
//

#import "DatabaseHelper.h"

@implementation DatabaseHelper

#pragma mark - database
// 创建数据库
+ (BOOL)createDatabase:(NSString *)databaseName{
    return YES;
}

// 检查数据库是否存在
+ (BOOL)isExistDatabase:(NSString *)databaseName{
    return YES;
}

// 删除数据库
+ (void)deleteDatabase:(NSString *)databaseName{
}


#pragma mark - Table
// 创建数据表
+ (void)createTable:(NSString *)tableName{
    
}

// 检查数据表是否存在
+ (BOOL)isExistTalbe:(NSString *)tableName{
    return NO;
}

// 插入表数据
+ (void)insertTable:(NSString *)tableName withSql:(NSString *)sql{
    
}

// 更新表数据
+ (void)updataTable:(NSString *)tableName withSql:(NSString *)sql{
    
}

// 删除数据表
+ (void)deleteTable:(NSString *)tableName{
    
}

@end
