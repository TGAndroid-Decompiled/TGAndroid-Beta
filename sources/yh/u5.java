package yh;

import android.view.View;
public final class u5 implements View.OnClickListener {
    public final int f53412a;
    public final org.telegram.ui.ActionBar.e3[] f53413b;

    public u5(org.telegram.ui.ActionBar.e3[] e3VarArr, int i10) {
        this.f53412a = i10;
        this.f53413b = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f53412a) {
            case 0:
                this.f53413b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.e3 e3Var = this.f53413b[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f53413b[0].dismiss();
                return;
        }
    }
}
