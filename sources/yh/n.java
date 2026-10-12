package yh;

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
import di.z8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p7;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import org.telegram.ui.u91;
import w7.a6;
import zh.e7;
import zh.n5;
public final class n extends db implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int A0 = 0;
    public final long X;
    public final l61 Y;
    public final zh.a Z;
    public final j f49007a0;
    public final zf.o f49008b0;
    public final i f49009c0;
    public final rg.m0 f49010d0;
    public final rg.m0 f49011e0;
    public final rg.m0 f49012f0;
    public final org.telegram.ui.Cells.m4 f49013g0;
    public final s6 f49014h0;
    public final l f49015i0;
    public final l[] f49016j0;
    public final FrameLayout f49017k0;
    public GiftAuctionController.Auction f49018l0;
    public final m m0;
    public Runnable f49019n0;
    public long f49020o0;
    public long f49021p0;
    public boolean f49022q0;
    public final br[] f49023r0;
    public b6 f49024s0;
    public final ne.b f49025t0;
    public final ne.b f49026u0;
    public final br[] f49027v0;
    public boolean f49028w0;
    public z61 f49029x0;
    public boolean f49030y0;
    public boolean f49031z0;

    public n(Context context, c6 c6Var, m mVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, 2, c6Var);
        int i10;
        boolean z10;
        this.f49016j0 = new l[3];
        this.f49022q0 = true;
        this.f49023r0 = new br[1];
        g gVar = new g(this);
        es esVar = es.h;
        this.f49025t0 = new ne.b(0, gVar, esVar, 380L, false);
        this.f49026u0 = new ne.b(0, new g(this), esVar, 380L, false);
        this.f49027v0 = new br[1];
        this.f49018l0 = auction;
        this.m0 = mVar;
        long j10 = auction.giftId;
        this.X = j10;
        this.R = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.f49008b0 = new zf.o(new g(this));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        w.T(this.e, context, c6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Y = l61.j(-1, linearLayout);
        i iVar = new i(this, context, c6Var);
        this.f49009c0 = iVar;
        iVar.O = true;
        this.f49018l0.getMinimumBid();
        this.f49018l0.getCurrentMyBid();
        long currentTopBid = this.f49018l0.getCurrentTopBid();
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
        i iVar2 = this.f49009c0;
        iVar2.f50464e0 = iArr2;
        linearLayout.addView(iVar2, a6.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        rg.m0 m0Var = new rg.m0(context, c6Var);
        this.f49010d0 = m0Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i15 = g6.f19843a7;
        int themedColor = getThemedColor(i15);
        int h = i0.a.h(getThemedColor(g6.f19990i6), getThemedColor(i15));
        m0Var.setBackground(g6.j0(dp, dp, dp, dp, themedColor, h, h));
        m0Var.setOnClickListener(new h(this, 2));
        ((TextView) m0Var.f44349c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        rg.m0 m0Var2 = new rg.m0(context, c6Var);
        this.f49011e0 = m0Var2;
        m0Var2.setBackground(g6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) m0Var2.f44349c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        rg.m0 m0Var3 = new rg.m0(context, c6Var);
        this.f49012f0 = m0Var3;
        m0Var3.setBackground(g6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) m0Var3.f44349c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(m0Var, a6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), a6.l(0.0f, 10, -1));
        linearLayout2.addView(m0Var2, a6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), a6.l(0.0f, 10, -1));
        linearLayout2.addView(m0Var3, a6.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, a6.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            da0 da0Var = new da0(context, c6Var);
            da0Var.setGravity(17);
            da0Var.setTextSize(1, 16.0f);
            int i16 = g6.J6;
            da0Var.setTextColor(g6.w0(i16, c6Var));
            da0Var.setLinkTextColor(g6.w0(i16, c6Var));
            da0Var.setOnClickListener(new yg.e(this, new boolean[1], c6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new b6(subscribeToGiftAuction.giftDocumentId, da0Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            da0Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            w7.c6.b(da0Var, 0.02f, 1.5f);
            linearLayout.addView(da0Var, a6.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = g6.L6;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, i17, 21, 0, 0, false, true, c6Var);
        this.f49013g0 = m4Var;
        linearLayout.addView(m4Var, a6.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        s6 s6Var = new s6(context, false, false, false);
        this.f49014h0 = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(12.5f));
        s6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        s6Var.setSizeableBackground(g6.a0(0, 0, 9, 9));
        s6Var.setHideBackgroundIfEmpty(true);
        m4Var.setOnWidthUpdateListener(new rh.j(this, 23));
        m4Var.addView(s6Var, a6.a(17.0f, 0.0f, 12.0f, 0.0f, 0.0f, -1, 51));
        l lVar = new l(context, c6Var);
        this.f49015i0 = lVar;
        lVar.f48951b.setTextColor(getThemedColor(i17));
        lVar.c(user);
        linearLayout.addView(lVar, a6.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, i17, 21, 15, 0, false, false, c6Var);
        m4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(m4Var2, a6.n(-1, -2));
        int i18 = 0;
        while (true) {
            l[] lVarArr = this.f49016j0;
            if (i18 >= lVarArr.length) {
                break;
            }
            lVarArr[i18] = new l(context, c6Var);
            int i19 = i18 + 1;
            this.f49016j0[i18].b(i19, true, false);
            this.f49016j0[i18].setBackground(g6.L0(false));
            l lVar2 = this.f49016j0[i18];
            if (i18 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            lVar2.f48953f = z10;
            lVar2.setOnClickListener(new ah.f(25));
            linearLayout.addView(this.f49016j0[i18], a6.n(-1, -2));
            i18 = i19;
        }
        ?? dVar = new di.d(context, c6Var, true);
        this.f49007a0 = dVar;
        dVar.e();
        FrameLayout.LayoutParams a2 = a6.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i20 = a2.leftMargin;
        int i21 = this.backgroundPaddingLeft;
        a2.leftMargin = i20 + i21;
        a2.rightMargin += i21;
        this.containerView.addView((View) dVar, a2);
        mm0 mm0Var = this.d;
        int i22 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new p7(4));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.f49009c0.setValue((int) j11);
        } else {
            this.f49009c0.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        f0(false);
        this.d.setOverScrollMode(2);
        zh.a aVar = new zh.a(context, this.currentAccount, c6Var);
        this.Z = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, a6.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        w7.c6.a(aVar);
        aVar.setOnClickListener(new u91(context, 1, c6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49017k0 = frameLayout;
        this.container.addView(frameLayout, a6.e(-1, 100, 48));
        b0();
        this.f49029x0.N(false);
    }

    public static void Q(n nVar, long j10) {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j10)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == UserConfig.getInstance(nVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = nVar.f49019n0;
        if (runnable != null) {
            runnable.run();
        }
        nVar.dismiss();
    }

    public static void R(n nVar) {
        int value = nVar.f49009c0.getValue();
        int minimumBid = (int) nVar.f49018l0.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(nVar.f49007a0);
            new zc(nVar.container, nVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
            return;
        }
        nVar.Y(value);
    }

    public static void S(n nVar, boolean[] zArr, c6 c6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(nVar.currentAccount).getOrRequestAcquiredGifts(nVar.X, new bi.q4(nVar, zArr, c6Var, 11));
    }

    public static void T(n nVar, long j10, Boolean bool, String str) {
        boolean z10;
        int i10;
        FrameLayout frameLayout = nVar.f49017k0;
        nVar.f49007a0.setLoading(false);
        nVar.f49031z0 = false;
        if (bool != null) {
            if (j10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            oc ocVar = new oc(nVar.getContext(), nVar.resourcesProvider);
            ocVar.f27936a.setImageResource(R.drawable.filled_gift_sell_24);
            if (z10) {
                i10 = R.string.Gift2AuctionsBidHasBeenIncreased;
            } else {
                i10 = R.string.Gift2AuctionsBidHasBeenPlaced;
            }
            String string = LocaleController.getString(i10);
            TextView textView = ocVar.f27937b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(nVar.f49018l0.gift.gifts_per_round));
            TextView textView2 = ocVar.f27938c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            nVar.Z();
            sc.f(frameLayout, ocVar, 2750).j();
            n5.y(nVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            nVar.Z();
            i2.d.q(R.string.UnknownErrorCode, new Object[]{str}, new zc(frameLayout, nVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void U(n nVar, int i10) {
        nVar.f49009c0.f(bi.z.b(nVar.currentAccount, i10, 3), bi.z.b(nVar.currentAccount, i10, 4), true);
        nVar.d0(nVar.f49028w0);
        nVar.e0(nVar.f49028w0);
        nVar.a0(nVar.f49028w0);
        nVar.X();
    }

    public static void V(n nVar) {
        Context context = nVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, nVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.R = string;
        a2Var.T = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(nVar.f49018l0.gift.gifts_per_round));
        org.telegram.ui.Cells.c6 c6Var = new org.telegram.ui.Cells.c6(context, nVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        c6Var.setTextSize(1, 18.0f);
        c6Var.setTextColor(g6.w0(g6.f20007j5, nVar.resourcesProvider));
        c6Var.setHintColor(g6.w0(g6.Xh, nVar.resourcesProvider));
        c6Var.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        c6Var.setFocusable(true);
        c6Var.setInputType(2);
        c6Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        c6Var.setLineColors(g6.w0(g6.f20028k6, nVar.resourcesProvider), g6.w0(g6.f20045l6, nVar.resourcesProvider), g6.w0(g6.f20122p7, nVar.resourcesProvider));
        c6Var.setImeOptions(268435462);
        c6Var.setBackgroundDrawable(null);
        c6Var.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        c6Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        c6Var.addTextChangedListener(new k(nVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(c6Var, a6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        a2Var.f19557a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new org.telegram.ui.web.c0(19, nVar, c6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new t0.a(27));
        org.telegram.ui.ActionBar.a2[] a2VarArr = {a2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        a2VarArr[0].setOnDismissListener(new fi.s0(c6Var, R, findActivity, 5));
        a2VarArr[0].setOnShowListener(new ig.r(2, c6Var));
        a2VarArr[0].show();
        View d = a2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        a2VarArr[0].f19570h0 = false;
        c6Var.setSelection(c6Var.getText().length());
    }

    @Override
    public final CharSequence A() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }

    public final void W() {
        boolean z10;
        float f7;
        if (this.f49028w0 && !isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f49030y0 != z10) {
            this.f49030y0 = z10;
            zh.a aVar = this.Z;
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
                yh.r(scaleY, f11, 180L);
            }
        }
    }

    public final void X() {
        long j10;
        i iVar = this.f49009c0;
        int value = iVar.getValue();
        if (iVar.getProgress() > 0.99f) {
            iVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j11 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f49018l0.auctionUserState;
        long j12 = tL_StarGiftAuctionUserState.bid_amount;
        if (j11 == j12) {
            iVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
        } else if (j12 > 0 && !tL_StarGiftAuctionUserState.returned) {
            if (j11 - j12 > 0) {
                iVar.g("+" + LocaleController.formatNumber(j10, ','));
                return;
            }
            iVar.g(null);
        } else {
            iVar.g(null);
        }
    }

    public final void Y(int i10) {
        long j10;
        if (this.f49031z0) {
            return;
        }
        long j11 = this.f49018l0.auctionUserState.bid_amount;
        if (j11 > 0) {
            j10 = i10 - j11;
        } else {
            j10 = i10;
        }
        long j12 = j10;
        if (n5.y(this.currentAccount, false).e && n5.y(this.currentAccount, false).q(false, false, null).amount < j12) {
            new e7(getContext(), this.resourcesProvider, j12, 14, null, null, 0L).show();
            return;
        }
        this.f49031z0 = true;
        this.f49007a0.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.X, this.m0, i10, new gi.o0(this, j11, 3));
    }

    public final void Z() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null && this.containerView != null && (frameLayout = this.f49017k0) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
        }
    }

    public final void a0(boolean z10) {
        long value = this.f49009c0.getValue();
        int i10 = (value > this.f49018l0.getCurrentMyBid() ? 1 : (value == this.f49018l0.getCurrentMyBid() ? 0 : -1));
        j jVar = this.f49007a0;
        if (i10 == 0) {
            jVar.g(LocaleController.getString(R.string.OK), z10, true);
            jVar.setOnClickListener(new h(this, 0));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f49018l0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        int i11 = (j10 > value ? 1 : (j10 == value ? 0 : -1));
        br[] brVarArr = this.f49027v0;
        if (i11 < 0 && !tL_StarGiftAuctionUserState.returned) {
            jVar.g(zh.p7.W0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), brVarArr), z10, true);
        } else {
            jVar.g(zh.p7.W0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), brVarArr), z10, true);
        }
        jVar.setOnClickListener(new h(this, 1));
    }

    public final void b0() {
        int d = i0.a.d(this.f49025t0.e, i0.a.d(this.f49026u0.e, getThemedColor(g6.L6), getThemedColor(g6.f20139q7)), getThemedColor(g6.uj));
        this.f49013g0.setTextColor(d);
        s6 s6Var = this.f49014h0;
        s6Var.setTextColor(d);
        this.f49015i0.f48951b.setTextColor(d);
        if (g6.C1(s6Var.getSizeableBackground(), g6.m1(0.15f, d), false)) {
            s6Var.invalidate();
        }
    }

    public final void c0(long j10, boolean z10) {
        String formatDurationNoHours;
        s6 s6Var = (s6) this.f49011e0.f44348b;
        if (j10 >= 3600) {
            formatDurationNoHours = AndroidUtilities.formatFullDuration((int) j10);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j10, true);
        }
        s6Var.c(formatDurationNoHours, z10, true);
    }

    public final void d0(boolean z10) {
        int i10;
        long value = this.f49009c0.getValue();
        int approximatedMyPlace = this.f49018l0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.f49018l0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.f49018l0.getCurrentMyBid());
        l lVar = this.f49015i0;
        lVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        lVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.f49018l0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        s6 s6Var = this.f49014h0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.f49018l0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.f49018l0;
            if (auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars <= auction2.gift.availability_total) {
                s6Var.setText(this.f49018l0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        s6Var.setText(null);
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        this.f49008b0.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.f49018l0.getBidStatus();
        int i10 = (this.f49009c0.getValue() > this.f49018l0.auctionUserState.bid_amount ? 1 : (this.f49009c0.getValue() == this.f49018l0.auctionUserState.bid_amount ? 0 : -1));
        org.telegram.ui.Cells.m4 m4Var = this.f49013g0;
        boolean z12 = false;
        if (i10 > 0) {
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
            this.f49025t0.a(z12, z10);
            this.f49026u0.a(z11, z10);
        }
        z11 = false;
        this.f49025t0.a(z12, z10);
        this.f49026u0.a(z11, z10);
    }

    public final void f0(boolean z10) {
        org.telegram.ui.ActionBar.m2 R;
        int i10;
        ((s6) this.f49010d0.f44348b).c(zh.p7.Y0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.f49018l0.getMinimumBid(), ','), 0.78f, this.f49023r0), z10, true);
        if (this.f49018l0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.f49018l0.isUpcoming(currentTime);
            zf.o oVar = this.f49008b0;
            if (isUpcoming) {
                long max = Math.max(0, this.f49018l0.auctionStateActive.start_date - currentTime);
                oVar.a(max);
                c0(max, z10);
            } else {
                long max2 = Math.max(0, this.f49018l0.auctionStateActive.next_round_at - currentTime);
                oVar.a(max2);
                c0(max2, z10);
            }
            b6 b6Var = this.f49024s0;
            rg.m0 m0Var = this.f49012f0;
            if (b6Var == null && this.f49018l0.gift.sticker != null) {
                this.f49024s0 = new b6(this.f49018l0.gift.sticker.f19222id, ((s6) m0Var.f44348b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f49024s0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f49024s0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.f49018l0.auctionStateActive.gifts_left, ','));
            ((s6) m0Var.f44348b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f49011e0.f44349c;
            if (this.f49018l0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f49018l0.auctionStateActive;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i10 = R.string.Gift2AuctionBidInfoUntilEndRound;
                } else {
                    i10 = R.string.Gift2AuctionBidInfoUntilNextRound;
                }
            }
            textView.setText(LocaleController.getString(i10));
            l[] lVarArr = this.f49016j0;
            int min = Math.min(lVarArr.length, this.f49018l0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l4 = this.f49018l0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l4.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l4);
                    if (user != null) {
                        lVarArr[i11].c(user);
                    }
                    lVarArr[i11].a(this.f49018l0.approximateBidAmountFromPlace(i12), z10);
                    lVarArr[i11].setOnClickListener(new bi.p2(this, longValue, 4));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.f49018l0;
        i iVar = this.f49009c0;
        iVar.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        iVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.f49018l0.gift.gifts_per_round, new Object[0]));
        d0(z10);
        e0(z10);
        a0(z10);
        X();
        long peerDialogId = DialogObject.getPeerDialogId(this.f49018l0.auctionUserState.peer);
        long j10 = this.f49018l0.auctionUserState.acquired_count;
        if (this.f49021p0 < j10 && !this.f49022q0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.f49020o0;
            if (j11 != 0) {
                fo W9 = fo.W9(j11);
                W9.whenFullyVisible(new og.b(W9, 1));
                R.presentFragment(W9);
                Runnable runnable = this.f49019n0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.f49020o0 = peerDialogId;
        }
        this.f49021p0 = j10;
        this.f49022q0 = false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        W();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f49028w0 = false;
        W();
        sc.h(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f49028w0 = true;
        W();
        sc.a(this.container, new z8(16));
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f49018l0 = auction;
        f0(this.f49028w0);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 13), this.resourcesProvider);
        this.f49029x0 = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }
}
