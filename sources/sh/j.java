package sh;

import android.view.View;
import c8.l9;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.e51;
public final class j extends e51 {
    public final int f57460n3;

    public j(h2 h2Var, i iVar, int i7) {
        super(h2Var, iVar, null, null);
        this.f57460n3 = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(g0.L(220.0f), View.MeasureSpec.getSize(i7));
        View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(l9.b(this.f57460n3, 1, 5) * 48), 1073741824));
    }
}
