package sg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;
public final class l extends d0 {
    public final o f48398c2;

    public l(o oVar, Context context, p6 p6Var, int i10) {
        super(i10, context, p6Var);
        this.f48398c2 = oVar;
    }

    @Override
    public final void F(int i10, int i11) {
        if (i11 > i10) {
            this.f48398c2.E.w0(0, org.telegram.messenger.i0.L(30.0f), null);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 != 2131296494 && i10 != 16908320) {
            if (i10 != 16908322 && i10 != 16908321) {
                return super.onTextContextMenuItem(i10);
            }
            return false;
        }
        return this.f48398c2.g0();
    }
}
