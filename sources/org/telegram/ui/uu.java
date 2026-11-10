package org.telegram.ui;

import android.app.Activity;
public final class uu implements org.telegram.messenger.c20 {
    public final int f50568a;
    public final Activity f50569b;

    public uu(Activity activity, int i7) {
        this.f50568a = i7;
        this.f50569b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f50568a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.ia.a()) {
                        c8.ia.f();
                        return;
                    }
                    this.f50569b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!c8.ia.a()) {
                        c8.ia.f();
                        return;
                    }
                    this.f50569b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
