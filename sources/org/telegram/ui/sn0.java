package org.telegram.ui;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
public final class sn0 implements OnBackInvokedCallback {
    public final int f49785a;
    public final Object f49786b;

    public sn0(Object obj, int i7) {
        this.f49785a = i7;
        this.f49786b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f49785a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f49786b;
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
                ((rb1) this.f49786b).run();
                return;
        }
    }
}
