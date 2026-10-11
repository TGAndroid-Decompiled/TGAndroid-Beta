package org.telegram.ui.web;

import ai.ea;
import ai.p5;
import ai.x4;
import ai.z5;
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
import ei.e5;
import ei.k3;
import ei.o4;
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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.z4;
import org.telegram.ui.ds0;
import org.telegram.ui.p9;
import w7.b6;
import w7.x5;
public abstract class b1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean P0 = true;
    public static int Q0;
    public static HashMap R0;
    public int A0;
    public boolean B0;
    public Runnable C0;
    public boolean D0;
    public int E;
    public e5 E0;
    public String F;
    public String F0;
    public String G;
    public final Rect G0;
    public int H;
    public int H0;
    public int I;
    public ea I0;
    public String J;
    public final s J0;
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
    public bf0 V;
    public Activity W;
    public y0 f43460a;
    public boolean f43461a0;
    public String f43462b;
    public String f43463b0;
    public g0 f43464c;
    public org.telegram.ui.ActionBar.a2 f43465c0;
    public a1 d;
    public int f43466d0;
    public final d6 f43467e;
    public long f43468e0;
    public final TextView f43469f;
    public long f43470f0;
    public p9 f43471g0;
    public boolean h;
    public boolean f43472h0;
    public String f43473i0;
    public ei.r f43474j0;
    public ei.w0 f43475k0;
    public ei.l0 f43476l0;
    public ei.t1 m0;
    public final org.telegram.ui.Components.voip.h f43477n;
    public ei.t1 f43478n0;
    public final boolean f43479o0;
    public int f43480p0;
    public boolean f43481q0;
    public SvgHelper.SvgDrawable f43482r;
    public BotWebViewContainer$BotWebViewProxy f43483r0;
    public final z5 f43484s;
    public long f43485s0;
    public boolean f43486t0;
    public BotWebViewContainer$WebViewProxy f43487u0;
    public boolean v;
    public y0 f43488v0;
    public q0.a f43489w;
    public int f43490w0;
    public ValueCallback f43491x;
    public boolean f43492x0;
    public int f43493y;
    public boolean f43494y0;
    public float f43495z0;

    public b1(int i10, Context context, d6 d6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f43477n = hVar;
        int i11 = h6.Oh;
        this.f43493y = j(i11);
        int i12 = h6.Sh;
        this.E = j(i12);
        this.F = "";
        this.H = j(i11);
        this.I = j(i12);
        this.J = "";
        this.K = "";
        this.M = UserConfig.selectedAccount;
        this.A0 = -1;
        this.G0 = new Rect(0, 0, 0, 0);
        this.H0 = 0;
        this.J0 = new s(this, 1);
        this.K0 = -1;
        this.L0 = 0;
        int i13 = Q0;
        Q0 = i13 + 1;
        this.N0 = i13;
        this.f43479o0 = z10;
        this.f43467e = d6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        hVar.f32069k = false;
        hVar.b(i10, 153);
        z5 z5Var = new z5(this, context);
        this.f43484s = z5Var;
        int j3 = j(h6.Ki);
        this.f43480p0 = j3;
        z5Var.setColorFilter(new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN));
        z5Var.getImageReceiver().setAspectFit(true);
        addView(z5Var, x5.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f43469f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(j(h6.f21207y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, x5.e(-1, -2, 17));
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
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(of.f.v(Uri.parse(str2), "https", null, S(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static String S(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e7) {
            FileLog.e(e7);
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

    public static void a(b1 b1Var, String[] strArr, q0.a aVar) {
        b1Var.getClass();
        for (String str : strArr) {
            if (b1Var.getContext().checkSelfPermission(str) != 0) {
                b1Var.V = new bf0(b1Var, aVar, strArr, 22);
                Activity activity = b1Var.W;
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
            if (R0 == null) {
                R0 = new HashMap();
            }
            R0.put(S, hostAuthority);
            return of.f.v(Uri.parse(str), "https", null, S, null);
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
        z5 z5Var = this.f43484s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z5Var.getLayoutParams();
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
        z5Var.requestLayout();
    }

    private void setupWebView(y0 y0Var) {
        W(y0Var, null);
    }

    public static String u(String str) {
        String str2;
        if (R0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority != null) {
            if (hostAuthority.endsWith("." + MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress) && (str2 = (String) R0.get(hostAuthority)) != null) {
                return of.f.v(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void w(int i10, y0 y0Var, ea eaVar, String str, JSONObject jSONObject) {
        if (y0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new ds0(y0Var, eaVar, str, jSONObject, 21));
    }

    public final boolean C() {
        if (this.f43460a != null && this.R) {
            y("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r55, final ai.ea r56, java.lang.String r57, java.lang.String r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b1.E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, ai.ea, java.lang.String, java.lang.String):void");
    }

    public final void F(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f43463b0, str)) {
                this.f43463b0 = null;
            }
        } catch (JSONException e7) {
            FileLog.e(e7);
        }
    }

    public final void G(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.P > 10000 && z11) {
            return;
        }
        this.P = 0L;
        boolean[] zArr = {false};
        if (of.f.f(uri, false, zArr) && !zArr[0] && this.f43464c != null) {
            setKeyboardFocusable(false);
        }
        of.f.r(getContext(), uri, true, z10, false, null, str, false, true, z12);
    }

    public abstract void J(y0 y0Var);

    public final void L() {
        g("preserveWebView");
        this.B0 = true;
        if (this.f43479o0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.f43485s0++;
        }
        y0 y0Var = this.f43460a;
        if (y0Var != null) {
            y0Var.f(null, null);
            this.f43460a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f43483r0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f43437a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f43487u0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f43438a = null;
        }
    }

    public final void N(int i10, y0 y0Var, Object obj, String str, boolean z10) {
        String str2;
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.f43479o0;
        if (z11) {
            this.f43485s0++;
            this.f43486t0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.F0 = str2;
        }
        W(y0Var, obj);
        if (z11) {
            y("visibility_changed", A(Boolean.TRUE, "is_visible"));
        }
    }

    public final void O(int i10, boolean z10) {
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

    public final void P(Rect rect, boolean z10) {
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

    public final void Q() {
        try {
            if (this.G != null) {
                E(this.f43483r0, f(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                E(this.f43483r0, f(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void R(ea eaVar, ei.t1 t1Var, String str) {
        d6 d6Var;
        boolean z10;
        boolean z11;
        if (t1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(eaVar, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = t1Var.h(optString);
                        if (h.isEmpty()) {
                            x(eaVar, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        z zVar = new z(this, eaVar, string, t1Var, optString);
                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                        if (U != null) {
                            d6Var = U.getResourceProvider();
                        } else {
                            d6Var = null;
                        }
                        int i10 = 1;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        e3 i11 = ai.i(1, context, d6Var, false);
                        ViewGroup e7 = ai.e(context, 1);
                        y9 y9Var = new y9(context);
                        TLRPC.User user = MessagesController.getInstance(t1Var.f9362a).getUser(Long.valueOf(t1Var.f9363b));
                        j9 j9Var = new j9((d6) null);
                        j9Var.r(user);
                        y9Var.e(user, j9Var);
                        e7.addView(y9Var, x5.t(80, 80, 49, 0, 21, 0, 13));
                        int i12 = h6.G6;
                        TextView b10 = b6.b(context, 20.0f, i12, true, null);
                        ai.m(R.string.BotRestoreStorageTitle, b10, 17);
                        e7.addView(b10, x5.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = b6.b(context, 14.0f, i12, false, null);
                        b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        b11.setGravity(17);
                        e7.addView(b11, x5.t(-1, -2, 7, 32, 0, 32, 19));
                        e9 e9Var = new e9(context, d6Var);
                        e9Var.setBackground(new fr(new ColorDrawable(h6.w0(h6.f20766a7, d6Var)), h6.V0(context, R.drawable.greydivider, h6.w0(h6.f20786b7, d6Var))));
                        e9Var.setFixedSize(12);
                        e7.addView(e9Var, x5.t(-1, 12, 7, 0, 0, 0, 0));
                        m4 m4Var = new m4(context, d6Var);
                        m4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        e7.addView(m4Var, x5.t(-1, -2, 7, 0, 0, 0, 0));
                        ci.d dVar = new ci.d(context, d6Var, true);
                        boolean z12 = false;
                        ArrayList arrayList = new ArrayList();
                        int i13 = 0;
                        while (i13 < h.size()) {
                            ei.s1 s1Var = (ei.s1) h.get(i13);
                            if (i13 < h.size() - i10) {
                                z11 = i10;
                            } else {
                                z11 = z12;
                            }
                            ei.r1 r1Var = new ei.r1(s1Var, z11, context);
                            r1Var.setBackground(h6.g0(h6.w0(h6.f20913i6, d6Var), 2, -1));
                            ViewGroup viewGroup = e7;
                            String[] strArr2 = strArr;
                            r1Var.setOnClickListener(new p5(strArr2, s1Var, arrayList, dVar, 2));
                            viewGroup.addView(r1Var, x5.n(-1, 56));
                            arrayList.add(r1Var);
                            e7 = viewGroup;
                            strArr = strArr2;
                            i10 = 1;
                            i13++;
                            z12 = false;
                        }
                        String[] strArr3 = strArr;
                        ViewGroup viewGroup2 = e7;
                        dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                        if (strArr3[0] != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        dVar.setEnabled(z10);
                        viewGroup2.addView(dVar, x5.t(-1, 48, 7, 8, 8, 8, 4));
                        i11.customView = viewGroup2;
                        i11.fixNavigationBar(h6.w0(h6.f20893h5, d6Var));
                        dVar.setOnClickListener(new p5(zArr, zVar, strArr3, i11, 3));
                        i11.setOnDismissListener(new ei.e0(1, zArr, zVar));
                        i11.show();
                    } catch (Exception e10) {
                        x(eaVar, "secure_storage_failed", B("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused) {
                    x(eaVar, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                FileLog.e(e11);
                if (!TextUtils.isEmpty("")) {
                    x(eaVar, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void T(String str, boolean z10) {
        boolean z11;
        boolean z12;
        y0 y0Var = this.f43460a;
        if (y0Var != null) {
            boolean z13 = y0Var.E;
        }
        if (y0Var != null && y0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        y0 y0Var2 = this.f43460a;
        if (y0Var2 != null && y0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        I(z11, z12);
        y0 y0Var3 = this.f43460a;
        if (y0Var3 != null) {
            y0Var3.f43764b = true;
        }
        if (this.N) {
            g("setPageLoaded: already loaded");
            return;
        }
        z5 z5Var = this.f43484s;
        if (z10 && y0Var3 != null && z5Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f43460a, property, 1.0f), ObjectAnimator.ofFloat(z5Var, property, 0.0f));
            animatorSet.addListener(new z4(this, 6));
            animatorSet.start();
        } else {
            if (y0Var3 != null) {
                y0Var3.setAlpha(1.0f);
            }
            if (z5Var != null) {
                z5Var.setAlpha(0.0f);
                z5Var.setVisibility(8);
            }
        }
        this.f43462b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.f43464c.getClass();
    }

    public final void U(ea eaVar, ei.t1 t1Var, String str, String str2, String str3) {
        if (t1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(eaVar, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            t1Var.n(optString, jSONObject.optString("value"));
                            x(eaVar, str2, A(string, "req_id"));
                        } catch (RuntimeException e7) {
                            x(eaVar, str3, B("req_id", string, "error", e7.getMessage()));
                        }
                    } catch (Exception unused) {
                        x(eaVar, str3, B("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    x(eaVar, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    x(eaVar, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void V() {
        y0 y0Var = this.f43460a;
        if (y0Var != null && this.f43479o0) {
            y0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!com.google.android.gms.internal.cast.o.a("WEB_MESSAGE_LISTENER")) {
                g("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            y0 y0Var2 = this.f43460a;
            if (!y0Var2.R) {
                a5.b.a(y0Var2, "TelegramWebviewProxyMessage", singleton, new m4.w(y0Var2, 13));
                this.f43460a.R = true;
            }
            if (com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT")) {
                y0 y0Var3 = this.f43460a;
                if (y0Var3.S == null) {
                    boolean z10 = a5.b.f301a;
                    if (b5.m.d.b()) {
                        y0Var3.S = new a4.l((ScriptHandlerBoundaryInterface) te.b.a(ScriptHandlerBoundaryInterface.class, a5.b.c(y0Var3).f3775a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 3);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    public final void W(y0 y0Var, Object obj) {
        y0 y0Var2;
        String str;
        TLRPC.User user;
        boolean z10;
        String str2 = "";
        y0 y0Var3 = this.f43460a;
        if (y0Var3 != null) {
            y0Var3.destroy();
            removeView(this.f43460a);
        }
        if (y0Var != null) {
            AndroidUtilities.removeFromParent(y0Var);
        }
        try {
            if (SharedConfig.debugWebView && !r()) {
                z10 = true;
            } else {
                z10 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z10);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (y0Var == null) {
            Context context = getContext();
            boolean z11 = this.f43479o0;
            long j3 = 0;
            if (z11 && (user = this.U) != null) {
                j3 = user.f20215id;
            }
            y0Var2 = new y0(context, z11, j3);
        } else {
            y0Var2 = y0Var;
        }
        this.f43460a = y0Var2;
        if (!this.f43479o0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f43460a, true);
            CookieManager.getInstance().flush();
            this.f43460a.f43767f = this.f43488v0;
        } else {
            y0Var2.setBackgroundColor(j(h6.f20822d6));
        }
        if (!MessagesController.getInstance(this.M).disableBotFullscreenBlur) {
            this.f43460a.setLayerType(2, null);
        }
        this.f43460a.f(this, this.d);
        this.f43460a.setCloseListener(this.C0);
        WebSettings settings = this.f43460a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f43479o0) {
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
            if (this.f43479o0) {
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
        this.f43460a.setVerticalScrollBarEnabled(false);
        if (y0Var == null && this.f43479o0) {
            this.f43460a.setAlpha(0.0f);
        }
        addView(this.f43460a);
        if (this.f43479o0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f43483r0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f43483r0 == null) {
                ?? obj2 = new Object();
                obj2.f43437a = this;
                this.f43483r0 = obj2;
            }
            this.f43483r0.f43437a = this;
            V();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f43487u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f43487u0;
            if (botWebViewContainer$WebViewProxy == null) {
                y0 y0Var4 = this.f43460a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(y0Var4, this);
                this.f43487u0 = botWebViewContainer$WebViewProxy2;
                y0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (y0Var == null) {
                this.f43460a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f43487u0.f43438a = this;
        }
        J(this.f43460a);
        P0 = false;
    }

    public final void X(int i10, org.telegram.ui.ActionBar.a2 a2Var, Runnable runnable) {
        if (a2Var != null && !m(i10)) {
            a2Var.setOnDismissListener(new ei.e0(14, this, runnable));
            this.f43465c0 = a2Var;
            a2Var.f20427h0 = false;
            a2Var.show();
            if (this.K0 != i10) {
                this.K0 = i10;
                this.L0 = 0;
                this.M0 = 0L;
            }
            this.L0++;
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
        if (this.f43460a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.f43484s.setVisibility(8);
                this.h = true;
                this.f43469f.setVisibility(0);
                y0 y0Var = this.f43460a;
                if (y0Var != null) {
                    removeView(y0Var);
                }
            }
        }
    }

    public final void d(ea eaVar, ei.t1 t1Var, String str, String str2, String str3) {
        if (t1Var != null && this.U != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    t1Var.m(new JSONObject());
                    x(eaVar, str2, A(string, "req_id"));
                } catch (RuntimeException e7) {
                    x(eaVar, str3, B("req_id", string, "error", e7.getMessage()));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    x(eaVar, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        bf0 bf0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            y0 y0Var = this.f43460a;
            if (y0Var != null) {
                y0Var.setBackgroundColor(j(h6.f20822d6));
            }
            if (!this.f43481q0) {
                int i12 = h6.Ki;
                int j3 = j(i12);
                this.f43480p0 = j3;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN);
                z5 z5Var = this.f43484s;
                z5Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f43482r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.f43480p0);
                    this.f43482r.setupGradient(i12, this.f43467e, 1.0f, false);
                }
                z5Var.invalidate();
            }
            z();
        } else if (i10 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f43491x != null) {
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
                    this.f43491x.onReceiveValue(uriArr);
                    this.f43491x = null;
                }
                uriArr = null;
                this.f43491x.onReceiveValue(uriArr);
                this.f43491x = null;
            }
        } else if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (bf0Var = this.V) != null) {
                bf0Var.run();
                this.V = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f43484s) {
            if (this.v) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (this.v) {
                canvas.restore();
            }
            if (!this.v) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.f43477n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f43469f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f43460a) {
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

    public final void e() {
        if (this.U == null) {
            return;
        }
        ei.r rVar = this.f43474j0;
        if (rVar == null) {
            this.f43474j0 = ei.r.c(getContext(), this.M, this.U.f20215id);
        } else {
            rVar.h();
        }
    }

    public final ea f() {
        y0 y0Var = this.f43460a;
        long j3 = this.f43485s0;
        boolean z10 = this.f43486t0;
        String str = this.F0;
        ?? obj = new Object();
        obj.f918c = this;
        obj.d = y0Var;
        obj.f916a = j3;
        obj.f917b = z10;
        obj.f919e = str;
        return obj;
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.N0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f43483r0;
    }

    public int getMinHeight() {
        if (getParent() instanceof o4) {
            o4 o4Var = (o4) getParent();
            if (o4Var.J) {
                return (int) ((o4Var.getMeasuredHeight() - o4Var.getOffsetY()) + this.f43495z0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        y0 y0Var = this.f43460a;
        if (y0Var == null) {
            return null;
        }
        return k(y0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f43487u0;
    }

    public String getTrustedOrigin() {
        return this.F0;
    }

    public String getUrlLoaded() {
        return this.f43462b;
    }

    public y0 getWebView() {
        return this.f43460a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.B0);
        y0 y0Var = this.f43460a;
        if (y0Var != null) {
            if (y0Var.getParent() != null) {
                removeView(this.f43460a);
            }
            if (!this.B0) {
                this.f43460a.destroy();
                K(this.f43460a);
            }
            this.N = false;
            if (this.f43474j0 != null) {
                this.f43474j0 = null;
            }
            if (this.m0 != null) {
                this.m0 = null;
            }
            if (this.f43478n0 != null) {
                this.f43478n0 = null;
            }
            ei.w0 w0Var = this.f43475k0;
            if (w0Var != null) {
                w0Var.f9455f.remove(this.J0);
                this.f43475k0 = null;
                this.I0 = null;
            }
        }
    }

    public final void i(String str) {
        new ad(this, this.f43467e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i10) {
        d6 d6Var = this.f43467e;
        if (d6Var != null) {
            return d6Var.x0(i10);
        }
        return h6.x0(null, i10, false);
    }

    public final void l(ea eaVar, ei.t1 t1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (t1Var != null && this.U != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        x(eaVar, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        Pair f7 = t1Var.f(optString);
                        if (t1Var.d && (obj = f7.first) == null) {
                            Object obj2 = f7.second;
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("req_id", string);
                                jSONObject.put("value", obj);
                                jSONObject.put("can_restore", obj2);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            x(eaVar, str2, jSONObject);
                            return;
                        }
                        x(eaVar, str2, B("req_id", string, "value", f7.first));
                    } catch (RuntimeException e7) {
                        x(eaVar, str3, B("req_id", string, "error", e7.getMessage()));
                    }
                } catch (Exception unused2) {
                    x(eaVar, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    x(eaVar, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean m(int i10) {
        if (this.f43465c0 != null || (this.M0 > 0 && System.currentTimeMillis() < this.M0)) {
            return true;
        }
        if (this.K0 != i10 || this.L0 <= 3) {
            return false;
        }
        this.M0 = System.currentTimeMillis() + 3000;
        this.L0 = 0;
        return true;
    }

    public final void n(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        invalidate();
        if ((this.N || z11) && (z12 = this.f43479o0) && (getParent() instanceof o4)) {
            o4 o4Var = (o4) getParent();
            if (z10) {
                if (o4Var.getSwipeOffsetY() == o4Var.getTopActionBarOffsetY() + (-o4Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.O = z13;
            }
            int max = Math.max(getMinHeight(), (int) (o4Var.getTopActionBarOffsetY() + ((o4Var.getMeasuredHeight() - o4Var.getOffsetY()) - o4Var.getSwipeOffsetY()) + this.f43495z0));
            if (z11 || max != this.f43490w0 || this.f43492x0 != z10 || this.f43494y0 != this.O) {
                this.f43490w0 = max;
                this.f43492x0 = z10;
                this.f43494y0 = this.O;
                String str = "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.O + "}";
                if (z12 && !q()) {
                    g("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    NotificationCenter.getInstance(this.M).doOnIdle(new x(this, a1.g.q("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
                }
            }
        }
    }

    public final boolean o(ea eaVar) {
        boolean z10;
        if (eaVar != null) {
            String str = (String) eaVar.f919e;
            if (((b1) eaVar.f918c) == this && ((y0) eaVar.d) == this.f43460a && eaVar.f916a == this.f43485s0 && (z10 = eaVar.f917b) == this.f43486t0) {
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

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        sc.a(this, new x4(this, 9));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        sc.h(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.A0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
        this.f43477n.f32065f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.f43461a0) {
            n(true, false);
        }
    }

    public final boolean q() {
        if (this.f43460a == null) {
            return false;
        }
        if (this.f43486t0) {
            if (TextUtils.isEmpty(this.F0) || !TextUtils.equals(this.F0, getOriginHost())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean r() {
        if (this.O0 != null) {
            return true;
        }
        return false;
    }

    public final void s(int i10, long j3) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
        String publicUsername = UserObject.getPublicUsername(user);
        z5 z5Var = this.f43484s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            z5Var.setVisibility(0);
            z5Var.setAlpha(1.0f);
            z5Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(h6.f20766a7))));
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
                z5Var.setVisibility(0);
                z5Var.setAlpha(1.0f);
                z5Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        d6 d6Var = this.f43467e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            z5Var.setVisibility(0);
            z5Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f43482r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.f43480p0);
                this.f43482r.setupGradient(h6.Ki, d6Var, 1.0f, false);
            }
            z5Var.f(null, null, this.f43482r);
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
        z5Var.setVisibility(0);
        z5Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.f43482r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.f43480p0);
            this.f43482r.setupGradient(h6.Ki, d6Var, 1.0f, false);
        }
        z5Var.f(null, null, this.f43482r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.U = user;
    }

    public void setDelegate(g0 g0Var) {
        this.f43464c = g0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.7f) {
            b10 = h6.b(0.0f, -0.15f, i10);
        } else {
            b10 = h6.b(0.025f, 0.15f, i10);
        }
        if (this.f43480p0 == b10) {
            return;
        }
        this.f43480p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        z5 z5Var = this.f43484s;
        z5Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f43482r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.f43480p0);
            this.f43482r.setupGradient(h6.Ki, this.f43467e, 1.0f, false);
        }
        this.f43481q0 = true;
        z5Var.invalidate();
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
        y0 y0Var = this.f43460a;
        if (y0Var != null) {
            y0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.O0 = callback4;
    }

    public void setOpener(y0 y0Var) {
        y0 y0Var2;
        this.f43488v0 = y0Var;
        if (!this.f43479o0 && (y0Var2 = this.f43460a) != null) {
            y0Var2.f43767f = y0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f43461a0 = z10;
    }

    public void setViewPortHeightOffset(float f7) {
        this.f43495z0 = f7;
    }

    public void setWasOpenedByBot(e5 e5Var) {
        this.E0 = e5Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.D0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f43489w = aVar;
    }

    public void setWebViewScrollListener(a1 a1Var) {
        this.d = a1Var;
        y0 y0Var = this.f43460a;
        if (y0Var != null) {
            y0Var.f(this, a1Var);
        }
    }

    public final void t(int i10, String str, boolean z10) {
        String str2;
        this.M = i10;
        if (this.f43479o0) {
            this.f43485s0++;
            this.f43486t0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.F0 = str2;
            if (this.f43460a != null) {
                V();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new x(this, str, 1));
    }

    public final void v(ea eaVar) {
        if (this.U != null) {
            e();
            ei.r rVar = this.f43474j0;
            if (rVar == null) {
                return;
            }
            try {
                x(eaVar, "biometry_info_received", rVar.f());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void x(ea eaVar, String str, JSONObject jSONObject) {
        if (!o(eaVar)) {
            g("notifyEvent " + str + " dropped after document change");
            return;
        }
        y(str, jSONObject);
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.f43479o0 && !q()) {
            g("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        g("notifyEvent " + str);
        NotificationCenter.getInstance(this.M).doOnIdle(new x(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject q6;
        try {
            q6 = k3.q(this.f43467e, true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (q6 != null) {
            jSONObject = new JSONObject().put("theme_params", q6);
            y("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        y("theme_changed", jSONObject);
    }

    public void K(y0 y0Var) {
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
