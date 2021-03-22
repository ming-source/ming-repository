package com.basketboy.talking.service;

import com.basketboy.talking.pojo.Base.BaseResult;
import com.basketboy.talking.pojo.BannerBean;

/**
 * @author ：xandone
 * created on  ：2019/1/17 16:32
 * description：
 */
public interface BannerService {
    BaseResult getBannerData();

    BannerBean addBanner(BannerBean bean) throws Exception;

    void deleteBannerById(String articelId) throws Exception;
}
