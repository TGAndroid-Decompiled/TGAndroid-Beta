package sh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class l2 extends u {
    public final p2 f47553s;

    public l2(p2 p2Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.f47553s = p2Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f47553s.f47618a0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
