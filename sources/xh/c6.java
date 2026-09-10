package xh;

import android.view.View;
public final class c6 implements View.OnClickListener {
    public final int f45318a;
    public final org.telegram.ui.ActionBar.h3[] f45319b;

    public c6(org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.f45318a = i10;
        this.f45319b = h3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45318a) {
            case 0:
                this.f45319b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.h3 h3Var = this.f45319b[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f45319b[0].dismiss();
                return;
        }
    }
}
