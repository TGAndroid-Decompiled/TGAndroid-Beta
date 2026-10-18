package org.telegram.ui;

import android.view.View;
public final class sj0 implements Runnable {
    public final int f41106a;
    public final NotificationsCustomSettingsActivity f41107b;
    public final gk0 f41108c;
    public final View d;

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, gk0 gk0Var, View view, int i10, int i11) {
        this.f41106a = i11;
        this.f41107b = notificationsCustomSettingsActivity;
        this.f41108c = gk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f41106a) {
            case 0:
                this.f41107b.k0(this.f41108c, this.d, false);
                return;
            case 1:
                this.f41107b.e0(this.f41108c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f41107b, this.f41108c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f41107b, this.f41108c, this.d);
                return;
            case 4:
                this.f41107b.e0(this.f41108c, this.d);
                return;
            default:
                this.f41107b.k0(this.f41108c, this.d, true);
                return;
        }
    }

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, gk0 gk0Var, View view, boolean z10, int i10) {
        this.f41106a = i10;
        this.f41107b = notificationsCustomSettingsActivity;
        this.f41108c = gk0Var;
        this.d = view;
    }
}
