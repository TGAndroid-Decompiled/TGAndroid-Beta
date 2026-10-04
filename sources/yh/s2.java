package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class s2 extends View {
    public final Paint f51961a;
    public final org.telegram.ui.Components.e6 f51962b;
    public final org.telegram.ui.Components.e6 f51963c;
    public float d;
    public float f51964e;

    public s2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f51961a = paint;
        n2 n2Var = new n2(this, 1);
        tr trVar = tr.h;
        this.f51962b = new org.telegram.ui.Components.e6(n2Var, 420L, trVar, 0);
        this.f51963c = new org.telegram.ui.Components.e6(new n2(this, 1), 420L, trVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float d = this.f51962b.d(this.d, false);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float e7 = this.f51963c.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.f51964e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.25f, -1);
        Paint paint = this.f51961a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e7 > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.i6.l1(e7, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
