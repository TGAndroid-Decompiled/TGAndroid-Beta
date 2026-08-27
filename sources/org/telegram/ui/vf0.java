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

    public final int f43443a;

    public final wf0 f43444b;

    public vf0(wf0 wf0Var, int i10) {
        this.f43443a = i10;
        this.f43444b = wf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43443a) {
            case 0:
                if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                    this.f43444b.h.requestFocus();
                }
                break;
            default:
                wf0 wf0Var = this.f43444b;
                if (wf0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) wf0Var.getParent()).removeView(wf0Var);
                }
                wf0Var.f44102c.setVisibility(0);
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43443a) {
            case 0:
                wf0 wf0Var = this.f43444b;
                wf0Var.f44102c.setVisibility(8);
                int measuredWidth = (int) (wf0Var.f44101b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (wf0Var.f44101b.getMeasuredHeight() / 10.0f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                wf0Var.f44101b.draw(canvas);
                Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                wf0Var.d.setBackground(new BitmapDrawable(wf0Var.getContext().getResources(), bitmapCreateBitmap));
                wf0Var.d.setAlpha(0.0f);
                wf0Var.d.setVisibility(0);
                wf0Var.f44101b.addView(wf0Var);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
