package zh;

import android.view.View;
public final class z5 implements View.OnClickListener {
    public final int f52950a;
    public final org.telegram.ui.ActionBar.f3[] f52951b;

    public z5(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f52950a = i10;
        this.f52951b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52950a) {
            case 0:
                this.f52951b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f52951b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f52951b[0].dismiss();
                return;
        }
    }
}
