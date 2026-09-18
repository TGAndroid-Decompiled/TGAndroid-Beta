package org.telegram.ui;

import android.view.View;
public final class tk0 implements org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.a2 {
    public final NotificationsSettingsActivity f37768a;

    public tk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f37768a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f37768a, view, i10, f7);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f37768a);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
