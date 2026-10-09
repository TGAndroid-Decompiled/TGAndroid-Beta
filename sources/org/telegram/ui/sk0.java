package org.telegram.ui;

import android.view.View;
public final class sk0 implements org.telegram.ui.Components.fm0, org.telegram.ui.ActionBar.a2 {
    public final NotificationsSettingsActivity f41726a;

    public sk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f41726a = notificationsSettingsActivity;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f41726a, view, i10, f7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f41726a);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
