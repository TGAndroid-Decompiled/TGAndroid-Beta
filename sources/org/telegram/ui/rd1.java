package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class rd1 extends FrameLayout {
    public final int f40939a;
    public final ud1 f40940b;

    public rd1(ud1 ud1Var, Context context, int i10) {
        super(context);
        this.f40939a = i10;
        this.f40940b = ud1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f40939a) {
            case 0:
                ud1 ud1Var = this.f40940b;
                if (ud1Var.f41909x > 0.0f && ud1Var.v != null) {
                    ud1Var.f41908w.reset();
                    float width = getWidth() / ud1Var.f41906r.getWidth();
                    ud1Var.f41908w.postScale(width, width);
                    ud1Var.f41907s.setLocalMatrix(ud1Var.f41908w);
                    ud1Var.v.setAlpha((int) (ud1Var.f41909x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ud1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (ud1Var.K && (t1Var = ud1Var.H) != null) {
                    t1Var.H7 = ud1Var.L;
                    t1Var.invalidate();
                    ud1Var.K = false;
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
        switch (this.f40939a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f40940b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f40939a) {
            case 1:
                ud1 ud1Var = this.f40940b;
                if (view != ud1Var.G && view != ud1Var.F) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(ud1Var.I, 0.0f, ud1Var.f41909x), getWidth(), AndroidUtilities.lerp(ud1Var.J, getHeight(), ud1Var.f41909x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f40939a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                this.f40940b.d();
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f40939a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                ud1 ud1Var = this.f40940b;
                ud1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = ud1Var.P;
                    if (childAt == viewGroup) {
                        float f10 = ud1Var.Q;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = ud1Var.N;
                    if (childAt == viewGroup2) {
                        float f11 = ud1Var.O;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.rk0 rk0Var = ud1Var.M;
                    if (childAt == rk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(rk0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f40939a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                ud1 ud1Var = this.f40940b;
                ug.c.c(ud1Var.B, ud1Var.f41900b);
                ud1Var.C.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
