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
    public final n50 f53372a;
    public final e4 f53373b;
    public z2 f53374c;
    public org.telegram.ui.Components.cj0 d;
    public int f53375e;
    public int f53376f;
    public int h;
    public int f53377n;
    public int f53378r;
    public int f53379s;
    public boolean f53380w;
    public y3 f53381x;
    public CheckBoxBase f53382y;

    public y1(Context context, n50 n50Var, e4 e4Var) {
        super(context);
        this.f53372a = n50Var;
        this.f53373b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        y3 y3Var = this.f53381x;
        if (y3Var != null) {
            z2Var = y3Var.f53394i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        n50 n50Var = this.f53372a;
        e4 e4Var = this.f53373b;
        if (e4Var != null && e4Var.H) {
            int measuredWidth = getMeasuredWidth();
            n50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(18);
            z3 z3Var = this.f53381x.f53391c;
            return org.telegram.messenger.i20.A(20.0f, z3Var.f53824e, L - z3Var.f53822b);
        }
        n50Var.getClass();
        return org.telegram.messenger.k5.D(20.0f, this.f53381x.f53391c.f53824e, (org.telegram.messenger.g0.L(18) + this.f53381x.f53391c.f53822b) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f53372a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f53381x;
        if (y3Var != null && y3Var.f53394i != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f53381x.f53394i.k() + a()) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var = this.f53374c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f53812s) - L);
        }
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f53377n + boundLeft);
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
        this.f53372a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f53381x;
        if (y3Var != null && y3Var.f53394i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f53381x.f53394i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f53374c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f53812s + L);
        }
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f53377n + boundRight);
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
        z2 z2Var = this.f53374c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f53812s;
            this.f53372a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.cj0 cj0Var = this.d;
            if (cj0Var != null) {
                View view = cj0Var.f58535a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f53377n;
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
        z2 z2Var = this.f53374c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f53374c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f53374c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f53381x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f53381x.f53394i;
            n50 n50Var = this.f53372a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f53373b;
                if (e4Var != null && e4Var.H) {
                    n50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(18);
                    z3 z3Var = this.f53381x.f53391c;
                    canvas.translate(org.telegram.messenger.i20.A(20.0f, z3Var.f53824e, L - z3Var.f53822b), this.f53376f + this.h);
                } else {
                    n50Var.getClass();
                    int L2 = org.telegram.messenger.g0.L(18);
                    y3 y3Var = this.f53381x;
                    canvas.translate(org.telegram.messenger.k5.D(20.0f, this.f53381x.f53391c.f53824e, (L2 + y3Var.f53391c.f53822b) - ((int) Math.ceil(y3Var.f53394i.d.getLineWidth(0)))), this.f53376f + this.h);
                }
                this.f53381x.f53394i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f53382y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f53375e - org.telegram.messenger.g0.L(26.0f), this.f53376f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.f53382y.a(canvas);
            }
            if (this.f53374c != null) {
                canvas.save();
                canvas.translate(this.f53375e, this.f53376f);
                g4.t(n50Var, canvas, this, 0);
                this.f53374c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f53374c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f53372a, this.f53373b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.cj0 cj0Var = this.d;
        if (cj0Var != null) {
            View view = cj0Var.f58535a;
            int i13 = this.f53377n;
            view.layout(i13, this.f53378r, view.getMeasuredWidth() + i13, this.d.f58535a.getMeasuredHeight() + this.f53378r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f53372a, this.f53373b, motionEvent, this, this.f53374c, this.f53375e, this.f53376f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f53381x;
        e4 e4Var = this.f53373b;
        if (y3Var2 != y3Var) {
            this.f53381x = y3Var;
            org.telegram.ui.Components.cj0 cj0Var = this.d;
            if (cj0Var != null) {
                removeView(cj0Var.f58535a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f53381x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f53379s = I;
                v4.e1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.cj0) x10;
                addView(x10.f58535a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f53381x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f53379s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
