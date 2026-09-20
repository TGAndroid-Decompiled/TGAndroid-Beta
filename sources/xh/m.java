package xh;

import ai.d5;
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
import ci.d9;
import ci.n6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.l7;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o91;
import org.telegram.ui.zn;
import w7.b6;
import yh.u5;
import yh.w7;
public final class m extends ab implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int A0 = 0;
    public final long X;
    public final w51 Y;
    public final yh.a Z;
    public final i f46280a0;
    public final yf.n f46281b0;
    public final h f46282c0;
    public final n6 f46283d0;
    public final n6 f46284e0;
    public final n6 f46285f0;
    public final org.telegram.ui.Cells.n4 f46286g0;
    public final o6 f46287h0;
    public final k f46288i0;
    public final k[] f46289j0;
    public final FrameLayout f46290k0;
    public GiftAuctionController.Auction f46291l0;
    public final l m0;
    public Runnable f46292n0;
    public long f46293o0;
    public long f46294p0;
    public boolean f46295q0;
    public final oq[] f46296r0;
    public y5 f46297s0;
    public final le.b f46298t0;
    public final le.b f46299u0;
    public final oq[] f46300v0;
    public boolean f46301w0;
    public k61 f46302x0;
    public boolean f46303y0;
    public boolean f46304z0;

    public m(Context context, f6 f6Var, l lVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, 2, f6Var);
        int i10;
        boolean z10;
        this.f46289j0 = new k[3];
        this.f46295q0 = true;
        this.f46296r0 = new oq[1];
        f fVar = new f(this);
        qr qrVar = qr.h;
        this.f46298t0 = new le.b(0, fVar, qrVar, 380L, false);
        this.f46299u0 = new le.b(0, new f(this), qrVar, 380L, false);
        this.f46300v0 = new oq[1];
        this.f46291l0 = auction;
        this.m0 = lVar;
        long j3 = auction.giftId;
        this.X = j3;
        this.R = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j3, this);
        this.f46281b0 = new yf.n(new f(this));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        v.S(this.e, context, f6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Y = w51.j(-1, linearLayout);
        h hVar = new h(this, context, f6Var);
        this.f46282c0 = hVar;
        hVar.O = true;
        this.f46291l0.getMinimumBid();
        this.f46291l0.getCurrentMyBid();
        long currentTopBid = this.f46291l0.getCurrentTopBid();
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
        h hVar2 = this.f46282c0;
        hVar2.f47712e0 = iArr2;
        linearLayout.addView(hVar2, w7.y5.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        n6 n6Var = new n6(context, 29, f6Var);
        this.f46283d0 = n6Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i15 = j6.f19038a7;
        int themedColor = getThemedColor(i15);
        int h = i0.a.h(getThemedColor(j6.f19184i6), getThemedColor(i15));
        n6Var.setBackground(j6.i0(dp, dp, dp, dp, themedColor, h, h));
        n6Var.setOnClickListener(new g(this, 2));
        ((TextView) n6Var.f5076c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        n6 n6Var2 = new n6(context, 29, f6Var);
        this.f46284e0 = n6Var2;
        n6Var2.setBackground(j6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) n6Var2.f5076c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        n6 n6Var3 = new n6(context, 29, f6Var);
        this.f46285f0 = n6Var3;
        n6Var3.setBackground(j6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) n6Var3.f5076c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(n6Var, w7.y5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), w7.y5.l(0.0f, 10, -1));
        linearLayout2.addView(n6Var2, w7.y5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), w7.y5.l(0.0f, 10, -1));
        linearLayout2.addView(n6Var3, w7.y5.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, w7.y5.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            k90 k90Var = new k90(context, f6Var);
            k90Var.setGravity(17);
            k90Var.setTextSize(1, 16.0f);
            int i16 = j6.J6;
            k90Var.setTextColor(j6.v0(i16, f6Var));
            k90Var.setLinkTextColor(j6.v0(i16, f6Var));
            k90Var.setOnClickListener(new xg.e(this, new boolean[1], f6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new y5(subscribeToGiftAuction.giftDocumentId, k90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            k90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            b6.b(k90Var, 0.02f, 1.5f);
            linearLayout.addView(k90Var, w7.y5.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = j6.L6;
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, i17, 21, 0, 0, false, true, f6Var);
        this.f46286g0 = n4Var;
        linearLayout.addView(n4Var, w7.y5.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        o6 o6Var = new o6(context, false, false, false);
        this.f46287h0 = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(12.5f));
        o6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        o6Var.setSizeableBackground(j6.Z(0, 0, 9, 9));
        o6Var.setHideBackgroundIfEmpty(true);
        n4Var.setOnWidthUpdateListener(new rg.q1(this, 13));
        n4Var.addView(o6Var, w7.y5.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        k kVar = new k(context, f6Var);
        this.f46288i0 = kVar;
        kVar.f46249b.setTextColor(getThemedColor(i17));
        kVar.c(user);
        linearLayout.addView(kVar, w7.y5.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, i17, 21, 15, 0, false, false, f6Var);
        n4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(n4Var2, w7.y5.n(-1, -2));
        int i18 = 0;
        while (true) {
            k[] kVarArr = this.f46289j0;
            if (i18 >= kVarArr.length) {
                break;
            }
            kVarArr[i18] = new k(context, f6Var);
            int i19 = i18 + 1;
            this.f46289j0[i18].b(i19, true, false);
            this.f46289j0[i18].setBackground(j6.K0(false));
            k kVar2 = this.f46289j0[i18];
            if (i18 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            kVar2.f46251f = z10;
            kVar2.setOnClickListener(new ai.e2(24));
            linearLayout.addView(this.f46289j0[i18], w7.y5.n(-1, -2));
            i18 = i19;
        }
        ?? dVar = new ci.d(context, f6Var, true);
        this.f46280a0 = dVar;
        dVar.e();
        FrameLayout.LayoutParams d = w7.y5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i20 = d.leftMargin;
        int i21 = this.backgroundPaddingLeft;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.containerView.addView((View) dVar, d);
        vl0 vl0Var = this.d;
        int i22 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new l7(4));
        long j10 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j10 > 0) {
            this.f46282c0.setValue((int) j10);
        } else {
            this.f46282c0.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        yh.a aVar = new yh.a(context, this.currentAccount, f6Var);
        this.Z = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, w7.y5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        b6.a(aVar);
        aVar.setOnClickListener(new o91(context, 1, f6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46290k0 = frameLayout;
        this.container.addView(frameLayout, w7.y5.e(-1, 100, 48));
        a0();
        this.f46302x0.N(false);
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
        Runnable runnable = mVar.f46292n0;
        if (runnable != null) {
            runnable.run();
        }
        mVar.dismiss();
    }

    public static void Q(m mVar) {
        int value = mVar.f46282c0.getValue();
        int minimumBid = (int) mVar.f46291l0.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(mVar.f46280a0);
            new xc(mVar.container, mVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
            return;
        }
        mVar.X(value);
    }

    public static void R(m mVar, boolean[] zArr, f6 f6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(mVar.currentAccount).getOrRequestAcquiredGifts(mVar.X, new d5(mVar, zArr, f6Var, 8));
    }

    public static void S(m mVar, long j3, Boolean bool, String str) {
        boolean z10;
        int i10;
        FrameLayout frameLayout = mVar.f46290k0;
        mVar.f46280a0.setLoading(false);
        mVar.f46304z0 = false;
        if (bool != null) {
            if (j3 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            lc lcVar = new lc(mVar.getContext(), mVar.resourcesProvider);
            lcVar.f26096a.setImageResource(R.drawable.filled_gift_sell_24);
            if (z10) {
                i10 = R.string.Gift2AuctionsBidHasBeenIncreased;
            } else {
                i10 = R.string.Gift2AuctionsBidHasBeenPlaced;
            }
            String string = LocaleController.getString(i10);
            TextView textView = lcVar.f26097b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.f46291l0.gift.gifts_per_round));
            TextView textView2 = lcVar.f26098c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            mVar.Y();
            pc.f(frameLayout, lcVar, 2750).j();
            u5.y(mVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            mVar.Y();
            hg.k0.q(R.string.UnknownErrorCode, new Object[]{str}, new xc(frameLayout, mVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(m mVar, int i10) {
        mVar.f46282c0.f(ai.g0.b(mVar.currentAccount, i10, 3), ai.g0.b(mVar.currentAccount, i10, 4), true);
        mVar.c0(mVar.f46301w0);
        mVar.d0(mVar.f46301w0);
        mVar.Z(mVar.f46301w0);
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
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
        b2Var.R = string;
        b2Var.T = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.f46291l0.gift.gifts_per_round));
        d6 d6Var = new d6(context, mVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        d6Var.setTextSize(1, 18.0f);
        d6Var.setTextColor(j6.v0(j6.f19201j5, mVar.resourcesProvider));
        d6Var.setHintColor(j6.v0(j6.Xh, mVar.resourcesProvider));
        d6Var.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        d6Var.setFocusable(true);
        d6Var.setInputType(2);
        d6Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        d6Var.setLineColors(j6.v0(j6.f19222k6, mVar.resourcesProvider), j6.v0(j6.f19240l6, mVar.resourcesProvider), j6.v0(j6.f19315p7, mVar.resourcesProvider));
        d6Var.setImeOptions(268435462);
        d6Var.setBackgroundDrawable(null);
        d6Var.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        d6Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        d6Var.addTextChangedListener(new j(mVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(d6Var, w7.y5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.f18678a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new s5.e(10, mVar, d6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new x2.h(3));
        org.telegram.ui.ActionBar.b2[] b2VarArr = {b2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        b2VarArr[0].setOnDismissListener(new ei.t0(d6Var, R, findActivity, 5));
        b2VarArr[0].setOnShowListener(new hg.r(2, d6Var));
        b2VarArr[0].show();
        View d = b2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        b2VarArr[0].f18691h0 = false;
        d6Var.setSelection(d6Var.getText().length());
    }

    public final void V() {
        boolean z10;
        float f7;
        if (this.f46301w0 && !isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f46303y0 != z10) {
            this.f46303y0 = z10;
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
                rk.r(scaleY, f11, 180L);
            }
        }
    }

    public final void W() {
        long j3;
        h hVar = this.f46282c0;
        int value = hVar.getValue();
        if (hVar.getProgress() > 0.99f) {
            hVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f46291l0.auctionUserState;
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
        if (this.f46304z0) {
            return;
        }
        long j3 = this.f46291l0.auctionUserState.bid_amount;
        long j10 = i10;
        if (j3 > 0) {
            j10 -= j3;
        }
        long j11 = j10;
        if (u5.y(this.currentAccount, false).e && u5.y(this.currentAccount, false).q(false, false, null).amount < j11) {
            new yh.l7(getContext(), this.resourcesProvider, j11, 14, null, null, 0L).show();
            return;
        }
        this.f46304z0 = true;
        this.f46280a0.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.X, this.m0, i10, new fi.o0(this, j3, 3));
    }

    public final void Y() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null && this.containerView != null && (frameLayout = this.f46290k0) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
        }
    }

    public final void Z(boolean z10) {
        long value = this.f46282c0.getValue();
        long currentMyBid = this.f46291l0.getCurrentMyBid();
        i iVar = this.f46280a0;
        if (value == currentMyBid) {
            iVar.g(LocaleController.getString(R.string.OK), z10, true);
            iVar.setOnClickListener(new g(this, 0));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f46291l0.auctionUserState;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        oq[] oqVarArr = this.f46300v0;
        if (j3 < value && !tL_StarGiftAuctionUserState.returned) {
            iVar.g(w7.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j3, ',')), oqVarArr), z10, true);
        } else {
            iVar.g(w7.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), oqVarArr), z10, true);
        }
        iVar.setOnClickListener(new g(this, 1));
    }

    public final void a0() {
        int d = i0.a.d(this.f46298t0.e, i0.a.d(this.f46299u0.e, getThemedColor(j6.L6), getThemedColor(j6.f19333q7)), getThemedColor(j6.uj));
        this.f46286g0.setTextColor(d);
        o6 o6Var = this.f46287h0;
        o6Var.setTextColor(d);
        this.f46288i0.f46249b.setTextColor(d);
        if (j6.B1(o6Var.getSizeableBackground(), j6.l1(0.15f, d), false)) {
            o6Var.invalidate();
        }
    }

    public final void b0(long j3, boolean z10) {
        String formatDurationNoHours;
        o6 o6Var = (o6) this.f46284e0.f5075b;
        if (j3 >= 3600) {
            formatDurationNoHours = AndroidUtilities.formatFullDuration((int) j3);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j3, true);
        }
        o6Var.c(formatDurationNoHours, z10, true);
    }

    public final void c0(boolean z10) {
        int i10;
        long value = this.f46282c0.getValue();
        int approximatedMyPlace = this.f46291l0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.f46291l0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.f46291l0.getCurrentMyBid());
        k kVar = this.f46288i0;
        kVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        kVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.f46291l0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        o6 o6Var = this.f46287h0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.f46291l0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.f46291l0;
            if (auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars <= auction2.gift.availability_total) {
                o6Var.setText(this.f46291l0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        o6Var.setText(null);
    }

    public final void d0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.f46291l0.getBidStatus();
        long j3 = this.f46291l0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.n4 n4Var = this.f46286g0;
        boolean z12 = false;
        if (this.f46282c0.getValue() > j3) {
            n4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
        } else {
            z11 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                n4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                n4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                n4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z10);
                z11 = false;
                z12 = true;
            } else {
                n4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
            }
            this.f46298t0.a(z12, z10);
            this.f46299u0.a(z11, z10);
        }
        z11 = false;
        this.f46298t0.a(z12, z10);
        this.f46299u0.a(z11, z10);
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        this.f46281b0.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        org.telegram.ui.ActionBar.n2 R;
        int i10;
        ((o6) this.f46283d0.f5075b).c(w7.X0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.f46291l0.getMinimumBid(), ','), 0.78f, this.f46296r0), z10, true);
        if (this.f46291l0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.f46291l0.isUpcoming(currentTime);
            yf.n nVar = this.f46281b0;
            if (isUpcoming) {
                long max = Math.max(0, this.f46291l0.auctionStateActive.start_date - currentTime);
                nVar.a(max);
                b0(max, z10);
            } else {
                long max2 = Math.max(0, this.f46291l0.auctionStateActive.next_round_at - currentTime);
                nVar.a(max2);
                b0(max2, z10);
            }
            y5 y5Var = this.f46297s0;
            n6 n6Var = this.f46285f0;
            if (y5Var == null && this.f46291l0.gift.sticker != null) {
                this.f46297s0 = new y5(this.f46291l0.gift.sticker.f18334id, ((o6) n6Var.f5075b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f46297s0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f46297s0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.f46291l0.auctionStateActive.gifts_left, ','));
            ((o6) n6Var.f5075b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f46284e0.f5076c;
            if (this.f46291l0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f46291l0.auctionStateActive;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i10 = R.string.Gift2AuctionBidInfoUntilEndRound;
                } else {
                    i10 = R.string.Gift2AuctionBidInfoUntilNextRound;
                }
            }
            textView.setText(LocaleController.getString(i10));
            k[] kVarArr = this.f46289j0;
            int min = Math.min(kVarArr.length, this.f46291l0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l4 = this.f46291l0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l4.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l4);
                    if (user != null) {
                        kVarArr[i11].c(user);
                    }
                    kVarArr[i11].a(this.f46291l0.approximateBidAmountFromPlace(i12), z10);
                    kVarArr[i11].setOnClickListener(new ai.a3(this, longValue, 4));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.f46291l0;
        h hVar = this.f46282c0;
        hVar.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        hVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.f46291l0.gift.gifts_per_round, new Object[0]));
        c0(z10);
        d0(z10);
        Z(z10);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.f46291l0.auctionUserState.peer);
        long j3 = this.f46291l0.auctionUserState.acquired_count;
        if (this.f46294p0 < j3 && !this.f46295q0 && (R = LaunchActivity.R()) != null) {
            long j10 = this.f46293o0;
            if (j10 != 0) {
                zn R9 = zn.R9(j10);
                R9.whenFullyVisible(new ng.b(R9, 1));
                R.presentFragment(R9);
                Runnable runnable = this.f46292n0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.f46293o0 = peerDialogId;
        }
        this.f46294p0 = j3;
        this.f46295q0 = false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        V();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f46301w0 = false;
        V();
        pc.h(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f46301w0 = true;
        V();
        pc.a(this.container, new d9(16));
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f46291l0 = auction;
        e0(this.f46301w0);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 13), this.resourcesProvider);
        this.f46302x0 = k61Var;
        k61Var.f25678r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
