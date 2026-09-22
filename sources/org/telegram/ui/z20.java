package org.telegram.ui;

import android.content.DialogInterface;
public final class z20 implements DialogInterface.OnDismissListener {
    public final int f40091a;
    public final i60 f40092b;

    public z20(i60 i60Var, int i10) {
        this.f40091a = i10;
        this.f40092b = i60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40091a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f40092b.f34475x0 && (U instanceof zn)) {
                    ((zn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f40092b.dismiss();
                return;
            case 2:
                this.f40092b.E1 = null;
                return;
            default:
                this.f40092b.f34448r0 = null;
                return;
        }
    }
}
