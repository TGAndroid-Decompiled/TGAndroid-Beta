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
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d00;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.m5;
import org.telegram.messenger.n20;
import org.telegram.messenger.o5;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.k7;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.u41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ns0;
import org.telegram.ui.p9;
import org.telegram.ui.px0;
import w7.b6;
import w7.g6;
import xh.h3;
import xh.m2;
import xh.s3;
public abstract class z0 extends FrameLayout implements us, k6 {
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
    public s3 F0;
    public String G;
    public String G0;
    public int H;
    public final Rect H0;
    public int I;
    public int I0;
    public String J;
    public x0 J0;
    public String K;
    public final q K0;
    public String L;
    public int L0;
    public int M;
    public int M0;
    public boolean N;
    public long N0;
    public boolean O;
    public final int O0;
    public long P;
    public n20 P0;
    public long Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public TLRPC.User U;
    public u41 V;
    public Activity W;
    public v0 f43257a;
    public boolean f43258a0;
    public String f43259b;
    public String f43260b0;
    public d0 f43261c;
    public org.telegram.ui.ActionBar.x1 f43262c0;
    public y0 d;
    public int f43263d0;
    public final p6 e;
    public long f43264e0;
    public final TextView f43265f;
    public long f43266f0;
    public p9 f43267g0;
    public boolean h;
    public boolean f43268h0;
    public String f43269i0;
    public xh.n f43270j0;
    public xh.o0 f43271k0;
    public xh.f0 f43272l0;
    public xh.g1 m0;
    public final org.telegram.ui.Components.voip.g f43273n;
    public xh.g1 f43274n0;
    public final boolean f43275o0;
    public int f43276p0;
    public boolean f43277q0;
    public c00 f43278r;
    public BotWebViewContainer$BotWebViewProxy f43279r0;
    public final ag.d2 f43280s;
    public long f43281s0;
    public boolean f43282t0;
    public BotWebViewContainer$WebViewProxy f43283u0;
    public v0 f43284v0;
    public boolean f43285w;
    public int f43286w0;
    public q0.a f43287x;
    public boolean f43288x0;
    public ValueCallback f43289y;
    public boolean f43290y0;
    public float f43291z0;

