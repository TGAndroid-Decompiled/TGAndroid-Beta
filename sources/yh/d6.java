package yh;

import android.view.View;
public final class d6 implements View.OnClickListener {
    public final int f51234a;
    public final org.telegram.ui.ActionBar.f3[] f51235b;

    public d6(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f51234a = i10;
        this.f51235b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51234a) {
            case 0:
                this.f51235b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f51235b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f51235b[0].dismiss();
                return;
        }
    }
}
