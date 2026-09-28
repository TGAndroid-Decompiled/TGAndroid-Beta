package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f38856a;
    public final i4 f38857b;

    public w(i4 i4Var, int i10) {
        this.f38856a = i10;
        this.f38857b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38856a) {
            case 0:
                this.f38857b.f36422c.d(true);
                return;
            default:
                this.f38857b.f34399k0 = null;
                return;
        }
    }
}
