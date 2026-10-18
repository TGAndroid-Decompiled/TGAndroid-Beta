package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f42098a;
    public final l4 f42099b;

    public v(l4 l4Var, int i10) {
        this.f42098a = i10;
        this.f42099b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42098a) {
            case 0:
                this.f42099b.f36107c.d(true);
                return;
            default:
                this.f42099b.f38761k0 = null;
                return;
        }
    }
}
