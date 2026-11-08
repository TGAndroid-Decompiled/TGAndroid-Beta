package sh;

import android.view.View;
import c8.j9;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.q41;
public final class i extends q41 {
    public final int f55319m3;

    public i(f2 f2Var, h hVar, int i7) {
        super(f2Var, hVar, null, null);
        this.f55319m3 = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(g0.L(220.0f), View.MeasureSpec.getSize(i7));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(j9.b(this.f55319m3, 1, 5) * 48), 1073741824));
    }
}
