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
public final class up0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final ah.c E;
    public final fh.c F;
    public final ah.c G;
    public org.telegram.ui.ActionBar.n2 H;
    public ci.i1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.rz M;
    public org.telegram.ui.ActionBar.i5 N;
    public FrameLayout O;
    public FrameLayout P;
    public ci.d Q;
    public op0 R;
    public boolean S;
    public org.telegram.ui.Components.yi0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public kc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f38143a;
    public boolean f38144a0;
    public final yh.l5 f38145b;
    public i0.b f38146b0;
    public final yh.l5 f38147c;
    public yf.b0 f38148c0;
    public k0 d;
    public final pe.b f38149d0;
    public xo0 e;
    public final pe.b f38150e0;
    public final int f38151f;
    public final ah.h f38152f0;
    public final fh.d f38153g0;
    public op0 h;
    public final ah.c f38154h0;
    public final va f38155i0;
    public final ArrayList f38156j0;
    public final ArrayList f38157k0;
    public op0 f38158n;
    public boolean f38159r;
    public org.telegram.ui.ActionBar.d6 f38160s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.e5 f38161w;
    public final org.telegram.ui.ActionBar.e5 f38162x;
    public final fh.c f38163y;

    public up0() {
        super(null);
        this.f38151f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
        this.S = q6;
        this.f38144a0 = q6;
        this.f38146b0 = i0.b.e;
        pe.b bVar = new pe.b(true);
        this.f38149d0 = bVar;
        pe.b bVar2 = new pe.b(true);
        this.f38150e0 = bVar2;
        this.f38155i0 = new va(this, 1);
        this.f38156j0 = new ArrayList();
        this.f38157k0 = new ArrayList();
        fh.c cVar = new fh.c();
        this.f38163y = cVar;
        ah.c cVar2 = new ah.c(cVar);
        this.E = cVar2;
        fh.c cVar3 = new fh.c();
        this.F = cVar3;
        ah.c cVar4 = new ah.c(cVar3);
        this.G = cVar4;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.h hVar = new ah.h(false);
            this.f38152f0 = hVar;
            fh.d dVar = new fh.d(cVar);
            this.f38153g0 = dVar;
            dVar.v = new to0(this, 1);
            dVar.d = hVar;
            dVar.e = -2;
            dVar.f9060f = cVar;
            ah.c cVar5 = new ah.c(dVar);
            this.f38154h0 = cVar5;
            cVar5.f427i = LiteMode.isEnabled(262144);
        } else {
            this.f38152f0 = null;
            this.f38153g0 = null;
            this.f38154h0 = new ah.c(cVar);
        }
        cVar2.e = bVar;
        cVar2.d = bVar2;
        cVar4.e = bVar;
        cVar4.d = bVar2;
        ah.c cVar6 = this.f38154h0;
        cVar6.e = bVar;
        cVar6.d = bVar2;
        this.f38143a = false;
        yh.t5.y(this.currentAccount, false).V();
        yh.l5 l5Var = new yh.l5(this.currentAccount, 0L, false);
        this.f38145b = l5Var;
        l5Var.f(8, false);
        l5Var.a();
        yh.l5 l5Var2 = new yh.l5(this.currentAccount, 0L, false);
        this.f38147c = l5Var2;
        l5Var2.f(8, false);
        l5Var2.f47332f = true;
        l5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.f38161w = new org.telegram.ui.ActionBar.e5(0, false, false, this.resourceProvider);
        this.f38162x = new org.telegram.ui.ActionBar.e5(0, false, true, this.resourceProvider);
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

    public static void U(up0 up0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, so0 so0Var, yh.b3 b3Var, nf.e eVar) {
        zArr[0] = true;
        eVar.d();
        yh.t5.x(up0Var.currentAccount, b3Var.f46918a).h(b3Var.f46919b, tL_starGiftUnique, j3, null, true, new ai.m0(18, eVar, so0Var));
    }

    public static void V(up0 up0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, so0 so0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.b3 b3Var = new yh.b3(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        yh.d3 d3Var = new yh.d3(up0Var.getParentActivity(), up0Var.resourceProvider, tL_starGiftUnique, b3Var, up0Var.currentAccount, j3, hg.c.k(tL_starGiftUnique.num, ',', sb2), false, new wo0(up0Var, zArr, tL_starGiftUnique, j3, so0Var, 0));
        d3Var.h.setOnDismissListener(new ei.e0(10, zArr, so0Var));
        d3Var.b();
    }

    public static int f0(up0 up0Var) {
        return up0Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.d6 g0(up0 up0Var) {
        return up0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.c5 h0(up0 up0Var) {
        return up0Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d6 i0(up0 up0Var) {
        return up0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.d6 j0(up0 up0Var) {
        return up0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.d6 k0(up0 up0Var) {
        return up0Var.resourceProvider;
    }

    public static int u0(up0 up0Var) {
        return up0Var.currentAccount;
    }

    public static int v0(up0 up0Var) {
        return up0Var.currentAccount;
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
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6)) > 0.72d) {
            themedColor = i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.h6.f18733a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f18733a7);
        }
        this.d.setBackgroundColor(themedColor);
        fh.c cVar = this.F;
        if (cVar.f9056a.getColor() != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f38150e0.iterator();
            while (it.hasNext()) {
                ((ch.d) it.next()).v();
            }
            Iterator it2 = this.f38149d0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final op0 C0() {
        ci.i1 i1Var = this.I;
        if (i1Var != null && i1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f38158n;
    }

    public final void D0(int i10) {
        if (Build.VERSION.SDK_INT >= 31 && this.f38152f0 != null) {
            yf.b0 b0Var = this.f38148c0;
            if (b0Var.f46735c == 0) {
                b0Var.invalidate();
            }
            b0Var.f46735c = i10 | b0Var.f46735c;
        }
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.up0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.i5 i5Var = this.N;
        if (i5Var != null) {
            i5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.A8));
        }
        this.h.g();
        this.f38158n.g();
        xo0 xo0Var = this.e;
        if (xo0Var != null) {
            xo0Var.f31848a = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18733a7, xo0Var.f31849b);
            xo0Var.a();
            xo0Var.invalidate();
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
                float a2 = w7.p.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.rz rzVar = this.M;
                int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.f18733a7));
                int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.h6.f19189z6));
                int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                rzVar.f27747a.setColor(d);
                rzVar.f27748b.setColor(d10);
                rzVar.d = d11;
                rzVar.e = d12;
                rzVar.invalidate();
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
        this.f38148c0 = new yf.b0(context, new ro0(this, 0));
        hh.k kVar = new hh.k(this.d);
        k0 k0Var2 = this.d;
        ah.c cVar = this.f38154h0;
        cVar.f425f = kVar;
        cVar.f426g = k0Var2;
        this.h = new op0(this, context, 1);
        this.f38158n = new op0(this, context, 0);
        xo0 xo0Var = new xo0(this, context, this.resourceProvider);
        this.e = xo0Var;
        xo0Var.E = true;
        this.f38158n.j(false);
        this.f38158n.addView(this.e, 2, w7.x5.e(-1, -2, 55));
        ci.i1 i1Var = new ci.i1(this, context, 4);
        this.I = i1Var;
        i1Var.setAdapter(new yo0(this));
        k0Var.addView(this.I, w7.x5.e(-1, -1, 119));
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.o(true, true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final up0 f38140b;

            {
                this.f38140b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                up0 up0Var = this.f38140b;
                switch (i12) {
                    case 0:
                        up0Var.y0();
                        return;
                    case 1:
                        if (up0Var.onBackPressed(true)) {
                            up0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        up0 up0Var2 = this.f38140b;
                        FrameLayout frameLayout2 = (FrameLayout) up0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        up0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        up0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        up0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(up0Var2, up0Var2.getParentActivity(), canvas, (up0Var2.K.getMeasuredWidth() / 2.0f) + f7, (up0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        up0Var2.X = kcVar;
                        kcVar.setOnTouchListener(new bi.d(2));
                        up0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        up0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(up0Var2, 2));
                        up0Var2.Z.addListener(new org.telegram.ui.Components.u81(up0Var2, 29));
                        up0Var2.Z.setDuration(400L);
                        up0Var2.Z.setInterpolator(org.telegram.ui.Components.lt.e);
                        up0Var2.Z.start();
                        frameLayout2.addView(up0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new to0(up0Var2, 0));
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        ch.d c10 = this.E.c(frameLayout2, null, false);
        c10.o(eh.b.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        w7.z5.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.x5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ah.d dVar2 = new ah.d(this.G.c(this.P, null, false));
        dVar2.b(AndroidUtilities.dp(40.0f), true);
        dVar2.f441q = 220;
        this.P.setBackground(dVar2);
        op0 C0 = C0();
        ci.d dVar3 = this.Q;
        if (dVar3 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n7.a1 a1Var = C0.e;
            dVar3.g((CharSequence) a1Var.f15083b, false, true);
            this.Q.f((SpannableStringBuilder) a1Var.f15084c, false);
        }
        k0Var.addView(this.P, w7.x5.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        k0Var.addView(frameLayout4, w7.x5.e(-1, -2, 55));
        boolean z10 = this.f38143a;
        if (!z10) {
            org.telegram.ui.Components.rz rzVar = new org.telegram.ui.Components.rz(context);
            this.M = rzVar;
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
            rzVar.setTabs(string, LocaleController.getString(i11));
            this.M.f27752r = new so0(this, 1);
            G0();
            this.L.addView(this.M, w7.x5.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
            this.N = i5Var;
            i5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.x5.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        xo0 xo0Var2 = this.e;
        if (xo0Var2 != null) {
            xo0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.h6.f19102u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(getThemedColor(i12), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final up0 f38140b;

            {
                this.f38140b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                up0 up0Var = this.f38140b;
                switch (i122) {
                    case 0:
                        up0Var.y0();
                        return;
                    case 1:
                        if (up0Var.onBackPressed(true)) {
                            up0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        up0 up0Var2 = this.f38140b;
                        FrameLayout frameLayout22 = (FrameLayout) up0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        up0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        up0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        up0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(up0Var2, up0Var2.getParentActivity(), canvas, (up0Var2.K.getMeasuredWidth() / 2.0f) + f7, (up0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        up0Var2.X = kcVar;
                        kcVar.setOnTouchListener(new bi.d(2));
                        up0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        up0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(up0Var2, 2));
                        up0Var2.Z.addListener(new org.telegram.ui.Components.u81(up0Var2, 29));
                        up0Var2.Z.setDuration(400L);
                        up0Var2.Z.setInterpolator(org.telegram.ui.Components.lt.e);
                        up0Var2.Z.start();
                        frameLayout22.addView(up0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new to0(up0Var2, 0));
                        return;
                }
            }
        });
        w7.z5.a(this.J);
        this.L.addView(this.J, w7.x5.e(54, 54, 19));
        org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = yi0Var;
        yi0Var.h = true;
        if (!this.S) {
            yi0Var.P(0);
            this.T.M(0);
        } else {
            yi0Var.M(35);
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
            public final up0 f38140b;

            {
                this.f38140b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                up0 up0Var = this.f38140b;
                switch (i122) {
                    case 0:
                        up0Var.y0();
                        return;
                    case 1:
                        if (up0Var.onBackPressed(true)) {
                            up0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        up0 up0Var2 = this.f38140b;
                        FrameLayout frameLayout22 = (FrameLayout) up0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        up0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        up0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        up0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        kc kcVar = new kc(up0Var2, up0Var2.getParentActivity(), canvas, (up0Var2.K.getMeasuredWidth() / 2.0f) + f7, (up0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        up0Var2.X = kcVar;
                        kcVar.setOnTouchListener(new bi.d(2));
                        up0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        up0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.ub(up0Var2, 2));
                        up0Var2.Z.addListener(new org.telegram.ui.Components.u81(up0Var2, 29));
                        up0Var2.Z.setDuration(400L);
                        up0Var2.Z.setInterpolator(org.telegram.ui.Components.lt.e);
                        up0Var2.Z.start();
                        frameLayout22.addView(up0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new to0(up0Var2, 0));
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.x5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        xo0 xo0Var3 = this.e;
        xo0Var3.getClass();
        xo0Var3.f31848a = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18733a7, xo0Var3.f31849b);
        xo0Var3.a();
        xo0Var3.invalidate();
        z0();
        this.d.addView(this.f38148c0);
        A0();
        View view = this.fragmentView;
        ro0 ro0Var = new ro0(this, 1);
        WeakHashMap weakHashMap = r0.i0.f41795a;
        r0.a0.j(view, ro0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f38158n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f38158n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f38158n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f19712c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new e(this, 27), org.telegram.ui.ActionBar.h6.f18789d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f19189z6, org.telegram.ui.ActionBar.h6.f18878i6, org.telegram.ui.ActionBar.h6.f18733a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f19008p7, org.telegram.ui.ActionBar.h6.f18825f6, org.telegram.ui.ActionBar.h6.f18843g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        xo0 xo0Var = this.e;
        if (xo0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(xo0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f38143a && ((this.h.b() || this.f38158n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f38143a;
        if (!z11 && ((this.h.b() || this.f38158n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f18409a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f18409a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new ro0(this, 2));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new ro0(this, 3));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                showDialog(b2Var);
                ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19026q7));
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
        this.f38160s = d6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.up0.x0():void");
    }

    public final void y0() {
        zf.b bVar;
        if (this.f38159r) {
            return;
        }
        if (this.f38143a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) this, 23, true));
            return;
        }
        op0 C0 = C0();
        if (C0.I != null) {
            op0 op0Var = this.h;
            if (C0 == op0Var) {
                op0Var = this.f38158n;
            }
            op0Var.d();
            this.f38159r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
            so0 so0Var = new so0(this, 0);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = zf.b.f48899b;
            } else {
                bVar = zf.b.f48898a;
            }
            yh.t5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new vo0(this, bVar, tL_starGiftUnique, clientUserId, so0Var));
            return;
        }
        op0 op0Var2 = this.h;
        if (C0 == op0Var2) {
            op0Var2 = this.f38158n;
        }
        if (op0Var2.I != null) {
            op0Var2.d();
        }
        x0();
        finishFragment();
        E0();
    }

    public final void z0() {
        this.f38163y.a(getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f35941w.invalidate();
        this.h.f35942x.invalidate();
        this.f38158n.f35941w.invalidate();
        this.h.f35921b.invalidate();
        this.f38158n.f35921b.invalidate();
        ((ch.d) this.O.getBackground()).v();
        A0();
        Iterator it = this.f38150e0.iterator();
        while (it.hasNext()) {
            ((ch.d) it.next()).v();
        }
    }
}
