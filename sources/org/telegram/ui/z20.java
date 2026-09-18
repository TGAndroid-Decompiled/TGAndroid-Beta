package org.telegram.ui;

import android.content.DialogInterface;
public final class z20 implements DialogInterface.OnDismissListener {
    public final int f39953a;
    public final i60 f39954b;

    public z20(i60 i60Var, int i10) {
        this.f39953a = i10;
        this.f39954b = i60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f39953a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f39954b.f34424x0 && (U instanceof zn)) {
                    ((zn) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f39954b.dismiss();
                return;
            case 2:
                this.f39954b.E1 = null;
                return;
            default:
                this.f39954b.f34397r0 = null;
                return;
        }
    }
}
