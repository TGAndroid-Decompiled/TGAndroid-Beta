package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class tr0 extends FrameLayout {
    public final int f51656a;
    public final xr0 f51657b;

    public tr0(xr0 xr0Var, Context context, int i7) {
        super(context);
        this.f51656a = i7;
        this.f51657b = xr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f51656a) {
            case 0:
                xr0 xr0Var = this.f51657b;
                if (xr0Var.E > 0.0f && xr0Var.f53309x != null) {
                    xr0Var.f53310y.reset();
                    float width = getWidth() / xr0Var.f53307s.getWidth();
                    xr0Var.f53310y.postScale(width, width);
                    xr0Var.f53308w.setLocalMatrix(xr0Var.f53310y);
                    xr0Var.f53309x.setAlpha((int) (xr0Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), xr0Var.f53309x);
                } else {
                    canvas2 = canvas;
                }
                if (xr0Var.P && (q1Var = xr0Var.M) != null) {
                    q1Var.f30948d6 = xr0Var.Q;
                    q1Var.invalidate();
                    xr0Var.P = false;
                }
                super.dispatchDraw(canvas2);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f51656a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f51657b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f51656a) {
            case 1:
                xr0 xr0Var = this.f51657b;
                if (view != xr0Var.L && view != xr0Var.K) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(xr0Var.N, 0.0f, xr0Var.E), getWidth(), org.telegram.messenger.g0.T1(xr0Var.O, getHeight(), xr0Var.E));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f51656a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                this.f51657b.d();
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f51656a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                xr0 xr0Var = this.f51657b;
                xr0Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = xr0Var.U;
                    if (childAt == viewGroup) {
                        float f10 = xr0Var.V;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = xr0Var.S;
                    if (childAt == viewGroup2) {
                        float f11 = xr0Var.T;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.mi0 mi0Var = xr0Var.R;
                    if (childAt == mi0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mi0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f51656a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                xr0 xr0Var = this.f51657b;
                ih.d.c(xr0Var.G, xr0Var.f53296c);
                xr0Var.H.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
