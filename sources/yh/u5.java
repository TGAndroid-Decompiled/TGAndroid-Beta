package yh;

import android.view.View;
public final class u5 implements View.OnClickListener {
    public final int f53527a;
    public final org.telegram.ui.ActionBar.e3[] f53528b;

    public u5(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f53527a = i10;
        this.f53528b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f53527a) {
            case 0:
                this.f53528b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = this.f53528b[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f53528b[0].dismiss();
                return;
        }
    }
}
