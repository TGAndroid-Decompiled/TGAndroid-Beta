package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vv0 extends FrameLayout {
    public final int f44433a;
    public final zv0 f44434b;

    public vv0(zv0 zv0Var, Context context, int i10) {
        super(context);
        this.f44433a = i10;
        this.f44434b = zv0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f44433a) {
            case 0:
                zv0 zv0Var = this.f44434b;
                if (zv0Var.f46391y > 0.0f && zv0Var.f46389w != null) {
                    zv0Var.f46390x.reset();
                    float width = getWidth() / zv0Var.f46388s.getWidth();
                    zv0Var.f46390x.postScale(width, width);
                    zv0Var.v.setLocalMatrix(zv0Var.f46390x);
                    zv0Var.f46389w.setAlpha((int) (zv0Var.f46391y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), zv0Var.f46389w);
                } else {
                    canvas2 = canvas;
                }
                if (zv0Var.O && (s1Var = zv0Var.L) != null) {
                    s1Var.L7 = zv0Var.P;
                    s1Var.invalidate();
                    zv0Var.O = false;
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
        switch (this.f44433a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f44434b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f44433a) {
            case 1:
                zv0 zv0Var = this.f44434b;
                if (view != zv0Var.K && view != zv0Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(zv0Var.M, 0.0f, zv0Var.f46391y), getWidth(), AndroidUtilities.lerp(zv0Var.N, getHeight(), zv0Var.f46391y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f44433a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f44434b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f44433a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                zv0 zv0Var = this.f44434b;
                zv0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = zv0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = zv0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = zv0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = zv0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.gl0 gl0Var = zv0Var.Q;
                    if (childAt == gl0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(gl0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f44433a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                zv0 zv0Var = this.f44434b;
                ih.d.c(zv0Var.F, zv0Var.f46379c);
                zv0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
