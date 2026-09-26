package za;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class q0 implements Application.ActivityLifecycleCallbacks {
    public static final q0 f49097a = new Object();
    public static boolean f49098b;
    public static oi.f f49099c;

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
        oi.f fVar = f49099c;
        if (fVar != null) {
            fVar.N(2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        gd.i iVar;
        kotlin.jvm.internal.i.e(activity, "activity");
        oi.f fVar = f49099c;
        if (fVar != null) {
            fVar.N(1);
            iVar = gd.i.f9602a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            f49098b = true;
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
