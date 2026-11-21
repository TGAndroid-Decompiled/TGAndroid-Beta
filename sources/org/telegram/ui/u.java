package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f52416a;
    public final g4 f52417b;

    public u(g4 g4Var, int i7) {
        this.f52416a = i7;
        this.f52417b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52416a) {
            case 0:
                this.f52417b.f50749c.f(true);
                return;
            default:
                this.f52417b.f47960l0 = null;
                return;
        }
    }
}
