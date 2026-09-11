package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r81 implements Runnable {
    public final int f40100a;
    public final s81 f40101b;

    public r81(s81 s81Var, int i10) {
        this.f40100a = i10;
        this.f40101b = s81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f40100a) {
            case 0:
                s81 s81Var = this.f40101b;
                String str = s81Var.f40349b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.vl.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(s81Var.f40349b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.e5.u0(s81Var.f40350c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.e5.u0(this.f40101b.f40350c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
