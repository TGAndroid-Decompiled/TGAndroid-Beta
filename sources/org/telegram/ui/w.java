package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f41877a;
    public final i4 f41878b;

    public w(i4 i4Var, int i10) {
        this.f41877a = i10;
        this.f41878b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41877a) {
            case 0:
                this.f41878b.f40710c.d(true);
                return;
            default:
                this.f41878b.f37271k0 = null;
                return;
        }
    }
}
