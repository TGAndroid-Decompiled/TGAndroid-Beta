package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43024a;
    public final i4 f43025b;

    public w(i4 i4Var, int i10) {
        this.f43024a = i10;
        this.f43025b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43024a) {
            case 0:
                this.f43025b.f41886c.d(true);
                return;
            default:
                this.f43025b.f38506k0 = null;
                return;
        }
    }
}
