package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class xi0 extends org.telegram.ui.Components.ao {
    public final bj0 f43058s0;

    public xi0(bj0 bj0Var, Context context) {
        super(context, null, false, null);
        this.f43058s0 = bj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        bj0 bj0Var = this.f43058s0;
        bj0Var.T.setImageCoords(bj0Var.Y.getAvatarImageView().getX(), bj0Var.Y.getAvatarImageView().getY(), bj0Var.Y.getAvatarImageView().getWidth(), bj0Var.Y.getAvatarImageView().getHeight());
        if (bj0Var.V) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, bj0Var.T.getCenterX(), bj0Var.T.getCenterY());
            bj0Var.T.draw(canvas);
            canvas.restore();
        }
        if (bj0Var.U) {
            int centerX = (int) (bj0Var.T.getCenterX() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (bj0Var.T.getCenterY() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.k6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.k6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43058s0.T.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43058s0.T.onDetachedFromWindow();
    }
}
