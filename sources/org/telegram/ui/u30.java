package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class u30 extends FrameLayout {
    public final RectF f42147a;
    public final RectF f42148b;
    public final RectF f42149c;
    public final Paint d;
    public final u50 e;

    public u30(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = u50Var;
        this.f42147a = new RectF();
        this.f42148b = new RectF();
        this.f42149c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        u50 u50Var = this.e;
        v30 v30Var = u50Var.F;
        float y3 = v30Var.getY() + v30Var.getMeasuredHeight();
        ne.e eVar = u50Var.B3;
        RectF rectF = this.f42147a;
        rectF.set(0.0f, y3 - eVar.e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f42148b;
        rectF2.set(0.0f, v30Var.getY() + v30Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = v30Var.getY() + v30Var.getMeasuredHeight();
        RectF rectF3 = this.f42149c;
        rectF3.set(0.0f, (v30Var.getY() + v30Var.getMeasuredHeight()) - eVar.e, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && u50Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = u50Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(u50Var.Q2);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.a.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
