package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class xw implements DialogInterface.OnClickListener {
    public final int f52112a;
    public final int f52113b;
    public final Object f52114c;

    public xw(Object obj, int i3, int i10) {
        this.f52112a = i10;
        this.f52114c = obj;
        this.f52113b = i3;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i3) {
        switch (this.f52112a) {
            case 0:
                cx cxVar = (cx) ((mi.h0) this.f52114c).f19645c;
                if (i3 == 0) {
                    cxVar.f44458e.remove(this.f52113b - cxVar.f44460n);
                    cxVar.e0();
                    bx bxVar = cxVar.f44459f;
                    if (bxVar != null) {
                        bxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f52114c, this.f52113b, i3);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f52114c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                edit.putInt("sortContactsBy", i3);
                edit.commit();
                v51 v51Var = themeActivity.f42041a;
                if (v51Var != null) {
                    v51Var.g(this.f52113b);
                    return;
                }
                return;
        }
    }
}
