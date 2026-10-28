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
public final class tu extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.Cells.y E;
    public int F;
    public final bb1 f43776a;
    public s4.c0 f43777b;
    public final org.telegram.ui.Components.xp f43778c;
    public final org.telegram.ui.Components.yj0 d;
    public final org.telegram.ui.Cells.v8 e;
    public final org.telegram.ui.Cells.v8 f43779f;
    public ValueAnimator h;
    public int f43780n;
    public int f43781r;
    public final int f43782s;
    public int v;
    public Boolean f43783w;
    public org.telegram.ui.ActionBar.x6 f43784x;
    public boolean f43785y;

    public tu(int i10, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context);
        int i11;
        s4.c0 c0Var;
        this.f43777b = null;
        this.f43781r = -1;
        this.f43783w = null;
        this.f43782s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        int currentAccount = r2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(currentAccount, 0L, null, i11);
        this.f43778c = xpVar;
        bb1 bb1Var = new bb1(getContext(), 8, null);
        this.f43776a = bb1Var;
        bb1Var.setAdapter(xpVar);
        bb1Var.setSelectorDrawableColor(0);
        bb1Var.setClipChildren(false);
        bb1Var.setClipToPadding(false);
        bb1Var.setHasFixedSize(true);
        bb1Var.setItemAnimator(null);
        bb1Var.setNestedScrollingEnabled(false);
        b();
        bb1Var.setFocusable(false);
        bb1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        bb1Var.setOnItemClickListener(new di.x4(15, this, r2Var));
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(getContext(), null);
        c10Var.setViewType(14);
        c10Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(c10Var, org.telegram.ui.Components.kb1.h(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(bb1Var, org.telegram.ui.Components.kb1.h(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(c10Var, org.telegram.ui.Components.kb1.h(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(bb1Var, org.telegram.ui.Components.kb1.h(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        bb1Var.setEmptyView(c10Var);
        bb1Var.W1 = true;
        bb1Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = yj0Var;
            yj0Var.h = true;
            yj0Var.Z = true;
            yj0Var.o();
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            this.e = v8Var;
            int i12 = org.telegram.ui.ActionBar.y6.f23449i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 2, -1);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
            v8Var.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(v8Var, g02, null, N, null);
            addView(v8Var, org.telegram.ui.Components.kb1.g(-2.0f, -1));
            org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(context);
            this.f43779f = v8Var2;
            v8Var2.o(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(v8Var2, org.telegram.ui.Components.kb1.g(-2.0f, -1));
            v8Var.setOnClickListener(new ru(this, context, r2Var));
            yj0Var.h = true;
            v8Var2.setOnClickListener(new a(r2Var, 18));
            if (!org.telegram.ui.ActionBar.y6.i1()) {
                yj0Var.M(yj0Var.e[0] - 1);
                v8Var.p(LocaleController.getString(R.string.SettingsSwitchToDayMode), yj0Var, true);
                v8Var.f25602w += 2;
            } else {
                v8Var.p(LocaleController.getString(R.string.SettingsSwitchToNightMode), yj0Var, true);
                v8Var.f25602w += 2;
            }
        }
        if (!MediaDataController.getInstance(r2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(r2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.h4 h4Var = new org.telegram.ui.ActionBar.h4(r2Var.getCurrentAccount());
                h4Var.e = "🎨";
                h4Var.f22685c = hg.b.d("🎨");
                h4Var.d = TLRPC.ChatTheme.ofEmoticon(h4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i14 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.y6.P0(string) != null) {
                    if (i13 == -1) {
                        i13 = org.telegram.ui.ActionBar.y6.P0(string).f23261f0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.x6 P0 = org.telegram.ui.ActionBar.y6.P0(string);
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
                if (string2 != null && org.telegram.ui.ActionBar.y6.P0(string2) != null) {
                    if (i15 == -1) {
                        i15 = org.telegram.ui.ActionBar.y6.P0(str).f23261f0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.x6 P02 = org.telegram.ui.ActionBar.y6.P0(string2);
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
                org.telegram.ui.ActionBar.g4 g4Var = new org.telegram.ui.ActionBar.g4();
                g4Var.f22651a = org.telegram.ui.ActionBar.y6.P0(str);
                g4Var.e = i14;
                h4Var.f22686f.add(g4Var);
                h4Var.f22686f.add(null);
                org.telegram.ui.ActionBar.g4 g4Var2 = new org.telegram.ui.ActionBar.g4();
                g4Var2.f22651a = org.telegram.ui.ActionBar.y6.P0(str2);
                g4Var2.e = i15;
                h4Var.f22686f.add(g4Var2);
                h4Var.f22686f.add(null);
                h4Var.m(r2Var.getCurrentAccount());
                org.telegram.ui.Components.yp ypVar = new org.telegram.ui.Components.yp(h4Var);
                ypVar.f35126c = org.telegram.ui.ActionBar.y6.i1() ? 0 : 2;
                arrayList.add(ypVar);
            }
            xpVar.d = arrayList;
            xpVar.l();
        }
        a();
        c();
        updateColors();
        int i16 = this.f43781r;
        if (i16 >= 0 && (c0Var = this.f43777b) != null) {
            c0Var.h1(i16, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10;
        int i11;
        this.f43784x = org.telegram.ui.ActionBar.y6.I;
        this.f43785y = org.telegram.ui.ActionBar.y6.i1();
        int i12 = 2;
        int i13 = this.f43782s;
        if (i13 != 0 && i13 != -1) {
            if (org.telegram.ui.ActionBar.y6.I.m().equals("Blue")) {
                this.v = 0;
            } else if (org.telegram.ui.ActionBar.y6.I.m().equals("Day")) {
                this.v = 1;
            } else if (org.telegram.ui.ActionBar.y6.I.m().equals("Night")) {
                this.v = 2;
            } else if (org.telegram.ui.ActionBar.y6.I.m().equals("Dark Blue")) {
                this.v = 3;
            } else {
                if (org.telegram.ui.ActionBar.y6.i1() && ((i11 = this.v) == 2 || i11 == 3)) {
                    this.v = 0;
                }
                if (!org.telegram.ui.ActionBar.y6.i1() && ((i10 = this.v) == 0 || i10 == 1)) {
                    this.v = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.y6.i1()) {
                i12 = 0;
            }
            this.v = i12;
        }
        org.telegram.ui.Components.xp xpVar = this.f43778c;
        if (xpVar.d != null) {
            for (int i14 = 0; i14 < xpVar.d.size(); i14++) {
                ((org.telegram.ui.Components.yp) xpVar.d.get(i14)).f35126c = this.v;
            }
            xpVar.q(0, xpVar.d.size());
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
        Boolean bool = this.f43783w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        bb1 bb1Var = this.f43776a;
        int i11 = this.f43782s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.c0 c0Var = this.f43777b;
            if (c0Var instanceof s4.t) {
                ((s4.t) c0Var).z1(i10);
            } else {
                bb1Var.setHasFixedSize(false);
                getContext();
                s4.t tVar = new s4.t(i10);
                tVar.O = new su(0);
                this.f43777b = tVar;
                bb1Var.setLayoutManager(tVar);
            }
        } else if (this.f43777b == null) {
            getContext();
            s4.c0 c0Var2 = new s4.c0(0, false);
            this.f43777b = c0Var2;
            bb1Var.setLayoutManager(c0Var2);
        }
        this.f43783w = Boolean.valueOf(z10);
    }

    public final void c() {
        boolean z10;
        org.telegram.ui.Components.xp xpVar = this.f43778c;
        if (xpVar.d == null) {
            return;
        }
        this.f43781r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= xpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.g4) ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).f35124a.f22686f.get(this.v)).f22652b;
            org.telegram.ui.ActionBar.x6 i11 = ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).f35124a.i(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.y6.I.f23252a.equals(org.telegram.ui.ActionBar.y6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.g4) ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).f35124a.f22686f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.y6.I.f23257c0;
                    if (longSparseArray == null) {
                        this.f43781r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) longSparseArray.get(tL_theme.f22167id);
                    if (w6Var != null && w6Var.f23216a == org.telegram.ui.ActionBar.y6.I.Y) {
                        this.f43781r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (i11 != null) {
                    if (org.telegram.ui.ActionBar.y6.I.f23252a.equals(i11.m())) {
                        if (((org.telegram.ui.ActionBar.g4) ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).f35124a.f22686f.get(this.v)).e == org.telegram.ui.ActionBar.y6.I.Y) {
                            this.f43781r = i10;
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
        if (this.f43781r == -1 && this.f43782s != 3) {
            this.f43781r = xpVar.d.size() - 1;
        }
        for (int i12 = 0; i12 < xpVar.d.size(); i12++) {
            org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) xpVar.d.get(i12);
            if (i12 == this.f43781r) {
                z10 = true;
            } else {
                z10 = false;
            }
            ypVar.d = z10;
        }
        xpVar.E(this.f43781r);
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
        org.telegram.ui.ActionBar.x6 x6Var;
        org.telegram.ui.Components.yj0 yj0Var;
        int i10;
        int i11;
        if (this.f43778c != null && (x6Var = this.f43784x) != null && (x6Var != org.telegram.ui.ActionBar.y6.I || this.f43785y != org.telegram.ui.ActionBar.y6.i1())) {
            a();
            if (this.e != null && (yj0Var = this.d) != null) {
                if (!yj0Var.f35080k0) {
                    org.telegram.ui.Components.yj0 yj0Var2 = this.d;
                    if (org.telegram.ui.ActionBar.y6.i1()) {
                        i11 = 0;
                    } else {
                        i11 = this.d.e[0] - 1;
                    }
                    yj0Var2.M(i11);
                }
                org.telegram.ui.Cells.v8 v8Var = this.e;
                if (org.telegram.ui.ActionBar.y6.i1()) {
                    i10 = R.string.SettingsSwitchToNightMode;
                } else {
                    i10 = R.string.SettingsSwitchToDayMode;
                }
                v8Var.p(LocaleController.getString(i10), this.d, true);
                this.e.f25602w += 2;
            }
        }
        int i12 = this.f43782s;
        if (i12 == 0 || i12 == -1) {
            org.telegram.ui.Components.yj0 yj0Var3 = this.d;
            if (yj0Var3 != null) {
                yj0Var3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23598q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.v8 v8Var2 = this.e;
            if (v8Var2 != null) {
                org.telegram.ui.ActionBar.y6.E1(v8Var2.getBackground(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23449i6, false), true);
                this.e.g(-1, org.telegram.ui.ActionBar.y6.f23598q6);
            }
            if (this.f43779f != null) {
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false);
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23449i6, false);
                org.telegram.ui.Cells.y yVar = this.E;
                if (c3.h0.t(yVar) && this.f43779f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.F) {
                        this.F = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.v8 v8Var3 = this.f43779f;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.y6.h0(x02, x03);
                    this.E = h02;
                    v8Var3.setBackground(h02);
                    this.F = x03;
                }
                org.telegram.ui.Cells.v8 v8Var4 = this.f43779f;
                int i13 = org.telegram.ui.ActionBar.y6.f23598q6;
                v8Var4.g(i13, i13);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
