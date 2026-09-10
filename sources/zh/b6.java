package zh;

import android.content.Context;
import android.view.View;
public final class b6 extends a3 {
    public final c6 f48311e4;

    public b6(c6 c6Var, Context context, u7 u7Var, y2 y2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, u7Var, y2Var, f6Var);
        this.f48311e4 = c6Var;
    }

    @Override
    public final boolean K0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f48311e4.f48328g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (p.f48762c) {
            p.f48761b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (p.f48762c) {
            p.f48761b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
