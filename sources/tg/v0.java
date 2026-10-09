package tg;

import android.view.View;
public final class v0 implements View.OnClickListener {
    public final int f48417a;
    public final z0 f48418b;

    public v0(z0 z0Var, int i10) {
        this.f48417a = i10;
        this.f48418b = z0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48417a) {
            case 0:
                z0 z0Var = this.f48418b;
                z0Var.f48436e0.clear();
                z0Var.Y.d.b(true);
                z0Var.c0(true, false);
                return;
            default:
                this.f48418b.X(false);
                return;
        }
    }
}
