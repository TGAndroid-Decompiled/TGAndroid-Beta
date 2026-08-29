package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.UndoView;
public final class yt0 extends FrameLayout {
    public final PhotoViewer f44967a;

    public yt0(PhotoViewer photoViewer, Activity activity) {
        super(activity);
        this.f44967a = photoViewer;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        tn tnVar = this.f44967a.f35715h4;
        if (tnVar != null) {
            tnVar.Q7();
            UndoView undoView = tnVar.f42989u3;
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
        PhotoViewer photoViewer = this.f44967a;
        if (!photoViewer.f35799r && photoViewer.Y1 != 1 && photoViewer.f35765n1 && photoViewer.B2 != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            photoViewer.B2.X(1.0f);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            PhotoViewer photoViewer = this.f44967a;
            if (photoViewer.M.y()) {
                photoViewer.M.f(false);
            }
            if (photoViewer.H1()) {
                photoViewer.E0(true);
                return false;
            } else if (ht.q().E) {
                ht.q().o();
                return false;
            } else {
                PhotoViewer.t1().G0(true, false);
                return true;
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yt0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f44967a.N8) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        try {
            return super.drawChild(canvas, view, j10);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        PhotoViewer photoViewer = this.f44967a;
        photoViewer.f35869y4.onAttachedToWindow();
        photoViewer.x4.onAttachedToWindow();
        photoViewer.f35877z4.onAttachedToWindow();
        photoViewer.O5 = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PhotoViewer photoViewer = this.f44967a;
        photoViewer.f35869y4.onDetachedFromWindow();
        photoViewer.x4.onDetachedFromWindow();
        photoViewer.f35877z4.onDetachedFromWindow();
        photoViewer.O5 = false;
        photoViewer.P5 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yt0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f44967a.f35682e && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        PhotoViewer photoViewer = this.f44967a;
        photoViewer.f35673d0.layout(getPaddingLeft(), 0, photoViewer.f35673d0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f35673d0.getMeasuredHeight());
        photoViewer.f35647a0.layout(getPaddingLeft(), 0, photoViewer.f35647a0.getMeasuredWidth() + getPaddingLeft(), photoViewer.f35647a0.getMeasuredHeight());
        photoViewer.f35693f0.layout(getPaddingLeft(), photoViewer.f35647a0.getMeasuredHeight(), photoViewer.f35693f0.getMeasuredWidth(), photoViewer.f35693f0.getMeasuredHeight() + photoViewer.f35647a0.getMeasuredHeight());
        photoViewer.P5 = true;
        if (z10) {
            if (!photoViewer.Q5) {
                float r22 = photoViewer.r2(true);
                photoViewer.W5 = r22;
                photoViewer.T5 = 0.0f;
                photoViewer.U5 = 0.0f;
                photoViewer.w3(r22);
            }
            CheckBox checkBox = photoViewer.J0;
            if (checkBox != null) {
                checkBox.post(new it0(this, 1));
            }
        }
        if (photoViewer.Q5) {
            photoViewer.N2();
            photoViewer.Q5 = false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        PhotoViewer photoViewer = this.f44967a;
        if (!photoViewer.f35808s && AndroidUtilities.incorrectDisplaySizeFix) {
            int i12 = AndroidUtilities.displaySize.y;
            if (size2 > i12) {
                size2 = i12;
            }
            size2 += AndroidUtilities.statusBarHeight;
        }
        setMeasuredDimension(size, size2);
        int i13 = size2 - photoViewer.f35775o2.bottom;
        int paddingRight = size - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i13 - getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = photoViewer.f35673d0.getLayoutParams();
        photoViewer.f35673d0.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
        photoViewer.f35647a0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        photoViewer.f35693f0.measure(View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(photoViewer.f35702g0, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f44967a;
        if (photoViewer.f35682e && PhotoViewer.k(photoViewer, motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        super.requestLayout();
        AndroidUtilities.printStackTrace("requestLayout");
    }
}
