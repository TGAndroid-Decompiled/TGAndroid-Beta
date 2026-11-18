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
import bi.m6;
import c8.ma;
import c8.va;
import fi.f7;
import fi.t3;
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
import ki.f4;
import ki.s3;
import ki.t2;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.f3;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.lz;
import org.telegram.messenger.mp;
import org.telegram.messenger.mz;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k71;
import org.telegram.ui.kg0;
import org.telegram.ui.p9;
public abstract class v0 extends FrameLayout implements fs, c6 {
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
    public f4 G0;
    public String H;
    public String H0;
    public int I;
    public final Rect I0;
    public int J;
    public int J0;
    public String K;
    public f7 K0;
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
    public u10 Q0;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public TLRPC.User V;
    public sv0 W;
    public s0 f53294a;
    public Activity f53295a0;
    public String f53296b;
    public boolean f53297b0;
    public c0 f53298c;
    public String f53299c0;
    public u0 d;
    public org.telegram.ui.ActionBar.u1 f53300d0;
    public final i6 f53301e;
    public int f53302e0;
    public final TextView f53303f;
    public long f53304f0;
    public long f53305g0;
    public boolean h;
    public p9 f53306h0;
    public boolean f53307i0;
    public String f53308j0;
    public ki.q f53309k0;
    public ki.s0 f53310l0;
    public ki.h0 m0;
    public final org.telegram.ui.Components.voip.n f53311n;
    public ki.l1 f53312n0;
    public ki.l1 f53313o0;
    public final boolean f53314p0;
    public int f53315q0;
    public lz f53316r;
    public boolean f53317r0;
    public final t3 f53318s;
    public BotWebViewContainer$BotWebViewProxy f53319s0;
    public long f53320t0;
    public boolean f53321u0;
    public BotWebViewContainer$WebViewProxy f53322v0;
    public boolean f53323w;
    public s0 f53324w0;
    public q0.a f53325x;
    public int f53326x0;
    public ValueCallback f53327y;
    public boolean f53328y0;
    public boolean f53329z0;

