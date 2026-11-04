package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class yb1 extends View {
    public final Paint f52253a;
    public final org.telegram.ui.Components.w8 f52254b;
    public org.telegram.ui.Components.ly0 f52255c;

    public yb1(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f52253a = paint;
        paint.setColor(-14538189);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(this, false);
        this.f52254b = w8Var;
        w8Var.f39960p = org.telegram.messenger.g0.L(100.0f);
        w8Var.f39959o = org.telegram.messenger.g0.L(30.0f);
        w8Var.f39967x = false;
        w8Var.f39963s = org.telegram.messenger.g0.L(24.0f);
        w8Var.h(org.telegram.messenger.g0.L(18.0f));
        w8Var.f39964t = 0.58f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f52255c == null) {
            return;
        }
        org.telegram.ui.Components.w8 w8Var = this.f52254b;
        float c2 = w8Var.c() + org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(7.0f) + this.f52255c.f35918c + org.telegram.messenger.g0.L(13.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getWidth() - c2) / 2.0f, 0.0f, (getWidth() + c2) / 2.0f, getHeight());
        float L = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        canvas.drawRoundRect(rectF, L, L, this.f52253a);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.g0.L(4.0f), 0.0f);
        w8Var.g(canvas);
        canvas.translate(w8Var.A + org.telegram.messenger.g0.L(7.0f), 0.0f);
        this.f52255c.c(0.0f, L, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(30.0f));
    }
}
