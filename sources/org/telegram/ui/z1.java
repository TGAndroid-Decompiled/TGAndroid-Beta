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
public final class z1 extends ViewGroup implements org.telegram.ui.Cells.g9, d3 {
    public final i50 f52491a;
    public final g4 f52492b;
    public a3 f52493c;
    public org.telegram.ui.Components.bj0 d;
    public int f52494e;
    public int f52495f;
    public int h;
    public int f52496n;
    public int f52497r;
    public int f52498s;
    public boolean f52499w;
    public z3 f52500x;
    public CheckBoxBase f52501y;

    public z1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f52491a = i50Var;
        this.f52492b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        z3 z3Var = this.f52500x;
        if (z3Var != null) {
            a3Var = z3Var.f52521i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        i50 i50Var = this.f52491a;
        g4 g4Var = this.f52492b;
        if (g4Var != null && g4Var.H) {
            int measuredWidth = getMeasuredWidth();
            i50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(18);
            a4 a4Var = this.f52500x.f52518c;
            return org.telegram.messenger.camera.q.A(20.0f, a4Var.f43587e, L - a4Var.f43585b);
        }
        i50Var.getClass();
        return org.telegram.messenger.k5.D(20.0f, this.f52500x.f52518c.f43587e, (org.telegram.messenger.g0.L(18) + this.f52500x.f52518c.f43585b) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i3;
        int boundLeft;
        this.f52491a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        z3 z3Var = this.f52500x;
        if (z3Var != null && z3Var.f52521i != null) {
            i3 = Math.min(Integer.MAX_VALUE, (this.f52500x.f52521i.k() + a()) - L);
        } else {
            i3 = Integer.MAX_VALUE;
        }
        a3 a3Var = this.f52493c;
        if (a3Var != null) {
            i3 = Math.min(i3, (a3Var.k() + a3Var.f43579s) - L);
        }
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            View view = bj0Var.f55540a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i3 = Math.min(i3, this.f52496n + boundLeft);
            }
        }
        if (i3 == Integer.MAX_VALUE) {
            return -1;
        }
        return i3;
    }

    @Override
    public int getBoundRight() {
        int i3;
        int boundRight;
        this.f52491a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        z3 z3Var = this.f52500x;
        if (z3Var != null && z3Var.f52521i != null) {
            i3 = Math.max(Integer.MIN_VALUE, this.f52500x.f52521i.l() + a() + L);
        } else {
            i3 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f52493c;
        if (a3Var != null) {
            i3 = Math.max(i3, a3Var.l() + a3Var.f43579s + L);
        }
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            View view = bj0Var.f55540a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i3 = Math.max(i3, this.f52496n + boundRight);
            }
        }
        if (i3 == Integer.MIN_VALUE) {
            return -1;
        }
        return i3;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i3;
        a3 a3Var = this.f52493c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.m() + a3Var.f43579s;
            this.f52491a.getClass();
            i3 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.bj0 bj0Var = this.d;
            if (bj0Var != null) {
                View view = bj0Var.f55540a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i3 = this.f52496n;
                }
            }
            return -1;
        }
        return i3 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            bj0Var.f55540a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            View view = bj0Var.f55540a;
            if (view instanceof org.telegram.ui.Cells.g9) {
                ((org.telegram.ui.Cells.g9) view).k(arrayList);
            }
        }
        a3 a3Var = this.f52493c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f52493c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f52493c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f52500x != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f52500x.f52521i;
            i50 i50Var = this.f52491a;
            if (a3Var != null) {
                canvas.save();
                g4 g4Var = this.f52492b;
                if (g4Var != null && g4Var.H) {
                    i50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(18);
                    a4 a4Var = this.f52500x.f52518c;
                    canvas.translate(org.telegram.messenger.camera.q.A(20.0f, a4Var.f43587e, L - a4Var.f43585b), this.f52495f + this.h);
                } else {
                    i50Var.getClass();
                    int L2 = org.telegram.messenger.g0.L(18);
                    z3 z3Var = this.f52500x;
                    canvas.translate(org.telegram.messenger.k5.D(20.0f, this.f52500x.f52518c.f43587e, (L2 + z3Var.f52518c.f43585b) - ((int) Math.ceil(z3Var.f52521i.d.getLineWidth(0)))), this.f52495f + this.h);
                }
                this.f52500x.f52521i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f52501y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f52494e - org.telegram.messenger.g0.L(26.0f), this.f52495f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.f52501y.a(canvas);
            }
            if (this.f52493c != null) {
                canvas.save();
                canvas.translate(this.f52494e, this.f52495f);
                i4.t(i50Var, canvas, this, 0);
                this.f52493c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f52493c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.h(this.f52491a, this.f52492b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        org.telegram.ui.Components.bj0 bj0Var = this.d;
        if (bj0Var != null) {
            View view = bj0Var.f55540a;
            int i13 = this.f52496n;
            view.layout(i13, this.f52497r, view.getMeasuredWidth() + i13, this.d.f55540a.getMeasuredHeight() + this.f52497r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.j(this.f52491a, this.f52492b, motionEvent, this, this.f52493c, this.f52494e, this.f52495f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f52500x;
        g4 g4Var = this.f52492b;
        if (z3Var2 != z3Var) {
            this.f52500x = z3Var;
            org.telegram.ui.Components.bj0 bj0Var = this.d;
            if (bj0Var != null) {
                removeView(bj0Var.f55540a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f52500x.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f52498s = I;
                u4.d1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.bj0) x10;
                addView(x10.f55540a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f52500x.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f52498s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
