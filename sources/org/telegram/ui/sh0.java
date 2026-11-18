package org.telegram.ui;

import android.view.View;
public final class sh0 implements org.telegram.ui.Components.pj0, org.telegram.ui.ActionBar.r1 {
    public final NotificationsSettingsActivity f51997a;

    public sh0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f51997a = notificationsSettingsActivity;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        NotificationsSettingsActivity.d0(this.f51997a, view, i7, f10);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        NotificationsSettingsActivity.e0(this.f51997a);
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
