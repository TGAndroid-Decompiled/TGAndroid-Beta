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
import java.util.Map;
import java.util.Set;
import k7.b6;
import kh.t3;
import lh.m5;
import nh.j7;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy0;
import org.telegram.ui.ss0;
import org.telegram.ui.t9;
import rh.m3;
import rh.p2;
import rh.y3;
public abstract class c1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean M0 = true;
    public static int N0;
    public static HashMap O0;
    public boolean A0;
    public int B;
    public y3 B0;
    public String C;
    public String C0;
    public String D;
    public final Rect D0;
    public int E;
    public int E0;
    public int F;
    public j7 F0;
    public String G;
    public final t G0;
    public String H;
    public int H0;
    public String I;
    public int I0;
    public int J;
    public long J0;
    public boolean K;
    public final int K0;
    public boolean L;
    public Utilities.Callback4 L0;
    public long M;
    public long N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public TLRPC.User R;
    public m71 S;
    public Activity T;
    public boolean U;
    public String V;
    public org.telegram.ui.ActionBar.d2 W;
    public y0 f39381a;
    public int f39382a0;
    public String f39383b;
    public long f39384b0;
    public g0 f39385c;
    public long f39386c0;
    public b1 d;
    public t9 f39387d0;
    public final f6 e;
    public boolean f39388e0;
    public final TextView f39389f;
    public String f39390f0;
    public rh.p f39391g0;
    public boolean h;
    public rh.q0 f39392h0;
    public rh.h0 f39393i0;
    public rh.i1 f39394j0;
    public rh.i1 f39395k0;
    public final boolean f39396l0;
    public int m0;
    public final org.telegram.ui.Components.voip.h f39397n;
    public boolean f39398n0;
    public BotWebViewContainer$BotWebViewProxy f39399o0;
    public long f39400p0;
    public boolean f39401q0;
    public SvgHelper.SvgDrawable f39402r;
    public BotWebViewContainer$WebViewProxy f39403r0;
    public final nh.y3 f39404s;
    public y0 f39405s0;
    public int f39406t0;
    public boolean f39407u0;
    public boolean v;
    public boolean f39408v0;
    public q0.a f39409w;
    public float f39410w0;
    public ValueCallback f39411x;
    public int f39412x0;
    public int f39413y;
    public boolean f39414y0;
    public Runnable f39415z0;

    public c1(int i10, Context context, f6 f6Var, boolean z4) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f39397n = hVar;
        int i11 = j6.Oh;
        this.f39413y = k(i11);
        int i12 = j6.Sh;
        this.B = k(i12);
        this.C = "";
        this.E = k(i11);
        this.F = k(i12);
        this.G = "";
        this.H = "";
        this.J = UserConfig.selectedAccount;
        this.f39412x0 = -1;
        this.D0 = new Rect(0, 0, 0, 0);
        this.E0 = 0;
        this.G0 = new t(this, 1);
        this.H0 = -1;
        this.I0 = 0;
        int i13 = N0;
        N0 = i13 + 1;
        this.K0 = i13;
        this.f39396l0 = z4;
        this.e = f6Var;
        h("created new webview container");
        if (context instanceof Activity) {
            this.T = (Activity) context;
        }
        hVar.f29632k = false;
        hVar.b(i10, 153);
        nh.y3 y3Var = new nh.y3(this, context);
        this.f39404s = y3Var;
        int k10 = k(j6.Ki);
        this.m0 = k10;
        y3Var.setColorFilter(new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN));
        y3Var.getImageReceiver().setAspectFit(true);
        addView(y3Var, b6.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f39389f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(k(j6.f20256y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, b6.e(-1, -2, 17));
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
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ze.d.v(Uri.parse(str2), "https", null, T(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
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
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < split.length; i10++) {
            if (i10 > 0) {
                sb.append("-d");
            }
            sb.append(split[i10].replaceAll("\\-", "-h"));
        }
        sb.append(".");
        sb.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return sb.toString();
    }

    public static void a(c1 c1Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            c1Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else if (c1Var.d(strArr)) {
            aVar.accept(Boolean.TRUE);
        } else {
            c1Var.S = new m71(c1Var, aVar, strArr, 3);
            Activity activity = c1Var.T;
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
            if (O0 == null) {
                O0 = new HashMap();
            }
            O0.put(T, hostAuthority);
            return ze.d.v(Uri.parse(str), "https", null, T, null);
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
                StringBuilder sb = new StringBuilder();
                sb.append(scheme);
                sb.append("://");
                sb.append(host);
                if (port != -1 && ((!scheme.equalsIgnoreCase("http") || port != 80) && (!scheme.equalsIgnoreCase("https") || port != 443))) {
                    sb.append(":");
                    sb.append(port);
                }
                return sb.toString();
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

    private void setupFlickerParams(boolean z4) {
        int i10;
        this.v = z4;
        nh.y3 y3Var = this.f39404s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y3Var.getLayoutParams();
        if (z4) {
            i10 = 17;
        } else {
            i10 = 48;
        }
        layoutParams.gravity = i10;
        if (z4) {
            int dp = AndroidUtilities.dp(100.0f);
            layoutParams.height = dp;
            layoutParams.width = dp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        y3Var.requestLayout();
    }

    private void setupWebView(y0 y0Var) {
        X(y0Var, null);
    }

    public static String v(String str) {
        String str2;
        if (O0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority != null) {
            if (hostAuthority.endsWith("." + MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress) && (str2 = (String) O0.get(hostAuthority)) != null) {
                return ze.d.v(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    public static void x(int i10, y0 y0Var, j7 j7Var, String str, JSONObject jSONObject) {
        if (y0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new dy0((Object) y0Var, (Object) j7Var, str, (Object) jSONObject, 12));
    }

    public final void A() {
        JSONObject jSONObject;
        JSONObject p10;
        try {
            p10 = p2.p(this.e, true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (p10 != null) {
            jSONObject = new JSONObject().put("theme_params", p10);
            y("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        y("theme_changed", jSONObject);
    }

    public final boolean D() {
        if (this.f39381a != null && this.O) {
            y("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public final void F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r55, final nh.j7 r56, java.lang.String r57, java.lang.String r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.c1.F(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, nh.j7, java.lang.String, java.lang.String):void");
    }

    public final void G(String str, String str2, boolean z4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            y("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (!z4 && Objects.equals(this.V, str)) {
                this.V = null;
            }
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public final void H(Uri uri, String str, boolean z4, boolean z10, boolean z11) {
        if (System.currentTimeMillis() - this.M > 10000 && z10) {
            return;
        }
        this.M = 0L;
        boolean[] zArr = {false};
        if (ze.d.f(uri, false, zArr) && !zArr[0] && this.f39385c != null) {
            setKeyboardFocusable(false);
        }
        ze.d.r(getContext(), uri, true, z4, false, null, str, false, true, z11);
    }

    public abstract void K(y0 y0Var);

    public final void M() {
        h("preserveWebView");
        this.f39414y0 = true;
        if (this.f39396l0) {
            y("visibility_changed", B(Boolean.FALSE, "is_visible"));
            this.f39400p0++;
        }
        y0 y0Var = this.f39381a;
        if (y0Var != null) {
            y0Var.f(null, null);
            this.f39381a.setCloseListener(null);
        }
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f39399o0;
        if (botWebViewContainer$BotWebViewProxy != null) {
            botWebViewContainer$BotWebViewProxy.f39355a = null;
        }
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f39403r0;
        if (botWebViewContainer$WebViewProxy != null) {
            botWebViewContainer$WebViewProxy.f39356a = null;
        }
    }

    public final void O(int i10, y0 y0Var, Object obj, String str, boolean z4) {
        String str2;
        this.J = i10;
        this.f39414y0 = false;
        boolean z10 = this.f39396l0;
        if (z10) {
            this.f39400p0++;
            this.f39401q0 = z4;
            if (z4) {
                str2 = l(str);
            } else {
                str2 = null;
            }
            this.C0 = str2;
        }
        X(y0Var, obj);
        if (z10) {
            y("visibility_changed", B(Boolean.TRUE, "is_visible"));
        }
    }

    public final void P(int i10, boolean z4) {
        JSONObject jSONObject;
        if (!z4 && i10 == this.E0) {
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
        this.E0 = i10;
    }

    public final void Q(Rect rect, boolean z4) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.D0;
            if (z4 || !rect2.equals(rect)) {
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

    public final void R() {
        try {
            if (this.D != null) {
                F(this.f39399o0, g(), "web_app_setup_main_button", this.D);
            }
            if (this.I != null) {
                F(this.f39399o0, g(), "web_app_setup_secondary_button", this.I);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void S(j7 j7Var, rh.i1 i1Var, String str) {
        f6 f6Var;
        boolean z4;
        if (i1Var != null && this.R != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        z(j7Var, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = i1Var.h(optString);
                        if (h.isEmpty()) {
                            z(j7Var, "secure_storage_failed", C("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        a0 a0Var = new a0(this, j7Var, string, i1Var, optString);
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            f6Var = U.getResourceProvider();
                        } else {
                            f6Var = null;
                        }
                        int i10 = 1;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        g3 o10 = org.telegram.messenger.y3.o(context, f6Var, false, false);
                        ViewGroup f10 = org.telegram.messenger.y3.f(context, 1);
                        p9 p9Var = new p9(context);
                        ArrayList arrayList = h;
                        TLRPC.User user = MessagesController.getInstance(i1Var.f43618a).getUser(Long.valueOf(i1Var.f43619b));
                        z8 z8Var = new z8((f6) null);
                        z8Var.r(user);
                        p9Var.e(user, z8Var);
                        f10.addView(p9Var, b6.t(80, 80, 49, 0, 21, 0, 13));
                        int i11 = j6.G6;
                        TextView b10 = k7.f6.b(context, 20.0f, i11, true, null);
                        org.telegram.messenger.y3.r(R.string.BotRestoreStorageTitle, b10, 17);
                        f10.addView(b10, b6.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = k7.f6.b(context, 14.0f, i11, false, null);
                        b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        b11.setGravity(17);
                        f10.addView(b11, b6.t(-1, -2, 7, 32, 0, 32, 19));
                        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context, f6Var);
                        z8Var2.setBackground(new mq(new ColorDrawable(j6.v0(j6.f19827a7, f6Var)), j6.U0(context, R.drawable.greydivider, j6.v0(j6.f19846b7, f6Var))));
                        z8Var2.setFixedSize(12);
                        f10.addView(z8Var2, b6.t(-1, 12, 7, 0, 0, 0, 0));
                        l4 l4Var = new l4(context, f6Var);
                        l4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        f10.addView(l4Var, b6.t(-1, -2, 7, 0, 0, 0, 0));
                        ph.d dVar = new ph.d(context, f6Var, true);
                        ArrayList arrayList2 = new ArrayList();
                        int i12 = 0;
                        while (i12 < arrayList.size()) {
                            ArrayList arrayList3 = arrayList;
                            rh.h1 h1Var = (rh.h1) arrayList3.get(i12);
                            if (i12 < arrayList3.size() - i10) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            rh.g1 g1Var = new rh.g1(h1Var, z4, context);
                            g1Var.setBackground(j6.f0(j6.v0(j6.f19971i6, f6Var), 2, -1));
                            ViewGroup viewGroup = f10;
                            g1Var.setOnClickListener(new t3(strArr, h1Var, arrayList2, dVar, 15));
                            viewGroup.addView(g1Var, b6.n(-1, 56));
                            arrayList2.add(g1Var);
                            i12++;
                            o10 = o10;
                            arrayList = arrayList3;
                            f10 = viewGroup;
                            a0Var = a0Var;
                            i10 = 1;
                        }
                        a0 a0Var2 = a0Var;
                        g3 g3Var = o10;
                        ViewGroup viewGroup2 = f10;
                        boolean z10 = false;
                        dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                        if (strArr[0] != null) {
                            z10 = true;
                        }
                        dVar.setEnabled(z10);
                        viewGroup2.addView(dVar, b6.t(-1, 48, 7, 8, 8, 8, 4));
                        g3Var.customView = viewGroup2;
                        g3Var.fixNavigationBar(j6.v0(j6.f19952h5, f6Var));
                        dVar.setOnClickListener(new t3(zArr, a0Var2, strArr, g3Var, 16));
                        g3Var.setOnDismissListener(new gg.g(15, zArr, a0Var2));
                        g3Var.show();
                    } catch (Exception e) {
                        z(j7Var, "secure_storage_failed", C("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    z(j7Var, "secure_storage_failed", C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                if (!TextUtils.isEmpty("")) {
                    z(j7Var, "secure_storage_failed", C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void U(String str, boolean z4) {
        boolean z10;
        boolean z11;
        y0 y0Var = this.f39381a;
        if (y0Var != null) {
            boolean z12 = y0Var.B;
        }
        if (y0Var != null && y0Var.canGoBack()) {
            z10 = false;
        } else {
            z10 = true;
        }
        y0 y0Var2 = this.f39381a;
        if (y0Var2 != null && y0Var2.canGoForward()) {
            z11 = false;
        } else {
            z11 = true;
        }
        J(z10, z11);
        y0 y0Var3 = this.f39381a;
        if (y0Var3 != null) {
            y0Var3.f39652b = true;
        }
        if (this.K) {
            h("setPageLoaded: already loaded");
            return;
        }
        nh.y3 y3Var = this.f39404s;
        if (z4 && y0Var3 != null && y3Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f39381a, property, 1.0f), ObjectAnimator.ofFloat(y3Var, property, 0.0f));
            animatorSet.addListener(new ss0(this, 27));
            animatorSet.start();
        } else {
            if (y0Var3 != null) {
                y0Var3.setAlpha(1.0f);
            }
            if (y3Var != null) {
                y3Var.setAlpha(0.0f);
                y3Var.setVisibility(8);
            }
        }
        this.f39383b = str;
        h("setPageLoaded: isPageLoaded = true!");
        this.K = true;
        this.f39385c.getClass();
    }

    public final void V(j7 j7Var, rh.i1 i1Var, String str, String str2, String str3) {
        if (i1Var != null && this.R != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        z(j7Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            i1Var.n(optString, jSONObject.optString("value"));
                            z(j7Var, str2, B(string, "req_id"));
                        } catch (RuntimeException e) {
                            z(j7Var, str3, C("req_id", string, "error", e.getMessage()));
                        }
                    } catch (Exception unused) {
                        z(j7Var, str3, C("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    z(j7Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                if (!TextUtils.isEmpty("")) {
                    z(j7Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void W() {
        y0 y0Var = this.f39381a;
        if (y0Var != null && this.f39396l0) {
            y0Var.removeJavascriptInterface("TelegramWebviewProxy");
            if (!k7.x.a("WEB_MESSAGE_LISTENER")) {
                h("Bot WebMessageListener is unsupported; native bridge disabled");
                return;
            }
            Set singleton = Collections.singleton("*");
            y0 y0Var2 = this.f39381a;
            if (!y0Var2.O) {
                n2.b.a(y0Var2, "TelegramWebviewProxyMessage", singleton, new m5(y0Var2, 22));
                this.f39381a.O = true;
            }
            if (k7.x.a("DOCUMENT_START_SCRIPT")) {
                y0 y0Var3 = this.f39381a;
                if (y0Var3.P == null) {
                    boolean z4 = n2.b.f14204a;
                    if (o2.l.d.b()) {
                        y0Var3.P = new bb.b((ScriptHandlerBoundaryInterface) ee.b.a(ScriptHandlerBoundaryInterface.class, n2.b.c(y0Var3).f16200a.addDocumentStartJavaScript("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};", (String[]) singleton.toArray(new String[0]))), 29);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        }
    }

    public final void X(y0 y0Var, Object obj) {
        y0 y0Var2;
        String str;
        TLRPC.User user;
        boolean z4;
        String str2 = "";
        y0 y0Var3 = this.f39381a;
        if (y0Var3 != null) {
            y0Var3.destroy();
            removeView(this.f39381a);
        }
        if (y0Var != null) {
            AndroidUtilities.removeFromParent(y0Var);
        }
        try {
            if (SharedConfig.debugWebView && !s()) {
                z4 = true;
            } else {
                z4 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z4);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (y0Var == null) {
            Context context = getContext();
            boolean z10 = this.f39396l0;
            long j10 = 0;
            if (z10 && (user = this.R) != null) {
                j10 = user.f19306id;
            }
            y0Var2 = new y0(context, z10, j10);
        } else {
            y0Var2 = y0Var;
        }
        this.f39381a = y0Var2;
        if (!this.f39396l0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f39381a, true);
            CookieManager.getInstance().flush();
            this.f39381a.f39654f = this.f39405s0;
        } else {
            y0Var2.setBackgroundColor(k(j6.f19881d6));
        }
        if (!MessagesController.getInstance(this.J).disableBotFullscreenBlur) {
            this.f39381a.setLayerType(2, null);
        }
        this.f39381a.f(this, this.d);
        this.f39381a.setCloseListener(this.f39415z0);
        WebSettings settings = this.f39381a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f39396l0) {
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
            StringBuilder sb = new StringBuilder("(Linux; Android ");
            String str3 = Build.VERSION.RELEASE;
            sb.append(str3);
            sb.append("; K)");
            String replaceAll = replace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb.toString()).replaceAll("Version/[\\d\\.]+ ", "");
            if (this.f39396l0) {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                if (devicePerformanceClass == 0) {
                    str = "LOW";
                } else if (devicePerformanceClass == 1) {
                    str = "AVERAGE";
                } else {
                    str = "HIGH";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(replaceAll);
                sb2.append(" Telegram-Android/");
                sb2.append(packageInfo.versionName);
                sb2.append(" (");
                String str4 = Build.MANUFACTURER;
                if (str4 != null) {
                    if (str4.length() <= 1) {
                        str2 = str4.toUpperCase();
                    } else {
                        str2 = str4.substring(0, 1).toUpperCase() + str4.substring(1).toLowerCase();
                    }
                }
                sb2.append(str2);
                sb2.append(" ");
                sb2.append(Build.MODEL);
                sb2.append("; Android ");
                sb2.append(str3);
                sb2.append("; SDK ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append("; ");
                sb2.append(str);
                sb2.append(")");
                replaceAll = sb2.toString();
            }
            settings.setUserAgentString(replaceAll);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.f39381a.setVerticalScrollBarEnabled(false);
        if (y0Var == null && this.f39396l0) {
            this.f39381a.setAlpha(0.0f);
        }
        addView(this.f39381a);
        if (this.f39396l0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f39399o0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            if (this.f39399o0 == null) {
                ?? obj2 = new Object();
                obj2.f39355a = this;
                this.f39399o0 = obj2;
            }
            this.f39399o0.f39355a = this;
            W();
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f39403r0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f39403r0;
            if (botWebViewContainer$WebViewProxy == null) {
                y0 y0Var4 = this.f39381a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(y0Var4, this);
                this.f39403r0 = botWebViewContainer$WebViewProxy2;
                y0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (y0Var == null) {
                this.f39381a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f39403r0.f39356a = this;
        }
        K(this.f39381a);
        M0 = false;
    }

    public final void Y(int i10, org.telegram.ui.ActionBar.d2 d2Var, Runnable runnable) {
        if (d2Var != null && !n(i10)) {
            d2Var.setOnDismissListener(new gg.g(12, this, runnable));
            this.W = d2Var;
            d2Var.f19566e0 = false;
            d2Var.show();
            if (this.H0 != i10) {
                this.H0 = i10;
                this.I0 = 0;
                this.J0 = 0L;
            }
            this.I0++;
        }
    }

    public final void Z(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        if (str != null) {
            str2 = ": ".concat(str);
        } else {
            str2 = "";
        }
        sb.append(str2);
        j(sb.toString());
    }

    public final void c() {
        if (this.f39381a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.f39404s.setVisibility(8);
                this.h = true;
                this.f39389f.setVisibility(0);
                y0 y0Var = this.f39381a;
                if (y0Var != null) {
                    removeView(y0Var);
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
        m71 m71Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            y0 y0Var = this.f39381a;
            if (y0Var != null) {
                y0Var.setBackgroundColor(k(j6.f19881d6));
            }
            if (!this.f39398n0) {
                int i12 = j6.Ki;
                int k10 = k(i12);
                this.m0 = k10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN);
                nh.y3 y3Var = this.f39404s;
                y3Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f39402r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.m0);
                    this.f39402r.setupGradient(i12, this.e, 1.0f, false);
                }
                y3Var.invalidate();
            }
            A();
        } else if (i10 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f39411x != null) {
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
                    this.f39411x.onReceiveValue(uriArr);
                    this.f39411x = null;
                }
                uriArr = null;
                this.f39411x.onReceiveValue(uriArr);
                this.f39411x = null;
            }
        } else if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (m71Var = this.S) != null) {
                m71Var.run();
                this.S = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f39404s) {
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
                this.f39397n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f39389f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f39381a) {
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

    public final void e(j7 j7Var, rh.i1 i1Var, String str, String str2, String str3) {
        if (i1Var != null && this.R != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    i1Var.m(new JSONObject());
                    z(j7Var, str2, B(string, "req_id"));
                } catch (RuntimeException e) {
                    z(j7Var, str3, C("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                if (!TextUtils.isEmpty("")) {
                    z(j7Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void f() {
        if (this.R == null) {
            return;
        }
        rh.p pVar = this.f39391g0;
        if (pVar == null) {
            this.f39391g0 = rh.p.c(getContext(), this.J, this.R.f19306id);
        } else {
            pVar.h();
        }
    }

    public final j7 g() {
        y0 y0Var = this.f39381a;
        long j10 = this.f39400p0;
        boolean z4 = this.f39401q0;
        String str = this.C0;
        ?? obj = new Object();
        obj.f15504c = this;
        obj.d = y0Var;
        obj.f15502a = j10;
        obj.f15503b = z4;
        obj.e = str;
        return obj;
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f39399o0;
    }

    public int getMinHeight() {
        if (getParent() instanceof m3) {
            m3 m3Var = (m3) getParent();
            if (m3Var.G) {
                return (int) ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) + this.f39410w0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        y0 y0Var = this.f39381a;
        if (y0Var == null) {
            return null;
        }
        return l(y0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f39403r0;
    }

    public String getTrustedOrigin() {
        return this.C0;
    }

    public String getUrlLoaded() {
        return this.f39383b;
    }

    public y0 getWebView() {
        return this.f39381a;
    }

    public final void h(String str) {
        FileLog.d("[webviewcontainer] #" + this.K0 + " " + str);
    }

    public final void i() {
        h("destroyWebView preserving=" + this.f39414y0);
        y0 y0Var = this.f39381a;
        if (y0Var != null) {
            if (y0Var.getParent() != null) {
                removeView(this.f39381a);
            }
            if (!this.f39414y0) {
                this.f39381a.destroy();
                L(this.f39381a);
            }
            this.K = false;
            if (this.f39391g0 != null) {
                this.f39391g0 = null;
            }
            if (this.f39394j0 != null) {
                this.f39394j0 = null;
            }
            if (this.f39395k0 != null) {
                this.f39395k0 = null;
            }
            rh.q0 q0Var = this.f39392h0;
            if (q0Var != null) {
                q0Var.f43773f.remove(this.G0);
                this.f39392h0 = null;
                this.F0 = null;
            }
        }
    }

    public final void j(String str) {
        new qc(this, this.e).Q(R.raw.error, 36, str).j();
    }

    public final int k(int i10) {
        f6 f6Var = this.e;
        if (f6Var != null) {
            return f6Var.x0(i10);
        }
        return j6.w0(null, i10, false);
    }

    public final void m(j7 j7Var, rh.i1 i1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (i1Var != null && this.R != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        z(j7Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        Pair f10 = i1Var.f(optString);
                        if (i1Var.d && (obj = f10.first) == null) {
                            Object obj2 = f10.second;
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("req_id", string);
                                jSONObject.put("value", obj);
                                jSONObject.put("can_restore", obj2);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            z(j7Var, str2, jSONObject);
                        } else {
                            z(j7Var, str2, C("req_id", string, "value", f10.first));
                        }
                    } catch (RuntimeException e) {
                        z(j7Var, str3, C("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused2) {
                    z(j7Var, str3, C("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e6) {
                FileLog.e(e6);
                if (!TextUtils.isEmpty("")) {
                    z(j7Var, str3, C("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean n(int i10) {
        if (this.W != null || (this.J0 > 0 && System.currentTimeMillis() < this.J0)) {
            return true;
        }
        if (this.H0 != i10 || this.I0 <= 3) {
            return false;
        }
        this.J0 = System.currentTimeMillis() + 3000;
        this.I0 = 0;
        return true;
    }

    public final void o(boolean z4, boolean z10) {
        boolean z11;
        boolean z12;
        invalidate();
        if ((this.K || z10) && (z11 = this.f39396l0) && (getParent() instanceof m3)) {
            m3 m3Var = (m3) getParent();
            if (z4) {
                if (m3Var.getSwipeOffsetY() == m3Var.getTopActionBarOffsetY() + (-m3Var.getOffsetY())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.L = z12;
            }
            int max = Math.max(getMinHeight(), (int) (m3Var.getTopActionBarOffsetY() + ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) - m3Var.getSwipeOffsetY()) + this.f39410w0));
            if (z10 || max != this.f39406t0 || this.f39407u0 != z4 || this.f39408v0 != this.L) {
                this.f39406t0 = max;
                this.f39407u0 = z4;
                this.f39408v0 = this.L;
                String str = "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z4 + ",is_expanded:" + this.L + "}";
                if (z11 && !r()) {
                    h("notifyEvent viewport_changed dropped for untrusted document");
                } else {
                    NotificationCenter.getInstance(this.J).doOnIdle(new y(this, android.support.v4.media.a.o("window.Telegram.WebView.receiveEvent('viewport_changed', ", str, ");"), 0));
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
        ic.a(this, new kh.t0(this, 10));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        ic.h(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f39412x0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
        this.f39397n.f29628f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.U) {
            o(true, false);
        }
    }

    public final boolean p(j7 j7Var) {
        boolean z4;
        if (j7Var != null) {
            String str = (String) j7Var.e;
            if (((c1) j7Var.f15504c) == this && ((y0) j7Var.d) == this.f39381a && j7Var.f15502a == this.f39400p0 && (z4 = j7Var.f15503b) == this.f39401q0) {
                if (z4) {
                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.C0) && TextUtils.equals(str, getOriginHost())) {
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
        if (this.f39381a == null) {
            return false;
        }
        if (this.f39401q0) {
            if (TextUtils.isEmpty(this.C0) || !TextUtils.equals(this.C0, getOriginHost())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean s() {
        if (this.L0 != null) {
            return true;
        }
        return false;
    }

    public void setBotUser(TLRPC.User user) {
        this.R = user;
    }

    public void setDelegate(g0 g0Var) {
        this.f39385c = g0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.7f) {
            b10 = j6.b(0.0f, -0.15f, i10);
        } else {
            b10 = j6.b(0.025f, 0.15f, i10);
        }
        if (this.m0 == b10) {
            return;
        }
        this.m0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        nh.y3 y3Var = this.f39404s;
        y3Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f39402r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.m0);
            this.f39402r.setupGradient(j6.Ki, this.e, 1.0f, false);
        }
        this.f39398n0 = true;
        y3Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i10) {
        if (this.f39412x0 == i10) {
            return;
        }
        this.f39412x0 = i10;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z4) {
        this.O = z4;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.f39415z0 = runnable;
        y0 y0Var = this.f39381a;
        if (y0Var != null) {
            y0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.L0 = callback4;
    }

    public void setOpener(y0 y0Var) {
        y0 y0Var2;
        this.f39405s0 = y0Var;
        if (!this.f39396l0 && (y0Var2 = this.f39381a) != null) {
            y0Var2.f39654f = y0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.T = activity;
    }

    public void setViewPortByMeasureSuppressed(boolean z4) {
        this.U = z4;
    }

    public void setViewPortHeightOffset(float f10) {
        this.f39410w0 = f10;
    }

    public void setWasOpenedByBot(y3 y3Var) {
        this.B0 = y3Var;
    }

    public void setWasOpenedByLinkIntent(boolean z4) {
        this.A0 = z4;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f39409w = aVar;
    }

    public void setWebViewScrollListener(b1 b1Var) {
        this.d = b1Var;
        y0 y0Var = this.f39381a;
        if (y0Var != null) {
            y0Var.f(this, b1Var);
        }
    }

    public final void t(int i10, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
        String publicUsername = UserObject.getPublicUsername(user);
        nh.y3 y3Var = this.f39404s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            y3Var.setVisibility(0);
            y3Var.setAlpha(1.0f);
            y3Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(k(j6.f19827a7))));
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
        boolean z4 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
            } else {
                z4 = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                y3Var.setVisibility(0);
                y3Var.setAlpha(1.0f);
                y3Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z4);
                return;
            }
            return;
        }
        f6 f6Var = this.e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            y3Var.setVisibility(0);
            y3Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f39402r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.m0);
                this.f39402r.setupGradient(j6.Ki, f6Var, 1.0f, false);
            }
            y3Var.f(null, null, this.f39402r);
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
        y3Var.setVisibility(0);
        y3Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.f39402r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.m0);
            this.f39402r.setupGradient(j6.Ki, f6Var, 1.0f, false);
        }
        y3Var.f(null, null, this.f39402r);
        setupFlickerParams(true);
    }

    public final void u(int i10, String str, boolean z4) {
        String str2;
        this.J = i10;
        if (this.f39396l0) {
            this.f39400p0++;
            this.f39401q0 = z4;
            if (z4) {
                str2 = l(str);
            } else {
                str2 = null;
            }
            this.C0 = str2;
            if (this.f39381a != null) {
                W();
            }
        }
        NotificationCenter.getInstance(i10).doOnIdle(new y(this, str, 1));
    }

    public final void w(j7 j7Var) {
        if (this.R != null) {
            f();
            rh.p pVar = this.f39391g0;
            if (pVar == null) {
                return;
            }
            try {
                z(j7Var, "biometry_info_received", pVar.f());
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void y(String str, JSONObject jSONObject) {
        if (this.f39396l0 && !r()) {
            h("notifyEvent " + str + " dropped for untrusted document");
            return;
        }
        h("notifyEvent " + str);
        NotificationCenter.getInstance(this.J).doOnIdle(new y(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void z(j7 j7Var, String str, JSONObject jSONObject) {
        if (!p(j7Var)) {
            h("notifyEvent " + str + " dropped after document change");
            return;
        }
        y(str, jSONObject);
    }

    public void I() {
    }

    public void L(y0 y0Var) {
    }

    public void setKeyboardFocusable(boolean z4) {
    }

    public void E(String str, boolean z4) {
    }

    public void J(boolean z4, boolean z10) {
    }
}