    public z0(int i10, Context context, p6 p6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f43273n = gVar;
        int i11 = t6.Ci;
        this.D = j(i11);
        int i12 = t6.Gi;
        this.E = j(i12);
        this.F = "";
        this.H = j(i11);
        this.I = j(i12);
        this.J = "";
        this.K = "";
        this.M = d20.f15147s0;
        this.A0 = -1;
        this.H0 = new Rect(0, 0, 0, 0);
        this.I0 = 0;
        this.K0 = new q(this, 2);
        this.L0 = -1;
        this.M0 = 0;
        int i13 = R0;
        R0 = i13 + 1;
        this.O0 = i13;
        this.f43275o0 = z10;
        this.e = p6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        gVar.f31440k = false;
        gVar.b(i10, 153);
        ag.d2 d2Var = new ag.d2(this, context);
        this.f43280s = d2Var;
        int j10 = j(t6.yj);
        this.f43276p0 = j10;
        d2Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        d2Var.getImageReceiver().R0 = true;
        addView(d2Var, b6.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f43265f = textView;
        textView.setText(cd.L0(2131752913, null));
        a7.V(textView, t6.f21311y6, p6Var);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = org.telegram.messenger.i0.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, b6.e(-1, -2, 17));
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
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(gf.f.u(Uri.parse(str2), "https", null, S(org.telegram.messenger.i0.K0(str2, false)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static String S(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            f8.g(e, true);
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
        sb2.append(vp.r1(d20.f15147s0).V5);
        return sb2.toString();
    }

    public static void a(z0 z0Var, String[] strArr, q0.a aVar) {
        z0Var.getClass();
        for (String str : strArr) {
            if (z0Var.getContext().checkSelfPermission(str) != 0) {
                z0Var.V = new u41(z0Var, aVar, strArr, 5);
                Activity activity = z0Var.W;
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
            String K0 = org.telegram.messenger.i0.K0(str, false);
            try {
                K0 = IDN.toASCII(K0, 1);
            } catch (Exception unused) {
            }
            String S = S(K0);
            if (S0 == null) {
                S0 = new HashMap();
            }
            S0.put(S, K0);
            return gf.f.u(Uri.parse(str), "https", null, S, null);
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
        this.f43285w = z10;
        ag.d2 d2Var = this.f43280s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getLayoutParams();
        if (z10) {
            i10 = 17;
        } else {
            i10 = 48;
        }
        layoutParams.gravity = i10;
        if (z10) {
            int L = org.telegram.messenger.i0.L(100.0f);
            layoutParams.height = L;
            layoutParams.width = L;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        d2Var.requestLayout();
    }

    private void setupWebView(v0 v0Var) {
        W(v0Var, null);
    }

    public static String u(String str) {
        String str2;
        if (S0 == null || str == null) {
            return str;
        }
        String K0 = org.telegram.messenger.i0.K0(str, false);
        if (K0 != null) {
            if (K0.endsWith("." + vp.r1(d20.f15147s0).V5) && (str2 = (String) S0.get(K0)) != null) {
                return gf.f.u(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void w(int i10, v0 v0Var, x0 x0Var, String str, JSONObject jSONObject) {
        if (v0Var == null) {
            return;
        }
        zs.f(i10).d(new px0(v0Var, x0Var, str, jSONObject, 10));
    }

    public final boolean C() {
        if (this.f43257a != null && this.R) {
            x("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r57, final org.telegram.ui.web.x0 r58, java.lang.String r59, java.lang.String r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.z0.E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, org.telegram.ui.web.x0, java.lang.String, java.lang.String):void");
    }

    public final void F(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            x("invoice_closed", jSONObject);
            f8.b("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f43260b0, str)) {
                this.f43260b0 = null;
            }
        } catch (JSONException e) {
            f8.g(e, true);
        }
    }

    public final void G(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.P > 10000 && z11) {
            return;
        }
        this.P = 0L;
        boolean[] zArr = {false};
        if (gf.f.e(uri, false, zArr) && !zArr[0] && this.f43261c != null) {
            setKeyboardFocusable(false);
        }
        gf.f.q(getContext(), uri, true, z10, false, null, str, false, true, z12);
    }

    public abstract void J(v0 v0Var);

    public final void L() {
        g("preserveWebView");
        this.B0 = true;
        if (this.f43275o0) {
            x("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.f43281s0++;
        }
        v0 v0Var = this.f43257a;
        if (v0Var != null) {
            v0Var.f(null, null);
            this.f43257a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f43279r0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f42975a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f43283u0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f42976a = null;
        }
    }

    public final void N(int i10, v0 v0Var, Object obj, String str, boolean z10) {
        String str2;
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.f43275o0;
        if (z11) {
            this.f43281s0++;
            this.f43282t0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.G0 = str2;
        }
        W(v0Var, obj);
        if (z11) {
            x("visibility_changed", A(Boolean.TRUE, "is_visible"));
        }
    }

    public final void O(int i10, boolean z10) {
        JSONObject jSONObject;
        if (!z10 && i10 == this.I0) {
            return;
        }
        Float valueOf = Float.valueOf(i10 / org.telegram.messenger.i0.f16025p);
        try {
            jSONObject = new JSONObject();
            jSONObject.put("left", (Object) 0);
            jSONObject.put("top", valueOf);
            jSONObject.put("right", (Object) 0);
            jSONObject.put("bottom", (Object) 0);
        } catch (Exception unused) {
            jSONObject = null;
        }
        x("content_safe_area_changed", jSONObject);
        this.I0 = i10;
    }

    public final void P(Rect rect, boolean z10) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.H0;
            if (z10 || !rect2.equals(rect)) {
                Float valueOf = Float.valueOf(rect.left / org.telegram.messenger.i0.f16025p);
                Float valueOf2 = Float.valueOf(rect.top / org.telegram.messenger.i0.f16025p);
                Float valueOf3 = Float.valueOf(rect.right / org.telegram.messenger.i0.f16025p);
                Float valueOf4 = Float.valueOf(rect.bottom / org.telegram.messenger.i0.f16025p);
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("left", valueOf);
                    jSONObject.put("top", valueOf2);
                    jSONObject.put("right", valueOf3);
                    jSONObject.put("bottom", valueOf4);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                x("safe_area_changed", jSONObject);
                rect2.set(rect);
            }
        }
    }

    public final void Q() {
        try {
            if (this.G != null) {
                E(this.f43279r0, f(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                E(this.f43279r0, f(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void R(x0 x0Var, xh.g1 g1Var, String str) {
        p6 p6Var;
        boolean z10;
        if (g1Var != null && this.U != null) {
            boolean z11 = true;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        y(x0Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = g1Var.h(optString);
                        if (h.isEmpty()) {
                            y(x0Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        v vVar = new v(this, x0Var, string, g1Var, optString);
                        k2 T = LaunchActivity.T();
                        if (T != null) {
                            p6Var = T.getResourceProvider();
                        } else {
                            p6Var = null;
                        }
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        z2 k10 = m5.k(1, context, p6Var, false);
                        ViewGroup f7 = m5.f(context, 1);
                        g9 g9Var = new g9(context);
                        TLRPC.User Z1 = vp.r1(g1Var.f53765a).Z1(Long.valueOf(g1Var.f53766b));
                        r8 r8Var = new r8((p6) null);
                        r8Var.r(Z1);
                        g9Var.e(Z1, r8Var);
                        f7.addView(g9Var, b6.t(80, 80, 49, 0, 21, 0, 13));
                        int i10 = t6.G6;
                        Context context2 = context;
                        TextView b10 = g6.b(context2, 20.0f, i10, true, null);
                        b10.setText(cd.L0(2131752990, null));
                        b10.setGravity(17);
                        f7.addView(b10, b6.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = g6.b(context2, 14.0f, i10, false, null);
                        m5.q(null, null, 2131752991, new Object[]{o5.H(null, null, Z1)}, b11);
                        b11.setGravity(17);
                        f7.addView(b11, b6.t(-1, -2, 7, 32, 0, 32, 19));
                        b9 b9Var = new b9(context2, p6Var);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        b9Var.setBackground(new eq(colorDrawable, t6.X0(context2, 2131231230, t6.w0(t6.f20892b7, p6Var))));
                        a7.y(b9Var, colorDrawable, t6.f20872a7, p6Var, PorterDuff.Mode.SRC_IN);
                        b9Var.setFixedSize(12);
                        f7.addView(b9Var, b6.t(-1, 12, 7, 0, 0, 0, 0));
                        p4 p4Var = new p4(context2, p6Var);
                        p4Var.setText(cd.L0(2131752992, null));
                        f7.addView(p4Var, b6.t(-1, -2, 7, 0, 0, 0, 0));
                        vh.d dVar = new vh.d(context2, p6Var, true);
                        ArrayList arrayList = new ArrayList();
                        int i11 = 0;
                        while (i11 < h.size()) {
                            xh.f1 f1Var = (xh.f1) h.get(i11);
                            boolean z12 = z11;
                            if (i11 < h.size() - 1) {
                                z10 = z12;
                            } else {
                                z10 = false;
                            }
                            xh.e1 e1Var = new xh.e1(f1Var, z10, context2);
                            int i12 = t6.f21020i6;
                            v vVar2 = vVar;
                            org.telegram.ui.Cells.y h02 = t6.h0(t6.w0(i12, p6Var), 2, -1);
                            w6 N = a7.N(i12);
                            e1Var.setBackground(h02);
                            a7.k(e1Var, h02, null, N, p6Var);
                            ViewGroup viewGroup = f7;
                            e1Var.setOnClickListener(new org.telegram.messenger.video.h(strArr, f1Var, arrayList, dVar, 15));
                            viewGroup.addView(e1Var, b6.o(-1, 56));
                            arrayList.add(e1Var);
                            i11++;
                            context2 = context2;
                            f7 = viewGroup;
                            z11 = z12;
                            vVar = vVar2;
                            zArr = zArr;
                        }
                        v vVar3 = vVar;
                        boolean[] zArr2 = zArr;
                        ViewGroup viewGroup2 = f7;
                        boolean z13 = false;
                        dVar.i(cd.L0(2131752994, null), false, z11);
                        if (strArr[0] != null) {
                            z13 = true;
                        }
                        dVar.setEnabled(z13);
                        viewGroup2.addView(dVar, b6.t(-1, 48, 7, 8, 8, 8, 4));
                        k10.N = viewGroup2;
                        k10.Q(t6.f21001h5);
                        dVar.setOnClickListener(new org.telegram.messenger.video.h(zArr2, vVar3, strArr, k10, 16));
                        k10.setOnDismissListener(new mg.g(17, zArr2, vVar3));
                        k10.show();
                    } catch (Exception e) {
                        y(x0Var, "secure_storage_failed", B("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    y(x0Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                f8.g(e7, true);
                if (!TextUtils.isEmpty("")) {
                    y(x0Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void T(String str, boolean z10) {
        boolean z11;
        boolean z12;
        v0 v0Var = this.f43257a;
        if (v0Var != null) {
            boolean z13 = v0Var.E;
        }
        if (v0Var != null && v0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        v0 v0Var2 = this.f43257a;
        if (v0Var2 != null && v0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        I(z11, z12);
        v0 v0Var3 = this.f43257a;
        if (v0Var3 != null) {
            v0Var3.f43209b = true;
        }
        if (this.N) {
            g("setPageLoaded: already loaded");
            return;
        }
        ag.d2 d2Var = this.f43280s;
        if (z10 && v0Var3 != null && d2Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f43257a, property, 1.0f), ObjectAnimator.ofFloat(d2Var, property, 0.0f));
            animatorSet.addListener(new ns0(this, 24));
            animatorSet.start();
        } else {
            if (v0Var3 != null) {
                v0Var3.setAlpha(1.0f);
            }
            if (d2Var != null) {
                d2Var.setAlpha(0.0f);
                d2Var.setVisibility(8);
            }
        }
        this.f43259b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.f43261c.getClass();
    }

    public final void U(x0 x0Var, xh.g1 g1Var, String str, String str2, String str3) {
        if (g1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        y(x0Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            g1Var.n(optString, jSONObject.optString("value"));
                            y(x0Var, str2, A(string, "req_id"));
                        } catch (RuntimeException e) {
                            y(x0Var, str3, B("req_id", string, "error", e.getMessage()));
                        }
                    } catch (Exception unused) {
                        y(x0Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    y(x0Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                f8.g(e7, true);
                if (!TextUtils.isEmpty("")) {
                    y(x0Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void V() {
        v0 v0Var = this.f43257a;
        if (v0Var != null && this.f43275o0) {
            v0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!a.a.a("WEB_MESSAGE_LISTENER")) {
                g("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            v0 v0Var2 = this.f43257a;
            if (!v0Var2.R) {
                a5.c.a(v0Var2, "TelegramWebviewProxyMessage", singleton, new mg.l(v0Var2, 16));
                this.f43257a.R = true;
            }
            if (a.a.a("DOCUMENT_START_SCRIPT")) {
                v0 v0Var3 = this.f43257a;
                if (v0Var3.S == null) {
                    boolean z10 = a5.c.f283a;
                    if (b5.m.d.b()) {
                        v0Var3.S = new a4.l((ScriptHandlerBoundaryInterface) me.b.b(ScriptHandlerBoundaryInterface.class, a5.c.c(v0Var3).f2501a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 4);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    public final void W(v0 v0Var, Object obj) {
        v0 v0Var2;
        String str;
        TLRPC.User user;
        boolean z10;
        String str2 = "";
        v0 v0Var3 = this.f43257a;
        if (v0Var3 != null) {
            v0Var3.destroy();
            removeView(this.f43257a);
        }
        if (v0Var != null) {
            org.telegram.messenger.i0.E2(v0Var);
        }
        try {
            if (tz.J0 && !r()) {
                z10 = true;
            } else {
                z10 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z10);
        } catch (Exception e) {
            f8.g(e, true);
        }
        if (v0Var == null) {
            Context context = getContext();
            boolean z11 = this.f43275o0;
            long j10 = 0;
            if (z11 && (user = this.U) != null) {
                j10 = user.f19942id;
            }
            v0Var2 = new v0(context, z11, j10);
        } else {
            v0Var2 = v0Var;
        }
        this.f43257a = v0Var2;
        if (!this.f43275o0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f43257a, true);
            CookieManager.getInstance().flush();
            this.f43257a.f43211f = this.f43284v0;
        } else {
            v0Var2.setBackgroundColor(j(t6.f20929d6));
        }
        if (!vp.r1(this.M).H6) {
            this.f43257a.setLayerType(2, null);
        }
        this.f43257a.f(this, this.d);
        this.f43257a.setCloseListener(this.D0);
        WebSettings settings = this.f43257a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f43275o0) {
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
            if (this.f43275o0) {
                PackageInfo packageInfo = org.telegram.messenger.w0.f19025b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.f19025b.getPackageName(), 0);
                int o10 = tz.o();
                if (o10 == 0) {
                    str = "LOW";
                } else if (o10 == 1) {
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
            f8.g(e7, true);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(org.telegram.messenger.w0.h(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.f43257a.setVerticalScrollBarEnabled(false);
        if (v0Var == null && this.f43275o0) {
            this.f43257a.setAlpha(0.0f);
        }
        addView(this.f43257a);
        if (this.f43275o0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f43279r0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f43279r0 == null) {
                ?? obj2 = new Object();
                obj2.f42975a = this;
                this.f43279r0 = obj2;
            }
            this.f43279r0.f42975a = this;
            V();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f43283u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f43283u0;
            if (botWebViewContainer$WebViewProxy == null) {
                v0 v0Var4 = this.f43257a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(v0Var4, this);
                this.f43283u0 = botWebViewContainer$WebViewProxy2;
                v0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (v0Var == null) {
                this.f43257a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f43283u0.f42976a = this;
        }
        J(this.f43257a);
        Q0 = false;
    }

    public final void X(int i10, org.telegram.ui.ActionBar.x1 x1Var, Runnable runnable) {
        if (x1Var != null && !m(i10)) {
            x1Var.setOnDismissListener(new mg.g(12, this, runnable));
            this.f43262c0 = x1Var;
            x1Var.f21490j0 = false;
            x1Var.show();
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
        sb2.append(cd.L0(2131743904, "UnknownError"));
        if (str != null) {
            str2 = ": ".concat(str);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        i(sb2.toString());
    }

    public final void c() {
        if (this.f43257a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                f8.g(th2, true);
                this.f43280s.setVisibility(8);
                this.h = true;
                this.f43265f.setVisibility(0);
                v0 v0Var = this.f43257a;
                if (v0Var != null) {
                    removeView(v0Var);
                }
            }
        }
    }

    public final void d(x0 x0Var, xh.g1 g1Var, String str, String str2, String str3) {
        if (g1Var != null && this.U != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    g1Var.m(new JSONObject());
                    y(x0Var, str2, A(string, "req_id"));
                } catch (RuntimeException e) {
                    y(x0Var, str3, B("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception e7) {
                f8.g(e7, true);
                if (!TextUtils.isEmpty("")) {
                    y(x0Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u41 u41Var;
        Uri[] uriArr;
        if (i10 == zs.f19657n4) {
            v0 v0Var = this.f43257a;
            if (v0Var != null) {
                v0Var.setBackgroundColor(j(t6.f20929d6));
            }
            if (!this.f43277q0) {
                int i12 = t6.yj;
                int j10 = j(i12);
                this.f43276p0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                ag.d2 d2Var = this.f43280s;
                d2Var.setColorFilter(porterDuffColorFilter);
                c00 c00Var = this.f43278r;
                if (c00Var != null) {
                    c00Var.f14882n = Integer.valueOf(this.f43276p0);
                    this.f43278r.f(i12, this.e, 1.0f, false);
                }
                d2Var.invalidate();
            }
            z();
        } else if (i10 == zs.f19595c5) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f43289y != null) {
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
                    this.f43289y.onReceiveValue(uriArr);
                    this.f43289y = null;
                }
                uriArr = null;
                this.f43289y.onReceiveValue(uriArr);
                this.f43289y = null;
            }
        } else if (i10 == zs.f19601d5) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (u41Var = this.V) != null) {
                u41Var.run();
                this.V = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f43280s) {
            if (this.f43285w) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (this.f43285w) {
                canvas.restore();
            }
            if (!this.f43285w) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.f43273n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f43265f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f43257a) {
                if (!org.telegram.messenger.i0.m0) {
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
        xh.n nVar = this.f43270j0;
        if (nVar == null) {
            this.f43270j0 = xh.n.c(getContext(), this.M, this.U.f19942id);
        } else {
            nVar.h();
        }
    }

    public final x0 f() {
        v0 v0Var = this.f43257a;
        long j10 = this.f43281s0;
        boolean z10 = this.f43282t0;
        String str = this.G0;
        ?? obj = new Object();
        obj.f43243c = this;
        obj.d = v0Var;
        obj.f43241a = j10;
        obj.f43242b = z10;
        obj.e = str;
        return obj;
    }

    public final void g(String str) {
        f8.b("[webviewcontainer] #" + this.O0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f43279r0;
    }

    public int getMinHeight() {
        if (getParent() instanceof h3) {
            h3 h3Var = (h3) getParent();
            if (h3Var.J) {
                return (int) ((h3Var.getMeasuredHeight() - h3Var.getOffsetY()) + this.f43291z0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        v0 v0Var = this.f43257a;
        if (v0Var == null) {
            return null;
        }
        return k(v0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f43283u0;
    }

    public String getTrustedOrigin() {
        return this.G0;
    }

    public String getUrlLoaded() {
        return this.f43259b;
    }

    public v0 getWebView() {
        return this.f43257a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.B0);
        v0 v0Var = this.f43257a;
        if (v0Var != null) {
            if (v0Var.getParent() != null) {
                removeView(this.f43257a);
            }
            if (!this.B0) {
                this.f43257a.destroy();
                K(this.f43257a);
            }
            this.N = false;
            if (this.f43270j0 != null) {
                this.f43270j0 = null;
            }
            if (this.m0 != null) {
                this.m0 = null;
            }
            if (this.f43274n0 != null) {
                this.f43274n0 = null;
            }
            xh.o0 o0Var = this.f43271k0;
            if (o0Var != null) {
                o0Var.f53934f.remove(this.K0);
                this.f43271k0 = null;
                this.J0 = null;
            }
        }
    }

    public final void i(String str) {
        new cc(this, this.e).Q(2131624011, 36, str).j();
    }

    public final int j(int i10) {
        p6 p6Var = this.e;
        if (p6Var != null) {
            return p6Var.h(i10);
        }
        return t6.x0(null, i10, false);
    }

    public final void l(x0 x0Var, xh.g1 g1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (g1Var != null && this.U != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        y(x0Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        Pair f7 = g1Var.f(optString);
                        if (g1Var.d && (obj = f7.first) == null) {
                            Object obj2 = f7.second;
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("req_id", string);
                                jSONObject.put("value", obj);
                                jSONObject.put("can_restore", obj2);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            y(x0Var, str2, jSONObject);
                            return;
                        }
                        y(x0Var, str2, B("req_id", string, "value", f7.first));
                    } catch (RuntimeException e) {
                        y(x0Var, str3, B("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused2) {
                    y(x0Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                f8.g(e7, true);
                if (!TextUtils.isEmpty("")) {
                    y(x0Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean m(int i10) {
        if (this.f43262c0 != null || (this.N0 > 0 && System.currentTimeMillis() < this.N0)) {
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
        if ((this.N || z11) && (z12 = this.f43275o0) && (getParent() instanceof h3)) {
            h3 h3Var = (h3) getParent();
            if (z10) {
                if (h3Var.getSwipeOffsetY() == h3Var.getTopActionBarOffsetY() + (-h3Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.O = z13;
            }
            int max = Math.max(getMinHeight(), (int) (h3Var.getTopActionBarOffsetY() + ((h3Var.getMeasuredHeight() - h3Var.getOffsetY()) - h3Var.getSwipeOffsetY()) + this.f43291z0));
            if (z11 || max != this.f43286w0 || this.f43288x0 != z10 || this.f43290y0 != this.O) {
                this.f43286w0 = max;
                this.f43288x0 = z10;
                this.f43290y0 = this.O;
                String str = "{height:" + (max / org.telegram.messenger.i0.f16025p) + ",is_state_stable:" + z10 + ",is_expanded:" + this.O + "}";
                if (z12 && !q()) {
                    g("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    zs.f(this.M).d(new z(this, a1.g.n("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
                }
            }
        }
    }

    public final boolean o(x0 x0Var) {
        boolean z10;
        if (x0Var != null) {
            String str = (String) x0Var.e;
            if (((z0) x0Var.f43243c) == this && ((v0) x0Var.d) == this.f43257a && x0Var.f43241a == this.f43281s0 && (z10 = x0Var.f43242b) == this.f43282t0) {
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
        zs.e().c(this, zs.f19657n4);
        zs.e().c(this, zs.f19595c5);
        zs.e().c(this, zs.f19601d5);
        setTag(2131296351, new k7(this, 5));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        zs.e().n(this, zs.f19657n4);
        zs.e().n(this, zs.f19595c5);
        zs.e().n(this, zs.f19601d5);
        setTag(2131296351, null);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.A0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
        this.f43273n.f31436f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.f43258a0) {
            n(true, false);
        }
    }

    public final boolean q() {
        if (this.f43257a == null) {
            return false;
        }
        if (this.f43282t0) {
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
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
        TLRPC.UserFull a2 = vp.r1(i10).a2(j10);
        String n10 = h20.n(Z1);
        ag.d2 d2Var = this.f43280s;
        if (n10 != null && n10.equals("DurgerKingBot")) {
            d2Var.setVisibility(0);
            d2Var.setAlpha(1.0f);
            d2Var.h(null, null, d00.h(2131624005, Integer.valueOf(j(t6.f20872a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ui.b0(i10).f18307b.bots;
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
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList2 = tL_attachMenuBot.icons;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (true) {
                if (i12 < size2) {
                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList2.get(i12);
                    i12++;
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
                z10 = false;
            }
            if (tL_attachMenuBotIcon != null) {
                d2Var.setVisibility(0);
                d2Var.setAlpha(1.0f);
                d2Var.j(ic.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        p6 p6Var = this.e;
        if (a2 != null && (botInfo = a2.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            d2Var.setVisibility(0);
            d2Var.setAlpha(1.0f);
            c00 j11 = d00.j(512, 512, a2.bot_info.app_settings.placeholder_svg_path);
            this.f43278r = j11;
            if (j11 != null) {
                j11.f14882n = Integer.valueOf(this.f43276p0);
                this.f43278r.f(t6.yj, p6Var, 1.0f, false);
            }
            d2Var.h(null, null, this.f43278r);
            setupFlickerParams(true);
            return;
        }
        Path path = new Path();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(106.66499f, 106.66499f, 240.355f, 240.355f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 106.66499f, 405.335f, 240.355f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(106.66499f, 271.645f, 240.355f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 271.645f, 405.335f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        d2Var.setVisibility(0);
        d2Var.setAlpha(1.0f);
        c00 j12 = d00.j(512, 512, path);
        this.f43278r = j12;
        if (j12 != null) {
            j12.f14882n = Integer.valueOf(this.f43276p0);
            this.f43278r.f(t6.yj, p6Var, 1.0f, false);
        }
        d2Var.h(null, null, this.f43278r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.U = user;
    }

    public void setDelegate(d0 d0Var) {
        this.f43261c = d0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (org.telegram.messenger.i0.B(i10) > 0.7f) {
            b10 = t6.b(0.0f, -0.15f, i10);
        } else {
            b10 = t6.b(0.025f, 0.15f, i10);
        }
        if (this.f43276p0 == b10) {
            return;
        }
        this.f43276p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        ag.d2 d2Var = this.f43280s;
        d2Var.setColorFilter(porterDuffColorFilter);
        c00 c00Var = this.f43278r;
        if (c00Var != null) {
            c00Var.f14882n = Integer.valueOf(this.f43276p0);
            this.f43278r.f(t6.yj, this.e, 1.0f, false);
        }
        this.f43277q0 = true;
        d2Var.invalidate();
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
        v0 v0Var = this.f43257a;
        if (v0Var != null) {
            v0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(n20 n20Var) {
        this.P0 = n20Var;
    }

    public void setOpener(v0 v0Var) {
        v0 v0Var2;
        this.f43284v0 = v0Var;
        if (!this.f43275o0 && (v0Var2 = this.f43257a) != null) {
            v0Var2.f43211f = v0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f43258a0 = z10;
    }

    public void setViewPortHeightOffset(float f7) {
        this.f43291z0 = f7;
    }

    public void setWasOpenedByBot(s3 s3Var) {
        this.F0 = s3Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.E0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f43287x = aVar;
    }

    public void setWebViewScrollListener(y0 y0Var) {
        this.d = y0Var;
        v0 v0Var = this.f43257a;
        if (v0Var != null) {
            v0Var.f(this, y0Var);
        }
    }

    public final void t(int i10, String str, boolean z10) {
        String str2;
        this.M = i10;
        if (this.f43275o0) {
            this.f43281s0++;
            this.f43282t0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.G0 = str2;
            if (this.f43257a != null) {
                V();
            }
        }
        zs.f(i10).d(new z(this, str, 1));
    }

    @Override
    public final void updateColors() {
        ag.d2 d2Var;
        int j10;
        try {
            if (this.f43257a != null && (j10 = j(t6.f20929d6)) != this.C0) {
                this.C0 = j10;
                this.f43257a.setBackgroundColor(j10);
            }
            if (!this.f43277q0 && (d2Var = this.f43280s) != null) {
                int i10 = this.f43276p0;
                int i11 = t6.yj;
                if (i10 != j(i11)) {
                    int j11 = j(i11);
                    this.f43276p0 = j11;
                    d2Var.setColorFilter(new PorterDuffColorFilter(j11, PorterDuff.Mode.SRC_IN));
                    c00 c00Var = this.f43278r;
                    if (c00Var != null) {
                        c00Var.f14882n = Integer.valueOf(this.f43276p0);
                    }
                    d2Var.invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void v(x0 x0Var) {
        if (this.U != null) {
            e();
            xh.n nVar = this.f43270j0;
            if (nVar == null) {
                return;
            }
            try {
                y(x0Var, "biometry_info_received", nVar.f());
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }

    public final void x(String str, JSONObject jSONObject) {
        if (this.f43275o0 && !q()) {
            g("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        g("notifyEvent " + str);
        zs.f(this.M).d(new z(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void y(x0 x0Var, String str, JSONObject jSONObject) {
        if (!o(x0Var)) {
            g("notifyEvent " + str + " dropped after document change");
            return;
        }
        x(str, jSONObject);
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject u10;
        try {
            u10 = m2.u(this.e, true);
        } catch (Exception e) {
            f8.g(e, true);
        }
        if (u10 != null) {
            jSONObject = new JSONObject().put("theme_params", u10);
            x("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        x("theme_changed", jSONObject);
    }

    public void H() {
    }

    public void K(v0 v0Var) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void D(boolean z10, String str) {
    }

    public void I(boolean z10, boolean z11) {
    }
}
