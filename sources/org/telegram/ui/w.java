package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f41869a;
    public final i4 f41870b;

    public w(i4 i4Var, int i10) {
        this.f41869a = i10;
        this.f41870b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41869a) {
            case 0:
                this.f41870b.f40703c.d(true);
                return;
            default:
                this.f41870b.f37265k0 = null;
                return;
        }
    }
}
