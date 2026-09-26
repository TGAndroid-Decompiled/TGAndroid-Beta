package org.telegram.ui;

import android.content.DialogInterface;
public final class w implements DialogInterface.OnDismissListener {
    public final int f38854a;
    public final i4 f38855b;

    public w(i4 i4Var, int i10) {
        this.f38854a = i10;
        this.f38855b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38854a) {
            case 0:
                this.f38855b.f36420c.d(true);
                return;
            default:
                this.f38855b.f34397k0 = null;
                return;
        }
    }
}
