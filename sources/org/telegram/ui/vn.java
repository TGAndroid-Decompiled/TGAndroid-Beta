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
public final class vn implements org.telegram.ui.ActionBar.g6, org.telegram.ui.Components.ub0 {
    public BitmapShader B;
    public boolean C;
    public AnimatorSet E;
    public org.telegram.ui.ActionBar.h5 F;
    public org.telegram.ui.ActionBar.h5 G;
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
    public SparseIntArray f42261e;
    public org.telegram.ui.ActionBar.f4 f42262f;
    public TLRPC.WallPaper h;
    public Drawable f42263n;
    public ValueAnimator f42264r;
    public Bitmap f42265s;
    public Bitmap v;
    public Canvas f42267x;
    public BitmapShader f42268y;
    public final HashMap f42258a = new HashMap();
    public final HashMap f42259b = new HashMap();
    public final Matrix f42260c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f42266w = new Paint();
    public final Rect Q = new Rect();
    public final Rect R = new Rect();
    public boolean D = org.telegram.ui.ActionBar.k6.I.q();

    public vn(xn xnVar) {
        int i10;
        int i11;
        this.S = xnVar;
        if (h(false)) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            this.f42262f = ChatThemeController.getInstance(i10).getDialogTheme(xnVar.Q5);
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(xnVar.Q5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.f4 f4Var = this.f42262f;
            if (f4Var != null || dialogWallpaper != null) {
                j(f4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ag.f(25));
            }
        }
        if (ThemeEditorView.f25052n == null) {
            org.telegram.ui.ActionBar.k6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ag.f(25));
    }

    @Override
    public final int B0(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.f42261e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.f42261e.valueAt(indexOfKey2);
        }
        if (this.f42262f == null) {
            return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.k6.ol.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    @Override
    public final Paint F(String str) {
        if (this.f42262f == null && this.f42263n == null) {
            return null;
        }
        return (Paint) this.f42259b.get(str);
    }

    @Override
    public final void J0(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f42261e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override
    public final int Z0(int i10) {
        return b(i10, false);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    public final int b(int i10, boolean z4) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f42262f == null && this.f42263n == null) {
            return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        }
        if (!z4 && (sparseIntArray = this.f42261e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.f42261e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    public final org.telegram.ui.ActionBar.f4 c() {
        return this.f42262f;
    }

    public final Drawable d() {
        Drawable drawable = this.f42263n;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.k6.s0();
    }

    public final void e() {
        Drawable h5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.k6.jl.entrySet()) {
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
                    h5Var = new org.telegram.ui.ActionBar.h5(0, false, false, this);
                    break;
                case 1:
                    h5Var = new org.telegram.ui.ActionBar.h5(1, false, false, this);
                    break;
                case 2:
                    h5Var = new org.telegram.ui.ActionBar.h5(1, false, true, this);
                    break;
                case 3:
                    h5Var = new org.telegram.ui.ActionBar.h5(1, true, false, this);
                    break;
                case 4:
                    h5Var = new org.telegram.ui.ActionBar.h5(0, true, true, this);
                    break;
                case 5:
                    h5Var = new org.telegram.ui.ActionBar.h5(1, true, true, this);
                    break;
                case 6:
                    h5Var = new org.telegram.ui.ActionBar.h5(0, false, true, this);
                    break;
                case 7:
                    h5Var = new org.telegram.ui.ActionBar.h5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        h5Var = constantState.newDrawable().mutate();
                    } else {
                        h5Var = null;
                    }
                    if (h5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.k6.kl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.k6.w1(B0(intValue), h5Var);
                            break;
                        }
                    }
                    break;
            }
            if (h5Var != null) {
                this.f42258a.put((String) entry.getKey(), h5Var);
            }
        }
    }

