package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class wd1 extends FrameLayout {
    public final int f42412a;
    public final zd1 f42413b;

    public wd1(zd1 zd1Var, Context context, int i10) {
        super(context);
        this.f42412a = i10;
        this.f42413b = zd1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f42412a) {
            case 0:
                zd1 zd1Var = this.f42413b;
                if (zd1Var.f43934x > 0.0f && zd1Var.v != null) {
                    zd1Var.f43933w.reset();
                    float width = getWidth() / zd1Var.f43931r.getWidth();
                    zd1Var.f43933w.postScale(width, width);
                    zd1Var.f43932s.setLocalMatrix(zd1Var.f43933w);
                    zd1Var.v.setAlpha((int) (zd1Var.f43934x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), zd1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (zd1Var.K && (t1Var = zd1Var.H) != null) {
                    t1Var.H7 = zd1Var.L;
                    t1Var.invalidate();
                    zd1Var.K = false;
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
        switch (this.f42412a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f42413b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f42412a) {
            case 1:
                zd1 zd1Var = this.f42413b;
                if (view != zd1Var.G && view != zd1Var.F) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(zd1Var.I, 0.0f, zd1Var.f43934x), getWidth(), AndroidUtilities.lerp(zd1Var.J, getHeight(), zd1Var.f43934x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f42412a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                this.f42413b.d();
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f42412a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                zd1 zd1Var = this.f42413b;
                zd1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = zd1Var.P;
                    if (childAt == viewGroup) {
                        float f10 = zd1Var.Q;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = zd1Var.N;
                    if (childAt == viewGroup2) {
                        float f11 = zd1Var.O;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.qk0 qk0Var = zd1Var.M;
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
        switch (this.f42412a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                zd1 zd1Var = this.f42413b;
                ug.c.c(zd1Var.B, zd1Var.f43925b);
                zd1Var.C.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
