package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
public final class y1 extends ViewGroup implements org.telegram.ui.Cells.g9, c3 {
    public final n50 f53376a;
    public final e4 f53377b;
    public z2 f53378c;
    public org.telegram.ui.Components.cj0 d;
    public int f53379e;
    public int f53380f;
    public int h;
    public int f53381n;
    public int f53382r;
    public int f53383s;
    public boolean f53384w;
    public y3 f53385x;
    public CheckBoxBase f53386y;

    public y1(Context context, n50 n50Var, e4 e4Var) {
        super(context);
        this.f53376a = n50Var;
        this.f53377b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        y3 y3Var = this.f53385x;
        if (y3Var != null) {
            z2Var = y3Var.f53398i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        n50 n50Var = this.f53376a;
        e4 e4Var = this.f53377b;
        if (e4Var != null && e4Var.H) {
            int measuredWidth = getMeasuredWidth();
            n50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(18);
            z3 z3Var = this.f53385x.f53395c;
            return org.telegram.messenger.i20.A(20.0f, z3Var.f53789e, L - z3Var.f53787b);
        }
        n50Var.getClass();
        return org.telegram.messenger.k5.D(20.0f, this.f53385x.f53395c.f53789e, (org.telegram.messenger.g0.L(18) + this.f53385x.f53395c.f53787b) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f53376a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f53385x;
        if (y3Var != null && y3Var.f53398i != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f53385x.f53398i.k() + a()) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var = this.f53378c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f53777s) - L);
        }
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f53381n + boundLeft);
            }
        }
        if (i7 == Integer.MAX_VALUE) {
            return -1;
        }
        return i7;
    }

    @Override
    public int getBoundRight() {
        int i7;
        int boundRight;
        this.f53376a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f53385x;
        if (y3Var != null && y3Var.f53398i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f53385x.f53398i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f53378c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f53777s + L);
        }
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f53381n + boundRight);
            }
        }
        if (i7 == Integer.MIN_VALUE) {
            return -1;
        }
        return i7;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i7;
        z2 z2Var = this.f53378c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f53777s;
            this.f53376a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.cj0 cj0Var = this.d;
            if (cj0Var != null) {
                View view = cj0Var.f58535a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f53381n;
                }
            }
            return -1;
        }
        return i7 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.i20.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            cj0Var.f58535a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            if (view instanceof org.telegram.ui.Cells.g9) {
                ((org.telegram.ui.Cells.g9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f53378c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f53378c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f53378c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f53385x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f53385x.f53398i;
            n50 n50Var = this.f53376a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f53377b;
                if (e4Var != null && e4Var.H) {
                    n50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(18);
                    z3 z3Var = this.f53385x.f53395c;
                    canvas.translate(org.telegram.messenger.i20.A(20.0f, z3Var.f53789e, L - z3Var.f53787b), this.f53380f + this.h);
                } else {
                    n50Var.getClass();
                    int L2 = org.telegram.messenger.g0.L(18);
                    y3 y3Var = this.f53385x;
                    canvas.translate(org.telegram.messenger.k5.D(20.0f, this.f53385x.f53395c.f53789e, (L2 + y3Var.f53395c.f53787b) - ((int) Math.ceil(y3Var.f53398i.d.getLineWidth(0)))), this.f53380f + this.h);
                }
                this.f53385x.f53398i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f53386y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f53379e - org.telegram.messenger.g0.L(26.0f), this.f53380f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.f53386y.a(canvas);
            }
            if (this.f53378c != null) {
                canvas.save();
                canvas.translate(this.f53379e, this.f53380f);
                g4.t(n50Var, canvas, this, 0);
                this.f53378c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f53378c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f53376a, this.f53377b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            int i13 = this.f53381n;
            view.layout(i13, this.f53382r, view.getMeasuredWidth() + i13, this.d.f58535a.getMeasuredHeight() + this.f53382r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f53376a, this.f53377b, motionEvent, this, this.f53378c, this.f53379e, this.f53380f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f53385x;
        e4 e4Var = this.f53377b;
        if (y3Var2 != y3Var) {
            this.f53385x = y3Var;
            org.telegram.ui.Components.cj0 cj0Var = this.d;
            if (cj0Var != null) {
                removeView(cj0Var.f58535a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f53385x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f53383s = I;
                v4.e1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.cj0) x10;
                addView(x10.f58535a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f53385x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f53383s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
