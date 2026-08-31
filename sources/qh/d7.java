package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class d7 extends LinearLayout {
    public final RectF f45217a;
    public final RectF f45218b;
    public final RectF f45219c;
    public final Paint d;
    public final e7 f45220e;

    public d7(e7 e7Var, Context context) {
        super(context);
        this.f45220e = e7Var;
        this.f45217a = new RectF();
        this.f45218b = new RectF();
        this.f45219c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        e7 e7Var = this.f45220e;
        if (i10 <= -1) {
            frameLayout = e7Var.f45256b;
        } else if (i10 >= 1) {
            frameLayout = e7Var.f45259f;
        } else {
            frameLayout = e7Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e7 e7Var = this.f45220e;
        RectF rectF = this.f45217a;
        a(rectF, (int) Math.floor(e7Var.f45261r));
        int ceil = (int) Math.ceil(e7Var.f45261r);
        RectF rectF2 = this.f45218b;
        a(rectF2, ceil);
        float f10 = e7Var.f45261r;
        float floor = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.f45219c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.15f, i0.a.d(e7Var.f45260n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
