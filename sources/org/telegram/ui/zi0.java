package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class zi0 extends org.telegram.ui.Components.go {
    public final dj0 f40512v0;

    public zi0(dj0 dj0Var, Context context) {
        super(context, null, false, null);
        this.f40512v0 = dj0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dj0 dj0Var = this.f40512v0;
        dj0Var.W.setImageCoords(dj0Var.f33134b0.getAvatarImageView().getX(), dj0Var.f33134b0.getAvatarImageView().getY(), dj0Var.f33134b0.getAvatarImageView().getWidth(), dj0Var.f33134b0.getAvatarImageView().getHeight());
        if (dj0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, dj0Var.W.getCenterX(), dj0Var.W.getCenterY());
            dj0Var.W.draw(canvas);
            canvas.restore();
        }
        if (dj0Var.X) {
            int centerX = (int) (dj0Var.W.getCenterX() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (dj0Var.W.getCenterY() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.h6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.h6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40512v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40512v0.W.onDetachedFromWindow();
    }
}
