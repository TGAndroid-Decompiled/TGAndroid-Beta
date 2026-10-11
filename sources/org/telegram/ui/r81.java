package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r81 implements Runnable {
    public final int f41388a;
    public final s81 f41389b;

    public r81(s81 s81Var, int i10) {
        this.f41388a = i10;
        this.f41389b = s81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f41388a) {
            case 0:
                s81 s81Var = this.f41389b;
                String str = s81Var.f41676b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(s81Var.f41676b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.g5.t0(s81Var.f41677c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.g5.t0(this.f41389b.f41677c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
