package org.telegram.ui;

import android.content.DialogInterface;
public final class x20 implements DialogInterface.OnDismissListener {
    public final int f39499a;
    public final g60 f39500b;

    public x20(g60 g60Var, int i10) {
        this.f39499a = i10;
        this.f39500b = g60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39499a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (this.f39500b.f33821x0 && (U instanceof xn)) {
                    ((xn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f39500b.dismiss();
                return;
            case 2:
                this.f39500b.E1 = null;
                return;
            default:
                this.f39500b.f33794r0 = null;
                return;
        }
    }
}
