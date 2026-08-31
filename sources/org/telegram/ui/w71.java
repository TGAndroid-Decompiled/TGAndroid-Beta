package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class w71 implements org.telegram.ui.ActionBar.c2 {
    public final int f42400a;
    public final SessionsActivity f42401b;

    public w71(SessionsActivity sessionsActivity, int i10) {
        this.f42400a = i10;
        this.f42401b = sessionsActivity;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f42400a) {
            case 0:
                SessionsActivity sessionsActivity = this.f42401b;
                sessionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                SessionsActivity.W(this.f42401b);
                return;
        }
    }
}
