package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class y30 extends FrameLayout {
    public final RectF f45835a;
    public final RectF f45836b;
    public final RectF f45837c;
    public final Paint d;
    public final x50 e;

    public y30(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = x50Var;
        this.f45835a = new RectF();
        this.f45836b = new RectF();
        this.f45837c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x50 x50Var = this.e;
        z30 z30Var = x50Var.F;
        float y3 = z30Var.getY() + z30Var.getMeasuredHeight();
        oe.e eVar = x50Var.B3;
        RectF rectF = this.f45835a;
        rectF.set(0.0f, y3 - eVar.f19333f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f45836b;
        rectF2.set(0.0f, z30Var.getY() + z30Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = z30Var.getY() + z30Var.getMeasuredHeight();
        RectF rectF3 = this.f45837c;
        rectF3.set(0.0f, (z30Var.getY() + z30Var.getMeasuredHeight()) - eVar.f19333f, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && x50Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = x50Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(x50Var.Q2);
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
