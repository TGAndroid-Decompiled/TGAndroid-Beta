package org.telegram.ui.web;

import a8.p9;
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
import bi.f4;
import c8.ja;
import c8.sa;
import di.a3;
import fi.i7;
import fi.v3;
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
import ki.k4;
import ki.x2;
import ki.x3;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.pz;
import org.telegram.messenger.q10;
import org.telegram.messenger.qz;
import org.telegram.messenger.si;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.t8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g71;
import org.telegram.ui.hn0;
import org.telegram.ui.o9;
public abstract class v0 extends FrameLayout implements is, z5 {
    public static boolean R0 = true;
    public static int S0;
    public static HashMap T0;
    public float A0;
    public int B0;
    public boolean C0;
    public int D0;
    public int E;
    public Runnable E0;
    public int F;
    public boolean F0;
    public String G;
    public k4 G0;
    public String H;
    public String H0;
    public int I;
    public final Rect I0;
    public int J;
    public int J0;
    public String K;
    public i7 K0;
    public String L;
    public final q L0;
    public String M;
    public int M0;
    public int N;
    public int N0;
    public boolean O;
    public long O0;
    public boolean P;
    public final int P0;
    public long Q;
    public w10 Q0;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public TLRPC.User V;
    public lv0 W;
    public s0 f52811a;
    public Activity f52812a0;
    public String f52813b;
    public boolean f52814b0;
    public c0 f52815c;
    public String f52816c0;
    public u0 d;
    public org.telegram.ui.ActionBar.t1 f52817d0;
    public final e6 f52818e;
    public int f52819e0;
    public final TextView f52820f;
    public long f52821f0;
    public long f52822g0;
    public boolean h;
    public o9 f52823h0;
    public boolean f52824i0;
    public String f52825j0;
    public ki.r f52826k0;
    public ki.s0 f52827l0;
    public ki.i0 m0;
    public final org.telegram.ui.Components.voip.n f52828n;
    public ki.n1 f52829n0;
    public ki.n1 f52830o0;
    public final boolean f52831p0;
    public int f52832q0;
    public pz f52833r;
    public boolean f52834r0;
    public final v3 f52835s;
    public BotWebViewContainer$BotWebViewProxy f52836s0;
    public long f52837t0;
    public boolean f52838u0;
    public BotWebViewContainer$WebViewProxy f52839v0;
    public boolean f52840w;
    public s0 f52841w0;
    public q0.a f52842x;
    public int f52843x0;
    public ValueCallback f52844y;
    public boolean f52845y0;
    public boolean f52846z0;

