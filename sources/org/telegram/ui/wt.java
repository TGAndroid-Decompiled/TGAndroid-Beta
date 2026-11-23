package org.telegram.ui;

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
public final class wt extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public int E;
    public final d61 f53754a;
    public v4.c0 f53755b;
    public final org.telegram.ui.Components.ip f53756c;
    public final org.telegram.ui.Components.nh0 d;
    public final org.telegram.ui.Cells.m8 f53757e;
    public final org.telegram.ui.Cells.m8 f53758f;
    public int h;
    public final int f53759n;
    public int f53760r;
    public Boolean f53761s;
    public org.telegram.ui.ActionBar.m6 f53762w;
    public boolean f53763x;
    public org.telegram.ui.Cells.y f53764y;

    public wt(int i7, Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context);
        int i10;
        v4.c0 c0Var;
        this.f53755b = null;
        this.h = -1;
        this.f53761s = null;
        this.f53759n = i7;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.na.c(-2.0f, -1));
        int currentAccount = g2Var.getCurrentAccount();
        if (i7 != 0 && i7 != -1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.ip ipVar = new org.telegram.ui.Components.ip(currentAccount, 0L, null, i10);
        this.f53756c = ipVar;
        d61 d61Var = new d61(9, getContext(), null);
        this.f53754a = d61Var;
        d61Var.setAdapter(ipVar);
        d61Var.setSelectorDrawableColor(0);
        d61Var.setClipChildren(false);
        d61Var.setClipToPadding(false);
        d61Var.setHasFixedSize(true);
        d61Var.setItemAnimator(null);
        d61Var.setNestedScrollingEnabled(false);
        b();
        d61Var.setFocusable(false);
        d61Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        d61Var.setOnItemClickListener(new fi.g4(16, this, g2Var));
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(getContext(), null);
        vzVar.setViewType(14);
        vzVar.setVisibility(0);
        if (i7 != 0 && i7 != -1) {
            frameLayout.addView(vzVar, c8.na.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(d61Var, c8.na.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(vzVar, c8.na.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(d61Var, c8.na.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        d61Var.setEmptyView(vzVar);
        d61Var.X1 = true;
        d61Var.Y1 = 0;
        if (i7 == 0) {
            org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.d = nh0Var;
            nh0Var.h = true;
            nh0Var.f37799a0 = true;
            nh0Var.o();
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
            this.f53757e = m8Var;
            int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
            m8Var.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(m8Var, h02, null, M, null);
            addView(m8Var, c8.na.c(-2.0f, -1));
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context);
            this.f53758f = m8Var2;
            m8Var2.o(2131232102, org.telegram.messenger.gd.N0(2131745295, null), false);
            addView(m8Var2, c8.na.c(-2.0f, -1));
            m8Var.setOnClickListener(new a7.d(2, this, g2Var));
            nh0Var.h = true;
            m8Var2.setOnClickListener(new a(g2Var, 18));
            if (!org.telegram.ui.ActionBar.n6.k1()) {
                nh0Var.M(nh0Var.f37805e[0] - 1);
                m8Var.p(org.telegram.messenger.gd.N0(2131745271, null), nh0Var, true);
                m8Var.f31182x += 2;
            } else {
                m8Var.p(org.telegram.messenger.gd.N0(2131745270, null), nh0Var, true);
                m8Var.f31182x += 2;
            }
        }
        if (!org.telegram.messenger.ri.d0(g2Var.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.ri.d0(g2Var.getCurrentAccount()).B0);
            if (i7 == 0) {
                org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(g2Var.getCurrentAccount());
                s3Var.f30048e = "🎨";
                s3Var.f30047c = ig.b.d("🎨");
                s3Var.d = TLRPC.ChatTheme.ofEmoticon(s3Var.f30048e);
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.n6.Q0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.n6.Q0(string).f29331g0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.m6 Q0 = org.telegram.ui.ActionBar.n6.Q0(string);
                    if (Q0 == null) {
                        i12 = 99;
                        string = "Blue";
                    } else {
                        i12 = Q0.Z;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                }
                if (i12 != -1) {
                    str = string;
                    i13 = i12;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i14 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 != null && org.telegram.ui.ActionBar.n6.Q0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.n6.Q0(str).f29331g0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.m6 Q02 = org.telegram.ui.ActionBar.n6.Q0(string2);
                    if (Q02 == null) {
                        i14 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i14 = Q02.Z;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3();
                r3Var.f30020a = org.telegram.ui.ActionBar.n6.Q0(str);
                r3Var.f30023e = i13;
                s3Var.f30049f.add(r3Var);
                s3Var.f30049f.add(null);
                org.telegram.ui.ActionBar.r3 r3Var2 = new org.telegram.ui.ActionBar.r3();
                r3Var2.f30020a = org.telegram.ui.ActionBar.n6.Q0(str2);
                r3Var2.f30023e = i14;
                s3Var.f30049f.add(r3Var2);
                s3Var.f30049f.add(null);
                s3Var.m(g2Var.getCurrentAccount());
                org.telegram.ui.Components.jp jpVar = new org.telegram.ui.Components.jp(s3Var);
                jpVar.f36474c = org.telegram.ui.ActionBar.n6.k1() ? 0 : 2;
                arrayList.add(jpVar);
            }
            ipVar.d = arrayList;
            ipVar.f();
        }
        a();
        c();
        updateColors();
        int i15 = this.h;
        if (i15 >= 0 && (c0Var = this.f53755b) != null) {
            c0Var.h1(i15, org.telegram.messenger.g0.L(16.0f));
        }
    }

    public final void a() {
        int i7;
        int i10;
        this.f53762w = org.telegram.ui.ActionBar.n6.I;
        this.f53763x = org.telegram.ui.ActionBar.n6.k1();
        int i11 = 2;
        int i12 = this.f53759n;
        if (i12 != 0 && i12 != -1) {
            if (org.telegram.ui.ActionBar.n6.I.m().equals("Blue")) {
                this.f53760r = 0;
            } else if (org.telegram.ui.ActionBar.n6.I.m().equals("Day")) {
                this.f53760r = 1;
            } else if (org.telegram.ui.ActionBar.n6.I.m().equals("Night")) {
                this.f53760r = 2;
            } else if (org.telegram.ui.ActionBar.n6.I.m().equals("Dark Blue")) {
                this.f53760r = 3;
            } else {
                if (org.telegram.ui.ActionBar.n6.k1() && ((i10 = this.f53760r) == 2 || i10 == 3)) {
                    this.f53760r = 0;
                }
                if (!org.telegram.ui.ActionBar.n6.k1() && ((i7 = this.f53760r) == 0 || i7 == 1)) {
                    this.f53760r = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.n6.k1()) {
                i11 = 0;
            }
            this.f53760r = i11;
        }
        org.telegram.ui.Components.ip ipVar = this.f53756c;
        if (ipVar.d != null) {
            for (int i13 = 0; i13 < ipVar.d.size(); i13++) {
                ((org.telegram.ui.Components.jp) ipVar.d.get(i13)).f36474c = this.f53760r;
            }
            ipVar.k(0, ipVar.d.size());
        }
        c();
    }

    public final void b() {
        boolean z10;
        int i7;
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f53761s;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        d61 d61Var = this.f53754a;
        int i10 = this.f53759n;
        if (i10 != 0 && i10 != -1) {
            if (z10) {
                i7 = 3;
            } else {
                i7 = 9;
            }
            v4.c0 c0Var = this.f53755b;
            if (c0Var instanceof v4.t) {
                ((v4.t) c0Var).y1(i7);
            } else {
                d61Var.setHasFixedSize(false);
                getContext();
                v4.t tVar = new v4.t(i7);
                tVar.O = new vt(0);
                this.f53755b = tVar;
                d61Var.setLayoutManager(tVar);
            }
        } else if (this.f53755b == null) {
            getContext();
            v4.c0 c0Var2 = new v4.c0(0, false);
            this.f53755b = c0Var2;
            d61Var.setLayoutManager(c0Var2);
        }
        this.f53761s = Boolean.valueOf(z10);
    }

    public final void c() {
        boolean z10;
        org.telegram.ui.Components.ip ipVar = this.f53756c;
        if (ipVar.d == null) {
            return;
        }
        this.h = -1;
        int i7 = 0;
        while (true) {
            if (i7 >= ipVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.jp) ipVar.d.get(i7)).f36472a.f30049f.get(this.f53760r)).f30021b;
            org.telegram.ui.ActionBar.m6 i10 = ((org.telegram.ui.Components.jp) ipVar.d.get(i7)).f36472a.i(this.f53760r);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.n6.I.f29320a.equals(org.telegram.ui.ActionBar.n6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.jp) ipVar.d.get(i7)).f36472a.f30049f.get(this.f53760r)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.n6.I.f29326d0;
                    if (longSparseArray == null) {
                        this.h = i7;
                        break;
                    }
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) longSparseArray.get(tL_theme.f28631id);
                    if (k6Var != null && k6Var.f29224a == org.telegram.ui.ActionBar.n6.I.Z) {
                        this.h = i7;
                        break;
                    }
                } else {
                    continue;
                }
                i7++;
            } else {
                if (i10 != null) {
                    if (org.telegram.ui.ActionBar.n6.I.f29320a.equals(i10.m())) {
                        if (((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.jp) ipVar.d.get(i7)).f36472a.f30049f.get(this.f53760r)).f30023e == org.telegram.ui.ActionBar.n6.I.Z) {
                            this.h = i7;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i7++;
            }
        }
        if (this.h == -1 && this.f53759n != 3) {
            this.h = ipVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < ipVar.d.size(); i11++) {
            org.telegram.ui.Components.jp jpVar = (org.telegram.ui.Components.jp) ipVar.d.get(i11);
            if (i11 == this.h) {
                z10 = true;
            } else {
                z10 = false;
            }
            jpVar.d = z10;
        }
        ipVar.E(this.h);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        b();
        super.onMeasure(i7, i10);
    }

    @Override
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        updateColors();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.m6 m6Var;
        org.telegram.ui.Components.nh0 nh0Var;
        int i7;
        int i10;
        if (this.f53756c != null && (m6Var = this.f53762w) != null && (m6Var != org.telegram.ui.ActionBar.n6.I || this.f53763x != org.telegram.ui.ActionBar.n6.k1())) {
            a();
            if (this.f53757e != null && (nh0Var = this.d) != null) {
                if (!nh0Var.f37814l0) {
                    org.telegram.ui.Components.nh0 nh0Var2 = this.d;
                    if (org.telegram.ui.ActionBar.n6.k1()) {
                        i10 = 0;
                    } else {
                        i10 = this.d.f37805e[0] - 1;
                    }
                    nh0Var2.M(i10);
                }
                org.telegram.ui.Cells.m8 m8Var = this.f53757e;
                if (org.telegram.ui.ActionBar.n6.k1()) {
                    i7 = 2131745270;
                } else {
                    i7 = 2131745271;
                }
                m8Var.p(org.telegram.messenger.gd.N0(i7, null), this.d, true);
                this.f53757e.f31182x += 2;
            }
        }
        int i11 = this.f53759n;
        if (i11 == 0 || i11 == -1) {
            org.telegram.ui.Components.nh0 nh0Var3 = this.d;
            if (nh0Var3 != null) {
                nh0Var3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29691q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.m8 m8Var2 = this.f53757e;
            if (m8Var2 != null) {
                org.telegram.ui.ActionBar.n6.H1(m8Var2.getBackground(), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false), true);
                this.f53757e.g(-1, org.telegram.ui.ActionBar.n6.f29691q6);
            }
            if (this.f53758f != null) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29543i6, false);
                org.telegram.ui.Cells.y yVar = this.f53764y;
                if (com.google.android.gms.internal.vision.e2.s(yVar) && this.f53758f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.E) {
                        this.E = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.m8 m8Var3 = this.f53758f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.n6.i0(x02, x03);
                    this.f53764y = i02;
                    m8Var3.setBackground(i02);
                    this.E = x03;
                }
                org.telegram.ui.Cells.m8 m8Var4 = this.f53758f;
                int i12 = org.telegram.ui.ActionBar.n6.f29691q6;
                m8Var4.g(i12, i12);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
