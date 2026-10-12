package org.telegram.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public final class zy implements DialogInterface.OnClickListener {
    public final int f44936a;
    public final int f44937b;
    public final Object f44938c;

    public zy(Object obj, int i10, int i11) {
        this.f44936a = i11;
        this.f44938c = obj;
        this.f44937b = i10;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f44936a) {
            case 0:
                ez ezVar = ((az) this.f44938c).f35999b;
                if (i10 == 0) {
                    ezVar.f37573e.remove(this.f44937b - ezVar.f37575n);
                    ezVar.Z();
                    dz dzVar = ezVar.f37574f;
                    if (dzVar != null) {
                        dzVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f44938c, this.f44937b, i10);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) this.f44938c;
                themeActivity.getClass();
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                edit.putInt("sortContactsBy", i10);
                edit.commit();
                jc1 jc1Var = themeActivity.f34368a;
                if (jc1Var != null) {
                    jc1Var.m(this.f44937b);
                    return;
                }
                return;
        }
    }
}
