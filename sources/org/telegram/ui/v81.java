package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class v81 implements org.telegram.ui.ActionBar.z1 {
    public final int f40922a;
    public final SessionsActivity f40923b;

    public v81(SessionsActivity sessionsActivity, int i10) {
        this.f40922a = i10;
        this.f40923b = sessionsActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40922a) {
            case 0:
                SessionsActivity sessionsActivity = this.f40923b;
                sessionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                SessionsActivity.W(this.f40923b);
                return;
        }
    }
}
