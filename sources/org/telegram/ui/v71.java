package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class v71 implements org.telegram.ui.ActionBar.c2 {
    public final int f39094a;
    public final SessionsActivity f39095b;

    public v71(SessionsActivity sessionsActivity, int i10) {
        this.f39094a = i10;
        this.f39095b = sessionsActivity;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39094a) {
            case 0:
                SessionsActivity sessionsActivity = this.f39095b;
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
                SessionsActivity.W(this.f39095b);
                return;
        }
    }
}
