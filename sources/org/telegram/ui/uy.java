package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class uy implements DialogInterface.OnClickListener {
    public final int f38928a;
    public final int f38929b;
    public final Object f38930c;

    public uy(Object obj, int i10, int i11) {
        this.f38928a = i11;
        this.f38930c = obj;
        this.f38929b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38928a) {
            case 0:
                zy zyVar = ((vy) this.f38930c).f39220b;
                if (i10 == 0) {
                    zyVar.e.remove(this.f38929b - zyVar.f40896n);
                    zyVar.Z();
                    yy yyVar = zyVar.f40895f;
                    if (yyVar != null) {
                        yyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f38930c, this.f38929b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38930c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                tb1 tb1Var = themeActivity.f32305a;
                if (tb1Var != null) {
                    tb1Var.m(this.f38929b);
                    return;
                }
                return;
        }
    }
}
