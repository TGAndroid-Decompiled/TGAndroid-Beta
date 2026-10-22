package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f42083a;
    public final l4 f42084b;

    public v(l4 l4Var, int i10) {
        this.f42083a = i10;
        this.f42084b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42083a) {
            case 0:
                this.f42084b.f35527c.d(true);
                return;
            default:
                this.f42084b.f38773k0 = null;
                return;
        }
    }
}
