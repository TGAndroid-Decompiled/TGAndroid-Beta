package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.Utilities;
public final class sv implements Utilities.Callback {
    public final int f41811a;
    public final Activity f41812b;

    public sv(Activity activity, int i10) {
        this.f41811a = i10;
        this.f41812b = activity;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f41811a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.ze0.a()) {
                        org.telegram.ui.Components.ze0.f();
                        return;
                    }
                    this.f41812b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!org.telegram.ui.Components.ze0.a()) {
                        org.telegram.ui.Components.ze0.f();
                        return;
                    }
                    this.f41812b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
