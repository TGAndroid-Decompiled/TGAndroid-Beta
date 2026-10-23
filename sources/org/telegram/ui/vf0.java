package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vf0 extends AnimatorListenerAdapter {
    public final int f42760a;
    public final wf0 f42761b;

    public vf0(wf0 wf0Var, int i10) {
        this.f42760a = i10;
        this.f42761b = wf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42760a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f42761b.h.requestFocus();
                    return;
                }
                return;
            default:
                wf0 wf0Var = this.f42761b;
                if (wf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) wf0Var.getParent()).removeView(wf0Var);
                }
                wf0Var.f43354c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42760a) {
            case 0:
                wf0 wf0Var = this.f42761b;
                wf0Var.f43354c.setVisibility(8);
                int measuredWidth = (int) (wf0Var.f43353b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (wf0Var.f43353b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
                wf0Var.f43353b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                wf0Var.d.setBackground(new BitmapDrawable(wf0Var.getContext().getResources(), createBitmap));
                wf0Var.d.setAlpha(0.0f);
                wf0Var.d.setVisibility(0);
                wf0Var.f43353b.addView(wf0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
