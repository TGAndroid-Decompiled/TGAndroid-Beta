package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f38499a;
    public final i4 f38500b;

    public w(i4 i4Var, int i10) {
        this.f38499a = i10;
        this.f38500b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38499a) {
            case 0:
                this.f38500b.f36711c.d(true);
                return;
            default:
                this.f38500b.f34012k0 = null;
                return;
        }
    }
}
