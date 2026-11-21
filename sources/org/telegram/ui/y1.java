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
public final class y1 extends ViewGroup implements org.telegram.ui.Cells.i9, c3 {
    public final p50 f54004a;
    public final e4 f54005b;
    public z2 f54006c;
    public org.telegram.ui.Components.mj0 d;
    public int f54007e;
    public int f54008f;
    public int h;
    public int f54009n;
    public int f54010r;
    public int f54011s;
    public boolean f54012w;
    public y3 f54013x;
    public CheckBoxBase f54014y;

    public y1(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f54004a = p50Var;
        this.f54005b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        y3 y3Var = this.f54013x;
        if (y3Var != null) {
            z2Var = y3Var.f54026i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        p50 p50Var = this.f54004a;
        e4 e4Var = this.f54005b;
        if (e4Var != null && e4Var.H) {
            int measuredWidth = getMeasuredWidth();
            p50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(18);
            z3 z3Var = this.f54013x.f54023c;
            return org.telegram.messenger.n10.B(20.0f, z3Var.f54386e, L - z3Var.f54384b);
        }
        p50Var.getClass();
        return org.telegram.messenger.f3.D(20.0f, this.f54013x.f54023c.f54386e, (org.telegram.messenger.g0.L(18) + this.f54013x.f54023c.f54384b) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f54004a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f54013x;
        if (y3Var != null && y3Var.f54026i != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f54013x.f54026i.k() + a()) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var = this.f54006c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f54374s) - L);
        }
        org.telegram.ui.Components.mj0 mj0Var = this.d;
        if (mj0Var != null) {
            View view = mj0Var.f59161a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f54009n + boundLeft);
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
        this.f54004a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f54013x;
        if (y3Var != null && y3Var.f54026i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f54013x.f54026i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f54006c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f54374s + L);
        }
        org.telegram.ui.Components.mj0 mj0Var = this.d;
        if (mj0Var != null) {
            View view = mj0Var.f59161a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f54009n + boundRight);
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
        z2 z2Var = this.f54006c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f54374s;
            this.f54004a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.mj0 mj0Var = this.d;
            if (mj0Var != null) {
                View view = mj0Var.f59161a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f54009n;
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
        org.telegram.ui.Components.mj0 mj0Var = this.d;
        if (mj0Var != null) {
            mj0Var.f59161a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.mj0 mj0Var = this.d;
        if (mj0Var != null) {
            View view = mj0Var.f59161a;
            if (view instanceof org.telegram.ui.Cells.i9) {
                ((org.telegram.ui.Cells.i9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f54006c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f54006c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f54006c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f54013x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f54013x.f54026i;
            p50 p50Var = this.f54004a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f54005b;
                if (e4Var != null && e4Var.H) {
                    p50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(18);
                    z3 z3Var = this.f54013x.f54023c;
                    canvas.translate(org.telegram.messenger.n10.B(20.0f, z3Var.f54386e, L - z3Var.f54384b), this.f54008f + this.h);
                } else {
                    p50Var.getClass();
                    int L2 = org.telegram.messenger.g0.L(18);
                    y3 y3Var = this.f54013x;
                    canvas.translate(org.telegram.messenger.f3.D(20.0f, this.f54013x.f54023c.f54386e, (L2 + y3Var.f54023c.f54384b) - ((int) Math.ceil(y3Var.f54026i.d.getLineWidth(0)))), this.f54008f + this.h);
                }
                this.f54013x.f54026i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f54014y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f54007e - org.telegram.messenger.g0.L(26.0f), this.f54008f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.f54014y.a(canvas);
            }
            if (this.f54006c != null) {
                canvas.save();
                canvas.translate(this.f54007e, this.f54008f);
                g4.t(p50Var, canvas, this, 0);
                this.f54006c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f54006c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f54004a, this.f54005b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.mj0 mj0Var = this.d;
        if (mj0Var != null) {
            View view = mj0Var.f59161a;
            int i13 = this.f54009n;
            view.layout(i13, this.f54010r, view.getMeasuredWidth() + i13, this.d.f59161a.getMeasuredHeight() + this.f54010r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f54004a, this.f54005b, motionEvent, this, this.f54006c, this.f54007e, this.f54008f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f54013x;
        e4 e4Var = this.f54005b;
        if (y3Var2 != y3Var) {
            this.f54013x = y3Var;
            org.telegram.ui.Components.mj0 mj0Var = this.d;
            if (mj0Var != null) {
                removeView(mj0Var.f59161a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f54013x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f54011s = I;
                v4.f1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.mj0) x10;
                addView(x10.f59161a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f54013x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f54011s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
