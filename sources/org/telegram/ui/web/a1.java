package org.telegram.ui.web;

import ai.z3;
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
import ci.c4;
import ci.k4;
import ci.z7;
import gi.d3;
import gi.e4;
import gi.t4;
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
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.d9;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.s9;
import org.telegram.ui.tf1;
import w7.z5;
public abstract class a1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean P0 = true;
    public static int Q0;
    public static HashMap R0;
    public int A0;
    public boolean B0;
    public Runnable C0;
    public boolean D0;
    public int E;
    public t4 E0;
    public String F;
    public String F0;
    public String G;
    public final Rect G0;
    public int H;
    public int H0;
    public int I;
    public z7 I0;
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
    public by0 V;
    public Activity W;
    public x0 f42555a;
    public boolean f42556a0;
    public String f42557b;
    public String f42558b0;
    public g0 f42559c;
    public org.telegram.ui.ActionBar.b2 f42560c0;
    public z0 d;
    public int f42561d0;
    public final d6 e;
    public long f42562e0;
    public final TextView f42563f;
    public long f42564f0;
    public s9 f42565g0;
    public boolean h;
    public boolean f42566h0;
    public String f42567i0;
    public gi.r f42568j0;
    public gi.u0 f42569k0;
    public gi.j0 f42570l0;
    public gi.p1 m0;
    public final org.telegram.ui.Components.voip.h f42571n;
    public gi.p1 f42572n0;
    public final boolean f42573o0;
    public int f42574p0;
    public boolean f42575q0;
    public SvgHelper.SvgDrawable f42576r;
    public BotWebViewContainer$BotWebViewProxy f42577r0;
    public final k4 f42578s;
    public long f42579s0;
    public boolean f42580t0;
    public BotWebViewContainer$WebViewProxy f42581u0;
    public boolean v;
    public x0 f42582v0;
    public q0.a f42583w;
    public int f42584w0;
    public ValueCallback f42585x;
    public boolean f42586x0;
    public int f42587y;
    public boolean f42588y0;
    public float f42589z0;

    public a1(int i10, Context context, d6 d6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f42571n = hVar;
        int i11 = h6.Oh;
        this.f42587y = j(i11);
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
        this.J0 = new t(this, 1);
        this.K0 = -1;
        this.L0 = 0;
        int i13 = Q0;
        Q0 = i13 + 1;
        this.N0 = i13;
        this.f42573o0 = z10;
        this.e = d6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        hVar.f31480k = false;
        hVar.b(i10, 153);
        k4 k4Var = new k4(this, context);
        this.f42578s = k4Var;
        int j10 = j(h6.Ki);
        this.f42574p0 = j10;
        k4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        k4Var.getImageReceiver().setAspectFit(true);
        addView(k4Var, z5.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f42563f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(j(h6.f21375y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, z5.e(-1, -2, 17));
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
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(pf.d.u(Uri.parse(str2), "https", null, S(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
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
                a1Var.V = new by0(a1Var, aVar, strArr, 7);
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
            if (R0 == null) {
                R0 = new HashMap();
            }
            R0.put(S, hostAuthority);
            return pf.d.u(Uri.parse(str), "https", null, S, null);
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
        k4 k4Var = this.f42578s;
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
        if (R0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority != null) {
            if (hostAuthority.endsWith("." + MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress) && (str2 = (String) R0.get(hostAuthority)) != null) {
                return pf.d.u(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void w(int i10, x0 x0Var, z7 z7Var, String str, JSONObject jSONObject) {
        if (x0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new fn0(x0Var, z7Var, str, jSONObject, 25));
    }

    public final boolean C() {
        if (this.f42555a != null && this.R) {
            y("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r55, final ci.z7 r56, java.lang.String r57, java.lang.String r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a1.E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, ci.z7, java.lang.String, java.lang.String):void");
    }

    public final void F(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f42558b0, str)) {
                this.f42558b0 = null;
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
        if (pf.d.e(uri, false, zArr) && !zArr[0] && this.f42559c != null) {
            setKeyboardFocusable(false);
        }
        pf.d.q(getContext(), uri, true, z10, false, null, str, false, true, z12);
    }

    public abstract void J(x0 x0Var);

    public final void L() {
        g("preserveWebView");
        this.B0 = true;
        if (this.f42573o0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.f42579s0++;
        }
        x0 x0Var = this.f42555a;
        if (x0Var != null) {
            x0Var.f(null, null);
            this.f42555a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f42577r0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f42544a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f42581u0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f42545a = null;
        }
    }

    public final void N(int i10, x0 x0Var, Object obj, String str, boolean z10) {
        String str2;
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.f42573o0;
        if (z11) {
            this.f42579s0++;
            this.f42580t0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.F0 = str2;
        }
        W(x0Var, obj);
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
                E(this.f42577r0, f(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                E(this.f42577r0, f(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void R(z7 z7Var, gi.p1 p1Var, String str) {
        d6 d6Var;
        boolean z10;
        if (p1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(z7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = p1Var.h(optString);
                        if (h.isEmpty()) {
                            x(z7Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        a0 a0Var = new a0(this, z7Var, string, p1Var, optString);
                        n2 U = LaunchActivity.U();
                        if (U != null) {
                            d6Var = U.getResourceProvider();
                        } else {
                            d6Var = null;
                        }
                        int i10 = 1;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        f3 i11 = kk.i(1, context, d6Var, false);
                        ViewGroup e = kk.e(context, 1);
                        w9 w9Var = new w9(context);
                        ArrayList arrayList = h;
                        TLRPC.User user = MessagesController.getInstance(p1Var.f11378a).getUser(Long.valueOf(p1Var.f11379b));
                        h9 h9Var = new h9((d6) null);
                        h9Var.r(user);
                        w9Var.e(user, h9Var);
                        e.addView(w9Var, z5.t(80, 80, 49, 0, 21, 0, 13));
                        int i12 = h6.G6;
                        TextView b10 = w7.d6.b(context, 20.0f, i12, true, null);
                        kk.m(R.string.BotRestoreStorageTitle, b10, 17);
                        e.addView(b10, z5.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = w7.d6.b(context, 14.0f, i12, false, null);
                        b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        b11.setGravity(17);
                        e.addView(b11, z5.t(-1, -2, 7, 32, 0, 32, 19));
                        d9 d9Var = new d9(context, d6Var);
                        d9Var.setBackground(new zq(new ColorDrawable(h6.w0(h6.f20929a7, d6Var)), h6.V0(context, R.drawable.greydivider, h6.w0(h6.f20949b7, d6Var))));
                        d9Var.setFixedSize(12);
                        e.addView(d9Var, z5.t(-1, 12, 7, 0, 0, 0, 0));
                        l4 l4Var = new l4(context, d6Var);
                        l4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        e.addView(l4Var, z5.t(-1, -2, 7, 0, 0, 0, 0));
                        ei.d dVar = new ei.d(context, d6Var, true);
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            ArrayList arrayList3 = arrayList;
                            gi.o1 o1Var = (gi.o1) arrayList3.get(i13);
                            if (i13 < arrayList3.size() - i10) {
                                z10 = i10;
                            } else {
                                z10 = 0;
                            }
                            gi.n1 n1Var = new gi.n1(o1Var, z10, context);
                            n1Var.setBackground(h6.g0(h6.w0(h6.f21076i6, d6Var), 2, -1));
                            ViewGroup viewGroup = e;
                            n1Var.setOnClickListener(new c4(strArr, o1Var, arrayList2, dVar, 2));
                            viewGroup.addView(n1Var, z5.n(-1, 56));
                            arrayList2.add(n1Var);
                            i13++;
                            i11 = i11;
                            arrayList = arrayList3;
                            e = viewGroup;
                            a0Var = a0Var;
                            i10 = 1;
                        }
                        a0 a0Var2 = a0Var;
                        f3 f3Var = i11;
                        ViewGroup viewGroup2 = e;
                        boolean z11 = false;
                        dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                        if (strArr[0] != null) {
                            z11 = true;
                        }
                        dVar.setEnabled(z11);
                        viewGroup2.addView(dVar, z5.t(-1, 48, 7, 8, 8, 8, 4));
                        f3Var.customView = viewGroup2;
                        f3Var.fixNavigationBar(h6.w0(h6.f21058h5, d6Var));
                        dVar.setOnClickListener(new c4(zArr, a0Var2, strArr, f3Var, 3));
                        f3Var.setOnDismissListener(new z3(3, zArr, a0Var2));
                        f3Var.show();
                    } catch (Exception e7) {
                        x(z7Var, "secure_storage_failed", B("req_id", string, "error", e7.getMessage()));
                    }
                } catch (Exception unused) {
                    x(z7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    x(z7Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void T(String str, boolean z10) {
        boolean z11;
        boolean z12;
        x0 x0Var = this.f42555a;
        if (x0Var != null) {
            boolean z13 = x0Var.E;
        }
        if (x0Var != null && x0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        x0 x0Var2 = this.f42555a;
        if (x0Var2 != null && x0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        I(z11, z12);
        x0 x0Var3 = this.f42555a;
        if (x0Var3 != null) {
            x0Var3.f42840b = true;
        }
        if (this.N) {
            g("setPageLoaded: already loaded");
            return;
        }
        k4 k4Var = this.f42578s;
        if (z10 && x0Var3 != null && k4Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f42555a, property, 1.0f), ObjectAnimator.ofFloat(k4Var, property, 0.0f));
            animatorSet.addListener(new tf1(this, 11));
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
        this.f42557b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.f42559c.getClass();
    }

    public final void U(z7 z7Var, gi.p1 p1Var, String str, String str2, String str3) {
        if (p1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(z7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            p1Var.n(optString, jSONObject.optString("value"));
                            x(z7Var, str2, A(string, "req_id"));
                        } catch (RuntimeException e) {
                            x(z7Var, str3, B("req_id", string, "error", e.getMessage()));
                        }
                    } catch (Exception unused) {
                        x(z7Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    x(z7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    x(z7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void V() {
        x0 x0Var = this.f42555a;
        if (x0Var != null && this.f42573o0) {
            x0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!a.a.a("WEB_MESSAGE_LISTENER")) {
                g("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            x0 x0Var2 = this.f42555a;
            if (!x0Var2.R) {
                a5.c.a(x0Var2, "TelegramWebviewProxyMessage", singleton, new j5.b(x0Var2, 27));
                this.f42555a.R = true;
            }
            if (a.a.a("DOCUMENT_START_SCRIPT")) {
                x0 x0Var3 = this.f42555a;
                if (x0Var3.S == null) {
                    boolean z10 = a5.c.f283a;
                    if (b5.m.d.b()) {
                        x0Var3.S = new a4.l((ScriptHandlerBoundaryInterface) androidx.activity.result.c.a(ScriptHandlerBoundaryInterface.class, a5.c.c(x0Var3).f4209a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 5);
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
        x0 x0Var3 = this.f42555a;
        if (x0Var3 != null) {
            x0Var3.destroy();
            removeView(this.f42555a);
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
            boolean z11 = this.f42573o0;
            long j10 = 0;
            if (z11 && (user = this.U) != null) {
                j10 = user.f20420id;
            }
            x0Var2 = new x0(context, z11, j10);
        } else {
            x0Var2 = x0Var;
        }
        this.f42555a = x0Var2;
        if (!this.f42573o0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f42555a, true);
            CookieManager.getInstance().flush();
            this.f42555a.f42842f = this.f42582v0;
        } else {
            x0Var2.setBackgroundColor(j(h6.f20987d6));
        }
        if (!MessagesController.getInstance(this.M).disableBotFullscreenBlur) {
            this.f42555a.setLayerType(2, null);
        }
        this.f42555a.f(this, this.d);
        this.f42555a.setCloseListener(this.C0);
        WebSettings settings = this.f42555a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f42573o0) {
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
            if (this.f42573o0) {
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
        this.f42555a.setVerticalScrollBarEnabled(false);
        if (x0Var == null && this.f42573o0) {
            this.f42555a.setAlpha(0.0f);
        }
        addView(this.f42555a);
        if (this.f42573o0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f42577r0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f42577r0 == null) {
                ?? obj2 = new Object();
                obj2.f42544a = this;
                this.f42577r0 = obj2;
            }
            this.f42577r0.f42544a = this;
            V();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f42581u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f42581u0;
            if (botWebViewContainer$WebViewProxy == null) {
                x0 x0Var4 = this.f42555a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(x0Var4, this);
                this.f42581u0 = botWebViewContainer$WebViewProxy2;
                x0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (x0Var == null) {
                this.f42555a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f42581u0.f42545a = this;
        }
        J(this.f42555a);
        P0 = false;
    }

    public final void X(int i10, org.telegram.ui.ActionBar.b2 b2Var, Runnable runnable) {
        if (b2Var != null && !m(i10)) {
            b2Var.setOnDismissListener(new z3(16, this, runnable));
            this.f42560c0 = b2Var;
            b2Var.f20663h0 = false;
            b2Var.show();
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
        if (this.f42555a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.f42578s.setVisibility(8);
                this.h = true;
                this.f42563f.setVisibility(0);
                x0 x0Var = this.f42555a;
                if (x0Var != null) {
                    removeView(x0Var);
                }
            }
        }
    }

    public final void d(z7 z7Var, gi.p1 p1Var, String str, String str2, String str3) {
        if (p1Var != null && this.U != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    p1Var.m(new JSONObject());
                    x(z7Var, str2, A(string, "req_id"));
                } catch (RuntimeException e) {
                    x(z7Var, str3, B("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    x(z7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        by0 by0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            x0 x0Var = this.f42555a;
            if (x0Var != null) {
                x0Var.setBackgroundColor(j(h6.f20987d6));
            }
            if (!this.f42575q0) {
                int i12 = h6.Ki;
                int j10 = j(i12);
                this.f42574p0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                k4 k4Var = this.f42578s;
                k4Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f42576r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.f42574p0);
                    this.f42576r.setupGradient(i12, this.e, 1.0f, false);
                }
                k4Var.invalidate();
            }
            z();
        } else if (i10 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f42585x != null) {
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
                    this.f42585x.onReceiveValue(uriArr);
                    this.f42585x = null;
                }
                uriArr = null;
                this.f42585x.onReceiveValue(uriArr);
                this.f42585x = null;
            }
        } else if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (by0Var = this.V) != null) {
                by0Var.run();
                this.V = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f42578s) {
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
                this.f42571n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f42563f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f42555a) {
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
        gi.r rVar = this.f42568j0;
        if (rVar == null) {
            this.f42568j0 = gi.r.c(getContext(), this.M, this.U.f20420id);
        } else {
            rVar.h();
        }
    }

    public final z7 f() {
        x0 x0Var = this.f42555a;
        long j10 = this.f42579s0;
        boolean z10 = this.f42580t0;
        String str = this.F0;
        ?? obj = new Object();
        obj.f6256c = this;
        obj.d = x0Var;
        obj.f6254a = j10;
        obj.f6255b = z10;
        obj.e = str;
        return obj;
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.N0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f42577r0;
    }

    public int getMinHeight() {
        if (getParent() instanceof e4) {
            e4 e4Var = (e4) getParent();
            if (e4Var.J) {
                return (int) ((e4Var.getMeasuredHeight() - e4Var.getOffsetY()) + this.f42589z0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        x0 x0Var = this.f42555a;
        if (x0Var == null) {
            return null;
        }
        return k(x0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f42581u0;
    }

    public String getTrustedOrigin() {
        return this.F0;
    }

    public String getUrlLoaded() {
        return this.f42557b;
    }

    public x0 getWebView() {
        return this.f42555a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.B0);
        x0 x0Var = this.f42555a;
        if (x0Var != null) {
            if (x0Var.getParent() != null) {
                removeView(this.f42555a);
            }
            if (!this.B0) {
                this.f42555a.destroy();
                K(this.f42555a);
            }
            this.N = false;
            if (this.f42568j0 != null) {
                this.f42568j0 = null;
            }
            if (this.m0 != null) {
                this.m0 = null;
            }
            if (this.f42572n0 != null) {
                this.f42572n0 = null;
            }
            gi.u0 u0Var = this.f42569k0;
            if (u0Var != null) {
                u0Var.f11497f.remove(this.J0);
                this.f42569k0 = null;
                this.I0 = null;
            }
        }
    }

    public final void i(String str) {
        new xc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i10) {
        d6 d6Var = this.e;
        if (d6Var != null) {
            return d6Var.w(i10);
        }
        return h6.x0(null, i10, false);
    }

    public final void l(z7 z7Var, gi.p1 p1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (p1Var != null && this.U != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        x(z7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        Pair f7 = p1Var.f(optString);
                        if (p1Var.d && (obj = f7.first) == null) {
                            Object obj2 = f7.second;
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("req_id", string);
                                jSONObject.put("value", obj);
                                jSONObject.put("can_restore", obj2);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            x(z7Var, str2, jSONObject);
                            return;
                        }
                        x(z7Var, str2, B("req_id", string, "value", f7.first));
                    } catch (RuntimeException e) {
                        x(z7Var, str3, B("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused2) {
                    x(z7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    x(z7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean m(int i10) {
        if (this.f42560c0 != null || (this.M0 > 0 && System.currentTimeMillis() < this.M0)) {
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
        if ((this.N || z11) && (z12 = this.f42573o0) && (getParent() instanceof e4)) {
            e4 e4Var = (e4) getParent();
            if (z10) {
                if (e4Var.getSwipeOffsetY() == e4Var.getTopActionBarOffsetY() + (-e4Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.O = z13;
            }
            int max = Math.max(getMinHeight(), (int) (e4Var.getTopActionBarOffsetY() + ((e4Var.getMeasuredHeight() - e4Var.getOffsetY()) - e4Var.getSwipeOffsetY()) + this.f42589z0));
            if (z11 || max != this.f42584w0 || this.f42586x0 != z10 || this.f42588y0 != this.O) {
                this.f42584w0 = max;
                this.f42586x0 = z10;
                this.f42588y0 = this.O;
                String str = "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.O + "}";
                if (z12 && !q()) {
                    g("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    NotificationCenter.getInstance(this.M).doOnIdle(new y(this, a1.g.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
                }
            }
        }
    }

    public final boolean o(z7 z7Var) {
        boolean z10;
        if (z7Var != null) {
            String str = (String) z7Var.e;
            if (((a1) z7Var.f6256c) == this && ((x0) z7Var.d) == this.f42555a && z7Var.f6254a == this.f42579s0 && (z10 = z7Var.f6255b) == this.f42580t0) {
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
        qc.a(this, new ah.m0(this, 10));
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
        this.f42571n.f31476f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.f42556a0) {
            n(true, false);
        }
    }

    public final boolean q() {
        if (this.f42555a == null) {
            return false;
        }
        if (this.f42580t0) {
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

    public final void s(int i10, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
        String publicUsername = UserObject.getPublicUsername(user);
        k4 k4Var = this.f42578s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            k4Var.setVisibility(0);
            k4Var.setAlpha(1.0f);
            k4Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(h6.f20929a7))));
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
        d6 d6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            k4Var.setVisibility(0);
            k4Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f42576r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.f42574p0);
                this.f42576r.setupGradient(h6.Ki, d6Var, 1.0f, false);
            }
            k4Var.f(null, null, this.f42576r);
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
        this.f42576r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.f42574p0);
            this.f42576r.setupGradient(h6.Ki, d6Var, 1.0f, false);
        }
        k4Var.f(null, null, this.f42576r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.U = user;
    }

    public void setDelegate(g0 g0Var) {
        this.f42559c = g0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.7f) {
            b10 = h6.b(0.0f, -0.15f, i10);
        } else {
            b10 = h6.b(0.025f, 0.15f, i10);
        }
        if (this.f42574p0 == b10) {
            return;
        }
        this.f42574p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        k4 k4Var = this.f42578s;
        k4Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f42576r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.f42574p0);
            this.f42576r.setupGradient(h6.Ki, this.e, 1.0f, false);
        }
        this.f42575q0 = true;
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
        this.C0 = runnable;
        x0 x0Var = this.f42555a;
        if (x0Var != null) {
            x0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.O0 = callback4;
    }

    public void setOpener(x0 x0Var) {
        x0 x0Var2;
        this.f42582v0 = x0Var;
        if (!this.f42573o0 && (x0Var2 = this.f42555a) != null) {
            x0Var2.f42842f = x0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f42556a0 = z10;
    }

    public void setViewPortHeightOffset(float f7) {
        this.f42589z0 = f7;
    }

    public void setWasOpenedByBot(t4 t4Var) {
        this.E0 = t4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.D0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f42583w = aVar;
    }

    public void setWebViewScrollListener(z0 z0Var) {
        this.d = z0Var;
        x0 x0Var = this.f42555a;
        if (x0Var != null) {
            x0Var.f(this, z0Var);
        }
    }

    public final void t(int i10, String str, boolean z10) {
        String str2;
        this.M = i10;
        if (this.f42573o0) {
            this.f42579s0++;
            this.f42580t0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.F0 = str2;
            if (this.f42555a != null) {
                V();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new y(this, str, 1));
    }

    public final void v(z7 z7Var) {
        if (this.U != null) {
            e();
            gi.r rVar = this.f42568j0;
            if (rVar == null) {
                return;
            }
            try {
                x(z7Var, "biometry_info_received", rVar.f());
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void x(z7 z7Var, String str, JSONObject jSONObject) {
        if (!o(z7Var)) {
            g("notifyEvent " + str + " dropped after document change");
            return;
        }
        y(str, jSONObject);
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.f42573o0 && !q()) {
            g("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        g("notifyEvent " + str);
        NotificationCenter.getInstance(this.M).doOnIdle(new y(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject q6;
        try {
            q6 = d3.q(this.e, true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (q6 != null) {
            jSONObject = new JSONObject().put("theme_params", q6);
            y("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        y("theme_changed", jSONObject);
    }

    public void H() {
    }

    public void K(x0 x0Var) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void D(boolean z10, String str) {
    }

    public void I(boolean z10, boolean z11) {
    }
}
