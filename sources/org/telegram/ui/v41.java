package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v41 extends FrameLayout {
    public final Path f42606a;
    public final Paint f42607b;
    public final boolean f42608c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final Integer f42609f;
    public final b61 h;

    public v41(b61 b61Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.g6 g6Var, Integer num) {
        super(context);
        this.h = b61Var;
        this.f42608c = z10;
        this.d = z11;
        this.e = g6Var;
        this.f42609f = num;
        this.f42606a = new Path();
        this.f42607b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        b61 b61Var = this.h;
        if (!b61Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f42608c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f42607b;
            if (z10) {
                org.telegram.ui.ActionBar.k6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f42609f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (b61Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (b61Var.f35889a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.play_billing.k3.y(1.0f, b61Var.f35892b1, height, getPaddingTop()), ((width - dp) * b61Var.f35889a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (b61Var.f35889a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * b61Var.f35889a1) + getPaddingLeft() + dp, (height * b61Var.f35892b1) + getPaddingTop());
            }
            Path path = this.f42606a;
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
