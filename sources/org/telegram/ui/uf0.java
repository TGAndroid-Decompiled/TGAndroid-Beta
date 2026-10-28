package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class uf0 extends AnimatorListenerAdapter {
    public final int f44013a;
    public final vf0 f44014b;

    public uf0(vf0 vf0Var, int i10) {
        this.f44013a = i10;
        this.f44014b = vf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44013a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f44014b.h.requestFocus();
                    return;
                }
                return;
            default:
                vf0 vf0Var = this.f44014b;
                if (vf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) vf0Var.getParent()).removeView(vf0Var);
                }
                vf0Var.f44334c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44013a) {
            case 0:
                vf0 vf0Var = this.f44014b;
                vf0Var.f44334c.setVisibility(8);
                int measuredWidth = (int) (vf0Var.f44333b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (vf0Var.f44333b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
                vf0Var.f44333b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                vf0Var.d.setBackground(new BitmapDrawable(vf0Var.getContext().getResources(), createBitmap));
                vf0Var.d.setAlpha(0.0f);
                vf0Var.d.setVisibility(0);
                vf0Var.f44333b.addView(vf0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
