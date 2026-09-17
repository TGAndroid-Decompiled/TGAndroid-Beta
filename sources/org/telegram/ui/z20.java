package org.telegram.ui;

import android.content.DialogInterface;
public final class z20 implements DialogInterface.OnDismissListener {
    public final int f43296a;
    public final j60 f43297b;

    public z20(j60 j60Var, int i10) {
        this.f43296a = i10;
        this.f43297b = j60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f43296a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f43297b.f37637x0 && (U instanceof co)) {
                    ((co) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f43297b.dismiss();
                return;
            case 2:
                this.f43297b.E1 = null;
                return;
            default:
                this.f43297b.f37610r0 = null;
                return;
        }
    }
}
