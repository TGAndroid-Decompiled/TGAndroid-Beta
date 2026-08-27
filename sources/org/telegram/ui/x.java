package org.telegram.ui;

import android.content.DialogInterface;

public final class x implements DialogInterface.OnDismissListener {

    public final int f44227a;

    public final m4 f44228b;

    public x(m4 m4Var, int i10) {
        this.f44227a = i10;
        this.f44228b = m4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44227a) {
            case 0:
                this.f44228b.f37286c.d(true);
                break;
            default:
                this.f44228b.f40338g0 = null;
                break;
        }
    }
}
