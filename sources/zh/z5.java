package zh;

import android.view.View;
public final class z5 implements View.OnClickListener {
    public final int f52919a;
    public final org.telegram.ui.ActionBar.f3[] f52920b;

    public z5(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f52919a = i10;
        this.f52920b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52919a) {
            case 0:
                this.f52920b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f52920b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f52920b[0].dismiss();
                return;
        }
    }
}
