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
    public final q50 f51812a;
    public final e4 f51813b;
    public z2 f51814c;
    public org.telegram.ui.Components.yi0 d;
    public int f51815e;
    public int f51816f;
    public int h;
    public int f51817n;
    public int f51818r;
    public int f51819s;
    public boolean f51820w;
    public y3 f51821x;
    public CheckBoxBase f51822y;

    public y1(Context context, q50 q50Var, e4 e4Var) {
        super(context);
        this.f51812a = q50Var;
        this.f51813b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        y3 y3Var = this.f51821x;
        if (y3Var != null) {
            z2Var = y3Var.f51835i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        q50 q50Var = this.f51812a;
        e4 e4Var = this.f51813b;
        if (e4Var != null && e4Var.G) {
            int measuredWidth = getMeasuredWidth();
            q50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(18);
            z3 z3Var = this.f51821x.f51832c;
            return org.telegram.messenger.camera.q.A(20.0f, z3Var.f52409e, L - z3Var.f52407b);
        }
        q50Var.getClass();
        return org.telegram.messenger.k5.D(20.0f, this.f51821x.f51832c.f52409e, (org.telegram.messenger.g0.L(18) + this.f51821x.f51832c.f52407b) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f51812a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f51821x;
        if (y3Var != null && y3Var.f51835i != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f51821x.f51835i.k() + a()) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var = this.f51814c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f52397s) - L);
        }
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            View view = yi0Var.f57056a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f51817n + boundLeft);
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
        this.f51812a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f51821x;
        if (y3Var != null && y3Var.f51835i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f51821x.f51835i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f51814c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f52397s + L);
        }
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            View view = yi0Var.f57056a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f51817n + boundRight);
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
        z2 z2Var = this.f51814c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f52397s;
            this.f51812a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.yi0 yi0Var = this.d;
            if (yi0Var != null) {
                View view = yi0Var.f57056a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f51817n;
                }
            }
            return -1;
        }
        return i7 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            yi0Var.f57056a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            View view = yi0Var.f57056a;
            if (view instanceof org.telegram.ui.Cells.h9) {
                ((org.telegram.ui.Cells.h9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f51814c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f51814c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f51814c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f51821x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f51821x.f51835i;
            q50 q50Var = this.f51812a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f51813b;
                if (e4Var != null && e4Var.G) {
                    q50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(18);
                    z3 z3Var = this.f51821x.f51832c;
                    canvas.translate(org.telegram.messenger.camera.q.A(20.0f, z3Var.f52409e, L - z3Var.f52407b), this.f51816f + this.h);
                } else {
                    q50Var.getClass();
                    int L2 = org.telegram.messenger.g0.L(18);
                    y3 y3Var = this.f51821x;
                    canvas.translate(org.telegram.messenger.k5.D(20.0f, this.f51821x.f51832c.f52409e, (L2 + y3Var.f51832c.f52407b) - ((int) Math.ceil(y3Var.f51835i.d.getLineWidth(0)))), this.f51816f + this.h);
                }
                this.f51821x.f51835i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f51822y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f51815e - org.telegram.messenger.g0.L(26.0f), this.f51816f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.f51822y.a(canvas);
            }
            if (this.f51814c != null) {
                canvas.save();
                canvas.translate(this.f51815e, this.f51816f);
                g4.t(q50Var, canvas, this, 0);
                this.f51814c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f51814c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f51812a, this.f51813b, z2Var));
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.yi0 yi0Var = this.d;
        if (yi0Var != null) {
            View view = yi0Var.f57056a;
            int i13 = this.f51817n;
            view.layout(i13, this.f51818r, view.getMeasuredWidth() + i13, this.d.f57056a.getMeasuredHeight() + this.f51818r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f51812a, this.f51813b, motionEvent, this, this.f51814c, this.f51815e, this.f51816f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f51821x;
        e4 e4Var = this.f51813b;
        if (y3Var2 != y3Var) {
            this.f51821x = y3Var;
            org.telegram.ui.Components.yi0 yi0Var = this.d;
            if (yi0Var != null) {
                removeView(yi0Var.f57056a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f51821x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f51819s = I;
                v4.d1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.yi0) x10;
                addView(x10.f57056a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f51821x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f51819s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
