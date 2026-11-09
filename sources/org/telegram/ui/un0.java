package org.telegram.ui;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
public final class un0 implements OnBackInvokedCallback {
    public final int f50429a;
    public final Object f50430b;

    public un0(Object obj, int i7) {
        this.f50429a = i7;
        this.f50430b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f50429a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f50430b;
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
                ((tb1) this.f50430b).run();
                return;
        }
    }
}
