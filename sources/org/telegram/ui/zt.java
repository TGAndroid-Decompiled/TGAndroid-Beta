package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class zt implements Runnable {
    public final int f52748a;
    public final Context f52749b;

    public zt(Context context, int i3) {
        this.f52748a = i3;
        this.f52749b = context;
    }

    @Override
    public final void run() {
        int i3 = this.f52748a;
        Context context = this.f52749b;
        switch (i3) {
            case 0:
                org.telegram.ui.ActionBar.k6.K(context, false);
                return;
            case 1:
                Activity W = org.telegram.messenger.g0.W(context);
                if (W == null) {
                    W = LaunchActivity.K1;
                }
                if (W != null && !W.isFinishing()) {
                    W.moveTaskToBack(true);
                    return;
                }
                return;
            case 2:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 3:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 4:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 5:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 6:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            case 7:
                sf.c.t(context, "https://promote.telegram.org/guidelines");
                return;
            default:
                sf.c.t(context, org.telegram.messenger.bd.M0(2131742953, null));
                return;
        }
    }
}
