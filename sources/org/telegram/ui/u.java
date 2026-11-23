package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f52502a;
    public final g4 f52503b;

    public u(g4 g4Var, int i7) {
        this.f52502a = i7;
        this.f52503b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52502a) {
            case 0:
                this.f52503b.f50840c.f(true);
                return;
            default:
                this.f52503b.f48075l0 = null;
                return;
        }
    }
}
