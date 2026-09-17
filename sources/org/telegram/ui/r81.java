package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r81 implements Runnable {
    public final int f40101a;
    public final s81 f40102b;

    public r81(s81 s81Var, int i10) {
        this.f40101a = i10;
        this.f40102b = s81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f40101a) {
            case 0:
                s81 s81Var = this.f40102b;
                String str = s81Var.f40350b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.vl.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(s81Var.f40350b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.e5.u0(s81Var.f40351c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.e5.u0(this.f40102b.f40351c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
