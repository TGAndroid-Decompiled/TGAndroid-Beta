package tg;

import android.view.View;
public final class w0 implements View.OnClickListener {
    public final int f43234a;
    public final a1 f43235b;

    public w0(a1 a1Var, int i10) {
        this.f43234a = i10;
        this.f43235b = a1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43234a) {
            case 0:
                a1 a1Var = this.f43235b;
                a1Var.f43068e0.clear();
                a1Var.Y.d.b(true);
                a1Var.b0(true, false);
                return;
            default:
                this.f43235b.W(false);
                return;
        }
    }
}
