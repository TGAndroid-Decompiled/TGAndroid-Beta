package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class y71 implements Runnable {
    public final int f40443a;
    public final z71 f40444b;

    public y71(z71 z71Var, int i10) {
        this.f40443a = i10;
        this.f40444b = z71Var;
    }

    @Override
    public final void run() {
        String sb;
        switch (this.f40443a) {
            case 0:
                z71 z71Var = this.f40444b;
                String str = z71Var.f40701b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    b.i(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(z71Var.f40701b.text);
                    sb = sb2.toString();
                }
                org.telegram.ui.Components.z4.u0(z71Var.f40702c, LocaleController.getString(R.string.AuthAnotherClient), sb, null);
                return;
            default:
                org.telegram.ui.Components.z4.u0(this.f40444b.f40702c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
