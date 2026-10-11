package yh;

import android.animation.ValueAnimator;
import android.app.Dialog;
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
import ci.ec;
import ci.gc;
import ci.l8;
import ci.lc;
import java.io.Serializable;
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
import org.telegram.messenger.ai;
import org.telegram.messenger.ma;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.j31;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.p31;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.s01;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ab1;
import org.telegram.ui.ap0;
import org.telegram.ui.cj1;
import org.telegram.ui.dl0;
import org.telegram.ui.ds0;
import org.telegram.ui.fo;
import org.telegram.ui.hw0;
import org.telegram.ui.iu;
import org.telegram.ui.ow;
import org.telegram.ui.sa;
import org.telegram.ui.sy;
import org.telegram.ui.to;
import org.telegram.ui.zn;
public class s3 extends db implements NotificationCenter.NotificationCenterDelegate {
    public static final int f53279r1 = 0;
    public final TextView A0;
    public final e2 B0;
    public boolean C0;
    public TL_stars.SavedStarGift D0;
    public g5 E0;
    public MessageObject F0;
    public String G0;
    public TL_stars.TL_starGiftUnique H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public f3 N0;
    public boolean O0;
    public g2 P0;
    public final int[] Q0;
    public gg.m0 R0;
    public int S0;
    public String T0;
    public xh.g4 U0;
    public er V0;
    public boolean W0;
    public final long X;
    public a2 X0;
    public final org.telegram.ui.s5 Y;
    public Float Y0;
    public final d2 Z;
    public f4.d Z0;
    public final i10 f53280a0;
    public ValueAnimator f53281a1;
    public final View f53282b0;
    public er f53283b1;
    public xh.n2 f53284c0;
    public boolean f53285c1;
    public xh.n2 f53286d0;
    public View f53287d1;
    public final f2 f53288e0;
    public xh.d2 f53289e1;
    public final p3 f53290f0;
    public boolean f53291f1;
    public final e2 f53292g0;
    public Boolean f53293g1;
    public final ea0 f53294h0;
    public boolean f53295h1;
    public final s01 f53296i0;
    public ArrayList f53297i1;
    public final ea0 f53298j0;
    public ArrayList f53299j1;
    public final ci.d f53300k0;
    public ArrayList f53301k1;
    public final FrameLayout f53302l0;
    public boolean l1;
    public final ea0 m0;
    public TLRPC.PaymentForm f53303m1;
    public final FrameLayout f53304n0;
    public final er[] f53305n1;
    public final View f53306o0;
    public final a1 f53307o1;
    public final FrameLayout f53308p0;
    public ci.d4 f53309p1;
    public r3 f53310q0;
    public View f53311q1;
    public boolean f53312r0;
    public final e2 f53313s0;
    public final ei.k[] f53314t0;
    public final View f53315u0;
    public final LinearLayout f53316v0;
    public final dq f53317w0;
    public final TextView f53318x0;
    public boolean f53319y0;
    public final e2 f53320z0;

