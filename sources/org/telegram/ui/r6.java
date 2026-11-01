package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class r6 extends View implements org.telegram.ui.ActionBar.k6 {
    public Paint f40977a;
    public Paint f40978b;
    public float f40979c;
    public org.telegram.ui.Components.t5 d;

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), this.f40978b);
        rectF.set(0.0f, 0.0f, this.d.e(false, this.f40979c) * getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), this.f40977a);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.f40977a;
            int i10 = org.telegram.ui.ActionBar.t6.N6;
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            this.f40978b.setColor(org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, i10, false)));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
