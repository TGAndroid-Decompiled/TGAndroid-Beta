package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class x90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f39881a;
    public final Object f39882b;

    public x90(Object obj, int i10) {
        this.f39881a = i10;
        this.f39882b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f39881a;
        Object obj = this.f39882b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31612y1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                kh.a2.t(AndroidUtilities.displaySize.y, kh.a2.m(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            kh.a2.t(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                cd1 cd1Var = (cd1) obj;
                cd1Var.M = SystemClock.elapsedRealtime() + 1500;
                cd1Var.f33311h0.invalidate();
                return;
        }
    }
}
