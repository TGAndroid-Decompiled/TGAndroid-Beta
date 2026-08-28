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
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
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
public final class zo0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public ImageView A;
    public ImageView B;
    public FrameLayout C;
    public org.telegram.ui.Components.cz D;
    public org.telegram.ui.ActionBar.h5 E;
    public boolean F;
    public org.telegram.ui.Components.mi0 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public gc K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public final boolean f45192a;
    public final gh.n7 f45193b;
    public final gh.n7 f45194c;
    public m0 d;
    public fo0 f45195e;
    public uo0 f45196f;
    public uo0 h;
    public boolean f45197n;
    public org.telegram.ui.ActionBar.b6 f45198r;
    public final SparseIntArray f45199s;
    public final org.telegram.ui.ActionBar.d5 v;
    public final org.telegram.ui.ActionBar.d5 f45200w;
    public org.telegram.ui.ActionBar.o2 f45201x;
    public kh.j1 f45202y;

    public zo0() {
        super(null);
        this.f45199s = new SparseIntArray();
        boolean q10 = org.telegram.ui.ActionBar.f6.I.q();
        this.F = q10;
        this.N = q10;
        this.f45192a = false;
        gh.v7.y(this.currentAccount, false).V();
        gh.n7 n7Var = new gh.n7(this.currentAccount, 0L, false);
        this.f45193b = n7Var;
        n7Var.f(8, false);
        n7Var.a();
        gh.n7 n7Var2 = new gh.n7(this.currentAccount, 0L, false);
        this.f45194c = n7Var2;
        n7Var2.f(8, false);
        n7Var2.f8620f = true;
        n7Var2.a();
        this.resourceProvider = new g(this, 29);
        this.v = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f45200w = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
    }

    public static void T(zo0 zo0Var, gf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, eb0 eb0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        gh.m4 m4Var = new gh.m4(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        gh.o4 o4Var = new gh.o4(zo0Var.getParentActivity(), zo0Var.resourceProvider, tL_starGiftUnique, m4Var, zo0Var.currentAccount, j10, j3.r0.n(tL_starGiftUnique.num, ',', sb2), false, new gh.v2(zo0Var, zArr, tL_starGiftUnique, j10, eb0Var, 1));
        o4Var.h.setOnDismissListener(new bg.j(12, zArr, eb0Var));
        o4Var.b();
    }

    public static void U(zo0 zo0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, eb0 eb0Var, gh.m4 m4Var, ve.d dVar) {
        zArr[0] = true;
        dVar.d();
        gh.v7.x(zo0Var.currentAccount, m4Var.f8543a).h(m4Var.f8544b, tL_starGiftUnique, j10, null, true, new bg.y0(24, dVar, eb0Var));
    }

    public static int g0(zo0 zo0Var) {
        return zo0Var.currentAccount;
    }

    public static int t0(int i9) {
        boolean z10;
        float f10;
        if (AndroidUtilities.computePerceivedBrightness(i9) < 0.2f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = 0.28f;
        } else {
            f10 = -0.28f;
        }
        return org.telegram.ui.ActionBar.f6.b(0.5f, f10, i9);
    }

    public static boolean w0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        boolean z10;
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

    @Override
    public final View createView(Context context) {
        int i9;
        int i10;
        this.f45196f = new uo0(this, context, 1);
        this.h = new uo0(this, context, 0);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        m0 m0Var = new m0(this, context, 15);
        m0Var.setFitsSystemWindows(true);
        this.f45195e = new fo0(this, context, this.resourceProvider);
        this.h.i(false);
        m0Var.addView(this.f45195e, g7.e6.e(-1, -2, 55));
        kh.j1 j1Var = new kh.j1(this, context, 4);
        this.f45202y = j1Var;
        j1Var.setAdapter(new go0(this));
        m0Var.addView(this.f45202y, g7.e6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.C = frameLayout;
        m0Var.addView(frameLayout, g7.e6.e(-1, -2, 55));
        boolean z10 = this.f45192a;
        if (!z10) {
            org.telegram.ui.Components.cz czVar = new org.telegram.ui.Components.cz(context);
            this.D = czVar;
            if (z10) {
                i9 = R.string.ChannelColorTabProfile;
            } else {
                i9 = R.string.UserColorTabProfile;
            }
            String string = LocaleController.getString(i9);
            if (z10) {
                i10 = R.string.ChannelColorTabName;
            } else {
                i10 = R.string.UserColorTabName;
            }
            czVar.setTabs(string, LocaleController.getString(i10));
            org.telegram.ui.Components.cz czVar2 = this.D;
            czVar2.f27599f = new w3(this, 12);
            this.C.addView(czVar2, g7.e6.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.E = h5Var;
            h5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.E.setEllipsizeByGradient(true);
            this.E.setTextSize(20);
            this.E.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.A8));
            this.E.setTypeface(AndroidUtilities.bold());
            this.C.addView(this.E, g7.e6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        fo0 fo0Var = this.f45195e;
        if (fo0Var != null) {
            fo0Var.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.A = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.A;
        int i11 = org.telegram.ui.ActionBar.f6.f23305u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i11), 1, -1));
        this.A.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.A;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.A.setOnClickListener(new View.OnClickListener(this) {
            public final zo0 f37574b;

            {
                this.f37574b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        zo0 zo0Var = this.f37574b;
                        if (zo0Var.onBackPressed(true)) {
                            zo0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        zo0 zo0Var2 = this.f37574b;
                        FrameLayout frameLayout2 = (FrameLayout) zo0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        zo0Var2.B.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        zo0Var2.B.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        zo0Var2.B.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gc gcVar = new gc(zo0Var2, zo0Var2.getParentActivity(), canvas, (zo0Var2.B.getMeasuredWidth() / 2.0f) + f10, (zo0Var2.B.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        zo0Var2.K = gcVar;
                        gcVar.setOnTouchListener(new jh.d(2));
                        zo0Var2.L = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        zo0Var2.M = ofFloat;
                        ofFloat.addUpdateListener(new kh.fb(zo0Var2, 2));
                        zo0Var2.M.addListener(new bc0(zo0Var2, 5));
                        zo0Var2.M.setDuration(400L);
                        zo0Var2.M.setInterpolator(org.telegram.ui.Components.xs.f34754e);
                        zo0Var2.M.start();
                        frameLayout2.addView(zo0Var2.K, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new zk0(zo0Var2, 10));
                        return;
                }
            }
        });
        this.C.addView(this.A, g7.e6.e(54, 54, 19));
        int i12 = R.raw.sun;
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(i12, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.G = mi0Var;
        mi0Var.h = true;
        if (!this.F) {
            mi0Var.N(0);
            this.G.K(0);
        } else {
            mi0Var.K(35);
            this.G.N(36);
        }
        this.G.W = true;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J9, false);
        this.G.O(w02, "Sunny");
        this.G.O(w02, "Path 6");
        this.G.O(w02, "Path");
        this.G.O(w02, "Path 5");
        this.G.m();
        ImageView imageView4 = new ImageView(context);
        this.B = imageView4;
        imageView4.setScaleType(scaleType);
        this.B.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i11), 1, -1));
        this.B.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.B.setOnClickListener(new View.OnClickListener(this) {
            public final zo0 f37574b;

            {
                this.f37574b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        zo0 zo0Var = this.f37574b;
                        if (zo0Var.onBackPressed(true)) {
                            zo0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        zo0 zo0Var2 = this.f37574b;
                        FrameLayout frameLayout2 = (FrameLayout) zo0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        zo0Var2.B.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        zo0Var2.B.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        zo0Var2.B.getLocationInWindow(iArr);
                        float f10 = iArr[0];
                        float f11 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        gc gcVar = new gc(zo0Var2, zo0Var2.getParentActivity(), canvas, (zo0Var2.B.getMeasuredWidth() / 2.0f) + f10, (zo0Var2.B.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 1);
                        zo0Var2.K = gcVar;
                        gcVar.setOnTouchListener(new jh.d(2));
                        zo0Var2.L = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        zo0Var2.M = ofFloat;
                        ofFloat.addUpdateListener(new kh.fb(zo0Var2, 2));
                        zo0Var2.M.addListener(new bc0(zo0Var2, 5));
                        zo0Var2.M.setDuration(400L);
                        zo0Var2.M.setInterpolator(org.telegram.ui.Components.xs.f34754e);
                        zo0Var2.M.start();
                        frameLayout2.addView(zo0Var2.K, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new zk0(zo0Var2, 10));
                        return;
                }
            }
        });
        this.C.addView(this.B, g7.e6.e(54, 54, 21));
        this.B.setImageDrawable(this.G);
        fo0 fo0Var2 = this.f45195e;
        fo0Var2.getClass();
        fo0Var2.f39225a = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23269s8, fo0Var2.f39226b);
        fo0Var2.a();
        fo0Var2.invalidate();
        this.d = m0Var;
        this.fragmentView = m0Var;
        return m0Var;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.f45196f.f();
                this.h.f();
            } else if (i9 == NotificationCenter.starUserGiftsLoaded) {
                this.f45196f.e();
                this.h.e();
            } else if (i9 == NotificationCenter.starGiftsLoaded) {
                this.f45196f.e();
                this.h.e();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return g7.h6.a(new e(this, 27), org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.G6, org.telegram.ui.ActionBar.f6.f23386z6, org.telegram.ui.ActionBar.f6.f23092i6, org.telegram.ui.ActionBar.f6.f22947a7, org.telegram.ui.ActionBar.f6.B6, org.telegram.ui.ActionBar.f6.f23212p7, org.telegram.ui.ActionBar.f6.f23037f6, org.telegram.ui.ActionBar.f6.f23055g6, org.telegram.ui.ActionBar.f6.O6, org.telegram.ui.ActionBar.f6.P6, org.telegram.ui.ActionBar.f6.Q6, org.telegram.ui.ActionBar.f6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        fo0 fo0Var = this.f45195e;
        if (fo0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(fo0Var.getColor()) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.f45192a && ((this.f45196f.b() || this.h.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i9;
        int i10;
        boolean z11 = this.f45192a;
        if (!z11 && ((this.f45196f.b() || this.h.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i9 = R.string.ChannelColorUnsaved;
                } else {
                    i9 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f22702a.N = LocaleController.getString(i9);
                if (z11) {
                    i10 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i10 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f22702a.P = LocaleController.getString(i10);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.b2(this) {
                    public final zo0 f38002b;

                    {
                        this.f38002b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                        switch (r2) {
                            case 0:
                                this.f38002b.finishFragment();
                                return;
                            default:
                                this.f38002b.v0();
                                return;
                        }
                    }
                });
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
                    public final zo0 f38002b;

                    {
                        this.f38002b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                        switch (r2) {
                            case 0:
                                this.f38002b.finishFragment();
                                return;
                            default:
                                this.f38002b.v0();
                                return;
                        }
                    }
                });
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                showDialog(c2Var);
                ((TextView) c2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
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
        setBulletinDelegate(new bg.z(15));
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.f45198r = b6Var;
    }

    public final void u0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zo0.u0():void");
    }

    public final void v0() {
        uo0 uo0Var;
        uo0 uo0Var2;
        uo0 uo0Var3;
        gf.b bVar;
        if (this.f45197n) {
            return;
        }
        if (this.f45192a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) this, 23, true));
            return;
        }
        if (this.f45202y.getCurrentPosition() == 1) {
            uo0Var = this.f45196f;
        } else {
            uo0Var = this.h;
        }
        if (uo0Var.f43293y != null) {
            if (this.f45202y.getCurrentPosition() == 1) {
                uo0Var3 = this.h;
            } else {
                uo0Var3 = this.f45196f;
            }
            uo0Var3.d();
            this.f45197n = true;
            uo0Var.f43286f.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = uo0Var.f43293y;
            eb0 eb0Var = new eb0(6, this, uo0Var);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = gf.b.f7750b;
            } else {
                bVar = gf.b.f7749a;
            }
            gh.v7.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new fh.v5(this, bVar, tL_starGiftUnique, clientUserId, eb0Var));
            return;
        }
        if (this.f45202y.getCurrentPosition() == 1) {
            uo0Var2 = this.h;
        } else {
            uo0Var2 = this.f45196f;
        }
        if (uo0Var2.f43293y != null) {
            uo0Var2.d();
        }
        u0();
        finishFragment();
        x0();
    }

    public final void x0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zo0.x0():void");
    }

    public final void y0() {
        this.d.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.ActionBar.h5 h5Var = this.E;
        if (h5Var != null) {
            h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.A8));
        }
        this.f45196f.g();
        this.h.g();
        fo0 fo0Var = this.f45195e;
        if (fo0Var != null) {
            fo0Var.f39225a = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23269s8, fo0Var.f39226b);
            fo0Var.a();
            fo0Var.invalidate();
        }
        setNavigationBarColor(getNavigationBarColor());
    }
}
