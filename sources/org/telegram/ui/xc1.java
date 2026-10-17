package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class xc1 extends FrameLayout {
    public final int f43085a;
    public final ad1 f43086b;

    public xc1(ad1 ad1Var, Context context, int i10) {
        super(context);
        this.f43085a = i10;
        this.f43086b = ad1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f43085a) {
            case 0:
                ad1 ad1Var = this.f43086b;
                if (ad1Var.f35409x > 0.0f && ad1Var.v != null) {
                    ad1Var.f35408w.reset();
                    float width = getWidth() / ad1Var.f35406r.getWidth();
                    ad1Var.f35408w.postScale(width, width);
                    ad1Var.f35407s.setLocalMatrix(ad1Var.f35408w);
                    ad1Var.v.setAlpha((int) (ad1Var.f35409x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ad1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (ad1Var.N && (u1Var = ad1Var.K) != null) {
                    u1Var.K7 = ad1Var.O;
                    u1Var.invalidate();
                    ad1Var.N = false;
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
        switch (this.f43085a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f43086b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f43085a) {
            case 1:
                ad1 ad1Var = this.f43086b;
                if (view != ad1Var.J && view != ad1Var.I) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(ad1Var.L, 0.0f, ad1Var.f35409x), getWidth(), AndroidUtilities.lerp(ad1Var.M, getHeight(), ad1Var.f35409x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f43085a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f43086b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f43085a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                ad1 ad1Var = this.f43086b;
                ad1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = ad1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = ad1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = ad1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = ad1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.cl0 cl0Var = ad1Var.P;
                    if (childAt == cl0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(cl0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f43085a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                ad1 ad1Var = this.f43086b;
                hh.d.c(ad1Var.E, ad1Var.f35398b);
                ad1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
