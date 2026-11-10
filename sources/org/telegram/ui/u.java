package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f50374a;
    public final g4 f50375b;

    public u(g4 g4Var, int i7) {
        this.f50374a = i7;
        this.f50375b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50374a) {
            case 0:
                this.f50375b.f49251c.f(true);
                return;
            default:
                this.f50375b.f45962k0 = null;
                return;
        }
    }
}
