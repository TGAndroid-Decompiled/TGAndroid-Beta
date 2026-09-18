package tg;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f43468a;
    public final z0 f43469b;

    public v0(z0 z0Var, int i10) {
        this.f43468a = i10;
        this.f43469b = z0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43468a) {
            case 0:
                z0 z0Var = this.f43469b;
                z0Var.f43486e0.clear();
                z0Var.Y.d.b(true);
                z0Var.b0(true, false);
                return;
            default:
                this.f43469b.W(false);
                return;
        }
    }
}
