package yh;

import android.view.View;
public final class u5 implements View.OnClickListener {
    public final int f53335a;
    public final org.telegram.ui.ActionBar.f3[] f53336b;

    public u5(org.telegram.ui.ActionBar.f3[] f3VarArr, int i10) {
        this.f53335a = i10;
        this.f53336b = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f53335a) {
            case 0:
                this.f53336b[0].dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = this.f53336b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    return;
                }
                return;
            default:
                this.f53336b[0].dismiss();
                return;
        }
    }
}
