package org.telegram.ui;

import android.content.DialogInterface;
public final class u implements DialogInterface.OnDismissListener {
    public final int f43957a;
    public final j4 f43958b;

    public u(j4 j4Var, int i10) {
        this.f43957a = i10;
        this.f43958b = j4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43957a) {
            case 0:
                this.f43958b.f39918c.d(true);
                return;
            default:
                this.f43958b.f40437k0 = null;
                return;
        }
    }
}
