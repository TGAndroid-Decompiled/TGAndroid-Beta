package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class ri0 extends org.telegram.ui.Components.po {
    public final vi0 f43173z0;

    public ri0(vi0 vi0Var, Context context) {
        super(context, null, false, null);
        this.f43173z0 = vi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vi0 vi0Var = this.f43173z0;
        vi0Var.W.setImageCoords(vi0Var.f44823b0.getAvatarImageView().getX(), vi0Var.f44823b0.getAvatarImageView().getY(), vi0Var.f44823b0.getAvatarImageView().getWidth(), vi0Var.f44823b0.getAvatarImageView().getHeight());
        if (vi0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, vi0Var.W.getCenterX(), vi0Var.W.getCenterY());
            vi0Var.W.draw(canvas);
            canvas.restore();
        }
        if (vi0Var.X) {
            int centerX = (int) (vi0Var.W.getCenterX() - (org.telegram.ui.ActionBar.y6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (vi0Var.W.getCenterY() - (org.telegram.ui.ActionBar.y6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.y6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.y6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.y6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43173z0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43173z0.W.onDetachedFromWindow();
    }
}
