package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class t2 extends View {
    public final Paint f48083a;
    public final org.telegram.ui.Components.d6 f48084b;
    public final org.telegram.ui.Components.d6 f48085c;
    public float d;
    public float e;

    public t2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f48083a = paint;
        s2 s2Var = new s2(this, 0);
        qr qrVar = qr.h;
        this.f48084b = new org.telegram.ui.Components.d6(s2Var, 420L, qrVar, 0);
        this.f48085c = new org.telegram.ui.Components.d6(new s2(this, 0), 420L, qrVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float d = this.f48084b.d(this.d, false);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float e = this.f48085c.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.25f, -1);
        Paint paint = this.f48083a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(e, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
