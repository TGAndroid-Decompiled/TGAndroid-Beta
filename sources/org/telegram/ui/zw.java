package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class zw implements DialogInterface.OnClickListener {
    public final int f52690a;
    public final int f52691b;
    public final Object f52692c;

    public zw(Object obj, int i7, int i10) {
        this.f52690a = i10;
        this.f52692c = obj;
        this.f52691b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f52690a) {
            case 0:
                ex exVar = (ex) ((j2.n) this.f52692c).f16457c;
                if (i7 == 0) {
                    exVar.f45384e.remove(this.f52691b - exVar.f45386n);
                    exVar.e0();
                    dx dxVar = exVar.f45385f;
                    if (dxVar != null) {
                        dxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f52692c, this.f52691b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f52692c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                f61 f61Var = themeActivity.f42011a;
                if (f61Var != null) {
                    f61Var.g(this.f52691b);
                    return;
                }
                return;
        }
    }
}
