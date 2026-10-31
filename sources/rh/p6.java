package rh;

import android.view.View;
public final class p6 implements View.OnClickListener {
    public final int f47327a;
    public final org.telegram.ui.ActionBar.z2[] f47328b;

    public p6(org.telegram.ui.ActionBar.z2[] z2VarArr, int i10) {
        this.f47327a = i10;
        this.f47328b = z2VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47327a) {
            case 0:
                this.f47328b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.z2 z2Var = this.f47328b[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                    return;
                }
                return;
            default:
                this.f47328b[0].dismiss();
                return;
        }
    }
}
