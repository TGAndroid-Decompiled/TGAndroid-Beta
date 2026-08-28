package org.telegram.ui;

import android.view.View;
public final class rj0 implements Runnable {
    public final int f42439a;
    public final NotificationsCustomSettingsActivity f42440b;
    public final ek0 f42441c;
    public final View d;

    public rj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view, int i9, int i10) {
        this.f42439a = i10;
        this.f42440b = notificationsCustomSettingsActivity;
        this.f42441c = ek0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f42439a) {
            case 0:
                this.f42440b.j0(this.f42441c, this.d, false);
                return;
            case 1:
                this.f42440b.d0(this.f42441c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.W(this.f42440b, this.f42441c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.U(this.f42440b, this.f42441c, this.d);
                return;
            case 4:
                this.f42440b.d0(this.f42441c, this.d);
                return;
            default:
                this.f42440b.j0(this.f42441c, this.d, true);
                return;
        }
    }

    public rj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ek0 ek0Var, View view, boolean z10, int i9) {
        this.f42439a = i9;
        this.f42440b = notificationsCustomSettingsActivity;
        this.f42441c = ek0Var;
        this.d = view;
    }
}
