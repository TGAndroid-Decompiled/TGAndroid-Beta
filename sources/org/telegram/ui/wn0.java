package org.telegram.ui;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
public final class wn0 implements OnBackInvokedCallback {
    public final int f53464a;
    public final Object f53465b;

    public wn0(Object obj, int i7) {
        this.f53464a = i7;
        this.f53465b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f53464a) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) this.f53465b;
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
                ((tb1) this.f53465b).run();
                return;
        }
    }
}
