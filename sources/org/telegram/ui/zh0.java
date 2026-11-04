package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
public final class zh0 {
    public final LaunchActivity f52683a;
    public final ArrayList f52684b = new ArrayList();
    public int f52685c = Integer.MIN_VALUE;

    public zh0(LaunchActivity launchActivity) {
        this.f52683a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.f52684b.isEmpty();
        LaunchActivity launchActivity = this.f52683a;
        try {
            if (!isEmpty && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (Build.VERSION.SDK_INT < 24 || !launchActivity.isInMultiWindowMode())) {
                if (this.f52685c == Integer.MIN_VALUE) {
                    this.f52685c = launchActivity.getRequestedOrientation();
                }
                if (launchActivity.getRequestedOrientation() != 1) {
                    launchActivity.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            int i3 = this.f52685c;
            if (i3 != Integer.MIN_VALUE) {
                launchActivity.setRequestedOrientation(i3);
                this.f52685c = Integer.MIN_VALUE;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
