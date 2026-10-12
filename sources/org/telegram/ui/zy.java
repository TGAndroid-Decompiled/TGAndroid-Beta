package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class zy implements DialogInterface.OnClickListener {
    public final int f44931a;
    public final int f44932b;
    public final Object f44933c;

    public zy(Object obj, int i10, int i11) {
        this.f44931a = i11;
        this.f44933c = obj;
        this.f44932b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f44931a) {
            case 0:
                ez ezVar = ((az) this.f44933c).f35997b;
                if (i10 == 0) {
                    ezVar.f37569e.remove(this.f44932b - ezVar.f37571n);
                    ezVar.Z();
                    dz dzVar = ezVar.f37570f;
                    if (dzVar != null) {
                        dzVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f44933c, this.f44932b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f44933c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                jc1 jc1Var = themeActivity.f34366a;
                if (jc1Var != null) {
                    jc1Var.m(this.f44932b);
                    return;
                }
                return;
        }
    }
}
