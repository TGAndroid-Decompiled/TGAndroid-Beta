package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f41870a;
    public final i4 f41871b;

    public w(i4 i4Var, int i10) {
        this.f41870a = i10;
        this.f41871b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41870a) {
            case 0:
                this.f41871b.f40704c.d(true);
                return;
            default:
                this.f41871b.f37266k0 = null;
                return;
        }
    }
}
