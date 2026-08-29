package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class tv implements Utilities.Callback {
    public final int f43100a;
    public final Activity f43101b;

    public tv(Activity activity, int i10) {
        this.f43100a = i10;
        this.f43101b = activity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43100a) {
            case 0:
                fy.A0(this.f43101b, (Boolean) obj);
                return;
            default:
                fy.r0(this.f43101b, (Boolean) obj);
                return;
        }
    }
}
