package yg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.i51;
public final class k extends i51 {
    public final int f50245b3;

    public k(o2 o2Var, j jVar, int i9) {
        super(o2Var, jVar, null, null);
        this.f50245b3 = i9;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i9));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(g7.n.b(this.f50245b3, 1, 5) * 48), 1073741824));
    }
}
