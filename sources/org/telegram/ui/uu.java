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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class uu extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.Cells.y E;
    public int F;
    public final wa1 f42487a;
    public s4.b0 f42488b;
    public final org.telegram.ui.Components.sp f42489c;
    public final org.telegram.ui.Components.xj0 d;
    public final org.telegram.ui.Cells.r8 e;
    public final org.telegram.ui.Cells.r8 f42490f;
    public ValueAnimator h;
    public int f42491n;
    public int f42492r;
    public final int f42493s;
    public int v;
    public Boolean f42494w;
    public org.telegram.ui.ActionBar.j6 f42495x;
    public boolean f42496y;

    public uu(int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        int i11;
        s4.b0 b0Var;
        this.f42488b = null;
        this.f42492r = -1;
        this.f42494w = null;
        this.f42493s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.z5.c(-2.0f, -1));
        int currentAccount = o2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.sp spVar = new org.telegram.ui.Components.sp(currentAccount, 0L, null, i11);
        this.f42489c = spVar;
        wa1 wa1Var = new wa1(getContext(), 8, null);
        this.f42487a = wa1Var;
        wa1Var.setAdapter(spVar);
        wa1Var.setSelectorDrawableColor(0);
        wa1Var.setClipChildren(false);
        wa1Var.setClipToPadding(false);
        wa1Var.setHasFixedSize(true);
        wa1Var.setItemAnimator(null);
        wa1Var.setNestedScrollingEnabled(false);
        b();
        wa1Var.setFocusable(false);
        wa1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        wa1Var.setOnItemClickListener(new ci.x4(15, this, o2Var));
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(getContext(), null);
        z00Var.setViewType(14);
        z00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(z00Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(wa1Var, w7.z5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(z00Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(wa1Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        wa1Var.setEmptyView(z00Var);
        wa1Var.W1 = true;
        wa1Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = xj0Var;
            xj0Var.h = true;
            xj0Var.Z = true;
            xj0Var.o();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.e = r8Var;
            int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 2, -1);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
            r8Var.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(r8Var, g02, null, O, null);
            addView(r8Var, w7.z5.c(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f42490f = r8Var2;
            r8Var2.o(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.z5.c(-2.0f, -1));
            r8Var.setOnClickListener(new su(this, context, o2Var));
            xj0Var.h = true;
            r8Var2.setOnClickListener(new a(o2Var, 18));
            if (!org.telegram.ui.ActionBar.k6.i1()) {
                xj0Var.M(xj0Var.e[0] - 1);
                r8Var.p(LocaleController.getString(R.string.SettingsSwitchToDayMode), xj0Var, true);
                r8Var.f23116w += 2;
            } else {
                r8Var.p(LocaleController.getString(R.string.SettingsSwitchToNightMode), xj0Var, true);
                r8Var.f23116w += 2;
            }
        }
        if (!MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(o2Var.getCurrentAccount());
                f4Var.e = "🎨";
                f4Var.f20887c = gg.b.d("🎨");
                f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i14 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.k6.P0(string) != null) {
                    if (i13 == -1) {
                        i13 = org.telegram.ui.ActionBar.k6.P0(string).f21029f0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.j6 P0 = org.telegram.ui.ActionBar.k6.P0(string);
                    if (P0 == null) {
                        i13 = 99;
                        string = "Blue";
                    } else {
                        i13 = P0.Y;
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
                if (string2 != null && org.telegram.ui.ActionBar.k6.P0(string2) != null) {
                    if (i15 == -1) {
                        i15 = org.telegram.ui.ActionBar.k6.P0(str).f21029f0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.j6 P02 = org.telegram.ui.ActionBar.k6.P0(string2);
                    if (P02 == null) {
                        i15 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i15 = P02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i15 == -1) {
                    i15 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4();
                e4Var.f20858a = org.telegram.ui.ActionBar.k6.P0(str);
                e4Var.e = i14;
                f4Var.f20888f.add(e4Var);
                f4Var.f20888f.add(null);
                org.telegram.ui.ActionBar.e4 e4Var2 = new org.telegram.ui.ActionBar.e4();
                e4Var2.f20858a = org.telegram.ui.ActionBar.k6.P0(str2);
                e4Var2.e = i15;
                f4Var.f20888f.add(e4Var2);
                f4Var.f20888f.add(null);
                f4Var.m(o2Var.getCurrentAccount());
                org.telegram.ui.Components.tp tpVar = new org.telegram.ui.Components.tp(f4Var);
                tpVar.f30873c = org.telegram.ui.ActionBar.k6.i1() ? 0 : 2;
                arrayList.add(tpVar);
            }
            spVar.d = arrayList;
            spVar.l();
        }
        a();
        c();
        updateColors();
        int i16 = this.f42492r;
        if (i16 >= 0 && (b0Var = this.f42488b) != null) {
            b0Var.h1(i16, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10;
        int i11;
        this.f42495x = org.telegram.ui.ActionBar.k6.I;
        this.f42496y = org.telegram.ui.ActionBar.k6.i1();
        int i12 = 2;
        int i13 = this.f42493s;
        if (i13 != 0 && i13 != -1) {
            if (org.telegram.ui.ActionBar.k6.I.m().equals("Blue")) {
                this.v = 0;
            } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Day")) {
                this.v = 1;
            } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Night")) {
                this.v = 2;
            } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Dark Blue")) {
                this.v = 3;
            } else {
                if (org.telegram.ui.ActionBar.k6.i1() && ((i11 = this.v) == 2 || i11 == 3)) {
                    this.v = 0;
                }
                if (!org.telegram.ui.ActionBar.k6.i1() && ((i10 = this.v) == 0 || i10 == 1)) {
                    this.v = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.k6.i1()) {
                i12 = 0;
            }
            this.v = i12;
        }
        org.telegram.ui.Components.sp spVar = this.f42489c;
        if (spVar.d != null) {
            for (int i14 = 0; i14 < spVar.d.size(); i14++) {
                ((org.telegram.ui.Components.tp) spVar.d.get(i14)).f30873c = this.v;
            }
            spVar.q(0, spVar.d.size());
        }
        c();
    }

    public final void b() {
        boolean z10;
        int i10;
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f42494w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        wa1 wa1Var = this.f42487a;
        int i11 = this.f42493s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.b0 b0Var = this.f42488b;
            if (b0Var instanceof s4.s) {
                ((s4.s) b0Var).y1(i10);
            } else {
                wa1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new tu(0);
                this.f42488b = sVar;
                wa1Var.setLayoutManager(sVar);
            }
        } else if (this.f42488b == null) {
            getContext();
            s4.b0 b0Var2 = new s4.b0(0, false);
            this.f42488b = b0Var2;
            wa1Var.setLayoutManager(b0Var2);
        }
        this.f42494w = Boolean.valueOf(z10);
    }

    public final void c() {
        boolean z10;
        org.telegram.ui.Components.sp spVar = this.f42489c;
        if (spVar.d == null) {
            return;
        }
        this.f42492r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= spVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.e4) ((org.telegram.ui.Components.tp) spVar.d.get(i10)).f30871a.f20888f.get(this.v)).f20859b;
            org.telegram.ui.ActionBar.j6 i11 = ((org.telegram.ui.Components.tp) spVar.d.get(i10)).f30871a.i(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.k6.I.f21020a.equals(org.telegram.ui.ActionBar.k6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.e4) ((org.telegram.ui.Components.tp) spVar.d.get(i10)).f30871a.f20888f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.k6.I.f21025c0;
                    if (longSparseArray == null) {
                        this.f42492r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) longSparseArray.get(tL_theme.f20481id);
                    if (i6Var != null && i6Var.f20965a == org.telegram.ui.ActionBar.k6.I.Y) {
                        this.f42492r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (i11 != null) {
                    if (org.telegram.ui.ActionBar.k6.I.f21020a.equals(i11.m())) {
                        if (((org.telegram.ui.ActionBar.e4) ((org.telegram.ui.Components.tp) spVar.d.get(i10)).f30871a.f20888f.get(this.v)).e == org.telegram.ui.ActionBar.k6.I.Y) {
                            this.f42492r = i10;
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
        if (this.f42492r == -1 && this.f42493s != 3) {
            this.f42492r = spVar.d.size() - 1;
        }
        for (int i12 = 0; i12 < spVar.d.size(); i12++) {
            org.telegram.ui.Components.tp tpVar = (org.telegram.ui.Components.tp) spVar.d.get(i12);
            if (i12 == this.f42492r) {
                z10 = true;
            } else {
                z10 = false;
            }
            tpVar.d = z10;
        }
        spVar.E(this.f42492r);
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
        org.telegram.ui.ActionBar.j6 j6Var;
        org.telegram.ui.Components.xj0 xj0Var;
        int i10;
        int i11;
        if (this.f42489c != null && (j6Var = this.f42495x) != null && (j6Var != org.telegram.ui.ActionBar.k6.I || this.f42496y != org.telegram.ui.ActionBar.k6.i1())) {
            a();
            if (this.e != null && (xj0Var = this.d) != null) {
                if (!xj0Var.f32607k0) {
                    org.telegram.ui.Components.xj0 xj0Var2 = this.d;
                    if (org.telegram.ui.ActionBar.k6.i1()) {
                        i11 = 0;
                    } else {
                        i11 = this.d.e[0] - 1;
                    }
                    xj0Var2.M(i11);
                }
                org.telegram.ui.Cells.r8 r8Var = this.e;
                if (org.telegram.ui.ActionBar.k6.i1()) {
                    i10 = R.string.SettingsSwitchToNightMode;
                } else {
                    i10 = R.string.SettingsSwitchToDayMode;
                }
                r8Var.p(LocaleController.getString(i10), this.d, true);
                this.e.f23116w += 2;
            }
        }
        int i12 = this.f42493s;
        if (i12 == 0 || i12 == -1) {
            org.telegram.ui.Components.xj0 xj0Var3 = this.d;
            if (xj0Var3 != null) {
                xj0Var3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.e;
            if (r8Var2 != null) {
                org.telegram.ui.ActionBar.k6.E1(r8Var2.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21273i6, false), true);
                this.e.g(-1, org.telegram.ui.ActionBar.k6.q6);
            }
            if (this.f42490f != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21273i6, false);
                org.telegram.ui.Cells.y yVar = this.E;
                if (com.google.android.gms.internal.play_billing.k3.s(yVar) && this.f42490f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.F) {
                        this.F = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.r8 r8Var3 = this.f42490f;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(x02, x03);
                    this.E = h02;
                    r8Var3.setBackground(h02);
                    this.F = x03;
                }
                org.telegram.ui.Cells.r8 r8Var4 = this.f42490f;
                int i13 = org.telegram.ui.ActionBar.k6.q6;
                r8Var4.g(i13, i13);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
