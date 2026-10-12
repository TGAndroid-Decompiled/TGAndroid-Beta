package org.telegram.ui;

import android.content.DialogInterface;
public final class z20 implements DialogInterface.OnDismissListener {
    public final int f44599a;
    public final i60 f44600b;

    public z20(i60 i60Var, int i10) {
        this.f44599a = i10;
        this.f44600b = i60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44599a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (this.f44600b.f38774x0 && (U instanceof eo)) {
                    ((eo) U).Y9(true, true);
                    return;
                }
                return;
            case 1:
                this.f44600b.dismiss();
                return;
            case 2:
                this.f44600b.E1 = null;
                return;
            default:
                this.f44600b.f38747r0 = null;
                return;
        }
    }
}
