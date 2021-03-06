package com.max.news.db.http;

import com.max.news.MVP.home.channelist.bean.ChannelInfoBean;
import com.max.news.MVP.home.channelist.bean.ChannelListResBody;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;


/**
 * Retrofit请求接口，定义URL后面的字段和需要传入的值，方便其余方法调用
 */

public interface ApiService {

    /**
     * 获取频道名称列表
     * @return 频道名称列表
     */
    @GET(Url.URL_CHANNEL_NEWS)
    Observable<HttpResult<ChannelListResBody>> getChannelList();

    /**
     * 根据频道名或者搜索字段获取新闻
//     * @param mChannelId 新闻频道id，必须精确匹配
//     * @param mChannelName 新闻频道名称，可模糊匹配
//     * @param mChannelTitle 标题名称，可模糊匹配
//     * @param mPage 页数，默认1。每页最多20条记录
//     * @param mNeedContent 是否需要返回正文，1为需要，其他为不需要
//     * @param mNeedHtml 是否需要返回正文的html格式，1为需要，其他为不需要
//     * @param mNeedAllList 是否需要最全的返回资料。包括每一段文本和每一张图。用list的形式返回
//     * @param mNeedResult 每页返回记录数，值在20-100之间。
     * @return 新闻信息列表
     */
    @GET(Url.URL_SEARCH_NEWS)
    Observable<HttpResult<ChannelInfoBean>> getChannelInfo(
            @QueryMap Map<String,String> channelMap
    );
}
