package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class vc1 extends FrameLayout {
    public final int f42203a;
    public final yc1 f42204b;

    public vc1(yc1 yc1Var, Context context, int i10) {
        super(context);
        this.f42203a = i10;
        this.f42204b = yc1Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f42203a) {
            case 0:
                yc1 yc1Var = this.f42204b;
                if (yc1Var.f43461x > 0.0f && yc1Var.v != null) {
                    yc1Var.f43460w.reset();
                    float width = getWidth() / yc1Var.f43458r.getWidth();
                    yc1Var.f43460w.postScale(width, width);
                    yc1Var.f43459s.setLocalMatrix(yc1Var.f43460w);
                    yc1Var.v.setAlpha((int) (yc1Var.f43461x * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), yc1Var.v);
                } else {
                    canvas2 = canvas;
                }
                if (yc1Var.N && (u1Var = yc1Var.K) != null) {
                    u1Var.K7 = yc1Var.O;
                    u1Var.invalidate();
                    yc1Var.N = false;
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
        switch (this.f42203a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f42204b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f42203a) {
            case 1:
                yc1 yc1Var = this.f42204b;
                if (view != yc1Var.J && view != yc1Var.I) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(yc1Var.L, 0.0f, yc1Var.f43461x), getWidth(), AndroidUtilities.lerp(yc1Var.M, getHeight(), yc1Var.f43461x));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f42203a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f42204b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f42203a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                yc1 yc1Var = this.f42204b;
                yc1Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = yc1Var.S;
                    if (childAt == viewGroup) {
                        float f7 = yc1Var.T;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = yc1Var.Q;
                    if (childAt == viewGroup2) {
                        float f10 = yc1Var.R;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.dl0 dl0Var = yc1Var.P;
                    if (childAt == dl0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(dl0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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
        switch (this.f42203a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                yc1 yc1Var = this.f42204b;
                hh.d.c(yc1Var.E, yc1Var.f43450b);
                yc1Var.F.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
