package th;

import android.content.Context;
import android.view.View;
public final class r7 extends jg.y0 {
    public final s7 Q;

    public r7(s7 s7Var, Context context, float f7) {
        super(context, f7);
        this.Q = s7Var;
    }

    @Override
    public final void invalidate() {
        View view = this.Q.f49450c;
        if (view != null) {
            view.invalidate();
        }
    }
}
