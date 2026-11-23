package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
public final class s21 implements org.telegram.ui.ActionBar.q1 {
    public final int f51948a;
    public final SessionsActivity f51949b;

    public s21(SessionsActivity sessionsActivity, int i7) {
        this.f51948a = i7;
        this.f51949b = sessionsActivity;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f51948a) {
            case 0:
                SessionsActivity sessionsActivity = this.f51949b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                SessionsActivity.b0(this.f51949b);
                return;
        }
    }
}
