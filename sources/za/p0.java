package za;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class p0 implements Application.ActivityLifecycleCallbacks {
    public static final p0 f54397a = new Object();
    public static boolean f54398b;
    public static pi.f f54399c;

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        pi.f fVar = f54399c;
        if (fVar != null) {
            fVar.N(2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        hd.i iVar;
        kotlin.jvm.internal.i.e(activity, "activity");
        pi.f fVar = f54399c;
        if (fVar != null) {
            fVar.N(1);
            iVar = hd.i.f11091a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            f54398b = true;
        }
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.i.e(activity, "activity");
        kotlin.jvm.internal.i.e(outState, "outState");
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
    }
}
