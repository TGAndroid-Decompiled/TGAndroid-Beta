package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
public final class zt extends org.telegram.ui.Components.ra {
    public final yt T1;
    public final s6 U1;
    public final jb.m V1;
    public m6 W1;
    public final org.telegram.ui.Components.pw0[] X1;
    public final org.telegram.ui.Cells.d2[] Y1;
    public final LinearLayout Z1;
    public final j6 f54719a2;
    public final long f54720b2;
    public final ei.c f54721c2;

    public zt(y6 y6Var, s6 s6Var, ei.c cVar, jb.m mVar) {
        super((org.telegram.ui.ActionBar.g2) y6Var, false, !cVar.h(), (org.telegram.ui.ActionBar.i6) null);
        String N0;
        int i7;
        Activity activity;
        long j3;
        String str;
        ?? r62 = 1;
        String str2 = null;
        int i10 = 8;
        this.X1 = new org.telegram.ui.Components.pw0[8];
        this.Y1 = new org.telegram.ui.Cells.d2[8];
        this.V1 = mVar;
        this.U1 = s6Var;
        this.f54721c2 = cVar;
        this.f54720b2 = s6Var.f51980a;
        this.f30257r0 = false;
        c1();
        this.f30257r0 = true;
        this.f39253v1 = 0.2f;
        Activity parentActivity = y6Var.getParentActivity();
        O();
        this.f30264w0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Z1 = linearLayout;
        linearLayout.setOrientation(1);
        yt ytVar = new yt(getContext(), s6Var.f51980a, mVar);
        this.T1 = ytVar;
        linearLayout.addView(ytVar, c8.na.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.d2 d2Var = null;
        while (i11 < i10) {
            if (i11 == 0) {
                N0 = org.telegram.messenger.gd.N0(2131748570, str2);
                i7 = org.telegram.ui.ActionBar.n6.ck;
            } else if (i11 == r62) {
                N0 = org.telegram.messenger.gd.N0(2131748566, str2);
                i7 = org.telegram.ui.ActionBar.n6.Yj;
            } else if (i11 == 2) {
                N0 = org.telegram.messenger.gd.N0(2131748575, str2);
                i7 = org.telegram.ui.ActionBar.n6.Zj;
            } else if (i11 == 3) {
                N0 = org.telegram.messenger.gd.N0(2131748572, str2);
                i7 = org.telegram.ui.ActionBar.n6.ak;
            } else if (i11 == 4) {
                N0 = org.telegram.messenger.gd.N0(2131748582, str2);
                i7 = org.telegram.ui.ActionBar.n6.dk;
            } else if (i11 == 5) {
                N0 = org.telegram.messenger.gd.N0(2131748568, str2);
                i7 = org.telegram.ui.ActionBar.n6.ek;
            } else if (i11 == 7) {
                N0 = org.telegram.messenger.gd.N0(2131748567, str2);
                i7 = org.telegram.ui.ActionBar.n6.fk;
            } else {
                N0 = org.telegram.messenger.gd.N0(2131748573, str2);
                i7 = org.telegram.ui.ActionBar.n6.gk;
            }
            String str3 = N0;
            int i12 = i7;
            t6 t6Var = (t6) s6Var.d.get(i11);
            if (t6Var != null) {
                activity = parentActivity;
                j3 = t6Var.f52263a;
            } else {
                activity = parentActivity;
                j3 = 0;
            }
            if (j3 > 0) {
                org.telegram.ui.Components.pw0[] pw0VarArr = this.X1;
                ?? obj = new Object();
                Paint paint = new Paint((int) r62);
                obj.f38600e = paint;
                obj.f38599c = r62;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                pw0VarArr[i11] = obj;
                org.telegram.ui.Components.pw0 pw0Var = this.X1[i11];
                pw0Var.f38597a = j3;
                pw0Var.f38598b = i12;
                parentActivity = activity;
                org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(parentActivity, 4, 21, false, null);
                d2Var2.setTag(Integer.valueOf(i11));
                d2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                this.Z1.addView(d2Var2, c8.na.o(-1, 50));
                d2Var2.e(str3, org.telegram.messenger.g0.i0(j3, false, false), true, true, false);
                if (d2Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.u6.U(d2Var2.getTextView(), org.telegram.ui.ActionBar.n6.f29559j5, null);
                } else {
                    d2Var2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false));
                }
                int i13 = org.telegram.ui.ActionBar.n6.f29581k7;
                org.telegram.ui.Components.lp lpVar = d2Var2.f30617r;
                if (lpVar != null) {
                    lpVar.b(i12, i12, i13);
                }
                d2Var2.setOnClickListener(new org.telegram.ui.Components.p31(9, this, cVar));
                this.Y1[i11] = d2Var2;
                d2Var = d2Var2;
                str = null;
            } else {
                parentActivity = activity;
                str = null;
                this.X1[i11] = null;
                this.Y1[i11] = null;
            }
            i11++;
            str2 = str;
            i10 = 8;
            r62 = 1;
        }
        if (d2Var != null) {
            d2Var.setNeedDivider(false);
        }
        yt ytVar2 = this.T1;
        org.telegram.ui.Components.pw0[] pw0VarArr2 = this.X1;
        ytVar2.f39007b = pw0VarArr2;
        ytVar2.G = cVar;
        ytVar2.invalidate();
        ytVar2.f39008c = new float[pw0VarArr2.length];
        ytVar2.d = new float[pw0VarArr2.length];
        ytVar2.f39009e = new float[pw0VarArr2.length];
        ytVar2.c(false);
        if (ytVar2.E > 1) {
            ytVar2.f39010f = 0.0f;
        } else {
            ytVar2.f39010f = 1.0f;
        }
        j6 j6Var = new j6(this, getContext(), y6Var);
        this.f54719a2 = j6Var;
        int L = org.telegram.messenger.g0.L(80.0f);
        if (j6Var.f52283x == null) {
            j6Var.f52282w = L;
            int i14 = 0;
            while (true) {
                org.telegram.ui.Components.k71 k71Var = j6Var.f52279n;
                if (i14 >= k71Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.ek0 c10 = j6Var.c(k71Var.getViewPages()[i14]);
                if (c10 != null) {
                    c10.setPadding(c10.getPaddingLeft(), 0, c10.getPaddingRight(), L);
                }
                i14++;
            }
        }
        this.f54719a2.setCacheModel(cVar);
        this.f54719a2.setDelegate(new j6.k(17, this, cVar));
        org.telegram.ui.Components.ka kaVar = this.f39252u1;
        if (kaVar != null) {
            kaVar.setChildLayout(this.f54719a2);
        } else {
            e1();
            this.Z1.addView(this.W1, c8.na.r(-1, 72, 80));
        }
        if (this.W1 != null) {
            this.W1.a(this.T1.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        return new di.l4(this, 6);
    }

    @Override
    public final CharSequence P0() {
        return this.f39250s1.getMessagesController().e1(this.f54720b2);
    }

    @Override
    public final void V0(org.telegram.ui.Components.cu0 cu0Var) {
        this.f39246o1.j(new g3(this, 10));
        if (this.f39252u1 != null) {
            e1();
            cu0Var.addView(this.W1, c8.na.e(-1, 72, 80));
        }
    }

    public final void e1() {
        m6 m6Var = new m6(getContext());
        this.W1 = m6Var;
        m6Var.f49962a.setOnClickListener(new a(this, 19));
        yt ytVar = this.T1;
        if (ytVar != null) {
            this.W1.a(ytVar.a(), true);
        }
    }
}
