package org.telegram.ui;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f44418a;
    public final m4 f44419b;

    public x(m4 m4Var, int i10) {
        this.f44418a = i10;
        this.f44419b = m4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44418a) {
            case 0:
                this.f44419b.f37381c.d(true);
                return;
            default:
                this.f44419b.f40395g0 = null;
                return;
        }
    }
}
