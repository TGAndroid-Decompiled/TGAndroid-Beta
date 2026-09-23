package xh;

import ai.c5;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.a9;
import ci.m6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.m7;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d91;
import org.telegram.ui.xn;
import w7.x5;
import yh.l7;
import yh.t5;
import yh.w7;
public final class m extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int A0 = 0;
    public final long X;
    public final h51 Y;
    public final yh.a Z;
    public final i f45932a0;
    public final yf.n f45933b0;
    public final h f45934c0;
    public final m6 f45935d0;
    public final m6 f45936e0;
    public final m6 f45937f0;
    public final org.telegram.ui.Cells.m4 f45938g0;
    public final p6 f45939h0;
    public final k f45940i0;
    public final k[] f45941j0;
    public final FrameLayout f45942k0;
    public GiftAuctionController.Auction f45943l0;
    public final l m0;
    public Runnable f45944n0;
    public long f45945o0;
    public long f45946p0;
    public boolean f45947q0;
    public final pq[] f45948r0;
    public z5 f45949s0;
    public final le.c f45950t0;
    public final le.c f45951u0;
    public final pq[] f45952v0;
    public boolean f45953w0;
    public v51 f45954x0;
    public boolean f45955y0;
    public boolean f45956z0;

    public m(Context context, d6 d6Var, l lVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, 2, d6Var);
        int i10;
        boolean z10;
        this.f45941j0 = new k[3];
        this.f45947q0 = true;
        this.f45948r0 = new pq[1];
        f fVar = new f(this);
        rr rrVar = rr.h;
        this.f45950t0 = new le.c(0, fVar, rrVar, 380L, false);
        this.f45951u0 = new le.c(0, new f(this), rrVar, 380L, false);
        this.f45952v0 = new pq[1];
        this.f45943l0 = auction;
        this.m0 = lVar;
        long j3 = auction.giftId;
        this.X = j3;
        this.R = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j3, this);
        this.f45933b0 = new yf.n(new f(this));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        v.S(this.e, context, d6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Y = h51.j(-1, linearLayout);
        h hVar = new h(this, context, d6Var);
        this.f45934c0 = hVar;
        hVar.O = true;
        this.f45943l0.getMinimumBid();
        this.f45943l0.getCurrentMyBid();
        long currentTopBid = this.f45943l0.getCurrentTopBid();
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
        h hVar2 = this.f45934c0;
        hVar2.f47363e0 = iArr2;
        linearLayout.addView(hVar2, x5.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        m6 m6Var = new m6(context, 29, d6Var);
        this.f45935d0 = m6Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i15 = h6.f18733a7;
        int themedColor = getThemedColor(i15);
        int h = i0.a.h(getThemedColor(h6.f18878i6), getThemedColor(i15));
        m6Var.setBackground(h6.i0(dp, dp, dp, dp, themedColor, h, h));
        m6Var.setOnClickListener(new g(this, 2));
        ((TextView) m6Var.f5172c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        m6 m6Var2 = new m6(context, 29, d6Var);
        this.f45936e0 = m6Var2;
        m6Var2.setBackground(h6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) m6Var2.f5172c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        m6 m6Var3 = new m6(context, 29, d6Var);
        this.f45937f0 = m6Var3;
        m6Var3.setBackground(h6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) m6Var3.f5172c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(m6Var, x5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), x5.l(0.0f, 10, -1));
        linearLayout2.addView(m6Var2, x5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), x5.l(0.0f, 10, -1));
        linearLayout2.addView(m6Var3, x5.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, x5.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            d90 d90Var = new d90(context, d6Var);
            d90Var.setGravity(17);
            d90Var.setTextSize(1, 16.0f);
            int i16 = h6.J6;
            d90Var.setTextColor(h6.v0(i16, d6Var));
            d90Var.setLinkTextColor(h6.v0(i16, d6Var));
            d90Var.setOnClickListener(new xg.e(this, new boolean[1], d6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new z5(subscribeToGiftAuction.giftDocumentId, d90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            d90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            w7.z5.b(d90Var, 0.02f, 1.5f);
            linearLayout.addView(d90Var, x5.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = h6.L6;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, i17, 21, 0, 0, false, true, d6Var);
        this.f45938g0 = m4Var;
        linearLayout.addView(m4Var, x5.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        p6 p6Var = new p6(context, false, false, false);
        this.f45939h0 = p6Var;
        p6Var.setTextSize(AndroidUtilities.dp(12.5f));
        p6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        p6Var.setSizeableBackground(h6.Z(0, 0, 9, 9));
        p6Var.setHideBackgroundIfEmpty(true);
        m4Var.setOnWidthUpdateListener(new rg.w1(this, 12));
        m4Var.addView(p6Var, x5.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        k kVar = new k(context, d6Var);
        this.f45940i0 = kVar;
        kVar.f45901b.setTextColor(getThemedColor(i17));
        kVar.c(user);
        linearLayout.addView(kVar, x5.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, i17, 21, 15, 0, false, false, d6Var);
        m4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(m4Var2, x5.n(-1, -2));
        int i18 = 0;
        while (true) {
            k[] kVarArr = this.f45941j0;
            if (i18 >= kVarArr.length) {
                break;
            }
            kVarArr[i18] = new k(context, d6Var);
            int i19 = i18 + 1;
            this.f45941j0[i18].b(i19, true, false);
            this.f45941j0[i18].setBackground(h6.K0(false));
            k kVar2 = this.f45941j0[i18];
            if (i18 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            kVar2.f45903f = z10;
            kVar2.setOnClickListener(new ai.e2(24));
            linearLayout.addView(this.f45941j0[i18], x5.n(-1, -2));
            i18 = i19;
        }
        ?? dVar = new ci.d(context, d6Var, true);
        this.f45932a0 = dVar;
        dVar.e();
        FrameLayout.LayoutParams d = x5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i20 = d.leftMargin;
        int i21 = this.backgroundPaddingLeft;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.containerView.addView((View) dVar, d);
        ml0 ml0Var = this.d;
        int i22 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new m7(4));
        long j10 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j10 > 0) {
            this.f45934c0.setValue((int) j10);
        } else {
            this.f45934c0.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        yh.a aVar = new yh.a(context, this.currentAccount, d6Var);
        this.Z = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, x5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.z5.a(aVar);
        aVar.setOnClickListener(new d91(context, 1, d6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45942k0 = frameLayout;
        this.container.addView(frameLayout, x5.e(-1, 100, 48));
        a0();
        this.f45954x0.N(false);
    }

    public static void P(m mVar, long j3) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j3)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
                if (j3 == UserConfig.getInstance(mVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = mVar.f45944n0;
        if (runnable != null) {
            runnable.run();
        }
        mVar.dismiss();
    }

    public static void Q(m mVar) {
        int value = mVar.f45934c0.getValue();
        int minimumBid = (int) mVar.f45943l0.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(mVar.f45932a0);
            new xc(mVar.container, mVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
            return;
        }
        mVar.X(value);
    }

    public static void R(m mVar, boolean[] zArr, d6 d6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(mVar.currentAccount).getOrRequestAcquiredGifts(mVar.X, new c5(mVar, zArr, d6Var, 11));
    }

    public static void S(m mVar, long j3, Boolean bool, String str) {
        boolean z10;
        int i10;
        FrameLayout frameLayout = mVar.f45942k0;
        mVar.f45932a0.setLoading(false);
        mVar.f45956z0 = false;
        if (bool != null) {
            if (j3 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            mc mcVar = new mc(mVar.getContext(), mVar.resourcesProvider);
            mcVar.f26159a.setImageResource(R.drawable.filled_gift_sell_24);
            if (z10) {
                i10 = R.string.Gift2AuctionsBidHasBeenIncreased;
            } else {
                i10 = R.string.Gift2AuctionsBidHasBeenPlaced;
            }
            String string = LocaleController.getString(i10);
            TextView textView = mcVar.f26160b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.f45943l0.gift.gifts_per_round));
            TextView textView2 = mcVar.f26161c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            mVar.Y();
            qc.f(frameLayout, mcVar, 2750).j();
            t5.y(mVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            mVar.Y();
            hg.c.s(R.string.UnknownErrorCode, new Object[]{str}, new xc(frameLayout, mVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(m mVar, int i10) {
        mVar.f45934c0.f(ai.g0.b(mVar.currentAccount, i10, 3), ai.g0.b(mVar.currentAccount, i10, 4), true);
        mVar.c0(mVar.f45953w0);
        mVar.d0(mVar.f45953w0);
        mVar.Z(mVar.f45953w0);
        mVar.W();
    }

    public static void U(m mVar) {
        Context context = mVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, mVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
        b2Var.R = string;
        b2Var.T = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.f45943l0.gift.gifts_per_round));
        c6 c6Var = new c6(context, mVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        c6Var.setTextSize(1, 18.0f);
        c6Var.setTextColor(h6.v0(h6.f18895j5, mVar.resourcesProvider));
        c6Var.setHintColor(h6.v0(h6.Xh, mVar.resourcesProvider));
        c6Var.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        c6Var.setFocusable(true);
        c6Var.setInputType(2);
        c6Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        c6Var.setLineColors(h6.v0(h6.f18916k6, mVar.resourcesProvider), h6.v0(h6.f18934l6, mVar.resourcesProvider), h6.v0(h6.f19008p7, mVar.resourcesProvider));
        c6Var.setImeOptions(268435462);
        c6Var.setBackgroundDrawable(null);
        c6Var.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        c6Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        c6Var.addTextChangedListener(new j(mVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(c6Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.f18447a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new tg.d(10, mVar, c6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new v3.d(9));
        org.telegram.ui.ActionBar.b2[] b2VarArr = {b2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        b2VarArr[0].setOnDismissListener(new ei.t0(c6Var, R, findActivity, 5));
        b2VarArr[0].setOnShowListener(new hg.t(2, c6Var));
        b2VarArr[0].show();
        View d = b2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        b2VarArr[0].f18460h0 = false;
        c6Var.setSelection(c6Var.getText().length());
    }

    public final void V() {
        boolean z10;
        float f7;
        if (this.f45953w0 && !isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f45955y0 != z10) {
            this.f45955y0 = z10;
            yh.a aVar = this.Z;
            if (aVar != null) {
                aVar.setEnabled(z10);
                aVar.setClickable(z10);
                ViewPropertyAnimator animate = aVar.animate();
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
                scaleY.alpha(f11).setDuration(180L).start();
            }
        }
    }

    public final void W() {
        long j3;
        h hVar = this.f45934c0;
        int value = hVar.getValue();
        if (hVar.getProgress() > 0.99f) {
            hVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f45943l0.auctionUserState;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            hVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
        } else if (j11 > 0 && !tL_StarGiftAuctionUserState.returned) {
            if (j10 - j11 > 0) {
                hVar.g("+" + LocaleController.formatNumber(j3, ','));
                return;
            }
            hVar.g(null);
        } else {
            hVar.g(null);
        }
    }

    public final void X(int i10) {
        if (this.f45956z0) {
            return;
        }
        long j3 = this.f45943l0.auctionUserState.bid_amount;
        long j10 = i10;
        if (j3 > 0) {
            j10 -= j3;
        }
        long j11 = j10;
        if (t5.y(this.currentAccount, false).e && t5.y(this.currentAccount, false).q(false, false, null).amount < j11) {
            new l7(getContext(), this.resourcesProvider, j11, 14, null, null, 0L).show();
            return;
        }
        this.f45956z0 = true;
        this.f45932a0.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.X, this.m0, i10, new fi.o0(this, j3, 3));
    }

    public final void Y() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null && this.containerView != null && (frameLayout = this.f45942k0) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
        }
    }

    public final void Z(boolean z10) {
        long value = this.f45934c0.getValue();
        long currentMyBid = this.f45943l0.getCurrentMyBid();
        i iVar = this.f45932a0;
        if (value == currentMyBid) {
            iVar.g(LocaleController.getString(R.string.OK), z10, true);
            iVar.setOnClickListener(new g(this, 0));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f45943l0.auctionUserState;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        pq[] pqVarArr = this.f45952v0;
        if (j3 < value && !tL_StarGiftAuctionUserState.returned) {
            iVar.g(w7.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j3, ',')), pqVarArr), z10, true);
        } else {
            iVar.g(w7.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), pqVarArr), z10, true);
        }
        iVar.setOnClickListener(new g(this, 1));
    }

    public final void a0() {
        int d = i0.a.d(this.f45950t0.e, i0.a.d(this.f45951u0.e, getThemedColor(h6.L6), getThemedColor(h6.f19026q7)), getThemedColor(h6.uj));
        this.f45938g0.setTextColor(d);
        p6 p6Var = this.f45939h0;
        p6Var.setTextColor(d);
        this.f45940i0.f45901b.setTextColor(d);
        if (h6.B1(p6Var.getSizeableBackground(), h6.l1(0.15f, d), false)) {
            p6Var.invalidate();
        }
    }

    public final void b0(long j3, boolean z10) {
        String formatDurationNoHours;
        p6 p6Var = (p6) this.f45936e0.f5171b;
        if (j3 >= 3600) {
            formatDurationNoHours = AndroidUtilities.formatFullDuration((int) j3);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j3, true);
        }
        p6Var.c(formatDurationNoHours, z10, true);
    }

    public final void c0(boolean z10) {
        int i10;
        long value = this.f45934c0.getValue();
        int approximatedMyPlace = this.f45943l0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.f45943l0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.f45943l0.getCurrentMyBid());
        k kVar = this.f45940i0;
        kVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        kVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.f45943l0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        p6 p6Var = this.f45939h0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.f45943l0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.f45943l0;
            if (auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars <= auction2.gift.availability_total) {
                p6Var.setText(this.f45943l0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        p6Var.setText(null);
    }

    public final void d0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.f45943l0.getBidStatus();
        long j3 = this.f45943l0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.m4 m4Var = this.f45938g0;
        boolean z12 = false;
        if (this.f45934c0.getValue() > j3) {
            m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
        } else {
            z11 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z10);
                z11 = false;
                z12 = true;
            } else {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
            }
            this.f45950t0.a(z12, z10);
            this.f45951u0.a(z11, z10);
        }
        z11 = false;
        this.f45950t0.a(z12, z10);
        this.f45951u0.a(z11, z10);
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        this.f45933b0.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        org.telegram.ui.ActionBar.n2 R;
        int i10;
        ((p6) this.f45935d0.f5171b).c(w7.X0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.f45943l0.getMinimumBid(), ','), 0.78f, this.f45948r0), z10, true);
        if (this.f45943l0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.f45943l0.isUpcoming(currentTime);
            yf.n nVar = this.f45933b0;
            if (isUpcoming) {
                long max = Math.max(0, this.f45943l0.auctionStateActive.start_date - currentTime);
                nVar.a(max);
                b0(max, z10);
            } else {
                long max2 = Math.max(0, this.f45943l0.auctionStateActive.next_round_at - currentTime);
                nVar.a(max2);
                b0(max2, z10);
            }
            z5 z5Var = this.f45949s0;
            m6 m6Var = this.f45937f0;
            if (z5Var == null && this.f45943l0.gift.sticker != null) {
                this.f45949s0 = new z5(this.f45943l0.gift.sticker.f18089id, ((p6) m6Var.f5171b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f45949s0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f45949s0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.f45943l0.auctionStateActive.gifts_left, ','));
            ((p6) m6Var.f5171b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f45936e0.f5172c;
            if (this.f45943l0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f45943l0.auctionStateActive;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i10 = R.string.Gift2AuctionBidInfoUntilEndRound;
                } else {
                    i10 = R.string.Gift2AuctionBidInfoUntilNextRound;
                }
            }
            textView.setText(LocaleController.getString(i10));
            k[] kVarArr = this.f45941j0;
            int min = Math.min(kVarArr.length, this.f45943l0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l4 = this.f45943l0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l4.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l4);
                    if (user != null) {
                        kVarArr[i11].c(user);
                    }
                    kVarArr[i11].a(this.f45943l0.approximateBidAmountFromPlace(i12), z10);
                    kVarArr[i11].setOnClickListener(new ai.a3(this, longValue, 4));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.f45943l0;
        h hVar = this.f45934c0;
        hVar.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        hVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.f45943l0.gift.gifts_per_round, new Object[0]));
        c0(z10);
        d0(z10);
        Z(z10);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.f45943l0.auctionUserState.peer);
        long j3 = this.f45943l0.auctionUserState.acquired_count;
        if (this.f45946p0 < j3 && !this.f45947q0 && (R = LaunchActivity.R()) != null) {
            long j10 = this.f45945o0;
            if (j10 != 0) {
                xn R9 = xn.R9(j10);
                R9.whenFullyVisible(new ng.b(R9, 1));
                R.presentFragment(R9);
                Runnable runnable = this.f45944n0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.f45945o0 = peerDialogId;
        }
        this.f45946p0 = j3;
        this.f45947q0 = false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        V();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f45953w0 = false;
        V();
        qc.h(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f45953w0 = true;
        V();
        qc.a(this.container, new a9(16));
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f45943l0 = auction;
        e0(this.f45953w0);
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        v51 v51Var = new v51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 13), this.resourcesProvider);
        this.f45954x0 = v51Var;
        v51Var.f28662r = false;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
