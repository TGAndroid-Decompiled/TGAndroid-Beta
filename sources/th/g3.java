package th;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.tk0;
public final class g3 extends tk0 implements l5 {
    public final y3 f48996e3;
    public final y3 f48997f3;

    public g3(y3 y3Var, Context context, b bVar) {
        super(context, bVar);
        this.f48997f3 = y3Var;
        this.f48996e3 = y3Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = org.telegram.messenger.i0.L(this.f48996e3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f48997f3.f49674n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
