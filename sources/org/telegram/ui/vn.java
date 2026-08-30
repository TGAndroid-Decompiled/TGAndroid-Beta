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
public final class vn implements org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.sb0 {
    public BitmapShader B;
    public boolean C;
    public AnimatorSet E;
    public org.telegram.ui.ActionBar.g5 F;
    public org.telegram.ui.ActionBar.g5 G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public Bitmap M;
    public int N;
    public boolean O;
    public boolean P;
    public final xn S;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.e4 f39218f;
    public TLRPC.WallPaper h;
    public Drawable f39219n;
    public ValueAnimator f39220r;
    public Bitmap f39221s;
    public Bitmap v;
    public Canvas f39223x;
    public BitmapShader f39224y;
    public final HashMap f39215a = new HashMap();
    public final HashMap f39216b = new HashMap();
    public final Matrix f39217c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f39222w = new Paint();
    public final Rect Q = new Rect();
    public final Rect R = new Rect();
    public boolean D = org.telegram.ui.ActionBar.j6.I.q();

    public vn(xn xnVar) {
        int i10;
        int i11;
        this.S = xnVar;
        if (h(false)) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            this.f39218f = ChatThemeController.getInstance(i10).getDialogTheme(xnVar.Q5);
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(xnVar.Q5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.e4 e4Var = this.f39218f;
            if (e4Var != null || dialogWallpaper != null) {
                j(e4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new cg.n0(23));
            }
        }
        if (ThemeEditorView.f23192n == null) {
            org.telegram.ui.ActionBar.j6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new cg.n0(23));
    }

    @Override
    public final Paint G(String str) {
        if (this.f39218f == null && this.f39219n == null) {
            return null;
        }
        return (Paint) this.f39216b.get(str);
    }

