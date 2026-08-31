package org.telegram.ui;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f42918a;
    public final l4 f42919b;

    public x(l4 l4Var, int i10) {
        this.f42918a = i10;
        this.f42919b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42918a) {
            case 0:
                this.f42919b.f39610c.d(true);
                return;
            default:
                this.f42919b.f38610h0 = null;
                return;
        }
    }
}
