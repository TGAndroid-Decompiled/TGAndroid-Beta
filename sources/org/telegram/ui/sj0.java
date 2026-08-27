package org.telegram.ui;

import android.view.View;

public final class sj0 implements Runnable {

    public final int f42656a;

    public final NotificationsCustomSettingsActivity f42657b;

    public final fk0 f42658c;
    public final View d;

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, fk0 fk0Var, View view, int i10, int i11) {
        this.f42656a = i11;
        this.f42657b = notificationsCustomSettingsActivity;
        this.f42658c = fk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f42656a) {
            case 0:
                this.f42657b.k0(this.f42658c, this.d, false);
                break;
            case 1:
                this.f42657b.e0(this.f42658c, this.d);
                break;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f42657b, this.f42658c, this.d);
                break;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f42657b, this.f42658c, this.d);
                break;
            case 4:
                this.f42657b.e0(this.f42658c, this.d);
                break;
            default:
                this.f42657b.k0(this.f42658c, this.d, true);
                break;
        }
    }

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, fk0 fk0Var, View view, boolean z10, int i10) {
        this.f42656a = i10;
        this.f42657b = notificationsCustomSettingsActivity;
        this.f42658c = fk0Var;
        this.d = view;
    }
}
