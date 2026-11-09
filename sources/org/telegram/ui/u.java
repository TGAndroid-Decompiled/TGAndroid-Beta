package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f50270a;
    public final g4 f50271b;

    public u(g4 g4Var, int i7) {
        this.f50270a = i7;
        this.f50271b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50270a) {
            case 0:
                this.f50271b.f48919c.f(true);
                return;
            default:
                this.f50271b.f45893k0 = null;
                return;
        }
    }
}
