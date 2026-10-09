package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;
public final class o2 extends View {
    public final Paint f52960a;
    public final org.telegram.ui.Components.g6 f52961b;
    public final org.telegram.ui.Components.g6 f52962c;
    public float d;
    public float f52963e;

    public o2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f52960a = paint;
        f0 f0Var = new f0(this, 4);
        hs hsVar = hs.h;
        this.f52961b = new org.telegram.ui.Components.g6(f0Var, 420L, hsVar, 0);
        this.f52962c = new org.telegram.ui.Components.g6(new f0(this, 4), 420L, hsVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float d = this.f52961b.d(this.d, false);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float e7 = this.f52962c.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.f52963e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int m12 = org.telegram.ui.ActionBar.i6.m1(0.25f, -1);
        Paint paint = this.f52960a;
        paint.setColor(m12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e7 > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.i6.m1(e7, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
