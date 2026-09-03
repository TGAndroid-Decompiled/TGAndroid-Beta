package org.telegram.ui;

import android.view.View;
public final class yj0 implements Runnable {
    public final int f40291a;
    public final NotificationsCustomSettingsActivity f40292b;
    public final lk0 f40293c;
    public final View d;

    public yj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lk0 lk0Var, View view, int i10, int i11) {
        this.f40291a = i11;
        this.f40292b = notificationsCustomSettingsActivity;
        this.f40293c = lk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f40291a) {
            case 0:
                this.f40292b.k0(this.f40293c, this.d, false);
                return;
            case 1:
                this.f40292b.e0(this.f40293c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f40292b, this.f40293c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f40292b, this.f40293c, this.d);
                return;
            case 4:
                this.f40292b.e0(this.f40293c, this.d);
                return;
            default:
                this.f40292b.k0(this.f40293c, this.d, true);
                return;
        }
    }

    public yj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lk0 lk0Var, View view, boolean z4, int i10) {
        this.f40291a = i10;
        this.f40292b = notificationsCustomSettingsActivity;
        this.f40293c = lk0Var;
        this.d = view;
    }
}
