package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class ti0 extends org.telegram.ui.Components.mo {
    public final xi0 f42071z0;

    public ti0(xi0 xi0Var, Context context) {
        super(context, null, false, null);
        this.f42071z0 = xi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        xi0 xi0Var = this.f42071z0;
        xi0Var.W.setImageCoords(xi0Var.f43617b0.getAvatarImageView().getX(), xi0Var.f43617b0.getAvatarImageView().getY(), xi0Var.f43617b0.getAvatarImageView().getWidth(), xi0Var.f43617b0.getAvatarImageView().getHeight());
        if (xi0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, xi0Var.W.getCenterX(), xi0Var.W.getCenterY());
            xi0Var.W.draw(canvas);
            canvas.restore();
        }
        if (xi0Var.X) {
            int centerX = (int) (xi0Var.W.getCenterX() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (xi0Var.W.getCenterY() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.k6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.k6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42071z0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42071z0.W.onDetachedFromWindow();
    }
}
