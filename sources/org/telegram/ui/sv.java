package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class sv implements Utilities.Callback {
    public final int f43422a;
    public final Activity f43423b;

    public sv(Activity activity, int i10) {
        this.f43422a = i10;
        this.f43423b = activity;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f43422a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.ye0.a()) {
                        org.telegram.ui.Components.ye0.f();
                        return;
                    }
                    this.f43423b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.ye0.a()) {
                        org.telegram.ui.Components.ye0.f();
                        return;
                    }
                    this.f43423b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
