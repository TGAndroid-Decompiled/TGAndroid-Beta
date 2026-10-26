package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class s90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f43418a;
    public final Object f43419b;

    public s90(Object obj, int i10) {
        this.f43418a = i10;
        this.f43419b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f43418a;
        Object obj = this.f43419b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.t.o(AndroidUtilities.displaySize.y, ic.a.k(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.t.o(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                tc1 tc1Var = (tc1) obj;
                tc1Var.Q = SystemClock.elapsedRealtime() + 1500;
                tc1Var.f43772l0.invalidate();
                return;
        }
    }
}
