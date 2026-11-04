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
public final class rt extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public org.telegram.ui.Cells.y F;
    public int G;
    public final u51 f49273a;
    public u4.b0 f49274b;
    public final org.telegram.ui.Components.to f49275c;
    public final org.telegram.ui.Components.ch0 d;
    public final org.telegram.ui.Cells.l8 f49276e;
    public final org.telegram.ui.Cells.l8 f49277f;
    public ValueAnimator h;
    public int f49278n;
    public int f49279r;
    public final int f49280s;
    public int f49281w;
    public Boolean f49282x;
    public org.telegram.ui.ActionBar.j6 f49283y;

    public rt(int i3, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context);
        int i10;
        u4.b0 b0Var;
        this.f49274b = null;
        this.f49279r = -1;
        this.f49282x = null;
        this.f49280s = i3;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, b8.mf.c(-2.0f, -1));
        int currentAccount = d2Var.getCurrentAccount();
        if (i3 != 0 && i3 != -1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.to toVar = new org.telegram.ui.Components.to(currentAccount, 0L, null, i10);
        this.f49275c = toVar;
        u51 u51Var = new u51(8, getContext(), null);
        this.f49273a = u51Var;
        u51Var.setAdapter(toVar);
        u51Var.setSelectorDrawableColor(0);
        u51Var.setClipChildren(false);
        u51Var.setClipToPadding(false);
        u51Var.setHasFixedSize(true);
        u51Var.setItemAnimator(null);
        u51Var.setNestedScrollingEnabled(false);
        b();
        u51Var.setFocusable(false);
        u51Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        u51Var.setOnItemClickListener(new ei.q4(16, this, d2Var));
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(getContext(), null);
        izVar.setViewType(14);
        izVar.setVisibility(0);
        if (i3 != 0 && i3 != -1) {
            frameLayout.addView(izVar, b8.mf.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(u51Var, b8.mf.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(izVar, b8.mf.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(u51Var, b8.mf.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        u51Var.setEmptyView(izVar);
        u51Var.X1 = true;
        u51Var.Y1 = 0;
        if (i3 == 0) {
            org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.d = ch0Var;
            ch0Var.h = true;
            ch0Var.f32719a0 = true;
            ch0Var.o();
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
            this.f49276e = l8Var;
            int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            l8Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(l8Var, h02, null, N, null);
            addView(l8Var, b8.mf.c(-2.0f, -1));
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context);
            this.f49277f = l8Var2;
            l8Var2.o(2131232097, org.telegram.messenger.bd.M0(2131745501, null), false);
            addView(l8Var2, b8.mf.c(-2.0f, -1));
            l8Var.setOnClickListener(new org.telegram.ui.Components.vd(1, this, context, d2Var));
            ch0Var.h = true;
            l8Var2.setOnClickListener(new a(d2Var, 18));
            if (!org.telegram.ui.ActionBar.k6.k1()) {
                ch0Var.M(ch0Var.f32725e[0] - 1);
                l8Var.p(org.telegram.messenger.bd.M0(2131745477, null), ch0Var, true);
                l8Var.f29601x += 2;
            } else {
                l8Var.p(org.telegram.messenger.bd.M0(2131745476, null), ch0Var, true);
                l8Var.f29601x += 2;
            }
        }
        if (!org.telegram.messenger.li.b0(d2Var.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.li.b0(d2Var.getCurrentAccount()).B0);
            if (i3 == 0) {
                org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(d2Var.getCurrentAccount());
                p3Var.f28422e = "🎨";
                p3Var.f28421c = jg.b.d("🎨");
                p3Var.d = TLRPC.ChatTheme.ofEmoticon(p3Var.f28422e);
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.k6.Q0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.k6.Q0(string).f27686g0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0(string);
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
                if (string2 != null && org.telegram.ui.ActionBar.k6.Q0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.k6.Q0(str).f27686g0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.j6 Q02 = org.telegram.ui.ActionBar.k6.Q0(string2);
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
                o3Var.f28382a = org.telegram.ui.ActionBar.k6.Q0(str);
                o3Var.f28385e = i13;
                p3Var.f28423f.add(o3Var);
                p3Var.f28423f.add(null);
                org.telegram.ui.ActionBar.o3 o3Var2 = new org.telegram.ui.ActionBar.o3();
                o3Var2.f28382a = org.telegram.ui.ActionBar.k6.Q0(str2);
                o3Var2.f28385e = i14;
                p3Var.f28423f.add(o3Var2);
                p3Var.f28423f.add(null);
                p3Var.m(d2Var.getCurrentAccount());
                org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(p3Var);
                uoVar.f38834c = org.telegram.ui.ActionBar.k6.k1() ? 0 : 2;
                arrayList.add(uoVar);
            }
            toVar.d = arrayList;
            toVar.f();
        }
        a();
        c();
        updateColors();
        int i15 = this.f49279r;
        if (i15 >= 0 && (b0Var = this.f49274b) != null) {
            b0Var.h1(i15, org.telegram.messenger.g0.L(16.0f));
        }
    }

    public final void a() {
        int i3;
        int i10;
        this.f49283y = org.telegram.ui.ActionBar.k6.I;
        this.E = org.telegram.ui.ActionBar.k6.k1();
        int i11 = 2;
        int i12 = this.f49280s;
        if (i12 != 0 && i12 != -1) {
            if (org.telegram.ui.ActionBar.k6.I.m().equals("Blue")) {
                this.f49281w = 0;
            } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Day")) {
                this.f49281w = 1;
            } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Night")) {
                this.f49281w = 2;
            } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Dark Blue")) {
                this.f49281w = 3;
            } else {
                if (org.telegram.ui.ActionBar.k6.k1() && ((i10 = this.f49281w) == 2 || i10 == 3)) {
                    this.f49281w = 0;
                }
                if (!org.telegram.ui.ActionBar.k6.k1() && ((i3 = this.f49281w) == 0 || i3 == 1)) {
                    this.f49281w = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.k6.k1()) {
                i11 = 0;
            }
            this.f49281w = i11;
        }
        org.telegram.ui.Components.to toVar = this.f49275c;
        if (toVar.d != null) {
            for (int i13 = 0; i13 < toVar.d.size(); i13++) {
                ((org.telegram.ui.Components.uo) toVar.d.get(i13)).f38834c = this.f49281w;
            }
            toVar.k(0, toVar.d.size());
        }
        c();
    }

    public final void b() {
        boolean z10;
        int i3;
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f49282x;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        u51 u51Var = this.f49273a;
        int i10 = this.f49280s;
        if (i10 != 0 && i10 != -1) {
            if (z10) {
                i3 = 3;
            } else {
                i3 = 9;
            }
            u4.b0 b0Var = this.f49274b;
            if (b0Var instanceof u4.s) {
                ((u4.s) b0Var).y1(i3);
            } else {
                u51Var.setHasFixedSize(false);
                getContext();
                u4.s sVar = new u4.s(i3);
                sVar.O = new qt(0);
                this.f49274b = sVar;
                u51Var.setLayoutManager(sVar);
            }
        } else if (this.f49274b == null) {
            getContext();
            u4.b0 b0Var2 = new u4.b0(0, false);
            this.f49274b = b0Var2;
            u51Var.setLayoutManager(b0Var2);
        }
        this.f49282x = Boolean.valueOf(z10);
    }

    public final void c() {
        boolean z10;
        org.telegram.ui.Components.to toVar = this.f49275c;
        if (toVar.d == null) {
            return;
        }
        this.f49279r = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= toVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.uo) toVar.d.get(i3)).f38832a.f28423f.get(this.f49281w)).f28383b;
            org.telegram.ui.ActionBar.j6 i10 = ((org.telegram.ui.Components.uo) toVar.d.get(i3)).f38832a.i(this.f49281w);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.k6.I.f27675a.equals(org.telegram.ui.ActionBar.k6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.uo) toVar.d.get(i3)).f38832a.f28423f.get(this.f49281w)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.k6.I.f27681d0;
                    if (longSparseArray == null) {
                        this.f49279r = i3;
                        break;
                    }
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) longSparseArray.get(tL_theme.f27140id);
                    if (g6Var != null && g6Var.f27525a == org.telegram.ui.ActionBar.k6.I.Z) {
                        this.f49279r = i3;
                        break;
                    }
                } else {
                    continue;
                }
                i3++;
            } else {
                if (i10 != null) {
                    if (org.telegram.ui.ActionBar.k6.I.f27675a.equals(i10.m())) {
                        if (((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.uo) toVar.d.get(i3)).f38832a.f28423f.get(this.f49281w)).f28385e == org.telegram.ui.ActionBar.k6.I.Z) {
                            this.f49279r = i3;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i3++;
            }
        }
        if (this.f49279r == -1 && this.f49280s != 3) {
            this.f49279r = toVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < toVar.d.size(); i11++) {
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) toVar.d.get(i11);
            if (i11 == this.f49279r) {
                z10 = true;
            } else {
                z10 = false;
            }
            uoVar.d = z10;
        }
        toVar.E(this.f49279r);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        b();
        super.onMeasure(i3, i10);
    }

    @Override
    public void setBackgroundColor(int i3) {
        super.setBackgroundColor(i3);
        updateColors();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.j6 j6Var;
        org.telegram.ui.Components.ch0 ch0Var;
        int i3;
        int i10;
        if (this.f49275c != null && (j6Var = this.f49283y) != null && (j6Var != org.telegram.ui.ActionBar.k6.I || this.E != org.telegram.ui.ActionBar.k6.k1())) {
            a();
            if (this.f49276e != null && (ch0Var = this.d) != null) {
                if (!ch0Var.f32734l0) {
                    org.telegram.ui.Components.ch0 ch0Var2 = this.d;
                    if (org.telegram.ui.ActionBar.k6.k1()) {
                        i10 = 0;
                    } else {
                        i10 = this.d.f32725e[0] - 1;
                    }
                    ch0Var2.M(i10);
                }
                org.telegram.ui.Cells.l8 l8Var = this.f49276e;
                if (org.telegram.ui.ActionBar.k6.k1()) {
                    i3 = 2131745476;
                } else {
                    i3 = 2131745477;
                }
                l8Var.p(org.telegram.messenger.bd.M0(i3, null), this.d, true);
                this.f49276e.f29601x += 2;
            }
        }
        int i11 = this.f49280s;
        if (i11 == 0 || i11 == -1) {
            org.telegram.ui.Components.ch0 ch0Var3 = this.d;
            if (ch0Var3 != null) {
                ch0Var3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28121q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.l8 l8Var2 = this.f49276e;
            if (l8Var2 != null) {
                org.telegram.ui.ActionBar.k6.H1(l8Var2.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false), true);
                this.f49276e.g(-1, org.telegram.ui.ActionBar.k6.f28121q6);
            }
            if (this.f49277f != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false);
                org.telegram.ui.Cells.y yVar = this.F;
                if (com.google.android.recaptcha.internal.a.u(yVar) && this.f49277f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.G) {
                        this.G = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.l8 l8Var3 = this.f49277f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(x02, x03);
                    this.F = i02;
                    l8Var3.setBackground(i02);
                    this.G = x03;
                }
                org.telegram.ui.Cells.l8 l8Var4 = this.f49277f;
                int i12 = org.telegram.ui.ActionBar.k6.f28121q6;
                l8Var4.g(i12, i12);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
