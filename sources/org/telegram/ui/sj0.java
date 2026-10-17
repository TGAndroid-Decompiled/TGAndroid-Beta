package org.telegram.ui;

import android.view.View;
public final class sj0 implements Runnable {
    public final int f41120a;
    public final NotificationsCustomSettingsActivity f41121b;
    public final gk0 f41122c;
    public final View d;

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, gk0 gk0Var, View view, int i10, int i11) {
        this.f41120a = i11;
        this.f41121b = notificationsCustomSettingsActivity;
        this.f41122c = gk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f41120a) {
            case 0:
                this.f41121b.k0(this.f41122c, this.d, false);
                return;
            case 1:
                this.f41121b.e0(this.f41122c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f41121b, this.f41122c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f41121b, this.f41122c, this.d);
                return;
            case 4:
                this.f41121b.e0(this.f41122c, this.d);
                return;
            default:
                this.f41121b.k0(this.f41122c, this.d, true);
                return;
        }
    }

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, gk0 gk0Var, View view, boolean z10, int i10) {
        this.f41120a = i10;
        this.f41121b = notificationsCustomSettingsActivity;
        this.f41122c = gk0Var;
        this.d = view;
    }
}
