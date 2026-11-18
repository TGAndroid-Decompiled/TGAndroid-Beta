package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f52394a;
    public final g4 f52395b;

    public u(g4 g4Var, int i7) {
        this.f52394a = i7;
        this.f52395b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52394a) {
            case 0:
                this.f52395b.f50708c.f(true);
                return;
            default:
                this.f52395b.f47890l0 = null;
                return;
        }
    }
}
