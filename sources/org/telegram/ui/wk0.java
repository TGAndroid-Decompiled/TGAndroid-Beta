package org.telegram.ui;

import android.view.View;
public final class wk0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1 {
    public final NotificationsSettingsActivity f41320a;

    public wk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f41320a = notificationsSettingsActivity;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f41320a, view, i10, f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f41320a);
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
