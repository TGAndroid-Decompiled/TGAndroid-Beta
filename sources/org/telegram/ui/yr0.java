package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class yr0 extends FrameLayout {
    public final int f52103a;
    public final cs0 f52104b;

    public yr0(cs0 cs0Var, Context context, int i7) {
        super(context);
        this.f52103a = i7;
        this.f52104b = cs0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f52103a) {
            case 0:
                cs0 cs0Var = this.f52104b;
                if (cs0Var.D > 0.0f && cs0Var.f44799x != null) {
                    cs0Var.f44800y.reset();
                    float width = getWidth() / cs0Var.f44797s.getWidth();
                    cs0Var.f44800y.postScale(width, width);
                    cs0Var.f44798w.setLocalMatrix(cs0Var.f44800y);
                    cs0Var.f44799x.setAlpha((int) (cs0Var.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), cs0Var.f44799x);
                } else {
                    canvas2 = canvas;
                }
                if (cs0Var.O && (q1Var = cs0Var.L) != null) {
                    q1Var.f29817c6 = cs0Var.P;
                    q1Var.invalidate();
                    cs0Var.O = false;
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
        switch (this.f52103a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f52104b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f52103a) {
            case 1:
                cs0 cs0Var = this.f52104b;
                if (view != cs0Var.K && view != cs0Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(cs0Var.M, 0.0f, cs0Var.D), getWidth(), org.telegram.messenger.g0.T1(cs0Var.N, getHeight(), cs0Var.D));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f52103a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                this.f52104b.d();
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f52103a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                cs0 cs0Var = this.f52104b;
                cs0Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = cs0Var.T;
                    if (childAt == viewGroup) {
                        float f10 = cs0Var.U;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = cs0Var.R;
                    if (childAt == viewGroup2) {
                        float f11 = cs0Var.S;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.ii0 ii0Var = cs0Var.Q;
                    if (childAt == ii0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(ii0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f52103a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                cs0 cs0Var = this.f52104b;
                ih.d.c(cs0Var.F, cs0Var.f44787c);
                cs0Var.G.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
