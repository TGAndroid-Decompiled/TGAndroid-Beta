package org.telegram.ui;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
public final class wn0 implements OnBackInvokedCallback {
    public final int f53710a;
    public final Object f53711b;

    public wn0(Object obj, int i7) {
        this.f53710a = i7;
        this.f53711b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f53710a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f53711b;
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).onBackPressed();
                    return;
                } else if (photoViewer.Q1()) {
                    photoViewer.z0(true, false);
                    return;
                } else {
                    return;
                }
            default:
                ((rb1) this.f53711b).run();
                return;
        }
    }
}
