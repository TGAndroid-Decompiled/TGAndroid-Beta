package org.telegram.ui;

import android.content.DialogInterface;
public final class t implements DialogInterface.OnDismissListener {
    public final int f41495a;
    public final h4 f41496b;

    public t(h4 h4Var, int i10) {
        this.f41495a = i10;
        this.f41496b = h4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41495a) {
            case 0:
                this.f41496b.f39097c.f(true);
                return;
            default:
                this.f41496b.f37682k0 = null;
                return;
        }
    }
}
