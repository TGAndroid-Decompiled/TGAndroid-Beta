package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class vy implements DialogInterface.OnClickListener {
    public final int f38490a;
    public final int f38491b;
    public final Object f38492c;

    public vy(Object obj, int i10, int i11) {
        this.f38490a = i11;
        this.f38492c = obj;
        this.f38491b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f38490a) {
            case 0:
                az azVar = ((wy) this.f38492c).f39126b;
                if (i10 == 0) {
                    azVar.e.remove(this.f38491b - azVar.f31905n);
                    azVar.Z();
                    zy zyVar = azVar.f31904f;
                    if (zyVar != null) {
                        zyVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f38492c, this.f38491b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f38492c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                yb1 yb1Var = themeActivity.f31520a;
                if (yb1Var != null) {
                    yb1Var.m(this.f38491b);
                    return;
                }
                return;
        }
    }
}
