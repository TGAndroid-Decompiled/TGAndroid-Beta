package org.telegram.ui;

import android.app.Activity;
public final class ru implements org.telegram.messenger.w10 {
    public final int f51894a;
    public final Activity f51895b;

    public ru(Activity activity, int i7) {
        this.f51894a = i7;
        this.f51895b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f51894a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.oa.a()) {
                        c8.oa.f();
                        return;
                    }
                    this.f51895b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!c8.oa.a()) {
                        c8.oa.f();
                        return;
                    }
                    this.f51895b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
