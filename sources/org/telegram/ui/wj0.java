package org.telegram.ui;

import android.view.View;
public final class wj0 implements Runnable {
    public final int f39754a;
    public final NotificationsCustomSettingsActivity f39755b;
    public final jk0 f39756c;
    public final View d;

    public wj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, jk0 jk0Var, View view, int i10, int i11) {
        this.f39754a = i11;
        this.f39755b = notificationsCustomSettingsActivity;
        this.f39756c = jk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f39754a) {
            case 0:
                this.f39755b.k0(this.f39756c, this.d, false);
                return;
            case 1:
                this.f39755b.e0(this.f39756c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f39755b, this.f39756c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f39755b, this.f39756c, this.d);
                return;
            case 4:
                this.f39755b.e0(this.f39756c, this.d);
                return;
            default:
                this.f39755b.k0(this.f39756c, this.d, true);
                return;
        }
    }

    public wj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, jk0 jk0Var, View view, boolean z4, int i10) {
        this.f39754a = i10;
        this.f39755b = notificationsCustomSettingsActivity;
        this.f39756c = jk0Var;
        this.d = view;
    }
}
