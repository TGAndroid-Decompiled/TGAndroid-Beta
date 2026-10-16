package org.telegram.ui;

import android.content.Intent;
public final class vb1 implements org.telegram.ui.Components.xl0, org.telegram.ui.ActionBar.z1 {
    public final int f40669a;
    public final ThemeActivity f40670b;

    public vb1(ThemeActivity themeActivity, int i10) {
        this.f40669a = i10;
        this.f40670b = themeActivity;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40669a) {
            case 1:
                ThemeActivity themeActivity = this.f40670b;
                themeActivity.getClass();
                org.telegram.ui.Components.g5.V(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f40670b;
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
        i10 = this.f40670b.sensitiveContentRow;
        return i10;
    }
}
