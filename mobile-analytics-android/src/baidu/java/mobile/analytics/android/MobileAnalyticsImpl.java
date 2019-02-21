package mobile.analytics.android;

import android.content.Context;

import com.baidu.mobstat.StatService;

final class MobileAnalyticsImpl extends MobileAnalytics {

    public MobileAnalyticsImpl(Context context) {
        super(context);
    }

    @Override
    public void startWork(String appKey, String appChannel, boolean enableDebug) {
        StatService.setAppKey(appKey);
        StatService.setAppChannel(context, appChannel, true);
        StatService.setDebugOn(enableDebug);
        StatService.start(context);
    }

    @Override
    public void signUp(String userId, String userNick) {
        // 百度移动统计不支持此功能
    }

    @Override
    public void signIn(String userId, String userNick) {
        // 百度移动统计不支持此功能
    }

    @Override
    public void signOut() {
        // 百度移动统计不支持此功能
    }

    @Override
    public void trackEvent(String eventId, String eventLabel) {
        StatService.onEvent(context, eventId, eventLabel);
    }

    @Override
    public void startEventTracking(String eventId, String eventLabel) {
        StatService.onEventStart(context, eventId, eventLabel);
    }

    @Override
    public void stopEventTracking(String eventId, String eventLabel) {
        StatService.onEventEnd(context, eventId, eventLabel);
    }

    @Override
    public void startPageTracking(String pageName) {
        StatService.onPageStart(context, pageName);
    }

    @Override
    public void stopPageTracking(String pageName) {
        StatService.onPageEnd(context, pageName);
    }
}
