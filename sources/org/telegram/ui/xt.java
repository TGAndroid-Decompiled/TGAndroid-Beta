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
public final class xt extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public int E;
    public final f61 f53900a;
    public v4.c0 f53901b;
    public final org.telegram.ui.Components.jp f53902c;
    public final org.telegram.ui.Components.mh0 d;
    public final org.telegram.ui.Cells.n8 f53903e;
    public final org.telegram.ui.Cells.n8 f53904f;
    public int h;
    public final int f53905n;
    public int f53906r;
    public Boolean f53907s;
    public org.telegram.ui.ActionBar.m6 f53908w;
    public boolean f53909x;
    public org.telegram.ui.Cells.y f53910y;

    public xt(int i7, Context context, org.telegram.ui.ActionBar.h2 h2Var) {
        super(context);
        int i10;
        v4.c0 c0Var;
        this.f53901b = null;
        this.h = -1;
        this.f53907s = null;
        this.f53905n = i7;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ma.c(-2.0f, -1));
        int currentAccount = h2Var.getCurrentAccount();
        if (i7 != 0 && i7 != -1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.jp jpVar = new org.telegram.ui.Components.jp(currentAccount, 0L, null, i10);
        this.f53902c = jpVar;
        f61 f61Var = new f61(9, getContext(), null);
        this.f53900a = f61Var;
        f61Var.setAdapter(jpVar);
        f61Var.setSelectorDrawableColor(0);
        f61Var.setClipChildren(false);
        f61Var.setClipToPadding(false);
        f61Var.setHasFixedSize(true);
        f61Var.setItemAnimator(null);
        f61Var.setNestedScrollingEnabled(false);
        b();
        f61Var.setFocusable(false);
        f61Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        f61Var.setOnItemClickListener(new fi.g4(16, this, h2Var));
        org.telegram.ui.Components.wz wzVar = new org.telegram.ui.Components.wz(getContext(), null);
        wzVar.setViewType(14);
        wzVar.setVisibility(0);
        if (i7 != 0 && i7 != -1) {
            frameLayout.addView(wzVar, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(f61Var, c8.ma.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(wzVar, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(f61Var, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        f61Var.setEmptyView(wzVar);
        f61Var.X1 = true;
        f61Var.Y1 = 0;
        if (i7 == 0) {
            org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(2131624241, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.d = mh0Var;
            mh0Var.h = true;
            mh0Var.f37480a0 = true;
            mh0Var.o();
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
            this.f53903e = n8Var;
            int i11 = org.telegram.ui.ActionBar.n6.f29486i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
            n8Var.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(n8Var, h02, null, M, null);
            addView(n8Var, c8.ma.c(-2.0f, -1));
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context);
            this.f53904f = n8Var2;
            n8Var2.o(2131232099, org.telegram.messenger.gd.M0(2131745296, null), false);
            addView(n8Var2, c8.ma.c(-2.0f, -1));
            n8Var.setOnClickListener(new a7.d(2, this, h2Var));
            mh0Var.h = true;
            n8Var2.setOnClickListener(new a(h2Var, 18));
            if (!org.telegram.ui.ActionBar.n6.k1()) {
                mh0Var.M(mh0Var.f37486e[0] - 1);
                n8Var.p(org.telegram.messenger.gd.M0(2131745272, null), mh0Var, true);
                n8Var.f31143x += 2;
            } else {
                n8Var.p(org.telegram.messenger.gd.M0(2131745271, null), mh0Var, true);
                n8Var.f31143x += 2;
            }
        }
        if (!org.telegram.messenger.ri.d0(h2Var.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.ri.d0(h2Var.getCurrentAccount()).B0);
            if (i7 == 0) {
                org.telegram.ui.ActionBar.t3 t3Var = new org.telegram.ui.ActionBar.t3(h2Var.getCurrentAccount());
                t3Var.f30000e = "🎨";
                t3Var.f29999c = ig.b.d("🎨");
                t3Var.d = TLRPC.ChatTheme.ofEmoticon(t3Var.f30000e);
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26913b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.n6.Q0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.n6.Q0(string).f29258g0;
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
                        i14 = org.telegram.ui.ActionBar.n6.Q0(str).f29258g0;
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
                org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3();
                s3Var.f29972a = org.telegram.ui.ActionBar.n6.Q0(str);
                s3Var.f29975e = i13;
                t3Var.f30001f.add(s3Var);
                t3Var.f30001f.add(null);
                org.telegram.ui.ActionBar.s3 s3Var2 = new org.telegram.ui.ActionBar.s3();
                s3Var2.f29972a = org.telegram.ui.ActionBar.n6.Q0(str2);
                s3Var2.f29975e = i14;
                t3Var.f30001f.add(s3Var2);
                t3Var.f30001f.add(null);
                t3Var.m(h2Var.getCurrentAccount());
                org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(t3Var);
                kpVar.f36839c = org.telegram.ui.ActionBar.n6.k1() ? 0 : 2;
                arrayList.add(kpVar);
            }
            jpVar.d = arrayList;
            jpVar.f();
        }
        a();
        c();
        updateColors();
        int i15 = this.h;
        if (i15 >= 0 && (c0Var = this.f53901b) != null) {
            c0Var.h1(i15, org.telegram.messenger.g0.L(16.0f));
        }
    }

    public final void a() {
        int i7;
        int i10;
        this.f53908w = org.telegram.ui.ActionBar.n6.I;
        this.f53909x = org.telegram.ui.ActionBar.n6.k1();
        int i11 = 2;
        int i12 = this.f53905n;
        if (i12 != 0 && i12 != -1) {
            if (org.telegram.ui.ActionBar.n6.I.m().equals("Blue")) {
                this.f53906r = 0;
            } else if (org.telegram.ui.ActionBar.n6.I.m().equals("Day")) {
                this.f53906r = 1;
            } else if (org.telegram.ui.ActionBar.n6.I.m().equals("Night")) {
                this.f53906r = 2;
            } else if (org.telegram.ui.ActionBar.n6.I.m().equals("Dark Blue")) {
                this.f53906r = 3;
            } else {
                if (org.telegram.ui.ActionBar.n6.k1() && ((i10 = this.f53906r) == 2 || i10 == 3)) {
                    this.f53906r = 0;
                }
                if (!org.telegram.ui.ActionBar.n6.k1() && ((i7 = this.f53906r) == 0 || i7 == 1)) {
                    this.f53906r = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.n6.k1()) {
                i11 = 0;
            }
            this.f53906r = i11;
        }
        org.telegram.ui.Components.jp jpVar = this.f53902c;
        if (jpVar.d != null) {
            for (int i13 = 0; i13 < jpVar.d.size(); i13++) {
                ((org.telegram.ui.Components.kp) jpVar.d.get(i13)).f36839c = this.f53906r;
            }
            jpVar.k(0, jpVar.d.size());
        }
        c();
    }

    public final void b() {
        boolean z10;
        int i7;
        Point point = org.telegram.messenger.g0.f24118q;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f53907s;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        f61 f61Var = this.f53900a;
        int i10 = this.f53905n;
        if (i10 != 0 && i10 != -1) {
            if (z10) {
                i7 = 3;
            } else {
                i7 = 9;
            }
            v4.c0 c0Var = this.f53901b;
            if (c0Var instanceof v4.t) {
                ((v4.t) c0Var).y1(i7);
            } else {
                f61Var.setHasFixedSize(false);
                getContext();
                v4.t tVar = new v4.t(i7);
                tVar.O = new wt(0);
                this.f53901b = tVar;
                f61Var.setLayoutManager(tVar);
            }
        } else if (this.f53901b == null) {
            getContext();
            v4.c0 c0Var2 = new v4.c0(0, false);
            this.f53901b = c0Var2;
            f61Var.setLayoutManager(c0Var2);
        }
        this.f53907s = Boolean.valueOf(z10);
    }

    public final void c() {
        boolean z10;
        org.telegram.ui.Components.jp jpVar = this.f53902c;
        if (jpVar.d == null) {
            return;
        }
        this.h = -1;
        int i7 = 0;
        while (true) {
            if (i7 >= jpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.s3) ((org.telegram.ui.Components.kp) jpVar.d.get(i7)).f36837a.f30001f.get(this.f53906r)).f29973b;
            org.telegram.ui.ActionBar.m6 i10 = ((org.telegram.ui.Components.kp) jpVar.d.get(i7)).f36837a.i(this.f53906r);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.n6.I.f29247a.equals(org.telegram.ui.ActionBar.n6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.s3) ((org.telegram.ui.Components.kp) jpVar.d.get(i7)).f36837a.f30001f.get(this.f53906r)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.n6.I.f29253d0;
                    if (longSparseArray == null) {
                        this.h = i7;
                        break;
                    }
                    org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) longSparseArray.get(tL_theme.f28542id);
                    if (k6Var != null && k6Var.f29168a == org.telegram.ui.ActionBar.n6.I.Z) {
                        this.h = i7;
                        break;
                    }
                } else {
                    continue;
                }
                i7++;
            } else {
                if (i10 != null) {
                    if (org.telegram.ui.ActionBar.n6.I.f29247a.equals(i10.m())) {
                        if (((org.telegram.ui.ActionBar.s3) ((org.telegram.ui.Components.kp) jpVar.d.get(i7)).f36837a.f30001f.get(this.f53906r)).f29975e == org.telegram.ui.ActionBar.n6.I.Z) {
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
        if (this.h == -1 && this.f53905n != 3) {
            this.h = jpVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < jpVar.d.size(); i11++) {
            org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) jpVar.d.get(i11);
            if (i11 == this.h) {
                z10 = true;
            } else {
                z10 = false;
            }
            kpVar.d = z10;
        }
        jpVar.E(this.h);
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
        org.telegram.ui.Components.mh0 mh0Var;
        int i7;
        int i10;
        if (this.f53902c != null && (m6Var = this.f53908w) != null && (m6Var != org.telegram.ui.ActionBar.n6.I || this.f53909x != org.telegram.ui.ActionBar.n6.k1())) {
            a();
            if (this.f53903e != null && (mh0Var = this.d) != null) {
                if (!mh0Var.f37495l0) {
                    org.telegram.ui.Components.mh0 mh0Var2 = this.d;
                    if (org.telegram.ui.ActionBar.n6.k1()) {
                        i10 = 0;
                    } else {
                        i10 = this.d.f37486e[0] - 1;
                    }
                    mh0Var2.M(i10);
                }
                org.telegram.ui.Cells.n8 n8Var = this.f53903e;
                if (org.telegram.ui.ActionBar.n6.k1()) {
                    i7 = 2131745271;
                } else {
                    i7 = 2131745272;
                }
                n8Var.p(org.telegram.messenger.gd.M0(i7, null), this.d, true);
                this.f53903e.f31143x += 2;
            }
        }
        int i11 = this.f53905n;
        if (i11 == 0 || i11 == -1) {
            org.telegram.ui.Components.mh0 mh0Var3 = this.d;
            if (mh0Var3 != null) {
                mh0Var3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29634q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.n8 n8Var2 = this.f53903e;
            if (n8Var2 != null) {
                org.telegram.ui.ActionBar.n6.H1(n8Var2.getBackground(), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29486i6, false), true);
                this.f53903e.g(-1, org.telegram.ui.ActionBar.n6.f29634q6);
            }
            if (this.f53904f != null) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29486i6, false);
                org.telegram.ui.Cells.y yVar = this.f53910y;
                if (com.google.android.gms.internal.vision.e2.s(yVar) && this.f53904f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.E) {
                        this.E = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.n8 n8Var3 = this.f53904f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.n6.i0(x02, x03);
                    this.f53910y = i02;
                    n8Var3.setBackground(i02);
                    this.E = x03;
                }
                org.telegram.ui.Cells.n8 n8Var4 = this.f53904f;
                int i12 = org.telegram.ui.ActionBar.n6.f29634q6;
                n8Var4.g(i12, i12);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
