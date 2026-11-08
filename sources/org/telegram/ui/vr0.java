package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class vr0 extends FrameLayout {
    public final int f50760a;
    public final zr0 f50761b;

    public vr0(zr0 zr0Var, Context context, int i7) {
        super(context);
        this.f50760a = i7;
        this.f50761b = zr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f50760a) {
            case 0:
                zr0 zr0Var = this.f50761b;
                if (zr0Var.D > 0.0f && zr0Var.f52668x != null) {
                    zr0Var.f52669y.reset();
                    float width = getWidth() / zr0Var.f52666s.getWidth();
                    zr0Var.f52669y.postScale(width, width);
                    zr0Var.f52667w.setLocalMatrix(zr0Var.f52669y);
                    zr0Var.f52668x.setAlpha((int) (zr0Var.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), zr0Var.f52668x);
                } else {
                    canvas2 = canvas;
                }
                if (zr0Var.O && (q1Var = zr0Var.L) != null) {
                    q1Var.f29802c6 = zr0Var.P;
                    q1Var.invalidate();
                    zr0Var.O = false;
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
        switch (this.f50760a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f50761b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f50760a) {
            case 1:
                zr0 zr0Var = this.f50761b;
                if (view != zr0Var.K && view != zr0Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(zr0Var.M, 0.0f, zr0Var.D), getWidth(), org.telegram.messenger.g0.T1(zr0Var.N, getHeight(), zr0Var.D));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f50760a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                this.f50761b.d();
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f50760a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                zr0 zr0Var = this.f50761b;
                zr0Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = zr0Var.T;
                    if (childAt == viewGroup) {
                        float f10 = zr0Var.U;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = zr0Var.R;
                    if (childAt == viewGroup2) {
                        float f11 = zr0Var.S;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.ii0 ii0Var = zr0Var.Q;
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
        switch (this.f50760a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                zr0 zr0Var = this.f50761b;
                ih.d.c(zr0Var.F, zr0Var.f52656c);
                zr0Var.G.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
