package org.telegram.ui;

import android.content.DialogInterface;
public final class x implements DialogInterface.OnDismissListener {
    public final int f39476a;
    public final j4 f39477b;

    public x(j4 j4Var, int i10) {
        this.f39476a = i10;
        this.f39477b = j4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39476a) {
            case 0:
                this.f39477b.f37321c.d(true);
                return;
            default:
                this.f39477b.f34618k0 = null;
                return;
        }
    }
}
