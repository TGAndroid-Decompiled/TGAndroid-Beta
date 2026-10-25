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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rp0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final ch.b E;
    public final hh.c F;
    public final ch.b G;
    public org.telegram.ui.ActionBar.r2 H;
    public fi.h1 I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.zz M;
    public org.telegram.ui.ActionBar.b6 N;
    public FrameLayout O;
    public FrameLayout P;
    public fi.d Q;
    public lp0 R;
    public boolean S;
    public org.telegram.ui.Components.xj0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public mc X;
    public float Y;
    public ValueAnimator Z;
    public final boolean f43222a;
    public boolean f43223a0;
    public final bi.t9 f43224b;
    public i0.b f43225b0;
    public final bi.t9 f43226c;
    public final se.b f43227c0;
    public k0 d;
    public final se.b f43228d0;
    public uo0 e;
    public final int f43229f;
    public lp0 h;
    public lp0 f43230n;
    public boolean f43231r;
    public org.telegram.ui.ActionBar.u6 f43232s;
    public final SparseIntArray v;
    public final org.telegram.ui.ActionBar.l5 f43233w;
    public final org.telegram.ui.ActionBar.l5 f43234x;
    public final hh.c f43235y;

    public rp0() {
        super(null);
        this.f43229f = AndroidUtilities.dp(6.0f);
        this.v = new SparseIntArray();
        boolean q5 = org.telegram.ui.ActionBar.y6.I.q();
        this.S = q5;
        this.f43223a0 = q5;
        this.f43225b0 = i0.b.e;
        se.b bVar = new se.b();
        this.f43227c0 = bVar;
        se.b bVar2 = new se.b();
        this.f43228d0 = bVar2;
        hh.c cVar = new hh.c();
        this.f43235y = cVar;
        ch.b bVar3 = new ch.b(cVar);
        this.E = bVar3;
        hh.c cVar2 = new hh.c();
        this.F = cVar2;
        ch.b bVar4 = new ch.b(cVar2);
        this.G = bVar4;
        bVar3.e = bVar;
        bVar3.d = bVar2;
        bVar4.e = bVar;
        bVar4.d = bVar2;
        this.f43222a = false;
        bi.ca.y(this.currentAccount, false).V();
        bi.t9 t9Var = new bi.t9(this.currentAccount, 0L, false);
        this.f43224b = t9Var;
        t9Var.g(8, false);
        t9Var.b();
        bi.t9 t9Var2 = new bi.t9(this.currentAccount, 0L, false);
        this.f43226c = t9Var2;
        t9Var2.g(8, false);
        t9Var2.f5466f = true;
        t9Var2.b();
        this.resourceProvider = new xj(this, 1);
        this.f43233w = new org.telegram.ui.ActionBar.l5(0, false, false, this.resourceProvider);
        this.f43234x = new org.telegram.ui.ActionBar.l5(0, false, true, this.resourceProvider);
    }

    public static boolean C0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
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

    public static void V(rp0 rp0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, qo0 qo0Var, bi.d6 d6Var, qf.c cVar) {
        zArr[0] = true;
        cVar.d();
        bi.ca.x(rp0Var.currentAccount, d6Var.f4492a).h(d6Var.f4493b, tL_starGiftUnique, j10, null, true, new bi.m5(21, cVar, qo0Var));
    }

    public static void W(rp0 rp0Var, bg.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, qo0 qo0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        bi.d6 d6Var = new bi.d6(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        bi.g6 g6Var = new bi.g6(rp0Var.getParentActivity(), rp0Var.resourceProvider, tL_starGiftUnique, d6Var, rp0Var.currentAccount, j10, org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2), false, new bi.w3(rp0Var, zArr, tL_starGiftUnique, j10, qo0Var, 1));
        g6Var.h.setOnDismissListener(new bi.u3(12, zArr, qo0Var));
        g6Var.b();
    }

    public static int x0(int i10) {
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
        return org.telegram.ui.ActionBar.y6.b(0.5f, f7, i10);
    }

    public final void A0() {
        this.f43235y.a(getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.f41333w.invalidate();
        this.h.f41334x.invalidate();
        this.f43230n.f41333w.invalidate();
        this.h.f41313b.invalidate();
        this.f43230n.f41313b.invalidate();
        ((eh.d) this.O.getBackground()).updateColors();
        B0();
        Iterator it = this.f43228d0.iterator();
        while (it.hasNext()) {
            ((eh.d) it.next()).updateColors();
        }
    }

    public final void B0() {
        int themedColor;
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6)) > 0.72d) {
            themedColor = i0.a.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7), this.e.getColor());
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7);
        }
        this.d.setBackgroundColor(themedColor);
        hh.c cVar = this.F;
        if (cVar.f12837b != themedColor) {
            cVar.a(themedColor);
            Iterator it = this.f43228d0.iterator();
            while (it.hasNext()) {
                ((eh.d) it.next()).updateColors();
            }
            Iterator it2 = this.f43227c0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final lp0 D0() {
        fi.h1 h1Var = this.I;
        if (h1Var != null && h1Var.getPositionAnimated() >= 0.5f) {
            return this.h;
        }
        return this.f43230n;
    }

    public final void E0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rp0.E0():void");
    }

    public final void F0() {
        org.telegram.ui.ActionBar.b6 b6Var = this.N;
        if (b6Var != null) {
            b6Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.A8));
        }
        this.h.g();
        this.f43230n.g();
        uo0 uo0Var = this.e;
        if (uo0Var != null) {
            uo0Var.f45816a = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23297a7, uo0Var.f45817b);
            uo0Var.a();
            uo0Var.invalidate();
        }
        G0();
        A0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void G0() {
        float positionAnimated;
        if (this.e != null) {
            B0();
            int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
            if (this.M != null) {
                fi.h1 h1Var = this.I;
                if (h1Var == null) {
                    positionAnimated = 0.0f;
                } else {
                    positionAnimated = h1Var.getPositionAnimated();
                }
                float a2 = a8.ee.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f);
                org.telegram.ui.Components.zz zzVar = this.M;
                int f7 = i0.a.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6));
                int f10 = i0.a.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7));
                int f11 = i0.a.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.y6.f23765z6));
                int f12 = i0.a.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.y6.G6));
                zzVar.f35435a.setColor(f7);
                zzVar.f35436b.setColor(f10);
                zzVar.d = f11;
                zzVar.e = f12;
                zzVar.invalidate();
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
        k0 k0Var = new k0(this, context, 16);
        this.d = k0Var;
        this.fragmentView = k0Var;
        this.h = new lp0(this, context, 1);
        this.f43230n = new lp0(this, context, 0);
        uo0 uo0Var = new uo0(this, context, this.resourceProvider);
        this.e = uo0Var;
        uo0Var.E = true;
        this.f43230n.j(false);
        this.f43230n.addView(this.e, 2, org.telegram.ui.Components.gb1.i(-1, -2, 55));
        fi.h1 h1Var = new fi.h1(this, context, 5);
        this.I = h1Var;
        h1Var.setAdapter(new vo0(this, 0));
        k0Var.addView(this.I, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.f();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final rp0 f43565b;

            {
                this.f43565b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                rp0 rp0Var = this.f43565b;
                switch (i12) {
                    case 0:
                        if (rp0Var.onBackPressed(true)) {
                            rp0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        rp0 rp0Var2 = this.f43565b;
                        FrameLayout frameLayout2 = (FrameLayout) rp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rp0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        rp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        rp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(rp0Var2, rp0Var2.getParentActivity(), canvas, (rp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (rp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        rp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new ei.d(2));
                        rp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        rp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.bb(rp0Var2, 2));
                        rp0Var2.Z.addListener(new i50(rp0Var2, 8));
                        rp0Var2.Z.setDuration(400L);
                        rp0Var2.Z.setInterpolator(org.telegram.ui.Components.ut.e);
                        rp0Var2.Z.start();
                        frameLayout2.addView(rp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new lj0(rp0Var2, 12));
                        return;
                    default:
                        rp0Var.z0();
                        return;
                }
            }
        });
        this.O.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.O.addView(this.Q, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        FrameLayout frameLayout2 = this.O;
        eh.d c10 = this.E.c(frameLayout2, null, false);
        c10.v(gh.c.j(this.resourceProvider));
        c10.x(AndroidUtilities.dp(28.0f));
        c10.w(AndroidUtilities.dp(5.0f));
        frameLayout2.setBackground(c10);
        org.telegram.ui.Components.gb1.c(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.P = frameLayout3;
        frameLayout3.addView(this.O, org.telegram.ui.Components.gb1.h(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ch.c cVar = new ch.c(this.G.c(this.P, null, false));
        cVar.b(AndroidUtilities.dp(40.0f), true);
        cVar.G = 220;
        this.P.setBackground(cVar);
        lp0 D0 = D0();
        fi.d dVar2 = this.Q;
        if (dVar2 != null && D0 != null && D0 != this.R) {
            this.R = D0;
            m4.c cVar2 = D0.e;
            dVar2.i((CharSequence) cVar2.f18009b, false, true);
            this.Q.g((SpannableStringBuilder) cVar2.f18010c, false);
        }
        k0Var.addView(this.P, org.telegram.ui.Components.gb1.i(-1, -2, 80));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.L = frameLayout4;
        k0Var.addView(frameLayout4, org.telegram.ui.Components.gb1.i(-1, -2, 55));
        boolean z10 = this.f43222a;
        if (!z10) {
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context);
            this.M = zzVar;
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
            zzVar.setTabs(string, LocaleController.getString(i11));
            this.M.f35440r = new qo0(this, 0);
            G0();
            this.L.addView(this.M, org.telegram.ui.Components.gb1.i(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
            this.N = b6Var;
            b6Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            org.telegram.ui.ActionBar.f7.Y(this.N, org.telegram.ui.ActionBar.y6.A8, getResourceProvider());
            this.N.setTypeface(AndroidUtilities.bold());
            this.L.addView(this.N, org.telegram.ui.Components.gb1.h(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        uo0 uo0Var2 = this.e;
        if (uo0Var2 != null) {
            uo0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i12 = org.telegram.ui.ActionBar.y6.f23673u8;
        org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i12), getResourceProvider());
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) {
            public final rp0 f43565b;

            {
                this.f43565b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                rp0 rp0Var = this.f43565b;
                switch (i122) {
                    case 0:
                        if (rp0Var.onBackPressed(true)) {
                            rp0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        rp0 rp0Var2 = this.f43565b;
                        FrameLayout frameLayout22 = (FrameLayout) rp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        rp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        rp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(rp0Var2, rp0Var2.getParentActivity(), canvas, (rp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (rp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        rp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new ei.d(2));
                        rp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        rp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.bb(rp0Var2, 2));
                        rp0Var2.Z.addListener(new i50(rp0Var2, 8));
                        rp0Var2.Z.setDuration(400L);
                        rp0Var2.Z.setInterpolator(org.telegram.ui.Components.ut.e);
                        rp0Var2.Z.start();
                        frameLayout22.addView(rp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new lj0(rp0Var2, 12));
                        return;
                    default:
                        rp0Var.z0();
                        return;
                }
            }
        });
        org.telegram.ui.Components.gb1.b(this.J);
        this.L.addView(this.J, org.telegram.ui.Components.gb1.i(54, 54, 19));
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.T = xj0Var;
        xj0Var.h = true;
        if (!this.S) {
            xj0Var.P(0);
            this.T.M(0);
        } else {
            xj0Var.M(35);
            this.T.P(36);
        }
        this.T.Z = true;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J9, false);
        this.T.Q(x02, "Sunny");
        this.T.Q(x02, "Path 6");
        this.T.Q(x02, "Path");
        this.T.Q(x02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.f7.R(this.K, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i12), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i12), getResourceProvider());
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final rp0 f43565b;

            {
                this.f43565b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                rp0 rp0Var = this.f43565b;
                switch (i122) {
                    case 0:
                        if (rp0Var.onBackPressed(true)) {
                            rp0Var.finishFragment();
                            return;
                        }
                        return;
                    case 1:
                        rp0 rp0Var2 = this.f43565b;
                        FrameLayout frameLayout22 = (FrameLayout) rp0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        rp0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        rp0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        rp0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        mc mcVar = new mc(rp0Var2, rp0Var2.getParentActivity(), canvas, (rp0Var2.K.getMeasuredWidth() / 2.0f) + f7, (rp0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        rp0Var2.X = mcVar;
                        mcVar.setOnTouchListener(new ei.d(2));
                        rp0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        rp0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new fi.bb(rp0Var2, 2));
                        rp0Var2.Z.addListener(new i50(rp0Var2, 8));
                        rp0Var2.Z.setDuration(400L);
                        rp0Var2.Z.setInterpolator(org.telegram.ui.Components.ut.e);
                        rp0Var2.Z.start();
                        frameLayout22.addView(rp0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new lj0(rp0Var2, 12));
                        return;
                    default:
                        rp0Var.z0();
                        return;
                }
            }
        });
        this.L.addView(this.K, org.telegram.ui.Components.gb1.i(54, 54, 21));
        this.K.setImageDrawable(this.T);
        uo0 uo0Var3 = this.e;
        uo0Var3.getClass();
        uo0Var3.f45816a = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23297a7, uo0Var3.f45817b);
        uo0Var3.a();
        uo0Var3.invalidate();
        A0();
        B0();
        View view = this.fragmentView;
        to0 to0Var = new to0(this, 0);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.a0.i(view, to0Var);
        return this.d;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.h.f(true);
                this.f43230n.f(true);
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.h.e();
                this.f43230n.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.h.e();
                this.f43230n.e();
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final org.telegram.ui.ActionBar.e4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.e4.f22602c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return org.telegram.ui.Components.gb1.C(new j6(16, this), org.telegram.ui.ActionBar.y6.f23354d6, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.f23765z6, org.telegram.ui.ActionBar.y6.f23446i6, org.telegram.ui.ActionBar.y6.f23297a7, org.telegram.ui.ActionBar.y6.B6, org.telegram.ui.ActionBar.y6.f23579p7, org.telegram.ui.ActionBar.y6.f23391f6, org.telegram.ui.ActionBar.y6.f23410g6, org.telegram.ui.ActionBar.y6.O6, org.telegram.ui.ActionBar.y6.P6, org.telegram.ui.ActionBar.y6.Q6, org.telegram.ui.ActionBar.y6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        uo0 uo0Var = this.e;
        if (uo0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.h(uo0Var.getColor()) > 0.699999988079071d) {
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
        if (!this.f43222a && ((this.h.b() || this.f43230n.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f43222a;
        if (!z11 && ((this.h.b() || this.f43230n.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f22366a.R = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f22366a.T = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new to0(this, 1));
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new to0(this, 2));
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                showDialog(e2Var);
                org.telegram.ui.ActionBar.f7.V((TextView) e2Var.d(-2), org.telegram.ui.ActionBar.y6.f23596q7, getResourceProvider());
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
        setBulletinDelegate(new fi.k8(10));
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
    public final void onThemeColorsChanged() {
        try {
            if (this.h != null && this.f43230n != null) {
                F0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.u6 u6Var) {
        this.f43232s = u6Var;
    }

    public final void y0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rp0.y0():void");
    }

    public final void z0() {
        bg.b bVar;
        if (this.f43231r) {
            return;
        }
        if (this.f43222a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) this, 23, true));
            return;
        }
        lp0 D0 = D0();
        if (D0.I != null) {
            lp0 lp0Var = this.h;
            if (D0 == lp0Var) {
                lp0Var = this.f43230n;
            }
            lp0Var.d();
            this.f43231r = true;
            this.Q.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = D0.I;
            qo0 qo0Var = new qo0(this, 1);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = bg.b.f3981b;
            } else {
                bVar = bg.b.f3980a;
            }
            bi.ca.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new ro0(this, bVar, tL_starGiftUnique, clientUserId, qo0Var));
            return;
        }
        lp0 lp0Var2 = this.h;
        if (D0 == lp0Var2) {
            lp0Var2 = this.f43230n;
        }
        if (lp0Var2.I != null) {
            lp0Var2.d();
        }
        y0();
        finishFragment();
        E0();
    }
}
