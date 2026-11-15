package org.telegram.ui;

import android.app.Activity;
public final class su implements org.telegram.messenger.z10 {
    public final int f51276a;
    public final Activity f51277b;

    public su(Activity activity, int i7) {
        this.f51276a = i7;
        this.f51277b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f51276a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.ka.a()) {
                        c8.ka.f();
                        return;
                    }
                    this.f51277b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!c8.ka.a()) {
                        c8.ka.f();
                        return;
                    }
                    this.f51277b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
