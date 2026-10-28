package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;
public final class un implements org.telegram.ui.ActionBar.u6, org.telegram.ui.Components.kc0 {
    public int A;
    public boolean B;
    public boolean C;
    public final wn F;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.h4 f44059f;
    public TLRPC.WallPaper f44060g;
    public Drawable h;
    public ValueAnimator f44061i;
    public Bitmap f44062j;
    public Bitmap f44063k;
    public Canvas f44065m;
    public BitmapShader f44066n;
    public BitmapShader f44067o;
    public boolean f44068p;
    public AnimatorSet f44070r;
    public org.telegram.ui.ActionBar.l5 f44071s;
    public org.telegram.ui.ActionBar.l5 f44072t;
    public int f44073u;
    public int v;
    public int f44074w;
    public int f44075x;
    public int f44076y;
    public Bitmap f44077z;
    public final HashMap f44056a = new HashMap();
    public final HashMap f44057b = new HashMap();
    public final Matrix f44058c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f44064l = new Paint();
    public final Rect D = new Rect();
    public final Rect E = new Rect();
    public boolean f44069q = org.telegram.ui.ActionBar.y6.I.q();

    public un(wn wnVar) {
        int i10;
        int i11;
        this.F = wnVar;
        if (p(false)) {
            i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            this.f44059f = ChatThemeController.getInstance(i10).getDialogTheme(wnVar.f45168j6);
            i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(wnVar.f45168j6);
            this.f44060g = dialogWallpaper;
            org.telegram.ui.ActionBar.h4 h4Var = this.f44059f;
            if (h4Var != null || dialogWallpaper != null) {
                r(h4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ag.c(27));
            }
        }
        if (ThemeEditorView.f26327p == null) {
            org.telegram.ui.ActionBar.y6.q1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ag.c(27));
    }

