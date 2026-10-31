package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class ua0 {
    public static final Pattern f42099k = Pattern.compile("^[a-z0-9_]{1,32}$");
    public final LaunchActivity f42100a;
    public final int f42101b;
    public final gf.e f42102c;
    public final boolean d;
    public org.telegram.ui.ActionBar.x1 e;
    public boolean f42103f;
    public boolean f42104g;
    public int h = -1;
    public i2.g1 f42105i;
    public boolean f42106j;

    public ua0(LaunchActivity launchActivity, int i10, gf.e eVar, boolean z10) {
        this.f42100a = launchActivity;
        this.f42101b = i10;
        this.f42102c = eVar;
        this.d = z10;
    }

    public static org.telegram.ui.Components.cc d() {
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return org.telegram.ui.Components.cc.X();
        }
        return org.telegram.ui.Components.cc.a0(T);
    }

    public static boolean p(java.lang.String r2) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ua0.p(java.lang.String):boolean");
    }

    public static boolean q(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ua0.q(java.lang.String):boolean");
    }

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i10 = 960;
        if (bytes.length <= 960) {
            return str;
        }
        while ((bytes[i10] & 192) == 128) {
            i10--;
        }
        return new String(bytes, 0, i10, StandardCharsets.UTF_8);
    }

    public static Uri s(Uri uri) {
        String schemeSpecificPart;
        if (uri != null && uri.isOpaque()) {
            String scheme = uri.getScheme();
            if (scheme == null || uri.getAuthority() != null || (schemeSpecificPart = uri.getSchemeSpecificPart()) == null) {
                return uri;
            }
            return Uri.parse(scheme + "://" + schemeSpecificPart);
        }
        return uri;
    }

    public final boolean a() {
        if (!this.f42106j) {
            LaunchActivity launchActivity = this.f42100a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && LaunchActivity.G1 && !org.telegram.messenger.tz.f18194x && !org.telegram.messenger.tz.C && org.telegram.messenger.d20.f15147s0 == this.f42101b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        this.f42106j = true;
        i2.g1 g1Var = this.f42105i;
        if (g1Var != null) {
            org.telegram.messenger.i0.r(g1Var);
        }
        if (this.h >= 0) {
            ConnectionsManager.getInstance(this.f42101b).cancelRequest(this.h, true);
            this.h = -1;
        }
    }

    public final void c() {
        if (this.f42104g) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.e;
        if (x1Var != null) {
            x1Var.dismiss();
        }
        gf.e eVar = this.f42102c;
        if (eVar != null) {
            eVar.b();
        }
        this.f42104g = true;
    }

    public final org.telegram.ui.ActionBar.z4 e() {
        return this.f42100a.M();
    }

    public final org.telegram.messenger.d20 f() {
        return org.telegram.messenger.d20.i(this.f42101b);
    }

    public final boolean g(Uri uri) {
        String str;
        String str2;
        String str3;
        String path;
        Uri s10;
        List<String> pathSegments;
        String str4;
        Long l4;
        String str5;
        boolean z10;
        Uri uri2 = uri;
        if (uri2 != null) {
            org.telegram.messenger.f8.b("link manager handle " + uri2);
            String scheme = uri2.getScheme();
            boolean equalsIgnoreCase = "tonsite".equalsIgnoreCase(scheme);
            LaunchActivity launchActivity = this.f42100a;
            if (equalsIgnoreCase) {
                gf.f.o(launchActivity, uri2);
                return true;
            } else if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                boolean equalsIgnoreCase2 = "tg".equalsIgnoreCase(scheme);
                int i10 = this.f42101b;
                if (equalsIgnoreCase2) {
                    Uri s11 = s(Uri.parse(uri2.toString().replaceFirst("(?i)^tg:(//)?sendgrams&", "tg://sendgrams?")));
                    List<String> pathSegments2 = s11.getPathSegments();
                    if (pathSegments2 != null) {
                        ArrayList arrayList = new ArrayList(pathSegments2);
                        String authority = s11.getAuthority();
                        if (!TextUtils.isEmpty(authority)) {
                            arrayList.add(0, authority);
                        }
                        if (!arrayList.isEmpty()) {
                            String str6 = (String) arrayList.get(0);
                            if (arrayList.size() > 1) {
                                str5 = (String) arrayList.get(1);
                            } else {
                                str5 = null;
                            }
                            if ("sendgrams".equalsIgnoreCase(str6)) {
                                return l(s11);
                            }
                            if ("newbot".equalsIgnoreCase(str6)) {
                                j(s11.getQueryParameter("manager"), s11.getQueryParameter("username"), s11.getQueryParameter("name"));
                                return true;
                            } else if ("resolve".equalsIgnoreCase(str6)) {
                                List<String> pathSegments3 = s11.getPathSegments();
                                if (pathSegments3 != null) {
                                    ArrayList arrayList2 = new ArrayList(pathSegments3);
                                    String authority2 = s11.getAuthority();
                                    if (!TextUtils.isEmpty(authority2)) {
                                        arrayList2.add(0, authority2);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        arrayList2.remove(0);
                                        String queryParameter = s11.getQueryParameter("domain");
                                        String queryParameter2 = s11.getQueryParameter("startapp");
                                        if ("sendgrams".equalsIgnoreCase(queryParameter)) {
                                            return l(s11);
                                        }
                                        if ("oauth".equalsIgnoreCase(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                                            return k(s11, queryParameter2);
                                        }
                                    }
                                }
                            } else if ("invoice".equalsIgnoreCase(str6)) {
                                return i(s11.getQueryParameter("slug"));
                            } else {
                                if ("oauth".equalsIgnoreCase(str6)) {
                                    return k(s11, s11.getQueryParameter("token"));
                                }
                                if ("settings".equalsIgnoreCase(str6)) {
                                    return m(arrayList.subList(1, arrayList.size()));
                                }
                                if ("chats".equalsIgnoreCase(str6)) {
                                    "search".equalsIgnoreCase(str5);
                                    "edit".equalsIgnoreCase(str5);
                                    "emoji-status".equalsIgnoreCase(str5);
                                }
                                if ("new".equalsIgnoreCase(str6)) {
                                    if ("group".equalsIgnoreCase(str5)) {
                                        u(new v50(new Bundle()), false);
                                        return true;
                                    } else if ("contact".equalsIgnoreCase(str5)) {
                                        new gi0(launchActivity, LaunchActivity.T()).show();
                                        return true;
                                    } else if ("channel".equalsIgnoreCase(str5)) {
                                        SharedPreferences d12 = org.telegram.messenger.vp.d1();
                                        boolean z11 = org.telegram.messenger.v2.f18448a;
                                        u(new f(0), false);
                                        d12.edit().putBoolean("channel_intro", true).commit();
                                        return true;
                                    } else {
                                        u(new ContactsActivity(a1.g.g("destroyAfterSelect", true)), false);
                                        return true;
                                    }
                                } else if ("post".equalsIgnoreCase(str6)) {
                                    ?? r02 = "video".equalsIgnoreCase(str5);
                                    if ("live".equalsIgnoreCase(str5)) {
                                        r02 = -1;
                                    }
                                    vh.o8 D = vh.o8.D(launchActivity, i10);
                                    if (D.O1 != r02) {
                                        D.O1 = r02;
                                        ?? r42 = D.Q0;
                                        if (r42 != 0) {
                                            r42.a(r02);
                                        }
                                        if (r02 == 1) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        D.h0(z10, true);
                                        vh.t tVar = D.I0;
                                        if (tVar != null) {
                                            tVar.a(false, true);
                                        }
                                        D.l0(false);
                                    }
                                    D.Q(null);
                                    return true;
                                } else if ("contacts".equalsIgnoreCase(str6)) {
                                    if ("new".equalsIgnoreCase(str5)) {
                                        new gi0(launchActivity, LaunchActivity.T()).show();
                                        return true;
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("needPhonebook", true);
                                    bundle.putBoolean("needFinishFragment", true);
                                    u(new ContactsActivity(bundle), false);
                                    "search".equalsIgnoreCase(str5);
                                    "sort".equalsIgnoreCase(str5);
                                    if ("invite".equalsIgnoreCase(str5)) {
                                        x("phonebookRow");
                                        return true;
                                    }
                                    return true;
                                } else if ("addstyle".equalsIgnoreCase(str6)) {
                                    return h(s11.getQueryParameter("slug"));
                                }
                            }
                        }
                    }
                } else if ("ton".equalsIgnoreCase(scheme)) {
                    if (((org.telegram.messenger.j0) org.telegram.messenger.vp.r1(i10).f18957y7.f17841j0.f11587b).f16204c && (pathSegments = (s10 = s(uri2)).getPathSegments()) != null) {
                        ArrayList arrayList3 = new ArrayList(pathSegments);
                        String authority3 = s10.getAuthority();
                        if (!TextUtils.isEmpty(authority3)) {
                            arrayList3.add(0, authority3);
                        }
                        if (!arrayList3.isEmpty()) {
                            String str7 = (String) arrayList3.get(0);
                            if (arrayList3.size() > 1) {
                                str4 = (String) arrayList3.get(1);
                            } else {
                                str4 = null;
                            }
                            if (!"transfer".equalsIgnoreCase(str7)) {
                                return false;
                            }
                            if (arrayList3.size() == 2 && WalletEngine2.isValidRecipientAddress(str4)) {
                                try {
                                    l4 = Long.valueOf(Long.parseLong(s10.getQueryParameter("amount")));
                                } catch (Throwable unused) {
                                    l4 = null;
                                }
                                String queryParameter3 = s10.getQueryParameter("text");
                                if (TextUtils.isEmpty(queryParameter3)) {
                                    queryParameter3 = s10.getQueryParameter("comment");
                                }
                                String r10 = r(queryParameter3);
                                boolean booleanQueryParameter = s10.getBooleanQueryParameter("encrypted", false);
                                try {
                                    org.telegram.ui.Wallet.r9 r9Var = new org.telegram.ui.Wallet.r9(str4);
                                    if (l4 != null && l4.longValue() > 0) {
                                        r9Var.f35145s = l4.longValue();
                                    }
                                    if (!TextUtils.isEmpty(r10)) {
                                        r9Var.f35132g0 = r10;
                                        r9Var.f35133h0 = booleanQueryParameter;
                                    }
                                    r9Var.f35131f0 = true;
                                    u(r9Var, false);
                                    return true;
                                } catch (Throwable th2) {
                                    org.telegram.messenger.f8.g(th2, true);
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                } else if ("tc".equalsIgnoreCase(scheme)) {
                    return n(uri);
                }
            } else {
                String host = uri2.getHost();
                if (host != null) {
                    Matcher matcher = LaunchActivity.D1.matcher(host.toLowerCase());
                    boolean find = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || find) {
                        if (find) {
                            StringBuilder sb2 = new StringBuilder("https://t.me/");
                            sb2.append(matcher.group(1));
                            String str8 = "";
                            if (TextUtils.isEmpty(uri2.getPath())) {
                                path = "";
                            } else {
                                path = uri2.getPath();
                            }
                            sb2.append(path);
                            if (!TextUtils.isEmpty(uri2.getQuery())) {
                                str8 = "?" + uri2.getQuery();
                            }
                            sb2.append(str8);
                            uri2 = Uri.parse(sb2.toString());
                        }
                        String path2 = uri2.getPath();
                        if (path2 != null && path2.length() > 1) {
                            String substring = path2.substring(1);
                            List<String> pathSegments4 = uri2.getPathSegments();
                            if (pathSegments4 != null && !pathSegments4.isEmpty()) {
                                String str9 = pathSegments4.get(0);
                                if (pathSegments4.size() > 1) {
                                    str = pathSegments4.get(1);
                                } else {
                                    str = null;
                                }
                                if ("sendgrams".equalsIgnoreCase(str9)) {
                                    return l(uri2);
                                }
                                if ("getpremium".equalsIgnoreCase(str9)) {
                                    String queryParameter4 = uri2.getQueryParameter("ref");
                                    if (queryParameter4 != null) {
                                        String lowerCase = queryParameter4.toLowerCase(Locale.ROOT);
                                        if (f42099k.matcher(lowerCase).matches()) {
                                            str3 = sc.e.h("tme_getpremium_", lowerCase);
                                            u(new PremiumPreviewFragment(0, str3), false);
                                            return true;
                                        }
                                    }
                                    str3 = "tme_getpremium";
                                    u(new PremiumPreviewFragment(0, str3), false);
                                    return true;
                                } else if ("$".equalsIgnoreCase(str9)) {
                                    return i(substring.substring(1));
                                } else {
                                    if ("invoice".equalsIgnoreCase(str9)) {
                                        return i(str);
                                    }
                                    if ("addstyle".equalsIgnoreCase(str9)) {
                                        return h(str);
                                    }
                                    if ("oauth".equalsIgnoreCase(str9)) {
                                        return k(uri2, uri2.getQueryParameter("startapp"));
                                    }
                                    if ("newbot".equalsIgnoreCase(str9)) {
                                        if (pathSegments4.size() >= 2) {
                                            if (pathSegments4.size() >= 3) {
                                                str2 = pathSegments4.get(2);
                                            } else {
                                                str2 = null;
                                            }
                                            j(str, str2, uri2.getQueryParameter("name"));
                                            return true;
                                        }
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TL_aicompose.getTone gettone = new TL_aicompose.getTone();
        TL_aicompose.inputAiComposeToneSlug inputaicomposetoneslug = new TL_aicompose.inputAiComposeToneSlug();
        inputaicomposetoneslug.slug = str;
        gettone.tone = inputaicomposetoneslug;
        o();
        ConnectionsManager.getInstance(this.f42101b).sendRequestTyped(gettone, new a3.b(1), new z4(this, 14));
        return true;
    }

    public final boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o();
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
        tL_inputInvoiceSlug.slug = str;
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
        this.h = ConnectionsManager.getInstance(this.f42101b).sendRequest(tL_payments_getPaymentForm, new aa((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
        return true;
    }

    public final void j(String str, String str2, String str3) {
        TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot = new TLRPC.TL_requestPeerTypeCreateBot();
        tL_requestPeerTypeCreateBot.bot_managed = true;
        if (!TextUtils.isEmpty(str3)) {
            tL_requestPeerTypeCreateBot.flags |= 2;
            tL_requestPeerTypeCreateBot.suggested_name = str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            tL_requestPeerTypeCreateBot.flags |= 4;
            tL_requestPeerTypeCreateBot.suggested_username = str2;
        }
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null && T.getContext() != null) {
            o();
            TLRPC.User[] userArr = {null};
            org.telegram.messenger.vp.r1(this.f42101b).c2().a(str, null, new w(this, userArr, new w50(this, T, userArr, tL_requestPeerTypeCreateBot, 4), 10));
        }
    }

    public final boolean k(Uri uri, String str) {
        if (!this.d) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o();
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        ConnectionsManager.getInstance(this.f42101b).sendRequestTyped(tL_messages_requestUrlAuth, new a3.b(1), new ih.s(12, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean l(Uri uri) {
        Uri uri2;
        long j10;
        int i10 = this.f42101b;
        if (!((org.telegram.messenger.j0) org.telegram.messenger.vp.r1(i10).f18957y7.f17841j0.f11587b).f16204c) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("startapp");
        if (queryParameter != null && queryParameter.startsWith("tonconnect-")) {
            String replace = queryParameter.substring(11).replace("--", "%").replace("__", "=").replace("-", "&").replace("%5F", "_").replace("%2D", "-").replace("%2E", ".");
            uri2 = Uri.parse("tc://connect?" + replace);
        } else {
            uri2 = null;
        }
        if (uri2 != null) {
            n(uri2);
            return true;
        }
        String queryParameter2 = uri.getQueryParameter("to");
        String queryParameter3 = uri.getQueryParameter("amount");
        String queryParameter4 = uri.getQueryParameter("text");
        if (TextUtils.isEmpty(queryParameter4)) {
            queryParameter4 = uri.getQueryParameter("comment");
        }
        String r10 = r(queryParameter4);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("encrypted", false);
        if (queryParameter3 != null) {
            if (!TextUtils.isEmpty(queryParameter2) && queryParameter3.matches("[0-9]+(?:\\.[0-9]+)?")) {
                try {
                    j10 = new BigDecimal(queryParameter3).movePointRight(9).longValueExact();
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            return true;
        }
        j10 = 0;
        long j11 = j10;
        if (TextUtils.isEmpty(queryParameter2)) {
            u(new org.telegram.ui.Wallet.b6(), false);
            return true;
        }
        if (!queryParameter2.startsWith("@") && !queryParameter2.matches("[a-zA-Z0-9_]{1,32}")) {
            if (WalletEngine2.isValidRecipientAddress(queryParameter2)) {
                org.telegram.ui.Wallet.r9 r9Var = new org.telegram.ui.Wallet.r9(queryParameter2);
                r9Var.f35145s = j11;
                r9Var.f35132g0 = r10;
                r9Var.f35133h0 = booleanQueryParameter;
                r9Var.f35131f0 = true;
                u(r9Var, false);
                return true;
            }
        } else {
            if (queryParameter2.startsWith("@")) {
                queryParameter2 = queryParameter2.substring(1);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = queryParameter2;
                o();
                this.h = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new org.telegram.ui.Components.s70(this, j11, r10, booleanQueryParameter));
                return true;
            }
        }
        return true;
    }

    public final boolean m(java.util.List r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ua0.m(java.util.List):boolean");
    }

    public final boolean n(android.net.Uri r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ua0.n(android.net.Uri):boolean");
    }

    public final void o() {
        if (!this.f42103f && !this.f42104g) {
            gf.e eVar = this.f42102c;
            if (eVar == null) {
                if (this.e == null) {
                    this.e = new org.telegram.ui.ActionBar.x1(3, this.f42100a, null);
                }
                this.e.setOnCancelListener(new kg(this, 3));
                this.e.r(300L);
            } else {
                eVar.f7485b = new pa0(this, 0);
                eVar.d();
            }
            this.f42103f = true;
        }
    }

    public final void t(org.telegram.ui.ActionBar.k2 k2Var) {
        u(k2Var, false);
    }

    public final void u(org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        LaunchActivity launchActivity = this.f42100a;
        launchActivity.u0(k2Var, z10, false);
        if (org.telegram.messenger.i0.Q1()) {
            launchActivity.f33377q0.W(true, true);
            launchActivity.f33381s0.W(true, true);
        }
    }

    public final void v(String str, int i10, String str2, String str3) {
        if (!this.f42106j) {
            LaunchActivity launchActivity = this.f42100a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                tonconnectgetpending.dapp_client_id = str;
                this.h = ConnectionsManager.getInstance(this.f42101b).sendRequestTyped(tonconnectgetpending, new a3.b(1), new j70(this, str, str2, str3, i10));
                return;
            }
        }
        c();
    }

    public final void w(String str) {
        LaunchActivity launchActivity = this.f42100a;
        if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && !"none".equals(str)) {
            if ("back".equals(str)) {
                if (this.d) {
                    launchActivity.moveTaskToBack(true);
                    return;
                }
                return;
            }
            gf.f.t(launchActivity, str);
        }
    }

    public final void x(String str) {
        org.telegram.messenger.i0.j3(this.f42100a.M(), str);
    }
}
