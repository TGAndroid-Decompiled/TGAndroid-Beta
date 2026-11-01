package th;

import android.content.Context;
import android.view.View;
public final class s3 extends View {
    public final int f49449a;
    public final u3 f49450b;

    public s3(u3 u3Var, Context context, int i10) {
        super(context);
        this.f49449a = i10;
        this.f49450b = u3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f49449a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.f49450b.d.e), 1073741824));
                return;
            default:
                y3 y3Var = this.f49450b.d;
                int i12 = y3Var.f49693y.J;
                if (i12 >= y3Var.f49689r.getPaddingTop() && !y3Var.R) {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
        }
    }
}
