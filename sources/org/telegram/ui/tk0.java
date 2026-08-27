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

public abstract class tk0 {

    public static org.telegram.ui.ActionBar.e3 f42959a;

    public static org.telegram.ui.Components.mc a() {
        Context parentActivity;
        Context parentActivity2;
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        HashSet<nh.b3> hashSet = nh.b3.S0;
        if (!hashSet.isEmpty()) {
            nh.b3 b3Var = null;
            for (nh.b3 b3Var2 : hashSet) {
                if (b3Var2.R0) {
                    b3Var = b3Var2;
                }
            }
            if (b3Var != null) {
                if (n2VarU == null || n2VarU.getParentActivity() == null) {
                    parentActivity2 = LaunchActivity.C1;
                    if (parentActivity2 == null) {
                        parentActivity2 = ApplicationLoader.applicationContext;
                    }
                } else {
                    parentActivity2 = n2VarU.getParentActivity();
                }
                return new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(parentActivity2), null);
            }
        }
        HashSet<m4> hashSet2 = m4.X0;
        if (!hashSet2.isEmpty()) {
            m4 m4Var = null;
            for (m4 m4Var2 : hashSet2) {
                if (m4Var2.R) {
                    m4Var = m4Var2;
                }
            }
            if (m4Var != null) {
                if (n2VarU == null || n2VarU.getParentActivity() == null) {
                    parentActivity = LaunchActivity.C1;
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                } else {
                    parentActivity = n2VarU.getParentActivity();
                }
                return new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(parentActivity), null);
            }
        }
        return (n2VarU == null || n2VarU.getLastSheet() == null || n2VarU.getLastSheet().getBulletinFactory() == null) ? org.telegram.ui.Components.mc.a0(n2VarU) : n2VarU.getLastSheet().getBulletinFactory();
    }

    public static void b(boolean z10, final int i10, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z11, org.telegram.ui.web.z0 z0Var) {
        final Context context;
        boolean z12;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        org.telegram.ui.Cells.p8 p8Var;
        ArrayList arrayList;
        boolean z13;
        org.telegram.ui.ActionBar.n2 n2VarU;
        String string;
        org.telegram.ui.ActionBar.n2 n2VarU2;
        Context context2;
        boolean z14 = true;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (z0Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(z0Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (z0Var != null) {
                        z0Var.v("oauth_result_confirmed", org.telegram.ui.web.z0.x(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
                    if (n2VarU3 == null) {
                        return;
                    }
                    we.e.u(n2VarU3.getContext(), tL_urlAuthResultAccepted.url);
                    return;
                }
                boolean z15 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z15) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    string = tL_urlAuthResultRequest.is_app ? !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : LocaleController.getString(R.string.UnverifiedApp) : tL_urlAuthResultRequest.domain;
                } else {
                    string = null;
                }
                if (!TextUtils.isEmpty(string)) {
                    a().M(LocaleController.getString(R.string.BotAuthLoggedInSuccessTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(z15 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z11 ? R.string.BotAuthLoggedInSuccessWithoutPhoneNumber : R.string.BotAuthLoggedInSuccess, string), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Gi, false)), R.raw.contact_check).j();
                }
                if (z0Var != null) {
                    z0Var.v("oauth_result_confirmed", org.telegram.ui.web.z0.x(null, "result_url"));
                    return;
                } else {
                    if (!z10 || (n2VarU2 = LaunchActivity.U()) == null || (context2 = n2VarU2.getContext()) == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new fv(context2, z14 ? 1 : 0), 800L);
                    return;
                }
            }
            return;
        }
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (z0Var != null) {
                return;
            }
            if (TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                if (TextUtils.isEmpty(str) || (n2VarU = LaunchActivity.U()) == null) {
                    return;
                }
                org.telegram.ui.Components.y4.q0(n2VarU, str, false, urlAuthResult2 == null);
                return;
            }
            org.telegram.ui.ActionBar.n2 n2VarU4 = LaunchActivity.U();
            if (n2VarU4 == null) {
                return;
            }
            org.telegram.ui.Components.y4.q0(n2VarU4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
            return;
        }
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final org.telegram.ui.ActionBar.n2 n2VarU5 = LaunchActivity.U();
            if (n2VarU5 == null || (context = n2VarU5.getContext()) == null) {
                return;
            }
            org.telegram.ui.ActionBar.c6 resourceProvider = n2VarU5.getResourceProvider();
            final org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, n2VarU5.getResourceProvider(), false, false);
            FrameLayout frameLayout3 = new FrameLayout(context);
            e3VarO.customView = frameLayout3;
            ArrayList arrayList2 = new ArrayList();
            boolean zIsTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
            arrayList2.clear();
            for (int i11 = 0; i11 < 4; i11++) {
                if (UserConfig.getInstance(i11).isClientActivated() && ConnectionsManager.getInstance(i11).isTestBackend() == zIsTestBackend) {
                    arrayList2.add(Integer.valueOf(i11));
                }
            }
            Collections.sort(arrayList2, new org.telegram.ui.Components.lp0(8));
            final boolean z16 = tL_messages_requestUrlAuth.peer != null;
            boolean z17 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout4 = new FrameLayout(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(14.0f), n2VarU5.getThemedColor(org.telegram.ui.ActionBar.g6.f23143i5)));
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            n9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            n9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            int[] iArr = {i10};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            y8Var.r(currentUser);
            n9Var.e(currentUser, y8Var);
            frameLayout5.addView(n9Var, h7.z5.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int themedColor = n2VarU5.getThemedColor(org.telegram.ui.ActionBar.g6.f23300r5);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout5.addView(imageView, h7.z5.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout4.addView(frameLayout5, h7.z5.e(52, 28, 17));
            frameLayout4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout3.addView(frameLayout4, h7.z5.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            h7.b6.a(frameLayout4);
            if (arrayList2.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout4.setVisibility(8);
            }
            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
            frameLayout3.addView(linearLayoutG, h7.z5.e(-1, -1, 119));
            org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
            n9Var2.setRoundRadius(AndroidUtilities.dp(40.0f));
            org.telegram.ui.Components.y8 y8Var2 = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            y8Var2.r(tL_urlAuthResultRequest2.bot);
            n9Var2.e(tL_urlAuthResultRequest2.bot, y8Var2);
            linearLayoutG.addView(n9Var2, h7.z5.t(80, 80, 49, 0, 21, 0, 16));
            final String string2 = tL_urlAuthResultRequest2.is_app ? !TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name) ? tL_urlAuthResultRequest2.verified_app_name : LocaleController.getString(R.string.UnverifiedApp) : tL_urlAuthResultRequest2.domain;
            int i12 = org.telegram.ui.ActionBar.g6.f23161j5;
            TextView textViewB = h7.d6.b(context, 20.0f, i12, true, null);
            textViewB.setGravity(17);
            textViewB.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthTitle, string2), n2VarU5.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)));
            linearLayoutG.addView(textViewB, h7.z5.r(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView textViewB2 = h7.d6.b(context, 14.0f, i12, false, null);
            textViewB2.setGravity(17);
            org.telegram.messenger.y1.p(z17 ? R.string.BotAuthAppSubtitle : z16 ? R.string.BotAuthBotSubtitle : R.string.BotAuthSiteSubtitle, textViewB2);
            linearLayoutG.addView(textViewB2, h7.z5.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                frameLayout2 = frameLayout4;
                frameLayout = frameLayout5;
                resourceProvider = resourceProvider;
                iArr = iArr;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(16.0f), n2VarU5.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6)));
                linearLayoutG.addView(linearLayout, h7.z5.t(-1, -2, 55, 9, -3, 9, -3));
                if (!TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) || !TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    LinearLayout linearLayoutG2 = org.telegram.messenger.y1.g(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.msg2_devices);
                    imageView2.setColorFilter(new PorterDuffColorFilter(n2VarU5.getThemedColor(i12), mode));
                    linearLayoutG2.addView(imageView2, h7.z5.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    linearLayoutG2.addView(linearLayout2, h7.z5.r(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView textViewB3 = h7.d6.b(context, 16.0f, i12, false, null);
                    textViewB3.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(textViewB3, h7.z5.r(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView textViewB4 = h7.d6.b(context, 13.0f, org.telegram.ui.ActionBar.g6.f23423y6, false, null);
                    textViewB4.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    linearLayout2.addView(textViewB4, h7.z5.q(-1, -2, 55));
                    linearLayout.addView(linearLayoutG2, h7.z5.n(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    z12 = false;
                } else {
                    LinearLayout linearLayoutG3 = org.telegram.messenger.y1.g(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(R.drawable.msg2_language);
                    imageView3.setColorFilter(new PorterDuffColorFilter(n2VarU5.getThemedColor(i12), mode));
                    linearLayoutG3.addView(imageView3, h7.z5.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    linearLayoutG3.addView(linearLayout3, h7.z5.r(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView textViewB5 = h7.d6.b(context, 16.0f, i12, false, null);
                    textViewB5.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(textViewB5, h7.z5.r(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    z12 = false;
                    TextView textViewB6 = h7.d6.b(context, 13.0f, org.telegram.ui.ActionBar.g6.f23423y6, false, null);
                    textViewB6.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : LocaleController.formatString(R.string.BotAuthBasedOnIP, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(textViewB6, h7.z5.q(-1, -2, 55));
                    linearLayout.addView(linearLayoutG3, h7.z5.n(-1, -2));
                }
                TextView textViewB7 = h7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.f23423y6, z12, null);
                textViewB7.setText(LocaleController.getString(R.string.BotAuthInfo));
                linearLayoutG.addView(textViewB7, h7.z5.t(-1, -2, 55, 22, 5, 22, 20));
                frameLayout2 = frameLayout4;
                frameLayout = frameLayout5;
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout6 = new FrameLayout(context);
                int iDp = AndroidUtilities.dp(16.0f);
                int i13 = org.telegram.ui.ActionBar.g6.f23053d6;
                frameLayout6.setBackground(org.telegram.ui.ActionBar.g6.d0(iDp, n2VarU5.getThemedColor(i13)));
                org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(context, n2VarU5.getResourceProvider());
                p8Var2.f(LocaleController.getString(R.string.BotAuthAllowMessages), true, false);
                p8Var2.setBackground(org.telegram.ui.ActionBar.g6.Z(n2VarU5.getThemedColor(i13), n2VarU5.getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 16, 16));
                p8Var2.setOnClickListener(new u50(p8Var2, 11));
                frameLayout6.addView(p8Var2, h7.z5.e(-1, -1, 119));
                linearLayoutG.addView(frameLayout6, h7.z5.t(-1, -2, 7, 9, -3, 9, -3));
                TextView textViewB8 = h7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.f23423y6, false, null);
                textViewB8.setText(LocaleController.formatString(R.string.BotAuthAllowMessagesInfo, UserObject.getUserName(tL_urlAuthResultRequest2.bot)));
                linearLayoutG.addView(textViewB8, h7.z5.t(-1, -2, 55, 22, 6, 22, 20));
                p8Var = p8Var2;
            } else {
                p8Var = null;
            }
            LinearLayout linearLayoutG4 = org.telegram.messenger.y1.g(context, 0);
            final lh.d dVar = new lh.d(context, n2VarU5.getResourceProvider(), true);
            dVar.setRoundRadius(24);
            dVar.setColor(n2VarU5.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7));
            dVar.setText(LocaleController.getString(R.string.Decline));
            linearLayoutG4.addView(dVar, h7.z5.p(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            final lh.d dVar2 = new lh.d(context, n2VarU5.getResourceProvider(), true);
            dVar2.setRoundRadius(24);
            dVar2.setText(LocaleController.getString(R.string.BotAuthLogin));
            linearLayoutG4.addView(dVar2, h7.z5.p(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            linearLayoutG.addView(linearLayoutG4, h7.z5.t(-1, -2, 7, 12, 12, 12, 8));
            e3VarO.setBackgroundColor(n2VarU5.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
            final String[] strArr = {str2};
            ArrayList arrayList3 = arrayList2;
            FrameLayout frameLayout7 = frameLayout2;
            final org.telegram.ui.ActionBar.c6 c6Var = resourceProvider;
            final int[] iArr2 = iArr;
            qk0 qk0Var = new qk0(iArr2, tL_messages_requestUrlAuth, e3VarO, z10, str, urlAuthResult2, strArr, z11, z0Var, string2, c6Var);
            if (tL_urlAuthResultRequest2.user_id_hint == 0 || UserConfig.getInstance(i10).getClientUserId() == tL_urlAuthResultRequest2.user_id_hint) {
                arrayList = arrayList3;
                z13 = z17;
                break;
            }
            int size = arrayList3.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    arrayList = arrayList3;
                    z13 = z17;
                    break;
                }
                arrayList = arrayList3;
                Object obj = arrayList.get(i14);
                i14++;
                Integer num = (Integer) obj;
                z13 = z17;
                if (UserConfig.getInstance(num.intValue()).getClientUserId() == tL_urlAuthResultRequest2.user_id_hint) {
                    qk0Var.run(num);
                    break;
                } else {
                    arrayList3 = arrayList;
                    z17 = z13;
                }
            }
            frameLayout7.setOnClickListener(new jh.b0(e3VarO, frameLayout, arrayList, iArr2, qk0Var));
            boolean[] zArr = new boolean[1];
            dVar.setOnClickListener(new hh.u8(tL_messages_requestUrlAuth, zArr, e3VarO, dVar, z0Var, i10, 5));
            final boolean[] zArr2 = new boolean[1];
            final boolean z18 = z13;
            final gf.k0 k0Var = new gf.k0(tL_urlAuthResultRequest2, strArr, context, i10, new rk0(dVar2, dVar, tL_messages_requestUrlAuth, strArr, p8Var, zArr2, iArr2, zArr, e3VarO, string2, c6Var, z10, str, tL_urlAuthResultRequest2, z0Var), n2VarU5, 12);
            dVar2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    if (dVar2.J || dVar.J) {
                        return;
                    }
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                    boolean z19 = tL_urlAuthResultRequest3.request_phone_number;
                    final gf.k0 k0Var2 = k0Var;
                    if (!z19) {
                        k0Var2.run();
                        return;
                    }
                    final int i15 = 0;
                    TLRPC.User currentUser2 = UserConfig.getInstance(iArr2[0]).getCurrentUser();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, n2VarU5.getResourceProvider());
                    String string3 = LocaleController.getString(R.string.BotAuthPhoneNumber);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.N = string3;
                    int i16 = R.string.BotAuthPhoneNumberText;
                    String userName = (!z16 || z18) ? string2 : UserObject.getUserName(tL_urlAuthResultRequest3.bot);
                    final int i17 = 1;
                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(i16, userName, oe.b.c().b("+" + currentUser2.phone).replaceAll(" ", " ")));
                    String string4 = LocaleController.getString(R.string.BotAuthPhoneNumberDeny);
                    final boolean[] zArr3 = zArr2;
                    alertDialog$Builder.h(string4, new org.telegram.ui.ActionBar.a2() {
                        @Override
                        public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i18) {
                            switch (i15) {
                                case 0:
                                    zArr3[0] = false;
                                    k0Var2.run();
                                    break;
                                default:
                                    zArr3[0] = true;
                                    k0Var2.run();
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotAuthPhoneNumberAccept), new org.telegram.ui.ActionBar.a2() {
                        @Override
                        public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i18) {
                            switch (i17) {
                                case 0:
                                    zArr3[0] = false;
                                    k0Var2.run();
                                    break;
                                default:
                                    zArr3[0] = true;
                                    k0Var2.run();
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.d(-2);
                    alertDialog$Builder.o();
                }
            });
            e3VarO.setOnDismissListener(new s5(new org.telegram.ui.ActionBar.e3[1], 9));
            org.telegram.ui.ActionBar.e3 e3Var = f42959a;
            if (e3Var != null) {
                e3Var.dismiss();
                f42959a = null;
            }
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                f42959a = c(context, i10, tL_urlAuthResultRequest2.match_codes, string2, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        String str3 = (String) obj2;
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
                        b2Var.q(200L);
                        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                        strArr[0] = str3;
                        tL_messages_checkUrlAuthMatchCode.match_code = str3;
                        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new org.telegram.messenger.a(), new hh.b2(b2Var, e3VarO, string2, c6Var, 1));
                    }
                }, false, new xs(zArr, z0Var, tL_messages_requestUrlAuth, i10, 5), n2VarU5.getResourceProvider());
            } else {
                f42959a = e3VarO;
                e3VarO.show();
            }
        }
    }

    public static org.telegram.ui.ActionBar.e3 c(Context context, int i10, ArrayList arrayList, String str, Utilities.Callback callback, boolean z10, Runnable runnable, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        Drawable sk0Var;
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, null, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        e3VarO.customView = linearLayout;
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        linearLayout.addView(textView, h7.z5.t(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(0, AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f));
        linearLayout.addView(linearLayout2, h7.z5.t(-1, -2, 1, 0, 0, 0, 0));
        if (!ConnectionsManager.getInstance(i10).isTestBackend()) {
            i11 = i10;
            break;
        }
        i11 = 0;
        while (true) {
            if (i11 >= 4) {
                i11 = i10;
                break;
            }
            if (UserConfig.getInstance(i11).isClientActivated() && !ConnectionsManager.getInstance(i11).isTestBackend()) {
                break;
            }
            i11++;
        }
        org.telegram.ui.Components.n9[] n9VarArr = new org.telegram.ui.Components.n9[arrayList.size()];
        int i12 = 0;
        boolean z11 = true;
        while (i12 < arrayList.size()) {
            String str2 = (String) arrayList.get(i12);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(70.0f), org.telegram.ui.ActionBar.g6.l1(0.05f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var))));
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str2);
            if (emojiBigDrawable == null) {
                sk0Var = new sk0(new org.telegram.ui.Components.pz0(str2, 30.0f, AndroidUtilities.bold()), c6Var);
                z11 = false;
            } else {
                sk0Var = emojiBigDrawable;
            }
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            n9VarArr[i12] = n9Var;
            n9Var.getImageReceiver().setCurrentAccount(i11);
            n9Var.l(null, null, null, null, sk0Var, null);
            NotificationCenter.listenEmojiLoading(n9Var);
            frameLayout.addView(n9Var, h7.z5.e(40, 40, 17));
            linearLayout2.addView(frameLayout, h7.z5.t(70, 70, 16, i12 == 0 ? 0 : 24, 0, 0, 0));
            h7.b6.a(frameLayout);
            frameLayout.setOnClickListener(new c0(e3VarArr, callback, str2));
            i12++;
        }
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        MediaDataController.getInstance(i11).getStickerSet(tL_inputStickerSetShortName, null, false, new ib0(4, arrayList, n9VarArr));
        textView.setText(LocaleController.getString(z11 ? R.string.BotAuthSelectEmoji : R.string.BotAuthSelectCode));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        textView2.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthLoginRequestFrom, str), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false)));
        linearLayout.addView(textView2, h7.z5.t(-1, -2, 1, 0, 23, 0, 11));
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        if (z10) {
            dVarG.d();
            dVarG.setText(LocaleController.getString(R.string.Cancel));
        } else {
            dVarG.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, c6Var));
            dVarG.setText(LocaleController.getString(R.string.Decline));
        }
        linearLayout.addView(dVarG, h7.z5.t(-1, 48, 7, 12, 12, 12, 12));
        dVarG.setOnClickListener(new c0(dVarG, e3VarArr, runnable, 13));
        e3VarO.show();
        e3VarArr[0] = e3VarO;
        return e3VarO;
    }
}
