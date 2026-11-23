package org.telegram.ui;

import android.view.View;
public final class rh0 implements org.telegram.ui.Components.rj0, org.telegram.ui.ActionBar.q1 {
    public final NotificationsSettingsActivity f51725a;

    public rh0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f51725a = notificationsSettingsActivity;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        NotificationsSettingsActivity.d0(this.f51725a, view, i7, f10);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        NotificationsSettingsActivity.e0(this.f51725a);
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
