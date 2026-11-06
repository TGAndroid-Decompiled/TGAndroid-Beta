package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class ur0 extends FrameLayout {
    public final int f50474a;
    public final yr0 f50475b;

    public ur0(yr0 yr0Var, Context context, int i7) {
        super(context);
        this.f50474a = i7;
        this.f50475b = yr0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f50474a) {
            case 0:
                yr0 yr0Var = this.f50475b;
                if (yr0Var.D > 0.0f && yr0Var.f52313x != null) {
                    yr0Var.f52314y.reset();
                    float width = getWidth() / yr0Var.f52311s.getWidth();
                    yr0Var.f52314y.postScale(width, width);
                    yr0Var.f52312w.setLocalMatrix(yr0Var.f52314y);
                    yr0Var.f52313x.setAlpha((int) (yr0Var.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), yr0Var.f52313x);
                } else {
                    canvas2 = canvas;
                }
                if (yr0Var.O && (q1Var = yr0Var.L) != null) {
                    q1Var.f29798c6 = yr0Var.P;
                    q1Var.invalidate();
                    yr0Var.O = false;
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
        switch (this.f50474a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f50475b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f50474a) {
            case 1:
                yr0 yr0Var = this.f50475b;
                if (view != yr0Var.K && view != yr0Var.J) {
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(yr0Var.M, 0.0f, yr0Var.D), getWidth(), org.telegram.messenger.g0.T1(yr0Var.N, getHeight(), yr0Var.D));
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f50474a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                this.f50475b.d();
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f50474a) {
            case 2:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                yr0 yr0Var = this.f50475b;
                yr0Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = yr0Var.T;
                    if (childAt == viewGroup) {
                        float f10 = yr0Var.U;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = yr0Var.R;
                    if (childAt == viewGroup2) {
                        float f11 = yr0Var.S;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.ii0 ii0Var = yr0Var.Q;
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
        switch (this.f50474a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                yr0 yr0Var = this.f50475b;
                ih.d.c(yr0Var.F, yr0Var.f52301c);
                yr0Var.G.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
