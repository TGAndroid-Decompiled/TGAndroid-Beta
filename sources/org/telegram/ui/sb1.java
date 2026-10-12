package org.telegram.ui;

import android.content.Intent;
public final class sb1 implements org.telegram.ui.Components.hm0, org.telegram.ui.ActionBar.z1 {
    public final int f41887a;
    public final ThemeActivity f41888b;

    public sb1(ThemeActivity themeActivity, int i10) {
        this.f41887a = i10;
        this.f41888b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41887a) {
            case 1:
                ThemeActivity themeActivity = this.f41888b;
                themeActivity.getClass();
                org.telegram.ui.Components.g5.V(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f41888b;
                if (themeActivity2.getParentActivity() != null) {
                    try {
                        themeActivity2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public int run() {
        int i10;
        i10 = this.f41888b.sensitiveContentRow;
        return i10;
    }
}