    public v0(int i7, Context context, i6 i6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.f53311n = nVar;
        int i10 = n6.Fi;
        this.E = j(i10);
        int i11 = n6.Ji;
        this.F = j(i11);
        this.G = "";
        this.I = j(i10);
        this.J = j(i11);
        this.K = "";
        this.L = "";
        this.N = j10.f24770t0;
        this.B0 = -1;
        this.I0 = new Rect(0, 0, 0, 0);
        this.J0 = 0;
        this.L0 = new q(this, 2);
        this.M0 = -1;
        this.N0 = 0;
        int i12 = S0;
        S0 = i12 + 1;
        this.P0 = i12;
        this.f53314p0 = z10;
        this.f53301e = i6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.f53295a0 = (Activity) context;
        }
        nVar.f41054k = false;
        nVar.b(i7, 153);
        t3 t3Var = new t3(this, context);
        this.f53318s = t3Var;
        int j3 = j(n6.Bj);
        this.f53315q0 = j3;
        t3Var.setColorFilter(new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN));
        t3Var.getImageReceiver().S0 = true;
        addView(t3Var, ma.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f53303f = textView;
        textView.setText(gd.M0(2131752902, null));
        u6.U(textView, n6.f29786y6, i6Var);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = org.telegram.messenger.g0.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, ma.e(-1, -2, 17));
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
        sb2.append(mp.u1(j10.f24770t0).X5);
        return sb2.toString();
    }

    public static void a(v0 v0Var, String[] strArr, q0.a aVar) {
        v0Var.getClass();
        for (String str : strArr) {
            if (v0Var.getContext().checkSelfPermission(str) != 0) {
                v0Var.W = new sv0(v0Var, aVar, strArr, 10);
                Activity activity = v0Var.f53295a0;
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
        this.f53323w = z10;
        t3 t3Var = this.f53318s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t3Var.getLayoutParams();
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
        t3Var.requestLayout();
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
            if (K0.endsWith("." + mp.u1(j10.f24770t0).X5) && (str2 = (String) T0.get(K0)) != null) {
                return vf.c.w(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void w(int i7, s0 s0Var, f7 f7Var, String str, JSONObject jSONObject) {
        if (s0Var == null) {
            return;
        }
        ks.f(i7).d(new kg0(s0Var, f7Var, str, jSONObject, 27));
    }

    public final boolean D() {
        if (this.f53294a != null && this.S) {
            y("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r57, final fi.f7 r58, java.lang.String r59, java.lang.String r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.v0.F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, fi.f7, java.lang.String, java.lang.String):void");
    }

    public final void G(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            a8.b("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f53299c0, str)) {
                this.f53299c0 = null;
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
        if (vf.c.g(uri, false, zArr) && !zArr[0] && this.f53298c != null) {
            setKeyboardFocusable(false);
        }
        vf.c.s(getContext(), uri, true, z10, false, null, str, false, true, z12, false);
    }

    public abstract void K(s0 s0Var);

    public final void M() {
        g("preserveWebView");
        this.C0 = true;
        if (this.f53314p0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.f53320t0++;
        }
        s0 s0Var = this.f53294a;
        if (s0Var != null) {
            s0Var.f(null, null);
            this.f53294a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f53319s0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f53043a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f53322v0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f53044a = null;
        }
    }

    public final void O(int i7, s0 s0Var, Object obj, String str, boolean z10) {
        String str2;
        this.N = i7;
        this.C0 = false;
        boolean z11 = this.f53314p0;
        if (z11) {
            this.f53320t0++;
            this.f53321u0 = z10;
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
        y("content_safe_area_changed", C("left", 0, "top", Float.valueOf(i7 / org.telegram.messenger.g0.f24117p), "right", 0, "bottom", 0));
        this.J0 = i7;
    }

    public final void Q(Rect rect, boolean z10) {
        if (rect != null) {
            Rect rect2 = this.I0;
            if (z10 || !rect2.equals(rect)) {
                y("safe_area_changed", C("left", Float.valueOf(rect.left / org.telegram.messenger.g0.f24117p), "top", Float.valueOf(rect.top / org.telegram.messenger.g0.f24117p), "right", Float.valueOf(rect.right / org.telegram.messenger.g0.f24117p), "bottom", Float.valueOf(rect.bottom / org.telegram.messenger.g0.f24117p)));
                rect2.set(rect);
            }
        }
    }

    public final void R() {
        try {
            if (this.H != null) {
                F(this.f53319s0, f(), "web_app_setup_main_button", this.H);
            }
            if (this.M != null) {
                F(this.f53319s0, f(), "web_app_setup_secondary_button", this.M);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void S(f7 f7Var, ki.l1 l1Var, String str) {
        i6 i6Var;
        boolean z10;
        boolean z11;
        if (l1Var != null && this.V != null) {
            boolean z12 = true;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(f7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = l1Var.h(optString);
                        if (h.isEmpty()) {
                            x(f7Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        v vVar = new v(this, f7Var, string, l1Var, optString);
                        h2 T = LaunchActivity.T();
                        if (T != null) {
                            i6Var = T.getResourceProvider();
                        } else {
                            i6Var = null;
                        }
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        x2 j3 = f3.j(1, context, i6Var, false);
                        ViewGroup g10 = f3.g(context, 1);
                        q9 q9Var = new q9(context);
                        TLRPC.User c22 = mp.u1(l1Var.f18759a).c2(Long.valueOf(l1Var.f18760b));
                        b9 b9Var = new b9((i6) null);
                        b9Var.r(c22);
                        q9Var.f(c22, b9Var);
                        g10.addView(q9Var, ma.t(80, 80, 49, 0, 21, 0, 13));
                        int i7 = n6.G6;
                        Context context2 = context;
                        TextView b10 = va.b(context2, 20.0f, i7, true, null);
                        b10.setText(gd.M0(2131752979, null));
                        b10.setGravity(17);
                        g10.addView(b10, ma.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = va.b(context2, 14.0f, i7, false, null);
                        f3.q(null, null, 2131752980, new Object[]{n5.H(null, null, c22)}, b11);
                        b11.setGravity(17);
                        g10.addView(b11, ma.t(-1, -2, 7, 32, 0, 32, 19));
                        a9 a9Var = new a9(context2, i6Var);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        a9Var.setBackground(new mq(colorDrawable, n6.X0(context2, 2131231229, n6.w0(n6.f29358b7, i6Var))));
                        u6.x(a9Var, colorDrawable, n6.f29337a7, i6Var, PorterDuff.Mode.SRC_IN);
                        a9Var.setFixedSize(12);
                        g10.addView(a9Var, ma.t(-1, 12, 7, 0, 0, 0, 0));
                        o4 o4Var = new o4(context2, i6Var);
                        o4Var.setText(gd.M0(2131752981, null));
                        g10.addView(o4Var, ma.t(-1, -2, 7, 0, 0, 0, 0));
                        hi.d dVar = new hi.d(context2, i6Var, true);
                        ArrayList arrayList = new ArrayList();
                        int i10 = 0;
                        while (i10 < h.size()) {
                            ki.k1 k1Var = (ki.k1) h.get(i10);
                            boolean z13 = z12;
                            if (i10 < h.size() - 1) {
                                z11 = z13;
                            } else {
                                z11 = false;
                            }
                            ki.j1 j1Var = new ki.j1(k1Var, z11, context2);
                            int i11 = n6.f29486i6;
                            v vVar2 = vVar;
                            org.telegram.ui.Cells.y h02 = n6.h0(n6.w0(i11, i6Var), 2, -1);
                            q6 M = u6.M(i11);
                            j1Var.setBackground(h02);
                            u6.j(j1Var, h02, null, M, i6Var);
                            ViewGroup viewGroup = g10;
                            j1Var.setOnClickListener(new m6(strArr, k1Var, arrayList, dVar, 3));
                            viewGroup.addView(j1Var, ma.o(-1, 56));
                            arrayList.add(j1Var);
                            i10++;
                            context2 = context2;
                            g10 = viewGroup;
                            z12 = z13;
                            vVar = vVar2;
                            zArr = zArr;
                        }
                        v vVar3 = vVar;
                        boolean[] zArr2 = zArr;
                        ViewGroup viewGroup2 = g10;
                        dVar.i(gd.M0(2131752983, null), false, z12);
                        if (strArr[0] != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        dVar.setEnabled(z10);
                        viewGroup2.addView(dVar, ma.t(-1, 48, 7, 8, 8, 8, 4));
                        j3.O = viewGroup2;
                        j3.Q(n6.f29467h5);
                        dVar.setOnClickListener(new m6(zArr2, vVar3, strArr, j3, 4));
                        j3.setOnDismissListener(new di.u1(5, zArr2, vVar3));
                        j3.show();
                    } catch (Exception e10) {
                        x(f7Var, "secure_storage_failed", B("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused) {
                    x(f7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(f7Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void U(String str, boolean z10) {
        boolean z11;
        boolean z12;
        s0 s0Var = this.f53294a;
        if (s0Var != null) {
            boolean z13 = s0Var.F;
        }
        if (s0Var != null && s0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        s0 s0Var2 = this.f53294a;
        if (s0Var2 != null && s0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        J(z11, z12);
        s0 s0Var3 = this.f53294a;
        if (s0Var3 != null) {
            s0Var3.f53250b = true;
        }
        if (this.O) {
            g("setPageLoaded: already loaded");
            return;
        }
        t3 t3Var = this.f53318s;
        if (z10 && s0Var3 != null && t3Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f53294a, property, 1.0f), ObjectAnimator.ofFloat(t3Var, property, 0.0f));
            animatorSet.addListener(new k71(this, 14));
            animatorSet.start();
        } else {
            if (s0Var3 != null) {
                s0Var3.setAlpha(1.0f);
            }
            if (t3Var != null) {
                t3Var.setAlpha(0.0f);
                t3Var.setVisibility(8);
            }
        }
        this.f53296b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.O = true;
        this.f53298c.getClass();
    }

    public final void V(f7 f7Var, ki.l1 l1Var, String str, String str2, String str3) {
        if (l1Var != null && this.V != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(f7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            l1Var.n(optString, jSONObject.optString("value"));
                            x(f7Var, str2, A(string, "req_id"));
                        } catch (RuntimeException e10) {
                            x(f7Var, str3, B("req_id", string, "error", e10.getMessage()));
                        }
                    } catch (Exception unused) {
                        x(f7Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    x(f7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(f7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void W() {
        s0 s0Var = this.f53294a;
        if (s0Var != null && this.f53314p0) {
            s0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!a8.q9.a("WEB_MESSAGE_LISTENER")) {
                g("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            s0 s0Var2 = this.f53294a;
            if (!s0Var2.S) {
                d5.b.a(s0Var2, "TelegramWebviewProxyMessage", singleton, new org.telegram.ui.ActionBar.p(s0Var2, 9));
                this.f53294a.S = true;
            }
            if (a8.q9.a("DOCUMENT_START_SCRIPT")) {
                s0 s0Var3 = this.f53294a;
                if (s0Var3.T == null) {
                    boolean z10 = d5.b.f7853a;
                    if (e5.k.d.b()) {
                        s0Var3.T = new cb.c((ScriptHandlerBoundaryInterface) af.b.b(ScriptHandlerBoundaryInterface.class, d5.b.c(s0Var3).f10866a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 17);
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
        s0 s0Var3 = this.f53294a;
        if (s0Var3 != null) {
            s0Var3.destroy();
            removeView(this.f53294a);
        }
        if (s0Var != null) {
            org.telegram.messenger.g0.E2(s0Var);
        }
        try {
            if (bz.J0 && !r()) {
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
            boolean z11 = this.f53314p0;
            long j3 = 0;
            if (z11 && (user = this.V) != null) {
                j3 = user.f28552id;
            }
            s0Var2 = new s0(context, z11, j3);
        } else {
            s0Var2 = s0Var;
        }
        this.f53294a = s0Var2;
        if (!this.f53314p0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f53294a, true);
            CookieManager.getInstance().flush();
            this.f53294a.f53253f = this.f53324w0;
        } else {
            s0Var2.setBackgroundColor(j(n6.f29394d6));
        }
        if (!mp.u1(this.N).J6) {
            this.f53294a.setLayerType(2, null);
        }
        this.f53294a.f(this, this.d);
        this.f53294a.setCloseListener(this.E0);
        WebSettings settings = this.f53294a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f53314p0) {
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
            if (this.f53314p0) {
                PackageInfo packageInfo = org.telegram.messenger.t0.f26913b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26913b.getPackageName(), 0);
                int o4 = bz.o();
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
        this.f53294a.setVerticalScrollBarEnabled(false);
        if (s0Var == null && this.f53314p0) {
            this.f53294a.setAlpha(0.0f);
        }
        addView(this.f53294a);
        if (this.f53314p0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f53319s0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f53319s0 == null) {
                ?? obj2 = new Object();
                obj2.f53043a = this;
                this.f53319s0 = obj2;
            }
            this.f53319s0.f53043a = this;
            W();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f53322v0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f53322v0;
            if (botWebViewContainer$WebViewProxy == null) {
                s0 s0Var4 = this.f53294a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(s0Var4, this);
                this.f53322v0 = botWebViewContainer$WebViewProxy2;
                s0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (s0Var == null) {
                this.f53294a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f53322v0.f53044a = this;
        }
        K(this.f53294a);
        R0 = false;
    }

    public final void Y(int i7, org.telegram.ui.ActionBar.u1 u1Var, Runnable runnable) {
        if (u1Var != null && !m(i7)) {
            u1Var.setOnDismissListener(new di.u1(14, this, runnable));
            this.f53300d0 = u1Var;
            u1Var.f30049k0 = false;
            u1Var.show();
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
        sb2.append(gd.M0(2131743642, "UnknownError"));
        if (str != null) {
            str2 = ": ".concat(str);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        i(sb2.toString());
    }

    public final void c() {
        if (this.f53294a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                a8.g(th2, true);
                this.f53318s.setVisibility(8);
                this.h = true;
                this.f53303f.setVisibility(0);
                s0 s0Var = this.f53294a;
                if (s0Var != null) {
                    removeView(s0Var);
                }
            }
        }
    }

    public final void d(f7 f7Var, ki.l1 l1Var, String str, String str2, String str3) {
        if (l1Var != null && this.V != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    l1Var.m(new JSONObject());
                    x(f7Var, str2, A(string, "req_id"));
                } catch (RuntimeException e10) {
                    x(f7Var, str3, B("req_id", string, "error", e10.getMessage()));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(f7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        sv0 sv0Var;
        Uri[] uriArr;
        if (i7 == ks.f25175q4) {
            s0 s0Var = this.f53294a;
            if (s0Var != null) {
                s0Var.setBackgroundColor(j(n6.f29394d6));
            }
            if (!this.f53317r0) {
                int i11 = n6.Bj;
                int j3 = j(i11);
                this.f53315q0 = j3;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j3, PorterDuff.Mode.SRC_IN);
                t3 t3Var = this.f53318s;
                t3Var.setColorFilter(porterDuffColorFilter);
                lz lzVar = this.f53316r;
                if (lzVar != null) {
                    lzVar.f25494n = Integer.valueOf(this.f53315q0);
                    this.f53316r.f(i11, this.f53301e, 1.0f, false);
                }
                t3Var.invalidate();
            }
            z();
        } else if (i7 == ks.f25115f5) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f53327y != null) {
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
                    this.f53327y.onReceiveValue(uriArr);
                    this.f53327y = null;
                }
                uriArr = null;
                this.f53327y.onReceiveValue(uriArr);
                this.f53327y = null;
            }
        } else if (i7 == ks.f25121g5) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (sv0Var = this.W) != null) {
                sv0Var.run();
                this.W = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f53318s) {
            if (this.f53323w) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j3);
            if (this.f53323w) {
                canvas.restore();
            }
            if (!this.f53323w) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.f53311n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f53303f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f53294a) {
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
        ki.q qVar = this.f53309k0;
        if (qVar == null) {
            this.f53309k0 = ki.q.c(getContext(), this.N, this.V.f28552id);
        } else {
            qVar.h();
        }
    }

    public final f7 f() {
        s0 s0Var = this.f53294a;
        long j3 = this.f53320t0;
        boolean z10 = this.f53321u0;
        String str = this.H0;
        ?? obj = new Object();
        obj.f11947c = this;
        obj.d = s0Var;
        obj.f11945a = j3;
        obj.f11946b = z10;
        obj.f11948e = str;
        return obj;
    }

    public final void g(String str) {
        a8.b("[webviewcontainer] #" + this.P0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f53319s0;
    }

    public int getMinHeight() {
        if (getParent() instanceof s3) {
            s3 s3Var = (s3) getParent();
            if (s3Var.K) {
                return (int) ((s3Var.getMeasuredHeight() - s3Var.getOffsetY()) + this.A0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        s0 s0Var = this.f53294a;
        if (s0Var == null) {
            return null;
        }
        return k(s0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f53322v0;
    }

    public String getTrustedOrigin() {
        return this.H0;
    }

    public String getUrlLoaded() {
        return this.f53296b;
    }

    public s0 getWebView() {
        return this.f53294a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.C0);
        s0 s0Var = this.f53294a;
        if (s0Var != null) {
            if (s0Var.getParent() != null) {
                removeView(this.f53294a);
            }
            if (!this.C0) {
                this.f53294a.destroy();
                L(this.f53294a);
            }
            this.O = false;
            if (this.f53309k0 != null) {
                this.f53309k0 = null;
            }
            if (this.f53312n0 != null) {
                this.f53312n0 = null;
            }
            if (this.f53313o0 != null) {
                this.f53313o0 = null;
            }
            ki.s0 s0Var2 = this.f53310l0;
            if (s0Var2 != null) {
                s0Var2.f18880f.remove(this.L0);
                this.f53310l0 = null;
                this.K0 = null;
            }
        }
    }

    public final void i(String str) {
        new lc(this, this.f53301e).Q(2131624012, 36, str).j();
    }

    public final int j(int i7) {
        i6 i6Var = this.f53301e;
        if (i6Var != null) {
            return i6Var.k(i7);
        }
        return n6.x0(null, i7, false);
    }

    public final void l(f7 f7Var, ki.l1 l1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (l1Var != null && this.V != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        x(f7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        Pair f10 = l1Var.f(optString);
                        if (l1Var.d && (obj = f10.first) == null) {
                            Object obj2 = f10.second;
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("req_id", string);
                                jSONObject.put("value", obj);
                                jSONObject.put("can_restore", obj2);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            x(f7Var, str2, jSONObject);
                            return;
                        }
                        x(f7Var, str2, B("req_id", string, "value", f10.first));
                    } catch (RuntimeException e10) {
                        x(f7Var, str3, B("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused2) {
                    x(f7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(f7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean m(int i7) {
        if (this.f53300d0 != null || (this.O0 > 0 && System.currentTimeMillis() < this.O0)) {
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
        if ((this.O || z11) && (z12 = this.f53314p0) && (getParent() instanceof s3)) {
            s3 s3Var = (s3) getParent();
            if (z10) {
                if (s3Var.getSwipeOffsetY() == s3Var.getTopActionBarOffsetY() + (-s3Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.P = z13;
            }
            int max = Math.max(getMinHeight(), (int) (s3Var.getTopActionBarOffsetY() + ((s3Var.getMeasuredHeight() - s3Var.getOffsetY()) - s3Var.getSwipeOffsetY()) + this.A0));
            if (z11 || max != this.f53326x0 || this.f53328y0 != z10 || this.f53329z0 != this.P) {
                this.f53326x0 = max;
                this.f53328y0 = z10;
                this.f53329z0 = this.P;
                String str = "{height:" + (max / org.telegram.messenger.g0.f24117p) + ",is_state_stable:" + z10 + ",is_expanded:" + this.P + "}";
                if (z12 && !q()) {
                    g("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    ks.f(this.N).d(new z(this, a8.p0.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
                }
            }
        }
    }

    public final boolean o(f7 f7Var) {
        boolean z10;
        if (f7Var != null) {
            String str = (String) f7Var.f11948e;
            if (((v0) f7Var.f11947c) == this && ((s0) f7Var.d) == this.f53294a && f7Var.f11945a == this.f53320t0 && (z10 = f7Var.f11946b) == this.f53321u0) {
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
        ks.e().c(this, ks.f25175q4);
        ks.e().c(this, ks.f25115f5);
        ks.e().c(this, ks.f25121g5);
        setTag(2131296351, new bi.e1(this, 11));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        ks.e().n(this, ks.f25175q4);
        ks.e().n(this, ks.f25115f5);
        ks.e().n(this, ks.f25121g5);
        setTag(2131296351, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = this.B0;
        if (i11 >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i7, i10);
        this.f53311n.f41050f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (!this.f53297b0) {
            n(true, false);
        }
    }

    public final boolean q() {
        if (this.f53294a == null) {
            return false;
        }
        if (this.f53321u0) {
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
        TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
        TLRPC.UserFull d2 = mp.u1(i7).d2(j3);
        String o4 = o10.o(c22);
        t3 t3Var = this.f53318s;
        if (o4 != null && o4.equals("DurgerKingBot")) {
            t3Var.setVisibility(0);
            t3Var.setAlpha(1.0f);
            t3Var.h(null, null, mz.h(2131624006, Integer.valueOf(j(n6.f29337a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = ri.d0(i7).f26599b.bots;
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
                tL_attachMenuBotIcon = ri.m0(tL_attachMenuBot);
            } else {
                z10 = false;
            }
            if (tL_attachMenuBotIcon != null) {
                t3Var.setVisibility(0);
                t3Var.setAlpha(1.0f);
                t3Var.j(fc.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        i6 i6Var = this.f53301e;
        if (d2 != null && (botInfo = d2.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            t3Var.setVisibility(0);
            t3Var.setAlpha(1.0f);
            lz j10 = mz.j(512, 512, d2.bot_info.app_settings.placeholder_svg_path);
            this.f53316r = j10;
            if (j10 != null) {
                j10.f25494n = Integer.valueOf(this.f53315q0);
                this.f53316r.f(n6.Bj, i6Var, 1.0f, false);
            }
            t3Var.h(null, null, this.f53316r);
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
        t3Var.setVisibility(0);
        t3Var.setAlpha(1.0f);
        lz j11 = mz.j(512, 512, path);
        this.f53316r = j11;
        if (j11 != null) {
            j11.f25494n = Integer.valueOf(this.f53315q0);
            this.f53316r.f(n6.Bj, i6Var, 1.0f, false);
        }
        t3Var.h(null, null, this.f53316r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.V = user;
    }

    public void setDelegate(c0 c0Var) {
        this.f53298c = c0Var;
    }

    public void setFlickerViewColor(int i7) {
        int b10;
        if (org.telegram.messenger.g0.B(i7) > 0.7f) {
            b10 = n6.b(0.0f, -0.15f, i7);
        } else {
            b10 = n6.b(0.025f, 0.15f, i7);
        }
        if (this.f53315q0 == b10) {
            return;
        }
        this.f53315q0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        t3 t3Var = this.f53318s;
        t3Var.setColorFilter(porterDuffColorFilter);
        lz lzVar = this.f53316r;
        if (lzVar != null) {
            lzVar.f25494n = Integer.valueOf(this.f53315q0);
            this.f53316r.f(n6.Bj, this.f53301e, 1.0f, false);
        }
        this.f53317r0 = true;
        t3Var.invalidate();
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
        s0 s0Var = this.f53294a;
        if (s0Var != null) {
            s0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(u10 u10Var) {
        this.Q0 = u10Var;
    }

    public void setOpener(s0 s0Var) {
        s0 s0Var2;
        this.f53324w0 = s0Var;
        if (!this.f53314p0 && (s0Var2 = this.f53294a) != null) {
            s0Var2.f53253f = s0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.f53295a0 = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f53297b0 = z10;
    }

    public void setViewPortHeightOffset(float f10) {
        this.A0 = f10;
    }

    public void setWasOpenedByBot(f4 f4Var) {
        this.G0 = f4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.F0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f53325x = aVar;
    }

    public void setWebViewScrollListener(u0 u0Var) {
        this.d = u0Var;
        s0 s0Var = this.f53294a;
        if (s0Var != null) {
            s0Var.f(this, u0Var);
        }
    }

    public final void t(int i7, String str, boolean z10) {
        String str2;
        this.N = i7;
        if (this.f53314p0) {
            this.f53320t0++;
            this.f53321u0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.H0 = str2;
            if (this.f53294a != null) {
                W();
            }
        }
        ks.f(i7).d(new z(this, str, 1));
    }

    @Override
    public final void updateColors() {
        t3 t3Var;
        int j3;
        try {
            if (this.f53294a != null && (j3 = j(n6.f29394d6)) != this.D0) {
                this.D0 = j3;
                this.f53294a.setBackgroundColor(j3);
            }
            if (!this.f53317r0 && (t3Var = this.f53318s) != null) {
                int i7 = this.f53315q0;
                int i10 = n6.Bj;
                if (i7 != j(i10)) {
                    int j10 = j(i10);
                    this.f53315q0 = j10;
                    t3Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
                    lz lzVar = this.f53316r;
                    if (lzVar != null) {
                        lzVar.f25494n = Integer.valueOf(this.f53315q0);
                    }
                    t3Var.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v(f7 f7Var) {
        if (this.V != null) {
            e();
            ki.q qVar = this.f53309k0;
            if (qVar == null) {
                return;
            }
            try {
                x(f7Var, "biometry_info_received", qVar.f());
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void x(f7 f7Var, String str, JSONObject jSONObject) {
        if (!o(f7Var)) {
            g("notifyEvent " + str + " dropped after document change");
            return;
        }
        y(str, jSONObject);
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.f53314p0 && !q()) {
            g("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        g("notifyEvent " + str);
        ks.f(this.N).d(new z(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject u10;
        try {
            u10 = t2.u(this.f53301e, true);
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
