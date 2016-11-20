package com.tencent.service;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

import com.tencent.common.Configure;
import com.tencent.common.HttpsRequest;
import com.tencent.common.RandomStringGenerator;
import com.tencent.common.Signature;
import com.tencent.protocol.refund_query_protocol.RefundQueryReqData;

/**
 * User: rizenguo
 * Date: 2014/10/29
 * Time: 16:04
 */
public class RefundQueryService extends BaseService{

    public RefundQueryService(String certLocalPath,String certPassword) throws IllegalAccessException, InstantiationException, ClassNotFoundException, UnrecoverableKeyException, KeyManagementException, NoSuchAlgorithmException, KeyStoreException, IOException {
        super(Configure.REFUND_QUERY_API,certLocalPath,certPassword);
    }

    /**
     * 请求退款查询服务
     * @param refundQueryReqData 这个数据对象里面包含了API要求提交的各种数据字段
     * @return API返回的XML数据
     * @throws Exception
     */
    public String request(RefundQueryReqData refundQueryReqData) throws Exception {

        //--------------------------------------------------------------------
        //发送HTTPS的Post请求到API地址
        //--------------------------------------------------------------------
        String responseString = sendPost(refundQueryReqData);

        return responseString;
    }




}
