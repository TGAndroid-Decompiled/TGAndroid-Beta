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
    public final p50 f53956a;
    public final e4 f53957b;
    public z2 f53958c;
    public org.telegram.ui.Components.kj0 d;
    public int f53959e;
    public int f53960f;
    public int h;
    public int f53961n;
    public int f53962r;
    public int f53963s;
    public boolean f53964w;
    public y3 f53965x;
    public CheckBoxBase f53966y;

    public y1(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f53956a = p50Var;
        this.f53957b = e4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        y3 y3Var = this.f53965x;
        if (y3Var != null) {
            z2Var = y3Var.f53979i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        p50 p50Var = this.f53956a;
        e4 e4Var = this.f53957b;
        if (e4Var != null && e4Var.H) {
            int measuredWidth = getMeasuredWidth();
            p50Var.getClass();
            int L = measuredWidth - org.telegram.messenger.g0.L(18);
            z3 z3Var = this.f53965x.f53976c;
            return org.telegram.messenger.n10.B(20.0f, z3Var.f54342e, L - z3Var.f54340b);
        }
        p50Var.getClass();
        return org.telegram.messenger.f3.D(20.0f, this.f53965x.f53976c.f54342e, (org.telegram.messenger.g0.L(18) + this.f53965x.f53976c.f54340b) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i7;
        int boundLeft;
        this.f53956a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f53965x;
        if (y3Var != null && y3Var.f53979i != null) {
            i7 = Math.min(Integer.MAX_VALUE, (this.f53965x.f53979i.k() + a()) - L);
        } else {
            i7 = Integer.MAX_VALUE;
        }
        z2 z2Var = this.f53958c;
        if (z2Var != null) {
            i7 = Math.min(i7, (z2Var.k() + z2Var.f54332s) - L);
        }
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59123a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i7 = Math.min(i7, this.f53961n + boundLeft);
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
        this.f53956a.getClass();
        int L = org.telegram.messenger.g0.L(18);
        y3 y3Var = this.f53965x;
        if (y3Var != null && y3Var.f53979i != null) {
            i7 = Math.max(Integer.MIN_VALUE, this.f53965x.f53979i.l() + a() + L);
        } else {
            i7 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f53958c;
        if (z2Var != null) {
            i7 = Math.max(i7, z2Var.l() + z2Var.f54332s + L);
        }
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59123a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i7 = Math.max(i7, this.f53961n + boundRight);
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
        z2 z2Var = this.f53958c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f54332s;
            this.f53956a.getClass();
            i7 = org.telegram.messenger.g0.L(18);
        } else {
            org.telegram.ui.Components.kj0 kj0Var = this.d;
            if (kj0Var != null) {
                View view = kj0Var.f59123a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i7 = this.f53961n;
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
            kj0Var.f59123a.invalidate();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59123a;
            if (view instanceof org.telegram.ui.Cells.i9) {
                ((org.telegram.ui.Cells.i9) view).k(arrayList);
            }
        }
        z2 z2Var = this.f53958c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f53958c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f53958c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f53965x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f53965x.f53979i;
            p50 p50Var = this.f53956a;
            if (z2Var != null) {
                canvas.save();
                e4 e4Var = this.f53957b;
                if (e4Var != null && e4Var.H) {
                    p50Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.g0.L(18);
                    z3 z3Var = this.f53965x.f53976c;
                    canvas.translate(org.telegram.messenger.n10.B(20.0f, z3Var.f54342e, L - z3Var.f54340b), this.f53960f + this.h);
                } else {
                    p50Var.getClass();
                    int L2 = org.telegram.messenger.g0.L(18);
                    y3 y3Var = this.f53965x;
                    canvas.translate(org.telegram.messenger.f3.D(20.0f, this.f53965x.f53976c.f54342e, (L2 + y3Var.f53976c.f54340b) - ((int) Math.ceil(y3Var.f53979i.d.getLineWidth(0)))), this.f53960f + this.h);
                }
                this.f53965x.f53979i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f53966y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f53959e - org.telegram.messenger.g0.L(26.0f), this.f53960f, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                this.f53966y.a(canvas);
            }
            if (this.f53958c != null) {
                canvas.save();
                canvas.translate(this.f53959e, this.f53960f);
                g4.t(p50Var, canvas, this, 0);
                this.f53958c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f53958c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f53956a, this.f53957b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.kj0 kj0Var = this.d;
        if (kj0Var != null) {
            View view = kj0Var.f59123a;
            int i13 = this.f53961n;
            view.layout(i13, this.f53962r, view.getMeasuredWidth() + i13, this.d.f59123a.getMeasuredHeight() + this.f53962r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (g4.j(this.f53956a, this.f53957b, motionEvent, this, this.f53958c, this.f53959e, this.f53960f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(y3 y3Var) {
        y3 y3Var2 = this.f53965x;
        e4 e4Var = this.f53957b;
        if (y3Var2 != y3Var) {
            this.f53965x = y3Var;
            org.telegram.ui.Components.kj0 kj0Var = this.d;
            if (kj0Var != null) {
                removeView(kj0Var.f59123a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f53965x.d;
            if (pageBlock != null && e4Var != null) {
                int I = e4.I(pageBlock);
                this.f53963s = I;
                v4.f1 x10 = e4Var.x(this, I);
                this.d = (org.telegram.ui.Components.kj0) x10;
                addView(x10.f59123a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f53965x.d;
        if (pageBlock2 != null && e4Var != null) {
            e4Var.H(this.f53963s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
