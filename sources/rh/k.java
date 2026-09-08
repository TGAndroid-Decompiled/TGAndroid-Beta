package rh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
public final class k extends d61 {
    public final int f45672f3;

    public k(n2 n2Var, j jVar, int i10) {
        super(n2Var, jVar, null, null);
        this.f45672f3 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(w7.p.b(this.f45672f3, 1, 5) * 48), 1073741824));
    }
}
