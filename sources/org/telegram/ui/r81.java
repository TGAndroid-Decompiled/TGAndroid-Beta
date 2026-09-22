package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r81 implements Runnable {
    public final int f37089a;
    public final s81 f37090b;

    public r81(s81 s81Var, int i10) {
        this.f37089a = i10;
        this.f37090b = s81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f37089a) {
            case 0:
                s81 s81Var = this.f37090b;
                String str = s81Var.f37360b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(s81Var.f37360b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.d5.u0(s81Var.f37361c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.d5.u0(this.f37090b.f37361c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
