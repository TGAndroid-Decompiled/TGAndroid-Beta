package org.telegram.ui;

import android.view.View;
public final class xk0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1 {
    public final NotificationsSettingsActivity f41892a;

    public xk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f41892a = notificationsSettingsActivity;
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f41892a, view, i10, f7);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f41892a);
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
