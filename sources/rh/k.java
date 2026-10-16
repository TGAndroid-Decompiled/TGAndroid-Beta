package rh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.i71;
public final class k extends i71 {
    public final int f44449d3;

    public k(m2 m2Var, j jVar, int i10) {
        super(m2Var, jVar, null, null);
        this.f44449d3 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w7.r.b(this.f44449d3, 1, 5) * 48), 1073741824));
    }
}
