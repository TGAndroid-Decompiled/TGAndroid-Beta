package org.telegram.ui;

import android.app.Activity;
public final class vv implements org.telegram.messenger.q20 {
    public final int f42823a;
    public final Activity f42824b;

    public vv(Activity activity, int i10) {
        this.f42823a = i10;
        this.f42824b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f42823a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!w7.c6.a()) {
                        w7.c6.f();
                        return;
                    }
                    this.f42824b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!w7.c6.a()) {
                        w7.c6.f();
                        return;
                    }
                    this.f42824b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
