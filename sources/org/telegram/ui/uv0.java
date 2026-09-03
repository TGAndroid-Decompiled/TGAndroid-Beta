package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class uv0 extends FrameLayout {
    public final int f41945a;
    public final yv0 f41946b;

    public uv0(yv0 yv0Var, Context context, int i10) {
        super(context);
        this.f41945a = i10;
        this.f41946b = yv0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f41945a) {
            case 0:
                yv0 yv0Var = this.f41946b;
                if (yv0Var.f43720y > 0.0f && yv0Var.f43718w != null) {
                    yv0Var.f43719x.reset();
                    float width = getWidth() / yv0Var.f43717s.getWidth();
                    yv0Var.f43719x.postScale(width, width);
                    yv0Var.v.setLocalMatrix(yv0Var.f43719x);
                    yv0Var.f43718w.setAlpha((int) (yv0Var.f43720y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), yv0Var.f43718w);
                } else {
                    canvas2 = canvas;
                }
                if (yv0Var.L && (t1Var = yv0Var.I) != null) {
                    t1Var.I7 = yv0Var.M;
                    t1Var.invalidate();
                    yv0Var.L = false;
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
        switch (this.f41945a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f41946b.c(true);
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f41945a) {
            case 1:
                yv0 yv0Var = this.f41946b;
                if (view != yv0Var.H && view != yv0Var.G) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(yv0Var.J, 0.0f, yv0Var.f43720y), getWidth(), AndroidUtilities.lerp(yv0Var.K, getHeight(), yv0Var.f43720y));
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f41945a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                this.f41946b.d();
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f41945a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                yv0 yv0Var = this.f41946b;
                yv0Var.e();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    ViewGroup viewGroup = yv0Var.Q;
                    if (childAt == viewGroup) {
                        float f10 = yv0Var.R;
                        if (f10 > 0.0f) {
                            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f10), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    ViewGroup viewGroup2 = yv0Var.O;
                    if (childAt == viewGroup2) {
                        float f11 = yv0Var.P;
                        if (f11 > 0.0f) {
                            viewGroup2.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) f11), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    }
                    org.telegram.ui.Components.qk0 qk0Var = yv0Var.N;
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
        switch (this.f41945a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                yv0 yv0Var = this.f41946b;
                ug.c.c(yv0Var.C, yv0Var.f43710c);
                yv0Var.D.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
