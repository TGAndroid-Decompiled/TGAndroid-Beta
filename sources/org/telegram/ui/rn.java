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
import android.util.SparseIntArray;
import android.view.View;
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
public final class rn implements org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.nb0 {
    public BitmapShader A;
    public boolean B;
    public AnimatorSet D;
    public org.telegram.ui.ActionBar.d5 E;
    public org.telegram.ui.ActionBar.d5 F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public Bitmap L;
    public int M;
    public boolean N;
    public boolean O;
    public final tn R;
    public SparseIntArray f42155e;
    public org.telegram.ui.ActionBar.b4 f42156f;
    public TLRPC.WallPaper h;
    public Drawable f42157n;
    public ValueAnimator f42158r;
    public Bitmap f42159s;
    public Bitmap v;
    public Canvas f42161x;
    public BitmapShader f42162y;
    public final HashMap f42152a = new HashMap();
    public final HashMap f42153b = new HashMap();
    public final Matrix f42154c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f42160w = new Paint();
    public final Rect P = new Rect();
    public final Rect Q = new Rect();
    public boolean C = org.telegram.ui.ActionBar.g6.I.q();

    public rn(tn tnVar) {
        int i10;
        int i11;
        this.R = tnVar;
        if (h(false)) {
            i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            this.f42156f = ChatThemeController.getInstance(i10).getDialogTheme(tnVar.P5);
            i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(tnVar.P5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.f42156f;
            if (b4Var != null || dialogWallpaper != null) {
                j(b4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ag.o0(27));
            }
        }
        if (ThemeEditorView.f26564n == null) {
            org.telegram.ui.ActionBar.g6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ag.o0(27));
    }

    @Override
    public final ColorFilter B() {
        return org.telegram.ui.ActionBar.g6.f23380v3;
    }

    @Override
    public final int C0(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.f42155e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.f42155e.valueAt(indexOfKey2);
        }
        if (this.f42156f == null) {
            return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.g6.ol.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    @Override
    public final Paint G(String str) {
        if (this.f42156f == null && this.f42157n == null) {
            return null;
        }
        return (Paint) this.f42153b.get(str);
    }

    @Override
    public final void L0(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f42155e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.g6.I.q();
    }

    public final int b(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f42156f == null && this.f42157n == null) {
            return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.f42155e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.f42155e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public final org.telegram.ui.ActionBar.b4 c() {
        return this.f42156f;
    }

    public final Drawable d() {
        Drawable drawable = this.f42157n;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.g6.s0();
    }

    public final void e() {
        Drawable d5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.g6.jl.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            char c3 = 65535;
            switch (str.hashCode()) {
                case -2061232504:
                    if (str.equals("drawableMsgIn")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -2005320132:
                    if (str.equals("drawableMsgInMedia")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -1656383241:
                    if (str.equals("drawableMsgInMediaSelected")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case -1451465639:
                    if (str.equals("drawableMsgOutMedia")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case -1084641786:
                    if (str.equals("drawableMsgOutSelected")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case -8170988:
                    if (str.equals("drawableMsgOutMediaSelected")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case 300508483:
                    if (str.equals("drawableMsgInSelected")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 526307915:
                    if (str.equals("drawableMsgOut")) {
                        c3 = 7;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    d5Var = new org.telegram.ui.ActionBar.d5(0, false, false, this);
                    break;
                case 1:
                    d5Var = new org.telegram.ui.ActionBar.d5(1, false, false, this);
                    break;
                case 2:
                    d5Var = new org.telegram.ui.ActionBar.d5(1, false, true, this);
                    break;
                case 3:
                    d5Var = new org.telegram.ui.ActionBar.d5(1, true, false, this);
                    break;
                case 4:
                    d5Var = new org.telegram.ui.ActionBar.d5(0, true, true, this);
                    break;
                case 5:
                    d5Var = new org.telegram.ui.ActionBar.d5(1, true, true, this);
                    break;
                case 6:
                    d5Var = new org.telegram.ui.ActionBar.d5(0, false, true, this);
                    break;
                case 7:
                    d5Var = new org.telegram.ui.ActionBar.d5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        d5Var = constantState.newDrawable().mutate();
                    } else {
                        d5Var = null;
                    }
                    if (d5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.g6.kl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.g6.w1(C0(intValue), d5Var);
                            break;
                        }
                    }
                    break;
            }
            if (d5Var != null) {
                this.f42152a.put((String) entry.getKey(), d5Var);
            }
        }
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.g6.ll.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.g6.ml.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(C0(intValue));
            }
            this.f42153b.put((String) entry.getKey(), paint);
        }
    }

    public final void g(android.graphics.drawable.Drawable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rn.g(android.graphics.drawable.Drawable):void");
    }

    @Override
    public final int g1(int i10) {
        return b(i10, false);
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f42152a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    public final boolean h(boolean z10) {
        TLRPC.User user;
        tn tnVar = this.R;
        if (tnVar.h == null) {
            if (z10) {
                if (tnVar.f42787e == null && (user = tnVar.f42801f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final int h0(int i10) {
        return C0(i10);
    }

    public final void i(org.telegram.ui.ActionBar.b4 b4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.b5 b5Var;
        boolean z12;
        qf.b bVar;
        qf.b bVar2;
        org.telegram.ui.ActionBar.f6 A0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int b10;
        int b11;
        int b12;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int w02;
        int w03;
        int w04;
        int w05;
        tn tnVar = this.R;
        b5Var = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
        if (b5Var != null && tnVar.Y9 == null) {
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = this.C;
            }
            if (b4Var != null) {
                bVar = b4Var.f22764c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.b4 b4Var2 = this.f42156f;
            if (b4Var2 != null) {
                bVar2 = b4Var2.f22764c;
            } else {
                bVar2 = null;
            }
            TLRPC.WallPaper wallPaper2 = this.h;
            if (!z11) {
                if (h(false)) {
                    if (qf.b.a(bVar2, bVar) && this.C == z12 && ChatThemeController.equals(wallPaper, wallPaper2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.C = z12;
            if (z12) {
                A0 = org.telegram.ui.ActionBar.g6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.g6.A0();
            }
            org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(A0, A0.U, A0.q(), !z10);
            org.telegram.ui.ActionBar.b4 b4Var3 = this.f42156f;
            int i10 = -1;
            if (b4Var3 == null && this.h == null) {
                Drawable s02 = org.telegram.ui.ActionBar.g6.s0();
                this.N = s02 instanceof org.telegram.ui.Components.yb0;
                g(s02);
                if (this.N) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23158ic, false);
                }
                this.G = w02;
                if (this.N) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23176jc, false);
                }
                this.H = w03;
                if (this.N) {
                    w04 = -1;
                } else {
                    w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23176jc, false);
                }
                this.I = w04;
                if (this.N) {
                    w05 = -1;
                } else {
                    w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23194kc, false);
                }
                this.J = w05;
            } else {
                if (this.N) {
                    Drawable drawable = this.f42157n;
                    if (drawable instanceof org.telegram.ui.Components.yb0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.yb0) drawable).f35026k;
                        this.L = bitmap;
                        if (b4Var3 != null) {
                            TLRPC.ChatTheme chatTheme = b4Var3.d;
                            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    if (tL_starGiftUnique != null && this.C) {
                                        this.L = Bitmap.createBitmap(bitmap);
                                        new Canvas(this.L).drawColor(-870178270);
                                    }
                                }
                            }
                            tL_starGiftUnique = null;
                            if (tL_starGiftUnique != null) {
                                this.L = Bitmap.createBitmap(bitmap);
                                new Canvas(this.L).drawColor(-870178270);
                            }
                        }
                    }
                }
                Drawable drawable2 = this.f42157n;
                if (drawable2 != null) {
                    g(drawable2);
                }
            }
            this.K = this.M;
            if (this.N) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.g6.f23158ic, true);
            }
            this.G = b10;
            if (this.N) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.g6.f23176jc, true);
            }
            this.H = b11;
            if (this.N) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.g6.f23176jc, true);
            }
            this.I = b12;
            if (!this.N) {
                i10 = b(org.telegram.ui.ActionBar.g6.f23194kc, true);
            }
            this.J = i10;
            if (b4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.f42157n)[0];
                e();
                f();
            }
            a5Var.f22747f = false;
            if (tnVar.P5 < 0) {
                a5Var.f22748g = false;
            }
            a5Var.h = new ag.w0(this, b4Var, wallPaper, z10, 10);
            if (z10) {
                a5Var.f22751k = new on(this);
                a5Var.f22749i = new mn(this, 0);
                a5Var.f22750j = new mn(this, 1);
            } else {
                if (tnVar.T0 != null) {
                    tnVar.ec();
                }
                a5Var.h.run();
            }
            a5Var.f22746e = true;
            a5Var.f22753m = this;
            a5Var.f22752l = 250L;
            b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar).parentLayout;
            ((ActionBarLayout) b5Var2).f(a5Var, null);
        }
    }

    public final void j(org.telegram.ui.ActionBar.b4 b4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.yb0 yb0Var;
        int i10;
        int i11;
        boolean z11;
        org.telegram.ui.Components.yb0 yb0Var2;
        Drawable drawable2;
        int i12;
        char c3;
        org.telegram.ui.ActionBar.f6 N0;
        int i13;
        org.telegram.ui.ActionBar.f6 N02;
        org.telegram.ui.ActionBar.b4 b4Var2 = b4Var;
        tn tnVar = this.R;
        if (tnVar.Y9 != null) {
            return;
        }
        this.f42156f = b4Var2;
        this.h = wallPaper;
        if (tnVar.fragmentView != null) {
            drawable = tnVar.T0.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.yb0) {
            yb0Var = (org.telegram.ui.Components.yb0) drawable;
        } else {
            yb0Var = null;
        }
        if (yb0Var != null) {
            i10 = yb0Var.f35024i;
        } else {
            i10 = 0;
        }
        if ((b4Var2 == null || b4Var2.f22762a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.g6.rl.indexOfKey(org.telegram.ui.ActionBar.g6.lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.g6.rl.valueAt(indexOfKey);
            } else {
                int i14 = org.telegram.ui.ActionBar.g6.f23002a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (b4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f42153b.clear();
            this.f42152a.clear();
            Drawable s02 = org.telegram.ui.ActionBar.g6.s0();
            if (s02 instanceof org.telegram.ui.Components.yb0) {
                ((org.telegram.ui.Components.yb0) s02).v(i10);
            }
            this.f42157n = null;
            if (org.telegram.ui.ActionBar.g6.I.q() == this.C) {
                N02 = org.telegram.ui.ActionBar.g6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string) != null && !org.telegram.ui.ActionBar.g6.N0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string2) != null && org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                    str = string2;
                }
                if (this.C) {
                    N02 = org.telegram.ui.ActionBar.g6.N0(str);
                } else {
                    N02 = org.telegram.ui.ActionBar.g6.N0(str2);
                }
            }
            org.telegram.ui.ActionBar.g6.t(N02, false, this.C);
            g(this.f42157n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.g6.J(ApplicationLoader.applicationContext, false);
        }
        if (b4Var2 != null) {
            i11 = ((org.telegram.ui.ActionBar.o2) this.R).currentAccount;
            this.d = b4Var2.b(i11, this.C ? 1 : 0);
        } else {
            this.d = new SparseIntArray();
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable3 = this.f42157n;
            i13 = ((org.telegram.ui.ActionBar.o2) this.R).currentAccount;
            this.f42157n = nh.f6.f(drawable3, i13, this.h, this.C);
        } else if (wallPaper != null) {
            this.f42157n = wn.d(this.f42157n, wallPaper, this.C);
        } else {
            if (b4Var2.f22762a) {
                org.telegram.ui.ActionBar.f6 e10 = org.telegram.ui.ActionBar.b4.e(this.C);
                i12 = ((org.telegram.ui.ActionBar.o2) this.R).currentAccount;
                org.telegram.ui.ActionBar.g6.H(e10, b4Var2.h(i12, this.C ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var2.f22766f.get(this.C ? 1 : 0)).f22735g, i10, false);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int C0 = C0(org.telegram.ui.ActionBar.g6.Nd);
                int C02 = C0(org.telegram.ui.ActionBar.g6.Od);
                int C03 = C0(org.telegram.ui.ActionBar.g6.Pd);
                int C04 = C0(org.telegram.ui.ActionBar.g6.Qd);
                org.telegram.ui.Components.yb0 yb0Var3 = new org.telegram.ui.Components.yb0();
                yb0Var3.t(yb0Var3.f35036u, b4Var2.k(this.C ? 1 : 0).settings.intensity);
                TLRPC.Document f9 = b4Var2.f();
                if (yb0Var3.f35039y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    yb0Var3.f35039y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = yb0Var3.f35018c;
                    if (weakReference != null) {
                        yb0Var3.f35039y.setParentView((View) weakReference.get());
                    }
                    if (yb0Var3.T) {
                        yb0Var3.f35039y.onAttachedToWindow();
                    }
                }
                yb0Var3.f35039y.setImage(ImageLocation.getForDocument(f9), "80_80", null, null, null, 0);
                yb0Var3.f35039y.setAutoRepeatCount(1);
                yb0Var3.f35039y.setAutoRepeat(1);
                yb0Var3.o(C0, C02, C03, C04, 0, true);
                yb0Var3.v(i10);
                int f10 = yb0Var3.f();
                boolean z12 = this.C;
                kg.w wVar = new kg.w(21, this, yb0Var3);
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var2.f22766f.get(z12 ? 1 : 0);
                if (a4Var != null && a4Var.f22732c != null) {
                    yb0Var2 = yb0Var3;
                    long i15 = b4Var2.i(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = a4Var.f22732c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
                    if (arrayList != null && document == null) {
                        int size = arrayList.size();
                        int i16 = 0;
                        while (i16 < size) {
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i16);
                            int i17 = i16 + 1;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            z11 = z12 ? 1 : 0;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                z12 = z11;
                                i16 = i17;
                            }
                        }
                    }
                    z11 = z12;
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new f3.e(wVar, i15, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                } else {
                    z11 = z12 ? 1 : 0;
                    yb0Var2 = yb0Var3;
                }
                b4Var2 = b4Var;
                org.telegram.ui.Components.yb0 yb0Var4 = yb0Var2;
                b4Var2.o(this.C ? 1 : 0, new org.telegram.messenger.j2(this, b4Var2, z11, yb0Var4, f10));
                drawable2 = yb0Var4;
            }
            this.f42157n = drawable2;
        }
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.D = new AnimatorSet();
            if (yb0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new nn(yb0Var, 0));
                ofFloat.addListener(new pn(yb0Var));
                ofFloat.setDuration(200L);
                this.D.playTogether(ofFloat);
            }
            Drawable drawable4 = this.f42157n;
            if (drawable4 instanceof org.telegram.ui.Components.yb0) {
                org.telegram.ui.Components.yb0 yb0Var5 = (org.telegram.ui.Components.yb0) drawable4;
                yb0Var5.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new nn(yb0Var5, 1));
                ofFloat2.addListener(new qn(yb0Var5));
                ofFloat2.setDuration(250L);
                this.D.playTogether(ofFloat2);
            }
            this.D.start();
        }
        if (b4Var2 == null && this.R.P5 >= 0) {
            if (org.telegram.ui.ActionBar.g6.I.q() == this.C) {
                N0 = org.telegram.ui.ActionBar.g6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string3) != null && !org.telegram.ui.ActionBar.g6.N0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string4) != null && org.telegram.ui.ActionBar.g6.N0(string4).q()) {
                    str = string4;
                }
                if (this.C) {
                    N0 = org.telegram.ui.ActionBar.g6.N0(str);
                } else {
                    N0 = org.telegram.ui.ActionBar.g6.N0(str2);
                }
            }
            c3 = 0;
            org.telegram.ui.ActionBar.g6.t(N0, false, this.C);
        } else {
            c3 = 0;
        }
        int i18 = AndroidUtilities.calcDrawableColor(this.f42157n)[c3];
        e();
        f();
        g(this.f42157n);
        k(1.0f);
    }

    public final void k(float f9) {
        int b10;
        int b11;
        int b12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f42153b.isEmpty()) {
            Paint G = G("paintChatActionBackground");
            Paint G2 = G("paintChatActionBackgroundSelected");
            Paint G3 = G("paintChatMessageBackgroundSelected");
            int i10 = this.M;
            int i11 = -1;
            if (this.N) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.g6.f23158ic, true);
            }
            if (this.N) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.g6.f23176jc, true);
            }
            if (this.N) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.g6.f23176jc, true);
            }
            if (!this.N) {
                i11 = b(org.telegram.ui.ActionBar.g6.f23194kc, true);
            }
            int i12 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                i10 = i0.a.d(f9, this.K, i10);
                b10 = i0.a.d(f9, this.G, b10);
                b11 = i0.a.d(f9, this.H, b11);
                b12 = i0.a.d(f9, this.I, b12);
                i11 = i0.a.d(f9, this.J, i11);
            }
            if (G != null && !this.N) {
                G.setColor(i10);
                G2.setColor(i10);
            }
            Paint G4 = G("paintChatActionText");
            if (G4 != null) {
                ((TextPaint) G4).linkColor = b11;
                G("paintChatActionText").setColor(b10);
                G("paintChatBotButton").setColor(b12);
            }
            org.telegram.ui.ActionBar.g6.w1(b10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.g6.w1(b10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.g6.w1(b10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.g6.w1(b10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.g6.w1(b10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.g6.w1(b10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.g6.w1(i11, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.g6.w1(i11, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.g6.w1(i11, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.g6.w1(i11, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.g6.w1(i11, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.g6.w1(i11, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.g6.w1(i11, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.g6.w1(i11, getDrawable("drawableShareIcon"));
            if (this.f42161x != null && (bitmap = this.v) != null) {
                Rect rect = this.Q;
                Rect rect2 = this.P;
                if (i12 != 0 && (bitmap2 = this.L) != null) {
                    this.B = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.L.getHeight());
                    rect.set(0, 0, this.f42159s.getWidth(), this.f42159s.getHeight());
                    this.f42161x.drawBitmap(this.L, rect2, rect, (Paint) null);
                    Paint paint = this.f42160w;
                    paint.setAlpha((int) (f9 * 255.0f));
                    rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                    rect.set(0, 0, this.f42159s.getWidth(), this.f42159s.getHeight());
                    this.f42161x.drawBitmap(this.v, rect2, rect, paint);
                    if (G != null) {
                        G.setShader(this.f42162y);
                        G2.setShader(this.f42162y);
                    }
                    if (G3 != null) {
                        G3.setShader(this.f42162y);
                        return;
                    }
                    return;
                }
                this.B = true;
                rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f42159s.getWidth(), this.f42159s.getHeight());
                this.f42161x.drawBitmap(this.v, rect2, rect, (Paint) null);
                if (G != null) {
                    G.setShader(this.A);
                    G2.setShader(this.A);
                }
                if (G3 != null) {
                    G3.setShader(this.A);
                }
            }
        }
    }

    @Override
    public final void l(float f9, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.f42157n != null && (bitmap = this.f42159s) != null && (bitmapShader = this.f42162y) != null) {
            boolean z10 = this.B;
            Matrix matrix = this.f42154c;
            if (z10) {
                org.telegram.ui.ActionBar.g6.r(this.v, this.A, matrix, i10, i11, f9, f10);
                return;
            } else {
                org.telegram.ui.ActionBar.g6.r(bitmap, bitmapShader, matrix, i10, i11, f9, f10);
                return;
            }
        }
        org.telegram.ui.ActionBar.g6.q(f9, f10, i10, i11);
    }

    @Override
    public final boolean l0() {
        if (this.f42157n != null) {
            if (this.f42162y != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.g6.a1();
    }
}
