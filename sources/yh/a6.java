package yh;

import android.view.View;
public final class a6 implements View.OnClickListener {
    public final int f47208a;
    public final org.telegram.ui.ActionBar.e3[] f47209b;

    public a6(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f47208a = i10;
        this.f47209b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47208a) {
            case 0:
                this.f47209b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = this.f47209b[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f47209b[0].dismiss();
                return;
        }
    }
}
