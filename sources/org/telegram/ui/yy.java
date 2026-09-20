package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f40036a;
    public final int f40037b;
    public final Object f40038c;

    public yy(Object obj, int i10, int i11) {
        this.f40036a = i11;
        this.f40038c = obj;
        this.f40037b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f40036a) {
            case 0:
                dz dzVar = ((zy) this.f40038c).f40630b;
                if (i10 == 0) {
                    dzVar.e.remove(this.f40037b - dzVar.f33178n);
                    dzVar.Z();
                    cz czVar = dzVar.f33177f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f40038c, this.f40037b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f40038c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                hc1 hc1Var = themeActivity.f31833a;
                if (hc1Var != null) {
                    hc1Var.m(this.f40037b);
                    return;
                }
                return;
        }
    }
}
