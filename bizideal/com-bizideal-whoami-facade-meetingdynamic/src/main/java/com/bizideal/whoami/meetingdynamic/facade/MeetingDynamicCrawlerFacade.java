package com.bizideal.whoami.meetingdynamic.facade;

import java.util.Map;

import com.bizideal.whoami.meetingdynamic.entity.MeetingDynamicCrawler;

/**
 * 
 * @ClassName MeetingDynamicCrawlerFacade
 * 
 * @Author yt.Cui
 * @Date 2016年12月18日
 */
public interface MeetingDynamicCrawlerFacade {

	/**
	 * 根据爬虫记录获取整个网站动态信息
	 * @param crawler
	 * @return
	 */
	Map<String,Object> climbAllDynamics(MeetingDynamicCrawler crawlerInfo);
	
	/**
	 * 根据爬虫记录爬取pageStart到pageEnd的页面的动态信息
	 * @param crawler
	 * @param pageStart
	 * @param pageEnd
	 * @return
	 */
	Map<String,Object> climbCurrentDynamics(MeetingDynamicCrawler crawlerInfo, Integer pageStart, Integer pageEnd);
	
	/**
	 * 添加会议的网站抓取地址
	 * @param meetingDynamicCrawler
	 * @return
	 */
	Map<String,Object> addCrawlerUrlToMeeting(MeetingDynamicCrawler meetingDynamicCrawler);
	
	/**
	 * 删除爬虫网址url
	 * @param meetingDynamicCrawler
	 * @return
	 */
	Map<String,Object> deleteCrawlerUrlToMeeting(MeetingDynamicCrawler meetingDynamicCrawler);
	
	/**
	 * 修改爬虫网址信息
	 * @param meetingDynamicCrawler
	 * @return
	 */
	Map<String,Object> updateCrawlerUrlToMeeting(MeetingDynamicCrawler meetingDynamicCrawler);
	
	/**
	 * 根据会议ID查询爬虫网址信息
	 * @param meetingDynamicCrawler
	 * @return
	 */
	Map<String,Object> selectCrawlerUrlToMeeting(MeetingDynamicCrawler meetingDynamicCrawler);
}
