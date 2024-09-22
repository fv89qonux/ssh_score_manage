## 本项目实现的最终作用是基于SSH学生成绩管理系统
## 分为2个角色
### 第1个角色为管理员角色，实现了如下功能：
 - 修改密码
 - 学生信息管理
 - 成绩信息管理
 - 管理员登录
 - 课程信息管理
### 第2个角色为设计文稿，实现了如下功能：
 - 设计报告
## 数据库设计如下：
# 数据库设计文档

**数据库名：** ssh_score_manage

**文档版本：** 


| 表名                  | 说明       |
| :---: | :---: |
| [course](#course) |  |
| [login](#login) |  |
| [major](#major) |  |
| [score](#score) |  |
| [student](#student) | 学生表 |

**表名：** <a id="course">course</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | courseId |   varchar   | 255 |   0    |    N     |  Y   |       | 课程ID  |
|  2   | courseName |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  3   | courseDate |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  4   | student |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | credit |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="login">login</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | username |   varchar   | 6 |   0    |    N     |  N   |       | 用户名  |
|  3   | password |   varchar   | 255 |   0    |    N     |  N   |       | 密码  |

**表名：** <a id="major">major</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | id |   int   | 10 |   0    |    N     |  Y   |       | 自增主键  |
|  2   | majorName |   varchar   | 255 |   0    |    N     |  N   |       |   |
|  3   | number |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  4   | teacher |   varchar   | 8 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="score">score</a>

**说明：** 

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | studentId |   varchar   | 6 |   0    |    N     |  Y   |       | 学生ID  |
|  2   | courseId |   varchar   | 4 |   0    |    N     |  Y   |       | 课程ID  |
|  3   | score |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  4   | credit |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |

**表名：** <a id="student">student</a>

**说明：** 学生表

**数据列：**

| 序号 | 名称 | 数据类型 |  长度  | 小数位 | 允许空值 | 主键 | 默认值 | 说明 |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
|  1   | studentId |   varchar   | 6 |   0    |    N     |  Y   |       | 学生ID  |
|  2   | name |   varchar   | 255 |   0    |    Y     |  N   |   NULL    | 名字  |
|  3   | sex |   tinyint   | 4 |   0    |    Y     |  N   |   NULL    | 性别  |
|  4   | birthDate |   varchar   | 255 |   0    |    Y     |  N   |   NULL    |   |
|  5   | totalCredits |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  6   | other |   text   | 65535 |   0    |    Y     |  N   |   NULL    |   |
|  7   | majorId |   int   | 10 |   0    |    Y     |  N   |   NULL    |   |
|  8   | photo |   tinyblob   | 255 |   0    |    Y     |  N   |   NULL    |   |

