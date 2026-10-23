package yh;

import ai.dd;
import ai.ha;
import ai.nd;
import ai.qd;
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
import ei.o8;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.sn;
import w7.b6;
import w7.z5;
public final class m extends bb implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int A0 = 0;
    public final long X;
    public final m61 Y;
    public final ai.c Z;
    public final i f50837a0;
    public final zf.n f50838b0;
    public final h f50839c0;
    public final sg.t0 f50840d0;
    public final sg.t0 f50841e0;
    public final sg.t0 f50842f0;
    public final org.telegram.ui.Cells.l4 f50843g0;
    public final q6 f50844h0;
    public final k f50845i0;
    public final k[] f50846j0;
    public final FrameLayout f50847k0;
    public GiftAuctionController.Auction f50848l0;
    public final l m0;
    public Runnable f50849n0;
    public long f50850o0;
    public long f50851p0;
    public boolean f50852q0;
    public final xq[] f50853r0;
    public a6 f50854s0;
    public final ne.b f50855t0;
    public final ne.b f50856u0;
    public final xq[] f50857v0;
    public boolean f50858w0;
    public b71 f50859x0;
    public boolean f50860y0;
    public boolean f50861z0;

    public m(Context context, g6 g6Var, l lVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, 2, g6Var);
        int i10;
        boolean z10;
        this.f50846j0 = new k[3];
        this.f50852q0 = true;
        this.f50853r0 = new xq[1];
        f fVar = new f(this);
        bs bsVar = bs.h;
        this.f50855t0 = new ne.b(0, fVar, bsVar, 380L, false);
        this.f50856u0 = new ne.b(0, new f(this), bsVar, 380L, false);
        this.f50857v0 = new xq[1];
        this.f50848l0 = auction;
        this.m0 = lVar;
        long j10 = auction.giftId;
        this.X = j10;
        this.R = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.f50838b0 = new zf.n(new f(this));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        v.S(this.e, context, g6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Y = m61.j(-1, linearLayout);
        h hVar = new h(this, context, g6Var);
        this.f50839c0 = hVar;
        hVar.O = true;
        this.f50848l0.getMinimumBid();
        this.f50848l0.getCurrentMyBid();
        long currentTopBid = this.f50848l0.getCurrentTopBid();
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
        h hVar2 = this.f50839c0;
        hVar2.f1580e0 = iArr2;
        linearLayout.addView(hVar2, z5.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        sg.t0 t0Var = new sg.t0(context, g6Var);
        this.f50840d0 = t0Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i15 = k6.f21125a7;
        int themedColor = getThemedColor(i15);
        int k10 = i0.a.k(getThemedColor(k6.f21272i6), getThemedColor(i15));
        org.telegram.ui.Cells.y j02 = k6.j0(dp, dp, dp, dp, themedColor, k10, k10);
        n6 O = r6.O(i15);
        t0Var.setBackground(j02);
        r6.k(t0Var, j02, O, null, g6Var);
        t0Var.setOnClickListener(new g(this, 2));
        ((TextView) t0Var.f46867c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        sg.t0 t0Var2 = new sg.t0(context, g6Var);
        this.f50841e0 = t0Var2;
        ShapeDrawable c02 = k6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i15));
        n6 O2 = r6.O(i15);
        t0Var2.setBackground(c02);
        r6.k(t0Var2, c02, O2, null, g6Var);
        ((TextView) t0Var2.f46867c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        sg.t0 t0Var3 = new sg.t0(context, g6Var);
        this.f50842f0 = t0Var3;
        ShapeDrawable c03 = k6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i15));
        n6 O3 = r6.O(i15);
        t0Var3.setBackground(c03);
        r6.k(t0Var3, c03, O3, null, g6Var);
        ((TextView) t0Var3.f46867c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(t0Var, z5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), z5.l(0.0f, 10, -1));
        linearLayout2.addView(t0Var2, z5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), z5.l(0.0f, 10, -1));
        linearLayout2.addView(t0Var3, z5.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, z5.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            y90 y90Var = new y90(context, g6Var);
            y90Var.setGravity(17);
            y90Var.setTextSize(1, 16.0f);
            int i16 = k6.J6;
            r6.W(y90Var, i16, g6Var);
            r6.I(y90Var, i16, g6Var);
            y90Var.setOnClickListener(new t41(this, new boolean[1], g6Var, 5));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new a6(subscribeToGiftAuction.giftDocumentId, y90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            y90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            b6.b(y90Var, 0.02f, 1.5f);
            linearLayout.addView(y90Var, z5.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = k6.L6;
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, i17, 21, 0, 0, false, true, g6Var);
        this.f50843g0 = l4Var;
        linearLayout.addView(l4Var, z5.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        q6 q6Var = new q6(context, false, false, false);
        this.f50844h0 = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(12.5f));
        q6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        q6Var.setSizeableBackground(k6.a0(0, 0, 9, 9));
        q6Var.setHideBackgroundIfEmpty(true);
        l4Var.setOnWidthUpdateListener(new tg.p(this, 13));
        l4Var.addView(q6Var, z5.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        k kVar = new k(context, g6Var);
        this.f50845i0 = kVar;
        q6 q6Var2 = kVar.f50791b;
        r6.r(q6Var2);
        q6Var2.setTextColor(getThemedColor(i17));
        kVar.c(user);
        linearLayout.addView(kVar, z5.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, i17, 21, 15, 0, false, false, g6Var);
        l4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(l4Var2, z5.n(-1, -2));
        int i18 = 0;
        while (true) {
            k[] kVarArr = this.f50846j0;
            if (i18 >= kVarArr.length) {
                break;
            }
            kVarArr[i18] = new k(context, g6Var);
            int i19 = i18 + 1;
            this.f50846j0[i18].b(i19, true, false);
            this.f50846j0[i18].setBackground(k6.M0(false));
            k kVar2 = this.f50846j0[i18];
            if (i18 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            kVar2.f50793f = z10;
            kVar2.setOnClickListener(new ah.f(27));
            linearLayout.addView(this.f50846j0[i18], z5.n(-1, -2));
            i18 = i19;
        }
        ?? dVar = new ei.d(context, g6Var, true);
        this.f50837a0 = dVar;
        dVar.f();
        FrameLayout.LayoutParams d = z5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i20 = d.leftMargin;
        int i21 = this.backgroundPaddingLeft;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.containerView.addView((View) dVar, d);
        mm0 mm0Var = this.d;
        int i22 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new n7(4));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.f50839c0.setValue((int) j11);
        } else {
            this.f50839c0.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        ai.c cVar = new ai.c(context, this.currentAccount, g6Var);
        this.Z = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, z5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        b6.a(cVar);
        cVar.setOnClickListener(new qd(context, 2, g6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50847k0 = frameLayout;
        this.container.addView(frameLayout, z5.e(-1, 100, 48));
        a0();
        this.f50859x0.N(false);
    }

    public static void P(m mVar, long j10) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
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
        Runnable runnable = mVar.f50849n0;
        if (runnable != null) {
            runnable.run();
        }
        mVar.dismiss();
    }

    public static void Q(m mVar) {
        int value = mVar.f50839c0.getValue();
        int minimumBid = (int) mVar.f50848l0.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(mVar.f50837a0);
            new xc(mVar.container, mVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
            return;
        }
        mVar.X(value);
    }

    public static void R(m mVar, boolean[] zArr, g6 g6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(mVar.currentAccount).getOrRequestAcquiredGifts(mVar.X, new ai.a4(mVar, zArr, g6Var, 12));
    }

    public static void S(m mVar, long j10, Boolean bool, String str) {
        boolean z10;
        int i10;
        FrameLayout frameLayout = mVar.f50847k0;
        mVar.f50837a0.setLoading(false);
        mVar.f50861z0 = false;
        if (bool != null) {
            if (j10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            mc mcVar = new mc(mVar.getContext(), mVar.resourcesProvider);
            mcVar.f28631a.setImageResource(R.drawable.filled_gift_sell_24);
            if (z10) {
                i10 = R.string.Gift2AuctionsBidHasBeenIncreased;
            } else {
                i10 = R.string.Gift2AuctionsBidHasBeenPlaced;
            }
            String string = LocaleController.getString(i10);
            TextView textView = mcVar.f28632b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.f50848l0.gift.gifts_per_round));
            TextView textView2 = mcVar.f28633c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            mVar.Y();
            qc.f(frameLayout, mcVar, 2750).j();
            ha.y(mVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            mVar.Y();
            i2.o1.t(R.string.UnknownErrorCode, new Object[]{str}, new xc(frameLayout, mVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(m mVar, int i10) {
        mVar.f50839c0.f(ci.u.b(mVar.currentAccount, i10, 3), ci.u.b(mVar.currentAccount, i10, 4), true);
        mVar.c0(mVar.f50858w0);
        mVar.d0(mVar.f50858w0);
        mVar.Z(mVar.f50858w0);
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
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
        c2Var.R = string;
        c2Var.T = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(mVar.f50848l0.gift.gifts_per_round));
        c6 c6Var = new c6(context, mVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        c6Var.setTextSize(1, 18.0f);
        r6.W(c6Var, k6.f21289j5, mVar.resourcesProvider);
        r6.m(c6Var, 34, k6.Xh, mVar.resourcesProvider);
        c6Var.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        c6Var.setFocusable(true);
        c6Var.setInputType(2);
        c6Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        r6.H(c6Var, k6.f21310k6, k6.f21327l6, k6.f21404p7, mVar.resourcesProvider);
        c6Var.setImeOptions(268435462);
        c6Var.setBackgroundDrawable(null);
        c6Var.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        c6Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        c6Var.addTextChangedListener(new j(mVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(c6Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        c2Var.f20742a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new e8(23, mVar, c6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new v0.k(13));
        org.telegram.ui.ActionBar.c2[] c2VarArr = {c2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        c2VarArr[0].setOnDismissListener(new gi.r0(c6Var, R, findActivity, 5));
        c2VarArr[0].setOnShowListener(new ig.r(c6Var, 2));
        c2VarArr[0].show();
        View d = c2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        c2VarArr[0].f20764j0 = false;
        c6Var.setSelection(c6Var.getText().length());
    }

    public final void V() {
        boolean z10;
        float f7;
        if (this.f50858w0 && !isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f50860y0 != z10) {
            this.f50860y0 = z10;
            ai.c cVar = this.Z;
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
                sl.s(scaleY, f11, 180L);
            }
        }
    }

    public final void W() {
        long j10;
        h hVar = this.f50839c0;
        int value = hVar.getValue();
        if (hVar.getProgress() > 0.99f) {
            hVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j11 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f50848l0.auctionUserState;
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
        if (this.f50861z0) {
            return;
        }
        long j11 = this.f50848l0.auctionUserState.bid_amount;
        if (j11 > 0) {
            j10 = i10 - j11;
        } else {
            j10 = i10;
        }
        long j12 = j10;
        if (ha.y(this.currentAccount, false).e && ha.y(this.currentAccount, false).q(false, false, null).amount < j12) {
            new dd(getContext(), this.resourcesProvider, j12, 14, null, null, 0L).show();
            return;
        }
        this.f50861z0 = true;
        this.f50837a0.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.X, this.m0, i10, new hi.n0(this, j11, 3));
    }

    public final void Y() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null && this.containerView != null && (frameLayout = this.f50847k0) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
        }
    }

    public final void Z(boolean z10) {
        long value = this.f50839c0.getValue();
        int i10 = (value > this.f50848l0.getCurrentMyBid() ? 1 : (value == this.f50848l0.getCurrentMyBid() ? 0 : -1));
        i iVar = this.f50837a0;
        if (i10 == 0) {
            iVar.i(LocaleController.getString(R.string.OK), z10, true);
            iVar.setOnClickListener(new g(this, 0));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f50848l0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        int i11 = (j10 > value ? 1 : (j10 == value ? 0 : -1));
        xq[] xqVarArr = this.f50857v0;
        if (i11 < 0 && !tL_StarGiftAuctionUserState.returned) {
            iVar.i(nd.W0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), xqVarArr), z10, true);
        } else {
            iVar.i(nd.W0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), xqVarArr), z10, true);
        }
        iVar.setOnClickListener(new g(this, 1));
    }

    public final void a0() {
        int f7 = i0.a.f(this.f50855t0.e, i0.a.f(this.f50856u0.e, getThemedColor(k6.L6), getThemedColor(k6.f21421q7)), getThemedColor(k6.uj));
        this.f50843g0.setTextColor(f7);
        q6 q6Var = this.f50844h0;
        q6Var.setTextColor(f7);
        this.f50845i0.f50791b.setTextColor(f7);
        if (k6.E1(q6Var.getSizeableBackground(), k6.o1(0.15f, f7), false)) {
            q6Var.invalidate();
        }
    }

    public final void b0(long j10, boolean z10) {
        String formatDurationNoHours;
        q6 q6Var = (q6) this.f50841e0.f46866b;
        if (j10 >= 3600) {
            formatDurationNoHours = AndroidUtilities.formatFullDuration((int) j10);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j10, true);
        }
        q6Var.c(formatDurationNoHours, z10, true);
    }

    public final void c0(boolean z10) {
        int i10;
        long value = this.f50839c0.getValue();
        int approximatedMyPlace = this.f50848l0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.f50848l0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.f50848l0.getCurrentMyBid());
        k kVar = this.f50845i0;
        kVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        kVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.f50848l0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        q6 q6Var = this.f50844h0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.f50848l0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.f50848l0;
            if (auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars <= auction2.gift.availability_total) {
                q6Var.setText(this.f50848l0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        q6Var.setText(null);
    }

    public final void d0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.f50848l0.getBidStatus();
        int i10 = (this.f50839c0.getValue() > this.f50848l0.auctionUserState.bid_amount ? 1 : (this.f50839c0.getValue() == this.f50848l0.auctionUserState.bid_amount ? 0 : -1));
        org.telegram.ui.Cells.l4 l4Var = this.f50843g0;
        boolean z12 = false;
        if (i10 > 0) {
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
            this.f50855t0.a(z12, z10);
            this.f50856u0.a(z11, z10);
        }
        z11 = false;
        this.f50855t0.a(z12, z10);
        this.f50856u0.a(z11, z10);
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        this.f50838b0.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        org.telegram.ui.ActionBar.o2 R;
        int i10;
        ((q6) this.f50840d0.f46866b).c(nd.Y0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.f50848l0.getMinimumBid(), ','), 0.78f, this.f50853r0), z10, true);
        if (this.f50848l0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.f50848l0.isUpcoming(currentTime);
            zf.n nVar = this.f50838b0;
            if (isUpcoming) {
                long max = Math.max(0, this.f50848l0.auctionStateActive.start_date - currentTime);
                nVar.a(max);
                b0(max, z10);
            } else {
                long max2 = Math.max(0, this.f50848l0.auctionStateActive.next_round_at - currentTime);
                nVar.a(max2);
                b0(max2, z10);
            }
            a6 a6Var = this.f50854s0;
            sg.t0 t0Var = this.f50842f0;
            if (a6Var == null && this.f50848l0.gift.sticker != null) {
                this.f50854s0 = new a6(this.f50848l0.gift.sticker.f20349id, ((q6) t0Var.f46866b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f50854s0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f50854s0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.f50848l0.auctionStateActive.gifts_left, ','));
            ((q6) t0Var.f46866b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f50841e0.f46867c;
            if (this.f50848l0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f50848l0.auctionStateActive;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i10 = R.string.Gift2AuctionBidInfoUntilEndRound;
                } else {
                    i10 = R.string.Gift2AuctionBidInfoUntilNextRound;
                }
            }
            textView.setText(LocaleController.getString(i10));
            k[] kVarArr = this.f50846j0;
            int min = Math.min(kVarArr.length, this.f50848l0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l4 = this.f50848l0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l4.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l4);
                    if (user != null) {
                        kVarArr[i11].c(user);
                    }
                    kVarArr[i11].a(this.f50848l0.approximateBidAmountFromPlace(i12), z10);
                    kVarArr[i11].setOnClickListener(new ci.a2(this, longValue, 4));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.f50848l0;
        h hVar = this.f50839c0;
        hVar.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        hVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.f50848l0.gift.gifts_per_round, new Object[0]));
        c0(z10);
        d0(z10);
        Z(z10);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.f50848l0.auctionUserState.peer);
        long j10 = this.f50848l0.auctionUserState.acquired_count;
        if (this.f50851p0 < j10 && !this.f50852q0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.f50850o0;
            if (j11 != 0) {
                sn W9 = sn.W9(j11);
                W9.whenFullyVisible(new og.b(W9, 1));
                R.presentFragment(W9);
                Runnable runnable = this.f50849n0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.f50850o0 = peerDialogId;
        }
        this.f50851p0 = j10;
        this.f50852q0 = false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        V();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f50858w0 = false;
        V();
        qc.h(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f50858w0 = true;
        V();
        qc.a(this.container, new o8(16));
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            if (this.f50843g0 != null && this.f50844h0 != null && this.f50845i0 != null) {
                a0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f50848l0 = auction;
        e0(this.f50858w0);
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(this.d, getContext(), this.currentAccount, 0, true, new hg.o(this, 24), this.resourcesProvider);
        this.f50859x0 = b71Var;
        b71Var.f24972r = false;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
