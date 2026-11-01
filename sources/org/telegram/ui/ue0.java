package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class ue0 extends AnimatorListenerAdapter {
    public final int f41923a;
    public final ve0 f41924b;

    public ue0(ve0 ve0Var, int i10) {
        this.f41923a = i10;
        this.f41924b = ve0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41923a) {
            case 0:
                if (org.telegram.messenger.i0.C1()) {
                    this.f41924b.h.requestFocus();
                    return;
                }
                return;
            default:
                ve0 ve0Var = this.f41924b;
                if (ve0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) ve0Var.getParent()).removeView(ve0Var);
                }
                ve0Var.f42509c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41923a) {
            case 0:
                ve0 ve0Var = this.f41924b;
                ve0Var.f42509c.setVisibility(8);
                int measuredWidth = (int) (ve0Var.f42508b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (ve0Var.f42508b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false));
                ve0Var.f42508b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                ve0Var.d.setBackground(new BitmapDrawable(ve0Var.getContext().getResources(), createBitmap));
                ve0Var.d.setAlpha(0.0f);
                ve0Var.d.setVisibility(0);
                ve0Var.f42508b.addView(ve0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
