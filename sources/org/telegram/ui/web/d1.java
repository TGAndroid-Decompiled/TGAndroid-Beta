package org.telegram.ui.web;

import ai.da;
import ai.p5;
import ai.w4;
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
import ei.f5;
import ei.k3;
import ei.p4;
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
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fs0;
import org.telegram.ui.gp0;
import org.telegram.ui.r9;
import w7.d6;
import w7.y5;
public abstract class d1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean P0 = true;
    public static int Q0;
    public static HashMap R0;
    public int A0;
    public boolean B0;
    public Runnable C0;
    public boolean D0;
    public int E;
    public f5 E0;
    public String F;
    public String F0;
    public String G;
    public final Rect G0;
    public int H;
    public int H0;
    public int I;
    public da I0;
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
    public cn0 V;
    public Activity W;
    public z0 f38851a;
    public boolean f38852a0;
    public String f38853b;
    public String f38854b0;
    public h0 f38855c;
    public org.telegram.ui.ActionBar.b2 f38856c0;
    public c1 d;
    public int f38857d0;
    public final f6 e;
    public long f38858e0;
    public final TextView f38859f;
    public long f38860f0;
    public r9 f38861g0;
    public boolean h;
    public boolean f38862h0;
    public String f38863i0;
    public ei.r f38864j0;
    public ei.w0 f38865k0;
    public ei.l0 f38866l0;
    public ei.t1 m0;
    public final org.telegram.ui.Components.voip.h f38867n;
    public ei.t1 f38868n0;
    public final boolean f38869o0;
    public int f38870p0;
    public boolean f38871q0;
    public SvgHelper.SvgDrawable f38872r;
    public BotWebViewContainer$BotWebViewProxy f38873r0;
    public final z5 f38874s;
    public long f38875s0;
    public boolean f38876t0;
    public BotWebViewContainer$WebViewProxy f38877u0;
    public boolean v;
    public z0 f38878v0;
    public q0.a f38879w;
    public int f38880w0;
    public ValueCallback f38881x;
    public boolean f38882x0;
    public int f38883y;
    public boolean f38884y0;
    public float f38885z0;

    public d1(int i10, Context context, f6 f6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f38867n = hVar;
        int i11 = j6.Oh;
        this.f38883y = k(i11);
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
        this.f38869o0 = z10;
        this.e = f6Var;
        h("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        hVar.f29372k = false;
        hVar.b(i10, 153);
        z5 z5Var = new z5(this, context);
        this.f38874s = z5Var;
        int k10 = k(j6.Ki);
        this.f38870p0 = k10;
        z5Var.setColorFilter(new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN));
        z5Var.getImageReceiver().setAspectFit(true);
        addView(z5Var, y5.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f38859f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(k(j6.f19477y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, y5.e(-1, -2, 17));
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

    public static void a(d1 d1Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            d1Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else if (d1Var.d(strArr)) {
            aVar.accept(Boolean.TRUE);
        } else {
            d1Var.V = new cn0(d1Var, aVar, strArr, 19);
            Activity activity = d1Var.W;
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
        z5 z5Var = this.f38874s;
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

    private void setupWebView(z0 z0Var) {
        X(z0Var, null);
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

    public static void x(int i10, z0 z0Var, da daVar, String str, JSONObject jSONObject) {
        if (z0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new fs0(z0Var, daVar, str, jSONObject, 21));
    }

    public final void A() {
        JSONObject jSONObject;
        JSONObject p5;
        try {
            p5 = k3.p(this.e, true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (p5 != null) {
            jSONObject = new JSONObject().put("theme_params", p5);
            z("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        z("theme_changed", jSONObject);
    }

    public final boolean D() {
        if (this.f38851a != null && this.R) {
            z("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r56, final ai.da r57, java.lang.String r58, java.lang.String r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.d1.F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, ai.da, java.lang.String, java.lang.String):void");
    }

    public final void G(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            z("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f38854b0, str)) {
                this.f38854b0 = null;
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
        if (nf.f.f(uri, false, zArr) && !zArr[0] && this.f38855c != null) {
            setKeyboardFocusable(false);
        }
        nf.f.r(getContext(), uri, true, z10, false, null, str, false, true, z12);
    }

    public abstract void K(z0 z0Var);

    public final void M() {
        h("preserveWebView");
        this.B0 = true;
        if (this.f38869o0) {
            z("visibility_changed", B(Boolean.FALSE, "is_visible"));
            this.f38875s0++;
        }
        z0 z0Var = this.f38851a;
        if (z0Var != null) {
            z0Var.f(null, null);
            this.f38851a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f38873r0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f38810a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f38877u0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f38811a = null;
        }
    }

    public final void O(int i10, z0 z0Var, Object obj, String str, boolean z10) {
        String str2;
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.f38869o0;
        if (z11) {
            this.f38875s0++;
            this.f38876t0 = z10;
            if (z10) {
                str2 = l(str);
            } else {
                str2 = null;
            }
            this.F0 = str2;
        }
        X(z0Var, obj);
        if (z11) {
            z("visibility_changed", B(Boolean.TRUE, "is_visible"));
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
        z("content_safe_area_changed", jSONObject);
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
                z("safe_area_changed", jSONObject);
                rect2.set(rect);
            }
        }
    }

    public final void R() {
        try {
            if (this.G != null) {
                F(this.f38873r0, g(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                F(this.f38873r0, g(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void S(da daVar, ei.t1 t1Var, String str) {
        f6 f6Var;
        boolean z10;
        boolean z11;
        if (t1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        y(daVar, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = t1Var.h(optString);
                        if (h.isEmpty()) {
                            y(daVar, "secure_storage_failed", C("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        a0 a0Var = new a0(this, daVar, string, t1Var, optString);
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            f6Var = U.getResourceProvider();
                        } else {
                            f6Var = null;
                        }
                        int i10 = 1;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        f3 j3 = rk.j(1, context, f6Var, false);
                        ViewGroup f7 = rk.f(context, 1);
                        v9 v9Var = new v9(context);
                        TLRPC.User user = MessagesController.getInstance(t1Var.f8621a).getUser(Long.valueOf(t1Var.f8622b));
                        g9 g9Var = new g9((f6) null);
                        g9Var.r(user);
                        v9Var.e(user, g9Var);
                        f7.addView(v9Var, y5.t(80, 80, 49, 0, 21, 0, 13));
                        int i11 = j6.G6;
                        TextView b10 = d6.b(context, 20.0f, i11, true, null);
                        rk.l(R.string.BotRestoreStorageTitle, b10, 17);
                        f7.addView(b10, y5.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = d6.b(context, 14.0f, i11, false, null);
                        b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        b11.setGravity(17);
                        f7.addView(b11, y5.t(-1, -2, 7, 32, 0, 32, 19));
                        f9 f9Var = new f9(context, f6Var);
                        f9Var.setBackground(new pq(new ColorDrawable(j6.v0(j6.f19038a7, f6Var)), j6.U0(context, R.drawable.greydivider, j6.v0(j6.f19058b7, f6Var))));
                        f9Var.setFixedSize(12);
                        f7.addView(f9Var, y5.t(-1, 12, 7, 0, 0, 0, 0));
                        n4 n4Var = new n4(context, f6Var);
                        n4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        f7.addView(n4Var, y5.t(-1, -2, 7, 0, 0, 0, 0));
                        ci.d dVar = new ci.d(context, f6Var, true);
                        ArrayList arrayList = new ArrayList();
                        for (int i12 = 0; i12 < h.size(); i12++) {
                            ei.s1 s1Var = (ei.s1) h.get(i12);
                            if (i12 < h.size() - i10) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ei.r1 r1Var = new ei.r1(s1Var, z11, context);
                            r1Var.setBackground(j6.f0(j6.v0(j6.f19184i6, f6Var), 2, -1));
                            ViewGroup viewGroup = f7;
                            String[] strArr2 = strArr;
                            r1Var.setOnClickListener(new p5(strArr2, s1Var, arrayList, dVar, 2));
                            viewGroup.addView(r1Var, y5.n(-1, 56));
                            arrayList.add(r1Var);
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
                        viewGroup2.addView(dVar, y5.t(-1, 48, 7, 8, 8, 8, 4));
                        j3.customView = viewGroup2;
                        j3.fixNavigationBar(j6.v0(j6.f19165h5, f6Var));
                        dVar.setOnClickListener(new p5(zArr, a0Var, strArr3, j3, 3));
                        j3.setOnDismissListener(new ei.e0(1, zArr, a0Var));
                        j3.show();
                    } catch (Exception e) {
                        y(daVar, "secure_storage_failed", C("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    y(daVar, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    y(daVar, "secure_storage_failed", C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void U(String str, boolean z10) {
        boolean z11;
        boolean z12;
        z0 z0Var = this.f38851a;
        if (z0Var != null) {
            boolean z13 = z0Var.E;
        }
        if (z0Var != null && z0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        z0 z0Var2 = this.f38851a;
        if (z0Var2 != null && z0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        J(z11, z12);
        z0 z0Var3 = this.f38851a;
        if (z0Var3 != null) {
            z0Var3.f39124b = true;
        }
        if (this.N) {
            h("setPageLoaded: already loaded");
            return;
        }
        z5 z5Var = this.f38874s;
        if (z10 && z0Var3 != null && z5Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f38851a, property, 1.0f), ObjectAnimator.ofFloat(z5Var, property, 0.0f));
            animatorSet.addListener(new gp0(this, 29));
            animatorSet.start();
        } else {
            if (z0Var3 != null) {
                z0Var3.setAlpha(1.0f);
            }
            if (z5Var != null) {
                z5Var.setAlpha(0.0f);
                z5Var.setVisibility(8);
            }
        }
        this.f38853b = str;
        h("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.f38855c.getClass();
    }

    public final void V(da daVar, ei.t1 t1Var, String str, String str2, String str3) {
        if (t1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        y(daVar, str3, C("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            t1Var.n(optString, jSONObject.optString("value"));
                            y(daVar, str2, B(string, "req_id"));
                        } catch (RuntimeException e) {
                            y(daVar, str3, C("req_id", string, "error", e.getMessage()));
                        }
                    } catch (Exception unused) {
                        y(daVar, str3, C("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    y(daVar, str3, C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    y(daVar, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void W() {
        z0 z0Var = this.f38851a;
        if (z0Var != null && this.f38869o0) {
            z0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!com.google.android.gms.internal.cast.o.a("WEB_MESSAGE_LISTENER")) {
                h("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            z0 z0Var2 = this.f38851a;
            if (!z0Var2.R) {
                a5.b.a(z0Var2, "TelegramWebviewProxyMessage", singleton, new k2.v(z0Var2, 14));
                this.f38851a.R = true;
            }
            if (com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT")) {
                z0 z0Var3 = this.f38851a;
                if (z0Var3.S == null) {
                    boolean z10 = a5.b.f279a;
                    if (b5.m.d.b()) {
                        z0Var3.S = new a4.m((ScriptHandlerBoundaryInterface) se.b.a(ScriptHandlerBoundaryInterface.class, a5.b.c(z0Var3).f3428a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 4);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    public final void X(z0 z0Var, Object obj) {
        z0 z0Var2;
        String str;
        TLRPC.User user;
        boolean z10;
        String str2 = "";
        z0 z0Var3 = this.f38851a;
        if (z0Var3 != null) {
            z0Var3.destroy();
            removeView(this.f38851a);
        }
        if (z0Var != null) {
            AndroidUtilities.removeFromParent(z0Var);
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
        if (z0Var == null) {
            Context context = getContext();
            boolean z11 = this.f38869o0;
            long j3 = 0;
            if (z11 && (user = this.U) != null) {
                j3 = user.f18475id;
            }
            z0Var2 = new z0(context, z11, j3);
        } else {
            z0Var2 = z0Var;
        }
        this.f38851a = z0Var2;
        if (!this.f38869o0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f38851a, true);
            CookieManager.getInstance().flush();
            this.f38851a.f39126f = this.f38878v0;
        } else {
            z0Var2.setBackgroundColor(k(j6.f19094d6));
        }
        if (!MessagesController.getInstance(this.M).disableBotFullscreenBlur) {
            this.f38851a.setLayerType(2, null);
        }
        this.f38851a.f(this, this.d);
        this.f38851a.setCloseListener(this.C0);
        WebSettings settings = this.f38851a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f38869o0) {
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
            if (this.f38869o0) {
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
        this.f38851a.setVerticalScrollBarEnabled(false);
        if (z0Var == null && this.f38869o0) {
            this.f38851a.setAlpha(0.0f);
        }
        addView(this.f38851a);
        if (this.f38869o0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f38873r0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f38873r0 == null) {
                ?? obj2 = new Object();
                obj2.f38810a = this;
                this.f38873r0 = obj2;
            }
            this.f38873r0.f38810a = this;
            W();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f38877u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f38877u0;
            if (botWebViewContainer$WebViewProxy == null) {
                z0 z0Var4 = this.f38851a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(z0Var4, this);
                this.f38877u0 = botWebViewContainer$WebViewProxy2;
                z0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (z0Var == null) {
                this.f38851a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f38877u0.f38811a = this;
        }
        K(this.f38851a);
        P0 = false;
    }

    public final void Y(int i10, org.telegram.ui.ActionBar.b2 b2Var, Runnable runnable) {
        if (b2Var != null && !n(i10)) {
            b2Var.setOnDismissListener(new ei.e0(13, this, runnable));
            this.f38856c0 = b2Var;
            b2Var.f18691h0 = false;
            b2Var.show();
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
        if (this.f38851a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.f38874s.setVisibility(8);
                this.h = true;
                this.f38859f.setVisibility(0);
                z0 z0Var = this.f38851a;
                if (z0Var != null) {
                    removeView(z0Var);
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
        cn0 cn0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            z0 z0Var = this.f38851a;
            if (z0Var != null) {
                z0Var.setBackgroundColor(k(j6.f19094d6));
            }
            if (!this.f38871q0) {
                int i12 = j6.Ki;
                int k10 = k(i12);
                this.f38870p0 = k10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN);
                z5 z5Var = this.f38874s;
                z5Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f38872r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.f38870p0);
                    this.f38872r.setupGradient(i12, this.e, 1.0f, false);
                }
                z5Var.invalidate();
            }
            A();
        } else if (i10 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f38881x != null) {
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
                    this.f38881x.onReceiveValue(uriArr);
                    this.f38881x = null;
                }
                uriArr = null;
                this.f38881x.onReceiveValue(uriArr);
                this.f38881x = null;
            }
        } else if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (cn0Var = this.V) != null) {
                cn0Var.run();
                this.V = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f38874s) {
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
                this.f38867n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f38859f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f38851a) {
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

    public final void e(da daVar, ei.t1 t1Var, String str, String str2, String str3) {
        if (t1Var != null && this.U != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    t1Var.m(new JSONObject());
                    y(daVar, str2, B(string, "req_id"));
                } catch (RuntimeException e) {
                    y(daVar, str3, C("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    y(daVar, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void f() {
        if (this.U == null) {
            return;
        }
        ei.r rVar = this.f38864j0;
        if (rVar == null) {
            this.f38864j0 = ei.r.c(getContext(), this.M, this.U.f18475id);
        } else {
            rVar.h();
        }
    }

    public final da g() {
        z0 z0Var = this.f38851a;
        long j3 = this.f38875s0;
        boolean z10 = this.f38876t0;
        String str = this.F0;
        ?? obj = new Object();
        obj.f740c = this;
        obj.d = z0Var;
        obj.f738a = j3;
        obj.f739b = z10;
        obj.e = str;
        return obj;
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f38873r0;
    }

    public int getMinHeight() {
        if (getParent() instanceof p4) {
            p4 p4Var = (p4) getParent();
            if (p4Var.J) {
                return (int) ((p4Var.getMeasuredHeight() - p4Var.getOffsetY()) + this.f38885z0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        z0 z0Var = this.f38851a;
        if (z0Var == null) {
            return null;
        }
        return l(z0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f38877u0;
    }

    public String getTrustedOrigin() {
        return this.F0;
    }

    public String getUrlLoaded() {
        return this.f38853b;
    }

    public z0 getWebView() {
        return this.f38851a;
    }

    public final void h(String str) {
        FileLog.d("[webviewcontainer] #" + this.N0 + " " + str);
    }

    public final void i() {
        h("destroyWebView preserving=" + this.B0);
        z0 z0Var = this.f38851a;
        if (z0Var != null) {
            if (z0Var.getParent() != null) {
                removeView(this.f38851a);
            }
            if (!this.B0) {
                this.f38851a.destroy();
                L(this.f38851a);
            }
            this.N = false;
            if (this.f38864j0 != null) {
                this.f38864j0 = null;
            }
            if (this.m0 != null) {
                this.m0 = null;
            }
            if (this.f38868n0 != null) {
                this.f38868n0 = null;
            }
            ei.w0 w0Var = this.f38865k0;
            if (w0Var != null) {
                w0Var.f8701f.remove(this.J0);
                this.f38865k0 = null;
                this.I0 = null;
            }
        }
    }

    public final void j(String str) {
        new xc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int k(int i10) {
        f6 f6Var = this.e;
        if (f6Var != null) {
            return f6Var.F0(i10);
        }
        return j6.w0(null, i10, false);
    }

    public final void m(da daVar, ei.t1 t1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (t1Var != null && this.U != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        y(daVar, str3, C("req_id", string, "error", "KEY_INVALID"));
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
                            y(daVar, str2, jSONObject);
                        } else {
                            y(daVar, str2, C("req_id", string, "value", f7.first));
                        }
                    } catch (RuntimeException e) {
                        y(daVar, str3, C("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused2) {
                    y(daVar, str3, C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    y(daVar, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean n(int i10) {
        if (this.f38856c0 != null || (this.M0 > 0 && System.currentTimeMillis() < this.M0)) {
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
        if ((this.N || z11) && (z12 = this.f38869o0) && (getParent() instanceof p4)) {
            p4 p4Var = (p4) getParent();
            if (z10) {
                if (p4Var.getSwipeOffsetY() == p4Var.getTopActionBarOffsetY() + (-p4Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.O = z13;
            }
            int max = Math.max(getMinHeight(), (int) (p4Var.getTopActionBarOffsetY() + ((p4Var.getMeasuredHeight() - p4Var.getOffsetY()) - p4Var.getSwipeOffsetY()) + this.f38885z0));
            if (z11 || max != this.f38880w0 || this.f38882x0 != z10 || this.f38884y0 != this.O) {
                this.f38880w0 = max;
                this.f38882x0 = z10;
                this.f38884y0 = this.O;
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
        pc.a(this, new w4(this, 9));
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
        this.f38867n.f29368f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.f38852a0) {
            o(true, false);
        }
    }

    public final boolean p(da daVar) {
        boolean z10;
        if (daVar != null) {
            String str = (String) daVar.e;
            if (((d1) daVar.f740c) == this && ((z0) daVar.d) == this.f38851a && daVar.f738a == this.f38875s0 && (z10 = daVar.f739b) == this.f38876t0) {
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
        if (this.f38851a == null) {
            return false;
        }
        if (this.f38876t0) {
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
        this.f38855c = h0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.7f) {
            b10 = j6.b(0.0f, -0.15f, i10);
        } else {
            b10 = j6.b(0.025f, 0.15f, i10);
        }
        if (this.f38870p0 == b10) {
            return;
        }
        this.f38870p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        z5 z5Var = this.f38874s;
        z5Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f38872r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.f38870p0);
            this.f38872r.setupGradient(j6.Ki, this.e, 1.0f, false);
        }
        this.f38871q0 = true;
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
        z0 z0Var = this.f38851a;
        if (z0Var != null) {
            z0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.O0 = callback4;
    }

    public void setOpener(z0 z0Var) {
        z0 z0Var2;
        this.f38878v0 = z0Var;
        if (!this.f38869o0 && (z0Var2 = this.f38851a) != null) {
            z0Var2.f39126f = z0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f38852a0 = z10;
    }

    public void setViewPortHeightOffset(float f7) {
        this.f38885z0 = f7;
    }

    public void setWasOpenedByBot(f5 f5Var) {
        this.E0 = f5Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.D0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f38879w = aVar;
    }

    public void setWebViewScrollListener(c1 c1Var) {
        this.d = c1Var;
        z0 z0Var = this.f38851a;
        if (z0Var != null) {
            z0Var.f(this, c1Var);
        }
    }

    public final void t(int i10, long j3) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
        String publicUsername = UserObject.getPublicUsername(user);
        z5 z5Var = this.f38874s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            z5Var.setVisibility(0);
            z5Var.setAlpha(1.0f);
            z5Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(k(j6.f19038a7))));
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
        f6 f6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            z5Var.setVisibility(0);
            z5Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f38872r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.f38870p0);
                this.f38872r.setupGradient(j6.Ki, f6Var, 1.0f, false);
            }
            z5Var.f(null, null, this.f38872r);
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
        this.f38872r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.f38870p0);
            this.f38872r.setupGradient(j6.Ki, f6Var, 1.0f, false);
        }
        z5Var.f(null, null, this.f38872r);
        setupFlickerParams(true);
    }

    public final void u(int i10, String str, boolean z10) {
        String str2;
        this.M = i10;
        if (this.f38869o0) {
            this.f38875s0++;
            this.f38876t0 = z10;
            if (z10) {
                str2 = l(str);
            } else {
                str2 = null;
            }
            this.F0 = str2;
            if (this.f38851a != null) {
                W();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new y(this, str, 1));
    }

    public final void w(da daVar) {
        if (this.U != null) {
            f();
            ei.r rVar = this.f38864j0;
            if (rVar == null) {
                return;
            }
            try {
                y(daVar, "biometry_info_received", rVar.f());
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void y(da daVar, String str, JSONObject jSONObject) {
        if (!p(daVar)) {
            h("notifyEvent " + str + " dropped after document change");
            return;
        }
        z(str, jSONObject);
    }

    public final void z(String str, JSONObject jSONObject) {
        if (this.f38869o0 && !r()) {
            h("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        h("notifyEvent " + str);
        NotificationCenter.getInstance(this.M).doOnIdle(new y(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public void L(z0 z0Var) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void I() {
    }

    public void E(String str, boolean z10) {
    }

    public void J(boolean z10, boolean z11) {
    }
}
