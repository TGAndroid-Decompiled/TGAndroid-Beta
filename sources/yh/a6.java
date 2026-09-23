package yh;

import android.view.View;
public final class a6 implements View.OnClickListener {
    public final int f46903a;
    public final org.telegram.ui.ActionBar.f3[] f46904b;

    public a6(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f46903a = i10;
        this.f46904b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46903a) {
            case 0:
                this.f46904b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f46904b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f46904b[0].dismiss();
                return;
        }
    }
}
