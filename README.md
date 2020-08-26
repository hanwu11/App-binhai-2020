# 课程目录
## 第一章 基础知识和开发环境搭建 
### 1.1 Android Studio的安装

1. 安装JDK依赖，设置系统环境变量
2. 安装Android Studio，安装SDK
3. 中文乱码处理

### 1.2 第一个项目Hello World

1. 新建项目
2. 软件界面介绍及使用
3. 编译 
4. 创建模拟器
5. 在模拟器运行

### 1.3 工程目录结构

1. 工程目录说明
2. 运行配置文件 AndroidManifest.xml
3. 在代码中修改控件
4. 设置快捷键和安装插件

## 第二章 版本控制 – Git的使用


### 2.1 Git工作流程
### 2.2 安装Git
### 2.3 工作区、暂存区和版本库
### 2.4 创建版本库

1. 初始化仓库
2. 远程克隆

### 2.5 基本操作

1. 将文件添加到缓存
2. 查看项目当前状态
3. 缓存内容提交到仓库
4. 查看历史
5. 回退版本

### 2.6 分支管理

1. 创建分支
2. 切换分支
3. 删除分支
4. 合并分支
5. 合并冲突

### 2.7 远程仓库

1. 添加远程仓库
2. 查看当前的远程仓库
3. 推送到远程仓库
4. 从远程仓库拉取

## 第三章 UI布局和控件
### 3.1 屏幕显示

1. 像素单位（dp、sp、px）
2. 颜色
3. 屏幕分辨率
4. 新建Activity页面和新建文件

### 3.2 布局

1. 视图 View
2. 线性布局 LineatLayout
3. 滚动视图 ScrollView
4. 约束布局 ConstraintLayout

### 3.3 简单控件

1. 文本视图
2. 图像视图
3. 按钮
4. 图形
5. 九宫格图片

### 3.4 表单控件和适配器

1. 复选框
2. 开关
3. 单选钮
4. 下拉框
5. 适配器：数组适配器和简单适配器
6. 文本编辑框和自动完成编辑框

### 3.5 活动 Activity

1. Activity的生命周期
2. 使用intent传递消息
3. 向下一个Activity传递参数
4. 向上一个Activity返回参数

### 3.6 案例：APP登陆

1. 控件：单选按钮、下拉框、编辑框、复选框
2. 相对布局
3. intent传递参数，Activity传参与返回
4. Activity生命周期
5. 提醒对话框AlertDialog



## 第四章 数据存储访问
### 4.1 SharedPreferences共享参数，轻量级数据存储

1. 共享参数存储
2. 共享参数读取

### 4.2 SQLite数据库存储

1. 创建表、删除表、变更表结构
2. 数据增删改查

### 4.3 SD卡文件操作

1. 获得SD卡目录信息
2. 公有存储空间和私有存取空间
3. 读写文本文件
4. 读写图片

### 4.4 APP全局内存

1. Application生命周期
2. 全局内存读写

### [4.5 案例：购物车](eg_4_5shoppingcart.md)

1. 数据库：记录商品信息
2. 共享参数：购物车计数器
3. SD卡：图片缓存
4. 全局内存：缩略图缓存
5. 菜单Menu

## 第五章 高级控件
### 5.1 日期时间控件
### [5.2 列表类视图](eg_5_2shoppingCartPro.md)
### [5.3 网格视图](eg_5_3shoppingChannel.md)
### 5.4 翻页类视图
### 5.5 碎片
### 5.6 广播
### 5.7 振动器
### [5.8 案例：日程表](eg_5_8schedule.md)

## 第六章 组合控件
### 6.1 标签栏
### 6.2 导航栏

1. 工具栏 Toolbar
2. 溢出菜单 OverflowMenu
3. 搜索框 SearchView
4. 标签布局 TabLayout

### 6.3 Banner条

1. 自定义指示器
2. 自动滚动轮播
3. 占用状态栏的banner

### 6.4 增强型列表

1. 线性布局管理器 LineatLayoutManager
2. 网格布局管理器 GridLayoutManager
3. 瀑布流网格布局管理器 StaggeredGridLayoutManager
4. 动态更新循环视图
5. 下拉刷新布局 SwipeRefreshLayout

### 6.5 案例：商城主页

## 第七章 事件
### 7.1 按键事件

1. 检测软键盘
2. 检测物理按键
3. 音量键对话框

### 7.2 触摸事件

1. 事件分发与拦截
2. 手势时间处理

### 7.3 手势检测

1. 手势检测器
2. 飞掠视图
3. 手势控制轮播

### 7.4 手势冲突处理

1. 滚动视图判断滚动规则
2. 下级视图告诉滚动视图能否拦截收拾
3. 抽屉布局

### 7.5 案例：下拉刷新

1. 自定义下拉布局：监听滚动到顶部或底部
2. 处理状态栏和工具栏
3. 添加下拉刷新头部

## 第八章 融合技术

### 8.1 资产管理器

1. 从资产目录读取文本
2. 从资产目录读取图片

### 8.2 网页视图

1. 访问本地网页
2. 访问外部网页
3. 调用js

### 8.3 案例：浏览器

1. 网页设置
2. 网页视图客户端
3. 网页交互客户端
4. 文件下载监听器

## 第九章 第三方开发包
### 9.1 地图SDK
### 9.2 分享SDK
### 9.3 支付SDK
### 9.4 案例:地图App

## 第十章 综合案例调试上线
### 10.1 模拟器、真机调试
### 10.2 导出APK安装包
### 10.3 版本设置
### 10.4 生成正式签名的APK
### 10.5 发布应用程序
### 10.6 电商App

# 实验环节

#### 实验01：开发环境搭建，创建第一个项目。掌握工具包和环境配置，了解工程结构
#### 实验02：版本控制Git的使用，掌握创建、克隆、上传和拉取等技巧
#### 实验03：App登录，合理运用布局和控件，掌握活动组件Activity的用法，如在页面之间进行消息传递和重写生命周期的方法
#### 实验04：购物车，掌握SharedPreferences、数据库SQLite、SD文件、全局内存、内容提供器共5种存储方式的用法
#### 实验05：日程表，掌握控件与适配器的使用，广播的发送和接收器处理，设置定时器
#### 实验06：商城首页，掌握组合控件使用技巧，实现顶部导航、底部标签、横幅轮播Banner，了解布局管理器的用法
#### 实验07：下拉刷新，掌握手势检测，监听并处理事件，解决冲突的方法
#### 实验08：浏览器，掌握网页设置，网页视图客户端、交互客户端、下载监听器的使用
#### 实验09：第三方SDK-地图，掌握使用地图SDK定位、搜索、测量
#### 实验10：综合实例电商App，实现APP开发、测试、签名、上线的过程


