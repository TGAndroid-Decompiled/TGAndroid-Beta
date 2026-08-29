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
public final class yo0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public ImageView A;
    public ImageView B;
    public FrameLayout C;
    public org.telegram.ui.Components.lz D;
    public org.telegram.ui.ActionBar.h5 E;
    public boolean F;
    public org.telegram.ui.Components.xi0 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public fc K;
    public float L;
    public ValueAnimator M;
    public boolean N;
    public final boolean f44941a;
    public final jh.k7 f44942b;
    public final jh.k7 f44943c;
    public n0 d;
    public eo0 f44944e;
    public to0 f44945f;
    public to0 h;
    public boolean f44946n;
    public org.telegram.ui.ActionBar.c6 f44947r;
    public final SparseIntArray f44948s;
    public final org.telegram.ui.ActionBar.d5 v;
    public final org.telegram.ui.ActionBar.d5 f44949w;
    public org.telegram.ui.ActionBar.o2 f44950x;
    public nh.g1 f44951y;

    public yo0() {
        super(null);
        this.f44948s = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
        this.F = q6;
        this.N = q6;
        this.f44941a = false;
        jh.s7.y(this.currentAccount, false).V();
        jh.k7 k7Var = new jh.k7(this.currentAccount, 0L, false);
        this.f44942b = k7Var;
        k7Var.f(8, false);
        k7Var.a();
        jh.k7 k7Var2 = new jh.k7(this.currentAccount, 0L, false);
        this.f44943c = k7Var2;
        k7Var2.f(8, false);
        k7Var2.f12382f = true;
        k7Var2.a();
        this.resourceProvider = new h(this, 29);
        this.v = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f44949w = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
    }

    public static void U(yo0 yo0Var, kf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm tmVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        jh.j4 j4Var = new jh.j4(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        jh.l4 l4Var = new jh.l4(yo0Var.getParentActivity(), yo0Var.resourceProvider, tL_starGiftUnique, j4Var, yo0Var.currentAccount, j10, j7.l1.m(tL_starGiftUnique.num, ',', sb2), false, new jh.t2(yo0Var, zArr, tL_starGiftUnique, j10, tmVar, 1));
        l4Var.h.setOnDismissListener(new eg.g(9, zArr, tmVar));
        l4Var.b();
    }

    public static void V(yo0 yo0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm tmVar, jh.j4 j4Var, ye.c cVar) {
        zArr[0] = true;
        cVar.d();
        jh.s7.x(yo0Var.currentAccount, j4Var.f12313a).h(j4Var.f12314b, tL_starGiftUnique, j10, null, true, new bh.v(24, cVar, tmVar));
    }

    public static int h0(yo0 yo0Var) {
        return yo0Var.currentAccount;
    }

    public static int u0(int i10) {
        boolean z10;
        float f9;
        if (AndroidUtilities.computePerceivedBrightness(i10) < 0.2f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f9 = 0.28f;
        } else {
            f9 = -0.28f;
        }
        return org.telegram.ui.ActionBar.g6.b(0.5f, f9, i10);
    }

    public static boolean x0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
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
        int i10;
        int i11;
        this.f44945f = new to0(this, context, 1);
        this.h = new to0(this, context, 0);
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        n0 n0Var = new n0(this, context, 15);
        n0Var.setFitsSystemWindows(true);
        this.f44944e = new eo0(this, context, this.resourceProvider);
        this.h.i(false);
        n0Var.addView(this.f44944e, i7.f6.e(-1, -2, 55));
        nh.g1 g1Var = new nh.g1(this, context, 3);
        this.f44951y = g1Var;
        g1Var.setAdapter(new fo0(this));
        n0Var.addView(this.f44951y, i7.f6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.C = frameLayout;
        n0Var.addView(frameLayout, i7.f6.e(-1, -2, 55));
        boolean z10 = this.f44941a;
        if (!z10) {
            org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context);
            this.D = lzVar;
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
            lzVar.setTabs(string, LocaleController.getString(i11));
            org.telegram.ui.Components.lz lzVar2 = this.D;
            lzVar2.f30476f = new x3(this, 12);
            this.C.addView(lzVar2, i7.f6.e(-1, 40, 17));
        } else {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
            this.E = h5Var;
            h5Var.l(LocaleController.getString(R.string.ChannelColorTitle2), false);
            this.E.setEllipsizeByGradient(true);
            this.E.setTextSize(20);
            this.E.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
            this.E.setTypeface(AndroidUtilities.bold());
            this.C.addView(this.E, i7.f6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        }
        eo0 eo0Var = this.f44944e;
        if (eo0Var != null) {
            eo0Var.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                AndroidUtilities.setLightStatusBar(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.A = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.A;
        int i12 = org.telegram.ui.ActionBar.g6.f23367u8;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i12), 1, -1));
        this.A.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.A;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.A.setOnClickListener(new View.OnClickListener(this) {
            public final yo0 f37186b;

            {
                this.f37186b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        yo0 yo0Var = this.f37186b;
                        if (yo0Var.onBackPressed(true)) {
                            yo0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        yo0 yo0Var2 = this.f37186b;
                        FrameLayout frameLayout2 = (FrameLayout) yo0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        yo0Var2.B.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        yo0Var2.B.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        yo0Var2.B.getLocationInWindow(iArr);
                        float f9 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fc fcVar = new fc(yo0Var2, yo0Var2.getParentActivity(), canvas, (yo0Var2.B.getMeasuredWidth() / 2.0f) + f9, (yo0Var2.B.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f9, f10, 1);
                        yo0Var2.K = fcVar;
                        fcVar.setOnTouchListener(new mh.d(2));
                        yo0Var2.L = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        yo0Var2.M = ofFloat;
                        ofFloat.addUpdateListener(new nh.qa(yo0Var2, 2));
                        yo0Var2.M.addListener(new e50(yo0Var2, 7));
                        yo0Var2.M.setDuration(400L);
                        yo0Var2.M.setInterpolator(org.telegram.ui.Components.ct.f27567e);
                        yo0Var2.M.start();
                        frameLayout2.addView(yo0Var2.K, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new vk0(yo0Var2, 10));
                        return;
                }
            }
        });
        this.C.addView(this.A, i7.f6.e(54, 54, 19));
        int i13 = R.raw.sun;
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(i13, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.G = xi0Var;
        xi0Var.h = true;
        if (!this.F) {
            xi0Var.N(0);
            this.G.K(0);
        } else {
            xi0Var.K(35);
            this.G.N(36);
        }
        this.G.W = true;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J9, false);
        this.G.O(w02, "Sunny");
        this.G.O(w02, "Path 6");
        this.G.O(w02, "Path");
        this.G.O(w02, "Path 5");
        this.G.m();
        ImageView imageView4 = new ImageView(context);
        this.B = imageView4;
        imageView4.setScaleType(scaleType);
        this.B.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i12), 1, -1));
        this.B.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.B.setOnClickListener(new View.OnClickListener(this) {
            public final yo0 f37186b;

            {
                this.f37186b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        yo0 yo0Var = this.f37186b;
                        if (yo0Var.onBackPressed(true)) {
                            yo0Var.finishFragment();
                            return;
                        }
                        return;
                    default:
                        yo0 yo0Var2 = this.f37186b;
                        FrameLayout frameLayout2 = (FrameLayout) yo0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        yo0Var2.B.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        yo0Var2.B.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        yo0Var2.B.getLocationInWindow(iArr);
                        float f9 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        fc fcVar = new fc(yo0Var2, yo0Var2.getParentActivity(), canvas, (yo0Var2.B.getMeasuredWidth() / 2.0f) + f9, (yo0Var2.B.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f9, f10, 1);
                        yo0Var2.K = fcVar;
                        fcVar.setOnTouchListener(new mh.d(2));
                        yo0Var2.L = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        yo0Var2.M = ofFloat;
                        ofFloat.addUpdateListener(new nh.qa(yo0Var2, 2));
                        yo0Var2.M.addListener(new e50(yo0Var2, 7));
                        yo0Var2.M.setDuration(400L);
                        yo0Var2.M.setInterpolator(org.telegram.ui.Components.ct.f27567e);
                        yo0Var2.M.start();
                        frameLayout2.addView(yo0Var2.K, new ViewGroup.LayoutParams(-1, -1));
                        AndroidUtilities.runOnUIThread(new vk0(yo0Var2, 10));
                        return;
                }
            }
        });
        this.C.addView(this.B, i7.f6.e(54, 54, 21));
        this.B.setImageDrawable(this.G);
        eo0 eo0Var2 = this.f44944e;
        eo0Var2.getClass();
        eo0Var2.f38972a = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, eo0Var2.f38973b);
        eo0Var2.a();
        eo0Var2.invalidate();
        this.d = n0Var;
        this.fragmentView = n0Var;
        return n0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                this.f44945f.f();
                this.h.f();
            } else if (i10 == NotificationCenter.starUserGiftsLoaded) {
                this.f44945f.e();
                this.h.e();
            } else if (i10 == NotificationCenter.starGiftsLoaded) {
                this.f44945f.e();
                this.h.e();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return i7.i6.a(new f(this, 27), org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.f23450z6, org.telegram.ui.ActionBar.g6.f23152i6, org.telegram.ui.ActionBar.g6.f23009a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.f23279p7, org.telegram.ui.ActionBar.g6.f23099f6, org.telegram.ui.ActionBar.g6.f23117g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
    }

    @Override
    public final boolean isLightStatusBar() {
        eo0 eo0Var = this.f44944e;
        if (eo0Var == null) {
            return super.isLightStatusBar();
        }
        if (i0.a.f(eo0Var.getColor()) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.f44941a && ((this.f44945f.b() || this.h.b()) && getUserConfig().isPremium())) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        int i10;
        int i11;
        boolean z11 = this.f44941a;
        if (!z11 && ((this.f44945f.b() || this.h.b()) && getUserConfig().isPremium())) {
            if (z10 && getVisibleDialog() == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
                if (z11) {
                    i10 = R.string.ChannelColorUnsaved;
                } else {
                    i10 = R.string.UserColorUnsaved;
                }
                alertDialog$Builder.f22714a.N = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.ChannelColorUnsavedMessage;
                } else {
                    i11 = R.string.UserColorUnsavedMessage;
                }
                alertDialog$Builder.f22714a.P = LocaleController.getString(i11);
                alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.b2(this) {
                    public final yo0 f37568b;

                    {
                        this.f37568b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
                        switch (r2) {
                            case 0:
                                this.f37568b.finishFragment();
                                return;
                            default:
                                this.f37568b.w0();
                                return;
                        }
                    }
                });
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
                    public final yo0 f37568b;

                    {
                        this.f37568b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i12) {
                        switch (r2) {
                            case 0:
                                this.f37568b.finishFragment();
                                return;
                            default:
                                this.f37568b.w0();
                                return;
                        }
                    }
                });
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                showDialog(c2Var);
                ((TextView) c2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
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
        setBulletinDelegate(new eg.x(13));
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f44947r = c6Var;
    }

    public final void v0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yo0.v0():void");
    }

    public final void w0() {
        to0 to0Var;
        to0 to0Var2;
        to0 to0Var3;
        kf.b bVar;
        if (this.f44946n) {
            return;
        }
        if (this.f44941a) {
            finishFragment();
        } else if (!getUserConfig().isPremium()) {
            showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) this, 23, true));
            return;
        }
        if (this.f44951y.getCurrentPosition() == 1) {
            to0Var = this.f44945f;
        } else {
            to0Var = this.h;
        }
        if (to0Var.f43083y != null) {
            if (this.f44951y.getCurrentPosition() == 1) {
                to0Var3 = this.h;
            } else {
                to0Var3 = this.f44945f;
            }
            to0Var3.d();
            this.f44946n = true;
            to0Var.f43076f.setLoading(true);
            TL_stars.TL_starGiftUnique tL_starGiftUnique = to0Var.f43083y;
            tm tmVar = new tm(29, this, to0Var);
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            if (tL_starGiftUnique.resale_ton_only) {
                bVar = kf.b.f13636b;
            } else {
                bVar = kf.b.f13635a;
            }
            jh.s7.x(this.currentAccount, bVar).H(tL_starGiftUnique, clientUserId, null, true, new ih.h5(this, bVar, tL_starGiftUnique, clientUserId, tmVar));
            return;
        }
        if (this.f44951y.getCurrentPosition() == 1) {
            to0Var2 = this.h;
        } else {
            to0Var2 = this.f44945f;
        }
        if (to0Var2.f43083y != null) {
            to0Var2.d();
        }
        v0();
        finishFragment();
        y0();
    }

    public final void y0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yo0.y0():void");
    }

    public final void z0() {
        this.d.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7));
        org.telegram.ui.ActionBar.h5 h5Var = this.E;
        if (h5Var != null) {
            h5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.A8));
        }
        this.f44945f.g();
        this.h.g();
        eo0 eo0Var = this.f44944e;
        if (eo0Var != null) {
            eo0Var.f38972a = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, eo0Var.f38973b);
            eo0Var.a();
            eo0Var.invalidate();
        }
        setNavigationBarColor(getNavigationBarColor());
    }
}
