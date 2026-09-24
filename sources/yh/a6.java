package yh;

import android.view.View;
public final class a6 implements View.OnClickListener {
    public final int f47198a;
    public final org.telegram.ui.ActionBar.e3[] f47199b;

    public a6(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f47198a = i10;
        this.f47199b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47198a) {
            case 0:
                this.f47199b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = this.f47199b[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f47199b[0].dismiss();
                return;
        }
    }
}
