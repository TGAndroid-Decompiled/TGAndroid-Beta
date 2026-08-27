package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import h7.z5;
import java.util.HashMap;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.di1;
import org.telegram.ui.m4;
import org.telegram.ui.q3;

public final class t0 extends WebChromeClient {

    public org.telegram.ui.ActionBar.b2 f43999a;

    public final Context f44000b;

    public final boolean f44001c;
    public final long d;

    public final w0 f44002e;

    public t0(w0 w0Var, Context context, boolean z10, long j10) {
        this.f44002e = w0Var;
        this.f44000b = context;
        this.f44001c = z10;
        this.d = j10;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        f0 f0Var;
        w0 w0Var = this.f44002e;
        w0Var.c("onCloseWindow " + webView);
        z0 z0Var = w0Var.M;
        if (z0Var == null || (f0Var = z0Var.f44061c) == null) {
            Runnable runnable = w0Var.O;
            if (runnable != null) {
                runnable.run();
                w0Var.O = null;
            }
        } else {
            f0Var.y();
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        n2 n2VarU;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        w0 w0Var = this.f44002e;
        w0Var.c(str);
        String url = w0Var.getUrl();
        if (!MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new s0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (w0Var.M == null || (n2VarU = LaunchActivity.U()) == null) {
            return false;
        }
        if (n2VarU.getParentLayout() instanceof ActionBarLayout) {
            n2VarU = ((ActionBarLayout) n2VarU.getParentLayout()).getSheetFragment();
        }
        m4 m4VarCreateArticleViewer = n2VarU.createArticleViewer(true);
        if (m4VarCreateArticleViewer.f40347q0 != null) {
            int i10 = 0;
            while (true) {
                q3[] q3VarArr = m4VarCreateArticleViewer.f40347q0;
                if (i10 >= q3VarArr.length) {
                    break;
                }
                q3 q3Var = q3VarArr[i10];
                if (q3Var != null) {
                    q3Var.f41499f.setOpener(w0Var);
                }
                i10++;
            }
        }
        w0 webView3 = null;
        m4VarCreateArticleViewer.N(null, null, null, null);
        q3 q3Var2 = m4VarCreateArticleViewer.f40347q0[0];
        if (q3Var2 != null && q3Var2.f()) {
            if (m4VarCreateArticleViewer.f40347q0[0].getWebView() == null) {
                m4VarCreateArticleViewer.f40347q0[0].f41499f.c();
            }
            webView3 = m4VarCreateArticleViewer.f40347q0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            webView3.f44033y = url;
        }
        w0Var.c("onCreateWindow: newWebView=" + webView3);
        if (webView3 == null) {
            m4VarCreateArticleViewer.o(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(webView3);
        message.sendToTarget();
        return true;
    }

    @Override
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.b2 b2Var = this.f43999a;
        w0 w0Var = this.f44002e;
        if (b2Var == null) {
            w0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        w0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.f43999a.dismiss();
        this.f43999a = null;
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        w0 w0Var = this.f44002e;
        z0 z0Var = w0Var.M;
        int i10 = 0;
        if (z0Var == null || z0Var.S == null) {
            w0Var.c("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        w0Var.c("onGeolocationPermissionsShowPrompt " + str);
        boolean z10 = this.f44001c;
        String userName = z10 ? UserObject.getUserName(w0Var.M.Q) : AndroidUtilities.getHostAuthority(w0Var.getUrl());
        z0 z0Var2 = w0Var.M;
        org.telegram.ui.ActionBar.b2 b2VarZ = y4.Z(z0Var2.S, z0Var2.f44064e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, LocaleController.formatString(z10 ? R.string.BotWebViewRequestGeolocationPermission : R.string.WebViewRequestGeolocationPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestGeolocationPermissionWithHint : R.string.WebViewRequestGeolocationPermissionWithHint, userName), new o0(this, callback, str, i10));
        this.f43999a = b2VarZ;
        b2VarZ.show();
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        z0 z0Var = this.f44002e.M;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f44000b, 0, z0Var == null ? null : z0Var.f44064e);
        String name = this.f44001c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = name;
        b2Var.P = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new p0(zArr, jsResult, 2));
        b2Var.setOnDismissListener(new q0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = 1;
        int i11 = 0;
        boolean[] zArr = {false};
        z0 z0Var = this.f44002e.M;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f44000b, 0, z0Var == null ? null : z0Var.f44064e);
        String name = this.f44001c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = name;
        b2Var.P = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new p0(zArr, jsResult, i11));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new p0(zArr, jsResult, i10));
        b2Var.setOnDismissListener(new q0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        z0 z0Var = this.f44002e.M;
        c6 c6Var = z0Var == null ? null : z0Var.f44064e;
        boolean[] zArr = {false};
        Context context = this.f44000b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        String name = this.f44001c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = name;
        b2Var.P = str2;
        lt ltVar = new lt(context, c6Var);
        ltVar.lineYFix = true;
        ltVar.setTextSize(1, 18.0f);
        ltVar.setTextColor(g6.v0(g6.f23161j5, c6Var));
        ltVar.setHintColor(g6.v0(g6.Xh, c6Var));
        ltVar.setFocusable(true);
        ltVar.setInputType(147457);
        ltVar.setLineColors(g6.v0(g6.f23181k6, c6Var), g6.v0(g6.f23198l6, c6Var), g6.v0(g6.f23269p7, c6Var));
        ltVar.setImeOptions(6);
        ltVar.setBackgroundDrawable(null);
        ltVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        ltVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(ltVar, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.f22742a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new di1(zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new iq0(zArr, jsPromptResult, ltVar, 3));
        alertDialog$Builder.j(new cg.g(16, zArr, jsPromptResult));
        b2Var.K = new n6(ltVar, 6);
        ltVar.setOnEditorActionListener(new r0(zArr, jsPromptResult, ltVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new nh.f0(ltVar, 22));
        return true;
    }

    @Override
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.b2 b2Var = this.f43999a;
        if (b2Var != null) {
            b2Var.dismiss();
            this.f43999a = null;
        }
        w0 w0Var = this.f44002e;
        if (w0Var.M == null) {
            w0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        w0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.f44001c;
        String userName = z10 ? UserObject.getUserName(w0Var.M.Q) : AndroidUtilities.getHostAuthority(w0Var.getUrl());
        String[] resources = permissionRequest.getResources();
        int i10 = 0;
        int i11 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        z0 z0Var = w0Var.M;
                        org.telegram.ui.ActionBar.b2 b2VarZ = y4.Z(z0Var.S, z0Var.f44064e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraMicPermission : R.string.WebViewRequestCameraMicPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraMicPermissionWithHint : R.string.WebViewRequestCameraMicPermissionWithHint, userName), new n0(this, permissionRequest, resources, i10));
                        this.f43999a = b2VarZ;
                        b2VarZ.show();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        String str = resources[0];
        z0 z0Var2 = w0Var.M;
        if (z0Var2.S == null) {
            permissionRequest.deny();
            return;
        }
        if (z0Var2.p()) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            z0 z0Var3 = w0Var.M;
            org.telegram.ui.ActionBar.b2 b2VarZ2 = y4.Z(z0Var3.S, z0Var3.f44064e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraPermission : R.string.WebViewRequestCameraPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraPermissionWithHint : R.string.WebViewRequestCameraPermissionWithHint, userName), new m0(this, permissionRequest, str, i11));
            this.f43999a = b2VarZ2;
            b2VarZ2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            z0 z0Var4 = w0Var.M;
            org.telegram.ui.ActionBar.b2 b2VarZ3 = y4.Z(z0Var4.S, z0Var4.f44064e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, LocaleController.formatString(z10 ? R.string.BotWebViewRequestMicrophonePermission : R.string.WebViewRequestMicrophonePermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestMicrophonePermissionWithHint : R.string.WebViewRequestMicrophonePermissionWithHint, userName), new m0(this, permissionRequest, str, i10));
            this.f43999a = b2VarZ3;
            b2VarZ3.show();
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.b2 b2Var = this.f43999a;
        w0 w0Var = this.f44002e;
        if (b2Var == null) {
            w0Var.c("onPermissionRequestCanceled: no dialog");
            return;
        }
        w0Var.c("onPermissionRequestCanceled: dialog.dismiss");
        this.f43999a.dismiss();
        this.f43999a = null;
    }

    @Override
    public final void onProgressChanged(WebView webView, int i10) {
        w0 w0Var = this.f44002e;
        z0 z0Var = w0Var.M;
        if (z0Var == null || z0Var.f44086w == null) {
            w0Var.c("onProgressChanged " + i10 + "%: no container");
            return;
        }
        w0Var.c("onProgressChanged " + i10 + "%");
        w0Var.M.f44086w.accept(Float.valueOf(((float) i10) / 100.0f));
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        w0 w0Var = this.f44002e;
        HashMap map = w0Var.L;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        w0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(w0Var.getUrl(), w0Var.H) || w0Var.K == null || bitmap.getWidth() > w0Var.K.getWidth())) {
            w0Var.K = bitmap;
            w0Var.H = w0Var.getUrl();
            w0Var.I = true;
            w0.a(w0Var);
        }
        Bitmap bitmap2 = (Bitmap) map.get(w0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            map.put(w0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override
    public final void onReceivedTitle(WebView webView, String str) {
        w0 w0Var = this.f44002e;
        w0Var.c("onReceivedTitle title=" + str);
        if (!w0Var.h) {
            w0Var.F = true;
            w0Var.G = str;
        }
        z0 z0Var = w0Var.M;
        if (z0Var != null) {
            z0Var.E();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        this.f44002e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z10);
        super.onReceivedTouchIconUrl(webView, str, z10);
    }

    @Override
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        w0 w0Var = this.f44002e;
        Activity activityFindActivity = AndroidUtilities.findActivity(w0Var.getContext());
        if (activityFindActivity == null) {
            w0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        z0 z0Var = w0Var.M;
        if (z0Var == null) {
            w0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = z0Var.f44088x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        w0Var.M.f44088x = valueCallback;
        boolean z10 = fileChooserParams.getMode() == 1;
        Intent intentCreateIntent = fileChooserParams.createIntent();
        if (z10) {
            intentCreateIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        activityFindActivity.startActivityForResult(intentCreateIntent, 3000);
        w0Var.c("onShowFileChooser: true");
        return true;
    }
}
