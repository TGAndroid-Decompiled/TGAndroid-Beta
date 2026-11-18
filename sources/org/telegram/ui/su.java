package org.telegram.ui;

import android.app.Activity;
public final class su implements org.telegram.messenger.x10 {
    public final int f52085a;
    public final Activity f52086b;

    public su(Activity activity, int i7) {
        this.f52085a = i7;
        this.f52086b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f52085a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.na.a()) {
                        c8.na.f();
                        return;
                    }
                    this.f52086b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!c8.na.a()) {
                        c8.na.f();
                        return;
                    }
                    this.f52086b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
