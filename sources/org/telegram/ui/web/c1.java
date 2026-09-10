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
import bi.rd;
import di.j5;
import di.n3;
import di.t4;
import j$.util.Objects;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy0;
import org.telegram.ui.mv0;
import org.telegram.ui.q9;
import w7.a6;
import w7.e6;
public abstract class c1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean P0 = true;
    public static int Q0;
    public static HashMap R0;
    public int A0;
    public boolean B0;
    public Runnable C0;
    public boolean D0;
    public int E;
    public j5 E0;
    public String F;
    public String F0;
    public String G;
    public final Rect G0;
    public int H;
    public int H0;
    public int I;
    public a1 I0;
    public String J;
    public final t J0;
    public String K;
    public int K0;
    public String L;
    public int L0;
    public int M;
    public long M0;
    public boolean N;
    public final int N0;
    public boolean O;
    public Utilities.Callback4 O0;
    public long P;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public TLRPC.User U;
    public sx0 V;
    public Activity W;
    public y0 f37876a;
    public boolean f37877a0;
    public String f37878b;
    public String f37879b0;
    public h0 f37880c;
    public org.telegram.ui.ActionBar.d2 f37881c0;
    public b1 d;
    public int f37882d0;
    public final f6 e;
    public long f37883e0;
    public final TextView f37884f;
    public long f37885f0;
    public q9 f37886g0;
    public boolean h;
    public boolean f37887h0;
    public String f37888i0;
    public di.u f37889j0;
    public di.z0 f37890k0;
    public di.o0 f37891l0;
    public di.w1 m0;
    public final org.telegram.ui.Components.voip.h f37892n;
    public di.w1 f37893n0;
    public final boolean f37894o0;
    public int f37895p0;
    public boolean f37896q0;
    public SvgHelper.SvgDrawable f37897r;
    public BotWebViewContainer$BotWebViewProxy f37898r0;
    public final gg.i1 f37899s;
    public long f37900s0;
    public boolean f37901t0;
    public BotWebViewContainer$WebViewProxy f37902u0;
    public boolean v;
    public y0 f37903v0;
    public q0.a f37904w;
    public int f37905w0;
    public ValueCallback f37906x;
    public boolean f37907x0;
    public int f37908y;
    public boolean f37909y0;
    public float f37910z0;

    public c1(int i10, Context context, f6 f6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f37892n = hVar;
        int i11 = j6.Oh;
        this.f37908y = k(i11);
        int i12 = j6.Sh;
        this.E = k(i12);
        this.F = "";
        this.H = k(i11);
        this.I = k(i12);
        this.J = "";
        this.K = "";
        this.M = UserConfig.selectedAccount;
        this.A0 = -1;
        this.G0 = new Rect(0, 0, 0, 0);
        this.H0 = 0;
        this.J0 = new t(this, 1);
        this.K0 = -1;
        this.L0 = 0;
        int i13 = Q0;
        Q0 = i13 + 1;
        this.N0 = i13;
        this.f37894o0 = z10;
        this.e = f6Var;
        h("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        hVar.f28151k = false;
        hVar.b(i10, 153);
        gg.i1 i1Var = new gg.i1(this, context);
        this.f37899s = i1Var;
        int k10 = k(j6.Ki);
        this.f37895p0 = k10;
        i1Var.setColorFilter(new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN));
        i1Var.getImageReceiver().setAspectFit(true);
        addView(i1Var, a6.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f37884f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(k(j6.f18306y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, a6.e(-1, -2, 17));
        setFocusable(false);
    }

    public static JSONObject B(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject C(String str, Object obj, String str2, Object obj2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static WebResourceResponse N(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(nf.f.v(Uri.parse(str2), "https", null, T(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
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

    public static String T(String str) {
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

    public static void a(c1 c1Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            c1Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else if (c1Var.d(strArr)) {
            aVar.accept(Boolean.TRUE);
        } else {
            c1Var.V = new sx0(c1Var, aVar, strArr, 8);
            Activity activity = c1Var.W;
            if (activity != null) {
                activity.requestPermissions(strArr, 4000);
            }
        }
    }

    public static String b(String str) {
        if (str == null) {
            return str;
        }
        if (q(Uri.parse(str))) {
            String hostAuthority = AndroidUtilities.getHostAuthority(str);
            try {
                hostAuthority = IDN.toASCII(hostAuthority, 1);
            } catch (Exception unused) {
            }
            String T = T(hostAuthority);
            if (R0 == null) {
                R0 = new HashMap();
            }
            R0.put(T, hostAuthority);
            return nf.f.v(Uri.parse(str), "https", null, T, null);
        }
        return str;
    }

    public static String l(String str) {
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

    public static boolean q(Uri uri) {
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
        gg.i1 i1Var = this.f37899s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i1Var.getLayoutParams();
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
        i1Var.requestLayout();
    }

    private void setupWebView(y0 y0Var) {
        X(y0Var, null);
    }

    public static String v(String str) {
        String str2;
        if (R0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority != null) {
            if (hostAuthority.endsWith("." + MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress) && (str2 = (String) R0.get(hostAuthority)) != null) {
                return nf.f.v(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void x(int i10, y0 y0Var, a1 a1Var, String str, JSONObject jSONObject) {
        if (y0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new fy0(y0Var, a1Var, str, jSONObject, 17));
    }

    public final void A() {
        JSONObject jSONObject;
        JSONObject p5;
        try {
            p5 = n3.p(this.e, true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (p5 != null) {
            jSONObject = new JSONObject().put("theme_params", p5);
            y("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        y("theme_changed", jSONObject);
    }

    public final boolean D() {
        if (this.f37876a != null && this.R) {
            y("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r55, final org.telegram.ui.web.a1 r56, java.lang.String r57, java.lang.String r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.c1.F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, org.telegram.ui.web.a1, java.lang.String, java.lang.String):void");
    }

    public final void G(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f37879b0, str)) {
                this.f37879b0 = null;
            }
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public final void H(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.P > 10000 && z11) {
            return;
        }
        this.P = 0L;
        boolean[] zArr = {false};
        if (nf.f.f(uri, false, zArr) && !zArr[0] && this.f37880c != null) {
            setKeyboardFocusable(false);
        }
        nf.f.r(getContext(), uri, true, z10, false, null, str, false, true, z12);
    }

    public abstract void K(y0 y0Var);

    public final void M() {
        h("preserveWebView");
        this.B0 = true;
        if (this.f37894o0) {
            y("visibility_changed", B(Boolean.FALSE, "is_visible"));
            this.f37900s0++;
        }
        y0 y0Var = this.f37876a;
        if (y0Var != null) {
            y0Var.f(null, null);
            this.f37876a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f37898r0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f37844a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f37902u0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f37845a = null;
        }
    }

    public final void O(int i10, y0 y0Var, Object obj, String str, boolean z10) {
        String str2;
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.f37894o0;
        if (z11) {
            this.f37900s0++;
            this.f37901t0 = z10;
            if (z10) {
                str2 = l(str);
            } else {
                str2 = null;
            }
            this.F0 = str2;
        }
        X(y0Var, obj);
        if (z11) {
            y("visibility_changed", B(Boolean.TRUE, "is_visible"));
        }
    }

    public final void P(int i10, boolean z10) {
        JSONObject jSONObject;
        if (!z10 && i10 == this.H0) {
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
        this.H0 = i10;
    }

    public final void Q(Rect rect, boolean z10) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.G0;
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

    public final void R() {
        try {
            if (this.G != null) {
                F(this.f37898r0, g(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                F(this.f37898r0, g(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void S(a1 a1Var, di.w1 w1Var, String str) {
        f6 f6Var;
        boolean z10;
        boolean z11;
        if (w1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        z(a1Var, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = w1Var.h(optString);
                        if (h.isEmpty()) {
                            z(a1Var, "secure_storage_failed", C("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        a0 a0Var = new a0(this, a1Var, string, w1Var, optString);
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            f6Var = U.getResourceProvider();
                        } else {
                            f6Var = null;
                        }
                        int i10 = 1;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        h3 i11 = em.i(1, context, f6Var, false);
                        ViewGroup f7 = em.f(context, 1);
                        w9 w9Var = new w9(context);
                        TLRPC.User user = MessagesController.getInstance(w1Var.f6974a).getUser(Long.valueOf(w1Var.f6975b));
                        g9 g9Var = new g9((f6) null);
                        g9Var.r(user);
                        w9Var.e(user, g9Var);
                        f7.addView(w9Var, a6.t(80, 80, 49, 0, 21, 0, 13));
                        int i12 = j6.G6;
                        TextView b10 = e6.b(context, 20.0f, i12, true, null);
                        em.k(R.string.BotRestoreStorageTitle, b10, 17);
                        f7.addView(b10, a6.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = e6.b(context, 14.0f, i12, false, null);
                        b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        b11.setGravity(17);
                        f7.addView(b11, a6.t(-1, -2, 7, 32, 0, 32, 19));
                        f9 f9Var = new f9(context, f6Var);
                        f9Var.setBackground(new vq(new ColorDrawable(j6.v0(j6.f17872a7, f6Var)), j6.U0(context, R.drawable.greydivider, j6.v0(j6.f17892b7, f6Var))));
                        f9Var.setFixedSize(12);
                        f7.addView(f9Var, a6.t(-1, 12, 7, 0, 0, 0, 0));
                        m4 m4Var = new m4(context, f6Var);
                        m4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        f7.addView(m4Var, a6.t(-1, -2, 7, 0, 0, 0, 0));
                        bi.d dVar = new bi.d(context, f6Var, true);
                        ArrayList arrayList = new ArrayList();
                        for (int i13 = 0; i13 < h.size(); i13++) {
                            di.v1 v1Var = (di.v1) h.get(i13);
                            if (i13 < h.size() - i10) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            di.u1 u1Var = new di.u1(v1Var, z11, context);
                            u1Var.setBackground(j6.f0(j6.v0(j6.f18017i6, f6Var), 2, -1));
                            ViewGroup viewGroup = f7;
                            String[] strArr2 = strArr;
                            u1Var.setOnClickListener(new di.o(strArr2, v1Var, arrayList, dVar, 1));
                            viewGroup.addView(u1Var, a6.n(-1, 56));
                            arrayList.add(u1Var);
                            f7 = viewGroup;
                            strArr = strArr2;
                            i10 = 1;
                        }
                        String[] strArr3 = strArr;
                        ViewGroup viewGroup2 = f7;
                        dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                        if (strArr3[0] != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        dVar.setEnabled(z10);
                        viewGroup2.addView(dVar, a6.t(-1, 48, 7, 8, 8, 8, 4));
                        i11.customView = viewGroup2;
                        i11.fixNavigationBar(j6.v0(j6.f17998h5, f6Var));
                        dVar.setOnClickListener(new di.o(zArr, a0Var, strArr3, i11, 2));
                        i11.setOnDismissListener(new di.h0(1, zArr, a0Var));
                        i11.show();
                    } catch (Exception e) {
                        z(a1Var, "secure_storage_failed", C("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    z(a1Var, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    z(a1Var, "secure_storage_failed", C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void U(String str, boolean z10) {
        boolean z11;
        boolean z12;
        y0 y0Var = this.f37876a;
        if (y0Var != null) {
            boolean z13 = y0Var.E;
        }
        if (y0Var != null && y0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        y0 y0Var2 = this.f37876a;
        if (y0Var2 != null && y0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        J(z11, z12);
        y0 y0Var3 = this.f37876a;
        if (y0Var3 != null) {
            y0Var3.f38153b = true;
        }
        if (this.N) {
            h("setPageLoaded: already loaded");
            return;
        }
        gg.i1 i1Var = this.f37899s;
        if (z10 && y0Var3 != null && i1Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f37876a, property, 1.0f), ObjectAnimator.ofFloat(i1Var, property, 0.0f));
            animatorSet.addListener(new mv0(this, 18));
            animatorSet.start();
        } else {
            if (y0Var3 != null) {
                y0Var3.setAlpha(1.0f);
            }
            if (i1Var != null) {
                i1Var.setAlpha(0.0f);
                i1Var.setVisibility(8);
            }
        }
        this.f37878b = str;
        h("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.f37880c.getClass();
    }

    public final void V(a1 a1Var, di.w1 w1Var, String str, String str2, String str3) {
        if (w1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        z(a1Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            w1Var.n(optString, jSONObject.optString("value"));
                            z(a1Var, str2, B(string, "req_id"));
                        } catch (RuntimeException e) {
                            z(a1Var, str3, C("req_id", string, "error", e.getMessage()));
                        }
                    } catch (Exception unused) {
                        z(a1Var, str3, C("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    z(a1Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    z(a1Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void W() {
        y0 y0Var = this.f37876a;
        if (y0Var != null && this.f37894o0) {
            y0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!com.google.android.gms.internal.cast.o.a("WEB_MESSAGE_LISTENER")) {
                h("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            y0 y0Var2 = this.f37876a;
            if (!y0Var2.R) {
                a5.c.a(y0Var2, "TelegramWebviewProxyMessage", singleton, new org.telegram.tgnet.j(y0Var2, 5));
                this.f37876a.R = true;
            }
            if (com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT")) {
                y0 y0Var3 = this.f37876a;
                if (y0Var3.S == null) {
                    boolean z10 = a5.c.f277a;
                    if (b5.m.d.b()) {
                        y0Var3.S = new pb.c((ScriptHandlerBoundaryInterface) se.b.a(ScriptHandlerBoundaryInterface.class, a5.c.c(y0Var3).f2121a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 4);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    public final void X(y0 y0Var, Object obj) {
        y0 y0Var2;
        String str;
        TLRPC.User user;
        boolean z10;
        String str2 = "";
        y0 y0Var3 = this.f37876a;
        if (y0Var3 != null) {
            y0Var3.destroy();
            removeView(this.f37876a);
        }
        if (y0Var != null) {
            AndroidUtilities.removeFromParent(y0Var);
        }
        try {
            if (SharedConfig.debugWebView && !s()) {
                z10 = true;
            } else {
                z10 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z10);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (y0Var == null) {
            Context context = getContext();
            boolean z11 = this.f37894o0;
            long j3 = 0;
            if (z11 && (user = this.U) != null) {
                j3 = user.f17342id;
            }
            y0Var2 = new y0(context, z11, j3);
        } else {
            y0Var2 = y0Var;
        }
        this.f37876a = y0Var2;
        if (!this.f37894o0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f37876a, true);
            CookieManager.getInstance().flush();
            this.f37876a.f38155f = this.f37903v0;
        } else {
            y0Var2.setBackgroundColor(k(j6.f17928d6));
        }
        if (!MessagesController.getInstance(this.M).disableBotFullscreenBlur) {
            this.f37876a.setLayerType(2, null);
        }
        this.f37876a.f(this, this.d);
        this.f37876a.setCloseListener(this.C0);
        WebSettings settings = this.f37876a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f37894o0) {
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
        if (s()) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        try {
            String replace = settings.getUserAgentString().replace("; wv)", ")");
            StringBuilder sb2 = new StringBuilder("(Linux; Android ");
            String str3 = Build.VERSION.RELEASE;
            sb2.append(str3);
            sb2.append("; K)");
            String replaceAll = replace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb2.toString()).replaceAll("Version/[\\d\\.]+ ", "");
            if (this.f37894o0) {
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.f37876a.setVerticalScrollBarEnabled(false);
        if (y0Var == null && this.f37894o0) {
            this.f37876a.setAlpha(0.0f);
        }
        addView(this.f37876a);
        if (this.f37894o0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f37898r0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f37898r0 == null) {
                ?? obj2 = new Object();
                obj2.f37844a = this;
                this.f37898r0 = obj2;
            }
            this.f37898r0.f37844a = this;
            W();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f37902u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f37902u0;
            if (botWebViewContainer$WebViewProxy == null) {
                y0 y0Var4 = this.f37876a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(y0Var4, this);
                this.f37902u0 = botWebViewContainer$WebViewProxy2;
                y0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (y0Var == null) {
                this.f37876a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f37902u0.f37845a = this;
        }
        K(this.f37876a);
        P0 = false;
    }

    public final void Y(int i10, org.telegram.ui.ActionBar.d2 d2Var, Runnable runnable) {
        if (d2Var != null && !n(i10)) {
            d2Var.setOnDismissListener(new di.h0(13, this, runnable));
            this.f37881c0 = d2Var;
            d2Var.f17622h0 = false;
            d2Var.show();
            if (this.K0 != i10) {
                this.K0 = i10;
                this.L0 = 0;
                this.M0 = 0L;
            }
            this.L0++;
        }
    }

    public final void Z(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        if (str != null) {
            str2 = ": ".concat(str);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        j(sb2.toString());
    }

    public final void c() {
        if (this.f37876a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.f37899s.setVisibility(8);
                this.h = true;
                this.f37884f.setVisibility(0);
                y0 y0Var = this.f37876a;
                if (y0Var != null) {
                    removeView(y0Var);
                }
            }
        }
    }

    public final boolean d(String[] strArr) {
        for (String str : strArr) {
            if (getContext().checkSelfPermission(str) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        sx0 sx0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            y0 y0Var = this.f37876a;
            if (y0Var != null) {
                y0Var.setBackgroundColor(k(j6.f17928d6));
            }
            if (!this.f37896q0) {
                int i12 = j6.Ki;
                int k10 = k(i12);
                this.f37895p0 = k10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN);
                gg.i1 i1Var = this.f37899s;
                i1Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f37897r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.f37895p0);
                    this.f37897r.setupGradient(i12, this.e, 1.0f, false);
                }
                i1Var.invalidate();
            }
            A();
        } else if (i10 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f37906x != null) {
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
                    this.f37906x.onReceiveValue(uriArr);
                    this.f37906x = null;
                }
                uriArr = null;
                this.f37906x.onReceiveValue(uriArr);
                this.f37906x = null;
            }
        } else if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (sx0Var = this.V) != null) {
                sx0Var.run();
                this.V = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f37899s) {
            if (this.v) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (this.v) {
                canvas.restore();
            }
            if (!this.v) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.f37892n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f37884f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f37876a) {
                if (!AndroidUtilities.makingGlobalBlurBitmap) {
                    if (getLayerType() == 2 && !canvas.isHardwareAccelerated()) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            return super.drawChild(canvas, view, j3);
        }
    }

    public final void e(a1 a1Var, di.w1 w1Var, String str, String str2, String str3) {
        if (w1Var != null && this.U != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    w1Var.m(new JSONObject());
                    z(a1Var, str2, B(string, "req_id"));
                } catch (RuntimeException e) {
                    z(a1Var, str3, C("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    z(a1Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void f() {
        if (this.U == null) {
            return;
        }
        di.u uVar = this.f37889j0;
        if (uVar == null) {
            this.f37889j0 = di.u.c(getContext(), this.M, this.U.f17342id);
        } else {
            uVar.h();
        }
    }

    public final a1 g() {
        y0 y0Var = this.f37876a;
        long j3 = this.f37900s0;
        boolean z10 = this.f37901t0;
        String str = this.F0;
        ?? obj = new Object();
        obj.f37857c = this;
        obj.d = y0Var;
        obj.f37855a = j3;
        obj.f37856b = z10;
        obj.e = str;
        return obj;
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f37898r0;
    }

    public int getMinHeight() {
        if (getParent() instanceof t4) {
            t4 t4Var = (t4) getParent();
            if (t4Var.J) {
                return (int) ((t4Var.getMeasuredHeight() - t4Var.getOffsetY()) + this.f37910z0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        y0 y0Var = this.f37876a;
        if (y0Var == null) {
            return null;
        }
        return l(y0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f37902u0;
    }

    public String getTrustedOrigin() {
        return this.F0;
    }

    public String getUrlLoaded() {
        return this.f37878b;
    }

    public y0 getWebView() {
        return this.f37876a;
    }

    public final void h(String str) {
        FileLog.d("[webviewcontainer] #" + this.N0 + " " + str);
    }

    public final void i() {
        h("destroyWebView preserving=" + this.B0);
        y0 y0Var = this.f37876a;
        if (y0Var != null) {
            if (y0Var.getParent() != null) {
                removeView(this.f37876a);
            }
            if (!this.B0) {
                this.f37876a.destroy();
                L(this.f37876a);
            }
            this.N = false;
            if (this.f37889j0 != null) {
                this.f37889j0 = null;
            }
            if (this.m0 != null) {
                this.m0 = null;
            }
            if (this.f37893n0 != null) {
                this.f37893n0 = null;
            }
            di.z0 z0Var = this.f37890k0;
            if (z0Var != null) {
                z0Var.f7053f.remove(this.J0);
                this.f37890k0 = null;
                this.I0 = null;
            }
        }
    }

    public final void j(String str) {
        new wc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int k(int i10) {
        f6 f6Var = this.e;
        if (f6Var != null) {
            return f6Var.F0(i10);
        }
        return j6.w0(null, i10, false);
    }

    public final void m(a1 a1Var, di.w1 w1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (w1Var != null && this.U != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        z(a1Var, str3, C("req_id", string, "error", "KEY_INVALID"));
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
                            z(a1Var, str2, jSONObject);
                        } else {
                            z(a1Var, str2, C("req_id", string, "value", f7.first));
                        }
                    } catch (RuntimeException e) {
                        z(a1Var, str3, C("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused2) {
                    z(a1Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    z(a1Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean n(int i10) {
        if (this.f37881c0 != null || (this.M0 > 0 && System.currentTimeMillis() < this.M0)) {
            return true;
        }
        if (this.K0 != i10 || this.L0 <= 3) {
            return false;
        }
        this.M0 = System.currentTimeMillis() + 3000;
        this.L0 = 0;
        return true;
    }

    public final void o(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        invalidate();
        if ((this.N || z11) && (z12 = this.f37894o0) && (getParent() instanceof t4)) {
            t4 t4Var = (t4) getParent();
            if (z10) {
                if (t4Var.getSwipeOffsetY() == t4Var.getTopActionBarOffsetY() + (-t4Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.O = z13;
            }
            int max = Math.max(getMinHeight(), (int) (t4Var.getTopActionBarOffsetY() + ((t4Var.getMeasuredHeight() - t4Var.getOffsetY()) - t4Var.getSwipeOffsetY()) + this.f37910z0));
            if (z11 || max != this.f37905w0 || this.f37907x0 != z10 || this.f37909y0 != this.O) {
                this.f37905w0 = max;
                this.f37907x0 = z10;
                this.f37909y0 = this.O;
                String str = "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.O + "}";
                if (z12 && !r()) {
                    h("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    NotificationCenter.getInstance(this.M).doOnIdle(new y(this, a4.a.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        pc.a(this, new rd(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        pc.h(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.A0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
        this.f37892n.f28147f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.f37877a0) {
            o(true, false);
        }
    }

    public final boolean p(a1 a1Var) {
        boolean z10;
        if (a1Var != null) {
            String str = (String) a1Var.e;
            if (((c1) a1Var.f37857c) == this && ((y0) a1Var.d) == this.f37876a && a1Var.f37855a == this.f37900s0 && (z10 = a1Var.f37856b) == this.f37901t0) {
                if (z10) {
                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.F0) && TextUtils.equals(str, getOriginHost())) {
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

    public final boolean r() {
        if (this.f37876a == null) {
            return false;
        }
        if (this.f37901t0) {
            if (TextUtils.isEmpty(this.F0) || !TextUtils.equals(this.F0, getOriginHost())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean s() {
        if (this.O0 != null) {
            return true;
        }
        return false;
    }

    public void setBotUser(TLRPC.User user) {
        this.U = user;
    }

    public void setDelegate(h0 h0Var) {
        this.f37880c = h0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.7f) {
            b10 = j6.b(0.0f, -0.15f, i10);
        } else {
            b10 = j6.b(0.025f, 0.15f, i10);
        }
        if (this.f37895p0 == b10) {
            return;
        }
        this.f37895p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        gg.i1 i1Var = this.f37899s;
        i1Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f37897r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.f37895p0);
            this.f37897r.setupGradient(j6.Ki, this.e, 1.0f, false);
        }
        this.f37896q0 = true;
        i1Var.invalidate();
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
        this.C0 = runnable;
        y0 y0Var = this.f37876a;
        if (y0Var != null) {
            y0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.O0 = callback4;
    }

    public void setOpener(y0 y0Var) {
        y0 y0Var2;
        this.f37903v0 = y0Var;
        if (!this.f37894o0 && (y0Var2 = this.f37876a) != null) {
            y0Var2.f38155f = y0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f37877a0 = z10;
    }

    public void setViewPortHeightOffset(float f7) {
        this.f37910z0 = f7;
    }

    public void setWasOpenedByBot(j5 j5Var) {
        this.E0 = j5Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.D0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f37904w = aVar;
    }

    public void setWebViewScrollListener(b1 b1Var) {
        this.d = b1Var;
        y0 y0Var = this.f37876a;
        if (y0Var != null) {
            y0Var.f(this, b1Var);
        }
    }

    public final void t(int i10, long j3) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
        String publicUsername = UserObject.getPublicUsername(user);
        gg.i1 i1Var = this.f37899s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            i1Var.setVisibility(0);
            i1Var.setAlpha(1.0f);
            i1Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(k(j6.f17872a7))));
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
                if (tL_attachMenuBot.bot_id == j3) {
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
                i1Var.setVisibility(0);
                i1Var.setAlpha(1.0f);
                i1Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        f6 f6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            i1Var.setVisibility(0);
            i1Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f37897r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.f37895p0);
                this.f37897r.setupGradient(j6.Ki, f6Var, 1.0f, false);
            }
            i1Var.f(null, null, this.f37897r);
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
        i1Var.setVisibility(0);
        i1Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.f37897r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.f37895p0);
            this.f37897r.setupGradient(j6.Ki, f6Var, 1.0f, false);
        }
        i1Var.f(null, null, this.f37897r);
        setupFlickerParams(true);
    }

    public final void u(int i10, String str, boolean z10) {
        String str2;
        this.M = i10;
        if (this.f37894o0) {
            this.f37900s0++;
            this.f37901t0 = z10;
            if (z10) {
                str2 = l(str);
            } else {
                str2 = null;
            }
            this.F0 = str2;
            if (this.f37876a != null) {
                W();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new y(this, str, 1));
    }

    public final void w(a1 a1Var) {
        if (this.U != null) {
            f();
            di.u uVar = this.f37889j0;
            if (uVar == null) {
                return;
            }
            try {
                z(a1Var, "biometry_info_received", uVar.f());
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.f37894o0 && !r()) {
            h("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        h("notifyEvent " + str);
        NotificationCenter.getInstance(this.M).doOnIdle(new y(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z(a1 a1Var, String str, JSONObject jSONObject) {
        if (!p(a1Var)) {
            h("notifyEvent " + str + " dropped after document change");
            return;
        }
        y(str, jSONObject);
    }

    public void I() {
    }

    public void L(y0 y0Var) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void E(String str, boolean z10) {
    }

    public void J(boolean z10, boolean z11) {
    }
}
