package org.telegram.ui;

import android.view.View;
public final class rk0 implements org.telegram.ui.Components.hm0, org.telegram.ui.ActionBar.z1 {
    public final NotificationsSettingsActivity f41473a;

    public rk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f41473a = notificationsSettingsActivity;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f41473a, view, i10, f7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f41473a);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
