package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f43648a;
    public final int f43649b;
    public final Object f43650c;

    public yy(Object obj, int i10, int i11) {
        this.f43648a = i11;
        this.f43650c = obj;
        this.f43649b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f43648a) {
            case 0:
                dz dzVar = ((zy) this.f43650c).f43931b;
                if (i10 == 0) {
                    dzVar.f35909e.remove(this.f43649b - dzVar.f35911n);
                    dzVar.Y();
                    cz czVar = dzVar.f35910f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.f43650c, this.f43649b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f43650c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                zb1 zb1Var = themeActivity.f34539a;
                if (zb1Var != null) {
                    zb1Var.m(this.f43649b);
                    return;
                }
                return;
        }
    }
}
