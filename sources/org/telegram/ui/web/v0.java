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
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.rz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i4;
import org.telegram.ui.ls0;
import org.telegram.ui.m3;
import w7.x5;
public final class v0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.b2 f43517a;
    public final Context f43518b;
    public final boolean f43519c;
    public final long d;
    public final y0 f43520e;

    public v0(y0 y0Var, Context context, boolean z10, long j3) {
        this.f43520e = y0Var;
        this.f43518b = context;
        this.f43519c = z10;
        this.d = j3;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        g0 g0Var;
        y0 y0Var = this.f43520e;
        y0Var.c("onCloseWindow " + webView);
        b1 b1Var = y0Var.Q;
        if (b1Var != null && (g0Var = b1Var.f43241c) != null) {
            g0Var.y();
        } else {
            Runnable runnable = y0Var.U;
            if (runnable != null) {
                runnable.run();
                y0Var.U = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        org.telegram.ui.ActionBar.n2 U;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        y0 y0Var = this.f43520e;
        y0Var.c(str);
        String url = y0Var.getUrl();
        if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            if (y0Var.Q == null || (U = LaunchActivity.U()) == null) {
                return false;
            }
            if (U.getParentLayout() instanceof ActionBarLayout) {
                U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
            }
            i4 createArticleViewer = U.createArticleViewer(true);
            if (createArticleViewer.f38515u0 != null) {
                int i10 = 0;
                while (true) {
                    m3[] m3VarArr = createArticleViewer.f38515u0;
                    if (i10 >= m3VarArr.length) {
                        break;
                    }
                    m3 m3Var = m3VarArr[i10];
                    if (m3Var != null) {
                        m3Var.f39755f.setOpener(y0Var);
                    }
                    i10++;
                }
            }
            y0 y0Var2 = null;
            createArticleViewer.N(null, null, null, null);
            m3 m3Var2 = createArticleViewer.f38515u0[0];
            if (m3Var2 != null && m3Var2.f()) {
                if (createArticleViewer.f38515u0[0].getWebView() == null) {
                    createArticleViewer.f38515u0[0].f39755f.c();
                }
                y0Var2 = createArticleViewer.f38515u0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                y0Var2.f43549y = url;
            }
            y0Var.c("onCreateWindow: newWebView=" + y0Var2);
            if (y0Var2 != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(y0Var2);
                message.sendToTarget();
                return true;
            }
            createArticleViewer.o(true, true);
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new u0(this, webView2));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.b2 b2Var = this.f43517a;
        y0 y0Var = this.f43520e;
        if (b2Var != null) {
            y0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f43517a.dismiss();
            this.f43517a = null;
            return;
        }
        y0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String hostAuthority;
        int i10;
        int i11;
        y0 y0Var = this.f43520e;
        b1 b1Var = y0Var.Q;
        if (b1Var != null && b1Var.W != null) {
            y0Var.c("onGeolocationPermissionsShowPrompt " + str);
            boolean z10 = this.f43519c;
            if (z10) {
                hostAuthority = UserObject.getUserName(y0Var.Q.U);
            } else {
                hostAuthority = AndroidUtilities.getHostAuthority(y0Var.getUrl());
            }
            b1 b1Var2 = y0Var.Q;
            Activity activity = b1Var2.W;
            e6 e6Var = b1Var2.f43244e;
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
            org.telegram.ui.ActionBar.b2 Y = g5.Y(activity, e6Var, strArr, i12, formatString, LocaleController.formatString(i11, hostAuthority), new p0(this, callback, str, 0));
            this.f43517a = Y;
            Y.show();
            return;
        }
        y0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        e6 e6Var;
        String formatString;
        boolean[] zArr = {false};
        b1 b1Var = this.f43520e.Q;
        if (b1Var == null) {
            e6Var = null;
        } else {
            e6Var = b1Var.f43244e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f43518b, 0, e6Var);
        if (this.f43519c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        b2Var.R = formatString;
        b2Var.T = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new r0(zArr, jsResult, 2));
        b2Var.setOnDismissListener(new s0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        e6 e6Var;
        String formatString;
        boolean[] zArr = {false};
        b1 b1Var = this.f43520e.Q;
        if (b1Var == null) {
            e6Var = null;
        } else {
            e6Var = b1Var.f43244e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f43518b, 0, e6Var);
        if (this.f43519c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        b2Var.R = formatString;
        b2Var.T = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r0(zArr, jsResult, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new r0(zArr, jsResult, 1));
        b2Var.setOnDismissListener(new s0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        e6 e6Var;
        String formatString;
        b1 b1Var = this.f43520e.Q;
        if (b1Var == null) {
            e6Var = null;
        } else {
            e6Var = b1Var.f43244e;
        }
        boolean[] zArr = {false};
        Context context = this.f43518b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        if (this.f43519c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
        b2Var.R = formatString;
        b2Var.T = str2;
        ru ruVar = new ru(context, e6Var);
        ruVar.lineYFix = true;
        ruVar.setTextSize(1, 18.0f);
        ruVar.setTextColor(i6.w0(i6.f20905j5, e6Var));
        ruVar.setHintColor(i6.w0(i6.Xh, e6Var));
        ruVar.setFocusable(true);
        ruVar.setInputType(147457);
        ruVar.setLineColors(i6.w0(i6.f20925k6, e6Var), i6.w0(i6.f20943l6, e6Var), i6.w0(i6.f21018p7, e6Var));
        ruVar.setImeOptions(6);
        ruVar.setBackgroundDrawable(null);
        ruVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        ruVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(ruVar, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        b2Var.f20407a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ls0(zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new rz(zArr, jsPromptResult, ruVar, 5));
        alertDialog$Builder.j(new ei.e0(15, zArr, jsPromptResult));
        b2Var.O = new ii.q1(ruVar, 2);
        ruVar.setOnEditorActionListener(new t0(zArr, jsPromptResult, ruVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new q0(ruVar, 0));
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
        org.telegram.ui.ActionBar.b2 b2Var = this.f43517a;
        if (b2Var != null) {
            b2Var.dismiss();
            this.f43517a = null;
        }
        y0 y0Var = this.f43520e;
        if (y0Var.Q == null) {
            y0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        y0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.f43519c;
        if (z10) {
            hostAuthority = UserObject.getUserName(y0Var.Q.U);
        } else {
            hostAuthority = AndroidUtilities.getHostAuthority(y0Var.getUrl());
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            b1 b1Var = y0Var.Q;
            if (b1Var.W == null) {
                permissionRequest.deny();
            } else if (b1Var.r()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        b1 b1Var2 = y0Var.Q;
                        Activity activity = b1Var2.W;
                        e6 e6Var = b1Var2.f43244e;
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
                        org.telegram.ui.ActionBar.b2 Y = g5.Y(activity, e6Var, strArr, i16, formatString, LocaleController.formatString(i15, hostAuthority), new n0(this, permissionRequest, str, 0));
                        this.f43517a = Y;
                        Y.show();
                        return;
                    }
                    return;
                }
                b1 b1Var3 = y0Var.Q;
                Activity activity2 = b1Var3.W;
                e6 e6Var2 = b1Var3.f43244e;
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
                org.telegram.ui.ActionBar.b2 Y2 = g5.Y(activity2, e6Var2, strArr2, i17, formatString2, LocaleController.formatString(i13, hostAuthority), new n0(this, permissionRequest, str, 1));
                this.f43517a = Y2;
                Y2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    b1 b1Var4 = y0Var.Q;
                    Activity activity3 = b1Var4.W;
                    e6 e6Var3 = b1Var4.f43244e;
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
                    org.telegram.ui.ActionBar.b2 Y3 = g5.Y(activity3, e6Var3, strArr3, i18, formatString3, LocaleController.formatString(i11, hostAuthority), new o0(this, permissionRequest, resources, 0));
                    this.f43517a = Y3;
                    Y3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.b2 b2Var = this.f43517a;
        y0 y0Var = this.f43520e;
        if (b2Var != null) {
            y0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f43517a.dismiss();
            this.f43517a = null;
            return;
        }
        y0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i10) {
        y0 y0Var = this.f43520e;
        b1 b1Var = y0Var.Q;
        if (b1Var != null && b1Var.f43266w != null) {
            y0Var.c("onProgressChanged " + i10 + "%");
            y0Var.Q.f43266w.accept(Float.valueOf(((float) i10) / 100.0f));
            return;
        }
        y0Var.c("onProgressChanged " + i10 + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        y0 y0Var = this.f43520e;
        HashMap hashMap = y0Var.P;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        y0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(y0Var.getUrl(), y0Var.L) || y0Var.O == null || bitmap.getWidth() > y0Var.O.getWidth())) {
            y0Var.O = bitmap;
            y0Var.L = y0Var.getUrl();
            y0Var.M = true;
            y0.a(y0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(y0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(y0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override
    public final void onReceivedTitle(WebView webView, String str) {
        y0 y0Var = this.f43520e;
        y0Var.c("onReceivedTitle title=" + str);
        if (!y0Var.h) {
            y0Var.J = true;
            y0Var.K = str;
        }
        b1 b1Var = y0Var.Q;
        if (b1Var != null) {
            b1Var.H();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        this.f43520e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z10);
        super.onReceivedTouchIconUrl(webView, str, z10);
    }

    @Override
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        y0 y0Var = this.f43520e;
        Activity findActivity = AndroidUtilities.findActivity(y0Var.getContext());
        boolean z10 = false;
        if (findActivity == null) {
            y0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        b1 b1Var = y0Var.Q;
        if (b1Var == null) {
            y0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = b1Var.f43268x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        y0Var.Q.f43268x = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z10 = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        y0Var.c("onShowFileChooser: true");
        return true;
    }
}
