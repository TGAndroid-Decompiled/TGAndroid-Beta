package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.UndoView;
public final class z extends FrameLayout {
    public final PhotoViewer a;

    public z(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        zu1 zu1Var = this.a.k4;
        if (zu1Var != null) {
            zu1Var.i6();
            UndoView undoView = zu1Var.N3;
            if (undoView != null && undoView.getVisibility() == 0) {
                canvas.save();
                View view = (View) undoView.getParent();
                canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                canvas.translate(undoView.getX(), undoView.getY());
                undoView.draw(canvas);
                canvas.restore();
                invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.r && photoViewer.d2 != 1 && photoViewer.s1 && photoViewer.G2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.G2.A0(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            PhotoViewer photoViewer = this.a;
            if (photoViewer.R.w()) {
                photoViewer.R.e(false);
            }
            if (photoViewer.K0()) {
                photoViewer.y(true);
                return false;
            } else if (rw2.e().E) {
                rw2.e().c();
                return false;
            } else {
                PhotoViewer.q0().A(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr = PhotoViewer.d9;
        super.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        try {
            return super.drawChild(canvas, view, j);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PhotoViewer photoViewer = this.a;
        photoViewer.B4.I();
        photoViewer.A4.I();
        photoViewer.C4.I();
        photoViewer.R5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.a;
        photoViewer.B4.K();
        photoViewer.A4.K();
        photoViewer.C4.K();
        photoViewer.R5 = false;
        photoViewer.S5 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a.e && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        PhotoViewer photoViewer = this.a;
        photoViewer.i0.layout(getPaddingLeft(), 0, photoViewer.i0.getMeasuredWidth() + getPaddingLeft(), photoViewer.i0.getMeasuredHeight());
        photoViewer.f0.layout(getPaddingLeft(), 0, photoViewer.f0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f0.getMeasuredHeight());
        photoViewer.k0.layout(getPaddingLeft(), photoViewer.f0.getMeasuredHeight(), photoViewer.k0.getMeasuredWidth(), photoViewer.k0.getMeasuredHeight() + photoViewer.f0.getMeasuredHeight());
        photoViewer.S5 = true;
        if (z) {
            if (!photoViewer.T5) {
                float z1 = photoViewer.z1(true);
                photoViewer.Z5 = z1;
                photoViewer.W5 = 0.0f;
                photoViewer.X5 = 0.0f;
                photoViewer.I2(z1);
            }
            CheckBox checkBox = photoViewer.O0;
            if (checkBox != null) {
                checkBox.post(new x38(this, (byte) 19));
            }
        }
        if (photoViewer.T5) {
            photoViewer.W1();
            photoViewer.T5 = false;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        PhotoViewer photoViewer = this.a;
        if (!photoViewer.s && hl.y) {
            int i3 = hl.q.y;
            if (size2 > i3) {
                size2 = i3;
            }
            size2 += hl.m;
        }
        setMeasuredDimension(size, size2);
        int i4 = size2 - photoViewer.t2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i4 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.i0.getLayoutParams();
        photoViewer.i0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.k0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.l0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.a;
        if (photoViewer.e && photoViewer.h1(motionEvent)) {
            return true;
        }
        return false;
    }
}
