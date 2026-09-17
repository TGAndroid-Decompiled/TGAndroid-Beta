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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.k7;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
import org.telegram.ui.m91;
import w7.z5;
import yh.n7;
import yh.v5;
import yh.y7;
public final class m extends za implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int A0 = 0;
    public final long X;
    public final j51 Y;
    public final yh.a Z;
    public final i f46007a0;
    public final yf.n f46008b0;
    public final h f46009c0;
    public final n6 f46010d0;
    public final n6 f46011e0;
    public final n6 f46012f0;
    public final org.telegram.ui.Cells.l4 f46013g0;
    public final org.telegram.ui.Components.n6 f46014h0;
    public final k f46015i0;
    public final k[] f46016j0;
    public final FrameLayout f46017k0;
    public GiftAuctionController.Auction f46018l0;
    public final l m0;
    public Runnable f46019n0;
    public long f46020o0;
    public long f46021p0;
    public boolean f46022q0;
    public final oq[] f46023r0;
    public x5 f46024s0;
    public final le.b f46025t0;
    public final le.b f46026u0;
    public final oq[] f46027v0;
    public boolean f46028w0;
    public x51 f46029x0;
    public boolean f46030y0;
    public boolean f46031z0;

    public m(Context context, f6 f6Var, l lVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, 2, f6Var);
        int i10;
        boolean z10;
        this.f46016j0 = new k[3];
        this.f46022q0 = true;
        this.f46023r0 = new oq[1];
        f fVar = new f(this);
        qr qrVar = qr.h;
        this.f46025t0 = new le.b(0, fVar, qrVar, 380L, false);
        this.f46026u0 = new le.b(0, new f(this), qrVar, 380L, false);
        this.f46027v0 = new oq[1];
        this.f46018l0 = auction;
        this.m0 = lVar;
        long j3 = auction.giftId;
        this.X = j3;
        this.R = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j3, this);
        this.f46008b0 = new yf.n(new f(this));
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
        this.Y = j51.j(-1, linearLayout);
        h hVar = new h(this, context, f6Var);
        this.f46009c0 = hVar;
        hVar.O = true;
        this.f46018l0.getMinimumBid();
        this.f46018l0.getCurrentMyBid();
        long currentTopBid = this.f46018l0.getCurrentTopBid();
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
        h hVar2 = this.f46009c0;
        hVar2.f47547e0 = iArr2;
        linearLayout.addView(hVar2, w7.x5.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        n6 n6Var = new n6(context, 29, f6Var);
        this.f46010d0 = n6Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i15 = j6.f18806a7;
        int themedColor = getThemedColor(i15);
        int h = i0.a.h(getThemedColor(j6.f18952i6), getThemedColor(i15));
        n6Var.setBackground(j6.i0(dp, dp, dp, dp, themedColor, h, h));
        n6Var.setOnClickListener(new g(this, 2));
        ((TextView) n6Var.f5075c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        n6 n6Var2 = new n6(context, 29, f6Var);
        this.f46011e0 = n6Var2;
        n6Var2.setBackground(j6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) n6Var2.f5075c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        n6 n6Var3 = new n6(context, 29, f6Var);
        this.f46012f0 = n6Var3;
        n6Var3.setBackground(j6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) n6Var3.f5075c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(n6Var, w7.x5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), w7.x5.l(0.0f, 10, -1));
        linearLayout2.addView(n6Var2, w7.x5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), w7.x5.l(0.0f, 10, -1));
        linearLayout2.addView(n6Var3, w7.x5.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, w7.x5.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            c90 c90Var = new c90(context, f6Var);
            c90Var.setGravity(17);
            c90Var.setTextSize(1, 16.0f);
            int i16 = j6.J6;
            c90Var.setTextColor(j6.v0(i16, f6Var));
            c90Var.setLinkTextColor(j6.v0(i16, f6Var));
            c90Var.setOnClickListener(new xg.e(this, new boolean[1], f6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new x5(subscribeToGiftAuction.giftDocumentId, c90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            c90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            z5.b(c90Var, 0.02f, 1.5f);
            linearLayout.addView(c90Var, w7.x5.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = j6.L6;
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, i17, 21, 0, 0, false, true, f6Var);
        this.f46013g0 = l4Var;
        linearLayout.addView(l4Var, w7.x5.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.n6 n6Var4 = new org.telegram.ui.Components.n6(context, false, false, false);
        this.f46014h0 = n6Var4;
        n6Var4.setTextSize(AndroidUtilities.dp(12.5f));
        n6Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n6Var4.setSizeableBackground(j6.Z(0, 0, 9, 9));
        n6Var4.setHideBackgroundIfEmpty(true);
        l4Var.setOnWidthUpdateListener(new rg.w1(this, 12));
        l4Var.addView(n6Var4, w7.x5.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        k kVar = new k(context, f6Var);
        this.f46015i0 = kVar;
        kVar.f45968b.setTextColor(getThemedColor(i17));
        kVar.c(user);
        linearLayout.addView(kVar, w7.x5.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, i17, 21, 15, 0, false, false, f6Var);
        l4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(l4Var2, w7.x5.n(-1, -2));
        int i18 = 0;
        while (true) {
            k[] kVarArr = this.f46016j0;
            if (i18 >= kVarArr.length) {
                break;
            }
            kVarArr[i18] = new k(context, f6Var);
            int i19 = i18 + 1;
            this.f46016j0[i18].b(i19, true, false);
            this.f46016j0[i18].setBackground(j6.K0(false));
            k kVar2 = this.f46016j0[i18];
            if (i18 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            kVar2.f45970f = z10;
            kVar2.setOnClickListener(new ai.e2(24));
            linearLayout.addView(this.f46016j0[i18], w7.x5.n(-1, -2));
            i18 = i19;
        }
        ?? dVar = new ci.d(context, f6Var, true);
        this.f46007a0 = dVar;
        dVar.e();
        FrameLayout.LayoutParams d = w7.x5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i20 = d.leftMargin;
        int i21 = this.backgroundPaddingLeft;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.containerView.addView((View) dVar, d);
        ml0 ml0Var = this.d;
        int i22 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new k7(4));
        long j10 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j10 > 0) {
            this.f46009c0.setValue((int) j10);
        } else {
            this.f46009c0.setValue((int) subscribeToGiftAuction.getMinimumBid());
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
        this.container.addView(aVar, w7.x5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        z5.a(aVar);
        aVar.setOnClickListener(new m91(context, 1, f6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46017k0 = frameLayout;
        this.container.addView(frameLayout, w7.x5.e(-1, 100, 48));
        a0();
        this.f46029x0.N(false);
    }

    public static void P(m mVar, long j3) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
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
        Runnable runnable = mVar.f46019n0;
        if (runnable != null) {
            runnable.run();
        }
        mVar.dismiss();
    }

    public static void Q(m mVar) {
        int value = mVar.f46009c0.getValue();
        int minimumBid = (int) mVar.f46018l0.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(mVar.f46007a0);
            new vc(mVar.container, mVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
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
        FrameLayout frameLayout = mVar.f46017k0;
        mVar.f46007a0.setLoading(false);
        mVar.f46031z0 = false;
        if (bool != null) {
            if (j3 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kc kcVar = new kc(mVar.getContext(), mVar.resourcesProvider);
            kcVar.f25611a.setImageResource(R.drawable.filled_gift_sell_24);
            if (z10) {
                i10 = R.string.Gift2AuctionsBidHasBeenIncreased;
            } else {
                i10 = R.string.Gift2AuctionsBidHasBeenPlaced;
            }
            String string = LocaleController.getString(i10);
            TextView textView = kcVar.f25612b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.f46018l0.gift.gifts_per_round));
            TextView textView2 = kcVar.f25613c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            mVar.Y();
            oc.f(frameLayout, kcVar, 2750).j();
            v5.y(mVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            mVar.Y();
            hg.k0.s(R.string.UnknownErrorCode, new Object[]{str}, new vc(frameLayout, mVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(m mVar, int i10) {
        mVar.f46009c0.f(ai.g0.b(mVar.currentAccount, i10, 3), ai.g0.b(mVar.currentAccount, i10, 4), true);
        mVar.c0(mVar.f46028w0);
        mVar.d0(mVar.f46028w0);
        mVar.Z(mVar.f46028w0);
        mVar.W();
    }

    public static void U(m mVar) {
        Context context = mVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, mVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
        c2Var.R = string;
        c2Var.T = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.f46018l0.gift.gifts_per_round));
        b6 b6Var = new b6(context, mVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        b6Var.setTextSize(1, 18.0f);
        b6Var.setTextColor(j6.v0(j6.f18969j5, mVar.resourcesProvider));
        b6Var.setHintColor(j6.v0(j6.Xh, mVar.resourcesProvider));
        b6Var.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        b6Var.setFocusable(true);
        b6Var.setInputType(2);
        b6Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        b6Var.setLineColors(j6.v0(j6.f18990k6, mVar.resourcesProvider), j6.v0(j6.f19008l6, mVar.resourcesProvider), j6.v0(j6.f19082p7, mVar.resourcesProvider));
        b6Var.setImeOptions(268435462);
        b6Var.setBackgroundDrawable(null);
        b6Var.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        b6Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        b6Var.addTextChangedListener(new j(mVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(b6Var, w7.x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.f18490a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new tg.d(9, mVar, b6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new t0.a(25));
        org.telegram.ui.ActionBar.c2[] c2VarArr = {c2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        c2VarArr[0].setOnDismissListener(new ei.t0(b6Var, R, findActivity, 5));
        c2VarArr[0].setOnShowListener(new hg.r(2, b6Var));
        c2VarArr[0].show();
        View d = c2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        c2VarArr[0].f18503h0 = false;
        b6Var.setSelection(b6Var.getText().length());
    }

    public final void V() {
        boolean z10;
        float f7;
        if (this.f46028w0 && !isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f46030y0 != z10) {
            this.f46030y0 = z10;
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
        h hVar = this.f46009c0;
        int value = hVar.getValue();
        if (hVar.getProgress() > 0.99f) {
            hVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f46018l0.auctionUserState;
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
        if (this.f46031z0) {
            return;
        }
        long j3 = this.f46018l0.auctionUserState.bid_amount;
        long j10 = i10;
        if (j3 > 0) {
            j10 -= j3;
        }
        long j11 = j10;
        if (v5.y(this.currentAccount, false).e && v5.y(this.currentAccount, false).q(false, false, null).amount < j11) {
            new n7(getContext(), this.resourcesProvider, j11, 14, null, null, 0L).show();
            return;
        }
        this.f46031z0 = true;
        this.f46007a0.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.X, this.m0, i10, new fi.o0(this, j3, 3));
    }

    public final void Y() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null && this.containerView != null && (frameLayout = this.f46017k0) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
        }
    }

    public final void Z(boolean z10) {
        long value = this.f46009c0.getValue();
        long currentMyBid = this.f46018l0.getCurrentMyBid();
        i iVar = this.f46007a0;
        if (value == currentMyBid) {
            iVar.g(LocaleController.getString(R.string.OK), z10, true);
            iVar.setOnClickListener(new g(this, 0));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f46018l0.auctionUserState;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        oq[] oqVarArr = this.f46027v0;
        if (j3 < value && !tL_StarGiftAuctionUserState.returned) {
            iVar.g(y7.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j3, ',')), oqVarArr), z10, true);
        } else {
            iVar.g(y7.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), oqVarArr), z10, true);
        }
        iVar.setOnClickListener(new g(this, 1));
    }

    public final void a0() {
        int d = i0.a.d(this.f46025t0.e, i0.a.d(this.f46026u0.e, getThemedColor(j6.L6), getThemedColor(j6.f19100q7)), getThemedColor(j6.uj));
        this.f46013g0.setTextColor(d);
        org.telegram.ui.Components.n6 n6Var = this.f46014h0;
        n6Var.setTextColor(d);
        this.f46015i0.f45968b.setTextColor(d);
        if (j6.B1(n6Var.getSizeableBackground(), j6.l1(0.15f, d), false)) {
            n6Var.invalidate();
        }
    }

    public final void b0(long j3, boolean z10) {
        String formatDurationNoHours;
        org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f46011e0.f5074b;
        if (j3 >= 3600) {
            formatDurationNoHours = AndroidUtilities.formatFullDuration((int) j3);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j3, true);
        }
        n6Var.c(formatDurationNoHours, z10, true);
    }

    public final void c0(boolean z10) {
        int i10;
        long value = this.f46009c0.getValue();
        int approximatedMyPlace = this.f46018l0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.f46018l0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.f46018l0.getCurrentMyBid());
        k kVar = this.f46015i0;
        kVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        kVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.f46018l0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        org.telegram.ui.Components.n6 n6Var = this.f46014h0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.f46018l0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.f46018l0;
            if (auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars <= auction2.gift.availability_total) {
                n6Var.setText(this.f46018l0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        n6Var.setText(null);
    }

    public final void d0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.f46018l0.getBidStatus();
        long j3 = this.f46018l0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.l4 l4Var = this.f46013g0;
        boolean z12 = false;
        if (this.f46009c0.getValue() > j3) {
            l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
        } else {
            z11 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z10);
                z11 = false;
                z12 = true;
            } else {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
            }
            this.f46025t0.a(z12, z10);
            this.f46026u0.a(z11, z10);
        }
        z11 = false;
        this.f46025t0.a(z12, z10);
        this.f46026u0.a(z11, z10);
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        this.f46008b0.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        org.telegram.ui.ActionBar.o2 R;
        int i10;
        ((org.telegram.ui.Components.n6) this.f46010d0.f5074b).c(y7.X0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.f46018l0.getMinimumBid(), ','), 0.78f, this.f46023r0), z10, true);
        if (this.f46018l0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.f46018l0.isUpcoming(currentTime);
            yf.n nVar = this.f46008b0;
            if (isUpcoming) {
                long max = Math.max(0, this.f46018l0.auctionStateActive.start_date - currentTime);
                nVar.a(max);
                b0(max, z10);
            } else {
                long max2 = Math.max(0, this.f46018l0.auctionStateActive.next_round_at - currentTime);
                nVar.a(max2);
                b0(max2, z10);
            }
            x5 x5Var = this.f46024s0;
            n6 n6Var = this.f46012f0;
            if (x5Var == null && this.f46018l0.gift.sticker != null) {
                this.f46024s0 = new x5(this.f46018l0.gift.sticker.f18127id, ((org.telegram.ui.Components.n6) n6Var.f5074b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f46024s0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f46024s0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.f46018l0.auctionStateActive.gifts_left, ','));
            ((org.telegram.ui.Components.n6) n6Var.f5074b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f46011e0.f5075c;
            if (this.f46018l0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f46018l0.auctionStateActive;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i10 = R.string.Gift2AuctionBidInfoUntilEndRound;
                } else {
                    i10 = R.string.Gift2AuctionBidInfoUntilNextRound;
                }
            }
            textView.setText(LocaleController.getString(i10));
            k[] kVarArr = this.f46016j0;
            int min = Math.min(kVarArr.length, this.f46018l0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l4 = this.f46018l0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l4.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l4);
                    if (user != null) {
                        kVarArr[i11].c(user);
                    }
                    kVarArr[i11].a(this.f46018l0.approximateBidAmountFromPlace(i12), z10);
                    kVarArr[i11].setOnClickListener(new ai.a3(this, longValue, 4));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.f46018l0;
        h hVar = this.f46009c0;
        hVar.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        hVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.f46018l0.gift.gifts_per_round, new Object[0]));
        c0(z10);
        d0(z10);
        Z(z10);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.f46018l0.auctionUserState.peer);
        long j3 = this.f46018l0.auctionUserState.acquired_count;
        if (this.f46021p0 < j3 && !this.f46022q0 && (R = LaunchActivity.R()) != null) {
            long j10 = this.f46020o0;
            if (j10 != 0) {
                bo R9 = bo.R9(j10);
                R9.whenFullyVisible(new ng.b(R9, 1));
                R.presentFragment(R9);
                Runnable runnable = this.f46019n0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.f46020o0 = peerDialogId;
        }
        this.f46021p0 = j3;
        this.f46022q0 = false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        V();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f46028w0 = false;
        V();
        oc.h(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f46028w0 = true;
        V();
        oc.a(this.container, new d9(16));
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f46018l0 = auction;
        e0(this.f46028w0);
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 13), this.resourcesProvider);
        this.f46029x0 = x51Var;
        x51Var.f29851r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
