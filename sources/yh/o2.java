package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
public final class o2 extends View {
    public final Paint f53004a;
    public final org.telegram.ui.Components.g6 f53005b;
    public final org.telegram.ui.Components.g6 f53006c;
    public float d;
    public float f53007e;

    public o2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f53004a = paint;
        f0 f0Var = new f0(this, 4);
        is isVar = is.h;
        this.f53005b = new org.telegram.ui.Components.g6(f0Var, 420L, isVar, 0);
        this.f53006c = new org.telegram.ui.Components.g6(new f0(this, 4), 420L, isVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float d = this.f53005b.d(this.d, false);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float e7 = this.f53006c.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.f53007e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int m12 = org.telegram.ui.ActionBar.i6.m1(0.25f, -1);
        Paint paint = this.f53004a;
        paint.setColor(m12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e7 > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.i6.m1(e7, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
