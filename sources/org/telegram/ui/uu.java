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
public final class uu extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public org.telegram.ui.Cells.y E;
    public int F;
    public final u71 f42340a;
    public s4.a0 f42341b;
    public final org.telegram.ui.Components.bp f42342c;
    public final org.telegram.ui.Components.ci0 d;
    public final org.telegram.ui.Cells.p8 e;
    public final org.telegram.ui.Cells.p8 f42343f;
    public ValueAnimator h;
    public int f42344n;
    public int f42345r;
    public final int f42346s;
    public int f42347w;
    public Boolean f42348x;
    public org.telegram.ui.ActionBar.s6 f42349y;

    public uu(int i10, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context);
        int i11;
        s4.a0 a0Var;
        this.f42341b = null;
        this.f42345r = -1;
        this.f42348x = null;
        this.f42346s = i10;
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
        this.f42342c = bpVar;
        u71 u71Var = new u71(6, getContext(), null);
        this.f42340a = u71Var;
        u71Var.setAdapter(bpVar);
        u71Var.setSelectorDrawableColor(0);
        u71Var.setClipChildren(false);
        u71Var.setClipToPadding(false);
        u71Var.setHasFixedSize(true);
        u71Var.setItemAnimator(null);
        u71Var.setNestedScrollingEnabled(false);
        b();
        u71Var.setFocusable(false);
        u71Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        u71Var.setOnItemClickListener(new mg.q0(15, this, k2Var));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(getContext(), null);
        zzVar.setViewType(14);
        zzVar.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(zzVar, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(u71Var, w7.b6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(zzVar, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(u71Var, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        u71Var.setEmptyView(zzVar);
        u71Var.W1 = true;
        u71Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(2131624238, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
            this.d = ci0Var;
            ci0Var.h = true;
            ci0Var.Z = true;
            ci0Var.o();
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            this.e = p8Var;
            int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 2, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            p8Var.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(p8Var, h02, null, N, null);
            addView(p8Var, w7.b6.c(-2.0f, -1));
            org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(context);
            this.f42343f = p8Var2;
            p8Var2.o(2131232096, org.telegram.messenger.dd.L0(2131745508, null), false);
            addView(p8Var2, w7.b6.c(-2.0f, -1));
            p8Var.setOnClickListener(new org.telegram.ui.Components.sd(1, this, context, k2Var));
            ci0Var.h = true;
            p8Var2.setOnClickListener(new a(k2Var, 18));
            if (!org.telegram.ui.ActionBar.t6.k1()) {
                ci0Var.M(ci0Var.e[0] - 1);
                p8Var.p(org.telegram.messenger.dd.L0(2131745485, null), ci0Var, true);
                p8Var.f22466x += 2;
            } else {
                p8Var.p(org.telegram.messenger.dd.L0(2131745484, null), ci0Var, true);
                p8Var.f22466x += 2;
            }
        }
        if (!org.telegram.messenger.vi.b0(k2Var.getCurrentAccount()).A0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.vi.b0(k2Var.getCurrentAccount()).A0);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(k2Var.getCurrentAccount());
                y3Var.e = "🎨";
                y3Var.f21561c = yf.b.d("🎨");
                y3Var.d = TLRPC.ChatTheme.ofEmoticon(y3Var.e);
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i14 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.t6.Q0(string) != null) {
                    if (i13 == -1) {
                        i13 = org.telegram.ui.ActionBar.t6.Q0(string).f20811f0;
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
                        i15 = org.telegram.ui.ActionBar.t6.Q0(str).f20811f0;
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
                x3Var.f21516a = org.telegram.ui.ActionBar.t6.Q0(str);
                x3Var.e = i14;
                y3Var.f21562f.add(x3Var);
                y3Var.f21562f.add(null);
                org.telegram.ui.ActionBar.x3 x3Var2 = new org.telegram.ui.ActionBar.x3();
                x3Var2.f21516a = org.telegram.ui.ActionBar.t6.Q0(str2);
                x3Var2.e = i15;
                y3Var.f21562f.add(x3Var2);
                y3Var.f21562f.add(null);
                y3Var.m(k2Var.getCurrentAccount());
                org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(y3Var);
                cpVar.f25199c = org.telegram.ui.ActionBar.t6.k1() ? 0 : 2;
                arrayList.add(cpVar);
            }
            bpVar.d = arrayList;
            bpVar.f();
        }
        a();
        c();
        updateColors();
        int i16 = this.f42345r;
        if (i16 >= 0 && (a0Var = this.f42341b) != null) {
            a0Var.h1(i16, org.telegram.messenger.i0.L(16.0f));
        }
    }

    public final void a() {
        int i10;
        int i11;
        this.f42349y = org.telegram.ui.ActionBar.t6.I;
        this.D = org.telegram.ui.ActionBar.t6.k1();
        int i12 = 2;
        int i13 = this.f42346s;
        if (i13 != 0 && i13 != -1) {
            if (org.telegram.ui.ActionBar.t6.I.m().equals("Blue")) {
                this.f42347w = 0;
            } else if (org.telegram.ui.ActionBar.t6.I.m().equals("Day")) {
                this.f42347w = 1;
            } else if (org.telegram.ui.ActionBar.t6.I.m().equals("Night")) {
                this.f42347w = 2;
            } else if (org.telegram.ui.ActionBar.t6.I.m().equals("Dark Blue")) {
                this.f42347w = 3;
            } else {
                if (org.telegram.ui.ActionBar.t6.k1() && ((i11 = this.f42347w) == 2 || i11 == 3)) {
                    this.f42347w = 0;
                }
                if (!org.telegram.ui.ActionBar.t6.k1() && ((i10 = this.f42347w) == 0 || i10 == 1)) {
                    this.f42347w = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.t6.k1()) {
                i12 = 0;
            }
            this.f42347w = i12;
        }
        org.telegram.ui.Components.bp bpVar = this.f42342c;
        if (bpVar.d != null) {
            for (int i14 = 0; i14 < bpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.cp) bpVar.d.get(i14)).f25199c = this.f42347w;
            }
            bpVar.k(0, bpVar.d.size());
        }
        c();
    }

    public final void b() {
        boolean z10;
        int i10;
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f42348x;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        u71 u71Var = this.f42340a;
        int i11 = this.f42346s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.a0 a0Var = this.f42341b;
            if (a0Var instanceof s4.r) {
                ((s4.r) a0Var).y1(i10);
            } else {
                u71Var.setHasFixedSize(false);
                getContext();
                s4.r rVar = new s4.r(i10);
                rVar.O = new tu(0);
                this.f42341b = rVar;
                u71Var.setLayoutManager(rVar);
            }
        } else if (this.f42341b == null) {
            getContext();
            s4.a0 a0Var2 = new s4.a0(0, false);
            this.f42341b = a0Var2;
            u71Var.setLayoutManager(a0Var2);
        }
        this.f42348x = Boolean.valueOf(z10);
    }

    public final void c() {
        boolean z10;
        org.telegram.ui.Components.bp bpVar = this.f42342c;
        if (bpVar.d == null) {
            return;
        }
        this.f42345r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= bpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.x3) ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).f25197a.f21562f.get(this.f42347w)).f21517b;
            org.telegram.ui.ActionBar.s6 i11 = ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).f25197a.i(this.f42347w);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.t6.I.f20802a.equals(org.telegram.ui.ActionBar.t6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.x3) ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).f25197a.f21562f.get(this.f42347w)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.t6.I.f20807c0;
                    if (longSparseArray == null) {
                        this.f42345r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) longSparseArray.get(tL_theme.f19933id);
                    if (r6Var != null && r6Var.f20731a == org.telegram.ui.ActionBar.t6.I.Y) {
                        this.f42345r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (i11 != null) {
                    if (org.telegram.ui.ActionBar.t6.I.f20802a.equals(i11.m())) {
                        if (((org.telegram.ui.ActionBar.x3) ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).f25197a.f21562f.get(this.f42347w)).e == org.telegram.ui.ActionBar.t6.I.Y) {
                            this.f42345r = i10;
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
        if (this.f42345r == -1 && this.f42346s != 3) {
            this.f42345r = bpVar.d.size() - 1;
        }
        for (int i12 = 0; i12 < bpVar.d.size(); i12++) {
            org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) bpVar.d.get(i12);
            if (i12 == this.f42345r) {
                z10 = true;
            } else {
                z10 = false;
            }
            cpVar.d = z10;
        }
        bpVar.E(this.f42345r);
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
        org.telegram.ui.Components.ci0 ci0Var;
        int i10;
        int i11;
        if (this.f42342c != null && (s6Var = this.f42349y) != null && (s6Var != org.telegram.ui.ActionBar.t6.I || this.D != org.telegram.ui.ActionBar.t6.k1())) {
            a();
            if (this.e != null && (ci0Var = this.d) != null) {
                if (!ci0Var.f25144k0) {
                    org.telegram.ui.Components.ci0 ci0Var2 = this.d;
                    if (org.telegram.ui.ActionBar.t6.k1()) {
                        i11 = 0;
                    } else {
                        i11 = this.d.e[0] - 1;
                    }
                    ci0Var2.M(i11);
                }
                org.telegram.ui.Cells.p8 p8Var = this.e;
                if (org.telegram.ui.ActionBar.t6.k1()) {
                    i10 = 2131745484;
                } else {
                    i10 = 2131745485;
                }
                p8Var.p(org.telegram.messenger.dd.L0(i10, null), this.d, true);
                this.e.f22466x += 2;
            }
        }
        int i12 = this.f42346s;
        if (i12 == 0 || i12 == -1) {
            org.telegram.ui.Components.ci0 ci0Var3 = this.d;
            if (ci0Var3 != null) {
                ci0Var3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.p8 p8Var2 = this.e;
            if (p8Var2 != null) {
                org.telegram.ui.ActionBar.t6.H1(p8Var2.getBackground(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21021i6, false), true);
                this.e.g(-1, org.telegram.ui.ActionBar.t6.q6);
            }
            if (this.f42343f != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21021i6, false);
                org.telegram.ui.Cells.y yVar = this.E;
                if (c3.i0.t(yVar) && this.f42343f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.F) {
                        this.F = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.p8 p8Var3 = this.f42343f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.t6.i0(x02, x03);
                    this.E = i02;
                    p8Var3.setBackground(i02);
                    this.F = x03;
                }
                org.telegram.ui.Cells.p8 p8Var4 = this.f42343f;
                int i13 = org.telegram.ui.ActionBar.t6.q6;
                p8Var4.g(i13, i13);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
