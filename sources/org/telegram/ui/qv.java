package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class qv implements Utilities.Callback {
    public final int f40981a;
    public final Activity f40982b;

    public qv(Activity activity, int i10) {
        this.f40981a = i10;
        this.f40982b = activity;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f40981a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.xe0.a()) {
                        org.telegram.ui.Components.xe0.f();
                        return;
                    }
                    this.f40982b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.xe0.a()) {
                        org.telegram.ui.Components.xe0.f();
                        return;
                    }
                    this.f40982b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
