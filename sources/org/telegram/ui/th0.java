package org.telegram.ui;

import android.view.View;
public final class th0 implements org.telegram.ui.Components.rj0, org.telegram.ui.ActionBar.q1 {
    public final NotificationsSettingsActivity f52336a;

    public th0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f52336a = notificationsSettingsActivity;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        NotificationsSettingsActivity.d0(this.f52336a, view, i7, f10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        NotificationsSettingsActivity.e0(this.f52336a);
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
