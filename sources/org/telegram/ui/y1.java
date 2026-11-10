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
    public final r50 f51858a;
    public final e4 f51859b;
    public z2 f51860c;
    public org.telegram.ui.Components.xi0 d;
    public int f51861e;
    public int f51862f;
    public int h;
    public int f51863n;
    public int f51864r;
    public int f51865s;
    public boolean f51866w;
    public y3 f51867x;
    public CheckBoxBase f51868y;

    public y1(Context context, r50 r50Var, e4 e4Var) {
        super(context);
        this.f51858a = r50Var;
        this.f51859b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        y3 y3Var = this.f51867x;
        if (y3Var != null) {
            z2Var = y3Var.f51879i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        r50 r50Var = this.f51858a;
        e4 e4Var = this.f51859b;
        if (e4Var != null && e4Var.G) {
            int measuredWidth = getMeasuredWidth();
            r50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(18);
            z3 z3Var = this.f51867x.f51876c;
            return org.telegram.messenger.camera.q.A(20.0f, z3Var.f52194e, L - z3Var.f52192b);
        }
        r50Var.getClass();
        return org.telegram.messenger.k5.D(20.0f, this.f51867x.f51876c.f52194e, (org.telegram.messenger.g0.L(18) + this.f51867x.f51876c.f52192b) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f51858a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f51867x;
        if (y3Var != null && y3Var.f51879i != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f51867x.f51879i.k() + a()) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var = this.f51860c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f52183s) - L);
        }
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f57052a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f51863n + boundLeft);
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
        this.f51858a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f51867x;
        if (y3Var != null && y3Var.f51879i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f51867x.f51879i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f51860c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f52183s + L);
        }
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f57052a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f51863n + boundRight);
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
        z2 z2Var = this.f51860c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f52183s;
            this.f51858a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                View view = xi0Var.f57052a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f51863n;
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
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            xi0Var.f57052a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f57052a;
            if (view instanceof org.telegram.ui.Cells.h9) {
                ((org.telegram.ui.Cells.h9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f51860c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f51860c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f51860c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f51867x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f51867x.f51879i;
            r50 r50Var = this.f51858a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f51859b;
                if (e4Var != null && e4Var.G) {
                    r50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(18);
                    z3 z3Var = this.f51867x.f51876c;
                    canvas.translate(org.telegram.messenger.camera.q.A(20.0f, z3Var.f52194e, L - z3Var.f52192b), this.f51862f + this.h);
                } else {
                    r50Var.getClass();
                    int L2 = org.telegram.messenger.g0.L(18);
                    y3 y3Var = this.f51867x;
                    canvas.translate(org.telegram.messenger.k5.D(20.0f, this.f51867x.f51876c.f52194e, (L2 + y3Var.f51876c.f52192b) - ((int) Math.ceil(y3Var.f51879i.d.getLineWidth(0)))), this.f51862f + this.h);
                }
                this.f51867x.f51879i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f51868y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f51861e - org.telegram.messenger.g0.L(26.0f), this.f51862f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.f51868y.a(canvas);
            }
            if (this.f51860c != null) {
                canvas.save();
                canvas.translate(this.f51861e, this.f51862f);
                g4.t(r50Var, canvas, this, 0);
                this.f51860c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f51860c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f51858a, this.f51859b, z2Var));
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.xi0 xi0Var = this.d;
        if (xi0Var != null) {
            View view = xi0Var.f57052a;
            int i13 = this.f51863n;
            view.layout(i13, this.f51864r, view.getMeasuredWidth() + i13, this.d.f57052a.getMeasuredHeight() + this.f51864r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f51858a, this.f51859b, motionEvent, this, this.f51860c, this.f51861e, this.f51862f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f51867x;
        e4 e4Var = this.f51859b;
        if (y3Var2 != y3Var) {
            this.f51867x = y3Var;
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                removeView(xi0Var.f57052a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f51867x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f51865s = I;
                v4.d1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.xi0) x10;
                addView(x10.f57052a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f51867x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f51865s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
