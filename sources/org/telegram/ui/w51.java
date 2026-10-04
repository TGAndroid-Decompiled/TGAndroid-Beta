package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w51 extends FrameLayout {
    public final Path f41919a;
    public final Paint f41920b;
    public final boolean f41921c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.d6 f41922e;
    public final Integer f41923f;
    public final c71 h;

    public w51(c71 c71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        super(context);
        this.h = c71Var;
        this.f41921c = z10;
        this.d = z11;
        this.f41922e = d6Var;
        this.f41923f = num;
        this.f41919a = new Path();
        this.f41920b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        c71 c71Var = this.h;
        if (!c71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f41921c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f41920b;
            if (z10) {
                org.telegram.ui.ActionBar.i6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, this.f41922e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f41923f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (c71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (c71Var.f35298a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, c71Var.f35301b1, height, getPaddingTop()), ((width - dp) * c71Var.f35298a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (c71Var.f35298a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * c71Var.f35298a1) + getPaddingLeft() + dp, (height * c71Var.f35301b1) + getPaddingTop());
            }
            Path path = this.f41919a;
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
