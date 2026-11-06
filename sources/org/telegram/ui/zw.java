package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
public final class zw implements DialogInterface.OnClickListener {
    public final int f52686a;
    public final int f52687b;
    public final Object f52688c;

    public zw(Object obj, int i7, int i10) {
        this.f52686a = i10;
        this.f52688c = obj;
        this.f52687b = i7;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.f52686a) {
            case 0:
                ex exVar = (ex) ((j2.n) this.f52688c).f16454c;
                if (i7 == 0) {
                    exVar.f45425e.remove(this.f52687b - exVar.f45427n);
                    exVar.e0();
                    dx dxVar = exVar.f45426f;
                    if (dxVar != null) {
                        dxVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.c0((NotificationsSettingsActivity) this.f52688c, this.f52687b, i7);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f52688c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                edit.putInt("sortContactsBy", i7);
                edit.commit();
                f61 f61Var = themeActivity.f42007a;
                if (f61Var != null) {
                    f61Var.g(this.f52687b);
                    return;
                }
                return;
        }
    }
}
