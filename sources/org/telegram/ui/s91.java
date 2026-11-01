package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class s91 extends FrameLayout {
    public final int f41293a;
    public final v91 f41294b;

    public s91(v91 v91Var, Context context, int i10) {
        super(context);
        this.f41293a = i10;
        this.f41294b = v91Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f41293a) {
            case 0:
                v91 v91Var = this.f41294b;
                if (v91Var.f42462y > 0.0f && v91Var.f42460w != null) {
                    v91Var.f42461x.reset();
                    float width = getWidth() / v91Var.f42458r.getWidth();
                    v91Var.f42461x.postScale(width, width);
                    v91Var.f42459s.setLocalMatrix(v91Var.f42461x);
                    v91Var.f42460w.setAlpha((int) (v91Var.f42462y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), v91Var.f42460w);
                } else {
                    canvas2 = canvas;
                }
                if (v91Var.N && (q1Var = v91Var.K) != null) {
                    q1Var.f22491a6 = v91Var.O;
                    q1Var.invalidate();
                    v91Var.N = false;
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
        switch (this.f41293a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f41294b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f41293a) {
            case 1:
                v91 v91Var = this.f41294b;
                if (view != v91Var.J && view != v91Var.I) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.i0.T1(v91Var.L, 0.0f, v91Var.f42462y), getWidth(), org.telegram.messenger.i0.T1(v91Var.M, getHeight(), v91Var.f42462y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41293a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f41294b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f41293a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                v91 v91Var = this.f41294b;
                v91Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = v91Var.S;
                    if (childAt == viewGroup) {
                        float f7 = v91Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = v91Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = v91Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.nj0 nj0Var = v91Var.P;
                    if (childAt == nj0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(nj0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f41293a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                v91 v91Var = this.f41294b;
                yg.d.c(v91Var.E, v91Var.f42450b);
                v91Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
