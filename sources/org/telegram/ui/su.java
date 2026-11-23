package org.telegram.ui;

import android.app.Activity;
public final class su implements org.telegram.messenger.y10 {
    public final int f52083a;
    public final Activity f52084b;

    public su(Activity activity, int i7) {
        this.f52083a = i7;
        this.f52084b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f52083a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.oa.a()) {
                        c8.oa.f();
                        return;
                    }
                    this.f52084b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!c8.oa.a()) {
                        c8.oa.f();
                        return;
                    }
                    this.f52084b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
