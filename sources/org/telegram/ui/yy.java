package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f40058a;
    public final int f40059b;
    public final Object f40060c;

    public yy(Object obj, int i10, int i11) {
        this.f40058a = i11;
        this.f40060c = obj;
        this.f40059b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f40058a) {
            case 0:
                dz dzVar = ((zy) this.f40060c).f40651b;
                if (i10 == 0) {
                    dzVar.e.remove(this.f40059b - dzVar.f33198n);
                    dzVar.Z();
                    cz czVar = dzVar.f33197f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f40060c, this.f40059b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f40060c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                hc1 hc1Var = themeActivity.f31854a;
                if (hc1Var != null) {
                    hc1Var.m(this.f40059b);
                    return;
                }
                return;
        }
    }
}
