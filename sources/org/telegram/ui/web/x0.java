package org.telegram.ui.web;

import a8.n9;
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
import c8.ha;
import c8.na;
import di.c4;
import di.o7;
import di.u3;
import hi.a3;
import hi.b4;
import hi.q4;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jo0;
import org.telegram.ui.o9;
import org.telegram.ui.r81;
public abstract class x0 extends FrameLayout implements ls, a6 {
    public static boolean Q0 = true;
    public static int R0;
    public static HashMap S0;
    public int A0;
    public boolean B0;
    public int C0;
    public int D;
    public Runnable D0;
    public int E;
    public boolean E0;
    public String F;
    public q4 F0;
    public String G;
    public String G0;
    public int H;
    public final Rect H0;
    public int I;
    public int I0;
    public String J;
    public o7 J0;
    public String K;
    public final p K0;
    public String L;
    public int L0;
    public int M;
    public int M0;
    public boolean N;
    public long N0;
    public boolean O;
    public final int O0;
    public long P;
    public z10 P0;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public TLRPC.User U;
    public q31 V;
    public Activity W;
    public u0 f51358a;
    public boolean f51359a0;
    public String f51360b;
    public String f51361b0;
    public d0 f51362c;
    public org.telegram.ui.ActionBar.u1 f51363c0;
    public w0 d;
    public int f51364d0;
    public final f6 f51365e;
    public long f51366e0;
    public final TextView f51367f;
    public long f51368f0;
    public o9 f51369g0;
    public boolean h;
    public boolean f51370h0;
    public String f51371i0;
    public hi.p f51372j0;
    public hi.r0 f51373k0;
    public hi.g0 f51374l0;
    public hi.m1 m0;
    public final org.telegram.ui.Components.voip.n f51375n;
    public hi.m1 f51376n0;
    public final boolean f51377o0;
    public int f51378p0;
    public boolean f51379q0;
    public rz f51380r;
    public BotWebViewContainer$BotWebViewProxy f51381r0;
    public final c4 f51382s;
    public long f51383s0;
    public boolean f51384t0;
    public BotWebViewContainer$WebViewProxy f51385u0;
    public u0 f51386v0;
    public boolean f51387w;
    public int f51388w0;
    public q0.a f51389x;
    public boolean f51390x0;
    public ValueCallback f51391y;
    public boolean f51392y0;
    public float f51393z0;

    public x0(int i7, Context context, f6 f6Var, boolean z9) {
        super(context);
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f51375n = nVar;
        int i10 = k6.Ci;
        this.D = j(i10);
        int i11 = k6.Gi;
        this.E = j(i11);
        this.F = "";
        this.H = j(i10);
        this.I = j(i11);
        this.J = "";
        this.K = "";
        this.M = p10.f24459s0;
        this.A0 = -1;
        this.H0 = new Rect(0, 0, 0, 0);
        this.I0 = 0;
        this.K0 = new p(this, 2);
        this.L0 = -1;
        this.M0 = 0;
        int i12 = R0;
        R0 = i12 + 1;
        this.O0 = i12;
        this.f51377o0 = z9;
        this.f51365e = f6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        nVar.f39322k = false;
        nVar.b(i7, 153);
        c4 c4Var = new c4(this, context);
        this.f51382s = c4Var;
        int j3 = j(k6.yj);
        this.f51378p0 = j3;
        c4Var.setColorFilter(new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN));
        c4Var.getImageReceiver().R0 = true;
        addView(c4Var, ha.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f51367f = textView;
        textView.setText(hd.M0(2131752913, null));
        r6.V(textView, k6.f28240y6, f6Var);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = org.telegram.messenger.g0.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, ha.e(-1, -2, 17));
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

