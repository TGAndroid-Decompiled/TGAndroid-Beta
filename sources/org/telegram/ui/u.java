package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f50177a;
    public final g4 f50178b;

    public u(g4 g4Var, int i7) {
        this.f50177a = i7;
        this.f50178b = g4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50177a) {
            case 0:
                this.f50178b.f48268c.f(true);
                return;
            default:
                this.f50178b.f45810k0 = null;
                return;
        }
    }
}
