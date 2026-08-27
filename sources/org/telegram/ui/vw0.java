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

public final class vw0 extends FrameLayout {

    public org.telegram.ui.Components.l9 f43534a;

    public org.telegram.ui.Cells.s1 f43535b;

    public Drawable f43536c;
    public Drawable d;

    public org.telegram.ui.Components.x30 f43537e;

    public MessageObject f43538f;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f43537e.e(this.f43535b, null, 0, 0, false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f43535b.invalidate();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.l9 l9Var = this.f43534a;
        if (l9Var != null) {
            l9Var.dispose();
            this.f43534a = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.d;
        Drawable drawableS0 = org.telegram.ui.ActionBar.g6.s0();
        if (drawableS0 != null && this.f43536c != drawableS0) {
            org.telegram.ui.Components.l9 l9Var = this.f43534a;
            if (l9Var != null) {
                l9Var.dispose();
                this.f43534a = null;
            }
            this.f43536c = drawableS0;
        }
        Drawable drawable2 = this.f43536c;
        if ((drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable) || (drawable2 instanceof org.telegram.ui.Components.nb0)) {
            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Drawable drawable3 = this.f43536c;
            if (drawable3 instanceof org.telegram.ui.Components.m9) {
                this.f43534a = ((org.telegram.ui.Components.m9) drawable3).c(canvas, this);
            } else {
                drawable3.draw(canvas);
            }
        } else if (drawable2 instanceof BitmapDrawable) {
            if (((BitmapDrawable) drawable2).getTileModeX() == Shader.TileMode.REPEAT) {
                canvas.save();
                float f10 = 2.0f / AndroidUtilities.density;
                canvas.scale(f10, f10);
                this.f43536c.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
            } else {
                int measuredHeight = getMeasuredHeight();
                float fMax = Math.max(getMeasuredWidth() / this.f43536c.getIntrinsicWidth(), measuredHeight / this.f43536c.getIntrinsicHeight());
                int iCeil = (int) Math.ceil(this.f43536c.getIntrinsicWidth() * fMax);
                int iCeil2 = (int) Math.ceil(this.f43536c.getIntrinsicHeight() * fMax);
                int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                int i10 = (measuredHeight - iCeil2) / 2;
                canvas.save();
                canvas.clipRect(0, 0, iCeil, getMeasuredHeight());
                this.f43536c.setBounds(measuredWidth, i10, iCeil + measuredWidth, iCeil2 + i10);
            }
            this.f43536c.draw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
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
