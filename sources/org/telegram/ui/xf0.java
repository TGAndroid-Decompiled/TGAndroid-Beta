package org.telegram.ui;

import android.content.DialogInterface;
public final class xf0 implements DialogInterface.OnDismissListener {
    public final int f39613a;
    public final bg0 f39614b;

    public xf0(bg0 bg0Var, int i10) {
        this.f39613a = i10;
        this.f39614b = bg0Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39613a) {
            case 0:
                this.f39614b.f32157s0.finishFragment();
                return;
            default:
                this.f39614b.f32157s0.finishFragment();
                return;
        }
    }
}
