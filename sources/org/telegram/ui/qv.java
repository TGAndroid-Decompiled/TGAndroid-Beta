package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class qv implements Utilities.Callback {
    public final int f40979a;
    public final Activity f40980b;

    public qv(Activity activity, int i10) {
        this.f40979a = i10;
        this.f40980b = activity;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f40979a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.we0.a()) {
                        org.telegram.ui.Components.we0.f();
                        return;
                    }
                    this.f40980b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.we0.a()) {
                        org.telegram.ui.Components.we0.f();
                        return;
                    }
                    this.f40980b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
