package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
public final class yu extends org.telegram.ui.Components.ha {
    public final xu P1;
    public final s6 Q1;
    public final m4.c R1;
    public m6 S1;
    public final org.telegram.ui.Components.jx0[] T1;
    public final org.telegram.ui.Cells.c2[] U1;
    public final LinearLayout V1;
    public final j6 W1;
    public final long X1;
    public final sh.b Y1;

    public yu(y6 y6Var, s6 s6Var, sh.b bVar, m4.c cVar) {
        super((org.telegram.ui.ActionBar.k2) y6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.p6) null);
        String L0;
        int i10;
        long j10;
        long j11;
        String str;
        ?? r62 = 1;
        String str2 = null;
        int i11 = 8;
        this.T1 = new org.telegram.ui.Components.jx0[8];
        this.U1 = new org.telegram.ui.Cells.c2[8];
        this.R1 = cVar;
        this.Q1 = s6Var;
        this.Y1 = bVar;
        this.X1 = s6Var.f41231a;
        this.f21611q0 = false;
        b1();
        this.f21611q0 = true;
        this.f26730r1 = 0.2f;
        Activity parentActivity = y6Var.getParentActivity();
        O();
        this.f21618v0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        xu xuVar = new xu(getContext(), s6Var.f41231a, cVar);
        this.P1 = xuVar;
        linearLayout.addView(xuVar, w7.b6.t(-2, -2, 1, 0, 16, 0, 16));
        int i12 = 0;
        org.telegram.ui.Cells.c2 c2Var = null;
        while (i12 < i11) {
            if (i12 == 0) {
                L0 = org.telegram.messenger.dd.L0(2131748773, str2);
                i10 = org.telegram.ui.ActionBar.t6.Zj;
            } else if (i12 == r62) {
                L0 = org.telegram.messenger.dd.L0(2131748769, str2);
                i10 = org.telegram.ui.ActionBar.t6.Vj;
            } else if (i12 == 2) {
                L0 = org.telegram.messenger.dd.L0(2131748778, str2);
                i10 = org.telegram.ui.ActionBar.t6.Wj;
            } else if (i12 == 3) {
                L0 = org.telegram.messenger.dd.L0(2131748775, str2);
                i10 = org.telegram.ui.ActionBar.t6.Xj;
            } else if (i12 == 4) {
                L0 = org.telegram.messenger.dd.L0(2131748785, str2);
                i10 = org.telegram.ui.ActionBar.t6.ak;
            } else if (i12 == 5) {
                L0 = org.telegram.messenger.dd.L0(2131748771, str2);
                i10 = org.telegram.ui.ActionBar.t6.bk;
            } else if (i12 == 7) {
                L0 = org.telegram.messenger.dd.L0(2131748770, str2);
                i10 = org.telegram.ui.ActionBar.t6.ck;
            } else {
                L0 = org.telegram.messenger.dd.L0(2131748776, str2);
                i10 = org.telegram.ui.ActionBar.t6.dk;
            }
            String str3 = L0;
            int i13 = i10;
            t6 t6Var = (t6) s6Var.d.get(i12);
            if (t6Var != null) {
                j10 = 0;
                j11 = t6Var.f41549a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.jx0[] jx0VarArr = this.T1;
                ?? obj = new Object();
                Paint paint = new Paint((int) r62);
                obj.e = paint;
                obj.f27590c = r62;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(org.telegram.messenger.i0.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                jx0VarArr[i12] = obj;
                org.telegram.ui.Components.jx0 jx0Var = this.T1[i12];
                jx0Var.f27588a = j11;
                jx0Var.f27589b = i13;
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(4, 21, parentActivity, null, false);
                c2Var2.setTag(Integer.valueOf(i12));
                c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                this.V1.addView(c2Var2, w7.b6.o(-1, 50));
                c2Var2.e(str3, org.telegram.messenger.i0.i0(j11, false, false), true, true, false);
                if (c2Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.a7.V(c2Var2.getTextView(), org.telegram.ui.ActionBar.t6.f21038j5, null);
                } else {
                    c2Var2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21038j5, false));
                }
                int i14 = org.telegram.ui.ActionBar.t6.f21060k7;
                org.telegram.ui.Components.ep epVar = c2Var2.f21780r;
                if (epVar != null) {
                    epVar.b(i13, i13, i14);
                }
                c2Var2.setOnClickListener(new vu(0, this, bVar));
                this.U1[i12] = c2Var2;
                c2Var = c2Var2;
                str = null;
            } else {
                str = null;
                this.T1[i12] = null;
                this.U1[i12] = null;
            }
            i12++;
            str2 = str;
            i11 = 8;
            r62 = 1;
        }
        if (c2Var != null) {
            c2Var.setNeedDivider(false);
        }
        xu xuVar2 = this.P1;
        org.telegram.ui.Components.jx0[] jx0VarArr2 = this.T1;
        xuVar2.f27976b = jx0VarArr2;
        xuVar2.F = bVar;
        xuVar2.invalidate();
        xuVar2.f27977c = new float[jx0VarArr2.length];
        xuVar2.d = new float[jx0VarArr2.length];
        xuVar2.e = new float[jx0VarArr2.length];
        xuVar2.c(false);
        if (xuVar2.D > 1) {
            xuVar2.f27978f = 0.0f;
        } else {
            xuVar2.f27978f = 1.0f;
        }
        j6 j6Var = new j6(this, getContext(), y6Var);
        this.W1 = j6Var;
        int L = org.telegram.messenger.i0.L(80.0f);
        if (j6Var.f41564x == null) {
            j6Var.f41563w = L;
            int i15 = 0;
            while (true) {
                org.telegram.ui.Components.x71 x71Var = j6Var.f41560n;
                if (i15 >= x71Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.uk0 c10 = j6Var.c(x71Var.getViewPages()[i15]);
                if (c10 != null) {
                    c10.setPadding(c10.getPaddingLeft(), 0, c10.getPaddingRight(), L);
                }
                i15++;
            }
        }
        this.W1.setCacheModel(bVar);
        this.W1.setDelegate(new m5.e(this, bVar, false, 13));
        org.telegram.ui.Components.ba baVar = this.f26729q1;
        if (baVar != null) {
            baVar.setChildLayout(this.W1);
        } else {
            d1();
            this.V1.addView(this.S1, w7.b6.r(-1, 72, 80));
        }
        if (this.S1 != null) {
            this.S1.a(this.P1.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 L0(org.telegram.ui.Components.uk0 uk0Var) {
        return new kg.f(this, 5);
    }

    @Override
    public final CharSequence O0() {
        return this.f26727o1.getMessagesController().b1(this.X1);
    }

    @Override
    public final void U0(org.telegram.ui.Components.vu0 vu0Var) {
        this.f26724k1.j(new h3(this, 10));
        if (this.f26729q1 != null) {
            d1();
            vu0Var.addView(this.S1, w7.b6.e(-1, 72, 80));
        }
    }

    public final void d1() {
        m6 m6Var = new m6(getContext());
        this.S1 = m6Var;
        m6Var.f39437a.setOnClickListener(new a(this, 19));
        xu xuVar = this.P1;
        if (xuVar != null) {
            this.S1.a(xuVar.a(), true);
        }
    }
}
