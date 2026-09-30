package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class uy implements DialogInterface.OnClickListener {
    public final int f38572a;
    public final int f38573b;
    public final Object f38574c;

    public uy(Object obj, int i10, int i11) {
        this.f38572a = i11;
        this.f38574c = obj;
        this.f38573b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38572a) {
            case 0:
                zy zyVar = ((vy) this.f38574c).f38848b;
                if (i10 == 0) {
                    zyVar.e.remove(this.f38573b - zyVar.f40600n);
                    zyVar.Z();
                    yy yyVar = zyVar.f40599f;
                    if (yyVar != null) {
                        yyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f38574c, this.f38573b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38574c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                yb1 yb1Var = themeActivity.f31837a;
                if (yb1Var != null) {
                    yb1Var.m(this.f38573b);
                    return;
                }
                return;
        }
    }
}
