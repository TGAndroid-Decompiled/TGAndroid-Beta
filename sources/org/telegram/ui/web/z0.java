package org.telegram.ui.web;

import ag.r2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
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
import gh.a4;
import h7.d6;
import h7.z5;
import j$.util.Objects;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.b8;
import jh.z3;
import nh.b3;
import nh.d4;
import nh.o4;
import nh.q4;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
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
import org.telegram.messenger.k2;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ib0;
import org.telegram.ui.j70;
import org.telegram.ui.kb0;
import org.telegram.ui.p9;
import org.telegram.ui.t9;
import org.telegram.ui.zb1;

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
    public gs0 R;
    public Activity S;
    public boolean T;
    public String U;
    public org.telegram.ui.ActionBar.b2 V;
    public int W;

    public w0 f44057a;

    public long f44058a0;

    public String f44059b;

    public long f44060b0;

    public f0 f44061c;

    public p9 f44062c0;
    public y0 d;

    public boolean f44063d0;

    public final c6 f44064e;

    public String f44065e0;

    public final TextView f44066f;

    public nh.q f44067f0;

    public nh.t0 f44068g0;
    public boolean h;

    public nh.j0 f44069h0;

    public nh.o1 f44070i0;

    public nh.o1 f44071j0;

    public final boolean f44072k0;

    public int f44073l0;
    public boolean m0;

    public final org.telegram.ui.Components.voip.h f44074n;

    public BotWebViewContainer$BotWebViewProxy f44075n0;

    public BotWebViewContainer$WebViewProxy f44076o0;

    public w0 f44077p0;

    public int f44078q0;

    public SvgHelper.SvgDrawable f44079r;

    public boolean f44080r0;

    public final z3 f44081s;

    public boolean f44082s0;

    public float f44083t0;

    public int f44084u0;
    public boolean v;

    public boolean f44085v0;

    public q0.a f44086w;

    public Runnable f44087w0;

    public ValueCallback f44088x;

    public boolean f44089x0;

    public int f44090y;

    public q4 f44091y0;

    public String f44092z0;

    public z0(int i10, Context context, c6 c6Var, boolean z10) {
        super(context);
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.f44074n = hVar;
        int i11 = g6.Oh;
        this.f44090y = j(i11);
        int i12 = g6.Sh;
        this.A = j(i12);
        this.B = "";
        this.D = j(i11);
        this.E = j(i12);
        this.F = "";
        this.G = "";
        this.I = UserConfig.selectedAccount;
        this.f44084u0 = -1;
        this.A0 = new Rect(0, 0, 0, 0);
        this.B0 = 0;
        this.C0 = new u(this, 1);
        this.D0 = -1;
        this.E0 = 0;
        int i13 = J0;
        J0 = i13 + 1;
        this.G0 = i13;
        this.f44072k0 = z10;
        this.f44064e = c6Var;
        g("created new webview container");
        if (context instanceof Activity) {
            this.S = (Activity) context;
        }
        hVar.f33595k = false;
        hVar.b(i10, 153);
        z3 z3Var = new z3(this, context);
        this.f44081s = z3Var;
        int iJ = j(g6.Ki);
        this.f44073l0 = iJ;
        z3Var.setColorFilter(new PorterDuffColorFilter(iJ, PorterDuff.Mode.SRC_IN));
        z3Var.getImageReceiver().setAspectFit(true);
        addView(z3Var, z5.e(-1, -2, 48));
        TextView textView = new TextView(context);
        this.f44066f = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        textView.setTextColor(j(g6.f23423y6));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(17);
        textView.setVisibility(8);
        int iDp = AndroidUtilities.dp(16.0f);
        textView.setPadding(iDp, iDp, iDp, iDp);
        addView(textView, z5.e(-1, -2, 17));
        setFocusable(false);
    }

    public static WebResourceResponse I(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(we.e.v(Uri.parse(str2), "https", null, N(AndroidUtilities.getHostAuthority(str2)), null)).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static String N(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        String[] strArrSplit = str.split("\\.");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            if (i10 > 0) {
                sb2.append("-d");
            }
            sb2.append(strArrSplit[i10].replaceAll("\\-", "-h"));
        }
        sb2.append(".");
        sb2.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return sb2.toString();
    }

    public static void a(z0 z0Var, String[] strArr, q0.a aVar) {
        if (Build.VERSION.SDK_INT < 23) {
            z0Var.getClass();
            aVar.accept(Boolean.TRUE);
        } else {
            if (z0Var.d(strArr)) {
                aVar.accept(Boolean.TRUE);
                return;
            }
            z0Var.R = new gs0(z0Var, aVar, strArr, 15);
            Activity activity = z0Var.S;
            if (activity != null) {
                activity.requestPermissions(strArr, 4000);
            }
        }
    }

    public static String b(String str) {
        if (str == null || !o(Uri.parse(str))) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        try {
            hostAuthority = IDN.toASCII(hostAuthority, 1);
        } catch (Exception unused) {
        }
        String strN = N(hostAuthority);
        if (K0 == null) {
            K0 = new HashMap();
        }
        K0.put(strN, hostAuthority);
        return we.e.v(Uri.parse(str), "https", null, strN, null);
    }

    public static String k(String str) {
        if (str != null && !str.isEmpty()) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            int port = uri.getPort();
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
            return authority.endsWith(".ton") || authority.endsWith(".adnl");
        }
        return false;
    }

    public static String s(String str) {
        String hostAuthority;
        String str2;
        if (K0 == null || str == null || (hostAuthority = AndroidUtilities.getHostAuthority(str)) == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(".");
        sb2.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return (hostAuthority.endsWith(sb2.toString()) && (str2 = (String) K0.get(hostAuthority)) != null) ? we.e.v(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    private void setupFlickerParams(boolean z10) {
        this.v = z10;
        z3 z3Var = this.f44081s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z3Var.getLayoutParams();
        layoutParams.gravity = z10 ? 17 : 48;
        if (z10) {
            int iDp = AndroidUtilities.dp(100.0f);
            layoutParams.height = iDp;
            layoutParams.width = iDp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        z3Var.requestLayout();
    }

    private void setupWebView(w0 w0Var) {
        Q(w0Var, null);
    }

    public static void u(int i10, w0 w0Var, String str, JSONObject jSONObject) {
        if (w0Var == null) {
            return;
        }
        NotificationCenter.getInstance(i10).doOnIdle(new gs0(w0Var, str, jSONObject, 14));
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

    public final void B(BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy, String str, String str2) throws JSONException {
        byte b10;
        final int i10;
        boolean z10;
        boolean zOptBoolean;
        LaunchActivity launchActivity;
        int i11;
        boolean zOptBoolean2;
        boolean zOptBoolean3;
        String string;
        TextView textView;
        TextView textView2;
        TextView textView3;
        p9 p9Var;
        long j10;
        int i12;
        long j11;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String str3;
        String str4;
        String strOptString4;
        boolean zOptBoolean4;
        long j12;
        boolean zOptBoolean5;
        if (this.f44072k0) {
            if (this.f44057a == null || this.f44061c == null) {
                g("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            if (this.f44092z0 != null && !TextUtils.equals(getOriginHost(), this.f44092z0)) {
                g("onEventReceived ignore " + str);
            }
            g("onEventReceived " + str);
            str.getClass();
            switch (str) {
                case "web_app_invoke_custom_method":
                    b10 = 0;
                    break;
                case "web_app_close_scan_qr_popup":
                    b10 = 1;
                    break;
                case "web_app_biometry_get_info":
                    b10 = 2;
                    break;
                case "web_app_open_link":
                    b10 = 3;
                    break;
                case "web_app_request_file_download":
                    b10 = 4;
                    break;
                case "web_app_open_popup":
                    b10 = 5;
                    break;
                case "web_app_open_invoice":
                    b10 = 6;
                    break;
                case "web_app_set_emoji_status":
                    b10 = 7;
                    break;
                case "web_app_setup_secondary_button":
                    b10 = 8;
                    break;
                case "web_app_setup_closing_behavior":
                    b10 = 9;
                    break;
                case "web_app_open_scan_qr_popup":
                    b10 = 10;
                    break;
                case "web_app_request_phone":
                    b10 = 11;
                    break;
                case "web_app_request_theme":
                    b10 = 12;
                    break;
                case "web_app_secure_storage_get_key":
                    b10 = 13;
                    break;
                case "web_app_check_location":
                    b10 = 14;
                    break;
                case "web_app_biometry_open_settings":
                    b10 = 15;
                    break;
                case "web_app_request_viewport":
                    b10 = 16;
                    break;
                case "web_app_request_emoji_status_access":
                    b10 = 17;
                    break;
                case "web_app_stop_device_orientation":
                    b10 = 18;
                    break;
                case "web_app_device_storage_save_key":
                    b10 = 19;
                    break;
                case "web_app_device_storage_get_key":
                    b10 = 20;
                    break;
                case "web_app_biometry_request_auth":
                    b10 = 21;
                    break;
                case "web_app_toggle_orientation_lock":
                    b10 = 22;
                    break;
                case "web_app_allow_scroll":
                    b10 = 23;
                    break;
                case "web_app_open_tg_link":
                    b10 = 24;
                    break;
                case "web_app_secure_storage_restore_key":
                    b10 = 25;
                    break;
                case "web_app_share_to_story":
                    b10 = 26;
                    break;
                case "web_app_request_location":
                    b10 = 27;
                    break;
                case "web_app_start_gyroscope":
                    b10 = 28;
                    break;
                case "web_app_close":
                    b10 = 29;
                    break;
                case "web_app_ready":
                    b10 = 30;
                    break;
                case "web_app_read_text_from_clipboard":
                    b10 = 31;
                    break;
                case "web_app_hide_keyboard":
                    b10 = 32;
                    break;
                case "web_app_stop_gyroscope":
                    b10 = 33;
                    break;
                case "web_app_secure_storage_clear":
                    b10 = 34;
                    break;
                case "web_app_device_storage_clear":
                    b10 = 35;
                    break;
                case "web_app_start_accelerometer":
                    b10 = 36;
                    break;
                case "web_app_stop_accelerometer":
                    b10 = 37;
                    break;
                case "web_app_send_prepared_message":
                    b10 = 38;
                    break;
                case "web_app_data_send":
                    b10 = 39;
                    break;
                case "web_app_request_content_safe_area":
                    b10 = 40;
                    break;
                case "web_app_add_to_home_screen":
                    b10 = 41;
                    break;
                case "web_app_request_fullscreen":
                    b10 = 42;
                    break;
                case "web_app_switch_inline_query":
                    b10 = 43;
                    break;
                case "web_app_secure_storage_save_key":
                    b10 = 44;
                    break;
                case "web_app_exit_fullscreen":
                    b10 = 45;
                    break;
                case "web_app_verify_age":
                    b10 = 46;
                    break;
                case "web_app_open_location_settings":
                    b10 = 47;
                    break;
                case "web_app_setup_back_button":
                    b10 = 48;
                    break;
                case "web_app_biometry_request_access":
                    b10 = 49;
                    break;
                case "web_app_trigger_haptic_feedback":
                    b10 = 50;
                    break;
                case "web_app_setup_main_button":
                    b10 = 51;
                    break;
                case "web_app_setup_swipe_behavior":
                    b10 = 52;
                    break;
                case "web_app_setup_settings_button":
                    b10 = 53;
                    break;
                case "web_app_check_home_screen":
                    b10 = 54;
                    break;
                case "web_app_request_chat":
                    b10 = 55;
                    break;
                case "web_app_start_device_orientation":
                    b10 = 56;
                    break;
                case "web_app_biometry_update_token":
                    b10 = 57;
                    break;
                case "web_app_set_bottom_bar_color":
                    b10 = 58;
                    break;
                case "web_app_set_header_color":
                    b10 = 59;
                    break;
                case "web_app_request_safe_area":
                    b10 = 60;
                    break;
                case "web_app_set_background_color":
                    b10 = 61;
                    break;
                case "web_app_request_write_access":
                    b10 = 62;
                    break;
                case "web_app_expand":
                    b10 = 63;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            byte b11 = b10;
            u uVar = this.C0;
            long j13 = 1000;
            c6 c6Var = this.f44064e;
            BotWebViewVibrationEffect botWebViewVibrationEffect = null;
            String string2 = null;
            String strOptString5 = null;
            String string3 = null;
            l3 l3Var = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            botWebViewVibrationEffect = null;
            switch (b11) {
                case 0:
                    if (this.Q != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2);
                            String string4 = jSONObject.getString("req_id");
                            String string5 = jSONObject.getString("method");
                            String string6 = jSONObject.get("params").toString();
                            int i13 = this.I;
                            w0 w0Var = this.f44057a;
                            TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                            invokewebviewcustommethod.bot = MessagesController.getInstance(i13).getInputUser(this.Q.f22527id);
                            invokewebviewcustommethod.custom_method = string5;
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            invokewebviewcustommethod.params = tL_dataJSON;
                            tL_dataJSON.data = string6;
                            ConnectionsManager.getInstance(i13).sendRequest(invokewebviewcustommethod, new b8(this, string4, i13, w0Var, 8));
                            break;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            if (e9 instanceof JSONException) {
                                i("JSON Parse error");
                                return;
                            } else {
                                S(null);
                                return;
                            }
                        }
                    }
                    break;
                case 1:
                    if (this.f44063d0 && (p9Var = this.f44062c0) != null) {
                        p9Var.dismiss();
                        break;
                    }
                    break;
                case 2:
                    t();
                    break;
                case 3:
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        Uri uri = Uri.parse(jSONObject2.optString("url"));
                        String strOptString6 = jSONObject2.optString("try_browser");
                        if (MessagesController.getInstance(this.I).webAppAllowedProtocols != null && MessagesController.getInstance(this.I).webAppAllowedProtocols.contains(uri.getScheme())) {
                            D(uri, strOptString6, jSONObject2.optBoolean("try_instant_view"), true, false);
                            break;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                    break;
                case 4:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        if (this.f44069h0 == null) {
                            this.f44069h0 = nh.j0.c(getContext(), this.I, this.Q.f22527id);
                        }
                        try {
                            JSONObject jSONObject3 = new JSONObject(str2);
                            String string7 = jSONObject3.getString("url");
                            String string8 = jSONObject3.getString("file_name");
                            if (this.f44069h0.d(string7) != null) {
                                this.f44069h0.b(string7, string8);
                                v("file_download_requested", x("downloading", "status"));
                            } else {
                                TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                                checkdownloadfileparams.bot = MessagesController.getInstance(this.I).getInputUser(this.Q);
                                checkdownloadfileparams.file_name = string8;
                                checkdownloadfileparams.url = string7;
                                ConnectionsManager.getInstance(this.I).sendRequest(checkdownloadfileparams, new cg.y(this, string7, string8, 22));
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            v("file_download_requested", x("cancelled", "status"));
                            return;
                        }
                        break;
                    }
                    break;
                case 5:
                    try {
                        if (this.V == null) {
                            if (System.currentTimeMillis() - this.f44058a0 <= 150) {
                                int i14 = this.W + 1;
                                this.W = i14;
                                if (i14 >= 3) {
                                    this.W = 0;
                                    this.f44060b0 = System.currentTimeMillis();
                                }
                            }
                            if (System.currentTimeMillis() - this.f44060b0 <= 3000) {
                                break;
                            } else {
                                JSONObject jSONObject4 = new JSONObject(str2);
                                String strOptString7 = jSONObject4.optString("title", null);
                                String string9 = jSONObject4.getString("message");
                                JSONArray jSONArray = jSONObject4.getJSONArray("buttons");
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                                alertDialog$Builder.l(strOptString7);
                                alertDialog$Builder.g(string9);
                                ArrayList arrayList = new ArrayList();
                                for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                                    arrayList.add(new x0(jSONArray.getJSONObject(i15)));
                                }
                                if (arrayList.size() > 3) {
                                    break;
                                } else {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        final x0 x0Var = (x0) arrayList.get(0);
                                        final int i16 = 2;
                                        alertDialog$Builder.k(x0Var.f44043b, new org.telegram.ui.ActionBar.a2(this) {

                                            public final z0 f43997b;

                                            {
                                                this.f43997b = this;
                                            }

                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i17) {
                                                switch (i16) {
                                                    case 0:
                                                        x0 x0Var2 = x0Var;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        z0 z0Var = this.f43997b;
                                                        z0Var.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            z0Var.L = System.currentTimeMillis();
                                                            z0Var.v("popup_closed", new JSONObject().put("button_id", x0Var2.f44042a));
                                                            atomicBoolean2.set(true);
                                                        } catch (JSONException e12) {
                                                            FileLog.e(e12);
                                                            return;
                                                        }
                                                        break;
                                                    case 1:
                                                        x0 x0Var3 = x0Var;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        z0 z0Var2 = this.f43997b;
                                                        z0Var2.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            z0Var2.L = System.currentTimeMillis();
                                                            z0Var2.v("popup_closed", new JSONObject().put("button_id", x0Var3.f44042a));
                                                            atomicBoolean3.set(true);
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        x0 x0Var4 = x0Var;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        z0 z0Var3 = this.f43997b;
                                                        z0Var3.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            z0Var3.L = System.currentTimeMillis();
                                                            z0Var3.v("popup_closed", new JSONObject().put("button_id", x0Var4.f44042a));
                                                            atomicBoolean4.set(true);
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList.size() >= 2) {
                                        final x0 x0Var2 = (x0) arrayList.get(1);
                                        final int i17 = 0;
                                        alertDialog$Builder.h(x0Var2.f44043b, new org.telegram.ui.ActionBar.a2(this) {

                                            public final z0 f43997b;

                                            {
                                                this.f43997b = this;
                                            }

                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i18) {
                                                switch (i17) {
                                                    case 0:
                                                        x0 x0Var3 = x0Var2;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        z0 z0Var = this.f43997b;
                                                        z0Var.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            z0Var.L = System.currentTimeMillis();
                                                            z0Var.v("popup_closed", new JSONObject().put("button_id", x0Var3.f44042a));
                                                            atomicBoolean2.set(true);
                                                        } catch (JSONException e12) {
                                                            FileLog.e(e12);
                                                            return;
                                                        }
                                                        break;
                                                    case 1:
                                                        x0 x0Var4 = x0Var2;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        z0 z0Var2 = this.f43997b;
                                                        z0Var2.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            z0Var2.L = System.currentTimeMillis();
                                                            z0Var2.v("popup_closed", new JSONObject().put("button_id", x0Var4.f44042a));
                                                            atomicBoolean3.set(true);
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        x0 x0Var5 = x0Var2;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        z0 z0Var3 = this.f43997b;
                                                        z0Var3.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            z0Var3.L = System.currentTimeMillis();
                                                            z0Var3.v("popup_closed", new JSONObject().put("button_id", x0Var5.f44042a));
                                                            atomicBoolean4.set(true);
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (arrayList.size() == 3) {
                                        final x0 x0Var3 = (x0) arrayList.get(2);
                                        final int i18 = 1;
                                        alertDialog$Builder.i(x0Var3.f44043b, new org.telegram.ui.ActionBar.a2(this) {

                                            public final z0 f43997b;

                                            {
                                                this.f43997b = this;
                                            }

                                            @Override
                                            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i19) {
                                                switch (i18) {
                                                    case 0:
                                                        x0 x0Var4 = x0Var3;
                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                        z0 z0Var = this.f43997b;
                                                        z0Var.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            z0Var.L = System.currentTimeMillis();
                                                            z0Var.v("popup_closed", new JSONObject().put("button_id", x0Var4.f44042a));
                                                            atomicBoolean2.set(true);
                                                        } catch (JSONException e12) {
                                                            FileLog.e(e12);
                                                            return;
                                                        }
                                                        break;
                                                    case 1:
                                                        x0 x0Var5 = x0Var3;
                                                        AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                        z0 z0Var2 = this.f43997b;
                                                        z0Var2.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            z0Var2.L = System.currentTimeMillis();
                                                            z0Var2.v("popup_closed", new JSONObject().put("button_id", x0Var5.f44042a));
                                                            atomicBoolean3.set(true);
                                                        } catch (JSONException e13) {
                                                            FileLog.e(e13);
                                                            return;
                                                        }
                                                        break;
                                                    default:
                                                        x0 x0Var6 = x0Var3;
                                                        AtomicBoolean atomicBoolean4 = atomicBoolean;
                                                        z0 z0Var3 = this.f43997b;
                                                        z0Var3.getClass();
                                                        b2Var.dismiss();
                                                        try {
                                                            z0Var3.L = System.currentTimeMillis();
                                                            z0Var3.v("popup_closed", new JSONObject().put("button_id", x0Var6.f44042a));
                                                            atomicBoolean4.set(true);
                                                        } catch (JSONException e14) {
                                                            FileLog.e(e14);
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    alertDialog$Builder.j(new cg.g(this, atomicBoolean));
                                    this.V = alertDialog$Builder.o();
                                    if (arrayList.size() >= 1) {
                                        x0 x0Var4 = (x0) arrayList.get(0);
                                        if (x0Var4.f44044c >= 0 && (textView3 = (TextView) this.V.d(-1)) != null) {
                                            textView3.setTextColor(j(x0Var4.f44044c));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        x0 x0Var5 = (x0) arrayList.get(1);
                                        if (x0Var5.f44044c >= 0 && (textView2 = (TextView) this.V.d(-2)) != null) {
                                            textView2.setTextColor(j(x0Var5.f44044c));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        x0 x0Var6 = (x0) arrayList.get(2);
                                        if (x0Var6.f44044c >= 0 && (textView = (TextView) this.V.d(-3)) != null) {
                                            textView.setTextColor(j(x0Var6.f44044c));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (JSONException e12) {
                        FileLog.e(e12);
                        return;
                    }
                    break;
                case 6:
                    try {
                        String strOptString8 = new JSONObject(str2).optString("slug");
                        if (this.U != null) {
                            C(strOptString8, "cancelled", true);
                        } else {
                            this.U = strOptString8;
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                            tL_inputInvoiceSlug.slug = strOptString8;
                            tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                            ConnectionsManager.getInstance(this.I).sendRequest(tL_payments_getPaymentForm, new cg.y(this, strOptString8, tL_inputInvoiceSlug, 23));
                        }
                    } catch (JSONException e13) {
                        FileLog.e(e13);
                        return;
                    }
                    break;
                case 7:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        try {
                            JSONObject jSONObject5 = new JSONObject(str2);
                            j10 = Long.parseLong(jSONObject5.getString("custom_emoji_id"));
                            try {
                                i12 = jSONObject5.getInt("duration");
                            } catch (Exception unused) {
                                i12 = 0;
                            }
                        } catch (Exception unused2) {
                            j10 = 0;
                        }
                        long j14 = j10;
                        TLRPC.User user = this.Q;
                        if (user == null) {
                            v("emoji_status_failed", x("UNKNOWN_ERROR", "error"));
                        } else {
                            o4.f(this.I, user, j14, i12, new s(this, 0));
                        }
                        break;
                    }
                    break;
                case 8:
                    try {
                        JSONObject jSONObject6 = new JSONObject(str2);
                        boolean zOptBoolean6 = jSONObject6.optBoolean("is_active", false);
                        String strTrim = jSONObject6.optString("text", this.F).trim();
                        boolean z11 = jSONObject6.optBoolean("is_visible", false) && !TextUtils.isEmpty(strTrim);
                        int color = jSONObject6.has("color") ? Color.parseColor(jSONObject6.optString("color")) : this.D;
                        int color2 = jSONObject6.has("text_color") ? Color.parseColor(jSONObject6.optString("text_color")) : this.E;
                        boolean z12 = jSONObject6.optBoolean("is_progress_visible", false) && z11;
                        boolean z13 = jSONObject6.optBoolean("has_shine_effect", false) && z11;
                        String strOptString9 = jSONObject6.has("position") ? jSONObject6.optString("position") : this.G;
                        if (strOptString9 == null) {
                            strOptString9 = "left";
                        }
                        try {
                            j11 = Long.parseLong(jSONObject6.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused3) {
                            j11 = 0;
                        }
                        this.D = color;
                        this.E = color2;
                        this.F = strTrim;
                        this.G = strOptString9;
                        this.H = str2;
                        this.f44061c.l(z11, zOptBoolean6, strTrim, j11, color, color2, z12, z13, strOptString9);
                    } catch (Exception e14) {
                        FileLog.e(e14);
                        return;
                    }
                    break;
                case 9:
                    try {
                        this.f44061c.k(new JSONObject(str2).optBoolean("need_confirmation"));
                    } catch (JSONException e15) {
                        FileLog.e(e15);
                        return;
                    }
                    break;
                case 10:
                    try {
                        if (!this.f44063d0 && this.S != null) {
                            this.f44065e0 = new JSONObject(str2).optString("text");
                            this.f44063d0 = true;
                            if (Build.VERSION.SDK_INT < 23 || this.S.checkSelfPermission("android.permission.CAMERA") == 0) {
                                Activity activity = this.S;
                                if (activity != null) {
                                    this.f44062c0 = t9.e0(activity, 3, new n2.b0(this, 13));
                                }
                            } else {
                                NotificationCenter.getGlobalInstance().addObserver(new b0(this), NotificationCenter.onRequestPermissionResultReceived);
                                this.S.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                            }
                        }
                    } catch (JSONException e16) {
                        FileLog.e(e16);
                        return;
                    }
                    break;
                case 11:
                    if (!m(4)) {
                        int i19 = this.I;
                        w0 w0Var2 = this.f44057a;
                        String[] strArr = {"cancelled"};
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), c6Var);
                        alertDialog$Builder2.l(LocaleController.getString(R.string.ShareYouPhoneNumberTitle));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        String userName = UserObject.getUserName(this.Q);
                        if (TextUtils.isEmpty(userName)) {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot)));
                        } else {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureShareMyContactInfoWebapp, userName)));
                        }
                        boolean z14 = MessagesController.getInstance(this.I).blockePeers.indexOfKey(this.Q.f22527id) >= 0;
                        if (z14) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AreYouSureShareMyContactInfoBotUnblock));
                        }
                        alertDialog$Builder2.g(spannableStringBuilder);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareContact), new k2(this, strArr, z14, i19, w0Var2));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new j70(16));
                        R(4, alertDialog$Builder2.a(), new x(strArr, i19, w0Var2, 0));
                    } else {
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("status", "cancelled");
                            v("phone_requested", jSONObject7);
                        } catch (Exception e17) {
                            FileLog.e(e17);
                            return;
                        }
                    }
                    break;
                case 12:
                    w();
                    break;
                case 13:
                    if (this.Q != null) {
                        if (this.f44071j0 == null) {
                            getContext();
                            int i20 = this.I;
                            this.f44071j0 = new nh.o1(UserConfig.getInstance(i20).getClientUserId(), this.Q.f22527id, i20, true);
                        }
                        l(this.f44071j0, str2, "secure_storage_key_received", "secure_storage_failed");
                        break;
                    }
                    break;
                case 14:
                    if (this.f44068g0 == null) {
                        nh.t0 t0VarE = nh.t0.e(getContext(), this.I, this.Q.f22527id);
                        this.f44068g0 = t0VarE;
                        t0VarE.f18968f.add(uVar);
                    }
                    uVar.run();
                    break;
                case 15:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        this.L = 0L;
                        n2 n2VarU = LaunchActivity.U();
                        if (n2VarU != null && n2VarU.getParentLayout() != null) {
                            b5 parentLayout = n2VarU.getParentLayout();
                            n2VarU.presentFragment(ProfileActivity.m4(this.Q.f22527id));
                            AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionBiometry");
                            f0 f0Var = this.f44061c;
                            if (f0Var != null) {
                                f0Var.b();
                            }
                            break;
                        }
                    }
                    break;
                case 16:
                    n(!((getParent() instanceof d4) && ((d4) getParent()).d()), true);
                    break;
                case 17:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        o4.a(this.I, this.Q.f22527id, new s(this, 1));
                        break;
                    }
                    break;
                case 18:
                    nh.x0 x0VarZ = this.f44061c.z();
                    if (x0VarZ == null || !x0VarZ.h()) {
                        v("device_orientation_failed", x("UNSUPPORTED", "error"));
                    } else {
                        v("device_orientation_stopped", null);
                    }
                    break;
                case 19:
                    if (this.Q != null) {
                        if (this.f44070i0 == null) {
                            getContext();
                            int i21 = this.I;
                            this.f44070i0 = new nh.o1(UserConfig.getInstance(i21).getClientUserId(), this.Q.f22527id, i21, false);
                        }
                        P(this.f44070i0, str2, "device_storage_key_saved", "device_storage_failed");
                        break;
                    }
                    break;
                case 20:
                    if (this.Q != null) {
                        if (this.f44070i0 == null) {
                            getContext();
                            int i22 = this.I;
                            this.f44070i0 = new nh.o1(UserConfig.getInstance(i22).getClientUserId(), this.Q.f22527id, i22, false);
                        }
                        l(this.f44070i0, str2, "device_storage_key_received", "device_storage_failed");
                        break;
                    }
                    break;
                case 21:
                    try {
                        string = new JSONObject(str2).getString("reason");
                    } catch (Exception unused4) {
                        string = null;
                    }
                    f();
                    nh.q qVar = this.f44067f0;
                    if (qVar != null) {
                        if (qVar.f18890e) {
                            qVar.j(string, true, null, new jh.z(2, qVar, new s(this, 4)));
                        } else {
                            try {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("status", "failed");
                                v("biometry_auth_requested", jSONObject8);
                            } catch (Exception e18) {
                                FileLog.e(e18);
                                return;
                            }
                        }
                        break;
                    }
                    break;
                case 22:
                    try {
                        z10 = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused5) {
                        z10 = false;
                    }
                    f0 f0Var2 = this.f44061c;
                    if (f0Var2 != null) {
                        f0Var2.p(z10);
                    }
                    break;
                case 23:
                    try {
                        JSONArray jSONArray2 = new JSONArray(str2);
                        zOptBoolean2 = jSONArray2.optBoolean(0, true);
                        try {
                            zOptBoolean3 = jSONArray2.optBoolean(1, true);
                        } catch (Exception unused6) {
                            zOptBoolean3 = true;
                        }
                    } catch (Exception unused7) {
                        zOptBoolean2 = true;
                    }
                    g("allowScroll " + zOptBoolean2 + " " + zOptBoolean3);
                    if (getParent() instanceof d4) {
                        ((d4) getParent()).a(zOptBoolean2, zOptBoolean3);
                    }
                    break;
                case 24:
                    try {
                        JSONObject jSONObject9 = new JSONObject(str2);
                        String strOptString10 = jSONObject9.optString("path_full");
                        boolean zOptBoolean7 = jSONObject9.optBoolean("force_request", false);
                        if (strOptString10.startsWith("/")) {
                            strOptString10 = strOptString10.substring(1);
                        }
                        D(Uri.parse("https://t.me/" + strOptString10), null, false, true, zOptBoolean7);
                    } catch (JSONException e19) {
                        FileLog.e(e19);
                        return;
                    }
                    break;
                case 25:
                    if (this.Q != null) {
                        if (this.f44071j0 == null) {
                            getContext();
                            int i23 = this.I;
                            this.f44071j0 = new nh.o1(UserConfig.getInstance(i23).getClientUserId(), this.Q.f22527id, i23, true);
                        }
                        M(this.f44071j0, str2);
                        break;
                    }
                    break;
                case 26:
                    if (System.currentTimeMillis() - this.L <= 10000 && System.currentTimeMillis() - this.M >= 2000) {
                        this.L = 0L;
                        this.M = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject10 = new JSONObject(str2);
                            strOptString = jSONObject10.optString("media_url");
                            try {
                                strOptString2 = jSONObject10.optString("text");
                                try {
                                    JSONObject jSONObjectOptJSONObject = jSONObject10.optJSONObject("widget_link");
                                    if (jSONObjectOptJSONObject != null) {
                                        strOptString3 = jSONObjectOptJSONObject.optString("url");
                                        try {
                                            strOptString4 = jSONObjectOptJSONObject.optString("name");
                                        } catch (Exception e20) {
                                            e = e20;
                                            FileLog.e(e);
                                            str3 = null;
                                        }
                                    } else {
                                        strOptString4 = null;
                                        strOptString3 = null;
                                    }
                                    str3 = strOptString4;
                                } catch (Exception e21) {
                                    e = e21;
                                    strOptString3 = null;
                                }
                            } catch (Exception e22) {
                                e = e22;
                                strOptString2 = null;
                                strOptString3 = strOptString2;
                                FileLog.e(e);
                                str3 = null;
                                str4 = strOptString;
                                if (str4 != null) {
                                    return;
                                }
                                if (!MessagesController.getInstance(this.I).storiesEnabled()) {
                                    new ag.g2((n2) new r2(this), 14, true).show();
                                    return;
                                }
                                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this.S);
                                new HttpGetFileTask(new w1(this, b2Var, strOptString2, strOptString3, str3, 2), null).execute(str4);
                                b2Var.q(250L);
                                return;
                            }
                        } catch (Exception e23) {
                            e = e23;
                            strOptString = null;
                            strOptString2 = null;
                        }
                        str4 = strOptString;
                        if (str4 != null) {
                            if (!MessagesController.getInstance(this.I).storiesEnabled()) {
                                new ag.g2((n2) new r2(this), 14, true).show();
                            } else {
                                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(this.S);
                                new HttpGetFileTask(new w1(this, b2Var2, strOptString2, strOptString3, str3, 2), null).execute(str4);
                                b2Var2.q(250L);
                            }
                        }
                        break;
                    }
                    break;
                case 27:
                    if (this.Q != null) {
                        if (this.f44068g0 == null) {
                            nh.t0 t0VarE2 = nh.t0.e(getContext(), this.I, this.Q.f22527id);
                            this.f44068g0 = t0VarE2;
                            t0VarE2.f18968f.add(uVar);
                        }
                        if (this.f44068g0.g()) {
                            this.f44068g0.k(new r(this, 1));
                        } else {
                            this.f44068g0.j(new s(this, 2));
                        }
                        break;
                    }
                    break;
                case 28:
                    nh.x0 x0VarZ2 = this.f44061c.z();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                        break;
                    } catch (Exception unused8) {
                    }
                    long jClamp = Utilities.clamp(j13, 1000L, 20L);
                    if (x0VarZ2 == null || !x0VarZ2.d(jClamp)) {
                        v("gyroscope_failed", x("UNSUPPORTED", "error"));
                    } else {
                        v("gyroscope_started", null);
                    }
                    break;
                case 29:
                    try {
                        zOptBoolean = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e24) {
                        FileLog.e(e24);
                        zOptBoolean = false;
                    }
                    this.f44061c.y();
                    if (zOptBoolean) {
                        if (this.f44089x0 && LaunchActivity.C1 != null) {
                            Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
                            if (activityFindActivity == null) {
                                activityFindActivity = LaunchActivity.C1;
                            }
                            if (activityFindActivity != null && !activityFindActivity.isFinishing()) {
                                activityFindActivity.moveTaskToBack(true);
                                break;
                            }
                        } else if (this.f44091y0 != null && (launchActivity = LaunchActivity.C1) != null && launchActivity.P() != null) {
                            m3 m3VarP = LaunchActivity.C1.P();
                            ArrayList<l3> tabs = m3VarP.getTabs();
                            for (int i24 = 0; i24 < tabs.size(); i24++) {
                                l3 l3Var2 = tabs.get(i24);
                                if (this.f44091y0.equals(l3Var2.f23623a) && l3Var2.f23624b != this.f44057a) {
                                    l3Var = l3Var2;
                                    if (l3Var != null) {
                                        m3VarP.e(l3Var);
                                    }
                                }
                                break;
                            }
                            if (l3Var != null) {
                                m3VarP.e(l3Var);
                            }
                            break;
                        }
                    }
                    break;
                case 30:
                    O(this.f44057a.getUrl(), true);
                    break;
                case 31:
                    try {
                        String string10 = new JSONObject(str2).getString("req_id");
                        if (this.f44061c.h() && System.currentTimeMillis() - this.L <= 10000) {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            v("clipboard_text_received", new JSONObject().put("req_id", string10).put("data", text != null ? text.toString() : ""));
                        }
                        v("clipboard_text_received", new JSONObject().put("req_id", string10));
                    } catch (JSONException e25) {
                        FileLog.e(e25);
                        return;
                    }
                    break;
                case 32:
                    Activity activityFindActivity2 = AndroidUtilities.findActivity(getContext());
                    if (activityFindActivity2 == null) {
                        activityFindActivity2 = LaunchActivity.C1;
                    }
                    if (activityFindActivity2 != null) {
                        AndroidUtilities.hideKeyboard(activityFindActivity2.getCurrentFocus());
                    }
                    break;
                case 33:
                    nh.x0 x0VarZ3 = this.f44061c.z();
                    if (x0VarZ3 == null || !x0VarZ3.g()) {
                        v("gyroscope_failed", x("UNSUPPORTED", "error"));
                    } else {
                        v("gyroscope_stopped", null);
                    }
                    break;
                case 34:
                    if (this.Q != null) {
                        if (this.f44071j0 == null) {
                            getContext();
                            int i25 = this.I;
                            this.f44071j0 = new nh.o1(UserConfig.getInstance(i25).getClientUserId(), this.Q.f22527id, i25, true);
                        }
                        e(this.f44071j0, str2, "secure_storage_cleared", "secure_storage_cleared");
                        break;
                    }
                    break;
                case 35:
                    if (this.Q != null) {
                        if (this.f44070i0 == null) {
                            getContext();
                            int i26 = this.I;
                            this.f44070i0 = new nh.o1(UserConfig.getInstance(i26).getClientUserId(), this.Q.f22527id, i26, false);
                        }
                        e(this.f44070i0, str2, "device_storage_cleared", "device_storage_failed");
                        break;
                    }
                    break;
                case 36:
                    nh.x0 x0VarZ4 = this.f44061c.z();
                    try {
                        j13 = new JSONObject(str2).getLong("refresh_rate");
                        break;
                    } catch (Exception unused9) {
                    }
                    long jClamp2 = Utilities.clamp(j13, 1000L, 20L);
                    if (x0VarZ4 == null || !x0VarZ4.c(jClamp2)) {
                        v("accelerometer_failed", x("UNSUPPORTED", "error"));
                    } else {
                        v("accelerometer_started", null);
                    }
                    break;
                case 37:
                    nh.x0 x0VarZ5 = this.f44061c.z();
                    if (x0VarZ5 == null || !x0VarZ5.f()) {
                        v("accelerometer_failed", x("UNSUPPORTED", "error"));
                    } else {
                        v("accelerometer_stopped", null);
                    }
                    break;
                case 38:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        try {
                            String string11 = new JSONObject(str2).getString("id");
                            if (TextUtils.isEmpty(string11)) {
                                v("prepared_message_failed", x("MESSAGE_EXPIRED", "error"));
                            } else {
                                nh.k1.Q(getContext(), this.I, this.Q.f22527id, string11, this.f44064e, new u(this, 0), new cg.u0(26, this, botWebViewContainer$BotWebViewProxy));
                            }
                        } catch (Exception e26) {
                            FileLog.e(e26);
                            v("prepared_message_failed", x("MESSAGE_EXPIRED", "error"));
                            return;
                        }
                        break;
                    }
                    break;
                case 39:
                    try {
                        this.f44061c.e(new JSONObject(str2).optString("data"));
                    } catch (JSONException e27) {
                        FileLog.e(e27);
                        return;
                    }
                    break;
                case 40:
                    J(this.B0, true);
                    break;
                case 41:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        if (MediaDataController.getInstance(this.I).isShortcutAdded(this.Q.f22527id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                            v("home_screen_added", null);
                        } else {
                            MediaDataController.getInstance(this.I).installShortcut(this.Q.f22527id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT, new r(this, 0));
                        }
                        break;
                    }
                    break;
                case 42:
                    try {
                        zOptBoolean4 = new JSONObject(str2).optBoolean("blur", true);
                    } catch (Exception unused10) {
                        zOptBoolean4 = true;
                    }
                    String strG = this.f44061c.g(true, zOptBoolean4);
                    if (strG == null) {
                        v("fullscreen_changed", y("is_fullscreen", Boolean.TRUE, "blur_enabled", Boolean.valueOf(zOptBoolean4)));
                    } else {
                        v("fullscreen_failed", x(strG, "error"));
                    }
                    break;
                case 43:
                    try {
                        JSONObject jSONObject11 = new JSONObject(str2);
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray3 = jSONObject11.getJSONArray("chat_types");
                        for (int i27 = 0; i27 < jSONArray3.length(); i27++) {
                            arrayList2.add(jSONArray3.getString(i27));
                        }
                        this.f44061c.v(this.Q, jSONObject11.getString("query"), arrayList2);
                    } catch (JSONException e28) {
                        FileLog.e(e28);
                        return;
                    }
                    break;
                case 44:
                    if (this.Q != null) {
                        if (this.f44071j0 == null) {
                            getContext();
                            int i28 = this.I;
                            this.f44071j0 = new nh.o1(UserConfig.getInstance(i28).getClientUserId(), this.Q.f22527id, i28, true);
                        }
                        P(this.f44071j0, str2, "secure_storage_key_saved", "secure_storage_failed");
                        break;
                    }
                    break;
                case 45:
                    String strG2 = this.f44061c.g(false, true);
                    if (strG2 == null) {
                        v("fullscreen_changed", x(Boolean.FALSE, "is_fullscreen"));
                    } else {
                        v("fullscreen_failed", x(strG2, "error"));
                    }
                    break;
                case 46:
                    if (this.H0 != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z15 = jSONObject12.getBoolean("passed");
                            final double d = jSONObject12.getDouble("age");
                            final String strOptString11 = jSONObject12.optString("gender");
                            final double dOptDouble = jSONObject12.optDouble("genderProbability");
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f44012a.H0.run(Boolean.valueOf(z15), Double.valueOf(d), strOptString11, Double.valueOf(dOptDouble));
                                }
                            });
                        } catch (Exception e29) {
                            FileLog.e(e29);
                            return;
                        }
                    }
                    break;
                case 47:
                    if (this.Q != null && System.currentTimeMillis() - this.L <= 10000) {
                        this.L = 0L;
                        n2 n2VarU2 = LaunchActivity.U();
                        if (n2VarU2 != null && n2VarU2.getParentLayout() != null) {
                            b5 parentLayout2 = n2VarU2.getParentLayout();
                            n2VarU2.presentFragment(ProfileActivity.m4(this.Q.f22527id));
                            AndroidUtilities.scrollToFragmentRow(parentLayout2, "botPermissionLocation");
                            f0 f0Var3 = this.f44061c;
                            if (f0Var3 != null) {
                                f0Var3.b();
                            }
                            break;
                        }
                    }
                    break;
                case 48:
                    try {
                        boolean zOptBoolean8 = new JSONObject(str2).optBoolean("is_visible");
                        if (zOptBoolean8 != this.N) {
                            this.N = zOptBoolean8;
                            this.f44061c.i(zOptBoolean8);
                        }
                    } catch (JSONException e30) {
                        FileLog.e(e30);
                        return;
                    }
                    break;
                case 49:
                    try {
                        string2 = new JSONObject(str2).getString("reason");
                        break;
                    } catch (Exception unused11) {
                    }
                    f();
                    nh.q qVar2 = this.f44067f0;
                    if (qVar2 != null) {
                        boolean z16 = qVar2.f18891f;
                        if (z16) {
                            t();
                        } else if (qVar2.f18890e) {
                            if (!z16) {
                                qVar2.f18891f = true;
                                qVar2.k();
                            }
                            t();
                        } else {
                            final Runnable[] runnableArr = {new u(this, 3)};
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getContext(), c6Var);
                            if (TextUtils.isEmpty(string2)) {
                                alertDialog$Builder3.l(LocaleController.getString(R.string.BotAllowBiometryTitle));
                                i10 = 0;
                                alertDialog$Builder3.g(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.Q))));
                            } else {
                                i10 = 0;
                                alertDialog$Builder3.l(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.Q))));
                                alertDialog$Builder3.g(string2);
                            }
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) {

                                public final z0 f43772b;

                                {
                                    this.f43772b = this;
                                }

                                @Override
                                public final void f(org.telegram.ui.ActionBar.b2 b2Var3, int i29) {
                                    switch (i10) {
                                        case 0:
                                            Runnable[] runnableArr2 = runnableArr;
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            z0 z0Var = this.f43772b;
                                            nh.q qVar3 = z0Var.f44067f0;
                                            qVar3.f18891f = true;
                                            qVar3.k();
                                            nh.q qVar4 = z0Var.f44067f0;
                                            s sVar = new s(z0Var, 3);
                                            qVar4.getClass();
                                            qVar4.j(null, true, null, new jh.z(2, qVar4, sVar));
                                            break;
                                        default:
                                            z0 z0Var2 = this.f43772b;
                                            z0Var2.getClass();
                                            Runnable[] runnableArr3 = runnableArr;
                                            if (runnableArr3[0] != null) {
                                                runnableArr3[0] = null;
                                            }
                                            nh.q qVar5 = z0Var2.f44067f0;
                                            qVar5.f18891f = true;
                                            qVar5.d = true;
                                            qVar5.k();
                                            z0Var2.t();
                                            break;
                                    }
                                }
                            });
                            final int i29 = 1;
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2(this) {

                                public final z0 f43772b;

                                {
                                    this.f43772b = this;
                                }

                                @Override
                                public final void f(org.telegram.ui.ActionBar.b2 b2Var3, int i210) {
                                    switch (i29) {
                                        case 0:
                                            Runnable[] runnableArr2 = runnableArr;
                                            if (runnableArr2[0] != null) {
                                                runnableArr2[0] = null;
                                            }
                                            z0 z0Var = this.f43772b;
                                            nh.q qVar3 = z0Var.f44067f0;
                                            qVar3.f18891f = true;
                                            qVar3.k();
                                            nh.q qVar4 = z0Var.f44067f0;
                                            s sVar = new s(z0Var, 3);
                                            qVar4.getClass();
                                            qVar4.j(null, true, null, new jh.z(2, qVar4, sVar));
                                            break;
                                        default:
                                            z0 z0Var2 = this.f43772b;
                                            z0Var2.getClass();
                                            Runnable[] runnableArr3 = runnableArr;
                                            if (runnableArr3[0] != null) {
                                                runnableArr3[0] = null;
                                            }
                                            nh.q qVar5 = z0Var2.f44067f0;
                                            qVar5.f18891f = true;
                                            qVar5.d = true;
                                            qVar5.k();
                                            z0Var2.t();
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder3.j(new ag.j0(runnableArr, 8));
                            alertDialog$Builder3.o();
                        }
                        break;
                    }
                    break;
                case 50:
                    try {
                        JSONObject jSONObject13 = new JSONObject(str2);
                        String strOptString12 = jSONObject13.optString("type");
                        int iHashCode = strOptString12.hashCode();
                        if (iHashCode == -1184809658) {
                            if (strOptString12.equals("impact")) {
                                String strOptString13 = jSONObject13.optString("impact_style");
                                switch (strOptString13.hashCode()) {
                                    case -1078030475:
                                        if (strOptString13.equals("medium")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_MEDIUM;
                                        }
                                        break;
                                    case 3535914:
                                        if (strOptString13.equals("soft")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_SOFT;
                                        }
                                        break;
                                    case 99152071:
                                        if (strOptString13.equals("heavy")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_HEAVY;
                                        }
                                        break;
                                    case 102970646:
                                        if (strOptString13.equals("light")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_LIGHT;
                                        }
                                        break;
                                    case 108511787:
                                        if (strOptString13.equals("rigid")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_RIGID;
                                        }
                                        break;
                                }
                            }
                        } else if (iHashCode != 193071555) {
                            if (iHashCode == 595233003 && strOptString12.equals("notification")) {
                                String strOptString14 = jSONObject13.optString("notification_type");
                                int iHashCode2 = strOptString14.hashCode();
                                if (iHashCode2 != -1867169789) {
                                    if (iHashCode2 != 96784904) {
                                        if (iHashCode2 == 1124446108 && strOptString14.equals("warning")) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_WARNING;
                                        }
                                    } else if (strOptString14.equals("error")) {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_ERROR;
                                    }
                                } else if (strOptString14.equals("success")) {
                                    botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_SUCCESS;
                                }
                            }
                        } else if (strOptString12.equals("selection_change")) {
                            botWebViewVibrationEffect = BotWebViewVibrationEffect.SELECTION_CHANGE;
                        }
                        if (botWebViewVibrationEffect != null) {
                            botWebViewVibrationEffect.vibrate();
                        }
                    } catch (Exception e31) {
                        FileLog.e(e31);
                        return;
                    }
                    break;
                case 51:
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean zOptBoolean9 = jSONObject14.optBoolean("is_active", false);
                        String strTrim2 = jSONObject14.optString("text", this.B).trim();
                        boolean z17 = jSONObject14.optBoolean("is_visible", false) && !TextUtils.isEmpty(strTrim2);
                        int color3 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.f44090y;
                        int color4 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.A;
                        boolean z18 = jSONObject14.optBoolean("is_progress_visible", false) && z17;
                        boolean z19 = jSONObject14.optBoolean("has_shine_effect", false) && z17;
                        try {
                            j12 = Long.parseLong(jSONObject14.getString("icon_custom_emoji_id"));
                        } catch (Throwable unused12) {
                            j12 = 0;
                        }
                        this.f44090y = color3;
                        this.A = color4;
                        this.B = strTrim2;
                        this.C = str2;
                        this.f44061c.q(z17, zOptBoolean9, strTrim2, j12, color3, color4, z18, z19);
                    } catch (Exception e32) {
                        FileLog.e(e32);
                        return;
                    }
                    break;
                case 52:
                    try {
                        this.f44061c.x(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                    } catch (JSONException e33) {
                        FileLog.e(e33);
                        return;
                    }
                    break;
                case 53:
                    try {
                        boolean zOptBoolean10 = new JSONObject(str2).optBoolean("is_visible");
                        if (zOptBoolean10 != this.O) {
                            this.O = zOptBoolean10;
                            this.f44061c.t(zOptBoolean10);
                        }
                    } catch (JSONException e34) {
                        FileLog.e(e34);
                        return;
                    }
                    break;
                case 54:
                    v("home_screen_checked", x((this.Q == null || Build.VERSION.SDK_INT < 26) ? "unsupported" : MediaDataController.getInstance(this.I).isShortcutAdded(this.Q.f22527id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT) ? "added" : "missed", "status"));
                    break;
                case 55:
                    try {
                        strOptString5 = new JSONObject(str2).optString("req_id");
                    } catch (Exception e35) {
                        FileLog.e(e35);
                    }
                    if (strOptString5 != null) {
                        TL_bots.getRequestedWebViewButton getrequestedwebviewbutton = new TL_bots.getRequestedWebViewButton();
                        getrequestedwebviewbutton.bot = MessagesController.getInstance(this.I).getInputUser(this.Q);
                        getrequestedwebviewbutton.webapp_req_id = strOptString5;
                        int i30 = 0;
                        ConnectionsManager.getInstance(this.I).sendRequestTyped(getrequestedwebviewbutton, new kb0(i30), new w(this, strOptString5, i30));
                        break;
                    }
                    break;
                case 56:
                    nh.x0 x0VarZ6 = this.f44061c.z();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j13 = jSONObject15.getLong("refresh_rate");
                        zOptBoolean5 = jSONObject15.optBoolean("need_absolute", false);
                    } catch (Exception unused13) {
                        zOptBoolean5 = false;
                    }
                    long jClamp3 = Utilities.clamp(j13, 1000L, 20L);
                    if (x0VarZ6 == null || !x0VarZ6.e(jClamp3, zOptBoolean5)) {
                        v("device_orientation_failed", x("UNSUPPORTED", "error"));
                    } else {
                        v("device_orientation_started", null);
                    }
                    break;
                case 57:
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        String string12 = jSONObject16.getString("token");
                        try {
                            string3 = jSONObject16.getString("reason");
                            break;
                        } catch (Exception unused14) {
                        }
                        f();
                        nh.q qVar3 = this.f44067f0;
                        if (qVar3 != null) {
                            if (qVar3.f18890e) {
                                qVar3.l(string3, string12, new ib0(14, this, string12));
                            } else {
                                try {
                                    JSONObject jSONObject17 = new JSONObject();
                                    jSONObject17.put("status", "failed");
                                    v("biometry_token_updated", jSONObject17);
                                } catch (Exception e36) {
                                    FileLog.e(e36);
                                    return;
                                }
                            }
                            break;
                        }
                    } catch (Exception e37) {
                        FileLog.e(e37);
                        if (e37 instanceof JSONException) {
                            i("JSON Parse error");
                            return;
                        } else {
                            S(null);
                            return;
                        }
                    }
                    break;
                case 58:
                    try {
                        String strOptString15 = new JSONObject(str2).optString("color", null);
                        int iV0 = TextUtils.isEmpty(strOptString15) ? g6.v0(g6.f22999a7, c6Var) : Color.parseColor(strOptString15);
                        f0 f0Var4 = this.f44061c;
                        if (f0Var4 != null) {
                            f0Var4.r(iV0);
                        }
                    } catch (Exception e38) {
                        FileLog.e(e38);
                        return;
                    }
                    break;
                case 59:
                    try {
                        JSONObject jSONObject18 = new JSONObject(str2);
                        String strOptString16 = jSONObject18.optString("color", null);
                        if (TextUtils.isEmpty(strOptString16)) {
                            String strOptString17 = jSONObject18.optString("color_key");
                            int iHashCode3 = strOptString17.hashCode();
                            if (iHashCode3 != -1265068311) {
                                if (iHashCode3 == -210781868 && strOptString17.equals("secondary_bg_color")) {
                                    i11 = g6.f22999a7;
                                } else {
                                    i11 = -1;
                                }
                            } else if (strOptString17.equals("bg_color")) {
                                i11 = g6.f23053d6;
                            } else {
                                i11 = -1;
                            }
                            if (i11 >= 0) {
                                this.f44061c.u(i11, g6.v0(i11, c6Var), false);
                            }
                        } else {
                            int color5 = Color.parseColor(strOptString16);
                            if (color5 != 0) {
                                this.f44061c.u(-1, color5, true);
                            }
                        }
                    } catch (Exception e39) {
                        FileLog.e(e39);
                        return;
                    }
                    break;
                case 60:
                    K(this.A0, true);
                    break;
                case 61:
                    try {
                        this.f44061c.m(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                    } catch (Exception e40) {
                        FileLog.e(e40);
                        return;
                    }
                    break;
                case 62:
                    if (!m(3)) {
                        int i31 = this.I;
                        w0 w0Var3 = this.f44057a;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = MessagesController.getInstance(this.I).getInputUser(this.Q);
                        ConnectionsManager.getInstance(this.I).sendRequest(cansendmessage, new cg.m0(this, i31, w0Var3, 9));
                    } else {
                        try {
                            JSONObject jSONObject19 = new JSONObject();
                            jSONObject19.put("status", "cancelled");
                            v("write_access_requested", jSONObject19);
                        } catch (Exception e41) {
                            FileLog.e(e41);
                            return;
                        }
                    }
                    break;
                case 63:
                    this.f44061c.s();
                    break;
                default:
                    FileLog.d("unknown webapp event ".concat(str));
                    break;
            }
        }
    }

    public final void C(String str, String str2, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            v("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (z10 || !Objects.equals(this.U, str)) {
                return;
            }
            this.U = null;
        } catch (JSONException e9) {
            FileLog.e(e9);
        }
    }

    public final void D(Uri uri, String str, boolean z10, boolean z11, boolean z12) {
        if (System.currentTimeMillis() - this.L <= 10000 || !z11) {
            this.L = 0L;
            boolean[] zArr = {false};
            if (we.e.f(uri, false, zArr) && !zArr[0] && this.f44061c != null) {
                setKeyboardFocusable(false);
            }
            we.e.r(getContext(), uri, true, z10, false, null, str, false, true, z12);
        }
    }

    public abstract void G(w0 w0Var);

    public final void J(int i10, boolean z10) {
        JSONObject jSONObject;
        if (z10 || i10 != this.B0) {
            Float fValueOf = Float.valueOf(i10 / AndroidUtilities.density);
            try {
                jSONObject = new JSONObject();
                jSONObject.put("left", (Object) 0);
                jSONObject.put("top", fValueOf);
                jSONObject.put("right", (Object) 0);
                jSONObject.put("bottom", (Object) 0);
            } catch (Exception unused) {
                jSONObject = null;
            }
            v("content_safe_area_changed", jSONObject);
            this.B0 = i10;
        }
    }

    public final void K(Rect rect, boolean z10) {
        JSONObject jSONObject;
        if (rect != null) {
            Rect rect2 = this.A0;
            if (z10 || !rect2.equals(rect)) {
                Float fValueOf = Float.valueOf(rect.left / AndroidUtilities.density);
                Float fValueOf2 = Float.valueOf(rect.top / AndroidUtilities.density);
                Float fValueOf3 = Float.valueOf(rect.right / AndroidUtilities.density);
                Float fValueOf4 = Float.valueOf(rect.bottom / AndroidUtilities.density);
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("left", fValueOf);
                    jSONObject.put("top", fValueOf2);
                    jSONObject.put("right", fValueOf3);
                    jSONObject.put("bottom", fValueOf4);
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
                B(this.f44075n0, "web_app_setup_main_button", str);
            }
            String str2 = this.H;
            if (str2 != null) {
                B(this.f44075n0, "web_app_setup_secondary_button", str2);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void M(nh.o1 o1Var, String str) {
        if (o1Var == null || this.Q == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String strOptString = jSONObject.optString("key");
                if (strOptString == null) {
                    v("secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    ArrayList arrayListH = o1Var.h(strOptString);
                    if (arrayListH.isEmpty()) {
                        v("secure_storage_failed", y("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                        return;
                    }
                    Context context = getContext();
                    cg.e1 e1Var = new cg.e1((Object) this, string, (Object) o1Var, (Object) strOptString, 15);
                    n2 n2VarU = LaunchActivity.U();
                    c6 resourceProvider = n2VarU != null ? n2VarU.getResourceProvider() : null;
                    int i10 = 1;
                    String[] strArr = new String[1];
                    boolean[] zArr = new boolean[1];
                    e3 e3VarO = org.telegram.messenger.y1.o(context, resourceProvider, false, false);
                    ViewGroup viewGroupG = org.telegram.messenger.y1.g(context, 1);
                    n9 n9Var = new n9(context);
                    ArrayList arrayList = arrayListH;
                    TLRPC.User user = MessagesController.getInstance(o1Var.f18852a).getUser(Long.valueOf(o1Var.f18853b));
                    y8 y8Var = new y8((c6) null);
                    y8Var.r(user);
                    n9Var.e(user, y8Var);
                    viewGroupG.addView(n9Var, z5.t(80, 80, 49, 0, 21, 0, 13));
                    int i11 = g6.G6;
                    TextView textViewB = d6.b(context, 20.0f, i11, true, null);
                    rl.i(R.string.BotRestoreStorageTitle, textViewB, 17);
                    viewGroupG.addView(textViewB, z5.t(-1, -2, 7, 32, 0, 32, 10));
                    TextView textViewB2 = d6.b(context, 14.0f, i11, false, null);
                    textViewB2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRestoreStorageText, DialogObject.getDialogTitle(user))));
                    textViewB2.setGravity(17);
                    viewGroupG.addView(textViewB2, z5.t(-1, -2, 7, 32, 0, 32, 19));
                    x8 x8Var = new x8(context, resourceProvider);
                    x8Var.setBackground(new dq(new ColorDrawable(g6.v0(g6.f22999a7, resourceProvider)), g6.U0(context, R.drawable.greydivider, g6.v0(g6.f23018b7, resourceProvider))));
                    x8Var.setFixedSize(12);
                    viewGroupG.addView(x8Var, z5.t(-1, 12, 7, 0, 0, 0, 0));
                    j4 j4Var = new j4(context, resourceProvider);
                    j4Var.setText(LocaleController.getString(R.string.BotRestoreStorageHeader));
                    viewGroupG.addView(j4Var, z5.t(-1, -2, 7, 0, 0, 0, 0));
                    lh.d dVar = new lh.d(context, resourceProvider, true);
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        ArrayList arrayList3 = arrayList;
                        nh.n1 n1Var = (nh.n1) arrayList3.get(i12);
                        nh.m1 m1Var = new nh.m1(n1Var, i12 < arrayList3.size() - i10, context);
                        m1Var.setBackground(g6.f0(g6.v0(g6.f23144i6, resourceProvider), 2, -1));
                        ViewGroup viewGroup = viewGroupG;
                        m1Var.setOnClickListener(new a4(strArr, n1Var, arrayList2, dVar, 3));
                        viewGroup.addView(m1Var, z5.n(-1, 56));
                        arrayList2.add(m1Var);
                        i12++;
                        arrayList = arrayList3;
                        e3VarO = e3VarO;
                        viewGroupG = viewGroup;
                        e1Var = e1Var;
                        i10 = 1;
                    }
                    cg.e1 e1Var2 = e1Var;
                    e3 e3Var = e3VarO;
                    ViewGroup viewGroup2 = viewGroupG;
                    dVar.g(LocaleController.getString(R.string.BotRestoreStorageButton), false, true);
                    dVar.setEnabled(strArr[0] != null);
                    viewGroup2.addView(dVar, z5.t(-1, 48, 7, 8, 8, 8, 4));
                    e3Var.customView = viewGroup2;
                    e3Var.fixNavigationBar(g6.v0(g6.f23124h5, resourceProvider));
                    dVar.setOnClickListener(new a4(zArr, e1Var2, strArr, e3Var, 4));
                    e3Var.setOnDismissListener(new cg.g(3, zArr, e1Var2));
                    e3Var.show();
                } catch (Exception e9) {
                    v("secure_storage_failed", y("req_id", string, "error", e9.getMessage()));
                }
            } catch (Exception unused) {
                v("secure_storage_failed", y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v("secure_storage_failed", y("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public void O(String str, boolean z10) {
        w0 w0Var = this.f44057a;
        if (w0Var != null) {
            boolean z11 = w0Var.A;
        }
        boolean z12 = w0Var == null || !w0Var.canGoBack();
        w0 w0Var2 = this.f44057a;
        F(z12, w0Var2 == null || !w0Var2.canGoForward());
        w0 w0Var3 = this.f44057a;
        if (w0Var3 != null) {
            w0Var3.f44024b = true;
        }
        if (this.J) {
            g("setPageLoaded: already loaded");
            return;
        }
        z3 z3Var = this.f44081s;
        if (!z10 || w0Var3 == null || z3Var == null) {
            if (w0Var3 != null) {
                w0Var3.setAlpha(1.0f);
            }
            if (z3Var != null) {
                z3Var.setAlpha(0.0f);
                z3Var.setVisibility(8);
            }
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f44057a, (Property<w0, Float>) property, 1.0f), ObjectAnimator.ofFloat(z3Var, (Property<z3, Float>) property, 0.0f));
            animatorSet.addListener(new zb1(this, 6));
            animatorSet.start();
        }
        this.f44059b = str;
        g("setPageLoaded: isPageLoaded = true!");
        this.J = true;
        this.f44061c.getClass();
    }

    public final void P(nh.o1 o1Var, String str, String str2, String str3) {
        if (o1Var == null || this.Q == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String strOptString = jSONObject.optString("key");
                if (strOptString == null) {
                    v(str3, y("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    try {
                        o1Var.n(strOptString, jSONObject.optString("value"));
                        v(str2, x(string, "req_id"));
                    } catch (RuntimeException e9) {
                        v(str3, y("req_id", string, "error", e9.getMessage()));
                    }
                } catch (Exception unused) {
                    v(str3, y("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                v(str3, y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void Q(w0 w0Var, Object obj) {
        w0 w0Var2;
        String str;
        TLRPC.User user;
        String upperCase = "";
        w0 w0Var3 = this.f44057a;
        if (w0Var3 != null) {
            w0Var3.destroy();
            removeView(this.f44057a);
        }
        if (w0Var != null) {
            AndroidUtilities.removeFromParent(w0Var);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(SharedConfig.debugWebView && !p());
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (w0Var == null) {
            Context context = getContext();
            boolean z10 = this.f44072k0;
            long j10 = 0;
            if (z10 && (user = this.Q) != null) {
                j10 = user.f22527id;
            }
            w0Var2 = new w0(context, z10, j10);
        } else {
            w0Var2 = w0Var;
        }
        this.f44057a = w0Var2;
        if (this.f44072k0) {
            w0Var2.setBackgroundColor(j(g6.f23053d6));
        } else {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.f44057a, true);
            CookieManager.getInstance().flush();
            this.f44057a.f44027f = this.f44077p0;
        }
        if (!MessagesController.getInstance(this.I).disableBotFullscreenBlur) {
            this.f44057a.setLayerType(2, null);
        }
        this.f44057a.f(this, this.d);
        this.f44057a.setCloseListener(this.f44087w0);
        WebSettings settings = this.f44057a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.f44072k0) {
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
            String strReplace = settings.getUserAgentString().replace("; wv)", ")");
            StringBuilder sb2 = new StringBuilder("(Linux; Android ");
            String str2 = Build.VERSION.RELEASE;
            sb2.append(str2);
            sb2.append("; K)");
            String strReplaceAll = strReplace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb2.toString()).replaceAll("Version/[\\d\\.]+ ", "");
            if (this.f44072k0) {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                if (devicePerformanceClass == 0) {
                    str = "LOW";
                } else {
                    str = devicePerformanceClass == 1 ? "AVERAGE" : "HIGH";
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strReplaceAll);
                sb3.append(" Telegram-Android/");
                sb3.append(packageInfo.versionName);
                sb3.append(" (");
                String str3 = Build.MANUFACTURER;
                if (str3 != null) {
                    if (str3.length() <= 1) {
                        upperCase = str3.toUpperCase();
                    } else {
                        upperCase = str3.substring(0, 1).toUpperCase() + str3.substring(1).toLowerCase();
                    }
                }
                sb3.append(upperCase);
                sb3.append(" ");
                sb3.append(Build.MODEL);
                sb3.append("; Android ");
                sb3.append(str2);
                sb3.append("; SDK ");
                sb3.append(Build.VERSION.SDK_INT);
                sb3.append("; ");
                sb3.append(str);
                sb3.append(")");
                strReplaceAll = sb3.toString();
            }
            settings.setUserAgentString(strReplaceAll);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.f44057a.setVerticalScrollBarEnabled(false);
        if (w0Var == null && this.f44072k0) {
            this.f44057a.setAlpha(0.0f);
        }
        addView(this.f44057a);
        if (this.f44072k0) {
            if (obj instanceof BotWebViewContainer$BotWebViewProxy) {
                this.f44075n0 = (BotWebViewContainer$BotWebViewProxy) obj;
            }
            BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = this.f44075n0;
            if (botWebViewContainer$BotWebViewProxy == null) {
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy2 = new BotWebViewContainer$BotWebViewProxy();
                botWebViewContainer$BotWebViewProxy2.f43764a = this;
                this.f44075n0 = botWebViewContainer$BotWebViewProxy2;
                this.f44057a.addJavascriptInterface(botWebViewContainer$BotWebViewProxy2, "TelegramWebviewProxy");
            } else if (w0Var == null) {
                this.f44057a.addJavascriptInterface(botWebViewContainer$BotWebViewProxy, "TelegramWebviewProxy");
            }
            this.f44075n0.f43764a = this;
        } else {
            if (obj instanceof BotWebViewContainer$WebViewProxy) {
                this.f44076o0 = (BotWebViewContainer$WebViewProxy) obj;
            }
            BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = this.f44076o0;
            if (botWebViewContainer$WebViewProxy == null) {
                w0 w0Var4 = this.f44057a;
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy2 = new BotWebViewContainer$WebViewProxy(w0Var4, this);
                this.f44076o0 = botWebViewContainer$WebViewProxy2;
                w0Var4.addJavascriptInterface(botWebViewContainer$WebViewProxy2, "TelegramWebviewProxy");
            } else if (w0Var == null) {
                this.f44057a.addJavascriptInterface(botWebViewContainer$WebViewProxy, "TelegramWebviewProxy");
            }
            this.f44076o0.f43765a = this;
        }
        G(this.f44057a);
        I0 = false;
    }

    public final void R(int i10, org.telegram.ui.ActionBar.b2 b2Var, Runnable runnable) {
        if (b2Var == null || m(i10)) {
            return;
        }
        b2Var.setOnDismissListener(new cg.g(15, this, runnable));
        this.V = b2Var;
        b2Var.f22748d0 = false;
        b2Var.show();
        if (this.D0 != i10) {
            this.D0 = i10;
            this.E0 = 0;
            this.F0 = 0L;
        }
        this.E0++;
    }

    public final void S(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        sb2.append(str != null ? ": ".concat(str) : "");
        i(sb2.toString());
    }

    public final void c() {
        if (this.f44057a != null || this.h) {
            return;
        }
        try {
            setupWebView(null);
        } catch (Throwable th) {
            FileLog.e(th);
            this.f44081s.setVisibility(8);
            this.h = true;
            this.f44066f.setVisibility(0);
            w0 w0Var = this.f44057a;
            if (w0Var != null) {
                removeView(w0Var);
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
        gs0 gs0Var;
        Uri[] uriArr;
        if (i10 == NotificationCenter.didSetNewTheme) {
            w0 w0Var = this.f44057a;
            if (w0Var != null) {
                w0Var.setBackgroundColor(j(g6.f23053d6));
            }
            if (!this.m0) {
                int i12 = g6.Ki;
                int iJ = j(i12);
                this.f44073l0 = iJ;
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(iJ, PorterDuff.Mode.SRC_IN);
                z3 z3Var = this.f44081s;
                z3Var.setColorFilter(porterDuffColorFilter);
                SvgHelper.SvgDrawable svgDrawable = this.f44079r;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.f44073l0);
                    this.f44079r.setupGradient(i12, this.f44064e, 1.0f, false);
                }
                z3Var.invalidate();
            }
            w();
            return;
        }
        if (i10 != NotificationCenter.onActivityResultReceived) {
            if (i10 == NotificationCenter.onRequestPermissionResultReceived) {
                int iIntValue = ((Integer) objArr[0]).intValue();
                if (iIntValue != 4000 || (gs0Var = this.R) == null) {
                    return;
                }
                gs0Var.run();
                this.R = null;
                return;
            }
            return;
        }
        int iIntValue2 = ((Integer) objArr[0]).intValue();
        int iIntValue3 = ((Integer) objArr[1]).intValue();
        Intent intent = (Intent) objArr[2];
        if (iIntValue2 != 3000 || this.f44088x == null) {
            return;
        }
        if (iIntValue3 != -1 || intent == null) {
            uriArr = null;
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            uriArr = new Uri[clipData.getItemCount()];
            for (int i13 = 0; i13 < clipData.getItemCount(); i13++) {
                uriArr[i13] = clipData.getItemAt(i13).getUri();
            }
        } else if (intent.getData() != null) {
            uriArr = new Uri[]{intent.getData()};
        } else {
            uriArr = null;
        }
        this.f44088x.onReceiveValue(uriArr);
        this.f44088x = null;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f44081s) {
            if (this.v) {
                canvas.save();
                canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean zDrawChild = super.drawChild(canvas, view, j10);
            if (this.v) {
                canvas.restore();
            }
            if (!this.v) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.f44074n.a(0.0f, canvas, rectF, this);
                invalidate();
            }
            return zDrawChild;
        }
        if (view == this.f44066f) {
            canvas.save();
            canvas.translate(0.0f, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean zDrawChild2 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return zDrawChild2;
        }
        if (view == this.f44057a) {
            if (AndroidUtilities.makingGlobalBlurBitmap) {
                return true;
            }
            if (getLayerType() == 2 && !canvas.isHardwareAccelerated()) {
                return true;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(nh.o1 o1Var, String str, String str2, String str3) {
        if (o1Var == null || this.Q == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                o1Var.m(new JSONObject());
                v(str2, x(string, "req_id"));
            } catch (RuntimeException e9) {
                v(str3, y("req_id", string, "error", e9.getMessage()));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public final void f() {
        if (this.Q == null) {
            return;
        }
        nh.q qVar = this.f44067f0;
        if (qVar == null) {
            this.f44067f0 = nh.q.c(getContext(), this.I, this.Q.f22527id);
        } else {
            qVar.h();
        }
    }

    public final void g(String str) {
        FileLog.d("[webviewcontainer] #" + this.G0 + " " + str);
    }

    public BotWebViewContainer$BotWebViewProxy getBotProxy() {
        return this.f44075n0;
    }

    public int getMinHeight() {
        if (!(getParent() instanceof d4)) {
            return 0;
        }
        d4 d4Var = (d4) getParent();
        if (d4Var.F) {
            return (int) ((d4Var.getMeasuredHeight() - d4Var.getOffsetY()) + this.f44083t0);
        }
        return 0;
    }

    public String getOriginHost() {
        w0 w0Var = this.f44057a;
        if (w0Var == null) {
            return null;
        }
        return k(w0Var.getUrl());
    }

    public BotWebViewContainer$WebViewProxy getProxy() {
        return this.f44076o0;
    }

    public String getUrlLoaded() {
        return this.f44059b;
    }

    public w0 getWebView() {
        return this.f44057a;
    }

    public final void h() {
        g("destroyWebView preserving=" + this.f44085v0);
        w0 w0Var = this.f44057a;
        if (w0Var != null) {
            if (w0Var.getParent() != null) {
                removeView(this.f44057a);
            }
            if (!this.f44085v0) {
                this.f44057a.destroy();
                H(this.f44057a);
            }
            this.J = false;
            if (this.f44067f0 != null) {
                this.f44067f0 = null;
            }
            if (this.f44070i0 != null) {
                this.f44070i0 = null;
            }
            if (this.f44071j0 != null) {
                this.f44071j0 = null;
            }
            nh.t0 t0Var = this.f44068g0;
            if (t0Var != null) {
                t0Var.f18968f.remove(this.C0);
                this.f44068g0 = null;
            }
        }
    }

    public final void i(String str) {
        new mc(this, this.f44064e).Q(R.raw.error, 36, str).j();
    }

    public final int j(int i10) {
        c6 c6Var = this.f44064e;
        return c6Var != null ? c6Var.N0(i10) : g6.w0(null, i10, false);
    }

    public final void l(nh.o1 o1Var, String str, String str2, String str3) {
        Object obj;
        JSONObject jSONObject;
        if (o1Var == null || this.Q == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String string = jSONObject2.getString("req_id");
            try {
                String strOptString = jSONObject2.optString("key");
                if (strOptString == null) {
                    v(str3, y("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    Pair pairF = o1Var.f(strOptString);
                    if (o1Var.d && (obj = pairF.first) == null) {
                        Object obj2 = pairF.second;
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
                        v(str2, y("req_id", string, "value", pairF.first));
                    }
                } catch (RuntimeException e9) {
                    v(str3, y("req_id", string, "error", e9.getMessage()));
                }
            } catch (Exception unused2) {
                v(str3, y("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            if (TextUtils.isEmpty("")) {
                return;
            }
            v(str3, y("req_id", "", "error", "UNKNOWN_ERROR"));
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
        invalidate();
        if ((this.J || z11) && this.f44072k0 && (getParent() instanceof d4)) {
            d4 d4Var = (d4) getParent();
            if (z10) {
                this.K = d4Var.getSwipeOffsetY() == d4Var.getTopActionBarOffsetY() + (-d4Var.getOffsetY());
            }
            int iMax = Math.max(getMinHeight(), (int) (d4Var.getTopActionBarOffsetY() + ((d4Var.getMeasuredHeight() - d4Var.getOffsetY()) - d4Var.getSwipeOffsetY()) + this.f44083t0));
            if (!z11 && iMax == this.f44078q0 && this.f44080r0 == z10 && this.f44082s0 == this.K) {
                return;
            }
            this.f44078q0 = iMax;
            this.f44080r0 = z10;
            this.f44082s0 = this.K;
            NotificationCenter.getInstance(this.I).doOnIdle(new q(this, a9.p.m("window.Telegram.WebView.receiveEvent('viewport_changed', ", "{height:" + (iMax / AndroidUtilities.density) + ",is_state_stable:" + z10 + ",is_expanded:" + this.K + "}", ");"), 0));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        ec.a(this, new gh.w0(this, 11));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        ec.h(this);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f44084u0;
        if (i12 >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        super.onMeasure(i10, i11);
        this.f44074n.f33591f = getMeasuredWidth();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.T) {
            return;
        }
        n(true, false);
    }

    public final boolean p() {
        return this.H0 != null;
    }

    public final void q(int i10, long j10) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
        String publicUsername = UserObject.getPublicUsername(user);
        z3 z3Var = this.f44081s;
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            z3Var.setVisibility(0);
            z3Var.setAlpha(1.0f);
            z3Var.f(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(j(g6.f22999a7))));
            setupFlickerParams(false);
            return;
        }
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i10).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i11 = 0;
        do {
            if (i11 >= size) {
                tL_attachMenuBot = null;
                break;
            } else {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                i11++;
                tL_attachMenuBot = tL_attachMenuBot2;
            }
        } while (tL_attachMenuBot.bot_id != j10);
        boolean z10 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
            } else {
                z10 = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                z3Var.setVisibility(0);
                z3Var.setAlpha(1.0f);
                z3Var.h(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), null, null, tL_attachMenuBot);
                setupFlickerParams(z10);
                return;
            }
            return;
        }
        c6 c6Var = this.f44064e;
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            z3Var.setVisibility(0);
            z3Var.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.f44079r = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.f44073l0);
                this.f44079r.setupGradient(g6.Ki, c6Var, 1.0f, false);
            }
            z3Var.f(null, null, this.f44079r);
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
        z3Var.setVisibility(0);
        z3Var.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.f44079r = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.f44073l0);
            this.f44079r.setupGradient(g6.Ki, c6Var, 1.0f, false);
        }
        z3Var.f(null, null, this.f44079r);
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
        this.f44061c = f0Var;
    }

    public void setFlickerViewColor(int i10) {
        int iB = AndroidUtilities.computePerceivedBrightness(i10) > 0.7f ? g6.b(0.0f, -0.15f, i10) : g6.b(0.025f, 0.15f, i10);
        if (this.f44073l0 == iB) {
            return;
        }
        this.f44073l0 = iB;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(iB, PorterDuff.Mode.SRC_IN);
        z3 z3Var = this.f44081s;
        z3Var.setColorFilter(porterDuffColorFilter);
        SvgHelper.SvgDrawable svgDrawable = this.f44079r;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.f44073l0);
            this.f44079r.setupGradient(g6.Ki, this.f44064e, 1.0f, false);
        }
        this.m0 = true;
        z3Var.invalidate();
        invalidate();
    }

    public void setForceHeight(int i10) {
        if (this.f44084u0 == i10) {
            return;
        }
        this.f44084u0 = i10;
        requestLayout();
    }

    public void setIsBackButtonVisible(boolean z10) {
        this.N = z10;
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.f44087w0 = runnable;
        w0 w0Var = this.f44057a;
        if (w0Var != null) {
            w0Var.setCloseListener(runnable);
        }
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.H0 = callback4;
    }

    public void setOpener(w0 w0Var) {
        w0 w0Var2;
        this.f44077p0 = w0Var;
        if (this.f44072k0 || (w0Var2 = this.f44057a) == null) {
            return;
        }
        w0Var2.f44027f = w0Var;
    }

    public void setParentActivity(Activity activity) {
        this.S = activity;
    }

    public void setTrustedOrigin(String str) {
        this.f44092z0 = k(str);
    }

    public void setViewPortByMeasureSuppressed(boolean z10) {
        this.T = z10;
    }

    public void setViewPortHeightOffset(float f10) {
        this.f44083t0 = f10;
    }

    public void setWasOpenedByBot(q4 q4Var) {
        this.f44091y0 = q4Var;
    }

    public void setWasOpenedByLinkIntent(boolean z10) {
        this.f44089x0 = z10;
    }

    public void setWebViewProgressListener(q0.a aVar) {
        this.f44086w = aVar;
    }

    public void setWebViewScrollListener(y0 y0Var) {
        this.d = y0Var;
        w0 w0Var = this.f44057a;
        if (w0Var != null) {
            w0Var.f(this, y0Var);
        }
    }

    public final void t() {
        if (this.Q == null) {
            return;
        }
        f();
        nh.q qVar = this.f44067f0;
        if (qVar == null) {
            return;
        }
        try {
            v("biometry_info_received", qVar.f());
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void v(String str, JSONObject jSONObject) {
        g("notifyEvent " + str);
        NotificationCenter.getInstance(this.I).doOnIdle(new q(this, "window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", 0));
    }

    public final void w() {
        JSONObject jSONObjectPut;
        try {
            JSONObject jSONObjectP = b3.p(this.f44064e, true);
            jSONObjectPut = jSONObjectP != null ? new JSONObject().put("theme_params", jSONObjectP) : new JSONObject();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        v("theme_changed", jSONObjectPut);
    }

    public final boolean z() {
        if (this.f44057a == null || !this.N) {
            return false;
        }
        v("back_button_pressed", null);
        return true;
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
