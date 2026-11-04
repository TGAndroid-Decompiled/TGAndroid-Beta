package org.telegram.ui;

import android.content.DialogInterface;
public final class v implements DialogInterface.OnDismissListener {
    public final int f50354a;
    public final i4 f50355b;

    public v(i4 i4Var, int i3) {
        this.f50354a = i3;
        this.f50355b = i4Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f50354a) {
            case 0:
                this.f50355b.f46112c.f(true);
                return;
            default:
                this.f50355b.f46091l0 = null;
                return;
        }
    }
}
