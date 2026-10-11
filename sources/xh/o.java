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
import ci.a9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ai;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n91;
import org.telegram.ui.zn;
import w7.x5;
import w7.z5;
import yh.e7;
import yh.n5;
import yh.p7;
public final class o extends db implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int A0 = 0;
    public final long X;
    public final r61 Y;
    public final yh.a Z;
    public final j f51487a0;
    public final yf.n f51488b0;
    public final i f51489c0;
    public final m f51490d0;
    public final m f51491e0;
    public final m f51492f0;
    public final org.telegram.ui.Cells.m4 f51493g0;
    public final r6 f51494h0;
    public final l f51495i0;
    public final l[] f51496j0;
    public final FrameLayout f51497k0;
    public GiftAuctionController.Auction f51498l0;
    public final n m0;
    public Runnable f51499n0;
    public long f51500o0;
    public long f51501p0;
    public boolean f51502q0;
    public final er[] f51503r0;
    public b6 f51504s0;
    public final me.b f51505t0;
    public final me.b f51506u0;
    public final er[] f51507v0;
    public boolean f51508w0;
    public e71 f51509x0;
    public boolean f51510y0;
    public boolean f51511z0;

    public o(Context context, d6 d6Var, n nVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, 2, d6Var);
        int i10;
        boolean z10;
        this.f51496j0 = new l[3];
        this.f51502q0 = true;
        this.f51503r0 = new er[1];
        g gVar = new g(this);
        is isVar = is.h;
        this.f51505t0 = new me.b(0, gVar, isVar, 380L, false);
        this.f51506u0 = new me.b(0, new g(this), isVar, 380L, false);
        this.f51507v0 = new er[1];
        this.f51498l0 = auction;
        this.m0 = nVar;
        long j3 = auction.giftId;
        this.X = j3;
        this.R = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j3, this);
        this.f51488b0 = new yf.n(new g(this));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        x.T(this.f25521e, context, d6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.Y = r61.j(-1, linearLayout);
        i iVar = new i(this, context, d6Var);
        this.f51489c0 = iVar;
        iVar.O = true;
        this.f51498l0.getMinimumBid();
        this.f51498l0.getCurrentMyBid();
        long currentTopBid = this.f51498l0.getCurrentTopBid();
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
        i iVar2 = this.f51489c0;
        iVar2.f52540e0 = iArr2;
        linearLayout.addView(iVar2, x5.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        m mVar = new m(context, d6Var);
        this.f51490d0 = mVar;
        int dp = AndroidUtilities.dp(12.0f);
        int i15 = h6.f20730a7;
        int themedColor = getThemedColor(i15);
        int h = i0.a.h(getThemedColor(h6.f20877i6), getThemedColor(i15));
        mVar.setBackground(h6.j0(dp, dp, dp, dp, themedColor, h, h));
        mVar.setOnClickListener(new h(this, 2));
        ((TextView) mVar.f51434b).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        m mVar2 = new m(context, d6Var);
        this.f51491e0 = mVar2;
        mVar2.setBackground(h6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) mVar2.f51434b).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        m mVar3 = new m(context, d6Var);
        this.f51492f0 = mVar3;
        mVar3.setBackground(h6.c0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) mVar3.f51434b).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(mVar, x5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), x5.l(0.0f, 10, -1));
        linearLayout2.addView(mVar2, x5.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), x5.l(0.0f, 10, -1));
        linearLayout2.addView(mVar3, x5.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, x5.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            fa0 fa0Var = new fa0(context, d6Var);
            fa0Var.setGravity(17);
            fa0Var.setTextSize(1, 16.0f);
            int i16 = h6.J6;
            fa0Var.setTextColor(h6.w0(i16, d6Var));
            fa0Var.setLinkTextColor(h6.w0(i16, d6Var));
            fa0Var.setOnClickListener(new xg.e(this, new boolean[1], d6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new b6(subscribeToGiftAuction.giftDocumentId, fa0Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            fa0Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            z5.b(fa0Var, 0.02f, 1.5f);
            linearLayout.addView(fa0Var, x5.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = h6.L6;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, i17, 21, 0, 0, false, true, d6Var);
        this.f51493g0 = m4Var;
        linearLayout.addView(m4Var, x5.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        r6 r6Var = new r6(context, false, false, false);
        this.f51494h0 = r6Var;
        r6Var.setTextSize(AndroidUtilities.dp(12.5f));
        r6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        r6Var.setSizeableBackground(h6.a0(0, 0, 9, 9));
        r6Var.setHideBackgroundIfEmpty(true);
        m4Var.setOnWidthUpdateListener(new rg.x1(this, 16));
        m4Var.addView(r6Var, x5.a(17.0f, 0.0f, 12.0f, 0.0f, 0.0f, -1, 51));
        l lVar = new l(context, d6Var);
        this.f51495i0 = lVar;
        lVar.f51415b.setTextColor(getThemedColor(i17));
        lVar.c(user);
        linearLayout.addView(lVar, x5.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, i17, 21, 15, 0, false, false, d6Var);
        m4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(m4Var2, x5.n(-1, -2));
        int i18 = 0;
        while (true) {
            l[] lVarArr = this.f51496j0;
            if (i18 >= lVarArr.length) {
                break;
            }
            lVarArr[i18] = new l(context, d6Var);
            int i19 = i18 + 1;
            this.f51496j0[i18].b(i19, true, false);
            this.f51496j0[i18].setBackground(h6.L0(false));
            l lVar2 = this.f51496j0[i18];
            if (i18 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            lVar2.f51418f = z10;
            lVar2.setOnClickListener(new ai.e2(24));
            linearLayout.addView(this.f51496j0[i18], x5.n(-1, -2));
            i18 = i19;
        }
        ?? dVar = new ci.d(context, d6Var, true);
        this.f51487a0 = dVar;
        dVar.e();
        FrameLayout.LayoutParams a2 = x5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80);
        int i20 = a2.leftMargin;
        int i21 = this.backgroundPaddingLeft;
        a2.leftMargin = i20 + i21;
        a2.rightMargin += i21;
        this.containerView.addView((View) dVar, a2);
        sm0 sm0Var = this.d;
        int i22 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new o7(4));
        long j10 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j10 > 0) {
            this.f51489c0.setValue((int) j10);
        } else {
            this.f51489c0.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        f0(false);
        this.d.setOverScrollMode(2);
        yh.a aVar = new yh.a(context, this.currentAccount, d6Var);
        this.Z = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(false);
        aVar.setClickable(false);
        this.container.addView(aVar, x5.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        z5.a(aVar);
        aVar.setOnClickListener(new n91(context, 1, d6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51497k0 = frameLayout;
        this.container.addView(frameLayout, x5.e(-1, 100, 48));
        b0();
        this.f51509x0.N(false);
    }

    public static void Q(o oVar, long j3) {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j3)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
                if (j3 == UserConfig.getInstance(oVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = oVar.f51499n0;
        if (runnable != null) {
            runnable.run();
        }
        oVar.dismiss();
    }

    public static void R(o oVar) {
        int value = oVar.f51489c0.getValue();
        int minimumBid = (int) oVar.f51498l0.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(oVar.f51487a0);
            new ad(oVar.container, oVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
            return;
        }
        oVar.Y(value);
    }

    public static void S(o oVar, boolean[] zArr, d6 d6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(oVar.currentAccount).getOrRequestAcquiredGifts(oVar.X, new d5(oVar, zArr, d6Var, 11));
    }

    public static void T(o oVar, long j3, Boolean bool, String str) {
        boolean z10;
        int i10;
        FrameLayout frameLayout = oVar.f51497k0;
        oVar.f51487a0.setLoading(false);
        oVar.f51511z0 = false;
        if (bool != null) {
            if (j3 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            oc ocVar = new oc(oVar.getContext(), oVar.resourcesProvider);
            ocVar.f29367a.setImageResource(R.drawable.filled_gift_sell_24);
            if (z10) {
                i10 = R.string.Gift2AuctionsBidHasBeenIncreased;
            } else {
                i10 = R.string.Gift2AuctionsBidHasBeenPlaced;
            }
            String string = LocaleController.getString(i10);
            TextView textView = ocVar.f29368b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(oVar.f51498l0.gift.gifts_per_round));
            TextView textView2 = ocVar.f29369c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            oVar.Z();
            sc.f(frameLayout, ocVar, 2750).j();
            n5.y(oVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            oVar.Z();
            hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new ad(frameLayout, oVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void U(o oVar, int i10) {
        oVar.f51489c0.f(ai.g0.b(oVar.currentAccount, i10, 3), ai.g0.b(oVar.currentAccount, i10, 4), true);
        oVar.d0(oVar.f51508w0);
        oVar.e0(oVar.f51508w0);
        oVar.a0(oVar.f51508w0);
        oVar.X();
    }

    public static void V(o oVar) {
        Context context = oVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, oVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        a2Var.R = string;
        a2Var.T = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(oVar.f51498l0.gift.gifts_per_round));
        c6 c6Var = new c6(context, oVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        c6Var.setTextSize(1, 18.0f);
        c6Var.setTextColor(h6.w0(h6.f20894j5, oVar.resourcesProvider));
        c6Var.setHintColor(h6.w0(h6.Xh, oVar.resourcesProvider));
        c6Var.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        c6Var.setFocusable(true);
        c6Var.setInputType(2);
        c6Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        c6Var.setLineColors(h6.w0(h6.f20914k6, oVar.resourcesProvider), h6.w0(h6.f20932l6, oVar.resourcesProvider), h6.w0(h6.f21007p7, oVar.resourcesProvider));
        c6Var.setImeOptions(268435462);
        c6Var.setBackgroundDrawable(null);
        c6Var.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        c6Var.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        c6Var.addTextChangedListener(new k(oVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(c6Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        a2Var.f20377a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new q9.p(16, oVar, c6Var));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new w9.v(3));
        org.telegram.ui.ActionBar.a2[] a2VarArr = {a2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        a2VarArr[0].setOnDismissListener(new ei.t0(c6Var, R, findActivity, 5));
        a2VarArr[0].setOnShowListener(new hg.s(2, c6Var));
        a2VarArr[0].show();
        View d = a2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        a2VarArr[0].f20391h0 = false;
        c6Var.setSelection(c6Var.getText().length());
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }

    public final void W() {
        boolean z10;
        float f7;
        if (this.f51508w0 && !isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f51510y0 != z10) {
            this.f51510y0 = z10;
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
                ai.s(scaleY, f11, 180L);
            }
        }
    }

    public final void X() {
        long j3;
        i iVar = this.f51489c0;
        int value = iVar.getValue();
        if (iVar.getProgress() > 0.99f) {
            iVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j10 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f51498l0.auctionUserState;
        long j11 = tL_StarGiftAuctionUserState.bid_amount;
        if (j10 == j11) {
            iVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
        } else if (j11 > 0 && !tL_StarGiftAuctionUserState.returned) {
            if (j10 - j11 > 0) {
                iVar.g("+" + LocaleController.formatNumber(j3, ','));
                return;
            }
            iVar.g(null);
        } else {
            iVar.g(null);
        }
    }

    public final void Y(int i10) {
        long j3;
        if (this.f51511z0) {
            return;
        }
        long j10 = this.f51498l0.auctionUserState.bid_amount;
        if (j10 > 0) {
            j3 = i10 - j10;
        } else {
            j3 = i10;
        }
        long j11 = j3;
        if (n5.y(this.currentAccount, false).f53000e && n5.y(this.currentAccount, false).q(false, false, null).amount < j11) {
            new e7(getContext(), this.resourcesProvider, j11, 14, null, null, 0L).show();
            return;
        }
        this.f51511z0 = true;
        this.f51487a0.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.X, this.m0, i10, new fi.o0(this, j10, 3));
    }

    public final void Z() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null && this.containerView != null && (frameLayout = this.f51497k0) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
        }
    }

    public final void a0(boolean z10) {
        long value = this.f51489c0.getValue();
        int i10 = (value > this.f51498l0.getCurrentMyBid() ? 1 : (value == this.f51498l0.getCurrentMyBid() ? 0 : -1));
        j jVar = this.f51487a0;
        if (i10 == 0) {
            jVar.g(LocaleController.getString(R.string.OK), z10, true);
            jVar.setOnClickListener(new h(this, 0));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f51498l0.auctionUserState;
        long j3 = tL_StarGiftAuctionUserState.bid_amount;
        int i11 = (j3 > value ? 1 : (j3 == value ? 0 : -1));
        er[] erVarArr = this.f51507v0;
        if (i11 < 0 && !tL_StarGiftAuctionUserState.returned) {
            jVar.g(p7.W0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j3, ',')), erVarArr), z10, true);
        } else {
            jVar.g(p7.W0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), erVarArr), z10, true);
        }
        jVar.setOnClickListener(new h(this, 1));
    }

    public final void b0() {
        int d = i0.a.d(this.f51505t0.f16365e, i0.a.d(this.f51506u0.f16365e, getThemedColor(h6.L6), getThemedColor(h6.f21026q7)), getThemedColor(h6.uj));
        this.f51493g0.setTextColor(d);
        r6 r6Var = this.f51494h0;
        r6Var.setTextColor(d);
        this.f51495i0.f51415b.setTextColor(d);
        if (h6.C1(r6Var.getSizeableBackground(), h6.m1(0.15f, d), false)) {
            r6Var.invalidate();
        }
    }

    public final void c0(long j3, boolean z10) {
        String formatDurationNoHours;
        r6 r6Var = (r6) this.f51491e0.f51435c;
        if (j3 >= 3600) {
            formatDurationNoHours = AndroidUtilities.formatFullDuration((int) j3);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j3, true);
        }
        r6Var.c(formatDurationNoHours, z10, true);
    }

    public final void d0(boolean z10) {
        int i10;
        long value = this.f51489c0.getValue();
        int approximatedMyPlace = this.f51498l0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.f51498l0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.f51498l0.getCurrentMyBid());
        l lVar = this.f51495i0;
        lVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        lVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.f51498l0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        r6 r6Var = this.f51494h0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.f51498l0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.f51498l0;
            if (auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars <= auction2.gift.availability_total) {
                r6Var.setText(this.f51498l0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        r6Var.setText(null);
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.X, this);
        this.f51488b0.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.f51498l0.getBidStatus();
        int i10 = (this.f51489c0.getValue() > this.f51498l0.auctionUserState.bid_amount ? 1 : (this.f51489c0.getValue() == this.f51498l0.auctionUserState.bid_amount ? 0 : -1));
        org.telegram.ui.Cells.m4 m4Var = this.f51493g0;
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
            this.f51505t0.a(z12, z10);
            this.f51506u0.a(z11, z10);
        }
        z11 = false;
        this.f51505t0.a(z12, z10);
        this.f51506u0.a(z11, z10);
    }

    public final void f0(boolean z10) {
        org.telegram.ui.ActionBar.m2 R;
        int i10;
        ((r6) this.f51490d0.f51435c).c(p7.Y0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.f51498l0.getMinimumBid(), ','), 0.78f, this.f51503r0), z10, true);
        if (this.f51498l0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.f51498l0.isUpcoming(currentTime);
            yf.n nVar = this.f51488b0;
            if (isUpcoming) {
                long max = Math.max(0, this.f51498l0.auctionStateActive.start_date - currentTime);
                nVar.a(max);
                c0(max, z10);
            } else {
                long max2 = Math.max(0, this.f51498l0.auctionStateActive.next_round_at - currentTime);
                nVar.a(max2);
                c0(max2, z10);
            }
            b6 b6Var = this.f51504s0;
            m mVar = this.f51492f0;
            if (b6Var == null && this.f51498l0.gift.sticker != null) {
                this.f51504s0 = new b6(this.f51498l0.gift.sticker.f20038id, ((r6) mVar.f51435c).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f51504s0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f51504s0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.f51498l0.auctionStateActive.gifts_left, ','));
            ((r6) mVar.f51435c).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f51491e0.f51434b;
            if (this.f51498l0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f51498l0.auctionStateActive;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i10 = R.string.Gift2AuctionBidInfoUntilEndRound;
                } else {
                    i10 = R.string.Gift2AuctionBidInfoUntilNextRound;
                }
            }
            textView.setText(LocaleController.getString(i10));
            l[] lVarArr = this.f51496j0;
            int min = Math.min(lVarArr.length, this.f51498l0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l4 = this.f51498l0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l4.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l4);
                    if (user != null) {
                        lVarArr[i11].c(user);
                    }
                    lVarArr[i11].a(this.f51498l0.approximateBidAmountFromPlace(i12), z10);
                    lVarArr[i11].setOnClickListener(new ai.b3(this, longValue, 4));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.f51498l0;
        i iVar = this.f51489c0;
        iVar.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        iVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.f51498l0.gift.gifts_per_round, new Object[0]));
        d0(z10);
        e0(z10);
        a0(z10);
        X();
        long peerDialogId = DialogObject.getPeerDialogId(this.f51498l0.auctionUserState.peer);
        long j3 = this.f51498l0.auctionUserState.acquired_count;
        if (this.f51501p0 < j3 && !this.f51502q0 && (R = LaunchActivity.R()) != null) {
            long j10 = this.f51500o0;
            if (j10 != 0) {
                zn W9 = zn.W9(j10);
                W9.whenFullyVisible(new ng.b(W9, 1));
                R.presentFragment(W9);
                Runnable runnable = this.f51499n0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.f51500o0 = peerDialogId;
        }
        this.f51501p0 = j3;
        this.f51502q0 = false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        super.onContainerTranslationYChanged(f7);
        W();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f51508w0 = false;
        W();
        sc.h(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f51508w0 = true;
        W();
        sc.a(this.container, new a9(16));
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f51498l0 = auction;
        f0(this.f51508w0);
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        e71 e71Var = new e71(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 13), this.resourcesProvider);
        this.f51509x0 = e71Var;
        e71Var.f25890r = false;
        return e71Var;
    }
}
