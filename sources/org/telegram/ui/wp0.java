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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wp0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public final ah.c E;
    public final fh.c F;
    public final ah.c G;
    public org.telegram.ui.ActionBar.n2 H;
    public ci.i1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.tz M;
    public org.telegram.ui.ActionBar.i5 N;
    public FrameLayout O;
    public FrameLayout P;
    public ci.d Q;
    public qp0 R;
    public boolean S;
    public org.telegram.ui.Components.kj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public mc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f42646a;
    public boolean f42647a0;
    public final yh.l5 f42648b;
    public i0.b f42649b0;
    public final yh.l5 f42650c;
    public final pe.b f42651c0;
    public k0 d;
    public final pe.b f42652d0;
    public yo0 f42653e;
    public final int f42654f;
    public qp0 h;
    public qp0 f42655n;
    public boolean f42656r;
    public org.telegram.ui.ActionBar.d6 f42657s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.e5 f42658w;
    public final org.telegram.ui.ActionBar.e5 f42659x;
    public final fh.c f42660y;

    public wp0() {
        super(null);
        this.f42654f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
        this.S = q6;
        this.f42647a0 = q6;
        this.f42649b0 = i0.b.f11525e;
        pe.b bVar = new pe.b();
        this.f42651c0 = bVar;
        pe.b bVar2 = new pe.b();
        this.f42652d0 = bVar2;
        fh.c cVar = new fh.c();
        this.f42660y = cVar;
        ah.c cVar2 = new ah.c(cVar);
        this.E = cVar2;
        fh.c cVar3 = new fh.c();
        this.F = cVar3;
        ah.c cVar4 = new ah.c(cVar3);
        this.G = cVar4;
        cVar2.f458e = bVar;
        cVar2.d = bVar2;
        cVar4.f458e = bVar;
        cVar4.d = bVar2;
        this.f42646a = false;
        yh.u5.y(this.currentAccount, false).V();
        yh.l5 l5Var = new yh.l5(this.currentAccount, 0L, false);
        this.f42648b = l5Var;
        l5Var.f(8, false);
        l5Var.a();
        yh.l5 l5Var2 = new yh.l5(this.currentAccount, 0L, false);
        this.f42650c = l5Var2;
        l5Var2.f(8, false);
        l5Var2.f51585f = true;
        l5Var2.a();
        this.resourceProvider = new g(this, 29);
        this.f42658w = new org.telegram.ui.ActionBar.e5(0, false, false, this.resourceProvider);
        this.f42659x = new org.telegram.ui.ActionBar.e5(0, false, true, this.resourceProvider);
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

    public static void S(wp0 wp0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, to0 to0Var, yh.b3 b3Var, nf.e eVar) {
        zArr[0] = true;
        eVar.d();
        yh.u5.x(wp0Var.currentAccount, b3Var.f51144a).h(b3Var.f51145b, tL_starGiftUnique, j3, null, true, new ai.m0(18, eVar, to0Var));
    }

    public static void T(wp0 wp0Var, zf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, to0 to0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        yh.b3 b3Var = new yh.b3(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        yh.d3 d3Var = new yh.d3(wp0Var.getParentActivity(), wp0Var.resourceProvider, tL_starGiftUnique, b3Var, wp0Var.currentAccount, j3, org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2), false, new vo0(wp0Var, zArr, tL_starGiftUnique, j3, to0Var, 0));
        d3Var.h.setOnDismissListener(new ei.f0(10, zArr, to0Var));
        d3Var.b();
    }

    public static int f0(wp0 wp0Var) {
        return wp0Var.currentAccount;
    }

    public static org.telegram.ui.ActionBar.d6 g0(wp0 wp0Var) {
        return wp0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.c5 h0(wp0 wp0Var) {
        return wp0Var.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d6 i0(wp0 wp0Var) {
        return wp0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.d6 j0(wp0 wp0Var) {
        return wp0Var.resourceProvider;
    }

    public static org.telegram.ui.ActionBar.d6 k0(wp0 wp0Var) {
        return wp0Var.resourceProvider;
    }

    public static int u0(wp0 wp0Var) {
        return wp0Var.currentAccount;
    }

    public static int v0(wp0 wp0Var) {
        return wp0Var.currentAccount;
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
        return org.telegram.ui.ActionBar.i6.b(0.5f, f7, i10);
    }

    public final void A0() {
        int themedColor;
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6)) > 0.72d) {
            themedColor = i0.a.d(0.085f, getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7), this.f42653e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7);
        }
        this.d.setBackgroundColor(themedColor);
        fh.c cVar = this.F;
        if (cVar.f9858b != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f42652d0.iterator();
            while (it.hasNext()) {
                ((ch.d) it.next()).k();
            }
            Iterator it2 = this.f42651c0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final qp0 C0() {
        ci.i1 i1Var = this.I;
        if (i1Var != null && i1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f42655n;
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wp0.D0():void");
    }

    public final void E0() {
        org.telegram.ui.ActionBar.i5 i5Var = this.N;
        if (i5Var != null) {
            i5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.A8));
        }
        this.h.g();
        this.f42655n.g();
        yo0 yo0Var = this.f42653e;
        if (yo0Var != null) {
            yo0Var.f35516a = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20771a7, yo0Var.f35517b);
            yo0Var.a();
            yo0Var.invalidate();
        }
        F0();
        z0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void F0() {
        float positionAnimated;
        if (this.f42653e != null) {
            A0();
            int tabsViewBackgroundColor = this.f42653e.getTabsViewBackgroundColor();
            if (this.M != null) {
                ci.i1 i1Var = this.I;
                if (i1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = i1Var.getPositionAnimated();
                }
                float a2 = w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.tz tzVar = this.M;
                int d = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
                int d10 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7));
                int d11 = i0.a.d(a2, -1, getThemedColor(org.telegram.ui.ActionBar.i6.f21233z6));
                int d12 = i0.a.d(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                tzVar.f31258a.setColor(d);
                tzVar.f31259b.setColor(d10);
                tzVar.d = d11;
                tzVar.f31261e = d12;
                tzVar.invalidate();
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
        this.h = new qp0(this, context, 1);
        this.f42655n = new qp0(this, context, 0);
        yo0 yo0Var = new yo0(this, context, this.resourceProvider);
        this.f42653e = yo0Var;
        yo0Var.E = true;
        this.f42655n.j(false);
        this.f42655n.addView(this.f42653e, 2, w7.z5.e(-1, -2, 55));
        ci.i1 i1Var = new ci.i1(this, context, 4);
        this.I = i1Var;
        i1Var.setAdapter(new zo0(this));
        k0Var.addView(this.I, w7.z5.e(-1, -1, 119));
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.e();
        this.Q.d.o(true, true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final wp0 f42623b;

            {
                this.f42623b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                wp0 wp0Var = this.f42623b;
                switch (i12) {
                    case 0:
                        if (wp0Var.onBackPressed(true)) {
                            wp0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        wp0 wp0Var2 = this.f42623b;
                        FrameLayout frameLayout2 = (FrameLayout) wp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        wp0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        wp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        wp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(wp0Var2, wp0Var2.getParentActivity(), canvas, (wp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (wp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        wp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new bi.d(2));
                        wp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        wp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.tb(wp0Var2, 2));
                        wp0Var2.Z.addListener(new ap0(wp0Var2, 0));
                        wp0Var2.Z.setDuration(400L);
                        wp0Var2.Z.setInterpolator(org.telegram.ui.Components.nt.f29149e);
                        wp0Var2.Z.start();
                        frameLayout2.addView(wp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new nl0(wp0Var2, 10));
                        return;
                    default:
                        wp0Var.y0();
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        ch.d c10 = this.E.c(frameLayout2, null, false);
        c10.w(eh.b.j(this.resourceProvider));
        c10.y(AndroidUtilities.dp(28.0f));
        c10.x(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        w7.b6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, w7.z5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ah.e eVar = new ah.e(this.G.c(this.P, null, false));
        eVar.b(AndroidUtilities.dp(40.0f), true);
        eVar.f478q = 220;
        this.P.setBackground(eVar);
        qp0 C0 = C0();
        ci.d dVar2 = this.Q;
        if (dVar2 != null && C0 != null && C0 != this.R) {
            this.R = C0;
            n7.z0 z0Var = C0.f39836e;
            dVar2.g((CharSequence) z0Var.f16856b, false, true);
            this.Q.f((SpannableStringBuilder) z0Var.f16857c, false);
        }
        k0Var.addView(this.P, w7.z5.e(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        k0Var.addView(frameLayout4, w7.z5.e(-1, -2, 55));
        boolean z10 = this.f42646a;
        if (!z10) {
            org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context);
            this.M = tzVar;
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
            tzVar.setTabs(string, LocaleController.getString(i11));
            this.M.f31264r = new to0(this, 0);
            F0();
            this.L.addView(this.M, w7.z5.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
            this.N = i5Var;
            i5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            this.N.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.A8));
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, w7.z5.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        yo0 yo0Var2 = this.f42653e;
        if (yo0Var2 != null) {
            yo0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.i6.f21146u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i12), 1, -1));
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final wp0 f42623b;

            {
                this.f42623b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                wp0 wp0Var = this.f42623b;
                switch (i122) {
                    case 0:
                        if (wp0Var.onBackPressed(true)) {
                            wp0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        wp0 wp0Var2 = this.f42623b;
                        FrameLayout frameLayout22 = (FrameLayout) wp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        wp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        wp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        wp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(wp0Var2, wp0Var2.getParentActivity(), canvas, (wp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (wp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        wp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new bi.d(2));
                        wp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        wp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.tb(wp0Var2, 2));
                        wp0Var2.Z.addListener(new ap0(wp0Var2, 0));
                        wp0Var2.Z.setDuration(400L);
                        wp0Var2.Z.setInterpolator(org.telegram.ui.Components.nt.f29149e);
                        wp0Var2.Z.start();
                        frameLayout22.addView(wp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new nl0(wp0Var2, 10));
                        return;
                    default:
                        wp0Var.y0();
                        return;
                }
            }
        });
        w7.b6.a(this.J);
        this.L.addView(this.J, w7.z5.e(54, 54, 19));
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = kj0Var;
        kj0Var.h = true;
        if (!this.S) {
            kj0Var.P(0);
            this.T.M(0);
        } else {
            kj0Var.M(35);
            this.T.P(36);
        }
        this.T.Z = true;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J9, false);
        this.T.Q(w02, "Sunny");
        this.T.Q(w02, "Path 6");
        this.T.Q(w02, "Path");
        this.T.Q(w02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        this.K.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i12), 1, -1));
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final wp0 f42623b;

            {
                this.f42623b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                wp0 wp0Var = this.f42623b;
                switch (i122) {
                    case 0:
                        if (wp0Var.onBackPressed(true)) {
                            wp0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        wp0 wp0Var2 = this.f42623b;
                        FrameLayout frameLayout22 = (FrameLayout) wp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        wp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        wp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        wp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(wp0Var2, wp0Var2.getParentActivity(), canvas, (wp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (wp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        wp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new bi.d(2));
                        wp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        wp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new ci.tb(wp0Var2, 2));
                        wp0Var2.Z.addListener(new ap0(wp0Var2, 0));
                        wp0Var2.Z.setDuration(400L);
                        wp0Var2.Z.setInterpolator(org.telegram.ui.Components.nt.f29149e);
                        wp0Var2.Z.start();
                        frameLayout22.addView(wp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new nl0(wp0Var2, 10));
                        return;
                    default:
                        wp0Var.y0();
                        return;
                }
            }
        });
        this.L.addView(this.K, w7.z5.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        yo0 yo0Var3 = this.f42653e;
        yo0Var3.getClass();
        yo0Var3.f35516a = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20771a7, yo0Var3.f35517b);
        yo0Var3.a();
        yo0Var3.invalidate();
        z0();
        A0();
        View view = this.fragmentView;
        xo0 xo0Var = new xo0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f45610a;
        r0.a0.j(view, xo0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f42655n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f42655n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f42655n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f21740c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 27), org.telegram.ui.ActionBar.i6.f20827d6, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.f21233z6, org.telegram.ui.ActionBar.i6.f20918i6, org.telegram.ui.ActionBar.i6.f20771a7, org.telegram.ui.ActionBar.i6.B6, org.telegram.ui.ActionBar.i6.f21049p7, org.telegram.ui.ActionBar.i6.f20864f6, org.telegram.ui.ActionBar.i6.f20882g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        yo0 yo0Var = this.f42653e;
        if (yo0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(yo0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f42646a && ((this.h.b() || this.f42655n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f42646a;
        if (!z11 && ((this.h.b() || this.f42655n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f20377a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f20377a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new xo0(this, 1));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new xo0(this, 2));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                showDialog(b2Var);
                ((TextView) b2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21068q7));
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
        setBulletinDelegate(new ci.z8(11));
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
        this.f42657s = d6Var;
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wp0.x0():void");
    }

    public final void y0() {
        zf.b bVar;
        if (this.f42656r) {
            return;
        }
        if (this.f42646a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) this, 23, true));
            return;
        }
        qp0 C0 = C0();
        if (C0.I != null) {
            qp0 qp0Var = this.h;
            if (C0 == qp0Var) {
                qp0Var = this.f42655n;
            }
            qp0Var.d();
            this.f42656r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = C0.I;
            to0 to0Var = new to0(this, 1);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = zf.b.f53324b;
            } else {
                bVar = zf.b.f53323a;
            }
            yh.u5.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new uo0(this, bVar, tL_starGiftUnique, clientUserId, to0Var));
            return;
        }
        qp0 qp0Var2 = this.h;
        if (C0 == qp0Var2) {
            qp0Var2 = this.f42655n;
        }
        if (qp0Var2.I != null) {
            qp0Var2.d();
        }
        x0();
        finishFragment();
        D0();
    }

    public final void z0() {
        this.f42660y.a(getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f39852w.invalidate();
        this.h.f39853x.invalidate();
        this.f42655n.f39852w.invalidate();
        this.h.f39831b.invalidate();
        this.f42655n.f39831b.invalidate();
        ((ch.d) this.O.getBackground()).k();
        A0();
        Iterator it = this.f42652d0.iterator();
        while (it.hasNext()) {
            ((ch.d) it.next()).k();
        }
    }
}
