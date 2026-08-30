package org.telegram.ui;

import android.content.Intent;
public final class ua1 implements org.telegram.ui.Components.fl0, org.telegram.ui.ActionBar.c2 {
    public final int f38895a;
    public final ThemeActivity f38896b;

    public ua1(ThemeActivity themeActivity, int i10) {
        this.f38895a = i10;
        this.f38896b = themeActivity;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38895a) {
            case 1:
                ThemeActivity themeActivity = this.f38896b;
                themeActivity.getClass();
                org.telegram.ui.Components.z4.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f38896b;
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
        i10 = this.f38896b.sensitiveContentRow;
        return i10;
    }
}
