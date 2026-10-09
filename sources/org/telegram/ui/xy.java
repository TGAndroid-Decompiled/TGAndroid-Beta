package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class xy implements DialogInterface.OnClickListener {
    public final int f44162a;
    public final int f44163b;
    public final Object f44164c;

    public xy(Object obj, int i10, int i11) {
        this.f44162a = i11;
        this.f44164c = obj;
        this.f44163b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f44162a) {
            case 0:
                cz czVar = ((yy) this.f44164c).f44428b;
                if (i10 == 0) {
                    czVar.f36756e.remove(this.f44163b - czVar.f36758n);
                    czVar.Z();
                    bz bzVar = czVar.f36757f;
                    if (bzVar != null) {
                        bzVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f44164c, this.f44163b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f44164c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                hc1 hc1Var = themeActivity.f34529a;
                if (hc1Var != null) {
                    hc1Var.m(this.f44163b);
                    return;
                }
                return;
        }
    }
}
