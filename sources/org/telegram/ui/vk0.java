package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public final class vk0 {
    public final LaunchActivity f42279a;
    public final ArrayList f42280b = new ArrayList();
    public int f42281c = Integer.MIN_VALUE;

    public vk0(LaunchActivity launchActivity) {
        this.f42279a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f42280b.isEmpty();
        LaunchActivity launchActivity = this.f42279a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f42281c == Integer.MIN_VALUE) {
                    this.f42281c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i10 = this.f42281c;
            if (i10 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i10);
                this.f42281c = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
