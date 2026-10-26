package sh;

import a8.ee;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.r71;
public final class k extends r71 {
    public final int f48656n3;

    public k(r2 r2Var, j jVar, int i10) {
        super(r2Var, jVar, null, null);
        this.f48656n3 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(ee.b(this.f48656n3, 1, 5) * 48), 1073741824));
    }
}
