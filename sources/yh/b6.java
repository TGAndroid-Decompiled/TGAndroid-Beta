package yh;

import android.view.View;
public final class b6 implements View.OnClickListener {
    public final int f47300a;
    public final org.telegram.ui.ActionBar.f3[] f47301b;

    public b6(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f47300a = i10;
        this.f47301b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47300a) {
            case 0:
                this.f47301b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f47301b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f47301b[0].dismiss();
                return;
        }
    }
}
