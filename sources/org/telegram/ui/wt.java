package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
public final class wt extends org.telegram.ui.Components.na {
    public final vt P1;
    public final s6 Q1;
    public final m4.d0 R1;
    public l6 S1;
    public final org.telegram.ui.Components.ew0[] T1;
    public final org.telegram.ui.Cells.c2[] U1;
    public final LinearLayout V1;
    public final i6 W1;
    public final long X1;
    public final ci.c Y1;

    public wt(y6 y6Var, s6 s6Var, ci.c cVar, m4.d0 d0Var) {
        super((org.telegram.ui.ActionBar.f2) y6Var, false, !cVar.h(), (org.telegram.ui.ActionBar.f6) null);
        String M0;
        int i7;
        long j3;
        String str;
        ?? r62 = 1;
        String str2 = null;
        int i10 = 8;
        this.T1 = new org.telegram.ui.Components.ew0[8];
        this.U1 = new org.telegram.ui.Cells.c2[8];
        this.R1 = d0Var;
        this.Q1 = s6Var;
        this.Y1 = cVar;
        this.X1 = s6Var.f49660a;
        this.f28641q0 = false;
        b1();
        this.f28641q0 = true;
        this.f36266r1 = 0.2f;
        Activity parentActivity = y6Var.getParentActivity();
        N();
        this.f28648v0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        vt vtVar = new vt(getContext(), s6Var.f49660a, d0Var);
        this.P1 = vtVar;
        linearLayout.addView(vtVar, c8.ha.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.c2 c2Var = null;
        while (i11 < i10) {
            if (i11 == 0) {
                M0 = org.telegram.messenger.hd.M0(2131748762, str2);
                i7 = org.telegram.ui.ActionBar.k6.Zj;
            } else if (i11 == r62) {
                M0 = org.telegram.messenger.hd.M0(2131748758, str2);
                i7 = org.telegram.ui.ActionBar.k6.Vj;
            } else if (i11 == 2) {
                M0 = org.telegram.messenger.hd.M0(2131748767, str2);
                i7 = org.telegram.ui.ActionBar.k6.Wj;
            } else if (i11 == 3) {
                M0 = org.telegram.messenger.hd.M0(2131748764, str2);
                i7 = org.telegram.ui.ActionBar.k6.Xj;
            } else if (i11 == 4) {
                M0 = org.telegram.messenger.hd.M0(2131748774, str2);
                i7 = org.telegram.ui.ActionBar.k6.ak;
            } else if (i11 == 5) {
                M0 = org.telegram.messenger.hd.M0(2131748760, str2);
                i7 = org.telegram.ui.ActionBar.k6.bk;
            } else if (i11 == 7) {
                M0 = org.telegram.messenger.hd.M0(2131748759, str2);
                i7 = org.telegram.ui.ActionBar.k6.ck;
            } else {
                M0 = org.telegram.messenger.hd.M0(2131748765, str2);
                i7 = org.telegram.ui.ActionBar.k6.dk;
            }
            String str3 = M0;
            int i12 = i7;
            t6 t6Var = (t6) s6Var.d.get(i11);
            if (t6Var != null) {
                j3 = t6Var.f49952a;
            } else {
                j3 = 0;
            }
            if (j3 > 0) {
                org.telegram.ui.Components.ew0[] ew0VarArr = this.T1;
                ?? obj = new Object();
                Paint paint = new Paint((int) r62);
                obj.f33361e = paint;
                obj.f33360c = r62;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                ew0VarArr[i11] = obj;
                org.telegram.ui.Components.ew0 ew0Var = this.T1[i11];
                ew0Var.f33358a = j3;
                ew0Var.f33359b = i12;
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(parentActivity, 4, 21, false, null);
                c2Var2.setTag(Integer.valueOf(i11));
                c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                this.V1.addView(c2Var2, c8.ha.o(-1, 50));
                c2Var2.e(str3, org.telegram.messenger.g0.i0(j3, false, false), true, true, false);
                if (c2Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.r6.V(c2Var2.getTextView(), org.telegram.ui.ActionBar.k6.f27957j5, null);
                } else {
                    c2Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27957j5, false));
                }
                int i13 = org.telegram.ui.ActionBar.k6.f27979k7;
                org.telegram.ui.Components.wo woVar = c2Var2.f28977r;
                if (woVar != null) {
                    woVar.b(i12, i12, i13);
                }
                c2Var2.setOnClickListener(new org.telegram.ui.Components.t41(7, this, cVar));
                this.U1[i11] = c2Var2;
                c2Var = c2Var2;
                str = null;
            } else {
                str = null;
                this.T1[i11] = null;
                this.U1[i11] = null;
            }
            i11++;
            str2 = str;
            i10 = 8;
            r62 = 1;
        }
        if (c2Var != null) {
            c2Var.setNeedDivider(false);
        }
        vt vtVar2 = this.P1;
        org.telegram.ui.Components.ew0[] ew0VarArr2 = this.T1;
        vtVar2.f33652b = ew0VarArr2;
        vtVar2.F = cVar;
        vtVar2.invalidate();
        vtVar2.f33653c = new float[ew0VarArr2.length];
        vtVar2.d = new float[ew0VarArr2.length];
        vtVar2.f33654e = new float[ew0VarArr2.length];
        vtVar2.c(false);
        if (vtVar2.D > 1) {
            vtVar2.f33655f = 0.0f;
        } else {
            vtVar2.f33655f = 1.0f;
        }
        i6 i6Var = new i6(this, getContext(), y6Var);
        this.W1 = i6Var;
        int L = org.telegram.messenger.g0.L(80.0f);
        if (i6Var.f49972x == null) {
            i6Var.f49971w = L;
            int i14 = 0;
            while (true) {
                org.telegram.ui.Components.v61 v61Var = i6Var.f49968n;
                if (i14 >= v61Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.pj0 c10 = i6Var.c(v61Var.getViewPages()[i14]);
                if (c10 != null) {
                    c10.setPadding(c10.getPaddingLeft(), 0, c10.getPaddingRight(), L);
                }
                i14++;
            }
        }
        this.W1.setCacheModel(cVar);
        this.W1.setDelegate(new j2.n(18, this, cVar));
        org.telegram.ui.Components.ha haVar = this.f36265q1;
        if (haVar != null) {
            haVar.setChildLayout(this.W1);
        } else {
            d1();
            this.V1.addView(this.S1, c8.ha.r(-1, 72, 80));
        }
        if (this.S1 != null) {
            this.S1.a(this.P1.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        return new bi.k5(this, 6);
    }

    @Override
    public final CharSequence O0() {
        return this.f36263o1.getMessagesController().c1(this.X1);
    }

    @Override
    public final void U0(org.telegram.ui.Components.rt0 rt0Var) {
        this.f36261k1.j(new g3(this, 10));
        if (this.f36265q1 != null) {
            d1();
            rt0Var.addView(this.S1, c8.ha.e(-1, 72, 80));
        }
    }

    public final void d1() {
        l6 l6Var = new l6(getContext());
        this.S1 = l6Var;
        l6Var.f47446a.setOnClickListener(new a(this, 19));
        vt vtVar = this.P1;
        if (vtVar != null) {
            this.S1.a(vtVar.a(), true);
        }
    }
}
