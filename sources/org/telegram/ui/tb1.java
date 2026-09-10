package org.telegram.ui;

import android.content.Intent;
public final class tb1 implements org.telegram.ui.Components.gl0, org.telegram.ui.ActionBar.c2 {
    public final int f36897a;
    public final ThemeActivity f36898b;

    public tb1(ThemeActivity themeActivity, int i10) {
        this.f36897a = i10;
        this.f36898b = themeActivity;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f36897a) {
            case 1:
                ThemeActivity themeActivity = this.f36898b;
                themeActivity.getClass();
                org.telegram.ui.Components.d5.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f36898b;
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
        i10 = this.f36898b.sensitiveContentRow;
        return i10;
    }
}
