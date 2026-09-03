package org.telegram.ui;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f39793a;
    public final n4 f39794b;

    public x(n4 n4Var, int i10) {
        this.f39793a = i10;
        this.f39794b = n4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39793a) {
            case 0:
                this.f39794b.f36982c.d(true);
                return;
            default:
                this.f39794b.f36366h0 = null;
                return;
        }
    }
}
