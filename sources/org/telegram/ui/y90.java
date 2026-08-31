package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class y90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f43585a;
    public final Object f43586b;

    public y90(Object obj, int i10) {
        this.f43585a = i10;
        this.f43586b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f43585a;
        Object obj = this.f43586b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f34134y1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                l.d.t(AndroidUtilities.displaySize.y, l.d.m(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            l.d.t(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ed1 ed1Var = (ed1) obj;
                ed1Var.M = SystemClock.elapsedRealtime() + 1500;
                ed1Var.f36511h0.invalidate();
                return;
        }
    }
}
