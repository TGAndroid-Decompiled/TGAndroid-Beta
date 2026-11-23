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
public final class xt extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public final f61 f53953a;
    public v4.c0 f53954b;
    public final org.telegram.ui.Components.lp f53955c;
    public final org.telegram.ui.Components.oh0 d;
    public final org.telegram.ui.Cells.n8 f53956e;
    public final org.telegram.ui.Cells.n8 f53957f;
    public int h;
    public final int f53958n;
    public int f53959r;
    public Boolean f53960s;
    public org.telegram.ui.ActionBar.l6 f53961w;
    public boolean f53962x;
    public org.telegram.ui.Cells.y f53963y;

    public xt(int i7, Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context);
        int i10;
        v4.c0 c0Var;
        this.f53954b = null;
        this.h = -1;
        this.f53960s = null;
        this.f53958n = i7;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ma.c(-2.0f, -1));
        int currentAccount = g2Var.getCurrentAccount();
        if (i7 != 0 && i7 != -1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(currentAccount, 0L, null, i10);
        this.f53955c = lpVar;
        f61 f61Var = new f61(9, getContext(), null);
        this.f53953a = f61Var;
        f61Var.setAdapter(lpVar);
        f61Var.setSelectorDrawableColor(0);
        f61Var.setClipChildren(false);
        f61Var.setClipToPadding(false);
        f61Var.setHasFixedSize(true);
        f61Var.setItemAnimator(null);
        f61Var.setNestedScrollingEnabled(false);
        b();
        f61Var.setFocusable(false);
        f61Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        f61Var.setOnItemClickListener(new fi.g4(16, this, g2Var));
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(getContext(), null);
        yzVar.setViewType(14);
        yzVar.setVisibility(0);
        if (i7 != 0 && i7 != -1) {
            frameLayout.addView(yzVar, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(f61Var, c8.ma.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(yzVar, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(f61Var, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        f61Var.setEmptyView(yzVar);
        f61Var.X1 = true;
        f61Var.Y1 = 0;
        if (i7 == 0) {
            org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.d = oh0Var;
            oh0Var.h = true;
            oh0Var.f38205a0 = true;
            oh0Var.o();
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
            this.f53956e = n8Var;
            int i11 = org.telegram.ui.ActionBar.m6.f29473i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            n8Var.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(n8Var, h02, null, M, null);
            addView(n8Var, c8.ma.c(-2.0f, -1));
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context);
            this.f53957f = n8Var2;
            n8Var2.o(2131232099, org.telegram.messenger.hd.N0(2131745295, null), false);
            addView(n8Var2, c8.ma.c(-2.0f, -1));
            n8Var.setOnClickListener(new a7.d(2, this, g2Var));
            oh0Var.h = true;
            n8Var2.setOnClickListener(new a(g2Var, 18));
            if (!org.telegram.ui.ActionBar.m6.k1()) {
                oh0Var.M(oh0Var.f38211e[0] - 1);
                n8Var.p(org.telegram.messenger.hd.N0(2131745271, null), oh0Var, true);
                n8Var.f31174x += 2;
            } else {
                n8Var.p(org.telegram.messenger.hd.N0(2131745270, null), oh0Var, true);
                n8Var.f31174x += 2;
            }
        }
        if (!org.telegram.messenger.si.d0(g2Var.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.si.d0(g2Var.getCurrentAccount()).B0);
            if (i7 == 0) {
                org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(g2Var.getCurrentAccount());
                s3Var.f29986e = "🎨";
                s3Var.f29985c = ig.b.d("🎨");
                s3Var.d = TLRPC.ChatTheme.ofEmoticon(s3Var.f29986e);
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26931b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.m6.Q0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.m6.Q0(string).f29243g0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.l6 Q0 = org.telegram.ui.ActionBar.m6.Q0(string);
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
                if (string2 != null && org.telegram.ui.ActionBar.m6.Q0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.m6.Q0(str).f29243g0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.l6 Q02 = org.telegram.ui.ActionBar.m6.Q0(string2);
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
                r3Var.f29958a = org.telegram.ui.ActionBar.m6.Q0(str);
                r3Var.f29961e = i13;
                s3Var.f29987f.add(r3Var);
                s3Var.f29987f.add(null);
                org.telegram.ui.ActionBar.r3 r3Var2 = new org.telegram.ui.ActionBar.r3();
                r3Var2.f29958a = org.telegram.ui.ActionBar.m6.Q0(str2);
                r3Var2.f29961e = i14;
                s3Var.f29987f.add(r3Var2);
                s3Var.f29987f.add(null);
                s3Var.m(g2Var.getCurrentAccount());
                org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(s3Var);
                mpVar.f37595c = org.telegram.ui.ActionBar.m6.k1() ? 0 : 2;
                arrayList.add(mpVar);
            }
            lpVar.d = arrayList;
            lpVar.f();
        }
        a();
        c();
        updateColors();
        int i15 = this.h;
        if (i15 >= 0 && (c0Var = this.f53954b) != null) {
            c0Var.h1(i15, org.telegram.messenger.g0.L(16.0f));
        }
    }

    public final void a() {
        int i7;
        int i10;
        this.f53961w = org.telegram.ui.ActionBar.m6.I;
        this.f53962x = org.telegram.ui.ActionBar.m6.k1();
        int i11 = 2;
        int i12 = this.f53958n;
        if (i12 != 0 && i12 != -1) {
            if (org.telegram.ui.ActionBar.m6.I.m().equals("Blue")) {
                this.f53959r = 0;
            } else if (org.telegram.ui.ActionBar.m6.I.m().equals("Day")) {
                this.f53959r = 1;
            } else if (org.telegram.ui.ActionBar.m6.I.m().equals("Night")) {
                this.f53959r = 2;
            } else if (org.telegram.ui.ActionBar.m6.I.m().equals("Dark Blue")) {
                this.f53959r = 3;
            } else {
                if (org.telegram.ui.ActionBar.m6.k1() && ((i10 = this.f53959r) == 2 || i10 == 3)) {
                    this.f53959r = 0;
                }
                if (!org.telegram.ui.ActionBar.m6.k1() && ((i7 = this.f53959r) == 0 || i7 == 1)) {
                    this.f53959r = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.m6.k1()) {
                i11 = 0;
            }
            this.f53959r = i11;
        }
        org.telegram.ui.Components.lp lpVar = this.f53955c;
        if (lpVar.d != null) {
            for (int i13 = 0; i13 < lpVar.d.size(); i13++) {
                ((org.telegram.ui.Components.mp) lpVar.d.get(i13)).f37595c = this.f53959r;
            }
            lpVar.k(0, lpVar.d.size());
        }
        c();
    }

    public final void b() {
        boolean z10;
        int i7;
        Point point = org.telegram.messenger.g0.f24046q;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f53960s;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        f61 f61Var = this.f53953a;
        int i10 = this.f53958n;
        if (i10 != 0 && i10 != -1) {
            if (z10) {
                i7 = 3;
            } else {
                i7 = 9;
            }
            v4.c0 c0Var = this.f53954b;
            if (c0Var instanceof v4.t) {
                ((v4.t) c0Var).y1(i7);
            } else {
                f61Var.setHasFixedSize(false);
                getContext();
                v4.t tVar = new v4.t(i7);
                tVar.O = new wt(0);
                this.f53954b = tVar;
                f61Var.setLayoutManager(tVar);
            }
        } else if (this.f53954b == null) {
            getContext();
            v4.c0 c0Var2 = new v4.c0(0, false);
            this.f53954b = c0Var2;
            f61Var.setLayoutManager(c0Var2);
        }
        this.f53960s = Boolean.valueOf(z10);
    }

    public final void c() {
        boolean z10;
        org.telegram.ui.Components.lp lpVar = this.f53955c;
        if (lpVar.d == null) {
            return;
        }
        this.h = -1;
        int i7 = 0;
        while (true) {
            if (i7 >= lpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.mp) lpVar.d.get(i7)).f37593a.f29987f.get(this.f53959r)).f29959b;
            org.telegram.ui.ActionBar.l6 i10 = ((org.telegram.ui.Components.mp) lpVar.d.get(i7)).f37593a.i(this.f53959r);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.m6.I.f29232a.equals(org.telegram.ui.ActionBar.m6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.mp) lpVar.d.get(i7)).f37593a.f29987f.get(this.f53959r)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.m6.I.f29238d0;
                    if (longSparseArray == null) {
                        this.h = i7;
                        break;
                    }
                    org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) longSparseArray.get(tL_theme.f28573id);
                    if (j6Var != null && j6Var.f29096a == org.telegram.ui.ActionBar.m6.I.Z) {
                        this.h = i7;
                        break;
                    }
                } else {
                    continue;
                }
                i7++;
            } else {
                if (i10 != null) {
                    if (org.telegram.ui.ActionBar.m6.I.f29232a.equals(i10.m())) {
                        if (((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.mp) lpVar.d.get(i7)).f37593a.f29987f.get(this.f53959r)).f29961e == org.telegram.ui.ActionBar.m6.I.Z) {
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
        if (this.h == -1 && this.f53958n != 3) {
            this.h = lpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < lpVar.d.size(); i11++) {
            org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) lpVar.d.get(i11);
            if (i11 == this.h) {
                z10 = true;
            } else {
                z10 = false;
            }
            mpVar.d = z10;
        }
        lpVar.E(this.h);
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
        org.telegram.ui.Components.oh0 oh0Var;
        int i7;
        int i10;
        if (this.f53955c != null && (l6Var = this.f53961w) != null && (l6Var != org.telegram.ui.ActionBar.m6.I || this.f53962x != org.telegram.ui.ActionBar.m6.k1())) {
            a();
            if (this.f53956e != null && (oh0Var = this.d) != null) {
                if (!oh0Var.f38220l0) {
                    org.telegram.ui.Components.oh0 oh0Var2 = this.d;
                    if (org.telegram.ui.ActionBar.m6.k1()) {
                        i10 = 0;
                    } else {
                        i10 = this.d.f38211e[0] - 1;
                    }
                    oh0Var2.M(i10);
                }
                org.telegram.ui.Cells.n8 n8Var = this.f53956e;
                if (org.telegram.ui.ActionBar.m6.k1()) {
                    i7 = 2131745270;
                } else {
                    i7 = 2131745271;
                }
                n8Var.p(org.telegram.messenger.hd.N0(i7, null), this.d, true);
                this.f53956e.f31174x += 2;
            }
        }
        int i11 = this.f53958n;
        if (i11 == 0 || i11 == -1) {
            org.telegram.ui.Components.oh0 oh0Var3 = this.d;
            if (oh0Var3 != null) {
                oh0Var3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29621q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.n8 n8Var2 = this.f53956e;
            if (n8Var2 != null) {
                org.telegram.ui.ActionBar.m6.H1(n8Var2.getBackground(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29473i6, false), true);
                this.f53956e.g(-1, org.telegram.ui.ActionBar.m6.f29621q6);
            }
            if (this.f53957f != null) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29473i6, false);
                org.telegram.ui.Cells.y yVar = this.f53963y;
                if (com.google.android.gms.internal.vision.e2.s(yVar) && this.f53957f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.E) {
                        this.E = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.n8 n8Var3 = this.f53957f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.m6.i0(x02, x03);
                    this.f53963y = i02;
                    n8Var3.setBackground(i02);
                    this.E = x03;
                }
                org.telegram.ui.Cells.n8 n8Var4 = this.f53957f;
                int i12 = org.telegram.ui.ActionBar.m6.f29621q6;
                n8Var4.g(i12, i12);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
