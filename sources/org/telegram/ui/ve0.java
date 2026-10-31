package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
public final class ve0 extends AnimatorListenerAdapter {
    public final int f42715a;
    public final we0 f42716b;

    public ve0(we0 we0Var, int i10) {
        this.f42715a = i10;
        this.f42716b = we0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42715a) {
            case 0:
                if (org.telegram.messenger.i0.C1()) {
                    this.f42716b.h.requestFocus();
                    return;
                }
                return;
            default:
                we0 we0Var = this.f42716b;
                if (we0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) we0Var.getParent()).removeView(we0Var);
                }
                we0Var.f42960c.setVisibility(0);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42715a) {
            case 0:
                we0 we0Var = this.f42716b;
                we0Var.f42960c.setVisibility(8);
                int measuredWidth = (int) (we0Var.f42959b.getMeasuredWidth() / 10.0f);
                int measuredHeight = (int) (we0Var.f42959b.getMeasuredHeight() / 10.0f);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(0.1f, 0.1f);
                canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
                we0Var.f42959b.draw(canvas);
                Utilities.stackBlurBitmap(createBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                we0Var.d.setBackground(new BitmapDrawable(we0Var.getContext().getResources(), createBitmap));
                we0Var.d.setAlpha(0.0f);
                we0Var.d.setVisibility(0);
                we0Var.f42959b.addView(we0Var);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
