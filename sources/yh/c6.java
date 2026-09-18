package yh;

import android.view.View;
public final class c6 implements View.OnClickListener {
    public final int f47089a;
    public final org.telegram.ui.ActionBar.g3[] f47090b;

    public c6(org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.f47089a = i10;
        this.f47090b = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47089a) {
            case 0:
                this.f47090b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = this.f47090b[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f47090b[0].dismiss();
                return;
        }
    }
}
