package org.telegram.ui.web;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.u3;
import di.c4;
import di.k4;
import di.x7;
import hi.c5;
import hi.m3;
import hi.n4;
import j$.util.Objects;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ag0;
import org.telegram.ui.fc1;
import org.telegram.ui.u9;
public abstract class a1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, p6 {
    public static boolean Q0 = true;
    public static int R0;
    public static HashMap S0;
    public int A0;
    public boolean B0;
    public int C0;
    public Runnable D0;
    public int E;
    public boolean E0;
    public String F;
    public c5 F0;
    public String G;
    public String G0;
    public int H;
    public final Rect H0;
    public int I;
    public int I0;
    public String J;
    public x7 J0;
    public String K;
    public final t K0;
    public String L;
    public int L0;
    public int M;
    public int M0;
    public boolean N;
    public long N0;
    public boolean O;
    public final int O0;
    public long P;
    public Utilities.Callback4 P0;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public TLRPC.User U;
    public ny0 V;
    public Activity W;
    public x0 f45151a;
    public boolean f45152a0;
    public String f45153b;
    public String f45154b0;
    public g0 f45155c;
    public org.telegram.ui.ActionBar.e2 f45156c0;
    public z0 d;
    public int f45157d0;
    public final u6 e;
    public long f45158e0;
    public final TextView f45159f;
    public long f45160f0;
    public u9 f45161g0;
    public boolean h;
    public boolean f45162h0;
    public String f45163i0;
    public hi.y f45164j0;
    public hi.b1 f45165k0;
    public hi.q0 f45166l0;
    public hi.w1 m0;
    public final org.telegram.ui.Components.voip.h f45167n;
    public hi.w1 f45168n0;
    public final boolean f45169o0;
    public int f45170p0;
    public boolean f45171q0;
    public SvgHelper.SvgDrawable f45172r;
    public BotWebViewContainer$BotWebViewProxy f45173r0;
    public final k4 f45174s;
    public long f45175s0;
    public boolean f45176t0;
    public BotWebViewContainer$WebViewProxy f45177u0;
    public boolean v;
    public x0 f45178v0;
    public q0.a f45179w;
    public int f45180w0;
    public ValueCallback f45181x;
    public boolean f45182x0;
    public int f45183y;
    public boolean f45184y0;
    public float f45185z0;

