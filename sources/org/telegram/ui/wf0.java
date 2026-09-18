package org.telegram.ui;

import android.content.DialogInterface;
public final class wf0 implements DialogInterface.OnDismissListener {
    public final int f39140a;
    public final ag0 f39141b;

    public wf0(ag0 ag0Var, int i10) {
        this.f39140a = i10;
        this.f39141b = ag0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39140a) {
            case 0:
                this.f39141b.f32054s0.finishFragment();
                return;
            default:
                this.f39141b.f32054s0.finishFragment();
                return;
        }
    }
}
