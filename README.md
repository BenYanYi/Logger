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

     compile 'com.github.love-yanyi:Logger:1.0.1'

     使用log前全局引用中需初始化JLog.init(BuildConfig.LOG_DEBUG);

<br/>
project 下添加

    allprojects {
        repositories {
            jcenter()
            maven {
                url 'https://jitpack.io'
            }
        }
    }

<br/>
