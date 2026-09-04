package org.telegram.ui;

import android.content.DialogInterface;
public final class z20 implements DialogInterface.OnDismissListener {
    public final int f43268a;
    public final j60 f43269b;

    public z20(j60 j60Var, int i10) {
        this.f43268a = i10;
        this.f43269b = j60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43268a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f43269b.f37609x0 && (U instanceof co)) {
                    ((co) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f43269b.dismiss();
                return;
            case 2:
                this.f43269b.E1 = null;
                return;
            default:
                this.f43269b.f37582r0 = null;
                return;
        }
    }
}
