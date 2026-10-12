package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u81 implements Runnable {
    public final int f42395a;
    public final v81 f42396b;

    public u81(v81 v81Var, int i10) {
        this.f42395a = i10;
        this.f42396b = v81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f42395a) {
            case 0:
                v81 v81Var = this.f42396b;
                String str = v81Var.f42715b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(v81Var.f42715b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.g5.t0(v81Var.f42716c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.g5.t0(this.f42396b.f42716c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
