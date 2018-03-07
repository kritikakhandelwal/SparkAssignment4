//package edu.knoldus
//
//import com.typesafe.config.{Config, ConfigFactory}
//import twitter4j.conf.ConfigurationBuilder
//import twitter4j.{Logger, Query, Twitter, TwitterFactory}
//
//import scala.concurrent.ExecutionContext.Implicits.global
//import scala.util.{Failure, Success}
//
//object Application extends App {
//
//  val log: Logger = Logger.getLogger(this.getClass)
//  val tweet: Tweets = new Tweets
//  val hashtag: String = "#Budget2018"
//  val query: Query = new Query(hashtag)
//  query.setSince("2018-1-31")
//  val count: Int = 20
//  query.setCount(count)
//  val config: Config = ConfigFactory.load("application.conf")
//
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
//  val startDate = "2018-01-31"
//  val endDate = "2018-02-05"
//  val LikesPerTweet = tweet.averageLikes(twitter, query)
//  val TweetsRecord = tweet.getTweets(twitter, hashtag)
//
//  log.info(s"$TweetsRecord")
//
//  val avgTweet = tweet.averageTweets(twitter, startDate, endDate, query)
//  avgTweet onComplete {
//    case Success(value) => log.info("\n\n Average Tweets are :" + value)
//    case Failure(value) => log.info(value.getMessage)
//  }
//
//
//  val noOfTweets = tweet.tweetsCount(twitter, query)
//  noOfTweets onComplete {
//    case Success(value) => log.info("\n\nTweets Count is : " + value)
//    case Failure(value) => log.info(value.getMessage)
//  }
//
//  val AverageTweets = tweet.averageRetweets(twitter, startDate, endDate, query)
//  AverageTweets onComplete {
//    case Success(value) => log.info("\n\nAverage number of Re-tweets are :" + value)
//    case Failure(value) => log.info(value.getMessage)
//  }
//
//  LikesPerTweet onComplete {
//    case Success(value) => log.info("\n\nlikes per Tweets are:" + value)
//    case Failure(value) => log.info(value.getMessage)
//  }
//  val sleepTime = 2000
//  Thread.sleep(sleepTime)
//}
//
//
