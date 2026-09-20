package org.telegram.ui;

import android.content.DialogInterface;
public final class z20 implements DialogInterface.OnDismissListener {
    public final int f40069a;
    public final i60 f40070b;

    public z20(i60 i60Var, int i10) {
        this.f40069a = i10;
        this.f40070b = i60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40069a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f40070b.f34455x0 && (U instanceof zn)) {
                    ((zn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f40070b.dismiss();
                return;
            case 2:
                this.f40070b.E1 = null;
                return;
            default:
                this.f40070b.f34428r0 = null;
                return;
        }
    }
}
