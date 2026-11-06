package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f50185a;
    public final g4 f50186b;

    public u(g4 g4Var, int i7) {
        this.f50185a = i7;
        this.f50186b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50185a) {
            case 0:
                this.f50186b.f48268c.f(true);
                return;
            default:
                this.f50186b.f45833k0 = null;
                return;
        }
    }
}
