package za;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
public final class o0 implements Application.ActivityLifecycleCallbacks {
    public static final o0 f51466a = new Object();
    public static boolean f51467b;
    public static fg.f f51468c;

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
        fg.f fVar = f51468c;
        if (fVar != null) {
            fVar.Q(2);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        gd.i iVar;
        kotlin.jvm.internal.i.e(activity, "activity");
        fg.f fVar = f51468c;
        if (fVar != null) {
            fVar.Q(1);
            iVar = gd.i.f10588a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            f51467b = true;
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
