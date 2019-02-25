package mobile.analytics.android;

import android.content.Context;

public abstract class MobileAnalytics {

    protected final Context context;

    public MobileAnalytics(Context context) {
        this.context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
    }

    public abstract void startWork(String appKey, String appChannel, boolean enableDebug);

    public abstract void signUp(String userId, String userNick);

    public abstract void signIn(String userId, String userNick);

    public abstract void signOut();

    public abstract void trackEvent(String eventId, String eventLabel);

    public abstract void startEventTracking(String eventId, String eventLabel);

    public abstract void stopEventTracking(String eventId, String eventLabel);

    public abstract void startPageTracking(String pageName);

    public abstract void stopPageTracking(String pageName);

    // ---

    private static volatile MobileAnalytics sInstance;

    public static synchronized MobileAnalytics with(Context context) {
        if (sInstance == null) {
            sInstance = new MobileAnalyticsImpl(context);
        }
        return sInstance;
    }
}
