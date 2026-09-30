package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f38943a;
    public final i4 f38944b;

    public w(i4 i4Var, int i10) {
        this.f38943a = i10;
        this.f38944b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38943a) {
            case 0:
                this.f38944b.f36526c.d(true);
                return;
            default:
                this.f38944b.f34493k0 = null;
                return;
        }
    }
}
