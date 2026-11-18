package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f52399a;
    public final g4 f52400b;

    public u(g4 g4Var, int i7) {
        this.f52399a = i7;
        this.f52400b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52399a) {
            case 0:
                this.f52400b.f50752c.f(true);
                return;
            default:
                this.f52400b.f47926l0 = null;
                return;
        }
    }
}
