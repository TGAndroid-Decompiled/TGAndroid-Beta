package org.telegram.ui;

import android.view.View;
public final class uk0 implements org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.a2 {
    public final NotificationsSettingsActivity f38133a;

    public uk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f38133a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f38133a, view, i10, f7);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f38133a);
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
