package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class u91 extends FrameLayout {
    public final int f42095a;
    public final x91 f42096b;

    public u91(x91 x91Var, Context context, int i10) {
        super(context);
        this.f42095a = i10;
        this.f42096b = x91Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f42095a) {
            case 0:
                x91 x91Var = this.f42096b;
                if (x91Var.f43522y > 0.0f && x91Var.f43520w != null) {
                    x91Var.f43521x.reset();
                    float width = getWidth() / x91Var.f43518r.getWidth();
                    x91Var.f43521x.postScale(width, width);
                    x91Var.f43519s.setLocalMatrix(x91Var.f43521x);
                    x91Var.f43520w.setAlpha((int) (x91Var.f43522y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), x91Var.f43520w);
                } else {
                    canvas2 = canvas;
                }
                if (x91Var.N && (q1Var = x91Var.K) != null) {
                    q1Var.f22490a6 = x91Var.O;
                    q1Var.invalidate();
                    x91Var.N = false;
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
        switch (this.f42095a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f42096b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f42095a) {
            case 1:
                x91 x91Var = this.f42096b;
                if (view != x91Var.J && view != x91Var.I) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.i0.T1(x91Var.L, 0.0f, x91Var.f43522y), getWidth(), org.telegram.messenger.i0.T1(x91Var.M, getHeight(), x91Var.f43522y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f42095a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f42096b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f42095a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                x91 x91Var = this.f42096b;
                x91Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = x91Var.S;
                    if (childAt == viewGroup) {
                        float f7 = x91Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = x91Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = x91Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.mj0 mj0Var = x91Var.P;
                    if (childAt == mj0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f42095a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                x91 x91Var = this.f42096b;
                yg.d.c(x91Var.E, x91Var.f43510b);
                x91Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
