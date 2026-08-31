package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class xb0 {
    public final LaunchActivity f43021a;
    public final int f43022b;
    public final af.f f43023c;
    public final boolean d;
    public org.telegram.ui.ActionBar.d2 f43024e;
    public boolean f43025f;
    public boolean f43026g;
    public int h = -1;

    public xb0(LaunchActivity launchActivity, int i10, af.f fVar, boolean z4) {
        this.f43021a = launchActivity;
        this.f43022b = i10;
        this.f43023c = fVar;
        this.d = z4;
    }

    public static org.telegram.ui.Components.qc b() {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return org.telegram.ui.Components.qc.X();
        }
        return org.telegram.ui.Components.qc.a0(U);
    }

    public static boolean l(java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xb0.l(java.lang.String):boolean");
    }

    public final void a() {
        if (this.f43026g) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.f43024e;
        if (d2Var != null) {
            d2Var.dismiss();
        }
        af.f fVar = this.f43023c;
        if (fVar != null) {
            fVar.b();
        }
        this.f43026g = true;
    }

    public final org.telegram.ui.ActionBar.f5 c() {
        return this.f43021a.O();
    }

    public final UserConfig d() {
        return UserConfig.getInstance(this.f43022b);
    }

    public final boolean e(Uri uri) {
        String str;
        String path;
        String str2;
        boolean z4;
        String scheme;
        String schemeSpecificPart;
        if (uri != null) {
            String scheme2 = uri.getScheme();
            boolean equalsIgnoreCase = "tonsite".equalsIgnoreCase(scheme2);
            LaunchActivity launchActivity = this.f43021a;
            if (equalsIgnoreCase) {
                af.g.p(launchActivity, uri, true, true);
                return true;
            }
            String str3 = null;
            if (!"http".equalsIgnoreCase(scheme2) && !"https".equalsIgnoreCase(scheme2)) {
                if ("tg".equalsIgnoreCase(scheme2)) {
                    if (uri.isOpaque() && (scheme = uri.getScheme()) != null && uri.getAuthority() == null && (schemeSpecificPart = uri.getSchemeSpecificPart()) != null) {
                        uri = Uri.parse(scheme + "://" + schemeSpecificPart);
                    }
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments != null) {
                        ArrayList arrayList = new ArrayList(pathSegments);
                        String authority = uri.getAuthority();
                        if (!TextUtils.isEmpty(authority)) {
                            arrayList.add(0, authority);
                        }
                        if (!arrayList.isEmpty()) {
                            String str4 = (String) arrayList.get(0);
                            if (arrayList.size() > 1) {
                                str2 = (String) arrayList.get(1);
                            } else {
                                str2 = null;
                            }
                            if ("newbot".equalsIgnoreCase(str4)) {
                                h(uri.getQueryParameter("manager"), uri.getQueryParameter("username"), uri.getQueryParameter("name"));
                                return true;
                            } else if ("resolve".equalsIgnoreCase(str4)) {
                                List<String> pathSegments2 = uri.getPathSegments();
                                if (pathSegments2 != null) {
                                    ArrayList arrayList2 = new ArrayList(pathSegments2);
                                    String authority2 = uri.getAuthority();
                                    if (!TextUtils.isEmpty(authority2)) {
                                        arrayList2.add(0, authority2);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        arrayList2.remove(0);
                                        String queryParameter = uri.getQueryParameter("domain");
                                        String queryParameter2 = uri.getQueryParameter("startapp");
                                        if ("oauth".equalsIgnoreCase(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                                            return i(uri, queryParameter2);
                                        }
                                    }
                                }
                            } else if ("invoice".equalsIgnoreCase(str4)) {
                                return g(uri.getQueryParameter("slug"));
                            } else {
                                if ("oauth".equalsIgnoreCase(str4)) {
                                    return i(uri, uri.getQueryParameter("token"));
                                }
                                if ("settings".equalsIgnoreCase(str4)) {
                                    return j(arrayList.subList(1, arrayList.size()));
                                }
                                if ("chats".equalsIgnoreCase(str4)) {
                                    "search".equalsIgnoreCase(str2);
                                    "edit".equalsIgnoreCase(str2);
                                    "emoji-status".equalsIgnoreCase(str2);
                                }
                                if ("new".equalsIgnoreCase(str4)) {
                                    if ("group".equalsIgnoreCase(str2)) {
                                        n(new z60(new Bundle()), false);
                                        return true;
                                    } else if ("contact".equalsIgnoreCase(str2)) {
                                        new uj0(launchActivity, LaunchActivity.U()).show();
                                        return true;
                                    } else if ("channel".equalsIgnoreCase(str2)) {
                                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                                            n(new nd(android.support.v4.media.a.h(0, "step")), false);
                                            return true;
                                        }
                                        n(new i(0), false);
                                        globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                                        return true;
                                    } else {
                                        n(new ContactsActivity(android.support.v4.media.a.i("destroyAfterSelect", true)), false);
                                        return true;
                                    }
                                } else if ("post".equalsIgnoreCase(str4)) {
                                    ?? r15 = "video".equalsIgnoreCase(str2);
                                    if ("live".equalsIgnoreCase(str2)) {
                                        r15 = -1;
                                    }
                                    qh.ca E = qh.ca.E(launchActivity, this.f43022b);
                                    if (E.L1 != r15) {
                                        E.L1 = r15;
                                        ?? r22 = E.N0;
                                        if (r22 != 0) {
                                            r22.a(r15);
                                        }
                                        if (r15 == 1) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        E.i0(z4, true);
                                        qh.u uVar = E.F0;
                                        if (uVar != null) {
                                            uVar.a(false, true);
                                        }
                                        E.m0(false);
                                    }
                                    E.R(null);
                                    return true;
                                } else if ("contacts".equalsIgnoreCase(str4)) {
                                    if ("new".equalsIgnoreCase(str2)) {
                                        new uj0(launchActivity, LaunchActivity.U()).show();
                                        return true;
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("needPhonebook", true);
                                    bundle.putBoolean("needFinishFragment", true);
                                    n(new ContactsActivity(bundle), false);
                                    "search".equalsIgnoreCase(str2);
                                    "sort".equalsIgnoreCase(str2);
                                    if ("invite".equalsIgnoreCase(str2)) {
                                        o("phonebookRow");
                                        return true;
                                    }
                                    return true;
                                } else if ("addstyle".equalsIgnoreCase(str4)) {
                                    return f(uri.getQueryParameter("slug"));
                                }
                            }
                        }
                    }
                }
            } else {
                String host = uri.getHost();
                if (host != null) {
                    Matcher matcher = LaunchActivity.f34134y1.matcher(host.toLowerCase());
                    boolean find = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || find) {
                        if (find) {
                            StringBuilder sb = new StringBuilder("https://t.me/");
                            sb.append(matcher.group(1));
                            String str5 = "";
                            if (TextUtils.isEmpty(uri.getPath())) {
                                path = "";
                            } else {
                                path = uri.getPath();
                            }
                            sb.append(path);
                            if (!TextUtils.isEmpty(uri.getQuery())) {
                                str5 = "?" + uri.getQuery();
                            }
                            sb.append(str5);
                            uri = Uri.parse(sb.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null && path2.length() > 1) {
                            String substring = path2.substring(1);
                            List<String> pathSegments3 = uri.getPathSegments();
                            if (pathSegments3 != null && !pathSegments3.isEmpty()) {
                                String str6 = pathSegments3.get(0);
                                if (pathSegments3.size() > 1) {
                                    str = pathSegments3.get(1);
                                } else {
                                    str = null;
                                }
                                if ("$".equalsIgnoreCase(str6)) {
                                    return g(substring.substring(1));
                                }
                                if ("invoice".equalsIgnoreCase(str6)) {
                                    return g(str);
                                }
                                if ("addstyle".equalsIgnoreCase(str6)) {
                                    return f(str);
                                }
                                if ("oauth".equalsIgnoreCase(str6)) {
                                    return i(uri, uri.getQueryParameter("startapp"));
                                }
                                if ("newbot".equalsIgnoreCase(str6)) {
                                    if (pathSegments3.size() >= 2) {
                                        if (pathSegments3.size() >= 3) {
                                            str3 = pathSegments3.get(2);
                                        }
                                        h(str, str3, uri.getQueryParameter("name"));
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
        return false;
    }

    public final boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TL_aicompose.getTone gettone = new TL_aicompose.getTone();
        TL_aicompose.inputAiComposeToneSlug inputaicomposetoneslug = new TL_aicompose.inputAiComposeToneSlug();
        inputaicomposetoneslug.slug = str;
        gettone.tone = inputaicomposetoneslug;
        k();
        ConnectionsManager.getInstance(this.f43022b).sendRequestTyped(gettone, new Object(), new d5(this, 14));
        return true;
    }

    public final boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        k();
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
        tL_inputInvoiceSlug.slug = str;
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
        this.h = ConnectionsManager.getInstance(this.f43022b).sendRequest(tL_payments_getPaymentForm, new ba((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
        return true;
    }

    public final void h(String str, String str2, String str3) {
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
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null && U.getContext() != null) {
            k();
            TLRPC.User[] userArr = {null};
            MessagesController.getInstance(this.f43022b).getUserNameResolver().resolve(str, new jh(this, userArr, new b30(this, U, userArr, tL_requestPeerTypeCreateBot, 6), 3));
        }
    }

    public final boolean i(Uri uri, String str) {
        if (!this.d) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        k();
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        ConnectionsManager.getInstance(this.f43022b).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new eh.w(21, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean j(java.util.List r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xb0.j(java.util.List):boolean");
    }

    public final void k() {
        if (!this.f43025f && !this.f43026g) {
            af.f fVar = this.f43023c;
            if (fVar == null) {
                if (this.f43024e == null) {
                    this.f43024e = new org.telegram.ui.ActionBar.d2(this.f43021a, 3, null);
                }
                this.f43024e.setOnCancelListener(new ig(this, 3));
                this.f43024e.q(300L);
            } else {
                fVar.f180b = new qb0(this, 0);
                fVar.d();
            }
            this.f43025f = true;
        }
    }

    public final void m(org.telegram.ui.ActionBar.p2 p2Var) {
        n(p2Var, false);
    }

    public final void n(org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        LaunchActivity launchActivity = this.f43021a;
        launchActivity.q0(p2Var, z4, false);
        if (AndroidUtilities.isTablet()) {
            launchActivity.f34160n0.U(true, true);
            launchActivity.f34164p0.U(true, true);
        }
    }

    public final void o(String str) {
        AndroidUtilities.scrollToFragmentRow(this.f43021a.O(), str);
    }
}
