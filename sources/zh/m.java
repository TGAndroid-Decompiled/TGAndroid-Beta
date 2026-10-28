package zh;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ca;
import bi.dd;
import bi.gd;
import bi.tc;
import fi.k8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.p7;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bh1;
import org.telegram.ui.wn;
public final class m extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int A0 = 0;
    public final long X;
    public final u61 Y;
    public final bi.c Z;
    public final i f53170a0;
    public final ag.t f53171b0;
    public final h f53172c0;
    public final tg.t0 f53173d0;
    public final tg.t0 f53174e0;
    public final tg.t0 f53175f0;
    public final org.telegram.ui.Cells.q4 f53176g0;
    public final s6 f53177h0;
    public final k f53178i0;
    public final k[] f53179j0;
    public final FrameLayout f53180k0;
    public GiftAuctionController.Auction f53181l0;
    public final l m0;
    public Runnable f53182n0;
    public long f53183o0;
    public long f53184p0;
    public boolean f53185q0;
    public final zq[] f53186r0;
    public c6 f53187s0;
    public final oe.b f53188t0;
    public final oe.b f53189u0;
    public final zq[] f53190v0;
    public boolean f53191w0;
    public k71 f53192x0;
    public boolean f53193y0;
    public boolean f53194z0;

    public m(Context context, u6 u6Var, l lVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, 2, u6Var);
        int i10;
        boolean z10;
        this.f53179j0 = new k[3];
        this.f53185q0 = true;
        this.f53186r0 = new zq[1];
        f fVar = new f(this);
        ds dsVar = ds.h;
        this.f53188t0 = new oe.b(0, fVar, dsVar, 380L, false);
        this.f53189u0 = new oe.b(0, new f(this), dsVar, 380L, false);
        this.f53190v0 = new zq[1];
        this.f53181l0 = auction;
        this.m0 = lVar;
        long j10 = auction.giftId;
        this.X = j10;
        this.R = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.f53171b0 = new ag.t(new f(this));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        v.S(this.e, context, u6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Y = u61.j(-1, linearLayout);
        h hVar = new h(this, context, u6Var);
        this.f53172c0 = hVar;
        hVar.O = true;
        this.f53181l0.getMinimumBid();
        this.f53181l0.getCurrentMyBid();
        long currentTopBid = this.f53181l0.getCurrentTopBid();
        if (currentTopBid > 100000) {
            i10 = ((((int) currentTopBid) * 3) / 2000) * 1000;
        } else if (currentTopBid > 30000) {
            i10 = 100000;
        } else {
            i10 = 50000;
        }
        int i11 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = iArr[i12];
            if (i13 < 50) {
                z11 = true;
            } else {
                z11 = i13 == 50 ? false : z11;
                if (i13 > i10) {
                    arrayList.add(Integer.valueOf(i10));
                    break;
                }
                arrayList.add(Integer.valueOf(i13));
                if (iArr[i12] == i10) {
                    break;
                }
            }
            i12++;
            i11 = 15;
        }
        if (z11) {
            arrayList.add(0, 50);
        }
        if (arrayList.size() < 2) {
            arrayList.clear();
            arrayList.add(1);
            arrayList.add(10000);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            iArr2[i14] = ((Integer) arrayList.get(i14)).intValue();
        }
        h hVar2 = this.f53172c0;
        hVar2.f5798e0 = iArr2;
        linearLayout.addView(hVar2, kb1.x(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        tg.t0 t0Var = new tg.t0(context, u6Var);
        this.f53173d0 = t0Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i15 = y6.f23300a7;
        int themedColor = getThemedColor(i15);
        int k10 = i0.a.k(getThemedColor(y6.f23449i6), getThemedColor(i15));
        org.telegram.ui.Cells.y j02 = y6.j0(dp, dp, dp, dp, themedColor, k10, k10);
        b7 N = f7.N(i15);
        t0Var.setBackground(j02);
        f7.k(t0Var, j02, N, null, u6Var);
        t0Var.setOnClickListener(new g(this, 2));
        ((TextView) t0Var.f49082c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        tg.t0 t0Var2 = new tg.t0(context, u6Var);
        this.f53174e0 = t0Var2;
        ShapeDrawable c02 = y6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i15));
        b7 N2 = f7.N(i15);
        t0Var2.setBackground(c02);
        f7.k(t0Var2, c02, N2, null, u6Var);
        ((TextView) t0Var2.f49082c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        tg.t0 t0Var3 = new tg.t0(context, u6Var);
        this.f53175f0 = t0Var3;
        ShapeDrawable c03 = y6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i15));
        b7 N3 = f7.N(i15);
        t0Var3.setBackground(c03);
        f7.k(t0Var3, c03, N3, null, u6Var);
        ((TextView) t0Var3.f49082c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(t0Var, kb1.p(1.0f, 0, -1));
        linearLayout2.addView(new View(context), kb1.p(0.0f, 10, -1));
        linearLayout2.addView(t0Var2, kb1.p(1.0f, 0, -1));
        linearLayout2.addView(new View(context), kb1.p(0.0f, 10, -1));
        linearLayout2.addView(t0Var3, kb1.p(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, kb1.o(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            aa0 aa0Var = new aa0(context, u6Var);
            aa0Var.setGravity(17);
            aa0Var.setTextSize(1, 16.0f);
            int i16 = y6.J6;
            f7.V(aa0Var, i16, u6Var);
            f7.H(aa0Var, i16, u6Var);
            aa0Var.setOnClickListener(new b51(this, new boolean[1], u6Var, 5));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new c6(subscribeToGiftAuction.giftDocumentId, aa0Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            aa0Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            kb1.c(aa0Var, 0.02f, 1.5f);
            linearLayout.addView(aa0Var, kb1.o(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = y6.L6;
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context, i17, 21, 0, 0, false, true, u6Var);
        this.f53176g0 = q4Var;
        linearLayout.addView(q4Var, kb1.o(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        s6 s6Var = new s6(context, false, false, false);
        this.f53177h0 = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(12.5f));
        s6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        s6Var.setSizeableBackground(y6.a0(0, 0, 9, 9));
        s6Var.setHideBackgroundIfEmpty(true);
        q4Var.setOnWidthUpdateListener(new ti.g(this, 17));
        q4Var.addView(s6Var, kb1.h(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        k kVar = new k(context, u6Var);
        this.f53178i0 = kVar;
        s6 s6Var2 = kVar.f53137b;
        f7.r(s6Var2);
        s6Var2.setTextColor(getThemedColor(i17));
        kVar.c(user);
        linearLayout.addView(kVar, kb1.o(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context, i17, 21, 15, 0, false, false, u6Var);
        q4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(q4Var2, kb1.r(-1, -2));
        int i18 = 0;
        while (true) {
            k[] kVarArr = this.f53179j0;
            if (i18 >= kVarArr.length) {
                break;
            }
            kVarArr[i18] = new k(context, u6Var);
            int i19 = i18 + 1;
            this.f53179j0[i18].b(i19, true, false);
            this.f53179j0[i18].setBackground(y6.M0(false));
            k kVar2 = this.f53179j0[i18];
            if (i18 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            kVar2.f53139f = z10;
            kVar2.setOnClickListener(new bh.f(27));
            linearLayout.addView(this.f53179j0[i18], kb1.r(-1, -2));
            i18 = i19;
        }
        ?? dVar = new fi.d(context, u6Var, true);
        this.f53170a0 = dVar;
        dVar.f();
        FrameLayout.LayoutParams h = kb1.h(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i20 = h.leftMargin;
        int i21 = this.backgroundPaddingLeft;
        h.leftMargin = i20 + i21;
        h.rightMargin += i21;
        this.containerView.addView((View) dVar, h);
        nm0 nm0Var = this.d;
        int i22 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new p7(4));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.f53172c0.setValue((int) j11);
        } else {
            this.f53172c0.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        bi.c cVar = new bi.c(context, this.currentAccount, u6Var);
        this.Z = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, kb1.h(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        kb1.b(cVar);
        cVar.setOnClickListener(new gd(context, 2, u6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f53180k0 = frameLayout;
        this.container.addView(frameLayout, kb1.i(-1, 100, 48));
        a0();
        this.f53192x0.O(false);
    }

    public static void P(m mVar, long j10) {
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j10)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == UserConfig.getInstance(mVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = mVar.f53182n0;
        if (runnable != null) {
            runnable.run();
        }
        mVar.dismiss();
    }

    public static void Q(m mVar) {
        int value = mVar.f53172c0.getValue();
        int minimumBid = (int) mVar.f53181l0.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(mVar.f53170a0);
            new wc(mVar.container, mVar.resourcesProvider).R(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
            return;
        }
        mVar.X(value);
    }

    public static void R(m mVar, boolean[] zArr, u6 u6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(mVar.currentAccount).getOrRequestAcquiredGifts(mVar.X, new bi.v3(mVar, zArr, u6Var, 12));
    }

    public static void S(m mVar, long j10, Boolean bool, String str) {
        boolean z10;
        int i10;
        FrameLayout frameLayout = mVar.f53180k0;
        mVar.f53170a0.setLoading(false);
        mVar.f53194z0 = false;
        if (bool != null) {
            if (j10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            mc mcVar = new mc(mVar.getContext(), mVar.resourcesProvider);
            mcVar.f30492a.setImageResource(R.drawable.filled_gift_sell_24);
            if (z10) {
                i10 = R.string.Gift2AuctionsBidHasBeenIncreased;
            } else {
                i10 = R.string.Gift2AuctionsBidHasBeenPlaced;
            }
            String string = LocaleController.getString(i10);
            TextView textView = mcVar.f30493b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.f53181l0.gift.gifts_per_round));
            TextView textView2 = mcVar.f30494c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            mVar.Y();
            qc.f(frameLayout, mcVar, 2750).j();
            ca.y(mVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            mVar.Y();
            ic.a.s(R.string.UnknownErrorCode, new Object[]{str}, new wc(frameLayout, mVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(m mVar, int i10) {
        mVar.f53172c0.f(di.u.b(mVar.currentAccount, i10, 3), di.u.b(mVar.currentAccount, i10, 4), true);
        mVar.c0(mVar.f53191w0);
        mVar.d0(mVar.f53191w0);
        mVar.Z(mVar.f53191w0);
        mVar.W();
    }

    public static void U(m mVar) {
        Context context = mVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, mVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        e2Var.T = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.f53181l0.gift.gifts_per_round));
        g6 g6Var = new g6(context, mVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        g6Var.setTextSize(1, 18.0f);
        f7.V(g6Var, y6.f23465j5, mVar.resourcesProvider);
        f7.m(g6Var, 34, y6.Xh, mVar.resourcesProvider);
        g6Var.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        g6Var.setFocusable(true);
        g6Var.setInputType(2);
        g6Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        f7.G(g6Var, y6.f23485k6, y6.f23503l6, y6.f23582p7, mVar.resourcesProvider);
        g6Var.setImeOptions(268435462);
        g6Var.setBackgroundDrawable(null);
        g6Var.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        g6Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        g6Var.addTextChangedListener(new j(mVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(g6Var, kb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        e2Var.f22556a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new bh1(27, mVar, g6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new vg.d(17));
        org.telegram.ui.ActionBar.e2[] e2VarArr = {e2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        e2VarArr[0].setOnDismissListener(new hi.y0(g6Var, R, findActivity, 5));
        e2VarArr[0].setOnShowListener(new jg.s(g6Var, 2));
        e2VarArr[0].show();
        View d = e2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        e2VarArr[0].f22578j0 = false;
        g6Var.setSelection(g6Var.getText().length());
    }

    public final void V() {
        boolean z10;
        float f7;
        if (this.f53191w0 && !isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f53193y0 != z10) {
            this.f53193y0 = z10;
            bi.c cVar = this.Z;
            if (cVar != null) {
                cVar.setEnabled(z10);
                cVar.setClickable(z10);
                ViewPropertyAnimator animate = cVar.animate();
                float f10 = 0.6f;
                float f11 = 1.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!z10) {
                    f11 = 0.0f;
                }
                wh.p(scaleY, f11, 180L);
            }
        }
    }

    public final void W() {
        long j10;
        h hVar = this.f53172c0;
        int value = hVar.getValue();
        if (hVar.getProgress() > 0.99f) {
            hVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j11 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f53181l0.auctionUserState;
        long j12 = tL_StarGiftAuctionUserState.bid_amount;
        if (j11 == j12) {
            hVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
        } else if (j12 > 0 && !tL_StarGiftAuctionUserState.returned) {
            if (j11 - j12 > 0) {
                hVar.g("+" + LocaleController.formatNumber(j10, ','));
                return;
            }
            hVar.g(null);
        } else {
            hVar.g(null);
        }
    }

    public final void X(int i10) {
        long j10;
        if (this.f53194z0) {
            return;
        }
        long j11 = this.f53181l0.auctionUserState.bid_amount;
        if (j11 > 0) {
            j10 = i10 - j11;
        } else {
            j10 = i10;
        }
        long j12 = j10;
        if (ca.y(this.currentAccount, false).e && ca.y(this.currentAccount, false).q(false, false, null).amount < j12) {
            new tc(getContext(), this.resourcesProvider, j12, 14, null, null, 0L).show();
            return;
        }
        this.f53194z0 = true;
        this.f53170a0.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.X, this.m0, i10, new ii.m0(this, j11, 3));
    }

    public final void Y() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null && this.containerView != null && (frameLayout = this.f53180k0) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
        }
    }

    public final void Z(boolean z10) {
        long value = this.f53172c0.getValue();
        int i10 = (value > this.f53181l0.getCurrentMyBid() ? 1 : (value == this.f53181l0.getCurrentMyBid() ? 0 : -1));
        i iVar = this.f53170a0;
        if (i10 == 0) {
            iVar.i(LocaleController.getString(R.string.OK), z10, true);
            iVar.setOnClickListener(new g(this, 0));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f53181l0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        int i11 = (j10 > value ? 1 : (j10 == value ? 0 : -1));
        zq[] zqVarArr = this.f53190v0;
        if (i11 < 0 && !tL_StarGiftAuctionUserState.returned) {
            iVar.i(dd.U0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), zqVarArr), z10, true);
        } else {
            iVar.i(dd.U0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), zqVarArr), z10, true);
        }
        iVar.setOnClickListener(new g(this, 1));
    }

    public final void a0() {
        int f7 = i0.a.f(this.f53188t0.e, i0.a.f(this.f53189u0.e, getThemedColor(y6.L6), getThemedColor(y6.f23599q7)), getThemedColor(y6.uj));
        this.f53176g0.setTextColor(f7);
        s6 s6Var = this.f53177h0;
        s6Var.setTextColor(f7);
        this.f53178i0.f53137b.setTextColor(f7);
        if (y6.E1(s6Var.getSizeableBackground(), y6.o1(0.15f, f7), false)) {
            s6Var.invalidate();
        }
    }

    public final void b0(long j10, boolean z10) {
        String formatDurationNoHours;
        s6 s6Var = (s6) this.f53174e0.f49081b;
        if (j10 >= 3600) {
            formatDurationNoHours = AndroidUtilities.formatFullDuration((int) j10);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j10, true);
        }
        s6Var.c(formatDurationNoHours, z10, true);
    }

    public final void c0(boolean z10) {
        int i10;
        long value = this.f53172c0.getValue();
        int approximatedMyPlace = this.f53181l0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.f53181l0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.f53181l0.getCurrentMyBid());
        k kVar = this.f53178i0;
        kVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        kVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.f53181l0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        s6 s6Var = this.f53177h0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.f53181l0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.f53181l0;
            if (auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars <= auction2.gift.availability_total) {
                s6Var.setText(this.f53181l0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        s6Var.setText(null);
    }

    public final void d0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.f53181l0.getBidStatus();
        int i10 = (this.f53172c0.getValue() > this.f53181l0.auctionUserState.bid_amount ? 1 : (this.f53172c0.getValue() == this.f53181l0.auctionUserState.bid_amount ? 0 : -1));
        org.telegram.ui.Cells.q4 q4Var = this.f53176g0;
        boolean z12 = false;
        if (i10 > 0) {
            q4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
        } else {
            z11 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                q4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                q4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                q4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z10);
                z11 = false;
                z12 = true;
            } else {
                q4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
            }
            this.f53188t0.a(z12, z10);
            this.f53189u0.a(z11, z10);
        }
        z11 = false;
        this.f53188t0.a(z12, z10);
        this.f53189u0.a(z11, z10);
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        this.f53171b0.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        org.telegram.ui.ActionBar.r2 R;
        int i10;
        ((s6) this.f53173d0.f49081b).c(dd.W0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.f53181l0.getMinimumBid(), ','), 0.78f, this.f53186r0), z10, true);
        if (this.f53181l0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.f53181l0.isUpcoming(currentTime);
            ag.t tVar = this.f53171b0;
            if (isUpcoming) {
                long max = Math.max(0, this.f53181l0.auctionStateActive.start_date - currentTime);
                tVar.a(max);
                b0(max, z10);
            } else {
                long max2 = Math.max(0, this.f53181l0.auctionStateActive.next_round_at - currentTime);
                tVar.a(max2);
                b0(max2, z10);
            }
            c6 c6Var = this.f53187s0;
            tg.t0 t0Var = this.f53175f0;
            if (c6Var == null && this.f53181l0.gift.sticker != null) {
                this.f53187s0 = new c6(this.f53181l0.gift.sticker.f22034id, ((s6) t0Var.f49081b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f53187s0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f53187s0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.f53181l0.auctionStateActive.gifts_left, ','));
            ((s6) t0Var.f49081b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f53174e0.f49082c;
            if (this.f53181l0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f53181l0.auctionStateActive;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i10 = R.string.Gift2AuctionBidInfoUntilEndRound;
                } else {
                    i10 = R.string.Gift2AuctionBidInfoUntilNextRound;
                }
            }
            textView.setText(LocaleController.getString(i10));
            k[] kVarArr = this.f53179j0;
            int min = Math.min(kVarArr.length, this.f53181l0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l4 = this.f53181l0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l4.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l4);
                    if (user != null) {
                        kVarArr[i11].c(user);
                    }
                    kVarArr[i11].a(this.f53181l0.approximateBidAmountFromPlace(i12), z10);
                    kVarArr[i11].setOnClickListener(new di.a2(this, longValue, 4));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.f53181l0;
        h hVar = this.f53172c0;
        hVar.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        hVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.f53181l0.gift.gifts_per_round, new Object[0]));
        c0(z10);
        d0(z10);
        Z(z10);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.f53181l0.auctionUserState.peer);
        long j10 = this.f53181l0.auctionUserState.acquired_count;
        if (this.f53184p0 < j10 && !this.f53185q0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.f53183o0;
            if (j11 != 0) {
                wn ea2 = wn.ea(j11);
                ea2.whenFullyVisible(new pg.b(ea2, 1));
                R.presentFragment(ea2);
                Runnable runnable = this.f53182n0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.f53183o0 = peerDialogId;
        }
        this.f53184p0 = j10;
        this.f53185q0 = false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        V();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f53191w0 = false;
        V();
        qc.h(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f53191w0 = true;
        V();
        qc.a(this.container, new k8(15));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.f53176g0 != null && this.f53177h0 != null && this.f53178i0 != null) {
                a0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f53181l0 = auction;
        e0(this.f53191w0);
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(this.d, getContext(), this.currentAccount, 0, true, new hi.e2(this, 27), this.resourcesProvider);
        this.f53192x0 = k71Var;
        k71Var.f29878r = false;
        return k71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
