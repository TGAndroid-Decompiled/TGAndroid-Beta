package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class xy implements DialogInterface.OnClickListener {
    public final int f44206a;
    public final int f44207b;
    public final Object f44208c;

    public xy(Object obj, int i10, int i11) {
        this.f44206a = i11;
        this.f44208c = obj;
        this.f44207b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f44206a) {
            case 0:
                cz czVar = ((yy) this.f44208c).f44472b;
                if (i10 == 0) {
                    czVar.f36800e.remove(this.f44207b - czVar.f36802n);
                    czVar.Z();
                    bz bzVar = czVar.f36801f;
                    if (bzVar != null) {
                        bzVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f44208c, this.f44207b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f44208c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                hc1 hc1Var = themeActivity.f34567a;
                if (hc1Var != null) {
                    hc1Var.m(this.f44207b);
                    return;
                }
                return;
        }
    }
}
