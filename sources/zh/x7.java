package zh;

import android.content.Context;
import android.view.View;
public final class x7 extends pg.s0 {
    public final y7 Q;

    public x7(y7 y7Var, Context context, float f7) {
        super(context, f7);
        this.Q = y7Var;
    }

    @Override
    public final void invalidate() {
        View view = this.Q.f49127c;
        if (view != null) {
            view.invalidate();
        }
    }
}
