package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f43617a;
    public final l4 f43618b;

    public w(l4 l4Var, int i9) {
        this.f43617a = i9;
        this.f43618b = l4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43617a) {
            case 0:
                this.f43618b.f36375c.d(true);
                return;
            default:
                this.f43618b.f40017g0 = null;
                return;
        }
    }
}
