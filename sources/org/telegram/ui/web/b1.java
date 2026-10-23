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
import ci.b4;
import ci.j4;
import ci.y7;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jn0;
import org.telegram.ui.s9;
import org.telegram.ui.ve1;
import w7.d6;
import w7.z5;
public abstract class b1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, b6 {
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
    public t4 F0;
    public String G;
    public String G0;
    public int H;
    public final Rect H0;
    public int I;
    public int I0;
    public String J;
    public y7 J0;
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
    public fy0 V;
    public Activity W;
    public y0 f43043a;
    public boolean f43044a0;
    public String f43045b;
    public String f43046b0;
    public h0 f43047c;
    public org.telegram.ui.ActionBar.c2 f43048c0;
    public a1 d;
    public int f43049d0;
    public final g6 e;
    public long f43050e0;
    public final TextView f43051f;
    public long f43052f0;
    public s9 f43053g0;
    public boolean h;
    public boolean f43054h0;
    public String f43055i0;
    public gi.r f43056j0;
    public gi.u0 f43057k0;
    public gi.j0 f43058l0;
    public gi.p1 m0;
    public final org.telegram.ui.Components.voip.h f43059n;
    public gi.p1 f43060n0;
    public final boolean f43061o0;
    public int f43062p0;
    public boolean f43063q0;
    public SvgHelper.SvgDrawable f43064r;
    public BotWebViewContainer$BotWebViewProxy f43065r0;
    public final j4 f43066s;
    public long f43067s0;
    public boolean f43068t0;
    public BotWebViewContainer$WebViewProxy f43069u0;
    public boolean v;
    public y0 f43070v0;
    public q0.a f43071w;
    public int f43072w0;
    public ValueCallback f43073x;
    public boolean f43074x0;
    public int f43075y;
    public boolean f43076y0;
    public float f43077z0;

