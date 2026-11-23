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
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ThemeEditorView;
public final class zm implements org.telegram.ui.ActionBar.h6, org.telegram.ui.Components.sa0 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final bn G;
    public SparseIntArray f54588e;
    public org.telegram.ui.ActionBar.s3 f54589f;
    public TLRPC.WallPaper f54590g;
    public Drawable h;
    public ValueAnimator f54591i;
    public Bitmap f54592j;
    public Bitmap f54593k;
    public Canvas f54595m;
    public BitmapShader f54596n;
    public BitmapShader f54597o;
    public boolean f54598p;
    public AnimatorSet f54600r;
    public boolean f54601s;
    public org.telegram.ui.ActionBar.u4 f54602t;
    public org.telegram.ui.ActionBar.u4 f54603u;
    public int v;
    public int f54604w;
    public int f54605x;
    public int f54606y;
    public int f54607z;
    public final HashMap f54585a = new HashMap();
    public final HashMap f54586b = new HashMap();
    public final Matrix f54587c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f54594l = new Paint();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public boolean f54599q = org.telegram.ui.ActionBar.m6.I.q();

    public zm(bn bnVar) {
        int i7;
        int i10;
        this.G = bnVar;
        boolean z10 = false;
        if (q(false)) {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            this.f54589f = org.telegram.messenger.f4.f(i7).c(bnVar.f46103l6);
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            TLRPC.WallPaper d = org.telegram.messenger.f4.f(i10).d(bnVar.f46103l6);
            this.f54590g = d;
            org.telegram.ui.ActionBar.s3 s3Var = this.f54589f;
            if (s3Var != null || d != null) {
                s(s3Var, d, false);
                z10 = true;
            }
        }
        if (!z10) {
            t();
        }
        if (!z10 && ThemeEditorView.f33180p == null) {
            org.telegram.ui.ActionBar.m6.t1(true, true);
        } else {
            org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(22));
        }
    }

    public final int a(int i7, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f54589f == null && this.h == null) {
            return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        }
        if (!z10 && (sparseIntArray = this.f54588e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.f54588e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i7)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.m6.x0(null, i7, false);
    }

    public final org.telegram.ui.ActionBar.s3 b() {
        return this.f54589f;
    }

    public final Drawable c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.m6.t0();
    }

    @Override
    public final boolean d() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.f54599q;
        }
        return org.telegram.ui.ActionBar.m6.I.q();
    }

    @Override
    public final void e(float f10, float f11, int i7, int i10) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.f54592j) != null && (bitmapShader = this.f54596n) != null) {
            boolean z10 = this.f54598p;
            Matrix matrix = this.f54587c;
            if (z10) {
                org.telegram.ui.ActionBar.m6.s(this.f54593k, this.f54597o, matrix, i7, i10, f10, f11);
                return;
            } else {
                org.telegram.ui.ActionBar.m6.s(bitmap, bitmapShader, matrix, i7, i10, f10, f11);
                return;
            }
        }
        org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter f() {
        return org.telegram.ui.ActionBar.m6.f29713v3;
    }

    @Override
    public final Paint g(String str) {
        if (this.f54589f == null && this.h == null && !this.f54601s) {
            return null;
        }
        return (Paint) this.f54586b.get(str);
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f54585a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    @Override
    public final boolean h() {
        return this.G.S9();
    }

    @Override
    public final int i(int i7) {
        return k(i7);
    }

    @Override
    public final boolean j() {
        if (this.h == null && !this.f54601s) {
            return org.telegram.ui.ActionBar.m6.d1();
        }
        if (this.f54596n != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int k(int i7) {
        int indexOfKey;
        Integer z02;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.f54588e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.f54588e.valueAt(indexOfKey2);
        }
        if (this.f54601s && (z02 = org.telegram.ui.ActionBar.m6.z0(i7, this)) != null) {
            return z02.intValue();
        }
        if (this.f54589f == null) {
            return org.telegram.ui.ActionBar.m6.v0(i7);
        }
        int indexOfKey3 = this.d.indexOfKey(i7);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i10 = org.telegram.ui.ActionBar.m6.im.get(i7);
        if (i10 >= 0 && (indexOfKey = this.d.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.m6.v0(i7);
    }

    @Override
    public final void l(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f54588e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i7, i10);
        }
    }

    @Override
    public final int m(int i7) {
        return a(i7, false);
    }

    public final void n() {
        Drawable u4Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.m6.dm.entrySet()) {
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
                    u4Var = new org.telegram.ui.ActionBar.u4(0, false, false, this);
                    break;
                case 1:
                    u4Var = new org.telegram.ui.ActionBar.u4(1, false, false, this);
                    break;
                case 2:
                    u4Var = new org.telegram.ui.ActionBar.u4(1, false, true, this);
                    break;
                case 3:
                    u4Var = new org.telegram.ui.ActionBar.u4(1, true, false, this);
                    break;
                case 4:
                    u4Var = new org.telegram.ui.ActionBar.u4(0, true, true, this);
                    break;
                case 5:
                    u4Var = new org.telegram.ui.ActionBar.u4(1, true, true, this);
                    break;
                case 6:
                    u4Var = new org.telegram.ui.ActionBar.u4(0, false, true, this);
                    break;
                case 7:
                    u4Var = new org.telegram.ui.ActionBar.u4(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        u4Var = constantState.newDrawable().mutate();
                    } else {
                        u4Var = null;
                    }
                    if (u4Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.m6.em.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.m6.C1(k(intValue), u4Var);
                            break;
                        }
                    }
                    break;
            }
            if (u4Var != null) {
                this.f54585a.put((String) entry.getKey(), u4Var);
            }
        }
    }

    public final void o() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.m6.fm.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.m6.gm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(k(intValue));
            }
            this.f54586b.put((String) entry.getKey(), paint);
        }
    }

    public final void p(android.graphics.drawable.Drawable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zm.p(android.graphics.drawable.Drawable):void");
    }

    public final boolean q(boolean z10) {
        TLRPC.User user;
        bn bnVar = this.G;
        if (bnVar.h == null) {
            if (z10) {
                if (bnVar.f46005e == null && (user = bnVar.f46019f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void r(org.telegram.ui.ActionBar.s3 r14, org.telegram.tgnet.TLRPC.WallPaper r15, boolean r16, java.lang.Boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zm.r(org.telegram.ui.ActionBar.s3, org.telegram.tgnet.TLRPC$WallPaper, boolean, java.lang.Boolean, boolean):void");
    }

    public final void s(org.telegram.ui.ActionBar.s3 s3Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.cb0 cb0Var;
        int i7;
        int i10;
        int i11;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.j6 j6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        org.telegram.ui.ActionBar.l6 l6Var;
        boolean z11;
        Drawable drawable2;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.l6 Q0;
        int i13;
        org.telegram.ui.ActionBar.l6 Q02;
        org.telegram.ui.ActionBar.s3 s3Var2 = s3Var;
        bn bnVar = this.G;
        if (bnVar.f46285za != null) {
            return;
        }
        this.f54589f = s3Var2;
        this.f54590g = wallPaper;
        if (bnVar.fragmentView != null) {
            drawable = bnVar.f46111m1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.cb0) {
            cb0Var = (org.telegram.ui.Components.cb0) drawable;
        } else {
            cb0Var = null;
        }
        if (cb0Var != null) {
            i7 = cb0Var.f34153i;
        } else {
            i7 = 0;
        }
        if ((s3Var2 == null || s3Var2.f29983a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.m6.lm.indexOfKey(org.telegram.ui.ActionBar.m6.f29370cd);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.m6.lm.valueAt(indexOfKey2);
            } else {
                int i14 = org.telegram.ui.ActionBar.m6.f29316a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (s3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f54586b.clear();
            this.f54585a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.m6.t0();
            if (t02 instanceof org.telegram.ui.Components.cb0) {
                ((org.telegram.ui.Components.cb0) t02).u(i7);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.m6.I.q() == this.f54599q) {
                Q02 = org.telegram.ui.ActionBar.m6.I;
            } else {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26931b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string) != null && !org.telegram.ui.ActionBar.m6.Q0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string2) != null && org.telegram.ui.ActionBar.m6.Q0(string2).q()) {
                    str = string2;
                }
                if (this.f54599q) {
                    Q02 = org.telegram.ui.ActionBar.m6.Q0(str);
                } else {
                    Q02 = org.telegram.ui.ActionBar.m6.Q0(str2);
                }
            }
            org.telegram.ui.ActionBar.m6.u(Q02, false, this.f54599q);
            p(this.h);
            this.f54601s = false;
            t();
            return;
        }
        this.f54601s = false;
        if (org.telegram.messenger.t0.f26931b != null) {
            org.telegram.ui.ActionBar.m6.K(org.telegram.messenger.t0.f26931b, false);
        }
        if (s3Var2 != null) {
            i10 = ((org.telegram.ui.ActionBar.g2) this.G).currentAccount;
            boolean z12 = this.f54599q;
            ArrayList arrayList2 = s3Var2.f29987f;
            org.telegram.ui.ActionBar.l6 i15 = s3Var2.i(z12 ? 1 : 0);
            if (i15 == null) {
                int i16 = ((org.telegram.ui.ActionBar.r3) s3Var2.f29987f.get(z12 ? 1 : 0)).d;
                i11 = 0;
                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) ((ig.a) s3Var2.f29987f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = r3Var.b(i16);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.r3) s3Var2.f29987f.get(z12 ? 1 : 0)).f29959b;
                org.telegram.ui.ActionBar.l6 l6Var2 = new org.telegram.ui.ActionBar.l6(org.telegram.ui.ActionBar.m6.Q0(org.telegram.ui.ActionBar.m6.r0(b10)));
                arrayList = arrayList2;
                j6Var = l6Var2.e(r3Var.a(), b10, tL_theme, i10, true);
                l6Var2.u(j6Var.f29096a);
                i15 = l6Var2;
            } else {
                i11 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i15.f29235b0;
                if (sparseArray != null) {
                    j6Var = (org.telegram.ui.ActionBar.j6) sparseArray.get(((org.telegram.ui.ActionBar.r3) arrayList.get(z12 ? 1 : 0)).f29961e);
                } else {
                    j6Var = null;
                }
            }
            String[] strArr = new String[1];
            if (i15.f29234b != null) {
                sparseIntArray = org.telegram.ui.ActionBar.m6.T0(new File(i15.f29234b), null, strArr);
            } else {
                String str3 = i15.d;
                if (str3 != null) {
                    sparseIntArray = org.telegram.ui.ActionBar.m6.T0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((org.telegram.ui.ActionBar.r3) arrayList.get(z12 ? 1 : 0)).f29963g = strArr[i11];
            if (j6Var != null) {
                SparseIntArray clone = sparseIntArray.clone();
                j6Var.d(sparseIntArray, clone);
                ig.b bVar = s3Var2.f29985c;
                if (bVar != null && !TextUtils.isEmpty(bVar.f16275b) && (l6Var = j6Var.f29097b) != null && l6Var.f29234b == null && !l6Var.q()) {
                    org.telegram.ui.ActionBar.j6.h(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = org.telegram.ui.ActionBar.m6.im;
            for (int i17 = i11; i17 < sparseIntArray2.size(); i17++) {
                int keyAt = sparseIntArray2.keyAt(i17);
                int valueAt = sparseIntArray2.valueAt(i17);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.m6.hm;
            for (int i18 = i11; i18 < iArr.length; i18++) {
                if (sparseIntArray.indexOfKey(i18) < 0) {
                    sparseIntArray.put(i18, iArr[i18]);
                }
            }
            this.d = sparseIntArray;
        } else {
            this.d = new SparseIntArray();
            i11 = 0;
        }
        if (!TextUtils.isEmpty(org.telegram.messenger.f4.j(this.f54590g))) {
            Drawable drawable3 = this.h;
            i13 = ((org.telegram.ui.ActionBar.g2) this.G).currentAccount;
            this.h = hi.v5.f(drawable3, i13, this.f54590g, this.f54599q);
        } else if (wallPaper != null) {
            this.h = en.d(this.h, wallPaper, this.f54599q);
        } else {
            if (s3Var2.f29983a) {
                org.telegram.ui.ActionBar.l6 d = org.telegram.ui.ActionBar.s3.d(this.f54599q);
                i12 = ((org.telegram.ui.ActionBar.g2) this.G).currentAccount;
                org.telegram.ui.ActionBar.m6.I(d, s3Var2.g(i12, this.f54599q ? 1 : 0), ((org.telegram.ui.ActionBar.r3) s3Var2.f29987f.get(this.f54599q ? 1 : 0)).f29963g, i7, i11);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int k10 = k(org.telegram.ui.ActionBar.m6.Ee);
                int k11 = k(org.telegram.ui.ActionBar.m6.Fe);
                int k12 = k(org.telegram.ui.ActionBar.m6.Ge);
                int k13 = k(org.telegram.ui.ActionBar.m6.He);
                org.telegram.ui.Components.cb0 cb0Var2 = new org.telegram.ui.Components.cb0();
                cb0Var2.s(s3Var2.j(this.f54599q ? 1 : 0).settings.intensity, cb0Var2.f34165u);
                TLRPC.Document e10 = s3Var2.e();
                if (cb0Var2.f34168y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    cb0Var2.f34168y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = cb0Var2.f34147c;
                    if (weakReference != null) {
                        cb0Var2.f34168y.H0((View) weakReference.get());
                    }
                    if (cb0Var2.T) {
                        cb0Var2.f34168y.P();
                    }
                }
                cb0Var2.f34168y.q0(org.telegram.messenger.gc.b(e10), "80_80", null, null, null, 0);
                cb0Var2.f34168y.X(1);
                cb0Var2.f34168y.W(1);
                cb0Var2.o(k10, k11, k12, k13, 0, true);
                cb0Var2.u(i7);
                int f10 = cb0Var2.f();
                boolean z13 = this.f54599q;
                oi.f0 f0Var = new oi.f0(18, this, cb0Var2);
                org.telegram.ui.ActionBar.r3 r3Var2 = (org.telegram.ui.ActionBar.r3) s3Var2.f29987f.get(z13 ? 1 : 0);
                if (r3Var2 != null && r3Var2.f29960c != null) {
                    long h = s3Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = r3Var2.f29960c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z11 = z13 ? 1 : 0;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i19);
                            int i20 = i19 + 1;
                            int i21 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i21;
                                i19 = i20;
                            }
                        }
                    } else {
                        z11 = z13 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    org.telegram.messenger.gc b11 = org.telegram.messenger.gc.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.A1 = false;
                    imageReceiver2.q0(b11, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.f22670h1 = new ai.d0(f0Var, h, 3);
                    org.telegram.messenger.fc.D().M(imageReceiver2, null);
                } else {
                    z11 = z13 ? 1 : 0;
                }
                s3Var2 = s3Var;
                s3Var2.n(this.f54599q ? 1 : 0, new org.telegram.messenger.r6(this, s3Var2, z11, cb0Var2, f10));
                drawable2 = cb0Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.f54600r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.f54600r = new AnimatorSet();
            if (cb0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new vm(cb0Var, 0));
                ofFloat.addListener(new xm(cb0Var));
                ofFloat.setDuration(200L);
                this.f54600r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof org.telegram.ui.Components.cb0) {
                org.telegram.ui.Components.cb0 cb0Var3 = (org.telegram.ui.Components.cb0) drawable4;
                cb0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new vm(cb0Var3, 1));
                ofFloat2.addListener(new ym(cb0Var3));
                ofFloat2.setDuration(250L);
                this.f54600r.playTogether(ofFloat2);
            }
            this.f54600r.start();
        }
        if (s3Var2 == null && this.G.f46103l6 >= 0) {
            if (org.telegram.ui.ActionBar.m6.I.q() == this.f54599q) {
                Q0 = org.telegram.ui.ActionBar.m6.I;
            } else {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.t0.f26931b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string3) != null && !org.telegram.ui.ActionBar.m6.Q0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string4) != null && org.telegram.ui.ActionBar.m6.Q0(string4).q()) {
                    str = string4;
                }
                if (this.f54599q) {
                    Q0 = org.telegram.ui.ActionBar.m6.Q0(str);
                } else {
                    Q0 = org.telegram.ui.ActionBar.m6.Q0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.m6.u(Q0, false, this.f54599q);
        } else {
            c10 = 0;
        }
        int i22 = org.telegram.messenger.g0.q(this.h)[c10];
        n();
        o();
        p(this.h);
        u(1.0f);
    }

    public final void t() {
        boolean z10;
        bn bnVar = this.G;
        if (bnVar.f46285za == null && this.f54589f == null && this.f54590g == null) {
            if (bnVar.S9() && !org.telegram.messenger.cz.H0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || this.f54601s) {
                this.f54601s = z10;
                this.f54586b.clear();
                this.f54585a.clear();
                if (z10) {
                    if (org.telegram.messenger.t0.f26931b != null) {
                        org.telegram.ui.ActionBar.m6.K(org.telegram.messenger.t0.f26931b, false);
                    }
                    n();
                    o();
                }
                p(org.telegram.ui.ActionBar.m6.t0());
                u(1.0f);
            }
        }
    }

    public final void u(float f10) {
        int i7;
        int a10;
        int i10;
        int a11;
        int i11;
        int a12;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i12;
        if (!this.f54586b.isEmpty()) {
            Paint g10 = g("paintChatActionBackground");
            Paint g11 = g("paintChatActionBackgroundSelected");
            Paint g12 = g("paintChatMessageBackgroundSelected");
            int i13 = this.B;
            boolean S9 = this.G.S9();
            int i14 = -1;
            if (this.C) {
                a10 = -1;
            } else {
                if (S9) {
                    i7 = org.telegram.ui.ActionBar.m6.Fa;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.Zc;
                }
                a10 = a(i7, true);
            }
            if (this.C) {
                a11 = -1;
            } else {
                if (S9) {
                    i10 = org.telegram.ui.ActionBar.m6.Fa;
                } else {
                    i10 = org.telegram.ui.ActionBar.m6.f29330ad;
                }
                a11 = a(i10, true);
            }
            if (this.C) {
                a12 = -1;
            } else {
                if (S9) {
                    i11 = org.telegram.ui.ActionBar.m6.Ha;
                } else {
                    i11 = org.telegram.ui.ActionBar.m6.f29330ad;
                }
                a12 = a(i11, true);
            }
            if (!this.C) {
                if (S9) {
                    i12 = org.telegram.ui.ActionBar.m6.Ga;
                } else {
                    i12 = org.telegram.ui.ActionBar.m6.bd;
                }
                i14 = a(i12, true);
            }
            int i15 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i15 != 0) {
                i13 = i0.a.f(f10, this.f54607z, i13);
                a10 = i0.a.f(f10, this.v, a10);
                a11 = i0.a.f(f10, this.f54604w, a11);
                a12 = i0.a.f(f10, this.f54605x, a12);
                i14 = i0.a.f(f10, this.f54606y, i14);
            }
            if (g10 != null && !this.C) {
                g10.setColor(i13);
                g11.setColor(i13);
            }
            Paint g13 = g("paintChatActionText");
            if (g13 != null) {
                ((TextPaint) g13).linkColor = a11;
                g("paintChatActionText").setColor(a10);
                g("paintChatBotButton").setColor(a12);
            }
            org.telegram.ui.ActionBar.m6.C1(a10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.m6.C1(a10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.m6.C1(a10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.m6.C1(a10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.m6.C1(a10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.m6.C1(a10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.m6.C1(i14, getDrawable("drawableShareIcon"));
            if (this.f54595m != null && (bitmap = this.f54593k) != null) {
                Rect rect = this.F;
                Rect rect2 = this.E;
                if (i15 != 0 && (bitmap2 = this.A) != null) {
                    this.f54598p = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
                    rect.set(0, 0, this.f54592j.getWidth(), this.f54592j.getHeight());
                    this.f54595m.drawBitmap(this.A, rect2, rect, (Paint) null);
                    Paint paint = this.f54594l;
                    paint.setAlpha((int) (f10 * 255.0f));
                    rect2.set(0, 0, this.f54593k.getWidth(), this.f54593k.getHeight());
                    rect.set(0, 0, this.f54592j.getWidth(), this.f54592j.getHeight());
                    this.f54595m.drawBitmap(this.f54593k, rect2, rect, paint);
                    if (g10 != null) {
                        g10.setShader(this.f54596n);
                        g11.setShader(this.f54596n);
                    }
                    if (g12 != null) {
                        g12.setShader(this.f54596n);
                        return;
                    }
                    return;
                }
                this.f54598p = true;
                rect2.set(0, 0, bitmap.getWidth(), this.f54593k.getHeight());
                rect.set(0, 0, this.f54592j.getWidth(), this.f54592j.getHeight());
                this.f54595m.drawBitmap(this.f54593k, rect2, rect, (Paint) null);
                if (g10 != null) {
                    g10.setShader(this.f54597o);
                    g11.setShader(this.f54597o);
                }
                if (g12 != null) {
                    g12.setShader(this.f54597o);
                }
            }
        }
    }
}
