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
import fh.g4;
import g7.e6;
import g7.i6;
import ih.d4;
import j$.util.Objects;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mh.c3;
import mh.f4;
import mh.s4;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o9;
import org.telegram.ui.te1;
public abstract class y0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean I0 = true;
    public static int J0;
    public static HashMap K0;
    public int A;
    public final Rect A0;
    public String B;
    public int B0;
    public String C;
    public final t C0;
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
    public ue0 R;
    public Activity S;
    public boolean T;
    public String U;
    public org.telegram.ui.ActionBar.c2 V;
    public int W;
    public v0 f44070a;
    public long f44071a0;
    public String f44072b;
    public long f44073b0;
    public e0 f44074c;
    public o9 f44075c0;
    public x0 d;
    public boolean f44076d0;
    public final b6 f44077e;
    public String f44078e0;
    public final TextView f44079f;
    public mh.r f44080f0;
    public mh.u0 f44081g0;
    public boolean h;
    public mh.k0 f44082h0;
    public mh.p1 f44083i0;
    public mh.p1 f44084j0;
    public final boolean f44085k0;
    public int f44086l0;
    public boolean m0;
    public final org.telegram.ui.Components.voip.h f44087n;
    public BotWebViewContainer$BotWebViewProxy f44088n0;
    public BotWebViewContainer$WebViewProxy f44089o0;
    public v0 f44090p0;
    public int f44091q0;
    public SvgHelper.SvgDrawable f44092r;
    public boolean f44093r0;
    public final d4 f44094s;
    public boolean f44095s0;
    public float f44096t0;
    public int f44097u0;
    public boolean v;
    public boolean f44098v0;
    public q0.a f44099w;
    public Runnable f44100w0;
    public ValueCallback f44101x;
    public boolean f44102x0;
    public int f44103y;
    public s4 f44104y0;
    public String f44105z0;

    public y0(int i9, Context context, b6 b6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f44087n = hVar;
        int i10 = f6.Oh;
        this.f44103y = j(i10);
        int i11 = f6.Sh;
        this.A = j(i11);
        this.B = "";
        this.D = j(i10);
        this.E = j(i11);
        this.F = "";
        this.G = "";
        this.I = UserConfig.selectedAccount;
        this.f44097u0 = -1;
        this.A0 = new Rect(0, 0, 0, 0);
        this.B0 = 0;
        this.C0 = new t(this, 1);
        this.D0 = -1;
        this.E0 = 0;
        int i12 = J0;
        J0 = i12 + 1;
        this.G0 = i12;
        this.f44085k0 = z10;
        this.f44077e = b6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.S = (Activity) context;
        }
        hVar.f33545k = false;
        hVar.b(i9, 153);
        d4 d4Var = new d4(this, context);
        this.f44094s = d4Var;
        int j10 = j(f6.Ki);
        this.f44086l0 = j10;
        d4Var.setColorFilter(new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN));
        d4Var.getImageReceiver().setAspectFit(true);
        addView(d4Var, e6.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f44079f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(j(f6.f23369y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        textView.setPadding(dp, dp, dp, dp);
        addView(textView, e6.e(-1, -2, 17));
        setFocusable(false);
    }

    public static WebResourceResponse I(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(ve.e.v(Uri.parse(str2), "https", null, N(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
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
        for (int i9 = 0; i9 < split.length; i9++) {
            if (i9 > 0) {
                sb2.append("-d");
            }
            sb2.append(split[i9].replaceAll("\\-", "-h"));
        }
        sb2.append(".");
        sb2.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return sb2.toString();
    }

    public static void a(y0 y0Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            y0Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else if (y0Var.d(strArr)) {
            aVar.accept(Boolean.TRUE);
        } else {
            y0Var.R = new ue0(y0Var, aVar, strArr, 21);
            Activity activity = y0Var.S;
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
            return ve.e.v(Uri.parse(str), "https", null, N, null);
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
                return ve.e.v(Uri.parse(str), "tonsite", null, str2, null);
            }
            return str;
        }
        return str;
    }

    private void setupFlickerParams(boolean z10) {
        int i9;
        this.v = z10;
        d4 d4Var = this.f44094s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d4Var.getLayoutParams();
        if (z10) {
            i9 = 17;
        } else {
            i9 = 48;
        }
        layoutParams.gravity = i9;
        if (z10) {
            int dp = AndroidUtilities.dp(100.0f);
            layoutParams.height = dp;
            layoutParams.width = dp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        d4Var.requestLayout();
    }

    private void setupWebView(v0 v0Var) {
        Q(v0Var, null);
    }

    public static void u(int i9, v0 v0Var, String str, JSONObject jSONObject) {
        if (v0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i9).doOnIdle(new ue0(v0Var, str, jSONObject, 20));
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

    public final void B(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy r55, java.lang.String r56, java.lang.String r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.y0.B(org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy, java.lang.String, java.lang.String):void");
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
        if (ve.e.f(uri, false, zArr) && !zArr[0] && this.f44074c != null) {
            setKeyboardFocusable(false);
        }
        ve.e.r(getContext(), uri, true, z10, false, null, str, false, true, z12);
    }

    public abstract void G(v0 v0Var);

    public final void J(int i9, boolean z10) {
        JSONObject jSONObject;
        if (!z10 && i9 == this.B0) {
            return;
        }
        Float valueOf = Float.valueOf(i9 / AndroidUtilities.density);
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
        this.B0 = i9;
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
                B(this.f44088n0, "web_app_setup_main_button", str);
            }
            String str2 = this.H;
            if (str2 != null) {
                B(this.f44088n0, "web_app_setup_secondary_button", str2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void M(mh.p1 p1Var, String str) {
        b6 b6Var;
        boolean z10;
        if (p1Var != null && this.Q != null) {
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
                        ArrayList h = p1Var.h(optString);
                        if (h.isEmpty()) {
                            v("secure_storage_failed", y("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                            return;
                        }
                        Context context = getContext();
                        bg.j1 j1Var = new bg.j1((Object) this, string, (Object) p1Var, (Object) optString, 15);
                        o2 U = LaunchActivity.U();
                        if (U != null) {
                            b6Var = U.getResourceProvider();
                        } else {
                            b6Var = null;
                        }
                        int i9 = 1;
                        String[] strArr = new String[1];
                        boolean[] zArr = new boolean[1];
                        f3 j10 = ll.j(context, b6Var, false, false);
                        ViewGroup f10 = ll.f(context, 1);
                        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                        ArrayList arrayList = h;
                        TLRPC.User user = MessagesController.getInstance(p1Var.f18027a).getUser(Long.valueOf(p1Var.f18028b));
                        z8 z8Var = new z8((b6) null);
                        z8Var.r(user);
                        o9Var.e(user, z8Var);
                        f10.addView(o9Var, e6.t(80, 80, 49, 0, 21, 0, 13));
                        int i10 = f6.G6;
                        TextView b10 = i6.b(context, 20.0f, i10, true, null);
                        ll.l(R.string.BotRestoreStorageTitle, b10, 17);
                        f10.addView(b10, e6.t(-1, -2, 7, 32, 0, 32, 10));
                        TextView b11 = i6.b(context, 14.0f, i10, false, null);
                        b11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                        b11.setGravity(17);
                        f10.addView(b11, e6.t(-1, -2, 7, 32, 0, 32, 19));
                        b9 b9Var = new b9(context, b6Var);
                        b9Var.setBackground(new fq(new ColorDrawable(f6.v0(f6.f22947a7, b6Var)), f6.U0(context, R.drawable.greydivider, f6.v0(f6.f22966b7, b6Var))));
                        b9Var.setFixedSize(12);
                        f10.addView(b9Var, e6.t(-1, 12, 7, 0, 0, 0, 0));
                        m4 m4Var = new m4(context, b6Var);
                        m4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                        f10.addView(m4Var, e6.t(-1, -2, 7, 0, 0, 0, 0));
                        kh.d dVar = new kh.d(context, b6Var, true);
                        ArrayList arrayList2 = new ArrayList();
                        int i11 = 0;
                        while (i11 < arrayList.size()) {
                            ArrayList arrayList3 = arrayList;
                            mh.o1 o1Var = (mh.o1) arrayList3.get(i11);
                            if (i11 < arrayList3.size() - i9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            mh.n1 n1Var = new mh.n1(o1Var, z10, context);
                            n1Var.setBackground(f6.f0(f6.v0(f6.f23092i6, b6Var), 2, -1));
                            ViewGroup viewGroup = f10;
                            n1Var.setOnClickListener(new g4(strArr, o1Var, arrayList2, dVar, 3));
                            viewGroup.addView(n1Var, e6.n(-1, 56));
                            arrayList2.add(n1Var);
                            i11++;
                            arrayList = arrayList3;
                            j10 = j10;
                            f10 = viewGroup;
                            j1Var = j1Var;
                            i9 = 1;
                        }
                        bg.j1 j1Var2 = j1Var;
                        f3 f3Var = j10;
                        ViewGroup viewGroup2 = f10;
                        boolean z11 = false;
                        dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                        if (strArr[0] != null) {
                            z11 = true;
                        }
                        dVar.setEnabled(z11);
                        viewGroup2.addView(dVar, e6.t(-1, 48, 7, 8, 8, 8, 4));
                        f3Var.customView = viewGroup2;
                        f3Var.fixNavigationBar(f6.v0(f6.f23072h5, b6Var));
                        dVar.setOnClickListener(new g4(zArr, j1Var2, strArr, f3Var, 4));
                        f3Var.setOnDismissListener(new bg.j(3, zArr, j1Var2));
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
        v0 v0Var = this.f44070a;
        if (v0Var != null) {
            boolean z13 = v0Var.A;
        }
        if (v0Var != null && v0Var.canGoBack()) {
            z11 = false;
        } else {
            z11 = true;
        }
        v0 v0Var2 = this.f44070a;
        if (v0Var2 != null && v0Var2.canGoForward()) {
            z12 = false;
        } else {
            z12 = true;
        }
        F(z11, z12);
        v0 v0Var3 = this.f44070a;
        if (v0Var3 != null) {
            v0Var3.f44037b = true;
        }
        if (this.J) {
            g("setPageLoaded: already loaded");
            return;
        }
        d4 d4Var = this.f44094s;
        if (z10 && v0Var3 != null && d4Var != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f44070a, property, 1.0f), ObjectAnimator.ofFloat(d4Var, property, 0.0f));
            animatorSet.addListener(new te1(this, 4));
            animatorSet.start();
        } else {
            if (v0Var3 != null) {
                v0Var3.setAlpha(1.0f);
            }
            if (d4Var != null) {
                d4Var.setAlpha(0.0f);
                d4Var.setVisibility(8);
            }
        }
        this.f44072b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.J = true;
        this.f44074c.getClass();
    }

    public final void P(mh.p1 p1Var, String str, String str2, String str3) {
        if (p1Var != null && this.Q != null) {
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
                            p1Var.n(optString, jSONObject.optString("value"));
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

    public final void Q(v0 v0Var, Object obj) {
        v0 v0Var2;
        String str;
        TLRPC.User user;
        boolean z10;
        String str2 = "";
        v0 v0Var3 = this.f44070a;
        if (v0Var3 != null) {
            v0Var3.destroy();
            removeView(this.f44070a);
        }
        if (v0Var != null) {
            AndroidUtilities.removeFromParent(v0Var);
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
        if (v0Var == null) {
            Context context = getContext();
            boolean z11 = this.f44085k0;
            long j10 = 0;
            if (z11 && (user = this.Q) != null) {
                j10 = user.f22527id;
            }
            v0Var2 = new v0(context, z11, j10);
        } else {
            v0Var2 = v0Var;
        }
        this.f44070a = v0Var2;
        if (!this.f44085k0) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f44070a, true);
            CookieManager.getInstance().flush();
            this.f44070a.f44040f = this.f44090p0;
        } else {
            v0Var2.setBackgroundColor(j(f6.f23001d6));
        }
        if (!MessagesController.getInstance(this.I).disableBotFullscreenBlur) {
            this.f44070a.setLayerType(2, null);
        }
        this.f44070a.f(this, this.d);
        this.f44070a.setCloseListener(this.f44100w0);
        WebSettings settings = this.f44070a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f44085k0) {
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
            if (this.f44085k0) {
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
        this.f44070a.setVerticalScrollBarEnabled(false);
        if (v0Var == null && this.f44085k0) {
            this.f44070a.setAlpha(0.0f);
        }
        addView(this.f44070a);
        if (this.f44085k0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f44088n0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f44088n0;
            if (botWebViewContainer$BotWebViewProxy == null) {
                ?? obj2 = new Object();
                obj2.f43786a = this;
                this.f44088n0 = obj2;
                this.f44070a.addJavascriptInterface(obj2, "TelegramWebviewProxy");
            } else if (v0Var == null) {
                this.f44070a.addJavascriptInterface(botWebViewContainer$BotWebViewProxy, "TelegramWebviewProxy");
            }
            this.f44088n0.f43786a = this;
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f44089o0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f44089o0;
            if (botWebViewContainer$WebViewProxy == null) {
                v0 v0Var4 = this.f44070a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(v0Var4, this);
                this.f44089o0 = botWebViewContainer$WebViewProxy2;
                v0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (v0Var == null) {
                this.f44070a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f44089o0.f43787a = this;
        }
        G(this.f44070a);
        I0 = false;
    }

    public final void R(int i9, org.telegram.ui.ActionBar.c2 c2Var, Runnable runnable) {
        if (c2Var != null && !m(i9)) {
            c2Var.setOnDismissListener(new bg.j(16, this, runnable));
            this.V = c2Var;
            c2Var.f22767d0 = false;
            c2Var.show();
            if (this.D0 != i9) {
                this.D0 = i9;
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
        if (this.f44070a == null && !this.h) {
            try {
                setupWebView(null);
            } catch (Throwable th) {
                FileLog.e(th);
                this.f44094s.setVisibility(8);
                this.h = true;
                this.f44079f.setVisibility(0);
                v0 v0Var = this.f44070a;
                if (v0Var != null) {
                    removeView(v0Var);
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ue0 ue0Var;
        Uri[] uriArr;
        if (i9 == NotificationCenter.didSetNewTheme) {
            v0 v0Var = this.f44070a;
            if (v0Var != null) {
                v0Var.setBackgroundColor(j(f6.f23001d6));
            }
            if (!this.m0) {
                int i11 = f6.Ki;
                int j10 = j(i11);
                this.f44086l0 = j10;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(j10, PorterDuff.Mode.SRC_IN);
                d4 d4Var = this.f44094s;
                d4Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f44092r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.f44086l0);
                    this.f44092r.setupGradient(i11, this.f44077e, 1.0f, false);
                }
                d4Var.invalidate();
            }
            w();
        } else if (i9 == NotificationCenter.onActivityResultReceived) {
            int intValue = ((Integer) objArr[0]).intValue();
            int intValue2 = ((Integer) objArr[1]).intValue();
            Intent intent = (Intent) objArr[2];
            if (intValue == 3000 && this.f44101x != null) {
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
                    this.f44101x.onReceiveValue(uriArr);
                    this.f44101x = null;
                }
                uriArr = null;
                this.f44101x.onReceiveValue(uriArr);
                this.f44101x = null;
            }
        } else if (i9 == NotificationCenter.onRequestPermissionResultReceived) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            String[] strArr = (String[]) objArr[1];
            int[] iArr = (int[]) objArr[2];
            if (intValue3 == 4000 && (ue0Var = this.R) != null) {
                ue0Var.run();
                this.R = null;
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f44094s) {
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
                this.f44087n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return drawChild;
        } else if (view == this.f44079f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild2;
        } else {
            if (view == this.f44070a) {
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

    public final void e(mh.p1 p1Var, String str, String str2, String str3) {
        if (p1Var != null && this.Q != null) {
            try {
                String string = new JSONObject(str).getString("req_id");
                try {
                    p1Var.m(new JSONObject());
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
        mh.r rVar = this.f44080f0;
        if (rVar == null) {
            this.f44080f0 = mh.r.c(getContext(), this.I, this.Q.f22527id);
        } else {
            rVar.h();
        }
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.G0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f44088n0;
    }

    public int getMinHeight() {
        if (getParent() instanceof f4) {
            f4 f4Var = (f4) getParent();
            if (f4Var.F) {
                return (int) ((f4Var.getMeasuredHeight() - f4Var.getOffsetY()) + this.f44096t0);
            }
            return 0;
        }
        return 0;
    }

    public String getOriginHost() {
        v0 v0Var = this.f44070a;
        if (v0Var == null) {
            return null;
        }
        return k(v0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f44089o0;
    }

    public String getUrlLoaded() {
        return this.f44072b;
    }

    public v0 getWebView() {
        return this.f44070a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.f44098v0);
        v0 v0Var = this.f44070a;
        if (v0Var != null) {
            if (v0Var.getParent() != null) {
                removeView(this.f44070a);
            }
            if (!this.f44098v0) {
                this.f44070a.destroy();
                H(this.f44070a);
            }
            this.J = false;
            if (this.f44080f0 != null) {
                this.f44080f0 = null;
            }
            if (this.f44083i0 != null) {
                this.f44083i0 = null;
            }
            if (this.f44084j0 != null) {
                this.f44084j0 = null;
            }
            mh.u0 u0Var = this.f44081g0;
            if (u0Var != null) {
                u0Var.f18153f.remove(this.C0);
                this.f44081g0 = null;
            }
        }
    }

    public final void i(String str) {
        new oc(this, this.f44077e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i9) {
        b6 b6Var = this.f44077e;
        if (b6Var != null) {
            return b6Var.N0(i9);
        }
        return f6.w0(null, i9, false);
    }

    public final void l(mh.p1 p1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (p1Var != null && this.Q != null) {
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
                        Pair f10 = p1Var.f(optString);
                        if (p1Var.d && (obj = f10.first) == null) {
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

    public final boolean m(int i9) {
        if (this.V != null || (this.F0 > 0 && System.currentTimeMillis() < this.F0)) {
            return true;
        }
        if (this.D0 != i9 || this.E0 <= 3) {
            return false;
        }
        this.F0 = System.currentTimeMillis() + 3000;
        this.E0 = 0;
        return true;
    }

    public final void n(boolean z10, boolean z11) {
        boolean z12;
        invalidate();
        if ((this.J || z11) && this.f44085k0 && (getParent() instanceof f4)) {
            f4 f4Var = (f4) getParent();
            if (z10) {
                if (f4Var.getSwipeOffsetY() == f4Var.getTopActionBarOffsetY() + (-f4Var.getOffsetY())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.K = z12;
            }
            int max = Math.max(getMinHeight(), (int) (f4Var.getTopActionBarOffsetY() + ((f4Var.getMeasuredHeight() - f4Var.getOffsetY()) - f4Var.getSwipeOffsetY()) + this.f44096t0));
            if (z11 || max != this.f44091q0 || this.f44093r0 != z10 || this.f44095s0 != this.K) {
                this.f44091q0 = max;
                this.f44093r0 = z10;
                this.f44095s0 = this.K;
                NotificationCenter.getInstance(this.I).doOnIdle(new p(this, aa.d.o("window.Telegram.WebView.receiveEvent('viewport_changed', ", "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.K + "}", ");"), 0));
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
        gc.a(this, new fh.y0(this, 11));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        gc.h(this);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11 = this.f44097u0;
        if (i11 >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i9, i10);
        this.f44087n.f33541f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
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

    public final void q(int i9, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i9).getUserFull(j10);
        String publicUsername = UserObject.getPublicUsername(user);
        d4 d4Var = this.f44094s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            d4Var.setVisibility(0);
            d4Var.setAlpha(1.0f);
            d4Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(f6.f22947a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i9).getAttachMenuBots().bots;
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
            TLRPC.TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
            } else {
                z10 = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                d4Var.setVisibility(0);
                d4Var.setAlpha(1.0f);
                d4Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        b6 b6Var = this.f44077e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            d4Var.setVisibility(0);
            d4Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f44092r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.f44086l0);
                this.f44092r.setupGradient(f6.Ki, b6Var, 1.0f, false);
            }
            d4Var.f(null, null, this.f44092r);
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
        d4Var.setVisibility(0);
        d4Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.f44092r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.f44086l0);
            this.f44092r.setupGradient(f6.Ki, b6Var, 1.0f, false);
        }
        d4Var.f(null, null, this.f44092r);
        setupFlickerParams(true);
    }

    public final void r(int i9, String str) {
        this.I = i9;
        NotificationCenter.getInstance(i9).doOnIdle(new p(this, str, 1));
    }

    public void setBotUser(TLRPC.User user) {
        this.Q = user;
    }

    public void setDelegate(e0 e0Var) {
        this.f44074c = e0Var;
    }

    public void setFlickerViewColor(int i9) {
        int b10;
        if (AndroidUtilities.computePerceivedBrightness(i9) > 0.7f) {
            b10 = f6.b(0.0f, -0.15f, i9);
        } else {
            b10 = f6.b(0.025f, 0.15f, i9);
        }
        if (this.f44086l0 == b10) {
            return;
        }
        this.f44086l0 = b10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN);
        d4 d4Var = this.f44094s;
        d4Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f44092r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.f44086l0);
            this.f44092r.setupGradient(f6.Ki, this.f44077e, 1.0f, false);
        }
        this.m0 = true;
        d4Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i9) {
        if (this.f44097u0 == i9) {
            return;
        }
        this.f44097u0 = i9;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z10) {
        this.N = z10;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.f44100w0 = runnable;
        v0 v0Var = this.f44070a;
        if (v0Var != null) {
            v0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.H0 = callback4;
    }

    public void setOpener(v0 v0Var) {
        v0 v0Var2;
        this.f44090p0 = v0Var;
        if (!this.f44085k0 && (v0Var2 = this.f44070a) != null) {
            v0Var2.f44040f = v0Var;
        }
    }

    public void setParentActivity(Activity activity) {
        this.S = activity;
    }

    public void setTrustedOrigin(String str) {
        this.f44105z0 = k(str);
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.T = z10;
    }

    public void setViewPortHeightOffset(float f10) {
        this.f44096t0 = f10;
    }

    public void setWasOpenedByBot(s4 s4Var) {
        this.f44104y0 = s4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.f44102x0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f44099w = aVar;
    }

    public void setWebViewScrollListener(x0 x0Var) {
        this.d = x0Var;
        v0 v0Var = this.f44070a;
        if (v0Var != null) {
            v0Var.f(this, x0Var);
        }
    }

    public final void t() {
        if (this.Q != null) {
            f();
            mh.r rVar = this.f44080f0;
            if (rVar == null) {
                return;
            }
            try {
                v("biometry_info_received", rVar.f());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public final void v(String str, JSONObject jSONObject) {
        g("notifyEvent " + str);
        NotificationCenter.getInstance(this.I).doOnIdle(new p(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void w() {
        JSONObject jSONObject;
        JSONObject p6;
        try {
            p6 = c3.p(this.f44077e, true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (p6 != null) {
            jSONObject = new JSONObject().put("theme_params", p6);
            v("theme_changed", jSONObject);
        }
        jSONObject = new JSONObject();
        v("theme_changed", jSONObject);
    }

    public final boolean z() {
        if (this.f44070a != null && this.N) {
            v("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public void E() {
    }

    public void H(v0 v0Var) {
    }

    public void setKeyboardFocusable(boolean z10) {
    }

    public void A(String str, boolean z10) {
    }

    public void F(boolean z10, boolean z11) {
    }
}
