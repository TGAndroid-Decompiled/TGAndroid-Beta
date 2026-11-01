package xh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.ui.ActionBar.p6;
public final class i2 extends r {
    public final m2 f53817s;

    public i2(m2 m2Var, Context context, p6 p6Var) {
        super(context, p6Var);
        this.f53817s = m2Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f53817s.f53898e0 && org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.P1()) {
            Point point = org.telegram.messenger.i0.f16172q;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
