package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
public final class zt extends org.telegram.ui.Components.ma {
    public final yt S1;
    public final s6 T1;
    public final m4.d0 U1;
    public l6 V1;
    public final org.telegram.ui.Components.ew0[] W1;
    public final org.telegram.ui.Cells.c2[] X1;
    public final LinearLayout Y1;
    public final i6 Z1;
    public final long f52532a2;
    public final ci.c f52533b2;

    public zt(y6 y6Var, s6 s6Var, ci.c cVar, m4.d0 d0Var) {
        super((org.telegram.ui.ActionBar.f2) y6Var, false, !cVar.h(), (org.telegram.ui.ActionBar.h6) null);
        String M0;
        int i7;
        long j3;
        String str;
        ?? r62 = 1;
        String str2 = null;
        int i10 = 8;
        this.W1 = new org.telegram.ui.Components.ew0[8];
        this.X1 = new org.telegram.ui.Cells.c2[8];
        this.U1 = d0Var;
        this.T1 = s6Var;
        this.f52533b2 = cVar;
        this.f52532a2 = s6Var.f49684a;
        this.f28700q0 = false;
        b1();
        this.f28700q0 = true;
        this.f35908u1 = 0.2f;
        Activity parentActivity = y6Var.getParentActivity();
        N();
        this.f28707v0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Y1 = linearLayout;
        linearLayout.setOrientation(1);
        yt ytVar = new yt(getContext(), s6Var.f49684a, d0Var);
        this.S1 = ytVar;
        linearLayout.addView(ytVar, c8.ha.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.c2 c2Var = null;
        while (i11 < i10) {
            if (i11 == 0) {
                M0 = org.telegram.messenger.id.M0(2131748763, str2);
                i7 = org.telegram.ui.ActionBar.m6.Zj;
            } else if (i11 == r62) {
                M0 = org.telegram.messenger.id.M0(2131748759, str2);
                i7 = org.telegram.ui.ActionBar.m6.Vj;
            } else if (i11 == 2) {
                M0 = org.telegram.messenger.id.M0(2131748768, str2);
                i7 = org.telegram.ui.ActionBar.m6.Wj;
            } else if (i11 == 3) {
                M0 = org.telegram.messenger.id.M0(2131748765, str2);
                i7 = org.telegram.ui.ActionBar.m6.Xj;
            } else if (i11 == 4) {
                M0 = org.telegram.messenger.id.M0(2131748775, str2);
                i7 = org.telegram.ui.ActionBar.m6.ak;
            } else if (i11 == 5) {
                M0 = org.telegram.messenger.id.M0(2131748761, str2);
                i7 = org.telegram.ui.ActionBar.m6.bk;
            } else if (i11 == 7) {
                M0 = org.telegram.messenger.id.M0(2131748760, str2);
                i7 = org.telegram.ui.ActionBar.m6.ck;
            } else {
                M0 = org.telegram.messenger.id.M0(2131748766, str2);
                i7 = org.telegram.ui.ActionBar.m6.dk;
            }
            String str3 = M0;
            int i12 = i7;
            t6 t6Var = (t6) s6Var.d.get(i11);
            if (t6Var != null) {
                j3 = t6Var.f50141a;
            } else {
                j3 = 0;
            }
            if (j3 > 0) {
                org.telegram.ui.Components.ew0[] ew0VarArr = this.W1;
                ?? obj = new Object();
                Paint paint = new Paint((int) r62);
                obj.f33347e = paint;
                obj.f33346c = r62;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                ew0VarArr[i11] = obj;
                org.telegram.ui.Components.ew0 ew0Var = this.W1[i11];
                ew0Var.f33344a = j3;
                ew0Var.f33345b = i12;
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(parentActivity, 4, 21, false, null);
                c2Var2.setTag(Integer.valueOf(i11));
                c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                this.Y1.addView(c2Var2, c8.ha.o(-1, 50));
                c2Var2.e(str3, org.telegram.messenger.g0.i0(j3, false, false), true, true, false);
                if (c2Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.t6.U(c2Var2.getTextView(), org.telegram.ui.ActionBar.m6.f27998j5, null);
                } else {
                    c2Var2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27998j5, false));
                }
                int i13 = org.telegram.ui.ActionBar.m6.f28020k7;
                org.telegram.ui.Components.wo woVar = c2Var2.f28995r;
                if (woVar != null) {
                    woVar.b(i12, i12, i13);
                }
                c2Var2.setOnClickListener(new org.telegram.ui.Components.u41(7, this, cVar));
                this.X1[i11] = c2Var2;
                c2Var = c2Var2;
                str = null;
            } else {
                str = null;
                this.W1[i11] = null;
                this.X1[i11] = null;
            }
            i11++;
            str2 = str;
            i10 = 8;
            r62 = 1;
        }
        if (c2Var != null) {
            c2Var.setNeedDivider(false);
        }
        yt ytVar2 = this.S1;
        org.telegram.ui.Components.ew0[] ew0VarArr2 = this.W1;
        ytVar2.f33653b = ew0VarArr2;
        ytVar2.F = cVar;
        ytVar2.invalidate();
        ytVar2.f33654c = new float[ew0VarArr2.length];
        ytVar2.d = new float[ew0VarArr2.length];
        ytVar2.f33655e = new float[ew0VarArr2.length];
        ytVar2.c(false);
        if (ytVar2.D > 1) {
            ytVar2.f33656f = 0.0f;
        } else {
            ytVar2.f33656f = 1.0f;
        }
        i6 i6Var = new i6(this, getContext(), y6Var);
        this.Z1 = i6Var;
        int L = org.telegram.messenger.g0.L(80.0f);
        if (i6Var.f50160x == null) {
            i6Var.f50159w = L;
            int i14 = 0;
            while (true) {
                org.telegram.ui.Components.v61 v61Var = i6Var.f50156n;
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
        this.Z1.setCacheModel(cVar);
        this.Z1.setDelegate(new j2.n(18, this, cVar));
        org.telegram.ui.Components.ga gaVar = this.f35907t1;
        if (gaVar != null) {
            gaVar.setChildLayout(this.Z1);
        } else {
            d1();
            this.Y1.addView(this.V1, c8.ha.r(-1, 72, 80));
        }
        if (this.V1 != null) {
            this.V1.a(this.S1.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        return new bi.k5(this, 6);
    }

    @Override
    public final CharSequence O0() {
        return this.f35905r1.getMessagesController().c1(this.f52532a2);
    }

    @Override
    public final void U0(org.telegram.ui.Components.st0 st0Var) {
        this.n1.j(new g3(this, 10));
        if (this.f35907t1 != null) {
            d1();
            st0Var.addView(this.V1, c8.ha.e(-1, 72, 80));
        }
    }

    public final void d1() {
        l6 l6Var = new l6(getContext());
        this.V1 = l6Var;
        l6Var.f47520a.setOnClickListener(new a(this, 19));
        yt ytVar = this.S1;
        if (ytVar != null) {
            this.V1.a(ytVar.a(), true);
        }
    }
}
