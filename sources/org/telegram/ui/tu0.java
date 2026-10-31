package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class tu0 extends FrameLayout {
    public org.telegram.ui.Components.e9 f41944a;
    public org.telegram.ui.Cells.q1 f41945b;
    public Drawable f41946c;
    public Drawable d;
    public org.telegram.ui.Components.q30 e;
    public org.telegram.messenger.jj f41947f;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.e.e(this.f41945b, null, 0, 0, false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f41945b.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e9 e9Var = this.f41944a;
        if (e9Var != null) {
            e9Var.dispose();
            this.f41944a = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.d;
        Drawable t02 = org.telegram.ui.ActionBar.t6.t0();
        if (t02 != null && this.f41946c != t02) {
            org.telegram.ui.Components.e9 e9Var = this.f41944a;
            if (e9Var != null) {
                e9Var.dispose();
                this.f41944a = null;
            }
            this.f41946c = t02;
        }
        Drawable drawable2 = this.f41946c;
        if (!(drawable2 instanceof ColorDrawable) && !(drawable2 instanceof GradientDrawable) && !(drawable2 instanceof org.telegram.ui.Components.jb0)) {
            if (drawable2 instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable2).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f7 = 2.0f / org.telegram.messenger.i0.f16025p;
                    canvas.scale(f7, f7);
                    this.f41946c.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.f41946c.getIntrinsicWidth(), measuredHeight / this.f41946c.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.f41946c.getIntrinsicWidth() * max);
                    int ceil2 = (int) Math.ceil(this.f41946c.getIntrinsicHeight() * max);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i10 = (measuredHeight - ceil2) / 2;
                    canvas.save();
                    canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                    this.f41946c.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                }
                this.f41946c.draw(canvas);
                canvas.restore();
            } else {
                super.onDraw(canvas);
            }
        } else {
            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Drawable drawable3 = this.f41946c;
            if (drawable3 instanceof org.telegram.ui.Components.f9) {
                this.f41944a = ((org.telegram.ui.Components.f9) drawable3).c(canvas, this);
            } else {
                drawable3.draw(canvas);
            }
        }
        if ((getParent() instanceof org.telegram.ui.Components.tk0) && ((org.telegram.ui.Components.tk0) getParent()).b1()) {
            return;
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
