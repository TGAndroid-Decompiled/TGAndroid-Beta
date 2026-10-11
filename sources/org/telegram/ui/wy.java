package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class wy implements DialogInterface.OnClickListener {
    public final int f43887a;
    public final int f43888b;
    public final Object f43889c;

    public wy(Object obj, int i10, int i11) {
        this.f43887a = i11;
        this.f43889c = obj;
        this.f43888b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f43887a) {
            case 0:
                bz bzVar = ((xy) this.f43889c).f44201b;
                if (i10 == 0) {
                    bzVar.f36472e.remove(this.f43888b - bzVar.f36474n);
                    bzVar.Z();
                    az azVar = bzVar.f36473f;
                    if (azVar != null) {
                        azVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f43889c, this.f43888b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f43889c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                gc1 gc1Var = themeActivity.f34557a;
                if (gc1Var != null) {
                    gc1Var.m(this.f43888b);
                    return;
                }
                return;
        }
    }
}
