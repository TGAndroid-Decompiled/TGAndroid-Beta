package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43022a;
    public final i4 f43023b;

    public w(i4 i4Var, int i10) {
        this.f43022a = i10;
        this.f43023b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43022a) {
            case 0:
                this.f43023b.f41884c.d(true);
                return;
            default:
                this.f43023b.f38504k0 = null;
                return;
        }
    }
}
