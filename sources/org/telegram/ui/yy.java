package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f39920a;
    public final int f39921b;
    public final Object f39922c;

    public yy(Object obj, int i10, int i11) {
        this.f39920a = i11;
        this.f39922c = obj;
        this.f39921b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f39920a) {
            case 0:
                dz dzVar = ((zy) this.f39922c).f40589b;
                if (i10 == 0) {
                    dzVar.e.remove(this.f39921b - dzVar.f33127n);
                    dzVar.Z();
                    cz czVar = dzVar.f33126f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f39922c, this.f39921b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f39922c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                fc1 fc1Var = themeActivity.f31793a;
                if (fc1Var != null) {
                    fc1Var.m(this.f39921b);
                    return;
                }
                return;
        }
    }
}
