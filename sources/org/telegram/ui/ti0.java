package org.telegram.ui;

import android.view.View;
public final class ti0 implements org.telegram.ui.Components.hk0, org.telegram.ui.ActionBar.u1 {
    public final NotificationsSettingsActivity f41848a;

    public ti0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f41848a = notificationsSettingsActivity;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.c0(this.f41848a, view, i10, f7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        NotificationsSettingsActivity.d0(this.f41848a);
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
