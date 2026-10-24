package org.telegram.ui;

import android.view.View;
public final class uj0 implements Runnable {
    public final int f42442a;
    public final NotificationsCustomSettingsActivity f42443b;
    public final hk0 f42444c;
    public final View d;

    public uj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, hk0 hk0Var, View view, int i10, int i11) {
        this.f42442a = i11;
        this.f42443b = notificationsCustomSettingsActivity;
        this.f42444c = hk0Var;
        this.d = view;
    }

    @Override
    public final void run() {
        switch (this.f42442a) {
            case 0:
                this.f42443b.k0(this.f42444c, this.d, false);
                return;
            case 1:
                this.f42443b.e0(this.f42444c, this.d);
                return;
            case 2:
                NotificationsCustomSettingsActivity.X(this.f42443b, this.f42444c, this.d);
                return;
            case 3:
                NotificationsCustomSettingsActivity.V(this.f42443b, this.f42444c, this.d);
                return;
            case 4:
                this.f42443b.e0(this.f42444c, this.d);
                return;
            default:
                this.f42443b.k0(this.f42444c, this.d, true);
                return;
        }
    }

    public uj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, hk0 hk0Var, View view, boolean z10, int i10) {
        this.f42442a = i10;
        this.f42443b = notificationsCustomSettingsActivity;
        this.f42444c = hk0Var;
        this.d = view;
    }
}
