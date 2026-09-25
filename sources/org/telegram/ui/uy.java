package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class uy implements DialogInterface.OnClickListener {
    public final int f38573a;
    public final int f38574b;
    public final Object f38575c;

    public uy(Object obj, int i10, int i11) {
        this.f38573a = i11;
        this.f38575c = obj;
        this.f38574b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38573a) {
            case 0:
                zy zyVar = ((vy) this.f38575c).f38849b;
                if (i10 == 0) {
                    zyVar.e.remove(this.f38574b - zyVar.f40599n);
                    zyVar.Z();
                    yy yyVar = zyVar.f40598f;
                    if (yyVar != null) {
                        yyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f38575c, this.f38574b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38575c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                yb1 yb1Var = themeActivity.f31836a;
                if (yb1Var != null) {
                    yb1Var.m(this.f38574b);
                    return;
                }
                return;
        }
    }
}
