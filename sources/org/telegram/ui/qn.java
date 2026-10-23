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
public final class qn implements org.telegram.ui.ActionBar.g6, org.telegram.ui.Components.nc0 {
    public int A;
    public boolean B;
    public boolean C;
    public final sn F;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.f4 f40871f;
    public TLRPC.WallPaper f40872g;
    public Drawable h;
    public ValueAnimator f40873i;
    public Bitmap f40874j;
    public Bitmap f40875k;
    public Canvas f40877m;
    public BitmapShader f40878n;
    public BitmapShader f40879o;
    public boolean f40880p;
    public AnimatorSet f40882r;
    public org.telegram.ui.ActionBar.j5 f40883s;
    public org.telegram.ui.ActionBar.j5 f40884t;
    public int f40885u;
    public int v;
    public int f40886w;
    public int f40887x;
    public int f40888y;
    public Bitmap f40889z;
    public final HashMap f40868a = new HashMap();
    public final HashMap f40869b = new HashMap();
    public final Matrix f40870c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f40876l = new Paint();
    public final Rect D = new Rect();
    public final Rect E = new Rect();
    public boolean f40881q = org.telegram.ui.ActionBar.k6.I.q();

    public qn(sn snVar) {
        int i10;
        int i11;
        this.F = snVar;
        if (p(false)) {
            i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            this.f40871f = ChatThemeController.getInstance(i10).getDialogTheme(snVar.f41519f6);
            i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(snVar.f41519f6);
            this.f40872g = dialogWallpaper;
            org.telegram.ui.ActionBar.f4 f4Var = this.f40871f;
            if (f4Var != null || dialogWallpaper != null) {
                r(f4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ah.j(25));
            }
        }
        if (ThemeEditorView.f24532p == null) {
            org.telegram.ui.ActionBar.k6.q1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ah.j(25));
    }

