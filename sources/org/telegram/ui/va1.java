package org.telegram.ui;

import android.content.Intent;
public final class va1 implements org.telegram.ui.Components.gl0, org.telegram.ui.ActionBar.c2 {
    public final int f42192a;
    public final ThemeActivity f42193b;

    public va1(ThemeActivity themeActivity, int i10) {
        this.f42192a = i10;
        this.f42193b = themeActivity;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f42192a) {
            case 1:
                ThemeActivity themeActivity = this.f42193b;
                themeActivity.getClass();
                org.telegram.ui.Components.z4.W(themeActivity, 0, null, null);
                return;
            default:
                ThemeActivity themeActivity2 = this.f42193b;
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
        i10 = this.f42193b.sensitiveContentRow;
        return i10;
    }
}
