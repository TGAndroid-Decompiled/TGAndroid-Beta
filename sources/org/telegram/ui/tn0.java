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
public final class tn0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
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
    public nn0 R;
    public boolean S;
    public org.telegram.ui.Components.bi0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ic X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f41868a;
    public boolean f41869a0;
    public final rh.v5 f41870b;
    public i0.c f41871b0;
    public final rh.v5 f41872c;
    public final je.b f41873c0;
    public l0 d;
    public final je.b f41874d0;
    public ym0 e;
    public final int f41875f;
    public nn0 h;
    public nn0 f41876n;
    public boolean f41877r;
    public org.telegram.ui.ActionBar.p6 f41878s;
    public final SparseIntArray f41879w;
    public final org.telegram.ui.ActionBar.c5 f41880x;
    public final org.telegram.ui.ActionBar.c5 f41881y;

    public tn0() {
        super(null);
        this.f41875f = org.telegram.messenger.i0.L(6.0f);
        this.f41879w = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
        this.S = q6;
        this.f41869a0 = q6;
        this.f41871b0 = i0.c.e;
        je.b bVar = new je.b();
        this.f41873c0 = bVar;
        je.b bVar2 = new je.b();
        this.f41874d0 = bVar2;
        hi.c cVar = new hi.c();
        this.D = cVar;
        tg.b bVar3 = new tg.b(cVar);
        this.E = bVar3;
        hi.c cVar2 = new hi.c();
        this.F = cVar2;
        tg.b bVar4 = new tg.b(cVar2);
        this.G = bVar4;
        bVar3.e = bVar;
        bVar3.d = bVar2;
        bVar4.e = bVar;
        bVar4.d = bVar2;
        this.f41868a = false;
        rh.e6.y(this.currentAccount, false).U();
        rh.v5 v5Var = new rh.v5(this.currentAccount, 0L, false);
        this.f41870b = v5Var;
        v5Var.g(8, false);
        v5Var.b();
        rh.v5 v5Var2 = new rh.v5(this.currentAccount, 0L, false);
        this.f41872c = v5Var2;
        v5Var2.g(8, false);
        v5Var2.f47577f = true;
        v5Var2.b();
        this.resourceProvider = new bk(this, 1);
        this.f41880x = new org.telegram.ui.ActionBar.c5(0, false, false, this.resourceProvider);
        this.f41881y = new org.telegram.ui.ActionBar.c5(0, false, true, this.resourceProvider);
    }

    public static int A0(int i10) {
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

    public static boolean F0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
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

    public static void Y(tn0 tn0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm0 tm0Var, rh.d3 d3Var, gf.e eVar) {
        zArr[0] = true;
        eVar.d();
        rh.e6.x(tn0Var.currentAccount, d3Var.f46756a).h(d3Var.f46757b, tL_starGiftUnique, j10, null, true, new ih.s(14, eVar, tm0Var));
    }

    public static void Z(tn0 tn0Var, sf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm0 tm0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        rh.d3 d3Var = new rh.d3(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        rh.g3 g3Var = new rh.g3(tn0Var.getParentActivity(), tn0Var.resourceProvider, tL_starGiftUnique, d3Var, tn0Var.currentAccount, j10, i0.a.k(tL_starGiftUnique.num, ',', sb2), false, new vm0(tn0Var, zArr, tL_starGiftUnique, j10, tm0Var, 0));
        g3Var.h.setOnDismissListener(new mg.g(8, zArr, tm0Var));
        g3Var.b();
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn0.B0():void");
    }

    public final void C0() {
        sf.b bVar;
        if (this.f41877r) {
            return;
        }
        if (this.f41868a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) this, 23, true));
            return;
        }
        nn0 G0 = G0();
        if (G0.I != null) {
            nn0 nn0Var = this.h;
            if (G0 == nn0Var) {
                nn0Var = this.f41876n;
            }
            nn0Var.d();
            this.f41877r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = G0.I;
            tm0 tm0Var = new tm0(this, 1);
            long e = org.telegram.messenger.d20.i(this.currentAccount).e();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = sf.b.f48257b;
            } else {
                bVar = sf.b.f48256a;
            }
            rh.e6.x(this.currentAccount, bVar).H(tL_starGiftUnique, e, null, true, new um0(this, bVar, tL_starGiftUnique, e, tm0Var));
            return;
        }
        nn0 nn0Var2 = this.h;
        if (G0 == nn0Var2) {
            nn0Var2 = this.f41876n;
        }
        if (nn0Var2.I != null) {
            nn0Var2.d();
        }
        B0();
        finishFragment();
        H0();
    }

    public final void D0() {
        this.D.a(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f40005x.invalidate();
        this.h.f40006y.invalidate();
        this.f41876n.f40005x.invalidate();
        this.h.f39984b.invalidate();
        this.f41876n.f39984b.invalidate();
        ((vg.f) this.O.getBackground()).updateColors();
        E0();
        Iterator it = this.f41874d0.iterator();
        while (it.hasNext()) {
            ((vg.f) it.next()).updateColors();
        }
    }

    public final void E0() {
        int themedColor;
        if (org.telegram.messenger.i0.B(getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6)) > 0.72d) {
            themedColor = i0.b.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7);
        }
        this.d.setBackgroundColor(themedColor);
        hi.c cVar = this.F;
        if (cVar.f7711b != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f41874d0.iterator();
            while (it.hasNext()) {
                ((vg.f) it.next()).updateColors();
            }
            Iterator it2 = this.f41873c0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final nn0 G0() {
        hk hkVar = this.I;
        if (hkVar != null && hkVar.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f41876n;
    }

    public final void H0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn0.H0():void");
    }

    public final void I0() {
        org.telegram.ui.ActionBar.u5 u5Var = this.N;
        if (u5Var != null) {
            u5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.A8));
        }
        this.h.g();
        this.f41876n.g();
        ym0 ym0Var = this.e;
        if (ym0Var != null) {
            ym0Var.f35676a = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, ym0Var.f35677b);
            ym0Var.a();
            ym0Var.invalidate();
        }
        J0();
        D0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void J0() {
        float positionAnimated;
        if (this.e != null) {
            E0();
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
                int f7 = i0.b.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
                int f10 = i0.b.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7));
                int f11 = i0.b.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.t6.f21330z6));
                int f12 = i0.b.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.t6.G6));
                bzVar.f24913a.setColor(f7);
                bzVar.f24914b.setColor(f10);
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
        this.h = new nn0(this, context, 1);
        this.f41876n = new nn0(this, context, 0);
        ym0 ym0Var = new ym0(this, context, this.resourceProvider);
        this.e = ym0Var;
        ym0Var.E = true;
        this.f41876n.j(false);
        this.f41876n.addView(this.e, 2, w7.b6.e(-1, -2, 55));
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
            public final tn0 f43335b;

            {
                this.f43335b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                tn0 tn0Var = this.f43335b;
                switch (i12) {
                    case 0:
                        if (tn0Var.onBackPressed(true)) {
                            tn0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        tn0 tn0Var2 = this.f43335b;
                        FrameLayout frameLayout2 = (FrameLayout) tn0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tn0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        tn0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tn0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.f16021n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ic icVar = new ic(tn0Var2, tn0Var2.getParentActivity(), canvas, (tn0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tn0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tn0Var2.X = icVar;
                        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        tn0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tn0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new jc(tn0Var2, 1));
                        tn0Var2.Z.addListener(new org.telegram.ui.Components.voip.h2(tn0Var2, 19));
                        tn0Var2.Z.setDuration(400L);
                        tn0Var2.Z.setInterpolator(org.telegram.ui.Components.vs.e);
                        tn0Var2.Z.start();
                        frameLayout2.addView(tn0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new mg0(tn0Var2, 13));
                        return;
                    default:
                        tn0Var.C0();
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
        nn0 G0 = G0();
        vh.d dVar2 = this.Q;
        if (dVar2 != null && G0 != null && G0 != this.R) {
            this.R = G0;
            m5.e eVar = G0.e;
            dVar2.i((CharSequence) eVar.f13013b, false, true);
            this.Q.g((SpannableStringBuilder) eVar.f13014c, false);
        }
        l0Var.addView(this.P, w7.b6.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        l0Var.addView(frameLayout4, w7.b6.e(-1, -2, 55));
        boolean z10 = this.f41868a;
        if (!z10) {
            org.telegram.ui.Components.bz bzVar = new org.telegram.ui.Components.bz(context);
            this.M = bzVar;
            if (z10) {
                i10 = 2131752428;
            } else {
                i10 = 2131743772;
            }
            String L0 = org.telegram.messenger.cd.L0(i10, null);
            if (z10) {
                i11 = 2131752429;
            } else {
                i11 = 2131743773;
            }
            bzVar.setTabs(L0, org.telegram.messenger.cd.L0(i11, null));
            this.M.f24918r = new tm0(this, 0);
            J0();
            this.L.addView(this.M, w7.b6.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
            this.N = u5Var;
            u5Var.l(org.telegram.messenger.cd.L0(2131752427, null), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            org.telegram.ui.ActionBar.a7.Y(this.N, org.telegram.ui.ActionBar.t6.A8, getResourceProvider());
            this.N.setTypeface(org.telegram.messenger.i0.o());
            this.L.addView(this.N, w7.b6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        ym0 ym0Var2 = this.e;
        if (ym0Var2 != null) {
            ym0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.i0.o3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.t6.f21244u8;
        org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i12), getResourceProvider());
        this.J.setImageResource(2131231241);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final tn0 f43335b;

            {
                this.f43335b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                tn0 tn0Var = this.f43335b;
                switch (i122) {
                    case 0:
                        if (tn0Var.onBackPressed(true)) {
                            tn0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        tn0 tn0Var2 = this.f43335b;
                        FrameLayout frameLayout22 = (FrameLayout) tn0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tn0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        tn0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tn0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.f16021n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ic icVar = new ic(tn0Var2, tn0Var2.getParentActivity(), canvas, (tn0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tn0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tn0Var2.X = icVar;
                        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        tn0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tn0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new jc(tn0Var2, 1));
                        tn0Var2.Z.addListener(new org.telegram.ui.Components.voip.h2(tn0Var2, 19));
                        tn0Var2.Z.setDuration(400L);
                        tn0Var2.Z.setInterpolator(org.telegram.ui.Components.vs.e);
                        tn0Var2.Z.start();
                        frameLayout22.addView(tn0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new mg0(tn0Var2, 13));
                        return;
                    default:
                        tn0Var.C0();
                        return;
                }
            }
        });
        w7.e6.a(this.J);
        this.L.addView(this.J, w7.b6.e(54, 54, 19));
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(2131624238, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.T = bi0Var;
        bi0Var.h = true;
        if (!this.S) {
            bi0Var.P(0);
            this.T.M(0);
        } else {
            bi0Var.M(35);
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
            public final tn0 f43335b;

            {
                this.f43335b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                tn0 tn0Var = this.f43335b;
                switch (i122) {
                    case 0:
                        if (tn0Var.onBackPressed(true)) {
                            tn0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        tn0 tn0Var2 = this.f43335b;
                        FrameLayout frameLayout22 = (FrameLayout) tn0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tn0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        tn0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tn0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.f16021n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ic icVar = new ic(tn0Var2, tn0Var2.getParentActivity(), canvas, (tn0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tn0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tn0Var2.X = icVar;
                        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        tn0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tn0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new jc(tn0Var2, 1));
                        tn0Var2.Z.addListener(new org.telegram.ui.Components.voip.h2(tn0Var2, 19));
                        tn0Var2.Z.setDuration(400L);
                        tn0Var2.Z.setInterpolator(org.telegram.ui.Components.vs.e);
                        tn0Var2.Z.start();
                        frameLayout22.addView(tn0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new mg0(tn0Var2, 13));
                        return;
                    default:
                        tn0Var.C0();
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.b6.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        ym0 ym0Var3 = this.e;
        ym0Var3.getClass();
        ym0Var3.f35676a = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, ym0Var3.f35677b);
        ym0Var3.a();
        ym0Var3.invalidate();
        D0();
        E0();
        View view = this.fragmentView;
        xm0 xm0Var = new xm0(this, 0);
        WeakHashMap weakHashMap = r0.h0.f46123a;
        r0.z.i(view, xm0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == org.telegram.messenger.zs.f19613f5) {
                this.h.f(true);
                this.f41876n.f(true);
            } else if (i10 == org.telegram.messenger.zs.G3) {
                this.h.e();
                this.f41876n.e();
            } else if (i10 == org.telegram.messenger.zs.F3) {
                this.h.e();
                this.f41876n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.t3.f20863c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(15, this), org.telegram.ui.ActionBar.t6.f20929d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.f21330z6, org.telegram.ui.ActionBar.t6.f21020i6, org.telegram.ui.ActionBar.t6.f20872a7, org.telegram.ui.ActionBar.t6.B6, org.telegram.ui.ActionBar.t6.f21153p7, org.telegram.ui.ActionBar.t6.f20966f6, org.telegram.ui.ActionBar.t6.f20985g6, org.telegram.ui.ActionBar.t6.O6, org.telegram.ui.ActionBar.t6.P6, org.telegram.ui.ActionBar.t6.Q6, org.telegram.ui.ActionBar.t6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        ym0 ym0Var = this.e;
        if (ym0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.b.h(ym0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f41868a && ((this.h.b() || this.f41876n.b()) && getUserConfig().q())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f41868a;
        if (!z11 && ((this.h.b() || this.f41876n.b()) && getUserConfig().q())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                if (z11) {
                    i10 = 2131752426;
                } else {
                    i10 = 2131743771;
                }
                String L0 = org.telegram.messenger.cd.L0(i10, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                if (z11) {
                    i11 = 2131752425;
                } else {
                    i11 = 2131743770;
                }
                x1Var.T = org.telegram.messenger.cd.L0(i11, null);
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751370, null), new xm0(this, 1));
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new xm0(this, 2));
                showDialog(x1Var);
                org.telegram.ui.ActionBar.a7.V((TextView) x1Var.d(-2), org.telegram.ui.ActionBar.t6.f21170q7, getResourceProvider());
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
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19613f5);
        getNotificationCenter().c(this, org.telegram.messenger.zs.G3);
        getNotificationCenter().c(this, org.telegram.messenger.zs.F3);
        setBulletinDelegate(new mg.u(8));
        getMediaDataController().W0();
        if (org.telegram.messenger.vp.r1(this.currentAccount).f18888r4 == null) {
            boolean z10 = org.telegram.messenger.v2.f18448a;
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19613f5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.F3);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.f41876n != null) {
                I0();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f41878s = p6Var;
    }
}
