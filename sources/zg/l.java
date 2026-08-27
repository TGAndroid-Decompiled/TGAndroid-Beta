package zg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.k51;

public final class l extends k51 {

    public final int f50843b3;

    public l(n2 n2Var, k kVar, int i10) {
        super(n2Var, kVar, null, null);
        this.f50843b3 = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iMin = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i10));
        View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(h7.n.b(this.f50843b3, 1, 5) * 48), 1073741824));
    }
}
