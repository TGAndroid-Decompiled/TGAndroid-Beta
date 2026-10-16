package zh;

import android.view.View;
public final class u5 implements View.OnClickListener {
    public final int f51221a;
    public final org.telegram.ui.ActionBar.e3[] f51222b;

    public u5(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f51221a = i10;
        this.f51222b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51221a) {
            case 0:
                this.f51222b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = this.f51222b[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f51222b[0].dismiss();
                return;
        }
    }
}
