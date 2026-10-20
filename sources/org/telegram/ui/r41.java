package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r41 extends FrameLayout {
    public final Path f41058a;
    public final Paint f41059b;
    public final boolean f41060c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final Integer f41061f;
    public final x51 h;

    public r41(x51 x51Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        super(context);
        this.h = x51Var;
        this.f41060c = z10;
        this.d = z11;
        this.e = d6Var;
        this.f41061f = num;
        this.f41058a = new Path();
        this.f41059b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        x51 x51Var = this.h;
        if (!x51Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f41060c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f41059b;
            if (z10) {
                org.telegram.ui.ActionBar.h6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f41061f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (x51Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (x51Var.f43045a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.play_billing.k3.y(1.0f, x51Var.f43048b1, height, getPaddingTop()), ((width - dp) * x51Var.f43045a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (x51Var.f43045a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * x51Var.f43045a1) + getPaddingLeft() + dp, (height * x51Var.f43048b1) + getPaddingTop());
            }
            Path path = this.f41058a;
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
