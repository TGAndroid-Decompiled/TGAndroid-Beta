package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class w1 extends View {
    public final int f52102a;
    public final z1 f52103b;

    public w1(z1 z1Var, Context context, int i10) {
        super(context);
        this.f52102a = i10;
        this.f52103b = z1Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f52102a) {
            case 0:
                z1 z1Var = this.f52103b;
                z1Var.f52257q.reset();
                z1Var.b(canvas, true);
                return;
            default:
                z1 z1Var2 = this.f52103b;
                z1Var2.f52257q.reset();
                z1Var2.f52257q.postTranslate(-getX(), (-getY()) + org.telegram.messenger.i0.f16166m);
                z1Var2.f52257q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                z1Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f52102a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f52103b.g();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
