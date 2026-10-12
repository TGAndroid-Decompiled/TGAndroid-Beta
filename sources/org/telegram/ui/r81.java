package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class r81 implements org.telegram.ui.ActionBar.z1 {
    public final int f41535a;
    public final SessionsActivity f41536b;

    public r81(SessionsActivity sessionsActivity, int i10) {
        this.f41535a = i10;
        this.f41536b = sessionsActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41535a) {
            case 0:
                SessionsActivity sessionsActivity = this.f41536b;
                sessionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                SessionsActivity.W(this.f41536b);
                return;
        }
    }
}
