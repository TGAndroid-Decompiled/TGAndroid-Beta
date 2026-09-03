package org.telegram.ui;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f42882a;
    public final l4 f42883b;

    public x(l4 l4Var, int i10) {
        this.f42882a = i10;
        this.f42883b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42882a) {
            case 0:
                this.f42883b.f39555c.d(true);
                return;
            default:
                this.f42883b.f38515h0 = null;
                return;
        }
    }
}
