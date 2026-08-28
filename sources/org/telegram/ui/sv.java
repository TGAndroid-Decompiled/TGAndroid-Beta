package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class sv implements Utilities.Callback {
    public final int f42769a;
    public final Activity f42770b;

    public sv(Activity activity, int i9) {
        this.f42769a = i9;
        this.f42770b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42769a) {
            case 0:
                dy.z0(this.f42770b, (Boolean) obj);
                return;
            default:
                dy.q0(this.f42770b, (Boolean) obj);
                return;
        }
    }
}
