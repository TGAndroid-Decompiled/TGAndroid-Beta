package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z41 extends FrameLayout {
    public final Path f46159a;
    public final Paint f46160b;
    public final boolean f46161c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final Integer f46162f;
    public final f61 h;

    public z41(f61 f61Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var, Integer num) {
        super(context);
        this.h = f61Var;
        this.f46161c = z10;
        this.d = z11;
        this.e = u6Var;
        this.f46162f = num;
        this.f46159a = new Path();
        this.f46160b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        f61 f61Var = this.h;
        if (!f61Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f46161c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f46160b;
            if (z10) {
                org.telegram.ui.ActionBar.y6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f46162f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (f61Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (f61Var.f39186a1 * dp)) + getPaddingLeft(), c3.h0.z(1.0f, f61Var.f39189b1, height, getPaddingTop()), ((width - dp) * f61Var.f39186a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (f61Var.f39186a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * f61Var.f39186a1) + getPaddingLeft() + dp, (height * f61Var.f39189b1) + getPaddingTop());
            }
            Path path = this.f46159a;
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
