package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class xk0 {
    public static org.telegram.ui.ActionBar.g3 f39930a;

    public static org.telegram.ui.Components.qc a() {
        Context context;
        Context context2;
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        HashSet hashSet = rh.q2.T0;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            rh.q2 q2Var = null;
            while (it.hasNext()) {
                rh.q2 q2Var2 = (rh.q2) it.next();
                if (q2Var2.S0) {
                    q2Var = q2Var2;
                }
            }
            if (q2Var != null) {
                if (U != null && U.getParentActivity() != null) {
                    context2 = U.getParentActivity();
                } else {
                    context2 = LaunchActivity.D1;
                    if (context2 == null) {
                        context2 = ApplicationLoader.applicationContext;
                    }
                }
                return new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(context2), null);
            }
        }
        HashSet hashSet2 = l4.Y0;
        if (!hashSet2.isEmpty()) {
            Iterator it2 = hashSet2.iterator();
            l4 l4Var = null;
            while (it2.hasNext()) {
                l4 l4Var2 = (l4) it2.next();
                if (l4Var2.S) {
                    l4Var = l4Var2;
                }
            }
            if (l4Var != null) {
                if (U != null && U.getParentActivity() != null) {
                    context = U.getParentActivity();
                } else {
                    context = LaunchActivity.D1;
                    if (context == null) {
                        context = ApplicationLoader.applicationContext;
                    }
                }
                return new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(context), null);
            }
        }
        if (U != null && U.getLastSheet() != null && U.getLastSheet().getBulletinFactory() != null) {
            return U.getLastSheet().getBulletinFactory();
        }
        return org.telegram.ui.Components.qc.a0(U);
    }

    public static void b(boolean z4, final int i10, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z10, org.telegram.ui.web.a1 a1Var) {
        final Context context;
        String str3;
        int i11;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z11;
        org.telegram.ui.Cells.s8 s8Var;
        ArrayList arrayList;
        boolean z12;
        org.telegram.ui.ActionBar.p2 U;
        String str4;
        org.telegram.ui.ActionBar.p2 U2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (a1Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(a1Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (a1Var != null) {
                        a1Var.v("oauth_result_confirmed", org.telegram.ui.web.a1.x(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                    if (U3 == null) {
                        return;
                    }
                    af.g.u(U3.getContext(), tL_urlAuthResultAccepted.url);
                    return;
                }
                boolean z13 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z13) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    if (tL_urlAuthResultRequest.is_app) {
                        str4 = !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : LocaleController.getString(R.string.UnverifiedApp);
                    } else {
                        str4 = tL_urlAuthResultRequest.domain;
                    }
                } else {
                    str4 = null;
                }
                if (!TextUtils.isEmpty(str4)) {
                    a().M(LocaleController.getString(R.string.BotAuthLoggedInSuccessTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(z13 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z10 ? R.string.BotAuthLoggedInSuccessWithoutPhoneNumber : R.string.BotAuthLoggedInSuccess, str4), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Gi, false)), R.raw.contact_check).j();
                }
                if (a1Var != null) {
                    a1Var.v("oauth_result_confirmed", org.telegram.ui.web.a1.x(null, "result_url"));
                } else if (z4 && (U2 = LaunchActivity.U()) != null && (context2 = U2.getContext()) != null) {
                    AndroidUtilities.runOnUIThread(new lv(context2, 1), 800L);
                }
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (a1Var != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                if (U4 == null) {
                    return;
                }
                org.telegram.ui.Components.z4.q0(U4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
            } else if (!TextUtils.isEmpty(str) && (U = LaunchActivity.U()) != null) {
                org.telegram.ui.Components.z4.q0(U, str, false, urlAuthResult2 == null);
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final org.telegram.ui.ActionBar.p2 U5 = LaunchActivity.U();
            if (U5 == null || (context = U5.getContext()) == null) {
                return;
            }
            org.telegram.ui.ActionBar.f6 resourceProvider = U5.getResourceProvider();
            final org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, U5.getResourceProvider(), false, false);
            FrameLayout frameLayout3 = new FrameLayout(context);
            o10.customView = frameLayout3;
            ArrayList arrayList2 = new ArrayList();
            boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
            arrayList2.clear();
            for (int i12 = 0; i12 < 4; i12++) {
                if (UserConfig.getInstance(i12).isClientActivated() && ConnectionsManager.getInstance(i12).isTestBackend() == isTestBackend) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            Collections.sort(arrayList2, new cu(5));
            final boolean z14 = tL_messages_requestUrlAuth.peer != null;
            boolean z15 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(14.0f), U5.getThemedColor(org.telegram.ui.ActionBar.j6.f19995i5)));
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            p9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            p9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            final int[] iArr = {i10};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            z8Var.r(currentUser);
            p9Var.e(currentUser, z8Var);
            frameLayout5.addView(p9Var, k7.b6.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int themedColor = U5.getThemedColor(org.telegram.ui.ActionBar.j6.f20157r5);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout5.addView(imageView, k7.b6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout4.addView(frameLayout5, k7.b6.e(52, 28, 17));
            frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout3.addView(frameLayout4, k7.b6.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            k7.d6.a(frameLayout4);
            if (arrayList2.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout4.setVisibility(8);
            }
            LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
            frameLayout3.addView(f10, k7.b6.e(-1, -1, 119));
            org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
            p9Var2.setRoundRadius(AndroidUtilities.dp(40.0f));
            org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            z8Var2.r(tL_urlAuthResultRequest2.bot);
            p9Var2.e(tL_urlAuthResultRequest2.bot, z8Var2);
            f10.addView(p9Var2, k7.b6.t(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                str3 = !TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name) ? tL_urlAuthResultRequest2.verified_app_name : LocaleController.getString(R.string.UnverifiedApp);
            } else {
                str3 = tL_urlAuthResultRequest2.domain;
            }
            final String str5 = str3;
            int i13 = org.telegram.ui.ActionBar.j6.f20012j5;
            TextView b10 = k7.f6.b(context, 20.0f, i13, true, null);
            b10.setGravity(17);
            b10.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthTitle, str5), U5.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
            f10.addView(b10, k7.b6.r(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView b11 = k7.f6.b(context, 14.0f, i13, false, null);
            b11.setGravity(17);
            if (z15) {
                i11 = R.string.BotAuthAppSubtitle;
            } else {
                i11 = z14 ? R.string.BotAuthBotSubtitle : R.string.BotAuthSiteSubtitle;
            }
            org.telegram.messenger.y3.q(i11, b11);
            f10.addView(b11, k7.b6.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                frameLayout = frameLayout4;
                frameLayout2 = frameLayout5;
                f6Var = resourceProvider;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.d0(AndroidUtilities.dp(16.0f), U5.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6)));
                f10.addView(linearLayout, k7.b6.t(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    frameLayout = frameLayout4;
                    frameLayout2 = frameLayout5;
                    f6Var = resourceProvider;
                } else {
                    LinearLayout f11 = org.telegram.messenger.y3.f(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.msg2_devices);
                    frameLayout = frameLayout4;
                    imageView2.setColorFilter(new PorterDuffColorFilter(U5.getThemedColor(i13), mode));
                    f11.addView(imageView2, k7.b6.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    f11.addView(linearLayout2, k7.b6.r(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    frameLayout2 = frameLayout5;
                    TextView b12 = k7.f6.b(context, 16.0f, i13, false, null);
                    b12.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(b12, k7.b6.r(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView b13 = k7.f6.b(context, 13.0f, org.telegram.ui.ActionBar.j6.f20281y6, false, null);
                    b13.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    f6Var = resourceProvider;
                    linearLayout2.addView(b13, k7.b6.q(-1, -2, 55));
                    linearLayout.addView(f11, k7.b6.n(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    z11 = false;
                } else {
                    LinearLayout f12 = org.telegram.messenger.y3.f(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(R.drawable.msg2_language);
                    imageView3.setColorFilter(new PorterDuffColorFilter(U5.getThemedColor(i13), mode));
                    f12.addView(imageView3, k7.b6.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    f12.addView(linearLayout3, k7.b6.r(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b14 = k7.f6.b(context, 16.0f, i13, false, null);
                    b14.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(b14, k7.b6.r(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    z11 = false;
                    TextView b15 = k7.f6.b(context, 13.0f, org.telegram.ui.ActionBar.j6.f20281y6, false, null);
                    b15.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : LocaleController.formatString(R.string.BotAuthBasedOnIP, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(b15, k7.b6.q(-1, -2, 55));
                    linearLayout.addView(f12, k7.b6.n(-1, -2));
                }
                TextView b16 = k7.f6.b(context, 14.0f, org.telegram.ui.ActionBar.j6.f20281y6, z11, null);
                b16.setText(LocaleController.getString(R.string.BotAuthInfo));
                f10.addView(b16, k7.b6.t(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout6 = new FrameLayout(context);
                int dp = AndroidUtilities.dp(16.0f);
                int i14 = org.telegram.ui.ActionBar.j6.f19906d6;
                frameLayout6.setBackground(org.telegram.ui.ActionBar.j6.d0(dp, U5.getThemedColor(i14)));
                org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(context, U5.getResourceProvider());
                s8Var2.f(LocaleController.getString(R.string.BotAuthAllowMessages), true, false);
                s8Var2.setBackground(org.telegram.ui.ActionBar.j6.Z(U5.getThemedColor(i14), U5.getThemedColor(org.telegram.ui.ActionBar.j6.f19996i6), 16, 16));
                s8Var2.setOnClickListener(new e60(s8Var2, 11));
                frameLayout6.addView(s8Var2, k7.b6.e(-1, -1, 119));
                f10.addView(frameLayout6, k7.b6.t(-1, -2, 7, 9, -3, 9, -3));
                TextView b17 = k7.f6.b(context, 14.0f, org.telegram.ui.ActionBar.j6.f20281y6, false, null);
                b17.setText(LocaleController.formatString(R.string.BotAuthAllowMessagesInfo, UserObject.getUserName(tL_urlAuthResultRequest2.bot)));
                f10.addView(b17, k7.b6.t(-1, -2, 55, 22, 6, 22, 20));
                s8Var = s8Var2;
            } else {
                s8Var = null;
            }
            LinearLayout f13 = org.telegram.messenger.y3.f(context, 0);
            final ph.d dVar = new ph.d(context, U5.getResourceProvider(), true);
            dVar.setRoundRadius(24);
            dVar.setColor(U5.getThemedColor(org.telegram.ui.ActionBar.j6.f20122p7));
            dVar.setText(LocaleController.getString(R.string.Decline));
            f13.addView(dVar, k7.b6.p(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            final ph.d dVar2 = new ph.d(context, U5.getResourceProvider(), true);
            dVar2.setRoundRadius(24);
            dVar2.setText(LocaleController.getString(R.string.BotAuthLogin));
            f13.addView(dVar2, k7.b6.p(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            f10.addView(f13, k7.b6.t(-1, -2, 7, 12, 12, 12, 8));
            o10.setBackgroundColor(U5.getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7));
            final String[] strArr = {str2};
            ArrayList arrayList3 = arrayList2;
            FrameLayout frameLayout7 = frameLayout;
            final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
            uk0 uk0Var = new uk0(iArr, tL_messages_requestUrlAuth, o10, z4, str, urlAuthResult2, strArr, z10, a1Var, str5, f6Var2);
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && UserConfig.getInstance(i10).getClientUserId() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    arrayList = arrayList3;
                    Object obj = arrayList.get(i15);
                    i15++;
                    Integer num = (Integer) obj;
                    z12 = z15;
                    if (UserConfig.getInstance(num.intValue()).getClientUserId() == tL_urlAuthResultRequest2.user_id_hint) {
                        uk0Var.run(num);
                        break;
                    } else {
                        arrayList3 = arrayList;
                        z15 = z12;
                    }
                }
            }
            arrayList = arrayList3;
            z12 = z15;
            frameLayout7.setOnClickListener(new nh.c0(o10, frameLayout2, arrayList, iArr, uk0Var));
            boolean[] zArr = new boolean[1];
            dVar.setOnClickListener(new lh.s8(tL_messages_requestUrlAuth, zArr, o10, dVar, a1Var, i10, 4));
            final boolean[] zArr2 = new boolean[1];
            final boolean z16 = z12;
            final lf.j0 j0Var = new lf.j0(tL_urlAuthResultRequest2, strArr, context, i10, new vk0(dVar2, dVar, tL_messages_requestUrlAuth, strArr, s8Var, zArr2, iArr, zArr, o10, str5, f6Var2, z4, str, tL_urlAuthResultRequest2, a1Var), U5, 12);
            dVar2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    String str6;
                    if (!ph.d.this.K && !dVar.K) {
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                        boolean z17 = tL_urlAuthResultRequest3.request_phone_number;
                        final lf.j0 j0Var2 = j0Var;
                        if (z17) {
                            TLRPC.User currentUser2 = UserConfig.getInstance(iArr[0]).getCurrentUser();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, U5.getResourceProvider());
                            String string = LocaleController.getString(R.string.BotAuthPhoneNumber);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                            d2Var.O = string;
                            int i16 = R.string.BotAuthPhoneNumberText;
                            if (z14 && !z16) {
                                str6 = UserObject.getUserName(tL_urlAuthResultRequest3.bot);
                            } else {
                                str6 = str5;
                            }
                            se.b c3 = se.b.c();
                            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(i16, str6, c3.b("+" + currentUser2.phone).replaceAll(" ", " ")));
                            String string2 = LocaleController.getString(R.string.BotAuthPhoneNumberDeny);
                            final boolean[] zArr3 = zArr2;
                            alertDialog$Builder.h(string2, new org.telegram.ui.ActionBar.c2() {
                                @Override
                                public final void i(org.telegram.ui.ActionBar.d2 d2Var2, int i17) {
                                    switch (r3) {
                                        case 0:
                                            zArr3[0] = false;
                                            j0Var2.run();
                                            return;
                                        default:
                                            zArr3[0] = true;
                                            j0Var2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.k(LocaleController.getString(R.string.BotAuthPhoneNumberAccept), new org.telegram.ui.ActionBar.c2() {
                                @Override
                                public final void i(org.telegram.ui.ActionBar.d2 d2Var2, int i17) {
                                    switch (r3) {
                                        case 0:
                                            zArr3[0] = false;
                                            j0Var2.run();
                                            return;
                                        default:
                                            zArr3[0] = true;
                                            j0Var2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.d(-2);
                            alertDialog$Builder.o();
                            return;
                        }
                        j0Var2.run();
                    }
                }
            });
            o10.setOnDismissListener(new v5(new org.telegram.ui.ActionBar.g3[1], 9));
            org.telegram.ui.ActionBar.g3 g3Var = f39930a;
            if (g3Var != null) {
                g3Var.dismiss();
                f39930a = null;
            }
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                f39930a = c(context, i10, tL_urlAuthResultRequest2.match_codes, str5, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        String str6 = (String) obj2;
                        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
                        d2Var.q(200L);
                        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                        strArr[0] = str6;
                        tL_messages_checkUrlAuthMatchCode.match_code = str6;
                        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new Object(), new lh.z1(d2Var, o10, str5, f6Var2, 1));
                    }
                }, false, new ct(zArr, a1Var, tL_messages_requestUrlAuth, i10, 5), U5.getResourceProvider());
                return;
            }
            f39930a = o10;
            o10.show();
        }
    }

    public static org.telegram.ui.ActionBar.g3 c(Context context, int i10, ArrayList arrayList, String str, Utilities.Callback callback, boolean z4, Runnable runnable, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11;
        int i12;
        wk0 wk0Var;
        int i13;
        org.telegram.ui.ActionBar.g3[] g3VarArr = new org.telegram.ui.ActionBar.g3[1];
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, null, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        o10.customView = linearLayout;
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        linearLayout.addView(textView, k7.b6.t(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(0, AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f));
        linearLayout.addView(linearLayout2, k7.b6.t(-1, -2, 1, 0, 0, 0, 0));
        if (ConnectionsManager.getInstance(i10).isTestBackend()) {
            i11 = 0;
            while (i11 < 4) {
                if (UserConfig.getInstance(i11).isClientActivated() && !ConnectionsManager.getInstance(i11).isTestBackend()) {
                    break;
                }
                i11++;
            }
        }
        i11 = i10;
        org.telegram.ui.Components.p9[] p9VarArr = new org.telegram.ui.Components.p9[arrayList.size()];
        int i14 = 0;
        boolean z10 = true;
        while (i14 < arrayList.size()) {
            String str2 = (String) arrayList.get(i14);
            FrameLayout frameLayout = new FrameLayout(context);
            org.telegram.ui.ActionBar.g3 g3Var = o10;
            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(70.0f), org.telegram.ui.ActionBar.j6.l1(0.05f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var))));
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str2);
            if (emojiBigDrawable == null) {
                wk0Var = new wk0(new org.telegram.ui.Components.k01(str2, 30.0f, AndroidUtilities.bold()), f6Var);
                z10 = false;
            } else {
                wk0Var = emojiBigDrawable;
            }
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            p9VarArr[i14] = p9Var;
            p9Var.getImageReceiver().setCurrentAccount(i11);
            p9Var.l(null, null, null, null, wk0Var, null);
            NotificationCenter.listenEmojiLoading(p9Var);
            frameLayout.addView(p9Var, k7.b6.e(40, 40, 17));
            if (i14 == 0) {
                i13 = 0;
            } else {
                i13 = 24;
            }
            linearLayout2.addView(frameLayout, k7.b6.t(70, 70, 16, i13, 0, 0, 0));
            k7.d6.a(frameLayout);
            frameLayout.setOnClickListener(new b0(g3VarArr, callback, str2));
            i14++;
            o10 = g3Var;
        }
        org.telegram.ui.ActionBar.g3 g3Var2 = o10;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        MediaDataController.getInstance(i11).getStickerSet(tL_inputStickerSetShortName, null, false, new org.telegram.ui.Components.vk(19, arrayList, p9VarArr));
        if (z10) {
            i12 = R.string.BotAuthSelectEmoji;
        } else {
            i12 = R.string.BotAuthSelectCode;
        }
        textView.setText(LocaleController.getString(i12));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var));
        textView2.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthLoginRequestFrom, str), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false)));
        linearLayout.addView(textView2, k7.b6.t(-1, -2, 1, 0, 23, 0, 11));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        if (z4) {
            p10.d();
            p10.setText(LocaleController.getString(R.string.Cancel));
        } else {
            p10.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20122p7, f6Var));
            p10.setText(LocaleController.getString(R.string.Decline));
        }
        linearLayout.addView(p10, k7.b6.t(-1, 48, 7, 12, 12, 12, 12));
        p10.setOnClickListener(new b0(p10, g3VarArr, runnable, 13));
        g3Var2.show();
        g3VarArr[0] = g3Var2;
        return g3Var2;
    }
}
