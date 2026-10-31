package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public final class v5 extends LinearLayout {
    public final RectF f52052a;
    public final RectF f52053b;
    public final RectF f52054c;
    public final Paint d;
    public final w5 e;

    public v5(w5 w5Var, Context context) {
        super(context);
        this.e = w5Var;
        this.f52052a = new RectF();
        this.f52053b = new RectF();
        this.f52054c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        w5 w5Var = this.e;
        if (i10 <= -1) {
            frameLayout = w5Var.f52091b;
        } else if (i10 >= 1) {
            frameLayout = w5Var.f52093f;
        } else {
            frameLayout = w5Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - org.telegram.messenger.i0.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w5 w5Var = this.e;
        RectF rectF = this.f52052a;
        a(rectF, (int) Math.floor(w5Var.f52095r));
        int ceil = (int) Math.ceil(w5Var.f52095r);
        RectF rectF2 = this.f52053b;
        a(rectF2, ceil);
        float f7 = w5Var.f52095r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f52054c;
        org.telegram.messenger.i0.Z1(rectF, rectF2, floor, rectF3);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, i0.b.f(w5Var.f52094n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(r12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