    public a1(int i10, Context context, u6 u6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f45167n = hVar;
        int i11 = y6.Oh;
        this.f45183y = j(i11);
        int i12 = y6.Sh;
        this.E = j(i12);
        this.F = "";
        this.H = j(i11);
        this.I = j(i12);
        this.J = "";
        this.K = "";
        this.M = UserConfig.selectedAccount;
        this.A0 = -1;
        this.H0 = new Rect(0, 0, 0, 0);
        this.I0 = 0;
        this.K0 = new t(this, 1);
        this.L0 = -1;
        this.M0 = 0;
        int i13 = R0;
        R0 = i13 + 1;
        this.O0 = i13;
        this.f45169o0 = z10;
        this.e = u6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        hVar.f33821k = false;
        hVar.b(i10, 153);
        k4 k4Var = new k4(this, context);
        this.f45174s = k4Var;
        int j10 = j(y6.Ki);
        this.f45170p0 = j10;
        k4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        k4Var.getImageReceiver().setAspectFit(true);
        addView(k4Var, gb1.i(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f45159f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        f7.V(textView, y6.f23746y6, u6Var);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, gb1.i(-1, -2, 17));
        setFocusable(false);
    }

    public static JSONObject A(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject B(String str, Object obj, String str2, Object obj2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static WebResourceResponse M(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(qf.d.u(Uri.parse(str2), "https", null, S(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static String S(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            FileLog.e(e);
        }
        String[] split = str.split("\\.");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < split.length; i10++) {
            if (i10 > 0) {
                sb2.append("-d");
            }
            sb2.append(split[i10].replaceAll("\\-", "-h"));
        }
        sb2.append(".");
        sb2.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return sb2.toString();
    }

    public static void a(a1 a1Var, String[] strArr, q0.a aVar) {
        a1Var.getClass();
        for (String str : strArr) {
            if (a1Var.getContext().checkSelfPermission(str) != 0) {
                a1Var.V = new ny0(a1Var, aVar, strArr, 7);
                Activity activity = a1Var.W;
                if (activity != null) {
                    activity.requestPermissions(strArr, 4000);
                    return;
                }
                return;
            }
        }
        aVar.accept(Boolean.TRUE);
    }

    public static String b(String str) {
        if (str == null) {
            return str;
        }
        if (p(Uri.parse(str))) {
            String hostAuthority = AndroidUtilities.getHostAuthority(str);
            try {
                hostAuthority = IDN.toASCII(hostAuthority, 1);
            } catch (Exception unused) {
            }
            String S = S(hostAuthority);
            if (S0 == null) {
                S0 = new HashMap();
            }
            S0.put(S, hostAuthority);
            return qf.d.u(Uri.parse(str), "https", null, S, null);
        }
        return str;
    }

    public static String k(String str) {
        if (str != null && !str.isEmpty()) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            int port = parse.getPort();
            if (scheme != null && host != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(scheme);
                sb2.append("://");
                sb2.append(host);
                if (port != -1 && ((!scheme.equalsIgnoreCase("http") || port != 80) && (!scheme.equalsIgnoreCase("https") || port != 443))) {
                    sb2.append(":");
                    sb2.append(port);
                }
                return sb2.toString();
            }
        }
        return null;
    }

    public static boolean p(Uri uri) {
        if ("tonsite".equals(uri.getScheme())) {
            return true;
        }
        String authority = uri.getAuthority();
        if (authority == null && uri.getScheme() == null) {
            authority = Uri.parse("http://" + uri.toString()).getAuthority();
        }
        if (authority != null) {
            if (authority.endsWith(".ton") || authority.endsWith(".adnl")) {
                return true;
            }
            return false;
        }
        return false;
    }

    private void setupFlickerParams(boolean z10) {
        int i10;
        this.v = z10;
        k4 k4Var = this.f45174s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k4Var.getLayoutParams();
        if (z10) {
            i10 = 17;
        } else {
            i10 = 48;
        }
        layoutParams.gravity = i10;
        if (z10) {
            int dp = AndroidUtilities.dp(100.0f);
            layoutParams.height = dp;
            layoutParams.width = dp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        k4Var.requestLayout();
    }

    private void setupWebView(x0 x0Var) {
        W(x0Var, null);
    }

    public static String u(String str) {
        String str2;
        if (S0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority != null) {
            if (hostAuthority.endsWith("." + MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress) && (str2 = (String) S0.get(hostAuthority)) != null) {
                return qf.d.u(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void w(int i10, x0 x0Var, x7 x7Var, String str, JSONObject jSONObject) {
        if (x0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new ag0((Object) x0Var, (Object) x7Var, str, (Object) jSONObject, 28));
    }

    public final boolean C() {
        if (this.f45151a != null && this.R) {
            y("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r55, final di.x7 r56, java.lang.String r57, java.lang.String r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a1.E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, di.x7, java.lang.String, java.lang.String):void");
    }

    public final void F(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f45154b0, str)) {
                this.f45154b0 = null;
            }
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public final void G(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.P > 10000 && z11) {
            return;
        }
        this.P = 0L;
        boolean[] zArr = {false};
        if (qf.d.e(uri, false, zArr) && !zArr[0] && this.f45155c != null) {
            setKeyboardFocusable(false);
        }
        qf.d.q(getContext(), uri, true, z10, false, null, str, false, true, z12);
    }

    public abstract void J(x0 x0Var);

    public final void L() {
        g("preserveWebView");
        this.B0 = true;
        if (this.f45169o0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.f45175s0++;
        }
        x0 x0Var = this.f45151a;
        if (x0Var != null) {
            x0Var.f(null, null);
            this.f45151a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f45173r0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f45140a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f45177u0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f45141a = null;
        }
    }

    public final void N(int i10, x0 x0Var, Object obj, String str, boolean z10) {
        String str2;
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.f45169o0;
        if (z11) {
            this.f45175s0++;
            this.f45176t0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.G0 = str2;
        }
        W(x0Var, obj);
        if (z11) {
            y("visibility_changed", A(Boolean.TRUE, "is_visible"));
        }
    }

    public final void O(int i10, boolean z10) {
        JSONObject jSONObject;
        if (!z10 && i10 == this.I0) {
            return;
        }
        Float valueOf = Float.valueOf(i10 / AndroidUtilities.density);
        try {
            jSONObject = new JSONObject();
            jSONObject.put("left", (Object) 0);
            jSONObject.put("top", valueOf);
            jSONObject.put("right", (Object) 0);
            jSONObject.put("bottom", (Object) 0);
        } catch (Exception unused) {
            jSONObject = null;
        }
        y("content_safe_area_changed", jSONObject);
        this.I0 = i10;
    }

    public final void P(Rect rect, boolean z10) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.H0;
            if (z10 || !rect2.equals(rect)) {
                Float valueOf = Float.valueOf(rect.left / AndroidUtilities.density);
                Float valueOf2 = Float.valueOf(rect.top / AndroidUtilities.density);
                Float valueOf3 = Float.valueOf(rect.right / AndroidUtilities.density);
                Float valueOf4 = Float.valueOf(rect.bottom / AndroidUtilities.density);
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("left", valueOf);
                    jSONObject.put("top", valueOf2);
                    jSONObject.put("right", valueOf3);
                    jSONObject.put("bottom", valueOf4);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                y("safe_area_changed", jSONObject);
                rect2.set(rect);
            }
        }
    }

    public final void Q() {
        try {
            if (this.G != null) {
                E(this.f45173r0, f(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                E(this.f45173r0, f(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void R(x7 x7Var, hi.w1 w1Var, String str) {
        u6 u6Var;
        boolean z10;
        if (w1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(x7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = w1Var.h(optString);
                        if (h.isEmpty()) {
                            x(x7Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        a0 a0Var = new a0(this, x7Var, string, w1Var, optString);
                        r2 U = LaunchActivity.U();
                        if (U != null) {
                            u6Var = U.getResourceProvider();
                        } else {
                            u6Var = null;
                        }
                        boolean z11 = true;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        k3 i10 = vh.i(1, context, u6Var, false);
                        ViewGroup d = vh.d(context, 1);
                        y9 y9Var = new y9(context);
                        ArrayList arrayList = h;
                        TLRPC.User user = MessagesController.getInstance(w1Var.f13345a).getUser(Long.valueOf(w1Var.f13346b));
                        j9 j9Var = new j9((u6) null);
                        j9Var.r(user);
                        y9Var.f(user, j9Var);
                        d.addView(y9Var, gb1.x(80, 80, 49, 0, 21, 0, 13));
                        int i11 = y6.G6;
                        TextView L = gb1.L(context, 20.0f, i11, true, null);
                        vh.k(R.string.BotRestoreStorageTitle, L, 17);
                        d.addView(L, gb1.x(-1, -2, 7, 32, 0, 32, 10));
                        TextView L2 = gb1.L(context, 14.0f, i11, false, null);
                        L2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        L2.setGravity(17);
                        d.addView(L2, gb1.x(-1, -2, 7, 32, 0, 32, 19));
                        i9 i9Var = new i9(context, u6Var);
                        int i12 = -1;
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        i9Var.setBackground(new ar(colorDrawable, y6.W0(context, R.drawable.greydivider, y6.w0(y6.f23316b7, u6Var))));
                        f7.y(i9Var, colorDrawable, y6.f23297a7, u6Var, PorterDuff.Mode.SRC_IN);
                        i9Var.setFixedSize(12);
                        d.addView(i9Var, gb1.x(-1, 12, 7, 0, 0, 0, 0));
                        q4 q4Var = new q4(context, u6Var);
                        q4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        d.addView(q4Var, gb1.x(-1, -2, 7, 0, 0, 0, 0));
                        fi.d dVar = new fi.d(context, u6Var, true);
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            ArrayList arrayList3 = arrayList;
                            hi.v1 v1Var = (hi.v1) arrayList3.get(i13);
                            boolean z12 = z11;
                            if (i13 < arrayList3.size() - 1) {
                                z10 = z12;
                            } else {
                                z10 = false;
                            }
                            hi.u1 u1Var = new hi.u1(v1Var, z10, context);
                            int i14 = y6.f23446i6;
                            a0 a0Var2 = a0Var;
                            org.telegram.ui.Cells.y g02 = y6.g0(y6.w0(i14, u6Var), 2, i12);
                            b7 N = f7.N(i14);
                            u1Var.setBackground(g02);
                            f7.k(u1Var, g02, null, N, u6Var);
                            ViewGroup viewGroup = d;
                            u1Var.setOnClickListener(new c4(strArr, v1Var, arrayList2, dVar, 2));
                            viewGroup.addView(u1Var, gb1.r(-1, 56));
                            arrayList2.add(u1Var);
                            i13++;
                            d = viewGroup;
                            i12 = -1;
                            z11 = z12;
                            i10 = i10;
                            arrayList = arrayList3;
                            a0Var = a0Var2;
                        }
                        a0 a0Var3 = a0Var;
                        k3 k3Var = i10;
                        ViewGroup viewGroup2 = d;
                        dVar.i(LocaleController.getString(R.string.BotRestoreStorageButton), false, z11);
                        if (strArr[0] == null) {
                            z11 = false;
                        }
                        dVar.setEnabled(z11);
                        viewGroup2.addView(dVar, gb1.x(-1, 48, 7, 8, 8, 8, 4));
                        k3Var.customView = viewGroup2;
                        k3Var.fixNavigationBarKey(y6.f23425h5);
                        dVar.setOnClickListener(new c4(zArr, a0Var3, strArr, k3Var, 3));
                        k3Var.setOnDismissListener(new u3(3, zArr, a0Var3));
                        k3Var.show();
                    } catch (Exception e) {
                        x(x7Var, "secure_storage_failed", B("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    x(x7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    x(x7Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void T(String str, boolean z10) {
        boolean z11;
        boolean z12;
        x0 x0Var = this.f45151a;
        if (x0Var != null) {
            boolean z13 = x0Var.E;
        }
        if (x0Var != null && x0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        x0 x0Var2 = this.f45151a;
        if (x0Var2 != null && x0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        I(z11, z12);
        x0 x0Var3 = this.f45151a;
        if (x0Var3 != null) {
            x0Var3.f45440b = true;
        }
        if (this.N) {
            g("setPageLoaded: already loaded");
            return;
        }
        k4 k4Var = this.f45174s;
        if (z10 && x0Var3 != null && k4Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f45151a, property, 1.0f), ObjectAnimator.ofFloat(k4Var, property, 0.0f));
            animatorSet.addListener(new fc1(this, 14));
            animatorSet.start();
        } else {
            if (x0Var3 != null) {
                x0Var3.setAlpha(1.0f);
            }
            if (k4Var != null) {
                k4Var.setAlpha(0.0f);
                k4Var.setVisibility(8);
            }
        }
        this.f45153b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.f45155c.getClass();
    }

    public final void U(x7 x7Var, hi.w1 w1Var, String str, String str2, String str3) {
        if (w1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(x7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            w1Var.n(optString, jSONObject.optString("value"));
                            x(x7Var, str2, A(string, "req_id"));
                        } catch (RuntimeException e) {
                            x(x7Var, str3, B("req_id", string, "error", e.getMessage()));
                        }
                    } catch (Exception unused) {
                        x(x7Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    x(x7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    x(x7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void V() {
        x0 x0Var = this.f45151a;
        if (x0Var != null && this.f45169o0) {
            x0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!a8.v1.a("WEB_MESSAGE_LISTENER")) {
                g("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            x0 x0Var2 = this.f45151a;
            if (!x0Var2.R) {
                b5.a.a(x0Var2, "TelegramWebviewProxyMessage", singleton, new org.telegram.ui.Components.voip.j1(x0Var2, 1));
                this.f45151a.R = true;
            }
            if (a8.v1.a("DOCUMENT_START_SCRIPT")) {
                x0 x0Var3 = this.f45151a;
                if (x0Var3.S == null) {
                    boolean z10 = b5.a.f3646a;
                    if (c5.m.d.b()) {
                        x0Var3.S = new rb.c((ScriptHandlerBoundaryInterface) ve.b.a(ScriptHandlerBoundaryInterface.class, b5.a.c(x0Var3).f6152a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 11);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    public final void W(x0 x0Var, Object obj) {
        x0 x0Var2;
        String str;
        TLRPC.User user;
        boolean z10;
        String str2 = "";
        x0 x0Var3 = this.f45151a;
        if (x0Var3 != null) {
            x0Var3.destroy();
            removeView(this.f45151a);
        }
        if (x0Var != null) {
            AndroidUtilities.removeFromParent(x0Var);
        }
        try {
            if (SharedConfig.debugWebView && !r()) {
                z10 = true;
            } else {
                z10 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z10);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (x0Var == null) {
            Context context = getContext();
            boolean z11 = this.f45169o0;
            long j10 = 0;
            if (z11 && (user = this.U) != null) {
                j10 = user.f22174id;
            }
            x0Var2 = new x0(context, z11, j10);
        } else {
            x0Var2 = x0Var;
        }
        this.f45151a = x0Var2;
        if (!this.f45169o0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f45151a, true);
            CookieManager.getInstance().flush();
            this.f45151a.f45442f = this.f45178v0;
        } else {
            x0Var2.setBackgroundColor(j(y6.f23354d6));
        }
        if (!MessagesController.getInstance(this.M).disableBotFullscreenBlur) {
            this.f45151a.setLayerType(2, null);
        }
        this.f45151a.f(this, this.d);
        this.f45151a.setCloseListener(this.D0);
        WebSettings settings = this.f45151a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f45169o0) {
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setCacheMode(-1);
            settings.setSaveFormData(true);
            settings.setSavePassword(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(true);
            }
        }
        if (r()) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        try {
            String replace = settings.getUserAgentString().replace("; wv)", ")");
            StringBuilder sb2 = new StringBuilder("(Linux; Android ");
            String str3 = Build.VERSION.RELEASE;
            sb2.append(str3);
            sb2.append("; K)");
            String replaceAll = replace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb2.toString()).replaceAll("Version/[\\d\\.]+ ", "");
            if (this.f45169o0) {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                if (devicePerformanceClass == 0) {
                    str = "LOW";
                } else if (devicePerformanceClass == 1) {
                    str = "AVERAGE";
                } else {
                    str = "HIGH";
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(replaceAll);
                sb3.append(" Telegram-Android/");
                sb3.append(packageInfo.versionName);
                sb3.append(" (");
                String str4 = Build.MANUFACTURER;
                if (str4 != null) {
                    if (str4.length() <= 1) {
                        str2 = str4.toUpperCase();
                    } else {
                        str2 = str4.substring(0, 1).toUpperCase() + str4.substring(1).toLowerCase();
                    }
                }
                sb3.append(str2);
                sb3.append(" ");
                sb3.append(Build.MODEL);
                sb3.append("; Android ");
                sb3.append(str3);
                sb3.append("; SDK ");
                sb3.append(Build.VERSION.SDK_INT);
                sb3.append("; ");
                sb3.append(str);
                sb3.append(")");
                replaceAll = sb3.toString();
            }
            settings.setUserAgentString(replaceAll);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.f45151a.setVerticalScrollBarEnabled(false);
        if (x0Var == null && this.f45169o0) {
            this.f45151a.setAlpha(0.0f);
        }
        addView(this.f45151a);
        if (this.f45169o0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f45173r0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f45173r0 == null) {
                ?? obj2 = new Object();
                obj2.f45140a = this;
                this.f45173r0 = obj2;
            }
            this.f45173r0.f45140a = this;
            V();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f45177u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f45177u0;
            if (botWebViewContainer$WebViewProxy == null) {
                x0 x0Var4 = this.f45151a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(x0Var4, this);
                this.f45177u0 = botWebViewContainer$WebViewProxy2;
                x0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (x0Var == null) {
                this.f45151a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f45177u0.f45141a = this;
        }
        J(this.f45151a);
        Q0 = false;
    }

    public final void X(int i10, org.telegram.ui.ActionBar.e2 e2Var, Runnable runnable) {
        if (e2Var != null && !m(i10)) {
            e2Var.setOnDismissListener(new u3(16, this, runnable));
            this.f45156c0 = e2Var;
            e2Var.f22575j0 = false;
            e2Var.show();
            if (this.L0 != i10) {
                this.L0 = i10;
                this.M0 = 0;
                this.N0 = 0L;
            }
            this.M0++;
        }
    }

    public final void Y(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        if (str != null) {
            str2 = ": ".concat(str);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        i(sb2.toString());
    }

    public final void c() {
        if (this.f45151a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.f45174s.setVisibility(8);
                this.h = true;
                this.f45159f.setVisibility(0);
                x0 x0Var = this.f45151a;
                if (x0Var != null) {
                    removeView(x0Var);
                }
            }
        }
    }

    public final void d(x7 x7Var, hi.w1 w1Var, String str, String str2, String str3) {
        if (w1Var != null && this.U != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    w1Var.m(new JSONObject());
                    x(x7Var, str2, A(string, "req_id"));
                } catch (RuntimeException e) {
                    x(x7Var, str3, B("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    x(x7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ny0 ny0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            x0 x0Var = this.f45151a;
            if (x0Var != null) {
                x0Var.setBackgroundColor(j(y6.f23354d6));
            }
            if (!this.f45171q0) {
                int i12 = y6.Ki;
                int j10 = j(i12);
                this.f45170p0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                k4 k4Var = this.f45174s;
                k4Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f45172r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.f45170p0);
                    this.f45172r.setupGradient(i12, this.e, 1.0f, false);
                }
                k4Var.invalidate();
            }
            z();
        } else if (i10 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f45181x != null) {
                if (intValue2 == -1 && intent != null) {
                    if (intent.getClipData() != null) {
                        ClipData clipData = intent.getClipData();
                        uriArr = new Uri[clipData.getItemCount()];
                        for (int i13 = 0; i13 < clipData.getItemCount(); i13++) {
                            uriArr[i13] = clipData.getItemAt(i13).getUri();
                        }
                    } else if (intent.getData() != null) {
                        uriArr = new Uri[]{intent.getData()};
                    }
                    this.f45181x.onReceiveValue(uriArr);
                    this.f45181x = null;
                }
                uriArr = null;
                this.f45181x.onReceiveValue(uriArr);
                this.f45181x = null;
            }
        } else if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (ny0Var = this.V) != null) {
                ny0Var.run();
                this.V = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f45174s) {
            if (this.v) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (this.v) {
                canvas.restore();
            }
            if (!this.v) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.f45167n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f45159f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f45151a) {
                if (!AndroidUtilities.makingGlobalBlurBitmap) {
                    if (getLayerType() == 2 && !canvas.isHardwareAccelerated()) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return super.drawChild(canvas, view, j10);
        }
    }

    public final void e() {
        if (this.U == null) {
            return;
        }
        hi.y yVar = this.f45164j0;
        if (yVar == null) {
            this.f45164j0 = hi.y.c(getContext(), this.M, this.U.f22174id);
        } else {
            yVar.h();
        }
    }

    public final x7 f() {
        x0 x0Var = this.f45151a;
        long j10 = this.f45175s0;
        boolean z10 = this.f45176t0;
        String str = this.G0;
        ?? obj = new Object();
        obj.f9382c = this;
        obj.d = x0Var;
        obj.f9380a = j10;
        obj.f9381b = z10;
        obj.e = str;
        return obj;
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.O0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f45173r0;
    }

    public int getMinHeight() {
        if (getParent() instanceof n4) {
            n4 n4Var = (n4) getParent();
            if (n4Var.J) {
                return (int) ((n4Var.getMeasuredHeight() - n4Var.getOffsetY()) + this.f45185z0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        x0 x0Var = this.f45151a;
        if (x0Var == null) {
            return null;
        }
        return k(x0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f45177u0;
    }

    public String getTrustedOrigin() {
        return this.G0;
    }

    public String getUrlLoaded() {
        return this.f45153b;
    }

    public x0 getWebView() {
        return this.f45151a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.B0);
        x0 x0Var = this.f45151a;
        if (x0Var != null) {
            if (x0Var.getParent() != null) {
                removeView(this.f45151a);
            }
            if (!this.B0) {
                this.f45151a.destroy();
                K(this.f45151a);
            }
            this.N = false;
            if (this.f45164j0 != null) {
                this.f45164j0 = null;
            }
            if (this.m0 != null) {
                this.m0 = null;
            }
            if (this.f45168n0 != null) {
                this.f45168n0 = null;
            }
            hi.b1 b1Var = this.f45165k0;
            if (b1Var != null) {
                b1Var.f12888f.remove(this.K0);
                this.f45165k0 = null;
                this.J0 = null;
            }
        }
    }

    public final void i(String str) {
        new wc(this, this.e).R(R.raw.error, 36, str).j();
    }

    public final int j(int i10) {
        u6 u6Var = this.e;
        if (u6Var != null) {
            return u6Var.g(i10);
        }
        return y6.x0(null, i10, false);
    }

    public final void l(x7 x7Var, hi.w1 w1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (w1Var != null && this.U != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        x(x7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        Pair f7 = w1Var.f(optString);
                        if (w1Var.d && (obj = f7.first) == null) {
                            Object obj2 = f7.second;
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("req_id", string);
                                jSONObject.put("value", obj);
                                jSONObject.put("can_restore", obj2);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            x(x7Var, str2, jSONObject);
                            return;
                        }
                        x(x7Var, str2, B("req_id", string, "value", f7.first));
                    } catch (RuntimeException e) {
                        x(x7Var, str3, B("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused2) {
                    x(x7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    x(x7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean m(int i10) {
        if (this.f45156c0 != null || (this.N0 > 0 && System.currentTimeMillis() < this.N0)) {
            return true;
        }
        if (this.L0 != i10 || this.M0 <= 3) {
            return false;
        }
        this.N0 = System.currentTimeMillis() + 3000;
        this.M0 = 0;
        return true;
    }

    public final void n(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        invalidate();
        if ((this.N || z11) && (z12 = this.f45169o0) && (getParent() instanceof n4)) {
            n4 n4Var = (n4) getParent();
            if (z10) {
                if (n4Var.getSwipeOffsetY() == n4Var.getTopActionBarOffsetY() + (-n4Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.O = z13;
            }
            int max = Math.max(getMinHeight(), (int) (n4Var.getTopActionBarOffsetY() + ((n4Var.getMeasuredHeight() - n4Var.getOffsetY()) - n4Var.getSwipeOffsetY()) + this.f45185z0));
            if (z11 || max != this.f45180w0 || this.f45182x0 != z10 || this.f45184y0 != this.O) {
                this.f45180w0 = max;
                this.f45182x0 = z10;
                this.f45184y0 = this.O;
                String str = "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.O + "}";
                if (z12 && !q()) {
                    g("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    NotificationCenter.getInstance(this.M).doOnIdle(new y(this, a1.g.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
                }
            }
        }
    }

    public final boolean o(x7 x7Var) {
        boolean z10;
        if (x7Var != null) {
            String str = (String) x7Var.e;
            if (((a1) x7Var.f9382c) == this && ((x0) x7Var.d) == this.f45151a && x7Var.f9380a == this.f45175s0 && (z10 = x7Var.f9381b) == this.f45176t0) {
                if (z10) {
                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.G0) && TextUtils.equals(str, getOriginHost())) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        qc.a(this, new bh.c0(this, 11));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        qc.h(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.A0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
        this.f45167n.f33817f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.f45152a0) {
            n(true, false);
        }
    }

    public final boolean q() {
        if (this.f45151a == null) {
            return false;
        }
        if (this.f45176t0) {
            if (TextUtils.isEmpty(this.G0) || !TextUtils.equals(this.G0, getOriginHost())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean r() {
        if (this.P0 != null) {
            return true;
        }
        return false;
    }

    public final void s(int i10, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
        String publicUsername = UserObject.getPublicUsername(user);
        k4 k4Var = this.f45174s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            k4Var.setVisibility(0);
            k4Var.setAlpha(1.0f);
            k4Var.g(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(y6.f23297a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i10).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                i11++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == j10) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        boolean z10 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
            } else {
                z10 = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                k4Var.setVisibility(0);
                k4Var.setAlpha(1.0f);
                k4Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        u6 u6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            k4Var.setVisibility(0);
            k4Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f45172r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.f45170p0);
                this.f45172r.setupGradient(y6.Ki, u6Var, 1.0f, false);
            }
            k4Var.g(null, null, this.f45172r);
            setupFlickerParams(true);
            return;
        }
        Path path = new Path();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(106.66499f, 106.66499f, 240.355f, 240.355f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 106.66499f, 405.335f, 240.355f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(106.66499f, 271.645f, 240.355f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 271.645f, 405.335f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        k4Var.setVisibility(0);
        k4Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.f45172r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.f45170p0);
            this.f45172r.setupGradient(y6.Ki, u6Var, 1.0f, false);
        }
        k4Var.g(null, null, this.f45172r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.U = user;
    }

    public void setDelegate(g0 g0Var) {
        this.f45155c = g0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.7f) {
            b10 = y6.b(0.0f, -0.15f, i10);
        } else {
            b10 = y6.b(0.025f, 0.15f, i10);
        }
        if (this.f45170p0 == b10) {
            return;
        }
        this.f45170p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        k4 k4Var = this.f45174s;
        k4Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f45172r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.f45170p0);
            this.f45172r.setupGradient(y6.Ki, this.e, 1.0f, false);
        }
        this.f45171q0 = true;
        k4Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i10) {
        if (this.A0 == i10) {
            return;
        }
        this.A0 = i10;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z10) {
        this.R = z10;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.D0 = runnable;
        x0 x0Var = this.f45151a;
        if (x0Var != null) {
            x0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.P0 = callback4;
    }

    public void setOpener(x0 x0Var) {
        x0 x0Var2;
        this.f45178v0 = x0Var;
        if (!this.f45169o0 && (x0Var2 = this.f45151a) != null) {
            x0Var2.f45442f = x0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f45152a0 = z10;
    }

    public void setViewPortHeightOffset(float f7) {
        this.f45185z0 = f7;
    }

    public void setWasOpenedByBot(c5 c5Var) {
        this.F0 = c5Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.E0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f45179w = aVar;
    }

    public void setWebViewScrollListener(z0 z0Var) {
        this.d = z0Var;
        x0 x0Var = this.f45151a;
        if (x0Var != null) {
            x0Var.f(this, z0Var);
        }
    }

    public final void t(int i10, String str, boolean z10) {
        String str2;
        this.M = i10;
        if (this.f45169o0) {
            this.f45175s0++;
            this.f45176t0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.G0 = str2;
            if (this.f45151a != null) {
                V();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new y(this, str, 1));
    }

    @Override
    public final void updateColors() {
        k4 k4Var;
        int j10;
        try {
            if (this.f45151a != null && (j10 = j(y6.f23354d6)) != this.C0) {
                this.C0 = j10;
                this.f45151a.setBackgroundColor(j10);
            }
            if (!this.f45171q0 && (k4Var = this.f45174s) != null) {
                int i10 = this.f45170p0;
                int i11 = y6.Ki;
                if (i10 != j(i11)) {
                    int j11 = j(i11);
                    this.f45170p0 = j11;
                    k4Var.setColorFilter(new PorterDuffColorFilter(j11, PorterDuff.Mode.SRC_IN));
                    SvgHelper.SvgDrawable svgDrawable = this.f45172r;
                    if (svgDrawable != null) {
                        svgDrawable.setColor(this.f45170p0);
                    }
                    k4Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v(x7 x7Var) {
        if (this.U != null) {
            e();
            hi.y yVar = this.f45164j0;
            if (yVar == null) {
                return;
            }
            try {
                x(x7Var, "biometry_info_received", yVar.f());
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void x(x7 x7Var, String str, JSONObject jSONObject) {
        if (!o(x7Var)) {
            g("notifyEvent " + str + " dropped after document change");
            return;
        }
        y(str, jSONObject);
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.f45169o0 && !q()) {
            g("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        g("notifyEvent " + str);
        NotificationCenter.getInstance(this.M).doOnIdle(new y(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject q5;
        try {
            q5 = m3.q(this.e, true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (q5 != null) {
            jSONObject = new JSONObject().put("theme_params", q5);
            y("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        y("theme_changed", jSONObject);
    }

    public void K(x0 x0Var) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void H() {
    }

    public void D(boolean z10, String str) {
    }

    public void I(boolean z10, boolean z11) {
    }
}
