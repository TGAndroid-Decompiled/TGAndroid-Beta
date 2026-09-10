package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f37660a;
    public final j4 f37661b;

    public w(j4 j4Var, int i10) {
        this.f37660a = i10;
        this.f37661b = j4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f37660a) {
            case 0:
                this.f37661b.f36856c.d(true);
                return;
            default:
                this.f37661b.f33911k0 = null;
                return;
        }
    }
}
