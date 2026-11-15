package org.telegram.ui;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
public final class tn0 implements OnBackInvokedCallback {
    public final int f51615a;
    public final Object f51616b;

    public tn0(Object obj, int i7) {
        this.f51615a = i7;
        this.f51616b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f51615a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f51616b;
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
                ((qb1) this.f51616b).run();
                return;
        }
    }
}
