package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class ty implements DialogInterface.OnClickListener {
    public final int f41660a;
    public final int f41661b;
    public final Object f41662c;

    public ty(Object obj, int i10, int i11) {
        this.f41660a = i11;
        this.f41662c = obj;
        this.f41661b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f41660a) {
            case 0:
                yy yyVar = ((uy) this.f41662c).f41955b;
                if (i10 == 0) {
                    yyVar.f43732e.remove(this.f41661b - yyVar.f43734n);
                    yyVar.Z();
                    xy xyVar = yyVar.f43733f;
                    if (xyVar != null) {
                        xyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f41662c, this.f41661b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f41662c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                sb1 sb1Var = themeActivity.f34870a;
                if (sb1Var != null) {
                    sb1Var.m(this.f41661b);
                    return;
                }
                return;
        }
    }
}
