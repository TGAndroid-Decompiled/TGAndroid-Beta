package rh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class m2 extends v {
    public final q2 f43617s;

    public m2(q2 q2Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.f43617s = q2Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.f43617s.f43679a0 && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
            Point point = AndroidUtilities.displaySize;
            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