    public static JSONObject C(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            jSONObject.put(str3, obj3);
            jSONObject.put(str4, obj4);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static WebResourceResponse N(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(vf.c.w(Uri.parse(str2), "https", null, T(org.telegram.messenger.g0.K0(str2, false)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static String T(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        String[] split = str.split("\\.");
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < split.length; i7++) {
            if (i7 > 0) {
                sb2.append("-d");
            }
            sb2.append(split[i7].replaceAll("\\-", "-h"));
        }
        sb2.append(".");
        sb2.append(qp.s1(p10.f24459s0).U5);
        return sb2.toString();
    }

    public static void a(x0 x0Var, String[] strArr, q0.a aVar) {
        x0Var.getClass();
        for (String str : strArr) {
            if (x0Var.getContext().checkSelfPermission(str) != 0) {
                x0Var.V = new q31(x0Var, aVar, strArr, 5);
                Activity activity = x0Var.W;
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
            String K0 = org.telegram.messenger.g0.K0(str, false);
            try {
                K0 = IDN.toASCII(K0, 1);
            } catch (Exception unused) {
            }
            String T = T(K0);
            if (S0 == null) {
                S0 = new HashMap();
            }
            S0.put(T, K0);
            return vf.c.w(Uri.parse(str), "https", null, T, null);
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

    private void setupFlickerParams(boolean z9) {
        int i7;
        this.f51387w = z9;
        c4 c4Var = this.f51382s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c4Var.getLayoutParams();
        if (z9) {
            i7 = 17;
        } else {
            i7 = 48;
        }
        layoutParams.gravity = i7;
        if (z9) {
            int L = org.telegram.messenger.g0.L(100.0f);
            layoutParams.height = L;
            layoutParams.width = L;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        c4Var.requestLayout();
    }

    private void setupWebView(u0 u0Var) {
        X(u0Var, null);
    }

    public static String u(String str) {
        String str2;
        if (S0 == null || str == null) {
            return str;
        }
        String K0 = org.telegram.messenger.g0.K0(str, false);
        if (K0 != null) {
            if (K0.endsWith("." + qp.s1(p10.f24459s0).U5) && (str2 = (String) S0.get(K0)) != null) {
                return vf.c.w(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void w(int i7, u0 u0Var, o7 o7Var, String str, JSONObject jSONObject) {
        if (u0Var == null) {
            return;
        }
        qs.f(i7).d(new jo0(u0Var, o7Var, str, jSONObject, 20));
    }

    public final boolean D() {
        if (this.f51358a != null && this.R) {
            y("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r56, final di.o7 r57, java.lang.String r58, java.lang.String r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.x0.F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, di.o7, java.lang.String, java.lang.String):void");
    }

    public final void G(String str, String str2, boolean z9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            a8.b("invoice_closed " + jSONObject);
            if (!z9 && Objects.equals(this.f51361b0, str)) {
                this.f51361b0 = null;
            }
        } catch (JSONException e10) {
            a8.g(e10, true);
        }
    }

    public final void H(Uri uri, String str, boolean z9, boolean z10, boolean z11) {
        if (System.currentTimeMillis() - this.P > 10000 && z10) {
            return;
        }
        this.P = 0L;
        boolean[] zArr = {false};
        if (vf.c.g(uri, false, zArr) && !zArr[0] && this.f51362c != null) {
            setKeyboardFocusable(false);
        }
        vf.c.s(getContext(), uri, true, z9, false, null, str, false, true, z11, false);
    }

    public abstract void K(u0 u0Var);

    public final void M() {
        g("preserveWebView");
        this.B0 = true;
        if (this.f51377o0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.f51383s0++;
        }
        u0 u0Var = this.f51358a;
        if (u0Var != null) {
            u0Var.f(null, null);
            this.f51358a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f51381r0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f51072a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f51385u0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f51073a = null;
        }
    }

    public final void O(int i7, u0 u0Var, Object obj, String str, boolean z9) {
        String str2;
        this.M = i7;
        this.B0 = false;
        boolean z10 = this.f51377o0;
        if (z10) {
            this.f51383s0++;
            this.f51384t0 = z9;
            if (z9) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.G0 = str2;
        }
        X(u0Var, obj);
        if (z10) {
            y("visibility_changed", A(Boolean.TRUE, "is_visible"));
        }
    }

    public final void P(int i7, boolean z9) {
        if (!z9 && i7 == this.I0) {
            return;
        }
        y("content_safe_area_changed", C("left", 0, "top", Float.valueOf(i7 / org.telegram.messenger.g0.f22536p), "right", 0, "bottom", 0));
        this.I0 = i7;
    }

    public final void Q(Rect rect, boolean z9) {
        if (rect != null) {
            Rect rect2 = this.H0;
            if (z9 || !rect2.equals(rect)) {
                y("safe_area_changed", C("left", Float.valueOf(rect.left / org.telegram.messenger.g0.f22536p), "top", Float.valueOf(rect.top / org.telegram.messenger.g0.f22536p), "right", Float.valueOf(rect.right / org.telegram.messenger.g0.f22536p), "bottom", Float.valueOf(rect.bottom / org.telegram.messenger.g0.f22536p)));
                rect2.set(rect);
            }
        }
    }

    public final void R() {
        try {
            if (this.G != null) {
                F(this.f51381r0, f(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                F(this.f51381r0, f(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void S(o7 o7Var, hi.m1 m1Var, String str) {
        f6 f6Var;
        boolean z9;
        boolean z10;
        if (m1Var != null && this.U != null) {
            boolean z11 = true;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(o7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = m1Var.h(optString);
                        if (h.isEmpty()) {
                            x(o7Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        u uVar = new u(this, o7Var, string, m1Var, optString);
                        f2 T = LaunchActivity.T();
                        if (T != null) {
                            f6Var = T.getResourceProvider();
                        } else {
                            f6Var = null;
                        }
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        v2 l10 = k5.l(1, context, f6Var, false);
                        ViewGroup f10 = k5.f(context, 1);
                        l9 l9Var = new l9(context);
                        TLRPC.User a22 = qp.s1(m1Var.f14788a).a2(Long.valueOf(m1Var.f14789b));
                        w8 w8Var = new w8((f6) null);
                        w8Var.r(a22);
                        l9Var.e(a22, w8Var);
                        f10.addView(l9Var, ha.t(80, 80, 49, 0, 21, 0, 13));
                        int i7 = k6.G6;
                        Context context2 = context;
                        TextView b10 = na.b(context2, 20.0f, i7, true, null);
                        b10.setText(hd.M0(2131752990, null));
                        b10.setGravity(17);
                        f10.addView(b10, ha.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = na.b(context2, 14.0f, i7, false, null);
                        k5.r(null, null, 2131752991, new Object[]{m5.H(null, null, a22)}, b11);
                        b11.setGravity(17);
                        f10.addView(b11, ha.t(-1, -2, 7, 32, 0, 32, 19));
                        z8 z8Var = new z8(context2, f6Var);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        z8Var.setBackground(new xp(colorDrawable, k6.X0(context2, 2131231229, k6.w0(k6.f27812b7, f6Var))));
                        r6.y(z8Var, colorDrawable, k6.f27792a7, f6Var, PorterDuff.Mode.SRC_IN);
                        z8Var.setFixedSize(12);
                        f10.addView(z8Var, ha.t(-1, 12, 7, 0, 0, 0, 0));
                        n4 n4Var = new n4(context2, f6Var);
                        n4Var.setText(hd.M0(2131752992, null));
                        f10.addView(n4Var, ha.t(-1, -2, 7, 0, 0, 0, 0));
                        fi.d dVar = new fi.d(context2, f6Var, true);
                        ArrayList arrayList = new ArrayList();
                        int i10 = 0;
                        while (i10 < h.size()) {
                            hi.l1 l1Var = (hi.l1) h.get(i10);
                            boolean z12 = z11;
                            if (i10 < h.size() - 1) {
                                z10 = z12;
                            } else {
                                z10 = false;
                            }
                            hi.k1 k1Var = new hi.k1(l1Var, z10, context2);
                            int i11 = k6.f27940i6;
                            u uVar2 = uVar;
                            org.telegram.ui.Cells.y h02 = k6.h0(k6.w0(i11, f6Var), 2, -1);
                            n6 N = r6.N(i11);
                            k1Var.setBackground(h02);
                            r6.k(k1Var, h02, null, N, f6Var);
                            ViewGroup viewGroup = f10;
                            k1Var.setOnClickListener(new u3(strArr, l1Var, arrayList, dVar, 2));
                            viewGroup.addView(k1Var, ha.o(-1, 56));
                            arrayList.add(k1Var);
                            i10++;
                            context2 = context2;
                            f10 = viewGroup;
                            z11 = z12;
                            uVar = uVar2;
                            zArr = zArr;
                        }
                        u uVar3 = uVar;
                        boolean[] zArr2 = zArr;
                        ViewGroup viewGroup2 = f10;
                        dVar.i(hd.M0(2131752994, null), false, z11);
                        if (strArr[0] != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        dVar.setEnabled(z9);
                        viewGroup2.addView(dVar, ha.t(-1, 48, 7, 8, 8, 8, 4));
                        l10.N = viewGroup2;
                        l10.P(k6.f27921h5);
                        dVar.setOnClickListener(new u3(zArr2, uVar3, strArr, l10, 3));
                        l10.setOnDismissListener(new bi.u3(3, zArr2, uVar3));
                        l10.show();
                    } catch (Exception e10) {
                        x(o7Var, "secure_storage_failed", B("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused) {
                    x(o7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(o7Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void U(String str, boolean z9) {
        boolean z10;
        boolean z11;
        u0 u0Var = this.f51358a;
        if (u0Var != null) {
            boolean z12 = u0Var.E;
        }
        if (u0Var != null && u0Var.canGoBack()) {
            z10 = false;
        } else {
            z10 = true;
        }
        u0 u0Var2 = this.f51358a;
        if (u0Var2 != null && u0Var2.canGoForward()) {
            z11 = false;
        } else {
            z11 = true;
        }
        J(z10, z11);
        u0 u0Var3 = this.f51358a;
        if (u0Var3 != null) {
            u0Var3.f51317b = true;
        }
        if (this.N) {
            g("setPageLoaded: already loaded");
            return;
        }
        c4 c4Var = this.f51382s;
        if (z9 && u0Var3 != null && c4Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f51358a, property, 1.0f), ObjectAnimator.ofFloat(c4Var, property, 0.0f));
            animatorSet.addListener(new r81(this, 13));
            animatorSet.start();
        } else {
            if (u0Var3 != null) {
                u0Var3.setAlpha(1.0f);
            }
            if (c4Var != null) {
                c4Var.setAlpha(0.0f);
                c4Var.setVisibility(8);
            }
        }
        this.f51360b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.f51362c.getClass();
    }

    public final void V(o7 o7Var, hi.m1 m1Var, String str, String str2, String str3) {
        if (m1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(o7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            m1Var.n(optString, jSONObject.optString("value"));
                            x(o7Var, str2, A(string, "req_id"));
                        } catch (RuntimeException e10) {
                            x(o7Var, str3, B("req_id", string, "error", e10.getMessage()));
                        }
                    } catch (Exception unused) {
                        x(o7Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    x(o7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(o7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void W() {
        u0 u0Var = this.f51358a;
        if (u0Var != null && this.f51377o0) {
            u0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!n9.a("WEB_MESSAGE_LISTENER")) {
                g("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            u0 u0Var2 = this.f51358a;
            if (!u0Var2.R) {
                d5.b.a(u0Var2, "TelegramWebviewProxyMessage", singleton, new m3(u0Var2, 4));
                this.f51358a.R = true;
            }
            if (n9.a("DOCUMENT_START_SCRIPT")) {
                u0 u0Var3 = this.f51358a;
                if (u0Var3.S == null) {
                    boolean z9 = d5.b.f8184a;
                    if (e5.k.d.b()) {
                        u0Var3.S = new d6.i((ScriptHandlerBoundaryInterface) af.b.a(ScriptHandlerBoundaryInterface.class, d5.b.c(u0Var3).f10715a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 19);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    public final void X(u0 u0Var, Object obj) {
        u0 u0Var2;
        String str;
        TLRPC.User user;
        boolean z9;
        String str2 = "";
        u0 u0Var3 = this.f51358a;
        if (u0Var3 != null) {
            u0Var3.destroy();
            removeView(this.f51358a);
        }
        if (u0Var != null) {
            org.telegram.messenger.g0.E2(u0Var);
        }
        try {
            if (iz.J0 && !r()) {
                z9 = true;
            } else {
                z9 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z9);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (u0Var == null) {
            Context context = getContext();
            boolean z10 = this.f51377o0;
            long j3 = 0;
            if (z10 && (user = this.U) != null) {
                j3 = user.f27101id;
            }
            u0Var2 = new u0(context, z10, j3);
        } else {
            u0Var2 = u0Var;
        }
        this.f51358a = u0Var2;
        if (!this.f51377o0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f51358a, true);
            CookieManager.getInstance().flush();
            this.f51358a.f51320f = this.f51386v0;
        } else {
            u0Var2.setBackgroundColor(j(k6.f27848d6));
        }
        if (!qp.s1(this.M).G6) {
            this.f51358a.setLayerType(2, null);
        }
        this.f51358a.f(this, this.d);
        this.f51358a.setCloseListener(this.D0);
        WebSettings settings = this.f51358a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f51377o0) {
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
            if (this.f51377o0) {
                PackageInfo packageInfo = org.telegram.messenger.t0.f25555b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25555b.getPackageName(), 0);
                int o4 = iz.o();
                if (o4 == 0) {
                    str = "LOW";
                } else if (o4 == 1) {
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
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(org.telegram.messenger.t0.h(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.f51358a.setVerticalScrollBarEnabled(false);
        if (u0Var == null && this.f51377o0) {
            this.f51358a.setAlpha(0.0f);
        }
        addView(this.f51358a);
        if (this.f51377o0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f51381r0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f51381r0 == null) {
                ?? obj2 = new Object();
                obj2.f51072a = this;
                this.f51381r0 = obj2;
            }
            this.f51381r0.f51072a = this;
            W();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f51385u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f51385u0;
            if (botWebViewContainer$WebViewProxy == null) {
                u0 u0Var4 = this.f51358a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(u0Var4, this);
                this.f51385u0 = botWebViewContainer$WebViewProxy2;
                u0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (u0Var == null) {
                this.f51358a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f51385u0.f51073a = this;
        }
        K(this.f51358a);
        Q0 = false;
    }

    public final void Y(int i7, org.telegram.ui.ActionBar.u1 u1Var, Runnable runnable) {
        if (u1Var != null && !m(i7)) {
            u1Var.setOnDismissListener(new bi.u3(16, this, runnable));
            this.f51363c0 = u1Var;
            u1Var.f28570j0 = false;
            u1Var.show();
            if (this.L0 != i7) {
                this.L0 = i7;
                this.M0 = 0;
                this.N0 = 0L;
            }
            this.M0++;
        }
    }

    public final void Z(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hd.M0(2131743880, "UnknownError"));
        if (str != null) {
            str2 = ": ".concat(str);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        i(sb2.toString());
    }

    public final void c() {
        if (this.f51358a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                a8.g(th2, true);
                this.f51382s.setVisibility(8);
                this.h = true;
                this.f51367f.setVisibility(0);
                u0 u0Var = this.f51358a;
                if (u0Var != null) {
                    removeView(u0Var);
                }
            }
        }
    }

    public final void d(o7 o7Var, hi.m1 m1Var, String str, String str2, String str3) {
        if (m1Var != null && this.U != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    m1Var.m(new JSONObject());
                    x(o7Var, str2, A(string, "req_id"));
                } catch (RuntimeException e10) {
                    x(o7Var, str3, B("req_id", string, "error", e10.getMessage()));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(o7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        q31 q31Var;
        Uri[] uriArr;
        if (i7 == qs.f25027n4) {
            u0 u0Var = this.f51358a;
            if (u0Var != null) {
                u0Var.setBackgroundColor(j(k6.f27848d6));
            }
            if (!this.f51379q0) {
                int i11 = k6.yj;
                int j3 = j(i11);
                this.f51378p0 = j3;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN);
                c4 c4Var = this.f51382s;
                c4Var.setColorFilter(porterDuffColorFilter);
                rz rzVar = this.f51380r;
                if (rzVar != null) {
                    rzVar.f25386n = Integer.valueOf(this.f51378p0);
                    this.f51380r.f(i11, this.f51365e, 1.0f, false);
                }
                c4Var.invalidate();
            }
            z();
        } else if (i7 == qs.f24967c5) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f51391y != null) {
                if (intValue2 == -1 && intent != null) {
                    if (intent.getClipData() != null) {
                        ClipData clipData = intent.getClipData();
                        uriArr = new Uri[clipData.getItemCount()];
                        for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                            uriArr[i12] = clipData.getItemAt(i12).getUri();
                        }
                    } else if (intent.getData() != null) {
                        uriArr = new Uri[]{intent.getData()};
                    }
                    this.f51391y.onReceiveValue(uriArr);
                    this.f51391y = null;
                }
                uriArr = null;
                this.f51391y.onReceiveValue(uriArr);
                this.f51391y = null;
            }
        } else if (i7 == qs.f24972d5) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (q31Var = this.V) != null) {
                q31Var.run();
                this.V = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f51382s) {
            if (this.f51387w) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (this.f51387w) {
                canvas.restore();
            }
            if (!this.f51387w) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.f51375n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f51367f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f51358a) {
                if (!org.telegram.messenger.g0.m0) {
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
        hi.p pVar = this.f51372j0;
        if (pVar == null) {
            this.f51372j0 = hi.p.c(getContext(), this.M, this.U.f27101id);
        } else {
            pVar.h();
        }
    }

    public final o7 f() {
        u0 u0Var = this.f51358a;
        long j3 = this.f51383s0;
        boolean z9 = this.f51384t0;
        String str = this.G0;
        ?? obj = new Object();
        obj.f9471c = this;
        obj.d = u0Var;
        obj.f9469a = j3;
        obj.f9470b = z9;
        obj.f9472e = str;
        return obj;
    }

    public final void g(String str) {
        a8.b("[webviewcontainer] #" + this.O0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f51381r0;
    }

    public int getMinHeight() {
        if (getParent() instanceof b4) {
            b4 b4Var = (b4) getParent();
            if (b4Var.J) {
                return (int) ((b4Var.getMeasuredHeight() - b4Var.getOffsetY()) + this.f51393z0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        u0 u0Var = this.f51358a;
        if (u0Var == null) {
            return null;
        }
        return k(u0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f51385u0;
    }

    public String getTrustedOrigin() {
        return this.G0;
    }

    public String getUrlLoaded() {
        return this.f51360b;
    }

    public u0 getWebView() {
        return this.f51358a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.B0);
        u0 u0Var = this.f51358a;
        if (u0Var != null) {
            if (u0Var.getParent() != null) {
                removeView(this.f51358a);
            }
            if (!this.B0) {
                this.f51358a.destroy();
                L(this.f51358a);
            }
            this.N = false;
            if (this.f51372j0 != null) {
                this.f51372j0 = null;
            }
            if (this.m0 != null) {
                this.m0 = null;
            }
            if (this.f51376n0 != null) {
                this.f51376n0 = null;
            }
            hi.r0 r0Var = this.f51373k0;
            if (r0Var != null) {
                r0Var.f14921f.remove(this.K0);
                this.f51373k0 = null;
                this.J0 = null;
            }
        }
    }

    public final void i(String str) {
        new hc(this, this.f51365e).Q(2131624011, 36, str).j();
    }

    public final int j(int i7) {
        f6 f6Var = this.f51365e;
        if (f6Var != null) {
            return f6Var.h(i7);
        }
        return k6.x0(null, i7, false);
    }

    public final void l(o7 o7Var, hi.m1 m1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (m1Var != null && this.U != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        x(o7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        Pair f10 = m1Var.f(optString);
                        if (m1Var.d && (obj = f10.first) == null) {
                            Object obj2 = f10.second;
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("req_id", string);
                                jSONObject.put("value", obj);
                                jSONObject.put("can_restore", obj2);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            x(o7Var, str2, jSONObject);
                            return;
                        }
                        x(o7Var, str2, B("req_id", string, "value", f10.first));
                    } catch (RuntimeException e10) {
                        x(o7Var, str3, B("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused2) {
                    x(o7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(o7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean m(int i7) {
        if (this.f51363c0 != null || (this.N0 > 0 && System.currentTimeMillis() < this.N0)) {
            return true;
        }
        if (this.L0 != i7 || this.M0 <= 3) {
            return false;
        }
        this.N0 = System.currentTimeMillis() + 3000;
        this.M0 = 0;
        return true;
    }

    public final void n(boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        invalidate();
        if ((this.N || z10) && (z11 = this.f51377o0) && (getParent() instanceof b4)) {
            b4 b4Var = (b4) getParent();
            if (z9) {
                if (b4Var.getSwipeOffsetY() == b4Var.getTopActionBarOffsetY() + (-b4Var.getOffsetY())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.O = z12;
            }
            int max = Math.max(getMinHeight(), (int) (b4Var.getTopActionBarOffsetY() + ((b4Var.getMeasuredHeight() - b4Var.getOffsetY()) - b4Var.getSwipeOffsetY()) + this.f51393z0));
            if (z10 || max != this.f51388w0 || this.f51390x0 != z9 || this.f51392y0 != this.O) {
                this.f51388w0 = max;
                this.f51390x0 = z9;
                this.f51392y0 = this.O;
                String str = "{height:" + (max / org.telegram.messenger.g0.f22536p) + ",is_state_stable:" + z9 + ",is_expanded:" + this.O + "}";
                if (z11 && !q()) {
                    g("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    qs.f(this.M).d(new z(this, a8.p0.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
                }
            }
        }
    }

    public final boolean o(o7 o7Var) {
        boolean z9;
        if (o7Var != null) {
            String str = (String) o7Var.f9472e;
            if (((x0) o7Var.f9471c) == this && ((u0) o7Var.d) == this.f51358a && o7Var.f9469a == this.f51383s0 && (z9 = o7Var.f9470b) == this.f51384t0) {
                if (z9) {
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
        qs.e().c(this, qs.f25027n4);
        qs.e().c(this, qs.f24967c5);
        qs.e().c(this, qs.f24972d5);
        setTag(2131296351, new ch.v(this, 10));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        qs.e().n(this, qs.f25027n4);
        qs.e().n(this, qs.f24967c5);
        qs.e().n(this, qs.f24972d5);
        setTag(2131296351, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.A0;
        if (i11 >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i7, i10);
        this.f51375n.f39318f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (!this.f51359a0) {
            n(true, false);
        }
    }

    public final boolean q() {
        if (this.f51358a == null) {
            return false;
        }
        if (this.f51384t0) {
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

    public final void s(int i7, long j3) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
        TLRPC.UserFull b22 = qp.s1(i7).b2(j3);
        String n10 = t10.n(a22);
        c4 c4Var = this.f51382s;
        if (n10 != null && n10.equals("DurgerKingBot")) {
            c4Var.setVisibility(0);
            c4Var.setAlpha(1.0f);
            c4Var.h(null, null, sz.h(2131624005, Integer.valueOf(j(k6.f27792a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(i7).f25791b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                i10++;
                tL_attachMenuBot = tL_attachMenuBot2;
                if (tL_attachMenuBot.bot_id == j3) {
                    break;
                }
            } else {
                tL_attachMenuBot = null;
                break;
            }
        }
        boolean z9 = true;
        if (tL_attachMenuBot != null) {
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList2 = tL_attachMenuBot.icons;
            int size2 = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 < size2) {
                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList2.get(i11);
                    i11++;
                    tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                    if (tL_attachMenuBotIcon.name.equals("placeholder_static")) {
                        break;
                    }
                } else {
                    tL_attachMenuBotIcon = null;
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = ui.k0(tL_attachMenuBot);
            } else {
                z9 = false;
            }
            if (tL_attachMenuBotIcon != null) {
                c4Var.setVisibility(0);
                c4Var.setAlpha(1.0f);
                c4Var.j(org.telegram.messenger.hc.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z9);
                return;
            }
            return;
        }
        f6 f6Var = this.f51365e;
        if (b22 != null && (botInfo = b22.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            c4Var.setVisibility(0);
            c4Var.setAlpha(1.0f);
            rz j10 = sz.j(512, 512, b22.bot_info.app_settings.placeholder_svg_path);
            this.f51380r = j10;
            if (j10 != null) {
                j10.f25386n = Integer.valueOf(this.f51378p0);
                this.f51380r.f(k6.yj, f6Var, 1.0f, false);
            }
            c4Var.h(null, null, this.f51380r);
            setupFlickerParams(true);
            return;
        }
        Path path = new Path();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(106.66499f, 106.66499f, 240.355f, 240.355f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 106.66499f, 405.335f, 240.355f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(106.66499f, 271.645f, 240.355f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 271.645f, 405.335f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        c4Var.setVisibility(0);
        c4Var.setAlpha(1.0f);
        rz j11 = sz.j(512, 512, path);
        this.f51380r = j11;
        if (j11 != null) {
            j11.f25386n = Integer.valueOf(this.f51378p0);
            this.f51380r.f(k6.yj, f6Var, 1.0f, false);
        }
        c4Var.h(null, null, this.f51380r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.U = user;
    }

    public void setDelegate(d0 d0Var) {
        this.f51362c = d0Var;
    }

    public void setFlickerViewColor(int i7) {
        int b10;
        if (org.telegram.messenger.g0.B(i7) > 0.7f) {
            b10 = k6.b(0.0f, -0.15f, i7);
        } else {
            b10 = k6.b(0.025f, 0.15f, i7);
        }
        if (this.f51378p0 == b10) {
            return;
        }
        this.f51378p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        c4 c4Var = this.f51382s;
        c4Var.setColorFilter(porterDuffColorFilter);
        rz rzVar = this.f51380r;
        if (rzVar != null) {
            rzVar.f25386n = Integer.valueOf(this.f51378p0);
            this.f51380r.f(k6.yj, this.f51365e, 1.0f, false);
        }
        this.f51379q0 = true;
        c4Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i7) {
        if (this.A0 == i7) {
            return;
        }
        this.A0 = i7;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z9) {
        this.R = z9;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.D0 = runnable;
        u0 u0Var = this.f51358a;
        if (u0Var != null) {
            u0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(z10 z10Var) {
        this.P0 = z10Var;
    }

    public void setOpener(u0 u0Var) {
        u0 u0Var2;
        this.f51386v0 = u0Var;
        if (!this.f51377o0 && (u0Var2 = this.f51358a) != null) {
            u0Var2.f51320f = u0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z9) {
        this.f51359a0 = z9;
    }

    public void setViewPortHeightOffset(float f10) {
        this.f51393z0 = f10;
    }

    public void setWasOpenedByBot(q4 q4Var) {
        this.F0 = q4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z9) {
        this.E0 = z9;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f51389x = aVar;
    }

    public void setWebViewScrollListener(w0 w0Var) {
        this.d = w0Var;
        u0 u0Var = this.f51358a;
        if (u0Var != null) {
            u0Var.f(this, w0Var);
        }
    }

    public final void t(int i7, String str, boolean z9) {
        String str2;
        this.M = i7;
        if (this.f51377o0) {
            this.f51383s0++;
            this.f51384t0 = z9;
            if (z9) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.G0 = str2;
            if (this.f51358a != null) {
                W();
            }
        }
        qs.f(i7).d(new z(this, str, 1));
    }

    @Override
    public final void updateColors() {
        c4 c4Var;
        int j3;
        try {
            if (this.f51358a != null && (j3 = j(k6.f27848d6)) != this.C0) {
                this.C0 = j3;
                this.f51358a.setBackgroundColor(j3);
            }
            if (!this.f51379q0 && (c4Var = this.f51382s) != null) {
                int i7 = this.f51378p0;
                int i10 = k6.yj;
                if (i7 != j(i10)) {
                    int j10 = j(i10);
                    this.f51378p0 = j10;
                    c4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
                    rz rzVar = this.f51380r;
                    if (rzVar != null) {
                        rzVar.f25386n = Integer.valueOf(this.f51378p0);
                    }
                    c4Var.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v(o7 o7Var) {
        if (this.U != null) {
            e();
            hi.p pVar = this.f51372j0;
            if (pVar == null) {
                return;
            }
            try {
                x(o7Var, "biometry_info_received", pVar.f());
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void x(o7 o7Var, String str, JSONObject jSONObject) {
        if (!o(o7Var)) {
            g("notifyEvent " + str + " dropped after document change");
            return;
        }
        y(str, jSONObject);
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.f51377o0 && !q()) {
            g("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        g("notifyEvent " + str);
        qs.f(this.M).d(new z(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject u10;
        try {
            u10 = a3.u(this.f51365e, true);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (u10 != null) {
            jSONObject = new JSONObject().put("theme_params", u10);
            y("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        y("theme_changed", jSONObject);
    }

    public void I() {
    }

    public void L(u0 u0Var) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setKeyboardFocusable(boolean z9) {
    }

    public void E(boolean z9, String str) {
    }

    public void J(boolean z9, boolean z10) {
    }
}
