package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rf0 extends AnimatorListenerAdapter {
    public final int f40716a;
    public final sf0 f40717b;

    public rf0(sf0 sf0Var, int i10) {
        this.f40716a = i10;
        this.f40717b = sf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40716a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f40717b.h.requestFocus();
                    return;
                }
                return;
            default:
                sf0 sf0Var = this.f40717b;
                if (sf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) sf0Var.getParent()).removeView(sf0Var);
                }
                sf0Var.f41078c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40716a) {
            case 0:
                sf0 sf0Var = this.f40717b;
                sf0Var.f41078c.setVisibility(8);
                int measuredWidth = (int) (sf0Var.f41077b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (sf0Var.f41077b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                sf0Var.f41077b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                sf0Var.d.setBackground(new BitmapDrawable(sf0Var.getContext().getResources(), createBitmap));
                sf0Var.d.setAlpha(0.0f);
                sf0Var.d.setVisibility(0);
                sf0Var.f41077b.addView(sf0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
