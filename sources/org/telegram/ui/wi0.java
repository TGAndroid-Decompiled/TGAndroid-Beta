package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class wi0 extends org.telegram.ui.Components.zn {
    public final aj0 f39751s0;

    public wi0(aj0 aj0Var, Context context) {
        super(context, null, false, null);
        this.f39751s0 = aj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        aj0 aj0Var = this.f39751s0;
        aj0Var.T.setImageCoords(aj0Var.Y.getAvatarImageView().getX(), aj0Var.Y.getAvatarImageView().getY(), aj0Var.Y.getAvatarImageView().getWidth(), aj0Var.Y.getAvatarImageView().getHeight());
        if (aj0Var.V) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, aj0Var.T.getCenterX(), aj0Var.T.getCenterY());
            aj0Var.T.draw(canvas);
            canvas.restore();
        }
        if (aj0Var.U) {
            int centerX = (int) (aj0Var.T.getCenterX() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (aj0Var.T.getCenterY() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.j6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.j6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39751s0.T.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39751s0.T.onDetachedFromWindow();
    }
}
