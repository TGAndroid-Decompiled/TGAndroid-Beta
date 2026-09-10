package ph;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.r61;
public final class k extends r61 {
    public final int f40433f3;

    public k(p2 p2Var, j jVar, int i10) {
        super(p2Var, jVar, null, null);
        this.f40433f3 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w7.q.b(this.f40433f3, 1, 5) * 48), 1073741824));
    }
}
