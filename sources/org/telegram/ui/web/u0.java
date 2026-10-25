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
import bi.u3;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.qy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j4;
import org.telegram.ui.m3;
import org.telegram.ui.zg1;
public final class u0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.e2 f45386a;
    public final Context f45387b;
    public final boolean f45388c;
    public final long d;
    public final x0 e;

    public u0(x0 x0Var, Context context, boolean z10, long j10) {
        this.e = x0Var;
        this.f45387b = context;
        this.f45388c = z10;
        this.d = j10;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        g0 g0Var;
        x0 x0Var = this.e;
        x0Var.c("onCloseWindow " + webView);
        a1 a1Var = x0Var.Q;
        if (a1Var != null && (g0Var = a1Var.f45155c) != null) {
            g0Var.z();
        } else {
            Runnable runnable = x0Var.U;
            if (runnable != null) {
                runnable.run();
                x0Var.U = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        r2 U;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        x0 x0Var = this.e;
        x0Var.c(str);
        String url = x0Var.getUrl();
        if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            if (x0Var.Q == null || (U = LaunchActivity.U()) == null) {
                return false;
            }
            if (U.getParentLayout() instanceof ActionBarLayout) {
                U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
            }
            j4 createArticleViewer = U.createArticleViewer(true);
            if (createArticleViewer.f40446u0 != null) {
                int i10 = 0;
                while (true) {
                    m3[] m3VarArr = createArticleViewer.f40446u0;
                    if (i10 >= m3VarArr.length) {
                        break;
                    }
                    m3 m3Var = m3VarArr[i10];
                    if (m3Var != null) {
                        m3Var.f41442f.setOpener(x0Var);
                    }
                    i10++;
                }
            }
            x0 x0Var2 = null;
            createArticleViewer.N(null, null, null, null);
            m3 m3Var2 = createArticleViewer.f40446u0[0];
            if (m3Var2 != null && m3Var2.f()) {
                if (createArticleViewer.f40446u0[0].getWebView() == null) {
                    createArticleViewer.f40446u0[0].f41442f.c();
                }
                x0Var2 = createArticleViewer.f40446u0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                x0Var2.f45448y = url;
            }
            x0Var.c("onCreateWindow: newWebView=" + x0Var2);
            if (x0Var2 != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(x0Var2);
                message.sendToTarget();
                return true;
            }
            createArticleViewer.o(true, true);
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new t0(this, webView2));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.e2 e2Var = this.f45386a;
        x0 x0Var = this.e;
        if (e2Var != null) {
            x0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f45386a.dismiss();
            this.f45386a = null;
            return;
        }
        x0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String hostAuthority;
        int i10;
        int i11;
        x0 x0Var = this.e;
        a1 a1Var = x0Var.Q;
        if (a1Var != null && a1Var.W != null) {
            x0Var.c("onGeolocationPermissionsShowPrompt " + str);
            boolean z10 = this.f45388c;
            if (z10) {
                hostAuthority = UserObject.getUserName(x0Var.Q.U);
            } else {
                hostAuthority = AndroidUtilities.getHostAuthority(x0Var.getUrl());
            }
            a1 a1Var2 = x0Var.Q;
            Activity activity = a1Var2.W;
            u6 u6Var = a1Var2.e;
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
            org.telegram.ui.ActionBar.e2 Y = g5.Y(activity, u6Var, strArr, i12, formatString, LocaleController.formatString(i11, hostAuthority), new p0(this, callback, str, 0));
            this.f45386a = Y;
            Y.show();
            return;
        }
        x0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        u6 u6Var;
        String formatString;
        boolean[] zArr = {false};
        a1 a1Var = this.e.Q;
        if (a1Var == null) {
            u6Var = null;
        } else {
            u6Var = a1Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f45387b, 0, u6Var);
        if (this.f45388c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.R = formatString;
        e2Var.T = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new q0(zArr, jsResult, 2));
        e2Var.setOnDismissListener(new r0(zArr, jsResult, 1));
        alertDialog$Builder.p();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        u6 u6Var;
        String formatString;
        boolean[] zArr = {false};
        a1 a1Var = this.e.Q;
        if (a1Var == null) {
            u6Var = null;
        } else {
            u6Var = a1Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f45387b, 0, u6Var);
        if (this.f45388c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.R = formatString;
        e2Var.T = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new q0(zArr, jsResult, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new q0(zArr, jsResult, 1));
        e2Var.setOnDismissListener(new r0(zArr, jsResult, 0));
        alertDialog$Builder.p();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        u6 u6Var;
        String formatString;
        a1 a1Var = this.e.Q;
        if (a1Var == null) {
            u6Var = null;
        } else {
            u6Var = a1Var.e;
        }
        boolean[] zArr = {false};
        Context context = this.f45387b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        if (this.f45388c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.R = formatString;
        e2Var.T = str2;
        ju juVar = new ju(context, u6Var);
        juVar.lineYFix = true;
        juVar.setTextSize(1, 18.0f);
        f7.V(juVar, y6.f23462j5, u6Var);
        f7.m(juVar, 34, y6.Xh, u6Var);
        juVar.setFocusable(true);
        juVar.setInputType(147457);
        f7.G(juVar, y6.f23482k6, y6.f23500l6, y6.f23579p7, u6Var);
        juVar.setImeOptions(6);
        juVar.setBackgroundDrawable(null);
        juVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        juVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(juVar, gb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        e2Var.f22553a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new zg1(zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qy(zArr, jsPromptResult, juVar, 6));
        alertDialog$Builder.j(new u3(17, zArr, jsPromptResult));
        e2Var.O = new ig.o(juVar, 12);
        juVar.setOnEditorActionListener(new s0(zArr, jsPromptResult, juVar, alertDialog$Builder.p()));
        AndroidUtilities.runOnUIThread(new k2.c(juVar, 27));
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
        org.telegram.ui.ActionBar.e2 e2Var = this.f45386a;
        if (e2Var != null) {
            e2Var.dismiss();
            this.f45386a = null;
        }
        x0 x0Var = this.e;
        if (x0Var.Q == null) {
            x0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        x0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.f45388c;
        if (z10) {
            hostAuthority = UserObject.getUserName(x0Var.Q.U);
        } else {
            hostAuthority = AndroidUtilities.getHostAuthority(x0Var.getUrl());
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            a1 a1Var = x0Var.Q;
            if (a1Var.W == null) {
                permissionRequest.deny();
            } else if (a1Var.r()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        a1 a1Var2 = x0Var.Q;
                        Activity activity = a1Var2.W;
                        u6 u6Var = a1Var2.e;
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
                        org.telegram.ui.ActionBar.e2 Y = g5.Y(activity, u6Var, strArr, i16, formatString, LocaleController.formatString(i15, hostAuthority), new n0(this, permissionRequest, str, 0));
                        this.f45386a = Y;
                        Y.show();
                        return;
                    }
                    return;
                }
                a1 a1Var3 = x0Var.Q;
                Activity activity2 = a1Var3.W;
                u6 u6Var2 = a1Var3.e;
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
                org.telegram.ui.ActionBar.e2 Y2 = g5.Y(activity2, u6Var2, strArr2, i17, formatString2, LocaleController.formatString(i13, hostAuthority), new n0(this, permissionRequest, str, 1));
                this.f45386a = Y2;
                Y2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    a1 a1Var4 = x0Var.Q;
                    Activity activity3 = a1Var4.W;
                    u6 u6Var3 = a1Var4.e;
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
                    org.telegram.ui.ActionBar.e2 Y3 = g5.Y(activity3, u6Var3, strArr3, i18, formatString3, LocaleController.formatString(i11, hostAuthority), new o0(this, permissionRequest, resources, 0));
                    this.f45386a = Y3;
                    Y3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.e2 e2Var = this.f45386a;
        x0 x0Var = this.e;
        if (e2Var != null) {
            x0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f45386a.dismiss();
            this.f45386a = null;
            return;
        }
        x0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i10) {
        x0 x0Var = this.e;
        a1 a1Var = x0Var.Q;
        if (a1Var != null && a1Var.f45179w != null) {
            x0Var.c("onProgressChanged " + i10 + "%");
            x0Var.Q.f45179w.accept(Float.valueOf(((float) i10) / 100.0f));
            return;
        }
        x0Var.c("onProgressChanged " + i10 + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        x0 x0Var = this.e;
        HashMap hashMap = x0Var.P;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        x0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(x0Var.getUrl(), x0Var.L) || x0Var.O == null || bitmap.getWidth() > x0Var.O.getWidth())) {
            x0Var.O = bitmap;
            x0Var.L = x0Var.getUrl();
            x0Var.M = true;
            x0.a(x0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(x0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(x0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override
    public final void onReceivedTitle(WebView webView, String str) {
        x0 x0Var = this.e;
        x0Var.c("onReceivedTitle title=" + str);
        if (!x0Var.h) {
            x0Var.J = true;
            x0Var.K = str;
        }
        a1 a1Var = x0Var.Q;
        if (a1Var != null) {
            a1Var.H();
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
        x0 x0Var = this.e;
        Activity findActivity = AndroidUtilities.findActivity(x0Var.getContext());
        boolean z10 = false;
        if (findActivity == null) {
            x0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        a1 a1Var = x0Var.Q;
        if (a1Var == null) {
            x0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = a1Var.f45181x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        x0Var.Q.f45181x = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z10 = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        x0Var.c("onShowFileChooser: true");
        return true;
    }
}
