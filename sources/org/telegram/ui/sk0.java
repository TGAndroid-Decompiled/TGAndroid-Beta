package org.telegram.ui;

import android.view.View;
public final class sk0 implements org.telegram.ui.Components.fm0, org.telegram.ui.ActionBar.a2 {
    public final NotificationsSettingsActivity f41728a;

    public sk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f41728a = notificationsSettingsActivity;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f41728a, view, i10, f7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f41728a);
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
