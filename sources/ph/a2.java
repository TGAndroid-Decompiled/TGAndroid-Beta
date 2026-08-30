package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a2 extends View {
    public final int f41251a;
    public final d2 f41252b;

    public a2(d2 d2Var, Context context, int i10) {
        super(context);
        this.f41251a = i10;
        this.f41252b = d2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f41251a) {
            case 0:
                d2 d2Var = this.f41252b;
                d2Var.f41434q.reset();
                d2Var.b(canvas, true);
                return;
            default:
                d2 d2Var2 = this.f41252b;
                d2Var2.f41434q.reset();
                d2Var2.f41434q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                d2Var2.f41434q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                d2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f41251a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f41252b.g();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
