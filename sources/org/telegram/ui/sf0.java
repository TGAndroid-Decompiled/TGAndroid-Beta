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
    public final int f42686a;
    public final tf0 f42687b;

    public sf0(tf0 tf0Var, int i9) {
        this.f42686a = i9;
        this.f42687b = tf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42686a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f42687b.h.requestFocus();
                    return;
                }
                return;
            default:
                tf0 tf0Var = this.f42687b;
                if (tf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) tf0Var.getParent()).removeView(tf0Var);
                }
                tf0Var.f42978c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42686a) {
            case 0:
                tf0 tf0Var = this.f42687b;
                tf0Var.f42978c.setVisibility(8);
                int measuredWidth = (int) (tf0Var.f42977b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (tf0Var.f42977b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                tf0Var.f42977b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                tf0Var.d.setBackground(new BitmapDrawable(tf0Var.getContext().getResources(), createBitmap));
                tf0Var.d.setAlpha(0.0f);
                tf0Var.d.setVisibility(0);
                tf0Var.f42977b.addView(tf0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
