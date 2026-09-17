package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f43236a;
    public final int f43237b;
    public final Object f43238c;

    public yy(Object obj, int i10, int i11) {
        this.f43236a = i11;
        this.f43238c = obj;
        this.f43237b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f43236a) {
            case 0:
                dz dzVar = ((zy) this.f43238c).f43574b;
                if (i10 == 0) {
                    dzVar.f35891e.remove(this.f43237b - dzVar.f35893n);
                    dzVar.Z();
                    cz czVar = dzVar.f35892f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f43238c, this.f43237b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f43238c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                gc1 gc1Var = themeActivity.f34175a;
                if (gc1Var != null) {
                    gc1Var.m(this.f43237b);
                    return;
                }
                return;
        }
    }
}
