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
public final class yq0 extends FrameLayout {
    public final PhotoViewer f52102a;

    public yq0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.f52102a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        cn cnVar = this.f52102a.f41438k4;
        if (cnVar != null) {
            cnVar.g8();
            UndoView undoView = cnVar.M3;
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
        PhotoViewer photoViewer = this.f52102a;
        if (!photoViewer.f41494r && photoViewer.f41366c2 != 1 && photoViewer.f41496r1 && photoViewer.F2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.F2.B0(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            PhotoViewer photoViewer = this.f52102a;
            if (photoViewer.Q.x()) {
                photoViewer.Q.f(false);
            }
            if (photoViewer.F1()) {
                photoViewer.x0(true);
                return false;
            } else if (ns.p().E) {
                ns.p().n();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yq0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr = PhotoViewer.Y8;
        this.f52102a.getClass();
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
        PhotoViewer photoViewer = this.f52102a;
        photoViewer.B4.P();
        photoViewer.A4.P();
        photoViewer.C4.P();
        photoViewer.R5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.f52102a;
        photoViewer.B4.R();
        photoViewer.A4.R();
        photoViewer.C4.R();
        photoViewer.R5 = false;
        photoViewer.S5 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yq0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f52102a.f41381e && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        PhotoViewer photoViewer = this.f52102a;
        photoViewer.f41410h0.layout(getPaddingLeft(), 0, photoViewer.f41410h0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f41410h0.getMeasuredHeight());
        photoViewer.f41382e0.layout(getPaddingLeft(), 0, photoViewer.f41382e0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f41382e0.getMeasuredHeight());
        photoViewer.f41426j0.layout(getPaddingLeft(), photoViewer.f41382e0.getMeasuredHeight(), photoViewer.f41426j0.getMeasuredWidth(), photoViewer.f41426j0.getMeasuredHeight() + photoViewer.f41382e0.getMeasuredHeight());
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
                checkBox.post(new jq0(this, 1));
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
        PhotoViewer photoViewer = this.f52102a;
        if (!photoViewer.f41504s && org.telegram.messenger.g0.f22574y) {
            int i11 = org.telegram.messenger.g0.f22567q.y;
            if (size2 > i11) {
                size2 = i11;
            }
            size2 += org.telegram.messenger.g0.f22561m;
        }
        setMeasuredDimension(size, size2);
        int i12 = size2 - photoViewer.f41507s2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i12 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.f41410h0.getLayoutParams();
        photoViewer.f41410h0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f41382e0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.f41426j0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.f41434k0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f52102a;
        if (photoViewer.f41381e && PhotoViewer.c(photoViewer, motionEvent)) {
            return true;
        }
        return false;
    }
}
