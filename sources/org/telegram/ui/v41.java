package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v41 extends FrameLayout {
    public final Path f43380a;
    public final Paint f43381b;
    public final boolean f43382c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.b6 f43383e;
    public final Integer f43384f;
    public final b61 h;

    public v41(b61 b61Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var, Integer num) {
        super(context);
        this.h = b61Var;
        this.f43382c = z10;
        this.d = z11;
        this.f43383e = b6Var;
        this.f43384f = num;
        this.f43380a = new Path();
        this.f43381b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        b61 b61Var = this.h;
        if (!b61Var.M0) {
            super.dispatchDraw(canvas);
        } else if (this.f43382c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f43381b;
            if (z10) {
                org.telegram.ui.ActionBar.f6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, this.f43383e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f43384f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (b61Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (b61Var.W0 * dp)) + getPaddingLeft(), e2.c.z(1.0f, b61Var.X0, height, getPaddingTop()), ((width - dp) * b61Var.W0) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (b61Var.W0 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * b61Var.W0) + getPaddingLeft() + dp, (height * b61Var.X0) + getPaddingTop());
            }
            Path path = this.f43380a;
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
