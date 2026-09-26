package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class uy implements DialogInterface.OnClickListener {
    public final int f38571a;
    public final int f38572b;
    public final Object f38573c;

    public uy(Object obj, int i10, int i11) {
        this.f38571a = i11;
        this.f38573c = obj;
        this.f38572b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38571a) {
            case 0:
                zy zyVar = ((vy) this.f38573c).f38847b;
                if (i10 == 0) {
                    zyVar.e.remove(this.f38572b - zyVar.f40597n);
                    zyVar.Z();
                    yy yyVar = zyVar.f40596f;
                    if (yyVar != null) {
                        yyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f38573c, this.f38572b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38573c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                yb1 yb1Var = themeActivity.f31834a;
                if (yb1Var != null) {
                    yb1Var.m(this.f38572b);
                    return;
                }
                return;
        }
    }
}
