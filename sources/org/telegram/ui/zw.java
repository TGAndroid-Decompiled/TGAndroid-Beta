package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class zw implements DialogInterface.OnClickListener {
    public final int f52662a;
    public final int f52663b;
    public final Object f52664c;

    public zw(Object obj, int i7, int i10) {
        this.f52662a = i10;
        this.f52664c = obj;
        this.f52663b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f52662a) {
            case 0:
                ex exVar = (ex) ((j2.n) this.f52664c).f16454c;
                if (i7 == 0) {
                    exVar.f45421e.remove(this.f52663b - exVar.f45423n);
                    exVar.e0();
                    dx dxVar = exVar.f45422f;
                    if (dxVar != null) {
                        dxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f52664c, this.f52663b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f52664c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                f61 f61Var = themeActivity.f41983a;
                if (f61Var != null) {
                    f61Var.g(this.f52663b);
                    return;
                }
                return;
        }
    }
}
