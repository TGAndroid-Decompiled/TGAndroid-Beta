package org.telegram.ui;

import android.view.View;
public final class tk0 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.b2 {
    public final NotificationsSettingsActivity f37827a;

    public tk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f37827a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.f37827a, view, i10, f7);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        NotificationsSettingsActivity.Z(this.f37827a);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
