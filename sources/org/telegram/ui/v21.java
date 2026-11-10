package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class v21 implements org.telegram.ui.ActionBar.r1 {
    public final int f50628a;
    public final SessionsActivity f50629b;

    public v21(SessionsActivity sessionsActivity, int i7) {
        this.f50628a = i7;
        this.f50629b = sessionsActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50628a) {
            case 0:
                SessionsActivity sessionsActivity = this.f50629b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25570b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                SessionsActivity.b0(this.f50629b);
                return;
        }
    }
}
