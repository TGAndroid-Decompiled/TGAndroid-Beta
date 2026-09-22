package org.telegram.ui;

import android.view.View;
public final class uk0 implements org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.a2 {
    public final NotificationsSettingsActivity f38152a;

    public uk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f38152a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f38152a, view, i10, f7);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f38152a);
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
