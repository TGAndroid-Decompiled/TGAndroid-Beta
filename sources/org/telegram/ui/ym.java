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
public final class ym implements org.telegram.ui.ActionBar.e6, org.telegram.ui.Components.fa0 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final an G;
    public SparseIntArray f53544e;
    public org.telegram.ui.ActionBar.p3 f53545f;
    public TLRPC.WallPaper f53546g;
    public Drawable h;
    public ValueAnimator f53547i;
    public Bitmap f53548j;
    public Bitmap f53549k;
    public Canvas f53551m;
    public BitmapShader f53552n;
    public BitmapShader f53553o;
    public boolean f53554p;
    public AnimatorSet f53556r;
    public boolean f53557s;
    public org.telegram.ui.ActionBar.r4 f53558t;
    public org.telegram.ui.ActionBar.r4 f53559u;
    public int v;
    public int f53560w;
    public int f53561x;
    public int f53562y;
    public int f53563z;
    public final HashMap f53541a = new HashMap();
    public final HashMap f53542b = new HashMap();
    public final Matrix f53543c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f53550l = new Paint();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public boolean f53555q = org.telegram.ui.ActionBar.j6.I.q();

    public ym(an anVar) {
        int i7;
        int i10;
        this.G = anVar;
        boolean z10 = false;
        if (q(false)) {
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            this.f53545f = org.telegram.messenger.d4.f(i7).c(anVar.f45259k6);
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            TLRPC.WallPaper d = org.telegram.messenger.d4.f(i10).d(anVar.f45259k6);
            this.f53546g = d;
            org.telegram.ui.ActionBar.p3 p3Var = this.f53545f;
            if (p3Var != null || d != null) {
                s(p3Var, d, false);
                z10 = true;
            }
        }
        if (!z10) {
            t();
        }
        if (!z10 && ThemeEditorView.f32747p == null) {
            org.telegram.ui.ActionBar.j6.t1(true, true);
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.messenger.c6(20));
        }
    }

    @Override
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.f53555q;
        }
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.f53548j) != null && (bitmapShader = this.f53552n) != null) {
            boolean z10 = this.f53554p;
            Matrix matrix = this.f53543c;
            if (z10) {
                org.telegram.ui.ActionBar.j6.s(this.f53549k, this.f53553o, matrix, i7, i10, f10, f11);
                return;
            } else {
                org.telegram.ui.ActionBar.j6.s(bitmap, bitmapShader, matrix, i7, i10, f10, f11);
                return;
            }
        }
        org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.j6.f29181v3;
    }

    @Override
    public final Paint d(String str) {
        if (this.f53545f == null && this.h == null && !this.f53557s) {
            return null;
        }
        return (Paint) this.f53542b.get(str);
    }

    @Override
    public final boolean e() {
        return this.G.S9();
    }

    @Override
    public final int f(int i7) {
        return h(i7);
    }

    @Override
    public final boolean g() {
        if (this.h == null && !this.f53557s) {
            return org.telegram.ui.ActionBar.j6.d1();
        }
        if (this.f53552n != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f53541a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    @Override
    public final int h(int i7) {
        int indexOfKey;
        Integer z02;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.f53544e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.f53544e.valueAt(indexOfKey2);
        }
        if (this.f53557s && (z02 = org.telegram.ui.ActionBar.j6.z0(i7, this)) != null) {
            return z02.intValue();
        }
        if (this.f53545f == null) {
            return org.telegram.ui.ActionBar.j6.v0(i7);
        }
        int indexOfKey3 = this.d.indexOfKey(i7);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i10 = org.telegram.ui.ActionBar.j6.im.get(i7);
        if (i10 >= 0 && (indexOfKey = this.d.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.j6.v0(i7);
    }

    @Override
    public final void i(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f53544e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i7, i10);
        }
    }

    @Override
    public final int j(int i7) {
        return k(i7, false);
    }

    public final int k(int i7, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f53545f == null && this.h == null) {
            return org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        }
        if (!z10 && (sparseIntArray = this.f53544e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.f53544e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i7)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.j6.x0(null, i7, false);
    }

    public final org.telegram.ui.ActionBar.p3 l() {
        return this.f53545f;
    }

    public final Drawable m() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.j6.t0();
    }

    public final void n() {
        Drawable r4Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.dm.entrySet()) {
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
                    r4Var = new org.telegram.ui.ActionBar.r4(0, false, false, this);
                    break;
                case 1:
                    r4Var = new org.telegram.ui.ActionBar.r4(1, false, false, this);
                    break;
                case 2:
                    r4Var = new org.telegram.ui.ActionBar.r4(1, false, true, this);
                    break;
                case 3:
                    r4Var = new org.telegram.ui.ActionBar.r4(1, true, false, this);
                    break;
                case 4:
                    r4Var = new org.telegram.ui.ActionBar.r4(0, true, true, this);
                    break;
                case 5:
                    r4Var = new org.telegram.ui.ActionBar.r4(1, true, true, this);
                    break;
                case 6:
                    r4Var = new org.telegram.ui.ActionBar.r4(0, false, true, this);
                    break;
                case 7:
                    r4Var = new org.telegram.ui.ActionBar.r4(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        r4Var = constantState.newDrawable().mutate();
                    } else {
                        r4Var = null;
                    }
                    if (r4Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.j6.em.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.j6.C1(h(intValue), r4Var);
                            break;
                        }
                    }
                    break;
            }
            if (r4Var != null) {
                this.f53541a.put((String) entry.getKey(), r4Var);
            }
        }
    }

    public final void o() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.fm.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.j6.gm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(h(intValue));
            }
            this.f53542b.put((String) entry.getKey(), paint);
        }
    }

    public final void p(android.graphics.drawable.Drawable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ym.p(android.graphics.drawable.Drawable):void");
    }

    public final boolean q(boolean z10) {
        TLRPC.User user;
        an anVar = this.G;
        if (anVar.h == null) {
            if (z10) {
                if (anVar.f45173e == null && (user = anVar.f45187f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void r(org.telegram.ui.ActionBar.p3 r14, org.telegram.tgnet.TLRPC.WallPaper r15, boolean r16, java.lang.Boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ym.r(org.telegram.ui.ActionBar.p3, org.telegram.tgnet.TLRPC$WallPaper, boolean, java.lang.Boolean, boolean):void");
    }

    public final void s(org.telegram.ui.ActionBar.p3 p3Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.ra0 ra0Var;
        int i7;
        int i10;
        int i11;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.g6 g6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean z11;
        Drawable drawable2;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.i6 Q0;
        int i13;
        org.telegram.ui.ActionBar.i6 Q02;
        org.telegram.ui.ActionBar.p3 p3Var2 = p3Var;
        an anVar = this.G;
        if (anVar.ya != null) {
            return;
        }
        this.f53545f = p3Var2;
        this.f53546g = wallPaper;
        if (anVar.fragmentView != null) {
            drawable = anVar.f45278m1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.ra0) {
            ra0Var = (org.telegram.ui.Components.ra0) drawable;
        } else {
            ra0Var = null;
        }
        if (ra0Var != null) {
            i7 = ra0Var.f38924i;
        } else {
            i7 = 0;
        }
        if ((p3Var2 == null || p3Var2.f29470a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.j6.lm.indexOfKey(org.telegram.ui.ActionBar.j6.f28838cd);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.j6.lm.valueAt(indexOfKey2);
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.f28784a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (p3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f53542b.clear();
            this.f53541a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.j6.t0();
            if (t02 instanceof org.telegram.ui.Components.ra0) {
                ((org.telegram.ui.Components.ra0) t02).u(i7);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.j6.I.q() == this.f53555q) {
                Q02 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26600b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string) != null && !org.telegram.ui.ActionBar.j6.Q0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string2) != null && org.telegram.ui.ActionBar.j6.Q0(string2).q()) {
                    str = string2;
                }
                if (this.f53555q) {
                    Q02 = org.telegram.ui.ActionBar.j6.Q0(str);
                } else {
                    Q02 = org.telegram.ui.ActionBar.j6.Q0(str2);
                }
            }
            org.telegram.ui.ActionBar.j6.u(Q02, false, this.f53555q);
            p(this.h);
            this.f53557s = false;
            t();
            return;
        }
        this.f53557s = false;
        if (org.telegram.messenger.t0.f26600b != null) {
            org.telegram.ui.ActionBar.j6.K(org.telegram.messenger.t0.f26600b, false);
        }
        if (p3Var2 != null) {
            i10 = ((org.telegram.ui.ActionBar.e2) this.G).currentAccount;
            boolean z12 = this.f53555q;
            ArrayList arrayList2 = p3Var2.f29474f;
            org.telegram.ui.ActionBar.i6 i15 = p3Var2.i(z12 ? 1 : 0);
            if (i15 == null) {
                int i16 = ((org.telegram.ui.ActionBar.o3) p3Var2.f29474f.get(z12 ? 1 : 0)).d;
                i11 = 0;
                org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) ((ig.a) p3Var2.f29474f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = o3Var.b(i16);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.o3) p3Var2.f29474f.get(z12 ? 1 : 0)).f29437b;
                org.telegram.ui.ActionBar.i6 i6Var2 = new org.telegram.ui.ActionBar.i6(org.telegram.ui.ActionBar.j6.Q0(org.telegram.ui.ActionBar.j6.r0(b10)));
                arrayList = arrayList2;
                g6Var = i6Var2.e(o3Var.a(), b10, tL_theme, i10, true);
                i6Var2.u(g6Var.f28602a);
                i15 = i6Var2;
            } else {
                i11 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i15.f28701b0;
                if (sparseArray != null) {
                    g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(((org.telegram.ui.ActionBar.o3) arrayList.get(z12 ? 1 : 0)).f29439e);
                } else {
                    g6Var = null;
                }
            }
            String[] strArr = new String[1];
            if (i15.f28700b != null) {
                sparseIntArray = org.telegram.ui.ActionBar.j6.T0(new File(i15.f28700b), null, strArr);
            } else {
                String str3 = i15.d;
                if (str3 != null) {
                    sparseIntArray = org.telegram.ui.ActionBar.j6.T0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((org.telegram.ui.ActionBar.o3) arrayList.get(z12 ? 1 : 0)).f29441g = strArr[i11];
            if (g6Var != null) {
                SparseIntArray clone = sparseIntArray.clone();
                g6Var.d(sparseIntArray, clone);
                ig.b bVar = p3Var2.f29472c;
                if (bVar != null && !TextUtils.isEmpty(bVar.f15934b) && (i6Var = g6Var.f28603b) != null && i6Var.f28700b == null && !i6Var.q()) {
                    org.telegram.ui.ActionBar.g6.h(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = org.telegram.ui.ActionBar.j6.im;
            for (int i17 = i11; i17 < sparseIntArray2.size(); i17++) {
                int keyAt = sparseIntArray2.keyAt(i17);
                int valueAt = sparseIntArray2.valueAt(i17);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.j6.hm;
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
        if (!TextUtils.isEmpty(org.telegram.messenger.d4.j(this.f53546g))) {
            Drawable drawable3 = this.h;
            i13 = ((org.telegram.ui.ActionBar.e2) this.G).currentAccount;
            this.h = hi.x5.f(drawable3, i13, this.f53546g, this.f53555q);
        } else if (wallPaper != null) {
            this.h = dn.d(this.h, wallPaper, this.f53555q);
        } else {
            if (p3Var2.f29470a) {
                org.telegram.ui.ActionBar.i6 d = org.telegram.ui.ActionBar.p3.d(this.f53555q);
                i12 = ((org.telegram.ui.ActionBar.e2) this.G).currentAccount;
                org.telegram.ui.ActionBar.j6.I(d, p3Var2.g(i12, this.f53555q ? 1 : 0), ((org.telegram.ui.ActionBar.o3) p3Var2.f29474f.get(this.f53555q ? 1 : 0)).f29441g, i7, i11);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int h = h(org.telegram.ui.ActionBar.j6.Ee);
                int h7 = h(org.telegram.ui.ActionBar.j6.Fe);
                int h10 = h(org.telegram.ui.ActionBar.j6.Ge);
                int h11 = h(org.telegram.ui.ActionBar.j6.He);
                org.telegram.ui.Components.ra0 ra0Var2 = new org.telegram.ui.Components.ra0();
                ra0Var2.s(p3Var2.j(this.f53555q ? 1 : 0).settings.intensity, ra0Var2.f38936u);
                TLRPC.Document e10 = p3Var2.e();
                if (ra0Var2.f38939y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    ra0Var2.f38939y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = ra0Var2.f38918c;
                    if (weakReference != null) {
                        ra0Var2.f38939y.H0((View) weakReference.get());
                    }
                    if (ra0Var2.T) {
                        ra0Var2.f38939y.P();
                    }
                }
                ra0Var2.f38939y.q0(org.telegram.messenger.gc.b(e10), "80_80", null, null, null, 0);
                ra0Var2.f38939y.X(1);
                ra0Var2.f38939y.W(1);
                ra0Var2.o(h, h7, h10, h11, 0, true);
                ra0Var2.u(i7);
                int f10 = ra0Var2.f();
                boolean z13 = this.f53555q;
                m2.d dVar = new m2.d(20, this, ra0Var2);
                org.telegram.ui.ActionBar.o3 o3Var2 = (org.telegram.ui.ActionBar.o3) p3Var2.f29474f.get(z13 ? 1 : 0);
                if (o3Var2 != null && o3Var2.f29438c != null) {
                    long h12 = p3Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = o3Var2.f29438c.gift;
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
                    imageReceiver2.f22276h1 = new ai.c0(dVar, h12, 3);
                    org.telegram.messenger.fc.D().M(imageReceiver2, null);
                } else {
                    z11 = z13 ? 1 : 0;
                }
                p3Var2 = p3Var;
                p3Var2.n(this.f53555q ? 1 : 0, new org.telegram.messenger.r6(this, p3Var2, z11, ra0Var2, f10));
                drawable2 = ra0Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.f53556r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.f53556r = new AnimatorSet();
            if (ra0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new um(ra0Var, 0));
                ofFloat.addListener(new wm(ra0Var));
                ofFloat.setDuration(200L);
                this.f53556r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof org.telegram.ui.Components.ra0) {
                org.telegram.ui.Components.ra0 ra0Var3 = (org.telegram.ui.Components.ra0) drawable4;
                ra0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new um(ra0Var3, 1));
                ofFloat2.addListener(new xm(ra0Var3));
                ofFloat2.setDuration(250L);
                this.f53556r.playTogether(ofFloat2);
            }
            this.f53556r.start();
        }
        if (p3Var2 == null && this.G.f45259k6 >= 0) {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.f53555q) {
                Q0 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.t0.f26600b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string3) != null && !org.telegram.ui.ActionBar.j6.Q0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string4) != null && org.telegram.ui.ActionBar.j6.Q0(string4).q()) {
                    str = string4;
                }
                if (this.f53555q) {
                    Q0 = org.telegram.ui.ActionBar.j6.Q0(str);
                } else {
                    Q0 = org.telegram.ui.ActionBar.j6.Q0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.j6.u(Q0, false, this.f53555q);
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
        an anVar = this.G;
        if (anVar.ya == null && this.f53545f == null && this.f53546g == null) {
            if (anVar.S9() && !org.telegram.messenger.gz.H0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || this.f53557s) {
                this.f53557s = z10;
                this.f53542b.clear();
                this.f53541a.clear();
                if (z10) {
                    if (org.telegram.messenger.t0.f26600b != null) {
                        org.telegram.ui.ActionBar.j6.K(org.telegram.messenger.t0.f26600b, false);
                    }
                    n();
                    o();
                }
                p(org.telegram.ui.ActionBar.j6.t0());
                u(1.0f);
            }
        }
    }

    public final void u(float f10) {
        int i7;
        int k10;
        int i10;
        int k11;
        int i11;
        int k12;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i12;
        if (!this.f53542b.isEmpty()) {
            Paint d = d("paintChatActionBackground");
            Paint d2 = d("paintChatActionBackgroundSelected");
            Paint d10 = d("paintChatMessageBackgroundSelected");
            int i13 = this.B;
            boolean S9 = this.G.S9();
            int i14 = -1;
            if (this.C) {
                k10 = -1;
            } else {
                if (S9) {
                    i7 = org.telegram.ui.ActionBar.j6.Fa;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.Zc;
                }
                k10 = k(i7, true);
            }
            if (this.C) {
                k11 = -1;
            } else {
                if (S9) {
                    i10 = org.telegram.ui.ActionBar.j6.Fa;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f28798ad;
                }
                k11 = k(i10, true);
            }
            if (this.C) {
                k12 = -1;
            } else {
                if (S9) {
                    i11 = org.telegram.ui.ActionBar.j6.Ha;
                } else {
                    i11 = org.telegram.ui.ActionBar.j6.f28798ad;
                }
                k12 = k(i11, true);
            }
            if (!this.C) {
                if (S9) {
                    i12 = org.telegram.ui.ActionBar.j6.Ga;
                } else {
                    i12 = org.telegram.ui.ActionBar.j6.bd;
                }
                i14 = k(i12, true);
            }
            int i15 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i15 != 0) {
                i13 = i0.a.f(f10, this.f53563z, i13);
                k10 = i0.a.f(f10, this.v, k10);
                k11 = i0.a.f(f10, this.f53560w, k11);
                k12 = i0.a.f(f10, this.f53561x, k12);
                i14 = i0.a.f(f10, this.f53562y, i14);
            }
            if (d != null && !this.C) {
                d.setColor(i13);
                d2.setColor(i13);
            }
            Paint d11 = d("paintChatActionText");
            if (d11 != null) {
                ((TextPaint) d11).linkColor = k11;
                d("paintChatActionText").setColor(k10);
                d("paintChatBotButton").setColor(k12);
            }
            org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.j6.C1(i14, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.j6.C1(i14, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.j6.C1(i14, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.j6.C1(i14, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.j6.C1(i14, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.j6.C1(i14, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.j6.C1(i14, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.j6.C1(i14, getDrawable("drawableShareIcon"));
            if (this.f53551m != null && (bitmap = this.f53549k) != null) {
                Rect rect = this.F;
                Rect rect2 = this.E;
                if (i15 != 0 && (bitmap2 = this.A) != null) {
                    this.f53554p = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
                    rect.set(0, 0, this.f53548j.getWidth(), this.f53548j.getHeight());
                    this.f53551m.drawBitmap(this.A, rect2, rect, (Paint) null);
                    Paint paint = this.f53550l;
                    paint.setAlpha((int) (f10 * 255.0f));
                    rect2.set(0, 0, this.f53549k.getWidth(), this.f53549k.getHeight());
                    rect.set(0, 0, this.f53548j.getWidth(), this.f53548j.getHeight());
                    this.f53551m.drawBitmap(this.f53549k, rect2, rect, paint);
                    if (d != null) {
                        d.setShader(this.f53552n);
                        d2.setShader(this.f53552n);
                    }
                    if (d10 != null) {
                        d10.setShader(this.f53552n);
                        return;
                    }
                    return;
                }
                this.f53554p = true;
                rect2.set(0, 0, bitmap.getWidth(), this.f53549k.getHeight());
                rect.set(0, 0, this.f53548j.getWidth(), this.f53548j.getHeight());
                this.f53551m.drawBitmap(this.f53549k, rect2, rect, (Paint) null);
                if (d != null) {
                    d.setShader(this.f53553o);
                    d2.setShader(this.f53553o);
                }
                if (d10 != null) {
                    d10.setShader(this.f53553o);
                }
            }
        }
    }
}
