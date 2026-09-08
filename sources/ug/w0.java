package ug;

import android.view.View;
public final class w0 implements View.OnClickListener {
    public final int f47249a;
    public final a1 f47250b;

    public w0(a1 a1Var, int i10) {
        this.f47249a = i10;
        this.f47250b = a1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47249a) {
            case 0:
                a1 a1Var = this.f47250b;
                a1Var.f47075e0.clear();
                a1Var.Y.d.b(true);
                a1Var.b0(true, false);
                return;
            default:
                this.f47250b.W(false);
                return;
        }
    }
}
