package ug;

import android.view.View;
public final class w0 implements View.OnClickListener {
    public final int f47222a;
    public final a1 f47223b;

    public w0(a1 a1Var, int i10) {
        this.f47222a = i10;
        this.f47223b = a1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47222a) {
            case 0:
                a1 a1Var = this.f47223b;
                a1Var.f47048e0.clear();
                a1Var.Y.d.b(true);
                a1Var.b0(true, false);
                return;
            default:
                this.f47223b.W(false);
                return;
        }
    }
}
