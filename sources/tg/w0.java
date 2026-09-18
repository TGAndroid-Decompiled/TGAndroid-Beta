package tg;

import android.view.View;
public final class w0 implements View.OnClickListener {
    public final int f43262a;
    public final a1 f43263b;

    public w0(a1 a1Var, int i10) {
        this.f43262a = i10;
        this.f43263b = a1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43262a) {
            case 0:
                a1 a1Var = this.f43263b;
                a1Var.f43095e0.clear();
                a1Var.Y.d.b(true);
                a1Var.b0(true, false);
                return;
            default:
                this.f43263b.W(false);
                return;
        }
    }
}
