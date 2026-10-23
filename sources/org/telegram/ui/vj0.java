package org.telegram.ui;

import android.view.View;
public final class vj0 implements Runnable {
    public final int f42780a;
    public final NotificationsCustomSettingsActivity f42781b;
    public final ik0 f42782c;
    public final View d;

    public vj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ik0 ik0Var, View view, int i10, int i11) {
        this.f42780a = i11;
        this.f42781b = notificationsCustomSettingsActivity;
        this.f42782c = ik0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f42780a) {
            case 0:
                this.f42781b.k0(this.f42782c, this.d, false);
                return;
            case 1:
                this.f42781b.e0(this.f42782c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f42781b, this.f42782c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f42781b, this.f42782c, this.d);
                return;
            case 4:
                this.f42781b.e0(this.f42782c, this.d);
                return;
            default:
                this.f42781b.k0(this.f42782c, this.d, true);
                return;
        }
    }

    public vj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ik0 ik0Var, View view, boolean z10, int i10) {
        this.f42780a = i10;
        this.f42781b = notificationsCustomSettingsActivity;
        this.f42782c = ik0Var;
        this.d = view;
    }
}
