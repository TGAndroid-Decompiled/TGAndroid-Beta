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
public final class ru extends LinearLayout {
    public final sa1 f41281a;
    public s4.b0 f41282b;
    public final org.telegram.ui.Components.up f41283c;
    public final org.telegram.ui.Components.vj0 d;
    public final org.telegram.ui.Cells.q8 e;
    public final org.telegram.ui.Cells.q8 f41284f;
    public ValueAnimator h;
    public int f41285n;
    public int f41286r;
    public final int f41287s;
    public int v;
    public Boolean f41288w;

    public ru(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        int i11;
        s4.b0 b0Var;
        this.f41282b = null;
        this.f41286r = -1;
        this.f41288w = null;
        this.f41287s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.z5.c(-2.0f, -1));
        int currentAccount = n2Var.getCurrentAccount();
        if (i10 != 0 && i10 != -1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        org.telegram.ui.Components.up upVar = new org.telegram.ui.Components.up(currentAccount, 0L, null, i11);
        this.f41283c = upVar;
        sa1 sa1Var = new sa1(getContext(), 8, null);
        this.f41281a = sa1Var;
        sa1Var.setAdapter(upVar);
        sa1Var.setSelectorDrawableColor(0);
        sa1Var.setClipChildren(false);
        sa1Var.setClipToPadding(false);
        sa1Var.setHasFixedSize(true);
        sa1Var.setItemAnimator(null);
        sa1Var.setNestedScrollingEnabled(false);
        c();
        sa1Var.setFocusable(false);
        sa1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        sa1Var.setOnItemClickListener(new ci.y4(15, this, n2Var));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(getContext(), null);
        b10Var.setViewType(14);
        b10Var.setVisibility(0);
        if (i10 != 0 && i10 != -1) {
            frameLayout.addView(b10Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(sa1Var, w7.z5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(b10Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(sa1Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        sa1Var.setEmptyView(b10Var);
        sa1Var.W1 = true;
        sa1Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.vj0 vj0Var = new org.telegram.ui.Components.vj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = vj0Var;
            vj0Var.h = true;
            vj0Var.Z = true;
            vj0Var.o();
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            this.e = q8Var;
            q8Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21079i6, false), 2, -1));
            q8Var.f22789w = 21;
            addView(q8Var, w7.z5.c(-2.0f, -1));
            org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context);
            this.f41284f = q8Var2;
            q8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(q8Var2, w7.z5.c(-2.0f, -1));
            q8Var.setOnClickListener(new pu(this, context, n2Var));
            vj0Var.h = true;
            q8Var2.setOnClickListener(new a(n2Var, 18));
            if (!org.telegram.ui.ActionBar.h6.g1()) {
                vj0Var.M(vj0Var.e[0] - 1);
                q8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), vj0Var, true);
            } else {
                q8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), vj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4(n2Var.getCurrentAccount());
                c4Var.e = "🎨";
                c4Var.f20725c = gg.b.d("🎨");
                c4Var.d = TLRPC.ChatTheme.ofEmoticon(c4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string != null && org.telegram.ui.ActionBar.h6.O0(string) != null) {
                    if (i12 == -1) {
                        i12 = org.telegram.ui.ActionBar.h6.O0(string).f20890f0;
                    }
                } else {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.g6 O0 = org.telegram.ui.ActionBar.h6.O0(string);
                    if (O0 == null) {
                        i12 = 99;
                        string = "Blue";
                    } else {
                        i12 = O0.Y;
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
                if (string2 != null && org.telegram.ui.ActionBar.h6.O0(string2) != null) {
                    if (i14 == -1) {
                        i14 = org.telegram.ui.ActionBar.h6.O0(str).f20890f0;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.g6 O02 = org.telegram.ui.ActionBar.h6.O0(string2);
                    if (O02 == null) {
                        i14 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i14 = O02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4();
                b4Var.f20692a = org.telegram.ui.ActionBar.h6.O0(str);
                b4Var.e = i13;
                c4Var.f20726f.add(b4Var);
                c4Var.f20726f.add(null);
                org.telegram.ui.ActionBar.b4 b4Var2 = new org.telegram.ui.ActionBar.b4();
                b4Var2.f20692a = org.telegram.ui.ActionBar.h6.O0(str2);
                b4Var2.e = i14;
                c4Var.f20726f.add(b4Var2);
                c4Var.f20726f.add(null);
                c4Var.m(n2Var.getCurrentAccount());
                org.telegram.ui.Components.vp vpVar = new org.telegram.ui.Components.vp(c4Var);
                vpVar.f31851c = org.telegram.ui.ActionBar.h6.g1() ? 0 : 2;
                arrayList.add(vpVar);
            }
            upVar.d = arrayList;
            upVar.l();
        }
        b();
        d();
        a();
        int i15 = this.f41286r;
        if (i15 >= 0 && (b0Var = this.f41282b) != null) {
            b0Var.h1(i15, AndroidUtilities.dp(16.0f));
        }
    }

    public final void a() {
        int i10 = this.f41287s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.vj0 vj0Var = this.d;
            if (vj0Var != null) {
                vj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.q8 q8Var = this.e;
            if (q8Var != null) {
                org.telegram.ui.ActionBar.h6.C1(q8Var.getBackground(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21079i6, false), true);
                q8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
            }
            org.telegram.ui.Cells.q8 q8Var2 = this.f41284f;
            if (q8Var2 != null) {
                q8Var2.setBackground(org.telegram.ui.ActionBar.h6.h0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21079i6, false)));
                int i11 = org.telegram.ui.ActionBar.h6.q6;
                q8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = 2;
        int i13 = this.f41287s;
        if (i13 != 0 && i13 != -1) {
            if (org.telegram.ui.ActionBar.h6.I.m().equals("Blue")) {
                this.v = 0;
            } else if (org.telegram.ui.ActionBar.h6.I.m().equals("Day")) {
                this.v = 1;
            } else if (org.telegram.ui.ActionBar.h6.I.m().equals("Night")) {
                this.v = 2;
            } else if (org.telegram.ui.ActionBar.h6.I.m().equals("Dark Blue")) {
                this.v = 3;
            } else {
                if (org.telegram.ui.ActionBar.h6.g1() && ((i11 = this.v) == 2 || i11 == 3)) {
                    this.v = 0;
                }
                if (!org.telegram.ui.ActionBar.h6.g1() && ((i10 = this.v) == 0 || i10 == 1)) {
                    this.v = 2;
                }
            }
        } else {
            if (org.telegram.ui.ActionBar.h6.g1()) {
                i12 = 0;
            }
            this.v = i12;
        }
        org.telegram.ui.Components.up upVar = this.f41283c;
        if (upVar.d != null) {
            for (int i14 = 0; i14 < upVar.d.size(); i14++) {
                ((org.telegram.ui.Components.vp) upVar.d.get(i14)).f31851c = this.v;
            }
            upVar.q(0, upVar.d.size());
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
        Boolean bool = this.f41288w;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        sa1 sa1Var = this.f41281a;
        int i11 = this.f41287s;
        if (i11 != 0 && i11 != -1) {
            if (z10) {
                i10 = 3;
            } else {
                i10 = 9;
            }
            s4.b0 b0Var = this.f41282b;
            if (b0Var instanceof s4.s) {
                ((s4.s) b0Var).y1(i10);
            } else {
                sa1Var.setHasFixedSize(false);
                getContext();
                s4.s sVar = new s4.s(i10);
                sVar.O = new qu(0);
                this.f41282b = sVar;
                sa1Var.setLayoutManager(sVar);
            }
        } else if (this.f41282b == null) {
            getContext();
            s4.b0 b0Var2 = new s4.b0(0, false);
            this.f41282b = b0Var2;
            sa1Var.setLayoutManager(b0Var2);
        }
        this.f41288w = Boolean.valueOf(z10);
    }

    public final void d() {
        boolean z10;
        org.telegram.ui.Components.up upVar = this.f41283c;
        if (upVar.d == null) {
            return;
        }
        this.f41286r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= upVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.vp) upVar.d.get(i10)).f31849a.f20726f.get(this.v)).f20693b;
            org.telegram.ui.ActionBar.g6 i11 = ((org.telegram.ui.Components.vp) upVar.d.get(i10)).f31849a.i(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.h6.I.f20881a.equals(org.telegram.ui.ActionBar.h6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.vp) upVar.d.get(i10)).f31849a.f20726f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.h6.I.f20886c0;
                    if (longSparseArray == null) {
                        this.f41286r = i10;
                        break;
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) longSparseArray.get(tL_theme.f20413id);
                    if (f6Var != null && f6Var.f20832a == org.telegram.ui.ActionBar.h6.I.Y) {
                        this.f41286r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (i11 != null) {
                    if (org.telegram.ui.ActionBar.h6.I.f20881a.equals(i11.m())) {
                        if (((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.vp) upVar.d.get(i10)).f31849a.f20726f.get(this.v)).e == org.telegram.ui.ActionBar.h6.I.Y) {
                            this.f41286r = i10;
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
        if (this.f41286r == -1 && this.f41287s != 3) {
            this.f41286r = upVar.d.size() - 1;
        }
        for (int i12 = 0; i12 < upVar.d.size(); i12++) {
            org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) upVar.d.get(i12);
            if (i12 == this.f41286r) {
                z10 = true;
            } else {
                z10 = false;
            }
            vpVar.d = z10;
        }
        upVar.E(this.f41286r);
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