    @Override
    public final void K0(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    public final int b(int i10, boolean z4) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f39218f == null && this.f39219n == null) {
            return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        if (!z4 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public final org.telegram.ui.ActionBar.e4 c() {
        return this.f39218f;
    }

    @Override
    public final int c0(int i10) {
        return x0(i10);
    }

    public final Drawable d() {
        Drawable drawable = this.f39219n;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.j6.s0();
    }

    public final void e() {
        Drawable g5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.jl.entrySet()) {
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
                    g5Var = new org.telegram.ui.ActionBar.g5(0, false, false, this);
                    break;
                case 1:
                    g5Var = new org.telegram.ui.ActionBar.g5(1, false, false, this);
                    break;
                case 2:
                    g5Var = new org.telegram.ui.ActionBar.g5(1, false, true, this);
                    break;
                case 3:
                    g5Var = new org.telegram.ui.ActionBar.g5(1, true, false, this);
                    break;
                case 4:
                    g5Var = new org.telegram.ui.ActionBar.g5(0, true, true, this);
                    break;
                case 5:
                    g5Var = new org.telegram.ui.ActionBar.g5(1, true, true, this);
                    break;
                case 6:
                    g5Var = new org.telegram.ui.ActionBar.g5(0, false, true, this);
                    break;
                case 7:
                    g5Var = new org.telegram.ui.ActionBar.g5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        g5Var = constantState.newDrawable().mutate();
                    } else {
                        g5Var = null;
                    }
                    if (g5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.j6.kl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.j6.w1(x0(intValue), g5Var);
                            break;
                        }
                    }
                    break;
            }
            if (g5Var != null) {
                this.f39215a.put((String) entry.getKey(), g5Var);
            }
        }
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.ll.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.j6.ml.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(x0(intValue));
            }
            this.f39216b.put((String) entry.getKey(), paint);
        }
    }

    public final void g(android.graphics.drawable.Drawable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vn.g(android.graphics.drawable.Drawable):void");
    }

    @Override
    public final int g1(int i10) {
        return b(i10, false);
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f39215a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    public final boolean h(boolean z4) {
        TLRPC.User user;
        xn xnVar = this.S;
        if (xnVar.h == null) {
            if (z4) {
                if (xnVar.e == null && (user = xnVar.f40009f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void i(org.telegram.ui.ActionBar.e4 e4Var, TLRPC.WallPaper wallPaper, boolean z4, Boolean bool, boolean z10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        boolean z11;
        sf.b bVar;
        sf.b bVar2;
        org.telegram.ui.ActionBar.i6 A0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int b10;
        int b11;
        int b12;
        org.telegram.ui.ActionBar.e5 e5Var2;
        int w02;
        int w03;
        int w04;
        int w05;
        xn xnVar = this.S;
        e5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
        if (e5Var != null && xnVar.Z9 == null) {
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = this.D;
            }
            if (e4Var != null) {
                bVar = e4Var.f19665c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.e4 e4Var2 = this.f39218f;
            if (e4Var2 != null) {
                bVar2 = e4Var2.f19665c;
            } else {
                bVar2 = null;
            }
            TLRPC.WallPaper wallPaper2 = this.h;
            if (!z10) {
                if (h(false)) {
                    if (sf.b.a(bVar2, bVar) && this.D == z11 && ChatThemeController.equals(wallPaper, wallPaper2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.D = z11;
            if (z11) {
                A0 = org.telegram.ui.ActionBar.j6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.j6.A0();
            }
            org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(A0, A0.V, A0.q(), !z4);
            org.telegram.ui.ActionBar.e4 e4Var3 = this.f39218f;
            int i10 = -1;
            if (e4Var3 == null && this.h == null) {
                Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
                this.O = s02 instanceof org.telegram.ui.Components.dc0;
                g(s02);
                if (this.O) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ic, false);
                }
                this.H = w02;
                if (this.O) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jc, false);
                }
                this.I = w03;
                if (this.O) {
                    w04 = -1;
                } else {
                    w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jc, false);
                }
                this.J = w04;
                if (this.O) {
                    w05 = -1;
                } else {
                    w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20037kc, false);
                }
                this.K = w05;
            } else {
                if (this.O) {
                    Drawable drawable = this.f39219n;
                    if (drawable instanceof org.telegram.ui.Components.dc0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.dc0) drawable).f24241k;
                        this.M = bitmap;
                        if (e4Var3 != null) {
                            TLRPC.ChatTheme chatTheme = e4Var3.d;
                            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                    if (tL_starGiftUnique != null && this.D) {
                                        this.M = Bitmap.createBitmap(bitmap);
                                        new Canvas(this.M).drawColor(-870178270);
                                    }
                                }
                            }
                            tL_starGiftUnique = null;
                            if (tL_starGiftUnique != null) {
                                this.M = Bitmap.createBitmap(bitmap);
                                new Canvas(this.M).drawColor(-870178270);
                            }
                        }
                    }
                }
                Drawable drawable2 = this.f39219n;
                if (drawable2 != null) {
                    g(drawable2);
                }
            }
            this.L = this.N;
            if (this.O) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.j6.ic, true);
            }
            this.H = b10;
            if (this.O) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.j6.jc, true);
            }
            this.I = b11;
            if (this.O) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.j6.jc, true);
            }
            this.J = b12;
            if (!this.O) {
                i10 = b(org.telegram.ui.ActionBar.j6.f20037kc, true);
            }
            this.K = i10;
            if (e4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.f39219n)[0];
                e();
                f();
            }
            d5Var.f19636f = false;
            if (xnVar.Q5 < 0) {
                d5Var.f19637g = false;
            }
            d5Var.h = new cg.u0(this, e4Var, wallPaper, z4, 8);
            if (z4) {
                d5Var.f19640k = new sn(this);
                d5Var.f19638i = new qn(this, 0);
                d5Var.f19639j = new qn(this, 1);
            } else {
                if (xnVar.U0 != null) {
                    xnVar.ec();
                }
                d5Var.h.run();
            }
            d5Var.e = true;
            d5Var.f19642m = this;
            d5Var.f19641l = 250L;
            e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
            ((ActionBarLayout) e5Var2).f(d5Var, null);
        }
    }

    public final void j(org.telegram.ui.ActionBar.e4 e4Var, TLRPC.WallPaper wallPaper, boolean z4) {
        Drawable drawable;
        org.telegram.ui.Components.dc0 dc0Var;
        int i10;
        int i11;
        boolean z10;
        Drawable drawable2;
        int i12;
        char c3;
        org.telegram.ui.ActionBar.i6 N0;
        int i13;
        org.telegram.ui.ActionBar.i6 N02;
        org.telegram.ui.ActionBar.e4 e4Var2 = e4Var;
        xn xnVar = this.S;
        if (xnVar.Z9 != null) {
            return;
        }
        this.f39218f = e4Var2;
        this.h = wallPaper;
        if (xnVar.fragmentView != null) {
            drawable = xnVar.U0.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.dc0) {
            dc0Var = (org.telegram.ui.Components.dc0) drawable;
        } else {
            dc0Var = null;
        }
        if (dc0Var != null) {
            i10 = dc0Var.f24239i;
        } else {
            i10 = 0;
        }
        if ((e4Var2 == null || e4Var2.f19663a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.j6.rl.indexOfKey(org.telegram.ui.ActionBar.j6.f20055lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.j6.rl.valueAt(indexOfKey);
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.f19845a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (e4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f39216b.clear();
            this.f39215a.clear();
            Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
            if (s02 instanceof org.telegram.ui.Components.dc0) {
                ((org.telegram.ui.Components.dc0) s02).v(i10);
            }
            this.f39219n = null;
            if (org.telegram.ui.ActionBar.j6.I.q() == this.D) {
                N02 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string) != null && !org.telegram.ui.ActionBar.j6.N0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string2) != null && org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                    str = string2;
                }
                if (this.D) {
                    N02 = org.telegram.ui.ActionBar.j6.N0(str);
                } else {
                    N02 = org.telegram.ui.ActionBar.j6.N0(str2);
                }
            }
            org.telegram.ui.ActionBar.j6.t(N02, false, this.D);
            g(this.f39219n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.j6.J(ApplicationLoader.applicationContext, false);
        }
        if (e4Var2 != null) {
            i11 = ((org.telegram.ui.ActionBar.p2) this.S).currentAccount;
            this.d = e4Var2.b(i11, this.D ? 1 : 0);
        } else {
            this.d = new SparseIntArray();
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable3 = this.f39219n;
            i13 = ((org.telegram.ui.ActionBar.p2) this.S).currentAccount;
            this.f39219n = ph.l5.f(drawable3, i13, this.h, this.D);
        } else if (wallPaper != null) {
            this.f39219n = ao.d(this.f39219n, wallPaper, this.D);
        } else {
            if (e4Var2.f19663a) {
                org.telegram.ui.ActionBar.i6 e = org.telegram.ui.ActionBar.e4.e(this.D);
                i12 = ((org.telegram.ui.ActionBar.p2) this.S).currentAccount;
                org.telegram.ui.ActionBar.j6.H(e, e4Var2.h(i12, this.D ? 1 : 0), ((org.telegram.ui.ActionBar.d4) e4Var2.f19666f.get(this.D ? 1 : 0)).f19625g, i10, false);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int x02 = x0(org.telegram.ui.ActionBar.j6.Nd);
                int x03 = x0(org.telegram.ui.ActionBar.j6.Od);
                int x04 = x0(org.telegram.ui.ActionBar.j6.Pd);
                int x05 = x0(org.telegram.ui.ActionBar.j6.Qd);
                org.telegram.ui.Components.dc0 dc0Var2 = new org.telegram.ui.Components.dc0();
                dc0Var2.t(dc0Var2.f24251u, e4Var2.k(this.D ? 1 : 0).settings.intensity);
                TLRPC.Document f10 = e4Var2.f();
                if (dc0Var2.f24254y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    dc0Var2.f24254y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = dc0Var2.f24234c;
                    if (weakReference != null) {
                        dc0Var2.f24254y.setParentView((View) weakReference.get());
                    }
                    if (dc0Var2.T) {
                        dc0Var2.f24254y.onAttachedToWindow();
                    }
                }
                dc0Var2.f24254y.setImage(ImageLocation.getForDocument(f10), "80_80", null, null, null, 0);
                dc0Var2.f24254y.setAutoRepeatCount(1);
                dc0Var2.f24254y.setAutoRepeat(1);
                dc0Var2.o(x02, x03, x04, x05, 0, true);
                dc0Var2.v(i10);
                int f11 = dc0Var2.f();
                boolean z11 = this.D;
                mg.w wVar = new mg.w(20, this, dc0Var2);
                org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) e4Var2.f19666f.get(z11 ? 1 : 0);
                if (d4Var != null && d4Var.f19623c != null) {
                    long i15 = e4Var2.i(z11 ? 1 : 0);
                    TL_stars.StarGift starGift = d4Var.f19623c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
                    if (arrayList != null && document == null) {
                        int size = arrayList.size();
                        z10 = z11 ? 1 : 0;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i16);
                            int i17 = i16 + 1;
                            int i18 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i18;
                                i16 = i17;
                            }
                        }
                    } else {
                        z10 = z11 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new f3.e(wVar, i15, 2));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                } else {
                    z10 = z11 ? 1 : 0;
                }
                e4Var2 = e4Var;
                e4Var2.o(this.D ? 1 : 0, new org.telegram.messenger.k2(this, e4Var2, z10, dc0Var2, f11));
                drawable2 = dc0Var2;
            }
            this.f39219n = drawable2;
        }
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4) {
            this.E = new AnimatorSet();
            if (dc0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new rn(dc0Var, 0));
                ofFloat.addListener(new tn(dc0Var));
                ofFloat.setDuration(200L);
                this.E.playTogether(ofFloat);
            }
            Drawable drawable4 = this.f39219n;
            if (drawable4 instanceof org.telegram.ui.Components.dc0) {
                org.telegram.ui.Components.dc0 dc0Var3 = (org.telegram.ui.Components.dc0) drawable4;
                dc0Var3.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new rn(dc0Var3, 1));
                ofFloat2.addListener(new un(dc0Var3));
                ofFloat2.setDuration(250L);
                this.E.playTogether(ofFloat2);
            }
            this.E.start();
        }
        if (e4Var2 == null && this.S.Q5 >= 0) {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.D) {
                N0 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string3) != null && !org.telegram.ui.ActionBar.j6.N0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string4) != null && org.telegram.ui.ActionBar.j6.N0(string4).q()) {
                    str = string4;
                }
                if (this.D) {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str);
                } else {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str2);
                }
            }
            c3 = 0;
            org.telegram.ui.ActionBar.j6.t(N0, false, this.D);
        } else {
            c3 = 0;
        }
        int i19 = AndroidUtilities.calcDrawableColor(this.f39219n)[c3];
        e();
        f();
        g(this.f39219n);
        k(1.0f);
    }

    public final void k(float f10) {
        int b10;
        int b11;
        int b12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f39216b.isEmpty()) {
            Paint G = G("paintChatActionBackground");
            Paint G2 = G("paintChatActionBackgroundSelected");
            Paint G3 = G("paintChatMessageBackgroundSelected");
            int i10 = this.N;
            int i11 = -1;
            if (this.O) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.j6.ic, true);
            }
            if (this.O) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.j6.jc, true);
            }
            if (this.O) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.j6.jc, true);
            }
            if (!this.O) {
                i11 = b(org.telegram.ui.ActionBar.j6.f20037kc, true);
            }
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                i10 = i0.a.d(f10, this.L, i10);
                b10 = i0.a.d(f10, this.H, b10);
                b11 = i0.a.d(f10, this.I, b11);
                b12 = i0.a.d(f10, this.J, b12);
                i11 = i0.a.d(f10, this.K, i11);
            }
            if (G != null && !this.O) {
                G.setColor(i10);
                G2.setColor(i10);
            }
            Paint G4 = G("paintChatActionText");
            if (G4 != null) {
                ((TextPaint) G4).linkColor = b11;
                G("paintChatActionText").setColor(b10);
                G("paintChatBotButton").setColor(b12);
            }
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.j6.w1(i11, getDrawable("drawableShareIcon"));
            if (this.f39223x != null && (bitmap = this.v) != null) {
                Rect rect = this.R;
                Rect rect2 = this.Q;
                if (i12 != 0 && (bitmap2 = this.M) != null) {
                    this.C = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.M.getHeight());
                    rect.set(0, 0, this.f39221s.getWidth(), this.f39221s.getHeight());
                    this.f39223x.drawBitmap(this.M, rect2, rect, (Paint) null);
                    Paint paint = this.f39222w;
                    paint.setAlpha((int) (f10 * 255.0f));
                    rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                    rect.set(0, 0, this.f39221s.getWidth(), this.f39221s.getHeight());
                    this.f39223x.drawBitmap(this.v, rect2, rect, paint);
                    if (G != null) {
                        G.setShader(this.f39224y);
                        G2.setShader(this.f39224y);
                    }
                    if (G3 != null) {
                        G3.setShader(this.f39224y);
                        return;
                    }
                    return;
                }
                this.C = true;
                rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f39221s.getWidth(), this.f39221s.getHeight());
                this.f39223x.drawBitmap(this.v, rect2, rect, (Paint) null);
                if (G != null) {
                    G.setShader(this.B);
                    G2.setShader(this.B);
                }
                if (G3 != null) {
                    G3.setShader(this.B);
                }
            }
        }
    }

    @Override
    public final void l(float f10, float f11, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.f39219n != null && (bitmap = this.f39221s) != null && (bitmapShader = this.f39224y) != null) {
            boolean z4 = this.C;
            Matrix matrix = this.f39217c;
            if (z4) {
                org.telegram.ui.ActionBar.j6.r(this.v, this.B, matrix, i10, i11, f10, f11);
                return;
            } else {
                org.telegram.ui.ActionBar.j6.r(bitmap, bitmapShader, matrix, i10, i11, f10, f11);
                return;
            }
        }
        org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
    }

    @Override
    public final boolean m0() {
        if (this.f39219n != null) {
            if (this.f39224y != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.j6.a1();
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20222v3;
    }

    @Override
    public final int x0(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f39218f == null) {
            return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.j6.ol.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }
}
