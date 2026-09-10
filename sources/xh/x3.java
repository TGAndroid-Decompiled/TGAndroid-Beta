package xh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import bi.ce;
import bi.l9;
import bi.ld;
import bi.r9;
import bi.ud;
import bi.va;
import bi.wa;
import bi.xd;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.messenger.qa;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.r21;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cp0;
import org.telegram.ui.eo;
import org.telegram.ui.fb1;
import org.telegram.ui.fl0;
import org.telegram.ui.fy0;
import org.telegram.ui.jo;
import org.telegram.ui.kw0;
import org.telegram.ui.nj0;
import org.telegram.ui.sw;
import org.telegram.ui.to;
import org.telegram.ui.ua;
import org.telegram.ui.wy;
import org.telegram.ui.ya0;
public class x3 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public static final int f46266q1 = 0;
    public final i2 A0;
    public boolean B0;
    public TL_stars.SavedStarGift C0;
    public o5 D0;
    public MessageObject E0;
    public String F0;
    public TL_stars.TL_starGiftUnique G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public j3 M0;
    public boolean N0;
    public k2 O0;
    public final int[] P0;
    public fg.n0 Q0;
    public int R0;
    public String S0;
    public wh.f4 T0;
    public uq U0;
    public boolean V0;
    public e2 W0;
    public final long X;
    public Float X0;
    public final org.telegram.ui.u5 Y;
    public f4.d Y0;
    public final h2 Z;
    public ValueAnimator Z0;
    public final y00 f46267a0;
    public uq f46268a1;
    public wh.l2 f46269b0;
    public boolean f46270b1;
    public wh.l2 f46271c0;
    public View f46272c1;
    public final j2 f46273d0;
    public wh.b2 f46274d1;
    public final u3 f46275e0;
    public boolean f46276e1;
    public final i2 f46277f0;
    public Boolean f46278f1;
    public final m90 f46279g0;
    public boolean f46280g1;
    public final b01 f46281h0;
    public ArrayList f46282h1;
    public final m90 f46283i0;
    public ArrayList f46284i1;
    public final bi.d f46285j0;
    public ArrayList f46286j1;
    public final FrameLayout f46287k0;
    public boolean f46288k1;
    public final m90 f46289l0;
    public TLRPC.PaymentForm l1;
    public final FrameLayout m0;
    public final uq[] f46290m1;
    public final View f46291n0;
    public final b1 f46292n1;
    public final FrameLayout f46293o0;
    public bi.x4 f46294o1;
    public w3 f46295p0;
    public View f46296p1;
    public boolean f46297q0;
    public final i2 f46298r0;
    public final di.l[] f46299s0;
    public final View f46300t0;
    public final LinearLayout f46301u0;
    public final tp f46302v0;
    public final TextView f46303w0;
    public boolean f46304x0;
    public final i2 f46305y0;
    public final TextView f46306z0;

    public x3(Context context, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        super(context, null, false, false, f6Var);
        this.f46297q0 = false;
        this.P0 = new int[2];
        this.R0 = -1;
        this.S0 = "";
        this.Y0 = new f4.d(0, 0);
        this.f46270b1 = true;
        this.f46290m1 = new uq[1];
        this.f46292n1 = new b1(this, 7);
        this.currentAccount = i10;
        this.X = j3;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new ld(this, context, 29);
        org.telegram.ui.u5 u5Var = new org.telegram.ui.u5(this, context);
        this.Y = u5Var;
        h2 h2Var = new h2(this, context);
        this.Z = h2Var;
        h2Var.setAdapter(new kw0(this, context, 5));
        t2();
        View view2 = new View(context);
        int i11 = org.telegram.ui.ActionBar.j6.f17998h5;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(view2, w7.a6.e(-1, 50, 80));
        this.containerView.addView(h2Var, w7.a6.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i11));
        AndroidUtilities.removeFromParent(this.d);
        u5Var.addView(this.d, w7.a6.e(-1, -1, 119));
        i2 i2Var = new i2(this, context, 0);
        this.f46277f0 = i2Var;
        i2Var.setOrientation(1);
        i2Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        u5Var.addView(i2Var, w7.a6.e(-1, -1, 55));
        m90 m90Var = new m90(context, f6Var);
        this.f46279g0 = m90Var;
        int i12 = org.telegram.ui.ActionBar.j6.f18161q5;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        m90Var.setTextSize(1, 12.0f);
        m90Var.setGravity(17);
        m90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        m90Var.setDisablePaddingsOffsetY(true);
        i2Var.addView(m90Var, w7.a6.t(-2, -2, 1, 4, -2, 4, 16));
        m90Var.setVisibility(8);
        b01 b01Var = new b01(context, f6Var);
        this.f46281h0 = b01Var;
        i2Var.addView(b01Var, w7.a6.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        m90 m90Var2 = new m90(context, f6Var);
        this.f46283i0 = m90Var2;
        m90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        m90Var2.setTextSize(1, 12.0f);
        m90Var2.setGravity(17);
        m90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.j6.Oh;
        m90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        m90Var2.setDisablePaddingsOffsetY(true);
        m90Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        i2Var.addView(m90Var2, w7.a6.t(-2, -2, 1, 4, 2, 4, 8));
        m90Var2.setVisibility(8);
        i2 i2Var2 = new i2(this, context, 1);
        this.f46298r0 = i2Var2;
        i2Var2.setOrientation(1);
        i2Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        u5Var.addView(i2Var2, w7.a6.e(-1, -1, 55));
        this.f46299s0 = r5;
        di.l lVar = new di.l(context, f6Var, false);
        lVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        i2Var2.addView(r5[0], w7.a6.n(-1, -2));
        di.l lVar2 = new di.l(context, f6Var, false);
        lVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        i2Var2.addView(r5[1], w7.a6.n(-1, -2));
        di.l lVar3 = new di.l(context, f6Var, false);
        di.l[] lVarArr = {lVar, lVar2, lVar3};
        lVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        i2Var2.addView(lVarArr[2], w7.a6.n(-1, -2));
        View view3 = new View(context);
        this.f46300t0 = view3;
        int i14 = org.telegram.ui.ActionBar.j6.f17929d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        i2Var2.addView(view3, w7.a6.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f46301u0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 6, 6));
        tp tpVar = new tp(context, 24, f6Var);
        this.f46302v0 = tpVar;
        tpVar.b(org.telegram.ui.ActionBar.j6.f18000h7, org.telegram.ui.ActionBar.j6.f18036j7, org.telegram.ui.ActionBar.j6.f18056k7);
        tpVar.setDrawUnchecked(true);
        tpVar.a(false, false);
        tpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(tpVar, w7.a6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f46303w0 = textView;
        int i15 = org.telegram.ui.ActionBar.j6.f18034j5;
        textView.setTextColor(getThemedColor(i15));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout.addView(textView, w7.a6.t(-2, -2, 16, 9, 0, 0, 0));
        i2Var2.addView(linearLayout, w7.a6.t(-2, -2, 1, 0, 0, 0, 4));
        w7.c6.b(linearLayout, 0.025f, 1.5f);
        i2 i2Var3 = new i2(this, context, 2);
        this.f46305y0 = i2Var3;
        i2Var3.setOrientation(1);
        i2Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        u5Var.addView(i2Var3, w7.a6.e(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.f46306z0 = textView2;
        em.n(i15, f6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        i2Var3.addView(textView2, w7.a6.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        em.n(i15, f6Var, textView3, 1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        i2Var3.addView(textView3, w7.a6.t(-1, -2, 7, 20, 6, 20, 24));
        di.l lVar4 = new di.l(context, f6Var, false);
        lVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        i2Var3.addView(r7[0], w7.a6.n(-1, -2));
        di.l lVar5 = new di.l(context, f6Var, false);
        lVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        i2Var3.addView(r7[1], w7.a6.n(-1, -2));
        di.l lVar6 = new di.l(context, f6Var, false);
        di.l[] lVarArr2 = {lVar4, lVar5, lVar6};
        lVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        i2Var3.addView(lVarArr2[2], w7.a6.n(-1, -2));
        i2 i2Var4 = new i2(this, context, 3);
        this.A0 = i2Var4;
        i2Var4.setOrientation(1);
        i2Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        u5Var.addView(i2Var4, w7.a6.e(-1, -1, 55));
        di.l lVar7 = new di.l(context, f6Var, false);
        lVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        i2Var4.addView(r9[0], w7.a6.n(-1, -2));
        di.l lVar8 = new di.l(context, f6Var, false);
        lVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        i2Var4.addView(r9[1], w7.a6.n(-1, -2));
        di.l lVar9 = new di.l(context, f6Var, false);
        di.l[] lVarArr3 = {lVar7, lVar8, lVar9};
        lVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        i2Var4.addView(lVarArr3[2], w7.a6.n(-1, -2));
        i2Var.setAlpha(1.0f);
        i2Var2.setAlpha(0.0f);
        i2Var3.setAlpha(0.0f);
        i2Var4.setAlpha(0.0f);
        u3 u3Var = new u3(context, f6Var, new b1(this, 9), new u0(this, 13), new u0(this, 14), new u0(this, 15), new u0(this, 16), new u0(this, 17), new u0(this, 18), new u0(this, 19));
        this.f46275e0 = u3Var;
        u3Var.L.f46248c.setOnClickListener(new u0(this, 20));
        int i16 = this.backgroundPaddingLeft;
        u3Var.setPadding(i16, 0, i16, 0);
        u5Var.addView(u3Var, w7.a6.e(-1, -2, 55));
        fg.a0 a0Var = this.f21450c;
        this.P = true;
        a0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46287k0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        View view4 = new View(context);
        this.f46291n0 = view4;
        view4.setBackgroundColor(getThemedColor(i14));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, w7.a6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        bi.d g10 = em.g(24, context, f6Var, true);
        this.f46285j0 = g10;
        g10.g(LocaleController.getString(R.string.OK), false, true);
        g10.f(null, false);
        FrameLayout.LayoutParams d = w7.a6.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        d.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(g10, d);
        u5Var.addView(frameLayout, w7.a6.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.m0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        m90 m90Var3 = new m90(context, null);
        this.f46289l0 = m90Var3;
        m90Var3.setTextSize(1, 12.0f);
        m90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        m90Var3.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        m90Var3.setGravity(17);
        frameLayout2.addView(m90Var3, w7.a6.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        u5Var.addView(frameLayout2, w7.a6.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new al0(this, 17));
        linearLayout.setOnClickListener(new u0(this, 12));
        y00 y00Var = new y00(context);
        this.f46267a0 = y00Var;
        u5Var.addView(y00Var, w7.a6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f46293o0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        u5Var.addView(frameLayout3, w7.a6.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.e);
        u5Var.addView(this.e, w7.a6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        j2 j2Var = new j2(context);
        this.f46273d0 = j2Var;
        u5Var.addView(j2Var, w7.a6.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.web.y1(j2Var, 19), 12.0f, 12, null, arrayList);
    }

    public static void A0(x3 x3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        l5 F;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            k1 k1Var = null;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                x3Var.dismiss();
                long A1 = x3Var.A1();
                if (!z10) {
                    v5.y(x3Var.currentAccount, false).Q(A1);
                }
                if (A1 >= 0) {
                    wc a02 = wc.a0(U);
                    if (z11) {
                        i12 = R.string.Gift2MadePrivateTitle;
                    } else {
                        i12 = R.string.Gift2MadePublicTitle;
                    }
                    String string = LocaleController.getString(i12);
                    if (z11) {
                        i13 = R.string.Gift2MadePrivate;
                    } else {
                        i13 = R.string.Gift2MadePublic;
                    }
                    String string2 = LocaleController.getString(i13);
                    if (!(U instanceof ProfileActivity)) {
                        k1Var = new k1(A1, U);
                    }
                    a02.s(document, string, AndroidUtilities.replaceSingleTag(string2, k1Var)).k(true);
                    return;
                }
                wc a03 = wc.a0(U);
                if (z11) {
                    i10 = R.string.Gift2ChannelMadePrivateTitle;
                } else {
                    i10 = R.string.Gift2ChannelMadePublicTitle;
                }
                String string3 = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.Gift2ChannelMadePrivate;
                } else {
                    i11 = R.string.Gift2ChannelMadePublic;
                }
                a03.s(document, string3, LocaleController.getString(i11)).j();
            } else if (tL_error != null) {
                if (z10 && x3Var.C0 != null && (F = v5.y(x3Var.currentAccount, false).F(x3Var.X, false)) != null) {
                    F.m(x3Var.C0, !savestargift.unsave);
                }
                x3Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
            }
        }
    }

    public static void B0(x3 x3Var, long j3) {
        new wh.p1(x3Var.getContext(), x3Var.currentAccount, j3, null, new x1(x3Var, 2)).show();
    }

    public static void C0(x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        boolean z10 = false;
        eVar.c(false);
        d2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            int i10 = 0;
            while (i10 < tL_starGiftUnique.attributes.size()) {
                if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                    tL_starGiftUnique.attributes.remove(i10);
                    i10--;
                }
                i10++;
            }
            TL_stars.SavedStarGift savedStarGift = x3Var.C0;
            if (savedStarGift != null) {
                z10 = savedStarGift.refunded;
            }
            x3Var.k2(tL_starGiftUnique, z10, null, null);
            AndroidUtilities.runOnUIThread(new u2.k0(16, x3Var, tL_starGiftUnique));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
            new o7(x3Var.getContext(), x3Var.resourcesProvider, j3, 16, null, new u2.k0(18, x3Var, charSequence), 0L).show();
        } else if (tL_error != null) {
            x3Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void D0(x3 x3Var, String str) {
        Context context = x3Var.getContext();
        nf.f.u(context, MessagesController.getInstance(x3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static String D1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return hc.b.l(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return LocaleController.getString(R.string.Gift2Gift);
        }
    }

    public static void E0(x3 x3Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, sg.p1[] p1VarArr, Long l4) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l4.longValue() == -99) {
            if (i10 < i11) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x3Var.getContext(), 0, x3Var.resourcesProvider);
                String string = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                d2Var.T = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
                hc.b.A(R.string.OK, alertDialog$Builder, null);
                return;
            }
            LinearLayout linearLayout = new LinearLayout(x3Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new z2(x3Var.getContext(), tL_starGiftUnique), w7.a6.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(x3Var.getContext());
            int i13 = org.telegram.ui.ActionBar.j6.f18034j5;
            em.x(i13, x3Var.resourcesProvider, textView, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, w7.a6.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(x3Var.getContext());
            em.n(i13, x3Var.resourcesProvider, textView2, 1, 16.0f);
            em.p(R.string.Gift2ExportTONFragmentText, new Object[]{x3Var.C1()}, textView2);
            linearLayout.addView(textView2, w7.a6.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(x3Var.getContext(), 0, x3Var.resourcesProvider);
            alertDialog$Builder2.n(linearLayout);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new sg.f0(11, x3Var, p1VarArr));
            hc.b.s(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        sx0 sx0Var = new sx0(x3Var, l4, p1VarArr, 29);
        if (l4.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(x3Var.currentAccount).getChatFull(-l4.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(x3Var.currentAccount).getInputChannel(-l4.longValue());
                ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(tL_channels_getFullChannel, new wh.s3(2, x3Var, sx0Var));
                return;
            } else if (!chatFull.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(x3Var.getContext(), 0, x3Var.resourcesProvider);
                String string2 = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder3.f17528a;
                d2Var2.R = string2;
                d2Var2.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                hc.b.A(R.string.OK, alertDialog$Builder3, null);
                return;
            }
        } else if (l4.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(x3Var.currentAccount).getUser(l4);
            TLRPC.UserFull userFull = MessagesController.getInstance(x3Var.currentAccount).getUserFull(l4.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new wc(p1VarArr[0].container, x3Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f17335id = MessagesController.getInstance(x3Var.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(tL_users_getFullUser, new l9(x3Var, p1VarArr, l4, sx0Var, 16));
                return;
            }
        }
        sx0Var.run();
    }

    public static void G0(x3 x3Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            int i10 = 0;
            MessagesController.getInstance(x3Var.currentAccount).putUsers(paymentForm.users, false);
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
            ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
            int size = arrayList.size();
            long j11 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new f1(x3Var, j3, j10, callback, j11));
            return;
        }
        callback.run(tL_error);
        pc Y = x3Var.getBulletinFactory().Y(tL_error);
        Y.f26091t = true;
        Y.j();
    }

    public static void H0(x3 x3Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        d2Var.c(400L);
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            x3Var.dismiss();
            v5.y(x3Var.currentAccount, false).Q(j3);
            if (j3 >= 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(x3Var.currentAccount).getUserFull(j10);
                if (userFull != null) {
                    int max = Math.max(0, userFull.stargifts_count - 1);
                    userFull.stargifts_count = max;
                    if (max <= 0) {
                        userFull.flags2 &= -257;
                    }
                }
                v5.y(x3Var.currentAccount, false).P();
                v5.y(x3Var.currentAccount, false).T(true);
                if (!(U instanceof z7)) {
                    z7 z7Var = new z7();
                    z7Var.whenFullyVisible(new va(z7Var, j11, 25));
                    U.presentFragment(z7Var);
                    return;
                }
                wc.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j11), R.raw.stars_topup).k(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            bundle.putBoolean("start_from_monetization", true);
            fb1 fb1Var = new fb1(bundle);
            p.g(x3Var.currentAccount).h(j3, true);
            p.g(x3Var.currentAccount).l(j3);
            fb1Var.whenFullyVisible(new va(fb1Var, j11, 26));
            U.presentFragment(fb1Var);
        } else if (tL_error != null) {
            x3Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
        } else {
            x3Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
        }
    }

    public static void I0(x3 x3Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        x3Var.G0 = tL_starGiftUnique;
        x3Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void J0(final long j3, final long j10, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error, final x3 x3Var) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(x3Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                x3.S(j3, j10, callback, tLObject, tL_error, x3Var);
            }
        });
    }

    public static String J1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return LocaleController.getString(R.string.GiftRarityUncommon);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return LocaleController.getString(R.string.GiftRarityRare);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return LocaleController.getString(R.string.GiftRarityEpic);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return LocaleController.getString(R.string.GiftRarityLegendary);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            int i10 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i10 <= 0) {
                return "<0.1%";
            }
            return di.m.G0(i10);
        } else {
            return "";
        }
    }

    public static void L0(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence, org.telegram.ui.ActionBar.d2 d2Var) {
        nf.e g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new sw(x3Var, g10, d2Var, tL_starGiftUnique, j3, charSequence));
    }

    public static void M0(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, yf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(x3Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new l1(x3Var, tL_starGiftUnique, aVar, runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new m1(x3Var, tL_error, runnable, 1));
        }
    }

    public static void N0(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.d2 d2Var) {
        x3Var.getClass();
        nf.e g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = x3Var.E1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(updatestargiftprice, new wa(x3Var, g10, tL_starGiftUnique, 21));
    }

    public static boolean N1(int i10, long j3) {
        if (j3 >= 0) {
            if (UserConfig.getInstance(i10).getClientUserId() == j3) {
                return true;
            }
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), 5);
    }

    public static void O0(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, yf.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o9 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = x3Var.E1();
        updatestargiftprice.resell_amount = o9;
        ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(updatestargiftprice, new a1(x3Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static boolean O1(int i10, long j3) {
        if (j3 >= 0) {
            if (UserConfig.getInstance(i10).getClientUserId() != j3) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        if (chat == null || !chat.creator) {
            return false;
        }
        return true;
    }

    public static void P(x3 x3Var, long j3) {
        new wh.p1(x3Var.getContext(), x3Var.currentAccount, j3, null, new x1(x3Var, 2)).show();
    }

    public static void P0(x3 x3Var, long j3) {
        new wh.p1(x3Var.getContext(), x3Var.currentAccount, j3, null, new x1(x3Var, 2)).show();
    }

    public static boolean P1(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
        if (i11 == 0) {
            return false;
        }
        if (i11 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f17425id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f17425id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void Q(x3 x3Var, String str) {
        Context context = x3Var.getContext();
        nf.f.u(context, MessagesController.getInstance(x3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void Q0(x3 x3Var, String str) {
        Context context = x3Var.getContext();
        nf.f.u(context, MessagesController.getInstance(x3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void R(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, wh.k0 k0Var, a3 a3Var, nf.e eVar) {
        eVar.d();
        v5.x(x3Var.currentAccount, a3Var.f45239a).h(a3Var.f45240b, tL_starGiftUnique, j3, tL_textWithEntities, z10, new cp0(x3Var, eVar, tL_starGiftUnique, j3, k0Var, 1));
    }

    public static void R0(x3 x3Var, TLObject tLObject, sx0 sx0Var, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(x3Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(x3Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
            MessagesController.getInstance(x3Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
            if (!tL_messages_chatFull.full_chat.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x3Var.getContext(), 0, x3Var.resourcesProvider);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                hc.b.A(R.string.OK, alertDialog$Builder, null);
                return;
            }
            sx0Var.run();
            return;
        }
        pc Y = x3Var.getBulletinFactory().Y(tL_error);
        Y.f26091t = true;
        Y.j();
    }

    public static void S(long j3, long j10, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, x3 x3Var) {
        long j11;
        x3 x3Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            if (tLObject instanceof TLRPC.Updates) {
                if (j3 >= 0 && j10 >= 0) {
                    eo R9 = eo.R9(j3);
                    j11 = j3;
                    x3Var2 = x3Var;
                    R9.whenFullyVisible(new t1(x3Var2, R9, j11, 0));
                    U.presentFragment(R9);
                } else {
                    j11 = j3;
                    x3Var2 = x3Var;
                    pc M = wc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var2.C1(), DialogObject.getShortName(j11))), R.raw.forward);
                    M.f26091t = true;
                    M.j();
                }
            } else {
                j11 = j3;
                x3Var2 = x3Var;
                wc.a0(U).d0(tL_error, false);
            }
        } else {
            j11 = j3;
            x3Var2 = x3Var;
        }
        v5.y(x3Var2.currentAccount, false).Q(j11);
        v5.y(x3Var2.currentAccount, false).Q(j10);
    }

    public static void S0(x3 x3Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        x3Var.f46276e1 = true;
        x3Var.i2(messageObject, null);
        x3Var.q2(0, true, null);
        y00 y00Var = x3Var.f46267a0;
        if (y00Var != null) {
            y00Var.c(true);
        }
        v5.y(x3Var.currentAccount, false).P();
        n5 G = v5.y(x3Var.currentAccount, false).G(UserConfig.getInstance(x3Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.j(arrayList, starGift);
        }
    }

    public static void T(x3 x3Var, org.telegram.ui.ActionBar.d2 d2Var, MessageObject messageObject) {
        d2Var.dismiss();
        x3Var.J0 = true;
        x3Var.i2(messageObject, null);
        super.show();
    }

    public static void T0(xh.x3 r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: xh.x3.T0(xh.x3, android.view.View):void");
    }

    public static void U(x3 x3Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.f17216id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(x3Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new n1(x3Var, tLObject, messageObject, 0));
        }
    }

    public static void U0(x3 x3Var, Long l4) {
        String str;
        String formatString;
        TLRPC.Chat chat;
        if (l4.longValue() < 0 && (chat = MessagesController.getInstance(x3Var.currentAccount).getChat(Long.valueOf(-l4.longValue()))) != null) {
            str = chat.title;
        } else {
            str = "";
        }
        wc bulletinFactory = x3Var.getBulletinFactory();
        int i10 = R.raw.contact_check;
        if (TextUtils.isEmpty(str)) {
            formatString = LocaleController.getString(R.string.GiftRepostedToProfile);
        } else {
            formatString = LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str);
        }
        pc Q = bulletinFactory.Q(i10, 36, AndroidUtilities.replaceTags(formatString));
        Q.f26091t = true;
        Q.j();
    }

    public static void V(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j3 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String C1 = x3Var.C1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
        d2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final x3 x3Var2 = x3.this;
                final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = C1;
                final long j10 = j3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        x3.Z0(x3.this, d2Var2, tLObject, document2, str4, str5, str6, j10, tL_error);
                    }
                });
            }
        });
    }

    public static void V0(x3 x3Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(x3Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(x3Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new u2.k0(19, x3Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new u2.k0(20, d2Var, tL_error));
    }

    public static void W(x3 x3Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        l5 F;
        TLRPC.Message message;
        bi.d dVar = x3Var.f46285j0;
        if (!dVar.N) {
            TL_stars.InputSavedStarGift E1 = x3Var.E1();
            MessageObject messageObject = x3Var.E0;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    z10 = tL_messageActionStarGift.saved;
                    document = tL_messageActionStarGift.gift.getDocument();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    z10 = tL_messageActionStarGiftUnique.saved;
                    document = tL_messageActionStarGiftUnique.gift.getDocument();
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = x3Var.C0;
                if (savedStarGift != null) {
                    z10 = !savedStarGift.unsaved;
                    document = savedStarGift.gift.getDocument();
                } else {
                    return;
                }
            }
            TLRPC.Document document2 = document;
            boolean z12 = z10;
            dVar.setLoading(true);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.unsave = z12;
            savestargift.stargift = E1;
            if (x3Var.C0 != null && (F = v5.y(x3Var.currentAccount, false).F(x3Var.X, false)) != null) {
                F.m(x3Var.C0, savestargift.unsave);
                z11 = true;
            } else {
                z11 = false;
            }
            ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(savestargift, new vh.g(x3Var, z11, document2, z12, savestargift));
        }
    }

    public static void W0(x3 x3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        if (x3Var.getContext() != null) {
            if (tL_error != null) {
                if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(new TL_account.getPassword(), new u1(x3Var, twoStepVerificationActivity, 1), 8);
                        return;
                    }
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                    wc.b0(tL_error);
                    return;
                }
                twoStepVerificationActivity.o0();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x3Var.getContext());
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
                LinearLayout linearLayout = new LinearLayout(x3Var.getContext());
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                TextView textView = new TextView(x3Var.getContext());
                int i16 = org.telegram.ui.ActionBar.j6.f18034j5;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                textView.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 48);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
                linearLayout.addView(textView, w7.a6.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(x3Var.getContext());
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView = new ImageView(x3Var.getContext());
                imageView.setImageResource(R.drawable.list_circle);
                if (LocaleController.isRTL) {
                    i11 = AndroidUtilities.dp(11.0f);
                } else {
                    i11 = 0;
                }
                int dp3 = AndroidUtilities.dp(9.0f);
                if (LocaleController.isRTL) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(11.0f);
                }
                imageView.setPadding(i11, dp3, dp, 0);
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                TextView textView2 = new TextView(x3Var.getContext());
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                textView2.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView2.setGravity(i12 | 48);
                org.telegram.messenger.a2.n(R.string.Gift2TransferToTONAlertText1, textView2);
                if (LocaleController.isRTL) {
                    linearLayout2.addView(textView2, w7.a6.n(-1, -2));
                    linearLayout2.addView(imageView, w7.a6.q(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, w7.a6.n(-2, -2));
                    linearLayout2.addView(textView2, w7.a6.n(-1, -2));
                }
                LinearLayout linearLayout3 = new LinearLayout(x3Var.getContext());
                linearLayout3.setOrientation(0);
                linearLayout.addView(linearLayout3, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView2 = new ImageView(x3Var.getContext());
                imageView2.setImageResource(R.drawable.list_circle);
                if (LocaleController.isRTL) {
                    i13 = AndroidUtilities.dp(11.0f);
                } else {
                    i13 = 0;
                }
                int dp4 = AndroidUtilities.dp(9.0f);
                if (LocaleController.isRTL) {
                    dp2 = 0;
                } else {
                    dp2 = AndroidUtilities.dp(11.0f);
                }
                imageView2.setPadding(i13, dp4, dp2, 0);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i16, false), mode));
                TextView textView3 = new TextView(x3Var.getContext());
                textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                textView3.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                textView3.setGravity(i14 | 48);
                org.telegram.messenger.a2.n(R.string.Gift2TransferToTONAlertText2, textView3);
                if (LocaleController.isRTL) {
                    linearLayout3.addView(textView3, w7.a6.n(-1, -2));
                    i15 = 5;
                    linearLayout3.addView(imageView2, w7.a6.q(-2, -2, 5));
                } else {
                    i15 = 5;
                    linearLayout3.addView(imageView2, w7.a6.n(-2, -2));
                    linearLayout3.addView(textView3, w7.a6.n(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new u2.c(x3Var, 21));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    TextView textView4 = new TextView(x3Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                    textView4.setTextSize(1, 16.0f);
                    if (!LocaleController.isRTL) {
                        i15 = 3;
                    }
                    textView4.setGravity(i15 | 48);
                    textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
                    linearLayout.addView(textView4, w7.a6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                }
                twoStepVerificationActivity.showDialog(alertDialog$Builder.f17528a);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                nf.f.u(x3Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
            }
        }
    }

    public static boolean X(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, wy wyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(x3Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j3) {
            org.telegram.ui.Components.d5.n0(x3Var.getContext(), x3Var.resourcesProvider, x3Var.currentAccount, tL_starGiftUnique, giftThemeUser, new ya0(x3Var, j3, tL_starGiftUnique, wyVar, 3));
            return true;
        }
        ChatThemeController.getInstance(x3Var.currentAccount).setDialogTheme(j3, new eg.b(null, tL_starGiftUnique.slug));
        wyVar.presentFragment(eo.R9(j3), true);
        return true;
    }

    public static void Y(x3 x3Var) {
        int i10;
        long j3;
        long j10;
        long j11;
        String string;
        final long clientUserId = UserConfig.getInstance(x3Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift E1 = x3Var.E1();
        if (E1 != null) {
            MessageObject messageObject = x3Var.E0;
            if (messageObject != null) {
                i10 = messageObject.messageOwner.date;
                boolean isOutOwner = messageObject.isOutOwner();
                MessageObject messageObject2 = x3Var.E0;
                TLRPC.Message message = messageObject2.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TLRPC.Peer peer = tL_messageActionStarGift.peer;
                        if (peer != null) {
                            j11 = DialogObject.getPeerDialogId(peer);
                        } else if (isOutOwner) {
                            j11 = messageObject2.getDialogId();
                        } else {
                            j11 = clientUserId;
                        }
                        TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
                        if (peer2 != null) {
                            j3 = DialogObject.getPeerDialogId(peer2);
                        } else if (isOutOwner) {
                            j3 = clientUserId;
                        } else {
                            j3 = x3Var.E0.getDialogId();
                        }
                        j10 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = x3Var.C0;
                if (savedStarGift != null) {
                    i10 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j3 = DialogObject.getPeerDialogId(savedStarGift.from_id);
                    } else {
                        j3 = 2666000;
                    }
                    j10 = x3Var.C0.convert_stars;
                    j11 = x3Var.X;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (MessagesController.getInstance(x3Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(x3Var.currentAccount).getCurrentTime() - i10)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x3Var.getContext(), 0, x3Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ConvertTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.R = string2;
            if (!UserObject.isService(j3) && j3 != 2666000) {
                string = DialogObject.getShortName(j3);
            } else {
                string = LocaleController.getString(R.string.StarsTransactionHidden);
            }
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, string, LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j10)));
            final long j12 = j10;
            final long j13 = j11;
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.c2() {
                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                    x3.l0(x3.this, E1, j13, clientUserId, j12);
                }
            });
            hc.b.s(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void Y0(x3 x3Var, String str, long j3) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f18485a = true;
        wh.h4 h4Var = new wh.h4(x3Var.X, str, j3, x3Var.resourcesProvider);
        h4Var.e = new x1(x3Var, 0);
        R.showAsSheet(h4Var, obj);
    }

    public static void Z(x3 x3Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, yc[] ycVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift B1 = x3Var.B1();
        GiftAuctionController.getInstance(x3Var.currentAccount).requestAuctionUpgrades(B1.gift_id, new ua(x3Var, B1, starGiftAttribute, ycVarArr, zArr, 5));
    }

    public static void Z0(x3 x3Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j3, TLRPC.TL_error tL_error) {
        b01 b01Var;
        TLRPC.Document document2;
        LinearLayout linearLayout;
        float f7;
        float f10;
        int round;
        d2Var.dismiss();
        if (tLObject instanceof TL_stars.UniqueStarGiftValueInfo) {
            TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
            org.telegram.ui.ActionBar.h3 i10 = em.i(1, x3Var.getContext(), x3Var.resourcesProvider, false);
            LinearLayout linearLayout2 = new LinearLayout(x3Var.getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            w9 w9Var = new w9(x3Var.getContext());
            z7.Z0(w9Var.getImageReceiver(), document, 160);
            linearLayout2.addView(w9Var, w7.a6.t(160, 160, 1, 0, 0, 0, 0));
            TextView textView = new TextView(x3Var.getContext());
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sh, x3Var.resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, x3Var.resourcesProvider)));
            textView.setGravity(17);
            linearLayout2.addView(textView, w7.a6.t(-2, 42, 1, 0, 12, 0, 15));
            textView.setText(str);
            TextView textView2 = new TextView(x3Var.getContext());
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, x3Var.resourcesProvider));
            textView2.setGravity(17);
            linearLayout2.addView(textView2, w7.a6.t(-2, -2, 1, 16, 0, 16, 19));
            if (uniqueStarGiftValueInfo.value_is_average) {
                em.p(R.string.GiftValueAverage, new Object[]{str2}, textView2);
            } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
                em.p(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
            } else {
                em.p(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
            }
            FrameLayout frameLayout = new FrameLayout(x3Var.getContext());
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            org.telegram.tgnet.g gVar = new org.telegram.tgnet.g(x3Var, new bi.x4[1], frameLayout, 8);
            b01 b01Var2 = new b01(x3Var.getContext(), x3Var.resourcesProvider);
            frameLayout.addView(b01Var2, w7.a6.e(-1, -1, 119));
            b01Var2.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
            String string = LocaleController.getString(R.string.GiftValueInitialPrice);
            StringBuilder sb2 = new StringBuilder("⭐️");
            sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
            sb2.append(" (~");
            b01Var2.c(string, z7.X0(false, a4.a.s(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                b01Var2.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
                if (((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100 > 0) {
                    b01Var2.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
                } else {
                    b01Var2.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                }
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                r1 r1Var = new r1(gVar, r10, uniqueStarGiftValueInfo, str2, 0);
                b01Var = b01Var2;
                TableRow e = b01Var.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", r1Var, null);
                yc[] ycVarArr = {(yc) ((yz0) e.getChildAt(1)).getChildAt(0)};
                e.setOnClickListener(new org.telegram.ui.web.c(r1Var, 17));
            } else {
                b01Var = b01Var2;
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                r1 r1Var2 = new r1(gVar, r10, uniqueStarGiftValueInfo, str2, 1);
                TableRow e7 = b01Var.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", r1Var2, null);
                yc[] ycVarArr2 = {(yc) ((yz0) e7.getChildAt(1)).getChildAt(0)};
                e7.setOnClickListener(new org.telegram.ui.web.c(r1Var2, 18));
            }
            linearLayout2.addView(frameLayout, w7.a6.t(-1, -2, 7, 0, 0, 0, 12));
            if (uniqueStarGiftValueInfo.listed_count > 0) {
                bi.d dVar = new bi.d(x3Var.getContext(), x3Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) "e");
                f7 = 1.0f;
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
                dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
                document2 = document;
                linearLayout = linearLayout2;
                f10 = 2.0f;
                dVar.setOnClickListener(new jo(x3Var, str2, j3, 6));
                linearLayout.addView(dVar, w7.a6.t(-1, 42, 7, 0, 0, 0, 2));
            } else {
                document2 = document;
                linearLayout = linearLayout2;
                f7 = 1.0f;
                f10 = 2.0f;
            }
            if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                bi.d dVar2 = new bi.d(x3Var.getContext(), x3Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
                spannableStringBuilder2.append((CharSequence) "e");
                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(document2, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
                dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f10), AndroidUtilities.dp(f7)), false, true);
                dVar2.setOnClickListener(new s1(0, x3Var, uniqueStarGiftValueInfo));
                linearLayout.addView(dVar2, w7.a6.t(-1, 42, 7, 0, 0, 0, 0));
            }
            i10.customView = linearLayout;
            i10.show();
        } else if (tL_error != null) {
            x3Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void a0(x3 x3Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        x3Var.f46288k1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(x3Var.currentAccount).putUsers(paymentForm.users, false);
            x3Var.l1 = paymentForm;
            x3Var.b2();
            return;
        }
        pc Y = x3Var.getBulletinFactory().Y(tL_error);
        Y.f26091t = true;
        Y.j();
    }

    public static void a1(x3 x3Var, final wh.k0 k0Var, yf.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        x3Var.f46285j0.setLoading(false);
        if (k0Var != null && k0Var.L) {
            k0Var.L = false;
            k0Var.H.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new c3(x3Var.getContext(), x3Var.resourcesProvider, tL_starGiftUnique, new a3(bVar, tL_payments_paymentFormStarGift), x3Var.currentAccount, j3, x3Var.C1(), false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                x3.R(x3.this, tL_starGiftUnique, j3, tL_textWithEntities, z10, k0Var, (a3) obj, (nf.e) obj2);
            }
        }).b();
    }

    public static void b0(x3 x3Var) {
        Bundle bundle = new Bundle();
        long j3 = x3Var.X;
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        if (j3 == UserConfig.getInstance(x3Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        d2(new ProfileActivity(bundle, null));
    }

    public static void b1(x3 x3Var) {
        bi.d dVar = x3Var.f46285j0;
        if (UserConfig.getInstance(x3Var.currentAccount).isPremium() && (P1(x3Var.currentAccount, x3Var.K1()) || x3Var.V0)) {
            x3Var.r2(false);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = x3Var.K1();
        if (K1 == null) {
            return;
        }
        TLRPC.Peer peer = K1.owner_id;
        if (peer == null) {
            peer = K1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K1.title);
        sb2.append(" #");
        x3Var.f46306z0.setText(LocaleController.formatString(R.string.Gift2WearTitle, hc.b.l(K1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(x3Var.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (x3Var.U0 == null) {
                x3Var.U0 = new uq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(x3Var.U0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new u0(x3Var, 26));
        x3Var.f46275e0.setWearPreview(MessagesController.getInstance(x3Var.currentAccount).getUserOrChat(peerDialogId));
        x3Var.q2(2, true, null);
    }

    public static void c0(x3 x3Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        MessageObject messageObject;
        if (updates != null) {
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateNewMessage.class);
            int size = findUpdates.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    Object obj = findUpdates.get(i11);
                    i11++;
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(x3Var.currentAccount, message, false, false);
                        break;
                    }
                } else {
                    messageObject = null;
                    break;
                }
            }
            MessagesController.getInstance(x3Var.currentAccount).processUpdates(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new fy0(x3Var, messageObject, arrayList, starGift, 26));
                return;
            }
            callback2.run(null, null);
            v5.y(x3Var.currentAccount, false).P();
            n5 G = v5.y(x3Var.currentAccount, false).G(UserConfig.getInstance(x3Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.j(arrayList, null);
            }
        } else if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(x3Var.getContext(), 0, new zh.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.R = string;
                d2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(x3Var.currentAccount).getCurrentTime();
                    alertDialog$Builder = new AlertDialog$Builder(x3Var.getContext(), 0, new zh.b());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f17528a;
                    d2Var2.R = string2;
                    d2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                    i10 = R.string.OK;
                } else {
                    x3Var.getBulletinFactory().d0(tL_error, false);
                    runnable.run();
                }
            }
            hc.b.A(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void c1(x3 x3Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
            int size = arrayList.size();
            long j3 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j3 += tL_labeledPrice.amount;
            }
            LinearLayout linearLayout = new LinearLayout(x3Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            TextView b10 = w7.e6.b(x3Var.getContext(), 16.0f, org.telegram.ui.ActionBar.j6.f18034j5, false, null);
            b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
            linearLayout.addView(b10, w7.a6.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
            b01 b01Var = new b01(x3Var.getContext(), x3Var.resourcesProvider);
            zz0 a2 = b01Var.a(charSequence);
            a2.setFilled(true);
            uh.o oVar = (uh.o) a2.getChildAt(0);
            oVar.setTextSize(1, 12.0f);
            oVar.setGravity(17);
            linearLayout.addView(b01Var, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x3Var.getContext(), 0, x3Var.resourcesProvider);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(z7.Q0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j3))), new r21(x3Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j3, charSequence));
            alertDialog$Builder.o();
        } else if (tL_error != null) {
            x3Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void d0(x3 x3Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        x3Var.f46285j0.setLoading(false);
        bi.o1 o1Var = new bi.o1(x3Var, 10);
        qg.k0 k0Var = new qg.k0(26, x3Var.currentAccount, x3Var.getContext(), o1Var, x3Var.resourcesProvider);
        k0Var.G1(canApplyBoost);
        k0Var.F1(tL_premium_boostsStatus, true);
        k0Var.H1(j3);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
        if (chat != null) {
            k0Var.Q0 = new sg.c(x3Var, chat);
        }
        k0Var.show();
    }

    public static void d1(x3 x3Var, long j3) {
        o7 o7Var = new o7(x3Var.getContext(), x3Var.resourcesProvider, j3, 10, null, new u2.k0(15, x3Var, new boolean[]{false}), 0L);
        o7Var.setOnDismissListener(new y1(x3Var, 0));
        o7Var.show();
    }

    public static void d2(org.telegram.ui.ActionBar.p2 p2Var) {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f18485a = true;
        U.showAsSheet(p2Var, obj);
    }

    public static void e0(x3 x3Var, long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, wy wyVar) {
        ChatThemeController.getInstance(x3Var.currentAccount).setDialogTheme(j3, new eg.b(null, tL_starGiftUnique.slug));
        wyVar.presentFragment(eo.R9(j3), true);
    }

    public static void e1(x3 x3Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(x3Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(x3Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.f17216id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(x3Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new n1(x3Var, d2Var, messageObject, 4));
        } else {
            AndroidUtilities.runOnUIThread(new di.h3(d2Var, 1));
        }
    }

    public static void f0(x3 x3Var, long j3, long j10, Utilities.Callback callback) {
        o7 o7Var = new o7(x3Var.getContext(), x3Var.resourcesProvider, j3, 11, null, new ya0(x3Var, new boolean[]{false}, j10, callback, 4), 0L);
        o7Var.setOnDismissListener(new y1(x3Var, 1));
        o7Var.show();
    }

    public static void f1(x3 x3Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(x3Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(x3Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new fy0((Object) x3Var, (Object) tL_error, (Object) tLObject, (Object) inputSavedStarGift, 27));
    }

    public static void g0(x3 x3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(x3Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(x3Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            v5.y(x3Var.currentAccount, false).T(false);
            v5.y(x3Var.currentAccount, false).Q(j3);
            v5.y(x3Var.currentAccount, false).Q(j10);
            v5.y(x3Var.currentAccount, false).P();
            callback.run(null);
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                if (j3 >= 0 && j10 >= 0) {
                    eo R9 = eo.R9(j3);
                    R9.whenFullyVisible(new t1(x3Var, R9, j3, 1));
                    U.presentFragment(R9);
                } else {
                    pc M = wc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                    M.f26091t = true;
                    M.j();
                }
            }
            Utilities.stageQueue.postRunnable(new w1(x3Var, tL_payments_paymentResult, 1));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(x3Var.currentAccount).starsPurchaseAvailable()) {
                x3Var.f46285j0.setLoading(false);
                v5.e0(x3Var.getContext(), x3Var.resourcesProvider);
                return;
            }
            v5 y3 = v5.y(x3Var.currentAccount, false);
            a3.g0 g0Var = new a3.g0(x3Var, j11, j3, callback, 13);
            y3.e = false;
            y3.q(false, true, g0Var);
            y3.e = true;
        } else {
            callback.run(tL_error);
            x3Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void g1(x3 x3Var) {
        TL_stars.SavedStarGift savedStarGift = x3Var.C0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            l5 F = v5.y(x3Var.currentAccount, false).F(x3Var.X, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = x3Var.C0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = x3Var.E1();
            savestargift.unsave = x3Var.C0.unsaved;
            ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = x3Var.C0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((n5) x3Var.D0).m(savedStarGift3, !z10, false)) {
            new wh.p2(x3Var.getContext(), x3Var.X, x3Var.C0, x3Var.resourcesProvider, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    return x3.this.getBulletinFactory();
                }
            }).show();
        } else if (!z10) {
            x3Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        } else {
            org.telegram.messenger.a2.o(R.string.Gift2Unpinned, x3Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        }
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new uq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new uq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void h0(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        TL_stars.StarGift starGift;
        if (x3Var.T0 == null) {
            wh.f4 f4Var = new wh.f4(x3Var.currentAccount, tL_starGiftUnique.gift_id);
            x3Var.T0 = f4Var;
            f4Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            v2[] v2VarArr = x3Var.f46275e0.L.f46260n;
            if (i10 < v2VarArr.length) {
                TL_stars.StarGift starGift2 = v2VarArr[i10].h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    hashSet.add(Long.valueOf(starGift2.f17425id));
                }
                i10++;
            } else {
                wh.g4 g4Var = new wh.g4(x3Var.getContext(), tL_starGiftUnique.title, x3Var.T0);
                g4Var.f44108g0.addAll(hashSet);
                g4Var.f44110i0.N(true);
                g4Var.f44109h0 = bool.booleanValue();
                g4Var.f44106e0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                g4Var.f44107f0 = new w0(0, callback);
                g4Var.show();
                return;
            }
        }
    }

    public static void h1(x3 x3Var, String str) {
        Context context = x3Var.getContext();
        nf.f.u(context, MessagesController.getInstance(x3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void i0(x3 x3Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(x3Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(x3Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            v5.y(x3Var.currentAccount, false).T(false);
            v5.y(x3Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = x3Var.C0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            x3Var.f46297q0 = true;
            x3Var.l1 = null;
            x3Var.r1(inputSavedStarGift, tL_payments_paymentResult.updates, new v1(x3Var, str, 0));
            Utilities.stageQueue.postRunnable(new w1(x3Var, tL_payments_paymentResult, 0));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(x3Var.currentAccount).starsPurchaseAvailable()) {
                x3Var.f46285j0.setLoading(false);
                v5.e0(x3Var.getContext(), x3Var.resourcesProvider);
                return;
            }
            v5 y3 = v5.y(x3Var.currentAccount, false);
            c1 c1Var = new c1(x3Var, j3, 3);
            y3.e = false;
            y3.q(false, true, c1Var);
            y3.e = true;
        } else {
            x3Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void i1(x3 x3Var, String str) {
        long j3 = x3Var.X;
        x3Var.f46285j0.setLoading(false);
        if (!TextUtils.isEmpty(str)) {
            x3Var.dismiss();
            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            if (R instanceof eo) {
                eo eoVar = (eo) R;
                if (eoVar.a() == j3) {
                    wc.a0(eoVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j3))), R.raw.gift).k(true);
                    return;
                }
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(x3Var.currentAccount);
            int i10 = NotificationCenter.closeProfileActivity;
            Long valueOf = Long.valueOf(j3);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
            NotificationCenter.getInstance(x3Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j3), bool);
            eo R9 = eo.R9(j3);
            R9.whenFullyVisible(new u2.k0(17, x3Var, R9));
            R.presentFragment(R9);
            return;
        }
        x3Var.q2(0, true, null);
    }

    public static void j0(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, yf.a aVar, Runnable runnable) {
        x3Var.getClass();
        TL_stars.StarsAmount o9 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = x3Var.E1();
        updatestargiftprice.resell_amount = o9;
        ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(updatestargiftprice, new a1(x3Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void j1(x3 x3Var, boolean z10) {
        int i10;
        Object obj;
        wh.l2 l2Var;
        wh.l2 l2Var2;
        wh.l2 l2Var3;
        int G1 = x3Var.G1();
        if (G1 >= 0) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i11 = i10 + G1;
            int i12 = x3Var.R0;
            if (i12 >= 0 && (!z10 ? i12 < G1 : i12 > G1)) {
                i11 = i12;
            }
            o5 o5Var = x3Var.D0;
            if (o5Var != null && i11 >= 0 && i11 < o5Var.e()) {
                obj = x3Var.D0.get(i11);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z10) {
                    l2Var = x3Var.f46271c0;
                } else {
                    l2Var = x3Var.f46269b0;
                }
                if (l2Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z10) {
                            l2Var3 = x3Var.f46271c0;
                        } else {
                            l2Var3 = x3Var.f46269b0;
                        }
                        if (x1(l2Var3.C0, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z10) {
                            l2Var2 = x3Var.f46271c0;
                        } else {
                            l2Var2 = x3Var.f46269b0;
                        }
                        if (y1(l2Var2.G0, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                wh.l2 l2Var4 = new wh.l2(x3Var, x3Var.getContext(), x3Var.currentAccount, x3Var.X, x3Var.resourcesProvider, x3Var.Y.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    l2Var4.j2((TL_stars.SavedStarGift) obj, x3Var.D0);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    l2Var4.h2(tL_starGiftUnique.slug, tL_starGiftUnique, x3Var.D0);
                }
                AndroidUtilities.removeFromParent(l2Var4.containerView);
                if (z10) {
                    x3Var.f46271c0 = l2Var4;
                } else {
                    x3Var.f46269b0 = l2Var4;
                }
            }
        }
    }

    public static void k0(x3 x3Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(x3Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(x3Var.currentAccount).putChats(messages_messages.chats, false);
        x3Var.J0 = true;
        x3Var.I0 = false;
        Boolean bool = x3Var.f46278f1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        x3Var.i2(messageObject, null);
    }

    public static void k1(x3 x3Var, final View view) {
        ud udVar;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                udVar = xd.b((org.telegram.ui.Cells.h7) view);
            } else {
                udVar = null;
            }
            ArrayList arrayList = new ArrayList();
            MessageObject messageObject = x3Var.E0;
            if (messageObject != null) {
                arrayList.add(messageObject);
            } else if (x3Var.B1() instanceof TL_stars.TL_starGiftUnique) {
                long clientUserId = UserConfig.getInstance(x3Var.currentAccount).getClientUserId();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = MessagesController.getInstance(x3Var.currentAccount).getPeer(clientUserId);
                tL_messageService.from_id = MessagesController.getInstance(x3Var.currentAccount).getPeer(clientUserId);
                tL_messageService.date = ConnectionsManager.getInstance(x3Var.currentAccount).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) x3Var.B1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                MessageObject messageObject2 = new MessageObject(x3Var.currentAccount, tL_messageService, false, false);
                messageObject2.setType();
                arrayList.add(messageObject2);
            } else {
                return;
            }
            final ce E = ce.E(launchActivity, x3Var.currentAccount);
            E.R = new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l4 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l10 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    ce ceVar = E;
                    ud udVar2 = null;
                    if (booleanValue) {
                        x3 x3Var2 = x3.this;
                        AndroidUtilities.runOnUIThread(new u2.k0(11, x3Var2, l10));
                        ceVar.Y(null);
                        e2 e2Var = x3Var2.W0;
                        if (e2Var != null) {
                            e2Var.dismiss();
                            x3Var2.W0 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.h7) && view2.isAttachedToWindow()) {
                            udVar2 = xd.b((org.telegram.ui.Cells.h7) view2);
                        }
                        ceVar.Y(udVar2);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                }
            };
            E.U(udVar, r9.y(arrayList));
        }
    }

    public static void l0(x3 x3Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j3, long j10, long j11) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
        d2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(x3Var.currentAccount).sendRequest(convertstargift, new f1(x3Var, d2Var, j3, j10, j11));
    }

    public static ViewGroup l1(x3 x3Var) {
        return x3Var.containerView;
    }

    public static void m0(x3 x3Var, long j3) {
        new wh.p1(x3Var.getContext(), x3Var.currentAccount, j3, null, new x1(x3Var, 2)).show();
    }

    public static void n0(x3 x3Var, org.telegram.ui.ActionBar.d2 d2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            d2Var.dismiss();
            x3Var.L0 = true;
            x3Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        d2Var.dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            pc Q = wc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.f26091t = true;
            Q.j();
        }
    }

    public static int n1(x3 x3Var) {
        return x3Var.backgroundPaddingLeft;
    }

    public static void o0(x3 x3Var) {
        TL_stars.TL_starGiftUnique K1 = x3Var.K1();
        new a0(x3Var.getContext(), x3Var.currentAccount, DialogObject.getPeerDialogId(K1.owner_id), K1, x3Var.resourcesProvider, new b1(x3Var, 2)).show();
    }

    public static int o1(x3 x3Var) {
        return x3Var.backgroundPaddingLeft;
    }

    public static void p0(x3 x3Var, String str) {
        x3Var.dismiss();
        Context context = x3Var.getContext();
        nf.f.s(context, "https://" + MessagesController.getInstance(x3Var.currentAccount).linkPrefix + "/" + str);
    }

    public static void q0(x3 x3Var) {
        if (x3Var.l1 == null) {
            return;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < x3Var.l1.invoice.prices.size(); i10++) {
            j3 += x3Var.l1.invoice.prices.get(i10).amount;
        }
        w3 w3Var = new w3(x3Var.getContext(), j3, x3Var.f46284i1, x3Var.resourcesProvider);
        x3Var.f46295p0 = w3Var;
        w3Var.show();
    }

    public static void q1(b01 b01Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
        } else {
            return;
        }
        String str = string;
        Integer[] numArr = new Integer[1];
        b01Var.e(str, starGiftAttribute.name, J1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void r0(x3 x3Var, nf.e eVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(x3Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new n1(x3Var, eVar, tL_starGiftUnique, 1));
            return;
        }
        x3Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.h0(x3Var, eVar, Long.parseLong(tL_error.text.substring(26)), 26));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new n1(x3Var, eVar, tL_error, 2));
        }
    }

    public static void s0(x3 x3Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, yc[] ycVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new s0(x3Var.getContext(), x3Var.resourcesProvider, x3Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            x3Var.o2(ycVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, di.m.G0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static void t0(x3 x3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, yf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(x3Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new l1(x3Var, tL_starGiftUnique, aVar, runnable, 0));
            return;
        }
        x3Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.h0(x3Var, Long.parseLong(tL_error.text.substring(26)), runnable, 25));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new m1(x3Var, tL_error, runnable, 0));
        }
    }

    public static void u0(x3 x3Var, String str) {
        Context context = x3Var.getContext();
        nf.f.u(context, MessagesController.getInstance(x3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void v0(x3 x3Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        wh.f4 f4Var = x3Var.T0;
        if (f4Var != null) {
            f4Var.b();
            x3Var.T0 = null;
        }
        TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj).slug;
            craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
        }
        ConnectionsManager.getInstance(x3Var.currentAccount).sendRequestTyped(craftstargift, new Object(), new fl0(x3Var, callback2, arrayList, runnable, 2));
    }

    public static void w0(xh.x3 r17) {
        throw new UnsupportedOperationException("Method not decompiled: xh.x3.w0(xh.x3):void");
    }

    public static void x0(x3 x3Var, String str) {
        Context context = x3Var.getContext();
        nf.f.u(context, MessagesController.getInstance(x3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static boolean x1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f17425id == starGift2.f17425id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f17425id == starGift2.f17425id && savedStarGift.date == savedStarGift2.date) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static void y0(x3 x3Var, TLObject tLObject, sg.p1[] p1VarArr, Long l4, sx0 sx0Var, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            MessagesController.getInstance(x3Var.currentAccount).putUsers(tL_users_userFull.users, false);
            MessagesController.getInstance(x3Var.currentAccount).putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new wc(p1VarArr[0].container, x3Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                return;
            } else {
                sx0Var.run();
                return;
            }
        }
        pc Y = x3Var.getBulletinFactory().Y(tL_error);
        Y.f26091t = true;
        Y.j();
    }

    public static boolean y1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f17425id == tL_starGiftUnique2.f17425id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void z0(x3 x3Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        b1 b1Var = x3Var.f46292n1;
        x3Var.f46288k1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(x3Var.currentAccount).putUsers(paymentForm.users, false);
            x3Var.l1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(b1Var);
            AndroidUtilities.runOnUIThread(b1Var);
            return;
        }
        pc Y = x3Var.getBulletinFactory().Y(tL_error);
        Y.f26091t = true;
        Y.j();
    }

    public final long A1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.E0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer2 != null) {
                        return DialogObject.getPeerDialogId(peer2);
                    }
                    if (messageObject.isOutOwner()) {
                        return this.E0.getDialogId();
                    }
                    return UserConfig.getInstance(this.currentAccount).getClientUserId();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (peer = starGift.owner_id) != null) {
                        return DialogObject.getPeerDialogId(peer);
                    }
                    TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
                    if (peer3 != null) {
                        return DialogObject.getPeerDialogId(peer3);
                    }
                    return 0L;
                } else {
                    return 0L;
                }
            }
            return 0L;
        }
        TL_stars.SavedStarGift savedStarGift = this.C0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                return DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.X;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.G0;
        if (tL_starGiftUnique != null) {
            return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final TL_stars.StarGift B1() {
        MessageObject messageObject = this.E0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.G0;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String C1() {
        TL_stars.StarGift B1 = B1();
        if (B1 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) B1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return hc.b.l(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }

    public final TL_stars.InputSavedStarGift E1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j3 = this.X;
        if (j3 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
            MessageObject messageObject = this.E0;
            if (messageObject != null && (message3 = messageObject.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message3.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    if ((tL_messageActionStarGift.flags & 4096) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                } else if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return null;
                } else {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
            }
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            } else if (this.G0 != null && !TextUtils.isEmpty(this.F0)) {
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.F0;
                return tL_inputSavedStarGiftSlug;
            } else {
                return tL_inputSavedStarGiftChat;
            }
        }
        MessageObject messageObject2 = this.E0;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.E0.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.E0.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.E0;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.E0.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.E0.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.E0;
        if (messageObject4 != null) {
            TLRPC.Message message4 = messageObject4.messageOwner;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = messageObject4.getId();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.C0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        } else if (this.G0 != null && !TextUtils.isEmpty(this.F0)) {
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug2.slug = this.F0;
            return tL_inputSavedStarGiftSlug2;
        } else {
            return tL_inputSavedStarGiftUser;
        }
    }

    public final String F1() {
        TL_stars.StarGift B1 = B1();
        if ((B1 instanceof TL_stars.TL_starGiftUnique) && B1.slug != null) {
            return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + B1.slug;
        }
        return null;
    }

    public final int G1() {
        int indexOf;
        o5 o5Var = this.D0;
        if (o5Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null) {
                indexOf = o5Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.G0;
                if (tL_starGiftUnique != null) {
                    indexOf = o5Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift B1 = B1();
            for (int i10 = 0; i10 < this.D0.e(); i10++) {
                Object obj = this.D0.get(i10);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.C0;
                    if (savedStarGift2 != null) {
                        if (x1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i10;
                        }
                    }
                    if (B1 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (B1 != starGift) {
                            if ((B1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && B1.f17425id == starGift.f17425id) {
                            }
                        }
                        return i10;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && y1(this.G0, (TL_stars.TL_starGiftUnique) obj)) {
                        return i10;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public final TL_stars.SavedStarGift H1(boolean z10) {
        int i10;
        Object obj;
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + G1;
        int i12 = this.R0;
        if (i12 >= 0 && (!z10 ? i12 < G1 : i12 > G1)) {
            i11 = i12;
        }
        o5 o5Var = this.D0;
        if (o5Var != null && i11 >= 0 && i11 < o5Var.e()) {
            obj = this.D0.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final TL_stars.TL_starGiftUnique I1(boolean z10) {
        int i10;
        Object obj;
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + G1;
        int i12 = this.R0;
        if (i12 >= 0 && (!z10 ? i12 < G1 : i12 > G1)) {
            i11 = i12;
        }
        o5 o5Var = this.D0;
        if (o5Var != null && i11 >= 0 && i11 < o5Var.e()) {
            obj = this.D0.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return (TL_stars.TL_starGiftUnique) obj;
    }

    public final TL_stars.TL_starGiftUnique K1() {
        TL_stars.StarGift B1 = B1();
        if (B1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) B1;
        }
        return null;
    }

    @Override
    public final boolean L() {
        return false;
    }

    public final boolean L1(boolean z10) {
        if (H1(z10) == null && I1(z10) == null) {
            return false;
        }
        return true;
    }

    public final void M1(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift E1 = E1();
        getstargiftwithdrawalurl.stargift = E1;
        if (E1 == null) {
            return;
        }
        getstargiftwithdrawalurl.password = inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new u1(this, twoStepVerificationActivity, 0));
    }

    public final void Q1() {
        throw new UnsupportedOperationException("Method not decompiled: xh.x3.Q1():void");
    }

    public final void R1(android.view.View r6) {
        throw new UnsupportedOperationException("Method not decompiled: xh.x3.R1(android.view.View):void");
    }

    public final void S1() {
        e2 e2Var = this.W0;
        if (e2Var != null && e2Var.isShown()) {
            this.W0.dismiss();
        }
        String F1 = F1();
        e2 e2Var2 = new e2(this, getContext(), F1, F1, this.resourcesProvider);
        this.W0 = e2Var2;
        e2Var2.f27189s0 = new l2.h(this, 27);
        e2Var2.show();
    }

    public final void T1() {
        throw new UnsupportedOperationException("Method not decompiled: xh.x3.T1():void");
    }

    public final void U1() {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        z7.f1(getContext(), this.currentAccount, K1, new a2(this, K1, 2), this.resourcesProvider);
    }

    public final void V1(long j3, String str) {
        this.f46280g1 = true;
        v5.y(this.currentAccount, false).K(j3, new nj0(17, this, str));
    }

    public final void W1(boolean z10) {
        int i10;
        MessageObject messageObject = this.E0;
        int i11 = 0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i10 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.R = string;
            d2Var.T = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            hc.b.A(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(K1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
            d2Var2.R = string2;
            d2Var2.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            hc.b.A(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        u3 u3Var = this.f46275e0;
        if (z10) {
            u3Var.L.a(this.currentAccount, K1.gift_id, K1.getDocument(), K1.title);
            if (t1()) {
                x2 x2Var = u3Var.L;
                TL_stars.TL_starGiftUnique K12 = K1();
                if (K12 == null) {
                    x2Var.getClass();
                } else {
                    while (true) {
                        v2[] v2VarArr = x2Var.f46260n;
                        if (i11 >= v2VarArr.length) {
                            break;
                        }
                        v2 v2Var = v2VarArr[i11];
                        TL_stars.StarGift starGift = v2Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            v2Var.a(K12, true);
                            break;
                        }
                        i11++;
                    }
                    x2Var.d(true);
                }
            }
        }
        x2 x2Var2 = u3Var.L;
        x2 x2Var3 = u3Var.L;
        x2Var2.setOnCraft(new x0(this, 1));
        if (this.T0 == null) {
            wh.f4 f4Var = new wh.f4(this.currentAccount, K1.gift_id);
            this.T0 = f4Var;
            f4Var.a();
        }
        x2Var3.setOnAddGift(new a2(this, K1, 1));
        x2Var3.setOnClose(new b1(this, 18));
        q2(4, true, null);
    }

    public final void X1(long j3) {
        bi.x4 x4Var = this.f46294o1;
        if (x4Var != null) {
            x4Var.e(true);
            this.f46294o1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null && !UserObject.isService(j3)) {
            Bundle bundle = new Bundle();
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
                if (j3 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    public final void Y1() {
        throw new UnsupportedOperationException("Method not decompiled: xh.x3.Y1():void");
    }

    public final void Z1(long j3, Utilities.Callback callback) {
        TLRPC.Message message;
        long j10;
        String str;
        TLRPC.User user;
        String formatString;
        CharSequence string;
        TL_stars.SavedStarGift savedStarGift = this.C0;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j10 = savedStarGift.transfer_stars;
        } else {
            MessageObject messageObject = this.E0;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if (tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique) {
                        j10 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 != null) {
            if (j3 >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
                str = UserObject.getForcedFirstName(user2);
                user = user2;
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
                if (chat == null) {
                    str = "";
                    user = chat;
                } else {
                    str = chat.title;
                    user = chat;
                }
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new z2(getContext(), K1, user), w7.a6.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(getContext());
            em.n(org.telegram.ui.ActionBar.j6.f18034j5, this.resourcesProvider, textView, 1, 16.0f);
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                formatString = LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j10, C1(), DialogObject.getShortName(j3));
            } else {
                formatString = LocaleController.formatString(R.string.Gift2TransferText, C1(), str);
            }
            textView.setText(AndroidUtilities.replaceTags(formatString));
            linearLayout.addView(textView, w7.a6.t(-1, -2, 48, 24, 4, 24, 4));
            b01 b01Var = new b01(getContext(), this.resourcesProvider);
            q1(b01Var, v5.l(K1.attributes, TL_stars.starGiftAttributeModel.class));
            q1(b01Var, v5.l(K1.attributes, TL_stars.starGiftAttributeBackdrop.class));
            q1(b01Var, v5.l(K1.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(K1.slug) && (K1.flags & 256) != 0) {
                b01Var.c(LocaleController.getString(R.string.GiftValue2), org.telegram.ui.Cells.r6.i("~", BillingController.getInstance().formatCurrency(K1.value_amount, K1.value_currency, BillingController.getInstance().getCurrencyExp(K1.value_currency), true)), null, null);
            }
            linearLayout.addView(b01Var, w7.a6.t(-1, -2, 48, 23, 16, 23, 4));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.n(linearLayout);
            if (i10 > 0) {
                string = z7.Q0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j10)));
            } else {
                string = LocaleController.getString(R.string.Gift2TransferDo);
            }
            alertDialog$Builder.k(string, new th.e(callback, 10));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.X0 = true;
            d2Var.show();
        }
    }

    public final void a2() {
        TL_stars.InputSavedStarGift E1;
        long j3;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        int i10;
        bi.x4 x4Var = this.f46294o1;
        if (x4Var != null) {
            x4Var.e(true);
            this.f46294o1 = null;
        }
        if (this.Z0 == null && (E1 = E1()) != null) {
            MessageObject messageObject = this.E0;
            long j12 = this.X;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j10 = tL_messageActionStarGift.gift.f17425id;
                    j11 = tL_messageActionStarGift.upgrade_stars;
                    z10 = tL_messageActionStarGift.name_hidden;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                    j3 = 0;
                    str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    if (tL_messageActionStarGift.prepaid_upgrade) {
                        if (DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.E0.getFromChatId()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = tL_messageActionStarGift.upgrade_separate;
                    }
                } else {
                    return;
                }
            } else {
                j3 = 0;
                TL_stars.SavedStarGift savedStarGift = this.C0;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j10 = starGift.f17425id;
                    j11 = savedStarGift.upgrade_stars;
                    if ((starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j12 < 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TL_stars.SavedStarGift savedStarGift2 = this.C0;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z13 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f46303w0;
            if (z10) {
                if (z12) {
                    i10 = R.string.Gift2AddMyNameNameChannel;
                } else {
                    i10 = R.string.Gift2AddMyNameName;
                }
                textView.setText(LocaleController.getString(i10));
            } else if (z11) {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            if (!z10 && j11 > j3 && !z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            tp tpVar = this.f46302v0;
            tpVar.a(z14, false);
            ArrayList arrayList = this.f46282h1;
            if (arrayList != null && (j11 > j3 || this.l1 != null)) {
                b2();
                return;
            }
            if (arrayList == null) {
                v5.y(this.currentAccount, false).K(j10, new x1(this, 1));
            }
            if (j11 <= j3 && this.l1 == null) {
                this.f46288k1 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j12);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = tpVar.f27462a.f21057q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject p5 = di.n3.p(this.resourcesProvider, false);
                if (p5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p5.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new c2(this, 0));
            }
        }
    }

    public final void b2() {
        throw new UnsupportedOperationException("Method not decompiled: xh.x3.b2():void");
    }

    public final void c2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j3, final yf.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final wh.k0 k0Var) {
        this.f46285j0.setLoading(true);
        if (k0Var != null && !k0Var.L) {
            k0Var.L = true;
            k0Var.H.h(true);
        }
        v5.x(this.currentAccount, bVar).H(tL_starGiftUnique, j3, tL_textWithEntities, z10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                x3.a1(x3.this, k0Var, bVar, tL_starGiftUnique, j3, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.Y0.c(4)) {
            boolean z10 = this.f46275e0.L.f46255h0;
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.Y0.c(4) && this.f46275e0.L.f46255h0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.Y0.c(4) && this.f46275e0.L.f46255h0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.D0 == ((n5) objArr[1])) {
                x2 x2Var = this.f46275e0.L;
                if (x2Var == null || !x2Var.f46255h0) {
                    t2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.Y0.c(4) && this.f46275e0.L.f46255h0) {
            return;
        }
        wh.f4 f4Var = this.T0;
        if (f4Var != null) {
            f4Var.b();
            this.T0 = null;
        }
        j3 j3Var = this.M0;
        if (j3Var != null) {
            j3Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TLRPC.Peer peer) {
        if (peer != null) {
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
            if (TextUtils.isEmpty(publicUsername)) {
                return null;
            }
            return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, org.telegram.ui.Cells.r6.i("@", publicUsername)), new v1(this, publicUsername, 8));
        }
        return null;
    }

    public final SpannableStringBuilder f2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return e2(starGift.released_by);
        }
        return null;
    }

    @Override
    public wc getBulletinFactory() {
        return new wc(this.f46293o0, this.resourcesProvider);
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, o5 o5Var) {
        boolean z10;
        boolean z11;
        j3 j3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.F0 = str;
        this.G0 = tL_starGiftUnique;
        this.D0 = o5Var;
        if (tL_starGiftUnique.resell_amount != null && !N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H0 = z10;
        if (!this.N0 && (j3Var = this.M0) != null && j3Var.f45587o && (tL_starGiftUnique2 = j3Var.f45584l) != null && tL_starGiftUnique2.f17425id != tL_starGiftUnique.f17425id) {
            j3Var.a();
            this.M0 = null;
            u3 u3Var = this.f46275e0;
            u3Var.f46099b.setAlpha(1.0f);
            u3Var.f46101c.setAlpha(0.0f);
        }
        this.f46273d0.b(this.currentAccount, this.C0);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        m90 m90Var = this.f46279g0;
        if (z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            m90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new v1(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            m90Var.setVisibility(0);
            m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18161q5, this.resourcesProvider));
        } else {
            m90Var.setVisibility(8);
        }
        m90 m90Var2 = this.f46283i0;
        if (!z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            m90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new v1(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            m90Var2.setVisibility(0);
        } else {
            m90Var2.setVisibility(8);
        }
        if (this.H0) {
            l2(tL_starGiftUnique);
            this.f46285j0.setOnClickListener(new u0(this, 7));
        }
        if (this.f46270b1) {
            q2(0, false, null);
            this.f21450c.n0(1);
            this.f46270b1 = false;
        }
        t2();
    }

    public final void i2(org.telegram.messenger.MessageObject r56, xh.o5 r57) {
        throw new UnsupportedOperationException("Method not decompiled: xh.x3.i2(org.telegram.messenger.MessageObject, xh.o5):void");
    }

    public final void j2(TL_stars.SavedStarGift savedStarGift, o5 o5Var) {
        boolean z10;
        boolean z11;
        long j3;
        int i10;
        CharSequence string;
        int i11;
        String string2;
        int i12;
        CharSequence charSequence;
        int i13;
        String formatString;
        int i14;
        CharSequence charSequence2;
        String str;
        TL_stars.StarGift starGift;
        String str2;
        ?? r12;
        int i15;
        ?? r122;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        String str3;
        String str4;
        boolean z12;
        int i16;
        String string3;
        String string4;
        CharSequence replaceTags;
        TL_stars.StarGift starGift3;
        int i17;
        ?? r13;
        int i18;
        int i19;
        TLObject tLObject;
        j3 j3Var;
        if (savedStarGift == null) {
            return;
        }
        int i20 = this.currentAccount;
        long j10 = this.X;
        this.B0 = N1(i20, j10);
        this.C0 = savedStarGift;
        this.D0 = o5Var;
        this.E0 = null;
        boolean z13 = this.N0;
        u3 u3Var = this.f46275e0;
        if (!z13 && (j3Var = this.M0) != null && j3Var.f45587o && j3Var.f45584l != null) {
            j3Var.a();
            this.M0 = null;
            u3Var.f46099b.setVisibility(0);
            u3Var.f46101c.setVisibility(4);
        }
        this.f46273d0.b(this.currentAccount, savedStarGift);
        String shortName = DialogObject.getShortName(j10);
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if ((savedStarGift.flags & 2) == 0) {
            peerDialogId = 2666000;
        }
        int i21 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i21 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = savedStarGift.message;
        boolean z14 = savedStarGift.refunded;
        TL_stars.StarGift starGift4 = savedStarGift.gift;
        if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
            str3 = starGift4.owner_address;
            str4 = starGift4.gift_address;
            if (starGift4.host_id != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift4;
            if (!savedStarGift.name_hidden) {
                tLObject = MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(savedStarGift.from_id));
            } else {
                tLObject = null;
            }
            k2(tL_starGiftUnique, z14, tLObject, savedStarGift.message);
        } else {
            if (this.B0 && clientUserId == peerDialogId && i21 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = z11;
            boolean P1 = P1(this.currentAccount, K1());
            F1();
            u3Var.f(starGift4, false, false, P1);
            b01 b01Var = this.f46281h0;
            b01Var.removeAllViews();
            SpannableString spannableString = "";
            if (z15) {
                if (savedStarGift.gift_num != 0 && (starGift3 = savedStarGift.gift) != null && starGift3.title != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j3 = clientUserId;
                    string4 = hc.b.l(savedStarGift.gift_num, ',', sb2);
                } else {
                    j3 = clientUserId;
                    string4 = LocaleController.getString(R.string.Gift2TitleSaved);
                }
                this.S0 = string4;
                if (z14) {
                    replaceTags = null;
                } else if (savedStarGift.can_upgrade) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else {
                    long j11 = savedStarGift.convert_stars;
                    if (j11 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j11));
                    } else {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                    }
                }
                u3Var.i(0, string4, replaceTags, f2(savedStarGift.gift));
            } else {
                j3 = clientUserId;
                if (z10 && !this.B0) {
                    String string5 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.S0 = string5;
                    u3Var.i(0, string5, null, e2(savedStarGift.gift.released_by));
                } else {
                    boolean z16 = this.B0;
                    if ((!z16 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        if (z16) {
                            i10 = R.string.Gift2TitleReceived;
                        } else {
                            i10 = R.string.Gift2TitleProfile;
                        }
                        String string6 = LocaleController.getString(i10);
                        this.S0 = string6;
                        if (z14 || !this.B0) {
                            string = null;
                        } else {
                            string = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                        }
                        u3Var.i(0, string6, string, f2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num != 0 && (starGift = savedStarGift.gift) != null && starGift.title != null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string2 = hc.b.l(savedStarGift.gift_num, ',', sb3);
                        } else {
                            if (z16) {
                                i11 = R.string.Gift2TitleReceived;
                            } else {
                                i11 = R.string.Gift2TitleProfile;
                            }
                            string2 = LocaleController.getString(i11);
                        }
                        this.S0 = string2;
                        if (z14 || !this.B0) {
                            i12 = 0;
                            charSequence = null;
                        } else {
                            if (!isBot && s1()) {
                                if (this.B0) {
                                    if (currentTime <= 0) {
                                        if (z10) {
                                            str = "Gift2Info2ChannelExpired";
                                        } else {
                                            str = "Gift2Info2Expired";
                                        }
                                    } else if (z10) {
                                        str = "Gift2Info3Channel";
                                    } else {
                                        str = "Gift2Info3";
                                    }
                                    formatString = LocaleController.formatPluralStringComma(str, (int) savedStarGift.convert_stars);
                                } else {
                                    formatString = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                                }
                            } else if (this.B0) {
                                if (savedStarGift.unsaved) {
                                    if (z10) {
                                        i14 = R.string.Gift2Info2ChannelKeep;
                                    } else {
                                        i14 = R.string.Gift2Info2BotKeep;
                                    }
                                } else if (z10) {
                                    i14 = R.string.Gift2Info2ChannelRemove;
                                } else {
                                    i14 = R.string.Gift2Info2BotRemove;
                                }
                                formatString = LocaleController.getString(i14);
                            } else {
                                if (savedStarGift.can_upgrade && savedStarGift.upgrade_stars > 0) {
                                    i13 = R.string.Gift2Info2OutUpgrade;
                                } else {
                                    i13 = R.string.Gift2Info2OutExpired;
                                }
                                formatString = LocaleController.formatString(i13, shortName);
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                            if (!isBot && s1()) {
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new b1(this, 1)), true);
                            } else {
                                charSequence2 = spannableString;
                            }
                            i12 = 0;
                            charSequence = TextUtils.concat(replaceTags2, " ", charSequence2);
                        }
                        u3Var.i(i12, string2, charSequence, f2(savedStarGift.gift));
                    }
                }
            }
            if (j3 != peerDialogId || z10) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                String string7 = LocaleController.getString(R.string.Gift2From);
                int i22 = this.currentAccount;
                c1 c1Var = new c1(this, peerDialogId, 1);
                if (peerDialogId != j3 && peerDialogId != 2666000 && !isBot && !UserObject.isDeleted(user) && !z10) {
                    str2 = LocaleController.getString(R.string.Gift2ButtonSendGift);
                } else {
                    str2 = null;
                }
                this.f46281h0.j(string7, i22, peerDialogId, c1Var, str2, new c1(this, peerDialogId, 2));
            }
            b01Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string8 = LocaleController.getString(R.string.Gift2Value);
            String l4 = hc.b.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (s1() && !z14) {
                r12 = 0;
                spannableString = zc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new b1(this, 4), this.resourcesProvider, null);
            } else {
                r12 = 0;
            }
            b01Var.c(string8, z7.X0(false, TextUtils.concat(l4, " ", spannableString), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z14) {
                z7.F0(b01Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z14) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                b01Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z17 = this.B0;
            bi.d dVar = this.f46285j0;
            if (z17 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.f46268a1 == null) {
                    i16 = 0;
                    this.f46268a1 = new uq(0, new v3(dVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
                } else {
                    i16 = 0;
                }
                spannableStringBuilder.setSpan(this.f46268a1, i16, 1, 33);
                if (savedStarGift.upgrade_stars > 0) {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                } else {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                }
                spannableStringBuilder.append((CharSequence) string3);
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.f46270b1, true);
                dVar.f(null, !this.f46270b1);
                dVar.setOnClickListener(new u0(this, 3));
            } else if (this.f46297q0 && z17 && this.Z != null && this.D0 != null && G1() >= 0 && this.D0.b(G1()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.D0.b(G1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.D0.get(b10);
                if ((obj instanceof TL_stars.SavedStarGift) && (starGift2 = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift2.getDocument()) != null) {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                } else {
                    r122 = 1;
                }
                dVar.g(spannableStringBuilder2, (this.f46270b1 ? 1 : 0) ^ r122, r122);
                dVar.f(null, (this.f46270b1 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new e1(this, b10, r122));
            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.f46268a1 == null) {
                    i15 = 0;
                    this.f46268a1 = new uq(0, new v3(dVar, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
                } else {
                    i15 = 0;
                }
                spannableStringBuilder3.setSpan(this.f46268a1, i15, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.f46270b1, true);
                dVar.f(null, !this.f46270b1);
                dVar.setOnClickListener(new u0(this, 5));
            } else {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.f46270b1, true);
                dVar.f(null, !this.f46270b1);
                dVar.setOnClickListener(new u0(this, 6));
            }
            str3 = null;
            str4 = null;
            z12 = false;
        }
        boolean z18 = savedStarGift.refunded;
        m90 m90Var = this.f46279g0;
        if (z18) {
            m90Var.setVisibility(0);
            m90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18162q7, this.resourcesProvider));
        } else if (z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            m90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new v1(this, str4, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            m90Var.setVisibility(0);
            m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18161q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && this.B0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            m90Var.setVisibility(0);
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                i17 = R.string.Gift2InSenderMessageHidden2;
            } else {
                i17 = R.string.Gift2InSenderHidden2;
            }
            m90Var.setText(LocaleController.getString(i17));
            m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18161q5, this.resourcesProvider));
        } else {
            m90Var.setVisibility(8);
        }
        m90 m90Var2 = this.f46283i0;
        if (!z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            m90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new v1(this, str4, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            m90Var2.setVisibility(0);
        } else if (this.B0 && N1(this.currentAccount, j10)) {
            if (i21 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new uq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                if (!savedStarGift.unsaved) {
                    i19 = R.string.Gift2ProfileVisible4;
                } else {
                    i19 = R.string.Gift2ProfileInvisible4;
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(i19), new b1(this, 3)));
                m90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                if (!savedStarGift.unsaved) {
                    i18 = R.string.Gift2ChannelProfileVisible3;
                } else {
                    i18 = R.string.Gift2ChannelProfileInvisible3;
                }
                m90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i18), new b1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            m90Var2.setVisibility(0);
        } else {
            r13 = 0;
            m90Var2.setVisibility(8);
        }
        if (this.f46270b1) {
            q2(r13, r13, null);
            this.f21450c.n0(1);
            this.f46270b1 = r13;
        }
        this.e.setTitle(this.S0);
        t2();
    }

    public final void k2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r37, boolean r38, org.telegram.tgnet.TLObject r39, org.telegram.tgnet.TLRPC.TL_textWithEntities r40) {
        throw new UnsupportedOperationException("Method not decompiled: xh.x3.k2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        yf.a resellAmount = tL_starGiftUnique.getResellAmount(yf.b.f46928a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        bi.d dVar = this.f46285j0;
        if (z10) {
            dVar.g(z7.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(yf.b.f46929b).d()), true), !this.f46270b1, true);
            dVar.f(z7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.f46270b1);
            return;
        }
        dVar.g(z7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.f46270b1, true);
        dVar.f(null, !this.f46270b1);
    }

    public final void m2() {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        TLRPC.Peer peer = K1.owner_id;
        if (peer == null) {
            peer = K1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K1.title);
        sb2.append(" #");
        this.f46306z0.setText(LocaleController.formatString(R.string.Gift2WearTitle, hc.b.l(K1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.U0 == null) {
                this.U0 = new uq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.U0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        bi.d dVar = this.f46285j0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new u0(this, 21));
        this.f46275e0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        q2(2, false, null);
        this.f46304x0 = true;
    }

    public final void n2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique K1 = K1();
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 != null && K1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = E1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject p5 = di.n3.p(this.resourcesProvider, false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new l9(this, charSequence, K1, tL_inputInvoiceStarGiftDropOriginalDetails, 15));
        }
    }

    public final void o2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        int i10;
        bi.x4 x4Var = this.f46294o1;
        if ((x4Var == null || !x4Var.V || this.f46296p1 != view) && view != null) {
            if (z10) {
                if (view instanceof org.telegram.ui.ActionBar.l5) {
                    org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) view;
                    primaryHorizontal = (l5Var.getRightDrawableWidth() / 2.0f) + l5Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.l5) {
                    layout = ((org.telegram.ui.ActionBar.l5) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        zc[] zcVarArr = (zc[]) spanned.getSpans(0, spanned.length(), zc.class);
                        if (zcVarArr != null && zcVarArr.length > 0) {
                            zc zcVar = zcVarArr[zcVarArr.length - 1];
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(zcVar)) + view.getPaddingLeft() + (zcVar.a() / 2.0f);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(r5);
            org.telegram.ui.u5 u5Var = this.Y;
            u5Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            bi.x4 x4Var2 = this.f46294o1;
            if (x4Var2 != null) {
                x4Var2.e(true);
                this.f46294o1 = null;
            }
            bi.x4 x4Var3 = new bi.x4(getContext(), 3);
            x4Var3.p(!z10);
            x4Var3.s(charSequence);
            x4Var3.m(0.0f, (iArr2[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
            float dp = (iArr2[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f);
            if (z10) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            x4Var3.setTranslationY(dp + AndroidUtilities.dp(i10 + 4.33f));
            x4Var3.d = 3000L;
            x4Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
            x4Var3.f3890l0 = new bi.v4(x4Var3, 2);
            x4Var3.u();
            u5Var.addView(x4Var3, w7.a6.c(100.0f, -1));
            this.f46294o1 = x4Var3;
            this.f46296p1 = view;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onBackPressed() {
        u3 u3Var;
        x2 x2Var;
        if (this.Y0.c(4) && (u3Var = this.f46275e0) != null && (x2Var = u3Var.L) != null) {
            if (x2Var.f46255h0) {
                return;
            }
            if (x2Var.f46256i0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.f46304x0 && this.Y0.f7758b > 0 && !this.f46285j0.N && !this.f46280g1) {
            MessageObject messageObject = this.E0;
            if (messageObject != null) {
                i2(messageObject, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.C0;
                if (savedStarGift != null) {
                    j2(savedStarGift, this.D0);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.G0;
                    if (tL_starGiftUnique != null) {
                        h2(this.F0, tL_starGiftUnique, this.D0);
                    }
                }
            }
            q2(0, true, null);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onSwipeStarts() {
        bi.x4 x4Var = this.f46294o1;
        if (x4Var != null) {
            x4Var.e(true);
            this.f46294o1 = null;
        }
    }

    public final void p1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c10;
        j3 j3Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        x3 x3Var;
        fy0 fy0Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            c10 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            c10 = 1;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            c10 = 0;
        } else {
            return;
        }
        if (!this.N0 && ((j3Var = this.M0) == null || !j3Var.f45587o)) {
            boolean[] zArr = new boolean[1];
            yc[] ycVarArr = new yc[1];
            Integer[] numArr = new Integer[1];
            String J1 = J1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                fy0Var = new fy0(this, zArr, starGiftAttribute2, ycVarArr, 24);
                x3Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                x3Var = this;
                fy0Var = null;
            }
            ycVarArr[0] = (yc) ((yz0) x3Var.f46281h0.e(string, starGiftAttribute2.name, J1, fy0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        o3 o3Var = new o3(getContext(), this.resourcesProvider, new x0(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        b01 b01Var = this.f46281h0;
        tableRow.addView(new a01(b01Var, string), layoutParams);
        tableRow.addView(new yz0(b01Var, o3Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        b01Var.addView(tableRow);
        j3 j3Var2 = this.M0;
        if (j3Var2 != null) {
            if (c10 == 0) {
                j3Var2.d = o3Var;
            }
            if (c10 == 1) {
                j3Var2.f45578c = o3Var;
            }
            if (c10 == 2) {
                j3Var2.f45577b = o3Var;
            }
        }
    }

    public final void p2(int i10, Context context, boolean z10) {
        int i11;
        int i12;
        LinearLayout f7 = em.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.resourcesProvider)));
        f7.addView(frameLayout, w7.a6.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView((View) imageView, w7.a6.q(64, 64, 17));
        imageView.d();
        TextView b10 = w7.e6.b(context, 20.0f, org.telegram.ui.ActionBar.j6.G6, true, null);
        b10.setGravity(17);
        if (z10) {
            i11 = R.string.Gift2ResellTimeoutTitle;
        } else {
            i11 = R.string.Gift2TransferTimeoutTitle;
        }
        b10.setText(LocaleController.getString(i11));
        f7.addView(b10, w7.a6.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = w7.e6.b(context, 14.0f, org.telegram.ui.ActionBar.j6.F6, false, null);
        b11.setGravity(17);
        if (z10) {
            i12 = R.string.Gift2ResellTimeout;
        } else {
            i12 = R.string.Gift2TransferTimeout;
        }
        b11.setText(LocaleController.formatString(i12, LocaleController.formatTTLString(Math.max(10, i10))));
        f7.addView(b11, w7.a6.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(f7);
        hc.b.A(R.string.OK, alertDialog$Builder, null);
    }

    public final void q2(int r12, boolean r13, org.telegram.ui.Components.bs0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: xh.x3.q2(int, boolean, org.telegram.ui.Components.bs0):void");
    }

    public final void r1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            v5.y(this.currentAccount, false).Q(A1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update2 = updates.updates.get(i10);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message != null) {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.N0 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.C0;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f17216id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    j2(savedStarGift2, this.D0);
                    this.f46282h1 = null;
                    this.N0 = false;
                    o5 o5Var = this.D0;
                    if (o5Var != null) {
                        o5Var.d();
                    } else {
                        v5.y(this.currentAccount, false).Q(this.X);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
            }
            if (this.D0 == null) {
                v5.y(this.currentAccount, false).Q(A1());
            }
            this.N0 = true;
            this.C0 = null;
            this.B0 = false;
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.setType();
            i2(messageObject, this.D0);
            this.f46282h1 = null;
            this.N0 = false;
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        v5.y(this.currentAccount, false).Q(A1());
        dismiss();
    }

    public final void r2(boolean z10) {
        int i10;
        int i11;
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean P1 = P1(this.currentAccount, K1());
        boolean z11 = !P1;
        boolean P12 = P1(this.currentAccount, K1());
        bi.d dVar = this.f46285j0;
        if (P12) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long A1 = A1();
            if (A1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    pc P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new b1(this, 24)));
                    P.f26091t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(A1, new e2.h() {
                    @Override
                    public final void accept(Object obj) {
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        x3 x3Var = x3.this;
                        if (tL_premium_boostsStatus != null) {
                            int i12 = tL_premium_boostsStatus.level;
                            MessagesController messagesController2 = messagesController;
                            if (i12 < messagesController2.channelEmojiStatusLevelMin) {
                                ChannelBoostsController boostsController = messagesController2.getBoostsController();
                                long j3 = A1;
                                boostsController.userCanBoostChannel(j3, tL_premium_boostsStatus, new to(x3Var, tL_premium_boostsStatus, j3, messagesController2));
                                return;
                            }
                        }
                        x3Var.f46285j0.setLoading(false);
                        x3Var.r2(true);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = K1.f17425id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), tL_inputEmojiStatusCollectible, K1);
        }
        t3 t3Var = this.f46275e0.I[1];
        if (!P1) {
            i10 = R.drawable.filled_crown_off;
        } else {
            i10 = R.drawable.filled_crown_on;
        }
        if (!P1) {
            i11 = R.string.Gift2ActionWearOff;
        } else {
            i11 = R.string.Gift2ActionWear;
        }
        t3Var.b(i10, LocaleController.getString(i11), true);
        if (this.f46304x0) {
            dismiss();
            return;
        }
        bs0 bs0Var = new bs0(14, this, z11);
        if (this.Y0.c(0)) {
            bs0Var.run();
        } else {
            q2(0, true, bs0Var);
        }
        dVar.g(LocaleController.getString(R.string.OK), !this.f46270b1, true);
        dVar.f(null, !this.f46270b1);
        dVar.setOnClickListener(new u0(this, 0));
    }

    public final boolean s1() {
        int i10;
        boolean z10;
        boolean z11;
        TLRPC.Peer peer;
        if (E1() == null) {
            return false;
        }
        MessageObject messageObject = this.E0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean isOutOwner = messageObject.isOutOwner();
                if (this.E0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.E0.messageOwner.date);
                if (((z10 || (isOutOwner && !z11)) && ((peer = tL_messageActionStarGift.peer) == null || !O1(this.currentAccount, DialogObject.getPeerDialogId(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null) {
                int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i11 = this.currentAccount;
                long j3 = this.X;
                if (O1(i11, j3)) {
                    int i12 = this.C0.flags;
                    if (j3 < 0) {
                        i10 = 2048;
                    } else {
                        i10 = 8;
                    }
                    if ((i10 & i12) != 0 && (i12 & 16) != 0 && (i12 & 2) != 0 && currentTime2 > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void s2() {
        FrameLayout frameLayout = this.m0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f46293o0;
        FrameLayout frameLayout3 = this.f46287k0;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.Y0.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.Y0.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.Y0.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    @Override
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        if (this.F0 != null && this.G0 == null) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
            d2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.F0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new wh.s3(4, this, d2Var));
        } else if (this.C0 == null && (messageObject = this.E0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
                        d2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f17289id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new wa((Object) this, (Object) tL_messageActionStarGift, d2Var2, 22));
                        return;
                    } else if (E1() != null) {
                        org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
                        d2Var3.q(500L);
                        v5.y(this.currentAccount, false).M(E1(), new nj0(18, this, d2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final boolean t1() {
        int i10;
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null || K1.crafted || !O1(this.currentAccount, DialogObject.getPeerDialogId(K1.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.E0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return false;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return false;
            }
            i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i10 = savedStarGift.can_craft_at;
            }
            return false;
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        if (i10 <= 0 || currentTime < i10) {
            return false;
        }
        return true;
    }

    public final void t2() {
        boolean L1 = L1(false);
        h2 h2Var = this.Z;
        h2Var.setPosition(L1 ? 1 : 0);
        h2Var.C(false);
        if (this.D0 != null && !L1(true) && this.D0.e() < this.D0.c()) {
            this.D0.a();
        }
    }

    public final void u1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 != null && !TextUtils.isEmpty(K1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new z1(this, K1, 1));
        }
        hc.b.s(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        fg.n0 n0Var = new fg.n0(this, 6);
        this.Q0 = n0Var;
        return n0Var;
    }

    public final void v1(final long j3, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j10;
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.C0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j10 = savedStarGift.transfer_stars;
                peerDialogId = this.X;
            } else {
                MessageObject messageObject = this.E0;
                if (messageObject != null && (message = messageObject.messageOwner) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                        peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.gift.owner_id);
                        j10 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (j10 <= 0) {
                TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
                transferstargift.stargift = E1;
                transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new org.telegram.messenger.f7(this, callback, j3, peerDialogId, 4));
                return;
            }
            final long j11 = peerDialogId;
            v5 y3 = v5.y(this.currentAccount, false);
            if (!y3.e) {
                y3.r(new ya0(this, y3, j3, callback, 2));
                return;
            }
            final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = E1;
            tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject p5 = di.n3.p(this.resourcesProvider, false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final x3 x3Var = x3.this;
                    final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                    final long j12 = j3;
                    final long j13 = j11;
                    final Utilities.Callback callback2 = callback;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            x3.G0(x3.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j12, j13, callback2, tL_error);
                        }
                    });
                }
            });
        }
    }

    public final void w1() {
        TL_stars.InputSavedStarGift E1;
        long j3;
        bi.d dVar = this.f46285j0;
        if (!dVar.N && (E1 = E1()) != null) {
            MessageObject messageObject = this.E0;
            String str = null;
            long j10 = 0;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j3 = tL_messageActionStarGift.upgrade_stars;
                    if (j3 <= 0) {
                        str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.C0;
                if (savedStarGift != null) {
                    j3 = savedStarGift.upgrade_stars;
                    if (j3 <= 0) {
                        str = savedStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            }
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 > 0 || this.l1 != null) {
                dVar.setLoading(true);
                tp tpVar = this.f46302v0;
                if (i10 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = tpVar.f27462a.f21057q;
                    upgradestargift.stargift = E1;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new wh.s3(3, this, E1));
                    return;
                }
                int i11 = 0;
                v5 y3 = v5.y(this.currentAccount, false);
                if (!y3.e) {
                    y3.r(new u2.k0(12, this, y3));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.l1.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.X);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = tpVar.f27462a.f21057q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.l1.invoice.prices;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                    i11++;
                    j10 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new qa(this, str, E1, j10, 7));
            }
        }
    }

    @Override
    public final int x() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final CharSequence y() {
        return this.S0;
    }

    public final int z1() {
        if (this.Y0.d(1)) {
            return this.f46298r0.getMeasuredHeight();
        }
        if (this.Y0.d(2)) {
            return this.f46305y0.getMeasuredHeight();
        }
        if (this.Y0.d(3)) {
            return this.A0.getMeasuredHeight();
        }
        if (this.Y0.d(4)) {
            return 0;
        }
        return this.f46277f0.getMeasuredHeight();
    }
}