    @Override
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.f44069q;
        }
        return org.telegram.ui.ActionBar.y6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.f44062j) != null && (bitmapShader = this.f44066n) != null) {
            boolean z10 = this.f44068p;
            Matrix matrix = this.f44058c;
            if (z10) {
                org.telegram.ui.ActionBar.y6.r(this.f44063k, this.f44067o, matrix, i10, i11, f7, f10);
                return;
            } else {
                org.telegram.ui.ActionBar.y6.r(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
                return;
            }
        }
        org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.y6.f23690v3;
    }

    @Override
    public final Paint d(String str) {
        if (this.f44059f == null && this.h == null) {
            return null;
        }
        return (Paint) this.f44057b.get(str);
    }

    @Override
    public final int e(int i10) {
        return g(i10);
    }

    @Override
    public final boolean f() {
        if (this.h != null) {
            if (this.f44066n != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.y6.c1();
    }

    @Override
    public final int g(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f44059f == null) {
            return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.y6.rl.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f44056a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    @Override
    public final void h(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override
    public final int i(int i10) {
        return j(i10, false);
    }

    public final int j(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f44059f == null && this.h == null) {
            return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    public final org.telegram.ui.ActionBar.h4 k() {
        return this.f44059f;
    }

    public final Drawable l() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.y6.t0();
    }

    public final void m() {
        Drawable l5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.y6.ml.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -2061232504:
                    if (str.equals("drawableMsgIn")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -2005320132:
                    if (str.equals("drawableMsgInMedia")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1656383241:
                    if (str.equals("drawableMsgInMediaSelected")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1451465639:
                    if (str.equals("drawableMsgOutMedia")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1084641786:
                    if (str.equals("drawableMsgOutSelected")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -8170988:
                    if (str.equals("drawableMsgOutMediaSelected")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 300508483:
                    if (str.equals("drawableMsgInSelected")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 526307915:
                    if (str.equals("drawableMsgOut")) {
                        c10 = 7;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    l5Var = new org.telegram.ui.ActionBar.l5(0, false, false, this);
                    break;
                case 1:
                    l5Var = new org.telegram.ui.ActionBar.l5(1, false, false, this);
                    break;
                case 2:
                    l5Var = new org.telegram.ui.ActionBar.l5(1, false, true, this);
                    break;
                case 3:
                    l5Var = new org.telegram.ui.ActionBar.l5(1, true, false, this);
                    break;
                case 4:
                    l5Var = new org.telegram.ui.ActionBar.l5(0, true, true, this);
                    break;
                case 5:
                    l5Var = new org.telegram.ui.ActionBar.l5(1, true, true, this);
                    break;
                case 6:
                    l5Var = new org.telegram.ui.ActionBar.l5(0, false, true, this);
                    break;
                case 7:
                    l5Var = new org.telegram.ui.ActionBar.l5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        l5Var = constantState.newDrawable().mutate();
                    } else {
                        l5Var = null;
                    }
                    if (l5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.y6.nl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.y6.z1(g(intValue), l5Var);
                            break;
                        }
                    }
                    break;
            }
            if (l5Var != null) {
                this.f44056a.put((String) entry.getKey(), l5Var);
            }
        }
    }

    public final void n() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.y6.ol.entrySet()) {
            Paint paint2 = (Paint) entry.getValue();
            if (paint2 instanceof TextPaint) {
                paint = new TextPaint();
                paint.setTextSize(paint2.getTextSize());
                paint.setTypeface(paint2.getTypeface());
            } else {
                paint = new Paint();
            }
            if ((paint2.getFlags() & 1) != 0) {
                paint.setFlags(1);
            }
            int intValue = ((Integer) org.telegram.ui.ActionBar.y6.pl.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(g(intValue));
            }
            this.f44057b.put((String) entry.getKey(), paint);
        }
    }

    public final void o(android.graphics.drawable.Drawable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.o(android.graphics.drawable.Drawable):void");
    }

    public final boolean p(boolean z10) {
        TLRPC.User user;
        wn wnVar = this.F;
        if (wnVar.h == null) {
            if (z10) {
                if (wnVar.e == null && (user = wnVar.f45113f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void q(org.telegram.ui.ActionBar.h4 h4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.j5 j5Var;
        boolean z12;
        hg.b bVar;
        hg.b bVar2;
        org.telegram.ui.ActionBar.x6 C0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int j10;
        int j11;
        int j12;
        org.telegram.ui.ActionBar.j5 j5Var2;
        int x02;
        int x03;
        int x04;
        int x05;
        wn wnVar = this.F;
        j5Var = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
        if (j5Var != null && wnVar.f45283sa == null) {
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = this.f44069q;
            }
            if (h4Var != null) {
                bVar = h4Var.f22685c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.h4 h4Var2 = this.f44059f;
            if (h4Var2 != null) {
                bVar2 = h4Var2.f22685c;
            } else {
                bVar2 = null;
            }
            TLRPC.WallPaper wallPaper2 = this.f44060g;
            if (!z11) {
                if (p(false)) {
                    if (hg.b.a(bVar2, bVar) && this.f44069q == z12 && ChatThemeController.equals(wallPaper, wallPaper2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f44069q = z12;
            if (z12) {
                C0 = org.telegram.ui.ActionBar.y6.J;
            } else {
                C0 = org.telegram.ui.ActionBar.y6.C0();
            }
            org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(C0, C0.Y, C0.q(), !z10);
            org.telegram.ui.ActionBar.h4 h4Var3 = this.f44059f;
            int i10 = -1;
            if (h4Var3 == null && this.f44060g == null) {
                Drawable t02 = org.telegram.ui.ActionBar.y6.t0();
                this.B = t02 instanceof org.telegram.ui.Components.vc0;
                o(t02);
                if (this.B) {
                    x02 = -1;
                } else {
                    x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23454ic, false);
                }
                this.f44073u = x02;
                if (this.B) {
                    x03 = -1;
                } else {
                    x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23471jc, false);
                }
                this.v = x03;
                if (this.B) {
                    x04 = -1;
                } else {
                    x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23471jc, false);
                }
                this.f44074w = x04;
                if (this.B) {
                    x05 = -1;
                } else {
                    x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23491kc, false);
                }
                this.f44075x = x05;
            } else {
                if (this.B) {
                    Drawable drawable = this.h;
                    if (drawable instanceof org.telegram.ui.Components.vc0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.vc0) drawable).f33688k;
                        this.f44077z = bitmap;
                        if (h4Var3 != null) {
                            TLRPC.ChatTheme chatTheme = h4Var3.d;
                            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    if (tL_starGiftUnique != null && this.f44069q) {
                                        this.f44077z = Bitmap.createBitmap(bitmap);
                                        new Canvas(this.f44077z).drawColor(-870178270);
                                    }
                                }
                            }
                            tL_starGiftUnique = null;
                            if (tL_starGiftUnique != null) {
                                this.f44077z = Bitmap.createBitmap(bitmap);
                                new Canvas(this.f44077z).drawColor(-870178270);
                            }
                        }
                    }
                }
                Drawable drawable2 = this.h;
                if (drawable2 != null) {
                    o(drawable2);
                }
            }
            this.f44076y = this.A;
            if (this.B) {
                j10 = -1;
            } else {
                j10 = j(org.telegram.ui.ActionBar.y6.f23454ic, true);
            }
            this.f44073u = j10;
            if (this.B) {
                j11 = -1;
            } else {
                j11 = j(org.telegram.ui.ActionBar.y6.f23471jc, true);
            }
            this.v = j11;
            if (this.B) {
                j12 = -1;
            } else {
                j12 = j(org.telegram.ui.ActionBar.y6.f23471jc, true);
            }
            this.f44074w = j12;
            if (!this.B) {
                i10 = j(org.telegram.ui.ActionBar.y6.f23491kc, true);
            }
            this.f44075x = i10;
            if (h4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.h)[0];
                m();
                n();
            }
            i5Var.f22722f = false;
            if (wnVar.f45168j6 < 0) {
                i5Var.f22723g = false;
            }
            i5Var.h = new bi.s9(this, h4Var, wallPaper, z10, 13);
            if (z10) {
                i5Var.f22726k = new rn(this);
                i5Var.f22724i = new pn(this, 0);
                i5Var.f22725j = new pn(this, 1);
            } else {
                if (wnVar.f45163j1 != null) {
                    wnVar.vc();
                }
                i5Var.h.run();
            }
            i5Var.e = true;
            i5Var.f22728m = this;
            i5Var.f22727l = 250L;
            j5Var2 = ((org.telegram.ui.ActionBar.r2) wnVar).parentLayout;
            ((ActionBarLayout) j5Var2).f(i5Var, null);
        }
    }

    public final void r(org.telegram.ui.ActionBar.h4 h4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.vc0 vc0Var;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.w6 w6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        org.telegram.ui.ActionBar.x6 x6Var;
        boolean z11;
        Drawable drawable2;
        int i13;
        char c10;
        org.telegram.ui.ActionBar.x6 P0;
        int i14;
        org.telegram.ui.ActionBar.x6 P02;
        org.telegram.ui.ActionBar.h4 h4Var2 = h4Var;
        wn wnVar = this.F;
        if (wnVar.f45283sa != null) {
            return;
        }
        this.f44059f = h4Var2;
        this.f44060g = wallPaper;
        if (wnVar.fragmentView != null) {
            drawable = wnVar.f45163j1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.vc0) {
            vc0Var = (org.telegram.ui.Components.vc0) drawable;
        } else {
            vc0Var = null;
        }
        if (vc0Var != null) {
            i10 = vc0Var.f33686i;
        } else {
            i10 = 0;
        }
        if ((h4Var2 == null || h4Var2.f22683a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.y6.ul.indexOfKey(org.telegram.ui.ActionBar.y6.f23509lc);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.y6.ul.valueAt(indexOfKey2);
            } else {
                int i15 = org.telegram.ui.ActionBar.y6.f23293a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (h4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f44057b.clear();
            this.f44056a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.y6.t0();
            if (t02 instanceof org.telegram.ui.Components.vc0) {
                ((org.telegram.ui.Components.vc0) t02).u(i10);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.y6.I.q() == this.f44069q) {
                P02 = org.telegram.ui.ActionBar.y6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.y6.P0(string) != null && !org.telegram.ui.ActionBar.y6.P0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.y6.P0(string2) != null && org.telegram.ui.ActionBar.y6.P0(string2).q()) {
                    str = string2;
                }
                if (this.f44069q) {
                    P02 = org.telegram.ui.ActionBar.y6.P0(str);
                } else {
                    P02 = org.telegram.ui.ActionBar.y6.P0(str2);
                }
            }
            org.telegram.ui.ActionBar.y6.t(P02, false, this.f44069q);
            o(this.h);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.y6.J(ApplicationLoader.applicationContext, false);
        }
        if (h4Var2 != null) {
            i11 = ((org.telegram.ui.ActionBar.r2) this.F).currentAccount;
            boolean z12 = this.f44069q;
            ArrayList arrayList2 = h4Var2.f22686f;
            org.telegram.ui.ActionBar.x6 i16 = h4Var2.i(z12 ? 1 : 0);
            if (i16 == null) {
                int i17 = ((org.telegram.ui.ActionBar.g4) h4Var2.f22686f.get(z12 ? 1 : 0)).d;
                i12 = 0;
                org.telegram.ui.ActionBar.g4 g4Var = (org.telegram.ui.ActionBar.g4) ((hg.a) h4Var2.f22686f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = g4Var.b(i17);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.g4) h4Var2.f22686f.get(z12 ? 1 : 0)).f22652b;
                org.telegram.ui.ActionBar.x6 x6Var2 = new org.telegram.ui.ActionBar.x6(org.telegram.ui.ActionBar.y6.P0(org.telegram.ui.ActionBar.y6.r0(b10)));
                arrayList = arrayList2;
                w6Var = x6Var2.e(g4Var.a(), b10, tL_theme, i11, true);
                x6Var2.u(w6Var.f23216a);
                i16 = x6Var2;
            } else {
                i12 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i16.f23253a0;
                if (sparseArray != null) {
                    w6Var = (org.telegram.ui.ActionBar.w6) sparseArray.get(((org.telegram.ui.ActionBar.g4) arrayList.get(z12 ? 1 : 0)).e);
                } else {
                    w6Var = null;
                }
            }
            String[] strArr = new String[1];
            if (i16.f23254b != null) {
                sparseIntArray = org.telegram.ui.ActionBar.y6.S0(new File(i16.f23254b), null, strArr);
            } else {
                String str3 = i16.d;
                if (str3 != null) {
                    sparseIntArray = org.telegram.ui.ActionBar.y6.S0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((org.telegram.ui.ActionBar.g4) arrayList.get(z12 ? 1 : 0)).f22655g = strArr[i12];
            if (w6Var != null) {
                SparseIntArray clone = sparseIntArray.clone();
                w6Var.c(sparseIntArray, clone);
                hg.b bVar = h4Var2.f22685c;
                if (bVar != null && !TextUtils.isEmpty(bVar.f12829b) && (x6Var = w6Var.f23217b) != null && x6Var.f23254b == null && !x6Var.q()) {
                    org.telegram.ui.ActionBar.w6.g(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = org.telegram.ui.ActionBar.y6.rl;
            for (int i18 = i12; i18 < sparseIntArray2.size(); i18++) {
                int keyAt = sparseIntArray2.keyAt(i18);
                int valueAt = sparseIntArray2.valueAt(i18);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.y6.ql;
            for (int i19 = i12; i19 < iArr.length; i19++) {
                if (sparseIntArray.indexOfKey(i19) < 0) {
                    sparseIntArray.put(i19, iArr[i19]);
                }
            }
            this.d = sparseIntArray;
        } else {
            this.d = new SparseIntArray();
            i12 = 0;
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.f44060g))) {
            Drawable drawable3 = this.h;
            i14 = ((org.telegram.ui.ActionBar.r2) this.F).currentAccount;
            this.h = fi.o6.f(drawable3, i14, this.f44060g, this.f44069q);
        } else if (wallPaper != null) {
            this.h = zn.d(this.h, wallPaper, this.f44069q);
        } else {
            if (h4Var2.f22683a) {
                org.telegram.ui.ActionBar.x6 d = org.telegram.ui.ActionBar.h4.d(this.f44069q);
                i13 = ((org.telegram.ui.ActionBar.r2) this.F).currentAccount;
                org.telegram.ui.ActionBar.y6.H(d, h4Var2.g(i13, this.f44069q ? 1 : 0), ((org.telegram.ui.ActionBar.g4) h4Var2.f22686f.get(this.f44069q ? 1 : 0)).f22655g, i10, i12);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int g7 = g(org.telegram.ui.ActionBar.y6.Nd);
                int g10 = g(org.telegram.ui.ActionBar.y6.Od);
                int g11 = g(org.telegram.ui.ActionBar.y6.Pd);
                int g12 = g(org.telegram.ui.ActionBar.y6.Qd);
                org.telegram.ui.Components.vc0 vc0Var2 = new org.telegram.ui.Components.vc0();
                vc0Var2.s(vc0Var2.f33698u, h4Var2.j(this.f44069q ? 1 : 0).settings.intensity);
                TLRPC.Document e = h4Var2.e();
                if (vc0Var2.f33701y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    vc0Var2.f33701y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = vc0Var2.f33681c;
                    if (weakReference != null) {
                        vc0Var2.f33701y.setParentView((View) weakReference.get());
                    }
                    if (vc0Var2.T) {
                        vc0Var2.f33701y.onAttachedToWindow();
                    }
                }
                vc0Var2.f33701y.setImage(ImageLocation.getForDocument(e), "80_80", null, null, null, 0);
                vc0Var2.f33701y.setAutoRepeatCount(1);
                vc0Var2.f33701y.setAutoRepeat(1);
                vc0Var2.o(g7, g10, g11, g12, 0, true);
                vc0Var2.u(i10);
                int f7 = vc0Var2.f();
                boolean z13 = this.f44069q;
                m4.s0 s0Var = new m4.s0(21, this, vc0Var2);
                org.telegram.ui.ActionBar.g4 g4Var2 = (org.telegram.ui.ActionBar.g4) h4Var2.f22686f.get(z13 ? 1 : 0);
                if (g4Var2 != null && g4Var2.f22653c != null) {
                    long h = h4Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = g4Var2.f22653c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z11 = z13 ? 1 : 0;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i20);
                            int i21 = i20 + 1;
                            int i22 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i22;
                                i20 = i21;
                            }
                        }
                    } else {
                        z11 = z13 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new di.d1(s0Var, h, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                } else {
                    z11 = z13 ? 1 : 0;
                }
                h4Var2 = h4Var;
                h4Var2.n(this.f44069q ? 1 : 0, new org.telegram.messenger.o2(this, h4Var2, z11, vc0Var2, f7));
                drawable2 = vc0Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.f44070r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.f44070r = new AnimatorSet();
            if (vc0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new qn(vc0Var, 0));
                ofFloat.addListener(new sn(vc0Var));
                ofFloat.setDuration(200L);
                this.f44070r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof org.telegram.ui.Components.vc0) {
                org.telegram.ui.Components.vc0 vc0Var3 = (org.telegram.ui.Components.vc0) drawable4;
                vc0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new qn(vc0Var3, 1));
                ofFloat2.addListener(new tn(vc0Var3));
                ofFloat2.setDuration(250L);
                this.f44070r.playTogether(ofFloat2);
            }
            this.f44070r.start();
        }
        if (h4Var2 == null && this.F.f45168j6 >= 0) {
            if (org.telegram.ui.ActionBar.y6.I.q() == this.f44069q) {
                P0 = org.telegram.ui.ActionBar.y6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.y6.P0(string3) != null && !org.telegram.ui.ActionBar.y6.P0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.y6.P0(string4) != null && org.telegram.ui.ActionBar.y6.P0(string4).q()) {
                    str = string4;
                }
                if (this.f44069q) {
                    P0 = org.telegram.ui.ActionBar.y6.P0(str);
                } else {
                    P0 = org.telegram.ui.ActionBar.y6.P0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.y6.t(P0, false, this.f44069q);
        } else {
            c10 = 0;
        }
        int i23 = AndroidUtilities.calcDrawableColor(this.h)[c10];
        m();
        n();
        o(this.h);
        s(1.0f);
    }

    public final void s(float f7) {
        int j10;
        int j11;
        int j12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f44057b.isEmpty()) {
            Paint d = d("paintChatActionBackground");
            Paint d10 = d("paintChatActionBackgroundSelected");
            Paint d11 = d("paintChatMessageBackgroundSelected");
            int i10 = this.A;
            int i11 = -1;
            if (this.B) {
                j10 = -1;
            } else {
                j10 = j(org.telegram.ui.ActionBar.y6.f23454ic, true);
            }
            if (this.B) {
                j11 = -1;
            } else {
                j11 = j(org.telegram.ui.ActionBar.y6.f23471jc, true);
            }
            if (this.B) {
                j12 = -1;
            } else {
                j12 = j(org.telegram.ui.ActionBar.y6.f23471jc, true);
            }
            if (!this.B) {
                i11 = j(org.telegram.ui.ActionBar.y6.f23491kc, true);
            }
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                i10 = i0.a.f(f7, this.f44076y, i10);
                j10 = i0.a.f(f7, this.f44073u, j10);
                j11 = i0.a.f(f7, this.v, j11);
                j12 = i0.a.f(f7, this.f44074w, j12);
                i11 = i0.a.f(f7, this.f44075x, i11);
            }
            if (d != null && !this.B) {
                d.setColor(i10);
                d10.setColor(i10);
            }
            Paint d12 = d("paintChatActionText");
            if (d12 != null) {
                ((TextPaint) d12).linkColor = j11;
                d("paintChatActionText").setColor(j10);
                d("paintChatBotButton").setColor(j12);
            }
            org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.y6.z1(i11, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.y6.z1(i11, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.y6.z1(i11, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.y6.z1(i11, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.y6.z1(i11, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.y6.z1(i11, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.y6.z1(i11, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.y6.z1(i11, getDrawable("drawableShareIcon"));
            if (this.f44065m != null && (bitmap = this.f44063k) != null) {
                Rect rect = this.E;
                Rect rect2 = this.D;
                if (i12 != 0 && (bitmap2 = this.f44077z) != null) {
                    this.f44068p = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.f44077z.getHeight());
                    rect.set(0, 0, this.f44062j.getWidth(), this.f44062j.getHeight());
                    this.f44065m.drawBitmap(this.f44077z, rect2, rect, (Paint) null);
                    Paint paint = this.f44064l;
                    paint.setAlpha((int) (f7 * 255.0f));
                    rect2.set(0, 0, this.f44063k.getWidth(), this.f44063k.getHeight());
                    rect.set(0, 0, this.f44062j.getWidth(), this.f44062j.getHeight());
                    this.f44065m.drawBitmap(this.f44063k, rect2, rect, paint);
                    if (d != null) {
                        d.setShader(this.f44066n);
                        d10.setShader(this.f44066n);
                    }
                    if (d11 != null) {
                        d11.setShader(this.f44066n);
                        return;
                    }
                    return;
                }
                this.f44068p = true;
                rect2.set(0, 0, bitmap.getWidth(), this.f44063k.getHeight());
                rect.set(0, 0, this.f44062j.getWidth(), this.f44062j.getHeight());
                this.f44065m.drawBitmap(this.f44063k, rect2, rect, (Paint) null);
                if (d != null) {
                    d.setShader(this.f44067o);
                    d10.setShader(this.f44067o);
                }
                if (d11 != null) {
                    d11.setShader(this.f44067o);
                }
            }
        }
    }
}
