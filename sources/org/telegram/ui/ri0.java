package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public final class ri0 extends org.telegram.ui.Components.rn {

    public final vi0 f41943r0;

    public ri0(vi0 vi0Var, Context context) {
        super(context, null, false, null);
        this.f41943r0 = vi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vi0 vi0Var = this.f41943r0;
        vi0Var.S.setImageCoords(vi0Var.X.getAvatarImageView().getX(), vi0Var.X.getAvatarImageView().getY(), vi0Var.X.getAvatarImageView().getWidth(), vi0Var.X.getAvatarImageView().getHeight());
        if (vi0Var.U) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, vi0Var.S.getCenterX(), vi0Var.S.getCenterY());
            vi0Var.S.draw(canvas);
            canvas.restore();
        }
        if (vi0Var.T) {
            int centerX = (int) (vi0Var.S.getCenterX() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (vi0Var.S.getCenterY() - (org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.g6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.g6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.g6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41943r0.S.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41943r0.S.onDetachedFromWindow();
    }
}
