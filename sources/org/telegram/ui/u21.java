package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class u21 implements org.telegram.ui.ActionBar.r1 {
    public final int f50282a;
    public final SessionsActivity f50283b;

    public u21(SessionsActivity sessionsActivity, int i7) {
        this.f50282a = i7;
        this.f50283b = sessionsActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50282a) {
            case 0:
                SessionsActivity sessionsActivity = this.f50283b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                SessionsActivity.b0(this.f50283b);
                return;
        }
    }
}
