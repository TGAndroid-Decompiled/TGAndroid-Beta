package ug;

import android.view.View;
public final class w0 implements View.OnClickListener {
    public final int f47250a;
    public final a1 f47251b;

    public w0(a1 a1Var, int i10) {
        this.f47250a = i10;
        this.f47251b = a1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47250a) {
            case 0:
                a1 a1Var = this.f47251b;
                a1Var.f47076e0.clear();
                a1Var.Y.d.b(true);
                a1Var.b0(true, false);
                return;
            default:
                this.f47251b.W(false);
                return;
        }
    }
}
