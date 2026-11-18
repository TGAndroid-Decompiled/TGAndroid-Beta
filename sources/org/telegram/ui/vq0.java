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
public final class vq0 extends FrameLayout {
    public final PhotoViewer f52841a;

    public vq0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.f52841a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        bn bnVar = this.f52841a.f43262l4;
        if (bnVar != null) {
            bnVar.h8();
            UndoView undoView = bnVar.N3;
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
        PhotoViewer photoViewer = this.f52841a;
        if (!photoViewer.f43310r && photoViewer.d2 != 1 && photoViewer.f43322s1 && photoViewer.G2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.G2.B0(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            PhotoViewer photoViewer = this.f52841a;
            if (photoViewer.R.x()) {
                photoViewer.R.f(false);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vq0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        this.f52841a.getClass();
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
        PhotoViewer photoViewer = this.f52841a;
        photoViewer.C4.P();
        photoViewer.B4.P();
        photoViewer.D4.P();
        photoViewer.S5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.f52841a;
        photoViewer.C4.R();
        photoViewer.B4.R();
        photoViewer.D4.R();
        photoViewer.S5 = false;
        photoViewer.T5 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vq0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f52841a.f43197e && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        PhotoViewer photoViewer = this.f52841a;
        photoViewer.f43234i0.layout(getPaddingLeft(), 0, photoViewer.f43234i0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f43234i0.getMeasuredHeight());
        photoViewer.f43208f0.layout(getPaddingLeft(), 0, photoViewer.f43208f0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f43208f0.getMeasuredHeight());
        photoViewer.f43250k0.layout(getPaddingLeft(), photoViewer.f43208f0.getMeasuredHeight(), photoViewer.f43250k0.getMeasuredWidth(), photoViewer.f43250k0.getMeasuredHeight() + photoViewer.f43208f0.getMeasuredHeight());
        photoViewer.T5 = true;
        if (z10) {
            if (!photoViewer.U5) {
                float p22 = photoViewer.p2(true);
                photoViewer.f43166a6 = p22;
                photoViewer.X5 = 0.0f;
                photoViewer.Y5 = 0.0f;
                photoViewer.u3(p22);
            }
            CheckBox checkBox = photoViewer.O0;
            if (checkBox != null) {
                checkBox.post(new hq0(this, 1));
            }
        }
        if (photoViewer.U5) {
            photoViewer.L2();
            photoViewer.U5 = false;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        PhotoViewer photoViewer = this.f52841a;
        if (!photoViewer.f43320s && org.telegram.messenger.g0.f24128y) {
            int i11 = org.telegram.messenger.g0.f24121q.y;
            if (size2 > i11) {
                size2 = i11;
            }
            size2 += org.telegram.messenger.g0.f24115m;
        }
        setMeasuredDimension(size, size2);
        int i12 = size2 - photoViewer.f43331t2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i12 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.f43234i0.getLayoutParams();
        photoViewer.f43234i0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f43208f0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.f43250k0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.f43259l0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f52841a;
        if (photoViewer.f43197e && PhotoViewer.c(photoViewer, motionEvent)) {
            return true;
        }
        return false;
    }
}
