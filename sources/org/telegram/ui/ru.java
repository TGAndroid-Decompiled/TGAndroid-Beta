package org.telegram.ui;

import android.app.Activity;
public final class ru implements org.telegram.messenger.c20 {
    public final int f49555a;
    public final Activity f49556b;

    public ru(Activity activity, int i7) {
        this.f49555a = i7;
        this.f49556b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f49555a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.ia.a()) {
                        c8.ia.f();
                        return;
                    }
                    this.f49556b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!c8.ia.a()) {
                        c8.ia.f();
                        return;
                    }
                    this.f49556b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
