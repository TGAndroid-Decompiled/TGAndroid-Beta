package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class uw0 extends FrameLayout {
    public org.telegram.ui.Components.r9 f43361a;
    public org.telegram.ui.Cells.s1 f43362b;
    public Drawable f43363c;
    public Drawable d;
    public org.telegram.ui.Components.g40 f43364e;
    public MessageObject f43365f;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f43364e.e(this.f43362b, null, 0, 0, false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f43362b.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.r9 r9Var = this.f43361a;
        if (r9Var != null) {
            r9Var.dispose();
            this.f43361a = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.d;
        Drawable s02 = org.telegram.ui.ActionBar.g6.s0();
        if (s02 != null && this.f43363c != s02) {
            org.telegram.ui.Components.r9 r9Var = this.f43361a;
            if (r9Var != null) {
                r9Var.dispose();
                this.f43361a = null;
            }
            this.f43363c = s02;
        }
        Drawable drawable2 = this.f43363c;
        if (!(drawable2 instanceof ColorDrawable) && !(drawable2 instanceof GradientDrawable) && !(drawable2 instanceof org.telegram.ui.Components.yb0)) {
            if (drawable2 instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable2).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f9 = 2.0f / AndroidUtilities.density;
                    canvas.scale(f9, f9);
                    this.f43363c.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f9), (int) Math.ceil(getMeasuredHeight() / f9));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.f43363c.getIntrinsicWidth(), measuredHeight / this.f43363c.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.f43363c.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(this.f43363c.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i10 = (measuredHeight - ceil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                    this.f43363c.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                }
                this.f43363c.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
        } else {
            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Drawable drawable3 = this.f43363c;
            if (drawable3 instanceof org.telegram.ui.Components.s9) {
                this.f43361a = ((org.telegram.ui.Components.s9) drawable3).c(canvas, this);
            } else {
                drawable3.draw(canvas);
            }
        }
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
