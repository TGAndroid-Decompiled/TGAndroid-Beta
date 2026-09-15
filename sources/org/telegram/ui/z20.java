package org.telegram.ui;

import android.content.DialogInterface;
public final class z20 implements DialogInterface.OnDismissListener {
    public final int f40048a;
    public final i60 f40049b;

    public z20(i60 i60Var, int i10) {
        this.f40048a = i10;
        this.f40049b = i60Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f40048a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.f40049b.f34505x0 && (U instanceof bo)) {
                    ((bo) U).T9(true, true);
                    return;
                }
                return;
            case 1:
                this.f40049b.dismiss();
                return;
            case 2:
                this.f40049b.E1 = null;
                return;
            default:
                this.f40049b.f34478r0 = null;
                return;
        }
    }
}
