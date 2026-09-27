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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.u50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gs0;
import org.telegram.ui.j4;
import org.telegram.ui.n3;
import w7.y5;
public final class w0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.c2 f39219a;
    public final Context f39220b;
    public final boolean f39221c;
    public final long d;
    public final z0 e;

    public w0(z0 z0Var, Context context, boolean z10, long j3) {
        this.e = z0Var;
        this.f39220b = context;
        this.f39221c = z10;
        this.d = j3;
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
        if (c1Var != null && (h0Var = c1Var.f38962c) != null) {
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
        org.telegram.ui.ActionBar.o2 U;
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
            j4 createArticleViewer = U.createArticleViewer(true);
            if (createArticleViewer.f34627u0 != null) {
                int i10 = 0;
                while (true) {
                    n3[] n3VarArr = createArticleViewer.f34627u0;
                    if (i10 >= n3VarArr.length) {
                        break;
                    }
                    n3 n3Var = n3VarArr[i10];
                    if (n3Var != null) {
                        n3Var.f35797f.setOpener(z0Var);
                    }
                    i10++;
                }
            }
            z0 z0Var2 = null;
            createArticleViewer.N(null, null, null, null);
            n3 n3Var2 = createArticleViewer.f34627u0[0];
            if (n3Var2 != null && n3Var2.f()) {
                if (createArticleViewer.f34627u0[0].getWebView() == null) {
                    createArticleViewer.f34627u0[0].f35797f.c();
                }
                z0Var2 = createArticleViewer.f34627u0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                z0Var2.f39250y = url;
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
        org.telegram.ui.ActionBar.c2 c2Var = this.f39219a;
        z0 z0Var = this.e;
        if (c2Var != null) {
            z0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f39219a.dismiss();
            this.f39219a = null;
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
            boolean z10 = this.f39221c;
            if (z10) {
                hostAuthority = UserObject.getUserName(z0Var.Q.U);
            } else {
                hostAuthority = AndroidUtilities.getHostAuthority(z0Var.getUrl());
            }
            c1 c1Var2 = z0Var.Q;
            Activity activity = c1Var2.W;
            e6 e6Var = c1Var2.e;
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
            org.telegram.ui.ActionBar.c2 Z = e5.Z(activity, e6Var, strArr, i12, formatString, LocaleController.formatString(i11, hostAuthority), new q0(this, callback, str, 0));
            this.f39219a = Z;
            Z.show();
            return;
        }
        z0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        e6 e6Var;
        String formatString;
        boolean[] zArr = {false};
        c1 c1Var = this.e.Q;
        if (c1Var == null) {
            e6Var = null;
        } else {
            e6Var = c1Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39220b, 0, e6Var);
        if (this.f39221c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        c2Var.R = formatString;
        c2Var.T = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new r0(zArr, jsResult, 2));
        c2Var.setOnDismissListener(new s0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        e6 e6Var;
        String formatString;
        boolean[] zArr = {false};
        c1 c1Var = this.e.Q;
        if (c1Var == null) {
            e6Var = null;
        } else {
            e6Var = c1Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39220b, 0, e6Var);
        if (this.f39221c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        c2Var.R = formatString;
        c2Var.T = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r0(zArr, jsResult, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new r0(zArr, jsResult, 1));
        c2Var.setOnDismissListener(new s0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        e6 e6Var;
        String formatString;
        c1 c1Var = this.e.Q;
        if (c1Var == null) {
            e6Var = null;
        } else {
            e6Var = c1Var.e;
        }
        boolean[] zArr = {false};
        Context context = this.f39220b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        if (this.f39221c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
        c2Var.R = formatString;
        c2Var.T = str2;
        du duVar = new du(context, e6Var);
        duVar.lineYFix = true;
        duVar.setTextSize(1, 18.0f);
        duVar.setTextColor(i6.v0(i6.f19164j5, e6Var));
        duVar.setHintColor(i6.v0(i6.Xh, e6Var));
        duVar.setFocusable(true);
        duVar.setInputType(147457);
        duVar.setLineColors(i6.v0(i6.f19185k6, e6Var), i6.v0(i6.f19203l6, e6Var), i6.v0(i6.f19278p7, e6Var));
        duVar.setImeOptions(6);
        duVar.setBackgroundDrawable(null);
        duVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        duVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(duVar, y5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.f18717a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new gs0(zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new u50(zArr, jsPromptResult, duVar, 4));
        alertDialog$Builder.j(new ei.e0(14, zArr, jsPromptResult));
        c2Var.O = new ii.q1(duVar, 2);
        duVar.setOnEditorActionListener(new t0(zArr, jsPromptResult, duVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new i2.h0(duVar, 29));
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
        org.telegram.ui.ActionBar.c2 c2Var = this.f39219a;
        if (c2Var != null) {
            c2Var.dismiss();
            this.f39219a = null;
        }
        z0 z0Var = this.e;
        if (z0Var.Q == null) {
            z0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        z0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.f39221c;
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
            } else if (c1Var.s()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        c1 c1Var2 = z0Var.Q;
                        Activity activity = c1Var2.W;
                        e6 e6Var = c1Var2.e;
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
                        org.telegram.ui.ActionBar.c2 Z = e5.Z(activity, e6Var, strArr, i16, formatString, LocaleController.formatString(i15, hostAuthority), new o0(this, permissionRequest, str, 0));
                        this.f39219a = Z;
                        Z.show();
                        return;
                    }
                    return;
                }
                c1 c1Var3 = z0Var.Q;
                Activity activity2 = c1Var3.W;
                e6 e6Var2 = c1Var3.e;
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
                org.telegram.ui.ActionBar.c2 Z2 = e5.Z(activity2, e6Var2, strArr2, i17, formatString2, LocaleController.formatString(i13, hostAuthority), new o0(this, permissionRequest, str, 1));
                this.f39219a = Z2;
                Z2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    c1 c1Var4 = z0Var.Q;
                    Activity activity3 = c1Var4.W;
                    e6 e6Var3 = c1Var4.e;
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
                    org.telegram.ui.ActionBar.c2 Z3 = e5.Z(activity3, e6Var3, strArr3, i18, formatString3, LocaleController.formatString(i11, hostAuthority), new p0(this, permissionRequest, resources, 0));
                    this.f39219a = Z3;
                    Z3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.c2 c2Var = this.f39219a;
        z0 z0Var = this.e;
        if (c2Var != null) {
            z0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f39219a.dismiss();
            this.f39219a = null;
            return;
        }
        z0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i10) {
        z0 z0Var = this.e;
        c1 c1Var = z0Var.Q;
        if (c1Var != null && c1Var.f38986w != null) {
            z0Var.c("onProgressChanged " + i10 + "%");
            z0Var.Q.f38986w.accept(Float.valueOf(((float) i10) / 100.0f));
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
            c1Var.I();
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
        ValueCallback valueCallback2 = c1Var.f38988x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        z0Var.Q.f38988x = valueCallback;
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
