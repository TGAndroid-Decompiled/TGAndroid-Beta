package sh;

import android.view.View;
import c8.m9;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.g51;
public final class i extends g51 {
    public final int f57579n3;

    public i(g2 g2Var, h hVar, int i7) {
        super(g2Var, hVar, null, null);
        this.f57579n3 = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(g0.L(220.0f), View.MeasureSpec.getSize(i7));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(m9.b(this.f57579n3, 1, 5) * 48), 1073741824));
    }
}