    public v0(int i7, Context context, e6 e6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f52828n = nVar;
        int i10 = j6.Fi;
        this.E = j(i10);
        int i11 = j6.Ji;
        this.F = j(i11);
        this.G = "";
        this.I = j(i10);
        this.J = j(i11);
        this.K = "";
        this.L = "";
        this.N = m10.f24934t0;
        this.B0 = -1;
        this.I0 = new Rect(0, 0, 0, 0);
        this.J0 = 0;
        this.L0 = new q(this, 2);
        this.M0 = -1;
        this.N0 = 0;
        int i12 = S0;
        S0 = i12 + 1;
        this.P0 = i12;
        this.f52831p0 = z10;
        this.f52818e = e6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.f52812a0 = (Activity) context;
        }
        nVar.f40799k = false;
        nVar.b(i7, 153);
        v3 v3Var = new v3(this, context);
        this.f52835s = v3Var;
        int j3 = j(j6.Bj);
        this.f52832q0 = j3;
        v3Var.setColorFilter(new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN));
        v3Var.getImageReceiver().S0 = true;
        addView(v3Var, ja.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f52820f = textView;
        textView.setText(hd.M0(2131752913, null));
        q6.U(textView, j6.f29241y6, e6Var);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = org.telegram.messenger.g0.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, ja.e(-1, -2, 17));
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
        sb2.append(np.s1(m10.f24934t0).V5);
        return sb2.toString();
    }

    public static void a(v0 v0Var, String[] strArr, q0.a aVar) {
        v0Var.getClass();
        for (String str : strArr) {
            if (v0Var.getContext().checkSelfPermission(str) != 0) {
                v0Var.W = new lv0(v0Var, aVar, strArr, 7);
                Activity activity = v0Var.f52812a0;
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
            if (T0 == null) {
                T0 = new HashMap();
            }
            T0.put(T, K0);
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

    private void setupFlickerParams(boolean z10) {
        int i7;
        this.f52840w = z10;
        v3 v3Var = this.f52835s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) v3Var.getLayoutParams();
        if (z10) {
            i7 = 17;
        } else {
            i7 = 48;
        }
        layoutParams.gravity = i7;
        if (z10) {
            int L = org.telegram.messenger.g0.L(100.0f);
            layoutParams.height = L;
            layoutParams.width = L;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        v3Var.requestLayout();
    }

    private void setupWebView(s0 s0Var) {
        X(s0Var, null);
    }

    public static String u(String str) {
        String str2;
        if (T0 == null || str == null) {
            return str;
        }
        String K0 = org.telegram.messenger.g0.K0(str, false);
        if (K0 != null) {
            if (K0.endsWith("." + np.s1(m10.f24934t0).V5) && (str2 = (String) T0.get(K0)) != null) {
                return vf.c.w(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void w(int i7, s0 s0Var, i7 i7Var, String str, JSONObject jSONObject) {
        if (s0Var == null) {
            return;
        }
        ns.f(i7).d(new hn0(23, s0Var, i7Var, jSONObject, str));
    }

    public final boolean D() {
        if (this.f52811a != null && this.S) {
            y("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r57, final fi.i7 r58, java.lang.String r59, java.lang.String r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.v0.F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, fi.i7, java.lang.String, java.lang.String):void");
    }

    public final void G(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            a8.b("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f52816c0, str)) {
                this.f52816c0 = null;
            }
        } catch (JSONException e10) {
            a8.g(e10, true);
        }
    }

    public final void H(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.Q > 10000 && z11) {
            return;
        }
        this.Q = 0L;
        boolean[] zArr = {false};
        if (vf.c.g(uri, false, zArr) && !zArr[0] && this.f52815c != null) {
            setKeyboardFocusable(false);
        }
        vf.c.s(getContext(), uri, true, z10, false, null, str, false, true, z12, false);
    }

    public abstract void K(s0 s0Var);

    public final void M() {
        g("preserveWebView");
        this.C0 = true;
        if (this.f52831p0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.f52837t0++;
        }
        s0 s0Var = this.f52811a;
        if (s0Var != null) {
            s0Var.f(null, null);
            this.f52811a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f52836s0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f52558a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f52839v0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f52559a = null;
        }
    }

    public final void O(int i7, s0 s0Var, Object obj, String str, boolean z10) {
        String str2;
        this.N = i7;
        this.C0 = false;
        boolean z11 = this.f52831p0;
        if (z11) {
            this.f52837t0++;
            this.f52838u0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.H0 = str2;
        }
        X(s0Var, obj);
        if (z11) {
            y("visibility_changed", A(Boolean.TRUE, "is_visible"));
        }
    }

    public final void P(int i7, boolean z10) {
        if (!z10 && i7 == this.J0) {
            return;
        }
        y("content_safe_area_changed", C("left", 0, "top", Float.valueOf(i7 / org.telegram.messenger.g0.f23608p), "right", 0, "bottom", 0));
        this.J0 = i7;
    }

    public final void Q(Rect rect, boolean z10) {
        if (rect != null) {
            Rect rect2 = this.I0;
            if (z10 || !rect2.equals(rect)) {
                y("safe_area_changed", C("left", Float.valueOf(rect.left / org.telegram.messenger.g0.f23608p), "top", Float.valueOf(rect.top / org.telegram.messenger.g0.f23608p), "right", Float.valueOf(rect.right / org.telegram.messenger.g0.f23608p), "bottom", Float.valueOf(rect.bottom / org.telegram.messenger.g0.f23608p)));
                rect2.set(rect);
            }
        }
    }

    public final void R() {
        try {
            if (this.H != null) {
                F(this.f52836s0, f(), "web_app_setup_main_button", this.H);
            }
            if (this.M != null) {
                F(this.f52836s0, f(), "web_app_setup_secondary_button", this.M);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void S(i7 i7Var, ki.n1 n1Var, String str) {
        e6 e6Var;
        boolean z10;
        boolean z11;
        if (n1Var != null && this.V != null) {
            boolean z12 = true;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(i7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = n1Var.h(optString);
                        if (h.isEmpty()) {
                            x(i7Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        v vVar = new v(this, i7Var, string, n1Var, optString);
                        e2 T = LaunchActivity.T();
                        if (T != null) {
                            e6Var = T.getResourceProvider();
                        } else {
                            e6Var = null;
                        }
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        u2 k10 = k5.k(1, context, e6Var, false);
                        ViewGroup f10 = k5.f(context, 1);
                        i9 i9Var = new i9(context);
                        TLRPC.User a22 = np.s1(n1Var.f18460a).a2(Long.valueOf(n1Var.f18461b));
                        t8 t8Var = new t8((e6) null);
                        t8Var.r(a22);
                        i9Var.f(a22, t8Var);
                        f10.addView(i9Var, ja.t(80, 80, 49, 0, 21, 0, 13));
                        int i7 = j6.G6;
                        Context context2 = context;
                        TextView b10 = sa.b(context2, 20.0f, i7, true, null);
                        b10.setText(hd.M0(2131752990, null));
                        b10.setGravity(17);
                        f10.addView(b10, ja.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = sa.b(context2, 14.0f, i7, false, null);
                        k5.q(null, null, 2131752991, new Object[]{m5.H(null, null, a22)}, b11);
                        b11.setGravity(17);
                        f10.addView(b11, ja.t(-1, -2, 7, 32, 0, 32, 19));
                        y8 y8Var = new y8(context2, e6Var);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        y8Var.setBackground(new fq(colorDrawable, j6.X0(context2, 2131231229, j6.w0(j6.f28813b7, e6Var))));
                        q6.x(y8Var, colorDrawable, j6.f28792a7, e6Var, PorterDuff.Mode.SRC_IN);
                        y8Var.setFixedSize(12);
                        f10.addView(y8Var, ja.t(-1, 12, 7, 0, 0, 0, 0));
                        n4 n4Var = new n4(context2, e6Var);
                        n4Var.setText(hd.M0(2131752992, null));
                        f10.addView(n4Var, ja.t(-1, -2, 7, 0, 0, 0, 0));
                        hi.d dVar = new hi.d(context2, e6Var, true);
                        ArrayList arrayList = new ArrayList();
                        int i10 = 0;
                        while (i10 < h.size()) {
                            ki.m1 m1Var = (ki.m1) h.get(i10);
                            boolean z13 = z12;
                            if (i10 < h.size() - 1) {
                                z11 = z13;
                            } else {
                                z11 = false;
                            }
                            ki.l1 l1Var = new ki.l1(m1Var, z11, context2);
                            int i11 = j6.f28941i6;
                            v vVar2 = vVar;
                            org.telegram.ui.Cells.y h02 = j6.h0(j6.w0(i11, e6Var), 2, -1);
                            m6 M = q6.M(i11);
                            l1Var.setBackground(h02);
                            q6.j(l1Var, h02, null, M, e6Var);
                            ViewGroup viewGroup = f10;
                            l1Var.setOnClickListener(new f4(strArr, m1Var, arrayList, dVar, 3));
                            viewGroup.addView(l1Var, ja.o(-1, 56));
                            arrayList.add(l1Var);
                            i10++;
                            context2 = context2;
                            f10 = viewGroup;
                            z12 = z13;
                            vVar = vVar2;
                            zArr = zArr;
                        }
                        v vVar3 = vVar;
                        boolean[] zArr2 = zArr;
                        ViewGroup viewGroup2 = f10;
                        dVar.i(hd.M0(2131752994, null), false, z12);
                        if (strArr[0] != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        dVar.setEnabled(z10);
                        viewGroup2.addView(dVar, ja.t(-1, 48, 7, 8, 8, 8, 4));
                        k10.O = viewGroup2;
                        k10.Q(j6.f28922h5);
                        dVar.setOnClickListener(new f4(zArr2, vVar3, strArr, k10, 4));
                        k10.setOnDismissListener(new a3(4, zArr2, vVar3));
                        k10.show();
                    } catch (Exception e10) {
                        x(i7Var, "secure_storage_failed", B("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused) {
                    x(i7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(i7Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void U(String str, boolean z10) {
        boolean z11;
        boolean z12;
        s0 s0Var = this.f52811a;
        if (s0Var != null) {
            boolean z13 = s0Var.F;
        }
        if (s0Var != null && s0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        s0 s0Var2 = this.f52811a;
        if (s0Var2 != null && s0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        J(z11, z12);
        s0 s0Var3 = this.f52811a;
        if (s0Var3 != null) {
            s0Var3.f52767b = true;
        }
        if (this.O) {
            g("setPageLoaded: already loaded");
            return;
        }
        v3 v3Var = this.f52835s;
        if (z10 && s0Var3 != null && v3Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f52811a, property, 1.0f), ObjectAnimator.ofFloat(v3Var, property, 0.0f));
            animatorSet.addListener(new g71(this, 14));
            animatorSet.start();
        } else {
            if (s0Var3 != null) {
                s0Var3.setAlpha(1.0f);
            }
            if (v3Var != null) {
                v3Var.setAlpha(0.0f);
                v3Var.setVisibility(8);
            }
        }
        this.f52813b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.O = true;
        this.f52815c.getClass();
    }

    public final void V(i7 i7Var, ki.n1 n1Var, String str, String str2, String str3) {
        if (n1Var != null && this.V != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(i7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            n1Var.n(optString, jSONObject.optString("value"));
                            x(i7Var, str2, A(string, "req_id"));
                        } catch (RuntimeException e10) {
                            x(i7Var, str3, B("req_id", string, "error", e10.getMessage()));
                        }
                    } catch (Exception unused) {
                        x(i7Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    x(i7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(i7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void W() {
        s0 s0Var = this.f52811a;
        if (s0Var != null && this.f52831p0) {
            s0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!p9.a("WEB_MESSAGE_LISTENER")) {
                g("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            s0 s0Var2 = this.f52811a;
            if (!s0Var2.S) {
                d5.b.a(s0Var2, "TelegramWebviewProxyMessage", singleton, new org.telegram.ui.ActionBar.z(s0Var2, 8));
                this.f52811a.S = true;
            }
            if (p9.a("DOCUMENT_START_SCRIPT")) {
                s0 s0Var3 = this.f52811a;
                if (s0Var3.T == null) {
                    boolean z10 = d5.b.f7570a;
                    if (e5.k.d.b()) {
                        s0Var3.T = new ob.c((ScriptHandlerBoundaryInterface) af.b.a(ScriptHandlerBoundaryInterface.class, d5.b.c(s0Var3).f10551a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 16);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    public final void X(s0 s0Var, Object obj) {
        s0 s0Var2;
        String str;
        TLRPC.User user;
        boolean z10;
        String str2 = "";
        s0 s0Var3 = this.f52811a;
        if (s0Var3 != null) {
            s0Var3.destroy();
            removeView(this.f52811a);
        }
        if (s0Var != null) {
            org.telegram.messenger.g0.E2(s0Var);
        }
        try {
            if (gz.J0 && !r()) {
                z10 = true;
            } else {
                z10 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z10);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (s0Var == null) {
            Context context = getContext();
            boolean z11 = this.f52831p0;
            long j3 = 0;
            if (z11 && (user = this.V) != null) {
                j3 = user.f28200id;
            }
            s0Var2 = new s0(context, z11, j3);
        } else {
            s0Var2 = s0Var;
        }
        this.f52811a = s0Var2;
        if (!this.f52831p0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f52811a, true);
            CookieManager.getInstance().flush();
            this.f52811a.f52770f = this.f52841w0;
        } else {
            s0Var2.setBackgroundColor(j(j6.f28849d6));
        }
        if (!np.s1(this.N).H6) {
            this.f52811a.setLayerType(2, null);
        }
        this.f52811a.f(this, this.d);
        this.f52811a.setCloseListener(this.E0);
        WebSettings settings = this.f52811a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f52831p0) {
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
            if (this.f52831p0) {
                PackageInfo packageInfo = org.telegram.messenger.t0.f26600b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26600b.getPackageName(), 0);
                int o4 = gz.o();
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
        this.f52811a.setVerticalScrollBarEnabled(false);
        if (s0Var == null && this.f52831p0) {
            this.f52811a.setAlpha(0.0f);
        }
        addView(this.f52811a);
        if (this.f52831p0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f52836s0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f52836s0 == null) {
                ?? obj2 = new Object();
                obj2.f52558a = this;
                this.f52836s0 = obj2;
            }
            this.f52836s0.f52558a = this;
            W();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f52839v0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f52839v0;
            if (botWebViewContainer$WebViewProxy == null) {
                s0 s0Var4 = this.f52811a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(s0Var4, this);
                this.f52839v0 = botWebViewContainer$WebViewProxy2;
                s0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (s0Var == null) {
                this.f52811a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f52839v0.f52559a = this;
        }
        K(this.f52811a);
        R0 = false;
    }

    public final void Y(int i7, org.telegram.ui.ActionBar.t1 t1Var, Runnable runnable) {
        if (t1Var != null && !m(i7)) {
            t1Var.setOnDismissListener(new a3(16, this, runnable));
            this.f52817d0 = t1Var;
            t1Var.f29639k0 = false;
            t1Var.show();
            if (this.M0 != i7) {
                this.M0 = i7;
                this.N0 = 0;
                this.O0 = 0L;
            }
            this.N0++;
        }
    }

    public final void Z(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hd.M0(2131743879, "UnknownError"));
        if (str != null) {
            str2 = ": ".concat(str);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        i(sb2.toString());
    }

    public final void c() {
        if (this.f52811a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                a8.g(th2, true);
                this.f52835s.setVisibility(8);
                this.h = true;
                this.f52820f.setVisibility(0);
                s0 s0Var = this.f52811a;
                if (s0Var != null) {
                    removeView(s0Var);
                }
            }
        }
    }

    public final void d(i7 i7Var, ki.n1 n1Var, String str, String str2, String str3) {
        if (n1Var != null && this.V != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    n1Var.m(new JSONObject());
                    x(i7Var, str2, A(string, "req_id"));
                } catch (RuntimeException e10) {
                    x(i7Var, str3, B("req_id", string, "error", e10.getMessage()));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(i7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        lv0 lv0Var;
        Uri[] uriArr;
        if (i7 == ns.f25540n4) {
            s0 s0Var = this.f52811a;
            if (s0Var != null) {
                s0Var.setBackgroundColor(j(j6.f28849d6));
            }
            if (!this.f52834r0) {
                int i11 = j6.Bj;
                int j3 = j(i11);
                this.f52832q0 = j3;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN);
                v3 v3Var = this.f52835s;
                v3Var.setColorFilter(porterDuffColorFilter);
                pz pzVar = this.f52833r;
                if (pzVar != null) {
                    pzVar.f26037n = Integer.valueOf(this.f52832q0);
                    this.f52833r.f(i11, this.f52818e, 1.0f, false);
                }
                v3Var.invalidate();
            }
            z();
        } else if (i7 == ns.f25480c5) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f52844y != null) {
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
                    this.f52844y.onReceiveValue(uriArr);
                    this.f52844y = null;
                }
                uriArr = null;
                this.f52844y.onReceiveValue(uriArr);
                this.f52844y = null;
            }
        } else if (i7 == ns.f25485d5) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (lv0Var = this.W) != null) {
                lv0Var.run();
                this.W = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f52835s) {
            if (this.f52840w) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (this.f52840w) {
                canvas.restore();
            }
            if (!this.f52840w) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.f52828n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f52820f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f52811a) {
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
        if (this.V == null) {
            return;
        }
        ki.r rVar = this.f52826k0;
        if (rVar == null) {
            this.f52826k0 = ki.r.c(getContext(), this.N, this.V.f28200id);
        } else {
            rVar.h();
        }
    }

    public final i7 f() {
        s0 s0Var = this.f52811a;
        long j3 = this.f52837t0;
        boolean z10 = this.f52838u0;
        String str = this.H0;
        ?? obj = new Object();
        obj.f11825c = this;
        obj.d = s0Var;
        obj.f11823a = j3;
        obj.f11824b = z10;
        obj.f11826e = str;
        return obj;
    }

    public final void g(String str) {
        a8.b("[webviewcontainer] #" + this.P0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f52836s0;
    }

    public int getMinHeight() {
        if (getParent() instanceof x3) {
            x3 x3Var = (x3) getParent();
            if (x3Var.K) {
                return (int) ((x3Var.getMeasuredHeight() - x3Var.getOffsetY()) + this.A0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        s0 s0Var = this.f52811a;
        if (s0Var == null) {
            return null;
        }
        return k(s0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f52839v0;
    }

    public String getTrustedOrigin() {
        return this.H0;
    }

    public String getUrlLoaded() {
        return this.f52813b;
    }

    public s0 getWebView() {
        return this.f52811a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.C0);
        s0 s0Var = this.f52811a;
        if (s0Var != null) {
            if (s0Var.getParent() != null) {
                removeView(this.f52811a);
            }
            if (!this.C0) {
                this.f52811a.destroy();
                L(this.f52811a);
            }
            this.O = false;
            if (this.f52826k0 != null) {
                this.f52826k0 = null;
            }
            if (this.f52829n0 != null) {
                this.f52829n0 = null;
            }
            if (this.f52830o0 != null) {
                this.f52830o0 = null;
            }
            ki.s0 s0Var2 = this.f52827l0;
            if (s0Var2 != null) {
                s0Var2.f18542f.remove(this.L0);
                this.f52827l0 = null;
                this.K0 = null;
            }
        }
    }

    public final void i(String str) {
        new cc(this, this.f52818e).Q(2131624012, 36, str).j();
    }

    public final int j(int i7) {
        e6 e6Var = this.f52818e;
        if (e6Var != null) {
            return e6Var.h(i7);
        }
        return j6.x0(null, i7, false);
    }

    public final void l(i7 i7Var, ki.n1 n1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (n1Var != null && this.V != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        x(i7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        Pair f10 = n1Var.f(optString);
                        if (n1Var.d && (obj = f10.first) == null) {
                            Object obj2 = f10.second;
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("req_id", string);
                                jSONObject.put("value", obj);
                                jSONObject.put("can_restore", obj2);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            x(i7Var, str2, jSONObject);
                            return;
                        }
                        x(i7Var, str2, B("req_id", string, "value", f10.first));
                    } catch (RuntimeException e10) {
                        x(i7Var, str3, B("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused2) {
                    x(i7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(i7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean m(int i7) {
        if (this.f52817d0 != null || (this.O0 > 0 && System.currentTimeMillis() < this.O0)) {
            return true;
        }
        if (this.M0 != i7 || this.N0 <= 3) {
            return false;
        }
        this.O0 = System.currentTimeMillis() + 3000;
        this.N0 = 0;
        return true;
    }

    public final void n(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        invalidate();
        if ((this.O || z11) && (z12 = this.f52831p0) && (getParent() instanceof x3)) {
            x3 x3Var = (x3) getParent();
            if (z10) {
                if (x3Var.getSwipeOffsetY() == x3Var.getTopActionBarOffsetY() + (-x3Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.P = z13;
            }
            int max = Math.max(getMinHeight(), (int) (x3Var.getTopActionBarOffsetY() + ((x3Var.getMeasuredHeight() - x3Var.getOffsetY()) - x3Var.getSwipeOffsetY()) + this.A0));
            if (z11 || max != this.f52843x0 || this.f52845y0 != z10 || this.f52846z0 != this.P) {
                this.f52843x0 = max;
                this.f52845y0 = z10;
                this.f52846z0 = this.P;
                String str = "{height:" + (max / org.telegram.messenger.g0.f23608p) + ",is_state_stable:" + z10 + ",is_expanded:" + this.P + "}";
                if (z12 && !q()) {
                    g("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    ns.f(this.N).d(new z(this, a8.p0.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
                }
            }
        }
    }

    public final boolean o(i7 i7Var) {
        boolean z10;
        if (i7Var != null) {
            String str = (String) i7Var.f11826e;
            if (((v0) i7Var.f11825c) == this && ((s0) i7Var.d) == this.f52811a && i7Var.f11823a == this.f52837t0 && (z10 = i7Var.f11824b) == this.f52838u0) {
                if (z10) {
                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.H0) && TextUtils.equals(str, getOriginHost())) {
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
        ns.e().c(this, ns.f25540n4);
        ns.e().c(this, ns.f25480c5);
        ns.e().c(this, ns.f25485d5);
        setTag(2131296351, new bi.e1(this, 11));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        ns.e().n(this, ns.f25540n4);
        ns.e().n(this, ns.f25480c5);
        ns.e().n(this, ns.f25485d5);
        setTag(2131296351, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.B0;
        if (i11 >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i7, i10);
        this.f52828n.f40795f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (!this.f52814b0) {
            n(true, false);
        }
    }

    public final boolean q() {
        if (this.f52811a == null) {
            return false;
        }
        if (this.f52838u0) {
            if (TextUtils.isEmpty(this.H0) || !TextUtils.equals(this.H0, getOriginHost())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean r() {
        if (this.Q0 != null) {
            return true;
        }
        return false;
    }

    public final void s(int i7, long j3) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
        TLRPC.UserFull b22 = np.s1(i7).b2(j3);
        String n10 = q10.n(a22);
        v3 v3Var = this.f52835s;
        if (n10 != null && n10.equals("DurgerKingBot")) {
            v3Var.setVisibility(0);
            v3Var.setAlpha(1.0f);
            v3Var.h(null, null, qz.h(2131624006, Integer.valueOf(j(j6.f28792a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = si.b0(i7).f26461b.bots;
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
        boolean z10 = true;
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
                tL_attachMenuBotIcon = si.k0(tL_attachMenuBot);
            } else {
                z10 = false;
            }
            if (tL_attachMenuBotIcon != null) {
                v3Var.setVisibility(0);
                v3Var.setAlpha(1.0f);
                v3Var.j(gc.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        e6 e6Var = this.f52818e;
        if (b22 != null && (botInfo = b22.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            v3Var.setVisibility(0);
            v3Var.setAlpha(1.0f);
            pz j10 = qz.j(512, 512, b22.bot_info.app_settings.placeholder_svg_path);
            this.f52833r = j10;
            if (j10 != null) {
                j10.f26037n = Integer.valueOf(this.f52832q0);
                this.f52833r.f(j6.Bj, e6Var, 1.0f, false);
            }
            v3Var.h(null, null, this.f52833r);
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
        v3Var.setVisibility(0);
        v3Var.setAlpha(1.0f);
        pz j11 = qz.j(512, 512, path);
        this.f52833r = j11;
        if (j11 != null) {
            j11.f26037n = Integer.valueOf(this.f52832q0);
            this.f52833r.f(j6.Bj, e6Var, 1.0f, false);
        }
        v3Var.h(null, null, this.f52833r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.V = user;
    }

    public void setDelegate(c0 c0Var) {
        this.f52815c = c0Var;
    }

    public void setFlickerViewColor(int i7) {
        int b10;
        if (org.telegram.messenger.g0.B(i7) > 0.7f) {
            b10 = j6.b(0.0f, -0.15f, i7);
        } else {
            b10 = j6.b(0.025f, 0.15f, i7);
        }
        if (this.f52832q0 == b10) {
            return;
        }
        this.f52832q0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        v3 v3Var = this.f52835s;
        v3Var.setColorFilter(porterDuffColorFilter);
        pz pzVar = this.f52833r;
        if (pzVar != null) {
            pzVar.f26037n = Integer.valueOf(this.f52832q0);
            this.f52833r.f(j6.Bj, this.f52818e, 1.0f, false);
        }
        this.f52834r0 = true;
        v3Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i7) {
        if (this.B0 == i7) {
            return;
        }
        this.B0 = i7;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z10) {
        this.S = z10;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.E0 = runnable;
        s0 s0Var = this.f52811a;
        if (s0Var != null) {
            s0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(w10 w10Var) {
        this.Q0 = w10Var;
    }

    public void setOpener(s0 s0Var) {
        s0 s0Var2;
        this.f52841w0 = s0Var;
        if (!this.f52831p0 && (s0Var2 = this.f52811a) != null) {
            s0Var2.f52770f = s0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.f52812a0 = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f52814b0 = z10;
    }

    public void setViewPortHeightOffset(float f10) {
        this.A0 = f10;
    }

    public void setWasOpenedByBot(k4 k4Var) {
        this.G0 = k4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.F0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f52842x = aVar;
    }

    public void setWebViewScrollListener(u0 u0Var) {
        this.d = u0Var;
        s0 s0Var = this.f52811a;
        if (s0Var != null) {
            s0Var.f(this, u0Var);
        }
    }

    public final void t(int i7, String str, boolean z10) {
        String str2;
        this.N = i7;
        if (this.f52831p0) {
            this.f52837t0++;
            this.f52838u0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.H0 = str2;
            if (this.f52811a != null) {
                W();
            }
        }
        ns.f(i7).d(new z(this, str, 1));
    }

    @Override
    public final void updateColors() {
        v3 v3Var;
        int j3;
        try {
            if (this.f52811a != null && (j3 = j(j6.f28849d6)) != this.D0) {
                this.D0 = j3;
                this.f52811a.setBackgroundColor(j3);
            }
            if (!this.f52834r0 && (v3Var = this.f52835s) != null) {
                int i7 = this.f52832q0;
                int i10 = j6.Bj;
                if (i7 != j(i10)) {
                    int j10 = j(i10);
                    this.f52832q0 = j10;
                    v3Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
                    pz pzVar = this.f52833r;
                    if (pzVar != null) {
                        pzVar.f26037n = Integer.valueOf(this.f52832q0);
                    }
                    v3Var.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v(i7 i7Var) {
        if (this.V != null) {
            e();
            ki.r rVar = this.f52826k0;
            if (rVar == null) {
                return;
            }
            try {
                x(i7Var, "biometry_info_received", rVar.f());
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void x(i7 i7Var, String str, JSONObject jSONObject) {
        if (!o(i7Var)) {
            g("notifyEvent " + str + " dropped after document change");
            return;
        }
        y(str, jSONObject);
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.f52831p0 && !q()) {
            g("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        g("notifyEvent " + str);
        ns.f(this.N).d(new z(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject u10;
        try {
            u10 = x2.u(this.f52818e, true);
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

    public void L(s0 s0Var) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void E(boolean z10, String str) {
    }

    public void J(boolean z10, boolean z11) {
    }
}
