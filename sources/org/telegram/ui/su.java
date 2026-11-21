package org.telegram.ui;

import android.app.Activity;
public final class su implements org.telegram.messenger.x10 {
    public final int f52133a;
    public final Activity f52134b;

    public su(Activity activity, int i7) {
        this.f52133a = i7;
        this.f52134b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f52133a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.na.a()) {
                        c8.na.f();
                        return;
                    }
                    this.f52134b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!c8.na.a()) {
                        c8.na.f();
                        return;
                    }
                    this.f52134b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
