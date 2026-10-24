package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f42166a;
    public final k4 f42167b;

    public u(k4 k4Var, int i10) {
        this.f42166a = i10;
        this.f42167b = k4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42166a) {
            case 0:
                this.f42167b.f37216c.d(true);
                return;
            default:
                this.f42167b.f38765k0 = null;
                return;
        }
    }
}
