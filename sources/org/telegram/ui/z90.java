package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class z90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f40428a;
    public final Object f40429b;

    public z90(Object obj, int i10) {
        this.f40428a = i10;
        this.f40429b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f40428a;
        Object obj = this.f40429b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31586y1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                kf.k0.t(AndroidUtilities.displaySize.y, kf.k0.m(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            kf.k0.t(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                jd1 jd1Var = (jd1) obj;
                jd1Var.M = SystemClock.elapsedRealtime() + 1500;
                jd1Var.f35203h0.invalidate();
                return;
        }
    }
}
