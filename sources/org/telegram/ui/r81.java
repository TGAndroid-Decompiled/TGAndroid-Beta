package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r81 implements Runnable {
    public final int f40127a;
    public final s81 f40128b;

    public r81(s81 s81Var, int i10) {
        this.f40127a = i10;
        this.f40128b = s81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f40127a) {
            case 0:
                s81 s81Var = this.f40128b;
                String str = s81Var.f40376b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.wl.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(s81Var.f40376b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.e5.u0(s81Var.f40377c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.e5.u0(this.f40128b.f40377c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
