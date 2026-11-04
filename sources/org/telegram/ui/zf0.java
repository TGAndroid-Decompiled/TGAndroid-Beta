package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class zf0 extends org.telegram.ui.Components.jn {
    public final dg0 B0;

    public zf0(dg0 dg0Var, Context context) {
        super(context, null, false, null);
        this.B0 = dg0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dg0 dg0Var = this.B0;
        dg0Var.X.y0(dg0Var.f44696c0.getAvatarImageView().getX(), dg0Var.f44696c0.getAvatarImageView().getY(), dg0Var.f44696c0.getAvatarImageView().getWidth(), dg0Var.f44696c0.getAvatarImageView().getHeight());
        if (dg0Var.Z) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, dg0Var.X.r(), dg0Var.X.s());
            dg0Var.X.h(canvas, null);
            canvas.restore();
        }
        if (dg0Var.Y) {
            int r5 = (int) (dg0Var.X.r() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicWidth() / 2));
            int s6 = (int) (dg0Var.X.s() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.k6.U0;
            drawable.setBounds(r5, s6, drawable.getIntrinsicWidth() + r5, org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() + s6);
            org.telegram.ui.ActionBar.k6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B0.X.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0.X.R();
    }
}
