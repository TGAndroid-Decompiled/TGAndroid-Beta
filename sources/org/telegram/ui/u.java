package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f51707a;
    public final g4 f51708b;

    public u(g4 g4Var, int i7) {
        this.f51707a = i7;
        this.f51708b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51707a) {
            case 0:
                this.f51708b.f49449c.f(true);
                return;
            default:
                this.f51708b.f47317l0 = null;
                return;
        }
    }
}
