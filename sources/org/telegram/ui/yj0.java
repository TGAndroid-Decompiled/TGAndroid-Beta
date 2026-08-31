package org.telegram.ui;

import android.view.View;
public final class yj0 implements Runnable {
    public final int f43649a;
    public final NotificationsCustomSettingsActivity f43650b;
    public final lk0 f43651c;
    public final View d;

    public yj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lk0 lk0Var, View view, int i10, int i11) {
        this.f43649a = i11;
        this.f43650b = notificationsCustomSettingsActivity;
        this.f43651c = lk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f43649a) {
            case 0:
                this.f43650b.k0(this.f43651c, this.d, false);
                return;
            case 1:
                this.f43650b.e0(this.f43651c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f43650b, this.f43651c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f43650b, this.f43651c, this.d);
                return;
            case 4:
                this.f43650b.e0(this.f43651c, this.d);
                return;
            default:
                this.f43650b.k0(this.f43651c, this.d, true);
                return;
        }
    }

    public yj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lk0 lk0Var, View view, boolean z4, int i10) {
        this.f43649a = i10;
        this.f43650b = notificationsCustomSettingsActivity;
        this.f43651c = lk0Var;
        this.d = view;
    }
}
