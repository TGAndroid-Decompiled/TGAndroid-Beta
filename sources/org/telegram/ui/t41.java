package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class t41 extends FrameLayout {
    public final Path f41587a;
    public final Paint f41588b;
    public final boolean f41589c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final Integer f41590f;
    public final z51 h;

    public t41(z51 z51Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        super(context);
        this.h = z51Var;
        this.f41589c = z10;
        this.d = z11;
        this.e = d6Var;
        this.f41590f = num;
        this.f41587a = new Path();
        this.f41588b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        z51 z51Var = this.h;
        if (!z51Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f41589c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f41588b;
            if (z10) {
                org.telegram.ui.ActionBar.h6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f41590f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (z51Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (z51Var.f43580a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.cast.a6.x(1.0f, z51Var.f43583b1, height, getPaddingTop()), ((width - dp) * z51Var.f43580a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (z51Var.f43580a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * z51Var.f43580a1) + getPaddingLeft() + dp, (height * z51Var.f43583b1) + getPaddingTop());
            }
            Path path = this.f41587a;
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
