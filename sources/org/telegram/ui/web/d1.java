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
import bi.i5;
import bi.k9;
import bi.z4;
import fi.f5;
import fi.k3;
import fi.q4;
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
import ji.k5;
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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.es0;
import org.telegram.ui.oj1;
import org.telegram.ui.q9;
import w7.b6;
import w7.x5;
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
    public k9 I0;
    public String J;
    public final u J0;
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
    public er0 V;
    public Activity W;
    public z0 f42035a;
    public boolean f42036a0;
    public String f42037b;
    public String f42038b0;
    public i0 f42039c;
    public org.telegram.ui.ActionBar.b2 f42040c0;
    public c1 d;
    public int f42041d0;
    public final f6 f42042e;
    public long f42043e0;
    public final TextView f42044f;
    public long f42045f0;
    public q9 f42046g0;
    public boolean h;
    public boolean f42047h0;
    public String f42048i0;
    public fi.s f42049j0;
    public fi.w0 f42050k0;
    public fi.l0 f42051l0;
    public fi.t1 m0;
    public final org.telegram.ui.Components.voip.h f42052n;
    public fi.t1 f42053n0;
    public final boolean f42054o0;
    public int f42055p0;
    public boolean f42056q0;
    public SvgHelper.SvgDrawable f42057r;
    public BotWebViewContainer$BotWebViewProxy f42058r0;
    public final i5 f42059s;
    public long f42060s0;
    public boolean f42061t0;
    public BotWebViewContainer$WebViewProxy f42062u0;
    public boolean v;
    public z0 f42063v0;
    public q0.a f42064w;
    public int f42065w0;
    public ValueCallback f42066x;
    public boolean f42067x0;
    public int f42068y;
    public boolean f42069y0;
    public float f42070z0;

    public d1(int i10, Context context, f6 f6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f42052n = hVar;
        int i11 = j6.Oh;
        this.f42068y = k(i11);
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
        this.J0 = new u(this, 1);
        this.K0 = -1;
        this.L0 = 0;
        int i13 = Q0;
        Q0 = i13 + 1;
        this.N0 = i13;
        this.f42054o0 = z10;
        this.f42042e = f6Var;
        h("created new webview container");
        if (context instanceof Activity) {
            this.W = (Activity) context;
        }
        hVar.f31507k = false;
        hVar.b(i10, 153);
        i5 i5Var = new i5(this, context);
        this.f42059s = i5Var;
        int k10 = k(j6.Ki);
        this.f42055p0 = k10;
        i5Var.setColorFilter(new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN));
        i5Var.getImageReceiver().setAspectFit(true);
        addView(i5Var, x5.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f42044f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(k(j6.f21042y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, x5.e(-1, -2, 17));
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
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(of.f.v(Uri.parse(str2), "https", null, T(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
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

    public static void a(d1 d1Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            d1Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else if (d1Var.d(strArr)) {
            aVar.accept(Boolean.TRUE);
        } else {
            d1Var.V = new er0(d1Var, aVar, strArr, 16);
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
            return of.f.v(Uri.parse(str), "https", null, T, null);
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
        i5 i5Var = this.f42059s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i5Var.getLayoutParams();
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
        i5Var.requestLayout();
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
                return of.f.v(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void x(int i10, z0 z0Var, k9 k9Var, String str, JSONObject jSONObject) {
        if (z0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new es0(z0Var, k9Var, str, jSONObject, 21));
    }

    public final void A() {
        JSONObject jSONObject;
        JSONObject p5;
        try {
            p5 = k3.p(this.f42042e, true);
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
        if (this.f42035a != null && this.R) {
            z("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r55, final bi.k9 r56, java.lang.String r57, java.lang.String r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.d1.F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, bi.k9, java.lang.String, java.lang.String):void");
    }

    public final void G(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            z("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.f42038b0, str)) {
                this.f42038b0 = null;
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
        if (of.f.f(uri, false, zArr) && !zArr[0] && this.f42039c != null) {
            setKeyboardFocusable(false);
        }
        of.f.r(getContext(), uri, true, z10, false, null, str, false, true, z12);
    }

    public abstract void K(z0 z0Var);

    public final void M() {
        h("preserveWebView");
        this.B0 = true;
        if (this.f42054o0) {
            z("visibility_changed", B(Boolean.FALSE, "is_visible"));
            this.f42060s0++;
        }
        z0 z0Var = this.f42035a;
        if (z0Var != null) {
            z0Var.f(null, null);
            this.f42035a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f42058r0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f41988a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f42062u0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f41989a = null;
        }
    }

    public final void O(int i10, z0 z0Var, Object obj, String str, boolean z10) {
        String str2;
        this.M = i10;
        this.B0 = false;
        boolean z11 = this.f42054o0;
        if (z11) {
            this.f42060s0++;
            this.f42061t0 = z10;
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
                F(this.f42058r0, g(), "web_app_setup_main_button", this.G);
            }
            if (this.L != null) {
                F(this.f42058r0, g(), "web_app_setup_secondary_button", this.L);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void S(k9 k9Var, fi.t1 t1Var, String str) {
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
                        y(k9Var, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = t1Var.h(optString);
                        if (h.isEmpty()) {
                            y(k9Var, "secure_storage_failed", C("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        b0 b0Var = new b0(this, k9Var, string, t1Var, optString);
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            f6Var = U.getResourceProvider();
                        } else {
                            f6Var = null;
                        }
                        int i10 = 1;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        f3 i11 = wl.i(1, context, f6Var, false);
                        ViewGroup f7 = wl.f(context, 1);
                        x9 x9Var = new x9(context);
                        TLRPC.User user = MessagesController.getInstance(t1Var.f9967a).getUser(Long.valueOf(t1Var.f9968b));
                        i9 i9Var = new i9((f6) null);
                        i9Var.r(user);
                        x9Var.e(user, i9Var);
                        f7.addView(x9Var, x5.t(80, 80, 49, 0, 21, 0, 13));
                        int i12 = j6.G6;
                        TextView b10 = b6.b(context, 20.0f, i12, true, null);
                        wl.k(R.string.BotRestoreStorageTitle, b10, 17);
                        f7.addView(b10, x5.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = b6.b(context, 14.0f, i12, false, null);
                        b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        b11.setGravity(17);
                        f7.addView(b11, x5.t(-1, -2, 7, 32, 0, 32, 19));
                        e9 e9Var = new e9(context, f6Var);
                        e9Var.setBackground(new oq(new ColorDrawable(j6.v0(j6.f20607a7, f6Var)), j6.U0(context, R.drawable.greydivider, j6.v0(j6.f20627b7, f6Var))));
                        e9Var.setFixedSize(12);
                        f7.addView(e9Var, x5.t(-1, 12, 7, 0, 0, 0, 0));
                        l4 l4Var = new l4(context, f6Var);
                        l4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        f7.addView(l4Var, x5.t(-1, -2, 7, 0, 0, 0, 0));
                        di.d dVar = new di.d(context, f6Var, true);
                        ArrayList arrayList = new ArrayList();
                        for (int i13 = 0; i13 < h.size(); i13++) {
                            fi.s1 s1Var = (fi.s1) h.get(i13);
                            if (i13 < h.size() - i10) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            fi.r1 r1Var = new fi.r1(s1Var, z11, context);
                            r1Var.setBackground(j6.f0(j6.v0(j6.f20753i6, f6Var), 2, -1));
                            ViewGroup viewGroup = f7;
                            String[] strArr2 = strArr;
                            r1Var.setOnClickListener(new z4(strArr2, s1Var, arrayList, dVar, 2));
                            viewGroup.addView(r1Var, x5.n(-1, 56));
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
                        viewGroup2.addView(dVar, x5.t(-1, 48, 7, 8, 8, 8, 4));
                        i11.customView = viewGroup2;
                        i11.fixNavigationBar(j6.v0(j6.f20734h5, f6Var));
                        dVar.setOnClickListener(new z4(zArr, b0Var, strArr3, i11, 3));
                        i11.setOnDismissListener(new fi.e0(1, zArr, b0Var));
                        i11.show();
                    } catch (Exception e7) {
                        y(k9Var, "secure_storage_failed", C("req_id", string, "error", e7.getMessage()));
                    }
                } catch (Exception unused) {
                    y(k9Var, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    y(k9Var, "secure_storage_failed", C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void U(String str, boolean z10) {
        boolean z11;
        boolean z12;
        z0 z0Var = this.f42035a;
        if (z0Var != null) {
            boolean z13 = z0Var.E;
        }
        if (z0Var != null && z0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        z0 z0Var2 = this.f42035a;
        if (z0Var2 != null && z0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        J(z11, z12);
        z0 z0Var3 = this.f42035a;
        if (z0Var3 != null) {
            z0Var3.f42328b = true;
        }
        if (this.N) {
            h("setPageLoaded: already loaded");
            return;
        }
        i5 i5Var = this.f42059s;
        if (z10 && z0Var3 != null && i5Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f42035a, property, 1.0f), ObjectAnimator.ofFloat(i5Var, property, 0.0f));
            animatorSet.addListener(new oj1(this, 1));
            animatorSet.start();
        } else {
            if (z0Var3 != null) {
                z0Var3.setAlpha(1.0f);
            }
            if (i5Var != null) {
                i5Var.setAlpha(0.0f);
                i5Var.setVisibility(8);
            }
        }
        this.f42037b = str;
        h("setPageLoaded: isPageLoaded = true!");
        this.N = true;
        this.f42039c.getClass();
    }

    public final void V(k9 k9Var, fi.t1 t1Var, String str, String str2, String str3) {
        if (t1Var != null && this.U != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        y(k9Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            t1Var.n(optString, jSONObject.optString("value"));
                            y(k9Var, str2, B(string, "req_id"));
                        } catch (RuntimeException e7) {
                            y(k9Var, str3, C("req_id", string, "error", e7.getMessage()));
                        }
                    } catch (Exception unused) {
                        y(k9Var, str3, C("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    y(k9Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    y(k9Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void W() {
        z0 z0Var = this.f42035a;
        if (z0Var != null && this.f42054o0) {
            z0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!com.google.android.gms.internal.cast.o.a("WEB_MESSAGE_LISTENER")) {
                h("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            z0 z0Var2 = this.f42035a;
            if (!z0Var2.R) {
                a5.c.a(z0Var2, "TelegramWebviewProxyMessage", singleton, new k5(z0Var2, 13));
                this.f42035a.R = true;
            }
            if (com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT")) {
                z0 z0Var3 = this.f42035a;
                if (z0Var3.S == null) {
                    boolean z10 = a5.c.f287a;
                    if (b5.m.d.b()) {
                        z0Var3.S = new a6.i((ScriptHandlerBoundaryInterface) se.b.a(ScriptHandlerBoundaryInterface.class, a5.c.c(z0Var3).f2502a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 6);
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
        z0 z0Var3 = this.f42035a;
        if (z0Var3 != null) {
            z0Var3.destroy();
            removeView(this.f42035a);
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
            boolean z11 = this.f42054o0;
            long j3 = 0;
            if (z11 && (user = this.U) != null) {
                j3 = user.f20016id;
            }
            z0Var2 = new z0(context, z11, j3);
        } else {
            z0Var2 = z0Var;
        }
        this.f42035a = z0Var2;
        if (!this.f42054o0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f42035a, true);
            CookieManager.getInstance().flush();
            this.f42035a.f42331f = this.f42063v0;
        } else {
            z0Var2.setBackgroundColor(k(j6.f20663d6));
        }
        if (!MessagesController.getInstance(this.M).disableBotFullscreenBlur) {
            this.f42035a.setLayerType(2, null);
        }
        this.f42035a.f(this, this.d);
        this.f42035a.setCloseListener(this.C0);
        WebSettings settings = this.f42035a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f42054o0) {
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
            if (this.f42054o0) {
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
        this.f42035a.setVerticalScrollBarEnabled(false);
        if (z0Var == null && this.f42054o0) {
            this.f42035a.setAlpha(0.0f);
        }
        addView(this.f42035a);
        if (this.f42054o0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f42058r0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f42058r0 == null) {
                ?? obj2 = new Object();
                obj2.f41988a = this;
                this.f42058r0 = obj2;
            }
            this.f42058r0.f41988a = this;
            W();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f42062u0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f42062u0;
            if (botWebViewContainer$WebViewProxy == null) {
                z0 z0Var4 = this.f42035a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(z0Var4, this);
                this.f42062u0 = botWebViewContainer$WebViewProxy2;
                z0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (z0Var == null) {
                this.f42035a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f42062u0.f41989a = this;
        }
        K(this.f42035a);
        P0 = false;
    }

    public final void Y(int i10, org.telegram.ui.ActionBar.b2 b2Var, Runnable runnable) {
        if (b2Var != null && !n(i10)) {
            b2Var.setOnDismissListener(new fi.e0(13, this, runnable));
            this.f42040c0 = b2Var;
            b2Var.f20238h0 = false;
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
        if (this.f42035a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.f42059s.setVisibility(8);
                this.h = true;
                this.f42044f.setVisibility(0);
                z0 z0Var = this.f42035a;
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
        er0 er0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            z0 z0Var = this.f42035a;
            if (z0Var != null) {
                z0Var.setBackgroundColor(k(j6.f20663d6));
            }
            if (!this.f42056q0) {
                int i12 = j6.Ki;
                int k10 = k(i12);
                this.f42055p0 = k10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN);
                i5 i5Var = this.f42059s;
                i5Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f42057r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.f42055p0);
                    this.f42057r.setupGradient(i12, this.f42042e, 1.0f, false);
                }
                i5Var.invalidate();
            }
            A();
        } else if (i10 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f42066x != null) {
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
                    this.f42066x.onReceiveValue(uriArr);
                    this.f42066x = null;
                }
                uriArr = null;
                this.f42066x.onReceiveValue(uriArr);
                this.f42066x = null;
            }
        } else if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (er0Var = this.V) != null) {
                er0Var.run();
                this.V = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f42059s) {
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
                this.f42052n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f42044f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f42035a) {
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

    public final void e(k9 k9Var, fi.t1 t1Var, String str, String str2, String str3) {
        if (t1Var != null && this.U != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    t1Var.m(new JSONObject());
                    y(k9Var, str2, B(string, "req_id"));
                } catch (RuntimeException e7) {
                    y(k9Var, str3, C("req_id", string, "error", e7.getMessage()));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    y(k9Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void f() {
        if (this.U == null) {
            return;
        }
        fi.s sVar = this.f42049j0;
        if (sVar == null) {
            this.f42049j0 = fi.s.c(getContext(), this.M, this.U.f20016id);
        } else {
            sVar.h();
        }
    }

    public final k9 g() {
        z0 z0Var = this.f42035a;
        long j3 = this.f42060s0;
        boolean z10 = this.f42061t0;
        String str = this.F0;
        ?? obj = new Object();
        obj.f3216c = this;
        obj.d = z0Var;
        obj.f3214a = j3;
        obj.f3215b = z10;
        obj.f3217e = str;
        return obj;
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f42058r0;
    }

    public int getMinHeight() {
        if (getParent() instanceof q4) {
            q4 q4Var = (q4) getParent();
            if (q4Var.J) {
                return (int) ((q4Var.getMeasuredHeight() - q4Var.getOffsetY()) + this.f42070z0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        z0 z0Var = this.f42035a;
        if (z0Var == null) {
            return null;
        }
        return l(z0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f42062u0;
    }

    public String getTrustedOrigin() {
        return this.F0;
    }

    public String getUrlLoaded() {
        return this.f42037b;
    }

    public z0 getWebView() {
        return this.f42035a;
    }

    public final void h(String str) {
        FileLog.d("[webviewcontainer] #" + this.N0 + " " + str);
    }

    public final void i() {
        h("destroyWebView preserving=" + this.B0);
        z0 z0Var = this.f42035a;
        if (z0Var != null) {
            if (z0Var.getParent() != null) {
                removeView(this.f42035a);
            }
            if (!this.B0) {
                this.f42035a.destroy();
                L(this.f42035a);
            }
            this.N = false;
            if (this.f42049j0 != null) {
                this.f42049j0 = null;
            }
            if (this.m0 != null) {
                this.m0 = null;
            }
            if (this.f42053n0 != null) {
                this.f42053n0 = null;
            }
            fi.w0 w0Var = this.f42050k0;
            if (w0Var != null) {
                w0Var.f10056f.remove(this.J0);
                this.f42050k0 = null;
                this.I0 = null;
            }
        }
    }

    public final void j(String str) {
        new yc(this, this.f42042e).Q(R.raw.error, 36, str).j();
    }

    public final int k(int i10) {
        f6 f6Var = this.f42042e;
        if (f6Var != null) {
            return f6Var.G0(i10);
        }
        return j6.w0(null, i10, false);
    }

    public final void m(k9 k9Var, fi.t1 t1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (t1Var != null && this.U != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        y(k9Var, str3, C("req_id", string, "error", "KEY_INVALID"));
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
                            y(k9Var, str2, jSONObject);
                        } else {
                            y(k9Var, str2, C("req_id", string, "value", f7.first));
                        }
                    } catch (RuntimeException e7) {
                        y(k9Var, str3, C("req_id", string, "error", e7.getMessage()));
                    }
                } catch (Exception unused2) {
                    y(k9Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    y(k9Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean n(int i10) {
        if (this.f42040c0 != null || (this.M0 > 0 && System.currentTimeMillis() < this.M0)) {
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
        if ((this.N || z11) && (z12 = this.f42054o0) && (getParent() instanceof q4)) {
            q4 q4Var = (q4) getParent();
            if (z10) {
                if (q4Var.getSwipeOffsetY() == q4Var.getTopActionBarOffsetY() + (-q4Var.getOffsetY())) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.O = z13;
            }
            int max = Math.max(getMinHeight(), (int) (q4Var.getTopActionBarOffsetY() + ((q4Var.getMeasuredHeight() - q4Var.getOffsetY()) - q4Var.getSwipeOffsetY()) + this.f42070z0));
            if (z11 || max != this.f42065w0 || this.f42067x0 != z10 || this.f42069y0 != this.O) {
                this.f42065w0 = max;
                this.f42067x0 = z10;
                this.f42069y0 = this.O;
                String str = "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.O + "}";
                if (z12 && !r()) {
                    h("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    NotificationCenter.getInstance(this.M).doOnIdle(new z(this, a4.a.p("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
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
        qc.a(this, new ah.n0(this, 10));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h("detached");
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
        this.f42052n.f31503f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.f42036a0) {
            o(true, false);
        }
    }

    public final boolean p(k9 k9Var) {
        boolean z10;
        if (k9Var != null) {
            String str = (String) k9Var.f3217e;
            if (((d1) k9Var.f3216c) == this && ((z0) k9Var.d) == this.f42035a && k9Var.f3214a == this.f42060s0 && (z10 = k9Var.f3215b) == this.f42061t0) {
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
        if (this.f42035a == null) {
            return false;
        }
        if (this.f42061t0) {
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

    public void setDelegate(i0 i0Var) {
        this.f42039c = i0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.7f) {
            b10 = j6.b(0.0f, -0.15f, i10);
        } else {
            b10 = j6.b(0.025f, 0.15f, i10);
        }
        if (this.f42055p0 == b10) {
            return;
        }
        this.f42055p0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        i5 i5Var = this.f42059s;
        i5Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f42057r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.f42055p0);
            this.f42057r.setupGradient(j6.Ki, this.f42042e, 1.0f, false);
        }
        this.f42056q0 = true;
        i5Var.invalidate();
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
        z0 z0Var = this.f42035a;
        if (z0Var != null) {
            z0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.O0 = callback4;
    }

    public void setOpener(z0 z0Var) {
        z0 z0Var2;
        this.f42063v0 = z0Var;
        if (!this.f42054o0 && (z0Var2 = this.f42035a) != null) {
            z0Var2.f42331f = z0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.W = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.f42036a0 = z10;
    }

    public void setViewPortHeightOffset(float f7) {
        this.f42070z0 = f7;
    }

    public void setWasOpenedByBot(f5 f5Var) {
        this.E0 = f5Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.D0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f42064w = aVar;
    }

    public void setWebViewScrollListener(c1 c1Var) {
        this.d = c1Var;
        z0 z0Var = this.f42035a;
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
        i5 i5Var = this.f42059s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            i5Var.setVisibility(0);
            i5Var.setAlpha(1.0f);
            i5Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(k(j6.f20607a7))));
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
                i5Var.setVisibility(0);
                i5Var.setAlpha(1.0f);
                i5Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        f6 f6Var = this.f42042e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            i5Var.setVisibility(0);
            i5Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f42057r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.f42055p0);
                this.f42057r.setupGradient(j6.Ki, f6Var, 1.0f, false);
            }
            i5Var.f(null, null, this.f42057r);
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
        i5Var.setVisibility(0);
        i5Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.f42057r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.f42055p0);
            this.f42057r.setupGradient(j6.Ki, f6Var, 1.0f, false);
        }
        i5Var.f(null, null, this.f42057r);
        setupFlickerParams(true);
    }

    public final void u(int i10, String str, boolean z10) {
        String str2;
        this.M = i10;
        if (this.f42054o0) {
            this.f42060s0++;
            this.f42061t0 = z10;
            if (z10) {
                str2 = l(str);
            } else {
                str2 = null;
            }
            this.F0 = str2;
            if (this.f42035a != null) {
                W();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new z(this, str, 1));
    }

    public final void w(k9 k9Var) {
        if (this.U != null) {
            f();
            fi.s sVar = this.f42049j0;
            if (sVar == null) {
                return;
            }
            try {
                y(k9Var, "biometry_info_received", sVar.f());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void y(k9 k9Var, String str, JSONObject jSONObject) {
        if (!p(k9Var)) {
            h("notifyEvent " + str + " dropped after document change");
            return;
        }
        z(str, jSONObject);
    }

    public final void z(String str, JSONObject jSONObject) {
        if (this.f42054o0 && !r()) {
            h("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        h("notifyEvent " + str);
        NotificationCenter.getInstance(this.M).doOnIdle(new z(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public void I() {
    }

    public void L(z0 z0Var) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void E(String str, boolean z10) {
    }

    public void J(boolean z10, boolean z11) {
    }
}
