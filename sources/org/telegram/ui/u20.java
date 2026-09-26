package org.telegram.ui;

import android.content.DialogInterface;
public final class u20 implements DialogInterface.OnDismissListener {
    public final int f38296a;
    public final d60 f38297b;

    public u20(d60 d60Var, int i10) {
        this.f38296a = i10;
        this.f38297b = d60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38296a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (this.f38297b.f33029x0 && (U instanceof wn)) {
                    ((wn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f38297b.dismiss();
                return;
            case 2:
                this.f38297b.E1 = null;
                return;
            default:
                this.f38297b.f33002r0 = null;
                return;
        }
    }
}
