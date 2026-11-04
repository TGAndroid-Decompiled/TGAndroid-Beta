package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class yh0 {
    public static org.telegram.ui.ActionBar.t2 f52282a;

    public static org.telegram.ui.Components.fc a() {
        Context context;
        Context context2;
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        HashSet hashSet = ii.a3.f14789b1;
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            ii.a3 a3Var = null;
            while (it.hasNext()) {
                ii.a3 a3Var2 = (ii.a3) it.next();
                if (a3Var2.f14794a1) {
                    a3Var = a3Var2;
                }
            }
            if (a3Var != null) {
                if (T != null && T.getParentActivity() != null) {
                    context2 = T.getParentActivity();
                } else {
                    context2 = LaunchActivity.K1;
                    if (context2 == null) {
                        context2 = org.telegram.messenger.t0.f25457b;
                    }
                }
                return new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(context2), null);
            }
        }
        HashSet hashSet2 = i4.f46056d1;
        if (!hashSet2.isEmpty()) {
            Iterator it2 = hashSet2.iterator();
            i4 i4Var = null;
            while (it2.hasNext()) {
                i4 i4Var2 = (i4) it2.next();
                if (i4Var2.W) {
                    i4Var = i4Var2;
                }
            }
            if (i4Var != null) {
                if (T != null && T.getParentActivity() != null) {
                    context = T.getParentActivity();
                } else {
                    context = LaunchActivity.K1;
                    if (context == null) {
                        context = org.telegram.messenger.t0.f25457b;
                    }
                }
                return new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(context), null);
            }
        }
        if (T != null && T.getLastSheet() != null && T.getLastSheet().k() != null) {
            return T.getLastSheet().k();
        }
        return org.telegram.ui.Components.fc.a0(T);
    }

    public static void b(boolean z10, final int i3, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z11, org.telegram.ui.web.w0 w0Var) {
        final Context context;
        org.telegram.ui.ActionBar.e6 e6Var;
        String str3;
        boolean z12;
        ?? r82;
        boolean z13;
        org.telegram.ui.Cells.q8 q8Var;
        String str4;
        ArrayList arrayList;
        gi.d dVar;
        org.telegram.ui.ActionBar.d2 T;
        String str5;
        org.telegram.ui.ActionBar.d2 T2;
        Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (w0Var == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(w0Var.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (w0Var != null) {
                        w0Var.y("oauth_result_confirmed", org.telegram.ui.web.w0.A(tL_urlAuthResultAccepted.url, "result_url"));
                        return;
                    }
                    org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                    if (T3 == null) {
                        return;
                    }
                    sf.c.v(T3.getContext(), tL_urlAuthResultAccepted.url, true);
                    return;
                }
                boolean z14 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z14) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    if (tL_urlAuthResultRequest.is_app) {
                        str5 = !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : org.telegram.messenger.bd.M0(2131743835, null);
                    } else {
                        str5 = tL_urlAuthResultRequest.domain;
                    }
                } else {
                    str5 = null;
                }
                if (!TextUtils.isEmpty(str5)) {
                    a().I(2131623989, org.telegram.messenger.bd.M0(2131753126, null), org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.uj, false), org.telegram.messenger.bd.a0(null, null, z14 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z11 ? 2131753125 : 2131753127, str5))).j();
                }
                if (w0Var != null) {
                    w0Var.y("oauth_result_confirmed", org.telegram.ui.web.w0.A(null, "result_url"));
                } else if (z10 && (T2 = LaunchActivity.T()) != null && (context2 = T2.getContext()) != null) {
                    org.telegram.messenger.g0.i3(new zt(context2, 1), 800L);
                }
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (w0Var != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                org.telegram.ui.ActionBar.d2 T4 = LaunchActivity.T();
                if (T4 == null) {
                    return;
                }
                org.telegram.ui.Components.t4.p0(T4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
            } else if (!TextUtils.isEmpty(str) && (T = LaunchActivity.T()) != null) {
                org.telegram.ui.Components.t4.p0(T, str, false, urlAuthResult2 == null);
            }
        } else if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final org.telegram.ui.ActionBar.d2 T5 = LaunchActivity.T();
            if (T5 == null || (context = T5.getContext()) == null) {
                return;
            }
            final org.telegram.ui.ActionBar.e6 resourceProvider = T5.getResourceProvider();
            org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, T5.getResourceProvider(), false);
            FrameLayout frameLayout = new FrameLayout(context);
            l10.O = frameLayout;
            ArrayList arrayList2 = new ArrayList();
            boolean isTestBackend = ConnectionsManager.getInstance(i3).isTestBackend();
            arrayList2.clear();
            for (int i10 = 0; i10 < 4; i10++) {
                if (org.telegram.messenger.h10.i(i10).p() && ConnectionsManager.getInstance(i10).isTestBackend() == isTestBackend) {
                    arrayList2.add(Integer.valueOf(i10));
                }
            }
            Collections.sort(arrayList2, new org.telegram.ui.Components.d80(15));
            final boolean z15 = tL_messages_requestUrlAuth.peer != null;
            boolean z16 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout2 = new FrameLayout(context);
            FrameLayout frameLayout3 = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(14.0f);
            int i11 = org.telegram.ui.ActionBar.k6.f27971i5;
            Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, T5.getThemedColor(i11));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            frameLayout3.setBackground(d02);
            org.telegram.ui.ActionBar.r6.k(frameLayout3, d02, N, null, resourceProvider);
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(14.0f));
            k9Var.getImageReceiver().B0 = true;
            org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            final int[] iArr = {i3};
            TLRPC.User f10 = org.telegram.messenger.h10.i(iArr[0]).f();
            u8Var.r(f10);
            k9Var.e(f10, u8Var);
            frameLayout3.addView(k9Var, b8.mf.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i12 = org.telegram.ui.ActionBar.k6.r5;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            org.telegram.ui.ActionBar.r6.t(imageView, i12, resourceProvider, mode);
            imageView.setImageResource(2131230873);
            frameLayout3.addView(imageView, b8.mf.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, b8.mf.e(52, 28, 17));
            frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), 0);
            frameLayout.addView(frameLayout2, b8.mf.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            b8.pf.a(frameLayout2);
            if (arrayList2.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout f11 = org.telegram.messenger.k5.f(context, 1);
            frameLayout.addView(f11, b8.mf.e(-1, -1, 119));
            org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
            k9Var2.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
            org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
            u8Var2.r(tL_urlAuthResultRequest2.bot);
            k9Var2.e(tL_urlAuthResultRequest2.bot, u8Var2);
            f11.addView(k9Var2, b8.mf.t(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name)) {
                    e6Var = null;
                    str3 = org.telegram.messenger.bd.M0(2131743835, null);
                } else {
                    str3 = tL_urlAuthResultRequest2.verified_app_name;
                    e6Var = null;
                }
            } else {
                e6Var = null;
                str3 = tL_urlAuthResultRequest2.domain;
            }
            final String str6 = str3;
            int i13 = org.telegram.ui.ActionBar.k6.f27988j5;
            TextView b10 = b8.rf.b(context, 20.0f, i13, true, e6Var);
            b10.setGravity(17);
            b10.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.bd.a0(null, null, 2131753113, str6), org.telegram.ui.ActionBar.k6.Ci, T5.getResourceProvider(), null, false));
            f11.addView(b10, b8.mf.s(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView b11 = b8.rf.b(context, 14.0f, i13, false, null);
            b11.setGravity(17);
            b11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(z16 ? 2131753134 : z15 ? 2131753132 : 2131753114, null)));
            f11.addView(b11, b8.mf.t(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                z12 = z16;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                int i14 = org.telegram.ui.ActionBar.k6.f27878d6;
                Drawable f02 = org.telegram.ui.ActionBar.k6.f0(L2, T5.getThemedColor(i14));
                org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
                linearLayout.setBackground(f02);
                org.telegram.ui.ActionBar.r6.k(linearLayout, f02, N2, null, resourceProvider);
                f11.addView(linearLayout, b8.mf.t(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    z12 = z16;
                } else {
                    LinearLayout f12 = org.telegram.messenger.k5.f(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(2131232024);
                    org.telegram.ui.ActionBar.r6.t(imageView2, i13, resourceProvider, mode);
                    f12.addView(imageView2, b8.mf.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    f12.addView(linearLayout2, b8.mf.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b12 = b8.rf.b(context, 16.0f, i13, false, null);
                    b12.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(b12, b8.mf.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView b13 = b8.rf.b(context, 13.0f, org.telegram.ui.ActionBar.k6.f28273y6, false, null);
                    b13.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    z12 = z16;
                    linearLayout2.addView(b13, b8.mf.r(-1, -2, 55));
                    linearLayout.addView(f12, b8.mf.o(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    r82 = 0;
                    z13 = false;
                } else {
                    LinearLayout f13 = org.telegram.messenger.k5.f(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(2131232030);
                    org.telegram.ui.ActionBar.r6.t(imageView3, i13, resourceProvider, mode);
                    f13.addView(imageView3, b8.mf.t(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    f13.addView(linearLayout3, b8.mf.s(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView b14 = b8.rf.b(context, 16.0f, i13, false, null);
                    b14.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(b14, b8.mf.s(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    r82 = 0;
                    z13 = false;
                    TextView b15 = b8.rf.b(context, 13.0f, org.telegram.ui.ActionBar.k6.f28273y6, false, null);
                    b15.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : org.telegram.messenger.bd.a0(null, null, 2131753133, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(b15, b8.mf.r(-1, -2, 55));
                    linearLayout.addView(f13, b8.mf.o(-1, -2));
                }
                TextView b16 = b8.rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.f28273y6, z13, r82);
                b16.setText(org.telegram.messenger.bd.M0(2131753131, r82));
                f11.addView(b16, b8.mf.t(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int i15 = org.telegram.ui.ActionBar.k6.f27878d6;
                InsetDrawable f03 = org.telegram.ui.ActionBar.k6.f0(L3, T5.getThemedColor(i15));
                org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i15);
                frameLayout4.setBackground(f03);
                org.telegram.ui.ActionBar.r6.k(frameLayout4, f03, N3, null, resourceProvider);
                org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context, T5.getResourceProvider());
                q8Var2.f(org.telegram.messenger.bd.M0(2131753136, null), true, false);
                int themedColor = T5.getThemedColor(i15);
                int i16 = org.telegram.ui.ActionBar.k6.f27972i6;
                org.telegram.ui.Cells.y b02 = org.telegram.ui.ActionBar.k6.b0(themedColor, T5.getThemedColor(i16), 16, 16);
                org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i15);
                org.telegram.ui.ActionBar.n6 N5 = org.telegram.ui.ActionBar.r6.N(i16);
                q8Var2.setBackground(b02);
                org.telegram.ui.ActionBar.r6.k(q8Var2, b02, N4, N5, resourceProvider);
                q8Var2.setOnClickListener(new b40(q8Var2, 12));
                frameLayout4.addView(q8Var2, b8.mf.e(-1, -1, 119));
                f11.addView(frameLayout4, b8.mf.t(-1, -2, 7, 9, -3, 9, -3));
                TextView b17 = b8.rf.b(context, 14.0f, org.telegram.ui.ActionBar.k6.f28273y6, false, null);
                b17.setText(org.telegram.messenger.bd.a0(null, null, 2131753135, org.telegram.messenger.l10.p(tL_urlAuthResultRequest2.bot)));
                f11.addView(b17, b8.mf.t(-1, -2, 55, 22, 6, 22, 20));
                q8Var = q8Var2;
            } else {
                q8Var = null;
            }
            LinearLayout f14 = org.telegram.messenger.k5.f(context, 0);
            final gi.d dVar2 = new gi.d(context, T5.getResourceProvider(), true);
            dVar2.setRoundRadius(24);
            int i17 = org.telegram.ui.ActionBar.k6.f28102p7;
            dVar2.setColor(T5.getThemedColor(i17));
            if (dVar2.getBackground() != null) {
                Drawable background = dVar2.getBackground();
                org.telegram.ui.ActionBar.n6 N6 = org.telegram.ui.ActionBar.r6.N(i17);
                dVar2.setBackground(background);
                str4 = null;
                org.telegram.ui.ActionBar.r6.k(dVar2, background, N6, null, resourceProvider);
            } else {
                str4 = null;
            }
            dVar2.setText(org.telegram.messenger.bd.M0(2131751605, str4));
            f14.addView(dVar2, b8.mf.q(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            gi.d dVar3 = new gi.d(context, T5.getResourceProvider(), true);
            dVar3.setRoundRadius(24);
            dVar3.setText(org.telegram.messenger.bd.M0(2131753124, null));
            f14.addView(dVar3, b8.mf.q(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            f11.addView(f14, b8.mf.t(-1, -2, 7, 12, 12, 12, 8));
            l10.f28626z0 = new xh0(dVar3);
            boolean[] zArr = {false};
            org.telegram.ui.ActionBar.t2[] t2VarArr = {null};
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = {null};
            l10.w0(org.telegram.ui.ActionBar.k6.f27824a7);
            final String[] strArr = {str2};
            org.telegram.ui.Cells.q8 q8Var3 = q8Var;
            ArrayList arrayList3 = arrayList2;
            vh0 vh0Var = new vh0(iArr, dVar3, dVar2, tL_messages_requestUrlAuth, l10, z10, str, urlAuthResult2, strArr, z11, w0Var, str6, resourceProvider);
            gi.d dVar4 = dVar3;
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && org.telegram.messenger.h10.i(i3).e() != tL_urlAuthResultRequest2.user_id_hint) {
                int size = arrayList3.size();
                int i18 = 0;
                while (i18 < size) {
                    arrayList = arrayList3;
                    Object obj = arrayList.get(i18);
                    i18++;
                    Integer num = (Integer) obj;
                    int i19 = size;
                    dVar = dVar4;
                    if (org.telegram.messenger.h10.i(num.intValue()).e() == tL_urlAuthResultRequest2.user_id_hint) {
                        vh0Var.a(num);
                        break;
                    }
                    dVar4 = dVar;
                    size = i19;
                    arrayList3 = arrayList;
                }
            }
            arrayList = arrayList3;
            dVar = dVar4;
            frameLayout2.setOnClickListener(new ei.f0(l10, frameLayout3, arrayList, iArr, vh0Var));
            boolean[] zArr2 = new boolean[1];
            final gi.d dVar5 = dVar;
            dVar2.setOnClickListener(new ci.ia(dVar5, tL_messages_requestUrlAuth, zArr2, l10, dVar2, w0Var, i3));
            final boolean[] zArr3 = new boolean[1];
            final boolean z17 = z12;
            final cg.k0 k0Var = new cg.k0(tL_urlAuthResultRequest2, strArr, context, i3, new wh0(dVar5, dVar2, tL_urlAuthResultRequest2, inputtonconnectoauthsessionArr, tL_messages_requestUrlAuth, strArr, q8Var3, zArr3, zArr, iArr, zArr2, l10, str6, resourceProvider, z10, str, w0Var), T5, 12);
            dVar5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    String str7;
                    if (!gi.d.this.R && !dVar2.R) {
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                        boolean z18 = tL_urlAuthResultRequest3.request_phone_number;
                        final cg.k0 k0Var2 = k0Var;
                        if (z18) {
                            TLRPC.User f15 = org.telegram.messenger.h10.i(iArr[0]).f();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, T5.getResourceProvider());
                            String M0 = org.telegram.messenger.bd.M0(2131753120, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M0;
                            if (z15 && !z17) {
                                str7 = org.telegram.messenger.l10.p(tL_urlAuthResultRequest3.bot);
                            } else {
                                str7 = str6;
                            }
                            mf.b c2 = mf.b.c();
                            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131753117, str7, c2.b("+" + f15.phone).replaceAll(" ", " ")));
                            String M02 = org.telegram.messenger.bd.M0(2131753118, null);
                            final boolean[] zArr4 = zArr3;
                            alertDialog$Builder.h(M02, new org.telegram.ui.ActionBar.p1() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i20) {
                                    switch (r3) {
                                        case 0:
                                            zArr4[0] = false;
                                            k0Var2.run();
                                            return;
                                        default:
                                            zArr4[0] = true;
                                            k0Var2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753119, null), new org.telegram.ui.ActionBar.p1() {
                                @Override
                                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i20) {
                                    switch (r3) {
                                        case 0:
                                            zArr4[0] = false;
                                            k0Var2.run();
                                            return;
                                        default:
                                            zArr4[0] = true;
                                            k0Var2.run();
                                            return;
                                    }
                                }
                            });
                            alertDialog$Builder.d(-2);
                            alertDialog$Builder.p();
                            return;
                        }
                        k0Var2.run();
                    }
                }
            });
            l10.setOnDismissListener(new ci.t6(zArr, inputtonconnectoauthsessionArr, t2VarArr, new org.telegram.ui.ActionBar.t2[1]));
            org.telegram.ui.ActionBar.t2 t2Var = f52282a;
            if (t2Var != null) {
                t2Var.dismiss();
                f52282a = null;
            }
            final org.telegram.ui.Components.t21 t21Var = new org.telegram.ui.Components.t21(tL_urlAuthResultRequest2, l10, t2VarArr, context, iArr, resourceProvider, zArr, inputtonconnectoauthsessionArr, k0Var);
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                f52282a = c(context, i3, tL_urlAuthResultRequest2.match_codes, str6, new org.telegram.messenger.u10() {
                    @Override
                    public final void a(Object obj2) {
                        String str7 = (String) obj2;
                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
                        s1Var.r(200L);
                        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                        strArr[0] = str7;
                        tL_messages_checkUrlAuthMatchCode.match_code = str7;
                        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i3).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new c3.b(1), new ci.h2(s1Var, t21Var, str6, resourceProvider, 2));
                    }
                }, false, new org.telegram.ui.Components.zo0(zArr2, w0Var, tL_messages_requestUrlAuth, i3, 12), T5.getResourceProvider());
            } else {
                t21Var.run();
            }
        }
    }

    public static org.telegram.ui.ActionBar.t2 c(Context context, int i3, ArrayList arrayList, String str, org.telegram.messenger.u10 u10Var, boolean z10, Runnable runnable, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        int i11;
        org.telegram.ui.Components.mc mcVar;
        int i12;
        org.telegram.ui.ActionBar.t2[] t2VarArr = new org.telegram.ui.ActionBar.t2[1];
        org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        l10.O = f10;
        TextView textView = new TextView(context);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        f10.addView(textView, b8.mf.t(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f));
        f10.addView(linearLayout, b8.mf.t(-1, -2, 1, 0, 0, 0, 0));
        if (ConnectionsManager.getInstance(i3).isTestBackend()) {
            i10 = 0;
            while (i10 < 4) {
                if (org.telegram.messenger.h10.i(i10).p() && !ConnectionsManager.getInstance(i10).isTestBackend()) {
                    break;
                }
                i10++;
            }
        }
        i10 = i3;
        org.telegram.ui.Components.k9[] k9VarArr = new org.telegram.ui.Components.k9[arrayList.size()];
        boolean z11 = true;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            String str2 = (String) arrayList.get(i13);
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(70.0f);
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.t2 t2Var = l10;
            int i15 = i13;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.r1(0.05f, org.telegram.ui.ActionBar.k6.w0(i14, e6Var)));
            org.telegram.ui.ActionBar.n6 L3 = org.telegram.ui.ActionBar.r6.L(0.05f, i14);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.r6.k(frameLayout, L2, L3, null, e6Var);
            org.telegram.messenger.e6 f11 = org.telegram.messenger.i6.f(str2);
            if (f11 == null) {
                mcVar = new org.telegram.ui.Components.mc(3, new org.telegram.ui.Components.ly0(str2, 30.0f, org.telegram.messenger.g0.o()), e6Var);
                z11 = false;
            } else {
                mcVar = f11;
            }
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            k9VarArr[i15] = k9Var;
            k9Var.getImageReceiver().d = i10;
            k9Var.m(null, null, null, null, mcVar, null);
            org.telegram.messenger.hs.i(k9Var);
            frameLayout.addView(k9Var, b8.mf.e(40, 40, 17));
            if (i15 == 0) {
                i12 = 0;
            } else {
                i12 = 24;
            }
            linearLayout.addView(frameLayout, b8.mf.t(70, 70, 16, i12, 0, 0, 0));
            b8.pf.a(frameLayout);
            frameLayout.setOnClickListener(new a0(t2VarArr, u10Var, str2));
            i13 = i15 + 1;
            l10 = t2Var;
        }
        org.telegram.ui.ActionBar.t2 t2Var2 = l10;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        org.telegram.messenger.li.b0(i10).l0(tL_inputStickerSetShortName, null, false, false, new org.telegram.ui.Components.ei(20, arrayList, k9VarArr));
        if (z11) {
            i11 = 2131753115;
        } else {
            i11 = 2131753116;
        }
        textView.setText(org.telegram.messenger.bd.M0(i11, null));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        textView2.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.bd.a0(null, null, 2131753123, str), org.telegram.ui.ActionBar.k6.Ci, null, null, false));
        f10.addView(textView2, b8.mf.t(-1, -2, 1, 0, 23, 0, 11));
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        if (z10) {
            h.e();
            h.setText(org.telegram.messenger.bd.M0(2131752589, null));
        } else {
            int i16 = org.telegram.ui.ActionBar.k6.f28102p7;
            h.setColor(org.telegram.ui.ActionBar.k6.w0(i16, e6Var));
            if (h.getBackground() != null) {
                Drawable background = h.getBackground();
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
                h.setBackground(background);
                org.telegram.ui.ActionBar.r6.k(h, background, N, null, e6Var);
            }
            h.setText(org.telegram.messenger.bd.M0(2131751605, null));
        }
        f10.addView(h, b8.mf.t(-1, 48, 7, 12, 12, 12, 12));
        h.setOnClickListener(new a0(h, t2VarArr, runnable, 13));
        t2Var2.show();
        t2VarArr[0] = t2Var2;
        return t2Var2;
    }
}
