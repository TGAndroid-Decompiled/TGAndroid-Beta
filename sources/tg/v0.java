package tg;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f43605a;
    public final z0 f43606b;

    public v0(z0 z0Var, int i10) {
        this.f43605a = i10;
        this.f43606b = z0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43605a) {
            case 0:
                z0 z0Var = this.f43606b;
                z0Var.f43623e0.clear();
                z0Var.Y.d.b(true);
                z0Var.b0(true, false);
                return;
            default:
                this.f43606b.W(false);
                return;
        }
    }
}
