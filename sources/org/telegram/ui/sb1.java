package org.telegram.ui;

import android.content.Intent;
public final class sb1 implements org.telegram.ui.Components.hm0, org.telegram.ui.ActionBar.z1 {
    public final int f41891a;
    public final ThemeActivity f41892b;

    public sb1(ThemeActivity themeActivity, int i10) {
        this.f41891a = i10;
        this.f41892b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41891a) {
            case 1:
                ThemeActivity themeActivity = this.f41892b;
                themeActivity.getClass();
                org.telegram.ui.Components.g5.V(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f41892b;
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
        i10 = this.f41892b.sensitiveContentRow;
        return i10;
    }
}
