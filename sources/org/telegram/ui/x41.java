package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class x41 extends FrameLayout {
    public final Path f44461a;
    public final Paint f44462b;
    public final boolean f44463c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.c6 f44464e;
    public final Integer f44465f;
    public final d61 h;

    public x41(d61 d61Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        super(context);
        this.h = d61Var;
        this.f44463c = z10;
        this.d = z11;
        this.f44464e = c6Var;
        this.f44465f = num;
        this.f44461a = new Path();
        this.f44462b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        d61 d61Var = this.h;
        if (!d61Var.M0) {
            super.dispatchDraw(canvas);
        } else if (this.f44463c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f44462b;
            if (z10) {
                org.telegram.ui.ActionBar.g6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, this.f44464e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f44465f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (d61Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (d61Var.W0 * dp)) + getPaddingLeft(), com.google.android.recaptcha.internal.a.z(1.0f, d61Var.X0, height, getPaddingTop()), ((width - dp) * d61Var.W0) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (d61Var.W0 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * d61Var.W0) + getPaddingLeft() + dp, (height * d61Var.X0) + getPaddingTop());
            }
            Path path = this.f44461a;
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
