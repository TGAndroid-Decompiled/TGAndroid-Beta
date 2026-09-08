package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class s2 extends View {
    public final Paint f52589a;
    public final org.telegram.ui.Components.e6 f52590b;
    public final org.telegram.ui.Components.e6 f52591c;
    public float d;
    public float f52592e;

    public s2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f52589a = paint;
        m2 m2Var = new m2(this, 2);
        pr prVar = pr.h;
        this.f52590b = new org.telegram.ui.Components.e6(m2Var, 420L, prVar, 0);
        this.f52591c = new org.telegram.ui.Components.e6(new m2(this, 2), 420L, prVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float d = this.f52590b.d(this.d, false);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float e7 = this.f52591c.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.f52592e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.25f, -1);
        Paint paint = this.f52589a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e7 > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(e7, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
