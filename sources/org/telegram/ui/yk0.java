package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class yk0 {
    public final LaunchActivity f43890a;
    public final ArrayList f43891b = new ArrayList();
    public int f43892c = Integer.MIN_VALUE;

    public yk0(LaunchActivity launchActivity) {
        this.f43890a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f43891b.isEmpty();
        LaunchActivity launchActivity = this.f43890a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f43892c == Integer.MIN_VALUE) {
                    this.f43892c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i10 = this.f43892c;
            if (i10 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i10);
                this.f43892c = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
