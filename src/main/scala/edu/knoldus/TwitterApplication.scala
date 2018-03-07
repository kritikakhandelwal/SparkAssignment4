//package edu.knoldus
//
//
//import com.typesafe.config.{Config, ConfigFactory}
//import org.apache.log4j.{Level, Logger}
//import org.apache.spark.rdd.RDD
//import org.apache.spark.sql.SQLContext
//import org.apache.spark.{SparkConf, SparkContext}
//import twitter4j.TwitterFactory
//import twitter4j.conf.ConfigurationBuilder
//
//import org.apache.spark.streaming.Seconds
//import org.apache.spark.streaming.StreamingContext
//import org.apache.spark.streaming.StreamingContext._
//
//
//object Application {
//
//
//  Logger.getLogger("org").setLevel(Level.OFF)
//  //val conf = new SparkConf().setAppName("SparkAssignment").setMaster("local[*]")
//  //val sc = new SparkContext(conf)
//  //val sqlContext = new SQLContext(sc)
//
//  //import sqlContext.implicits._
//
//  val config = ConfigFactory.load("twitterconfig.properties")
//  val consumerKey: String = config.getString("Twitter.key.consumerKey")
//  val consumerSecretKey: String = config.getString("Twitter.key.consumerSecretKey")
//  val accessToken: String = config.getString("Twitter.key.accessToken")
//  val accessSecretToken: String = config.getString("Twitter.key.accessSecretToken")
//  val configurationBuilder: ConfigurationBuilder = new ConfigurationBuilder()
//  configurationBuilder.setDebugEnabled(false)
//
//    .setOAuthConsumerKey(consumerKey)
//    .setOAuthConsumerSecret(consumerSecretKey)
//    .setOAuthAccessToken(accessToken)
//    .setOAuthAccessTokenSecret(accessSecretToken)
//  val twitter = new TwitterFactory(configurationBuilder.build()).getInstance()
//
////  System.setProperty("twitter4j.oauth.consumerKey", "CONSUMER_API_KEY")
////  System.setProperty("twitter4j.oauth.consumerSecret", "CONSUMER_API_SECRET")
////  System.setProperty("twitter4j.oauth.accessToken", "ACCESS_TOKEN")
////  System.setProperty("twitter4j.oauth.accessTokenSecret", "ACCESS_TOKEN_SECRET")
//
//  val sparkConf = new SparkConf().setAppName("TopHashtags")
//  val ssc = new StreamingContext(sparkConf, Seconds(5))
//
//  //  sc.stop()
//
//  //Thread.sleep(10000)
//}
