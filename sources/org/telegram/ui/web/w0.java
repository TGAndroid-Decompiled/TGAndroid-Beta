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
import java.util.HashMap;
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
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.voip.r2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.k4;
import org.telegram.ui.o3;
import w7.z5;
public final class w0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.a2 f41240a;
    public final Context f41241b;
    public final boolean f41242c;
    public final long d;
    public final z0 e;

    public w0(z0 z0Var, Context context, boolean z10, long j10) {
        this.e = z0Var;
        this.f41241b = context;
        this.f41242c = z10;
        this.d = j10;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        h0 h0Var;
        z0 z0Var = this.e;
        z0Var.c("onCloseWindow " + webView);
        c1 c1Var = z0Var.Q;
        if (c1Var != null && (h0Var = c1Var.f40985c) != null) {
            h0Var.y();
        } else {
            Runnable runnable = z0Var.U;
            if (runnable != null) {
                runnable.run();
                z0Var.U = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        org.telegram.ui.ActionBar.m2 U;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        z0 z0Var = this.e;
        z0Var.c(str);
        String url = z0Var.getUrl();
        if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            if (z0Var.Q == null || (U = LaunchActivity.U()) == null) {
                return false;
            }
            if (U.getParentLayout() instanceof ActionBarLayout) {
                U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
            }
            k4 createArticleViewer = U.createArticleViewer(true);
            if (createArticleViewer.f37278u0 != null) {
                int i10 = 0;
                while (true) {
                    o3[] o3VarArr = createArticleViewer.f37278u0;
                    if (i10 >= o3VarArr.length) {
                        break;
                    }
                    o3 o3Var = o3VarArr[i10];
                    if (o3Var != null) {
                        o3Var.f38531f.setOpener(z0Var);
                    }
                    i10++;
                }
            }
            z0 z0Var2 = null;
            createArticleViewer.N(null, null, null, null);
            o3 o3Var2 = createArticleViewer.f37278u0[0];
            if (o3Var2 != null && o3Var2.f()) {
                if (createArticleViewer.f37278u0[0].getWebView() == null) {
                    createArticleViewer.f37278u0[0].f38531f.c();
                }
                z0Var2 = createArticleViewer.f37278u0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                z0Var2.f41270y = url;
            }
            z0Var.c("onCreateWindow: newWebView=" + z0Var2);
            if (z0Var2 != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(z0Var2);
                message.sendToTarget();
                return true;
            }
            createArticleViewer.o(true, true);
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new v0(this, webView2));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.a2 a2Var = this.f41240a;
        z0 z0Var = this.e;
        if (a2Var != null) {
            z0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f41240a.dismiss();
            this.f41240a = null;
            return;
        }
        z0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String hostAuthority;
        int i10;
        int i11;
        z0 z0Var = this.e;
        c1 c1Var = z0Var.Q;
        if (c1Var != null && c1Var.W != null) {
            z0Var.c("onGeolocationPermissionsShowPrompt " + str);
            boolean z10 = this.f41242c;
            if (z10) {
                hostAuthority = UserObject.getUserName(z0Var.Q.U);
            } else {
                hostAuthority = AndroidUtilities.getHostAuthority(z0Var.getUrl());
            }
            c1 c1Var2 = z0Var.Q;
            Activity activity = c1Var2.W;
            c6 c6Var = c1Var2.e;
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
            org.telegram.ui.ActionBar.a2 Y = g5.Y(activity, c6Var, strArr, i12, formatString, LocaleController.formatString(i11, hostAuthority), new r0(this, callback, str, 0));
            this.f41240a = Y;
            Y.show();
            return;
        }
        z0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        c6 c6Var;
        String formatString;
        boolean[] zArr = {false};
        c1 c1Var = this.e.Q;
        if (c1Var == null) {
            c6Var = null;
        } else {
            c6Var = c1Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f41241b, 0, c6Var);
        if (this.f41242c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = formatString;
        a2Var.T = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s0(zArr, jsResult, 2));
        a2Var.setOnDismissListener(new t0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        c6 c6Var;
        String formatString;
        boolean[] zArr = {false};
        c1 c1Var = this.e.Q;
        if (c1Var == null) {
            c6Var = null;
        } else {
            c6Var = c1Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f41241b, 0, c6Var);
        if (this.f41242c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = formatString;
        a2Var.T = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0(zArr, jsResult, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s0(zArr, jsResult, 1));
        a2Var.setOnDismissListener(new t0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        c6 c6Var;
        String formatString;
        c1 c1Var = this.e.Q;
        if (c1Var == null) {
            c6Var = null;
        } else {
            c6Var = c1Var.e;
        }
        boolean[] zArr = {false};
        Context context = this.f41241b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (this.f41242c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
        a2Var.R = formatString;
        a2Var.T = str2;
        nu nuVar = new nu(context, c6Var);
        nuVar.lineYFix = true;
        nuVar.setTextSize(1, 18.0f);
        nuVar.setTextColor(g6.w0(g6.f19707j5, c6Var));
        nuVar.setHintColor(g6.w0(g6.Xh, c6Var));
        nuVar.setFocusable(true);
        nuVar.setInputType(147457);
        nuVar.setLineColors(g6.w0(g6.f19728k6, c6Var), g6.w0(g6.f19745l6, c6Var), g6.w0(g6.f19822p7, c6Var));
        nuVar.setImeOptions(6);
        nuVar.setBackgroundDrawable(null);
        nuVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        nuVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(nuVar, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        a2Var.f19257a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new o0(0, zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nz(zArr, jsPromptResult, nuVar, 5));
        alertDialog$Builder.j(new fi.d0(15, zArr, jsPromptResult));
        a2Var.O = new ji.p1(nuVar, 2);
        nuVar.setOnEditorActionListener(new u0(zArr, jsPromptResult, nuVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new r2(nuVar, 4));
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
        org.telegram.ui.ActionBar.a2 a2Var = this.f41240a;
        if (a2Var != null) {
            a2Var.dismiss();
            this.f41240a = null;
        }
        z0 z0Var = this.e;
        if (z0Var.Q == null) {
            z0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        z0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.f41242c;
        if (z10) {
            hostAuthority = UserObject.getUserName(z0Var.Q.U);
        } else {
            hostAuthority = AndroidUtilities.getHostAuthority(z0Var.getUrl());
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            c1 c1Var = z0Var.Q;
            if (c1Var.W == null) {
                permissionRequest.deny();
            } else if (c1Var.r()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        c1 c1Var2 = z0Var.Q;
                        Activity activity = c1Var2.W;
                        c6 c6Var = c1Var2.e;
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
                        org.telegram.ui.ActionBar.a2 Y = g5.Y(activity, c6Var, strArr, i16, formatString, LocaleController.formatString(i15, hostAuthority), new p0(this, permissionRequest, str, 0));
                        this.f41240a = Y;
                        Y.show();
                        return;
                    }
                    return;
                }
                c1 c1Var3 = z0Var.Q;
                Activity activity2 = c1Var3.W;
                c6 c6Var2 = c1Var3.e;
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
                org.telegram.ui.ActionBar.a2 Y2 = g5.Y(activity2, c6Var2, strArr2, i17, formatString2, LocaleController.formatString(i13, hostAuthority), new p0(this, permissionRequest, str, 1));
                this.f41240a = Y2;
                Y2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    c1 c1Var4 = z0Var.Q;
                    Activity activity3 = c1Var4.W;
                    c6 c6Var3 = c1Var4.e;
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
                    org.telegram.ui.ActionBar.a2 Y3 = g5.Y(activity3, c6Var3, strArr3, i18, formatString3, LocaleController.formatString(i11, hostAuthority), new q0(this, permissionRequest, resources, 0));
                    this.f41240a = Y3;
                    Y3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.a2 a2Var = this.f41240a;
        z0 z0Var = this.e;
        if (a2Var != null) {
            z0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f41240a.dismiss();
            this.f41240a = null;
            return;
        }
        z0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i10) {
        z0 z0Var = this.e;
        c1 c1Var = z0Var.Q;
        if (c1Var != null && c1Var.f41009w != null) {
            z0Var.c("onProgressChanged " + i10 + "%");
            z0Var.Q.f41009w.accept(Float.valueOf(((float) i10) / 100.0f));
            return;
        }
        z0Var.c("onProgressChanged " + i10 + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        z0 z0Var = this.e;
        HashMap hashMap = z0Var.P;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        z0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(z0Var.getUrl(), z0Var.L) || z0Var.O == null || bitmap.getWidth() > z0Var.O.getWidth())) {
            z0Var.O = bitmap;
            z0Var.L = z0Var.getUrl();
            z0Var.M = true;
            z0.a(z0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(z0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(z0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override
    public final void onReceivedTitle(WebView webView, String str) {
        z0 z0Var = this.e;
        z0Var.c("onReceivedTitle title=" + str);
        if (!z0Var.h) {
            z0Var.J = true;
            z0Var.K = str;
        }
        c1 c1Var = z0Var.Q;
        if (c1Var != null) {
            c1Var.H();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        this.e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z10);
        super.onReceivedTouchIconUrl(webView, str, z10);
    }

    @Override
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        z0 z0Var = this.e;
        Activity findActivity = AndroidUtilities.findActivity(z0Var.getContext());
        boolean z10 = false;
        if (findActivity == null) {
            z0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        c1 c1Var = z0Var.Q;
        if (c1Var == null) {
            z0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = c1Var.f41011x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        z0Var.Q.f41011x = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z10 = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        z0Var.c("onShowFileChooser: true");
        return true;
    }
}
