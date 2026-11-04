package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class t71 extends FrameLayout {
    public final int f49725a;
    public final w71 f49726b;

    public t71(w71 w71Var, Context context, int i3) {
        super(context);
        this.f49725a = i3;
        this.f49726b = w71Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.q1 q1Var;
        switch (this.f49725a) {
            case 0:
                w71 w71Var = this.f49726b;
                if (w71Var.f50747y > 0.0f && w71Var.f50745w != null) {
                    w71Var.f50746x.reset();
                    float width = getWidth() / w71Var.f50743r.getWidth();
                    w71Var.f50746x.postScale(width, width);
                    w71Var.f50744s.setLocalMatrix(w71Var.f50746x);
                    w71Var.f50745w.setAlpha((int) (w71Var.f50747y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), w71Var.f50745w);
                } else {
                    canvas2 = canvas;
                }
                if (w71Var.O && (q1Var = w71Var.L) != null) {
                    q1Var.f29860b6 = w71Var.P;
                    q1Var.invalidate();
                    w71Var.O = false;
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
        switch (this.f49725a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f49726b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f49725a) {
            case 1:
                w71 w71Var = this.f49726b;
                if (view != w71Var.K && view != w71Var.J) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(w71Var.M, 0.0f, w71Var.f50747y), getWidth(), org.telegram.messenger.g0.T1(w71Var.N, getHeight(), w71Var.f50747y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f49725a) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                this.f49726b.d();
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f49725a) {
            case 2:
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                w71 w71Var = this.f49726b;
                w71Var.e();
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    ViewGroup viewGroup = w71Var.T;
                    if (childAt == viewGroup) {
                        float f10 = w71Var.U;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = w71Var.R;
                    if (childAt == viewGroup2) {
                        float f11 = w71Var.S;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.li0 li0Var = w71Var.Q;
                    if (childAt == li0Var) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(li0Var.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f49725a) {
            case 0:
                super.onSizeChanged(i3, i10, i11, i12);
                w71 w71Var = this.f49726b;
                jh.d.c(w71Var.F, w71Var.f50733b);
                w71Var.G.d();
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }
}
