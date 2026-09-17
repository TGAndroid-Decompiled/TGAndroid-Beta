package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r81 implements Runnable {
    public final int f40128a;
    public final s81 f40129b;

    public r81(s81 s81Var, int i10) {
        this.f40128a = i10;
        this.f40129b = s81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f40128a) {
            case 0:
                s81 s81Var = this.f40129b;
                String str = s81Var.f40377b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.vl.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(s81Var.f40377b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.e5.u0(s81Var.f40378c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.e5.u0(this.f40129b.f40378c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
