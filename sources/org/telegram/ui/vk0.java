package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class vk0 {
    public final LaunchActivity f42276a;
    public final ArrayList f42277b = new ArrayList();
    public int f42278c = Integer.MIN_VALUE;

    public vk0(LaunchActivity launchActivity) {
        this.f42276a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f42277b.isEmpty();
        LaunchActivity launchActivity = this.f42276a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f42278c == Integer.MIN_VALUE) {
                    this.f42278c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i10 = this.f42278c;
            if (i10 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i10);
                this.f42278c = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
