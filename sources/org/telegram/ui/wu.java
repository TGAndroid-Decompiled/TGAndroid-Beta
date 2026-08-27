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

public final class wu extends LinearLayout {

    public final ta1 f44188a;

    public f2.k0 f44189b;

    public final org.telegram.ui.Components.yo f44190c;
    public final org.telegram.ui.Components.oi0 d;

    public final org.telegram.ui.Cells.l8 f44191e;

    public final org.telegram.ui.Cells.l8 f44192f;
    public ValueAnimator h;

    public int f44193n;

    public int f44194r;

    public final int f44195s;
    public int v;

    public Boolean f44196w;

    public wu(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        f2.k0 k0Var;
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var = null;
        this.f44189b = null;
        this.f44194r = -1;
        this.f44196w = null;
        this.f44195s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, h7.z5.c(-2.0f, -1));
        org.telegram.ui.Components.yo yoVar = new org.telegram.ui.Components.yo(n2Var.getCurrentAccount(), (i10 == 0 || i10 == -1) ? 0 : 1, null);
        this.f44190c = yoVar;
        ta1 ta1Var = new ta1(getContext(), 7, c6Var);
        this.f44188a = ta1Var;
        ta1Var.setAdapter(yoVar);
        ta1Var.setSelectorDrawableColor(0);
        ta1Var.setClipChildren(false);
        ta1Var.setClipToPadding(false);
        ta1Var.setHasFixedSize(true);
        ta1Var.setItemAnimator(null);
        ta1Var.setNestedScrollingEnabled(false);
        c();
        ta1Var.setFocusable(false);
        ta1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ta1Var.setOnItemClickListener(new cg.x0(17, this, n2Var));
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(getContext(), null);
        h00Var.setViewType(14);
        h00Var.setVisibility(0);
        if (i10 == 0 || i10 == -1) {
            frameLayout.addView(h00Var, h7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(ta1Var, h7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(h00Var, h7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(ta1Var, h7.z5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        ta1Var.setEmptyView(h00Var);
        ta1Var.U1 = true;
        ta1Var.V1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.sun_outline, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = oi0Var;
            oi0Var.h = true;
            oi0Var.W = true;
            oi0Var.m();
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
            this.f44191e = l8Var;
            l8Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 2, -1));
            l8Var.f24636w = 21;
            addView(l8Var, h7.z5.c(-2.0f, -1));
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context);
            this.f44192f = l8Var2;
            l8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(l8Var2, h7.z5.c(-2.0f, -1));
            l8Var.setOnClickListener(new vu(this, context, n2Var));
            oi0Var.h = true;
            l8Var2.setOnClickListener(new a(n2Var, 18));
            if (org.telegram.ui.ActionBar.g6.f1()) {
                l8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), oi0Var, true);
            } else {
                oi0Var.K(oi0Var.f31312e[0] - 1);
                l8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), oi0Var, true);
            }
        }
        if (!MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(n2Var.getCurrentAccount());
                b4Var.f22783e = "🎨";
                b4Var.f22782c = of.b.d("🎨");
                b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.f22783e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i11 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i12 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.g6.N0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.f6 f6VarN0 = org.telegram.ui.ActionBar.g6.N0(string);
                    if (f6VarN0 == null) {
                        string = "Blue";
                        i11 = 99;
                    } else {
                        i11 = f6VarN0.U;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i11 == -1) {
                    i11 = org.telegram.ui.ActionBar.g6.N0(string).f22944b0;
                }
                if (i11 != -1) {
                    str = string;
                    i12 = i11;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.g6.N0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.f6 f6VarN1 = org.telegram.ui.ActionBar.g6.N0(string2);
                    if (f6VarN1 == null) {
                        string2 = "Dark Blue";
                        i13 = 0;
                    } else {
                        i13 = f6VarN1.U;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i13 == -1) {
                    i13 = org.telegram.ui.ActionBar.g6.N0(str).f22944b0;
                }
                if (i13 == -1) {
                    i13 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
                a4Var.f22710a = org.telegram.ui.ActionBar.g6.N0(str);
                a4Var.f22713e = i12;
                b4Var.f22784f.add(a4Var);
                b4Var.f22784f.add(null);
                org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
                a4Var2.f22710a = org.telegram.ui.ActionBar.g6.N0(str2);
                a4Var2.f22713e = i13;
                b4Var.f22784f.add(a4Var2);
                b4Var.f22784f.add(null);
                b4Var.n(n2Var.getCurrentAccount());
                org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(b4Var);
                zoVar.f35318c = org.telegram.ui.ActionBar.g6.f1() ? 0 : 2;
                arrayList.add(zoVar);
            }
            yoVar.d = arrayList;
            yoVar.l();
        }
        b();
        d();
        a();
        int i14 = this.f44194r;
        if (i14 < 0 || (k0Var = this.f44189b) == null) {
            return;
        }
        k0Var.h1(i14, AndroidUtilities.dp(16.0f));
    }

    public final void a() {
        int i10 = this.f44195s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.oi0 oi0Var = this.d;
            if (oi0Var != null) {
                oi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.l8 l8Var = this.f44191e;
            if (l8Var != null) {
                org.telegram.ui.ActionBar.g6.B1(l8Var.getBackground(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), true);
                l8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
            }
            org.telegram.ui.Cells.l8 l8Var2 = this.f44192f;
            if (l8Var2 != null) {
                l8Var2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false)));
                int i11 = org.telegram.ui.ActionBar.g6.q6;
                l8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = this.f44195s;
        if (i12 == 0 || i12 == -1) {
            this.v = org.telegram.ui.ActionBar.g6.f1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Blue")) {
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
        org.telegram.ui.Components.yo yoVar = this.f44190c;
        if (yoVar.d != null) {
            for (int i13 = 0; i13 < yoVar.d.size(); i13++) {
                ((org.telegram.ui.Components.zo) yoVar.d.get(i13)).f35318c = this.v;
            }
            yoVar.q(0, yoVar.d.size());
        }
        d();
    }

    public final void c() {
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.y > point.x;
        Boolean bool = this.f44196w;
        if (bool == null || bool.booleanValue() != z10) {
            ta1 ta1Var = this.f44188a;
            int i10 = this.f44195s;
            if (i10 != 0 && i10 != -1) {
                int i11 = z10 ? 3 : 9;
                f2.k0 k0Var = this.f44189b;
                if (k0Var instanceof f2.x) {
                    ((f2.x) k0Var).y1(i11);
                } else {
                    ta1Var.setHasFixedSize(false);
                    getContext();
                    f2.x xVar = new f2.x(i11);
                    xVar.O = new f2.u(1);
                    this.f44189b = xVar;
                    ta1Var.setLayoutManager(xVar);
                }
            } else if (this.f44189b == null) {
                getContext();
                f2.k0 k0Var2 = new f2.k0(0, false);
                this.f44189b = k0Var2;
                ta1Var.setLayoutManager(k0Var2);
            }
            this.f44196w = Boolean.valueOf(z10);
        }
    }

    public final void d() {
        org.telegram.ui.Components.yo yoVar = this.f44190c;
        if (yoVar.d == null) {
            return;
        }
        this.f44194r = -1;
        for (int i10 = 0; i10 < yoVar.d.size(); i10++) {
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.zo) yoVar.d.get(i10)).f35316a.f22784f.get(this.v)).f22711b;
            org.telegram.ui.ActionBar.f6 f6VarJ = ((org.telegram.ui.Components.zo) yoVar.d.get(i10)).f35316a.j(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.g6.I.f22941a.equals(org.telegram.ui.ActionBar.g6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.zo) yoVar.d.get(i10)).f35316a.f22784f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.g6.I.Y;
                    if (longSparseArray == null) {
                        this.f44194r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) longSparseArray.get(tL_theme.f22517id);
                    if (e6Var != null && e6Var.f22883a == org.telegram.ui.ActionBar.g6.I.U) {
                        this.f44194r = i10;
                        break;
                    }
                } else {
                    continue;
                }
            } else {
                if (f6VarJ == null) {
                    continue;
                } else if (org.telegram.ui.ActionBar.g6.I.f22941a.equals(f6VarJ.m())) {
                    if (((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.zo) yoVar.d.get(i10)).f35316a.f22784f.get(this.v)).f22713e == org.telegram.ui.ActionBar.g6.I.U) {
                        this.f44194r = i10;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (this.f44194r == -1 && this.f44195s != 3) {
            this.f44194r = yoVar.d.size() - 1;
        }
        int i11 = 0;
        while (i11 < yoVar.d.size()) {
            ((org.telegram.ui.Components.zo) yoVar.d.get(i11)).d = i11 == this.f44194r;
            i11++;
        }
        yoVar.E(this.f44194r);
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
