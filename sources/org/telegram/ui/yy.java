package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f43262a;
    public final int f43263b;
    public final Object f43264c;

    public yy(Object obj, int i10, int i11) {
        this.f43262a = i11;
        this.f43264c = obj;
        this.f43263b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f43262a) {
            case 0:
                dz dzVar = ((zy) this.f43264c).f43600b;
                if (i10 == 0) {
                    dzVar.f35917e.remove(this.f43263b - dzVar.f35919n);
                    dzVar.Z();
                    cz czVar = dzVar.f35918f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f43264c, this.f43263b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f43264c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                gc1 gc1Var = themeActivity.f34201a;
                if (gc1Var != null) {
                    gc1Var.m(this.f43263b);
                    return;
                }
                return;
        }
    }
}
