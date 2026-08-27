package zf;

import android.content.Context;

public final class r2 extends n0 {

    public final t2 f50691p0;

    public r2(t2 t2Var, Context context, float f10) {
        super(context, f10);
        this.f50691p0 = t2Var;
    }

    @Override
    public final void invalidate() {
        this.f50691p0.d.invalidate();
        super.invalidate();
    }
}
