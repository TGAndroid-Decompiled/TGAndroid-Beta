package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f50164a;
    public final g4 f50165b;

    public u(g4 g4Var, int i7) {
        this.f50164a = i7;
        this.f50165b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50164a) {
            case 0:
                this.f50165b.f48240c.f(true);
                return;
            default:
                this.f50165b.f45807k0 = null;
                return;
        }
    }
}
