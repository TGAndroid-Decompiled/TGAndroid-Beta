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
public final class xn implements org.telegram.ui.ActionBar.e6, org.telegram.ui.Components.sc0 {
    public BitmapShader E;
    public boolean F;
    public AnimatorSet H;
    public org.telegram.ui.ActionBar.f5 I;
    public org.telegram.ui.ActionBar.f5 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public Bitmap P;
    public int Q;
    public boolean R;
    public boolean S;
    public final zn V;
    public SparseIntArray f44115e;
    public org.telegram.ui.ActionBar.c4 f44116f;
    public TLRPC.WallPaper h;
    public Drawable f44117n;
    public ValueAnimator f44118r;
    public Bitmap f44119s;
    public Bitmap v;
    public Canvas f44121x;
    public BitmapShader f44122y;
    public final HashMap f44112a = new HashMap();
    public final HashMap f44113b = new HashMap();
    public final Matrix f44114c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f44120w = new Paint();
    public final Rect T = new Rect();
    public final Rect U = new Rect();
    public boolean G = org.telegram.ui.ActionBar.i6.I.q();

    public xn(zn znVar) {
        int i10;
        int i11;
        this.V = znVar;
        if (h(false)) {
            i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            this.f44116f = ChatThemeController.getInstance(i10).getDialogTheme(znVar.T5);
            i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(znVar.T5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.c4 c4Var = this.f44116f;
            if (c4Var != null || dialogWallpaper != null) {
                j(c4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ai.f(20));
            }
        }
        if (ThemeEditorView.f24352n == null) {
            org.telegram.ui.ActionBar.i6.o1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ai.f(20));
    }

    @Override
    public final Paint F(String str) {
        if (this.f44116f == null && this.f44117n == null) {
            return null;
        }
        return (Paint) this.f44113b.get(str);
    }

    @Override
    public final void I0(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f44115e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.i6.I.q();
    }

    @Override
    public final int a1(int i10) {
        return b(i10, false);
    }

    public final int b(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f44116f == null && this.f44117n == null) {
            return org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.f44115e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.f44115e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }

    public final org.telegram.ui.ActionBar.c4 c() {
        return this.f44116f;
    }

    @Override
    public final int c0(int i10) {
        return x0(i10);
    }

    public final Drawable d() {
        Drawable drawable = this.f44117n;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.i6.t0();
    }

    public final void e() {
        Drawable f5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.i6.ml.entrySet()) {
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
                    f5Var = new org.telegram.ui.ActionBar.f5(0, false, false, this);
                    break;
                case 1:
                    f5Var = new org.telegram.ui.ActionBar.f5(1, false, false, this);
                    break;
                case 2:
                    f5Var = new org.telegram.ui.ActionBar.f5(1, false, true, this);
                    break;
                case 3:
                    f5Var = new org.telegram.ui.ActionBar.f5(1, true, false, this);
                    break;
                case 4:
                    f5Var = new org.telegram.ui.ActionBar.f5(0, true, true, this);
                    break;
                case 5:
                    f5Var = new org.telegram.ui.ActionBar.f5(1, true, true, this);
                    break;
                case 6:
                    f5Var = new org.telegram.ui.ActionBar.f5(0, false, true, this);
                    break;
                case 7:
                    f5Var = new org.telegram.ui.ActionBar.f5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        f5Var = constantState.newDrawable().mutate();
                    } else {
                        f5Var = null;
                    }
                    if (f5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.i6.nl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.i6.x1(x0(intValue), f5Var);
                            break;
                        }
                    }
                    break;
            }
            if (f5Var != null) {
                this.f44112a.put((String) entry.getKey(), f5Var);
            }
        }
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.i6.ol.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.i6.pl.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(x0(intValue));
            }
            this.f44113b.put((String) entry.getKey(), paint);
        }
    }

    public final void g(android.graphics.drawable.Drawable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.g(android.graphics.drawable.Drawable):void");
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f44112a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    public final boolean h(boolean z10) {
        TLRPC.User user;
        zn znVar = this.V;
        if (znVar.h == null) {
            if (z10) {
                if (znVar.f44797e == null && (user = znVar.f44809f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void i(org.telegram.ui.ActionBar.c4 c4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.d5 d5Var;
        boolean z12;
        fg.b bVar;
        fg.b bVar2;
        org.telegram.ui.ActionBar.h6 B0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int b10;
        int b11;
        int b12;
        org.telegram.ui.ActionBar.d5 d5Var2;
        int x02;
        int x03;
        int x04;
        int x05;
        zn znVar = this.V;
        d5Var = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
        if (d5Var != null && znVar.f44782ca == null) {
            if (bool != null) {
                z12 = bool.booleanValue();
            } else {
                z12 = this.G;
            }
            if (c4Var != null) {
                bVar = c4Var.f20511c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.c4 c4Var2 = this.f44116f;
            if (c4Var2 != null) {
                bVar2 = c4Var2.f20511c;
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
                B0 = org.telegram.ui.ActionBar.i6.J;
            } else {
                B0 = org.telegram.ui.ActionBar.i6.B0();
            }
            org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(B0, B0.Y, B0.q(), !z10);
            org.telegram.ui.ActionBar.c4 c4Var3 = this.f44116f;
            int i10 = -1;
            if (c4Var3 == null && this.h == null) {
                Drawable t02 = org.telegram.ui.ActionBar.i6.t0();
                this.R = t02 instanceof org.telegram.ui.Components.dd0;
                g(t02);
                if (this.R) {
                    x02 = -1;
                } else {
                    x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20898ic, false);
                }
                this.K = x02;
                if (this.R) {
                    x03 = -1;
                } else {
                    x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20916jc, false);
                }
                this.L = x03;
                if (this.R) {
                    x04 = -1;
                } else {
                    x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20916jc, false);
                }
                this.M = x04;
                if (this.R) {
                    x05 = -1;
                } else {
                    x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20935kc, false);
                }
                this.N = x05;
            } else {
                if (this.R) {
                    Drawable drawable = this.f44117n;
                    if (drawable instanceof org.telegram.ui.Components.dd0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.dd0) drawable).f25666k;
                        this.P = bitmap;
                        if (c4Var3 != null) {
                            TLRPC.ChatTheme chatTheme = c4Var3.d;
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
                Drawable drawable2 = this.f44117n;
                if (drawable2 != null) {
                    g(drawable2);
                }
            }
            this.O = this.Q;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.i6.f20898ic, true);
            }
            this.K = b10;
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.i6.f20916jc, true);
            }
            this.L = b11;
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.i6.f20916jc, true);
            }
            this.M = b12;
            if (!this.R) {
                i10 = b(org.telegram.ui.ActionBar.i6.f20935kc, true);
            }
            this.N = i10;
            if (c4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.f44117n)[0];
                e();
                f();
            }
            c5Var.f20519f = false;
            if (znVar.T5 < 0) {
                c5Var.f20520g = false;
            }
            c5Var.h = new ai.t4(this, c4Var, wallPaper, z10, 13);
            if (z10) {
                c5Var.f20523k = new un(this);
                c5Var.f20521i = new sn(this, 0);
                c5Var.f20522j = new sn(this, 1);
            } else {
                if (znVar.X0 != null) {
                    znVar.ic();
                }
                c5Var.h.run();
            }
            c5Var.f20518e = true;
            c5Var.f20525m = this;
            c5Var.f20524l = 250L;
            d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar).parentLayout;
            ((ActionBarLayout) d5Var2).f(c5Var, null);
        }
    }

    public final void j(org.telegram.ui.ActionBar.c4 c4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.dd0 dd0Var;
        int i10;
        int i11;
        boolean z11;
        org.telegram.ui.Components.dd0 dd0Var2;
        Drawable drawable2;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.h6 O0;
        int i13;
        org.telegram.ui.ActionBar.h6 O02;
        org.telegram.ui.ActionBar.c4 c4Var2 = c4Var;
        zn znVar = this.V;
        if (znVar.f44782ca != null) {
            return;
        }
        this.f44116f = c4Var2;
        this.h = wallPaper;
        if (znVar.fragmentView != null) {
            drawable = znVar.X0.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.dd0) {
            dd0Var = (org.telegram.ui.Components.dd0) drawable;
        } else {
            dd0Var = null;
        }
        if (dd0Var != null) {
            i10 = dd0Var.f25664i;
        } else {
            i10 = 0;
        }
        if ((c4Var2 == null || c4Var2.f20509a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.i6.ul.indexOfKey(org.telegram.ui.ActionBar.i6.f20953lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.i6.ul.valueAt(indexOfKey);
            } else {
                int i14 = org.telegram.ui.ActionBar.i6.f20738a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (c4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f44113b.clear();
            this.f44112a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.i6.t0();
            if (t02 instanceof org.telegram.ui.Components.dd0) {
                ((org.telegram.ui.Components.dd0) t02).v(i10);
            }
            this.f44117n = null;
            if (org.telegram.ui.ActionBar.i6.I.q() == this.G) {
                O02 = org.telegram.ui.ActionBar.i6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.i6.O0(string) != null && !org.telegram.ui.ActionBar.i6.O0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.i6.O0(string2) != null && org.telegram.ui.ActionBar.i6.O0(string2).q()) {
                    str = string2;
                }
                if (this.G) {
                    O02 = org.telegram.ui.ActionBar.i6.O0(str);
                } else {
                    O02 = org.telegram.ui.ActionBar.i6.O0(str2);
                }
            }
            org.telegram.ui.ActionBar.i6.t(O02, false, this.G);
            g(this.f44117n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.i6.J(ApplicationLoader.applicationContext, false);
        }
        if (c4Var2 != null) {
            i11 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
            this.d = c4Var2.b(i11, this.G ? 1 : 0);
        } else {
            this.d = new SparseIntArray();
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable3 = this.f44117n;
            i13 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
            this.f44117n = ci.b7.f(drawable3, i13, this.h, this.G);
        } else if (wallPaper != null) {
            this.f44117n = co.d(this.f44117n, wallPaper, this.G);
        } else {
            if (c4Var2.f20509a) {
                org.telegram.ui.ActionBar.h6 e7 = org.telegram.ui.ActionBar.c4.e(this.G);
                i12 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
                org.telegram.ui.ActionBar.i6.H(e7, c4Var2.h(i12, this.G ? 1 : 0), ((org.telegram.ui.ActionBar.b4) c4Var2.f20513f.get(this.G ? 1 : 0)).f20456g, i10, false);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int x02 = x0(org.telegram.ui.ActionBar.i6.Nd);
                int x03 = x0(org.telegram.ui.ActionBar.i6.Od);
                int x04 = x0(org.telegram.ui.ActionBar.i6.Pd);
                int x05 = x0(org.telegram.ui.ActionBar.i6.Qd);
                org.telegram.ui.Components.dd0 dd0Var3 = new org.telegram.ui.Components.dd0();
                dd0Var3.t(dd0Var3.f25676u, c4Var2.k(this.G ? 1 : 0).settings.intensity);
                TLRPC.Document f7 = c4Var2.f();
                if (dd0Var3.f25679y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    dd0Var3.f25679y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = dd0Var3.f25658c;
                    if (weakReference != null) {
                        dd0Var3.f25679y.setParentView((View) weakReference.get());
                    }
                    if (dd0Var3.T) {
                        dd0Var3.f25679y.onAttachedToWindow();
                    }
                }
                dd0Var3.f25679y.setImage(ImageLocation.getForDocument(f7), "80_80", null, null, null, 0);
                dd0Var3.f25679y.setAutoRepeatCount(1);
                dd0Var3.f25679y.setAutoRepeat(1);
                dd0Var3.o(x02, x03, x04, x05, 0, true);
                dd0Var3.v(i10);
                int f10 = dd0Var3.f();
                boolean z12 = this.G;
                o oVar = new o(14, this, dd0Var3);
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) c4Var2.f20513f.get(z12 ? 1 : 0);
                if (b4Var != null && b4Var.f20453c != null) {
                    dd0Var2 = dd0Var3;
                    long i15 = c4Var2.i(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = b4Var.f20453c.gift;
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
                    dd0Var2 = dd0Var3;
                }
                c4Var2 = c4Var;
                org.telegram.ui.Components.dd0 dd0Var4 = dd0Var2;
                c4Var2.o(this.G ? 1 : 0, new org.telegram.messenger.j2(this, c4Var2, z11, dd0Var4, f10));
                drawable2 = dd0Var4;
            }
            this.f44117n = drawable2;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.H = new AnimatorSet();
            if (dd0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new tn(dd0Var, 0));
                ofFloat.addListener(new vn(dd0Var));
                ofFloat.setDuration(200L);
                this.H.playTogether(ofFloat);
            }
            Drawable drawable4 = this.f44117n;
            if (drawable4 instanceof org.telegram.ui.Components.dd0) {
                org.telegram.ui.Components.dd0 dd0Var5 = (org.telegram.ui.Components.dd0) drawable4;
                dd0Var5.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new tn(dd0Var5, 1));
                ofFloat2.addListener(new wn(dd0Var5));
                ofFloat2.setDuration(250L);
                this.H.playTogether(ofFloat2);
            }
            this.H.start();
        }
        if (c4Var2 == null && this.V.T5 >= 0) {
            if (org.telegram.ui.ActionBar.i6.I.q() == this.G) {
                O0 = org.telegram.ui.ActionBar.i6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.i6.O0(string3) != null && !org.telegram.ui.ActionBar.i6.O0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.i6.O0(string4) != null && org.telegram.ui.ActionBar.i6.O0(string4).q()) {
                    str = string4;
                }
                if (this.G) {
                    O0 = org.telegram.ui.ActionBar.i6.O0(str);
                } else {
                    O0 = org.telegram.ui.ActionBar.i6.O0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.i6.t(O0, false, this.G);
        } else {
            c10 = 0;
        }
        int i18 = AndroidUtilities.calcDrawableColor(this.f44117n)[c10];
        e();
        f();
        g(this.f44117n);
        k(1.0f);
    }

    public final void k(float f7) {
        int b10;
        int b11;
        int b12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f44113b.isEmpty()) {
            Paint F = F("paintChatActionBackground");
            Paint F2 = F("paintChatActionBackgroundSelected");
            Paint F3 = F("paintChatMessageBackgroundSelected");
            int i10 = this.Q;
            int i11 = -1;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.i6.f20898ic, true);
            }
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.i6.f20916jc, true);
            }
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.i6.f20916jc, true);
            }
            if (!this.R) {
                i11 = b(org.telegram.ui.ActionBar.i6.f20935kc, true);
            }
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                i10 = i0.a.d(f7, this.O, i10);
                b10 = i0.a.d(f7, this.K, b10);
                b11 = i0.a.d(f7, this.L, b11);
                b12 = i0.a.d(f7, this.M, b12);
                i11 = i0.a.d(f7, this.N, i11);
            }
            if (F != null && !this.R) {
                F.setColor(i10);
                F2.setColor(i10);
            }
            Paint F4 = F("paintChatActionText");
            if (F4 != null) {
                ((TextPaint) F4).linkColor = b11;
                F("paintChatActionText").setColor(b10);
                F("paintChatBotButton").setColor(b12);
            }
            org.telegram.ui.ActionBar.i6.x1(b10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.i6.x1(b10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.i6.x1(b10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.i6.x1(b10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.i6.x1(b10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.i6.x1(b10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.i6.x1(i11, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.i6.x1(i11, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.i6.x1(i11, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.i6.x1(i11, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.i6.x1(i11, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.i6.x1(i11, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.i6.x1(i11, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.i6.x1(i11, getDrawable("drawableShareIcon"));
            if (this.f44121x != null && (bitmap = this.v) != null) {
                Rect rect = this.U;
                Rect rect2 = this.T;
                if (i12 != 0 && (bitmap2 = this.P) != null) {
                    this.F = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.P.getHeight());
                    rect.set(0, 0, this.f44119s.getWidth(), this.f44119s.getHeight());
                    this.f44121x.drawBitmap(this.P, rect2, rect, (Paint) null);
                    Paint paint = this.f44120w;
                    paint.setAlpha((int) (f7 * 255.0f));
                    rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                    rect.set(0, 0, this.f44119s.getWidth(), this.f44119s.getHeight());
                    this.f44121x.drawBitmap(this.v, rect2, rect, paint);
                    if (F != null) {
                        F.setShader(this.f44122y);
                        F2.setShader(this.f44122y);
                    }
                    if (F3 != null) {
                        F3.setShader(this.f44122y);
                        return;
                    }
                    return;
                }
                this.F = true;
                rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f44119s.getWidth(), this.f44119s.getHeight());
                this.f44121x.drawBitmap(this.v, rect2, rect, (Paint) null);
                if (F != null) {
                    F.setShader(this.E);
                    F2.setShader(this.E);
                }
                if (F3 != null) {
                    F3.setShader(this.E);
                }
            }
        }
    }

    @Override
    public final boolean k0() {
        if (this.f44117n != null) {
            if (this.f44122y != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.i6.b1();
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.f44117n != null && (bitmap = this.f44119s) != null && (bitmapShader = this.f44122y) != null) {
            boolean z10 = this.F;
            Matrix matrix = this.f44114c;
            if (z10) {
                org.telegram.ui.ActionBar.i6.r(this.v, this.E, matrix, i10, i11, f7, f10);
                return;
            } else {
                org.telegram.ui.ActionBar.i6.r(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
                return;
            }
        }
        org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21129v3;
    }

    @Override
    public final int x0(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.f44115e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.f44115e.valueAt(indexOfKey2);
        }
        if (this.f44116f == null) {
            return org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.i6.rl.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }
}
