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
public final class s90 {
    public static final Pattern f51973k = Pattern.compile("^[a-z0-9_]{1,32}$");
    public final LaunchActivity f51974a;
    public final int f51975b;
    public final vf.b f51976c;
    public final boolean d;
    public org.telegram.ui.ActionBar.t1 f51977e;
    public boolean f51978f;
    public boolean f51979g;
    public int h = -1;
    public ai.i1 f51980i;
    public boolean f51981j;

    public s90(LaunchActivity launchActivity, int i7, vf.b bVar, boolean z10) {
        this.f51974a = launchActivity;
        this.f51975b = i7;
        this.f51976c = bVar;
        this.d = z10;
    }

    public static org.telegram.ui.Components.lc d() {
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T == null) {
            return org.telegram.ui.Components.lc.Y();
        }
        return org.telegram.ui.Components.lc.b0(T);
    }

    public static boolean p(java.lang.String r2) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s90.p(java.lang.String):boolean");
    }

    public static boolean q(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s90.q(java.lang.String):boolean");
    }

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i7 = 960;
        if (bytes.length <= 960) {
            return str;
        }
        while ((bytes[i7] & 192) == 128) {
            i7--;
        }
        return new String(bytes, 0, i7, StandardCharsets.UTF_8);
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
        if (!this.f51981j) {
            LaunchActivity launchActivity = this.f51974a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && LaunchActivity.G1 && !org.telegram.messenger.bz.f23236x && !org.telegram.messenger.bz.C && org.telegram.messenger.j10.f24798t0 == this.f51975b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        this.f51981j = true;
        ai.i1 i1Var = this.f51980i;
        if (i1Var != null) {
            org.telegram.messenger.g0.r(i1Var);
        }
        if (this.h >= 0) {
            ConnectionsManager.getInstance(this.f51975b).cancelRequest(this.h, true);
            this.h = -1;
        }
    }

    public final void c() {
        if (this.f51979g) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = this.f51977e;
        if (t1Var != null) {
            t1Var.dismiss();
        }
        vf.b bVar = this.f51976c;
        if (bVar != null) {
            bVar.b();
        }
        this.f51979g = true;
    }

    public final org.telegram.ui.ActionBar.r4 e() {
        return this.f51974a.M();
    }

    public final org.telegram.messenger.j10 f() {
        return org.telegram.messenger.j10.i(this.f51975b);
    }

    public final boolean g(Uri uri) {
        String str;
        String str2;
        String str3;
        String path;
        Uri s5;
        List<String> pathSegments;
        int i7;
        String str4;
        Long l10;
        String str5;
        boolean z10;
        boolean z11;
        Uri uri2 = uri;
        if (uri2 != null) {
            org.telegram.messenger.a8.b("link manager handle " + uri2);
            String scheme = uri2.getScheme();
            boolean equalsIgnoreCase = "tonsite".equalsIgnoreCase(scheme);
            LaunchActivity launchActivity = this.f51974a;
            if (equalsIgnoreCase) {
                vf.c.q(launchActivity, uri2, true, true);
                return true;
            }
            boolean equalsIgnoreCase2 = "http".equalsIgnoreCase(scheme);
            int i10 = this.f51975b;
            if (!equalsIgnoreCase2 && !"https".equalsIgnoreCase(scheme)) {
                if ("tg".equalsIgnoreCase(scheme)) {
                    Uri s9 = s(Uri.parse(uri2.toString().replaceFirst("(?i)^tg:(//)?sendgrams&", "tg://sendgrams?")));
                    List<String> pathSegments2 = s9.getPathSegments();
                    if (pathSegments2 != null) {
                        ArrayList arrayList = new ArrayList(pathSegments2);
                        String authority = s9.getAuthority();
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
                                return l(s9);
                            }
                            if ("newbot".equalsIgnoreCase(str6)) {
                                j(s9.getQueryParameter("manager"), s9.getQueryParameter("username"), s9.getQueryParameter("name"));
                                return true;
                            }
                            if ("botinvite".equalsIgnoreCase(str6)) {
                                String queryParameter = s9.getQueryParameter("username");
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    o();
                                    org.telegram.messenger.mp.u1(i10).f2().a(queryParameter, null, new r3(this, 10));
                                    return true;
                                }
                            } else {
                                if ("resolve".equalsIgnoreCase(str6)) {
                                    List<String> pathSegments3 = s9.getPathSegments();
                                    if (pathSegments3 != null) {
                                        ArrayList arrayList2 = new ArrayList(pathSegments3);
                                        String authority2 = s9.getAuthority();
                                        if (!TextUtils.isEmpty(authority2)) {
                                            i7 = 0;
                                            arrayList2.add(0, authority2);
                                        } else {
                                            i7 = 0;
                                        }
                                        if (!arrayList2.isEmpty()) {
                                            arrayList2.remove(i7);
                                            String queryParameter2 = s9.getQueryParameter("domain");
                                            String queryParameter3 = s9.getQueryParameter("startapp");
                                            if ("sendgrams".equalsIgnoreCase(queryParameter2)) {
                                                return l(s9);
                                            }
                                            if ("oauth".equalsIgnoreCase(queryParameter2) && !TextUtils.isEmpty(queryParameter3)) {
                                                return k(s9, queryParameter3);
                                            }
                                        }
                                        return i7;
                                    }
                                } else if ("invoice".equalsIgnoreCase(str6)) {
                                    return i(s9.getQueryParameter("slug"));
                                } else {
                                    if ("oauth".equalsIgnoreCase(str6)) {
                                        return k(s9, s9.getQueryParameter("token"));
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
                                            u(new z40(new Bundle()), false);
                                            return true;
                                        } else if ("contact".equalsIgnoreCase(str5)) {
                                            new fh0(launchActivity, LaunchActivity.T()).show();
                                            return true;
                                        } else if ("channel".equalsIgnoreCase(str5)) {
                                            SharedPreferences g12 = org.telegram.messenger.mp.g1();
                                            boolean z12 = org.telegram.messenger.s2.f26749a;
                                            u(new g(0), false);
                                            g12.edit().putBoolean("channel_intro", true).commit();
                                            return true;
                                        } else {
                                            u(new ContactsActivity(a8.p0.k("destroyAfterSelect", true)), false);
                                            return true;
                                        }
                                    } else if ("post".equalsIgnoreCase(str6)) {
                                        ?? r02 = "video".equalsIgnoreCase(str5);
                                        if ("live".equalsIgnoreCase(str5)) {
                                            r02 = -1;
                                        }
                                        hi.sa D = hi.sa.D(launchActivity, i10);
                                        if (D.P1 == r02) {
                                            z10 = true;
                                        } else {
                                            D.P1 = r02;
                                            ?? r32 = D.R0;
                                            if (r32 != 0) {
                                                r32.a(r02);
                                            }
                                            z10 = true;
                                            if (r02 == 1) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            D.h0(z11, true);
                                            hi.a0 a0Var = D.J0;
                                            if (a0Var != null) {
                                                a0Var.a(false, true);
                                            }
                                            D.l0(false);
                                        }
                                        D.Q(null);
                                        return z10;
                                    } else if ("contacts".equalsIgnoreCase(str6)) {
                                        if ("new".equalsIgnoreCase(str5)) {
                                            new fh0(launchActivity, LaunchActivity.T()).show();
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
                                    } else if ("addstyle".equalsIgnoreCase(str6)) {
                                        return h(s9.getQueryParameter("slug"));
                                    }
                                }
                                return false;
                            }
                            return true;
                        }
                    }
                } else {
                    if ("ton".equalsIgnoreCase(scheme)) {
                        if (((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i10).A7.f26187p0.f14027b).f24364c && (pathSegments = (s5 = s(uri2)).getPathSegments()) != null) {
                            ArrayList arrayList3 = new ArrayList(pathSegments);
                            String authority3 = s5.getAuthority();
                            if (!TextUtils.isEmpty(authority3)) {
                                i7 = 0;
                                arrayList3.add(0, authority3);
                            } else {
                                i7 = 0;
                            }
                            if (!arrayList3.isEmpty()) {
                                String str7 = (String) arrayList3.get(i7);
                                if (arrayList3.size() > 1) {
                                    str4 = (String) arrayList3.get(1);
                                } else {
                                    str4 = null;
                                }
                                if ("transfer".equalsIgnoreCase(str7)) {
                                    if (arrayList3.size() == 2 && WalletEngine2.isValidRecipientAddress(str4)) {
                                        try {
                                            l10 = Long.valueOf(Long.parseLong(s5.getQueryParameter("amount")));
                                        } catch (Throwable unused) {
                                            l10 = null;
                                        }
                                        String queryParameter4 = s5.getQueryParameter("text");
                                        if (TextUtils.isEmpty(queryParameter4)) {
                                            queryParameter4 = s5.getQueryParameter("comment");
                                        }
                                        String r10 = r(queryParameter4);
                                        boolean booleanQueryParameter = s5.getBooleanQueryParameter("encrypted", false);
                                        try {
                                            org.telegram.ui.Wallet.da daVar = new org.telegram.ui.Wallet.da(str4);
                                            if (l10 != null && l10.longValue() > 0) {
                                                daVar.f44114s = l10.longValue();
                                            }
                                            if (!TextUtils.isEmpty(r10)) {
                                                daVar.f44102h0 = r10;
                                                daVar.f44103i0 = booleanQueryParameter;
                                            }
                                            daVar.f44101g0 = true;
                                            u(daVar, false);
                                            return true;
                                        } catch (Throwable th2) {
                                            org.telegram.messenger.a8.g(th2, true);
                                        }
                                    }
                                    return true;
                                }
                                return false;
                            }
                            return i7;
                        }
                    } else if ("tc".equalsIgnoreCase(scheme)) {
                        return n(uri);
                    }
                    return false;
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
                                    String queryParameter5 = uri2.getQueryParameter("ref");
                                    if (queryParameter5 != null) {
                                        String lowerCase = queryParameter5.toLowerCase(Locale.ROOT);
                                        if (f51973k.matcher(lowerCase).matches()) {
                                            str3 = p5.c.k("tme_getpremium_", lowerCase);
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
                                    } else if ("botinvite".equalsIgnoreCase(str9)) {
                                        if (pathSegments4.size() < 2 || TextUtils.isEmpty(str)) {
                                            return true;
                                        }
                                        o();
                                        org.telegram.messenger.mp.u1(i10).f2().a(str, null, new r3(this, 10));
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
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
        ConnectionsManager.getInstance(this.f51975b).sendRequestTyped(gettone, new d3.b(1), new a5(this, 14));
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
        this.h = ConnectionsManager.getInstance(this.f51975b).sendRequest(tL_payments_getPaymentForm, new z9((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
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
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null && T.getContext() != null) {
            o();
            TLRPC.User[] userArr = {null};
            org.telegram.messenger.mp.u1(this.f51975b).f2().a(str, null, new x(this, userArr, new org.telegram.ui.Components.q20(this, T, userArr, tL_requestPeerTypeCreateBot, 21), 10));
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
        ConnectionsManager.getInstance(this.f51975b).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new bi.p6(23, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean l(Uri uri) {
        Uri uri2;
        long j3;
        int i7 = this.f51975b;
        if (!((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i7).A7.f26187p0.f14027b).f24364c) {
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
                    j3 = new BigDecimal(queryParameter3).movePointRight(9).longValueExact();
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            return true;
        }
        j3 = 0;
        long j10 = j3;
        if (TextUtils.isEmpty(queryParameter2)) {
            u(new org.telegram.ui.Wallet.n6(), false);
            return true;
        }
        if (!queryParameter2.startsWith("@") && !queryParameter2.matches("[a-zA-Z0-9_]{1,32}")) {
            if (WalletEngine2.isValidRecipientAddress(queryParameter2)) {
                org.telegram.ui.Wallet.da daVar = new org.telegram.ui.Wallet.da(queryParameter2);
                daVar.f44114s = j10;
                daVar.f44102h0 = r10;
                daVar.f44103i0 = booleanQueryParameter;
                daVar.f44101g0 = true;
                u(daVar, false);
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
                this.h = ConnectionsManager.getInstance(i7).sendRequest(tL_contacts_resolveUsername, new di.l(this, j10, r10, booleanQueryParameter));
                return true;
            }
        }
        return true;
    }

    public final boolean m(java.util.List r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s90.m(java.util.List):boolean");
    }

    public final boolean n(android.net.Uri r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s90.n(android.net.Uri):boolean");
    }

    public final void o() {
        if (!this.f51978f && !this.f51979g) {
            vf.b bVar = this.f51976c;
            if (bVar == null) {
                if (this.f51977e == null) {
                    this.f51977e = new org.telegram.ui.ActionBar.t1(3, this.f51974a, null);
                }
                this.f51977e.setOnCancelListener(new wf(this, 3));
                this.f51977e.r(300L);
            } else {
                bVar.f59413b = new o90(this, 0);
                bVar.d();
            }
            this.f51978f = true;
        }
    }

    public final void t(org.telegram.ui.ActionBar.g2 g2Var) {
        u(g2Var, false);
    }

    public final void u(org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        LaunchActivity launchActivity = this.f51974a;
        launchActivity.u0(g2Var, z10, false);
        if (org.telegram.messenger.g0.Q1()) {
            launchActivity.f43135p0.X(true, true);
            launchActivity.f43139r0.X(true, true);
        }
    }

    public final void v(String str, int i7, String str2, String str3) {
        if (!this.f51981j) {
            LaunchActivity launchActivity = this.f51974a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                tonconnectgetpending.dapp_client_id = str;
                this.h = ConnectionsManager.getInstance(this.f51975b).sendRequestTyped(tonconnectgetpending, new d3.b(1), new n60(this, str, str2, str3, i7));
                return;
            }
        }
        c();
    }

    public final void w(String str) {
        LaunchActivity launchActivity = this.f51974a;
        if (!launchActivity.isFinishing() && !launchActivity.isDestroyed() && !"none".equals(str)) {
            if ("back".equals(str)) {
                if (this.d) {
                    launchActivity.moveTaskToBack(true);
                    return;
                }
                return;
            }
            vf.c.v(launchActivity, str, false);
        }
    }

    public final void x(String str) {
        org.telegram.messenger.g0.j3(this.f51974a.M(), str);
    }
}
