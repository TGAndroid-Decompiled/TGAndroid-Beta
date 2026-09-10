package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t3 extends View {
    public final int f48896a;
    public final v3 f48897b;

    public t3(v3 v3Var, Context context, int i10) {
        super(context);
        this.f48896a = i10;
        this.f48897b = v3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f48896a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f48897b.d.e), 1073741824));
                return;
            default:
                z3 z3Var = this.f48897b.d;
                int i12 = z3Var.f49145x.J;
                if (i12 >= z3Var.f49142r.getPaddingTop() && !z3Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
