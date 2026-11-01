package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rn0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public final hi.c D;
    public final tg.b E;
    public final hi.c F;
    public final tg.b G;
    public org.telegram.ui.ActionBar.k2 H;
    public hk I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.bz M;
    public org.telegram.ui.ActionBar.u5 N;
    public FrameLayout O;
    public FrameLayout P;
    public vh.d Q;
    public ln0 R;
    public boolean S;
    public org.telegram.ui.Components.ci0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ic X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f41110a;
    public boolean f41111a0;
    public final rh.v5 f41112b;
    public i0.c f41113b0;
    public final rh.v5 f41114c;
    public final je.b f41115c0;
    public l0 d;
    public final je.b f41116d0;
    public wm0 e;
    public final int f41117f;
    public ln0 h;
    public ln0 f41118n;
    public boolean f41119r;
    public org.telegram.ui.ActionBar.p6 f41120s;
    public final SparseIntArray f41121w;
    public final org.telegram.ui.ActionBar.c5 f41122x;
    public final org.telegram.ui.ActionBar.c5 f41123y;

    public rn0() {
        super(null);
        this.f41117f = org.telegram.messenger.i0.L(6.0f);
        this.f41121w = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
        this.S = q6;
        this.f41111a0 = q6;
        this.f41113b0 = i0.c.e;
        je.b bVar = new je.b();
        this.f41115c0 = bVar;
        je.b bVar2 = new je.b();
        this.f41116d0 = bVar2;
        hi.c cVar = new hi.c();
        this.D = cVar;
        tg.b bVar3 = new tg.b(cVar, cVar, cVar);
        this.E = bVar3;
        hi.c cVar2 = new hi.c();
        this.F = cVar2;
        tg.b bVar4 = new tg.b(cVar2, cVar2, cVar2);
        this.G = bVar4;
        bVar3.f48712g = bVar;
        bVar3.f48711f = bVar2;
        bVar4.f48712g = bVar;
        bVar4.f48711f = bVar2;
        this.f41110a = false;
        rh.e6.y(this.currentAccount, false).U();
        rh.v5 v5Var = new rh.v5(this.currentAccount, 0L, false);
        this.f41112b = v5Var;
        v5Var.g(8, false);
        v5Var.b();
        rh.v5 v5Var2 = new rh.v5(this.currentAccount, 0L, false);
        this.f41114c = v5Var2;
        v5Var2.g(8, false);
        v5Var2.f47591f = true;
        v5Var2.b();
        this.resourceProvider = new bk(this, 1);
        this.f41122x = new org.telegram.ui.ActionBar.c5(0, false, false, this.resourceProvider);
        this.f41123y = new org.telegram.ui.ActionBar.c5(0, false, true, this.resourceProvider);
    }

    public static int B0(int i10) {
        boolean z10;
        float f7;
        if (org.telegram.messenger.i0.B(i10) < 0.2f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f7 = 0.28f;
        } else {
            f7 = -0.28f;
        }
        return org.telegram.ui.ActionBar.t6.b(0.5f, f7, i10);
    }

    public static boolean G0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z10;
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        if (tL_emojiStatusCollectible != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        if (z10 == z11 && tL_emojiStatusCollectible != null && z11 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id) {
            return true;
        }
        return false;
    }

    public static void Z(rn0 rn0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, rm0 rm0Var, rh.e3 e3Var, gf.e eVar) {
        zArr[0] = true;
        eVar.d();
        rh.e6.x(rn0Var.currentAccount, e3Var.f46808a).h(e3Var.f46809b, tL_starGiftUnique, j10, null, true, new ih.s(14, eVar, rm0Var));
    }

    public static void a0(rn0 rn0Var, sf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, rm0 rm0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        rh.e3 e3Var = new rh.e3(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        rh.g3 g3Var = new rh.g3(rn0Var.getParentActivity(), rn0Var.resourceProvider, tL_starGiftUnique, e3Var, rn0Var.currentAccount, j10, i0.a.k(tL_starGiftUnique.num, ',', sb2), false, new tm0(rn0Var, zArr, tL_starGiftUnique, j10, rm0Var, 0));
        g3Var.h.setOnDismissListener(new mg.g(8, zArr, rm0Var));
        g3Var.b();
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rn0.C0():void");
    }

    public final void D0() {
        sf.b bVar;
        if (this.f41119r) {
            return;
        }
        if (this.f41110a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) this, 23, true));
            return;
        }
        ln0 H0 = H0();
        if (H0.I != null) {
            ln0 ln0Var = this.h;
            if (H0 == ln0Var) {
                ln0Var = this.f41118n;
            }
            ln0Var.d();
            this.f41119r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = H0.I;
            rm0 rm0Var = new rm0(this, 1);
            long e = org.telegram.messenger.e20.i(this.currentAccount).e();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = sf.b.f48268b;
            } else {
                bVar = sf.b.f48267a;
            }
            rh.e6.x(this.currentAccount, bVar).H(tL_starGiftUnique, e, null, true, new sm0(this, bVar, tL_starGiftUnique, e, rm0Var));
            return;
        }
        ln0 ln0Var2 = this.h;
        if (H0 == ln0Var2) {
            ln0Var2 = this.f41118n;
        }
        if (ln0Var2.I != null) {
            ln0Var2.d();
        }
        C0();
        finishFragment();
        I0();
    }

    public final void E0() {
        this.D.a(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f39338x.invalidate();
        this.h.f39339y.invalidate();
        this.f41118n.f39338x.invalidate();
        this.h.f39317b.invalidate();
        this.f41118n.f39317b.invalidate();
        ((vg.f) this.O.getBackground()).updateColors();
        F0();
        Iterator it = this.f41116d0.iterator();
        while (it.hasNext()) {
            ((vg.f) it.next()).updateColors();
        }
    }

    public final void F0() {
        int themedColor;
        if (org.telegram.messenger.i0.B(getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6)) > 0.72d) {
            themedColor = i0.b.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7);
        }
        this.d.setBackgroundColor(themedColor);
        hi.c cVar = this.F;
        if (cVar.f7712b != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f41116d0.iterator();
            while (it.hasNext()) {
                ((vg.f) it.next()).updateColors();
            }
            Iterator it2 = this.f41115c0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final ln0 H0() {
        hk hkVar = this.I;
        if (hkVar != null && hkVar.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f41118n;
    }

    public final void I0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rn0.I0():void");
    }

    public final void J0() {
        org.telegram.ui.ActionBar.u5 u5Var = this.N;
        if (u5Var != null) {
            u5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.A8));
        }
        this.h.g();
        this.f41118n.g();
        wm0 wm0Var = this.e;
        if (wm0Var != null) {
            wm0Var.f43685a = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, wm0Var.f43686b);
            wm0Var.a();
            wm0Var.invalidate();
        }
        K0();
        E0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void K0() {
        float positionAnimated;
        if (this.e != null) {
            F0();
            int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
            if (this.M != null) {
                hk hkVar = this.I;
                if (hkVar == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = hkVar.getPositionAnimated();
                }
                float a2 = w7.u.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.bz bzVar = this.M;
                int f7 = i0.b.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
                int f10 = i0.b.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7));
                int f11 = i0.b.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.t6.f21331z6));
                int f12 = i0.b.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.t6.G6));
                bzVar.f24929a.setColor(f7);
                bzVar.f24930b.setColor(f10);
                bzVar.d = f11;
                bzVar.e = f12;
                bzVar.invalidate();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        setHasOwnBackground(true);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        l0 l0Var = new l0(this, context, 17);
        this.d = l0Var;
        this.fragmentView = l0Var;
        this.h = new ln0(this, context, 1);
        this.f41118n = new ln0(this, context, 0);
        wm0 wm0Var = new wm0(this, context, this.resourceProvider);
        this.e = wm0Var;
        wm0Var.E = true;
        this.f41118n.j(false);
        this.f41118n.addView(this.e, 2, w7.b6.e(-1, -2, 55));
        hk hkVar = new hk(this, context, 1);
        this.I = hkVar;
        hkVar.setAdapter(new ig.n(this, 2));
        l0Var.addView(this.I, w7.b6.e(-1, -1, 119));
        vh.d dVar = new vh.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.f();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final rn0 f41978b;

            {
                this.f41978b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                rn0 rn0Var = this.f41978b;
                switch (i12) {
                    case 0:
                        if (rn0Var.onBackPressed(true)) {
                            rn0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        rn0 rn0Var2 = this.f41978b;
                        FrameLayout frameLayout2 = (FrameLayout) rn0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rn0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        rn0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        rn0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.f16167n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ic icVar = new ic(rn0Var2, rn0Var2.getParentActivity(), canvas, (rn0Var2.K.getMeasuredWidth() / 2.0f) + f7, (rn0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        rn0Var2.X = icVar;
                        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        rn0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        rn0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new jc(rn0Var2, 1));
                        rn0Var2.Z.addListener(new org.telegram.ui.Components.voip.i2(rn0Var2, 19));
                        rn0Var2.Z.setDuration(400L);
                        rn0Var2.Z.setInterpolator(org.telegram.ui.Components.vs.e);
                        rn0Var2.Z.start();
                        frameLayout2.addView(rn0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new kg0(rn0Var2, 13));
                        return;
                    default:
                        rn0Var.D0();
                        return;
                }
            }
        });
        this.O.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        this.O.addView(this.Q, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        vg.f c10 = this.E.c(frameLayout2, null, false);
        c10.o(w7.b9.j(this.resourceProvider));
        c10.q(org.telegram.messenger.i0.L(28.0f));
        c10.p(org.telegram.messenger.i0.L(5.0f));
        frameLayout2.setBackground(c10);
        w7.e6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.b6.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        tg.c cVar = new tg.c(this.G.c(this.P, null, false));
        cVar.b(org.telegram.messenger.i0.L(40.0f), true);
        cVar.G = 220;
        this.P.setBackground(cVar);
        ln0 H0 = H0();
        vh.d dVar2 = this.Q;
        if (dVar2 != null && H0 != null && H0 != this.R) {
            this.R = H0;
            m5.e eVar = H0.e;
            dVar2.i((CharSequence) eVar.f13014b, false, true);
            this.Q.g((SpannableStringBuilder) eVar.f13015c, false);
        }
        l0Var.addView(this.P, w7.b6.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        l0Var.addView(frameLayout4, w7.b6.e(-1, -2, 55));
        boolean z10 = this.f41110a;
        if (!z10) {
            org.telegram.ui.Components.bz bzVar = new org.telegram.ui.Components.bz(context);
            this.M = bzVar;
            if (z10) {
                i10 = 2131752428;
            } else {
                i10 = 2131743772;
            }
            String L0 = org.telegram.messenger.dd.L0(i10, null);
            if (z10) {
                i11 = 2131752429;
            } else {
                i11 = 2131743773;
            }
            bzVar.setTabs(L0, org.telegram.messenger.dd.L0(i11, null));
            this.M.f24934r = new rm0(this, 0);
            K0();
            this.L.addView(this.M, w7.b6.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
            this.N = u5Var;
            u5Var.l(org.telegram.messenger.dd.L0(2131752427, null), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            org.telegram.ui.ActionBar.a7.Y(this.N, org.telegram.ui.ActionBar.t6.A8, getResourceProvider());
            this.N.setTypeface(org.telegram.messenger.i0.o());
            this.L.addView(this.N, w7.b6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        wm0 wm0Var2 = this.e;
        if (wm0Var2 != null) {
            wm0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.i0.o3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.t6.f21245u8;
        org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i12), getResourceProvider());
        this.J.setImageResource(2131231241);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final rn0 f41978b;

            {
                this.f41978b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                rn0 rn0Var = this.f41978b;
                switch (i122) {
                    case 0:
                        if (rn0Var.onBackPressed(true)) {
                            rn0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        rn0 rn0Var2 = this.f41978b;
                        FrameLayout frameLayout22 = (FrameLayout) rn0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rn0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        rn0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        rn0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.f16167n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ic icVar = new ic(rn0Var2, rn0Var2.getParentActivity(), canvas, (rn0Var2.K.getMeasuredWidth() / 2.0f) + f7, (rn0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        rn0Var2.X = icVar;
                        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        rn0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        rn0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new jc(rn0Var2, 1));
                        rn0Var2.Z.addListener(new org.telegram.ui.Components.voip.i2(rn0Var2, 19));
                        rn0Var2.Z.setDuration(400L);
                        rn0Var2.Z.setInterpolator(org.telegram.ui.Components.vs.e);
                        rn0Var2.Z.start();
                        frameLayout22.addView(rn0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new kg0(rn0Var2, 13));
                        return;
                    default:
                        rn0Var.D0();
                        return;
                }
            }
        });
        w7.e6.a(this.J);
        this.L.addView(this.J, w7.b6.e(54, 54, 19));
        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(2131624238, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.T = ci0Var;
        ci0Var.h = true;
        if (!this.S) {
            ci0Var.P(0);
            this.T.M(0);
        } else {
            ci0Var.M(35);
            this.T.P(36);
        }
        this.T.Z = true;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J9, false);
        this.T.Q(x02, "Sunny");
        this.T.Q(x02, "Path 6");
        this.T.Q(x02, "Path");
        this.T.Q(x02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.R(this.K, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i12), getResourceProvider());
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final rn0 f41978b;

            {
                this.f41978b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                rn0 rn0Var = this.f41978b;
                switch (i122) {
                    case 0:
                        if (rn0Var.onBackPressed(true)) {
                            rn0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        rn0 rn0Var2 = this.f41978b;
                        FrameLayout frameLayout22 = (FrameLayout) rn0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rn0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        rn0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        rn0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.f16167n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ic icVar = new ic(rn0Var2, rn0Var2.getParentActivity(), canvas, (rn0Var2.K.getMeasuredWidth() / 2.0f) + f7, (rn0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        rn0Var2.X = icVar;
                        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        rn0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        rn0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new jc(rn0Var2, 1));
                        rn0Var2.Z.addListener(new org.telegram.ui.Components.voip.i2(rn0Var2, 19));
                        rn0Var2.Z.setDuration(400L);
                        rn0Var2.Z.setInterpolator(org.telegram.ui.Components.vs.e);
                        rn0Var2.Z.start();
                        frameLayout22.addView(rn0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new kg0(rn0Var2, 13));
                        return;
                    default:
                        rn0Var.D0();
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.b6.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        wm0 wm0Var3 = this.e;
        wm0Var3.getClass();
        wm0Var3.f43685a = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20873a7, wm0Var3.f43686b);
        wm0Var3.a();
        wm0Var3.invalidate();
        E0();
        F0();
        View view = this.fragmentView;
        vm0 vm0Var = new vm0(this, 0);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(view, vm0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == org.telegram.messenger.at.f14709f5) {
                this.h.f(true);
                this.f41118n.f(true);
            } else if (i10 == org.telegram.messenger.at.G3) {
                this.h.e();
                this.f41118n.e();
            } else if (i10 == org.telegram.messenger.at.F3) {
                this.h.e();
                this.f41118n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.t3.f20864c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(15, this), org.telegram.ui.ActionBar.t6.f20930d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.f21331z6, org.telegram.ui.ActionBar.t6.f21021i6, org.telegram.ui.ActionBar.t6.f20873a7, org.telegram.ui.ActionBar.t6.B6, org.telegram.ui.ActionBar.t6.f21154p7, org.telegram.ui.ActionBar.t6.f20967f6, org.telegram.ui.ActionBar.t6.f20986g6, org.telegram.ui.ActionBar.t6.O6, org.telegram.ui.ActionBar.t6.P6, org.telegram.ui.ActionBar.t6.Q6, org.telegram.ui.ActionBar.t6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        wm0 wm0Var = this.e;
        if (wm0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.b.h(wm0Var.getColor()) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.f41110a && ((this.h.b() || this.f41118n.b()) && getUserConfig().q())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f41110a;
        if (!z11 && ((this.h.b() || this.f41118n.b()) && getUserConfig().q())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                if (z11) {
                    i10 = 2131752426;
                } else {
                    i10 = 2131743771;
                }
                String L0 = org.telegram.messenger.dd.L0(i10, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                if (z11) {
                    i11 = 2131752425;
                } else {
                    i11 = 2131743770;
                }
                x1Var.T = org.telegram.messenger.dd.L0(i11, null);
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751370, null), new vm0(this, 1));
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754216, null), new vm0(this, 2));
                showDialog(x1Var);
                org.telegram.ui.ActionBar.a7.V((TextView) x1Var.d(-2), org.telegram.ui.ActionBar.t6.f21171q7, getResourceProvider());
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.at.f14709f5);
        getNotificationCenter().c(this, org.telegram.messenger.at.G3);
        getNotificationCenter().c(this, org.telegram.messenger.at.F3);
        setBulletinDelegate(new mg.u(8));
        getMediaDataController().W0();
        if (org.telegram.messenger.wp.r1(this.currentAccount).f19231r4 == null) {
            boolean z10 = org.telegram.messenger.v2.f18578a;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.at.f14709f5);
        getNotificationCenter().n(this, org.telegram.messenger.at.G3);
        getNotificationCenter().n(this, org.telegram.messenger.at.F3);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.f41118n != null) {
                J0();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f41120s = p6Var;
    }
}
