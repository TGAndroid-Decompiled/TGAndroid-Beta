package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43068a;
    public final i4 f43069b;

    public w(i4 i4Var, int i10) {
        this.f43068a = i10;
        this.f43069b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43068a) {
            case 0:
                this.f43069b.f41930c.d(true);
                return;
            default:
                this.f43069b.f38550k0 = null;
                return;
        }
    }
}
