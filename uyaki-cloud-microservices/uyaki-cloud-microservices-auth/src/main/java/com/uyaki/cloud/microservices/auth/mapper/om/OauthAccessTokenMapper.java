package com.uyaki.cloud.microservices.auth.mapper.om;

import com.uyaki.cloud.microservices.auth.model.om.OauthAccessToken;

public interface OauthAccessTokenMapper {
    int deleteByPrimaryKey(String authenticationId);

    int insert(OauthAccessToken record);

    int insertSelective(OauthAccessToken record);

    OauthAccessToken selectByPrimaryKey(String authenticationId);

    int updateByPrimaryKeySelective(OauthAccessToken record);

    int updateByPrimaryKeyWithBLOBs(OauthAccessToken record);

    int updateByPrimaryKey(OauthAccessToken record);
}