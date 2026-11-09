package org.telegram.ui;

import android.app.Activity;
public final class tu implements org.telegram.messenger.c20 {
    public final int f50241a;
    public final Activity f50242b;

    public tu(Activity activity, int i7) {
        this.f50241a = i7;
        this.f50242b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f50241a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.ia.a()) {
                        c8.ia.f();
                        return;
                    }
                    this.f50242b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!c8.ia.a()) {
                        c8.ia.f();
                        return;
                    }
                    this.f50242b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
