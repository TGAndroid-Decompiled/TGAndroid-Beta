package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u51 extends FrameLayout {
    public final Path f41118a;
    public final Paint f41119b;
    public final boolean f41120c;
    public final boolean d;
    public final org.telegram.ui.ActionBar.d6 f41121e;
    public final Integer f41122f;
    public final a71 h;

    public u51(a71 a71Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.d6 d6Var, Integer num) {
        super(context);
        this.h = a71Var;
        this.f41120c = z10;
        this.d = z11;
        this.f41121e = d6Var;
        this.f41122f = num;
        this.f41118a = new Path();
        this.f41119b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float intValue;
        a71 a71Var = this.h;
        if (!a71Var.Q0) {
            super.dispatchDraw(canvas);
        } else if (this.f41120c) {
            canvas.save();
            boolean z10 = this.d;
            Paint paint = this.f41119b;
            if (z10) {
                org.telegram.ui.ActionBar.i6.m(paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, this.f41121e));
            paint.setAlpha((int) (getAlpha() * 255.0f));
            Integer num = this.f41122f;
            if (num == null) {
                intValue = getWidth() / 2.0f;
            } else {
                intValue = num.intValue();
            }
            float dp = intValue + AndroidUtilities.dp(20.0f);
            float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            if (a71Var.n()) {
                AndroidUtilities.rectTmp.set((dp - (a71Var.f34722a1 * dp)) + getPaddingLeft(), com.google.android.gms.internal.vision.e2.z(1.0f, a71Var.f34725b1, height, getPaddingTop()), ((width - dp) * a71Var.f34722a1) + getPaddingLeft() + dp, getPaddingTop() + height);
            } else {
                AndroidUtilities.rectTmp.set((dp - (a71Var.f34722a1 * dp)) + getPaddingLeft(), getPaddingTop(), ((width - dp) * a71Var.f34722a1) + getPaddingLeft() + dp, (height * a71Var.f34725b1) + getPaddingTop());
            }
            Path path = this.f41118a;
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
