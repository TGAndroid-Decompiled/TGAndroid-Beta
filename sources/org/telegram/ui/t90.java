package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
public final class t90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int f41939a;
    public final Object f41940b;

    public t90(Object obj, int i10) {
        this.f41939a = i10;
        this.f41940b = obj;
    }

    @Override
    public final void onGlobalLayout() {
        int i10 = this.f41939a;
        Object obj = this.f41940b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                org.telegram.messenger.v0.n(AndroidUtilities.displaySize.y, i2.o1.n(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.v0.n(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                pc1 pc1Var = (pc1) obj;
                pc1Var.Q = SystemClock.elapsedRealtime() + 1500;
                pc1Var.f40478l0.invalidate();
                return;
        }
    }
}
