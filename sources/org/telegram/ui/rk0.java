package org.telegram.ui;

import android.view.View;
public final class rk0 implements org.telegram.ui.Components.al0, ki.e, org.telegram.ui.ActionBar.a2 {
    public final NotificationsSettingsActivity f37145a;

    public rk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.f37145a = notificationsSettingsActivity;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.W(this.f37145a, view, i10, f7);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public int e() {
        NotificationsSettingsActivity notificationsSettingsActivity = this.f37145a;
        notificationsSettingsActivity.getClass();
        return notificationsSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f18780a7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Y(this.f37145a);
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
