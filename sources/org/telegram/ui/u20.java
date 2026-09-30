package org.telegram.ui;

import android.content.DialogInterface;
public final class u20 implements DialogInterface.OnDismissListener {
    public final int f38387a;
    public final d60 f38388b;

    public u20(d60 d60Var, int i10) {
        this.f38387a = i10;
        this.f38388b = d60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f38387a) {
            case 0:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (this.f38388b.f33108x0 && (U instanceof wn)) {
                    ((wn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f38388b.dismiss();
                return;
            case 2:
                this.f38388b.E1 = null;
                return;
            default:
                this.f38388b.f33081r0 = null;
                return;
        }
    }
}
