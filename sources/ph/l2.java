package ph;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
public final class l2 extends u {
    public final p2 f45892s;

    public l2(p2 p2Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.f45892s = p2Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f45892s.Z && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
