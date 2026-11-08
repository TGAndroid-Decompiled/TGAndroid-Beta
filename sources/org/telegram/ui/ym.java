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
public final class ym implements org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.ea0 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final an G;
    public SparseIntArray f52249e;
    public org.telegram.ui.ActionBar.r3 f52250f;
    public TLRPC.WallPaper f52251g;
    public Drawable h;
    public ValueAnimator f52252i;
    public Bitmap f52253j;
    public Bitmap f52254k;
    public Canvas f52256m;
    public BitmapShader f52257n;
    public BitmapShader f52258o;
    public boolean f52259p;
    public AnimatorSet f52261r;
    public boolean f52262s;
    public org.telegram.ui.ActionBar.t4 f52263t;
    public org.telegram.ui.ActionBar.t4 f52264u;
    public int v;
    public int f52265w;
    public int f52266x;
    public int f52267y;
    public int f52268z;
    public final HashMap f52246a = new HashMap();
    public final HashMap f52247b = new HashMap();
    public final Matrix f52248c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f52255l = new Paint();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public boolean f52260q = org.telegram.ui.ActionBar.k6.I.q();

    public ym(an anVar) {
        int i7;
        int i10;
        this.G = anVar;
        boolean z9 = false;
        if (q(false)) {
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            this.f52250f = org.telegram.messenger.d4.f(i7).c(anVar.f43848j6);
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            TLRPC.WallPaper d = org.telegram.messenger.d4.f(i10).d(anVar.f43848j6);
            this.f52251g = d;
            org.telegram.ui.ActionBar.r3 r3Var = this.f52250f;
            if (r3Var != null || d != null) {
                s(r3Var, d, false);
                z9 = true;
            }
        }
        if (!z9) {
            t();
        }
        if (!z9 && ThemeEditorView.f31566p == null) {
            org.telegram.ui.ActionBar.k6.t1(true, true);
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.messenger.rc(16));
        }
    }

    @Override
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.f52260q;
        }
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.f52253j) != null && (bitmapShader = this.f52257n) != null) {
            boolean z9 = this.f52259p;
            Matrix matrix = this.f52248c;
            if (z9) {
                org.telegram.ui.ActionBar.k6.s(this.f52254k, this.f52258o, matrix, i7, i10, f10, f11);
                return;
            } else {
                org.telegram.ui.ActionBar.k6.s(bitmap, bitmapShader, matrix, i7, i10, f10, f11);
                return;
            }
        }
        org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.f28184v3;
    }

    @Override
    public final Paint d(String str) {
        if (this.f52250f == null && this.h == null && !this.f52262s) {
            return null;
        }
        return (Paint) this.f52247b.get(str);
    }

    @Override
    public final boolean e() {
        return this.G.Q9();
    }

    @Override
    public final int f(int i7) {
        return h(i7);
    }

    @Override
    public final boolean g() {
        if (this.h == null && !this.f52262s) {
            return org.telegram.ui.ActionBar.k6.d1();
        }
        if (this.f52257n != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f52246a;
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
        SparseIntArray sparseIntArray = this.f52249e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.f52249e.valueAt(indexOfKey2);
        }
        if (this.f52262s && (z02 = org.telegram.ui.ActionBar.k6.z0(i7, this)) != null) {
            return z02.intValue();
        }
        if (this.f52250f == null) {
            return org.telegram.ui.ActionBar.k6.v0(i7);
        }
        int indexOfKey3 = this.d.indexOfKey(i7);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i10 = org.telegram.ui.ActionBar.k6.fm.get(i7);
        if (i10 >= 0 && (indexOfKey = this.d.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.k6.v0(i7);
    }

    @Override
    public final void i(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f52249e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i7, i10);
        }
    }

    @Override
    public final int j(int i7) {
        return k(i7, false);
    }

    public final int k(int i7, boolean z9) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f52250f == null && this.h == null) {
            return org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        }
        if (!z9 && (sparseIntArray = this.f52249e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.f52249e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i7)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i7, false);
    }

    public final org.telegram.ui.ActionBar.r3 l() {
        return this.f52250f;
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
                this.f52246a.put((String) entry.getKey(), t4Var);
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
            this.f52247b.put((String) entry.getKey(), paint);
        }
    }

    public final void p(android.graphics.drawable.Drawable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ym.p(android.graphics.drawable.Drawable):void");
    }

    public final boolean q(boolean z9) {
        TLRPC.User user;
        an anVar = this.G;
        if (anVar.h == null) {
            if (z9) {
                if (anVar.f43777e == null && (user = anVar.f43791f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void r(org.telegram.ui.ActionBar.r3 r14, org.telegram.tgnet.TLRPC.WallPaper r15, boolean r16, java.lang.Boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ym.r(org.telegram.ui.ActionBar.r3, org.telegram.tgnet.TLRPC$WallPaper, boolean, java.lang.Boolean, boolean):void");
    }

    public final void s(org.telegram.ui.ActionBar.r3 r3Var, TLRPC.WallPaper wallPaper, boolean z9) {
        Drawable drawable;
        org.telegram.ui.Components.qa0 qa0Var;
        int i7;
        int i10;
        int i11;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.h6 h6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        org.telegram.ui.ActionBar.j6 j6Var;
        boolean z10;
        Drawable drawable2;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.j6 Q0;
        int i13;
        org.telegram.ui.ActionBar.j6 Q02;
        org.telegram.ui.ActionBar.r3 r3Var2 = r3Var;
        an anVar = this.G;
        if (anVar.f44001va != null) {
            return;
        }
        this.f52250f = r3Var2;
        this.f52251g = wallPaper;
        if (anVar.fragmentView != null) {
            drawable = anVar.l1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.qa0) {
            qa0Var = (org.telegram.ui.Components.qa0) drawable;
        } else {
            qa0Var = null;
        }
        if (qa0Var != null) {
            i7 = qa0Var.f37258i;
        } else {
            i7 = 0;
        }
        if ((r3Var2 == null || r3Var2.f28459a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.k6.im.indexOfKey(org.telegram.ui.ActionBar.k6.Zc);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.k6.im.valueAt(indexOfKey2);
            } else {
                int i14 = org.telegram.ui.ActionBar.k6.f27788a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (r3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f52247b.clear();
            this.f52246a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
            if (t02 instanceof org.telegram.ui.Components.qa0) {
                ((org.telegram.ui.Components.qa0) t02).u(i7);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.k6.I.q() == this.f52260q) {
                Q02 = org.telegram.ui.ActionBar.k6.I;
            } else {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string) != null && !org.telegram.ui.ActionBar.k6.Q0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string2) != null && org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
                    str = string2;
                }
                if (this.f52260q) {
                    Q02 = org.telegram.ui.ActionBar.k6.Q0(str);
                } else {
                    Q02 = org.telegram.ui.ActionBar.k6.Q0(str2);
                }
            }
            org.telegram.ui.ActionBar.k6.u(Q02, false, this.f52260q);
            p(this.h);
            this.f52262s = false;
            t();
            return;
        }
        this.f52262s = false;
        if (org.telegram.messenger.t0.f25566b != null) {
            org.telegram.ui.ActionBar.k6.K(org.telegram.messenger.t0.f25566b, false);
        }
        if (r3Var2 != null) {
            i10 = ((org.telegram.ui.ActionBar.f2) this.G).currentAccount;
            boolean z11 = this.f52260q;
            ArrayList arrayList2 = r3Var2.f28463f;
            org.telegram.ui.ActionBar.j6 i15 = r3Var2.i(z11 ? 1 : 0);
            if (i15 == null) {
                int i16 = ((org.telegram.ui.ActionBar.q3) r3Var2.f28463f.get(z11 ? 1 : 0)).d;
                i11 = 0;
                org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) ((ig.a) r3Var2.f28463f.get(z11 ? 1 : 0));
                TLRPC.ThemeSettings b10 = q3Var.b(i16);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.q3) r3Var2.f28463f.get(z11 ? 1 : 0)).f28404b;
                org.telegram.ui.ActionBar.j6 j6Var2 = new org.telegram.ui.ActionBar.j6(org.telegram.ui.ActionBar.k6.Q0(org.telegram.ui.ActionBar.k6.r0(b10)));
                arrayList = arrayList2;
                h6Var = j6Var2.e(q3Var.a(), b10, tL_theme, i10, true);
                j6Var2.u(h6Var.f27519a);
                i15 = j6Var2;
            } else {
                i11 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i15.f27630a0;
                if (sparseArray != null) {
                    h6Var = (org.telegram.ui.ActionBar.h6) sparseArray.get(((org.telegram.ui.ActionBar.q3) arrayList.get(z11 ? 1 : 0)).f28406e);
                } else {
                    h6Var = null;
                }
            }
            String[] strArr = new String[1];
            if (i15.f27631b != null) {
                sparseIntArray = org.telegram.ui.ActionBar.k6.T0(new File(i15.f27631b), null, strArr);
            } else {
                String str3 = i15.d;
                if (str3 != null) {
                    sparseIntArray = org.telegram.ui.ActionBar.k6.T0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((org.telegram.ui.ActionBar.q3) arrayList.get(z11 ? 1 : 0)).f28408g = strArr[i11];
            if (h6Var != null) {
                SparseIntArray clone = sparseIntArray.clone();
                h6Var.d(sparseIntArray, clone);
                ig.b bVar = r3Var2.f28461c;
                if (bVar != null && !TextUtils.isEmpty(bVar.f15477b) && (j6Var = h6Var.f27520b) != null && j6Var.f27631b == null && !j6Var.q()) {
                    org.telegram.ui.ActionBar.h6.h(clone);
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
        if (!TextUtils.isEmpty(org.telegram.messenger.d4.j(this.f52251g))) {
            Drawable drawable3 = this.h;
            i13 = ((org.telegram.ui.ActionBar.f2) this.G).currentAccount;
            this.h = fi.y5.f(drawable3, i13, this.f52251g, this.f52260q);
        } else if (wallPaper != null) {
            this.h = dn.d(this.h, wallPaper, this.f52260q);
        } else {
            if (r3Var2.f28459a) {
                org.telegram.ui.ActionBar.j6 d = org.telegram.ui.ActionBar.r3.d(this.f52260q);
                i12 = ((org.telegram.ui.ActionBar.f2) this.G).currentAccount;
                org.telegram.ui.ActionBar.k6.I(d, r3Var2.g(i12, this.f52260q ? 1 : 0), ((org.telegram.ui.ActionBar.q3) r3Var2.f28463f.get(this.f52260q ? 1 : 0)).f28408g, i7, i11);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int h = h(org.telegram.ui.ActionBar.k6.Be);
                int h7 = h(org.telegram.ui.ActionBar.k6.Ce);
                int h10 = h(org.telegram.ui.ActionBar.k6.De);
                int h11 = h(org.telegram.ui.ActionBar.k6.Ee);
                org.telegram.ui.Components.qa0 qa0Var2 = new org.telegram.ui.Components.qa0();
                qa0Var2.s(r3Var2.j(this.f52260q ? 1 : 0).settings.intensity, qa0Var2.f37270u);
                TLRPC.Document e10 = r3Var2.e();
                if (qa0Var2.f37273y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    qa0Var2.f37273y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = qa0Var2.f37252c;
                    if (weakReference != null) {
                        qa0Var2.f37273y.H0((View) weakReference.get());
                    }
                    if (qa0Var2.T) {
                        qa0Var2.f37273y.P();
                    }
                }
                qa0Var2.f37273y.q0(org.telegram.messenger.hc.b(e10), "80_80", null, null, null, 0);
                qa0Var2.f37273y.X(1);
                qa0Var2.f37273y.W(1);
                qa0Var2.o(h, h7, h10, h11, 0, true);
                qa0Var2.u(i7);
                int f10 = qa0Var2.f();
                boolean z12 = this.f52260q;
                ni.c cVar = new ni.c(16, this, qa0Var2);
                org.telegram.ui.ActionBar.q3 q3Var2 = (org.telegram.ui.ActionBar.q3) r3Var2.f28463f.get(z12 ? 1 : 0);
                if (q3Var2 != null && q3Var2.f28405c != null) {
                    long h12 = r3Var2.h(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = q3Var2.f28405c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z10 = z12 ? 1 : 0;
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
                        z10 = z12 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    org.telegram.messenger.hc b11 = org.telegram.messenger.hc.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.f21236z1 = false;
                    imageReceiver2.q0(b11, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.f21195g1 = new di.c1(cVar, h12, 2);
                    org.telegram.messenger.gc.D().M(imageReceiver2, null);
                } else {
                    z10 = z12 ? 1 : 0;
                }
                r3Var2 = r3Var;
                r3Var2.n(this.f52260q ? 1 : 0, new org.telegram.messenger.r6(this, r3Var2, z10, qa0Var2, f10));
                drawable2 = qa0Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.f52261r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z9) {
            this.f52261r = new AnimatorSet();
            if (qa0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new um(qa0Var, 0));
                ofFloat.addListener(new wm(qa0Var));
                ofFloat.setDuration(200L);
                this.f52261r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof org.telegram.ui.Components.qa0) {
                org.telegram.ui.Components.qa0 qa0Var3 = (org.telegram.ui.Components.qa0) drawable4;
                qa0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new um(qa0Var3, 1));
                ofFloat2.addListener(new xm(qa0Var3));
                ofFloat2.setDuration(250L);
                this.f52261r.playTogether(ofFloat2);
            }
            this.f52261r.start();
        }
        if (r3Var2 == null && this.G.f43848j6 >= 0) {
            if (org.telegram.ui.ActionBar.k6.I.q() == this.f52260q) {
                Q0 = org.telegram.ui.ActionBar.k6.I;
            } else {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.t0.f25566b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string3) != null && !org.telegram.ui.ActionBar.k6.Q0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string4) != null && org.telegram.ui.ActionBar.k6.Q0(string4).q()) {
                    str = string4;
                }
                if (this.f52260q) {
                    Q0 = org.telegram.ui.ActionBar.k6.Q0(str);
                } else {
                    Q0 = org.telegram.ui.ActionBar.k6.Q0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.k6.u(Q0, false, this.f52260q);
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
        boolean z9;
        an anVar = this.G;
        if (anVar.f44001va == null && this.f52250f == null && this.f52251g == null) {
            if (anVar.Q9() && !org.telegram.messenger.iz.H0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 || this.f52262s) {
                this.f52262s = z9;
                this.f52247b.clear();
                this.f52246a.clear();
                if (z9) {
                    if (org.telegram.messenger.t0.f25566b != null) {
                        org.telegram.ui.ActionBar.k6.K(org.telegram.messenger.t0.f25566b, false);
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
        int i7;
        int k10;
        int i10;
        int k11;
        int i11;
        int k12;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i12;
        if (!this.f52247b.isEmpty()) {
            Paint d = d("paintChatActionBackground");
            Paint d2 = d("paintChatActionBackgroundSelected");
            Paint d10 = d("paintChatMessageBackgroundSelected");
            int i13 = this.B;
            boolean Q9 = this.G.Q9();
            int i14 = -1;
            if (this.C) {
                k10 = -1;
            } else {
                if (Q9) {
                    i7 = org.telegram.ui.ActionBar.k6.Fa;
                } else {
                    i7 = org.telegram.ui.ActionBar.k6.Wc;
                }
                k10 = k(i7, true);
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
                i13 = i0.a.f(f10, this.f52268z, i13);
                k10 = i0.a.f(f10, this.v, k10);
                k11 = i0.a.f(f10, this.f52265w, k11);
                k12 = i0.a.f(f10, this.f52266x, k12);
                i14 = i0.a.f(f10, this.f52267y, i14);
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
            if (this.f52256m != null && (bitmap = this.f52254k) != null) {
                Rect rect = this.F;
                Rect rect2 = this.E;
                if (i15 != 0 && (bitmap2 = this.A) != null) {
                    this.f52259p = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
                    rect.set(0, 0, this.f52253j.getWidth(), this.f52253j.getHeight());
                    this.f52256m.drawBitmap(this.A, rect2, rect, (Paint) null);
                    Paint paint = this.f52255l;
                    paint.setAlpha((int) (f10 * 255.0f));
                    rect2.set(0, 0, this.f52254k.getWidth(), this.f52254k.getHeight());
                    rect.set(0, 0, this.f52253j.getWidth(), this.f52253j.getHeight());
                    this.f52256m.drawBitmap(this.f52254k, rect2, rect, paint);
                    if (d != null) {
                        d.setShader(this.f52257n);
                        d2.setShader(this.f52257n);
                    }
                    if (d10 != null) {
                        d10.setShader(this.f52257n);
                        return;
                    }
                    return;
                }
                this.f52259p = true;
                rect2.set(0, 0, bitmap.getWidth(), this.f52254k.getHeight());
                rect.set(0, 0, this.f52253j.getWidth(), this.f52253j.getHeight());
                this.f52256m.drawBitmap(this.f52254k, rect2, rect, (Paint) null);
                if (d != null) {
                    d.setShader(this.f52258o);
                    d2.setShader(this.f52258o);
                }
                if (d10 != null) {
                    d10.setShader(this.f52258o);
                }
            }
        }
    }
}
