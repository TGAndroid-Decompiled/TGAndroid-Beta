package yh;

import android.view.View;
public final class c6 implements View.OnClickListener {
    public final int f51172a;
    public final org.telegram.ui.ActionBar.f3[] f51173b;

    public c6(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f51172a = i10;
        this.f51173b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51172a) {
            case 0:
                this.f51173b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f51173b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f51173b[0].dismiss();
                return;
        }
    }
}
