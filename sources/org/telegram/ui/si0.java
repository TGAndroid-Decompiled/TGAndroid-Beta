package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
public final class si0 extends org.telegram.ui.Components.oo {
    public final wi0 f41119v0;

    public si0(wi0 wi0Var, Context context) {
        super(context, null, false, null);
        this.f41119v0 = wi0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        wi0 wi0Var = this.f41119v0;
        wi0Var.W.setImageCoords(wi0Var.f42866b0.getAvatarImageView().getX(), wi0Var.f42866b0.getAvatarImageView().getY(), wi0Var.f42866b0.getAvatarImageView().getWidth(), wi0Var.f42866b0.getAvatarImageView().getHeight());
        if (wi0Var.Y) {
            canvas.save();
            canvas.scale(0.9f, 0.9f, wi0Var.W.getCenterX(), wi0Var.W.getCenterY());
            wi0Var.W.draw(canvas);
            canvas.restore();
        }
        if (wi0Var.X) {
            int centerX = (int) (wi0Var.W.getCenterX() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicWidth() / 2));
            int centerY = (int) (wi0Var.W.getCenterY() - (org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() / 2));
            Drawable drawable = org.telegram.ui.ActionBar.h6.U0;
            drawable.setBounds(centerX, centerY, drawable.getIntrinsicWidth() + centerX, org.telegram.ui.ActionBar.h6.U0.getIntrinsicHeight() + centerY);
            org.telegram.ui.ActionBar.h6.U0.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41119v0.W.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41119v0.W.onDetachedFromWindow();
    }
}
