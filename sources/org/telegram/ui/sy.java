package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class sy implements DialogInterface.OnClickListener {
    public final int f38454a;
    public final int f38455b;
    public final Object f38456c;

    public sy(Object obj, int i10, int i11) {
        this.f38454a = i11;
        this.f38456c = obj;
        this.f38455b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38454a) {
            case 0:
                xy xyVar = ((ty) this.f38456c).f38777b;
                if (i10 == 0) {
                    xyVar.e.remove(this.f38455b - xyVar.f40330n);
                    xyVar.Z();
                    wy wyVar = xyVar.f40329f;
                    if (wyVar != null) {
                        wyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f38456c, this.f38455b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38456c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                lb1 lb1Var = themeActivity.f32331a;
                if (lb1Var != null) {
                    lb1Var.m(this.f38455b);
                    return;
                }
                return;
        }
    }
}
