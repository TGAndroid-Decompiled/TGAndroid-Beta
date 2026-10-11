package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f42844a;
    public final h4 f42845b;

    public v(h4 h4Var, int i10) {
        this.f42844a = i10;
        this.f42845b = h4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42844a) {
            case 0:
                this.f42845b.f42132c.d(true);
                return;
            default:
                this.f42845b.f38310k0 = null;
                return;
        }
    }
}
