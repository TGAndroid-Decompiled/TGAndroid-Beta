package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f50186a;
    public final g4 f50187b;

    public u(g4 g4Var, int i7) {
        this.f50186a = i7;
        this.f50187b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50186a) {
            case 0:
                this.f50187b.f48269c.f(true);
                return;
            default:
                this.f50187b.f45834k0 = null;
                return;
        }
    }
}
