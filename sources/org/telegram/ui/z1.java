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
public final class z1 extends ViewGroup implements org.telegram.ui.Cells.j9, c3 {
    public final l60 f43773a;
    public final f4 f43774b;
    public z2 f43775c;
    public org.telegram.ui.Components.dk0 d;
    public int e;
    public int f43776f;
    public int h;
    public int f43777n;
    public int f43778r;
    public int f43779s;
    public boolean f43780w;
    public z3 f43781x;
    public CheckBoxBase f43782y;

    public z1(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f43773a = l60Var;
        this.f43774b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        z2 z2Var;
        z3 z3Var = this.f43781x;
        if (z3Var != null) {
            z2Var = z3Var.f43804i;
        } else {
            z2Var = null;
        }
        if (z2Var == null) {
            return 0;
        }
        l60 l60Var = this.f43773a;
        f4 f4Var = this.f43774b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            l60Var.getClass();
            int L = measuredWidth - org.telegram.messenger.i0.L(18);
            a4 a4Var = this.f43781x.f43802c;
            return org.telegram.messenger.a30.A(20.0f, a4Var.e, L - a4Var.f35557b);
        }
        l60Var.getClass();
        return org.telegram.messenger.m5.D(20.0f, this.f43781x.f43802c.e, (org.telegram.messenger.i0.L(18) + this.f43781x.f43802c.f35557b) - ((int) Math.ceil(z2Var.d.getLineWidth(0))));
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f43773a.getClass();
        int L = org.telegram.messenger.i0.L(18);
        z3 z3Var = this.f43781x;
        if (z3Var != null && z3Var.f43804i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f43781x.f43804i.k() + a()) - L);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        z2 z2Var = this.f43775c;
        if (z2Var != null) {
            i10 = Math.min(i10, (z2Var.k() + z2Var.f43793s) - L);
        }
        org.telegram.ui.Components.dk0 dk0Var = this.d;
        if (dk0Var != null) {
            View view = dk0Var.f47909a;
            if ((view instanceof c3) && (boundLeft = ((c3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f43777n + boundLeft);
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10;
    }

    @Override
    public int getBoundRight() {
        int i10;
        int boundRight;
        this.f43773a.getClass();
        int L = org.telegram.messenger.i0.L(18);
        z3 z3Var = this.f43781x;
        if (z3Var != null && z3Var.f43804i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f43781x.f43804i.l() + a() + L);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        z2 z2Var = this.f43775c;
        if (z2Var != null) {
            i10 = Math.max(i10, z2Var.l() + z2Var.f43793s + L);
        }
        org.telegram.ui.Components.dk0 dk0Var = this.d;
        if (dk0Var != null) {
            View view = dk0Var.f47909a;
            if ((view instanceof c3) && (boundRight = ((c3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f43777n + boundRight);
            }
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        return i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        z2 z2Var = this.f43775c;
        if (z2Var != null) {
            lastLineBoundRight = z2Var.m() + z2Var.f43793s;
            this.f43773a.getClass();
            i10 = org.telegram.messenger.i0.L(18);
        } else {
            org.telegram.ui.Components.dk0 dk0Var = this.d;
            if (dk0Var != null) {
                View view = dk0Var.f47909a;
                if ((view instanceof c3) && (lastLineBoundRight = ((c3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f43777n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.a30.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        org.telegram.ui.Components.dk0 dk0Var = this.d;
        if (dk0Var != null) {
            View view = dk0Var.f47909a;
            if (view instanceof org.telegram.ui.Cells.j9) {
                ((org.telegram.ui.Cells.j9) view).h(arrayList);
            }
        }
        z2 z2Var = this.f43775c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.dk0 dk0Var = this.d;
        if (dk0Var != null) {
            dk0Var.f47909a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f43775c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f43775c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43781x != null) {
            int measuredWidth = getMeasuredWidth();
            z2 z2Var = this.f43781x.f43804i;
            l60 l60Var = this.f43773a;
            if (z2Var != null) {
                canvas.save();
                f4 f4Var = this.f43774b;
                if (f4Var != null && f4Var.G) {
                    l60Var.getClass();
                    int L = measuredWidth - org.telegram.messenger.i0.L(18);
                    a4 a4Var = this.f43781x.f43802c;
                    canvas.translate(org.telegram.messenger.a30.A(20.0f, a4Var.e, L - a4Var.f35557b), this.f43776f + this.h);
                } else {
                    l60Var.getClass();
                    int L2 = org.telegram.messenger.i0.L(18);
                    z3 z3Var = this.f43781x;
                    canvas.translate(org.telegram.messenger.m5.D(20.0f, this.f43781x.f43802c.e, (L2 + z3Var.f43802c.f35557b) - ((int) Math.ceil(z3Var.f43804i.d.getLineWidth(0)))), this.f43776f + this.h);
                }
                this.f43781x.f43804i.d(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f43782y;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - org.telegram.messenger.i0.L(26.0f), this.f43776f, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
                this.f43782y.a(canvas);
            }
            if (this.f43775c != null) {
                canvas.save();
                canvas.translate(this.e, this.f43776f);
                h4.t(l60Var, canvas, this, 0);
                this.f43775c.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f43775c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.h(this.f43773a, this.f43774b, z2Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.dk0 dk0Var = this.d;
        if (dk0Var != null) {
            View view = dk0Var.f47909a;
            int i14 = this.f43777n;
            view.layout(i14, this.f43778r, view.getMeasuredWidth() + i14, this.d.f47909a.getMeasuredHeight() + this.f43778r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.j(this.f43773a, this.f43774b, motionEvent, this, this.f43775c, this.e, this.f43776f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f43781x;
        f4 f4Var = this.f43774b;
        if (z3Var2 != z3Var) {
            this.f43781x = z3Var;
            org.telegram.ui.Components.dk0 dk0Var = this.d;
            if (dk0Var != null) {
                removeView(dk0Var.f47909a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f43781x.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.f43779s = I;
                s4.c1 w9 = f4Var.w(this, I);
                this.d = (org.telegram.ui.Components.dk0) w9;
                addView(w9.f47909a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f43781x.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.f43779s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
