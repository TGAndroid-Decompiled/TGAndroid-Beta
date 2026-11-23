package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class wr0 extends FrameLayout {
    public final int f53517a;
    public final as0 f53518b;

    public wr0(as0 as0Var, Context context, int i7) {
        super(context);
        this.f53517a = i7;
        this.f53518b = as0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.r1 r1Var;
        switch (this.f53517a) {
            case 0:
                as0 as0Var = this.f53518b;
                if (as0Var.E > 0.0f && as0Var.f45694x != null) {
                    as0Var.f45695y.reset();
                    float width = getWidth() / as0Var.f45692s.getWidth();
                    as0Var.f45695y.postScale(width, width);
                    as0Var.f45693w.setLocalMatrix(as0Var.f45695y);
                    as0Var.f45694x.setAlpha((int) (as0Var.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), as0Var.f45694x);
                } else {
                    canvas2 = canvas;
                }
                if (as0Var.P && (r1Var = as0Var.M) != null) {
                    r1Var.f31401d6 = as0Var.Q;
                    r1Var.invalidate();
                    as0Var.P = false;
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
        switch (this.f53517a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f53518b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f53517a) {
            case 1:
                as0 as0Var = this.f53518b;
                if (view != as0Var.L && view != as0Var.K) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(as0Var.N, 0.0f, as0Var.E), getWidth(), org.telegram.messenger.g0.T1(as0Var.O, getHeight(), as0Var.E));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f53517a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                this.f53518b.d();
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f53517a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                as0 as0Var = this.f53518b;
                as0Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = as0Var.U;
                    if (childAt == viewGroup) {
                        float f10 = as0Var.V;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = as0Var.S;
                    if (childAt == viewGroup2) {
                        float f11 = as0Var.T;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.xi0 xi0Var = as0Var.R;
                    if (childAt == xi0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(xi0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f53517a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                as0 as0Var = this.f53518b;
                ih.d.c(as0Var.G, as0Var.f45681c);
                as0Var.H.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