    @Override
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.f40881q;
        }
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.f40874j) != null && (bitmapShader = this.f40878n) != null) {
            boolean z10 = this.f40880p;
            Matrix matrix = this.f40870c;
            if (z10) {
                org.telegram.ui.ActionBar.k6.r(this.f40875k, this.f40879o, matrix, i10, i11, f7, f10);
                return;
            } else {
                org.telegram.ui.ActionBar.k6.r(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
                return;
            }
        }
        org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.f21513v3;
    }

    @Override
    public final Paint d(String str) {
        if (this.f40871f == null && this.h == null) {
            return null;
        }
        return (Paint) this.f40869b.get(str);
    }

    @Override
    public final int e(int i10) {
        return g(i10);
    }

    @Override
    public final boolean f() {
        if (this.h != null) {
            if (this.f40878n != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.k6.c1();
    }

    @Override
    public final int g(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f40871f == null) {
            return org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.k6.rl.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i10, false);
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f40868a;
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
        if (this.f40871f == null && this.h == null) {
            return org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i10, false);
    }

    public final org.telegram.ui.ActionBar.f4 k() {
        return this.f40871f;
    }

    public final Drawable l() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.k6.t0();
    }

    public final void m() {
        Drawable j5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.k6.ml.entrySet()) {
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
                    j5Var = new org.telegram.ui.ActionBar.j5(0, false, false, this);
                    break;
                case 1:
                    j5Var = new org.telegram.ui.ActionBar.j5(1, false, false, this);
                    break;
                case 2:
                    j5Var = new org.telegram.ui.ActionBar.j5(1, false, true, this);
                    break;
                case 3:
                    j5Var = new org.telegram.ui.ActionBar.j5(1, true, false, this);
                    break;
                case 4:
                    j5Var = new org.telegram.ui.ActionBar.j5(0, true, true, this);
                    break;
                case 5:
                    j5Var = new org.telegram.ui.ActionBar.j5(1, true, true, this);
                    break;
                case 6:
                    j5Var = new org.telegram.ui.ActionBar.j5(0, false, true, this);
                    break;
                case 7:
                    j5Var = new org.telegram.ui.ActionBar.j5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        j5Var = constantState.newDrawable().mutate();
                    } else {
                        j5Var = null;
                    }
                    if (j5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.k6.nl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.k6.z1(g(intValue), j5Var);
                            break;
                        }
                    }
                    break;
            }
            if (j5Var != null) {
                this.f40868a.put((String) entry.getKey(), j5Var);
            }
        }
    }

    public final void n() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.k6.ol.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.k6.pl.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(g(intValue));
            }
            this.f40869b.put((String) entry.getKey(), paint);
        }
    }

    public final void o(android.graphics.drawable.Drawable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.o(android.graphics.drawable.Drawable):void");
    }

    public final boolean p(boolean z10) {
        TLRPC.User user;
        sn snVar = this.F;
        if (snVar.h == null) {
            if (z10) {
                if (snVar.e == null && (user = snVar.f41512f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void q(org.telegram.ui.ActionBar.f4 f4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.h5 h5Var;
        boolean z12;
        gg.b bVar;
        gg.b bVar2;
        org.telegram.ui.ActionBar.j6 C0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int j10;
        int j11;
        int j12;
        org.telegram.ui.ActionBar.h5 h5Var2;
        int x02;
        int x03;
        int x04;
        int x05;
        sn snVar = this.F;
        h5Var = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
        if (h5Var != null && snVar.f41633oa == null) {
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = this.f40881q;
            }
            if (f4Var != null) {
                bVar = f4Var.f20886c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.f4 f4Var2 = this.f40871f;
            if (f4Var2 != null) {
                bVar2 = f4Var2.f20886c;
            } else {
                bVar2 = null;
            }
            TLRPC.WallPaper wallPaper2 = this.f40872g;
            if (!z11) {
                if (p(false)) {
                    if (gg.b.a(bVar2, bVar) && this.f40881q == z12 && ChatThemeController.equals(wallPaper, wallPaper2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f40881q = z12;
            if (z12) {
                C0 = org.telegram.ui.ActionBar.k6.J;
            } else {
                C0 = org.telegram.ui.ActionBar.k6.C0();
            }
            org.telegram.ui.ActionBar.g5 g5Var = new org.telegram.ui.ActionBar.g5(C0, C0.Y, C0.q(), !z10);
            org.telegram.ui.ActionBar.f4 f4Var3 = this.f40871f;
            int i10 = -1;
            if (f4Var3 == null && this.f40872g == null) {
                Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
                this.B = t02 instanceof org.telegram.ui.Components.yc0;
                o(t02);
                if (this.B) {
                    x02 = -1;
                } else {
                    x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21277ic, false);
                }
                this.f40885u = x02;
                if (this.B) {
                    x03 = -1;
                } else {
                    x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21296jc, false);
                }
                this.v = x03;
                if (this.B) {
                    x04 = -1;
                } else {
                    x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21296jc, false);
                }
                this.f40886w = x04;
                if (this.B) {
                    x05 = -1;
                } else {
                    x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21316kc, false);
                }
                this.f40887x = x05;
            } else {
                if (this.B) {
                    Drawable drawable = this.h;
                    if (drawable instanceof org.telegram.ui.Components.yc0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.yc0) drawable).f32887k;
                        this.f40889z = bitmap;
                        if (f4Var3 != null) {
                            TLRPC.ChatTheme chatTheme = f4Var3.d;
                            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    if (tL_starGiftUnique != null && this.f40881q) {
                                        this.f40889z = Bitmap.createBitmap(bitmap);
                                        new Canvas(this.f40889z).drawColor(-870178270);
                                    }
                                }
                            }
                            tL_starGiftUnique = null;
                            if (tL_starGiftUnique != null) {
                                this.f40889z = Bitmap.createBitmap(bitmap);
                                new Canvas(this.f40889z).drawColor(-870178270);
                            }
                        }
                    }
                }
                Drawable drawable2 = this.h;
                if (drawable2 != null) {
                    o(drawable2);
                }
            }
            this.f40888y = this.A;
            if (this.B) {
                j10 = -1;
            } else {
                j10 = j(org.telegram.ui.ActionBar.k6.f21277ic, true);
            }
            this.f40885u = j10;
            if (this.B) {
                j11 = -1;
            } else {
                j11 = j(org.telegram.ui.ActionBar.k6.f21296jc, true);
            }
            this.v = j11;
            if (this.B) {
                j12 = -1;
            } else {
                j12 = j(org.telegram.ui.ActionBar.k6.f21296jc, true);
            }
            this.f40886w = j12;
            if (!this.B) {
                i10 = j(org.telegram.ui.ActionBar.k6.f21316kc, true);
            }
            this.f40887x = i10;
            if (f4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.h)[0];
                m();
                n();
            }
            g5Var.f20920f = false;
            if (snVar.f41519f6 < 0) {
                g5Var.f20921g = false;
            }
            g5Var.h = new ai.x9(this, f4Var, wallPaper, z10, 13);
            if (z10) {
                g5Var.f20924k = new nn(this);
                g5Var.f20922i = new ln(this, 0);
                g5Var.f20923j = new ln(this, 1);
            } else {
                if (snVar.f41561j1 != null) {
                    snVar.lc();
                }
                g5Var.h.run();
            }
            g5Var.e = true;
            g5Var.f20926m = this;
            g5Var.f20925l = 250L;
            h5Var2 = ((org.telegram.ui.ActionBar.o2) snVar).parentLayout;
            ((ActionBarLayout) h5Var2).f(g5Var, null);
        }
    }

    public final void r(org.telegram.ui.ActionBar.f4 f4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.yc0 yc0Var;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.i6 i6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        org.telegram.ui.ActionBar.j6 j6Var;
        boolean z11;
        Drawable drawable2;
        int i13;
        char c10;
        org.telegram.ui.ActionBar.j6 P0;
        int i14;
        org.telegram.ui.ActionBar.j6 P02;
        org.telegram.ui.ActionBar.f4 f4Var2 = f4Var;
        sn snVar = this.F;
        if (snVar.f41633oa != null) {
            return;
        }
        this.f40871f = f4Var2;
        this.f40872g = wallPaper;
        if (snVar.fragmentView != null) {
            drawable = snVar.f41561j1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.yc0) {
            yc0Var = (org.telegram.ui.Components.yc0) drawable;
        } else {
            yc0Var = null;
        }
        if (yc0Var != null) {
            i10 = yc0Var.f32885i;
        } else {
            i10 = 0;
        }
        if ((f4Var2 == null || f4Var2.f20884a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.k6.ul.indexOfKey(org.telegram.ui.ActionBar.k6.f21333lc);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.k6.ul.valueAt(indexOfKey2);
            } else {
                int i15 = org.telegram.ui.ActionBar.k6.f21118a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (f4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f40869b.clear();
            this.f40868a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
            if (t02 instanceof org.telegram.ui.Components.yc0) {
                ((org.telegram.ui.Components.yc0) t02).u(i10);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.k6.I.q() == this.f40881q) {
                P02 = org.telegram.ui.ActionBar.k6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.P0(string) != null && !org.telegram.ui.ActionBar.k6.P0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.P0(string2) != null && org.telegram.ui.ActionBar.k6.P0(string2).q()) {
                    str = string2;
                }
                if (this.f40881q) {
                    P02 = org.telegram.ui.ActionBar.k6.P0(str);
                } else {
                    P02 = org.telegram.ui.ActionBar.k6.P0(str2);
                }
            }
            org.telegram.ui.ActionBar.k6.t(P02, false, this.f40881q);
            o(this.h);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.k6.J(ApplicationLoader.applicationContext, false);
        }
        if (f4Var2 != null) {
            i11 = ((org.telegram.ui.ActionBar.o2) this.F).currentAccount;
            boolean z12 = this.f40881q;
            ArrayList arrayList2 = f4Var2.f20887f;
            org.telegram.ui.ActionBar.j6 i16 = f4Var2.i(z12 ? 1 : 0);
            if (i16 == null) {
                int i17 = ((org.telegram.ui.ActionBar.e4) f4Var2.f20887f.get(z12 ? 1 : 0)).d;
                i12 = 0;
                org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) ((gg.a) f4Var2.f20887f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = e4Var.b(i17);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.e4) f4Var2.f20887f.get(z12 ? 1 : 0)).f20858b;
                org.telegram.ui.ActionBar.j6 j6Var2 = new org.telegram.ui.ActionBar.j6(org.telegram.ui.ActionBar.k6.P0(org.telegram.ui.ActionBar.k6.r0(b10)));
                arrayList = arrayList2;
                i6Var = j6Var2.e(e4Var.a(), b10, tL_theme, i11, true);
                j6Var2.u(i6Var.f20964a);
                i16 = j6Var2;
            } else {
                i12 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i16.f21020a0;
                if (sparseArray != null) {
                    i6Var = (org.telegram.ui.ActionBar.i6) sparseArray.get(((org.telegram.ui.ActionBar.e4) arrayList.get(z12 ? 1 : 0)).e);
                } else {
                    i6Var = null;
                }
            }
            String[] strArr = new String[1];
            if (i16.f21021b != null) {
                sparseIntArray = org.telegram.ui.ActionBar.k6.S0(new File(i16.f21021b), null, strArr);
            } else {
                String str3 = i16.d;
                if (str3 != null) {
                    sparseIntArray = org.telegram.ui.ActionBar.k6.S0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((org.telegram.ui.ActionBar.e4) arrayList.get(z12 ? 1 : 0)).f20861g = strArr[i12];
            if (i6Var != null) {
                SparseIntArray clone = sparseIntArray.clone();
                i6Var.c(sparseIntArray, clone);
                gg.b bVar = f4Var2.f20886c;
                if (bVar != null && !TextUtils.isEmpty(bVar.f11068b) && (j6Var = i6Var.f20965b) != null && j6Var.f21021b == null && !j6Var.q()) {
                    org.telegram.ui.ActionBar.i6.g(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = org.telegram.ui.ActionBar.k6.rl;
            for (int i18 = i12; i18 < sparseIntArray2.size(); i18++) {
                int keyAt = sparseIntArray2.keyAt(i18);
                int valueAt = sparseIntArray2.valueAt(i18);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.k6.ql;
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
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.f40872g))) {
            Drawable drawable3 = this.h;
            i14 = ((org.telegram.ui.ActionBar.o2) this.F).currentAccount;
            this.h = ei.r6.f(drawable3, i14, this.f40872g, this.f40881q);
        } else if (wallPaper != null) {
            this.h = vn.d(this.h, wallPaper, this.f40881q);
        } else {
            if (f4Var2.f20884a) {
                org.telegram.ui.ActionBar.j6 d = org.telegram.ui.ActionBar.f4.d(this.f40881q);
                i13 = ((org.telegram.ui.ActionBar.o2) this.F).currentAccount;
                org.telegram.ui.ActionBar.k6.H(d, f4Var2.g(i13, this.f40881q ? 1 : 0), ((org.telegram.ui.ActionBar.e4) f4Var2.f20887f.get(this.f40881q ? 1 : 0)).f20861g, i10, i12);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int g10 = g(org.telegram.ui.ActionBar.k6.Nd);
                int g11 = g(org.telegram.ui.ActionBar.k6.Od);
                int g12 = g(org.telegram.ui.ActionBar.k6.Pd);
                int g13 = g(org.telegram.ui.ActionBar.k6.Qd);
                org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0();
                yc0Var2.s(yc0Var2.f32897u, f4Var2.j(this.f40881q ? 1 : 0).settings.intensity);
                TLRPC.Document e = f4Var2.e();
                if (yc0Var2.f32900y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    yc0Var2.f32900y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = yc0Var2.f32880c;
                    if (weakReference != null) {
                        yc0Var2.f32900y.setParentView((View) weakReference.get());
                    }
                    if (yc0Var2.T) {
                        yc0Var2.f32900y.onAttachedToWindow();
                    }
                }
                yc0Var2.f32900y.setImage(ImageLocation.getForDocument(e), "80_80", null, null, null, 0);
                yc0Var2.f32900y.setAutoRepeatCount(1);
                yc0Var2.f32900y.setAutoRepeat(1);
                yc0Var2.o(g10, g11, g12, g13, 0, true);
                yc0Var2.u(i10);
                int f7 = yc0Var2.f();
                boolean z13 = this.f40881q;
                m4.w0 w0Var = new m4.w0(18, this, yc0Var2);
                org.telegram.ui.ActionBar.e4 e4Var2 = (org.telegram.ui.ActionBar.e4) f4Var2.f20887f.get(z13 ? 1 : 0);
                if (e4Var2 != null && e4Var2.f20859c != null) {
                    long h = f4Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = e4Var2.f20859c.gift;
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
                    imageReceiver2.setDelegate(new ci.d1(w0Var, h, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                } else {
                    z11 = z13 ? 1 : 0;
                }
                f4Var2 = f4Var;
                f4Var2.n(this.f40881q ? 1 : 0, new org.telegram.messenger.n2(this, f4Var2, z11, yc0Var2, f7));
                drawable2 = yc0Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.f40882r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.f40882r = new AnimatorSet();
            if (yc0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new mn(yc0Var, 0));
                ofFloat.addListener(new on(yc0Var));
                ofFloat.setDuration(200L);
                this.f40882r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof org.telegram.ui.Components.yc0) {
                org.telegram.ui.Components.yc0 yc0Var3 = (org.telegram.ui.Components.yc0) drawable4;
                yc0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new mn(yc0Var3, 1));
                ofFloat2.addListener(new pn(yc0Var3));
                ofFloat2.setDuration(250L);
                this.f40882r.playTogether(ofFloat2);
            }
            this.f40882r.start();
        }
        if (f4Var2 == null && this.F.f41519f6 >= 0) {
            if (org.telegram.ui.ActionBar.k6.I.q() == this.f40881q) {
                P0 = org.telegram.ui.ActionBar.k6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.P0(string3) != null && !org.telegram.ui.ActionBar.k6.P0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.P0(string4) != null && org.telegram.ui.ActionBar.k6.P0(string4).q()) {
                    str = string4;
                }
                if (this.f40881q) {
                    P0 = org.telegram.ui.ActionBar.k6.P0(str);
                } else {
                    P0 = org.telegram.ui.ActionBar.k6.P0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.k6.t(P0, false, this.f40881q);
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
        if (!this.f40869b.isEmpty()) {
            Paint d = d("paintChatActionBackground");
            Paint d10 = d("paintChatActionBackgroundSelected");
            Paint d11 = d("paintChatMessageBackgroundSelected");
            int i10 = this.A;
            int i11 = -1;
            if (this.B) {
                j10 = -1;
            } else {
                j10 = j(org.telegram.ui.ActionBar.k6.f21277ic, true);
            }
            if (this.B) {
                j11 = -1;
            } else {
                j11 = j(org.telegram.ui.ActionBar.k6.f21296jc, true);
            }
            if (this.B) {
                j12 = -1;
            } else {
                j12 = j(org.telegram.ui.ActionBar.k6.f21296jc, true);
            }
            if (!this.B) {
                i11 = j(org.telegram.ui.ActionBar.k6.f21316kc, true);
            }
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                i10 = i0.a.f(f7, this.f40888y, i10);
                j10 = i0.a.f(f7, this.f40885u, j10);
                j11 = i0.a.f(f7, this.v, j11);
                j12 = i0.a.f(f7, this.f40886w, j12);
                i11 = i0.a.f(f7, this.f40887x, i11);
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
            org.telegram.ui.ActionBar.k6.z1(j10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.k6.z1(j10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.k6.z1(j10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.k6.z1(j10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.k6.z1(j10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.k6.z1(j10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.k6.z1(i11, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.k6.z1(i11, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.k6.z1(i11, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.k6.z1(i11, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.k6.z1(i11, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.k6.z1(i11, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.k6.z1(i11, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.k6.z1(i11, getDrawable("drawableShareIcon"));
            if (this.f40877m != null && (bitmap = this.f40875k) != null) {
                Rect rect = this.E;
                Rect rect2 = this.D;
                if (i12 != 0 && (bitmap2 = this.f40889z) != null) {
                    this.f40880p = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.f40889z.getHeight());
                    rect.set(0, 0, this.f40874j.getWidth(), this.f40874j.getHeight());
                    this.f40877m.drawBitmap(this.f40889z, rect2, rect, (Paint) null);
                    Paint paint = this.f40876l;
                    paint.setAlpha((int) (f7 * 255.0f));
                    rect2.set(0, 0, this.f40875k.getWidth(), this.f40875k.getHeight());
                    rect.set(0, 0, this.f40874j.getWidth(), this.f40874j.getHeight());
                    this.f40877m.drawBitmap(this.f40875k, rect2, rect, paint);
                    if (d != null) {
                        d.setShader(this.f40878n);
                        d10.setShader(this.f40878n);
                    }
                    if (d11 != null) {
                        d11.setShader(this.f40878n);
                        return;
                    }
                    return;
                }
                this.f40880p = true;
                rect2.set(0, 0, bitmap.getWidth(), this.f40875k.getHeight());
                rect.set(0, 0, this.f40874j.getWidth(), this.f40874j.getHeight());
                this.f40877m.drawBitmap(this.f40875k, rect2, rect, (Paint) null);
                if (d != null) {
                    d.setShader(this.f40879o);
                    d10.setShader(this.f40879o);
                }
                if (d11 != null) {
                    d11.setShader(this.f40879o);
                }
            }
        }
    }
}
