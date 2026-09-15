package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f40008a;
    public final int f40009b;
    public final Object f40010c;

    public yy(Object obj, int i10, int i11) {
        this.f40008a = i11;
        this.f40010c = obj;
        this.f40009b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f40008a) {
            case 0:
                dz dzVar = ((zy) this.f40010c).f40333b;
                if (i10 == 0) {
                    dzVar.e.remove(this.f40009b - dzVar.f33167n);
                    dzVar.Z();
                    cz czVar = dzVar.f33166f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) this.f40010c, this.f40009b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f40010c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                fc1 fc1Var = themeActivity.f31549a;
                if (fc1Var != null) {
                    fc1Var.m(this.f40009b);
                    return;
                }
                return;
        }
    }
}
