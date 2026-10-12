package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43015a;
    public final i4 f43016b;

    public w(i4 i4Var, int i10) {
        this.f43015a = i10;
        this.f43016b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43015a) {
            case 0:
                this.f43016b.f43068c.d(true);
                return;
            default:
                this.f43016b.f38652k0 = null;
                return;
        }
    }
}
