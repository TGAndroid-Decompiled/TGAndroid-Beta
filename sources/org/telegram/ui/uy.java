package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class uy implements DialogInterface.OnClickListener {
    public final int f38556a;
    public final int f38557b;
    public final Object f38558c;

    public uy(Object obj, int i10, int i11) {
        this.f38556a = i11;
        this.f38558c = obj;
        this.f38557b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38556a) {
            case 0:
                zy zyVar = ((vy) this.f38558c).f38833b;
                if (i10 == 0) {
                    zyVar.e.remove(this.f38557b - zyVar.f40584n);
                    zyVar.Z();
                    yy yyVar = zyVar.f40583f;
                    if (yyVar != null) {
                        yyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f38558c, this.f38557b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38558c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                yb1 yb1Var = themeActivity.f31821a;
                if (yb1Var != null) {
                    yb1Var.m(this.f38557b);
                    return;
                }
                return;
        }
    }
}
