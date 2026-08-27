package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;

public final class vv implements Utilities.Callback {

    public final int f43525a;

    public final Activity f43526b;

    public vv(Activity activity, int i10) {
        this.f43525a = i10;
        this.f43526b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43525a) {
            case 0:
                gy.A0(this.f43526b, (Boolean) obj);
                break;
            default:
                gy.r0(this.f43526b, (Boolean) obj);
                break;
        }
    }
}
