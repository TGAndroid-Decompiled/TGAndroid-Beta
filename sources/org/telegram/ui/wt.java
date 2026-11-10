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
public final class wt extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean D;
    public org.telegram.ui.Cells.y E;
    public int F;
    public final g61 f51432a;
    public v4.b0 f51433b;
    public final org.telegram.ui.Components.to f51434c;
    public final org.telegram.ui.Components.zg0 d;
    public final org.telegram.ui.Cells.m8 f51435e;
    public final org.telegram.ui.Cells.m8 f51436f;
    public ValueAnimator h;
    public int f51437n;
    public int f51438r;
    public final int f51439s;
    public int f51440w;
    public Boolean f51441x;
    public org.telegram.ui.ActionBar.l6 f51442y;

    public wt(int i7, Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context);
        int i10;
        v4.b0 b0Var;
        this.f51433b = null;
        this.f51438r = -1;
        this.f51441x = null;
        this.f51439s = i7;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ha.c(-2.0f, -1));
        int currentAccount = f2Var.getCurrentAccount();
        if (i7 != 0 && i7 != -1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.to toVar = new org.telegram.ui.Components.to(currentAccount, 0L, null, i10);
        this.f51434c = toVar;
        g61 g61Var = new g61(9, getContext(), null);
        this.f51432a = g61Var;
        g61Var.setAdapter(toVar);
        g61Var.setSelectorDrawableColor(0);
        g61Var.setClipChildren(false);
        g61Var.setClipToPadding(false);
        g61Var.setHasFixedSize(true);
        g61Var.setItemAnimator(null);
        g61Var.setNestedScrollingEnabled(false);
        b();
        g61Var.setFocusable(false);
        g61Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        g61Var.setOnItemClickListener(new di.q4(16, this, f2Var));
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(getContext(), null);
        lzVar.setViewType(14);
        lzVar.setVisibility(0);
        if (i7 != 0 && i7 != -1) {
            frameLayout.addView(lzVar, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(g61Var, c8.ha.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(lzVar, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(g61Var, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        g61Var.setEmptyView(lzVar);
        g61Var.W1 = true;
        g61Var.X1 = 0;
        if (i7 == 0) {
            org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.d = zg0Var;
            zg0Var.h = true;
            zg0Var.Z = true;
            zg0Var.o();
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
            this.f51435e = m8Var;
            int i11 = org.telegram.ui.ActionBar.m6.f27982i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            m8Var.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(m8Var, h02, null, M, null);
            addView(m8Var, c8.ha.c(-2.0f, -1));
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context);
            this.f51436f = m8Var2;
            m8Var2.o(2131232097, org.telegram.messenger.id.M0(2131745491, null), false);
            addView(m8Var2, c8.ha.c(-2.0f, -1));
            m8Var.setOnClickListener(new org.telegram.ui.Components.wd(1, this, context, f2Var));
            zg0Var.h = true;
            m8Var2.setOnClickListener(new a(f2Var, 18));
            if (!org.telegram.ui.ActionBar.m6.k1()) {
                zg0Var.M(zg0Var.f40968e[0] - 1);
                m8Var.p(org.telegram.messenger.id.M0(2131745467, null), zg0Var, true);
                m8Var.f29591x += 2;
            } else {
                m8Var.p(org.telegram.messenger.id.M0(2131745466, null), zg0Var, true);
                m8Var.f29591x += 2;
            }
        }
        if (!org.telegram.messenger.ui.b0(f2Var.getCurrentAccount()).A0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(f2Var.getCurrentAccount()).A0);
            if (i7 == 0) {
                org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(f2Var.getCurrentAccount());
                s3Var.f28488e = "🎨";
                s3Var.f28487c = ig.b.d("🎨");
                s3Var.d = TLRPC.ChatTheme.ofEmoticon(s3Var.f28488e);
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25570b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.m6.Q0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.m6.Q0(string).f27775f0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.l6 Q0 = org.telegram.ui.ActionBar.m6.Q0(string);
                    if (Q0 == null) {
                        i12 = 99;
                        string = "Blue";
                    } else {
                        i12 = Q0.Y;
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
                if (string2 != null && org.telegram.ui.ActionBar.m6.Q0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.m6.Q0(str).f27775f0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.l6 Q02 = org.telegram.ui.ActionBar.m6.Q0(string2);
                    if (Q02 == null) {
                        i14 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i14 = Q02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3();
                r3Var.f28465a = org.telegram.ui.ActionBar.m6.Q0(str);
                r3Var.f28468e = i13;
                s3Var.f28489f.add(r3Var);
                s3Var.f28489f.add(null);
                org.telegram.ui.ActionBar.r3 r3Var2 = new org.telegram.ui.ActionBar.r3();
                r3Var2.f28465a = org.telegram.ui.ActionBar.m6.Q0(str2);
                r3Var2.f28468e = i14;
                s3Var.f28489f.add(r3Var2);
                s3Var.f28489f.add(null);
                s3Var.m(f2Var.getCurrentAccount());
                org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(s3Var);
                uoVar.f38727c = org.telegram.ui.ActionBar.m6.k1() ? 0 : 2;
                arrayList.add(uoVar);
            }
            toVar.d = arrayList;
            toVar.f();
        }
        a();
        c();
        updateColors();
        int i15 = this.f51438r;
        if (i15 >= 0 && (b0Var = this.f51433b) != null) {
            b0Var.h1(i15, org.telegram.messenger.g0.L(16.0f));
        }
    }

    public final void a() {
        int i7;
        int i10;
        this.f51442y = org.telegram.ui.ActionBar.m6.I;
        this.D = org.telegram.ui.ActionBar.m6.k1();
        int i11 = 2;
        int i12 = this.f51439s;
        if (i12 != 0 && i12 != -1) {
            if (org.telegram.ui.ActionBar.m6.I.m().equals("Blue")) {
                this.f51440w = 0;
            } else if (org.telegram.ui.ActionBar.m6.I.m().equals("Day")) {
                this.f51440w = 1;
            } else if (org.telegram.ui.ActionBar.m6.I.m().equals("Night")) {
                this.f51440w = 2;
            } else if (org.telegram.ui.ActionBar.m6.I.m().equals("Dark Blue")) {
                this.f51440w = 3;
            } else {
                if (org.telegram.ui.ActionBar.m6.k1() && ((i10 = this.f51440w) == 2 || i10 == 3)) {
                    this.f51440w = 0;
                }
                if (!org.telegram.ui.ActionBar.m6.k1() && ((i7 = this.f51440w) == 0 || i7 == 1)) {
                    this.f51440w = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.m6.k1()) {
                i11 = 0;
            }
            this.f51440w = i11;
        }
        org.telegram.ui.Components.to toVar = this.f51434c;
        if (toVar.d != null) {
            for (int i13 = 0; i13 < toVar.d.size(); i13++) {
                ((org.telegram.ui.Components.uo) toVar.d.get(i13)).f38727c = this.f51440w;
            }
            toVar.k(0, toVar.d.size());
        }
        c();
    }

    public final void b() {
        boolean z9;
        int i7;
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.y > point.x) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f51441x;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        g61 g61Var = this.f51432a;
        int i10 = this.f51439s;
        if (i10 != 0 && i10 != -1) {
            if (z9) {
                i7 = 3;
            } else {
                i7 = 9;
            }
            v4.b0 b0Var = this.f51433b;
            if (b0Var instanceof v4.s) {
                ((v4.s) b0Var).y1(i7);
            } else {
                g61Var.setHasFixedSize(false);
                getContext();
                v4.s sVar = new v4.s(i7);
                sVar.O = new vt(0);
                this.f51433b = sVar;
                g61Var.setLayoutManager(sVar);
            }
        } else if (this.f51433b == null) {
            getContext();
            v4.b0 b0Var2 = new v4.b0(0, false);
            this.f51433b = b0Var2;
            g61Var.setLayoutManager(b0Var2);
        }
        this.f51441x = Boolean.valueOf(z9);
    }

    public final void c() {
        boolean z9;
        org.telegram.ui.Components.to toVar = this.f51434c;
        if (toVar.d == null) {
            return;
        }
        this.f51438r = -1;
        int i7 = 0;
        while (true) {
            if (i7 >= toVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.uo) toVar.d.get(i7)).f38725a.f28489f.get(this.f51440w)).f28466b;
            org.telegram.ui.ActionBar.l6 i10 = ((org.telegram.ui.Components.uo) toVar.d.get(i7)).f38725a.i(this.f51440w);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.m6.I.f27765a.equals(org.telegram.ui.ActionBar.m6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.uo) toVar.d.get(i7)).f38725a.f28489f.get(this.f51440w)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.m6.I.f27770c0;
                    if (longSparseArray == null) {
                        this.f51438r = i7;
                        break;
                    }
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) longSparseArray.get(tL_theme.f27099id);
                    if (j6Var != null && j6Var.f27609a == org.telegram.ui.ActionBar.m6.I.Y) {
                        this.f51438r = i7;
                        break;
                    }
                } else {
                    continue;
                }
                i7++;
            } else {
                if (i10 != null) {
                    if (org.telegram.ui.ActionBar.m6.I.f27765a.equals(i10.m())) {
                        if (((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.uo) toVar.d.get(i7)).f38725a.f28489f.get(this.f51440w)).f28468e == org.telegram.ui.ActionBar.m6.I.Y) {
                            this.f51438r = i7;
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
        if (this.f51438r == -1 && this.f51439s != 3) {
            this.f51438r = toVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < toVar.d.size(); i11++) {
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) toVar.d.get(i11);
            if (i11 == this.f51438r) {
                z9 = true;
            } else {
                z9 = false;
            }
            uoVar.d = z9;
        }
        toVar.E(this.f51438r);
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
        org.telegram.ui.ActionBar.l6 l6Var;
        org.telegram.ui.Components.zg0 zg0Var;
        int i7;
        int i10;
        if (this.f51434c != null && (l6Var = this.f51442y) != null && (l6Var != org.telegram.ui.ActionBar.m6.I || this.D != org.telegram.ui.ActionBar.m6.k1())) {
            a();
            if (this.f51435e != null && (zg0Var = this.d) != null) {
                if (!zg0Var.f40976k0) {
                    org.telegram.ui.Components.zg0 zg0Var2 = this.d;
                    if (org.telegram.ui.ActionBar.m6.k1()) {
                        i10 = 0;
                    } else {
                        i10 = this.d.f40968e[0] - 1;
                    }
                    zg0Var2.M(i10);
                }
                org.telegram.ui.Cells.m8 m8Var = this.f51435e;
                if (org.telegram.ui.ActionBar.m6.k1()) {
                    i7 = 2131745466;
                } else {
                    i7 = 2131745467;
                }
                m8Var.p(org.telegram.messenger.id.M0(i7, null), this.d, true);
                this.f51435e.f29591x += 2;
            }
        }
        int i11 = this.f51439s;
        if (i11 == 0 || i11 == -1) {
            org.telegram.ui.Components.zg0 zg0Var3 = this.d;
            if (zg0Var3 != null) {
                zg0Var3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28130q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.m8 m8Var2 = this.f51435e;
            if (m8Var2 != null) {
                org.telegram.ui.ActionBar.m6.H1(m8Var2.getBackground(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27982i6, false), true);
                this.f51435e.g(-1, org.telegram.ui.ActionBar.m6.f28130q6);
            }
            if (this.f51436f != null) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27982i6, false);
                org.telegram.ui.Cells.y yVar = this.E;
                if (com.google.android.recaptcha.internal.a.u(yVar) && this.f51436f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.F) {
                        this.F = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.m8 m8Var3 = this.f51436f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.m6.i0(x02, x03);
                    this.E = i02;
                    m8Var3.setBackground(i02);
                    this.F = x03;
                }
                org.telegram.ui.Cells.m8 m8Var4 = this.f51436f;
                int i12 = org.telegram.ui.ActionBar.m6.f28130q6;
                m8Var4.g(i12, i12);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
