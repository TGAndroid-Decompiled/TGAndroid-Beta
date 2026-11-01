package xa;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import vh.d0;
import w7.y8;
public final class h implements Application.ActivityLifecycleCallbacks {
    public final Set f53562a = Collections.newSetFromMap(new WeakHashMap());

    public static void a(Intent intent) {
        boolean equals;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null) {
            equals = false;
        } else {
            equals = "1".equals(bundle.getString("google.c.a.e"));
        }
        if (equals) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    if (l9.h.c().b(m9.a.class) == null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                        }
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    } else {
                        throw new ClassCastException();
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            y8.a("_no", bundle);
        }
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null && this.f53562a.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new d0(this, intent));
            } else {
                a(intent);
            }
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f53562a.remove(activity.getIntent());
        }
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override
    public final void onActivityResumed(Activity activity) {
    }

    @Override
    public final void onActivityStarted(Activity activity) {
    }

    @Override
    public final void onActivityStopped(Activity activity) {
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
