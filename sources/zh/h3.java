package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vl0;
public final class h3 extends vl0 implements q5 {
    public final z3 X2;
    public final z3 Y2;

    public h3(z3 z3Var, Context context, b bVar) {
        super(context, bVar);
        this.Y2 = z3Var;
        this.X2 = z3Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.X2.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.Y2.f49141n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
