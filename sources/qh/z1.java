package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z1 extends View {
    public final int f46383a;
    public final c2 f46384b;

    public z1(c2 c2Var, Context context, int i10) {
        super(context);
        this.f46383a = i10;
        this.f46384b = c2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f46383a) {
            case 0:
                c2 c2Var = this.f46384b;
                c2Var.f45161q.reset();
                c2Var.b(canvas, true);
                return;
            default:
                c2 c2Var2 = this.f46384b;
                c2Var2.f45161q.reset();
                c2Var2.f45161q.postTranslate(-getX(), (-getY()) + AndroidUtilities.statusBarHeight);
                c2Var2.f45161q.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                c2Var2.b(canvas, false);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f46383a) {
            case 0:
                super.onMeasure(i10, i11);
                this.f46384b.g();
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
