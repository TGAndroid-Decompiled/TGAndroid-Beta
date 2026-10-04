package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f43647a;
    public final int f43648b;
    public final Object f43649c;

    public yy(Object obj, int i10, int i11) {
        this.f43647a = i11;
        this.f43649c = obj;
        this.f43648b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f43647a) {
            case 0:
                dz dzVar = ((zy) this.f43649c).f43916b;
                if (i10 == 0) {
                    dzVar.f35864e.remove(this.f43648b - dzVar.f35866n);
                    dzVar.Y();
                    cz czVar = dzVar.f35865f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.f43649c, this.f43648b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f43649c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                bc1 bc1Var = themeActivity.f34519a;
                if (bc1Var != null) {
                    bc1Var.m(this.f43648b);
                    return;
                }
                return;
        }
    }
}
