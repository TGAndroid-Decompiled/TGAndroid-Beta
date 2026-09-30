package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class uy implements DialogInterface.OnClickListener {
    public final int f38661a;
    public final int f38662b;
    public final Object f38663c;

    public uy(Object obj, int i10, int i11) {
        this.f38661a = i11;
        this.f38663c = obj;
        this.f38662b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38661a) {
            case 0:
                zy zyVar = ((vy) this.f38663c).f38936b;
                if (i10 == 0) {
                    zyVar.e.remove(this.f38662b - zyVar.f40697n);
                    zyVar.Z();
                    yy yyVar = zyVar.f40696f;
                    if (yyVar != null) {
                        yyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f38663c, this.f38662b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38663c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                yb1 yb1Var = themeActivity.f31909a;
                if (yb1Var != null) {
                    yb1Var.m(this.f38662b);
                    return;
                }
                return;
        }
    }
}
