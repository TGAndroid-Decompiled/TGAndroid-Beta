package sh;

import android.view.View;
import c8.i9;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.u41;
public final class i extends u41 {
    public final int f56884n3;

    public i(e2 e2Var, h hVar, int i7) {
        super(e2Var, hVar, null, null);
        this.f56884n3 = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(g0.L(220.0f), View.MeasureSpec.getSize(i7));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(i9.b(this.f56884n3, 1, 5) * 48), 1073741824));
    }
}
