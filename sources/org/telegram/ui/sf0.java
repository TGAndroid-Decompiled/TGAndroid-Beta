package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sf0 extends AnimatorListenerAdapter {
    public final int f43496a;
    public final tf0 f43497b;

    public sf0(tf0 tf0Var, int i10) {
        this.f43496a = i10;
        this.f43497b = tf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43496a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f43497b.h.requestFocus();
                    return;
                }
                return;
            default:
                tf0 tf0Var = this.f43497b;
                if (tf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) tf0Var.getParent()).removeView(tf0Var);
                }
                tf0Var.f43824c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43496a) {
            case 0:
                tf0 tf0Var = this.f43497b;
                tf0Var.f43824c.setVisibility(8);
                int measuredWidth = (int) (tf0Var.f43823b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (tf0Var.f43823b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, false));
                tf0Var.f43823b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                tf0Var.d.setBackground(new BitmapDrawable(tf0Var.getContext().getResources(), createBitmap));
                tf0Var.d.setAlpha(0.0f);
                tf0Var.d.setVisibility(0);
                tf0Var.f43823b.addView(tf0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
