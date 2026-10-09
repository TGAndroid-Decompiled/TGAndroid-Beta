package yh;

import android.view.View;
public final class u5 implements View.OnClickListener {
    public final int f53291a;
    public final org.telegram.ui.ActionBar.f3[] f53292b;

    public u5(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f53291a = i10;
        this.f53292b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f53291a) {
            case 0:
                this.f53292b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f53292b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f53292b[0].dismiss();
                return;
        }
    }
}
