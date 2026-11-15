package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f51706a;
    public final g4 f51707b;

    public u(g4 g4Var, int i7) {
        this.f51706a = i7;
        this.f51707b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f51706a) {
            case 0:
                this.f51707b.f49450c.f(true);
                return;
            default:
                this.f51707b.f47327l0 = null;
                return;
        }
    }
}
