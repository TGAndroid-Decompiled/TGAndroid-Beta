package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f41399a;
    public final i4 f41400b;

    public v(i4 i4Var, int i10) {
        this.f41399a = i10;
        this.f41400b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41399a) {
            case 0:
                this.f41400b.f41462c.d(true);
                return;
            default:
                this.f41400b.f37250k0 = null;
                return;
        }
    }
}
