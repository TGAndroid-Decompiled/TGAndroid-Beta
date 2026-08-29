package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class t30 extends FrameLayout {
    public final RectF f42535a;
    public final RectF f42536b;
    public final RectF f42537c;
    public final Paint d;
    public final r50 f42538e;

    public t30(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f42538e = r50Var;
        this.f42535a = new RectF();
        this.f42536b = new RectF();
        this.f42537c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        r50 r50Var = this.f42538e;
        u30 u30Var = r50Var.B;
        float y8 = u30Var.getY() + u30Var.getMeasuredHeight();
        vd.c cVar = r50Var.f41968x3;
        RectF rectF = this.f42535a;
        rectF.set(0.0f, y8 - cVar.f49510e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f42536b;
        rectF2.set(0.0f, u30Var.getY() + u30Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = u30Var.getY() + u30Var.getMeasuredHeight();
        RectF rectF3 = this.f42537c;
        rectF3.set(0.0f, (u30Var.getY() + u30Var.getMeasuredHeight()) - cVar.f49510e, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && r50Var.M2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f9 = r50Var.N2;
            canvas.scale(f9, f9);
            canvas.drawRenderNode(r50Var.M2);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.a.h(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
