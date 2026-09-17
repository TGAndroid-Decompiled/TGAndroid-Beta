package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f43263a;
    public final int f43264b;
    public final Object f43265c;

    public yy(Object obj, int i10, int i11) {
        this.f43263a = i11;
        this.f43265c = obj;
        this.f43264b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f43263a) {
            case 0:
                dz dzVar = ((zy) this.f43265c).f43601b;
                if (i10 == 0) {
                    dzVar.f35918e.remove(this.f43264b - dzVar.f35920n);
                    dzVar.Z();
                    cz czVar = dzVar.f35919f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f43265c, this.f43264b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f43265c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                gc1 gc1Var = themeActivity.f34202a;
                if (gc1Var != null) {
                    gc1Var.m(this.f43264b);
                    return;
                }
                return;
        }
    }
}