    public s3(Context context, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        super(context, null, false, false, d6Var);
        this.f53312r0 = false;
        this.Q0 = new int[2];
        this.S0 = -1;
        this.T0 = "";
        this.Z0 = new f4.d(0, 0);
        this.f53285c1 = true;
        this.f53305n1 = new er[1];
        this.f53307o1 = new a1(this, 7);
        this.currentAccount = i10;
        this.X = j3;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new rg.t0(this, context, 3);
        org.telegram.ui.s5 s5Var = new org.telegram.ui.s5(this, context);
        this.Y = s5Var;
        d2 d2Var = new d2(this, context);
        this.Z = d2Var;
        d2Var.setAdapter(new hw0(this, context, 5));
        v2();
        View view2 = new View(context);
        this.f53282b0 = view2;
        int i11 = org.telegram.ui.ActionBar.h6.f20893h5;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(view2, w7.x5.e(-1, 50, 80));
        this.containerView.addView(d2Var, w7.x5.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i11));
        AndroidUtilities.removeFromParent(this.d);
        s5Var.addView(this.d, w7.x5.e(-1, -1, 119));
        e2 e2Var = new e2(this, context, 0);
        this.f53292g0 = e2Var;
        e2Var.setOrientation(1);
        e2Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        s5Var.addView(e2Var, w7.x5.e(-1, -1, 55));
        ea0 ea0Var = new ea0(context, d6Var);
        this.f53294h0 = ea0Var;
        int i12 = org.telegram.ui.ActionBar.h6.f21061q5;
        ea0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        ea0Var.setTextSize(1, 12.0f);
        ea0Var.setGravity(17);
        ea0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        ea0Var.setDisablePaddingsOffsetY(true);
        e2Var.addView(ea0Var, w7.x5.t(-2, -2, 1, 4, -2, 4, 16));
        ea0Var.setVisibility(8);
        s01 s01Var = new s01(context, d6Var);
        this.f53296i0 = s01Var;
        e2Var.addView(s01Var, w7.x5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        ea0 ea0Var2 = new ea0(context, d6Var);
        this.f53298j0 = ea0Var2;
        ea0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        ea0Var2.setTextSize(1, 12.0f);
        ea0Var2.setGravity(17);
        ea0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.h6.Oh;
        ea0Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        ea0Var2.setDisablePaddingsOffsetY(true);
        ea0Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        e2Var.addView(ea0Var2, w7.x5.t(-2, -2, 1, 4, 2, 4, 8));
        ea0Var2.setVisibility(8);
        e2 e2Var2 = new e2(this, context, 1);
        this.f53313s0 = e2Var2;
        e2Var2.setOrientation(1);
        e2Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        s5Var.addView(e2Var2, w7.x5.e(-1, -1, 55));
        this.f53314t0 = r5;
        ei.k kVar = new ei.k(context, d6Var, false);
        kVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        e2Var2.addView(r5[0], w7.x5.n(-1, -2));
        ei.k kVar2 = new ei.k(context, d6Var, false);
        kVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        e2Var2.addView(r5[1], w7.x5.n(-1, -2));
        ei.k kVar3 = new ei.k(context, d6Var, false);
        ei.k[] kVarArr = {kVar, kVar2, kVar3};
        kVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        e2Var2.addView(kVarArr[2], w7.x5.n(-1, -2));
        View view3 = new View(context);
        this.f53315u0 = view3;
        int i14 = org.telegram.ui.ActionBar.h6.f20823d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
        e2Var2.addView(view3, w7.x5.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f53316v0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20913i6, d6Var), 6, 6));
        dq dqVar = new dq(context, 24, d6Var);
        this.f53317w0 = dqVar;
        dqVar.b(org.telegram.ui.ActionBar.h6.f20895h7, org.telegram.ui.ActionBar.h6.f20932j7, org.telegram.ui.ActionBar.h6.f20951k7);
        dqVar.setDrawUnchecked(true);
        dqVar.a(false, false);
        dqVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(dqVar, w7.x5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f53318x0 = textView;
        int i15 = org.telegram.ui.ActionBar.h6.f20930j5;
        textView.setTextColor(getThemedColor(i15));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 16, 9, 0, 0, 0));
        e2Var2.addView(linearLayout, w7.x5.t(-2, -2, 1, 0, 0, 0, 4));
        w7.z5.b(linearLayout, 0.025f, 1.5f);
        e2 e2Var3 = new e2(this, context, 2);
        this.f53320z0 = e2Var3;
        e2Var3.setOrientation(1);
        e2Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        s5Var.addView(e2Var3, w7.x5.e(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.A0 = textView2;
        ai.o(i15, d6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        e2Var3.addView(textView2, w7.x5.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        ai.o(i15, d6Var, textView3, 1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        e2Var3.addView(textView3, w7.x5.t(-1, -2, 7, 20, 6, 20, 24));
        ei.k kVar4 = new ei.k(context, d6Var, false);
        kVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        e2Var3.addView(r7[0], w7.x5.n(-1, -2));
        ei.k kVar5 = new ei.k(context, d6Var, false);
        kVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        e2Var3.addView(r7[1], w7.x5.n(-1, -2));
        ei.k kVar6 = new ei.k(context, d6Var, false);
        ei.k[] kVarArr2 = {kVar4, kVar5, kVar6};
        kVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        e2Var3.addView(kVarArr2[2], w7.x5.n(-1, -2));
        e2 e2Var4 = new e2(this, context, 3);
        this.B0 = e2Var4;
        e2Var4.setOrientation(1);
        e2Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        s5Var.addView(e2Var4, w7.x5.e(-1, -1, 55));
        ei.k kVar7 = new ei.k(context, d6Var, false);
        kVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        e2Var4.addView(r9[0], w7.x5.n(-1, -2));
        ei.k kVar8 = new ei.k(context, d6Var, false);
        kVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        e2Var4.addView(r9[1], w7.x5.n(-1, -2));
        ei.k kVar9 = new ei.k(context, d6Var, false);
        ei.k[] kVarArr3 = {kVar7, kVar8, kVar9};
        kVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        e2Var4.addView(kVarArr3[2], w7.x5.n(-1, -2));
        e2Var.setAlpha(1.0f);
        e2Var2.setAlpha(0.0f);
        e2Var3.setAlpha(0.0f);
        e2Var4.setAlpha(0.0f);
        p3 p3Var = new p3(context, d6Var, new a1(this, 9), new t0(this, 13), new t0(this, 14), new t0(this, 15), new t0(this, 16), new t0(this, 17), new t0(this, 18), new t0(this, 19));
        this.f53290f0 = p3Var;
        p3Var.L.f53342c.setOnClickListener(new t0(this, 20));
        int i16 = this.backgroundPaddingLeft;
        p3Var.setPadding(i16, 0, i16, 0);
        s5Var.addView(p3Var, w7.x5.e(-1, -2, 55));
        gg.a0 a0Var = this.f25733c;
        this.P = true;
        a0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f53302l0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        View view4 = new View(context);
        this.f53306o0 = view4;
        view4.setBackgroundColor(getThemedColor(i14));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, w7.x5.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ci.d f7 = ai.f(24, context, d6Var, true);
        this.f53300k0 = f7;
        f7.g(LocaleController.getString(R.string.OK), false, true);
        f7.f(null, false);
        FrameLayout.LayoutParams a2 = w7.x5.a(48.0f, 0.0f, 12.0f, 0.0f, 12.0f, -1, 119);
        a2.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        a2.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(f7, a2);
        s5Var.addView(frameLayout, w7.x5.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f53304n0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        ea0 ea0Var3 = new ea0(context, null);
        this.m0 = ea0Var3;
        ea0Var3.setTextSize(1, 12.0f);
        ea0Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        ea0Var3.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        ea0Var3.setGravity(17);
        frameLayout2.addView(ea0Var3, w7.x5.a(-2.0f, 16.0f, 8.0f, 16.0f, 14.0f, -1, 17));
        s5Var.addView(frameLayout2, w7.x5.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new nh0(this, 22));
        linearLayout.setOnClickListener(new t0(this, 12));
        i10 i10Var = new i10(context);
        this.f53280a0 = i10Var;
        s5Var.addView(i10Var, w7.x5.d(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f53308p0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        s5Var.addView(frameLayout3, w7.x5.a(200.0f, 0.0f, 0.0f, 0.0f, 60.0f, -1, 87));
        AndroidUtilities.removeFromParent(this.f25734e);
        s5Var.addView(this.f25734e, w7.x5.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 0));
        f2 f2Var = new f2(context);
        this.f53288e0 = f2Var;
        s5Var.addView(f2Var, w7.x5.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new ii.q1(f2Var, 26), 12.0f, 12, null, arrayList);
    }

    public static void A0(s3 s3Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        a1 a1Var = s3Var.f53307o1;
        s3Var.l1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(s3Var.currentAccount).putUsers(paymentForm.users, false);
            s3Var.f53303m1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(a1Var);
            AndroidUtilities.runOnUIThread(a1Var);
            return;
        }
        sc Y = s3Var.getBulletinFactory().Y(tL_error);
        Y.f30843t = true;
        Y.j();
    }

    public static void B0(s3 s3Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        d5 F;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            k1 k1Var = null;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                s3Var.dismiss();
                long B1 = s3Var.B1();
                if (!z10) {
                    n5.y(s3Var.currentAccount, false).Q(B1);
                }
                if (B1 >= 0) {
                    ad a02 = ad.a0(U);
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
                        k1Var = new k1(B1, U);
                    }
                    a02.s(document, string, AndroidUtilities.replaceSingleTag(string2, k1Var)).k(true);
                    return;
                }
                ad a03 = ad.a0(U);
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
                if (z10 && s3Var.D0 != null && (F = n5.y(s3Var.currentAccount, false).F(s3Var.X, false)) != null) {
                    F.m(s3Var.D0, !savestargift.unsave);
                }
                s3Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
            }
        }
    }

    public static void C0(s3 s3Var, long j3) {
        new xh.r1(s3Var.getContext(), s3Var.currentAccount, j3, null, new u1(s3Var, 2)).show();
    }

    public static void D0(s3 s3Var, of.e eVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        boolean z10 = false;
        eVar.c(false);
        a2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            int i10 = 0;
            while (i10 < tL_starGiftUnique.attributes.size()) {
                if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                    tL_starGiftUnique.attributes.remove(i10);
                    i10--;
                }
                i10++;
            }
            TL_stars.SavedStarGift savedStarGift = s3Var.D0;
            if (savedStarGift != null) {
                z10 = savedStarGift.refunded;
            }
            s3Var.m2(tL_starGiftUnique, z10, null, null);
            AndroidUtilities.runOnUIThread(new tg.c1(22, s3Var, tL_starGiftUnique));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
            new e7(s3Var.getContext(), s3Var.resourcesProvider, j3, 16, null, new tg.c1(24, s3Var, charSequence), 0L).show();
        } else if (tL_error != null) {
            s3Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void E0(s3 s3Var, String str) {
        Context context = s3Var.getContext();
        of.f.u(context, MessagesController.getInstance(s3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static String E1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return LocaleController.getString(R.string.Gift2Gift);
        }
    }

    public static void F0(s3 s3Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, tg.m1[] m1VarArr, Long l4) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l4.longValue() == -99) {
            if (i10 < i11) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s3Var.getContext(), 0, s3Var.resourcesProvider);
                String string = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                return;
            }
            LinearLayout linearLayout = new LinearLayout(s3Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new v2(s3Var.getContext(), tL_starGiftUnique), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(s3Var.getContext());
            int i13 = org.telegram.ui.ActionBar.h6.f20930j5;
            org.telegram.ui.Cells.c1.n(i13, s3Var.resourcesProvider, textView, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, w7.x5.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(s3Var.getContext());
            ai.o(i13, s3Var.resourcesProvider, textView2, 1, 16.0f);
            ai.r(R.string.Gift2ExportTONFragmentText, new Object[]{s3Var.D1()}, textView2);
            linearLayout.addView(textView2, w7.x5.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s3Var.getContext(), 0, s3Var.resourcesProvider);
            alertDialog$Builder2.n(linearLayout);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new q9.p(22, s3Var, m1VarArr));
            hg.c.p(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        pi.h hVar = new pi.h(s3Var, l4, m1VarArr, 14);
        if (l4.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(s3Var.currentAccount).getChatFull(-l4.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(s3Var.currentAccount).getInputChannel(-l4.longValue());
                ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(tL_channels_getFullChannel, new cj1(7, s3Var, hVar));
                return;
            } else if (!chatFull.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(s3Var.getContext(), 0, s3Var.resourcesProvider);
                String string2 = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder3.f20404a;
                a2Var2.R = string2;
                a2Var2.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder3, null);
                return;
            }
        } else if (l4.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(s3Var.currentAccount).getUser(l4);
            TLRPC.UserFull userFull = MessagesController.getInstance(s3Var.currentAccount).getUserFull(l4.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new ad(m1VarArr[0].container, s3Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f20208id = MessagesController.getInstance(s3Var.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(tL_users_getFullUser, new ai.q3(s3Var, m1VarArr, l4, hVar, 17));
                return;
            }
        }
        hVar.run();
    }

    public static void H0(s3 s3Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            int i10 = 0;
            MessagesController.getInstance(s3Var.currentAccount).putUsers(paymentForm.users, false);
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
            ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new e1(s3Var, j3, j10, callback, j11));
            return;
        }
        callback.run(tL_error);
        sc Y = s3Var.getBulletinFactory().Y(tL_error);
        Y.f30843t = true;
        Y.j();
    }

    public static void I0(s3 s3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, long j3, long j10, long j11, TLRPC.TL_error tL_error) {
        a2Var.c(400L);
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            s3Var.dismiss();
            n5.y(s3Var.currentAccount, false).Q(j3);
            if (j3 >= 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(s3Var.currentAccount).getUserFull(j10);
                if (userFull != null) {
                    int max = Math.max(0, userFull.stargifts_count - 1);
                    userFull.stargifts_count = max;
                    if (max <= 0) {
                        userFull.flags2 &= -257;
                    }
                }
                n5.y(s3Var.currentAccount, false).P();
                n5.y(s3Var.currentAccount, false).T(true);
                if (!(U instanceof p7)) {
                    p7 p7Var = new p7();
                    p7Var.whenFullyVisible(new org.telegram.ui.web.d0(p7Var, j11, 2));
                    U.presentFragment(p7Var);
                    return;
                }
                ad.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j11), R.raw.stars_topup).k(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j3);
            bundle.putBoolean("start_from_monetization", true);
            ab1 ab1Var = new ab1(bundle);
            o.g(s3Var.currentAccount).h(j3, true);
            o.g(s3Var.currentAccount).l(j3);
            ab1Var.whenFullyVisible(new org.telegram.ui.web.d0(ab1Var, j11, 3));
            U.presentFragment(ab1Var);
        } else if (tL_error != null) {
            s3Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
        } else {
            s3Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
        }
    }

    public static void J0(s3 s3Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        s3Var.H0 = tL_starGiftUnique;
        s3Var.m2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void K0(long j3, long j10, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, s3 s3Var) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(s3Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.o0(j3, j10, callback, tLObject, tL_error, s3Var));
    }

    public static String K1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
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
            return ei.l.H0(i10);
        } else {
            return "";
        }
    }

    public static void M0(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j3, CharSequence charSequence, org.telegram.ui.ActionBar.a2 a2Var) {
        of.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new ow(s3Var, g10, a2Var, tL_starGiftUnique, j3, charSequence));
    }

    public static void N0(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(s3Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new l1(s3Var, tL_starGiftUnique, aVar, runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new m1(s3Var, tL_error, runnable, 1));
        }
    }

    public static void O0(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.a2 a2Var) {
        s3Var.getClass();
        of.e g10 = a2Var.g(-1, true, true);
        g10.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = s3Var.F1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(updatestargiftprice, new ai.t5(s3Var, g10, tL_starGiftUnique, 22));
    }

    public static boolean O1(int i10, long j3) {
        if (j3 >= 0) {
            if (UserConfig.getInstance(i10).getClientUserId() == j3) {
                return true;
            }
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), 5);
    }

    public static void P0(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o9 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = s3Var.F1();
        updatestargiftprice.resell_amount = o9;
        ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(updatestargiftprice, new z0(s3Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static boolean P1(int i10, long j3) {
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

    public static void Q(s3 s3Var, long j3) {
        new xh.r1(s3Var.getContext(), s3Var.currentAccount, j3, null, new u1(s3Var, 2)).show();
    }

    public static void Q0(s3 s3Var, long j3) {
        new xh.r1(s3Var.getContext(), s3Var.currentAccount, j3, null, new u1(s3Var, 2)).show();
    }

    public static boolean Q1(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
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
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f20295id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f20295id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void R(s3 s3Var, String str) {
        Context context = s3Var.getContext();
        of.f.u(context, MessagesController.getInstance(s3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void R0(s3 s3Var, String str) {
        Context context = s3Var.getContext();
        of.f.u(context, MessagesController.getInstance(s3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void S(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, xh.l0 l0Var, w2 w2Var, of.e eVar) {
        eVar.d();
        n5.x(s3Var.currentAccount, w2Var.f53449a).h(w2Var.f53450b, tL_starGiftUnique, j3, tL_textWithEntities, z10, new ap0(s3Var, eVar, tL_starGiftUnique, j3, l0Var, 1));
    }

    public static void S0(s3 s3Var, TLObject tLObject, pi.h hVar, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(s3Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(s3Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
            MessagesController.getInstance(s3Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
            if (!tL_messages_chatFull.full_chat.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s3Var.getContext(), 0, s3Var.resourcesProvider);
                alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                return;
            }
            hVar.run();
            return;
        }
        sc Y = s3Var.getBulletinFactory().Y(tL_error);
        Y.f30843t = true;
        Y.j();
    }

    public static void T(long j3, long j10, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error, s3 s3Var) {
        long j11;
        s3 s3Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            if (tLObject instanceof TLRPC.Updates) {
                if (j3 >= 0 && j10 >= 0) {
                    zn W9 = zn.W9(j3);
                    j11 = j3;
                    s3Var2 = s3Var;
                    W9.whenFullyVisible(new q1(s3Var2, W9, j11, 0));
                    U.presentFragment(W9);
                } else {
                    j11 = j3;
                    s3Var2 = s3Var;
                    sc M = ad.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var2.D1(), DialogObject.getShortName(j11))), R.raw.forward);
                    M.f30843t = true;
                    M.j();
                }
            } else {
                j11 = j3;
                s3Var2 = s3Var;
                ad.a0(U).f0(tL_error, false);
            }
        } else {
            j11 = j3;
            s3Var2 = s3Var;
        }
        n5.y(s3Var2.currentAccount, false).Q(j11);
        n5.y(s3Var2.currentAccount, false).Q(j10);
    }

    public static void T0(s3 s3Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        s3Var.f53291f1 = true;
        s3Var.k2(messageObject, null);
        s3Var.s2(0, true, null);
        i10 i10Var = s3Var.f53280a0;
        if (i10Var != null) {
            i10Var.c(true);
        }
        n5.y(s3Var.currentAccount, false).P();
        f5 G = n5.y(s3Var.currentAccount, false).G(UserConfig.getInstance(s3Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.j(arrayList, starGift);
        }
    }

    public static void U(s3 s3Var, org.telegram.ui.ActionBar.a2 a2Var, MessageObject messageObject) {
        a2Var.dismiss();
        s3Var.K0 = true;
        s3Var.k2(messageObject, null);
        super.show();
    }

    public static void U0(yh.s3 r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: yh.s3.U0(yh.s3, android.view.View):void");
    }

    public static void V(s3 s3Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.f20089id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(s3Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new pi.h(s3Var, tLObject, messageObject, 15));
        }
    }

    public static void V0(s3 s3Var, Long l4) {
        String str;
        String formatString;
        TLRPC.Chat chat;
        if (l4.longValue() < 0 && (chat = MessagesController.getInstance(s3Var.currentAccount).getChat(Long.valueOf(-l4.longValue()))) != null) {
            str = chat.title;
        } else {
            str = "";
        }
        ad bulletinFactory = s3Var.getBulletinFactory();
        int i10 = R.raw.contact_check;
        if (TextUtils.isEmpty(str)) {
            formatString = LocaleController.getString(R.string.GiftRepostedToProfile);
        } else {
            formatString = LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str);
        }
        sc Q = bulletinFactory.Q(i10, 36, AndroidUtilities.replaceTags(formatString));
        Q.f30843t = true;
        Q.j();
    }

    public static void W(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j3 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String D1 = s3Var.D1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ApplicationLoader.applicationContext, 3, null);
        a2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final s3 s3Var2 = s3.this;
                final org.telegram.ui.ActionBar.a2 a2Var2 = a2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = D1;
                final long j10 = j3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        s3.a1(s3.this, a2Var2, tLObject, document2, str4, str5, str6, j10, tL_error);
                    }
                });
            }
        });
    }

    public static void W0(s3 s3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(s3Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(s3Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new tg.c1(25, s3Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new tg.c1(26, a2Var, tL_error));
    }

    public static void X(s3 s3Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        d5 F;
        TLRPC.Message message;
        ci.d dVar = s3Var.f53300k0;
        if (!dVar.N) {
            TL_stars.InputSavedStarGift F1 = s3Var.F1();
            MessageObject messageObject = s3Var.F0;
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
                TL_stars.SavedStarGift savedStarGift = s3Var.D0;
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
            savestargift.stargift = F1;
            if (s3Var.D0 != null && (F = n5.y(s3Var.currentAccount, false).F(s3Var.X, false)) != null) {
                F.m(s3Var.D0, savestargift.unsave);
                z11 = true;
            } else {
                z11 = false;
            }
            ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(savestargift, new wh.f(s3Var, z11, document2, z12, savestargift));
        }
    }

    public static void X0(s3 s3Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        if (s3Var.getContext() != null) {
            if (tL_error != null) {
                if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(new TL_account.getPassword(), new r1(s3Var, twoStepVerificationActivity, 1), 8);
                        return;
                    }
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                    ad.d0(tL_error);
                    return;
                }
                twoStepVerificationActivity.o0();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s3Var.getContext());
                alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
                LinearLayout linearLayout = new LinearLayout(s3Var.getContext());
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                TextView textView = new TextView(s3Var.getContext());
                int i16 = org.telegram.ui.ActionBar.h6.f20930j5;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                textView.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 48);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
                linearLayout.addView(textView, w7.x5.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(s3Var.getContext());
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView = new ImageView(s3Var.getContext());
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
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i16, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                TextView textView2 = new TextView(s3Var.getContext());
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                textView2.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView2.setGravity(i12 | 48);
                org.telegram.messenger.q.n(R.string.Gift2TransferToTONAlertText1, textView2);
                if (LocaleController.isRTL) {
                    linearLayout2.addView(textView2, w7.x5.n(-1, -2));
                    linearLayout2.addView(imageView, w7.x5.q(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, w7.x5.n(-2, -2));
                    linearLayout2.addView(textView2, w7.x5.n(-1, -2));
                }
                LinearLayout linearLayout3 = new LinearLayout(s3Var.getContext());
                linearLayout3.setOrientation(0);
                linearLayout.addView(linearLayout3, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView2 = new ImageView(s3Var.getContext());
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
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i16, false), mode));
                TextView textView3 = new TextView(s3Var.getContext());
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                textView3.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                textView3.setGravity(i14 | 48);
                org.telegram.messenger.q.n(R.string.Gift2TransferToTONAlertText2, textView3);
                if (LocaleController.isRTL) {
                    linearLayout3.addView(textView3, w7.x5.n(-1, -2));
                    i15 = 5;
                    linearLayout3.addView(imageView2, w7.x5.q(-2, -2, 5));
                } else {
                    i15 = 5;
                    linearLayout3.addView(imageView2, w7.x5.n(-2, -2));
                    linearLayout3.addView(textView3, w7.x5.n(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new w9.v(s3Var, 8));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    TextView textView4 = new TextView(s3Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                    textView4.setTextSize(1, 16.0f);
                    if (!LocaleController.isRTL) {
                        i15 = 3;
                    }
                    textView4.setGravity(i15 | 48);
                    textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
                    linearLayout.addView(textView4, w7.x5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                }
                twoStepVerificationActivity.showDialog(alertDialog$Builder.f20404a);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                of.f.u(s3Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
            }
        }
    }

    public static boolean Y(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, sy syVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(s3Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j3) {
            org.telegram.ui.Components.g5.m0(s3Var.getContext(), s3Var.resourcesProvider, s3Var.currentAccount, tL_starGiftUnique, giftThemeUser, new p31(s3Var, j3, tL_starGiftUnique, syVar, 10));
            return true;
        }
        ChatThemeController.getInstance(s3Var.currentAccount).setDialogTheme(j3, new fg.b(null, tL_starGiftUnique.slug));
        syVar.presentFragment(zn.W9(j3), true);
        return true;
    }

    public static void Z(s3 s3Var) {
        int i10;
        long j3;
        long j10;
        long j11;
        String string;
        final long clientUserId = UserConfig.getInstance(s3Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift F1 = s3Var.F1();
        if (F1 != null) {
            MessageObject messageObject = s3Var.F0;
            if (messageObject != null) {
                i10 = messageObject.messageOwner.date;
                boolean isOutOwner = messageObject.isOutOwner();
                MessageObject messageObject2 = s3Var.F0;
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
                            j3 = s3Var.F0.getDialogId();
                        }
                        j10 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = s3Var.D0;
                if (savedStarGift != null) {
                    i10 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j3 = DialogObject.getPeerDialogId(savedStarGift.from_id);
                    } else {
                        j3 = 2666000;
                    }
                    j10 = s3Var.D0.convert_stars;
                    j11 = s3Var.X;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (MessagesController.getInstance(s3Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(s3Var.currentAccount).getCurrentTime() - i10)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s3Var.getContext(), 0, s3Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ConvertTitle);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
            a2Var.R = string2;
            if (!UserObject.isService(j3) && j3 != 2666000) {
                string = DialogObject.getShortName(j3);
            } else {
                string = LocaleController.getString(R.string.StarsTransactionHidden);
            }
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, string, LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j10)));
            final long j12 = j10;
            final long j13 = j11;
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.z1() {
                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var2, int i11) {
                    s3.l0(s3.this, F1, j13, clientUserId, j12);
                }
            });
            hg.c.p(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void Z0(s3 s3Var, String str, long j3) {
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f21349a = true;
        xh.i4 i4Var = new xh.i4(s3Var.X, str, j3, s3Var.resourcesProvider);
        i4Var.f51406e = new u1(s3Var, 0);
        R.showAsSheet(i4Var, obj);
    }

    public static void a0(s3 s3Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, cd[] cdVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift C1 = s3Var.C1();
        GiftAuctionController.getInstance(s3Var.currentAccount).requestAuctionUpgrades(C1.gift_id, new sa(s3Var, C1, starGiftAttribute, cdVarArr, zArr, 5));
    }

    public static void a1(s3 s3Var, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j3, TLRPC.TL_error tL_error) {
        s01 s01Var;
        LinearLayout linearLayout;
        float f7;
        float f10;
        int round;
        a2Var.dismiss();
        if (tLObject instanceof TL_stars.UniqueStarGiftValueInfo) {
            TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
            org.telegram.ui.ActionBar.e3 i10 = ai.i(1, s3Var.getContext(), s3Var.resourcesProvider, false);
            LinearLayout linearLayout2 = new LinearLayout(s3Var.getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            y9 y9Var = new y9(s3Var.getContext());
            p7.a1(y9Var.getImageReceiver(), document, 160);
            linearLayout2.addView(y9Var, w7.x5.t(160, 160, 1, 0, 0, 0, 0));
            TextView textView = new TextView(s3Var.getContext());
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, s3Var.resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, s3Var.resourcesProvider)));
            textView.setGravity(17);
            linearLayout2.addView(textView, w7.x5.t(-2, 42, 1, 0, 12, 0, 15));
            textView.setText(str);
            TextView textView2 = new TextView(s3Var.getContext());
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20930j5, s3Var.resourcesProvider));
            textView2.setGravity(17);
            linearLayout2.addView(textView2, w7.x5.t(-2, -2, 1, 16, 0, 16, 19));
            if (uniqueStarGiftValueInfo.value_is_average) {
                ai.r(R.string.GiftValueAverage, new Object[]{str2}, textView2);
            } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
                ai.r(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
            } else {
                ai.r(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
            }
            FrameLayout frameLayout = new FrameLayout(s3Var.getContext());
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            org.telegram.tgnet.e eVar = new org.telegram.tgnet.e(s3Var, new ci.d4[1], frameLayout, 8);
            s01 s01Var2 = new s01(s3Var.getContext(), s3Var.resourcesProvider);
            frameLayout.addView(s01Var2, w7.x5.e(-1, -1, 119));
            s01Var2.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
            String string = LocaleController.getString(R.string.GiftValueInitialPrice);
            StringBuilder sb2 = new StringBuilder("⭐️");
            sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
            sb2.append(" (~");
            s01Var2.c(string, p7.Y0(false, a1.g.t(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                s01Var2.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
                if (((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100 > 0) {
                    s01Var2.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
                } else {
                    s01Var2.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                }
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                p1 p1Var = new p1(eVar, r10, uniqueStarGiftValueInfo, str2, 0);
                s01Var = s01Var2;
                TableRow e7 = s01Var.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", p1Var, null);
                cd[] cdVarArr = {(cd) ((p01) e7.getChildAt(1)).getChildAt(0)};
                e7.setOnClickListener(new org.telegram.ui.Components.voip.p(p1Var, 22));
            } else {
                s01Var = s01Var2;
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                p1 p1Var2 = new p1(eVar, r10, uniqueStarGiftValueInfo, str2, 1);
                TableRow e10 = s01Var.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", p1Var2, null);
                cd[] cdVarArr2 = {(cd) ((p01) e10.getChildAt(1)).getChildAt(0)};
                e10.setOnClickListener(new org.telegram.ui.Components.voip.p(p1Var2, 23));
            }
            linearLayout2.addView(frameLayout, w7.x5.t(-1, -2, 7, 0, 0, 0, 12));
            if (uniqueStarGiftValueInfo.listed_count > 0) {
                ci.d dVar = new ci.d(s3Var.getContext(), s3Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) "e");
                f10 = 1.0f;
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.b6(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
                dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
                linearLayout = linearLayout2;
                f7 = 2.0f;
                dVar.setOnClickListener(new fo(s3Var, str2, j3, 6));
                linearLayout.addView(dVar, w7.x5.t(-1, 42, 7, 0, 0, 0, 2));
            } else {
                linearLayout = linearLayout2;
                f7 = 2.0f;
                f10 = 1.0f;
            }
            if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                ci.d dVar2 = new ci.d(s3Var.getContext(), s3Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
                spannableStringBuilder2.append((CharSequence) "e");
                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.b6(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
                dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f7), AndroidUtilities.dp(f10)), false, true);
                dVar2.setOnClickListener(new xh.a(10, s3Var, uniqueStarGiftValueInfo));
                linearLayout.addView(dVar2, w7.x5.t(-1, 42, 7, 0, 0, 0, 0));
            }
            i10.customView = linearLayout;
            i10.show();
        } else if (tL_error != null) {
            s3Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void b0(s3 s3Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        s3Var.l1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(s3Var.currentAccount).putUsers(paymentForm.users, false);
            s3Var.f53303m1 = paymentForm;
            s3Var.c2();
            return;
        }
        sc Y = s3Var.getBulletinFactory().Y(tL_error);
        Y.f30843t = true;
        Y.j();
    }

    public static void b1(s3 s3Var, final xh.l0 l0Var, zf.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        s3Var.f53300k0.setLoading(false);
        if (l0Var != null && l0Var.L) {
            l0Var.L = false;
            l0Var.H.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new y2(s3Var.getContext(), s3Var.resourcesProvider, tL_starGiftUnique, new w2(bVar, tL_payments_paymentFormStarGift), s3Var.currentAccount, j3, s3Var.D1(), false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                s3.S(s3.this, tL_starGiftUnique, j3, tL_textWithEntities, z10, l0Var, (w2) obj, (of.e) obj2);
            }
        }).b();
    }

    public static void c0(s3 s3Var) {
        Bundle bundle = new Bundle();
        long j3 = s3Var.X;
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        if (j3 == UserConfig.getInstance(s3Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        e2(new ProfileActivity(bundle, null));
    }

    public static void c1(s3 s3Var) {
        ci.d dVar = s3Var.f53300k0;
        if (UserConfig.getInstance(s3Var.currentAccount).isPremium() && (Q1(s3Var.currentAccount, s3Var.L1()) || s3Var.W0)) {
            s3Var.t2(false);
            return;
        }
        TL_stars.TL_starGiftUnique L1 = s3Var.L1();
        if (L1 == null) {
            return;
        }
        TLRPC.Peer peer = L1.owner_id;
        if (peer == null) {
            peer = L1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(L1.title);
        sb2.append(" #");
        s3Var.A0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.q.h(L1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(s3Var.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (s3Var.V0 == null) {
                s3Var.V0 = new er(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(s3Var.V0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new t0(s3Var, 26));
        s3Var.f53290f0.setWearPreview(MessagesController.getInstance(s3Var.currentAccount).getUserOrChat(peerDialogId));
        s3Var.s2(2, true, null);
    }

    public static void d0(s3 s3Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
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
                        messageObject = new MessageObject(s3Var.currentAccount, message, false, false);
                        break;
                    }
                } else {
                    messageObject = null;
                    break;
                }
            }
            MessagesController.getInstance(s3Var.currentAccount).lambda$processUpdates$377(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new i1(s3Var, messageObject, arrayList, starGift, 1));
                return;
            }
            callback2.run(null, null);
            n5.y(s3Var.currentAccount, false).P();
            f5 G = n5.y(s3Var.currentAccount, false).G(UserConfig.getInstance(s3Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.j(arrayList, null);
            }
        } else if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(s3Var.getContext(), 0, new ai.d());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(s3Var.currentAccount).getCurrentTime();
                    alertDialog$Builder = new AlertDialog$Builder(s3Var.getContext(), 0, new ai.d());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f20404a;
                    a2Var2.R = string2;
                    a2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                    i10 = R.string.OK;
                } else {
                    s3Var.getBulletinFactory().f0(tL_error, false);
                    runnable.run();
                }
            }
            org.telegram.messenger.q.p(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void d1(s3 s3Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
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
            LinearLayout linearLayout = new LinearLayout(s3Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            TextView b10 = w7.b6.b(s3Var.getContext(), 16.0f, org.telegram.ui.ActionBar.h6.f20930j5, false, null);
            b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
            linearLayout.addView(b10, w7.x5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
            s01 s01Var = new s01(s3Var.getContext(), s3Var.resourcesProvider);
            q01 a2 = s01Var.a(charSequence);
            a2.setFilled(true);
            vh.n nVar = (vh.n) a2.getChildAt(0);
            nVar.setTextSize(1, 12.0f);
            nVar.setGravity(17);
            linearLayout.addView(s01Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s3Var.getContext(), 0, s3Var.resourcesProvider);
            alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(p7.R0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j3))), new j31(s3Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j3, charSequence));
            alertDialog$Builder.o();
        } else if (tL_error != null) {
            s3Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void e0(s3 s3Var, long j3, TL_stars.TL_starGiftUnique tL_starGiftUnique, sy syVar) {
        ChatThemeController.getInstance(s3Var.currentAccount).setDialogTheme(j3, new fg.b(null, tL_starGiftUnique.slug));
        syVar.presentFragment(zn.W9(j3), true);
    }

    public static void e1(s3 s3Var, long j3) {
        e7 e7Var = new e7(s3Var.getContext(), s3Var.resourcesProvider, j3, 10, null, new tg.c1(21, s3Var, new boolean[]{false}), 0L);
        e7Var.setOnDismissListener(new v1(s3Var, 0));
        e7Var.show();
    }

    public static void e2(org.telegram.ui.ActionBar.m2 m2Var) {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f21349a = true;
        U.showAsSheet(m2Var, obj);
    }

    public static void f0(s3 s3Var, long j3, long j10, Utilities.Callback callback) {
        e7 e7Var = new e7(s3Var.getContext(), s3Var.resourcesProvider, j3, 11, null, new p31(s3Var, new boolean[]{false}, j10, callback, 11), 0L);
        e7Var.setOnDismissListener(new v1(s3Var, 1));
        e7Var.show();
    }

    public static void f1(s3 s3Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(s3Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(s3Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.f20089id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(s3Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new pi.h(s3Var, a2Var, messageObject, 19));
        } else {
            AndroidUtilities.runOnUIThread(new ei.e3(a2Var, 1));
        }
    }

    public static void g0(s3 s3Var, TLObject tLObject, long j3, long j10, Utilities.Callback callback, TLRPC.TL_error tL_error, long j11) {
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(s3Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(s3Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            n5.y(s3Var.currentAccount, false).T(false);
            n5.y(s3Var.currentAccount, false).Q(j3);
            n5.y(s3Var.currentAccount, false).Q(j10);
            n5.y(s3Var.currentAccount, false).P();
            callback.run(null);
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                if (j3 >= 0 && j10 >= 0) {
                    zn W9 = zn.W9(j3);
                    W9.whenFullyVisible(new q1(s3Var, W9, j3, 1));
                    U.presentFragment(W9);
                } else {
                    sc M = ad.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, s3Var.D1(), DialogObject.getShortName(j3))), R.raw.forward);
                    M.f30843t = true;
                    M.j();
                }
            }
            Utilities.stageQueue.postRunnable(new t1(s3Var, tL_payments_paymentResult, 1));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(s3Var.currentAccount).starsPurchaseAvailable()) {
                s3Var.f53300k0.setLoading(false);
                n5.e0(s3Var.getContext(), s3Var.resourcesProvider);
                return;
            }
            n5 y3 = n5.y(s3Var.currentAccount, false);
            a3.g0 g0Var = new a3.g0(s3Var, j11, j3, callback, 16);
            y3.f53034e = false;
            y3.q(false, true, g0Var);
            y3.f53034e = true;
        } else {
            callback.run(tL_error);
            s3Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void g1(TLObject tLObject, TLRPC.TL_error tL_error, TL_stars.InputSavedStarGift inputSavedStarGift, s3 s3Var) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(s3Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(s3Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new i1(tLObject, tL_error, inputSavedStarGift, s3Var));
    }

    public static void h0(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        TL_stars.StarGift starGift;
        if (s3Var.U0 == null) {
            xh.g4 g4Var = new xh.g4(s3Var.currentAccount, tL_starGiftUnique.gift_id);
            s3Var.U0 = g4Var;
            g4Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            r2[] r2VarArr = s3Var.f53290f0.L.f53355n;
            if (i10 < r2VarArr.length) {
                TL_stars.StarGift starGift2 = r2VarArr[i10].h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    hashSet.add(Long.valueOf(starGift2.f20295id));
                }
                i10++;
            } else {
                xh.h4 h4Var = new xh.h4(s3Var.getContext(), tL_starGiftUnique.title, s3Var.U0);
                h4Var.f51395g0.addAll(hashSet);
                h4Var.f51397i0.N(true);
                h4Var.f51396h0 = bool.booleanValue();
                h4Var.f51393e0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                h4Var.f51394f0 = new v0(0, callback);
                h4Var.show();
                return;
            }
        }
    }

    public static void h1(s3 s3Var) {
        TL_stars.SavedStarGift savedStarGift = s3Var.D0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            d5 F = n5.y(s3Var.currentAccount, false).F(s3Var.X, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = s3Var.D0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = s3Var.F1();
            savestargift.unsave = s3Var.D0.unsaved;
            ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = s3Var.D0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((f5) s3Var.E0).m(savedStarGift3, !z10, false)) {
            new xh.r2(s3Var.getContext(), s3Var.X, s3Var.D0, s3Var.resourcesProvider, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    return s3.this.getBulletinFactory();
                }
            }).show();
        } else if (!z10) {
            s3Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        } else {
            org.telegram.messenger.q.q(R.string.Gift2Unpinned, s3Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        }
    }

    public static SpannableStringBuilder h2(String str) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i11 = indexOf2 - indexOf) > 2) {
            i10 = i11 - 2;
        } else {
            indexOf = -1;
            i10 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new to(1), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void i0(s3 s3Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(s3Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(s3Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            n5.y(s3Var.currentAccount, false).T(false);
            n5.y(s3Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = s3Var.D0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            s3Var.f53312r0 = true;
            s3Var.f53303m1 = null;
            s3Var.s1(inputSavedStarGift, tL_payments_paymentResult.updates, new s1(s3Var, str, 0));
            Utilities.stageQueue.postRunnable(new t1(s3Var, tL_payments_paymentResult, 0));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(s3Var.currentAccount).starsPurchaseAvailable()) {
                s3Var.f53300k0.setLoading(false);
                n5.e0(s3Var.getContext(), s3Var.resourcesProvider);
                return;
            }
            n5 y3 = n5.y(s3Var.currentAccount, false);
            b1 b1Var = new b1(s3Var, j3, 3);
            y3.f53034e = false;
            y3.q(false, true, b1Var);
            y3.f53034e = true;
        } else {
            s3Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void i1(s3 s3Var, String str) {
        Context context = s3Var.getContext();
        of.f.u(context, MessagesController.getInstance(s3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static SpannableStringBuilder i2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new er(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new er(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void j0(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable) {
        s3Var.getClass();
        TL_stars.StarsAmount o9 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = s3Var.F1();
        updatestargiftprice.resell_amount = o9;
        ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(updatestargiftprice, new z0(s3Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void j1(s3 s3Var, String str) {
        long j3 = s3Var.X;
        s3Var.f53300k0.setLoading(false);
        if (!TextUtils.isEmpty(str)) {
            s3Var.dismiss();
            org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            if (R instanceof zn) {
                zn znVar = (zn) R;
                if (znVar.a() == j3) {
                    ad.a0(znVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j3))), R.raw.gift).k(true);
                    return;
                }
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(s3Var.currentAccount);
            int i10 = NotificationCenter.closeProfileActivity;
            Long valueOf = Long.valueOf(j3);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
            NotificationCenter.getInstance(s3Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j3), bool);
            zn W9 = zn.W9(j3);
            W9.whenFullyVisible(new tg.c1(23, s3Var, W9));
            R.presentFragment(W9);
            return;
        }
        s3Var.s2(0, true, null);
    }

    public static void k0(s3 s3Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(s3Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(s3Var.currentAccount).putChats(messages_messages.chats, false);
        s3Var.K0 = true;
        s3Var.J0 = false;
        Boolean bool = s3Var.f53293g1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        s3Var.k2(messageObject, null);
    }

    public static void k1(s3 s3Var, boolean z10) {
        int i10;
        Object obj;
        xh.n2 n2Var;
        xh.n2 n2Var2;
        xh.n2 n2Var3;
        int H1 = s3Var.H1();
        if (H1 >= 0) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i11 = i10 + H1;
            int i12 = s3Var.S0;
            if (i12 >= 0 && (!z10 ? i12 < H1 : i12 > H1)) {
                i11 = i12;
            }
            g5 g5Var = s3Var.E0;
            if (g5Var != null && i11 >= 0 && i11 < g5Var.e()) {
                obj = s3Var.E0.get(i11);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z10) {
                    n2Var = s3Var.f53286d0;
                } else {
                    n2Var = s3Var.f53284c0;
                }
                if (n2Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z10) {
                            n2Var3 = s3Var.f53286d0;
                        } else {
                            n2Var3 = s3Var.f53284c0;
                        }
                        if (y1(n2Var3.D0, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z10) {
                            n2Var2 = s3Var.f53286d0;
                        } else {
                            n2Var2 = s3Var.f53284c0;
                        }
                        if (z1(n2Var2.H0, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                xh.n2 n2Var4 = new xh.n2(s3Var, s3Var.getContext(), s3Var.currentAccount, s3Var.X, s3Var.resourcesProvider, s3Var.Y.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    n2Var4.l2((TL_stars.SavedStarGift) obj, s3Var.E0);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    n2Var4.j2(tL_starGiftUnique.slug, tL_starGiftUnique, s3Var.E0);
                }
                AndroidUtilities.removeFromParent(n2Var4.containerView);
                if (z10) {
                    s3Var.f53286d0 = n2Var4;
                } else {
                    s3Var.f53284c0 = n2Var4;
                }
            }
        }
    }

    public static void l0(s3 s3Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j3, long j10, long j11) {
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ApplicationLoader.applicationContext, 3, null);
        a2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(s3Var.currentAccount).sendRequest(convertstargift, new e1(s3Var, a2Var, j3, j10, j11));
    }

    public static void l1(s3 s3Var, final View view) {
        ec ecVar;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                ecVar = gc.b((org.telegram.ui.Cells.g7) view);
            } else {
                ecVar = null;
            }
            ArrayList arrayList = new ArrayList();
            MessageObject messageObject = s3Var.F0;
            if (messageObject != null) {
                arrayList.add(messageObject);
            } else if (s3Var.C1() instanceof TL_stars.TL_starGiftUnique) {
                long clientUserId = UserConfig.getInstance(s3Var.currentAccount).getClientUserId();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = MessagesController.getInstance(s3Var.currentAccount).getPeer(clientUserId);
                tL_messageService.from_id = MessagesController.getInstance(s3Var.currentAccount).getPeer(clientUserId);
                tL_messageService.date = ConnectionsManager.getInstance(s3Var.currentAccount).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) s3Var.C1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                MessageObject messageObject2 = new MessageObject(s3Var.currentAccount, tL_messageService, false, false);
                messageObject2.setType();
                arrayList.add(messageObject2);
            } else {
                return;
            }
            final lc D = lc.D(launchActivity, s3Var.currentAccount);
            D.R = new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l4 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l10 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    lc lcVar = D;
                    ec ecVar2 = null;
                    if (booleanValue) {
                        s3 s3Var2 = s3.this;
                        AndroidUtilities.runOnUIThread(new tg.c1(17, s3Var2, l10));
                        lcVar.X(null);
                        a2 a2Var = s3Var2.X0;
                        if (a2Var != null) {
                            a2Var.dismiss();
                            s3Var2.X0 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.g7) && view2.isAttachedToWindow()) {
                            ecVar2 = gc.b((org.telegram.ui.Cells.g7) view2);
                        }
                        lcVar.X(ecVar2);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                }
            };
            D.T(ecVar, l8.y(arrayList));
        }
    }

    public static void m0(s3 s3Var, long j3) {
        new xh.r1(s3Var.getContext(), s3Var.currentAccount, j3, null, new u1(s3Var, 2)).show();
    }

    public static ViewGroup m1(s3 s3Var) {
        return s3Var.containerView;
    }

    public static void n0(s3 s3Var, org.telegram.ui.ActionBar.a2 a2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            a2Var.dismiss();
            s3Var.M0 = true;
            s3Var.l2(savedStarGift, null);
            super.show();
            return;
        }
        a2Var.dismiss();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U != null) {
            sc Q = ad.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.f30843t = true;
            Q.j();
        }
    }

    public static void o0(s3 s3Var) {
        TL_stars.TL_starGiftUnique L1 = s3Var.L1();
        new y(s3Var.getContext(), s3Var.currentAccount, DialogObject.getPeerDialogId(L1.owner_id), L1, s3Var.resourcesProvider, new a1(s3Var, 2)).show();
    }

    public static int o1(s3 s3Var) {
        return s3Var.backgroundPaddingLeft;
    }

    public static void p0(s3 s3Var, String str) {
        s3Var.dismiss();
        Context context = s3Var.getContext();
        of.f.s(context, "https://" + MessagesController.getInstance(s3Var.currentAccount).linkPrefix + "/" + str);
    }

    public static int p1(s3 s3Var) {
        return s3Var.backgroundPaddingLeft;
    }

    public static void q0(s3 s3Var) {
        if (s3Var.f53303m1 == null) {
            return;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < s3Var.f53303m1.invoice.prices.size(); i10++) {
            j3 += s3Var.f53303m1.invoice.prices.get(i10).amount;
        }
        r3 r3Var = new r3(s3Var.getContext(), j3, s3Var.f53299j1, s3Var.resourcesProvider);
        s3Var.f53310q0 = r3Var;
        r3Var.show();
    }

    public static void r0(s3 s3Var, of.e eVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(s3Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new pi.h(s3Var, eVar, tL_starGiftUnique, 16));
            return;
        }
        s3Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new xh.q0(s3Var, eVar, Long.parseLong(tL_error.text.substring(26)), 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new pi.h(s3Var, eVar, tL_error, 17));
        }
    }

    public static void r1(s01 s01Var, TL_stars.StarGiftAttribute starGiftAttribute) {
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
        s01Var.e(str, starGiftAttribute.name, K1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void s0(s3 s3Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, cd[] cdVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new r0(s3Var.getContext(), s3Var.resourcesProvider, s3Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            s3Var.q2(cdVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, ei.l.H0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static void t0(s3 s3Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        s3Var.f53300k0.setLoading(false);
        ai.z3 z3Var = new ai.z3(s3Var, 12);
        rg.j0 j0Var = new rg.j0(26, s3Var.currentAccount, s3Var.getContext(), z3Var, s3Var.resourcesProvider);
        j0Var.H1(canApplyBoost);
        j0Var.G1(tL_premium_boostsStatus, true);
        j0Var.I1(j3);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j3));
        if (chat != null) {
            j0Var.Q0 = new tg.c(s3Var, chat);
        }
        j0Var.show();
    }

    public static void u0(s3 s3Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, zf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(s3Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new l1(s3Var, tL_starGiftUnique, aVar, runnable, 0));
            return;
        }
        s3Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new xh.q0(s3Var, Long.parseLong(tL_error.text.substring(26)), runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new m1(s3Var, tL_error, runnable, 0));
        }
    }

    public static void v0(s3 s3Var, String str) {
        Context context = s3Var.getContext();
        of.f.u(context, MessagesController.getInstance(s3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void w0(s3 s3Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        xh.g4 g4Var = s3Var.U0;
        if (g4Var != null) {
            g4Var.b();
            s3Var.U0 = null;
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
        ConnectionsManager.getInstance(s3Var.currentAccount).sendRequestTyped(craftstargift, new Object(), new dl0(s3Var, callback2, arrayList, runnable, 2));
    }

    public static void x0(yh.s3 r17) {
        throw new UnsupportedOperationException("Method not decompiled: yh.s3.x0(yh.s3):void");
    }

    public static void y0(s3 s3Var, String str) {
        Context context = s3Var.getContext();
        of.f.u(context, MessagesController.getInstance(s3Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static boolean y1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f20295id == starGift2.f20295id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f20295id == starGift2.f20295id && savedStarGift.date == savedStarGift2.date) {
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

    public static void z0(s3 s3Var, TLObject tLObject, tg.m1[] m1VarArr, Long l4, pi.h hVar, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            MessagesController.getInstance(s3Var.currentAccount).putUsers(tL_users_userFull.users, false);
            MessagesController.getInstance(s3Var.currentAccount).putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new ad(m1VarArr[0].container, s3Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                return;
            } else {
                hVar.run();
                return;
            }
        }
        sc Y = s3Var.getBulletinFactory().Y(tL_error);
        Y.f30843t = true;
        Y.j();
    }

    public static boolean z1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f20295id == tL_starGiftUnique2.f20295id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int A1() {
        if (this.Z0.d(1)) {
            return this.f53313s0.getMeasuredHeight();
        }
        if (this.Z0.d(2)) {
            return this.f53320z0.getMeasuredHeight();
        }
        if (this.Z0.d(3)) {
            return this.B0.getMeasuredHeight();
        }
        if (this.Z0.d(4)) {
            return 0;
        }
        return this.f53292g0.getMeasuredHeight();
    }

    @Override
    public final CharSequence B() {
        return this.T0;
    }

    public final long B1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.F0;
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
                        return this.F0.getDialogId();
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
        TL_stars.SavedStarGift savedStarGift = this.D0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                return DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.X;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.H0;
        if (tL_starGiftUnique != null) {
            return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final TL_stars.StarGift C1() {
        MessageObject messageObject = this.F0;
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
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.H0;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String D1() {
        TL_stars.StarGift C1 = C1();
        if (C1 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) C1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }

    public final TL_stars.InputSavedStarGift F1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j3 = this.X;
        if (j3 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
            MessageObject messageObject = this.F0;
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
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            } else if (this.H0 != null && !TextUtils.isEmpty(this.G0)) {
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.G0;
                return tL_inputSavedStarGiftSlug;
            } else {
                return tL_inputSavedStarGiftChat;
            }
        }
        MessageObject messageObject2 = this.F0;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.F0.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.F0.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.F0;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.F0.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.F0.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.F0;
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
        TL_stars.SavedStarGift savedStarGift2 = this.D0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        } else if (this.H0 != null && !TextUtils.isEmpty(this.G0)) {
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug2.slug = this.G0;
            return tL_inputSavedStarGiftSlug2;
        } else {
            return tL_inputSavedStarGiftUser;
        }
    }

    public final String G1() {
        TL_stars.StarGift C1 = C1();
        if ((C1 instanceof TL_stars.TL_starGiftUnique) && C1.slug != null) {
            return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + C1.slug;
        }
        return null;
    }

    public final int H1() {
        int indexOf;
        g5 g5Var = this.E0;
        if (g5Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null) {
                indexOf = g5Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.H0;
                if (tL_starGiftUnique != null) {
                    indexOf = g5Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift C1 = C1();
            for (int i10 = 0; i10 < this.E0.e(); i10++) {
                Object obj = this.E0.get(i10);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.D0;
                    if (savedStarGift2 != null) {
                        if (y1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i10;
                        }
                    }
                    if (C1 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (C1 != starGift) {
                            if ((C1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && C1.f20295id == starGift.f20295id) {
                            }
                        }
                        return i10;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && z1(this.H0, (TL_stars.TL_starGiftUnique) obj)) {
                        return i10;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public final TL_stars.SavedStarGift I1(boolean z10) {
        int i10;
        Object obj;
        int H1 = H1();
        if (H1 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + H1;
        int i12 = this.S0;
        if (i12 >= 0 && (!z10 ? i12 < H1 : i12 > H1)) {
            i11 = i12;
        }
        g5 g5Var = this.E0;
        if (g5Var != null && i11 >= 0 && i11 < g5Var.e()) {
            obj = this.E0.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final TL_stars.TL_starGiftUnique J1(boolean z10) {
        int i10;
        Object obj;
        int H1 = H1();
        if (H1 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + H1;
        int i12 = this.S0;
        if (i12 >= 0 && (!z10 ? i12 < H1 : i12 > H1)) {
            i11 = i12;
        }
        g5 g5Var = this.E0;
        if (g5Var != null && i11 >= 0 && i11 < g5Var.e()) {
            obj = this.E0.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return (TL_stars.TL_starGiftUnique) obj;
    }

    public final TL_stars.TL_starGiftUnique L1() {
        TL_stars.StarGift C1 = C1();
        if (C1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) C1;
        }
        return null;
    }

    @Override
    public final boolean M() {
        return false;
    }

    public final boolean M1(boolean z10) {
        if (I1(z10) == null && J1(z10) == null) {
            return false;
        }
        return true;
    }

    public final void N1(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift F1 = F1();
        getstargiftwithdrawalurl.stargift = F1;
        if (F1 == null) {
            return;
        }
        getstargiftwithdrawalurl.password = inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new r1(this, twoStepVerificationActivity, 0));
    }

    public final void R1() {
        throw new UnsupportedOperationException("Method not decompiled: yh.s3.R1():void");
    }

    public final void S1(android.view.View r6) {
        throw new UnsupportedOperationException("Method not decompiled: yh.s3.S1(android.view.View):void");
    }

    public final void T1() {
        a2 a2Var = this.X0;
        if (a2Var != null && a2Var.isShown()) {
            this.X0.dismiss();
        }
        String G1 = G1();
        a2 a2Var2 = new a2(this, getContext(), G1, G1, this.resourcesProvider);
        this.X0 = a2Var2;
        a2Var2.f29256s0 = new w3.d(this);
        a2Var2.show();
    }

    public final void U1() {
        throw new UnsupportedOperationException("Method not decompiled: yh.s3.U1():void");
    }

    public final void V1() {
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null) {
            return;
        }
        p7.g1(getContext(), this.currentAccount, L1, new x1(this, L1, 2), this.resourcesProvider);
    }

    public final void W1(long j3, String str) {
        this.f53295h1 = true;
        n5.y(this.currentAccount, false).K(j3, new org.telegram.ui.Wallet.b7(12, this, str));
    }

    public final void X1(boolean z10) {
        int i10;
        MessageObject messageObject = this.F0;
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
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
            a2Var.R = string;
            a2Var.T = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(L1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20404a;
            a2Var2.R = string2;
            a2Var2.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        p3 p3Var = this.f53290f0;
        if (z10) {
            p3Var.L.a(this.currentAccount, L1.gift_id, L1.getDocument(), L1.title);
            if (u1()) {
                t2 t2Var = p3Var.L;
                TL_stars.TL_starGiftUnique L12 = L1();
                if (L12 == null) {
                    t2Var.getClass();
                } else {
                    while (true) {
                        r2[] r2VarArr = t2Var.f53355n;
                        if (i11 >= r2VarArr.length) {
                            break;
                        }
                        r2 r2Var = r2VarArr[i11];
                        TL_stars.StarGift starGift = r2Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            r2Var.a(L12, true);
                            break;
                        }
                        i11++;
                    }
                    t2Var.d(true);
                }
            }
        }
        t2 t2Var2 = p3Var.L;
        t2 t2Var3 = p3Var.L;
        t2Var2.setOnCraft(new w0(this, 1));
        if (this.U0 == null) {
            xh.g4 g4Var = new xh.g4(this.currentAccount, L1.gift_id);
            this.U0 = g4Var;
            g4Var.a();
        }
        t2Var3.setOnAddGift(new x1(this, L1, 1));
        t2Var3.setOnClose(new a1(this, 18));
        s2(4, true, null);
    }

    public final void Y1(long j3) {
        ci.d4 d4Var = this.f53309p1;
        if (d4Var != null) {
            d4Var.e(true);
            this.f53309p1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
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

    public final void Z1() {
        throw new UnsupportedOperationException("Method not decompiled: yh.s3.Z1():void");
    }

    public final void a2(long j3, Utilities.Callback callback) {
        TLRPC.Message message;
        long j10;
        String str;
        TLRPC.User user;
        String formatString;
        CharSequence string;
        TL_stars.SavedStarGift savedStarGift = this.D0;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j10 = savedStarGift.transfer_stars;
        } else {
            MessageObject messageObject = this.F0;
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
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 != null) {
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
            linearLayout.addView(new v2(getContext(), L1, user), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(getContext());
            ai.o(org.telegram.ui.ActionBar.h6.f20930j5, this.resourcesProvider, textView, 1, 16.0f);
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                formatString = LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j10, D1(), DialogObject.getShortName(j3));
            } else {
                formatString = LocaleController.formatString(R.string.Gift2TransferText, D1(), str);
            }
            textView.setText(AndroidUtilities.replaceTags(formatString));
            linearLayout.addView(textView, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
            s01 s01Var = new s01(getContext(), this.resourcesProvider);
            r1(s01Var, n5.l(L1.attributes, TL_stars.starGiftAttributeModel.class));
            r1(s01Var, n5.l(L1.attributes, TL_stars.starGiftAttributeBackdrop.class));
            r1(s01Var, n5.l(L1.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(L1.slug) && (L1.flags & 256) != 0) {
                s01Var.c(LocaleController.getString(R.string.GiftValue2), sc.v.i("~", BillingController.getInstance().formatCurrency(L1.value_amount, L1.value_currency, BillingController.getInstance().getCurrencyExp(L1.value_currency), true)), null, null);
            }
            linearLayout.addView(s01Var, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.n(linearLayout);
            if (i10 > 0) {
                string = p7.R0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j10)));
            } else {
                string = LocaleController.getString(R.string.Gift2TransferDo);
            }
            alertDialog$Builder.k(string, new r5.d(callback, 20));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
            a2Var.X0 = true;
            a2Var.show();
        }
    }

    public final void b2() {
        TL_stars.InputSavedStarGift F1;
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
        ci.d4 d4Var = this.f53309p1;
        if (d4Var != null) {
            d4Var.e(true);
            this.f53309p1 = null;
        }
        if (this.f53281a1 == null && (F1 = F1()) != null) {
            MessageObject messageObject = this.F0;
            long j12 = this.X;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j10 = tL_messageActionStarGift.gift.f20295id;
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
                        if (DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.F0.getFromChatId()) {
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
                TL_stars.SavedStarGift savedStarGift = this.D0;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j10 = starGift.f20295id;
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
                    TL_stars.SavedStarGift savedStarGift2 = this.D0;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z13 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f53318x0;
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
            dq dqVar = this.f53317w0;
            dqVar.a(z14, false);
            ArrayList arrayList = this.f53297i1;
            if (arrayList != null && (j11 > j3 || this.f53303m1 != null)) {
                c2();
                return;
            }
            if (arrayList == null) {
                n5.y(this.currentAccount, false).K(j10, new u1(this, 1));
            }
            if (j11 <= j3 && this.f53303m1 == null) {
                this.l1 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j12);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = dqVar.f25859a.f24125q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = F1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject q6 = ei.k3.q(this.resourcesProvider, false);
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q6.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new z1(this, 0));
            }
        }
    }

    public final void c2() {
        throw new UnsupportedOperationException("Method not decompiled: yh.s3.c2():void");
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.Z0.c(4)) {
            boolean z10 = this.f53290f0.L.f53350h0;
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.Z0.c(4) && this.f53290f0.L.f53350h0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.Z0.c(4) && this.f53290f0.L.f53350h0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    public final void d2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j3, final zf.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final xh.l0 l0Var) {
        this.f53300k0.setLoading(true);
        if (l0Var != null && !l0Var.L) {
            l0Var.L = true;
            l0Var.H.h(true);
        }
        n5.x(this.currentAccount, bVar).H(tL_starGiftUnique, j3, tL_textWithEntities, z10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                s3.b1(s3.this, l0Var, bVar, tL_starGiftUnique, j3, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.E0 == ((f5) objArr[1])) {
                t2 t2Var = this.f53290f0.L;
                if (t2Var == null || !t2Var.f53350h0) {
                    v2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.Z0.c(4) && this.f53290f0.L.f53350h0) {
            return;
        }
        xh.g4 g4Var = this.U0;
        if (g4Var != null) {
            g4Var.b();
            this.U0 = null;
        }
        f3 f3Var = this.N0;
        if (f3Var != null) {
            f3Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder f2(TLRPC.Peer peer) {
        if (peer != null) {
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
            if (TextUtils.isEmpty(publicUsername)) {
                return null;
            }
            return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, sc.v.i("@", publicUsername)), new s1(this, publicUsername, 8));
        }
        return null;
    }

    public final SpannableStringBuilder g2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return f2(starGift.released_by);
        }
        return null;
    }

    @Override
    public ad getBulletinFactory() {
        return new ad(this.f53308p0, this.resourcesProvider);
    }

    public final void j2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, g5 g5Var) {
        boolean z10;
        boolean z11;
        f3 f3Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.G0 = str;
        this.H0 = tL_starGiftUnique;
        this.E0 = g5Var;
        if (tL_starGiftUnique.resell_amount != null && !O1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.I0 = z10;
        if (!this.O0 && (f3Var = this.N0) != null && f3Var.f52620o && (tL_starGiftUnique2 = f3Var.f52617l) != null && tL_starGiftUnique2.f20295id != tL_starGiftUnique.f20295id) {
            f3Var.a();
            this.N0 = null;
            p3 p3Var = this.f53290f0;
            p3Var.f53123b.setAlpha(1.0f);
            p3Var.f53125c.setAlpha(0.0f);
        }
        this.f53288e0.b(this.currentAccount, this.D0);
        m2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        ea0 ea0Var = this.f53294h0;
        if (z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            ea0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new s1(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            ea0Var.setVisibility(0);
            ea0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21061q5, this.resourcesProvider));
        } else {
            ea0Var.setVisibility(8);
        }
        ea0 ea0Var2 = this.f53298j0;
        if (!z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            ea0Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new s1(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            ea0Var2.setVisibility(0);
        } else {
            ea0Var2.setVisibility(8);
        }
        if (this.I0) {
            n2(tL_starGiftUnique);
            this.f53300k0.setOnClickListener(new t0(this, 7));
        }
        if (this.f53285c1) {
            s2(0, false, null);
            this.f25733c.n0(1);
            this.f53285c1 = false;
        }
        v2();
    }

    public final void k2(org.telegram.messenger.MessageObject r56, yh.g5 r57) {
        throw new UnsupportedOperationException("Method not decompiled: yh.s3.k2(org.telegram.messenger.MessageObject, yh.g5):void");
    }

    public final void l2(TL_stars.SavedStarGift savedStarGift, g5 g5Var) {
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
        char c10;
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
        f3 f3Var;
        if (savedStarGift == null) {
            return;
        }
        int i20 = this.currentAccount;
        long j10 = this.X;
        this.C0 = O1(i20, j10);
        this.D0 = savedStarGift;
        this.E0 = g5Var;
        this.F0 = null;
        boolean z13 = this.O0;
        p3 p3Var = this.f53290f0;
        if (!z13 && (f3Var = this.N0) != null && f3Var.f52620o && f3Var.f52617l != null) {
            f3Var.a();
            this.N0 = null;
            p3Var.f53123b.setVisibility(0);
            p3Var.f53125c.setVisibility(4);
        }
        this.f53288e0.b(this.currentAccount, savedStarGift);
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
            m2(tL_starGiftUnique, z14, tLObject, savedStarGift.message);
        } else {
            if (this.C0 && clientUserId == peerDialogId && i21 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = z11;
            boolean Q1 = Q1(this.currentAccount, L1());
            G1();
            p3Var.f(starGift4, false, false, Q1);
            s01 s01Var = this.f53296i0;
            s01Var.removeAllViews();
            SpannableString spannableString = "";
            if (z15) {
                if (savedStarGift.gift_num != 0 && (starGift3 = savedStarGift.gift) != null && starGift3.title != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j3 = clientUserId;
                    string4 = org.telegram.messenger.q.h(savedStarGift.gift_num, ',', sb2);
                } else {
                    j3 = clientUserId;
                    string4 = LocaleController.getString(R.string.Gift2TitleSaved);
                }
                this.T0 = string4;
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
                p3Var.i(0, string4, replaceTags, g2(savedStarGift.gift));
            } else {
                j3 = clientUserId;
                if (z10 && !this.C0) {
                    String string5 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.T0 = string5;
                    p3Var.i(0, string5, null, f2(savedStarGift.gift.released_by));
                } else {
                    boolean z16 = this.C0;
                    if ((!z16 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        if (z16) {
                            i10 = R.string.Gift2TitleReceived;
                        } else {
                            i10 = R.string.Gift2TitleProfile;
                        }
                        String string6 = LocaleController.getString(i10);
                        this.T0 = string6;
                        if (z14 || !this.C0) {
                            string = null;
                        } else {
                            string = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                        }
                        p3Var.i(0, string6, string, g2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num != 0 && (starGift = savedStarGift.gift) != null && starGift.title != null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string2 = org.telegram.messenger.q.h(savedStarGift.gift_num, ',', sb3);
                        } else {
                            if (z16) {
                                i11 = R.string.Gift2TitleReceived;
                            } else {
                                i11 = R.string.Gift2TitleProfile;
                            }
                            string2 = LocaleController.getString(i11);
                        }
                        this.T0 = string2;
                        if (z14 || !this.C0) {
                            i12 = 0;
                            charSequence = null;
                        } else {
                            if (!isBot && t1()) {
                                if (this.C0) {
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
                            } else if (this.C0) {
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
                            if (isBot || !t1()) {
                                c10 = 1;
                                charSequence2 = spannableString;
                            } else {
                                c10 = 1;
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new a1(this, 1)), true);
                            }
                            char c11 = c10;
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i12 = 0;
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[c11] = " ";
                            charSequenceArr[2] = charSequence2;
                            charSequence = TextUtils.concat(charSequenceArr);
                        }
                        p3Var.i(i12, string2, charSequence, g2(savedStarGift.gift));
                    }
                }
            }
            if (j3 != peerDialogId || z10) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                String string7 = LocaleController.getString(R.string.Gift2From);
                int i22 = this.currentAccount;
                b1 b1Var = new b1(this, peerDialogId, 1);
                if (peerDialogId != j3 && peerDialogId != 2666000 && !isBot && !UserObject.isDeleted(user) && !z10) {
                    str2 = LocaleController.getString(R.string.Gift2ButtonSendGift);
                } else {
                    str2 = null;
                }
                this.f53296i0.l(string7, i22, peerDialogId, b1Var, str2, new b1(this, peerDialogId, 2));
            }
            s01Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string8 = LocaleController.getString(R.string.Gift2Value);
            String h = org.telegram.messenger.q.h(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (t1() && !z14) {
                r12 = 0;
                spannableString = dd.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new a1(this, 4), this.resourcesProvider, null);
            } else {
                r12 = 0;
            }
            s01Var.c(string8, p7.Y0(false, TextUtils.concat(h, " ", spannableString), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z14) {
                p7.G0(s01Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z14) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                s01Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z17 = this.C0;
            ci.d dVar = this.f53300k0;
            if (z17 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.f53283b1 == null) {
                    i16 = 0;
                    this.f53283b1 = new er(0, new q3(dVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
                } else {
                    i16 = 0;
                }
                spannableStringBuilder.setSpan(this.f53283b1, i16, 1, 33);
                if (savedStarGift.upgrade_stars > 0) {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                } else {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                }
                spannableStringBuilder.append((CharSequence) string3);
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.f53285c1, true);
                dVar.f(null, !this.f53285c1);
                dVar.setOnClickListener(new t0(this, 3));
            } else if (this.f53312r0 && z17 && this.Z != null && this.E0 != null && H1() >= 0 && this.E0.b(H1()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.E0.b(H1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.E0.get(b10);
                if ((obj instanceof TL_stars.SavedStarGift) && (starGift2 = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift2.getDocument()) != null) {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.b6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                } else {
                    r122 = 1;
                }
                dVar.g(spannableStringBuilder2, (this.f53285c1 ? 1 : 0) ^ r122, r122);
                dVar.f(null, (this.f53285c1 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new d1(this, b10, r122));
            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.f53283b1 == null) {
                    i15 = 0;
                    this.f53283b1 = new er(0, new q3(dVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
                } else {
                    i15 = 0;
                }
                spannableStringBuilder3.setSpan(this.f53283b1, i15, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.f53285c1, true);
                dVar.f(null, !this.f53285c1);
                dVar.setOnClickListener(new t0(this, 5));
            } else {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.f53285c1, true);
                dVar.f(null, !this.f53285c1);
                dVar.setOnClickListener(new t0(this, 6));
            }
            str3 = null;
            str4 = null;
            z12 = false;
        }
        boolean z18 = savedStarGift.refunded;
        ea0 ea0Var = this.f53294h0;
        if (z18) {
            ea0Var.setVisibility(0);
            ea0Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            ea0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21062q7, this.resourcesProvider));
        } else if (z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            ea0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new s1(this, str4, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            ea0Var.setVisibility(0);
            ea0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21061q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && this.C0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            ea0Var.setVisibility(0);
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                i17 = R.string.Gift2InSenderMessageHidden2;
            } else {
                i17 = R.string.Gift2InSenderHidden2;
            }
            ea0Var.setText(LocaleController.getString(i17));
            ea0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21061q5, this.resourcesProvider));
        } else {
            ea0Var.setVisibility(8);
        }
        ea0 ea0Var2 = this.f53298j0;
        if (!z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            ea0Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new s1(this, str4, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            ea0Var2.setVisibility(0);
        } else if (this.C0 && O1(this.currentAccount, j10)) {
            if (i21 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new er(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                if (!savedStarGift.unsaved) {
                    i19 = R.string.Gift2ProfileVisible4;
                } else {
                    i19 = R.string.Gift2ProfileInvisible4;
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(i19), new a1(this, 3)));
                ea0Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                if (!savedStarGift.unsaved) {
                    i18 = R.string.Gift2ChannelProfileVisible3;
                } else {
                    i18 = R.string.Gift2ChannelProfileInvisible3;
                }
                ea0Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i18), new a1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            ea0Var2.setVisibility(0);
        } else {
            r13 = 0;
            ea0Var2.setVisibility(8);
        }
        if (this.f53285c1) {
            s2(r13, r13, null);
            this.f25733c.n0(1);
            this.f53285c1 = r13;
        }
        this.f25734e.setTitle(this.T0);
        v2();
    }

    public final void m2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r42, boolean r43, org.telegram.tgnet.TLObject r44, org.telegram.tgnet.TLRPC.TL_textWithEntities r45) {
        throw new UnsupportedOperationException("Method not decompiled: yh.s3.m2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void n2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f54564a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        ci.d dVar = this.f53300k0;
        if (z10) {
            dVar.g(p7.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.f54565b).d()), true), !this.f53285c1, true);
            dVar.f(p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.f53285c1);
            return;
        }
        dVar.g(p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.f53285c1, true);
        dVar.f(null, !this.f53285c1);
    }

    public final void o2() {
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null) {
            return;
        }
        TLRPC.Peer peer = L1.owner_id;
        if (peer == null) {
            peer = L1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(L1.title);
        sb2.append(" #");
        this.A0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.q.h(L1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.V0 == null) {
                this.V0 = new er(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.V0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ci.d dVar = this.f53300k0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new t0(this, 21));
        this.f53290f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        s2(2, false, null);
        this.f53319y0 = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onBackPressed() {
        p3 p3Var;
        t2 t2Var;
        if (this.Z0.c(4) && (p3Var = this.f53290f0) != null && (t2Var = p3Var.L) != null) {
            if (t2Var.f53350h0) {
                return;
            }
            if (t2Var.f53351i0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.f53319y0 && this.Z0.f9644b > 0 && !this.f53300k0.N && !this.f53295h1) {
            MessageObject messageObject = this.F0;
            if (messageObject != null) {
                k2(messageObject, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.D0;
                if (savedStarGift != null) {
                    l2(savedStarGift, this.E0);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.H0;
                    if (tL_starGiftUnique != null) {
                        j2(this.G0, tL_starGiftUnique, this.E0);
                    }
                }
            }
            s2(0, true, null);
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
        ci.d4 d4Var = this.f53309p1;
        if (d4Var != null) {
            d4Var.e(true);
            this.f53309p1 = null;
        }
    }

    public final void p2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique L1 = L1();
        TL_stars.InputSavedStarGift F1 = F1();
        if (F1 != null && L1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = F1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject q6 = ei.k3.q(this.resourcesProvider, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new ai.q3(this, charSequence, L1, tL_inputInvoiceStarGiftDropOriginalDetails, 16));
        }
    }

    public final void q1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        boolean z10;
        f3 f3Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        s3 s3Var;
        ds0 ds0Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            z10 = false;
        } else {
            return;
        }
        if (!this.O0 && ((f3Var = this.N0) == null || !f3Var.f52620o)) {
            boolean[] zArr = new boolean[1];
            ?? r10 = new cd[1];
            Integer[] numArr = new Integer[1];
            String K1 = K1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                ds0Var = new ds0((Dialog) this, zArr, (Object) starGiftAttribute2, (Serializable) r10, 29);
                s3Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                s3Var = this;
                ds0Var = null;
            }
            r10[0] = (cd) ((p01) s3Var.f53296i0.e(string, starGiftAttribute2.name, K1, ds0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        k3 k3Var = new k3(getContext(), this.resourcesProvider, new w0(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        s01 s01Var = this.f53296i0;
        tableRow.addView(new r01(s01Var, string), layoutParams);
        tableRow.addView(new p01(s01Var, k3Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        s01Var.addView(tableRow);
        f3 f3Var2 = this.N0;
        if (f3Var2 != null) {
            if (!z10) {
                f3Var2.d = k3Var;
            }
            if (z10) {
                f3Var2.f52610c = k3Var;
            }
            if (z10) {
                f3Var2.f52609b = k3Var;
            }
        }
    }

    public final void q2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        dd ddVar;
        float primaryHorizontal;
        int i10;
        ci.d4 d4Var = this.f53309p1;
        if ((d4Var == null || !d4Var.V || this.f53311q1 != view) && view != null) {
            if (z10) {
                if (view instanceof org.telegram.ui.ActionBar.h5) {
                    org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) view;
                    primaryHorizontal = (h5Var.getRightDrawableWidth() / 2.0f) + h5Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.h5) {
                    layout = ((org.telegram.ui.ActionBar.h5) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        dd[] ddVarArr = (dd[]) spanned.getSpans(0, spanned.length(), dd.class);
                        if (ddVarArr != null && ddVarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(ddVarArr[ddVarArr.length - 1])) + view.getPaddingLeft() + (ddVar.a() / 2.0f);
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
            org.telegram.ui.s5 s5Var = this.Y;
            s5Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            ci.d4 d4Var2 = this.f53309p1;
            if (d4Var2 != null) {
                d4Var2.e(true);
                this.f53309p1 = null;
            }
            ci.d4 d4Var3 = new ci.d4(getContext(), 3);
            d4Var3.p(!z10);
            d4Var3.s(charSequence);
            d4Var3.m(0.0f, (iArr2[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
            float dp = (iArr2[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f);
            if (z10) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            d4Var3.setTranslationY(dp + AndroidUtilities.dp(i10 + 4.33f));
            d4Var3.d = 3000L;
            d4Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
            d4Var3.f4917l0 = new ci.b4(d4Var3, 2);
            d4Var3.u();
            s5Var.addView(d4Var3, w7.x5.d(100.0f, -1));
            this.f53309p1 = d4Var3;
            this.f53311q1 = view;
        }
    }

    public final void r2(int i10, Context context, boolean z10) {
        int i11;
        int i12;
        LinearLayout e7 = ai.e(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
        e7.addView(frameLayout, w7.x5.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView((View) imageView, w7.x5.q(64, 64, 17));
        imageView.d();
        TextView b10 = w7.b6.b(context, 20.0f, org.telegram.ui.ActionBar.h6.G6, true, null);
        b10.setGravity(17);
        if (z10) {
            i11 = R.string.Gift2ResellTimeoutTitle;
        } else {
            i11 = R.string.Gift2TransferTimeoutTitle;
        }
        b10.setText(LocaleController.getString(i11));
        e7.addView(b10, w7.x5.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = w7.b6.b(context, 14.0f, org.telegram.ui.ActionBar.h6.F6, false, null);
        b11.setGravity(17);
        if (z10) {
            i12 = R.string.Gift2ResellTimeout;
        } else {
            i12 = R.string.Gift2TransferTimeout;
        }
        b11.setText(LocaleController.formatString(i12, LocaleController.formatTTLString(Math.max(10, i10))));
        e7.addView(b11, w7.x5.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(e7);
        org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
    }

    public final void s1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            n5.y(this.currentAccount, false).Q(B1());
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
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.O0 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.D0;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f20089id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    l2(savedStarGift2, this.E0);
                    this.f53297i1 = null;
                    this.O0 = false;
                    g5 g5Var = this.E0;
                    if (g5Var != null) {
                        g5Var.d();
                    } else {
                        n5.y(this.currentAccount, false).Q(this.X);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
            }
            if (this.E0 == null) {
                n5.y(this.currentAccount, false).Q(B1());
            }
            this.O0 = true;
            this.D0 = null;
            this.C0 = false;
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.setType();
            k2(messageObject, this.E0);
            this.f53297i1 = null;
            this.O0 = false;
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        n5.y(this.currentAccount, false).Q(B1());
        dismiss();
    }

    public final void s2(int r12, boolean r13, org.telegram.ui.Components.es0 r14) {
        throw new UnsupportedOperationException("Method not decompiled: yh.s3.s2(int, boolean, org.telegram.ui.Components.es0):void");
    }

    @Override
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        if (this.G0 != null && this.H0 == null) {
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getContext(), 3, null);
            a2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.G0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new cj1(9, this, a2Var));
        } else if (this.D0 == null && (messageObject = this.F0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(getContext(), 3, null);
                        a2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f20162id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new ai.t5(this, tL_messageActionStarGift, a2Var2, 23));
                        return;
                    } else if (F1() != null) {
                        org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(getContext(), 3, null);
                        a2Var3.q(500L);
                        n5.y(this.currentAccount, false).M(F1(), new org.telegram.ui.Wallet.b7(13, this, a2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final boolean t1() {
        int i10;
        boolean z10;
        boolean z11;
        TLRPC.Peer peer;
        if (F1() == null) {
            return false;
        }
        MessageObject messageObject = this.F0;
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
                if (this.F0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.F0.messageOwner.date);
                if (((z10 || (isOutOwner && !z11)) && ((peer = tL_messageActionStarGift.peer) == null || !P1(this.currentAccount, DialogObject.getPeerDialogId(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null) {
                int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i11 = this.currentAccount;
                long j3 = this.X;
                if (P1(i11, j3)) {
                    int i12 = this.D0.flags;
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

    public final void t2(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean Q1 = Q1(this.currentAccount, L1());
        boolean z12 = !Q1;
        boolean Q12 = Q1(this.currentAccount, L1());
        ci.d dVar = this.f53300k0;
        if (Q12) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(B1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
        } else {
            z11 = z12;
            long B1 = B1();
            if (B1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    sc P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new a1(this, 24)));
                    P.f30843t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(B1, new iu(this, messagesController, B1, 3));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = L1.f20295id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(B1(), tL_inputEmojiStatusCollectible, L1);
        }
        xh.m mVar = this.f53290f0.I[1];
        if (!Q1) {
            i10 = R.drawable.filled_crown_off;
        } else {
            i10 = R.drawable.filled_crown_on;
        }
        if (!Q1) {
            i11 = R.string.Gift2ActionWearOff;
        } else {
            i11 = R.string.Gift2ActionWear;
        }
        mVar.b(i10, LocaleController.getString(i11), true);
        if (this.f53319y0) {
            dismiss();
            return;
        }
        es0 es0Var = new es0(17, this, z11);
        if (this.Z0.c(0)) {
            es0Var.run();
        } else {
            s2(0, true, es0Var);
        }
        dVar.g(LocaleController.getString(R.string.OK), !this.f53285c1, true);
        dVar.f(null, !this.f53285c1);
        dVar.setOnClickListener(new t0(this, 0));
    }

    public final boolean u1() {
        int i10;
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 == null || L1.crafted || !P1(this.currentAccount, DialogObject.getPeerDialogId(L1.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.F0;
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
            TL_stars.SavedStarGift savedStarGift = this.D0;
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

    public final void u2() {
        FrameLayout frameLayout = this.f53304n0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f53308p0;
        FrameLayout frameLayout3 = this.f53302l0;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.Z0.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.Z0.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.Z0.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    public final void v1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique L1 = L1();
        if (L1 != null && !TextUtils.isEmpty(L1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new w1(this, L1, 1));
        }
        hg.c.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public final void v2() {
        boolean M1 = M1(false);
        d2 d2Var = this.Z;
        d2Var.setPosition(M1 ? 1 : 0);
        d2Var.C(false);
        if (this.E0 != null && !M1(true) && this.E0.e() < this.E0.c()) {
            this.E0.a();
        }
    }

    public final void w1(final long j3, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j10;
        TL_stars.InputSavedStarGift F1 = F1();
        if (F1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.D0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j10 = savedStarGift.transfer_stars;
                peerDialogId = this.X;
            } else {
                MessageObject messageObject = this.F0;
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
                transferstargift.stargift = F1;
                transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new org.telegram.messenger.c8(this, callback, j3, peerDialogId, 4));
                return;
            }
            final long j11 = peerDialogId;
            n5 y3 = n5.y(this.currentAccount, false);
            if (!y3.f53034e) {
                y3.r(new p31(this, y3, j3, callback, 9));
                return;
            }
            final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = F1;
            tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j3);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject q6 = ei.k3.q(this.resourcesProvider, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final s3 s3Var = s3.this;
                    final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                    final long j12 = j3;
                    final long j13 = j11;
                    final Utilities.Callback callback2 = callback;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            s3.H0(s3.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j12, j13, callback2, tL_error);
                        }
                    });
                }
            });
        }
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        gg.m0 m0Var = new gg.m0(this, 6);
        this.R0 = m0Var;
        return m0Var;
    }

    public final void x1() {
        TL_stars.InputSavedStarGift F1;
        long j3;
        ci.d dVar = this.f53300k0;
        if (!dVar.N && (F1 = F1()) != null) {
            MessageObject messageObject = this.F0;
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
                TL_stars.SavedStarGift savedStarGift = this.D0;
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
            if (i10 > 0 || this.f53303m1 != null) {
                dVar.setLoading(true);
                dq dqVar = this.f53317w0;
                if (i10 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = dqVar.f25859a.f24125q;
                    upgradestargift.stargift = F1;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new cj1(8, this, F1));
                    return;
                }
                int i11 = 0;
                n5 y3 = n5.y(this.currentAccount, false);
                if (!y3.f53034e) {
                    y3.r(new tg.c1(18, this, y3));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f53303m1.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.X);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = dqVar.f25859a.f24125q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = F1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f53303m1.invoice.prices;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                    i11++;
                    j10 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new ma(this, str, F1, j10, 7));
            }
        }
    }

    @Override
    public final int z() {
        return AndroidUtilities.dp(12.0f);
    }
}
