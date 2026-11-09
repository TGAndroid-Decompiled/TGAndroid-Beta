package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
public final class yt extends org.telegram.ui.Components.na {
    public final xt P1;
    public final s6 Q1;
    public final m4.d0 R1;
    public l6 S1;
    public final org.telegram.ui.Components.fw0[] T1;
    public final org.telegram.ui.Cells.c2[] U1;
    public final LinearLayout V1;
    public final i6 W1;
    public final long X1;
    public final ci.c Y1;

    public yt(y6 y6Var, s6 s6Var, ci.c cVar, m4.d0 d0Var) {
        super((org.telegram.ui.ActionBar.f2) y6Var, false, !cVar.h(), (org.telegram.ui.ActionBar.g6) null);
        String M0;
        int i7;
        long j3;
        String str;
        ?? r62 = 1;
        String str2 = null;
        int i10 = 8;
        this.T1 = new org.telegram.ui.Components.fw0[8];
        this.U1 = new org.telegram.ui.Cells.c2[8];
        this.R1 = d0Var;
        this.Q1 = s6Var;
        this.Y1 = cVar;
        this.X1 = s6Var.f49776a;
        this.f28649q0 = false;
        b1();
        this.f28649q0 = true;
        this.f36308r1 = 0.2f;
        Activity parentActivity = y6Var.getParentActivity();
        N();
        this.f28656v0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        xt xtVar = new xt(getContext(), s6Var.f49776a, d0Var);
        this.P1 = xtVar;
        linearLayout.addView(xtVar, c8.ha.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.c2 c2Var = null;
        while (i11 < i10) {
            if (i11 == 0) {
                M0 = org.telegram.messenger.id.M0(2131748763, str2);
                i7 = org.telegram.ui.ActionBar.l6.Zj;
            } else if (i11 == r62) {
                M0 = org.telegram.messenger.id.M0(2131748759, str2);
                i7 = org.telegram.ui.ActionBar.l6.Vj;
            } else if (i11 == 2) {
                M0 = org.telegram.messenger.id.M0(2131748768, str2);
                i7 = org.telegram.ui.ActionBar.l6.Wj;
            } else if (i11 == 3) {
                M0 = org.telegram.messenger.id.M0(2131748765, str2);
                i7 = org.telegram.ui.ActionBar.l6.Xj;
            } else if (i11 == 4) {
                M0 = org.telegram.messenger.id.M0(2131748775, str2);
                i7 = org.telegram.ui.ActionBar.l6.ak;
            } else if (i11 == 5) {
                M0 = org.telegram.messenger.id.M0(2131748761, str2);
                i7 = org.telegram.ui.ActionBar.l6.bk;
            } else if (i11 == 7) {
                M0 = org.telegram.messenger.id.M0(2131748760, str2);
                i7 = org.telegram.ui.ActionBar.l6.ck;
            } else {
                M0 = org.telegram.messenger.id.M0(2131748766, str2);
                i7 = org.telegram.ui.ActionBar.l6.dk;
            }
            String str3 = M0;
            int i12 = i7;
            t6 t6Var = (t6) s6Var.d.get(i11);
            if (t6Var != null) {
                j3 = t6Var.f50094a;
            } else {
                j3 = 0;
            }
            if (j3 > 0) {
                org.telegram.ui.Components.fw0[] fw0VarArr = this.T1;
                ?? obj = new Object();
                Paint paint = new Paint((int) r62);
                obj.f33749e = paint;
                obj.f33748c = r62;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                fw0VarArr[i11] = obj;
                org.telegram.ui.Components.fw0 fw0Var = this.T1[i11];
                fw0Var.f33746a = j3;
                fw0Var.f33747b = i12;
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(parentActivity, 4, 21, false, null);
                c2Var2.setTag(Integer.valueOf(i11));
                c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.l6.N0(false));
                this.V1.addView(c2Var2, c8.ha.o(-1, 50));
                c2Var2.e(str3, org.telegram.messenger.g0.i0(j3, false, false), true, true, false);
                if (c2Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.s6.U(c2Var2.getTextView(), org.telegram.ui.ActionBar.l6.f27973j5, null);
                } else {
                    c2Var2.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27973j5, false));
                }
                int i13 = org.telegram.ui.ActionBar.l6.f27995k7;
                org.telegram.ui.Components.wo woVar = c2Var2.f28984r;
                if (woVar != null) {
                    woVar.b(i12, i12, i13);
                }
                c2Var2.setOnClickListener(new org.telegram.ui.Components.u41(7, this, cVar));
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
        xt xtVar2 = this.P1;
        org.telegram.ui.Components.fw0[] fw0VarArr2 = this.T1;
        xtVar2.f34059b = fw0VarArr2;
        xtVar2.F = cVar;
        xtVar2.invalidate();
        xtVar2.f34060c = new float[fw0VarArr2.length];
        xtVar2.d = new float[fw0VarArr2.length];
        xtVar2.f34061e = new float[fw0VarArr2.length];
        xtVar2.c(false);
        if (xtVar2.D > 1) {
            xtVar2.f34062f = 0.0f;
        } else {
            xtVar2.f34062f = 1.0f;
        }
        i6 i6Var = new i6(this, getContext(), y6Var);
        this.W1 = i6Var;
        int L = org.telegram.messenger.g0.L(80.0f);
        if (i6Var.f50107x == null) {
            i6Var.f50106w = L;
            int i14 = 0;
            while (true) {
                org.telegram.ui.Components.w61 w61Var = i6Var.f50103n;
                if (i14 >= w61Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.qj0 c10 = i6Var.c(w61Var.getViewPages()[i14]);
                if (c10 != null) {
                    c10.setPadding(c10.getPaddingLeft(), 0, c10.getPaddingRight(), L);
                }
                i14++;
            }
        }
        this.W1.setCacheModel(cVar);
        this.W1.setDelegate(new j2.n(18, this, cVar));
        org.telegram.ui.Components.ha haVar = this.f36307q1;
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
    public final org.telegram.ui.Components.pj0 L0(org.telegram.ui.Components.qj0 qj0Var) {
        return new bi.k5(this, 6);
    }

    @Override
    public final CharSequence O0() {
        return this.f36305o1.getMessagesController().c1(this.X1);
    }

    @Override
    public final void U0(org.telegram.ui.Components.tt0 tt0Var) {
        this.f36303k1.j(new g3(this, 10));
        if (this.f36307q1 != null) {
            d1();
            tt0Var.addView(this.S1, c8.ha.e(-1, 72, 80));
        }
    }

    public final void d1() {
        l6 l6Var = new l6(getContext());
        this.S1 = l6Var;
        l6Var.f47475a.setOnClickListener(new a(this, 19));
        xt xtVar = this.P1;
        if (xtVar != null) {
            this.S1.a(xtVar.a(), true);
        }
    }
}
