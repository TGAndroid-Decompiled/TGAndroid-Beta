package org.telegram.ui;

import android.app.Activity;
public final class uv implements org.telegram.messenger.r20 {
    public final int f42352a;
    public final Activity f42353b;

    public uv(Activity activity, int i10) {
        this.f42352a = i10;
        this.f42353b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42352a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!w7.c6.a()) {
                        w7.c6.f();
                        return;
                    }
                    this.f42353b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!w7.c6.a()) {
                        w7.c6.f();
                        return;
                    }
                    this.f42353b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
