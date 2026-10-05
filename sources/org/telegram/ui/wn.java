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
public final class wn implements org.telegram.ui.ActionBar.d6, org.telegram.ui.Components.ec0 {
    public BitmapShader E;
    public boolean F;
    public AnimatorSet H;
    public org.telegram.ui.ActionBar.e5 I;
    public org.telegram.ui.ActionBar.e5 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public Bitmap P;
    public int Q;
    public boolean R;
    public boolean S;
    public final yn V;
    public SparseIntArray f42612e;
    public org.telegram.ui.ActionBar.c4 f42613f;
    public TLRPC.WallPaper h;
    public Drawable f42614n;
    public ValueAnimator f42615r;
    public Bitmap f42616s;
    public Bitmap v;
    public Canvas f42618x;
    public BitmapShader f42619y;
    public final HashMap f42609a = new HashMap();
    public final HashMap f42610b = new HashMap();
    public final Matrix f42611c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f42617w = new Paint();
    public final Rect T = new Rect();
    public final Rect U = new Rect();
    public boolean G = org.telegram.ui.ActionBar.i6.I.q();

    public wn(yn ynVar) {
        int i10;
        int i11;
        this.V = ynVar;
        if (h(false)) {
            i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            this.f42613f = ChatThemeController.getInstance(i10).getDialogTheme(ynVar.R5);
            i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(ynVar.R5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.c4 c4Var = this.f42613f;
            if (c4Var != null || dialogWallpaper != null) {
                j(c4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ai.f(20));
            }
        }
        if (ThemeEditorView.f24353n == null) {
            org.telegram.ui.ActionBar.i6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ai.f(20));
    }

    @Override
    public final Paint H(String str) {
        if (this.f42613f == null && this.f42614n == null) {
            return null;
        }
        return (Paint) this.f42610b.get(str);
    }

    @Override
    public final int H0(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.f42612e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.f42612e.valueAt(indexOfKey2);
        }
        if (this.f42613f == null) {
            return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.i6.ol.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    @Override
    public final void L0(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f42612e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.i6.I.q();
    }

    public final int b(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f42613f == null && this.f42614n == null) {
            return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.f42612e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.f42612e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    public final org.telegram.ui.ActionBar.c4 c() {
        return this.f42613f;
    }

    public final Drawable d() {
        Drawable drawable = this.f42614n;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.i6.s0();
    }

    public final void e() {
        Drawable e5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.i6.jl.entrySet()) {
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
                    e5Var = new org.telegram.ui.ActionBar.e5(0, false, false, this);
                    break;
                case 1:
                    e5Var = new org.telegram.ui.ActionBar.e5(1, false, false, this);
                    break;
                case 2:
                    e5Var = new org.telegram.ui.ActionBar.e5(1, false, true, this);
                    break;
                case 3:
                    e5Var = new org.telegram.ui.ActionBar.e5(1, true, false, this);
                    break;
                case 4:
                    e5Var = new org.telegram.ui.ActionBar.e5(0, true, true, this);
                    break;
                case 5:
                    e5Var = new org.telegram.ui.ActionBar.e5(1, true, true, this);
                    break;
                case 6:
                    e5Var = new org.telegram.ui.ActionBar.e5(0, false, true, this);
                    break;
                case 7:
                    e5Var = new org.telegram.ui.ActionBar.e5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        e5Var = constantState.newDrawable().mutate();
                    } else {
                        e5Var = null;
                    }
                    if (e5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.i6.kl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.i6.w1(H0(intValue), e5Var);
                            break;
                        }
                    }
                    break;
            }
            if (e5Var != null) {
                this.f42609a.put((String) entry.getKey(), e5Var);
            }
        }
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.i6.ll.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.i6.ml.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(H0(intValue));
            }
            this.f42610b.put((String) entry.getKey(), paint);
        }
    }

    public final void g(android.graphics.drawable.Drawable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.g(android.graphics.drawable.Drawable):void");
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f42609a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    public final boolean h(boolean z10) {
        TLRPC.User user;
        yn ynVar = this.V;
        if (ynVar.h == null) {
            if (z10) {
                if (ynVar.f43315e == null && (user = ynVar.f43327f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void i(org.telegram.ui.ActionBar.c4 c4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.c5 c5Var;
        boolean z12;
        fg.b bVar;
        fg.b bVar2;
        org.telegram.ui.ActionBar.h6 A0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int b10;
        int b11;
        int b12;
        org.telegram.ui.ActionBar.c5 c5Var2;
        int w02;
        int w03;
        int w04;
        int w05;
        yn ynVar = this.V;
        c5Var = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
        if (c5Var != null && ynVar.f43272aa == null) {
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
            org.telegram.ui.ActionBar.c4 c4Var2 = this.f42613f;
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
                A0 = org.telegram.ui.ActionBar.i6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.i6.A0();
            }
            org.telegram.ui.ActionBar.b5 b5Var = new org.telegram.ui.ActionBar.b5(A0, A0.Y, A0.q(), !z10);
            org.telegram.ui.ActionBar.c4 c4Var3 = this.f42613f;
            int i10 = -1;
            if (c4Var3 == null && this.h == null) {
                Drawable s02 = org.telegram.ui.ActionBar.i6.s0();
                this.R = s02 instanceof org.telegram.ui.Components.pc0;
                g(s02);
                if (this.R) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20924ic, false);
                }
                this.K = w02;
                if (this.R) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20942jc, false);
                }
                this.L = w03;
                if (this.R) {
                    w04 = -1;
                } else {
                    w04 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20942jc, false);
                }
                this.M = w04;
                if (this.R) {
                    w05 = -1;
                } else {
                    w05 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20962kc, false);
                }
                this.N = w05;
            } else {
                if (this.R) {
                    Drawable drawable = this.f42614n;
                    if (drawable instanceof org.telegram.ui.Components.pc0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.pc0) drawable).f29711k;
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
                Drawable drawable2 = this.f42614n;
                if (drawable2 != null) {
                    g(drawable2);
                }
            }
            this.O = this.Q;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.i6.f20924ic, true);
            }
            this.K = b10;
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.i6.f20942jc, true);
            }
            this.L = b11;
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.i6.f20942jc, true);
            }
            this.M = b12;
            if (!this.R) {
                i10 = b(org.telegram.ui.ActionBar.i6.f20962kc, true);
            }
            this.N = i10;
            if (c4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.f42614n)[0];
                e();
                f();
            }
            b5Var.f20476f = false;
            if (ynVar.R5 < 0) {
                b5Var.f20477g = false;
            }
            b5Var.h = new ai.s4(this, c4Var, wallPaper, z10, 13);
            if (z10) {
                b5Var.f20480k = new tn(this);
                b5Var.f20478i = new rn(this, 0);
                b5Var.f20479j = new rn(this, 1);
            } else {
                if (ynVar.V0 != null) {
                    ynVar.dc();
                }
                b5Var.h.run();
            }
            b5Var.f20475e = true;
            b5Var.f20482m = this;
            b5Var.f20481l = 250L;
            c5Var2 = ((org.telegram.ui.ActionBar.n2) ynVar).parentLayout;
            ((ActionBarLayout) c5Var2).f(b5Var, null);
        }
    }

    public final void j(org.telegram.ui.ActionBar.c4 c4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.pc0 pc0Var;
        int i10;
        int i11;
        boolean z11;
        org.telegram.ui.Components.pc0 pc0Var2;
        Drawable drawable2;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.h6 N0;
        int i13;
        org.telegram.ui.ActionBar.h6 N02;
        org.telegram.ui.ActionBar.c4 c4Var2 = c4Var;
        yn ynVar = this.V;
        if (ynVar.f43272aa != null) {
            return;
        }
        this.f42613f = c4Var2;
        this.h = wallPaper;
        if (ynVar.fragmentView != null) {
            drawable = ynVar.V0.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.pc0) {
            pc0Var = (org.telegram.ui.Components.pc0) drawable;
        } else {
            pc0Var = null;
        }
        if (pc0Var != null) {
            i10 = pc0Var.f29709i;
        } else {
            i10 = 0;
        }
        if ((c4Var2 == null || c4Var2.f20509a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.i6.rl.indexOfKey(org.telegram.ui.ActionBar.i6.f20980lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.i6.rl.valueAt(indexOfKey);
            } else {
                int i14 = org.telegram.ui.ActionBar.i6.f20764a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (c4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f42610b.clear();
            this.f42609a.clear();
            Drawable s02 = org.telegram.ui.ActionBar.i6.s0();
            if (s02 instanceof org.telegram.ui.Components.pc0) {
                ((org.telegram.ui.Components.pc0) s02).v(i10);
            }
            this.f42614n = null;
            if (org.telegram.ui.ActionBar.i6.I.q() == this.G) {
                N02 = org.telegram.ui.ActionBar.i6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.i6.N0(string) != null && !org.telegram.ui.ActionBar.i6.N0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.i6.N0(string2) != null && org.telegram.ui.ActionBar.i6.N0(string2).q()) {
                    str = string2;
                }
                if (this.G) {
                    N02 = org.telegram.ui.ActionBar.i6.N0(str);
                } else {
                    N02 = org.telegram.ui.ActionBar.i6.N0(str2);
                }
            }
            org.telegram.ui.ActionBar.i6.t(N02, false, this.G);
            g(this.f42614n);
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
            Drawable drawable3 = this.f42614n;
            i13 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
            this.f42614n = ci.b7.f(drawable3, i13, this.h, this.G);
        } else if (wallPaper != null) {
            this.f42614n = bo.d(this.f42614n, wallPaper, this.G);
        } else {
            if (c4Var2.f20509a) {
                org.telegram.ui.ActionBar.h6 e7 = org.telegram.ui.ActionBar.c4.e(this.G);
                i12 = ((org.telegram.ui.ActionBar.n2) this.V).currentAccount;
                org.telegram.ui.ActionBar.i6.H(e7, c4Var2.h(i12, this.G ? 1 : 0), ((org.telegram.ui.ActionBar.b4) c4Var2.f20513f.get(this.G ? 1 : 0)).f20464g, i10, false);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int H0 = H0(org.telegram.ui.ActionBar.i6.Nd);
                int H02 = H0(org.telegram.ui.ActionBar.i6.Od);
                int H03 = H0(org.telegram.ui.ActionBar.i6.Pd);
                int H04 = H0(org.telegram.ui.ActionBar.i6.Qd);
                org.telegram.ui.Components.pc0 pc0Var3 = new org.telegram.ui.Components.pc0();
                pc0Var3.t(pc0Var3.f29721u, c4Var2.k(this.G ? 1 : 0).settings.intensity);
                TLRPC.Document f7 = c4Var2.f();
                if (pc0Var3.f29724y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    pc0Var3.f29724y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = pc0Var3.f29703c;
                    if (weakReference != null) {
                        pc0Var3.f29724y.setParentView((View) weakReference.get());
                    }
                    if (pc0Var3.T) {
                        pc0Var3.f29724y.onAttachedToWindow();
                    }
                }
                pc0Var3.f29724y.setImage(ImageLocation.getForDocument(f7), "80_80", null, null, null, 0);
                pc0Var3.f29724y.setAutoRepeatCount(1);
                pc0Var3.f29724y.setAutoRepeat(1);
                pc0Var3.o(H0, H02, H03, H04, 0, true);
                pc0Var3.v(i10);
                int f10 = pc0Var3.f();
                boolean z12 = this.G;
                o oVar = new o(15, this, pc0Var3);
                org.telegram.ui.ActionBar.b4 b4Var = (org.telegram.ui.ActionBar.b4) c4Var2.f20513f.get(z12 ? 1 : 0);
                if (b4Var != null && b4Var.f20461c != null) {
                    pc0Var2 = pc0Var3;
                    long i15 = c4Var2.i(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = b4Var.f20461c.gift;
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
                    pc0Var2 = pc0Var3;
                }
                c4Var2 = c4Var;
                org.telegram.ui.Components.pc0 pc0Var4 = pc0Var2;
                c4Var2.o(this.G ? 1 : 0, new org.telegram.messenger.j2(this, c4Var2, z11, pc0Var4, f10));
                drawable2 = pc0Var4;
            }
            this.f42614n = drawable2;
        }
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.H = new AnimatorSet();
            if (pc0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new sn(pc0Var, 0));
                ofFloat.addListener(new un(pc0Var));
                ofFloat.setDuration(200L);
                this.H.playTogether(ofFloat);
            }
            Drawable drawable4 = this.f42614n;
            if (drawable4 instanceof org.telegram.ui.Components.pc0) {
                org.telegram.ui.Components.pc0 pc0Var5 = (org.telegram.ui.Components.pc0) drawable4;
                pc0Var5.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new sn(pc0Var5, 1));
                ofFloat2.addListener(new vn(pc0Var5));
                ofFloat2.setDuration(250L);
                this.H.playTogether(ofFloat2);
            }
            this.H.start();
        }
        if (c4Var2 == null && this.V.R5 >= 0) {
            if (org.telegram.ui.ActionBar.i6.I.q() == this.G) {
                N0 = org.telegram.ui.ActionBar.i6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.i6.N0(string3) != null && !org.telegram.ui.ActionBar.i6.N0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.i6.N0(string4) != null && org.telegram.ui.ActionBar.i6.N0(string4).q()) {
                    str = string4;
                }
                if (this.G) {
                    N0 = org.telegram.ui.ActionBar.i6.N0(str);
                } else {
                    N0 = org.telegram.ui.ActionBar.i6.N0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.i6.t(N0, false, this.G);
        } else {
            c10 = 0;
        }
        int i18 = AndroidUtilities.calcDrawableColor(this.f42614n)[c10];
        e();
        f();
        g(this.f42614n);
        k(1.0f);
    }

    @Override
    public final int j0(int i10) {
        return H0(i10);
    }

    @Override
    public final int j1(int i10) {
        return b(i10, false);
    }

    public final void k(float f7) {
        int b10;
        int b11;
        int b12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f42610b.isEmpty()) {
            Paint H = H("paintChatActionBackground");
            Paint H2 = H("paintChatActionBackgroundSelected");
            Paint H3 = H("paintChatMessageBackgroundSelected");
            int i10 = this.Q;
            int i11 = -1;
            if (this.R) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.i6.f20924ic, true);
            }
            if (this.R) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.i6.f20942jc, true);
            }
            if (this.R) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.i6.f20942jc, true);
            }
            if (!this.R) {
                i11 = b(org.telegram.ui.ActionBar.i6.f20962kc, true);
            }
            int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                i10 = i0.a.d(f7, this.O, i10);
                b10 = i0.a.d(f7, this.K, b10);
                b11 = i0.a.d(f7, this.L, b11);
                b12 = i0.a.d(f7, this.M, b12);
                i11 = i0.a.d(f7, this.N, i11);
            }
            if (H != null && !this.R) {
                H.setColor(i10);
                H2.setColor(i10);
            }
            Paint H4 = H("paintChatActionText");
            if (H4 != null) {
                ((TextPaint) H4).linkColor = b11;
                H("paintChatActionText").setColor(b10);
                H("paintChatBotButton").setColor(b12);
            }
            org.telegram.ui.ActionBar.i6.w1(b10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.i6.w1(b10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.i6.w1(b10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.i6.w1(b10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.i6.w1(b10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.i6.w1(b10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.i6.w1(i11, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.i6.w1(i11, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.i6.w1(i11, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.i6.w1(i11, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.i6.w1(i11, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.i6.w1(i11, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.i6.w1(i11, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.i6.w1(i11, getDrawable("drawableShareIcon"));
            if (this.f42618x != null && (bitmap = this.v) != null) {
                Rect rect = this.U;
                Rect rect2 = this.T;
                if (i12 != 0 && (bitmap2 = this.P) != null) {
                    this.F = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.P.getHeight());
                    rect.set(0, 0, this.f42616s.getWidth(), this.f42616s.getHeight());
                    this.f42618x.drawBitmap(this.P, rect2, rect, (Paint) null);
                    Paint paint = this.f42617w;
                    paint.setAlpha((int) (f7 * 255.0f));
                    rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                    rect.set(0, 0, this.f42616s.getWidth(), this.f42616s.getHeight());
                    this.f42618x.drawBitmap(this.v, rect2, rect, paint);
                    if (H != null) {
                        H.setShader(this.f42619y);
                        H2.setShader(this.f42619y);
                    }
                    if (H3 != null) {
                        H3.setShader(this.f42619y);
                        return;
                    }
                    return;
                }
                this.F = true;
                rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f42616s.getWidth(), this.f42616s.getHeight());
                this.f42618x.drawBitmap(this.v, rect2, rect, (Paint) null);
                if (H != null) {
                    H.setShader(this.E);
                    H2.setShader(this.E);
                }
                if (H3 != null) {
                    H3.setShader(this.E);
                }
            }
        }
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.f42614n != null && (bitmap = this.f42616s) != null && (bitmapShader = this.f42619y) != null) {
            boolean z10 = this.F;
            Matrix matrix = this.f42611c;
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
    public final boolean r0() {
        if (this.f42614n != null) {
            if (this.f42619y != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.i6.a1();
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21159v3;
    }
}
