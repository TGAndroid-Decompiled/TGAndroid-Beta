package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y81 implements Runnable {
    public final int f42073a;
    public final z81 f42074b;

    public y81(z81 z81Var, int i10) {
        this.f42073a = i10;
        this.f42074b = z81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f42073a) {
            case 0:
                z81 z81Var = this.f42074b;
                String str = z81Var.f42545b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.d0.n(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(z81Var.f42545b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.g5.t0(z81Var.f42546c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.g5.t0(this.f42074b.f42546c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
