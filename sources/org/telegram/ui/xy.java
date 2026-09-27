package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class xy implements DialogInterface.OnClickListener {
    public final int f40063a;
    public final int f40064b;
    public final Object f40065c;

    public xy(Object obj, int i10, int i11) {
        this.f40063a = i11;
        this.f40065c = obj;
        this.f40064b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f40063a) {
            case 0:
                cz czVar = ((yy) this.f40065c).f40353b;
                if (i10 == 0) {
                    czVar.e.remove(this.f40064b - czVar.f32817n);
                    czVar.Z();
                    bz bzVar = czVar.f32816f;
                    if (bzVar != null) {
                        bzVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f40065c, this.f40064b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f40065c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                yb1 yb1Var = themeActivity.f31837a;
                if (yb1Var != null) {
                    yb1Var.m(this.f40064b);
                    return;
                }
                return;
        }
    }
}
