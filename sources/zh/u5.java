package zh;

import android.view.View;
public final class u5 implements View.OnClickListener {
    public final int f51220a;
    public final org.telegram.ui.ActionBar.e3[] f51221b;

    public u5(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f51220a = i10;
        this.f51221b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51220a) {
            case 0:
                this.f51221b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = this.f51221b[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f51221b[0].dismiss();
                return;
        }
    }
}
