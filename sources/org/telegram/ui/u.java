package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f52400a;
    public final g4 f52401b;

    public u(g4 g4Var, int i7) {
        this.f52400a = i7;
        this.f52401b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f52400a) {
            case 0:
                this.f52401b.f50726c.f(true);
                return;
            default:
                this.f52401b.f47911l0 = null;
                return;
        }
    }
}
