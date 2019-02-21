package mobile.analytics.android;

import android.content.Context;

import com.tendcloud.tenddata.TCAgent;
import com.tendcloud.tenddata.TDAccount;

final class MobileAnalyticsImpl extends MobileAnalytics {

    public MobileAnalyticsImpl(Context context) {
        super(context);
    }

    @Override
    public void startWork(String appKey, String appChannel, boolean enableDebug) {
        TCAgent.init(context, appKey, appChannel);
        TCAgent.setReportUncaughtExceptions(true);
        TCAgent.LOG_ON = enableDebug;
    }

    @Override
    public void signUp(String userId, String userNick) {
        TCAgent.onRegister(userId, TDAccount.AccountType.REGISTERED, userNick);
    }

    @Override
    public void signIn(String userId, String userNick) {
        TCAgent.onLogin(userId, TDAccount.AccountType.REGISTERED, userNick);
    }

    @Override
    public void signOut() {
        // Talkingdata不支持此功能
    }

    @Override
    public void trackEvent(String eventId, String eventLabel) {
        TCAgent.onEvent(context, eventId, eventLabel);
    }

    @Override
    public void startEventTracking(String eventId, String eventLabel) {
        // Talkingdata不支持此功能
    }

    @Override
    public void stopEventTracking(String eventId, String eventLabel) {
        // Talkingdata不支持此功能
    }

    @Override
    public void startPageTracking(String pageName) {
        TCAgent.onPageStart(context, pageName);
    }

    @Override
    public void stopPageTracking(String pageName) {
        TCAgent.onPageEnd(context, pageName);
    }
}
