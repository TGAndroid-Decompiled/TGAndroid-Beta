package zf;

import android.content.Context;
import org.telegram.ui.ActionBar.b6;
public final class y extends p0 {
    public final j0 L;

    public y(j0 j0Var, Context context, b6 b6Var) {
        super(context, b6Var, true);
        this.L = j0Var;
    }

    @Override
    public final void invalidate() {
        if (this.L.f50533b0) {
            return;
        }
        super.invalidate();
    }
}
