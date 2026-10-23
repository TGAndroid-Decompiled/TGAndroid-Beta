package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qv0 extends FrameLayout {
    public final int f40921a;
    public final uv0 f40922b;

    public qv0(uv0 uv0Var, Context context, int i10) {
        super(context);
        this.f40921a = i10;
        this.f40922b = uv0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f40921a) {
            case 0:
                uv0 uv0Var = this.f40922b;
                if (uv0Var.f42530y > 0.0f && uv0Var.f42528w != null) {
                    uv0Var.f42529x.reset();
                    float width = getWidth() / uv0Var.f42527s.getWidth();
                    uv0Var.f42529x.postScale(width, width);
                    uv0Var.v.setLocalMatrix(uv0Var.f42529x);
                    uv0Var.f42528w.setAlpha((int) (uv0Var.f42530y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), uv0Var.f42528w);
                } else {
                    canvas2 = canvas;
                }
                if (uv0Var.O && (t1Var = uv0Var.L) != null) {
                    t1Var.L7 = uv0Var.P;
                    t1Var.invalidate();
                    uv0Var.O = false;
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
        switch (this.f40921a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f40922b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f40921a) {
            case 1:
                uv0 uv0Var = this.f40922b;
                if (view != uv0Var.K && view != uv0Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(uv0Var.M, 0.0f, uv0Var.f42530y), getWidth(), AndroidUtilities.lerp(uv0Var.N, getHeight(), uv0Var.f42530y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f40921a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                this.f40922b.d();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f40921a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                uv0 uv0Var = this.f40922b;
                uv0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = uv0Var.T;
                    if (childAt == viewGroup) {
                        float f7 = uv0Var.U;
                        if (f7 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f7), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = uv0Var.R;
                    if (childAt == viewGroup2) {
                        float f10 = uv0Var.S;
                        if (f10 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.gl0 gl0Var = uv0Var.Q;
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
        switch (this.f40921a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                uv0 uv0Var = this.f40922b;
                hh.d.c(uv0Var.F, uv0Var.f42518c);
                uv0Var.G.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
