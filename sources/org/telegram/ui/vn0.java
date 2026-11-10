package org.telegram.ui;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
public final class vn0 implements OnBackInvokedCallback {
    public final int f50763a;
    public final Object f50764b;

    public vn0(Object obj, int i7) {
        this.f50763a = i7;
        this.f50764b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f50763a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f50764b;
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
                ((vb1) this.f50764b).run();
                return;
        }
    }
}
