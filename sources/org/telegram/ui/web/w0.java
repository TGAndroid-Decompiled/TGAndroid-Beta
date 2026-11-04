package org.telegram.ui.web;

import ai.r4;
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
import b8.mf;
import b8.p9;
import b8.rf;
import ci.h3;
import ei.d4;
import ei.p7;
import ii.a3;
import ii.c4;
import ii.q4;
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
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.k5;
import org.telegram.messenger.kz;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i81;
import org.telegram.ui.ih0;
import org.telegram.ui.n9;
public abstract class w0 extends FrameLayout implements cs, z5 {
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
    public q4 G0;
    public String H;
    public String H0;
    public int I;
    public final Rect I0;
    public int J;
    public int J0;
    public String K;
    public p7 K0;
    public String L;
    public final r L0;
    public String M;
    public int M0;
    public int N;
    public int N0;
    public boolean O;
    public long O0;
    public boolean P;
    public final int P0;
    public long Q;
    public r10 Q0;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public TLRPC.User V;
    public iv0 W;
    public t0 f51060a;
    public Activity f51061a0;
    public String f51062b;
    public boolean f51063b0;
    public d0 f51064c;
    public String f51065c0;
    public v0 d;
    public org.telegram.ui.ActionBar.s1 f51066d0;
    public final e6 f51067e;
    public int f51068e0;
    public final TextView f51069f;
    public long f51070f0;
    public long f51071g0;
    public boolean h;
    public n9 f51072h0;
    public boolean f51073i0;
    public String f51074j0;
    public ii.r f51075k0;
    public ii.s0 f51076l0;
    public ii.i0 m0;
    public final org.telegram.ui.Components.voip.g f51077n;
    public ii.n1 f51078n0;
    public ii.n1 f51079o0;
    public final boolean f51080p0;
    public int f51081q0;
    public jz f51082r;
    public boolean f51083r0;
    public final d4 f51084s;
    public BotWebViewContainer$BotWebViewProxy f51085s0;
    public long f51086t0;
    public boolean f51087u0;
    public BotWebViewContainer$WebViewProxy f51088v0;
    public boolean f51089w;
    public t0 f51090w0;
    public q0.a f51091x;
    public int f51092x0;
    public ValueCallback f51093y;
    public boolean f51094y0;
    public boolean f51095z0;

    public w0(int i3, Context context, e6 e6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f51077n = gVar;
        int i10 = k6.Ci;
        this.E = j(i10);
        int i11 = k6.Gi;
        this.F = j(i11);
        this.G = "";
        this.I = j(i10);
        this.J = j(i11);
        this.K = "";
        this.L = "";
        this.N = h10.f22829t0;
        this.B0 = -1;
        this.I0 = new Rect(0, 0, 0, 0);
        this.J0 = 0;
        this.L0 = new r(this, 2);
        this.M0 = -1;
        this.N0 = 0;
        int i12 = S0;
        S0 = i12 + 1;
        this.P0 = i12;
        this.f51080p0 = z10;
        this.f51067e = e6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.f51061a0 = (Activity) context;
        }
        gVar.f39353k = false;
        gVar.b(i3, 153);
        d4 d4Var = new d4(this, context);
        this.f51084s = d4Var;
        int j10 = j(k6.yj);
        this.f51081q0 = j10;
        d4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        d4Var.getImageReceiver().S0 = true;
        addView(d4Var, mf.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f51069f = textView;
        textView.setText(bd.M0(2131752913, null));
        r6.V(textView, k6.f28273y6, e6Var);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int L = org.telegram.messenger.g0.L(16.0f);
        textView.setPadding(L, L, L, L);
        addView(textView, mf.e(-1, -2, 17));
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
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sf.c.w(Uri.parse(str2), "https", null, S(org.telegram.messenger.g0.K0(str2, false)), null)).openConnection();
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

