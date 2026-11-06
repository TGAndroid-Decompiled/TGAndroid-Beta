package org.telegram.ui;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
public final class sn0 implements OnBackInvokedCallback {
    public final int f49794a;
    public final Object f49795b;

    public sn0(Object obj, int i7) {
        this.f49794a = i7;
        this.f49795b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f49794a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f49795b;
                Activity activity = photoViewer.D;
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
                ((qb1) this.f49795b).run();
                return;
        }
    }
}
