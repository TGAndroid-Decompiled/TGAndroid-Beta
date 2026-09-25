package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yv0 extends FrameLayout {
    public final int f40262a;
    public final dw0 f40263b;

    public yv0(dw0 dw0Var, Context context, int i10) {
        super(context);
        this.f40262a = i10;
        this.f40263b = dw0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f40262a) {
            case 0:
                dw0 dw0Var = this.f40263b;
                if (dw0Var.f33219y > 0.0f && dw0Var.f33217w != null) {
                    dw0Var.f33218x.reset();
                    float width = getWidth() / dw0Var.f33216s.getWidth();
                    dw0Var.f33218x.postScale(width, width);
                    dw0Var.v.setLocalMatrix(dw0Var.f33218x);
                    dw0Var.f33217w.setAlpha((int) (dw0Var.f33219y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), dw0Var.f33217w);
                } else {
                    canvas2 = canvas;
                }
                if (dw0Var.O && (u1Var = dw0Var.L) != null) {
                    u1Var.L7 = dw0Var.P;
                    u1Var.invalidate();
                    dw0Var.O = false;
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
        switch (this.f40262a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f40263b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f40262a) {
            case 1:
                dw0 dw0Var = this.f40263b;
                if (view != dw0Var.K && view != dw0Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(dw0Var.M, 0.0f, dw0Var.f33219y), getWidth(), AndroidUtilities.lerp(dw0Var.N, getHeight(), dw0Var.f33219y));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f40262a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f40263b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f40262a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                dw0 dw0Var = this.f40263b;
                dw0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = dw0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = dw0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = dw0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = dw0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.qk0 qk0Var = dw0Var.Q;
                    if (childAt == qk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(qk0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f40262a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                dw0 dw0Var = this.f40263b;
                gh.d.c(dw0Var.F, dw0Var.f33207c);
                dw0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
