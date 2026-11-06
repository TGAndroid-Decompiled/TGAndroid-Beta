package org.telegram.ui;

import android.app.Activity;
public final class ru implements org.telegram.messenger.c20 {
    public final int f49572a;
    public final Activity f49573b;

    public ru(Activity activity, int i7) {
        this.f49572a = i7;
        this.f49573b = activity;
    }

    @Override
    public final void a(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f49572a) {
            case 0:
                if (bool.booleanValue()) {
                    if (!c8.ia.a()) {
                        c8.ia.f();
                        return;
                    }
                    this.f49573b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    if (!c8.ia.a()) {
                        c8.ia.f();
                        return;
                    }
                    this.f49573b.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
                    return;
                }
                return;
        }
    }
}
