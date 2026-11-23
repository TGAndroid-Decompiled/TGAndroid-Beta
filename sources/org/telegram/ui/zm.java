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
public final class zm implements org.telegram.ui.ActionBar.i6, org.telegram.ui.Components.pa0 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final bn G;
    public SparseIntArray f54652e;
    public org.telegram.ui.ActionBar.s3 f54653f;
    public TLRPC.WallPaper f54654g;
    public Drawable h;
    public ValueAnimator f54655i;
    public Bitmap f54656j;
    public Bitmap f54657k;
    public Canvas f54659m;
    public BitmapShader f54660n;
    public BitmapShader f54661o;
    public boolean f54662p;
    public AnimatorSet f54664r;
    public boolean f54665s;
    public org.telegram.ui.ActionBar.u4 f54666t;
    public org.telegram.ui.ActionBar.u4 f54667u;
    public int v;
    public int f54668w;
    public int f54669x;
    public int f54670y;
    public int f54671z;
    public final HashMap f54649a = new HashMap();
    public final HashMap f54650b = new HashMap();
    public final Matrix f54651c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint f54658l = new Paint();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public boolean f54663q = org.telegram.ui.ActionBar.n6.I.q();

    public zm(bn bnVar) {
        int i7;
        int i10;
        this.G = bnVar;
        boolean z10 = false;
        if (q(false)) {
            i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            this.f54653f = org.telegram.messenger.f4.f(i7).c(bnVar.f46271l6);
            i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            TLRPC.WallPaper d = org.telegram.messenger.f4.f(i10).d(bnVar.f46271l6);
            this.f54654g = d;
            org.telegram.ui.ActionBar.s3 s3Var = this.f54653f;
            if (s3Var != null || d != null) {
                s(s3Var, d, false);
                z10 = true;
            }
        }
        if (!z10) {
            t();
        }
        if (!z10 && ThemeEditorView.f33244p == null) {
            org.telegram.ui.ActionBar.n6.t1(true, true);
        } else {
            org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(22));
        }
    }

    public final int a(int i7, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f54653f == null && this.h == null) {
            return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        }
        if (!z10 && (sparseIntArray = this.f54652e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.f54652e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i7)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    @Override
    public final boolean b() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.f54663q;
        }
        return org.telegram.ui.ActionBar.n6.I.q();
    }

    @Override
    public final void c(float f10, float f11, int i7, int i10) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.f54656j) != null && (bitmapShader = this.f54660n) != null) {
            boolean z10 = this.f54662p;
            Matrix matrix = this.f54651c;
            if (z10) {
                org.telegram.ui.ActionBar.n6.s(this.f54657k, this.f54661o, matrix, i7, i10, f10, f11);
                return;
            } else {
                org.telegram.ui.ActionBar.n6.s(bitmap, bitmapShader, matrix, i7, i10, f10, f11);
                return;
            }
        }
        org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
    }

    @Override
    public final ColorFilter d() {
        return org.telegram.ui.ActionBar.n6.f29783v3;
    }

    @Override
    public final Paint e(String str) {
        if (this.f54653f == null && this.h == null && !this.f54665s) {
            return null;
        }
        return (Paint) this.f54650b.get(str);
    }

    @Override
    public final boolean f() {
        return this.G.S9();
    }

    @Override
    public final int g(int i7) {
        return i(i7);
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.f54649a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    @Override
    public final boolean h() {
        if (this.h == null && !this.f54665s) {
            return org.telegram.ui.ActionBar.n6.d1();
        }
        if (this.f54660n != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int i(int i7) {
        int indexOfKey;
        Integer z02;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.f54652e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.f54652e.valueAt(indexOfKey2);
        }
        if (this.f54665s && (z02 = org.telegram.ui.ActionBar.n6.z0(i7, this)) != null) {
            return z02.intValue();
        }
        if (this.f54653f == null) {
            return org.telegram.ui.ActionBar.n6.v0(i7);
        }
        int indexOfKey3 = this.d.indexOfKey(i7);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i10 = org.telegram.ui.ActionBar.n6.im.get(i7);
        if (i10 >= 0 && (indexOfKey = this.d.indexOfKey(i10)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return org.telegram.ui.ActionBar.n6.v0(i7);
    }

    @Override
    public final void j(int i7, int i10) {
        SparseIntArray sparseIntArray = this.f54652e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i7, i10);
        }
    }

    @Override
    public final int k(int i7) {
        return a(i7, false);
    }

    public final org.telegram.ui.ActionBar.s3 l() {
        return this.f54653f;
    }

    public final Drawable m() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        return org.telegram.ui.ActionBar.n6.t0();
    }

    public final void n() {
        Drawable u4Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.n6.dm.entrySet()) {
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
                        int intValue = ((Integer) org.telegram.ui.ActionBar.n6.em.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.n6.C1(i(intValue), u4Var);
                            break;
                        }
                    }
                    break;
            }
            if (u4Var != null) {
                this.f54649a.put((String) entry.getKey(), u4Var);
            }
        }
    }

    public final void o() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.n6.fm.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.n6.gm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(i(intValue));
            }
            this.f54650b.put((String) entry.getKey(), paint);
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
                if (bnVar.f46173e == null && (user = bnVar.f46187f) != null && !user.bot) {
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
        org.telegram.ui.Components.za0 za0Var;
        int i7;
        int i10;
        int i11;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k6 k6Var;
        SparseIntArray sparseIntArray;
        int indexOfKey;
        org.telegram.ui.ActionBar.m6 m6Var;
        boolean z11;
        Drawable drawable2;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.m6 Q0;
        int i13;
        org.telegram.ui.ActionBar.m6 Q02;
        org.telegram.ui.ActionBar.s3 s3Var2 = s3Var;
        bn bnVar = this.G;
        if (bnVar.f46453za != null) {
            return;
        }
        this.f54653f = s3Var2;
        this.f54654g = wallPaper;
        if (bnVar.fragmentView != null) {
            drawable = bnVar.f46279m1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof org.telegram.ui.Components.za0) {
            za0Var = (org.telegram.ui.Components.za0) drawable;
        } else {
            za0Var = null;
        }
        if (za0Var != null) {
            i7 = za0Var.f42793i;
        } else {
            i7 = 0;
        }
        if ((s3Var2 == null || s3Var2.f30045a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.n6.lm.indexOfKey(org.telegram.ui.ActionBar.n6.f29440cd);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.n6.lm.valueAt(indexOfKey2);
            } else {
                int i14 = org.telegram.ui.ActionBar.n6.f29386a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (s3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.f54650b.clear();
            this.f54649a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.n6.t0();
            if (t02 instanceof org.telegram.ui.Components.za0) {
                ((org.telegram.ui.Components.za0) t02).u(i7);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.n6.I.q() == this.f54663q) {
                Q02 = org.telegram.ui.ActionBar.n6.I;
            } else {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f27013b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.n6.Q0(string) != null && !org.telegram.ui.ActionBar.n6.Q0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.n6.Q0(string2) != null && org.telegram.ui.ActionBar.n6.Q0(string2).q()) {
                    str = string2;
                }
                if (this.f54663q) {
                    Q02 = org.telegram.ui.ActionBar.n6.Q0(str);
                } else {
                    Q02 = org.telegram.ui.ActionBar.n6.Q0(str2);
                }
            }
            org.telegram.ui.ActionBar.n6.u(Q02, false, this.f54663q);
            p(this.h);
            this.f54665s = false;
            t();
            return;
        }
        this.f54665s = false;
        if (org.telegram.messenger.t0.f27013b != null) {
            org.telegram.ui.ActionBar.n6.K(org.telegram.messenger.t0.f27013b, false);
        }
        if (s3Var2 != null) {
            i10 = ((org.telegram.ui.ActionBar.g2) this.G).currentAccount;
            boolean z12 = this.f54663q;
            ArrayList arrayList2 = s3Var2.f30049f;
            org.telegram.ui.ActionBar.m6 i15 = s3Var2.i(z12 ? 1 : 0);
            if (i15 == null) {
                int i16 = ((org.telegram.ui.ActionBar.r3) s3Var2.f30049f.get(z12 ? 1 : 0)).d;
                i11 = 0;
                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) ((ig.a) s3Var2.f30049f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = r3Var.b(i16);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.r3) s3Var2.f30049f.get(z12 ? 1 : 0)).f30021b;
                org.telegram.ui.ActionBar.m6 m6Var2 = new org.telegram.ui.ActionBar.m6(org.telegram.ui.ActionBar.n6.Q0(org.telegram.ui.ActionBar.n6.r0(b10)));
                arrayList = arrayList2;
                k6Var = m6Var2.e(r3Var.a(), b10, tL_theme, i10, true);
                m6Var2.u(k6Var.f29224a);
                i15 = m6Var2;
            } else {
                i11 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i15.f29323b0;
                if (sparseArray != null) {
                    k6Var = (org.telegram.ui.ActionBar.k6) sparseArray.get(((org.telegram.ui.ActionBar.r3) arrayList.get(z12 ? 1 : 0)).f30023e);
                } else {
                    k6Var = null;
                }
            }
            String[] strArr = new String[1];
            if (i15.f29322b != null) {
                sparseIntArray = org.telegram.ui.ActionBar.n6.T0(new File(i15.f29322b), null, strArr);
            } else {
                String str3 = i15.d;
                if (str3 != null) {
                    sparseIntArray = org.telegram.ui.ActionBar.n6.T0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((org.telegram.ui.ActionBar.r3) arrayList.get(z12 ? 1 : 0)).f30025g = strArr[i11];
            if (k6Var != null) {
                SparseIntArray clone = sparseIntArray.clone();
                k6Var.d(sparseIntArray, clone);
                ig.b bVar = s3Var2.f30047c;
                if (bVar != null && !TextUtils.isEmpty(bVar.f16338b) && (m6Var = k6Var.f29225b) != null && m6Var.f29322b == null && !m6Var.q()) {
                    org.telegram.ui.ActionBar.k6.h(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = org.telegram.ui.ActionBar.n6.im;
            for (int i17 = i11; i17 < sparseIntArray2.size(); i17++) {
                int keyAt = sparseIntArray2.keyAt(i17);
                int valueAt = sparseIntArray2.valueAt(i17);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.n6.hm;
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
        if (!TextUtils.isEmpty(org.telegram.messenger.f4.j(this.f54654g))) {
            Drawable drawable3 = this.h;
            i13 = ((org.telegram.ui.ActionBar.g2) this.G).currentAccount;
            this.h = hi.f6.f(drawable3, i13, this.f54654g, this.f54663q);
        } else if (wallPaper != null) {
            this.h = en.d(this.h, wallPaper, this.f54663q);
        } else {
            if (s3Var2.f30045a) {
                org.telegram.ui.ActionBar.m6 d = org.telegram.ui.ActionBar.s3.d(this.f54663q);
                i12 = ((org.telegram.ui.ActionBar.g2) this.G).currentAccount;
                org.telegram.ui.ActionBar.n6.I(d, s3Var2.g(i12, this.f54663q ? 1 : 0), ((org.telegram.ui.ActionBar.r3) s3Var2.f30049f.get(this.f54663q ? 1 : 0)).f30025g, i7, i11);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int i19 = i(org.telegram.ui.ActionBar.n6.Ee);
                int i20 = i(org.telegram.ui.ActionBar.n6.Fe);
                int i21 = i(org.telegram.ui.ActionBar.n6.Ge);
                int i22 = i(org.telegram.ui.ActionBar.n6.He);
                org.telegram.ui.Components.za0 za0Var2 = new org.telegram.ui.Components.za0();
                za0Var2.s(s3Var2.j(this.f54663q ? 1 : 0).settings.intensity, za0Var2.f42805u);
                TLRPC.Document e10 = s3Var2.e();
                if (za0Var2.f42808y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    za0Var2.f42808y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = za0Var2.f42787c;
                    if (weakReference != null) {
                        za0Var2.f42808y.I0((View) weakReference.get());
                    }
                    if (za0Var2.T) {
                        za0Var2.f42808y.Q();
                    }
                }
                za0Var2.f42808y.r0(org.telegram.messenger.fc.b(e10), "80_80", null, null, null, 0);
                za0Var2.f42808y.Y(1);
                za0Var2.f42808y.X(1);
                za0Var2.o(i19, i20, i21, i22, 0, true);
                za0Var2.u(i7);
                int f10 = za0Var2.f();
                boolean z13 = this.f54663q;
                oi.f0 f0Var = new oi.f0(18, this, za0Var2);
                org.telegram.ui.ActionBar.r3 r3Var2 = (org.telegram.ui.ActionBar.r3) s3Var2.f30049f.get(z13 ? 1 : 0);
                if (r3Var2 != null && r3Var2.f30022c != null) {
                    long h = s3Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = r3Var2.f30022c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z11 = z13 ? 1 : 0;
                        int i23 = 0;
                        while (true) {
                            if (i23 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i23);
                            int i24 = i23 + 1;
                            int i25 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i25;
                                i23 = i24;
                            }
                        }
                    } else {
                        z11 = z13 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    org.telegram.messenger.fc b11 = org.telegram.messenger.fc.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.A1 = false;
                    imageReceiver2.r0(b11, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.f22737h1 = new ai.z(f0Var, h, 3);
                    org.telegram.messenger.ec.D().M(imageReceiver2, null);
                } else {
                    z11 = z13 ? 1 : 0;
                }
                s3Var2 = s3Var;
                s3Var2.n(this.f54663q ? 1 : 0, new org.telegram.messenger.r6(this, s3Var2, z11, za0Var2, f10));
                drawable2 = za0Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.f54664r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.f54664r = new AnimatorSet();
            if (za0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new vm(za0Var, 0));
                ofFloat.addListener(new xm(za0Var));
                ofFloat.setDuration(200L);
                this.f54664r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof org.telegram.ui.Components.za0) {
                org.telegram.ui.Components.za0 za0Var3 = (org.telegram.ui.Components.za0) drawable4;
                za0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new vm(za0Var3, 1));
                ofFloat2.addListener(new ym(za0Var3));
                ofFloat2.setDuration(250L);
                this.f54664r.playTogether(ofFloat2);
            }
            this.f54664r.start();
        }
        if (s3Var2 == null && this.G.f46271l6 >= 0) {
            if (org.telegram.ui.ActionBar.n6.I.q() == this.f54663q) {
                Q0 = org.telegram.ui.ActionBar.n6.I;
            } else {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.t0.f27013b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.n6.Q0(string3) != null && !org.telegram.ui.ActionBar.n6.Q0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.n6.Q0(string4) != null && org.telegram.ui.ActionBar.n6.Q0(string4).q()) {
                    str = string4;
                }
                if (this.f54663q) {
                    Q0 = org.telegram.ui.ActionBar.n6.Q0(str);
                } else {
                    Q0 = org.telegram.ui.ActionBar.n6.Q0(str2);
                }
            }
            c10 = 0;
            org.telegram.ui.ActionBar.n6.u(Q0, false, this.f54663q);
        } else {
            c10 = 0;
        }
        int i26 = org.telegram.messenger.g0.q(this.h)[c10];
        n();
        o();
        p(this.h);
        u(1.0f);
    }

    public final void t() {
        boolean z10;
        bn bnVar = this.G;
        if (bnVar.f46453za == null && this.f54653f == null && this.f54654g == null) {
            if (bnVar.S9() && !org.telegram.messenger.bz.H0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || this.f54665s) {
                this.f54665s = z10;
                this.f54650b.clear();
                this.f54649a.clear();
                if (z10) {
                    if (org.telegram.messenger.t0.f27013b != null) {
                        org.telegram.ui.ActionBar.n6.K(org.telegram.messenger.t0.f27013b, false);
                    }
                    n();
                    o();
                }
                p(org.telegram.ui.ActionBar.n6.t0());
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
        if (!this.f54650b.isEmpty()) {
            Paint e10 = e("paintChatActionBackground");
            Paint e11 = e("paintChatActionBackgroundSelected");
            Paint e12 = e("paintChatMessageBackgroundSelected");
            int i13 = this.B;
            boolean S9 = this.G.S9();
            int i14 = -1;
            if (this.C) {
                a10 = -1;
            } else {
                if (S9) {
                    i7 = org.telegram.ui.ActionBar.n6.Fa;
                } else {
                    i7 = org.telegram.ui.ActionBar.n6.Zc;
                }
                a10 = a(i7, true);
            }
            if (this.C) {
                a11 = -1;
            } else {
                if (S9) {
                    i10 = org.telegram.ui.ActionBar.n6.Fa;
                } else {
                    i10 = org.telegram.ui.ActionBar.n6.f29400ad;
                }
                a11 = a(i10, true);
            }
            if (this.C) {
                a12 = -1;
            } else {
                if (S9) {
                    i11 = org.telegram.ui.ActionBar.n6.Ha;
                } else {
                    i11 = org.telegram.ui.ActionBar.n6.f29400ad;
                }
                a12 = a(i11, true);
            }
            if (!this.C) {
                if (S9) {
                    i12 = org.telegram.ui.ActionBar.n6.Ga;
                } else {
                    i12 = org.telegram.ui.ActionBar.n6.bd;
                }
                i14 = a(i12, true);
            }
            int i15 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            if (i15 != 0) {
                i13 = i0.a.f(f10, this.f54671z, i13);
                a10 = i0.a.f(f10, this.v, a10);
                a11 = i0.a.f(f10, this.f54668w, a11);
                a12 = i0.a.f(f10, this.f54669x, a12);
                i14 = i0.a.f(f10, this.f54670y, i14);
            }
            if (e10 != null && !this.C) {
                e10.setColor(i13);
                e11.setColor(i13);
            }
            Paint e13 = e("paintChatActionText");
            if (e13 != null) {
                ((TextPaint) e13).linkColor = a11;
                e("paintChatActionText").setColor(a10);
                e("paintChatBotButton").setColor(a12);
            }
            org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerCheck"));
            org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerClock"));
            org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerHalfCheck"));
            org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerPinned"));
            org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerReplies"));
            org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerViews"));
            org.telegram.ui.ActionBar.n6.C1(i14, getDrawable("drawableBotInline"));
            org.telegram.ui.ActionBar.n6.C1(i14, getDrawable("drawableBotLink"));
            org.telegram.ui.ActionBar.n6.C1(i14, getDrawable("drawableBotLock"));
            org.telegram.ui.ActionBar.n6.C1(i14, getDrawable("drawable_botInvite"));
            org.telegram.ui.ActionBar.n6.C1(i14, getDrawable("drawableCommentSticker"));
            org.telegram.ui.ActionBar.n6.C1(i14, getDrawable("drawableGoIcon"));
            org.telegram.ui.ActionBar.n6.C1(i14, getDrawable("drawableReplyIcon"));
            org.telegram.ui.ActionBar.n6.C1(i14, getDrawable("drawableShareIcon"));
            if (this.f54659m != null && (bitmap = this.f54657k) != null) {
                Rect rect = this.F;
                Rect rect2 = this.E;
                if (i15 != 0 && (bitmap2 = this.A) != null) {
                    this.f54662p = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
                    rect.set(0, 0, this.f54656j.getWidth(), this.f54656j.getHeight());
                    this.f54659m.drawBitmap(this.A, rect2, rect, (Paint) null);
                    Paint paint = this.f54658l;
                    paint.setAlpha((int) (f10 * 255.0f));
                    rect2.set(0, 0, this.f54657k.getWidth(), this.f54657k.getHeight());
                    rect.set(0, 0, this.f54656j.getWidth(), this.f54656j.getHeight());
                    this.f54659m.drawBitmap(this.f54657k, rect2, rect, paint);
                    if (e10 != null) {
                        e10.setShader(this.f54660n);
                        e11.setShader(this.f54660n);
                    }
                    if (e12 != null) {
                        e12.setShader(this.f54660n);
                        return;
                    }
                    return;
                }
                this.f54662p = true;
                rect2.set(0, 0, bitmap.getWidth(), this.f54657k.getHeight());
                rect.set(0, 0, this.f54656j.getWidth(), this.f54656j.getHeight());
                this.f54659m.drawBitmap(this.f54657k, rect2, rect, (Paint) null);
                if (e10 != null) {
                    e10.setShader(this.f54661o);
                    e11.setShader(this.f54661o);
                }
                if (e12 != null) {
                    e12.setShader(this.f54661o);
                }
            }
        }
    }
}
