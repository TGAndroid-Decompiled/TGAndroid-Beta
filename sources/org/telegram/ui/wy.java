package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class wy implements DialogInterface.OnClickListener {
    public final int f43921a;
    public final int f43922b;
    public final Object f43923c;

    public wy(Object obj, int i10, int i11) {
        this.f43921a = i11;
        this.f43923c = obj;
        this.f43922b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f43921a) {
            case 0:
                bz bzVar = ((xy) this.f43923c).f44235b;
                if (i10 == 0) {
                    bzVar.f36506e.remove(this.f43922b - bzVar.f36508n);
                    bzVar.Z();
                    az azVar = bzVar.f36507f;
                    if (azVar != null) {
                        azVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f43923c, this.f43922b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f43923c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                gc1 gc1Var = themeActivity.f34591a;
                if (gc1Var != null) {
                    gc1Var.m(this.f43922b);
                    return;
                }
                return;
        }
    }
}
