package org.telegram.ui;

import android.app.Activity;
public final class su implements org.telegram.messenger.y10 {
    public final int f52137a;
    public final Activity f52138b;

    public su(Activity activity, int i7) {
        this.f52137a = i7;
        this.f52138b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f52137a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.na.a()) {
                        c8.na.f();
                        return;
                    }
                    this.f52138b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!c8.na.a()) {
                        c8.na.f();
                        return;
                    }
                    this.f52138b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
