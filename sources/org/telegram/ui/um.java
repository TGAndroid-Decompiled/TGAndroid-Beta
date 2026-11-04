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
public final class um implements org.telegram.ui.ActionBar.e6, org.telegram.ui.Components.z90 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final wm G;
    public SparseIntArray f50123e;
    public org.telegram.ui.ActionBar.p3 f50124f;
    public TLRPC.WallPaper f50125g;
    public Drawable h;
    public ValueAnimator f50126i;
    public Bitmap f50127j;
    public Bitmap f50128k;
    public Canvas f50130m;
    public BitmapShader f50131n;
    public BitmapShader f50132o;
    public boolean f50133p;
    public AnimatorSet f50135r;
    public boolean f50136s;
    public org.telegram.ui.ActionBar.t4 f50137t;
    public org.telegram.ui.ActionBar.t4 f50138u;
    public int v;
    public int f50139w;
    public int f50140x;
    public int f50141y;
    public int f50142z;
    public final HashMap f50120a = new HashMap();
    public final HashMap f50121b = new HashMap();
    public final Matrix f50122c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f50129l = new Paint();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public boolean f50134q = org.telegram.ui.ActionBar.k6.I.q();

    public um(wm wmVar) {
        int i3;
        int i10;
        this.G = wmVar;
        boolean z10 = false;
        if (q(false)) {
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            this.f50124f = org.telegram.messenger.d4.f(i3).c(wmVar.f51376k6);
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            TLRPC.WallPaper d = org.telegram.messenger.d4.f(i10).d(wmVar.f51376k6);
            this.f50125g = d;
            org.telegram.ui.ActionBar.p3 p3Var = this.f50124f;
            if (p3Var != null || d != null) {
                s(p3Var, d, false);
                z10 = true;
            }
        }
        if (!z10) {
            t();
        }
        if (!z10 && ThemeEditorView.f31640p == null) {
            org.telegram.ui.ActionBar.k6.t1(true, true);
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.messenger.hc(18));
        }
    }

    @Override
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.f50134q;
        }
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public final void b(float f10, float f11, int i3, int i10) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.f50127j) != null && (bitmapShader = this.f50131n) != null) {
            boolean z10 = this.f50133p;
            Matrix matrix = this.f50122c;
            if (z10) {
                org.telegram.ui.ActionBar.k6.s(this.f50128k, this.f50132o, matrix, i3, i10, f10, f11);
                return;
            } else {
                org.telegram.ui.ActionBar.k6.s(bitmap, bitmapShader, matrix, i3, i10, f10, f11);
                return;
            }
        }
        org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.f28211v3;
    }

    @Override
    public final Paint d(String str) {
        if (this.f50124f == null && this.h == null && !this.f50136s) {
            return null;
        }
        return (Paint) this.f50121b.get(str);
    }

    @Override
    public final boolean e() {
        return this.G.Q9();
    }

    @Override
    public final int f(int i3) {
        return h(i3);
    }

    @Override
    public final boolean g() {
        if (this.h == null && !this.f50136s) {
            return org.telegram.ui.ActionBar.k6.d1();
        }
        if (this.f50131n != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f50120a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    @Override
    public final int h(int i3) {
        int indexOfKey;
        Integer z02;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.f50123e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i3)) >= 0) {
            return this.f50123e.valueAt(indexOfKey2);
        }
        if (this.f50136s && (z02 = org.telegram.ui.ActionBar.k6.z0(i3, this)) != null) {
            return z02.intValue();
        }
        if (this.f50124f == null) {
            return org.telegram.ui.ActionBar.k6.v0(i3);
        }
        int indexOfKey3 = this.d.indexOfKey(i3);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i10 = org.telegram.ui.ActionBar.k6.fm.get(i3);
        if (i10 >= 0 && (indexOfKey = this.d.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.k6.v0(i3);
    }

    @Override
    public final void i(int i3, int i10) {
        SparseIntArray sparseIntArray = this.f50123e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i3, i10);
        }
    }

    @Override
    public final int j(int i3) {
        return k(i3, false);
    }

    public final int k(int i3, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f50124f == null && this.h == null) {
            return org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        }
        if (!z10 && (sparseIntArray = this.f50123e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i3)) >= 0) {
            return this.f50123e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i3)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i3, false);
    }

    public final org.telegram.ui.ActionBar.p3 l() {
        return this.f50124f;
    }

    public final Drawable m() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.k6.t0();
    }

    public final void n() {
        Drawable t4Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.k6.am.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -2061232504:
                    if (str.equals("drawableMsgIn")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -2005320132:
                    if (str.equals("drawableMsgInMedia")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1656383241:
                    if (str.equals("drawableMsgInMediaSelected")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1451465639:
                    if (str.equals("drawableMsgOutMedia")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1084641786:
                    if (str.equals("drawableMsgOutSelected")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -8170988:
                    if (str.equals("drawableMsgOutMediaSelected")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 300508483:
                    if (str.equals("drawableMsgInSelected")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 526307915:
                    if (str.equals("drawableMsgOut")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    t4Var = new org.telegram.ui.ActionBar.t4(0, false, false, this);
                    break;
                case 1:
                    t4Var = new org.telegram.ui.ActionBar.t4(1, false, false, this);
                    break;
                case 2:
                    t4Var = new org.telegram.ui.ActionBar.t4(1, false, true, this);
                    break;
                case 3:
                    t4Var = new org.telegram.ui.ActionBar.t4(1, true, false, this);
                    break;
                case 4:
                    t4Var = new org.telegram.ui.ActionBar.t4(0, true, true, this);
                    break;
                case 5:
                    t4Var = new org.telegram.ui.ActionBar.t4(1, true, true, this);
                    break;
                case 6:
                    t4Var = new org.telegram.ui.ActionBar.t4(0, false, true, this);
                    break;
                case 7:
                    t4Var = new org.telegram.ui.ActionBar.t4(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        t4Var = constantState.newDrawable().mutate();
                    } else {
                        t4Var = null;
                    }
                    if (t4Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.k6.bm.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.k6.C1(h(intValue), t4Var);
                            break;
                        }
                    }
                    break;
            }
            if (t4Var != null) {
                this.f50120a.put((String) entry.getKey(), t4Var);
            }
        }
    }

    public final void o() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.k6.cm.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.k6.dm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(h(intValue));
            }
            this.f50121b.put((String) entry.getKey(), paint);
        }
    }

    public final void p(android.graphics.drawable.Drawable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.um.p(android.graphics.drawable.Drawable):void");
    }

    public final boolean q(boolean z10) {
        TLRPC.User user;
        wm wmVar = this.G;
        if (wmVar.h == null) {
            if (z10) {
                if (wmVar.f51292e == null && (user = wmVar.f51306f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void r(org.telegram.ui.ActionBar.p3 r14, org.telegram.tgnet.TLRPC.WallPaper r15, boolean r16, java.lang.Boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.um.r(org.telegram.ui.ActionBar.p3, org.telegram.tgnet.TLRPC$WallPaper, boolean, java.lang.Boolean, boolean):void");
    }

    public final void s(org.telegram.ui.ActionBar.p3 p3Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.la0 la0Var;
        int i3;
        int i10;
        int i11;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.g6 g6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        org.telegram.ui.ActionBar.j6 j6Var;
        boolean z11;
        Drawable drawable2;
        int i12;
        char c2;
        org.telegram.ui.ActionBar.j6 Q0;
        int i13;
        org.telegram.ui.ActionBar.j6 Q02;
        org.telegram.ui.ActionBar.p3 p3Var2 = p3Var;
        wm wmVar = this.G;
        if (wmVar.f51531wa != null) {
            return;
        }
        this.f50124f = p3Var2;
        this.f50125g = wallPaper;
        if (wmVar.fragmentView != null) {
            drawable = wmVar.m1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.la0) {
            la0Var = (org.telegram.ui.Components.la0) drawable;
        } else {
            la0Var = null;
        }
        if (la0Var != null) {
            i3 = la0Var.f35656i;
        } else {
            i3 = 0;
        }
        if ((p3Var2 == null || p3Var2.f28419a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.k6.im.indexOfKey(org.telegram.ui.ActionBar.k6.Zc);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.k6.im.valueAt(indexOfKey2);
            } else {
                int i14 = org.telegram.ui.ActionBar.k6.f27816a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (p3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f50121b.clear();
            this.f50120a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
            if (t02 instanceof org.telegram.ui.Components.la0) {
                ((org.telegram.ui.Components.la0) t02).u(i3);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.k6.I.q() == this.f50134q) {
                Q02 = org.telegram.ui.ActionBar.k6.I;
            } else {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string) != null && !org.telegram.ui.ActionBar.k6.Q0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string2) != null && org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
                    str = string2;
                }
                if (this.f50134q) {
                    Q02 = org.telegram.ui.ActionBar.k6.Q0(str);
                } else {
                    Q02 = org.telegram.ui.ActionBar.k6.Q0(str2);
                }
            }
            org.telegram.ui.ActionBar.k6.u(Q02, false, this.f50134q);
            p(this.h);
            this.f50136s = false;
            t();
            return;
        }
        this.f50136s = false;
        if (org.telegram.messenger.t0.f25457b != null) {
            org.telegram.ui.ActionBar.k6.K(org.telegram.messenger.t0.f25457b, false);
        }
        if (p3Var2 != null) {
            i10 = ((org.telegram.ui.ActionBar.d2) this.G).currentAccount;
            boolean z12 = this.f50134q;
            ArrayList arrayList2 = p3Var2.f28423f;
            org.telegram.ui.ActionBar.j6 i15 = p3Var2.i(z12 ? 1 : 0);
            if (i15 == null) {
                int i16 = ((org.telegram.ui.ActionBar.o3) p3Var2.f28423f.get(z12 ? 1 : 0)).d;
                i11 = 0;
                org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) ((jg.a) p3Var2.f28423f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = o3Var.b(i16);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.o3) p3Var2.f28423f.get(z12 ? 1 : 0)).f28383b;
                org.telegram.ui.ActionBar.j6 j6Var2 = new org.telegram.ui.ActionBar.j6(org.telegram.ui.ActionBar.k6.Q0(org.telegram.ui.ActionBar.k6.r0(b10)));
                arrayList = arrayList2;
                g6Var = j6Var2.e(o3Var.a(), b10, tL_theme, i10, true);
                j6Var2.u(g6Var.f27525a);
                i15 = j6Var2;
            } else {
                i11 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i15.f27678b0;
                if (sparseArray != null) {
                    g6Var = (org.telegram.ui.ActionBar.g6) sparseArray.get(((org.telegram.ui.ActionBar.o3) arrayList.get(z12 ? 1 : 0)).f28385e);
                } else {
                    g6Var = null;
                }
            }
            String[] strArr = new String[1];
            if (i15.f27677b != null) {
                sparseIntArray = org.telegram.ui.ActionBar.k6.T0(new File(i15.f27677b), null, strArr);
            } else {
                String str3 = i15.d;
                if (str3 != null) {
                    sparseIntArray = org.telegram.ui.ActionBar.k6.T0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((org.telegram.ui.ActionBar.o3) arrayList.get(z12 ? 1 : 0)).f28387g = strArr[i11];
            if (g6Var != null) {
                SparseIntArray clone = sparseIntArray.clone();
                g6Var.d(sparseIntArray, clone);
                jg.b bVar = p3Var2.f28421c;
                if (bVar != null && !TextUtils.isEmpty(bVar.f16249b) && (j6Var = g6Var.f27526b) != null && j6Var.f27677b == null && !j6Var.q()) {
                    org.telegram.ui.ActionBar.g6.h(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = org.telegram.ui.ActionBar.k6.fm;
            for (int i17 = i11; i17 < sparseIntArray2.size(); i17++) {
                int keyAt = sparseIntArray2.keyAt(i17);
                int valueAt = sparseIntArray2.valueAt(i17);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.k6.em;
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
        if (!TextUtils.isEmpty(org.telegram.messenger.d4.j(this.f50125g))) {
            Drawable drawable3 = this.h;
            i13 = ((org.telegram.ui.ActionBar.d2) this.G).currentAccount;
            this.h = gi.y5.f(drawable3, i13, this.f50125g, this.f50134q);
        } else if (wallPaper != null) {
            this.h = zm.d(this.h, wallPaper, this.f50134q);
        } else {
            if (p3Var2.f28419a) {
                org.telegram.ui.ActionBar.j6 d = org.telegram.ui.ActionBar.p3.d(this.f50134q);
                i12 = ((org.telegram.ui.ActionBar.d2) this.G).currentAccount;
                org.telegram.ui.ActionBar.k6.I(d, p3Var2.g(i12, this.f50134q ? 1 : 0), ((org.telegram.ui.ActionBar.o3) p3Var2.f28423f.get(this.f50134q ? 1 : 0)).f28387g, i3, i11);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int h = h(org.telegram.ui.ActionBar.k6.Be);
                int h7 = h(org.telegram.ui.ActionBar.k6.Ce);
                int h10 = h(org.telegram.ui.ActionBar.k6.De);
                int h11 = h(org.telegram.ui.ActionBar.k6.Ee);
                org.telegram.ui.Components.la0 la0Var2 = new org.telegram.ui.Components.la0();
                la0Var2.s(la0Var2.f35668u, p3Var2.j(this.f50134q ? 1 : 0).settings.intensity);
                TLRPC.Document e10 = p3Var2.e();
                if (la0Var2.f35671y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    la0Var2.f35671y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = la0Var2.f35650c;
                    if (weakReference != null) {
                        la0Var2.f35671y.H0((View) weakReference.get());
                    }
                    if (la0Var2.T) {
                        la0Var2.f35671y.P();
                    }
                }
                la0Var2.f35671y.q0(org.telegram.messenger.ac.b(e10), "80_80", null, null, null, 0);
                la0Var2.f35671y.X(1);
                la0Var2.f35671y.W(1);
                la0Var2.o(h, h7, h10, h11, 0, true);
                la0Var2.u(i3);
                int f10 = la0Var2.f();
                boolean z13 = this.f50134q;
                mi.d4 d4Var = new mi.d4(26, this, la0Var2);
                org.telegram.ui.ActionBar.o3 o3Var2 = (org.telegram.ui.ActionBar.o3) p3Var2.f28423f.get(z13 ? 1 : 0);
                if (o3Var2 != null && o3Var2.f28384c != null) {
                    long h12 = p3Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = o3Var2.f28384c.gift;
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
                    org.telegram.messenger.ac b11 = org.telegram.messenger.ac.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.A1 = false;
                    imageReceiver2.q0(b11, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.f21247h1 = new ei.c1(d4Var, h12, 3);
                    org.telegram.messenger.zb.D().M(imageReceiver2, null);
                } else {
                    z11 = z13 ? 1 : 0;
                }
                p3Var2 = p3Var;
                p3Var2.n(this.f50134q ? 1 : 0, new org.telegram.messenger.r6(this, p3Var2, z11, la0Var2, f10));
                drawable2 = la0Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.f50135r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.f50135r = new AnimatorSet();
            if (la0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new qm(la0Var, 0));
                ofFloat.addListener(new sm(la0Var));
                ofFloat.setDuration(200L);
                this.f50135r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof org.telegram.ui.Components.la0) {
                org.telegram.ui.Components.la0 la0Var3 = (org.telegram.ui.Components.la0) drawable4;
                la0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new qm(la0Var3, 1));
                ofFloat2.addListener(new tm(la0Var3));
                ofFloat2.setDuration(250L);
                this.f50135r.playTogether(ofFloat2);
            }
            this.f50135r.start();
        }
        if (p3Var2 == null && this.G.f51376k6 >= 0) {
            if (org.telegram.ui.ActionBar.k6.I.q() == this.f50134q) {
                Q0 = org.telegram.ui.ActionBar.k6.I;
            } else {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.t0.f25457b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string3) != null && !org.telegram.ui.ActionBar.k6.Q0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string4) != null && org.telegram.ui.ActionBar.k6.Q0(string4).q()) {
                    str = string4;
                }
                if (this.f50134q) {
                    Q0 = org.telegram.ui.ActionBar.k6.Q0(str);
                } else {
                    Q0 = org.telegram.ui.ActionBar.k6.Q0(str2);
                }
            }
            c2 = 0;
            org.telegram.ui.ActionBar.k6.u(Q0, false, this.f50134q);
        } else {
            c2 = 0;
        }
        int i22 = org.telegram.messenger.g0.q(this.h)[c2];
        n();
        o();
        p(this.h);
        u(1.0f);
    }

    public final void t() {
        boolean z10;
        wm wmVar = this.G;
        if (wmVar.f51531wa == null && this.f50124f == null && this.f50125g == null) {
            if (wmVar.Q9() && !org.telegram.messenger.az.H0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || this.f50136s) {
                this.f50136s = z10;
                this.f50121b.clear();
                this.f50120a.clear();
                if (z10) {
                    if (org.telegram.messenger.t0.f25457b != null) {
                        org.telegram.ui.ActionBar.k6.K(org.telegram.messenger.t0.f25457b, false);
                    }
                    n();
                    o();
                }
                p(org.telegram.ui.ActionBar.k6.t0());
                u(1.0f);
            }
        }
    }

    public final void u(float f10) {
        int i3;
        int k10;
        int i10;
        int k11;
        int i11;
        int k12;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i12;
        if (!this.f50121b.isEmpty()) {
            Paint d = d("paintChatActionBackground");
            Paint d10 = d("paintChatActionBackgroundSelected");
            Paint d11 = d("paintChatMessageBackgroundSelected");
            int i13 = this.B;
            boolean Q9 = this.G.Q9();
            int i14 = -1;
            if (this.C) {
                k10 = -1;
            } else {
                if (Q9) {
                    i3 = org.telegram.ui.ActionBar.k6.Fa;
                } else {
                    i3 = org.telegram.ui.ActionBar.k6.Wc;
                }
                k10 = k(i3, true);
            }
            if (this.C) {
                k11 = -1;
            } else {
                if (Q9) {
                    i10 = org.telegram.ui.ActionBar.k6.Fa;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.Xc;
                }
                k11 = k(i10, true);
            }
            if (this.C) {
                k12 = -1;
            } else {
                if (Q9) {
                    i11 = org.telegram.ui.ActionBar.k6.Ha;
                } else {
                    i11 = org.telegram.ui.ActionBar.k6.Xc;
                }
                k12 = k(i11, true);
            }
            if (!this.C) {
                if (Q9) {
                    i12 = org.telegram.ui.ActionBar.k6.Ga;
                } else {
                    i12 = org.telegram.ui.ActionBar.k6.Yc;
                }
                i14 = k(i12, true);
            }
            int i15 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i15 != 0) {
                i13 = i0.a.f(f10, this.f50142z, i13);
                k10 = i0.a.f(f10, this.v, k10);
                k11 = i0.a.f(f10, this.f50139w, k11);
                k12 = i0.a.f(f10, this.f50140x, k12);
                i14 = i0.a.f(f10, this.f50141y, i14);
            }
            if (d != null && !this.C) {
                d.setColor(i13);
                d10.setColor(i13);
            }
            Paint d12 = d("paintChatActionText");
            if (d12 != null) {
                ((TextPaint) d12).linkColor = k11;
                d("paintChatActionText").setColor(k10);
                d("paintChatBotButton").setColor(k12);
            }
            org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.k6.C1(i14, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.k6.C1(i14, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.k6.C1(i14, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.k6.C1(i14, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.k6.C1(i14, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.k6.C1(i14, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.k6.C1(i14, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.k6.C1(i14, getDrawable("drawableShareIcon"));
            if (this.f50130m != null && (bitmap = this.f50128k) != null) {
                Rect rect = this.F;
                Rect rect2 = this.E;
                if (i15 != 0 && (bitmap2 = this.A) != null) {
                    this.f50133p = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
                    rect.set(0, 0, this.f50127j.getWidth(), this.f50127j.getHeight());
                    this.f50130m.drawBitmap(this.A, rect2, rect, (Paint) null);
                    Paint paint = this.f50129l;
                    paint.setAlpha((int) (f10 * 255.0f));
                    rect2.set(0, 0, this.f50128k.getWidth(), this.f50128k.getHeight());
                    rect.set(0, 0, this.f50127j.getWidth(), this.f50127j.getHeight());
                    this.f50130m.drawBitmap(this.f50128k, rect2, rect, paint);
                    if (d != null) {
                        d.setShader(this.f50131n);
                        d10.setShader(this.f50131n);
                    }
                    if (d11 != null) {
                        d11.setShader(this.f50131n);
                        return;
                    }
                    return;
                }
                this.f50133p = true;
                rect2.set(0, 0, bitmap.getWidth(), this.f50128k.getHeight());
                rect.set(0, 0, this.f50127j.getWidth(), this.f50127j.getHeight());
                this.f50130m.drawBitmap(this.f50128k, rect2, rect, (Paint) null);
                if (d != null) {
                    d.setShader(this.f50132o);
                    d10.setShader(this.f50132o);
                }
                if (d11 != null) {
                    d11.setShader(this.f50132o);
                }
            }
        }
    }
}
