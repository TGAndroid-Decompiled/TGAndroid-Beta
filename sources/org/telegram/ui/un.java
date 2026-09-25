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
public final class un implements org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.bc0 {
    public BitmapShader E;
    public boolean F;
    public AnimatorSet H;
    public org.telegram.ui.ActionBar.d5 I;
    public org.telegram.ui.ActionBar.d5 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public Bitmap P;
    public int Q;
    public boolean R;
    public boolean S;
    public final wn V;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.b4 f38507f;
    public TLRPC.WallPaper h;
    public Drawable f38508n;
    public ValueAnimator f38509r;
    public Bitmap f38510s;
    public Bitmap v;
    public Canvas f38512x;
    public BitmapShader f38513y;
    public final HashMap f38504a = new HashMap();
    public final HashMap f38505b = new HashMap();
    public final Matrix f38506c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f38511w = new Paint();
    public final Rect T = new Rect();
    public final Rect U = new Rect();
    public boolean G = org.telegram.ui.ActionBar.h6.I.q();

    public un(wn wnVar) {
        int i10;
        int i11;
        this.V = wnVar;
        if (h(false)) {
            i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            this.f38507f = ChatThemeController.getInstance(i10).getDialogTheme(wnVar.T5);
            i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(wnVar.T5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.f38507f;
            if (b4Var != null || dialogWallpaper != null) {
                j(b4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ai.f(20));
            }
        }
        if (ThemeEditorView.f22431n == null) {
            org.telegram.ui.ActionBar.h6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ai.f(20));
    }

    @Override
    public final Paint G(String str) {
        if (this.f38507f == null && this.f38508n == null) {
            return null;
        }
        return (Paint) this.f38505b.get(str);
    }

    @Override
    public final int G0(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f38507f == null) {
            return org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.h6.ol.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    @Override
    public final void L0(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.h6.I.q();
    }

    public final int b(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f38507f == null && this.f38508n == null) {
            return org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.h6.w0(null, i10, false);
    }

    public final org.telegram.ui.ActionBar.b4 c() {
        return this.f38507f;
    }

    public final Drawable d() {
        Drawable drawable = this.f38508n;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.h6.s0();
    }

    public final void e() {
        Drawable d5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.h6.jl.entrySet()) {
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
                        int intValue = ((Integer) org.telegram.ui.ActionBar.h6.kl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.h6.w1(G0(intValue), d5Var);
                            break;
                        }
                    }
                    break;
            }
            if (d5Var != null) {
                this.f38504a.put((String) entry.getKey(), d5Var);
            }
        }
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.h6.ll.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.h6.ml.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(G0(intValue));
            }
            this.f38505b.put((String) entry.getKey(), paint);
        }
    }

    public final void g(android.graphics.drawable.Drawable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.g(android.graphics.drawable.Drawable):void");
    }

    @Override
    public final int g0(int i10) {
        return G0(i10);
    }

    @Override
    public final int g1(int i10) {
        return b(i10, false);
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f38504a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    public final boolean h(boolean z10) {
        TLRPC.User user;
        wn wnVar = this.V;
        if (wnVar.h == null) {
            if (z10) {
                if (wnVar.e == null && (user = wnVar.f39472f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void i(org.telegram.ui.ActionBar.b4 b4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.b5 b5Var;
        boolean z12;
        fg.b bVar;
        fg.b bVar2;
        org.telegram.ui.ActionBar.g6 A0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int b10;
        int b11;
        int b12;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int w02;
        int w03;
        int w04;
        int w05;
        wn wnVar = this.V;
        b5Var = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
        if (b5Var != null && wnVar.f39446ca == null) {
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = this.G;
            }
            if (b4Var != null) {
                bVar = b4Var.f18759c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.b4 b4Var2 = this.f38507f;
            if (b4Var2 != null) {
                bVar2 = b4Var2.f18759c;
            } else {
                bVar2 = null;
            }
            TLRPC.WallPaper wallPaper2 = this.h;
            if (!z11) {
                if (h(false)) {
                    if (fg.b.a(bVar2, bVar) && this.G == z12 && ChatThemeController.equals(wallPaper, wallPaper2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.G = z12;
            if (z12) {
                A0 = org.telegram.ui.ActionBar.h6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.h6.A0();
            }
            org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(A0, A0.Y, A0.q(), !z10);
            org.telegram.ui.ActionBar.b4 b4Var3 = this.f38507f;
            int i10 = -1;
            if (b4Var3 == null && this.h == null) {
                Drawable s02 = org.telegram.ui.ActionBar.h6.s0();
                this.R = s02 instanceof org.telegram.ui.Components.mc0;
                g(s02);
                if (this.R) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19155ic, false);
                }
                this.K = w02;
                if (this.R) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19173jc, false);
                }
                this.L = w03;
                if (this.R) {
                    w04 = -1;
                } else {
                    w04 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19173jc, false);
                }
                this.M = w04;
                if (this.R) {
                    w05 = -1;
                } else {
                    w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19193kc, false);
                }
                this.N = w05;
            } else {
                if (this.R) {
                    Drawable drawable = this.f38508n;
                    if (drawable instanceof org.telegram.ui.Components.mc0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.mc0) drawable).f26443k;
                        this.P = bitmap;
                        if (b4Var3 != null) {
                            TLRPC.ChatTheme chatTheme = b4Var3.d;
                            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    if (tL_starGiftUnique != null && this.G) {
                                        this.P = Bitmap.createBitmap(bitmap);
                                        new Canvas(this.P).drawColor(-870178270);
                                    }
                                }
                            }
                            tL_starGiftUnique = null;
                            if (tL_starGiftUnique != null) {
                                this.P = Bitmap.createBitmap(bitmap);
                                new Canvas(this.P).drawColor(-870178270);
                            }
                        }
                    }
                }
                Drawable drawable2 = this.f38508n;
                if (drawable2 != null) {
                    g(drawable2);
                }
            }
            this.O = this.Q;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.h6.f19155ic, true);
            }
            this.K = b10;
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.h6.f19173jc, true);
            }
            this.L = b11;
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.h6.f19173jc, true);
            }
            this.M = b12;
            if (!this.R) {
                i10 = b(org.telegram.ui.ActionBar.h6.f19193kc, true);
            }
            this.N = i10;
            if (b4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.f38508n)[0];
                e();
                f();
            }
            a5Var.f18725f = false;
            if (wnVar.T5 < 0) {
                a5Var.f18726g = false;
            }
            a5Var.h = new ai.s4(this, b4Var, wallPaper, z10, 13);
            if (z10) {
                a5Var.f18729k = new rn(this);
                a5Var.f18727i = new pn(this, 0);
                a5Var.f18728j = new pn(this, 1);
            } else {
                if (wnVar.X0 != null) {
                    wnVar.ec();
                }
                a5Var.h.run();
            }
            a5Var.e = true;
            a5Var.f18731m = this;
            a5Var.f18730l = 250L;
            b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar).parentLayout;
            ((ActionBarLayout) b5Var2).f(a5Var, null);
        }
    }

    public final void j(org.telegram.ui.ActionBar.b4 b4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.mc0 mc0Var;
        int i10;
        int i11;
        boolean z11;
        org.telegram.ui.Components.mc0 mc0Var2;
        Drawable drawable2;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.g6 N0;
        int i13;
        org.telegram.ui.ActionBar.g6 N02;
        org.telegram.ui.ActionBar.b4 b4Var2 = b4Var;
        wn wnVar = this.V;
        if (wnVar.f39446ca != null) {
            return;
        }
        this.f38507f = b4Var2;
        this.h = wallPaper;
        if (wnVar.fragmentView != null) {
            drawable = wnVar.X0.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.mc0) {
            mc0Var = (org.telegram.ui.Components.mc0) drawable;
        } else {
            mc0Var = null;
        }
        if (mc0Var != null) {
            i10 = mc0Var.f26441i;
        } else {
            i10 = 0;
        }
        if ((b4Var2 == null || b4Var2.f18757a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.h6.rl.indexOfKey(org.telegram.ui.ActionBar.h6.f19211lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.h6.rl.valueAt(indexOfKey);
            } else {
                int i14 = org.telegram.ui.ActionBar.h6.f18997a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (b4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f38505b.clear();
            this.f38504a.clear();
            Drawable s02 = org.telegram.ui.ActionBar.h6.s0();
            if (s02 instanceof org.telegram.ui.Components.mc0) {
                ((org.telegram.ui.Components.mc0) s02).v(i10);
            }
            this.f38508n = null;
            if (org.telegram.ui.ActionBar.h6.I.q() == this.G) {
                N02 = org.telegram.ui.ActionBar.h6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.h6.N0(string) != null && !org.telegram.ui.ActionBar.h6.N0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.h6.N0(string2) != null && org.telegram.ui.ActionBar.h6.N0(string2).q()) {
                    str = string2;
                }
                if (this.G) {
                    N02 = org.telegram.ui.ActionBar.h6.N0(str);
                } else {
                    N02 = org.telegram.ui.ActionBar.h6.N0(str2);
                }
            }
            org.telegram.ui.ActionBar.h6.t(N02, false, this.G);
            g(this.f38508n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.h6.J(ApplicationLoader.applicationContext, false);
        }
        if (b4Var2 != null) {
            i11 = ((org.telegram.ui.ActionBar.m2) this.V).currentAccount;
            this.d = b4Var2.b(i11, this.G ? 1 : 0);
        } else {
            this.d = new SparseIntArray();
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable3 = this.f38508n;
            i13 = ((org.telegram.ui.ActionBar.m2) this.V).currentAccount;
            this.f38508n = ci.b7.f(drawable3, i13, this.h, this.G);
        } else if (wallPaper != null) {
            this.f38508n = zn.d(this.f38508n, wallPaper, this.G);
        } else {
            if (b4Var2.f18757a) {
                org.telegram.ui.ActionBar.g6 e = org.telegram.ui.ActionBar.b4.e(this.G);
                i12 = ((org.telegram.ui.ActionBar.m2) this.V).currentAccount;
                org.telegram.ui.ActionBar.h6.H(e, b4Var2.h(i12, this.G ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var2.f18760f.get(this.G ? 1 : 0)).f18714g, i10, false);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int G0 = G0(org.telegram.ui.ActionBar.h6.Nd);
                int G02 = G0(org.telegram.ui.ActionBar.h6.Od);
                int G03 = G0(org.telegram.ui.ActionBar.h6.Pd);
                int G04 = G0(org.telegram.ui.ActionBar.h6.Qd);
                org.telegram.ui.Components.mc0 mc0Var3 = new org.telegram.ui.Components.mc0();
                mc0Var3.t(mc0Var3.f26453u, b4Var2.k(this.G ? 1 : 0).settings.intensity);
                TLRPC.Document f7 = b4Var2.f();
                if (mc0Var3.f26456y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    mc0Var3.f26456y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = mc0Var3.f26436c;
                    if (weakReference != null) {
                        mc0Var3.f26456y.setParentView((View) weakReference.get());
                    }
                    if (mc0Var3.T) {
                        mc0Var3.f26456y.onAttachedToWindow();
                    }
                }
                mc0Var3.f26456y.setImage(ImageLocation.getForDocument(f7), "80_80", null, null, null, 0);
                mc0Var3.f26456y.setAutoRepeatCount(1);
                mc0Var3.f26456y.setAutoRepeat(1);
                mc0Var3.o(G0, G02, G03, G04, 0, true);
                mc0Var3.v(i10);
                int f10 = mc0Var3.f();
                boolean z12 = this.G;
                o oVar = new o(14, this, mc0Var3);
                org.telegram.ui.ActionBar.a4 a4Var = (org.telegram.ui.ActionBar.a4) b4Var2.f18760f.get(z12 ? 1 : 0);
                if (a4Var != null && a4Var.f18712c != null) {
                    mc0Var2 = mc0Var3;
                    long i15 = b4Var2.i(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = a4Var.f18712c.gift;
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
                    imageReceiver2.setDelegate(new ai.z1(oVar, i15, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                } else {
                    z11 = z12 ? 1 : 0;
                    mc0Var2 = mc0Var3;
                }
                b4Var2 = b4Var;
                org.telegram.ui.Components.mc0 mc0Var4 = mc0Var2;
                b4Var2.o(this.G ? 1 : 0, new org.telegram.messenger.j2(this, b4Var2, z11, mc0Var4, f10));
                drawable2 = mc0Var4;
            }
            this.f38508n = drawable2;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.H = new AnimatorSet();
            if (mc0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new qn(mc0Var, 0));
                ofFloat.addListener(new sn(mc0Var));
                ofFloat.setDuration(200L);
                this.H.playTogether(ofFloat);
            }
            Drawable drawable4 = this.f38508n;
            if (drawable4 instanceof org.telegram.ui.Components.mc0) {
                org.telegram.ui.Components.mc0 mc0Var5 = (org.telegram.ui.Components.mc0) drawable4;
                mc0Var5.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new qn(mc0Var5, 1));
                ofFloat2.addListener(new tn(mc0Var5));
                ofFloat2.setDuration(250L);
                this.H.playTogether(ofFloat2);
            }
            this.H.start();
        }
        if (b4Var2 == null && this.V.T5 >= 0) {
            if (org.telegram.ui.ActionBar.h6.I.q() == this.G) {
                N0 = org.telegram.ui.ActionBar.h6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.h6.N0(string3) != null && !org.telegram.ui.ActionBar.h6.N0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.h6.N0(string4) != null && org.telegram.ui.ActionBar.h6.N0(string4).q()) {
                    str = string4;
                }
                if (this.G) {
                    N0 = org.telegram.ui.ActionBar.h6.N0(str);
                } else {
                    N0 = org.telegram.ui.ActionBar.h6.N0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.h6.t(N0, false, this.G);
        } else {
            c10 = 0;
        }
        int i18 = AndroidUtilities.calcDrawableColor(this.f38508n)[c10];
        e();
        f();
        g(this.f38508n);
        k(1.0f);
    }

    public final void k(float f7) {
        int b10;
        int b11;
        int b12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f38505b.isEmpty()) {
            Paint G = G("paintChatActionBackground");
            Paint G2 = G("paintChatActionBackgroundSelected");
            Paint G3 = G("paintChatMessageBackgroundSelected");
            int i10 = this.Q;
            int i11 = -1;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.h6.f19155ic, true);
            }
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.h6.f19173jc, true);
            }
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.h6.f19173jc, true);
            }
            if (!this.R) {
                i11 = b(org.telegram.ui.ActionBar.h6.f19193kc, true);
            }
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                i10 = i0.a.d(f7, this.O, i10);
                b10 = i0.a.d(f7, this.K, b10);
                b11 = i0.a.d(f7, this.L, b11);
                b12 = i0.a.d(f7, this.M, b12);
                i11 = i0.a.d(f7, this.N, i11);
            }
            if (G != null && !this.R) {
                G.setColor(i10);
                G2.setColor(i10);
            }
            Paint G4 = G("paintChatActionText");
            if (G4 != null) {
                ((TextPaint) G4).linkColor = b11;
                G("paintChatActionText").setColor(b10);
                G("paintChatBotButton").setColor(b12);
            }
            org.telegram.ui.ActionBar.h6.w1(b10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.h6.w1(b10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.h6.w1(b10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.h6.w1(b10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.h6.w1(b10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.h6.w1(b10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.h6.w1(i11, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.h6.w1(i11, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.h6.w1(i11, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.h6.w1(i11, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.h6.w1(i11, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.h6.w1(i11, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.h6.w1(i11, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.h6.w1(i11, getDrawable("drawableShareIcon"));
            if (this.f38512x != null && (bitmap = this.v) != null) {
                Rect rect = this.U;
                Rect rect2 = this.T;
                if (i12 != 0 && (bitmap2 = this.P) != null) {
                    this.F = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.P.getHeight());
                    rect.set(0, 0, this.f38510s.getWidth(), this.f38510s.getHeight());
                    this.f38512x.drawBitmap(this.P, rect2, rect, (Paint) null);
                    Paint paint = this.f38511w;
                    paint.setAlpha((int) (f7 * 255.0f));
                    rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                    rect.set(0, 0, this.f38510s.getWidth(), this.f38510s.getHeight());
                    this.f38512x.drawBitmap(this.v, rect2, rect, paint);
                    if (G != null) {
                        G.setShader(this.f38513y);
                        G2.setShader(this.f38513y);
                    }
                    if (G3 != null) {
                        G3.setShader(this.f38513y);
                        return;
                    }
                    return;
                }
                this.F = true;
                rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f38510s.getWidth(), this.f38510s.getHeight());
                this.f38512x.drawBitmap(this.v, rect2, rect, (Paint) null);
                if (G != null) {
                    G.setShader(this.E);
                    G2.setShader(this.E);
                }
                if (G3 != null) {
                    G3.setShader(this.E);
                }
            }
        }
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.f38508n != null && (bitmap = this.f38510s) != null && (bitmapShader = this.f38513y) != null) {
            boolean z10 = this.F;
            Matrix matrix = this.f38506c;
            if (z10) {
                org.telegram.ui.ActionBar.h6.r(this.v, this.E, matrix, i10, i11, f7, f10);
                return;
            } else {
                org.telegram.ui.ActionBar.h6.r(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
                return;
            }
        }
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean p0() {
        if (this.f38508n != null) {
            if (this.f38513y != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.h6.a1();
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.h6.f19388v3;
    }
}
