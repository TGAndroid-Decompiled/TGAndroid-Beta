package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y81 implements Runnable {
    public final int f41776a;
    public final z81 f41777b;

    public y81(z81 z81Var, int i10) {
        this.f41776a = i10;
        this.f41777b = z81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f41776a) {
            case 0:
                z81 z81Var = this.f41777b;
                String str = z81Var.f42219b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(z81Var.f42219b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.g5.t0(z81Var.f42220c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.g5.t0(this.f41777b.f42220c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
