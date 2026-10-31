package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class vu extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public org.telegram.ui.Cells.y E;
    public int F;
    public final w71 f42811a;
    public s4.a0 f42812b;
    public final org.telegram.ui.Components.bp f42813c;
    public final org.telegram.ui.Components.bi0 d;
    public final org.telegram.ui.Cells.p8 e;
    public final org.telegram.ui.Cells.p8 f42814f;
    public ValueAnimator h;
    public int f42815n;
    public int f42816r;
    public final int f42817s;
    public int f42818w;
    public Boolean f42819x;
    public org.telegram.ui.ActionBar.s6 f42820y;

    public vu(int i10, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context);
        int i11;
        s4.a0 a0Var;
        this.f42812b = null;
        this.f42816r = -1;
        this.f42819x = null;
        this.f42817s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.b6.c(-2.0f, -1));
        int currentAccount = k2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(currentAccount, 0L, null, i11);
        this.f42813c = bpVar;
        w71 w71Var = new w71(6, getContext(), null);
        this.f42811a = w71Var;
        w71Var.setAdapter(bpVar);
        w71Var.setSelectorDrawableColor(0);
        w71Var.setClipChildren(false);
        w71Var.setClipToPadding(false);
        w71Var.setHasFixedSize(true);
        w71Var.setItemAnimator(null);
        w71Var.setNestedScrollingEnabled(false);
        b();
        w71Var.setFocusable(false);
        w71Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        w71Var.setOnItemClickListener(new mg.q0(15, this, k2Var));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(getContext(), null);
        zzVar.setViewType(14);
        zzVar.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(zzVar, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(w71Var, w7.b6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(zzVar, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(w71Var, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        w71Var.setEmptyView(zzVar);
        w71Var.W1 = true;
        w71Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(2131624238, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
            this.d = bi0Var;
            bi0Var.h = true;
            bi0Var.Z = true;
            bi0Var.o();
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            this.e = p8Var;
            int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 2, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            p8Var.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(p8Var, h02, null, N, null);
            addView(p8Var, w7.b6.c(-2.0f, -1));
            org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(context);
            this.f42814f = p8Var2;
            p8Var2.o(2131232096, org.telegram.messenger.cd.L0(2131745508, null), false);
            addView(p8Var2, w7.b6.c(-2.0f, -1));
            p8Var.setOnClickListener(new org.telegram.ui.Components.sd(1, this, context, k2Var));
            bi0Var.h = true;
            p8Var2.setOnClickListener(new a(k2Var, 18));
            if (!org.telegram.ui.ActionBar.t6.k1()) {
                bi0Var.M(bi0Var.e[0] - 1);
                p8Var.p(org.telegram.messenger.cd.L0(2131745485, null), bi0Var, true);
                p8Var.f22465x += 2;
            } else {
                p8Var.p(org.telegram.messenger.cd.L0(2131745484, null), bi0Var, true);
                p8Var.f22465x += 2;
            }
        }
        if (!org.telegram.messenger.ui.b0(k2Var.getCurrentAccount()).A0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(k2Var.getCurrentAccount()).A0);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(k2Var.getCurrentAccount());
                y3Var.e = "🎨";
                y3Var.f21560c = yf.b.d("🎨");
                y3Var.d = TLRPC.ChatTheme.ofEmoticon(y3Var.e);
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.f19025b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i14 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.t6.Q0(string) != null) {
                    if (i13 == -1) {
                        i13 = org.telegram.ui.ActionBar.t6.Q0(string).f20810f0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.s6 Q0 = org.telegram.ui.ActionBar.t6.Q0(string);
                    if (Q0 == null) {
                        i13 = 99;
                        string = "Blue";
                    } else {
                        i13 = Q0.Y;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                }
                if (i13 != -1) {
                    str = string;
                    i14 = i13;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i15 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 != null && org.telegram.ui.ActionBar.t6.Q0(string2) != null) {
                    if (i15 == -1) {
                        i15 = org.telegram.ui.ActionBar.t6.Q0(str).f20810f0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.s6 Q02 = org.telegram.ui.ActionBar.t6.Q0(string2);
                    if (Q02 == null) {
                        i15 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i15 = Q02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i15 == -1) {
                    i15 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3();
                x3Var.f21515a = org.telegram.ui.ActionBar.t6.Q0(str);
                x3Var.e = i14;
                y3Var.f21561f.add(x3Var);
                y3Var.f21561f.add(null);
                org.telegram.ui.ActionBar.x3 x3Var2 = new org.telegram.ui.ActionBar.x3();
                x3Var2.f21515a = org.telegram.ui.ActionBar.t6.Q0(str2);
                x3Var2.e = i15;
                y3Var.f21561f.add(x3Var2);
                y3Var.f21561f.add(null);
                y3Var.m(k2Var.getCurrentAccount());
                org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(y3Var);
                cpVar.f25125c = org.telegram.ui.ActionBar.t6.k1() ? 0 : 2;
                arrayList.add(cpVar);
            }
            bpVar.d = arrayList;
            bpVar.f();
        }
        a();
        c();
        updateColors();
        int i16 = this.f42816r;
        if (i16 >= 0 && (a0Var = this.f42812b) != null) {
            a0Var.h1(i16, org.telegram.messenger.i0.L(16.0f));
        }
    }

    public final void a() {
        int i10;
        int i11;
        this.f42820y = org.telegram.ui.ActionBar.t6.I;
        this.D = org.telegram.ui.ActionBar.t6.k1();
        int i12 = 2;
        int i13 = this.f42817s;
        if (i13 != 0 && i13 != -1) {
            if (org.telegram.ui.ActionBar.t6.I.m().equals("Blue")) {
                this.f42818w = 0;
            } else if (org.telegram.ui.ActionBar.t6.I.m().equals("Day")) {
                this.f42818w = 1;
            } else if (org.telegram.ui.ActionBar.t6.I.m().equals("Night")) {
                this.f42818w = 2;
            } else if (org.telegram.ui.ActionBar.t6.I.m().equals("Dark Blue")) {
                this.f42818w = 3;
            } else {
                if (org.telegram.ui.ActionBar.t6.k1() && ((i11 = this.f42818w) == 2 || i11 == 3)) {
                    this.f42818w = 0;
                }
                if (!org.telegram.ui.ActionBar.t6.k1() && ((i10 = this.f42818w) == 0 || i10 == 1)) {
                    this.f42818w = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.t6.k1()) {
                i12 = 0;
            }
            this.f42818w = i12;
        }
        org.telegram.ui.Components.bp bpVar = this.f42813c;
        if (bpVar.d != null) {
            for (int i14 = 0; i14 < bpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.cp) bpVar.d.get(i14)).f25125c = this.f42818w;
            }
            bpVar.k(0, bpVar.d.size());
        }
        c();
    }

    public final void b() {
        boolean z10;
        int i10;
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f42819x;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        w71 w71Var = this.f42811a;
        int i11 = this.f42817s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.a0 a0Var = this.f42812b;
            if (a0Var instanceof s4.r) {
                ((s4.r) a0Var).y1(i10);
            } else {
                w71Var.setHasFixedSize(false);
                getContext();
                s4.r rVar = new s4.r(i10);
                rVar.O = new uu(0);
                this.f42812b = rVar;
                w71Var.setLayoutManager(rVar);
            }
        } else if (this.f42812b == null) {
            getContext();
            s4.a0 a0Var2 = new s4.a0(0, false);
            this.f42812b = a0Var2;
            w71Var.setLayoutManager(a0Var2);
        }
        this.f42819x = Boolean.valueOf(z10);
    }

    public final void c() {
        boolean z10;
        org.telegram.ui.Components.bp bpVar = this.f42813c;
        if (bpVar.d == null) {
            return;
        }
        this.f42816r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= bpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.x3) ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).f25123a.f21561f.get(this.f42818w)).f21516b;
            org.telegram.ui.ActionBar.s6 i11 = ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).f25123a.i(this.f42818w);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.t6.I.f20801a.equals(org.telegram.ui.ActionBar.t6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.x3) ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).f25123a.f21561f.get(this.f42818w)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.t6.I.f20806c0;
                    if (longSparseArray == null) {
                        this.f42816r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) longSparseArray.get(tL_theme.f19932id);
                    if (r6Var != null && r6Var.f20730a == org.telegram.ui.ActionBar.t6.I.Y) {
                        this.f42816r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (i11 != null) {
                    if (org.telegram.ui.ActionBar.t6.I.f20801a.equals(i11.m())) {
                        if (((org.telegram.ui.ActionBar.x3) ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).f25123a.f21561f.get(this.f42818w)).e == org.telegram.ui.ActionBar.t6.I.Y) {
                            this.f42816r = i10;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i10++;
            }
        }
        if (this.f42816r == -1 && this.f42817s != 3) {
            this.f42816r = bpVar.d.size() - 1;
        }
        for (int i12 = 0; i12 < bpVar.d.size(); i12++) {
            org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) bpVar.d.get(i12);
            if (i12 == this.f42816r) {
                z10 = true;
            } else {
                z10 = false;
            }
            cpVar.d = z10;
        }
        bpVar.E(this.f42816r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        b();
        super.onMeasure(i10, i11);
    }

    @Override
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        updateColors();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.s6 s6Var;
        org.telegram.ui.Components.bi0 bi0Var;
        int i10;
        int i11;
        if (this.f42813c != null && (s6Var = this.f42820y) != null && (s6Var != org.telegram.ui.ActionBar.t6.I || this.D != org.telegram.ui.ActionBar.t6.k1())) {
            a();
            if (this.e != null && (bi0Var = this.d) != null) {
                if (!bi0Var.f24765k0) {
                    org.telegram.ui.Components.bi0 bi0Var2 = this.d;
                    if (org.telegram.ui.ActionBar.t6.k1()) {
                        i11 = 0;
                    } else {
                        i11 = this.d.e[0] - 1;
                    }
                    bi0Var2.M(i11);
                }
                org.telegram.ui.Cells.p8 p8Var = this.e;
                if (org.telegram.ui.ActionBar.t6.k1()) {
                    i10 = 2131745484;
                } else {
                    i10 = 2131745485;
                }
                p8Var.p(org.telegram.messenger.cd.L0(i10, null), this.d, true);
                this.e.f22465x += 2;
            }
        }
        int i12 = this.f42817s;
        if (i12 == 0 || i12 == -1) {
            org.telegram.ui.Components.bi0 bi0Var3 = this.d;
            if (bi0Var3 != null) {
                bi0Var3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.p8 p8Var2 = this.e;
            if (p8Var2 != null) {
                org.telegram.ui.ActionBar.t6.H1(p8Var2.getBackground(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21020i6, false), true);
                this.e.g(-1, org.telegram.ui.ActionBar.t6.q6);
            }
            if (this.f42814f != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21020i6, false);
                org.telegram.ui.Cells.y yVar = this.E;
                if (c3.i0.t(yVar) && this.f42814f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.F) {
                        this.F = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.p8 p8Var3 = this.f42814f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.t6.i0(x02, x03);
                    this.E = i02;
                    p8Var3.setBackground(i02);
                    this.F = x03;
                }
                org.telegram.ui.Cells.p8 p8Var4 = this.f42814f;
                int i13 = org.telegram.ui.ActionBar.t6.q6;
                p8Var4.g(i13, i13);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
