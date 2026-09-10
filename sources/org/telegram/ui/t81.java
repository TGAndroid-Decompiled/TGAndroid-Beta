package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t81 implements Runnable {
    public final int f36871a;
    public final u81 f36872b;

    public t81(u81 u81Var, int i10) {
        this.f36871a = i10;
        this.f36872b = u81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f36871a) {
            case 0:
                u81 u81Var = this.f36872b;
                String str = u81Var.f37158b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(u81Var.f37158b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.d5.u0(u81Var.f37159c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.d5.u0(this.f36872b.f37159c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
