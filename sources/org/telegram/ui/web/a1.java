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
import java.util.HashMap;
import java.util.Map;
import k7.c6;
import lh.u3;
import oh.a4;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ns0;
import org.telegram.ui.r9;
import sh.m3;
import sh.y3;
public abstract class a1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean J0 = true;
    public static int K0;
    public static HashMap L0;
    public String A0;
    public int B;
    public final Rect B0;
    public String C;
    public int C0;
    public String D;
    public final u D0;
    public int E;
    public int E0;
    public int F;
    public int F0;
    public String G;
    public long G0;
    public String H;
    public final int H0;
    public String I;
    public Utilities.Callback4 I0;
    public int J;
    public boolean K;
    public boolean L;
    public long M;
    public long N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public TLRPC.User R;
    public o71 S;
    public Activity T;
    public boolean U;
    public String V;
    public org.telegram.ui.ActionBar.d2 W;
    public x0 f42465a;
    public int f42466a0;
    public String f42467b;
    public long f42468b0;
    public f0 f42469c;
    public long f42470c0;
    public z0 d;
    public r9 f42471d0;
    public final g6 f42472e;
    public boolean f42473e0;
    public final TextView f42474f;
    public String f42475f0;
    public sh.p f42476g0;
    public boolean h;
    public sh.q0 f42477h0;
    public sh.h0 f42478i0;
    public sh.i1 f42479j0;
    public sh.i1 f42480k0;
    public final boolean f42481l0;
    public int m0;
    public final org.telegram.ui.Components.voip.h f42482n;
    public boolean f42483n0;
    public BotWebViewContainer$BotWebViewProxy f42484o0;
    public BotWebViewContainer$WebViewProxy f42485p0;
    public x0 f42486q0;
    public SvgHelper.SvgDrawable f42487r;
    public int f42488r0;
    public final a4 f42489s;
    public boolean f42490s0;
    public boolean f42491t0;
    public float f42492u0;
    public boolean v;
    public int f42493v0;
    public q0.a f42494w;
    public boolean f42495w0;
    public ValueCallback f42496x;
    public Runnable f42497x0;
    public int f42498y;
    public boolean f42499y0;
    public y3 f42500z0;

    public a1(int i10, Context context, g6 g6Var, boolean z4) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f42482n = hVar;
        int i11 = k6.Oh;
        this.f42498y = j(i11);
        int i12 = k6.Sh;
        this.B = j(i12);
        this.C = "";
        this.E = j(i11);
        this.F = j(i12);
        this.G = "";
        this.H = "";
        this.J = UserConfig.selectedAccount;
        this.f42493v0 = -1;
        this.B0 = new Rect(0, 0, 0, 0);
        this.C0 = 0;
        this.D0 = new u(this, 1);
        this.E0 = -1;
        this.F0 = 0;
        int i13 = K0;
        K0 = i13 + 1;
        this.H0 = i13;
        this.f42481l0 = z4;
        this.f42472e = g6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.T = (Activity) context;
        }
        hVar.f32059k = false;
        hVar.b(i10, 153);
        a4 a4Var = new a4(this, context);
        this.f42489s = a4Var;
        int j10 = j(k6.Ki);
        this.m0 = j10;
        a4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        a4Var.getImageReceiver().setAspectFit(true);
        addView(a4Var, c6.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f42474f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(j(k6.f22036y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, c6.e(-1, -2, 17));
        setFocusable(false);
    }

    public static WebResourceResponse I(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(af.g.v(Uri.parse(str2), "https", null, N(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public static String N(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e6) {
            FileLog.e(e6);
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

    public static void a(a1 a1Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            a1Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else if (a1Var.d(strArr)) {
            aVar.accept(Boolean.TRUE);
        } else {
            a1Var.S = new o71(a1Var, aVar, strArr, 3);
            Activity activity = a1Var.T;
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
            if (L0 == null) {
                L0 = new HashMap();
            }
            L0.put(N, hostAuthority);
            return af.g.v(Uri.parse(str), "https", null, N, null);
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
                StringBuilder sb = new StringBuilder();
                sb.append(scheme);
                sb.append("://");
                sb.append(host);
                if (port != 0 && ((!scheme.equalsIgnoreCase("http") || port != 80) && (!scheme.equalsIgnoreCase("https") || port != 443))) {
                    sb.append(":");
                    sb.append(port);
                }
                return sb.toString();
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
        if (L0 == null || str == null) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        if (hostAuthority != null) {
            if (hostAuthority.endsWith("." + MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress) && (str2 = (String) L0.get(hostAuthority)) != null) {
                return af.g.v(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    private void setupFlickerParams(boolean z4) {
        int i10;
        this.v = z4;
        a4 a4Var = this.f42489s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a4Var.getLayoutParams();
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
        a4Var.requestLayout();
    }

    private void setupWebView(x0 x0Var) {
        Q(x0Var, null);
    }

    public static void u(int i10, x0 x0Var, String str, JSONObject jSONObject) {
        if (x0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new o71(x0Var, str, jSONObject, 2));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.a1.B(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, java.lang.String, java.lang.String):void");
    }

    public final void C(String str, String str2, boolean z4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            v("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (!z4 && Objects.equals(this.V, str)) {
                this.V = null;
            }
        } catch (JSONException e6) {
            FileLog.e(e6);
        }
    }

    public final void D(Uri uri, String str, boolean z4, boolean z10, boolean z11) {
        if (System.currentTimeMillis() - this.M > 10000 && z10) {
            return;
        }
        this.M = 0L;
        boolean[] zArr = {false};
        if (af.g.f(uri, false, zArr) && !zArr[0] && this.f42469c != null) {
            setKeyboardFocusable(false);
        }
        af.g.r(getContext(), uri, true, z4, false, null, str, false, true, z11);
    }

    public abstract void G(x0 x0Var);

    public final void J(int i10, boolean z4) {
        JSONObject jSONObject;
        if (!z4 && i10 == this.C0) {
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
        this.C0 = i10;
    }

    public final void K(Rect rect, boolean z4) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.B0;
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
                v("safe_area_changed", jSONObject);
                rect2.set(rect);
            }
        }
    }

    public final void L() {
        try {
            String str = this.D;
            if (str != null) {
                B(this.f42484o0, "web_app_setup_main_button", str);
            }
            String str2 = this.I;
            if (str2 != null) {
                B(this.f42484o0, "web_app_setup_secondary_button", str2);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void M(sh.i1 i1Var, String str) {
        g6 g6Var;
        boolean z4;
        if (i1Var != null && this.R != null) {
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
                        hg.c1 c1Var = new hg.c1(15, this, i1Var, optString, string);
                        p2 U = LaunchActivity.U();
                        if (U != null) {
                            g6Var = U.getResourceProvider();
                        } else {
                            g6Var = null;
                        }
                        int i10 = 1;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
                        ViewGroup f10 = org.telegram.messenger.y3.f(context, 1);
                        p9 p9Var = new p9(context);
                        ArrayList arrayList = h;
                        TLRPC.User user = MessagesController.getInstance(i1Var.f47459a).getUser(Long.valueOf(i1Var.f47460b));
                        z8 z8Var = new z8((g6) null);
                        z8Var.r(user);
                        p9Var.e(user, z8Var);
                        f10.addView(p9Var, c6.t(80, 80, 49, 0, 21, 0, 13));
                        int i11 = k6.G6;
                        TextView b10 = k7.g6.b(context, 20.0f, i11, true, null);
                        org.telegram.messenger.y3.r(R.string.BotRestoreStorageTitle, b10, 17);
                        f10.addView(b10, c6.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = k7.g6.b(context, 14.0f, i11, false, null);
                        b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        b11.setGravity(17);
                        f10.addView(b11, c6.t(-1, -2, 7, 32, 0, 32, 19));
                        a9 a9Var = new a9(context, g6Var);
                        a9Var.setBackground(new pq(new ColorDrawable(k6.v0(k6.f21605a7, g6Var)), k6.U0(context, R.drawable.greydivider, k6.v0(k6.f21624b7, g6Var))));
                        a9Var.setFixedSize(12);
                        f10.addView(a9Var, c6.t(-1, 12, 7, 0, 0, 0, 0));
                        m4 m4Var = new m4(context, g6Var);
                        m4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        f10.addView(m4Var, c6.t(-1, -2, 7, 0, 0, 0, 0));
                        qh.d dVar = new qh.d(context, g6Var, true);
                        ArrayList arrayList2 = new ArrayList();
                        int i12 = 0;
                        while (i12 < arrayList.size()) {
                            ArrayList arrayList3 = arrayList;
                            sh.h1 h1Var = (sh.h1) arrayList3.get(i12);
                            if (i12 < arrayList3.size() - i10) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            sh.g1 g1Var = new sh.g1(h1Var, z4, context);
                            g1Var.setBackground(k6.f0(k6.v0(k6.f21750i6, g6Var), 2, -1));
                            ViewGroup viewGroup = f10;
                            g1Var.setOnClickListener(new u3(strArr, h1Var, arrayList2, dVar, 15));
                            viewGroup.addView(g1Var, c6.n(-1, 56));
                            arrayList2.add(g1Var);
                            i12++;
                            arrayList = arrayList3;
                            o10 = o10;
                            f10 = viewGroup;
                            c1Var = c1Var;
                            i10 = 1;
                        }
                        hg.c1 c1Var2 = c1Var;
                        h3 h3Var = o10;
                        ViewGroup viewGroup2 = f10;
                        boolean z10 = false;
                        dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                        if (strArr[0] != null) {
                            z10 = true;
                        }
                        dVar.setEnabled(z10);
                        viewGroup2.addView(dVar, c6.t(-1, 48, 7, 8, 8, 8, 4));
                        h3Var.customView = viewGroup2;
                        h3Var.fixNavigationBar(k6.v0(k6.f21731h5, g6Var));
                        dVar.setOnClickListener(new u3(zArr, c1Var2, strArr, h3Var, 16));
                        h3Var.setOnDismissListener(new hg.g(16, zArr, c1Var2));
                        h3Var.show();
                    } catch (Exception e6) {
                        v("secure_storage_failed", y("req_id", string, "error", e6.getMessage()));
                    }
                } catch (Exception unused) {
                    v("secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    v("secure_storage_failed", y("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public void O(String str, boolean z4) {
        boolean z10;
        boolean z11;
        x0 x0Var = this.f42465a;
        if (x0Var != null) {
            boolean z12 = x0Var.B;
        }
        if (x0Var != null && x0Var.canGoBack()) {
            z10 = false;
        } else {
            z10 = true;
        }
        x0 x0Var2 = this.f42465a;
        if (x0Var2 != null && x0Var2.canGoForward()) {
            z11 = false;
        } else {
            z11 = true;
        }
        F(z10, z11);
        x0 x0Var3 = this.f42465a;
        if (x0Var3 != null) {
            x0Var3.f42758b = true;
        }
        if (this.K) {
            g("setPageLoaded: already loaded");
            return;
        }
        a4 a4Var = this.f42489s;
        if (z4 && x0Var3 != null && a4Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f42465a, property, 1.0f), ObjectAnimator.ofFloat(a4Var, property, 0.0f));
            animatorSet.addListener(new ns0(this, 27));
            animatorSet.start();
        } else {
            if (x0Var3 != null) {
                x0Var3.setAlpha(1.0f);
            }
            if (a4Var != null) {
                a4Var.setAlpha(0.0f);
                a4Var.setVisibility(8);
            }
        }
        this.f42467b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.K = true;
        this.f42469c.getClass();
    }

    public final void P(sh.i1 i1Var, String str, String str2, String str3) {
        if (i1Var != null && this.R != null) {
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
                        } catch (RuntimeException e6) {
                            v(str3, y("req_id", string, "error", e6.getMessage()));
                        }
                    } catch (Exception unused) {
                        v(str3, y("req_id", string, "error", "VALUE_INVALID"));
                    }
                } catch (Exception unused2) {
                    v(str3, y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void Q(x0 x0Var, Object obj) {
        x0 x0Var2;
        String str;
        TLRPC.User user;
        boolean z4;
        String str2 = "";
        x0 x0Var3 = this.f42465a;
        if (x0Var3 != null) {
            x0Var3.destroy();
            removeView(this.f42465a);
        }
        if (x0Var != null) {
            AndroidUtilities.removeFromParent(x0Var);
        }
        try {
            if (SharedConfig.debugWebView && !p()) {
                z4 = true;
            } else {
                z4 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z4);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (x0Var == null) {
            Context context = getContext();
            boolean z10 = this.f42481l0;
            long j10 = 0;
            if (z10 && (user = this.R) != null) {
                j10 = user.f20990id;
            }
            x0Var2 = new x0(context, z10, j10);
        } else {
            x0Var2 = x0Var;
        }
        this.f42465a = x0Var2;
        if (!this.f42481l0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f42465a, true);
            CookieManager.getInstance().flush();
            this.f42465a.f42761f = this.f42486q0;
        } else {
            x0Var2.setBackgroundColor(j(k6.f21659d6));
        }
        if (!MessagesController.getInstance(this.J).disableBotFullscreenBlur) {
            this.f42465a.setLayerType(2, null);
        }
        this.f42465a.f(this, this.d);
        this.f42465a.setCloseListener(this.f42497x0);
        WebSettings settings = this.f42465a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f42481l0) {
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
            StringBuilder sb = new StringBuilder("(Linux; Android ");
            String str3 = Build.VERSION.RELEASE;
            sb.append(str3);
            sb.append("; K)");
            String replaceAll = replace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb.toString()).replaceAll("Version/[\\d\\.]+ ", "");
            if (this.f42481l0) {
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.f42465a.setVerticalScrollBarEnabled(false);
        if (x0Var == null && this.f42481l0) {
            this.f42465a.setAlpha(0.0f);
        }
        addView(this.f42465a);
        if (this.f42481l0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f42484o0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f42484o0;
            if (botWebViewContainer$BotWebViewProxy == null) {
                ?? obj2 = new Object();
                obj2.f42455a = this;
                this.f42484o0 = obj2;
                this.f42465a.addJavascriptInterface(obj2, "TelegramWebviewProxy");
            } else if (x0Var == null) {
                this.f42465a.addJavascriptInterface(botWebViewContainer$BotWebViewProxy, "TelegramWebviewProxy");
            }
            this.f42484o0.f42455a = this;
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f42485p0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f42485p0;
            if (botWebViewContainer$WebViewProxy == null) {
                x0 x0Var4 = this.f42465a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(x0Var4, this);
                this.f42485p0 = botWebViewContainer$WebViewProxy2;
                x0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (x0Var == null) {
                this.f42465a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f42485p0.f42456a = this;
        }
        G(this.f42465a);
        J0 = false;
    }

    public final void R(int i10, org.telegram.ui.ActionBar.d2 d2Var, Runnable runnable) {
        if (d2Var != null && !m(i10)) {
            d2Var.setOnDismissListener(new hg.g(13, this, runnable));
            this.W = d2Var;
            d2Var.f21243e0 = false;
            d2Var.show();
            if (this.E0 != i10) {
                this.E0 = i10;
                this.F0 = 0;
                this.G0 = 0L;
            }
            this.F0++;
        }
    }

    public final void S(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        if (str != null) {
            str2 = ": ".concat(str);
        } else {
            str2 = "";
        }
        sb.append(str2);
        i(sb.toString());
    }

    public final void c() {
        if (this.f42465a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.f42489s.setVisibility(8);
                this.h = true;
                this.f42474f.setVisibility(0);
                x0 x0Var = this.f42465a;
                if (x0Var != null) {
                    removeView(x0Var);
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
        o71 o71Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            x0 x0Var = this.f42465a;
            if (x0Var != null) {
                x0Var.setBackgroundColor(j(k6.f21659d6));
            }
            if (!this.f42483n0) {
                int i12 = k6.Ki;
                int j10 = j(i12);
                this.m0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                a4 a4Var = this.f42489s;
                a4Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f42487r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.m0);
                    this.f42487r.setupGradient(i12, this.f42472e, 1.0f, false);
                }
                a4Var.invalidate();
            }
            w();
        } else if (i10 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f42496x != null) {
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
                    this.f42496x.onReceiveValue(uriArr);
                    this.f42496x = null;
                }
                uriArr = null;
                this.f42496x.onReceiveValue(uriArr);
                this.f42496x = null;
            }
        } else if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (o71Var = this.S) != null) {
                o71Var.run();
                this.S = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f42489s) {
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
                this.f42482n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f42474f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f42465a) {
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

    public final void e(sh.i1 i1Var, String str, String str2, String str3) {
        if (i1Var != null && this.R != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    i1Var.m(new JSONObject());
                    v(str2, x(string, "req_id"));
                } catch (RuntimeException e6) {
                    v(str3, y("req_id", string, "error", e6.getMessage()));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final void f() {
        if (this.R == null) {
            return;
        }
        sh.p pVar = this.f42476g0;
        if (pVar == null) {
            this.f42476g0 = sh.p.c(getContext(), this.J, this.R.f20990id);
        } else {
            pVar.h();
        }
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.H0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f42484o0;
    }

    public int getMinHeight() {
        if (getParent() instanceof m3) {
            m3 m3Var = (m3) getParent();
            if (m3Var.G) {
                return (int) ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) + this.f42492u0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        x0 x0Var = this.f42465a;
        if (x0Var == null) {
            return null;
        }
        return k(x0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f42485p0;
    }

    public String getUrlLoaded() {
        return this.f42467b;
    }

    public x0 getWebView() {
        return this.f42465a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.f42495w0);
        x0 x0Var = this.f42465a;
        if (x0Var != null) {
            if (x0Var.getParent() != null) {
                removeView(this.f42465a);
            }
            if (!this.f42495w0) {
                this.f42465a.destroy();
                H(this.f42465a);
            }
            this.K = false;
            if (this.f42476g0 != null) {
                this.f42476g0 = null;
            }
            if (this.f42479j0 != null) {
                this.f42479j0 = null;
            }
            if (this.f42480k0 != null) {
                this.f42480k0 = null;
            }
            sh.q0 q0Var = this.f42477h0;
            if (q0Var != null) {
                q0Var.f47626f.remove(this.D0);
                this.f42477h0 = null;
            }
        }
    }

    public final void i(String str) {
        new qc(this, this.f42472e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i10) {
        g6 g6Var = this.f42472e;
        if (g6Var != null) {
            return g6Var.B0(i10);
        }
        return k6.w0(null, i10, false);
    }

    public final void l(sh.i1 i1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (i1Var != null && this.R != null) {
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
                            v(str2, jSONObject);
                        } else {
                            v(str2, y("req_id", string, "value", f10.first));
                        }
                    } catch (RuntimeException e6) {
                        v(str3, y("req_id", string, "error", e6.getMessage()));
                    }
                } catch (Exception unused2) {
                    v(str3, y("req_id", string, "error", "KEY_INVALID"));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                if (!TextUtils.isEmpty("")) {
                    v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
                }
            }
        }
    }

    public final boolean m(int i10) {
        if (this.W != null || (this.G0 > 0 && System.currentTimeMillis() < this.G0)) {
            return true;
        }
        if (this.E0 != i10 || this.F0 <= 3) {
            return false;
        }
        this.G0 = System.currentTimeMillis() + 3000;
        this.F0 = 0;
        return true;
    }

    public final void n(boolean z4, boolean z10) {
        boolean z11;
        invalidate();
        if ((this.K || z10) && this.f42481l0 && (getParent() instanceof m3)) {
            m3 m3Var = (m3) getParent();
            if (z4) {
                if (m3Var.getSwipeOffsetY() == m3Var.getTopActionBarOffsetY() + (-m3Var.getOffsetY())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.L = z11;
            }
            int max = Math.max(getMinHeight(), (int) (m3Var.getTopActionBarOffsetY() + ((m3Var.getMeasuredHeight() - m3Var.getOffsetY()) - m3Var.getSwipeOffsetY()) + this.f42492u0));
            if (z10 || max != this.f42488r0 || this.f42490s0 != z4 || this.f42491t0 != this.L) {
                this.f42488r0 = max;
                this.f42490s0 = z4;
                this.f42491t0 = this.L;
                NotificationCenter.getInstance(this.J).doOnIdle(new q(this, android.support.v4.media.a.o("window.Telegram.WebView.receiveEvent('viewport_changed', ", "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z4 + ",is_expanded:" + this.L + "}", ");"), 0));
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
        ic.a(this, new lh.t0(this, 10));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        ic.h(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f42493v0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
        this.f42482n.f32055f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.U) {
            n(true, false);
        }
    }

    public final boolean p() {
        if (this.I0 != null) {
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
        a4 a4Var = this.f42489s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            a4Var.setVisibility(0);
            a4Var.setAlpha(1.0f);
            a4Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(k6.f21605a7))));
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
                a4Var.setVisibility(0);
                a4Var.setAlpha(1.0f);
                a4Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z4);
                return;
            }
            return;
        }
        g6 g6Var = this.f42472e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            a4Var.setVisibility(0);
            a4Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f42487r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.m0);
                this.f42487r.setupGradient(k6.Ki, g6Var, 1.0f, false);
            }
            a4Var.f(null, null, this.f42487r);
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
        a4Var.setVisibility(0);
        a4Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.f42487r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.m0);
            this.f42487r.setupGradient(k6.Ki, g6Var, 1.0f, false);
        }
        a4Var.f(null, null, this.f42487r);
        setupFlickerParams(true);
    }

    public final void r(int i10, String str) {
        this.J = i10;
        NotificationCenter.getInstance(i10).doOnIdle(new q(this, str, 1));
    }

    public void setBotUser(TLRPC.User user) {
        this.R = user;
    }

    public void setDelegate(f0 f0Var) {
        this.f42469c = f0Var;
    }

    public void setFlickerViewColor(int i10) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i10) > 0.7f) {
            b10 = k6.b(0.0f, -0.15f, i10);
        } else {
            b10 = k6.b(0.025f, 0.15f, i10);
        }
        if (this.m0 == b10) {
            return;
        }
        this.m0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        a4 a4Var = this.f42489s;
        a4Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f42487r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.m0);
            this.f42487r.setupGradient(k6.Ki, this.f42472e, 1.0f, false);
        }
        this.f42483n0 = true;
        a4Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i10) {
        if (this.f42493v0 == i10) {
            return;
        }
        this.f42493v0 = i10;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z4) {
        this.O = z4;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.f42497x0 = runnable;
        x0 x0Var = this.f42465a;
        if (x0Var != null) {
            x0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.I0 = callback4;
    }

    public void setOpener(x0 x0Var) {
        x0 x0Var2;
        this.f42486q0 = x0Var;
        if (!this.f42481l0 && (x0Var2 = this.f42465a) != null) {
            x0Var2.f42761f = x0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.T = activity;
    }

    public void setTrustedOrigin(String str) {
        this.A0 = k(str);
    }

    public void setViewPortByMeasureSuppressed(boolean z4) {
        this.U = z4;
    }

    public void setViewPortHeightOffset(float f10) {
        this.f42492u0 = f10;
    }

    public void setWasOpenedByBot(y3 y3Var) {
        this.f42500z0 = y3Var;
    }

    public void setWasOpenedByLinkIntent(boolean z4) {
        this.f42499y0 = z4;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f42494w = aVar;
    }

    public void setWebViewScrollListener(z0 z0Var) {
        this.d = z0Var;
        x0 x0Var = this.f42465a;
        if (x0Var != null) {
            x0Var.f(this, z0Var);
        }
    }

    public final void t() {
        if (this.R != null) {
            f();
            sh.p pVar = this.f42476g0;
            if (pVar == null) {
                return;
            }
            try {
                v("biometry_info_received", pVar.f());
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public final void v(String str, JSONObject jSONObject) {
        g("notifyEvent " + str);
        NotificationCenter.getInstance(this.J).doOnIdle(new q(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void w() {
        JSONObject jSONObject;
        JSONObject p10;
        try {
            p10 = sh.p2.p(this.f42472e, true);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (p10 != null) {
            jSONObject = new JSONObject().put("theme_params", p10);
            v("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        v("theme_changed", jSONObject);
    }

    public final boolean z() {
        if (this.f42465a != null && this.O) {
            v("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public void E() {
    }

    public void H(x0 x0Var) {
    }

    public void setKeyboardFocusable(boolean z4) {
    }

    public void A(String str, boolean z4) {
    }

    public void F(boolean z4, boolean z10) {
    }
}
