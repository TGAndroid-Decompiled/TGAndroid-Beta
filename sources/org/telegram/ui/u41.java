package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class u41 extends FrameLayout {

    public final Path f43112a;

    public final Paint f43113b;

    public final boolean f43114c;
    public final boolean d;

    public final org.telegram.ui.ActionBar.c6 f43115e;

    public final Integer f43116f;
    public final a61 h;

    public u41(a61 a61Var, Context context, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var, Integer num) {
        super(context);
        this.h = a61Var;
        this.f43114c = z10;
        this.d = z11;
        this.f43115e = c6Var;
        this.f43116f = num;
        this.f43112a = new Path();
        this.f43113b = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a61 a61Var = this.h;
        if (!a61Var.M0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.f43114c) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        boolean z10 = this.d;
        Paint paint = this.f43113b;
        if (z10) {
            org.telegram.ui.ActionBar.g6.m(paint);
        }
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, this.f43115e));
        paint.setAlpha((int) (getAlpha() * 255.0f));
        Integer num = this.f43116f;
        float width = (num == null ? getWidth() / 2.0f : num.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (a61Var.n()) {
            AndroidUtilities.rectTmp.set((width - (a61Var.W0 * width)) + getPaddingLeft(), com.google.android.recaptcha.internal.a.z(1.0f, a61Var.X0, height, getPaddingTop()), ((width2 - width) * a61Var.W0) + getPaddingLeft() + width, getPaddingTop() + height);
        } else {
            AndroidUtilities.rectTmp.set((width - (a61Var.W0 * width)) + getPaddingLeft(), getPaddingTop(), ((width2 - width) * a61Var.W0) + getPaddingLeft() + width, (height * a61Var.X0) + getPaddingTop());
        }
        Path path = this.f43112a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}
