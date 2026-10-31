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
public final class sn implements org.telegram.ui.ActionBar.p6, org.telegram.ui.Components.wa0 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final un G;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.y3 f41590f;
    public TLRPC.WallPaper f41591g;
    public Drawable h;
    public ValueAnimator f41592i;
    public Bitmap f41593j;
    public Bitmap f41594k;
    public Canvas f41596m;
    public BitmapShader f41597n;
    public BitmapShader f41598o;
    public boolean f41599p;
    public AnimatorSet f41601r;
    public boolean f41602s;
    public org.telegram.ui.ActionBar.c5 f41603t;
    public org.telegram.ui.ActionBar.c5 f41604u;
    public int v;
    public int f41605w;
    public int f41606x;
    public int f41607y;
    public int f41608z;
    public final HashMap f41587a = new HashMap();
    public final HashMap f41588b = new HashMap();
    public final Matrix f41589c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f41595l = new Paint();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public boolean f41600q = org.telegram.ui.ActionBar.t6.I.q();

    public sn(un unVar) {
        int i10;
        int i11;
        this.G = unVar;
        boolean z10 = false;
        if (q(false)) {
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            this.f41590f = org.telegram.messenger.g4.f(i10).c(unVar.f42297j6);
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            TLRPC.WallPaper d = org.telegram.messenger.g4.f(i11).d(unVar.f42297j6);
            this.f41591g = d;
            org.telegram.ui.ActionBar.y3 y3Var = this.f41590f;
            if (y3Var != null || d != null) {
                s(y3Var, d, false);
                z10 = true;
            }
        }
        if (!z10) {
            t();
        }
        if (!z10 && ThemeEditorView.f24207p == null) {
            org.telegram.ui.ActionBar.t6.t1(true, true);
        } else {
            org.telegram.messenger.i0.g3(new org.telegram.messenger.rz(5));
        }
    }

    @Override
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.f41600q;
        }
        return org.telegram.ui.ActionBar.t6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.f41593j) != null && (bitmapShader = this.f41597n) != null) {
            boolean z10 = this.f41599p;
            Matrix matrix = this.f41589c;
            if (z10) {
                org.telegram.ui.ActionBar.t6.s(this.f41594k, this.f41598o, matrix, i10, i11, f7, f10);
                return;
            } else {
                org.telegram.ui.ActionBar.t6.s(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
                return;
            }
        }
        org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.t6.f21256v3;
    }

    @Override
    public final Paint d(String str) {
        if (this.f41590f == null && this.h == null && !this.f41602s) {
            return null;
        }
        return (Paint) this.f41588b.get(str);
    }

    @Override
    public final boolean e() {
        return this.G.G9();
    }

    @Override
    public final int f(int i10) {
        return h(i10);
    }

    @Override
    public final boolean g() {
        if (this.h == null && !this.f41602s) {
            return org.telegram.ui.ActionBar.t6.d1();
        }
        if (this.f41597n != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f41587a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    @Override
    public final int h(int i10) {
        int indexOfKey;
        Integer z02;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f41602s && (z02 = org.telegram.ui.ActionBar.t6.z0(i10, this)) != null) {
            return z02.intValue();
        }
        if (this.f41590f == null) {
            return org.telegram.ui.ActionBar.t6.v0(i10);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.t6.fm.get(i10);
        if (i11 >= 0 && (indexOfKey = this.d.indexOfKey(i11)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.t6.v0(i10);
    }

    @Override
    public final void i(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override
    public final int j(int i10) {
        return k(i10, false);
    }

    public final int k(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f41590f == null && this.h == null) {
            return org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public final org.telegram.ui.ActionBar.y3 l() {
        return this.f41590f;
    }

    public final Drawable m() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.t6.t0();
    }

    public final void n() {
        Drawable c5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.t6.am.entrySet()) {
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
                    c5Var = new org.telegram.ui.ActionBar.c5(0, false, false, this);
                    break;
                case 1:
                    c5Var = new org.telegram.ui.ActionBar.c5(1, false, false, this);
                    break;
                case 2:
                    c5Var = new org.telegram.ui.ActionBar.c5(1, false, true, this);
                    break;
                case 3:
                    c5Var = new org.telegram.ui.ActionBar.c5(1, true, false, this);
                    break;
                case 4:
                    c5Var = new org.telegram.ui.ActionBar.c5(0, true, true, this);
                    break;
                case 5:
                    c5Var = new org.telegram.ui.ActionBar.c5(1, true, true, this);
                    break;
                case 6:
                    c5Var = new org.telegram.ui.ActionBar.c5(0, false, true, this);
                    break;
                case 7:
                    c5Var = new org.telegram.ui.ActionBar.c5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        c5Var = constantState.newDrawable().mutate();
                    } else {
                        c5Var = null;
                    }
                    if (c5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.t6.bm.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.t6.C1(h(intValue), c5Var);
                            break;
                        }
                    }
                    break;
            }
            if (c5Var != null) {
                this.f41587a.put((String) entry.getKey(), c5Var);
            }
        }
    }

    public final void o() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.t6.cm.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.t6.dm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(h(intValue));
            }
            this.f41588b.put((String) entry.getKey(), paint);
        }
    }

    public final void p(android.graphics.drawable.Drawable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.p(android.graphics.drawable.Drawable):void");
    }

    public final boolean q(boolean z10) {
        TLRPC.User user;
        un unVar = this.G;
        if (unVar.h == null) {
            if (z10) {
                if (unVar.e == null && (user = unVar.f42243f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void r(org.telegram.ui.ActionBar.y3 r14, org.telegram.tgnet.TLRPC.WallPaper r15, boolean r16, java.lang.Boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.r(org.telegram.ui.ActionBar.y3, org.telegram.tgnet.TLRPC$WallPaper, boolean, java.lang.Boolean, boolean):void");
    }

    public final void s(org.telegram.ui.ActionBar.y3 y3Var, TLRPC.WallPaper wallPaper, boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.jb0 jb0Var;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.r6 r6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        org.telegram.ui.ActionBar.s6 s6Var;
        boolean z11;
        Drawable drawable2;
        int i13;
        char c10;
        org.telegram.ui.ActionBar.s6 Q0;
        int i14;
        org.telegram.ui.ActionBar.s6 Q02;
        org.telegram.ui.ActionBar.y3 y3Var2 = y3Var;
        un unVar = this.G;
        if (unVar.f42451va != null) {
            return;
        }
        this.f41590f = y3Var2;
        this.f41591g = wallPaper;
        if (unVar.fragmentView != null) {
            drawable = unVar.l1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.jb0) {
            jb0Var = (org.telegram.ui.Components.jb0) drawable;
        } else {
            jb0Var = null;
        }
        if (jb0Var != null) {
            i10 = jb0Var.f27285i;
        } else {
            i10 = 0;
        }
        if ((y3Var2 == null || y3Var2.f21558a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.t6.im.indexOfKey(org.telegram.ui.ActionBar.t6.Zc);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.t6.im.valueAt(indexOfKey2);
            } else {
                int i15 = org.telegram.ui.ActionBar.t6.f20865a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (y3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f41588b.clear();
            this.f41587a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.t6.t0();
            if (t02 instanceof org.telegram.ui.Components.jb0) {
                ((org.telegram.ui.Components.jb0) t02).u(i10);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.t6.I.q() == this.f41600q) {
                Q02 = org.telegram.ui.ActionBar.t6.I;
            } else {
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.f19025b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.t6.Q0(string) != null && !org.telegram.ui.ActionBar.t6.Q0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.t6.Q0(string2) != null && org.telegram.ui.ActionBar.t6.Q0(string2).q()) {
                    str = string2;
                }
                if (this.f41600q) {
                    Q02 = org.telegram.ui.ActionBar.t6.Q0(str);
                } else {
                    Q02 = org.telegram.ui.ActionBar.t6.Q0(str2);
                }
            }
            org.telegram.ui.ActionBar.t6.u(Q02, false, this.f41600q);
            p(this.h);
            this.f41602s = false;
            t();
            return;
        }
        this.f41602s = false;
        if (org.telegram.messenger.w0.f19025b != null) {
            org.telegram.ui.ActionBar.t6.K(org.telegram.messenger.w0.f19025b, false);
        }
        if (y3Var2 != null) {
            i11 = ((org.telegram.ui.ActionBar.k2) this.G).currentAccount;
            boolean z12 = this.f41600q;
            ArrayList arrayList2 = y3Var2.f21561f;
            org.telegram.ui.ActionBar.s6 i16 = y3Var2.i(z12 ? 1 : 0);
            if (i16 == null) {
                int i17 = ((org.telegram.ui.ActionBar.x3) y3Var2.f21561f.get(z12 ? 1 : 0)).d;
                i12 = 0;
                org.telegram.ui.ActionBar.x3 x3Var = (org.telegram.ui.ActionBar.x3) ((yf.a) y3Var2.f21561f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = x3Var.b(i17);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.x3) y3Var2.f21561f.get(z12 ? 1 : 0)).f21516b;
                org.telegram.ui.ActionBar.s6 s6Var2 = new org.telegram.ui.ActionBar.s6(org.telegram.ui.ActionBar.t6.Q0(org.telegram.ui.ActionBar.t6.r0(b10)));
                arrayList = arrayList2;
                r6Var = s6Var2.e(x3Var.a(), b10, tL_theme, i11, true);
                s6Var2.u(r6Var.f20730a);
                i16 = s6Var2;
            } else {
                i12 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i16.f20802a0;
                if (sparseArray != null) {
                    r6Var = (org.telegram.ui.ActionBar.r6) sparseArray.get(((org.telegram.ui.ActionBar.x3) arrayList.get(z12 ? 1 : 0)).e);
                } else {
                    r6Var = null;
                }
            }
            String[] strArr = new String[1];
            if (i16.f20803b != null) {
                sparseIntArray = org.telegram.ui.ActionBar.t6.T0(new File(i16.f20803b), null, strArr);
            } else {
                String str3 = i16.d;
                if (str3 != null) {
                    sparseIntArray = org.telegram.ui.ActionBar.t6.T0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((org.telegram.ui.ActionBar.x3) arrayList.get(z12 ? 1 : 0)).f21519g = strArr[i12];
            if (r6Var != null) {
                SparseIntArray clone = sparseIntArray.clone();
                r6Var.d(sparseIntArray, clone);
                yf.b bVar = y3Var2.f21560c;
                if (bVar != null && !TextUtils.isEmpty(bVar.f54429b) && (s6Var = r6Var.f20731b) != null && s6Var.f20803b == null && !s6Var.q()) {
                    org.telegram.ui.ActionBar.r6.h(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = org.telegram.ui.ActionBar.t6.fm;
            for (int i18 = i12; i18 < sparseIntArray2.size(); i18++) {
                int keyAt = sparseIntArray2.keyAt(i18);
                int valueAt = sparseIntArray2.valueAt(i18);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.t6.em;
            for (int i19 = i12; i19 < iArr.length; i19++) {
                if (sparseIntArray.indexOfKey(i19) < 0) {
                    sparseIntArray.put(i19, iArr[i19]);
                }
            }
            this.d = sparseIntArray;
        } else {
            this.d = new SparseIntArray();
            i12 = 0;
        }
        if (!TextUtils.isEmpty(org.telegram.messenger.g4.j(this.f41591g))) {
            Drawable drawable3 = this.h;
            i14 = ((org.telegram.ui.ActionBar.k2) this.G).currentAccount;
            this.h = vh.k4.f(drawable3, i14, this.f41591g, this.f41600q);
        } else if (wallPaper != null) {
            this.h = xn.d(this.h, wallPaper, this.f41600q);
        } else {
            if (y3Var2.f21558a) {
                org.telegram.ui.ActionBar.s6 d = org.telegram.ui.ActionBar.y3.d(this.f41600q);
                i13 = ((org.telegram.ui.ActionBar.k2) this.G).currentAccount;
                org.telegram.ui.ActionBar.t6.I(d, y3Var2.g(i13, this.f41600q ? 1 : 0), ((org.telegram.ui.ActionBar.x3) y3Var2.f21561f.get(this.f41600q ? 1 : 0)).f21519g, i10, i12);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int h = h(org.telegram.ui.ActionBar.t6.Be);
                int h10 = h(org.telegram.ui.ActionBar.t6.Ce);
                int h11 = h(org.telegram.ui.ActionBar.t6.De);
                int h12 = h(org.telegram.ui.ActionBar.t6.Ee);
                org.telegram.ui.Components.jb0 jb0Var2 = new org.telegram.ui.Components.jb0();
                jb0Var2.s(jb0Var2.f27297u, y3Var2.j(this.f41600q ? 1 : 0).settings.intensity);
                TLRPC.Document e = y3Var2.e();
                if (jb0Var2.f27300y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    jb0Var2.f27300y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = jb0Var2.f27280c;
                    if (weakReference != null) {
                        jb0Var2.f27300y.H0((View) weakReference.get());
                    }
                    if (jb0Var2.T) {
                        jb0Var2.f27300y.P();
                    }
                }
                jb0Var2.f27300y.q0(org.telegram.messenger.ic.b(e), "80_80", null, null, null, 0);
                jb0Var2.f27300y.X(1);
                jb0Var2.f27300y.W(1);
                jb0Var2.o(h, h10, h11, h12, 0, true);
                jb0Var2.u(i10);
                int f7 = jb0Var2.f();
                boolean z13 = this.f41600q;
                ng.d dVar = new ng.d(16, this, jb0Var2);
                org.telegram.ui.ActionBar.x3 x3Var2 = (org.telegram.ui.ActionBar.x3) y3Var2.f21561f.get(z13 ? 1 : 0);
                if (x3Var2 != null && x3Var2.f21517c != null) {
                    long h13 = y3Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = x3Var2.f21517c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z11 = z13 ? 1 : 0;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i20);
                            int i21 = i20 + 1;
                            int i22 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i22;
                                i20 = i21;
                            }
                        }
                    } else {
                        z11 = z13 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    org.telegram.messenger.ic b11 = org.telegram.messenger.ic.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.f14424z1 = false;
                    imageReceiver2.q0(b11, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.f14382g1 = new m4.x0(dVar, h13, 1);
                    org.telegram.messenger.hc.D().M(imageReceiver2, null);
                } else {
                    z11 = z13 ? 1 : 0;
                }
                y3Var2 = y3Var;
                y3Var2.n(this.f41600q ? 1 : 0, new org.telegram.messenger.u6(this, y3Var2, z11, jb0Var2, f7));
                drawable2 = jb0Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.f41601r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.f41601r = new AnimatorSet();
            if (jb0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new on(jb0Var, 0));
                ofFloat.addListener(new qn(jb0Var));
                ofFloat.setDuration(200L);
                this.f41601r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof org.telegram.ui.Components.jb0) {
                org.telegram.ui.Components.jb0 jb0Var3 = (org.telegram.ui.Components.jb0) drawable4;
                jb0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new on(jb0Var3, 1));
                ofFloat2.addListener(new rn(jb0Var3));
                ofFloat2.setDuration(250L);
                this.f41601r.playTogether(ofFloat2);
            }
            this.f41601r.start();
        }
        if (y3Var2 == null && this.G.f42297j6 >= 0) {
            if (org.telegram.ui.ActionBar.t6.I.q() == this.f41600q) {
                Q0 = org.telegram.ui.ActionBar.t6.I;
            } else {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.w0.f19025b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.t6.Q0(string3) != null && !org.telegram.ui.ActionBar.t6.Q0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.t6.Q0(string4) != null && org.telegram.ui.ActionBar.t6.Q0(string4).q()) {
                    str = string4;
                }
                if (this.f41600q) {
                    Q0 = org.telegram.ui.ActionBar.t6.Q0(str);
                } else {
                    Q0 = org.telegram.ui.ActionBar.t6.Q0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.t6.u(Q0, false, this.f41600q);
        } else {
            c10 = 0;
        }
        int i23 = org.telegram.messenger.i0.q(this.h)[c10];
        n();
        o();
        p(this.h);
        u(1.0f);
    }

    public final void t() {
        boolean z10;
        un unVar = this.G;
        if (unVar.f42451va == null && this.f41590f == null && this.f41591g == null) {
            if (unVar.G9() && !org.telegram.messenger.tz.H0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || this.f41602s) {
                this.f41602s = z10;
                this.f41588b.clear();
                this.f41587a.clear();
                if (z10) {
                    if (org.telegram.messenger.w0.f19025b != null) {
                        org.telegram.ui.ActionBar.t6.K(org.telegram.messenger.w0.f19025b, false);
                    }
                    n();
                    o();
                }
                p(org.telegram.ui.ActionBar.t6.t0());
                u(1.0f);
            }
        }
    }

    public final void u(float f7) {
        int i10;
        int k10;
        int i11;
        int k11;
        int i12;
        int k12;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i13;
        if (!this.f41588b.isEmpty()) {
            Paint d = d("paintChatActionBackground");
            Paint d10 = d("paintChatActionBackgroundSelected");
            Paint d11 = d("paintChatMessageBackgroundSelected");
            int i14 = this.B;
            boolean G9 = this.G.G9();
            int i15 = -1;
            if (this.C) {
                k10 = -1;
            } else {
                if (G9) {
                    i10 = org.telegram.ui.ActionBar.t6.Fa;
                } else {
                    i10 = org.telegram.ui.ActionBar.t6.Wc;
                }
                k10 = k(i10, true);
            }
            if (this.C) {
                k11 = -1;
            } else {
                if (G9) {
                    i11 = org.telegram.ui.ActionBar.t6.Fa;
                } else {
                    i11 = org.telegram.ui.ActionBar.t6.Xc;
                }
                k11 = k(i11, true);
            }
            if (this.C) {
                k12 = -1;
            } else {
                if (G9) {
                    i12 = org.telegram.ui.ActionBar.t6.Ha;
                } else {
                    i12 = org.telegram.ui.ActionBar.t6.Xc;
                }
                k12 = k(i12, true);
            }
            if (!this.C) {
                if (G9) {
                    i13 = org.telegram.ui.ActionBar.t6.Ga;
                } else {
                    i13 = org.telegram.ui.ActionBar.t6.Yc;
                }
                i15 = k(i13, true);
            }
            int i16 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            if (i16 != 0) {
                i14 = i0.b.f(f7, this.f41608z, i14);
                k10 = i0.b.f(f7, this.v, k10);
                k11 = i0.b.f(f7, this.f41605w, k11);
                k12 = i0.b.f(f7, this.f41606x, k12);
                i15 = i0.b.f(f7, this.f41607y, i15);
            }
            if (d != null && !this.C) {
                d.setColor(i14);
                d10.setColor(i14);
            }
            Paint d12 = d("paintChatActionText");
            if (d12 != null) {
                ((TextPaint) d12).linkColor = k11;
                d("paintChatActionText").setColor(k10);
                d("paintChatBotButton").setColor(k12);
            }
            org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.t6.C1(i15, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.t6.C1(i15, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.t6.C1(i15, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.t6.C1(i15, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.t6.C1(i15, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.t6.C1(i15, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.t6.C1(i15, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.t6.C1(i15, getDrawable("drawableShareIcon"));
            if (this.f41596m != null && (bitmap = this.f41594k) != null) {
                Rect rect = this.F;
                Rect rect2 = this.E;
                if (i16 != 0 && (bitmap2 = this.A) != null) {
                    this.f41599p = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
                    rect.set(0, 0, this.f41593j.getWidth(), this.f41593j.getHeight());
                    this.f41596m.drawBitmap(this.A, rect2, rect, (Paint) null);
                    Paint paint = this.f41595l;
                    paint.setAlpha((int) (f7 * 255.0f));
                    rect2.set(0, 0, this.f41594k.getWidth(), this.f41594k.getHeight());
                    rect.set(0, 0, this.f41593j.getWidth(), this.f41593j.getHeight());
                    this.f41596m.drawBitmap(this.f41594k, rect2, rect, paint);
                    if (d != null) {
                        d.setShader(this.f41597n);
                        d10.setShader(this.f41597n);
                    }
                    if (d11 != null) {
                        d11.setShader(this.f41597n);
                        return;
                    }
                    return;
                }
                this.f41599p = true;
                rect2.set(0, 0, bitmap.getWidth(), this.f41594k.getHeight());
                rect.set(0, 0, this.f41593j.getWidth(), this.f41593j.getHeight());
                this.f41596m.drawBitmap(this.f41594k, rect2, rect, (Paint) null);
                if (d != null) {
                    d.setShader(this.f41598o);
                    d10.setShader(this.f41598o);
                }
                if (d11 != null) {
                    d11.setShader(this.f41598o);
                }
            }
        }
    }
}
