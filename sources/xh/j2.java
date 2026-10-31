package xh;

import android.graphics.Point;
import android.view.View;
public final class j2 extends org.telegram.ui.ActionBar.l {
    @Override
    public final void onMeasure(int i10, int i11) {
        if (org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.P1()) {
            Point point = org.telegram.messenger.i0.f16026q;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
