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
public final class vt extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean D;
    public org.telegram.ui.Cells.y E;
    public int F;
    public final f61 f50762a;
    public v4.b0 f50763b;
    public final org.telegram.ui.Components.to f50764c;
    public final org.telegram.ui.Components.ah0 d;
    public final org.telegram.ui.Cells.m8 f50765e;
    public final org.telegram.ui.Cells.m8 f50766f;
    public ValueAnimator h;
    public int f50767n;
    public int f50768r;
    public final int f50769s;
    public int f50770w;
    public Boolean f50771x;
    public org.telegram.ui.ActionBar.k6 f50772y;

    public vt(int i7, Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context);
        int i10;
        v4.b0 b0Var;
        this.f50763b = null;
        this.f50768r = -1;
        this.f50771x = null;
        this.f50769s = i7;
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
        this.f50764c = toVar;
        f61 f61Var = new f61(9, getContext(), null);
        this.f50762a = f61Var;
        f61Var.setAdapter(toVar);
        f61Var.setSelectorDrawableColor(0);
        f61Var.setClipChildren(false);
        f61Var.setClipToPadding(false);
        f61Var.setHasFixedSize(true);
        f61Var.setItemAnimator(null);
        f61Var.setNestedScrollingEnabled(false);
        b();
        f61Var.setFocusable(false);
        f61Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        f61Var.setOnItemClickListener(new di.q4(16, this, f2Var));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(getContext(), null);
        mzVar.setViewType(14);
        mzVar.setVisibility(0);
        if (i7 != 0 && i7 != -1) {
            frameLayout.addView(mzVar, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(f61Var, c8.ha.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(mzVar, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(f61Var, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        f61Var.setEmptyView(mzVar);
        f61Var.W1 = true;
        f61Var.X1 = 0;
        if (i7 == 0) {
            org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.d = ah0Var;
            ah0Var.h = true;
            ah0Var.Z = true;
            ah0Var.o();
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
            this.f50765e = m8Var;
            int i11 = org.telegram.ui.ActionBar.l6.f27957i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
            m8Var.setBackground(h02);
            org.telegram.ui.ActionBar.s6.j(m8Var, h02, null, M, null);
            addView(m8Var, c8.ha.c(-2.0f, -1));
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context);
            this.f50766f = m8Var2;
            m8Var2.o(2131232097, org.telegram.messenger.id.M0(2131745491, null), false);
            addView(m8Var2, c8.ha.c(-2.0f, -1));
            m8Var.setOnClickListener(new org.telegram.ui.Components.xd(1, this, context, f2Var));
            ah0Var.h = true;
            m8Var2.setOnClickListener(new a(f2Var, 18));
            if (!org.telegram.ui.ActionBar.l6.k1()) {
                ah0Var.M(ah0Var.f31826e[0] - 1);
                m8Var.p(org.telegram.messenger.id.M0(2131745467, null), ah0Var, true);
                m8Var.f29580x += 2;
            } else {
                m8Var.p(org.telegram.messenger.id.M0(2131745466, null), ah0Var, true);
                m8Var.f29580x += 2;
            }
        }
        if (!org.telegram.messenger.ui.b0(f2Var.getCurrentAccount()).A0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(f2Var.getCurrentAccount()).A0);
            if (i7 == 0) {
                org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3(f2Var.getCurrentAccount());
                r3Var.f28463e = "🎨";
                r3Var.f28462c = ig.b.d("🎨");
                r3Var.d = TLRPC.ChatTheme.ofEmoticon(r3Var.f28463e);
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.l6.Q0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.l6.Q0(string).f27746f0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.k6 Q0 = org.telegram.ui.ActionBar.l6.Q0(string);
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
                if (string2 != null && org.telegram.ui.ActionBar.l6.Q0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.l6.Q0(str).f27746f0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.k6 Q02 = org.telegram.ui.ActionBar.l6.Q0(string2);
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
                org.telegram.ui.ActionBar.q3 q3Var = new org.telegram.ui.ActionBar.q3();
                q3Var.f28408a = org.telegram.ui.ActionBar.l6.Q0(str);
                q3Var.f28411e = i13;
                r3Var.f28464f.add(q3Var);
                r3Var.f28464f.add(null);
                org.telegram.ui.ActionBar.q3 q3Var2 = new org.telegram.ui.ActionBar.q3();
                q3Var2.f28408a = org.telegram.ui.ActionBar.l6.Q0(str2);
                q3Var2.f28411e = i14;
                r3Var.f28464f.add(q3Var2);
                r3Var.f28464f.add(null);
                r3Var.m(f2Var.getCurrentAccount());
                org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(r3Var);
                uoVar.f38762c = org.telegram.ui.ActionBar.l6.k1() ? 0 : 2;
                arrayList.add(uoVar);
            }
            toVar.d = arrayList;
            toVar.f();
        }
        a();
        c();
        updateColors();
        int i15 = this.f50768r;
        if (i15 >= 0 && (b0Var = this.f50763b) != null) {
            b0Var.h1(i15, org.telegram.messenger.g0.L(16.0f));
        }
    }

    public final void a() {
        int i7;
        int i10;
        this.f50772y = org.telegram.ui.ActionBar.l6.I;
        this.D = org.telegram.ui.ActionBar.l6.k1();
        int i11 = 2;
        int i12 = this.f50769s;
        if (i12 != 0 && i12 != -1) {
            if (org.telegram.ui.ActionBar.l6.I.m().equals("Blue")) {
                this.f50770w = 0;
            } else if (org.telegram.ui.ActionBar.l6.I.m().equals("Day")) {
                this.f50770w = 1;
            } else if (org.telegram.ui.ActionBar.l6.I.m().equals("Night")) {
                this.f50770w = 2;
            } else if (org.telegram.ui.ActionBar.l6.I.m().equals("Dark Blue")) {
                this.f50770w = 3;
            } else {
                if (org.telegram.ui.ActionBar.l6.k1() && ((i10 = this.f50770w) == 2 || i10 == 3)) {
                    this.f50770w = 0;
                }
                if (!org.telegram.ui.ActionBar.l6.k1() && ((i7 = this.f50770w) == 0 || i7 == 1)) {
                    this.f50770w = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.l6.k1()) {
                i11 = 0;
            }
            this.f50770w = i11;
        }
        org.telegram.ui.Components.to toVar = this.f50764c;
        if (toVar.d != null) {
            for (int i13 = 0; i13 < toVar.d.size(); i13++) {
                ((org.telegram.ui.Components.uo) toVar.d.get(i13)).f38762c = this.f50770w;
            }
            toVar.k(0, toVar.d.size());
        }
        c();
    }

    public final void b() {
        boolean z9;
        int i7;
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.y > point.x) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.f50771x;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        f61 f61Var = this.f50762a;
        int i10 = this.f50769s;
        if (i10 != 0 && i10 != -1) {
            if (z9) {
                i7 = 3;
            } else {
                i7 = 9;
            }
            v4.b0 b0Var = this.f50763b;
            if (b0Var instanceof v4.s) {
                ((v4.s) b0Var).y1(i7);
            } else {
                f61Var.setHasFixedSize(false);
                getContext();
                v4.s sVar = new v4.s(i7);
                sVar.O = new ut(0);
                this.f50763b = sVar;
                f61Var.setLayoutManager(sVar);
            }
        } else if (this.f50763b == null) {
            getContext();
            v4.b0 b0Var2 = new v4.b0(0, false);
            this.f50763b = b0Var2;
            f61Var.setLayoutManager(b0Var2);
        }
        this.f50771x = Boolean.valueOf(z9);
    }

    public final void c() {
        boolean z9;
        org.telegram.ui.Components.to toVar = this.f50764c;
        if (toVar.d == null) {
            return;
        }
        this.f50768r = -1;
        int i7 = 0;
        while (true) {
            if (i7 >= toVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.q3) ((org.telegram.ui.Components.uo) toVar.d.get(i7)).f38760a.f28464f.get(this.f50770w)).f28409b;
            org.telegram.ui.ActionBar.k6 i10 = ((org.telegram.ui.Components.uo) toVar.d.get(i7)).f38760a.i(this.f50770w);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.l6.I.f27736a.equals(org.telegram.ui.ActionBar.l6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.q3) ((org.telegram.ui.Components.uo) toVar.d.get(i7)).f38760a.f28464f.get(this.f50770w)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.l6.I.f27741c0;
                    if (longSparseArray == null) {
                        this.f50768r = i7;
                        break;
                    }
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) longSparseArray.get(tL_theme.f27095id);
                    if (i6Var != null && i6Var.f27571a == org.telegram.ui.ActionBar.l6.I.Y) {
                        this.f50768r = i7;
                        break;
                    }
                } else {
                    continue;
                }
                i7++;
            } else {
                if (i10 != null) {
                    if (org.telegram.ui.ActionBar.l6.I.f27736a.equals(i10.m())) {
                        if (((org.telegram.ui.ActionBar.q3) ((org.telegram.ui.Components.uo) toVar.d.get(i7)).f38760a.f28464f.get(this.f50770w)).f28411e == org.telegram.ui.ActionBar.l6.I.Y) {
                            this.f50768r = i7;
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
        if (this.f50768r == -1 && this.f50769s != 3) {
            this.f50768r = toVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < toVar.d.size(); i11++) {
            org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) toVar.d.get(i11);
            if (i11 == this.f50768r) {
                z9 = true;
            } else {
                z9 = false;
            }
            uoVar.d = z9;
        }
        toVar.E(this.f50768r);
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
        org.telegram.ui.ActionBar.k6 k6Var;
        org.telegram.ui.Components.ah0 ah0Var;
        int i7;
        int i10;
        if (this.f50764c != null && (k6Var = this.f50772y) != null && (k6Var != org.telegram.ui.ActionBar.l6.I || this.D != org.telegram.ui.ActionBar.l6.k1())) {
            a();
            if (this.f50765e != null && (ah0Var = this.d) != null) {
                if (!ah0Var.f31834k0) {
                    org.telegram.ui.Components.ah0 ah0Var2 = this.d;
                    if (org.telegram.ui.ActionBar.l6.k1()) {
                        i10 = 0;
                    } else {
                        i10 = this.d.f31826e[0] - 1;
                    }
                    ah0Var2.M(i10);
                }
                org.telegram.ui.Cells.m8 m8Var = this.f50765e;
                if (org.telegram.ui.ActionBar.l6.k1()) {
                    i7 = 2131745466;
                } else {
                    i7 = 2131745467;
                }
                m8Var.p(org.telegram.messenger.id.M0(i7, null), this.d, true);
                this.f50765e.f29580x += 2;
            }
        }
        int i11 = this.f50769s;
        if (i11 == 0 || i11 == -1) {
            org.telegram.ui.Components.ah0 ah0Var3 = this.d;
            if (ah0Var3 != null) {
                ah0Var3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28105q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.m8 m8Var2 = this.f50765e;
            if (m8Var2 != null) {
                org.telegram.ui.ActionBar.l6.H1(m8Var2.getBackground(), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27957i6, false), true);
                this.f50765e.g(-1, org.telegram.ui.ActionBar.l6.f28105q6);
            }
            if (this.f50766f != null) {
                int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false);
                int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27957i6, false);
                org.telegram.ui.Cells.y yVar = this.E;
                if (com.google.android.recaptcha.internal.a.u(yVar) && this.f50766f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.F) {
                        this.F = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.m8 m8Var3 = this.f50766f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.l6.i0(x02, x03);
                    this.E = i02;
                    m8Var3.setBackground(i02);
                    this.F = x03;
                }
                org.telegram.ui.Cells.m8 m8Var4 = this.f50766f;
                int i12 = org.telegram.ui.ActionBar.l6.f28105q6;
                m8Var4.g(i12, i12);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
