package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f43960a;
    public final j4 f43961b;

    public u(j4 j4Var, int i10) {
        this.f43960a = i10;
        this.f43961b = j4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43960a) {
            case 0:
                this.f43961b.f39921c.d(true);
                return;
            default:
                this.f43961b.f40440k0 = null;
                return;
        }
    }
}
