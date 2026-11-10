package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class rd0 extends AnimatorListenerAdapter {
    public final int f49395a;
    public final sd0 f49396b;

    public rd0(sd0 sd0Var, int i7) {
        this.f49395a = i7;
        this.f49396b = sd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49395a) {
            case 0:
                if (org.telegram.messenger.g0.C1()) {
                    this.f49396b.h.requestFocus();
                    return;
                }
                return;
            default:
                sd0 sd0Var = this.f49396b;
                if (sd0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) sd0Var.getParent()).removeView(sd0Var);
                }
                sd0Var.f49835c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f49395a) {
            case 0:
                sd0 sd0Var = this.f49396b;
                sd0Var.f49835c.setVisibility(8);
                int measuredWidth = (int) (sd0Var.f49834b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (sd0Var.f49834b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
                sd0Var.f49834b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                sd0Var.d.setBackground(new BitmapDrawable(sd0Var.getContext().getResources(), createBitmap));
                sd0Var.d.setAlpha(0.0f);
                sd0Var.d.setVisibility(0);
                sd0Var.f49834b.addView(sd0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
