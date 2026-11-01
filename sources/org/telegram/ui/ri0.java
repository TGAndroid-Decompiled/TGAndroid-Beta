package org.telegram.ui;

import android.view.View;
public final class ri0 implements org.telegram.ui.Components.ik0, org.telegram.ui.ActionBar.u1 {
    public final NotificationsSettingsActivity f41095a;

    public ri0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f41095a = notificationsSettingsActivity;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.d0(this.f41095a, view, i10, f7);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        NotificationsSettingsActivity.e0(this.f41095a);
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
