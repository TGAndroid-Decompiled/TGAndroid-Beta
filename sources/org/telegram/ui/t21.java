package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class t21 implements org.telegram.ui.ActionBar.r1 {
    public final int f52134a;
    public final SessionsActivity f52135b;

    public t21(SessionsActivity sessionsActivity, int i7) {
        this.f52134a = i7;
        this.f52135b = sessionsActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f52134a) {
            case 0:
                SessionsActivity sessionsActivity = this.f52135b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26915b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                SessionsActivity.b0(this.f52135b);
                return;
        }
    }
}
