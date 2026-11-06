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
public final class uq0 extends FrameLayout {
    public final PhotoViewer f50472a;

    public uq0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.f50472a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        an anVar = this.f50472a.f41412k4;
        if (anVar != null) {
            anVar.f8();
            UndoView undoView = anVar.M3;
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
        PhotoViewer photoViewer = this.f50472a;
        if (!photoViewer.f41468r && photoViewer.f41340c2 != 1 && photoViewer.f41470r1 && photoViewer.F2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.F2.B0(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            PhotoViewer photoViewer = this.f50472a;
            if (photoViewer.Q.x()) {
                photoViewer.Q.f(false);
            }
            if (photoViewer.F1()) {
                photoViewer.x0(true);
                return false;
            } else if (ks.p().E) {
                ks.p().n();
                return false;
            } else {
                PhotoViewer.p1().z0(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uq0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr = PhotoViewer.Y8;
        this.f50472a.getClass();
        super.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        try {
            return super.drawChild(canvas, view, j3);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PhotoViewer photoViewer = this.f50472a;
        photoViewer.B4.P();
        photoViewer.A4.P();
        photoViewer.C4.P();
        photoViewer.R5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.f50472a;
        photoViewer.B4.R();
        photoViewer.A4.R();
        photoViewer.C4.R();
        photoViewer.R5 = false;
        photoViewer.S5 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uq0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f50472a.f41355e && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        PhotoViewer photoViewer = this.f50472a;
        photoViewer.f41384h0.layout(getPaddingLeft(), 0, photoViewer.f41384h0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f41384h0.getMeasuredHeight());
        photoViewer.f41356e0.layout(getPaddingLeft(), 0, photoViewer.f41356e0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f41356e0.getMeasuredHeight());
        photoViewer.f41400j0.layout(getPaddingLeft(), photoViewer.f41356e0.getMeasuredHeight(), photoViewer.f41400j0.getMeasuredWidth(), photoViewer.f41400j0.getMeasuredHeight() + photoViewer.f41356e0.getMeasuredHeight());
        photoViewer.S5 = true;
        if (z9) {
            if (!photoViewer.T5) {
                float o22 = photoViewer.o2(true);
                photoViewer.Z5 = o22;
                photoViewer.W5 = 0.0f;
                photoViewer.X5 = 0.0f;
                photoViewer.t3(o22);
            }
            CheckBox checkBox = photoViewer.N0;
            if (checkBox != null) {
                checkBox.post(new fq0(this, 1));
            }
        }
        if (photoViewer.T5) {
            photoViewer.K2();
            photoViewer.T5 = false;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        PhotoViewer photoViewer = this.f50472a;
        if (!photoViewer.f41478s && org.telegram.messenger.g0.f22544y) {
            int i11 = org.telegram.messenger.g0.f22537q.y;
            if (size2 > i11) {
                size2 = i11;
            }
            size2 += org.telegram.messenger.g0.f22531m;
        }
        setMeasuredDimension(size, size2);
        int i12 = size2 - photoViewer.f41481s2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i12 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.f41384h0.getLayoutParams();
        photoViewer.f41384h0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f41356e0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.f41400j0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.f41408k0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f50472a;
        if (photoViewer.f41355e && PhotoViewer.c(photoViewer, motionEvent)) {
            return true;
        }
        return false;
    }
}
