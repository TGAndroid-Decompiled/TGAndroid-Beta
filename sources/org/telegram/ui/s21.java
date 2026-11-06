package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class s21 implements org.telegram.ui.ActionBar.r1 {
    public final int f49627a;
    public final SessionsActivity f49628b;

    public s21(SessionsActivity sessionsActivity, int i7) {
        this.f49627a = i7;
        this.f49628b = sessionsActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f49627a) {
            case 0:
                SessionsActivity sessionsActivity = this.f49628b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25555b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                SessionsActivity.b0(this.f49628b);
                return;
        }
    }
}
