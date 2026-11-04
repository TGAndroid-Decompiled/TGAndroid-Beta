package th;

import android.view.View;
import b8.be;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.l41;
public final class i extends l41 {
    public final int f55425n3;

    public i(d2 d2Var, h hVar, int i3) {
        super(d2Var, hVar, null, null);
        this.f55425n3 = i3;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int min = Math.min(g0.L(220.0f), View.MeasureSpec.getSize(i3));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(be.b(this.f55425n3, 1, 5) * 48), 1073741824));
    }
}
