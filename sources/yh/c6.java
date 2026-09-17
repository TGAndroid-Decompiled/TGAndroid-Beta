package yh;

import android.view.View;
public final class c6 implements View.OnClickListener {
    public final int f47084a;
    public final org.telegram.ui.ActionBar.g3[] f47085b;

    public c6(org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.f47084a = i10;
        this.f47085b = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47084a) {
            case 0:
                this.f47085b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = this.f47085b[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f47085b[0].dismiss();
                return;
        }
    }
}
