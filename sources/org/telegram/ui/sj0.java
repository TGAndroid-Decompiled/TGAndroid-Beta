package org.telegram.ui;

import android.view.View;
public final class sj0 implements Runnable {
    public final int f41141a;
    public final NotificationsCustomSettingsActivity f41142b;
    public final gk0 f41143c;
    public final View d;

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, gk0 gk0Var, View view, int i10, int i11) {
        this.f41141a = i11;
        this.f41142b = notificationsCustomSettingsActivity;
        this.f41143c = gk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f41141a) {
            case 0:
                this.f41142b.k0(this.f41143c, this.d, false);
                return;
            case 1:
                this.f41142b.e0(this.f41143c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f41142b, this.f41143c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f41142b, this.f41143c, this.d);
                return;
            case 4:
                this.f41142b.e0(this.f41143c, this.d);
                return;
            default:
                this.f41142b.k0(this.f41143c, this.d, true);
                return;
        }
    }

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, gk0 gk0Var, View view, boolean z10, int i10) {
        this.f41141a = i10;
        this.f41142b = notificationsCustomSettingsActivity;
        this.f41143c = gk0Var;
        this.d = view;
    }
}
