package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f52420a;
    public final g4 f52421b;

    public u(g4 g4Var, int i7) {
        this.f52420a = i7;
        this.f52421b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52420a) {
            case 0:
                this.f52421b.f50753c.f(true);
                return;
            default:
                this.f52421b.f47964l0 = null;
                return;
        }
    }
}
