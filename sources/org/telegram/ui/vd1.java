package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vd1 extends FrameLayout {
    public final int f39076a;
    public final yd1 f39077b;

    public vd1(yd1 yd1Var, Context context, int i10) {
        super(context);
        this.f39076a = i10;
        this.f39077b = yd1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f39076a) {
            case 0:
                yd1 yd1Var = this.f39077b;
                if (yd1Var.f40245x > 0.0f && yd1Var.v != null) {
                    yd1Var.f40244w.reset();
                    float width = getWidth() / yd1Var.f40242r.getWidth();
                    yd1Var.f40244w.postScale(width, width);
                    yd1Var.f40243s.setLocalMatrix(yd1Var.f40244w);
                    yd1Var.v.setAlpha((int) (yd1Var.f40245x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), yd1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (yd1Var.K && (s1Var = yd1Var.H) != null) {
                    s1Var.H7 = yd1Var.L;
                    s1Var.invalidate();
                    yd1Var.K = false;
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
        switch (this.f39076a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f39077b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f39076a) {
            case 1:
                yd1 yd1Var = this.f39077b;
                if (view != yd1Var.G && view != yd1Var.F) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(yd1Var.I, 0.0f, yd1Var.f40245x), getWidth(), AndroidUtilities.lerp(yd1Var.J, getHeight(), yd1Var.f40245x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f39076a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                this.f39077b.d();
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f39076a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                yd1 yd1Var = this.f39077b;
                yd1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = yd1Var.P;
                    if (childAt == viewGroup) {
                        float f10 = yd1Var.Q;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = yd1Var.N;
                    if (childAt == viewGroup2) {
                        float f11 = yd1Var.O;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.pk0 pk0Var = yd1Var.M;
                    if (childAt == pk0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(pk0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f39076a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                yd1 yd1Var = this.f39077b;
                tg.c.c(yd1Var.B, yd1Var.f40237b);
                yd1Var.C.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
