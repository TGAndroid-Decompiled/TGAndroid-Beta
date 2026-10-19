package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f42075a;
    public final l4 f42076b;

    public v(l4 l4Var, int i10) {
        this.f42075a = i10;
        this.f42076b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42075a) {
            case 0:
                this.f42076b.f35533c.d(true);
                return;
            default:
                this.f42076b.f38765k0 = null;
                return;
        }
    }
}
