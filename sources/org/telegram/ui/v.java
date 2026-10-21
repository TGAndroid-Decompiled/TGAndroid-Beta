package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f42080a;
    public final l4 f42081b;

    public v(l4 l4Var, int i10) {
        this.f42080a = i10;
        this.f42081b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42080a) {
            case 0:
                this.f42081b.f35524c.d(true);
                return;
            default:
                this.f42081b.f38770k0 = null;
                return;
        }
    }
}
