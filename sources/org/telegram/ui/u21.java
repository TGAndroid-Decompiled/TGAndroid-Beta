package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class u21 implements org.telegram.ui.ActionBar.q1 {
    public final int f52427a;
    public final SessionsActivity f52428b;

    public u21(SessionsActivity sessionsActivity, int i7) {
        this.f52427a = i7;
        this.f52428b = sessionsActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f52427a) {
            case 0:
                SessionsActivity sessionsActivity = this.f52428b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26941b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                SessionsActivity.b0(this.f52428b);
                return;
        }
    }
}
