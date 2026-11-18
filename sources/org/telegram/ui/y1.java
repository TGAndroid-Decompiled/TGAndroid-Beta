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
public final class y1 extends ViewGroup implements org.telegram.ui.Cells.h9, c3 {
    public final p50 f53988a;
    public final e4 f53989b;
    public z2 f53990c;
    public org.telegram.ui.Components.kj0 d;
    public int f53991e;
    public int f53992f;
    public int h;
    public int f53993n;
    public int f53994r;
    public int f53995s;
    public boolean f53996w;
    public y3 f53997x;
    public CheckBoxBase f53998y;

    public y1(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f53988a = p50Var;
        this.f53989b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        y3 y3Var = this.f53997x;
        if (y3Var != null) {
            z2Var = y3Var.f54011i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        p50 p50Var = this.f53988a;
        e4 e4Var = this.f53989b;
        if (e4Var != null && e4Var.H) {
            int measuredWidth = getMeasuredWidth();
            p50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(18);
            z3 z3Var = this.f53997x.f54008c;
            return org.telegram.messenger.n10.B(20.0f, z3Var.f54383e, L - z3Var.f54381b);
        }
        p50Var.getClass();
        return org.telegram.messenger.f3.D(20.0f, this.f53997x.f54008c.f54383e, (org.telegram.messenger.g0.L(18) + this.f53997x.f54008c.f54381b) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f53988a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f53997x;
        if (y3Var != null && y3Var.f54011i != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f53997x.f54011i.k() + a()) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var = this.f53990c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f54373s) - L);
        }
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59122a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f53993n + boundLeft);
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
        this.f53988a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f53997x;
        if (y3Var != null && y3Var.f54011i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f53997x.f54011i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f53990c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f54373s + L);
        }
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59122a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f53993n + boundRight);
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
        z2 z2Var = this.f53990c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f54373s;
            this.f53988a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.kj0 kj0Var = this.d;
            if (kj0Var != null) {
                View view = kj0Var.f59122a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f53993n;
                }
            }
            return -1;
        }
        return i7 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.n10.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            kj0Var.f59122a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59122a;
            if (view instanceof org.telegram.ui.Cells.h9) {
                ((org.telegram.ui.Cells.h9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f53990c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f53990c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f53990c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f53997x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f53997x.f54011i;
            p50 p50Var = this.f53988a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f53989b;
                if (e4Var != null && e4Var.H) {
                    p50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(18);
                    z3 z3Var = this.f53997x.f54008c;
                    canvas.translate(org.telegram.messenger.n10.B(20.0f, z3Var.f54383e, L - z3Var.f54381b), this.f53992f + this.h);
                } else {
                    p50Var.getClass();
                    int L2 = org.telegram.messenger.g0.L(18);
                    y3 y3Var = this.f53997x;
                    canvas.translate(org.telegram.messenger.f3.D(20.0f, this.f53997x.f54008c.f54383e, (L2 + y3Var.f54008c.f54381b) - ((int) Math.ceil(y3Var.f54011i.d.getLineWidth(0)))), this.f53992f + this.h);
                }
                this.f53997x.f54011i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f53998y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f53991e - org.telegram.messenger.g0.L(26.0f), this.f53992f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.f53998y.a(canvas);
            }
            if (this.f53990c != null) {
                canvas.save();
                canvas.translate(this.f53991e, this.f53992f);
                g4.t(p50Var, canvas, this, 0);
                this.f53990c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f53990c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f53988a, this.f53989b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59122a;
            int i13 = this.f53993n;
            view.layout(i13, this.f53994r, view.getMeasuredWidth() + i13, this.d.f59122a.getMeasuredHeight() + this.f53994r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f53988a, this.f53989b, motionEvent, this, this.f53990c, this.f53991e, this.f53992f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f53997x;
        e4 e4Var = this.f53989b;
        if (y3Var2 != y3Var) {
            this.f53997x = y3Var;
            org.telegram.ui.Components.kj0 kj0Var = this.d;
            if (kj0Var != null) {
                removeView(kj0Var.f59122a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f53997x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f53995s = I;
                v4.f1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.kj0) x10;
                addView(x10.f59122a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f53997x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f53995s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
