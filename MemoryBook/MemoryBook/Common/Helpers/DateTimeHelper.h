//
//  DateTimeHelper.h
//  MemoryBook
//
//  Created by Samson on 16/6/14.
//  Copyright © 2016年 Samson Tseng. All rights reserved.
//

#import "MBHelper.h"

@interface DateTimeHelper : MBHelper

+ (id)sharedInstance;
- (NSString *)getCurrentTime;

@end
