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
import i7.f6;
import i7.j6;
import ih.u3;
import j$.util.Objects;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lh.y3;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cc1;
import org.telegram.ui.n9;
import ph.m3;
import ph.p2;
public abstract class z0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean I0 = true;
    public static int J0;
    public static HashMap K0;
    public int A;
    public final Rect A0;
    public String B;
    public int B0;
    public String C;
    public final u C0;
    public int D;
    public int D0;
    public int E;
    public int E0;
    public String F;
    public long F0;
    public String G;
    public final int G0;
    public String H;
    public Utilities.Callback4 H0;
    public int I;
    public boolean J;
    public boolean K;
    public long L;
    public long M;
    public boolean N;
    public boolean O;
    public boolean P;
    public TLRPC.User Q;
    public yw0 R;
    public Activity S;
    public boolean T;
    public String U;
    public org.telegram.ui.ActionBar.c2 V;
    public int W;
    public w0 f44260a;
    public long f44261a0;
    public String f44262b;
    public long f44263b0;
    public f0 f44264c;
    public n9 f44265c0;
    public y0 d;
    public boolean f44266d0;
    public final c6 f44267e;
    public String f44268e0;
    public final TextView f44269f;
    public ph.p f44270f0;
    public ph.q0 f44271g0;
    public boolean h;
    public ph.h0 f44272h0;
    public ph.i1 f44273i0;
    public ph.i1 f44274j0;
    public final boolean f44275k0;
    public int f44276l0;
    public boolean m0;
    public final org.telegram.ui.Components.voip.h f44277n;
    public BotWebViewContainer$BotWebViewProxy f44278n0;
    public BotWebViewContainer$WebViewProxy f44279o0;
    public w0 f44280p0;
    public int f44281q0;
    public SvgHelper.SvgDrawable f44282r;
    public boolean f44283r0;
    public final y3 f44284s;
    public boolean f44285s0;
    public float f44286t0;
    public int f44287u0;
    public boolean v;
    public boolean f44288v0;
    public q0.a f44289w;
    public Runnable f44290w0;
    public ValueCallback f44291x;
    public boolean f44292x0;
    public int f44293y;
    public ph.y3 f44294y0;
    public String f44295z0;

    public z0(int i10, Context context, c6 c6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f44277n = hVar;
        int i11 = g6.Oh;
        this.f44293y = j(i11);
        int i12 = g6.Sh;
        this.A = j(i12);
        this.B = "";
        this.D = j(i11);
        this.E = j(i12);
        this.F = "";
        this.G = "";
        this.I = UserConfig.selectedAccount;
        this.f44287u0 = -1;
        this.A0 = new Rect(0, 0, 0, 0);
        this.B0 = 0;
        this.C0 = new u(this, 1);
        this.D0 = -1;
        this.E0 = 0;
        int i13 = J0;
        J0 = i13 + 1;
        this.G0 = i13;
        this.f44275k0 = z10;
        this.f44267e = c6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.S = (Activity) context;
        }
        hVar.f33724k = false;
        hVar.b(i10, 153);
        y3 y3Var = new y3(this, context);
        this.f44284s = y3Var;
        int j10 = j(g6.Ki);
        this.f44276l0 = j10;
        y3Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        y3Var.getImageReceiver().setAspectFit(true);
        addView(y3Var, f6.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f44269f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(j(g6.f23433y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, f6.e(-1, -2, 17));
        setFocusable(false);
    }

    public static WebResourceResponse I(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ye.d.v(Uri.parse(str2), "https", null, N(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static String N(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e10) {
            FileLog.e(e10);
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

    public static void a(z0 z0Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            z0Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else if (z0Var.d(strArr)) {
            aVar.accept(Boolean.TRUE);
        } else {
            z0Var.R = new yw0(z0Var, aVar, strArr, 10);
            Activity activity = z0Var.S;
            if (activity != null) {
                activity.requestPermissions(strArr, 4000);
            }
        }
    }

    public static String b(String str) {
        if (str == null) {
            return str;
        }
        if (o(Uri.parse(str))) {
            String hostAuthority = AndroidUtilities.getHostAuthority(str);
            try {
                hostAuthority = IDN.toASCII(hostAuthority, 1);
            } catch (Exception unused) {
            }
            String N = N(hostAuthority);
            if (K0 == null) {
                K0 = new HashMap();
            }
            K0.put(N, hostAuthority);
            return ye.d.v(Uri.parse(str), "https", null, N, null);
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
                if (port != 0 && ((!scheme.equalsIgnoreCase("http") || port != 80) && (!scheme.equalsIgnoreCase("https") || port != 443))) {
                    sb2.append(":");
                    sb2.append(port);
                }
                return sb2.toString();
            }
        }
        return null;
    }

    public static boolean o(Uri uri) {
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

    public static String s(String str) {
        String str2;
        if (K0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority != null) {
            if (hostAuthority.endsWith("." + MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress) && (str2 = (String) K0.get(hostAuthority)) != null) {
                return ye.d.v(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    private void setupFlickerParams(boolean z10) {
        int i10;
        this.v = z10;
        y3 y3Var = this.f44284s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y3Var.getLayoutParams();
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
        y3Var.requestLayout();
    }

    private void setupWebView(w0 w0Var) {
        Q(w0Var, null);
    }

    public static void u(int i10, w0 w0Var, String str, JSONObject jSONObject) {
        if (w0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new yw0(w0Var, str, jSONObject, 9));
    }

    public static JSONObject x(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject y(String str, Object obj, String str2, Object obj2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void B(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r56, java.lang.String r57, java.lang.String r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.z0.B(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, java.lang.String, java.lang.String):void");
    }

    public final void C(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            v("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (!z10 && Objects.equals(this.U, str)) {
                this.U = null;
            }
        } catch (JSONException e10) {
            FileLog.e(e10);
        }
    }

    public final void D(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.L > 10000 && z11) {
            return;
        }
        this.L = 0L;
        boolean[] zArr = {false};
        if (ye.d.f(uri, false, zArr) && !zArr[0] && this.f44264c != null) {
            setKeyboardFocusable(false);
        }
        ye.d.r(getContext(), uri, true, z10, false, null, str, false, true, z12);
    }

    public abstract void G(w0 w0Var);

    public final void J(int i10, boolean z10) {
        JSONObject jSONObject;
        if (!z10 && i10 == this.B0) {
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
        v("content_safe_area_changed", jSONObject);
        this.B0 = i10;
    }

    public final void K(Rect rect, boolean z10) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.A0;
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
                v("safe_area_changed", jSONObject);
                rect2.set(rect);
            }
        }
    }

    public final void L() {
        try {
            String str = this.C;
            if (str != null) {
                B(this.f44278n0, "web_app_setup_main_button", str);
            }
            String str2 = this.H;
            if (str2 != null) {
                B(this.f44278n0, "web_app_setup_secondary_button", str2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void M(ph.i1 i1Var, String str) {
        c6 c6Var;
        boolean z10;
        if (i1Var != null && this.Q != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        v("secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        ArrayList h = i1Var.h(optString);
                        if (h.isEmpty()) {
                            v("secure_storage_failed", y("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        eg.d1 d1Var = new eg.d1((Object) this, string, (Object) i1Var, (Object) optString, 15);
                        o2 U = LaunchActivity.U();
                        if (U != null) {
                            c6Var = U.getResourceProvider();
                        } else {
                            c6Var = null;
                        }
                        int i10 = 1;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        f3 q6 = x3.q(context, c6Var, false, false);
                        ViewGroup g10 = x3.g(context, 1);
                        t9 t9Var = new t9(context);
                        ArrayList arrayList = h;
                        TLRPC.User user = MessagesController.getInstance(i1Var.f45834a).getUser(Long.valueOf(i1Var.f45835b));
                        e9 e9Var = new e9((c6) null);
                        e9Var.r(user);
                        t9Var.e(user, e9Var);
                        g10.addView(t9Var, f6.t(80, 80, 49, 0, 21, 0, 13));
                        int i11 = g6.G6;
                        TextView b10 = j6.b(context, 20.0f, i11, true, null);
                        org.telegram.ui.b.i(R.string.BotRestoreStorageTitle, b10, 17);
                        g10.addView(b10, f6.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = j6.b(context, 14.0f, i11, false, null);
                        b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        b11.setGravity(17);
                        g10.addView(b11, f6.t(-1, -2, 7, 32, 0, 32, 19));
                        y8 y8Var = new y8(context, c6Var);
                        y8Var.setBackground(new jq(new ColorDrawable(g6.v0(g6.f23009a7, c6Var)), g6.U0(context, R.drawable.greydivider, g6.v0(g6.f23028b7, c6Var))));
                        y8Var.setFixedSize(12);
                        g10.addView(y8Var, f6.t(-1, 12, 7, 0, 0, 0, 0));
                        k4 k4Var = new k4(context, c6Var);
                        k4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        g10.addView(k4Var, f6.t(-1, -2, 7, 0, 0, 0, 0));
                        nh.d dVar = new nh.d(context, c6Var, true);
                        ArrayList arrayList2 = new ArrayList();
                        int i12 = 0;
                        while (i12 < arrayList.size()) {
                            ArrayList arrayList3 = arrayList;
                            ph.h1 h1Var = (ph.h1) arrayList3.get(i12);
                            if (i12 < arrayList3.size() - i10) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ph.g1 g1Var = new ph.g1(h1Var, z10, context);
                            g1Var.setBackground(g6.f0(g6.v0(g6.f23152i6, c6Var), 2, -1));
                            ViewGroup viewGroup = g10;
                            g1Var.setOnClickListener(new u3(strArr, h1Var, arrayList2, dVar, 15));
                            viewGroup.addView(g1Var, f6.n(-1, 56));
                            arrayList2.add(g1Var);
                            i12++;
                            arrayList = arrayList3;
                            q6 = q6;
                            g10 = viewGroup;
                            d1Var = d1Var;
                            i10 = 1;
                        }
                        eg.d1 d1Var2 = d1Var;
                        f3 f3Var = q6;
                        ViewGroup viewGroup2 = g10;
                        boolean z11 = false;
                        dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                        if (strArr[0] != null) {
                            z11 = true;
                        }
                        dVar.setEnabled(z11);
                        viewGroup2.addView(dVar, f6.t(-1, 48, 7, 8, 8, 8, 4));
                        f3Var.customView = viewGroup2;
                        f3Var.fixNavigationBar(g6.v0(g6.f23133h5, c6Var));
                        dVar.setOnClickListener(new u3(zArr, d1Var2, strArr, f3Var, 16));
                        f3Var.setOnDismissListener(new eg.g(16, zArr, d1Var2));
                        f3Var.show();
                    } catch (Exception e10) {
                        v("secure_storage_failed", y("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused) {
                    v("secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                FileLog.e(e11);
                if (!TextUtils.isEmpty("")) {
                    v("secure_storage_failed", y("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void O(String str, boolean z10) {
        boolean z11;
        boolean z12;
        w0 w0Var = this.f44260a;
        if (w0Var != null) {
            boolean z13 = w0Var.A;
        }
        if (w0Var != null && w0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        w0 w0Var2 = this.f44260a;
        if (w0Var2 != null && w0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        F(z11, z12);
        w0 w0Var3 = this.f44260a;
        if (w0Var3 != null) {
            w0Var3.f44226b = true;
        }
        if (this.J) {
            g("setPageLoaded: already loaded");
            return;
        }
        y3 y3Var = this.f44284s;
        if (z10 && w0Var3 != null && y3Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f44260a, property, 1.0f), ObjectAnimator.ofFloat(y3Var, property, 0.0f));
            animatorSet.addListener(new cc1(this, 6));
            animatorSet.start();
        } else {
            if (w0Var3 != null) {
                w0Var3.setAlpha(1.0f);
            }
            if (y3Var != null) {
                y3Var.setAlpha(0.0f);
                y3Var.setVisibility(8);
            }
        }
        this.f44262b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.J = true;
        this.f44264c.getClass();
    }

    public final void P(ph.i1 i1Var, String str, String str2, String str3) {
        if (i1Var != null && this.Q != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("req_id");
                try {
                    String optString = jSONObject.optString("key");
                    if (optString == null) {
                        v(str3, y("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        try {
                            i1Var.n(optString, jSONObject.optString("value"));
                            v(str2, x(string, "req_id"));
                        } catch (RuntimeException e10) {
                            v(str3, y("req_id", string, "error", e10.getMessage()));
                        }
                    } catch (Exception unused) {
                        v(str3, y("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    v(str3, y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                FileLog.e(e11);
                if (!TextUtils.isEmpty("")) {
                    v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void Q(w0 w0Var, Object obj) {
        w0 w0Var2;
        String str;
        TLRPC.User user;
        boolean z10;
        String str2 = "";
        w0 w0Var3 = this.f44260a;
        if (w0Var3 != null) {
            w0Var3.destroy();
            removeView(this.f44260a);
        }
        if (w0Var != null) {
            AndroidUtilities.removeFromParent(w0Var);
        }
        try {
            if (SharedConfig.debugWebView && !p()) {
                z10 = true;
            } else {
                z10 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z10);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (w0Var == null) {
            Context context = getContext();
            boolean z11 = this.f44275k0;
            long j10 = 0;
            if (z11 && (user = this.Q) != null) {
                j10 = user.f22539id;
            }
            w0Var2 = new w0(context, z11, j10);
        } else {
            w0Var2 = w0Var;
        }
        this.f44260a = w0Var2;
        if (!this.f44275k0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f44260a, true);
            CookieManager.getInstance().flush();
            this.f44260a.f44229f = this.f44280p0;
        } else {
            w0Var2.setBackgroundColor(j(g6.f23062d6));
        }
        if (!MessagesController.getInstance(this.I).disableBotFullscreenBlur) {
            this.f44260a.setLayerType(2, null);
        }
        this.f44260a.f(this, this.d);
        this.f44260a.setCloseListener(this.f44290w0);
        WebSettings settings = this.f44260a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f44275k0) {
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
        if (p()) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        try {
            String replace = settings.getUserAgentString().replace("; wv)", ")");
            StringBuilder sb2 = new StringBuilder("(Linux; Android ");
            String str3 = Build.VERSION.RELEASE;
            sb2.append(str3);
            sb2.append("; K)");
            String replaceAll = replace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb2.toString()).replaceAll("Version/[\\d\\.]+ ", "");
            if (this.f44275k0) {
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
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.f44260a.setVerticalScrollBarEnabled(false);
        if (w0Var == null && this.f44275k0) {
            this.f44260a.setAlpha(0.0f);
        }
        addView(this.f44260a);
        if (this.f44275k0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f44278n0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f44278n0;
            if (botWebViewContainer$BotWebViewProxy == null) {
                ?? obj2 = new Object();
                obj2.f43963a = this;
                this.f44278n0 = obj2;
                this.f44260a.addJavascriptInterface(obj2, "TelegramWebviewProxy");
            } else if (w0Var == null) {
                this.f44260a.addJavascriptInterface(botWebViewContainer$BotWebViewProxy, "TelegramWebviewProxy");
            }
            this.f44278n0.f43963a = this;
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f44279o0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f44279o0;
            if (botWebViewContainer$WebViewProxy == null) {
                w0 w0Var4 = this.f44260a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(w0Var4, this);
                this.f44279o0 = botWebViewContainer$WebViewProxy2;
                w0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (w0Var == null) {
                this.f44260a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f44279o0.f43964a = this;
        }
        G(this.f44260a);
        I0 = false;
    }

    public final void R(int i10, org.telegram.ui.ActionBar.c2 c2Var, Runnable runnable) {
        if (c2Var != null && !m(i10)) {
            c2Var.setOnDismissListener(new eg.g(13, this, runnable));
            this.V = c2Var;
            c2Var.f22784d0 = false;
            c2Var.show();
            if (this.D0 != i10) {
                this.D0 = i10;
                this.E0 = 0;
                this.F0 = 0L;
            }
            this.E0++;
        }
    }

    public final void S(String str) {
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
        if (this.f44260a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.f44284s.setVisibility(8);
                this.h = true;
                this.f44269f.setVisibility(0);
                w0 w0Var = this.f44260a;
                if (w0Var != null) {
                    removeView(w0Var);
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
        yw0 yw0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            w0 w0Var = this.f44260a;
            if (w0Var != null) {
                w0Var.setBackgroundColor(j(g6.f23062d6));
            }
            if (!this.m0) {
                int i12 = g6.Ki;
                int j10 = j(i12);
                this.f44276l0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                y3 y3Var = this.f44284s;
                y3Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f44282r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.f44276l0);
                    this.f44282r.setupGradient(i12, this.f44267e, 1.0f, false);
                }
                y3Var.invalidate();
            }
            w();
        } else if (i10 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f44291x != null) {
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
                    this.f44291x.onReceiveValue(uriArr);
                    this.f44291x = null;
                }
                uriArr = null;
                this.f44291x.onReceiveValue(uriArr);
                this.f44291x = null;
            }
        } else if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (yw0Var = this.R) != null) {
                yw0Var.run();
                this.R = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f44284s) {
            if (this.v) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (this.v) {
                canvas.restore();
            }
            if (!this.v) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.f44277n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f44269f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f44260a) {
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

    public final void e(ph.i1 i1Var, String str, String str2, String str3) {
        if (i1Var != null && this.Q != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    i1Var.m(new JSONObject());
                    v(str2, x(string, "req_id"));
                } catch (RuntimeException e10) {
                    v(str3, y("req_id", string, "error", e10.getMessage()));
                }
            } catch (Exception e11) {
                FileLog.e(e11);
                if (!TextUtils.isEmpty("")) {
                    v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void f() {
        if (this.Q == null) {
            return;
        }
        ph.p pVar = this.f44270f0;
        if (pVar == null) {
            this.f44270f0 = ph.p.c(getContext(), this.I, this.Q.f22539id);
        } else {
            pVar.h();
        }
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.G0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f44278n0;
    }

    public int getMinHeight() {
        if (getParent() instanceof m3) {
            m3 m3Var = (m3) getParent();
            if (m3Var.F) {
                return (int) ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) + this.f44286t0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        w0 w0Var = this.f44260a;
        if (w0Var == null) {
            return null;
        }
        return k(w0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f44279o0;
    }

    public String getUrlLoaded() {
        return this.f44262b;
    }

    public w0 getWebView() {
        return this.f44260a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.f44288v0);
        w0 w0Var = this.f44260a;
        if (w0Var != null) {
            if (w0Var.getParent() != null) {
                removeView(this.f44260a);
            }
            if (!this.f44288v0) {
                this.f44260a.destroy();
                H(this.f44260a);
            }
            this.J = false;
            if (this.f44270f0 != null) {
                this.f44270f0 = null;
            }
            if (this.f44273i0 != null) {
                this.f44273i0 = null;
            }
            if (this.f44274j0 != null) {
                this.f44274j0 = null;
            }
            ph.q0 q0Var = this.f44271g0;
            if (q0Var != null) {
                q0Var.f46001f.remove(this.C0);
                this.f44271g0 = null;
            }
        }
    }

    public final void i(String str) {
        new tc(this, this.f44267e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i10) {
        c6 c6Var = this.f44267e;
        if (c6Var != null) {
            return c6Var.C0(i10);
        }
        return g6.w0(null, i10, false);
    }

    public final void l(ph.i1 i1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (i1Var != null && this.Q != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String string = jSONObject2.getString("req_id");
                try {
                    String optString = jSONObject2.optString("key");
                    if (optString == null) {
                        v(str3, y("req_id", string, "error", "KEY_INVALID"));
                        return;
                    }
                    try {
                        Pair f9 = i1Var.f(optString);
                        if (i1Var.d && (obj = f9.first) == null) {
                            Object obj2 = f9.second;
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("req_id", string);
                                jSONObject.put("value", obj);
                                jSONObject.put("can_restore", obj2);
                            } catch (Exception unused) {
                                jSONObject = null;
                            }
                            v(str2, jSONObject);
                        } else {
                            v(str2, y("req_id", string, "value", f9.first));
                        }
                    } catch (RuntimeException e10) {
                        v(str3, y("req_id", string, "error", e10.getMessage()));
                    }
                } catch (Exception unused2) {
                    v(str3, y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e11) {
                FileLog.e(e11);
                if (!TextUtils.isEmpty("")) {
                    v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean m(int i10) {
        if (this.V != null || (this.F0 > 0 && System.currentTimeMillis() < this.F0)) {
            return true;
        }
        if (this.D0 != i10 || this.E0 <= 3) {
            return false;
        }
        this.F0 = System.currentTimeMillis() + 3000;
        this.E0 = 0;
        return true;
    }

    public final void n(boolean z10, boolean z11) {
        boolean z12;
        invalidate();
        if ((this.J || z11) && this.f44275k0 && (getParent() instanceof m3)) {
            m3 m3Var = (m3) getParent();
            if (z10) {
                if (m3Var.getSwipeOffsetY() == m3Var.getTopActionBarOffsetY() + (-m3Var.getOffsetY())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.K = z12;
            }
            int max = Math.max(getMinHeight(), (int) (m3Var.getTopActionBarOffsetY() + ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) - m3Var.getSwipeOffsetY()) + this.f44286t0));
            if (z11 || max != this.f44281q0 || this.f44283r0 != z10 || this.f44285s0 != this.K) {
                this.f44281q0 = max;
                this.f44283r0 = z10;
                this.f44285s0 = this.K;
                NotificationCenter.getInstance(this.I).doOnIdle(new q(this, a4.w.n("window.Telegram.WebView.receiveEvent('viewport_changed', ", "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.K + "}", ");"), 0));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        mc.a(this, new ih.u0(this, 11));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        mc.h(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f44287u0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
        this.f44277n.f33720f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.T) {
            n(true, false);
        }
    }

    public final boolean p() {
        if (this.H0 != null) {
            return true;
        }
        return false;
    }

    public final void q(int i10, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
        String publicUsername = UserObject.getPublicUsername(user);
        y3 y3Var = this.f44284s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            y3Var.setVisibility(0);
            y3Var.setAlpha(1.0f);
            y3Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(g6.f23009a7))));
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
                y3Var.setVisibility(0);
                y3Var.setAlpha(1.0f);
                y3Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        c6 c6Var = this.f44267e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            y3Var.setVisibility(0);
            y3Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f44282r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.f44276l0);
                this.f44282r.setupGradient(g6.Ki, c6Var, 1.0f, false);
            }
            y3Var.f(null, null, this.f44282r);
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
        this.f44282r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.f44276l0);
            this.f44282r.setupGradient(g6.Ki, c6Var, 1.0f, false);
        }
        y3Var.f(null, null, this.f44282r);
        setupFlickerParams(true);
    }

    public final void r(int i10, String str) {
        this.I = i10;
        NotificationCenter.getInstance(i10).doOnIdle(new q(this, str, 1));
    }

    public void setBotUser(TLRPC.User user) {
        this.Q = user;
    }

    public void setDelegate(f0 f0Var) {
        this.f44264c = f0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.7f) {
            b10 = g6.b(0.0f, -0.15f, i10);
        } else {
            b10 = g6.b(0.025f, 0.15f, i10);
        }
        if (this.f44276l0 == b10) {
            return;
        }
        this.f44276l0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        y3 y3Var = this.f44284s;
        y3Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f44282r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.f44276l0);
            this.f44282r.setupGradient(g6.Ki, this.f44267e, 1.0f, false);
        }
        this.m0 = true;
        y3Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i10) {
        if (this.f44287u0 == i10) {
            return;
        }
        this.f44287u0 = i10;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z10) {
        this.N = z10;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.f44290w0 = runnable;
        w0 w0Var = this.f44260a;
        if (w0Var != null) {
            w0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.H0 = callback4;
    }

    public void setOpener(w0 w0Var) {
        w0 w0Var2;
        this.f44280p0 = w0Var;
        if (!this.f44275k0 && (w0Var2 = this.f44260a) != null) {
            w0Var2.f44229f = w0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.S = activity;
    }

    public void setTrustedOrigin(String str) {
        this.f44295z0 = k(str);
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.T = z10;
    }

    public void setViewPortHeightOffset(float f9) {
        this.f44286t0 = f9;
    }

    public void setWasOpenedByBot(ph.y3 y3Var) {
        this.f44294y0 = y3Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.f44292x0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f44289w = aVar;
    }

    public void setWebViewScrollListener(y0 y0Var) {
        this.d = y0Var;
        w0 w0Var = this.f44260a;
        if (w0Var != null) {
            w0Var.f(this, y0Var);
        }
    }

    public final void t() {
        if (this.Q != null) {
            f();
            ph.p pVar = this.f44270f0;
            if (pVar == null) {
                return;
            }
            try {
                v("biometry_info_received", pVar.f());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void v(String str, JSONObject jSONObject) {
        g("notifyEvent " + str);
        NotificationCenter.getInstance(this.I).doOnIdle(new q(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void w() {
        JSONObject jSONObject;
        JSONObject p10;
        try {
            p10 = p2.p(this.f44267e, true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (p10 != null) {
            jSONObject = new JSONObject().put("theme_params", p10);
            v("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        v("theme_changed", jSONObject);
    }

    public final boolean z() {
        if (this.f44260a != null && this.N) {
            v("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public void E() {
    }

    public void H(w0 w0Var) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void A(String str, boolean z10) {
    }

    public void F(boolean z10, boolean z11) {
    }
}
