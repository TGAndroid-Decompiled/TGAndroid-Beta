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
public final class tu extends LinearLayout {
    public final va1 f43061a;
    public f2.m0 f43062b;
    public final org.telegram.ui.Components.ap f43063c;
    public final org.telegram.ui.Components.mi0 d;
    public final org.telegram.ui.Cells.p8 f43064e;
    public final org.telegram.ui.Cells.p8 f43065f;
    public ValueAnimator h;
    public int f43066n;
    public int f43067r;
    public final int f43068s;
    public int v;
    public Boolean f43069w;

    public tu(int i9, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        int i10;
        f2.m0 m0Var;
        this.f43062b = null;
        this.f43067r = -1;
        this.f43069w = null;
        this.f43068s = i9;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, g7.e6.c(-2.0f, -1));
        int currentAccount = o2Var.getCurrentAccount();
        if (i9 != 0 && i9 != -1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        org.telegram.ui.Components.ap apVar = new org.telegram.ui.Components.ap(currentAccount, i10, null);
        this.f43063c = apVar;
        va1 va1Var = new va1(getContext(), 8, null);
        this.f43061a = va1Var;
        va1Var.setAdapter(apVar);
        va1Var.setSelectorDrawableColor(0);
        va1Var.setClipChildren(false);
        va1Var.setClipToPadding(false);
        va1Var.setHasFixedSize(true);
        va1Var.setItemAnimator(null);
        va1Var.setNestedScrollingEnabled(false);
        c();
        va1Var.setFocusable(false);
        va1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        va1Var.setOnItemClickListener(new bg.b1(17, this, o2Var));
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(getContext(), null);
        e00Var.setViewType(14);
        e00Var.setVisibility(0);
        if (i9 != 0 && i9 != -1) {
            frameLayout.addView(e00Var, g7.e6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(va1Var, g7.e6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(e00Var, g7.e6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(va1Var, g7.e6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        va1Var.setEmptyView(e00Var);
        va1Var.U1 = true;
        va1Var.V1 = 0;
        if (i9 == 0) {
            int i11 = R.raw.sun_outline;
            org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(i11, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = mi0Var;
            mi0Var.h = true;
            mi0Var.W = true;
            mi0Var.m();
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            this.f43064e = p8Var;
            p8Var.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 2, -1));
            p8Var.f24880w = 21;
            addView(p8Var, g7.e6.c(-2.0f, -1));
            org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(context);
            this.f43065f = p8Var2;
            p8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(p8Var2, g7.e6.c(-2.0f, -1));
            p8Var.setOnClickListener(new su(this, context, o2Var));
            mi0Var.h = true;
            p8Var2.setOnClickListener(new a(o2Var, 18));
            if (!org.telegram.ui.ActionBar.f6.f1()) {
                mi0Var.K(mi0Var.f30847e[0] - 1);
                p8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), mi0Var, true);
            } else {
                p8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), mi0Var, true);
            }
        }
        if (!MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i9 == 0) {
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(o2Var.getCurrentAccount());
                b4Var.f22751e = "🎨";
                b4Var.f22750c = nf.b.d("🎨");
                b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f22751e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.f6.N0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.f6.N0(string).f22909b0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.e6 N0 = org.telegram.ui.ActionBar.f6.N0(string);
                    if (N0 == null) {
                        string = "Blue";
                        i12 = 99;
                    } else {
                        i12 = N0.U;
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
                if (string2 != null && org.telegram.ui.ActionBar.f6.N0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.f6.N0(str).f22909b0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.e6 N02 = org.telegram.ui.ActionBar.f6.N0(string2);
                    if (N02 == null) {
                        string2 = "Dark Blue";
                        i14 = 0;
                    } else {
                        i14 = N02.U;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
                a4Var.f22714a = org.telegram.ui.ActionBar.f6.N0(str);
                a4Var.f22717e = i13;
                b4Var.f22752f.add(a4Var);
                b4Var.f22752f.add(null);
                org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
                a4Var2.f22714a = org.telegram.ui.ActionBar.f6.N0(str2);
                a4Var2.f22717e = i14;
                b4Var.f22752f.add(a4Var2);
                b4Var.f22752f.add(null);
                b4Var.n(o2Var.getCurrentAccount());
                org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(b4Var);
                bpVar.f27263c = org.telegram.ui.ActionBar.f6.f1() ? 0 : 2;
                arrayList.add(bpVar);
            }
            apVar.d = arrayList;
            apVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f43067r;
        if (i15 >= 0 && (m0Var = this.f43062b) != null) {
            m0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i9 = this.f43068s;
        if (i9 == 0 || i9 == -1) {
            org.telegram.ui.Components.mi0 mi0Var = this.d;
            if (mi0Var != null) {
                mi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.p8 p8Var = this.f43064e;
            if (p8Var != null) {
                org.telegram.ui.ActionBar.f6.B1(p8Var.getBackground(), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), true);
                p8Var.e(-1, org.telegram.ui.ActionBar.f6.f23229q6);
            }
            org.telegram.ui.Cells.p8 p8Var2 = this.f43065f;
            if (p8Var2 != null) {
                p8Var2.setBackground(org.telegram.ui.ActionBar.f6.g0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false)));
                int i10 = org.telegram.ui.ActionBar.f6.f23229q6;
                p8Var2.e(i10, i10);
            }
        }
    }

    public final void b() {
        int i9;
        int i10;
        int i11 = 2;
        int i12 = this.f43068s;
        if (i12 != 0 && i12 != -1) {
            if (org.telegram.ui.ActionBar.f6.I.m().equals("Blue")) {
                this.v = 0;
            } else if (org.telegram.ui.ActionBar.f6.I.m().equals("Day")) {
                this.v = 1;
            } else if (org.telegram.ui.ActionBar.f6.I.m().equals("Night")) {
                this.v = 2;
            } else if (org.telegram.ui.ActionBar.f6.I.m().equals("Dark Blue")) {
                this.v = 3;
            } else {
                if (org.telegram.ui.ActionBar.f6.f1() && ((i10 = this.v) == 2 || i10 == 3)) {
                    this.v = 0;
                }
                if (!org.telegram.ui.ActionBar.f6.f1() && ((i9 = this.v) == 0 || i9 == 1)) {
                    this.v = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.f6.f1()) {
                i11 = 0;
            }
            this.v = i11;
        }
        org.telegram.ui.Components.ap apVar = this.f43063c;
        if (apVar.d != null) {
            for (int i13 = 0; i13 < apVar.d.size(); i13++) {
                ((org.telegram.ui.Components.bp) apVar.d.get(i13)).f27263c = this.v;
            }
            apVar.q(0, apVar.d.size());
        }
        d();
    }

    public final void c() {
        boolean z10;
        int i9;
        Point point = AndroidUtilities.displaySize;
        if (point.y > point.x) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f43069w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        va1 va1Var = this.f43061a;
        int i10 = this.f43068s;
        if (i10 != 0 && i10 != -1) {
            if (z10) {
                i9 = 3;
            } else {
                i9 = 9;
            }
            f2.m0 m0Var = this.f43062b;
            if (m0Var instanceof f2.y) {
                ((f2.y) m0Var).y1(i9);
            } else {
                va1Var.setHasFixedSize(false);
                getContext();
                f2.y yVar = new f2.y(i9);
                yVar.O = new f2.v(1);
                this.f43062b = yVar;
                va1Var.setLayoutManager(yVar);
            }
        } else if (this.f43062b == null) {
            getContext();
            f2.m0 m0Var2 = new f2.m0(0, false);
            this.f43062b = m0Var2;
            va1Var.setLayoutManager(m0Var2);
        }
        this.f43069w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.ap apVar = this.f43063c;
        if (apVar.d == null) {
            return;
        }
        this.f43067r = -1;
        int i9 = 0;
        while (true) {
            if (i9 >= apVar.d.size()) {
                break;
            }
            org.telegram.ui.ActionBar.b4 b4Var = ((org.telegram.ui.Components.bp) apVar.d.get(i9)).f27261a;
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.a4) b4Var.f22752f.get(this.v)).f22715b;
            org.telegram.ui.ActionBar.e6 j10 = ((org.telegram.ui.Components.bp) apVar.d.get(i9)).f27261a.j(this.v);
            if (tL_theme != null) {
                org.telegram.ui.ActionBar.b4 b4Var2 = ((org.telegram.ui.Components.bp) apVar.d.get(i9)).f27261a;
                if (org.telegram.ui.ActionBar.f6.I.f22906a.equals(org.telegram.ui.ActionBar.f6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.a4) b4Var2.f22752f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.f6.I.Y;
                    if (longSparseArray == null) {
                        this.f43067r = i9;
                        break;
                    }
                    org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) longSparseArray.get(tL_theme.f22517id);
                    if (d6Var != null && d6Var.f22866a == org.telegram.ui.ActionBar.f6.I.U) {
                        this.f43067r = i9;
                        break;
                    }
                } else {
                    continue;
                }
                i9++;
            } else {
                if (j10 != null) {
                    if (org.telegram.ui.ActionBar.f6.I.f22906a.equals(j10.m())) {
                        org.telegram.ui.ActionBar.b4 b4Var3 = ((org.telegram.ui.Components.bp) apVar.d.get(i9)).f27261a;
                        if (((org.telegram.ui.ActionBar.a4) b4Var3.f22752f.get(this.v)).f22717e == org.telegram.ui.ActionBar.f6.I.U) {
                            this.f43067r = i9;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i9++;
            }
        }
        if (this.f43067r == -1 && this.f43068s != 3) {
            this.f43067r = apVar.d.size() - 1;
        }
        for (int i10 = 0; i10 < apVar.d.size(); i10++) {
            org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) apVar.d.get(i10);
            if (i10 == this.f43067r) {
                z10 = true;
            } else {
                z10 = false;
            }
            bpVar.d = z10;
        }
        apVar.E(this.f43067r);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        c();
        super.onMeasure(i9, i10);
    }

    @Override
    public void setBackgroundColor(int i9) {
        super.setBackgroundColor(i9);
        a();
    }
}
