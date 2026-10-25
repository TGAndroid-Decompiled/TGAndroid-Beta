package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w41 extends FrameLayout {
    public final Path f44972a;
    public final Paint f44973b;
    public final boolean f44974c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final Integer f44975f;
    public final c61 h;

    public w41(c61 c61Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.u6 u6Var, Integer num) {
        super(context);
        this.h = c61Var;
        this.f44974c = z10;
        this.d = z11;
        this.e = u6Var;
        this.f44975f = num;
        this.f44972a = new Path();
        this.f44973b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        c61 c61Var = this.h;
        if (!c61Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f44974c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f44973b;
            if (z10) {
                org.telegram.ui.ActionBar.y6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f44975f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (c61Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (c61Var.f38280a1 * dp)) + getPaddingLeft(), c3.h0.z(1.0f, c61Var.f38283b1, height, getPaddingTop()), ((width - dp) * c61Var.f38280a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (c61Var.f38280a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * c61Var.f38280a1) + getPaddingLeft() + dp, (height * c61Var.f38283b1) + getPaddingTop());
            }
            Path path = this.f44972a;
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
