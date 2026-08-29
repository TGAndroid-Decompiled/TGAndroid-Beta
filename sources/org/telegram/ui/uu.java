package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class uu extends LinearLayout {
    public final wa1 f43342a;
    public f2.j0 f43343b;
    public final org.telegram.ui.Components.ep f43344c;
    public final org.telegram.ui.Components.xi0 d;
    public final org.telegram.ui.Cells.m8 f43345e;
    public final org.telegram.ui.Cells.m8 f43346f;
    public ValueAnimator h;
    public int f43347n;
    public int f43348r;
    public final int f43349s;
    public int v;
    public Boolean f43350w;

    public uu(int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        int i11;
        f2.j0 j0Var;
        this.f43343b = null;
        this.f43348r = -1;
        this.f43350w = null;
        this.f43349s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, i7.f6.c(-2.0f, -1));
        int currentAccount = o2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.ep epVar = new org.telegram.ui.Components.ep(currentAccount, i11, null);
        this.f43344c = epVar;
        wa1 wa1Var = new wa1(getContext(), 7, null);
        this.f43342a = wa1Var;
        wa1Var.setAdapter(epVar);
        wa1Var.setSelectorDrawableColor(0);
        wa1Var.setClipChildren(false);
        wa1Var.setClipToPadding(false);
        wa1Var.setHasFixedSize(true);
        wa1Var.setItemAnimator(null);
        wa1Var.setNestedScrollingEnabled(false);
        c();
        wa1Var.setFocusable(false);
        wa1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        wa1Var.setOnItemClickListener(new eg.w0(16, this, o2Var));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(getContext(), null);
        p00Var.setViewType(14);
        p00Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(p00Var, i7.f6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(wa1Var, i7.f6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(p00Var, i7.f6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(wa1Var, i7.f6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        wa1Var.setEmptyView(p00Var);
        wa1Var.U1 = true;
        wa1Var.V1 = 0;
        if (i10 == 0) {
            int i12 = R.raw.sun_outline;
            org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(i12, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = xi0Var;
            xi0Var.h = true;
            xi0Var.W = true;
            xi0Var.m();
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
            this.f43345e = m8Var;
            m8Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 2, -1));
            m8Var.f24716w = 21;
            addView(m8Var, i7.f6.c(-2.0f, -1));
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context);
            this.f43346f = m8Var2;
            m8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(m8Var2, i7.f6.c(-2.0f, -1));
            m8Var.setOnClickListener(new tu(this, context, o2Var));
            xi0Var.h = true;
            m8Var2.setOnClickListener(new a(o2Var, 18));
            if (!org.telegram.ui.ActionBar.g6.f1()) {
                xi0Var.K(xi0Var.f34737e[0] - 1);
                m8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), xi0Var, true);
            } else {
                m8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), xi0Var, true);
            }
        }
        if (!MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(o2Var.getCurrentAccount());
                b4Var.f22765e = "🎨";
                b4Var.f22764c = qf.b.d("🎨");
                b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f22765e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i14 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.g6.N0(string) != null) {
                    if (i13 == -1) {
                        i13 = org.telegram.ui.ActionBar.g6.N0(string).f22944b0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.f6 N0 = org.telegram.ui.ActionBar.g6.N0(string);
                    if (N0 == null) {
                        string = "Blue";
                        i13 = 99;
                    } else {
                        i13 = N0.U;
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
                if (string2 != null && org.telegram.ui.ActionBar.g6.N0(string2) != null) {
                    if (i15 == -1) {
                        i15 = org.telegram.ui.ActionBar.g6.N0(str).f22944b0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.f6 N02 = org.telegram.ui.ActionBar.g6.N0(string2);
                    if (N02 == null) {
                        string2 = "Dark Blue";
                        i15 = 0;
                    } else {
                        i15 = N02.U;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i15 == -1) {
                    i15 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
                a4Var.f22730a = org.telegram.ui.ActionBar.g6.N0(str);
                a4Var.f22733e = i14;
                b4Var.f22766f.add(a4Var);
                b4Var.f22766f.add(null);
                org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
                a4Var2.f22730a = org.telegram.ui.ActionBar.g6.N0(str2);
                a4Var2.f22733e = i15;
                b4Var.f22766f.add(a4Var2);
                b4Var.f22766f.add(null);
                b4Var.n(o2Var.getCurrentAccount());
                org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(b4Var);
                fpVar.f28514c = org.telegram.ui.ActionBar.g6.f1() ? 0 : 2;
                arrayList.add(fpVar);
            }
            epVar.d = arrayList;
            epVar.l();
        }
        b();
        d();
        a();
        int i16 = this.f43348r;
        if (i16 >= 0 && (j0Var = this.f43343b) != null) {
            j0Var.h1(i16, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f43349s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                xi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.m8 m8Var = this.f43345e;
            if (m8Var != null) {
                org.telegram.ui.ActionBar.g6.B1(m8Var.getBackground(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), true);
                m8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
            }
            org.telegram.ui.Cells.m8 m8Var2 = this.f43346f;
            if (m8Var2 != null) {
                m8Var2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false)));
                int i11 = org.telegram.ui.ActionBar.g6.q6;
                m8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f43349s;
        if (i13 != 0 && i13 != -1) {
            if (org.telegram.ui.ActionBar.g6.I.m().equals("Blue")) {
                this.v = 0;
            } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Day")) {
                this.v = 1;
            } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Night")) {
                this.v = 2;
            } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Dark Blue")) {
                this.v = 3;
            } else {
                if (org.telegram.ui.ActionBar.g6.f1() && ((i11 = this.v) == 2 || i11 == 3)) {
                    this.v = 0;
                }
                if (!org.telegram.ui.ActionBar.g6.f1() && ((i10 = this.v) == 0 || i10 == 1)) {
                    this.v = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.g6.f1()) {
                i12 = 0;
            }
            this.v = i12;
        }
        org.telegram.ui.Components.ep epVar = this.f43344c;
        if (epVar.d != null) {
            for (int i14 = 0; i14 < epVar.d.size(); i14++) {
                ((org.telegram.ui.Components.fp) epVar.d.get(i14)).f28514c = this.v;
            }
            epVar.q(0, epVar.d.size());
        }
        d();
    }

    public final void c() {
        boolean z10;
        int i10;
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f43350w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        wa1 wa1Var = this.f43342a;
        int i11 = this.f43349s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            f2.j0 j0Var = this.f43343b;
            if (j0Var instanceof f2.w) {
                ((f2.w) j0Var).y1(i10);
            } else {
                wa1Var.setHasFixedSize(false);
                getContext();
                f2.w wVar = new f2.w(i10);
                wVar.O = new f2.t(1);
                this.f43343b = wVar;
                wa1Var.setLayoutManager(wVar);
            }
        } else if (this.f43343b == null) {
            getContext();
            f2.j0 j0Var2 = new f2.j0(0, false);
            this.f43343b = j0Var2;
            wa1Var.setLayoutManager(j0Var2);
        }
        this.f43350w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.ep epVar = this.f43344c;
        if (epVar.d == null) {
            return;
        }
        this.f43348r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= epVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.b4 b4Var = ((org.telegram.ui.Components.fp) epVar.d.get(i10)).f28512a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.a4) b4Var.f22766f.get(this.v)).f22731b;
            org.telegram.ui.ActionBar.f6 j10 = ((org.telegram.ui.Components.fp) epVar.d.get(i10)).f28512a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.b4 b4Var2 = ((org.telegram.ui.Components.fp) epVar.d.get(i10)).f28512a;
                if (org.telegram.ui.ActionBar.g6.I.f22941a.equals(org.telegram.ui.ActionBar.g6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.a4) b4Var2.f22766f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.g6.I.Y;
                    if (longSparseArray == null) {
                        this.f43348r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) longSparseArray.get(tL_theme.f22529id);
                    if (e6Var != null && e6Var.f22902a == org.telegram.ui.ActionBar.g6.I.U) {
                        this.f43348r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (j10 != null) {
                    if (org.telegram.ui.ActionBar.g6.I.f22941a.equals(j10.m())) {
                        org.telegram.ui.ActionBar.b4 b4Var3 = ((org.telegram.ui.Components.fp) epVar.d.get(i10)).f28512a;
                        if (((org.telegram.ui.ActionBar.a4) b4Var3.f22766f.get(this.v)).f22733e == org.telegram.ui.ActionBar.g6.I.U) {
                            this.f43348r = i10;
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
        if (this.f43348r == -1 && this.f43349s != 3) {
            this.f43348r = epVar.d.size() - 1;
        }
        for (int i11 = 0; i11 < epVar.d.size(); i11++) {
            org.telegram.ui.Components.fp fpVar = (org.telegram.ui.Components.fp) epVar.d.get(i11);
            if (i11 == this.f43348r) {
                z10 = true;
            } else {
                z10 = false;
            }
            fpVar.d = z10;
        }
        epVar.E(this.f43348r);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    @Override
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        a();
    }
}
