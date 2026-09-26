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
import android.os.Build;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tp0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final ah.c E;
    public final fh.c F;
    public final ah.c G;
    public org.telegram.ui.ActionBar.m2 H;
    public ci.i1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.sz M;
    public org.telegram.ui.ActionBar.h5 N;
    public FrameLayout O;
    public FrameLayout P;
    public ci.d Q;
    public np0 R;
    public boolean S;
    public org.telegram.ui.Components.jj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public kc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f38163a;
    public boolean f38164a0;
    public final yh.k5 f38165b;
    public i0.b f38166b0;
    public final yh.k5 f38167c;
    public yf.b0 f38168c0;
    public k0 d;
    public final pe.b f38169d0;
    public vo0 e;
    public final pe.b f38170e0;
    public final int f38171f;
    public final ah.h f38172f0;
    public final fh.d f38173g0;
    public np0 h;
    public final ah.c f38174h0;
    public final va f38175i0;
    public final ArrayList f38176j0;
    public final ArrayList f38177k0;
    public np0 f38178n;
    public boolean f38179r;
    public org.telegram.ui.ActionBar.d6 f38180s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.d5 f38181w;
    public final org.telegram.ui.ActionBar.d5 f38182x;
    public final fh.c f38183y;

    public tp0() {
        super(null);
        this.f38171f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
        this.S = q6;
        this.f38164a0 = q6;
        this.f38166b0 = i0.b.e;
        pe.b bVar = new pe.b();
        this.f38169d0 = bVar;
        pe.b bVar2 = new pe.b();
        this.f38170e0 = bVar2;
        this.f38175i0 = new va(this, 1);
        this.f38176j0 = new ArrayList();
        this.f38177k0 = new ArrayList();
        fh.c cVar = new fh.c();
        this.f38183y = cVar;
        ah.c cVar2 = new ah.c(cVar);
        this.E = cVar2;
        fh.c cVar3 = new fh.c();
        this.F = cVar3;
        ah.c cVar4 = new ah.c(cVar3);
        this.G = cVar4;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.h hVar = new ah.h(false);
            this.f38172f0 = hVar;
            fh.d dVar = new fh.d(cVar);
            this.f38173g0 = dVar;
            dVar.v = new ro0(this, 1);
            dVar.d = hVar;
            dVar.e = -2;
            dVar.f9059f = cVar;
            ah.c cVar5 = new ah.c(dVar);
            this.f38174h0 = cVar5;
            cVar5.f427i = LiteMode.isEnabled(262144);
        } else {
            this.f38172f0 = null;
            this.f38173g0 = null;
            this.f38174h0 = new ah.c(cVar);
        }
        cVar2.e = bVar;
        cVar2.d = bVar2;
        cVar4.e = bVar;
        cVar4.d = bVar2;
        ah.c cVar6 = this.f38174h0;
        cVar6.e = bVar;
        cVar6.d = bVar2;
        this.f38163a = false;
        yh.s5.y(this.currentAccount, false).V();
        yh.k5 k5Var = new yh.k5(this.currentAccount, 0L, false);
        this.f38165b = k5Var;
        k5Var.f(8, false);
        k5Var.a();
        yh.k5 k5Var2 = new yh.k5(this.currentAccount, 0L, false);
        this.f38167c = k5Var2;
        k5Var2.f(8, false);
        k5Var2.f47606f = true;
        k5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.f38181w = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f38182x = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
    }

    public static boolean B0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
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

    public static void U(tp0 tp0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, qo0 qo0Var, yh.a3 a3Var, nf.e eVar) {
        zArr[0] = true;
        eVar.d();
        yh.s5.x(tp0Var.currentAccount, a3Var.f47199a).h(a3Var.f47200b, tL_starGiftUnique, j3, null, true, new ai.m0(18, eVar, qo0Var));
    }

    public static void V(tp0 tp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, qo0 qo0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.a3 a3Var = new yh.a3(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        yh.c3 c3Var = new yh.c3(tp0Var.getParentActivity(), tp0Var.resourceProvider, tL_starGiftUnique, a3Var, tp0Var.currentAccount, j3, org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2), false, new uo0(tp0Var, zArr, tL_starGiftUnique, j3, qo0Var, 0));
        c3Var.h.setOnDismissListener(new ei.e0(10, zArr, qo0Var));
        c3Var.b();
    }

    public static int f0(tp0 tp0Var) {
        return tp0Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.d6 g0(tp0 tp0Var) {
        return tp0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.b5 h0(tp0 tp0Var) {
        return tp0Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d6 i0(tp0 tp0Var) {
        return tp0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.d6 j0(tp0 tp0Var) {
        return tp0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.d6 k0(tp0 tp0Var) {
        return tp0Var.resourceProvider;
    }

    public static int u0(tp0 tp0Var) {
        return tp0Var.currentAccount;
    }

    public static int v0(tp0 tp0Var) {
        return tp0Var.currentAccount;
    }

    public static int w0(int i10) {
        boolean z10;
        float f7;
        if (AndroidUtilities.computePerceivedBrightness(i10) < 0.2f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f7 = 0.28f;
        } else {
            f7 = -0.28f;
        }
        return org.telegram.ui.ActionBar.h6.b(0.5f, f7, i10);
    }

    public final void A0() {
        int themedColor;
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6)) > 0.72d) {
            themedColor = i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.h6.f19003a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f19003a7);
        }
        this.d.setBackgroundColor(themedColor);
        fh.c cVar = this.F;
        if (cVar.f9055a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f38170e0.iterator();
            while (it.hasNext()) {
                ((ch.d) it.next()).v();
            }
            Iterator it2 = this.f38169d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final np0 C0() {
        ci.i1 i1Var = this.I;
        if (i1Var != null && i1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f38178n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f38172f0 != null) {
            yf.b0 b0Var = this.f38168c0;
            if (b0Var.f47059c == 0) {
                b0Var.invalidate();
            }
            b0Var.f47059c = i10 | b0Var.f47059c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tp0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.h5 h5Var = this.N;
        if (h5Var != null) {
            h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.A8));
        }
        this.h.g();
        this.f38178n.g();
        vo0 vo0Var = this.e;
        if (vo0Var != null) {
            vo0Var.f40550a = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19003a7, vo0Var.f40551b);
            vo0Var.a();
            vo0Var.invalidate();
        }
        G0();
        z0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void G0() {
        float positionAnimated;
        if (this.e != null) {
            A0();
            int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
            if (this.M != null) {
                ci.i1 i1Var = this.I;
                if (i1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = i1Var.getPositionAnimated();
                }
                float a2 = w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.sz szVar = this.M;
                int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
                int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.f19003a7));
                int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.f19461z6));
                int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                szVar.f28379a.setColor(d);
                szVar.f28380b.setColor(d10);
                szVar.d = d11;
                szVar.e = d12;
                szVar.invalidate();
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
        k0 k0Var = new k0(this, context, 15);
        this.d = k0Var;
        this.fragmentView = k0Var;
        this.f38168c0 = new yf.b0(context, new po0(this, 0));
        hh.k kVar = new hh.k(this.d);
        k0 k0Var2 = this.d;
        ah.c cVar = this.f38174h0;
        cVar.f425f = kVar;
        cVar.f426g = k0Var2;
        this.h = new np0(this, context, 1);
        this.f38178n = new np0(this, context, 0);
        vo0 vo0Var = new vo0(this, context, this.resourceProvider);
        this.e = vo0Var;
        vo0Var.E = true;
        this.f38178n.j(false);
        this.f38178n.addView(this.e, 2, w7.y5.e(-1, -2, 55));
        ci.i1 i1Var = new ci.i1(this, context, 4);
        this.I = i1Var;
        i1Var.setAdapter(new wo0(this));
        k0Var.addView(this.I, w7.y5.e(-1, -1, 119));
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.o(true, true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final tp0 f37833b;

            {
                this.f37833b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                tp0 tp0Var = this.f37833b;
                switch (i12) {
                    case 0:
                        tp0Var.y0();
                        return;
                    case 1:
                        if (tp0Var.onBackPressed(true)) {
                            tp0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        tp0 tp0Var2 = this.f37833b;
                        FrameLayout frameLayout2 = (FrameLayout) tp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tp0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        tp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(tp0Var2, tp0Var2.getParentActivity(), canvas, (tp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tp0Var2.X = kcVar;
                        kcVar.setOnTouchListener(new bi.d(2));
                        tp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(tp0Var2, 2));
                        tp0Var2.Z.addListener(new xo0(tp0Var2, 0));
                        tp0Var2.Z.setDuration(400L);
                        tp0Var2.Z.setInterpolator(org.telegram.ui.Components.mt.e);
                        tp0Var2.Z.start();
                        frameLayout2.addView(tp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ro0(tp0Var2, 0));
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.y5.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        ch.d c10 = this.E.c(frameLayout2, null, false);
        c10.o(eh.b.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        w7.a6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.y5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ah.d dVar2 = new ah.d(this.G.c(this.P, null, false));
        dVar2.b(AndroidUtilities.dp(40.0f), true);
        dVar2.f441q = 220;
        this.P.setBackground(dVar2);
        np0 C0 = C0();
        ci.d dVar3 = this.Q;
        if (dVar3 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n7.z0 z0Var = C0.e;
            dVar3.g((CharSequence) z0Var.f15410b, false, true);
            this.Q.f((SpannableStringBuilder) z0Var.f15411c, false);
        }
        k0Var.addView(this.P, w7.y5.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        k0Var.addView(frameLayout4, w7.y5.e(-1, -2, 55));
        boolean z10 = this.f38163a;
        if (!z10) {
            org.telegram.ui.Components.sz szVar = new org.telegram.ui.Components.sz(context);
            this.M = szVar;
            if (z10) {
                i10 = R.string.ChannelColorTabProfile;
            } else {
                i10 = R.string.UserColorTabProfile;
            }
            String string = LocaleController.getString(i10);
            if (z10) {
                i11 = R.string.ChannelColorTabName;
            } else {
                i11 = R.string.UserColorTabName;
            }
            szVar.setTabs(string, LocaleController.getString(i11));
            this.M.f28384r = new qo0(this, 1);
            G0();
            this.L.addView(this.M, w7.y5.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.N = h5Var;
            h5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.y5.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        vo0 vo0Var2 = this.e;
        if (vo0Var2 != null) {
            vo0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.h6.f19374u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i12), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final tp0 f37833b;

            {
                this.f37833b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                tp0 tp0Var = this.f37833b;
                switch (i122) {
                    case 0:
                        tp0Var.y0();
                        return;
                    case 1:
                        if (tp0Var.onBackPressed(true)) {
                            tp0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        tp0 tp0Var2 = this.f37833b;
                        FrameLayout frameLayout22 = (FrameLayout) tp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        tp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(tp0Var2, tp0Var2.getParentActivity(), canvas, (tp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tp0Var2.X = kcVar;
                        kcVar.setOnTouchListener(new bi.d(2));
                        tp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(tp0Var2, 2));
                        tp0Var2.Z.addListener(new xo0(tp0Var2, 0));
                        tp0Var2.Z.setDuration(400L);
                        tp0Var2.Z.setInterpolator(org.telegram.ui.Components.mt.e);
                        tp0Var2.Z.start();
                        frameLayout22.addView(tp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ro0(tp0Var2, 0));
                        return;
                }
            }
        });
        w7.a6.a(this.J);
        this.L.addView(this.J, w7.y5.e(54, 54, 19));
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = jj0Var;
        jj0Var.h = true;
        if (!this.S) {
            jj0Var.P(0);
            this.T.M(0);
        } else {
            jj0Var.M(35);
            this.T.P(36);
        }
        this.T.Z = true;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J9, false);
        this.T.Q(w02, "Sunny");
        this.T.Q(w02, "Path 6");
        this.T.Q(w02, "Path");
        this.T.Q(w02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        this.K.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i12), 1, -1));
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final tp0 f37833b;

            {
                this.f37833b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                tp0 tp0Var = this.f37833b;
                switch (i122) {
                    case 0:
                        tp0Var.y0();
                        return;
                    case 1:
                        if (tp0Var.onBackPressed(true)) {
                            tp0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        tp0 tp0Var2 = this.f37833b;
                        FrameLayout frameLayout22 = (FrameLayout) tp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        tp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(tp0Var2, tp0Var2.getParentActivity(), canvas, (tp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tp0Var2.X = kcVar;
                        kcVar.setOnTouchListener(new bi.d(2));
                        tp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(tp0Var2, 2));
                        tp0Var2.Z.addListener(new xo0(tp0Var2, 0));
                        tp0Var2.Z.setDuration(400L);
                        tp0Var2.Z.setInterpolator(org.telegram.ui.Components.mt.e);
                        tp0Var2.Z.start();
                        frameLayout22.addView(tp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new ro0(tp0Var2, 0));
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.y5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        vo0 vo0Var3 = this.e;
        vo0Var3.getClass();
        vo0Var3.f40550a = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19003a7, vo0Var3.f40551b);
        vo0Var3.a();
        vo0Var3.invalidate();
        z0();
        this.d.addView(this.f38168c0);
        A0();
        View view = this.fragmentView;
        po0 po0Var = new po0(this, 1);
        WeakHashMap weakHashMap = r0.i0.f42127a;
        r0.a0.j(view, po0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f38178n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f38178n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f38178n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f19939c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.b6.a(new e(this, 27), org.telegram.ui.ActionBar.h6.f19059d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f19461z6, org.telegram.ui.ActionBar.h6.f19148i6, org.telegram.ui.ActionBar.h6.f19003a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f19279p7, org.telegram.ui.ActionBar.h6.f19095f6, org.telegram.ui.ActionBar.h6.f19113g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        vo0 vo0Var = this.e;
        if (vo0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(vo0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f38163a && ((this.h.b() || this.f38178n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f38163a;
        if (!z11 && ((this.h.b() || this.f38178n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f18661a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f18661a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new po0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new po0(this, 3));
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                showDialog(a2Var);
                ((TextView) a2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19298q7));
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
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starGiftsLoaded);
        setBulletinDelegate(new ci.a9(11));
        getMediaDataController().loadReplyIcons();
        if (MessagesController.getInstance(this.currentAccount).peerColors == null && BuildVars.DEBUG_PRIVATE_VERSION) {
            MessagesController.getInstance(this.currentAccount).loadAppConfig(true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starGiftsLoaded);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f38180s = d6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tp0.x0():void");
    }

    public final void y0() {
        zf.b bVar;
        if (this.f38179r) {
            return;
        }
        if (this.f38163a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) this, 23, true));
            return;
        }
        np0 C0 = C0();
        if (C0.I != null) {
            np0 np0Var = this.h;
            if (C0 == np0Var) {
                np0Var = this.f38178n;
            }
            np0Var.d();
            this.f38179r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
            qo0 qo0Var = new qo0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = zf.b.f49227b;
            } else {
                bVar = zf.b.f49226a;
            }
            yh.s5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new to0(this, bVar, tL_starGiftUnique, clientUserId, qo0Var));
            return;
        }
        np0 np0Var2 = this.h;
        if (C0 == np0Var2) {
            np0Var2 = this.f38178n;
        }
        if (np0Var2.I != null) {
            np0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f38183y.a(getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f35957w.invalidate();
        this.h.f35958x.invalidate();
        this.f38178n.f35957w.invalidate();
        this.h.f35937b.invalidate();
        this.f38178n.f35937b.invalidate();
        ((ch.d) this.O.getBackground()).v();
        A0();
        Iterator it = this.f38170e0.iterator();
        while (it.hasNext()) {
            ((ch.d) it.next()).v();
        }
    }
}
