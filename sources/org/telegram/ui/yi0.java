package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class yi0 extends org.telegram.ui.Components.yn {
    public final cj0 f40286s0;

    public yi0(cj0 cj0Var, Context context) {
        super(context, null, false, null);
        this.f40286s0 = cj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        cj0 cj0Var = this.f40286s0;
        cj0Var.T.setImageCoords(cj0Var.Y.getAvatarImageView().getX(), cj0Var.Y.getAvatarImageView().getY(), cj0Var.Y.getAvatarImageView().getWidth(), cj0Var.Y.getAvatarImageView().getHeight());
        if (cj0Var.V) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, cj0Var.T.getCenterX(), cj0Var.T.getCenterY());
            cj0Var.T.draw(canvas);
            canvas.restore();
        }
        if (cj0Var.U) {
            int centerX = (int) (cj0Var.T.getCenterX() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (cj0Var.T.getCenterY() - (org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.j6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.j6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.j6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40286s0.T.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40286s0.T.onDetachedFromWindow();
    }
}
