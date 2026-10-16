package org.telegram.ui;

import android.content.DialogInterface;
public final class zf0 implements DialogInterface.OnDismissListener {
    public final int f42304a;
    public final dg0 f42305b;

    public zf0(dg0 dg0Var, int i10) {
        this.f42304a = i10;
        this.f42305b = dg0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42304a) {
            case 0:
                this.f42305b.f35010s0.finishFragment();
                return;
            default:
                this.f42305b.f35010s0.finishFragment();
                return;
        }
    }
}
