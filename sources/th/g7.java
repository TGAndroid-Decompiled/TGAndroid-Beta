package th;

import android.content.Context;
public final class g7 extends r {
    public final o7 f49019a;

    public g7(Context context, o7 o7Var) {
        super(context);
        this.f49019a = o7Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        k2.t0 t0Var = this.f49019a.G0;
        if (t0Var != null) {
            t0Var.b();
        }
    }
}
