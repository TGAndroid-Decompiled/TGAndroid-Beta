package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class ui0 extends org.telegram.ui.Components.oo {
    public final yi0 f42452z0;

    public ui0(yi0 yi0Var, Context context) {
        super(context, null, false, null);
        this.f42452z0 = yi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yi0 yi0Var = this.f42452z0;
        yi0Var.W.setImageCoords(yi0Var.f43876b0.getAvatarImageView().getX(), yi0Var.f43876b0.getAvatarImageView().getY(), yi0Var.f43876b0.getAvatarImageView().getWidth(), yi0Var.f43876b0.getAvatarImageView().getHeight());
        if (yi0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, yi0Var.W.getCenterX(), yi0Var.W.getCenterY());
            yi0Var.W.draw(canvas);
            canvas.restore();
        }
        if (yi0Var.X) {
            int centerX = (int) (yi0Var.W.getCenterX() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (yi0Var.W.getCenterY() - (org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.k6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.k6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.k6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42452z0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42452z0.W.onDetachedFromWindow();
    }
}
