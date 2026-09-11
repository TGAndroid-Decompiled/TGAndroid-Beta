package org.telegram.ui;

import android.view.View;
public final class uk0 implements org.telegram.ui.Components.al0, org.telegram.ui.ActionBar.a2 {
    public final NotificationsSettingsActivity f41179a;

    public uk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f41179a = notificationsSettingsActivity;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f41179a, view, i10, f7);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f41179a);
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
