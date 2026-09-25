package yh;

import android.view.View;
public final class a6 implements View.OnClickListener {
    public final int f47210a;
    public final org.telegram.ui.ActionBar.e3[] f47211b;

    public a6(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f47210a = i10;
        this.f47211b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47210a) {
            case 0:
                this.f47211b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = this.f47211b[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f47211b[0].dismiss();
                return;
        }
    }
}
