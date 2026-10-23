package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f42084a;
    public final l4 f42085b;

    public v(l4 l4Var, int i10) {
        this.f42084a = i10;
        this.f42085b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42084a) {
            case 0:
                this.f42085b.f35528c.d(true);
                return;
            default:
                this.f42085b.f38774k0 = null;
                return;
        }
    }
}
