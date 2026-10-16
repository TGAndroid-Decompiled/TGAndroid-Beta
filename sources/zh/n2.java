package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public final class n2 extends View {
    public final Paint f50858a;
    public final org.telegram.ui.Components.g6 f50859b;
    public final org.telegram.ui.Components.g6 f50860c;
    public float d;
    public float e;

    public n2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f50858a = paint;
        zf.c cVar = new zf.c(this, 11);
        es esVar = es.h;
        this.f50859b = new org.telegram.ui.Components.g6(cVar, 420L, esVar, 0);
        this.f50860c = new org.telegram.ui.Components.g6(new zf.c(this, 11), 420L, esVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float d = this.f50859b.d(this.d, false);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float e = this.f50860c.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.25f, -1);
        Paint paint = this.f50858a;
        paint.setColor(m12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.g6.m1(e, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
