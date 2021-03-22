package com.basketboy.talking.service;


import com.basketboy.talking.pojo.FlowBean;

/**
 * @author ：xandone
 * created on  ：2019/6/12 16:12
 * description：
 */
public interface FlowService {

    FlowBean getFlowData(String adminId) throws Exception;

    void upDateFlow(FlowBean flowBean) throws Exception;

    void addFlow(FlowBean flowBean) throws Exception;

    FlowBean getAllCount() throws Exception;

}
