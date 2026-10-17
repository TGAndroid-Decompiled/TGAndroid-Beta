package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class t30 extends FrameLayout {
    public final RectF f41577a;
    public final RectF f41578b;
    public final RectF f41579c;
    public final Paint d;
    public final s50 e;

    public t30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = s50Var;
        this.f41577a = new RectF();
        this.f41578b = new RectF();
        this.f41579c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        s50 s50Var = this.e;
        u30 u30Var = s50Var.F;
        float y3 = u30Var.getY() + u30Var.getMeasuredHeight();
        ne.e eVar = s50Var.B3;
        RectF rectF = this.f41577a;
        rectF.set(0.0f, y3 - eVar.e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f41578b;
        rectF2.set(0.0f, u30Var.getY() + u30Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = u30Var.getY() + u30Var.getMeasuredHeight();
        RectF rectF3 = this.f41579c;
        rectF3.set(0.0f, (u30Var.getY() + u30Var.getMeasuredHeight()) - eVar.e, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && s50Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = s50Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(s50Var.Q2);
            canvas.restore();
            paint.setColor(234881023);
            canvas.drawRect(rectF2, paint);
        } else {
            paint.setColor(-14933463);
            canvas.drawRect(rectF3, paint);
            paint.setColor(i0.b.k(234881023, -14933463));
            canvas.drawRect(rectF2, paint);
        }
        super.dispatchDraw(canvas);
    }
}
