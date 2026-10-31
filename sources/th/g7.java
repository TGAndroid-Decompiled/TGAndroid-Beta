package th;

import android.content.Context;
public final class g7 extends r {
    public final o7 f49005a;

    public g7(Context context, o7 o7Var) {
        super(context);
        this.f49005a = o7Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        k2.t0 t0Var = this.f49005a.G0;
        if (t0Var != null) {
            t0Var.b();
        }
    }
}
