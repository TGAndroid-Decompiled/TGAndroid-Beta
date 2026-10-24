package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u41 extends FrameLayout {
    public final Path f42210a;
    public final Paint f42211b;
    public final boolean f42212c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final Integer f42213f;
    public final a61 h;

    public u41(a61 a61Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        super(context);
        this.h = a61Var;
        this.f42212c = z10;
        this.d = z11;
        this.e = g6Var;
        this.f42213f = num;
        this.f42210a = new Path();
        this.f42211b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        a61 a61Var = this.h;
        if (!a61Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f42212c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f42211b;
            if (z10) {
                org.telegram.ui.ActionBar.k6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f42213f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (a61Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (a61Var.f35606a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.play_billing.k3.y(1.0f, a61Var.f35609b1, height, getPaddingTop()), ((width - dp) * a61Var.f35606a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (a61Var.f35606a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * a61Var.f35606a1) + getPaddingLeft() + dp, (height * a61Var.f35609b1) + getPaddingTop());
            }
            Path path = this.f42210a;
            path.rewind();
            path.addRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
    }
}
