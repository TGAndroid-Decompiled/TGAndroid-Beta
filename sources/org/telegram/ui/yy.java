package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f39980a;
    public final int f39981b;
    public final Object f39982c;

    public yy(Object obj, int i10, int i11) {
        this.f39980a = i11;
        this.f39982c = obj;
        this.f39981b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f39980a) {
            case 0:
                dz dzVar = ((zy) this.f39982c).f40329b;
                if (i10 == 0) {
                    dzVar.e.remove(this.f39981b - dzVar.f33129n);
                    dzVar.Z();
                    cz czVar = dzVar.f33128f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f39982c, this.f39981b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f39982c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                gc1 gc1Var = themeActivity.f31546a;
                if (gc1Var != null) {
                    gc1Var.m(this.f39981b);
                    return;
                }
                return;
        }
    }
}
