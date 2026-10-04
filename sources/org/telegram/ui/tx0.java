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
public final class tx0 extends FrameLayout {
    public org.telegram.ui.Components.u9 f40985a;
    public org.telegram.ui.Cells.u1 f40986b;
    public Drawable f40987c;
    public Drawable d;
    public org.telegram.ui.Components.m40 f40988e;
    public MessageObject f40989f;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f40988e.e(this.f40986b, null, 0, 0, false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f40986b.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.u9 u9Var = this.f40985a;
        if (u9Var != null) {
            u9Var.dispose();
            this.f40985a = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.d;
        Drawable s02 = org.telegram.ui.ActionBar.i6.s0();
        if (s02 != null && this.f40987c != s02) {
            org.telegram.ui.Components.u9 u9Var = this.f40985a;
            if (u9Var != null) {
                u9Var.dispose();
                this.f40985a = null;
            }
            this.f40987c = s02;
        }
        Drawable drawable2 = this.f40987c;
        if (!(drawable2 instanceof ColorDrawable) && !(drawable2 instanceof GradientDrawable) && !(drawable2 instanceof org.telegram.ui.Components.pc0)) {
            if (drawable2 instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable2).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f7 = 2.0f / AndroidUtilities.density;
                    canvas.scale(f7, f7);
                    this.f40987c.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.f40987c.getIntrinsicWidth(), measuredHeight / this.f40987c.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.f40987c.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(this.f40987c.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i10 = (measuredHeight - ceil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                    this.f40987c.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                }
                this.f40987c.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
        } else {
            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Drawable drawable3 = this.f40987c;
            if (drawable3 instanceof org.telegram.ui.Components.v9) {
                this.f40985a = ((org.telegram.ui.Components.v9) drawable3).c(canvas, this);
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
