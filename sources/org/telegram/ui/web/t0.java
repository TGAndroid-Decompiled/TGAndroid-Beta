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
import i7.f6;
import java.util.HashMap;
import nh.m6;
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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.st;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fi1;
import org.telegram.ui.m4;
import org.telegram.ui.q3;
public final class t0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.c2 f44202a;
    public final Context f44203b;
    public final boolean f44204c;
    public final long d;
    public final w0 f44205e;

    public t0(w0 w0Var, Context context, boolean z10, long j10) {
        this.f44205e = w0Var;
        this.f44203b = context;
        this.f44204c = z10;
        this.d = j10;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        f0 f0Var;
        w0 w0Var = this.f44205e;
        w0Var.c("onCloseWindow " + webView);
        z0 z0Var = w0Var.M;
        if (z0Var != null && (f0Var = z0Var.f44264c) != null) {
            f0Var.y();
        } else {
            Runnable runnable = w0Var.O;
            if (runnable != null) {
                runnable.run();
                w0Var.O = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        o2 U;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        w0 w0Var = this.f44205e;
        w0Var.c(str);
        String url = w0Var.getUrl();
        if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            if (w0Var.M == null || (U = LaunchActivity.U()) == null) {
                return false;
            }
            if (U.getParentLayout() instanceof ActionBarLayout) {
                U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
            }
            m4 createArticleViewer = U.createArticleViewer(true);
            if (createArticleViewer.f40404q0 != null) {
                int i10 = 0;
                while (true) {
                    q3[] q3VarArr = createArticleViewer.f40404q0;
                    if (i10 >= q3VarArr.length) {
                        break;
                    }
                    q3 q3Var = q3VarArr[i10];
                    if (q3Var != null) {
                        q3Var.f41516f.setOpener(w0Var);
                    }
                    i10++;
                }
            }
            w0 w0Var2 = null;
            createArticleViewer.N(null, null, null, null);
            q3 q3Var2 = createArticleViewer.f40404q0[0];
            if (q3Var2 != null && q3Var2.f()) {
                if (createArticleViewer.f40404q0[0].getWebView() == null) {
                    createArticleViewer.f40404q0[0].f41516f.c();
                }
                w0Var2 = createArticleViewer.f40404q0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                w0Var2.f44235y = url;
            }
            w0Var.c("onCreateWindow: newWebView=" + w0Var2);
            if (w0Var2 != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(w0Var2);
                message.sendToTarget();
                return true;
            }
            createArticleViewer.o(true, true);
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new s0(this, webView2));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.c2 c2Var = this.f44202a;
        w0 w0Var = this.f44205e;
        if (c2Var != null) {
            w0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f44202a.dismiss();
            this.f44202a = null;
            return;
        }
        w0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String hostAuthority;
        int i10;
        int i11;
        w0 w0Var = this.f44205e;
        z0 z0Var = w0Var.M;
        if (z0Var != null && z0Var.S != null) {
            w0Var.c("onGeolocationPermissionsShowPrompt " + str);
            boolean z10 = this.f44204c;
            if (z10) {
                hostAuthority = UserObject.getUserName(w0Var.M.Q);
            } else {
                hostAuthority = AndroidUtilities.getHostAuthority(w0Var.getUrl());
            }
            z0 z0Var2 = w0Var.M;
            Activity activity = z0Var2.S;
            c6 c6Var = z0Var2.f44267e;
            String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
            int i12 = R.raw.permission_request_location;
            if (z10) {
                i10 = R.string.BotWebViewRequestGeolocationPermission;
            } else {
                i10 = R.string.WebViewRequestGeolocationPermission;
            }
            String formatString = LocaleController.formatString(i10, hostAuthority);
            if (z10) {
                i11 = R.string.BotWebViewRequestGeolocationPermissionWithHint;
            } else {
                i11 = R.string.WebViewRequestGeolocationPermissionWithHint;
            }
            org.telegram.ui.ActionBar.c2 Z = c5.Z(activity, c6Var, strArr, i12, formatString, LocaleController.formatString(i11, hostAuthority), new o0(this, callback, str, 0));
            this.f44202a = Z;
            Z.show();
            return;
        }
        w0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        c6 c6Var;
        String formatString;
        boolean[] zArr = {false};
        z0 z0Var = this.f44205e.M;
        if (z0Var == null) {
            c6Var = null;
        } else {
            c6Var = z0Var.f44267e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f44203b, 0, c6Var);
        if (this.f44204c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = formatString;
        c2Var.P = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new p0(zArr, jsResult, 2));
        c2Var.setOnDismissListener(new q0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        c6 c6Var;
        String formatString;
        boolean[] zArr = {false};
        z0 z0Var = this.f44205e.M;
        if (z0Var == null) {
            c6Var = null;
        } else {
            c6Var = z0Var.f44267e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f44203b, 0, c6Var);
        if (this.f44204c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = formatString;
        c2Var.P = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new p0(zArr, jsResult, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new p0(zArr, jsResult, 1));
        c2Var.setOnDismissListener(new q0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        c6 c6Var;
        String formatString;
        z0 z0Var = this.f44205e.M;
        if (z0Var == null) {
            c6Var = null;
        } else {
            c6Var = z0Var.f44267e;
        }
        boolean[] zArr = {false};
        Context context = this.f44203b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (this.f44204c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = formatString;
        c2Var.P = str2;
        st stVar = new st(context, c6Var);
        stVar.lineYFix = true;
        stVar.setTextSize(1, 18.0f);
        stVar.setTextColor(g6.v0(g6.f23169j5, c6Var));
        stVar.setHintColor(g6.v0(g6.Xh, c6Var));
        stVar.setFocusable(true);
        stVar.setInputType(147457);
        stVar.setLineColors(g6.v0(g6.f23189k6, c6Var), g6.v0(g6.f23206l6, c6Var), g6.v0(g6.f23279p7, c6Var));
        stVar.setImeOptions(6);
        stVar.setBackgroundDrawable(null);
        stVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        stVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(stVar, f6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.f22778a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fi1(zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.voip.w1(zArr, jsPromptResult, stVar, 1));
        alertDialog$Builder.j(new eg.g(14, zArr, jsPromptResult));
        c2Var.K = new nh.b0(stVar, 9);
        stVar.setOnEditorActionListener(new r0(zArr, jsPromptResult, stVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new m6(stVar, 25));
        return true;
    }

    @Override
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String hostAuthority;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.c2 c2Var = this.f44202a;
        if (c2Var != null) {
            c2Var.dismiss();
            this.f44202a = null;
        }
        w0 w0Var = this.f44205e;
        if (w0Var.M == null) {
            w0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        w0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.f44204c;
        if (z10) {
            hostAuthority = UserObject.getUserName(w0Var.M.Q);
        } else {
            hostAuthority = AndroidUtilities.getHostAuthority(w0Var.getUrl());
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            z0 z0Var = w0Var.M;
            if (z0Var.S == null) {
                permissionRequest.deny();
            } else if (z0Var.p()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        z0 z0Var2 = w0Var.M;
                        Activity activity = z0Var2.S;
                        c6 c6Var = z0Var2.f44267e;
                        String[] strArr = {"android.permission.RECORD_AUDIO"};
                        int i16 = R.raw.permission_request_microphone;
                        if (z10) {
                            i14 = R.string.BotWebViewRequestMicrophonePermission;
                        } else {
                            i14 = R.string.WebViewRequestMicrophonePermission;
                        }
                        String formatString = LocaleController.formatString(i14, hostAuthority);
                        if (z10) {
                            i15 = R.string.BotWebViewRequestMicrophonePermissionWithHint;
                        } else {
                            i15 = R.string.WebViewRequestMicrophonePermissionWithHint;
                        }
                        org.telegram.ui.ActionBar.c2 Z = c5.Z(activity, c6Var, strArr, i16, formatString, LocaleController.formatString(i15, hostAuthority), new m0(this, permissionRequest, str, 0));
                        this.f44202a = Z;
                        Z.show();
                        return;
                    }
                    return;
                }
                z0 z0Var3 = w0Var.M;
                Activity activity2 = z0Var3.S;
                c6 c6Var2 = z0Var3.f44267e;
                String[] strArr2 = {"android.permission.CAMERA"};
                int i17 = R.raw.permission_request_camera;
                if (z10) {
                    i12 = R.string.BotWebViewRequestCameraPermission;
                } else {
                    i12 = R.string.WebViewRequestCameraPermission;
                }
                String formatString2 = LocaleController.formatString(i12, hostAuthority);
                if (z10) {
                    i13 = R.string.BotWebViewRequestCameraPermissionWithHint;
                } else {
                    i13 = R.string.WebViewRequestCameraPermissionWithHint;
                }
                org.telegram.ui.ActionBar.c2 Z2 = c5.Z(activity2, c6Var2, strArr2, i17, formatString2, LocaleController.formatString(i13, hostAuthority), new m0(this, permissionRequest, str, 1));
                this.f44202a = Z2;
                Z2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    z0 z0Var4 = w0Var.M;
                    Activity activity3 = z0Var4.S;
                    c6 c6Var3 = z0Var4.f44267e;
                    String[] strArr3 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                    int i18 = R.raw.permission_request_camera;
                    if (z10) {
                        i10 = R.string.BotWebViewRequestCameraMicPermission;
                    } else {
                        i10 = R.string.WebViewRequestCameraMicPermission;
                    }
                    String formatString3 = LocaleController.formatString(i10, hostAuthority);
                    if (z10) {
                        i11 = R.string.BotWebViewRequestCameraMicPermissionWithHint;
                    } else {
                        i11 = R.string.WebViewRequestCameraMicPermissionWithHint;
                    }
                    org.telegram.ui.ActionBar.c2 Z3 = c5.Z(activity3, c6Var3, strArr3, i18, formatString3, LocaleController.formatString(i11, hostAuthority), new n0(this, permissionRequest, resources, 0));
                    this.f44202a = Z3;
                    Z3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.c2 c2Var = this.f44202a;
        w0 w0Var = this.f44205e;
        if (c2Var != null) {
            w0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f44202a.dismiss();
            this.f44202a = null;
            return;
        }
        w0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i10) {
        w0 w0Var = this.f44205e;
        z0 z0Var = w0Var.M;
        if (z0Var != null && z0Var.f44289w != null) {
            w0Var.c("onProgressChanged " + i10 + "%");
            w0Var.M.f44289w.accept(Float.valueOf(((float) i10) / 100.0f));
            return;
        }
        w0Var.c("onProgressChanged " + i10 + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        w0 w0Var = this.f44205e;
        HashMap hashMap = w0Var.L;
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
        Bitmap bitmap2 = (Bitmap) hashMap.get(w0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(w0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override
    public final void onReceivedTitle(WebView webView, String str) {
        w0 w0Var = this.f44205e;
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
        this.f44205e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z10);
        super.onReceivedTouchIconUrl(webView, str, z10);
    }

    @Override
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        w0 w0Var = this.f44205e;
        Activity findActivity = AndroidUtilities.findActivity(w0Var.getContext());
        boolean z10 = false;
        if (findActivity == null) {
            w0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        z0 z0Var = w0Var.M;
        if (z0Var == null) {
            w0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = z0Var.f44291x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        w0Var.M.f44291x = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z10 = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        w0Var.c("onShowFileChooser: true");
        return true;
    }
}
