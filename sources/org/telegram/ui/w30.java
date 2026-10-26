package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class w30 extends FrameLayout {
    public final RectF f44963a;
    public final RectF f44964b;
    public final RectF f44965c;
    public final Paint d;
    public final v50 e;

    public w30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = v50Var;
        this.f44963a = new RectF();
        this.f44964b = new RectF();
        this.f44965c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        v50 v50Var = this.e;
        x30 x30Var = v50Var.F;
        float y3 = x30Var.getY() + x30Var.getMeasuredHeight();
        oe.e eVar = v50Var.B3;
        RectF rectF = this.f44963a;
        rectF.set(0.0f, y3 - eVar.f19334f, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f44964b;
        rectF2.set(0.0f, x30Var.getY() + x30Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = x30Var.getY() + x30Var.getMeasuredHeight();
        RectF rectF3 = this.f44965c;
        rectF3.set(0.0f, (x30Var.getY() + x30Var.getMeasuredHeight()) - eVar.f19334f, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && v50Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = v50Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(v50Var.Q2);
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
