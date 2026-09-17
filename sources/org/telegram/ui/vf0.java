package org.telegram.ui;

import android.content.DialogInterface;
public final class vf0 implements DialogInterface.OnDismissListener {
    public final int f41559a;
    public final zf0 f41560b;

    public vf0(zf0 zf0Var, int i10) {
        this.f41559a = i10;
        this.f41560b = zf0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41559a) {
            case 0:
                this.f41560b.f43449s0.finishFragment();
                return;
            default:
                this.f41560b.f43449s0.finishFragment();
                return;
        }
    }
}
