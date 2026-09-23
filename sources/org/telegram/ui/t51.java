package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class t51 extends FrameLayout {
    public final Path f37533a;
    public final Paint f37534b;
    public final boolean f37535c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final Integer f37536f;
    public final z61 h;

    public t51(z61 z61Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        super(context);
        this.h = z61Var;
        this.f37535c = z10;
        this.d = z11;
        this.e = d6Var;
        this.f37536f = num;
        this.f37533a = new Path();
        this.f37534b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        z61 z61Var = this.h;
        if (!z61Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f37535c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f37534b;
            if (z10) {
                org.telegram.ui.ActionBar.h6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f37536f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (z61Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (z61Var.f40005a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, z61Var.f40008b1, height, getPaddingTop()), ((width - dp) * z61Var.f40005a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (z61Var.f40005a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * z61Var.f40005a1) + getPaddingLeft() + dp, (height * z61Var.f40008b1) + getPaddingTop());
            }
            Path path = this.f37533a;
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
