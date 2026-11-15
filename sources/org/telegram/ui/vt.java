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
public final class vt extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public final b61 f52279a;
    public v4.b0 f52280b;
    public final org.telegram.ui.Components.cp f52281c;
    public final org.telegram.ui.Components.ch0 d;
    public final org.telegram.ui.Cells.l8 f52282e;
    public final org.telegram.ui.Cells.l8 f52283f;
    public int h;
    public final int f52284n;
    public int f52285r;
    public Boolean f52286s;
    public org.telegram.ui.ActionBar.i6 f52287w;
    public boolean f52288x;
    public org.telegram.ui.Cells.y f52289y;

    public vt(int i7, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context);
        int i10;
        v4.b0 b0Var;
        this.f52280b = null;
        this.h = -1;
        this.f52286s = null;
        this.f52284n = i7;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ja.c(-2.0f, -1));
        int currentAccount = e2Var.getCurrentAccount();
        if (i7 != 0 && i7 != -1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(currentAccount, 0L, null, i10);
        this.f52281c = cpVar;
        b61 b61Var = new b61(9, getContext(), null);
        this.f52279a = b61Var;
        b61Var.setAdapter(cpVar);
        b61Var.setSelectorDrawableColor(0);
        b61Var.setClipChildren(false);
        b61Var.setClipToPadding(false);
        b61Var.setHasFixedSize(true);
        b61Var.setItemAnimator(null);
        b61Var.setNestedScrollingEnabled(false);
        b();
        b61Var.setFocusable(false);
        b61Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        b61Var.setOnItemClickListener(new fi.i4(16, this, e2Var));
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(getContext(), null);
        pzVar.setViewType(14);
        pzVar.setVisibility(0);
        if (i7 != 0 && i7 != -1) {
            frameLayout.addView(pzVar, c8.ja.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(b61Var, c8.ja.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(pzVar, c8.ja.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(b61Var, c8.ja.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        b61Var.setEmptyView(pzVar);
        b61Var.X1 = true;
        b61Var.Y1 = 0;
        if (i7 == 0) {
            org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.d = ch0Var;
            ch0Var.h = true;
            ch0Var.f33571a0 = true;
            ch0Var.o();
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
            this.f52282e = l8Var;
            int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
            l8Var.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(l8Var, h02, null, M, null);
            addView(l8Var, c8.ja.c(-2.0f, -1));
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context);
            this.f52283f = l8Var2;
            l8Var2.o(2131232098, org.telegram.messenger.hd.M0(2131745491, null), false);
            addView(l8Var2, c8.ja.c(-2.0f, -1));
            l8Var.setOnClickListener(new a7.d(2, this, e2Var));
            ch0Var.h = true;
            l8Var2.setOnClickListener(new a(e2Var, 18));
            if (!org.telegram.ui.ActionBar.j6.k1()) {
                ch0Var.M(ch0Var.f33577e[0] - 1);
                l8Var.p(org.telegram.messenger.hd.M0(2131745467, null), ch0Var, true);
                l8Var.f30662x += 2;
            } else {
                l8Var.p(org.telegram.messenger.hd.M0(2131745466, null), ch0Var, true);
                l8Var.f30662x += 2;
            }
        }
        if (!org.telegram.messenger.si.b0(e2Var.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.si.b0(e2Var.getCurrentAccount()).B0);
            if (i7 == 0) {
                org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(e2Var.getCurrentAccount());
                p3Var.f29473e = "🎨";
                p3Var.f29472c = ig.b.d("🎨");
                p3Var.d = TLRPC.ChatTheme.ofEmoticon(p3Var.f29473e);
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26600b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.j6.Q0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.j6.Q0(string).f28709g0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.i6 Q0 = org.telegram.ui.ActionBar.j6.Q0(string);
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
                if (string2 != null && org.telegram.ui.ActionBar.j6.Q0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.j6.Q0(str).f28709g0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.i6 Q02 = org.telegram.ui.ActionBar.j6.Q0(string2);
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
                org.telegram.ui.ActionBar.o3 o3Var = new org.telegram.ui.ActionBar.o3();
                o3Var.f29436a = org.telegram.ui.ActionBar.j6.Q0(str);
                o3Var.f29439e = i13;
                p3Var.f29474f.add(o3Var);
                p3Var.f29474f.add(null);
                org.telegram.ui.ActionBar.o3 o3Var2 = new org.telegram.ui.ActionBar.o3();
                o3Var2.f29436a = org.telegram.ui.ActionBar.j6.Q0(str2);
                o3Var2.f29439e = i14;
                p3Var.f29474f.add(o3Var2);
                p3Var.f29474f.add(null);
                p3Var.m(e2Var.getCurrentAccount());
                org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(p3Var);
                dpVar.f34024c = org.telegram.ui.ActionBar.j6.k1() ? 0 : 2;
                arrayList.add(dpVar);
            }
            cpVar.d = arrayList;
            cpVar.f();
        }
        a();
        c();
        updateColors();
        int i15 = this.h;
        if (i15 >= 0 && (b0Var = this.f52280b) != null) {
            b0Var.h1(i15, org.telegram.messenger.g0.L(16.0f));
        }
    }

    public final void a() {
        int i7;
        int i10;
        this.f52287w = org.telegram.ui.ActionBar.j6.I;
        this.f52288x = org.telegram.ui.ActionBar.j6.k1();
        int i11 = 2;
        int i12 = this.f52284n;
        if (i12 != 0 && i12 != -1) {
            if (org.telegram.ui.ActionBar.j6.I.m().equals("Blue")) {
                this.f52285r = 0;
            } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Day")) {
                this.f52285r = 1;
            } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Night")) {
                this.f52285r = 2;
            } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Dark Blue")) {
                this.f52285r = 3;
            } else {
                if (org.telegram.ui.ActionBar.j6.k1() && ((i10 = this.f52285r) == 2 || i10 == 3)) {
                    this.f52285r = 0;
                }
                if (!org.telegram.ui.ActionBar.j6.k1() && ((i7 = this.f52285r) == 0 || i7 == 1)) {
                    this.f52285r = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.j6.k1()) {
                i11 = 0;
            }
            this.f52285r = i11;
        }
        org.telegram.ui.Components.cp cpVar = this.f52281c;
        if (cpVar.d != null) {
            for (int i13 = 0; i13 < cpVar.d.size(); i13++) {
                ((org.telegram.ui.Components.dp) cpVar.d.get(i13)).f34024c = this.f52285r;
            }
            cpVar.k(0, cpVar.d.size());
        }
        c();
    }

    public final void b() {
        boolean z10;
        int i7;
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f52286s;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        b61 b61Var = this.f52279a;
        int i10 = this.f52284n;
        if (i10 != 0 && i10 != -1) {
            if (z10) {
                i7 = 3;
            } else {
                i7 = 9;
            }
            v4.b0 b0Var = this.f52280b;
            if (b0Var instanceof v4.s) {
                ((v4.s) b0Var).y1(i7);
            } else {
                b61Var.setHasFixedSize(false);
                getContext();
                v4.s sVar = new v4.s(i7);
                sVar.O = new ut(0);
                this.f52280b = sVar;
                b61Var.setLayoutManager(sVar);
            }
        } else if (this.f52280b == null) {
            getContext();
            v4.b0 b0Var2 = new v4.b0(0, false);
            this.f52280b = b0Var2;
            b61Var.setLayoutManager(b0Var2);
        }
        this.f52286s = Boolean.valueOf(z10);
    }

    public final void c() {
        boolean z10;
        org.telegram.ui.Components.cp cpVar = this.f52281c;
        if (cpVar.d == null) {
            return;
        }
        this.h = -1;
        int i7 = 0;
        while (true) {
            if (i7 >= cpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.dp) cpVar.d.get(i7)).f34022a.f29474f.get(this.f52285r)).f29437b;
            org.telegram.ui.ActionBar.i6 i10 = ((org.telegram.ui.Components.dp) cpVar.d.get(i7)).f34022a.i(this.f52285r);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.j6.I.f28698a.equals(org.telegram.ui.ActionBar.j6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.dp) cpVar.d.get(i7)).f34022a.f29474f.get(this.f52285r)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.j6.I.f28704d0;
                    if (longSparseArray == null) {
                        this.h = i7;
                        break;
                    }
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) longSparseArray.get(tL_theme.f28190id);
                    if (g6Var != null && g6Var.f28602a == org.telegram.ui.ActionBar.j6.I.Z) {
                        this.h = i7;
                        break;
                    }
                } else {
                    continue;
                }
                i7++;
            } else {
                if (i10 != null) {
                    if (org.telegram.ui.ActionBar.j6.I.f28698a.equals(i10.m())) {
                        if (((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.dp) cpVar.d.get(i7)).f34022a.f29474f.get(this.f52285r)).f29439e == org.telegram.ui.ActionBar.j6.I.Z) {
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
        if (this.h == -1 && this.f52284n != 3) {
            this.h = cpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < cpVar.d.size(); i11++) {
            org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) cpVar.d.get(i11);
            if (i11 == this.h) {
                z10 = true;
            } else {
                z10 = false;
            }
            dpVar.d = z10;
        }
        cpVar.E(this.h);
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
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.Components.ch0 ch0Var;
        int i7;
        int i10;
        if (this.f52281c != null && (i6Var = this.f52287w) != null && (i6Var != org.telegram.ui.ActionBar.j6.I || this.f52288x != org.telegram.ui.ActionBar.j6.k1())) {
            a();
            if (this.f52282e != null && (ch0Var = this.d) != null) {
                if (!ch0Var.f33586l0) {
                    org.telegram.ui.Components.ch0 ch0Var2 = this.d;
                    if (org.telegram.ui.ActionBar.j6.k1()) {
                        i10 = 0;
                    } else {
                        i10 = this.d.f33577e[0] - 1;
                    }
                    ch0Var2.M(i10);
                }
                org.telegram.ui.Cells.l8 l8Var = this.f52282e;
                if (org.telegram.ui.ActionBar.j6.k1()) {
                    i7 = 2131745466;
                } else {
                    i7 = 2131745467;
                }
                l8Var.p(org.telegram.messenger.hd.M0(i7, null), this.d, true);
                this.f52282e.f30662x += 2;
            }
        }
        int i11 = this.f52284n;
        if (i11 == 0 || i11 == -1) {
            org.telegram.ui.Components.ch0 ch0Var3 = this.d;
            if (ch0Var3 != null) {
                ch0Var3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29089q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.l8 l8Var2 = this.f52282e;
            if (l8Var2 != null) {
                org.telegram.ui.ActionBar.j6.H1(l8Var2.getBackground(), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false), true);
                this.f52282e.g(-1, org.telegram.ui.ActionBar.j6.f29089q6);
            }
            if (this.f52283f != null) {
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false);
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28941i6, false);
                org.telegram.ui.Cells.y yVar = this.f52289y;
                if (com.google.android.gms.internal.vision.e2.s(yVar) && this.f52283f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.E) {
                        this.E = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.l8 l8Var3 = this.f52283f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.j6.i0(x02, x03);
                    this.f52289y = i02;
                    l8Var3.setBackground(i02);
                    this.E = x03;
                }
                org.telegram.ui.Cells.l8 l8Var4 = this.f52283f;
                int i12 = org.telegram.ui.ActionBar.j6.f29089q6;
                l8Var4.g(i12, i12);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
