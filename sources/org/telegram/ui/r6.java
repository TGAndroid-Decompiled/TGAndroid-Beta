package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class r6 extends View implements org.telegram.ui.ActionBar.a6 {
    public Paint f49390a;
    public Paint f49391b;
    public float f49392c;
    public org.telegram.ui.Components.w5 d;

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.f49391b);
        rectF.set(0.0f, 0.0f, this.d.e(false, this.f49392c) * getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.f49390a);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.f49390a;
            int i7 = org.telegram.ui.ActionBar.k6.N6;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            this.f49391b.setColor(org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, i7, false)));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
