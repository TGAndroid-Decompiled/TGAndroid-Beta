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
public final class xn implements org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.tb0 {
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
    public final zn S;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.e4 f40028f;
    public TLRPC.WallPaper h;
    public Drawable f40029n;
    public ValueAnimator f40030r;
    public Bitmap f40031s;
    public Bitmap v;
    public Canvas f40033x;
    public BitmapShader f40034y;
    public final HashMap f40025a = new HashMap();
    public final HashMap f40026b = new HashMap();
    public final Matrix f40027c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f40032w = new Paint();
    public final Rect Q = new Rect();
    public final Rect R = new Rect();
    public boolean D = org.telegram.ui.ActionBar.j6.I.q();

    public xn(zn znVar) {
        int i10;
        int i11;
        this.S = znVar;
        if (h(false)) {
            i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            this.f40028f = ChatThemeController.getInstance(i10).getDialogTheme(znVar.Q5);
            i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(znVar.Q5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.e4 e4Var = this.f40028f;
            if (e4Var != null || dialogWallpaper != null) {
                j(e4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new cg.n0(23));
            }
        }
        if (ThemeEditorView.f23165n == null) {
            org.telegram.ui.ActionBar.j6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new cg.n0(23));
    }

    @Override
    public final Paint G(String str) {
        if (this.f40028f == null && this.f40029n == null) {
            return null;
        }
        return (Paint) this.f40026b.get(str);
    }

    @Override
    public final void J0(int i10, int i11) {
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
        if (this.f40028f == null && this.f40029n == null) {
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
        return this.f40028f;
    }

    public final Drawable d() {
        Drawable drawable = this.f40029n;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.j6.s0();
    }

    @Override
    public final int d0(int i10) {
        return x0(i10);
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
                this.f40025a.put((String) entry.getKey(), g5Var);
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
            this.f40026b.put((String) entry.getKey(), paint);
        }
    }

    @Override
    public final int f1(int i10) {
        return b(i10, false);
    }

    public final void g(android.graphics.drawable.Drawable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.g(android.graphics.drawable.Drawable):void");
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f40025a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    public final boolean h(boolean z4) {
        TLRPC.User user;
        zn znVar = this.S;
        if (znVar.h == null) {
            if (z4) {
                if (znVar.e == null && (user = znVar.f40575f) != null && !user.bot) {
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
        zn znVar = this.S;
        e5Var = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
        if (e5Var != null && znVar.Z9 == null) {
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = this.D;
            }
            if (e4Var != null) {
                bVar = e4Var.f19640c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.e4 e4Var2 = this.f40028f;
            if (e4Var2 != null) {
                bVar2 = e4Var2.f19640c;
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
            org.telegram.ui.ActionBar.e4 e4Var3 = this.f40028f;
            int i10 = -1;
            if (e4Var3 == null && this.h == null) {
                Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
                this.O = s02 instanceof org.telegram.ui.Components.ec0;
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
                    w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012kc, false);
                }
                this.K = w05;
            } else {
                if (this.O) {
                    Drawable drawable = this.f40029n;
                    if (drawable instanceof org.telegram.ui.Components.ec0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.ec0) drawable).f24580k;
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
                Drawable drawable2 = this.f40029n;
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
                i10 = b(org.telegram.ui.ActionBar.j6.f20012kc, true);
            }
            this.K = i10;
            if (e4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.f40029n)[0];
                e();
                f();
            }
            d5Var.f19611f = false;
            if (znVar.Q5 < 0) {
                d5Var.f19612g = false;
            }
            d5Var.h = new cg.u0(this, e4Var, wallPaper, z4, 8);
            if (z4) {
                d5Var.f19615k = new un(this);
                d5Var.f19613i = new sn(this, 0);
                d5Var.f19614j = new sn(this, 1);
            } else {
                if (znVar.U0 != null) {
                    znVar.ec();
                }
                d5Var.h.run();
            }
            d5Var.e = true;
            d5Var.f19617m = this;
            d5Var.f19616l = 250L;
            e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar).parentLayout;
            ((ActionBarLayout) e5Var2).f(d5Var, null);
        }
    }

    public final void j(org.telegram.ui.ActionBar.e4 e4Var, TLRPC.WallPaper wallPaper, boolean z4) {
        Drawable drawable;
        org.telegram.ui.Components.ec0 ec0Var;
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
        zn znVar = this.S;
        if (znVar.Z9 != null) {
            return;
        }
        this.f40028f = e4Var2;
        this.h = wallPaper;
        if (znVar.fragmentView != null) {
            drawable = znVar.U0.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.ec0) {
            ec0Var = (org.telegram.ui.Components.ec0) drawable;
        } else {
            ec0Var = null;
        }
        if (ec0Var != null) {
            i10 = ec0Var.f24578i;
        } else {
            i10 = 0;
        }
        if ((e4Var2 == null || e4Var2.f19638a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.j6.rl.indexOfKey(org.telegram.ui.ActionBar.j6.f20030lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.j6.rl.valueAt(indexOfKey);
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.f19820a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (e4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f40026b.clear();
            this.f40025a.clear();
            Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
            if (s02 instanceof org.telegram.ui.Components.ec0) {
                ((org.telegram.ui.Components.ec0) s02).v(i10);
            }
            this.f40029n = null;
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
            g(this.f40029n);
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
            Drawable drawable3 = this.f40029n;
            i13 = ((org.telegram.ui.ActionBar.p2) this.S).currentAccount;
            this.f40029n = ph.k5.f(drawable3, i13, this.h, this.D);
        } else if (wallPaper != null) {
            this.f40029n = co.d(this.f40029n, wallPaper, this.D);
        } else {
            if (e4Var2.f19638a) {
                org.telegram.ui.ActionBar.i6 e = org.telegram.ui.ActionBar.e4.e(this.D);
                i12 = ((org.telegram.ui.ActionBar.p2) this.S).currentAccount;
                org.telegram.ui.ActionBar.j6.H(e, e4Var2.h(i12, this.D ? 1 : 0), ((org.telegram.ui.ActionBar.d4) e4Var2.f19641f.get(this.D ? 1 : 0)).f19600g, i10, false);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int x02 = x0(org.telegram.ui.ActionBar.j6.Nd);
                int x03 = x0(org.telegram.ui.ActionBar.j6.Od);
                int x04 = x0(org.telegram.ui.ActionBar.j6.Pd);
                int x05 = x0(org.telegram.ui.ActionBar.j6.Qd);
                org.telegram.ui.Components.ec0 ec0Var2 = new org.telegram.ui.Components.ec0();
                ec0Var2.t(ec0Var2.f24590u, e4Var2.k(this.D ? 1 : 0).settings.intensity);
                TLRPC.Document f10 = e4Var2.f();
                if (ec0Var2.f24593y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    ec0Var2.f24593y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = ec0Var2.f24573c;
                    if (weakReference != null) {
                        ec0Var2.f24593y.setParentView((View) weakReference.get());
                    }
                    if (ec0Var2.T) {
                        ec0Var2.f24593y.onAttachedToWindow();
                    }
                }
                ec0Var2.f24593y.setImage(ImageLocation.getForDocument(f10), "80_80", null, null, null, 0);
                ec0Var2.f24593y.setAutoRepeatCount(1);
                ec0Var2.f24593y.setAutoRepeat(1);
                ec0Var2.o(x02, x03, x04, x05, 0, true);
                ec0Var2.v(i10);
                int f11 = ec0Var2.f();
                boolean z11 = this.D;
                mg.w wVar = new mg.w(20, this, ec0Var2);
                org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) e4Var2.f19641f.get(z11 ? 1 : 0);
                if (d4Var != null && d4Var.f19598c != null) {
                    long i15 = e4Var2.i(z11 ? 1 : 0);
                    TL_stars.StarGift starGift = d4Var.f19598c.gift;
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
                e4Var2.o(this.D ? 1 : 0, new org.telegram.messenger.k2(this, e4Var2, z10, ec0Var2, f11));
                drawable2 = ec0Var2;
            }
            this.f40029n = drawable2;
        }
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4) {
            this.E = new AnimatorSet();
            if (ec0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new tn(ec0Var, 0));
                ofFloat.addListener(new vn(ec0Var));
                ofFloat.setDuration(200L);
                this.E.playTogether(ofFloat);
            }
            Drawable drawable4 = this.f40029n;
            if (drawable4 instanceof org.telegram.ui.Components.ec0) {
                org.telegram.ui.Components.ec0 ec0Var3 = (org.telegram.ui.Components.ec0) drawable4;
                ec0Var3.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new tn(ec0Var3, 1));
                ofFloat2.addListener(new wn(ec0Var3));
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
        int i19 = AndroidUtilities.calcDrawableColor(this.f40029n)[c3];
        e();
        f();
        g(this.f40029n);
        k(1.0f);
    }

    public final void k(float f10) {
        int b10;
        int b11;
        int b12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f40026b.isEmpty()) {
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
                i11 = b(org.telegram.ui.ActionBar.j6.f20012kc, true);
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
            if (this.f40033x != null && (bitmap = this.v) != null) {
                Rect rect = this.R;
                Rect rect2 = this.Q;
                if (i12 != 0 && (bitmap2 = this.M) != null) {
                    this.C = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.M.getHeight());
                    rect.set(0, 0, this.f40031s.getWidth(), this.f40031s.getHeight());
                    this.f40033x.drawBitmap(this.M, rect2, rect, (Paint) null);
                    Paint paint = this.f40032w;
                    paint.setAlpha((int) (f10 * 255.0f));
                    rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                    rect.set(0, 0, this.f40031s.getWidth(), this.f40031s.getHeight());
                    this.f40033x.drawBitmap(this.v, rect2, rect, paint);
                    if (G != null) {
                        G.setShader(this.f40034y);
                        G2.setShader(this.f40034y);
                    }
                    if (G3 != null) {
                        G3.setShader(this.f40034y);
                        return;
                    }
                    return;
                }
                this.C = true;
                rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f40031s.getWidth(), this.f40031s.getHeight());
                this.f40033x.drawBitmap(this.v, rect2, rect, (Paint) null);
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
        if (this.f40029n != null && (bitmap = this.f40031s) != null && (bitmapShader = this.f40034y) != null) {
            boolean z4 = this.C;
            Matrix matrix = this.f40027c;
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
        if (this.f40029n != null) {
            if (this.f40034y != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.j6.a1();
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.f20197v3;
    }

    @Override
    public final int x0(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f40028f == null) {
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