    public b1(int i10, Context context, g6 g6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f43059n = hVar;
        int i11 = k6.Oh;
        this.f43075y = j(i11);
        int i12 = k6.Sh;
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
        this.f43061o0 = z10;
        this.e = g6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        hVar.f31617k = false;
        hVar.b(i10, 153);
        j4 j4Var = new j4(this, context);
        this.f43066s = j4Var;
        int j10 = j(k6.Ki);
        this.f43062p0 = j10;
        j4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        j4Var.getImageReceiver().setAspectFit(true);
        addView(j4Var, z5.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f43051f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        r6.W(textView, k6.f21571y6, g6Var);
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

    public static void a(b1 b1Var, String[] strArr, q0.a aVar) {
        b1Var.getClass();
        for (String str : strArr) {
            if (b1Var.getContext().checkSelfPermission(str) != 0) {
                b1Var.V = new fy0(b1Var, aVar, strArr, 7);
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
            if (S0 == null) {
                S0 = new HashMap();
            }
            S0.put(S, hostAuthority);
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
        j4 j4Var = this.f43066s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j4Var.getLayoutParams();
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
        j4Var.requestLayout();
    }

    private void setupWebView(y0 y0Var) {
        W(y0Var, null);
    }

    public static String u(String str) {
        String str2;
        if (S0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority != null) {
            if (hostAuthority.endsWith("." + MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress) && (str2 = (String) S0.get(hostAuthority)) != null) {
                return pf.d.u(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void w(int i10, y0 y0Var, y7 y7Var, String str, JSONObject jSONObject) {
        if (y0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new jn0(y0Var, y7Var, str, jSONObject, 25));
    }

    public final boolean C() {
        if (this.f43043a != null && this.R) {
            y("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r56, final ci.y7 r57, java.lang.String r58, java.lang.String r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.b1.E(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, ci.y7, java.lang.String, java.lang.String):void");
    }

    public final void F(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f43046b0, str)) {
                this.f43046b0 = null;
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
        if (pf.d.e(uri, false, zArr) && !zArr[0] && this.f43047c != null) {
            setKeyboardFocusable(false);
        }
        pf.d.q(getContext(), uri, true, z10, false, null, str, false, true, z12);
    }

    public abstract void J(y0 y0Var);

    public final void L() {
        g("preserveWebView");
        this.B0 = true;
        if (this.f43061o0) {
            y("visibility_changed", A(Boolean.FALSE, "is_visible"));
            this.f43067s0++;
        }
        y0 y0Var = this.f43043a;
        if (y0Var != null) {
            y0Var.f(null, null);
            this.f43043a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f43065r0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f43023a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f43069u0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f43024a = null;
        }
    }

    public final void N(int i10, y0 y0Var, Object obj, String str, boolean z10) {
        String str2;
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.f43061o0;
        if (z11) {
            this.f43067s0++;
            this.f43068t0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.G0 = str2;
        }
        W(y0Var, obj);
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
                E(this.f43065r0, f(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                E(this.f43065r0, f(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void R(y7 y7Var, gi.p1 p1Var, String str) {
        g6 g6Var;
        boolean z10;
        if (p1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(y7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = p1Var.h(optString);
                        if (h.isEmpty()) {
                            x(y7Var, "secure_storage_failed", B("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        a0 a0Var = new a0(this, y7Var, string, p1Var, optString);
                        o2 U = LaunchActivity.U();
                        if (U != null) {
                            g6Var = U.getResourceProvider();
                        } else {
                            g6Var = null;
                        }
                        boolean z11 = true;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        h3 j10 = sl.j(1, context, g6Var, false);
                        ViewGroup e = sl.e(context, 1);
                        w9 w9Var = new w9(context);
                        ArrayList arrayList = h;
                        TLRPC.User user = MessagesController.getInstance(p1Var.f11403a).getUser(Long.valueOf(p1Var.f11404b));
                        h9 h9Var = new h9((g6) null);
                        h9Var.r(user);
                        w9Var.e(user, h9Var);
                        e.addView(w9Var, z5.t(80, 80, 49, 0, 21, 0, 13));
                        int i10 = k6.G6;
                        TextView b10 = d6.b(context, 20.0f, i10, true, null);
                        sl.m(R.string.BotRestoreStorageTitle, b10, 17);
                        e.addView(b10, z5.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = d6.b(context, 14.0f, i10, false, null);
                        b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        b11.setGravity(17);
                        e.addView(b11, z5.t(-1, -2, 7, 32, 0, 32, 19));
                        e9 e9Var = new e9(context, g6Var);
                        int i11 = -1;
                        ColorDrawable colorDrawable = new ColorDrawable(-1);
                        e9Var.setBackground(new yq(colorDrawable, k6.W0(context, R.drawable.greydivider, k6.w0(k6.f21145b7, g6Var))));
                        r6.z(e9Var, colorDrawable, k6.f21125a7, g6Var, PorterDuff.Mode.SRC_IN);
                        e9Var.setFixedSize(12);
                        e.addView(e9Var, z5.t(-1, 12, 7, 0, 0, 0, 0));
                        l4 l4Var = new l4(context, g6Var);
                        l4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        e.addView(l4Var, z5.t(-1, -2, 7, 0, 0, 0, 0));
                        ei.d dVar = new ei.d(context, g6Var, true);
                        ArrayList arrayList2 = new ArrayList();
                        int i12 = 0;
                        while (i12 < arrayList.size()) {
                            ArrayList arrayList3 = arrayList;
                            gi.o1 o1Var = (gi.o1) arrayList3.get(i12);
                            boolean z12 = z11;
                            if (i12 < arrayList3.size() - 1) {
                                z10 = z12;
                            } else {
                                z10 = false;
                            }
                            gi.n1 n1Var = new gi.n1(o1Var, z10, context);
                            int i13 = k6.f21272i6;
                            a0 a0Var2 = a0Var;
                            org.telegram.ui.Cells.y g02 = k6.g0(k6.w0(i13, g6Var), 2, i11);
                            n6 O = r6.O(i13);
                            n1Var.setBackground(g02);
                            r6.k(n1Var, g02, null, O, g6Var);
                            ViewGroup viewGroup = e;
                            n1Var.setOnClickListener(new b4(strArr, o1Var, arrayList2, dVar, 2));
                            viewGroup.addView(n1Var, z5.n(-1, 56));
                            arrayList2.add(n1Var);
                            i12++;
                            e = viewGroup;
                            i11 = -1;
                            z11 = z12;
                            j10 = j10;
                            arrayList = arrayList3;
                            a0Var = a0Var2;
                        }
                        a0 a0Var3 = a0Var;
                        h3 h3Var = j10;
                        ViewGroup viewGroup2 = e;
                        dVar.i(LocaleController.getString(R.string.BotRestoreStorageButton), false, z11);
                        if (strArr[0] == null) {
                            z11 = false;
                        }
                        dVar.setEnabled(z11);
                        viewGroup2.addView(dVar, z5.t(-1, 48, 7, 8, 8, 8, 4));
                        h3Var.customView = viewGroup2;
                        h3Var.fixNavigationBarKey(k6.f21254h5);
                        dVar.setOnClickListener(new b4(zArr, a0Var3, strArr, h3Var, 3));
                        h3Var.setOnDismissListener(new z3(3, zArr, a0Var3));
                        h3Var.show();
                    } catch (Exception e7) {
                        x(y7Var, "secure_storage_failed", B("req_id", string, "error", e7.getMessage()));
                    }
                } catch (Exception unused) {
                    x(y7Var, "secure_storage_failed", B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    x(y7Var, "secure_storage_failed", B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void T(String str, boolean z10) {
        boolean z11;
        boolean z12;
        y0 y0Var = this.f43043a;
        if (y0Var != null) {
            boolean z13 = y0Var.E;
        }
        if (y0Var != null && y0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        y0 y0Var2 = this.f43043a;
        if (y0Var2 != null && y0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        I(z11, z12);
        y0 y0Var3 = this.f43043a;
        if (y0Var3 != null) {
            y0Var3.f43329b = true;
        }
        if (this.N) {
            g("setPageLoaded: already loaded");
            return;
        }
        j4 j4Var = this.f43066s;
        if (z10 && y0Var3 != null && j4Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f43043a, property, 1.0f), ObjectAnimator.ofFloat(j4Var, property, 0.0f));
            animatorSet.addListener(new ve1(this, 12));
            animatorSet.start();
        } else {
            if (y0Var3 != null) {
                y0Var3.setAlpha(1.0f);
            }
            if (j4Var != null) {
                j4Var.setAlpha(0.0f);
                j4Var.setVisibility(8);
            }
        }
        this.f43045b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.f43047c.getClass();
    }

    public final void U(y7 y7Var, gi.p1 p1Var, String str, String str2, String str3) {
        if (p1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        x(y7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            p1Var.n(optString, jSONObject.optString("value"));
                            x(y7Var, str2, A(string, "req_id"));
                        } catch (RuntimeException e) {
                            x(y7Var, str3, B("req_id", string, "error", e.getMessage()));
                        }
                    } catch (Exception unused) {
                        x(y7Var, str3, B("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    x(y7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    x(y7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void V() {
        y0 y0Var = this.f43043a;
        if (y0Var != null && this.f43061o0) {
            y0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!a.a.a("WEB_MESSAGE_LISTENER")) {
                g("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            y0 y0Var2 = this.f43043a;
            if (!y0Var2.R) {
                a5.c.a(y0Var2, "TelegramWebviewProxyMessage", singleton, new j5.b(y0Var2, 27));
                this.f43043a.R = true;
            }
            if (a.a.a("DOCUMENT_START_SCRIPT")) {
                y0 y0Var3 = this.f43043a;
                if (y0Var3.S == null) {
                    boolean z10 = a5.c.f283a;
                    if (b5.m.d.b()) {
                        y0Var3.S = new a4.l((ScriptHandlerBoundaryInterface) androidx.activity.result.c.a(ScriptHandlerBoundaryInterface.class, a5.c.c(y0Var3).f4216a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 5);
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
        y0 y0Var3 = this.f43043a;
        if (y0Var3 != null) {
            y0Var3.destroy();
            removeView(this.f43043a);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (y0Var == null) {
            Context context = getContext();
            boolean z11 = this.f43061o0;
            long j10 = 0;
            if (z11 && (user = this.U) != null) {
                j10 = user.f20490id;
            }
            y0Var2 = new y0(context, z11, j10);
        } else {
            y0Var2 = y0Var;
        }
        this.f43043a = y0Var2;
        if (!this.f43061o0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f43043a, true);
            CookieManager.getInstance().flush();
            this.f43043a.f43331f = this.f43070v0;
        } else {
            y0Var2.setBackgroundColor(j(k6.f21183d6));
        }
        if (!MessagesController.getInstance(this.M).disableBotFullscreenBlur) {
            this.f43043a.setLayerType(2, null);
        }
        this.f43043a.f(this, this.d);
        this.f43043a.setCloseListener(this.D0);
        WebSettings settings = this.f43043a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f43061o0) {
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
            if (this.f43061o0) {
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
        this.f43043a.setVerticalScrollBarEnabled(false);
        if (y0Var == null && this.f43061o0) {
            this.f43043a.setAlpha(0.0f);
        }
        addView(this.f43043a);
        if (this.f43061o0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f43065r0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f43065r0 == null) {
                ?? obj2 = new Object();
                obj2.f43023a = this;
                this.f43065r0 = obj2;
            }
            this.f43065r0.f43023a = this;
            V();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f43069u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f43069u0;
            if (botWebViewContainer$WebViewProxy == null) {
                y0 y0Var4 = this.f43043a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(y0Var4, this);
                this.f43069u0 = botWebViewContainer$WebViewProxy2;
                y0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (y0Var == null) {
                this.f43043a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f43069u0.f43024a = this;
        }
        J(this.f43043a);
        Q0 = false;
    }

    public final void X(int i10, org.telegram.ui.ActionBar.c2 c2Var, Runnable runnable) {
        if (c2Var != null && !m(i10)) {
            c2Var.setOnDismissListener(new z3(16, this, runnable));
            this.f43048c0 = c2Var;
            c2Var.f20764j0 = false;
            c2Var.show();
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
        if (this.f43043a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.f43066s.setVisibility(8);
                this.h = true;
                this.f43051f.setVisibility(0);
                y0 y0Var = this.f43043a;
                if (y0Var != null) {
                    removeView(y0Var);
                }
            }
        }
    }

    public final void d(y7 y7Var, gi.p1 p1Var, String str, String str2, String str3) {
        if (p1Var != null && this.U != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    p1Var.m(new JSONObject());
                    x(y7Var, str2, A(string, "req_id"));
                } catch (RuntimeException e) {
                    x(y7Var, str3, B("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    x(y7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        fy0 fy0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            y0 y0Var = this.f43043a;
            if (y0Var != null) {
                y0Var.setBackgroundColor(j(k6.f21183d6));
            }
            if (!this.f43063q0) {
                int i12 = k6.Ki;
                int j10 = j(i12);
                this.f43062p0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                j4 j4Var = this.f43066s;
                j4Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f43064r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.f43062p0);
                    this.f43064r.setupGradient(i12, this.e, 1.0f, false);
                }
                j4Var.invalidate();
            }
            z();
        } else if (i10 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f43073x != null) {
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
                    this.f43073x.onReceiveValue(uriArr);
                    this.f43073x = null;
                }
                uriArr = null;
                this.f43073x.onReceiveValue(uriArr);
                this.f43073x = null;
            }
        } else if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (fy0Var = this.V) != null) {
                fy0Var.run();
                this.V = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f43066s) {
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
                this.f43059n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f43051f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f43043a) {
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
        gi.r rVar = this.f43056j0;
        if (rVar == null) {
            this.f43056j0 = gi.r.c(getContext(), this.M, this.U.f20490id);
        } else {
            rVar.h();
        }
    }

    public final y7 f() {
        y0 y0Var = this.f43043a;
        long j10 = this.f43067s0;
        boolean z10 = this.f43068t0;
        String str = this.G0;
        ?? obj = new Object();
        obj.f6164c = this;
        obj.d = y0Var;
        obj.f6162a = j10;
        obj.f6163b = z10;
        obj.e = str;
        return obj;
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.O0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f43065r0;
    }

    public int getMinHeight() {
        if (getParent() instanceof e4) {
            e4 e4Var = (e4) getParent();
            if (e4Var.J) {
                return (int) ((e4Var.getMeasuredHeight() - e4Var.getOffsetY()) + this.f43077z0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        y0 y0Var = this.f43043a;
        if (y0Var == null) {
            return null;
        }
        return k(y0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f43069u0;
    }

    public String getTrustedOrigin() {
        return this.G0;
    }

    public String getUrlLoaded() {
        return this.f43045b;
    }

    public y0 getWebView() {
        return this.f43043a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.B0);
        y0 y0Var = this.f43043a;
        if (y0Var != null) {
            if (y0Var.getParent() != null) {
                removeView(this.f43043a);
            }
            if (!this.B0) {
                this.f43043a.destroy();
                K(this.f43043a);
            }
            this.N = false;
            if (this.f43056j0 != null) {
                this.f43056j0 = null;
            }
            if (this.m0 != null) {
                this.m0 = null;
            }
            if (this.f43060n0 != null) {
                this.f43060n0 = null;
            }
            gi.u0 u0Var = this.f43057k0;
            if (u0Var != null) {
                u0Var.f11523f.remove(this.K0);
                this.f43057k0 = null;
                this.J0 = null;
            }
        }
    }

    public final void i(String str) {
        new xc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i10) {
        g6 g6Var = this.e;
        if (g6Var != null) {
            return g6Var.g(i10);
        }
        return k6.x0(null, i10, false);
    }

    public final void l(y7 y7Var, gi.p1 p1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (p1Var != null && this.U != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        x(y7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
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
                            x(y7Var, str2, jSONObject);
                            return;
                        }
                        x(y7Var, str2, B("req_id", string, "value", f7.first));
                    } catch (RuntimeException e) {
                        x(y7Var, str3, B("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused2) {
                    x(y7Var, str3, B("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                if (!TextUtils.isEmpty("")) {
                    x(y7Var, str3, B("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean m(int i10) {
        if (this.f43048c0 != null || (this.N0 > 0 && System.currentTimeMillis() < this.N0)) {
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
        if ((this.N || z11) && (z12 = this.f43061o0) && (getParent() instanceof e4)) {
            e4 e4Var = (e4) getParent();
            if (z10) {
                if (e4Var.getSwipeOffsetY() == e4Var.getTopActionBarOffsetY() + (-e4Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.O = z13;
            }
            int max = Math.max(getMinHeight(), (int) (e4Var.getTopActionBarOffsetY() + ((e4Var.getMeasuredHeight() - e4Var.getOffsetY()) - e4Var.getSwipeOffsetY()) + this.f43077z0));
            if (z11 || max != this.f43072w0 || this.f43074x0 != z10 || this.f43076y0 != this.O) {
                this.f43072w0 = max;
                this.f43074x0 = z10;
                this.f43076y0 = this.O;
                String str = "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.O + "}";
                if (z12 && !q()) {
                    g("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    NotificationCenter.getInstance(this.M).doOnIdle(new y(this, a1.g.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
                }
            }
        }
    }

    public final boolean o(y7 y7Var) {
        boolean z10;
        if (y7Var != null) {
            String str = (String) y7Var.e;
            if (((b1) y7Var.f6164c) == this && ((y0) y7Var.d) == this.f43043a && y7Var.f6162a == this.f43067s0 && (z10 = y7Var.f6163b) == this.f43068t0) {
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
        this.f43059n.f31613f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.f43044a0) {
            n(true, false);
        }
    }

    public final boolean q() {
        if (this.f43043a == null) {
            return false;
        }
        if (this.f43068t0) {
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
        j4 j4Var = this.f43066s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            j4Var.setVisibility(0);
            j4Var.setAlpha(1.0f);
            j4Var.g(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(k6.f21125a7))));
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
                j4Var.setVisibility(0);
                j4Var.setAlpha(1.0f);
                j4Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        g6 g6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            j4Var.setVisibility(0);
            j4Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f43064r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.f43062p0);
                this.f43064r.setupGradient(k6.Ki, g6Var, 1.0f, false);
            }
            j4Var.g(null, null, this.f43064r);
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
        j4Var.setVisibility(0);
        j4Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.f43064r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.f43062p0);
            this.f43064r.setupGradient(k6.Ki, g6Var, 1.0f, false);
        }
        j4Var.g(null, null, this.f43064r);
        setupFlickerParams(true);
    }

    public void setBotUser(TLRPC.User user) {
        this.U = user;
    }

    public void setDelegate(h0 h0Var) {
        this.f43047c = h0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.7f) {
            b10 = k6.b(0.0f, -0.15f, i10);
        } else {
            b10 = k6.b(0.025f, 0.15f, i10);
        }
        if (this.f43062p0 == b10) {
            return;
        }
        this.f43062p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        j4 j4Var = this.f43066s;
        j4Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f43064r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.f43062p0);
            this.f43064r.setupGradient(k6.Ki, this.e, 1.0f, false);
        }
        this.f43063q0 = true;
        j4Var.invalidate();
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
        y0 y0Var = this.f43043a;
        if (y0Var != null) {
            y0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.P0 = callback4;
    }

    public void setOpener(y0 y0Var) {
        y0 y0Var2;
        this.f43070v0 = y0Var;
        if (!this.f43061o0 && (y0Var2 = this.f43043a) != null) {
            y0Var2.f43331f = y0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f43044a0 = z10;
    }

    public void setViewPortHeightOffset(float f7) {
        this.f43077z0 = f7;
    }

    public void setWasOpenedByBot(t4 t4Var) {
        this.F0 = t4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.E0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f43071w = aVar;
    }

    public void setWebViewScrollListener(a1 a1Var) {
        this.d = a1Var;
        y0 y0Var = this.f43043a;
        if (y0Var != null) {
            y0Var.f(this, a1Var);
        }
    }

    public final void t(int i10, String str, boolean z10) {
        String str2;
        this.M = i10;
        if (this.f43061o0) {
            this.f43067s0++;
            this.f43068t0 = z10;
            if (z10) {
                str2 = k(str);
            } else {
                str2 = null;
            }
            this.G0 = str2;
            if (this.f43043a != null) {
                V();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new y(this, str, 1));
    }

    @Override
    public final void updateColors() {
        j4 j4Var;
        int j10;
        try {
            if (this.f43043a != null && (j10 = j(k6.f21183d6)) != this.C0) {
                this.C0 = j10;
                this.f43043a.setBackgroundColor(j10);
            }
            if (!this.f43063q0 && (j4Var = this.f43066s) != null) {
                int i10 = this.f43062p0;
                int i11 = k6.Ki;
                if (i10 != j(i11)) {
                    int j11 = j(i11);
                    this.f43062p0 = j11;
                    j4Var.setColorFilter(new PorterDuffColorFilter(j11, PorterDuff.Mode.SRC_IN));
                    SvgHelper.SvgDrawable svgDrawable = this.f43064r;
                    if (svgDrawable != null) {
                        svgDrawable.setColor(this.f43062p0);
                    }
                    j4Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v(y7 y7Var) {
        if (this.U != null) {
            e();
            gi.r rVar = this.f43056j0;
            if (rVar == null) {
                return;
            }
            try {
                x(y7Var, "biometry_info_received", rVar.f());
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void x(y7 y7Var, String str, JSONObject jSONObject) {
        if (!o(y7Var)) {
            g("notifyEvent " + str + " dropped after document change");
            return;
        }
        y(str, jSONObject);
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.f43061o0 && !q()) {
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

    public void K(y0 y0Var) {
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
