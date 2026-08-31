package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z71 implements Runnable {
    public final int f43863a;
    public final a81 f43864b;

    public z71(a81 a81Var, int i10) {
        this.f43863a = i10;
        this.f43864b = a81Var;
    }

    @Override
    public final void run() {
        String sb;
        switch (this.f43863a) {
            case 0:
                a81 a81Var = this.f43864b;
                String str = a81Var.f35062b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    b.i(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(a81Var.f35062b.text);
                    sb = sb2.toString();
                }
                org.telegram.ui.Components.z4.u0(a81Var.f35063c, LocaleController.getString(R.string.AuthAnotherClient), sb, null);
                return;
            default:
                org.telegram.ui.Components.z4.u0(this.f43864b.f35063c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
