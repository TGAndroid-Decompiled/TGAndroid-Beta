package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f38855a;
    public final i4 f38856b;

    public w(i4 i4Var, int i10) {
        this.f38855a = i10;
        this.f38856b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38855a) {
            case 0:
                this.f38856b.f36421c.d(true);
                return;
            default:
                this.f38856b.f34398k0 = null;
                return;
        }
    }
}
