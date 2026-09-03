package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class c7 extends LinearLayout {
    public final RectF f45182a;
    public final RectF f45183b;
    public final RectF f45184c;
    public final Paint d;
    public final d7 f45185e;

    public c7(d7 d7Var, Context context) {
        super(context);
        this.f45185e = d7Var;
        this.f45182a = new RectF();
        this.f45183b = new RectF();
        this.f45184c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        d7 d7Var = this.f45185e;
        if (i10 <= -1) {
            frameLayout = d7Var.f45236b;
        } else if (i10 >= 1) {
            frameLayout = d7Var.f45239f;
        } else {
            frameLayout = d7Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d7 d7Var = this.f45185e;
        RectF rectF = this.f45182a;
        a(rectF, (int) Math.floor(d7Var.f45241r));
        int ceil = (int) Math.ceil(d7Var.f45241r);
        RectF rectF2 = this.f45183b;
        a(rectF2, ceil);
        float f10 = d7Var.f45241r;
        float floor = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.f45184c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.15f, i0.a.d(d7Var.f45240n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
