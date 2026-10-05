package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f41875a;
    public final i4 f41876b;

    public w(i4 i4Var, int i10) {
        this.f41875a = i10;
        this.f41876b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41875a) {
            case 0:
                this.f41876b.f40729c.d(true);
                return;
            default:
                this.f41876b.f37274k0 = null;
                return;
        }
    }
}
