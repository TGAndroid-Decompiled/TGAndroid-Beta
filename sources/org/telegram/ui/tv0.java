package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class tv0 extends FrameLayout {
    public final int f43921a;
    public final xv0 f43922b;

    public tv0(xv0 xv0Var, Context context, int i10) {
        super(context);
        this.f43921a = i10;
        this.f43922b = xv0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f43921a) {
            case 0:
                xv0 xv0Var = this.f43922b;
                if (xv0Var.f45887y > 0.0f && xv0Var.f45885w != null) {
                    xv0Var.f45886x.reset();
                    float width = getWidth() / xv0Var.f45884s.getWidth();
                    xv0Var.f45886x.postScale(width, width);
                    xv0Var.v.setLocalMatrix(xv0Var.f45886x);
                    xv0Var.f45885w.setAlpha((int) (xv0Var.f45887y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), xv0Var.f45885w);
                } else {
                    canvas2 = canvas;
                }
                if (xv0Var.O && (s1Var = xv0Var.L) != null) {
                    s1Var.L7 = xv0Var.P;
                    s1Var.invalidate();
                    xv0Var.O = false;
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
        switch (this.f43921a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f43922b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f43921a) {
            case 1:
                xv0 xv0Var = this.f43922b;
                if (view != xv0Var.K && view != xv0Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(xv0Var.M, 0.0f, xv0Var.f45887y), getWidth(), AndroidUtilities.lerp(xv0Var.N, getHeight(), xv0Var.f45887y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f43921a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f43922b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f43921a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                xv0 xv0Var = this.f43922b;
                xv0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = xv0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = xv0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = xv0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = xv0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.fl0 fl0Var = xv0Var.Q;
                    if (childAt == fl0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(fl0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f43921a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                xv0 xv0Var = this.f43922b;
                ih.d.c(xv0Var.F, xv0Var.f45875c);
                xv0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
