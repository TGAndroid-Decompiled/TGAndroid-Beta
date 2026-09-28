package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u51 extends FrameLayout {
    public final Path f38327a;
    public final Paint f38328b;
    public final boolean f38329c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final Integer f38330f;
    public final a71 h;

    public u51(a71 a71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        super(context);
        this.h = a71Var;
        this.f38329c = z10;
        this.d = z11;
        this.e = d6Var;
        this.f38330f = num;
        this.f38327a = new Path();
        this.f38328b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        a71 a71Var = this.h;
        if (!a71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f38329c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f38328b;
            if (z10) {
                org.telegram.ui.ActionBar.h6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, this.e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f38330f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (a71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (a71Var.f32012a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, a71Var.f32015b1, height, getPaddingTop()), ((width - dp) * a71Var.f32012a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (a71Var.f32012a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * a71Var.f32012a1) + getPaddingLeft() + dp, (height * a71Var.f32015b1) + getPaddingTop());
            }
            Path path = this.f38327a;
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
