package yh;

import android.view.View;
public final class z5 implements View.OnClickListener {
    public final int f48386a;
    public final org.telegram.ui.ActionBar.g3[] f48387b;

    public z5(org.telegram.ui.ActionBar.g3[] g3VarArr, int i10) {
        this.f48386a = i10;
        this.f48387b = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48386a) {
            case 0:
                this.f48387b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.g3 g3Var = this.f48387b[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f48387b[0].dismiss();
                return;
        }
    }
}
