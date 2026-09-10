package org.telegram.ui;

import android.view.View;
public final class tk0 implements org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.c2 {
    public final NotificationsSettingsActivity f36960a;

    public tk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f36960a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f36960a, view, i10, f7);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f36960a);
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
