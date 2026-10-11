package org.telegram.ui;

import android.content.DialogInterface;
public final class x20 implements DialogInterface.OnDismissListener {
    public final int f43977a;
    public final g60 f43978b;

    public x20(g60 g60Var, int i10) {
        this.f43977a = i10;
        this.f43978b = g60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43977a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (this.f43978b.f37999x0 && (U instanceof zn)) {
                    ((zn) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f43978b.dismiss();
                return;
            case 2:
                this.f43978b.E1 = null;
                return;
            default:
                this.f43978b.f37972r0 = null;
                return;
        }
    }
}
