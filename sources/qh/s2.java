package qh;

import android.view.View;
public final class s2 implements Runnable {
    public final int f46686a;
    public final o3 f46687b;
    public final a f46688c;

    public s2(o3 o3Var, a aVar, int i9) {
        this.f46686a = i9;
        this.f46687b = o3Var;
        this.f46688c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f46686a) {
            case 0:
                View z12 = this.f46687b.z1(this.f46688c);
                if (z12 instanceof s5) {
                    s5 s5Var = (s5) z12;
                    s5Var.B();
                    s5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f46687b.d3(this.f46688c);
                return;
            case 2:
                this.f46687b.d3(this.f46688c);
                return;
            case 3:
                this.f46687b.e3(this.f46688c);
                return;
            case 4:
                this.f46687b.d3(this.f46688c);
                return;
            default:
                this.f46687b.d3(this.f46688c);
                return;
        }
    }
}
