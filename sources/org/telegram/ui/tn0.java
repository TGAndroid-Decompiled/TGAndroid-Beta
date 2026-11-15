package org.telegram.ui;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
public final class tn0 implements OnBackInvokedCallback {
    public final int f51616a;
    public final Object f51617b;

    public tn0(Object obj, int i7) {
        this.f51616a = i7;
        this.f51617b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f51616a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f51617b;
                Activity activity = photoViewer.E;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).onBackPressed();
                    return;
                } else if (photoViewer.P1()) {
                    photoViewer.z0(true, false);
                    return;
                } else {
                    return;
                }
            default:
                ((qb1) this.f51617b).run();
                return;
        }
    }
}
