package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class zw implements DialogInterface.OnClickListener {
    public final int f52688a;
    public final int f52689b;
    public final Object f52690c;

    public zw(Object obj, int i7, int i10) {
        this.f52688a = i10;
        this.f52690c = obj;
        this.f52689b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f52688a) {
            case 0:
                ex exVar = (ex) ((j2.n) this.f52690c).f16454c;
                if (i7 == 0) {
                    exVar.f45426e.remove(this.f52689b - exVar.f45428n);
                    exVar.e0();
                    dx dxVar = exVar.f45427f;
                    if (dxVar != null) {
                        dxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f52690c, this.f52689b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f52690c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                f61 f61Var = themeActivity.f42008a;
                if (f61Var != null) {
                    f61Var.g(this.f52689b);
                    return;
                }
                return;
        }
    }
}
