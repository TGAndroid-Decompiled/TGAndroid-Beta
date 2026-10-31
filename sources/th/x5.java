package th;

import android.content.Context;
import android.view.View;
public final class x5 extends z2 {
    public final y5 O3;

    public x5(y5 y5Var, Context context, o7 o7Var, x2 x2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, o7Var, x2Var, p6Var);
        this.O3 = y5Var;
    }

    @Override
    public final boolean I0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.O3.f49684f.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (p.f49348c) {
            p.f49347b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (p.f49348c) {
            p.f49347b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
