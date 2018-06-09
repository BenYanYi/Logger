# Logger
## log封装

### 使用方法

module 下添加

    buildTypes {
        debug {
            buildConfigField "boolean", "LOG_DEBUG", "true"
        }
        release {
            buildConfigField "boolean", "LOG_DEBUG", "false"
        }
    }

     compile 'com.github.BenYanYi:Logger:1.0.1'
     或者
     compile 'com.yanyi.benyanyi:loglib:1.0.0'
     建议使用后者，第一种方式已放弃更新

     可设置是否打印JLog.init(boolean),默认不打印

<br/>

使用第一种引用则需project 下添加

    allprojects {
        repositories {
            jcenter()
            maven {
                url 'https://jitpack.io'
            }
        }
    }
    