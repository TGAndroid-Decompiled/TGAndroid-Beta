package org.telegram.ui;

import android.view.View;
public final class yj0 implements Runnable {
    public final int f43643a;
    public final NotificationsCustomSettingsActivity f43644b;
    public final lk0 f43645c;
    public final View d;

    public yj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lk0 lk0Var, View view, int i10, int i11) {
        this.f43643a = i11;
        this.f43644b = notificationsCustomSettingsActivity;
        this.f43645c = lk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f43643a) {
            case 0:
                this.f43644b.k0(this.f43645c, this.d, false);
                return;
            case 1:
                this.f43644b.e0(this.f43645c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f43644b, this.f43645c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f43644b, this.f43645c, this.d);
                return;
            case 4:
                this.f43644b.e0(this.f43645c, this.d);
                return;
            default:
                this.f43644b.k0(this.f43645c, this.d, true);
                return;
        }
    }

    public yj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lk0 lk0Var, View view, boolean z4, int i10) {
        this.f43643a = i10;
        this.f43644b = notificationsCustomSettingsActivity;
        this.f43645c = lk0Var;
        this.d = view;
    }
}
