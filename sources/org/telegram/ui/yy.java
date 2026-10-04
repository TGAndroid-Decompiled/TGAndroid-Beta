package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class yy implements DialogInterface.OnClickListener {
    public final int f43655a;
    public final int f43656b;
    public final Object f43657c;

    public yy(Object obj, int i10, int i11) {
        this.f43655a = i11;
        this.f43657c = obj;
        this.f43656b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f43655a) {
            case 0:
                dz dzVar = ((zy) this.f43657c).f43924b;
                if (i10 == 0) {
                    dzVar.f35870e.remove(this.f43656b - dzVar.f35872n);
                    dzVar.Y();
                    cz czVar = dzVar.f35871f;
                    if (czVar != null) {
                        czVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.W((NotificationsSettingsActivity) this.f43657c, this.f43656b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f43657c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                bc1 bc1Var = themeActivity.f34526a;
                if (bc1Var != null) {
                    bc1Var.m(this.f43656b);
                    return;
                }
                return;
        }
    }
}