    public static String S(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        String[] split = str.split("\\.");
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < split.length; i3++) {
            if (i3 > 0) {
                sb2.append("-d");
            }
            sb2.append(split[i3].replaceAll("\\-", "-h"));
        }
        sb2.append(".");
        sb2.append(hp.s1(h10.f22829t0).U5);
        return sb2.toString();
    }

    public static void a(w0 w0Var, String[] strArr, q0.a aVar) {
        w0Var.getClass();
        for (String str : strArr) {
            if (w0Var.getContext().checkSelfPermission(str) != 0) {
                w0Var.W = new iv0(w0Var, aVar, strArr, 9);
                Activity activity = w0Var.f51061a0;
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
            String S = S(K0);
            if (T0 == null) {
                T0 = new HashMap();
            }
            T0.put(S, K0);
            return sf.c.w(Uri.parse(str), "https", null, S, null);
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
        int i3;
        this.f51089w = z10;
        d4 d4Var = this.f51084s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d4Var.getLayoutParams();
        if (z10) {
            i3 = 17;
        } else {
            i3 = 48;
        }
        layoutParams.gravity = i3;
        if (z10) {
            int L = org.telegram.messenger.g0.L(100.0f);
            layoutParams.height = L;
            layoutParams.width = L;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        d4Var.requestLayout();
    }

    private void setupWebView(t0 t0Var) {
        W(t0Var, null);
    }

    public static String u(String str) {
        String str2;
        if (T0 == null || str == null) {
            return str;
        }
        String K0 = org.telegram.messenger.g0.K0(str, false);
        if (K0 != null) {
            if (K0.endsWith("." + hp.s1(h10.f22829t0).U5) && (str2 = (String) T0.get(K0)) != null) {
                return sf.c.w(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void w(int i3, t0 t0Var, p7 p7Var, String str, JSONObject jSONObject) {
        if (t0Var == null) {
            return;
        }
        hs.f(i3).d(new ih0(t0Var, p7Var, str, jSONObject, 26));
    }

    public final boolean C() {
        if (this.f51060a != null && this.S) {
            y("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r57, final ei.p7 r58, java.lang.String r59, java.lang.String r60) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.w0.E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, ei.p7, java.lang.String, java.lang.String):void");
    }

    public final void F(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            a8.b("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f51065c0, str)) {
                this.f51065c0 = null;
            }
        } catch (JSONException e10) {
            a8.g(e10, true);
        }
    }

    public final void G(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.Q > 10000 && z11) {
            return;
        }
        this.Q = 0L;
        boolean[] zArr = {false};
        if (sf.c.g(uri, false, zArr) && !zArr[0] && this.f51064c != null) {
            setKeyboardFocusable(false);
        }
        sf.c.s(getContext(), uri, true, z10, false, null, str, false, true, z12, false);
    }

    public abstract void J(t0 t0Var);

    public final void L() {
        g("preserveWebView");
        this.C0 = true;
        if (this.f51080p0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.f51086t0++;
        }
        t0 t0Var = this.f51060a;
        if (t0Var != null) {
            t0Var.f(null, null);
            this.f51060a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f51085s0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f50801a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f51088v0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f50802a = null;
        }
    }

    public final void N(int i3, t0 t0Var, Object obj, String str, boolean z10) {
        String str2;
        this.N = i3;
        this.C0 = false;
        boolean z11 = this.f51080p0;
        if (z11) {
            this.f51086t0++;
            this.f51087u0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.H0 = str2;
        }
        W(t0Var, obj);
        if (z11) {
            y("visibility_changed", A(Boolean.TRUE, "is_visible"));
        }
    }

    public final void O(int i3, boolean z10) {
        JSONObject jSONObject;
        if (!z10 && i3 == this.J0) {
            return;
        }
        Float valueOf = Float.valueOf(i3 / org.telegram.messenger.g0.f22607p);
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
        this.J0 = i3;
    }

    public final void P(Rect rect, boolean z10) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.I0;
            if (z10 || !rect2.equals(rect)) {
                Float valueOf = Float.valueOf(rect.left / org.telegram.messenger.g0.f22607p);
                Float valueOf2 = Float.valueOf(rect.top / org.telegram.messenger.g0.f22607p);
                Float valueOf3 = Float.valueOf(rect.right / org.telegram.messenger.g0.f22607p);
                Float valueOf4 = Float.valueOf(rect.bottom / org.telegram.messenger.g0.f22607p);
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
            if (this.H != null) {
                E(this.f51085s0, f(), "web_app_setup_main_button", this.H);
            }
            if (this.M != null) {
                E(this.f51085s0, f(), "web_app_setup_secondary_button", this.M);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void R(p7 p7Var, ii.n1 n1Var, String str) {
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
                        x(p7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = n1Var.h(optString);
                        if (h.isEmpty()) {
                            x(p7Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        w wVar = new w(this, p7Var, string, n1Var, optString);
                        d2 T = LaunchActivity.T();
                        if (T != null) {
                            e6Var = T.getResourceProvider();
                        } else {
                            e6Var = null;
                        }
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        t2 l10 = k5.l(1, context, e6Var, false);
                        ViewGroup f10 = k5.f(context, 1);
                        k9 k9Var = new k9(context);
                        TLRPC.User a22 = hp.s1(n1Var.f15091a).a2(Long.valueOf(n1Var.f15092b));
                        u8 u8Var = new u8((e6) null);
                        u8Var.r(a22);
                        k9Var.e(a22, u8Var);
                        f10.addView(k9Var, mf.t(80, 80, 49, 0, 21, 0, 13));
                        int i3 = k6.G6;
                        Context context2 = context;
                        TextView b10 = rf.b(context2, 20.0f, i3, true, null);
                        b10.setText(bd.M0(2131752990, null));
                        b10.setGravity(17);
                        f10.addView(b10, mf.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = rf.b(context2, 14.0f, i3, false, null);
                        k5.r(null, null, 2131752991, new Object[]{m5.H(null, null, a22)}, b11);
                        b11.setGravity(17);
                        f10.addView(b11, mf.t(-1, -2, 7, 32, 0, 32, 19));
                        y8 y8Var = new y8(context2, e6Var);
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        y8Var.setBackground(new xp(colorDrawable, k6.X0(context2, 2131231229, k6.w0(k6.f27843b7, e6Var))));
                        r6.y(y8Var, colorDrawable, k6.f27824a7, e6Var, PorterDuff.Mode.SRC_IN);
                        y8Var.setFixedSize(12);
                        f10.addView(y8Var, mf.t(-1, 12, 7, 0, 0, 0, 0));
                        n4 n4Var = new n4(context2, e6Var);
                        n4Var.setText(bd.M0(2131752992, null));
                        f10.addView(n4Var, mf.t(-1, -2, 7, 0, 0, 0, 0));
                        gi.d dVar = new gi.d(context2, e6Var, true);
                        ArrayList arrayList = new ArrayList();
                        int i10 = 0;
                        while (i10 < h.size()) {
                            ii.m1 m1Var = (ii.m1) h.get(i10);
                            boolean z13 = z12;
                            if (i10 < h.size() - 1) {
                                z11 = z13;
                            } else {
                                z11 = false;
                            }
                            ii.l1 l1Var = new ii.l1(m1Var, z11, context2);
                            int i11 = k6.f27972i6;
                            w wVar2 = wVar;
                            org.telegram.ui.Cells.y h02 = k6.h0(k6.w0(i11, e6Var), 2, -1);
                            n6 N = r6.N(i11);
                            l1Var.setBackground(h02);
                            r6.k(l1Var, h02, null, N, e6Var);
                            ViewGroup viewGroup = f10;
                            l1Var.setOnClickListener(new r4(strArr, m1Var, arrayList, dVar, 3));
                            viewGroup.addView(l1Var, mf.o(-1, 56));
                            arrayList.add(l1Var);
                            i10++;
                            context2 = context2;
                            f10 = viewGroup;
                            z12 = z13;
                            wVar = wVar2;
                            zArr = zArr;
                        }
                        w wVar3 = wVar;
                        boolean[] zArr2 = zArr;
                        ViewGroup viewGroup2 = f10;
                        dVar.i(bd.M0(2131752994, null), false, z12);
                        if (strArr[0] != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        dVar.setEnabled(z10);
                        viewGroup2.addView(dVar, mf.t(-1, 48, 7, 8, 8, 8, 4));
                        l10.O = viewGroup2;
                        l10.P(k6.f27954h5);
                        dVar.setOnClickListener(new r4(zArr2, wVar3, strArr, l10, 4));
                        l10.setOnDismissListener(new h3(3, zArr2, wVar3));
                        l10.show();
                    } catch (Exception e10) {
                        x(p7Var, "secure_storage_failed", B("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused) {
                    x(p7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(p7Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void T(String str, boolean z10) {
        boolean z11;
        boolean z12;
        t0 t0Var = this.f51060a;
        if (t0Var != null) {
            boolean z13 = t0Var.F;
        }
        if (t0Var != null && t0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        t0 t0Var2 = this.f51060a;
        if (t0Var2 != null && t0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        I(z11, z12);
        t0 t0Var3 = this.f51060a;
        if (t0Var3 != null) {
            t0Var3.f51022b = true;
        }
        if (this.O) {
            g("setPageLoaded: already loaded");
            return;
        }
        d4 d4Var = this.f51084s;
        if (z10 && t0Var3 != null && d4Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f51060a, property, 1.0f), ObjectAnimator.ofFloat(d4Var, property, 0.0f));
            animatorSet.addListener(new i81(this, 13));
            animatorSet.start();
        } else {
            if (t0Var3 != null) {
                t0Var3.setAlpha(1.0f);
            }
            if (d4Var != null) {
                d4Var.setAlpha(0.0f);
                d4Var.setVisibility(8);
            }
        }
        this.f51062b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.O = true;
        this.f51064c.getClass();
    }

    public final void U(p7 p7Var, ii.n1 n1Var, String str, String str2, String str3) {
        if (n1Var != null && this.V != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(p7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            n1Var.n(optString, jSONObject.optString("value"));
                            x(p7Var, str2, A(string, "req_id"));
                        } catch (RuntimeException e10) {
                            x(p7Var, str3, B("req_id", string, "error", e10.getMessage()));
                        }
                    } catch (Exception unused) {
                        x(p7Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    x(p7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(p7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void V() {
        t0 t0Var = this.f51060a;
        if (t0Var != null && this.f51080p0) {
            t0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!p9.a("WEB_MESSAGE_LISTENER")) {
                g("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            t0 t0Var2 = this.f51060a;
            if (!t0Var2.S) {
                c5.a.a(t0Var2, "TelegramWebviewProxyMessage", singleton, new e3(t0Var2, 4));
                this.f51060a.S = true;
            }
            if (p9.a("DOCUMENT_START_SCRIPT")) {
                t0 t0Var3 = this.f51060a;
                if (t0Var3.T == null) {
                    boolean z10 = c5.a.f4210a;
                    if (d5.l.d.b()) {
                        t0Var3.T = new c6.i((ScriptHandlerBoundaryInterface) xe.b.a(ScriptHandlerBoundaryInterface.class, c5.a.c(t0Var3).f8583a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 14);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    public final void W(t0 t0Var, Object obj) {
        t0 t0Var2;
        String str;
        TLRPC.User user;
        boolean z10;
        String str2 = "";
        t0 t0Var3 = this.f51060a;
        if (t0Var3 != null) {
            t0Var3.destroy();
            removeView(this.f51060a);
        }
        if (t0Var != null) {
            org.telegram.messenger.g0.E2(t0Var);
        }
        try {
            if (az.J0 && !r()) {
                z10 = true;
            } else {
                z10 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z10);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (t0Var == null) {
            Context context = getContext();
            boolean z11 = this.f51080p0;
            long j10 = 0;
            if (z11 && (user = this.V) != null) {
                j10 = user.f27150id;
            }
            t0Var2 = new t0(context, z11, j10);
        } else {
            t0Var2 = t0Var;
        }
        this.f51060a = t0Var2;
        if (!this.f51080p0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f51060a, true);
            CookieManager.getInstance().flush();
            this.f51060a.f51025f = this.f51090w0;
        } else {
            t0Var2.setBackgroundColor(j(k6.f27878d6));
        }
        if (!hp.s1(this.N).G6) {
            this.f51060a.setLayerType(2, null);
        }
        this.f51060a.f(this, this.d);
        this.f51060a.setCloseListener(this.E0);
        WebSettings settings = this.f51060a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f51080p0) {
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
            if (this.f51080p0) {
                PackageInfo packageInfo = org.telegram.messenger.t0.f25457b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25457b.getPackageName(), 0);
                int o10 = az.o();
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
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(org.telegram.messenger.t0.h(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.f51060a.setVerticalScrollBarEnabled(false);
        if (t0Var == null && this.f51080p0) {
            this.f51060a.setAlpha(0.0f);
        }
        addView(this.f51060a);
        if (this.f51080p0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f51085s0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f51085s0 == null) {
                ?? obj2 = new Object();
                obj2.f50801a = this;
                this.f51085s0 = obj2;
            }
            this.f51085s0.f50801a = this;
            V();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f51088v0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f51088v0;
            if (botWebViewContainer$WebViewProxy == null) {
                t0 t0Var4 = this.f51060a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(t0Var4, this);
                this.f51088v0 = botWebViewContainer$WebViewProxy2;
                t0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (t0Var == null) {
                this.f51060a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f51088v0.f50802a = this;
        }
        J(this.f51060a);
        R0 = false;
    }

    public final void X(int i3, org.telegram.ui.ActionBar.s1 s1Var, Runnable runnable) {
        if (s1Var != null && !m(i3)) {
            s1Var.setOnDismissListener(new h3(16, this, runnable));
            this.f51066d0 = s1Var;
            s1Var.f28548k0 = false;
            s1Var.show();
            if (this.M0 != i3) {
                this.M0 = i3;
                this.N0 = 0;
                this.O0 = 0L;
            }
            this.N0++;
        }
    }

    public final void Y(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bd.M0(2131743889, "UnknownError"));
        if (str != null) {
            str2 = ": ".concat(str);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        i(sb2.toString());
    }

    public final void c() {
        if (this.f51060a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                a8.g(th2, true);
                this.f51084s.setVisibility(8);
                this.h = true;
                this.f51069f.setVisibility(0);
                t0 t0Var = this.f51060a;
                if (t0Var != null) {
                    removeView(t0Var);
                }
            }
        }
    }

    public final void d(p7 p7Var, ii.n1 n1Var, String str, String str2, String str3) {
        if (n1Var != null && this.V != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    n1Var.m(new JSONObject());
                    x(p7Var, str2, A(string, "req_id"));
                } catch (RuntimeException e10) {
                    x(p7Var, str3, B("req_id", string, "error", e10.getMessage()));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(p7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        iv0 iv0Var;
        Uri[] uriArr;
        if (i3 == hs.n4) {
            t0 t0Var = this.f51060a;
            if (t0Var != null) {
                t0Var.setBackgroundColor(j(k6.f27878d6));
            }
            if (!this.f51083r0) {
                int i11 = k6.yj;
                int j10 = j(i11);
                this.f51081q0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                d4 d4Var = this.f51084s;
                d4Var.setColorFilter(porterDuffColorFilter);
                jz jzVar = this.f51082r;
                if (jzVar != null) {
                    jzVar.f23771n = Integer.valueOf(this.f51081q0);
                    this.f51082r.f(i11, this.f51067e, 1.0f, false);
                }
                d4Var.invalidate();
            }
            z();
        } else if (i3 == hs.f23212c5) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f51093y != null) {
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
                    this.f51093y.onReceiveValue(uriArr);
                    this.f51093y = null;
                }
                uriArr = null;
                this.f51093y.onReceiveValue(uriArr);
                this.f51093y = null;
            }
        } else if (i3 == hs.f23218d5) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (iv0Var = this.W) != null) {
                iv0Var.run();
                this.W = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f51084s) {
            if (this.f51089w) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (this.f51089w) {
                canvas.restore();
            }
            if (!this.f51089w) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.f51077n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f51069f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f51060a) {
                if (!org.telegram.messenger.g0.m0) {
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
        if (this.V == null) {
            return;
        }
        ii.r rVar = this.f51075k0;
        if (rVar == null) {
            this.f51075k0 = ii.r.c(getContext(), this.N, this.V.f27150id);
        } else {
            rVar.h();
        }
    }

    public final p7 f() {
        t0 t0Var = this.f51060a;
        long j10 = this.f51086t0;
        boolean z10 = this.f51087u0;
        String str = this.H0;
        ?? obj = new Object();
        obj.f10776c = this;
        obj.d = t0Var;
        obj.f10774a = j10;
        obj.f10775b = z10;
        obj.f10777e = str;
        return obj;
    }

    public final void g(String str) {
        a8.b("[webviewcontainer] #" + this.P0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f51085s0;
    }

    public int getMinHeight() {
        if (getParent() instanceof c4) {
            c4 c4Var = (c4) getParent();
            if (c4Var.K) {
                return (int) ((c4Var.getMeasuredHeight() - c4Var.getOffsetY()) + this.A0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        t0 t0Var = this.f51060a;
        if (t0Var == null) {
            return null;
        }
        return k(t0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f51088v0;
    }

    public String getTrustedOrigin() {
        return this.H0;
    }

    public String getUrlLoaded() {
        return this.f51062b;
    }

    public t0 getWebView() {
        return this.f51060a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.C0);
        t0 t0Var = this.f51060a;
        if (t0Var != null) {
            if (t0Var.getParent() != null) {
                removeView(this.f51060a);
            }
            if (!this.C0) {
                this.f51060a.destroy();
                K(this.f51060a);
            }
            this.O = false;
            if (this.f51075k0 != null) {
                this.f51075k0 = null;
            }
            if (this.f51078n0 != null) {
                this.f51078n0 = null;
            }
            if (this.f51079o0 != null) {
                this.f51079o0 = null;
            }
            ii.s0 s0Var = this.f51076l0;
            if (s0Var != null) {
                s0Var.f15215f.remove(this.L0);
                this.f51076l0 = null;
                this.K0 = null;
            }
        }
    }

    public final void i(String str) {
        new fc(this, this.f51067e).Q(2131624011, 36, str).j();
    }

    public final int j(int i3) {
        e6 e6Var = this.f51067e;
        if (e6Var != null) {
            return e6Var.h(i3);
        }
        return k6.x0(null, i3, false);
    }

    public final void l(p7 p7Var, ii.n1 n1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (n1Var != null && this.V != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        x(p7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
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
                            x(p7Var, str2, jSONObject);
                            return;
                        }
                        x(p7Var, str2, B("req_id", string, "value", f10.first));
                    } catch (RuntimeException e10) {
                        x(p7Var, str3, B("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused2) {
                    x(p7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                if (!TextUtils.isEmpty("")) {
                    x(p7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean m(int i3) {
        if (this.f51066d0 != null || (this.O0 > 0 && System.currentTimeMillis() < this.O0)) {
            return true;
        }
        if (this.M0 != i3 || this.N0 <= 3) {
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
        if ((this.O || z11) && (z12 = this.f51080p0) && (getParent() instanceof c4)) {
            c4 c4Var = (c4) getParent();
            if (z10) {
                if (c4Var.getSwipeOffsetY() == c4Var.getTopActionBarOffsetY() + (-c4Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.P = z13;
            }
            int max = Math.max(getMinHeight(), (int) (c4Var.getTopActionBarOffsetY() + ((c4Var.getMeasuredHeight() - c4Var.getOffsetY()) - c4Var.getSwipeOffsetY()) + this.A0));
            if (z11 || max != this.f51092x0 || this.f51094y0 != z10 || this.f51095z0 != this.P) {
                this.f51092x0 = max;
                this.f51094y0 = z10;
                this.f51095z0 = this.P;
                String str = "{height:" + (max / org.telegram.messenger.g0.f22607p) + ",is_state_stable:" + z10 + ",is_expanded:" + this.P + "}";
                if (z12 && !q()) {
                    g("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    hs.f(this.N).d(new a0(this, a1.g.q("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
                }
            }
        }
    }

    public final boolean o(p7 p7Var) {
        boolean z10;
        if (p7Var != null) {
            String str = (String) p7Var.f10777e;
            if (((w0) p7Var.f10776c) == this && ((t0) p7Var.d) == this.f51060a && p7Var.f10774a == this.f51086t0 && (z10 = p7Var.f10775b) == this.f51087u0) {
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
        hs.e().c(this, hs.n4);
        hs.e().c(this, hs.f23212c5);
        hs.e().c(this, hs.f23218d5);
        setTag(2131296351, new ai.h1(this, 11));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        hs.e().n(this, hs.n4);
        hs.e().n(this, hs.f23212c5);
        hs.e().n(this, hs.f23218d5);
        setTag(2131296351, null);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11 = this.B0;
        if (i11 >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i3, i10);
        this.f51077n.f39349f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (!this.f51063b0) {
            n(true, false);
        }
    }

    public final boolean q() {
        if (this.f51060a == null) {
            return false;
        }
        if (this.f51087u0) {
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

    public final void s(int i3, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
        TLRPC.UserFull b22 = hp.s1(i3).b2(j10);
        String n4 = l10.n(a22);
        d4 d4Var = this.f51084s;
        if (n4 != null && n4.equals("DurgerKingBot")) {
            d4Var.setVisibility(0);
            d4Var.setAlpha(1.0f);
            d4Var.h(null, null, kz.h(2131624005, Integer.valueOf(j(k6.f27824a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = li.b0(i3).f24011b.bots;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i10);
                i10++;
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
                tL_attachMenuBotIcon = li.k0(tL_attachMenuBot);
            } else {
                z10 = false;
            }
            if (tL_attachMenuBotIcon != null) {
                d4Var.setVisibility(0);
                d4Var.setAlpha(1.0f);
                d4Var.j(ac.b(tL_attachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        e6 e6Var = this.f51067e;
        if (b22 != null && (botInfo = b22.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            d4Var.setVisibility(0);
            d4Var.setAlpha(1.0f);
            jz j11 = kz.j(512, 512, b22.bot_info.app_settings.placeholder_svg_path);
            this.f51082r = j11;
            if (j11 != null) {
                j11.f23771n = Integer.valueOf(this.f51081q0);
                this.f51082r.f(k6.yj, e6Var, 1.0f, false);
            }
            d4Var.h(null, null, this.f51082r);
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
        d4Var.setVisibility(0);
        d4Var.setAlpha(1.0f);
        jz j12 = kz.j(512, 512, path);
        this.f51082r = j12;
        if (j12 != null) {
            j12.f23771n = Integer.valueOf(this.f51081q0);
            this.f51082r.f(k6.yj, e6Var, 1.0f, false);
        }
        d4Var.h(null, null, this.f51082r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.V = user;
    }

    public void setDelegate(d0 d0Var) {
        this.f51064c = d0Var;
    }

    public void setFlickerViewColor(int i3) {
        int b10;
        if (org.telegram.messenger.g0.B(i3) > 0.7f) {
            b10 = k6.b(0.0f, -0.15f, i3);
        } else {
            b10 = k6.b(0.025f, 0.15f, i3);
        }
        if (this.f51081q0 == b10) {
            return;
        }
        this.f51081q0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        d4 d4Var = this.f51084s;
        d4Var.setColorFilter(porterDuffColorFilter);
        jz jzVar = this.f51082r;
        if (jzVar != null) {
            jzVar.f23771n = Integer.valueOf(this.f51081q0);
            this.f51082r.f(k6.yj, this.f51067e, 1.0f, false);
        }
        this.f51083r0 = true;
        d4Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i3) {
        if (this.B0 == i3) {
            return;
        }
        this.B0 = i3;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z10) {
        this.S = z10;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.E0 = runnable;
        t0 t0Var = this.f51060a;
        if (t0Var != null) {
            t0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(r10 r10Var) {
        this.Q0 = r10Var;
    }

    public void setOpener(t0 t0Var) {
        t0 t0Var2;
        this.f51090w0 = t0Var;
        if (!this.f51080p0 && (t0Var2 = this.f51060a) != null) {
            t0Var2.f51025f = t0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.f51061a0 = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f51063b0 = z10;
    }

    public void setViewPortHeightOffset(float f10) {
        this.A0 = f10;
    }

    public void setWasOpenedByBot(q4 q4Var) {
        this.G0 = q4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.F0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f51091x = aVar;
    }

    public void setWebViewScrollListener(v0 v0Var) {
        this.d = v0Var;
        t0 t0Var = this.f51060a;
        if (t0Var != null) {
            t0Var.f(this, v0Var);
        }
    }

    public final void t(int i3, String str, boolean z10) {
        String str2;
        this.N = i3;
        if (this.f51080p0) {
            this.f51086t0++;
            this.f51087u0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.H0 = str2;
            if (this.f51060a != null) {
                V();
            }
        }
        hs.f(i3).d(new a0(this, str, 1));
    }

    @Override
    public final void updateColors() {
        d4 d4Var;
        int j10;
        try {
            if (this.f51060a != null && (j10 = j(k6.f27878d6)) != this.D0) {
                this.D0 = j10;
                this.f51060a.setBackgroundColor(j10);
            }
            if (!this.f51083r0 && (d4Var = this.f51084s) != null) {
                int i3 = this.f51081q0;
                int i10 = k6.yj;
                if (i3 != j(i10)) {
                    int j11 = j(i10);
                    this.f51081q0 = j11;
                    d4Var.setColorFilter(new PorterDuffColorFilter(j11, PorterDuff.Mode.SRC_IN));
                    jz jzVar = this.f51082r;
                    if (jzVar != null) {
                        jzVar.f23771n = Integer.valueOf(this.f51081q0);
                    }
                    d4Var.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void v(p7 p7Var) {
        if (this.V != null) {
            e();
            ii.r rVar = this.f51075k0;
            if (rVar == null) {
                return;
            }
            try {
                x(p7Var, "biometry_info_received", rVar.f());
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void x(p7 p7Var, String str, JSONObject jSONObject) {
        if (!o(p7Var)) {
            g("notifyEvent " + str + " dropped after document change");
            return;
        }
        y(str, jSONObject);
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.f51080p0 && !q()) {
            g("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        g("notifyEvent " + str);
        hs.f(this.N).d(new a0(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z() {
        JSONObject jSONObject;
        JSONObject u10;
        try {
            u10 = a3.u(this.f51067e, true);
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

    public void H() {
    }

    public void K(t0 t0Var) {
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
