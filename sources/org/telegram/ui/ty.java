package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class ty implements DialogInterface.OnClickListener {
    public final int f41735a;
    public final int f41736b;
    public final Object f41737c;

    public ty(Object obj, int i10, int i11) {
        this.f41735a = i11;
        this.f41737c = obj;
        this.f41736b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f41735a) {
            case 0:
                yy yyVar = ((uy) this.f41737c).f42064b;
                if (i10 == 0) {
                    yyVar.f43733e.remove(this.f41736b - yyVar.f43735n);
                    yyVar.Z();
                    xy xyVar = yyVar.f43734f;
                    if (xyVar != null) {
                        xyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f41737c, this.f41736b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f41737c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                mb1 mb1Var = themeActivity.f34870a;
                if (mb1Var != null) {
                    mb1Var.m(this.f41736b);
                    return;
                }
                return;
        }
    }
}
