package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.widget.FrameLayout;
public final class r30 extends FrameLayout {
    public final RectF f41050a;
    public final RectF f41051b;
    public final RectF f41052c;
    public final Paint d;
    public final q50 e;

    public r30(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = q50Var;
        this.f41050a = new RectF();
        this.f41051b = new RectF();
        this.f41052c = new RectF();
        this.d = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        q50 q50Var = this.e;
        s30 s30Var = q50Var.F;
        float y3 = s30Var.getY() + s30Var.getMeasuredHeight();
        ne.e eVar = q50Var.B3;
        RectF rectF = this.f41050a;
        rectF.set(0.0f, y3 - eVar.e, getMeasuredWidth(), getMeasuredHeight());
        RectF rectF2 = this.f41051b;
        rectF2.set(0.0f, s30Var.getY() + s30Var.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        float y10 = s30Var.getY() + s30Var.getMeasuredHeight();
        RectF rectF3 = this.f41052c;
        rectF3.set(0.0f, (s30Var.getY() + s30Var.getMeasuredHeight()) - eVar.e, getMeasuredWidth(), y10);
        int i10 = Build.VERSION.SDK_INT;
        Paint paint = this.d;
        if (i10 >= 29 && q50Var.Q2 != null && canvas.isHardwareAccelerated()) {
            paint.setColor(-14933463);
            canvas.drawRect(rectF, paint);
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(-getX(), -getY());
            float f7 = q50Var.R2;
            canvas.scale(f7, f7);
            canvas.drawRenderNode(q50Var.Q2);
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
