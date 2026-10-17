package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class xk0 {
    public final LaunchActivity f43158a;
    public final ArrayList f43159b = new ArrayList();
    public int f43160c = Integer.MIN_VALUE;

    public xk0(LaunchActivity launchActivity) {
        this.f43158a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f43159b.isEmpty();
        LaunchActivity launchActivity = this.f43158a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f43160c == Integer.MIN_VALUE) {
                    this.f43160c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i10 = this.f43160c;
            if (i10 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i10);
                this.f43160c = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
