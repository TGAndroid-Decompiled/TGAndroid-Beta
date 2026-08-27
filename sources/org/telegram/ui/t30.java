package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;

public final class t30 extends FrameLayout {

    public final RectF f42771a;

    public final RectF f42772b;

    public final RectF f42773c;
    public final Paint d;

    public final s50 f42774e;

    public t30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f42774e = s50Var;
        this.f42771a = new RectF();
        this.f42772b = new RectF();
        this.f42773c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s50 s50Var = this.f42774e;
        u30 u30Var = s50Var.B;
        float y10 = u30Var.getY() + u30Var.getMeasuredHeight();
        ud.c cVar = s50Var.f42510x3;
        float f10 = y10 - cVar.f48502e;
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = this.f42771a;
        rectF.set(0.0f, f10, measuredWidth, measuredHeight);
        float y11 = u30Var.getY() + u30Var.getMeasuredHeight();
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        RectF rectF2 = this.f42772b;
        rectF2.set(0.0f, y11, measuredWidth2, measuredHeight2);
        float y12 = (u30Var.getY() + u30Var.getMeasuredHeight()) - cVar.f48502e;
        float measuredWidth3 = getMeasuredWidth();
        float y13 = u30Var.getY() + u30Var.getMeasuredHeight();
        RectF rectF3 = this.f42773c;
        rectF3.set(0.0f, y12, measuredWidth3, y13);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 < 29 || s50Var.M2 == null || !canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.b.h(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f11 = s50Var.N2;
            canvas.scale(f11, f11);
            canvas.drawRenderNode(s50Var.M2);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
