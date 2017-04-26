package com.example.syl.p_mvp.mvp.biz;

/**
 * Created by syl on 2017/4/20.
 */

public interface IUserBiz {
    public void login(String username, String password, OnLoginListener onLoginListener);
}