    @Override
    public final int e0(int i10) {
        return B0(i10);
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.k6.ll.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.k6.ml.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(B0(intValue));
            }
            this.f42259b.put((String) entry.getKey(), paint);
        }
    }

    public final void g(android.graphics.drawable.Drawable r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vn.g(android.graphics.drawable.Drawable):void");
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f42258a;
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
                if (xnVar.f43165e == null && (user = xnVar.f43178f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void i(org.telegram.ui.ActionBar.f4 f4Var, TLRPC.WallPaper wallPaper, boolean z4, Boolean bool, boolean z10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        boolean z11;
        tf.b bVar;
        tf.b bVar2;
        org.telegram.ui.ActionBar.j6 A0;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int b10;
        int b11;
        int b12;
        org.telegram.ui.ActionBar.f5 f5Var2;
        int w02;
        int w03;
        int w04;
        int w05;
        xn xnVar = this.S;
        f5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
        if (f5Var != null && xnVar.Z9 == null) {
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = this.D;
            }
            if (f4Var != null) {
                bVar = f4Var.f21360c;
            } else {
                bVar = null;
            }
            org.telegram.ui.ActionBar.f4 f4Var2 = this.f42262f;
            if (f4Var2 != null) {
                bVar2 = f4Var2.f21360c;
            } else {
                bVar2 = null;
            }
            TLRPC.WallPaper wallPaper2 = this.h;
            if (!z10) {
                if (h(false)) {
                    if (tf.b.a(bVar2, bVar) && this.D == z11 && ChatThemeController.equals(wallPaper, wallPaper2)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.D = z11;
            if (z11) {
                A0 = org.telegram.ui.ActionBar.k6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.k6.A0();
            }
            org.telegram.ui.ActionBar.e5 e5Var = new org.telegram.ui.ActionBar.e5(A0, A0.V, A0.q(), !z4);
            org.telegram.ui.ActionBar.f4 f4Var3 = this.f42262f;
            int i10 = -1;
            if (f4Var3 == null && this.h == null) {
                Drawable s02 = org.telegram.ui.ActionBar.k6.s0();
                this.O = s02 instanceof org.telegram.ui.Components.fc0;
                g(s02);
                if (this.O) {
                    w02 = -1;
                } else {
                    w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ic, false);
                }
                this.H = w02;
                if (this.O) {
                    w03 = -1;
                } else {
                    w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.jc, false);
                }
                this.I = w03;
                if (this.O) {
                    w04 = -1;
                } else {
                    w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.jc, false);
                }
                this.J = w04;
                if (this.O) {
                    w05 = -1;
                } else {
                    w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21791kc, false);
                }
                this.K = w05;
            } else {
                if (this.O) {
                    Drawable drawable = this.f42263n;
                    if (drawable instanceof org.telegram.ui.Components.fc0) {
                        Bitmap bitmap = ((org.telegram.ui.Components.fc0) drawable).f26879k;
                        this.M = bitmap;
                        if (f4Var3 != null) {
                            TLRPC.ChatTheme chatTheme = f4Var3.d;
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
                Drawable drawable2 = this.f42263n;
                if (drawable2 != null) {
                    g(drawable2);
                }
            }
            this.L = this.N;
            if (this.O) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.k6.ic, true);
            }
            this.H = b10;
            if (this.O) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.k6.jc, true);
            }
            this.I = b11;
            if (this.O) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.k6.jc, true);
            }
            this.J = b12;
            if (!this.O) {
                i10 = b(org.telegram.ui.ActionBar.k6.f21791kc, true);
            }
            this.K = i10;
            if (f4Var != null || wallPaper != null) {
                int i11 = AndroidUtilities.calcDrawableColor(this.f42263n)[0];
                e();
                f();
            }
            e5Var.f21327f = false;
            if (xnVar.Q5 < 0) {
                e5Var.f21328g = false;
            }
            e5Var.h = new dg.t0(this, f4Var, wallPaper, z4, 8);
            if (z4) {
                e5Var.f21331k = new sn(this);
                e5Var.f21329i = new qn(this, 0);
                e5Var.f21330j = new qn(this, 1);
            } else {
                if (xnVar.U0 != null) {
                    xnVar.ec();
                }
                e5Var.h.run();
            }
            e5Var.f21326e = true;
            e5Var.f21333m = this;
            e5Var.f21332l = 250L;
            f5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
            ((ActionBarLayout) f5Var2).f(e5Var, null);
        }
    }

    public final void j(org.telegram.ui.ActionBar.f4 f4Var, TLRPC.WallPaper wallPaper, boolean z4) {
        Drawable drawable;
        org.telegram.ui.Components.fc0 fc0Var;
        int i10;
        int i11;
        boolean z10;
        Drawable drawable2;
        int i12;
        char c3;
        org.telegram.ui.ActionBar.j6 N0;
        int i13;
        org.telegram.ui.ActionBar.j6 N02;
        org.telegram.ui.ActionBar.f4 f4Var2 = f4Var;
        xn xnVar = this.S;
        if (xnVar.Z9 != null) {
            return;
        }
        this.f42262f = f4Var2;
        this.h = wallPaper;
        if (xnVar.fragmentView != null) {
            drawable = xnVar.U0.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.fc0) {
            fc0Var = (org.telegram.ui.Components.fc0) drawable;
        } else {
            fc0Var = null;
        }
        if (fc0Var != null) {
            i10 = fc0Var.f26877i;
        } else {
            i10 = 0;
        }
        if ((f4Var2 == null || f4Var2.f21358a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.k6.rl.indexOfKey(org.telegram.ui.ActionBar.k6.f21809lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.k6.rl.valueAt(indexOfKey);
            } else {
                int i14 = org.telegram.ui.ActionBar.k6.f21598a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (f4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f42259b.clear();
            this.f42258a.clear();
            Drawable s02 = org.telegram.ui.ActionBar.k6.s0();
            if (s02 instanceof org.telegram.ui.Components.fc0) {
                ((org.telegram.ui.Components.fc0) s02).v(i10);
            }
            this.f42263n = null;
            if (org.telegram.ui.ActionBar.k6.I.q() == this.D) {
                N02 = org.telegram.ui.ActionBar.k6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.N0(string) != null && !org.telegram.ui.ActionBar.k6.N0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.N0(string2) != null && org.telegram.ui.ActionBar.k6.N0(string2).q()) {
                    str = string2;
                }
                if (this.D) {
                    N02 = org.telegram.ui.ActionBar.k6.N0(str);
                } else {
                    N02 = org.telegram.ui.ActionBar.k6.N0(str2);
                }
            }
            org.telegram.ui.ActionBar.k6.t(N02, false, this.D);
            g(this.f42263n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.k6.J(ApplicationLoader.applicationContext, false);
        }
        if (f4Var2 != null) {
            i11 = ((org.telegram.ui.ActionBar.p2) this.S).currentAccount;
            this.d = f4Var2.b(i11, this.D ? 1 : 0);
        } else {
            this.d = new SparseIntArray();
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable3 = this.f42263n;
            i13 = ((org.telegram.ui.ActionBar.p2) this.S).currentAccount;
            this.f42263n = qh.j5.f(drawable3, i13, this.h, this.D);
        } else if (wallPaper != null) {
            this.f42263n = ao.d(this.f42263n, wallPaper, this.D);
        } else {
            if (f4Var2.f21358a) {
                org.telegram.ui.ActionBar.j6 e6 = org.telegram.ui.ActionBar.f4.e(this.D);
                i12 = ((org.telegram.ui.ActionBar.p2) this.S).currentAccount;
                org.telegram.ui.ActionBar.k6.H(e6, f4Var2.h(i12, this.D ? 1 : 0), ((org.telegram.ui.ActionBar.e4) f4Var2.f21362f.get(this.D ? 1 : 0)).f21315g, i10, false);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int B0 = B0(org.telegram.ui.ActionBar.k6.Nd);
                int B02 = B0(org.telegram.ui.ActionBar.k6.Od);
                int B03 = B0(org.telegram.ui.ActionBar.k6.Pd);
                int B04 = B0(org.telegram.ui.ActionBar.k6.Qd);
                org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0();
                fc0Var2.t(fc0Var2.f26889u, f4Var2.k(this.D ? 1 : 0).settings.intensity);
                TLRPC.Document f10 = f4Var2.f();
                if (fc0Var2.f26892y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    fc0Var2.f26892y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = fc0Var2.f26871c;
                    if (weakReference != null) {
                        fc0Var2.f26892y.setParentView((View) weakReference.get());
                    }
                    if (fc0Var2.T) {
                        fc0Var2.f26892y.onAttachedToWindow();
                    }
                }
                fc0Var2.f26892y.setImage(ImageLocation.getForDocument(f10), "80_80", null, null, null, 0);
                fc0Var2.f26892y.setAutoRepeatCount(1);
                fc0Var2.f26892y.setAutoRepeat(1);
                fc0Var2.o(B0, B02, B03, B04, 0, true);
                fc0Var2.v(i10);
                int f11 = fc0Var2.f();
                boolean z11 = this.D;
                ng.w wVar = new ng.w(20, this, fc0Var2);
                org.telegram.ui.ActionBar.e4 e4Var = (org.telegram.ui.ActionBar.e4) f4Var2.f21362f.get(z11 ? 1 : 0);
                if (e4Var != null && e4Var.f21312c != null) {
                    long i15 = f4Var2.i(z11 ? 1 : 0);
                    TL_stars.StarGift starGift = e4Var.f21312c.gift;
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
                f4Var2 = f4Var;
                f4Var2.o(this.D ? 1 : 0, new org.telegram.messenger.k2(this, f4Var2, z10, fc0Var2, f11));
                drawable2 = fc0Var2;
            }
            this.f42263n = drawable2;
        }
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4) {
            this.E = new AnimatorSet();
            if (fc0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new rn(fc0Var, 0));
                ofFloat.addListener(new tn(fc0Var));
                ofFloat.setDuration(200L);
                this.E.playTogether(ofFloat);
            }
            Drawable drawable4 = this.f42263n;
            if (drawable4 instanceof org.telegram.ui.Components.fc0) {
                org.telegram.ui.Components.fc0 fc0Var3 = (org.telegram.ui.Components.fc0) drawable4;
                fc0Var3.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new rn(fc0Var3, 1));
                ofFloat2.addListener(new un(fc0Var3));
                ofFloat2.setDuration(250L);
                this.E.playTogether(ofFloat2);
            }
            this.E.start();
        }
        if (f4Var2 == null && this.S.Q5 >= 0) {
            if (org.telegram.ui.ActionBar.k6.I.q() == this.D) {
                N0 = org.telegram.ui.ActionBar.k6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.N0(string3) != null && !org.telegram.ui.ActionBar.k6.N0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.N0(string4) != null && org.telegram.ui.ActionBar.k6.N0(string4).q()) {
                    str = string4;
                }
                if (this.D) {
                    N0 = org.telegram.ui.ActionBar.k6.N0(str);
                } else {
                    N0 = org.telegram.ui.ActionBar.k6.N0(str2);
                }
            }
            c3 = 0;
            org.telegram.ui.ActionBar.k6.t(N0, false, this.D);
        } else {
            c3 = 0;
        }
        int i19 = AndroidUtilities.calcDrawableColor(this.f42263n)[c3];
        e();
        f();
        g(this.f42263n);
        k(1.0f);
    }

    public final void k(float f10) {
        int b10;
        int b11;
        int b12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!this.f42259b.isEmpty()) {
            Paint F = F("paintChatActionBackground");
            Paint F2 = F("paintChatActionBackgroundSelected");
            Paint F3 = F("paintChatMessageBackgroundSelected");
            int i10 = this.N;
            int i11 = -1;
            if (this.O) {
                b10 = -1;
            } else {
                b10 = b(org.telegram.ui.ActionBar.k6.ic, true);
            }
            if (this.O) {
                b11 = -1;
            } else {
                b11 = b(org.telegram.ui.ActionBar.k6.jc, true);
            }
            if (this.O) {
                b12 = -1;
            } else {
                b12 = b(org.telegram.ui.ActionBar.k6.jc, true);
            }
            if (!this.O) {
                i11 = b(org.telegram.ui.ActionBar.k6.f21791kc, true);
            }
            int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                i10 = i0.a.d(f10, this.L, i10);
                b10 = i0.a.d(f10, this.H, b10);
                b11 = i0.a.d(f10, this.I, b11);
                b12 = i0.a.d(f10, this.J, b12);
                i11 = i0.a.d(f10, this.K, i11);
            }
            if (F != null && !this.O) {
                F.setColor(i10);
                F2.setColor(i10);
            }
            Paint F4 = F("paintChatActionText");
            if (F4 != null) {
                ((TextPaint) F4).linkColor = b11;
                F("paintChatActionText").setColor(b10);
                F("paintChatBotButton").setColor(b12);
            }
            org.telegram.ui.ActionBar.k6.w1(b10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.k6.w1(b10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.k6.w1(b10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.k6.w1(b10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.k6.w1(b10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.k6.w1(b10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.k6.w1(i11, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.k6.w1(i11, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.k6.w1(i11, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.k6.w1(i11, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.k6.w1(i11, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.k6.w1(i11, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.k6.w1(i11, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.k6.w1(i11, getDrawable("drawableShareIcon"));
            if (this.f42267x != null && (bitmap = this.v) != null) {
                Rect rect = this.R;
                Rect rect2 = this.Q;
                if (i12 != 0 && (bitmap2 = this.M) != null) {
                    this.C = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.M.getHeight());
                    rect.set(0, 0, this.f42265s.getWidth(), this.f42265s.getHeight());
                    this.f42267x.drawBitmap(this.M, rect2, rect, (Paint) null);
                    Paint paint = this.f42266w;
                    paint.setAlpha((int) (f10 * 255.0f));
                    rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                    rect.set(0, 0, this.f42265s.getWidth(), this.f42265s.getHeight());
                    this.f42267x.drawBitmap(this.v, rect2, rect, paint);
                    if (F != null) {
                        F.setShader(this.f42268y);
                        F2.setShader(this.f42268y);
                    }
                    if (F3 != null) {
                        F3.setShader(this.f42268y);
                        return;
                    }
                    return;
                }
                this.C = true;
                rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
                rect.set(0, 0, this.f42265s.getWidth(), this.f42265s.getHeight());
                this.f42267x.drawBitmap(this.v, rect2, rect, (Paint) null);
                if (F != null) {
                    F.setShader(this.B);
                    F2.setShader(this.B);
                }
                if (F3 != null) {
                    F3.setShader(this.B);
                }
            }
        }
    }

    @Override
    public final void l(float f10, float f11, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.f42263n != null && (bitmap = this.f42265s) != null && (bitmapShader = this.f42268y) != null) {
            boolean z4 = this.C;
            Matrix matrix = this.f42260c;
            if (z4) {
                org.telegram.ui.ActionBar.k6.r(this.v, this.B, matrix, i10, i11, f10, f11);
                return;
            } else {
                org.telegram.ui.ActionBar.k6.r(bitmap, bitmapShader, matrix, i10, i11, f10, f11);
                return;
            }
        }
        org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
    }

    @Override
    public final boolean o0() {
        if (this.f42263n != null) {
            if (this.f42268y != null) {
                return true;
            }
            return false;
        }
        return org.telegram.ui.ActionBar.k6.a1();
    }

    @Override
    public final ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.f21976v3;
    }
}
