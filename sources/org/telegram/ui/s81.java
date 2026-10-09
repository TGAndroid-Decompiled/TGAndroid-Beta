package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s81 implements Runnable {
    public final int f41609a;
    public final t81 f41610b;

    public s81(t81 t81Var, int i10) {
        this.f41609a = i10;
        this.f41610b = t81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f41609a) {
            case 0:
                t81 t81Var = this.f41610b;
                String str = t81Var.f41910b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(t81Var.f41910b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.g5.t0(t81Var.f41911c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.g5.t0(this.f41610b.f41911c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
