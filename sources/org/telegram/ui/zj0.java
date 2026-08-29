package org.telegram.ui;

import android.view.View;
public final class zj0 implements org.telegram.ui.Components.al0, org.telegram.ui.ActionBar.b2 {
    public final NotificationsSettingsActivity f45253a;

    public zj0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f45253a = notificationsSettingsActivity;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f45253a, view, i10, f9);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f45253a);
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
