package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class xy implements DialogInterface.OnClickListener {
    public final int f44160a;
    public final int f44161b;
    public final Object f44162c;

    public xy(Object obj, int i10, int i11) {
        this.f44160a = i11;
        this.f44162c = obj;
        this.f44161b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f44160a) {
            case 0:
                cz czVar = ((yy) this.f44162c).f44426b;
                if (i10 == 0) {
                    czVar.f36754e.remove(this.f44161b - czVar.f36756n);
                    czVar.Z();
                    bz bzVar = czVar.f36755f;
                    if (bzVar != null) {
                        bzVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f44162c, this.f44161b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f44162c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                hc1 hc1Var = themeActivity.f34529a;
                if (hc1Var != null) {
                    hc1Var.m(this.f44161b);
                    return;
                }
                return;
        }
    }
}
