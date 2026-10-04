package org.telegram.ui.web;

import ai.da;
import ai.o5;
import ai.w4;
import ai.y5;
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
import ei.l3;
import ei.q4;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ap0;
import org.telegram.ui.s9;
import org.telegram.ui.zr0;
import w7.z5;
public abstract class c1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public in0 V;
    public Activity W;
    public z0 f42126a;
    public boolean f42127a0;
    public String f42128b;
    public String f42129b0;
    public h0 f42130c;
    public org.telegram.ui.ActionBar.b2 f42131c0;
    public b1 d;
    public int f42132d0;
    public final d6 f42133e;
    public long f42134e0;
    public final TextView f42135f;
    public long f42136f0;
    public s9 f42137g0;
    public boolean h;
    public boolean f42138h0;
    public String f42139i0;
    public ei.s f42140j0;
    public ei.x0 f42141k0;
    public ei.m0 f42142l0;
    public ei.u1 m0;
    public final org.telegram.ui.Components.voip.h f42143n;
    public ei.u1 f42144n0;
    public final boolean f42145o0;
    public int f42146p0;
    public boolean f42147q0;
    public SvgHelper.SvgDrawable f42148r;
    public BotWebViewContainer$BotWebViewProxy f42149r0;
    public final y5 f42150s;
    public long f42151s0;
    public boolean f42152t0;
    public BotWebViewContainer$WebViewProxy f42153u0;
    public boolean v;
    public z0 f42154v0;
    public q0.a f42155w;
    public int f42156w0;
    public ValueCallback f42157x;
    public boolean f42158x0;
    public int f42159y;
    public boolean f42160y0;
    public float f42161z0;

    public c1(int i10, Context context, d6 d6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f42143n = hVar;
        int i11 = i6.Oh;
        this.f42159y = k(i11);
        int i12 = i6.Sh;
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
        this.J0 = new s(this, 1);
        this.K0 = -1;
        this.L0 = 0;
        int i13 = Q0;
        Q0 = i13 + 1;
        this.N0 = i13;
        this.f42145o0 = z10;
        this.f42133e = d6Var;
        h("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        hVar.f31885k = false;
        hVar.b(i10, 153);
        y5 y5Var = new y5(this, context);
        this.f42150s = y5Var;
        int k10 = k(i6.Ki);
        this.f42146p0 = k10;
        y5Var.setColorFilter(new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN));
        y5Var.getImageReceiver().setAspectFit(true);
        addView(y5Var, z5.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f42135f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(k(i6.f21209y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, z5.e(-1, -2, 17));
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
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static String T(String str) {
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

    public static void a(c1 c1Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            c1Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else if (c1Var.d(strArr)) {
            aVar.accept(Boolean.TRUE);
        } else {
            c1Var.V = new in0(c1Var, aVar, strArr, 19);
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
        y5 y5Var = this.f42150s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y5Var.getLayoutParams();
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
        y5Var.requestLayout();
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
        NotificationCenter.getInstance(i10).doOnIdle(new zr0(z0Var, daVar, str, jSONObject, 21));
    }

    public final void A() {
        JSONObject jSONObject;
        JSONObject p5;
        try {
            p5 = l3.p(this.f42133e, true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (p5 != null) {
            jSONObject = new JSONObject().put("theme_params", p5);
            z("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        z("theme_changed", jSONObject);
    }

    public final boolean D() {
        if (this.f42126a != null && this.R) {
            z("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r55, final ai.da r56, java.lang.String r57, java.lang.String r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.c1.F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, ai.da, java.lang.String, java.lang.String):void");
    }

    public final void G(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            z("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f42129b0, str)) {
                this.f42129b0 = null;
            }
        } catch (JSONException e7) {
            FileLog.e(e7);
        }
    }

    public final void H(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.P > 10000 && z11) {
            return;
        }
        this.P = 0L;
        boolean[] zArr = {false};
        if (nf.f.f(uri, false, zArr) && !zArr[0] && this.f42130c != null) {
            setKeyboardFocusable(false);
        }
        nf.f.r(getContext(), uri, true, z10, false, null, str, false, true, z12);
    }

    public abstract void K(z0 z0Var);

    public final void M() {
        h("preserveWebView");
        this.B0 = true;
        if (this.f42145o0) {
            z("visibility_changed", B(Boolean.FALSE, "is_visible"));
            this.f42151s0++;
        }
        z0 z0Var = this.f42126a;
        if (z0Var != null) {
            z0Var.f(null, null);
            this.f42126a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f42149r0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f42089a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f42153u0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f42090a = null;
        }
    }

    public final void O(int i10, z0 z0Var, Object obj, String str, boolean z10) {
        String str2;
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.f42145o0;
        if (z11) {
            this.f42151s0++;
            this.f42152t0 = z10;
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
                F(this.f42149r0, g(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                F(this.f42149r0, g(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void S(da daVar, ei.u1 u1Var, String str) {
        d6 d6Var;
        boolean z10;
        boolean z11;
        if (u1Var != null && this.U != null) {
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
                        ArrayList h = u1Var.h(optString);
                        if (h.isEmpty()) {
                            y(daVar, "secure_storage_failed", C("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        a0 a0Var = new a0(this, daVar, string, u1Var, optString);
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            d6Var = U.getResourceProvider();
                        } else {
                            d6Var = null;
                        }
                        int i10 = 1;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        f3 i11 = bi.i(1, context, d6Var, false);
                        ViewGroup e7 = bi.e(context, 1);
                        w9 w9Var = new w9(context);
                        TLRPC.User user = MessagesController.getInstance(u1Var.f9362a).getUser(Long.valueOf(u1Var.f9363b));
                        h9 h9Var = new h9((d6) null);
                        h9Var.r(user);
                        w9Var.e(user, h9Var);
                        e7.addView(w9Var, z5.t(80, 80, 49, 0, 21, 0, 13));
                        int i12 = i6.G6;
                        TextView b10 = w7.d6.b(context, 20.0f, i12, true, null);
                        bi.k(R.string.BotRestoreStorageTitle, b10, 17);
                        e7.addView(b10, z5.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = w7.d6.b(context, 14.0f, i12, false, null);
                        b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        b11.setGravity(17);
                        e7.addView(b11, z5.t(-1, -2, 7, 32, 0, 32, 19));
                        e9 e9Var = new e9(context, d6Var);
                        e9Var.setBackground(new sq(new ColorDrawable(i6.v0(i6.f20766a7, d6Var)), i6.U0(context, R.drawable.greydivider, i6.v0(i6.f20786b7, d6Var))));
                        e9Var.setFixedSize(12);
                        e7.addView(e9Var, z5.t(-1, 12, 7, 0, 0, 0, 0));
                        m4 m4Var = new m4(context, d6Var);
                        m4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        e7.addView(m4Var, z5.t(-1, -2, 7, 0, 0, 0, 0));
                        ci.d dVar = new ci.d(context, d6Var, true);
                        ArrayList arrayList = new ArrayList();
                        for (int i13 = 0; i13 < h.size(); i13++) {
                            ei.t1 t1Var = (ei.t1) h.get(i13);
                            if (i13 < h.size() - i10) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ei.s1 s1Var = new ei.s1(t1Var, z11, context);
                            s1Var.setBackground(i6.f0(i6.v0(i6.f20913i6, d6Var), 2, -1));
                            ViewGroup viewGroup = e7;
                            String[] strArr2 = strArr;
                            s1Var.setOnClickListener(new o5(strArr2, t1Var, arrayList, dVar, 2));
                            viewGroup.addView(s1Var, z5.n(-1, 56));
                            arrayList.add(s1Var);
                            e7 = viewGroup;
                            strArr = strArr2;
                            i10 = 1;
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
                        viewGroup2.addView(dVar, z5.t(-1, 48, 7, 8, 8, 8, 4));
                        i11.customView = viewGroup2;
                        i11.fixNavigationBar(i6.v0(i6.f20894h5, d6Var));
                        dVar.setOnClickListener(new o5(zArr, a0Var, strArr3, i11, 3));
                        i11.setOnDismissListener(new ei.f0(1, zArr, a0Var));
                        i11.show();
                    } catch (Exception e10) {
                        y(daVar, "secure_storage_failed", C("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused) {
                    y(daVar, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                FileLog.e(e11);
                if (!TextUtils.isEmpty("")) {
                    y(daVar, "secure_storage_failed", C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void U(String str, boolean z10) {
        boolean z11;
        boolean z12;
        z0 z0Var = this.f42126a;
        if (z0Var != null) {
            boolean z13 = z0Var.E;
        }
        if (z0Var != null && z0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        z0 z0Var2 = this.f42126a;
        if (z0Var2 != null && z0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        J(z11, z12);
        z0 z0Var3 = this.f42126a;
        if (z0Var3 != null) {
            z0Var3.f42432b = true;
        }
        if (this.N) {
            h("setPageLoaded: already loaded");
            return;
        }
        y5 y5Var = this.f42150s;
        if (z10 && z0Var3 != null && y5Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f42126a, property, 1.0f), ObjectAnimator.ofFloat(y5Var, property, 0.0f));
            animatorSet.addListener(new ap0(this, 29));
            animatorSet.start();
        } else {
            if (z0Var3 != null) {
                z0Var3.setAlpha(1.0f);
            }
            if (y5Var != null) {
                y5Var.setAlpha(0.0f);
                y5Var.setVisibility(8);
            }
        }
        this.f42128b = str;
        h("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.f42130c.getClass();
    }

    public final void V(da daVar, ei.u1 u1Var, String str, String str2, String str3) {
        if (u1Var != null && this.U != null) {
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
                            u1Var.n(optString, jSONObject.optString("value"));
                            y(daVar, str2, B(string, "req_id"));
                        } catch (RuntimeException e7) {
                            y(daVar, str3, C("req_id", string, "error", e7.getMessage()));
                        }
                    } catch (Exception unused) {
                        y(daVar, str3, C("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    y(daVar, str3, C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    y(daVar, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void W() {
        z0 z0Var = this.f42126a;
        if (z0Var != null && this.f42145o0) {
            z0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!com.google.android.gms.internal.cast.o.a("WEB_MESSAGE_LISTENER")) {
                h("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            z0 z0Var2 = this.f42126a;
            if (!z0Var2.R) {
                a5.b.a(z0Var2, "TelegramWebviewProxyMessage", singleton, new k2.v(z0Var2, 15));
                this.f42126a.R = true;
            }
            if (com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT")) {
                z0 z0Var3 = this.f42126a;
                if (z0Var3.S == null) {
                    boolean z10 = a5.b.f301a;
                    if (b5.m.d.b()) {
                        z0Var3.S = new a4.m((ScriptHandlerBoundaryInterface) se.b.a(ScriptHandlerBoundaryInterface.class, a5.b.c(z0Var3).f3696a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 3);
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
        z0 z0Var3 = this.f42126a;
        if (z0Var3 != null) {
            z0Var3.destroy();
            removeView(this.f42126a);
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (z0Var == null) {
            Context context = getContext();
            boolean z11 = this.f42145o0;
            long j3 = 0;
            if (z11 && (user = this.U) != null) {
                j3 = user.f20189id;
            }
            z0Var2 = new z0(context, z11, j3);
        } else {
            z0Var2 = z0Var;
        }
        this.f42126a = z0Var2;
        if (!this.f42145o0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f42126a, true);
            CookieManager.getInstance().flush();
            this.f42126a.f42435f = this.f42154v0;
        } else {
            z0Var2.setBackgroundColor(k(i6.f20822d6));
        }
        if (!MessagesController.getInstance(this.M).disableBotFullscreenBlur) {
            this.f42126a.setLayerType(2, null);
        }
        this.f42126a.f(this, this.d);
        this.f42126a.setCloseListener(this.C0);
        WebSettings settings = this.f42126a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f42145o0) {
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
            if (this.f42145o0) {
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
        this.f42126a.setVerticalScrollBarEnabled(false);
        if (z0Var == null && this.f42145o0) {
            this.f42126a.setAlpha(0.0f);
        }
        addView(this.f42126a);
        if (this.f42145o0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f42149r0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f42149r0 == null) {
                ?? obj2 = new Object();
                obj2.f42089a = this;
                this.f42149r0 = obj2;
            }
            this.f42149r0.f42089a = this;
            W();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f42153u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f42153u0;
            if (botWebViewContainer$WebViewProxy == null) {
                z0 z0Var4 = this.f42126a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(z0Var4, this);
                this.f42153u0 = botWebViewContainer$WebViewProxy2;
                z0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (z0Var == null) {
                this.f42126a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f42153u0.f42090a = this;
        }
        K(this.f42126a);
        P0 = false;
    }

    public final void Y(int i10, org.telegram.ui.ActionBar.b2 b2Var, Runnable runnable) {
        if (b2Var != null && !n(i10)) {
            b2Var.setOnDismissListener(new ei.f0(13, this, runnable));
            this.f42131c0 = b2Var;
            b2Var.f20428h0 = false;
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
        if (this.f42126a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.f42150s.setVisibility(8);
                this.h = true;
                this.f42135f.setVisibility(0);
                z0 z0Var = this.f42126a;
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
        in0 in0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            z0 z0Var = this.f42126a;
            if (z0Var != null) {
                z0Var.setBackgroundColor(k(i6.f20822d6));
            }
            if (!this.f42147q0) {
                int i12 = i6.Ki;
                int k10 = k(i12);
                this.f42146p0 = k10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN);
                y5 y5Var = this.f42150s;
                y5Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f42148r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.f42146p0);
                    this.f42148r.setupGradient(i12, this.f42133e, 1.0f, false);
                }
                y5Var.invalidate();
            }
            A();
        } else if (i10 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f42157x != null) {
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
                    this.f42157x.onReceiveValue(uriArr);
                    this.f42157x = null;
                }
                uriArr = null;
                this.f42157x.onReceiveValue(uriArr);
                this.f42157x = null;
            }
        } else if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (in0Var = this.V) != null) {
                in0Var.run();
                this.V = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f42150s) {
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
                this.f42143n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f42135f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f42126a) {
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

    public final void e(da daVar, ei.u1 u1Var, String str, String str2, String str3) {
        if (u1Var != null && this.U != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    u1Var.m(new JSONObject());
                    y(daVar, str2, B(string, "req_id"));
                } catch (RuntimeException e7) {
                    y(daVar, str3, C("req_id", string, "error", e7.getMessage()));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
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
        ei.s sVar = this.f42140j0;
        if (sVar == null) {
            this.f42140j0 = ei.s.c(getContext(), this.M, this.U.f20189id);
        } else {
            sVar.h();
        }
    }

    public final da g() {
        z0 z0Var = this.f42126a;
        long j3 = this.f42151s0;
        boolean z10 = this.f42152t0;
        String str = this.F0;
        ?? obj = new Object();
        obj.f808c = this;
        obj.d = z0Var;
        obj.f806a = j3;
        obj.f807b = z10;
        obj.f809e = str;
        return obj;
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f42149r0;
    }

    public int getMinHeight() {
        if (getParent() instanceof q4) {
            q4 q4Var = (q4) getParent();
            if (q4Var.J) {
                return (int) ((q4Var.getMeasuredHeight() - q4Var.getOffsetY()) + this.f42161z0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        z0 z0Var = this.f42126a;
        if (z0Var == null) {
            return null;
        }
        return l(z0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f42153u0;
    }

    public String getTrustedOrigin() {
        return this.F0;
    }

    public String getUrlLoaded() {
        return this.f42128b;
    }

    public z0 getWebView() {
        return this.f42126a;
    }

    public final void h(String str) {
        FileLog.d("[webviewcontainer] #" + this.N0 + " " + str);
    }

    public final void i() {
        h("destroyWebView preserving=" + this.B0);
        z0 z0Var = this.f42126a;
        if (z0Var != null) {
            if (z0Var.getParent() != null) {
                removeView(this.f42126a);
            }
            if (!this.B0) {
                this.f42126a.destroy();
                L(this.f42126a);
            }
            this.N = false;
            if (this.f42140j0 != null) {
                this.f42140j0 = null;
            }
            if (this.m0 != null) {
                this.m0 = null;
            }
            if (this.f42144n0 != null) {
                this.f42144n0 = null;
            }
            ei.x0 x0Var = this.f42141k0;
            if (x0Var != null) {
                x0Var.f9453f.remove(this.J0);
                this.f42141k0 = null;
                this.I0 = null;
            }
        }
    }

    public final void j(String str) {
        new yc(this, this.f42133e).Q(R.raw.error, 36, str).j();
    }

    public final int k(int i10) {
        d6 d6Var = this.f42133e;
        if (d6Var != null) {
            return d6Var.H0(i10);
        }
        return i6.w0(null, i10, false);
    }

    public final void m(da daVar, ei.u1 u1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (u1Var != null && this.U != null) {
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
                        Pair f7 = u1Var.f(optString);
                        if (u1Var.d && (obj = f7.first) == null) {
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
                    } catch (RuntimeException e7) {
                        y(daVar, str3, C("req_id", string, "error", e7.getMessage()));
                    }
                } catch (Exception unused2) {
                    y(daVar, str3, C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    y(daVar, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean n(int i10) {
        if (this.f42131c0 != null || (this.M0 > 0 && System.currentTimeMillis() < this.M0)) {
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
        if ((this.N || z11) && (z12 = this.f42145o0) && (getParent() instanceof q4)) {
            q4 q4Var = (q4) getParent();
            if (z10) {
                if (q4Var.getSwipeOffsetY() == q4Var.getTopActionBarOffsetY() + (-q4Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.O = z13;
            }
            int max = Math.max(getMinHeight(), (int) (q4Var.getTopActionBarOffsetY() + ((q4Var.getMeasuredHeight() - q4Var.getOffsetY()) - q4Var.getSwipeOffsetY()) + this.f42161z0));
            if (z11 || max != this.f42156w0 || this.f42158x0 != z10 || this.f42160y0 != this.O) {
                this.f42156w0 = max;
                this.f42158x0 = z10;
                this.f42160y0 = this.O;
                String str = "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.O + "}";
                if (z12 && !r()) {
                    h("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    NotificationCenter.getInstance(this.M).doOnIdle(new y(this, a4.a.q("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
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
        rc.a(this, new w4(this, 9));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        rc.h(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.A0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
        this.f42143n.f31881f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.f42127a0) {
            o(true, false);
        }
    }

    public final boolean p(da daVar) {
        boolean z10;
        if (daVar != null) {
            String str = (String) daVar.f809e;
            if (((c1) daVar.f808c) == this && ((z0) daVar.d) == this.f42126a && daVar.f806a == this.f42151s0 && (z10 = daVar.f807b) == this.f42152t0) {
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
        if (this.f42126a == null) {
            return false;
        }
        if (this.f42152t0) {
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
        this.f42130c = h0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.7f) {
            b10 = i6.b(0.0f, -0.15f, i10);
        } else {
            b10 = i6.b(0.025f, 0.15f, i10);
        }
        if (this.f42146p0 == b10) {
            return;
        }
        this.f42146p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        y5 y5Var = this.f42150s;
        y5Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f42148r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.f42146p0);
            this.f42148r.setupGradient(i6.Ki, this.f42133e, 1.0f, false);
        }
        this.f42147q0 = true;
        y5Var.invalidate();
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
        z0 z0Var = this.f42126a;
        if (z0Var != null) {
            z0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.O0 = callback4;
    }

    public void setOpener(z0 z0Var) {
        z0 z0Var2;
        this.f42154v0 = z0Var;
        if (!this.f42145o0 && (z0Var2 = this.f42126a) != null) {
            z0Var2.f42435f = z0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f42127a0 = z10;
    }

    public void setViewPortHeightOffset(float f7) {
        this.f42161z0 = f7;
    }

    public void setWasOpenedByBot(f5 f5Var) {
        this.E0 = f5Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.D0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f42155w = aVar;
    }

    public void setWebViewScrollListener(b1 b1Var) {
        this.d = b1Var;
        z0 z0Var = this.f42126a;
        if (z0Var != null) {
            z0Var.f(this, b1Var);
        }
    }

    public final void t(int i10, long j3) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
        String publicUsername = UserObject.getPublicUsername(user);
        y5 y5Var = this.f42150s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            y5Var.setVisibility(0);
            y5Var.setAlpha(1.0f);
            y5Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(k(i6.f20766a7))));
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
                y5Var.setVisibility(0);
                y5Var.setAlpha(1.0f);
                y5Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        d6 d6Var = this.f42133e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            y5Var.setVisibility(0);
            y5Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f42148r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.f42146p0);
                this.f42148r.setupGradient(i6.Ki, d6Var, 1.0f, false);
            }
            y5Var.f(null, null, this.f42148r);
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
        y5Var.setVisibility(0);
        y5Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.f42148r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.f42146p0);
            this.f42148r.setupGradient(i6.Ki, d6Var, 1.0f, false);
        }
        y5Var.f(null, null, this.f42148r);
        setupFlickerParams(true);
    }

    public final void u(int i10, String str, boolean z10) {
        String str2;
        this.M = i10;
        if (this.f42145o0) {
            this.f42151s0++;
            this.f42152t0 = z10;
            if (z10) {
                str2 = l(str);
            } else {
                str2 = null;
            }
            this.F0 = str2;
            if (this.f42126a != null) {
                W();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new y(this, str, 1));
    }

    public final void w(da daVar) {
        if (this.U != null) {
            f();
            ei.s sVar = this.f42140j0;
            if (sVar == null) {
                return;
            }
            try {
                y(daVar, "biometry_info_received", sVar.f());
            } catch (Exception e7) {
                FileLog.e(e7);
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
        if (this.f42145o0 && !r()) {
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
