package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f43235a;
    public final int f43236b;
    public final Object f43237c;

    public yy(Object obj, int i10, int i11) {
        this.f43235a = i11;
        this.f43237c = obj;
        this.f43236b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f43235a) {
            case 0:
                dz dzVar = ((zy) this.f43237c).f43573b;
                if (i10 == 0) {
                    dzVar.f35890e.remove(this.f43236b - dzVar.f35892n);
                    dzVar.Z();
                    cz czVar = dzVar.f35891f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f43237c, this.f43236b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f43237c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                gc1 gc1Var = themeActivity.f34174a;
                if (gc1Var != null) {
                    gc1Var.m(this.f43236b);
                    return;
                }
                return;
        }
    }
}
