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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l4;
import org.telegram.ui.p3;
public final class t0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.d2 f39663a;
    public final Context f39664b;
    public final boolean f39665c;
    public final long d;
    public final w0 e;

    public t0(w0 w0Var, Context context, boolean z4, long j10) {
        this.e = w0Var;
        this.f39664b = context;
        this.f39665c = z4;
        this.d = j10;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        e0 e0Var;
        w0 w0Var = this.e;
        w0Var.c("onCloseWindow " + webView);
        a1 a1Var = w0Var.N;
        if (a1Var != null && (e0Var = a1Var.f39424c) != null) {
            e0Var.y();
        } else {
            Runnable runnable = w0Var.P;
            if (runnable != null) {
                runnable.run();
                w0Var.P = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z10, Message message) {
        p2 U;
        String str = "onCreateWindow isDialog=" + z4 + " isUserGesture=" + z10 + " resultMsg=" + message;
        w0 w0Var = this.e;
        w0Var.c(str);
        String url = w0Var.getUrl();
        if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            if (w0Var.N == null || (U = LaunchActivity.U()) == null) {
                return false;
            }
            if (U.getParentLayout() instanceof ActionBarLayout) {
                U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
            }
            l4 createArticleViewer = U.createArticleViewer(true);
            if (createArticleViewer.f35945r0 != null) {
                int i10 = 0;
                while (true) {
                    p3[] p3VarArr = createArticleViewer.f35945r0;
                    if (i10 >= p3VarArr.length) {
                        break;
                    }
                    p3 p3Var = p3VarArr[i10];
                    if (p3Var != null) {
                        p3Var.f37161f.setOpener(w0Var);
                    }
                    i10++;
                }
            }
            w0 w0Var2 = null;
            createArticleViewer.N(null, null, null, null);
            p3 p3Var2 = createArticleViewer.f35945r0[0];
            if (p3Var2 != null && p3Var2.f()) {
                if (createArticleViewer.f35945r0[0].getWebView() == null) {
                    createArticleViewer.f35945r0[0].f37161f.c();
                }
                w0Var2 = createArticleViewer.f35945r0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                w0Var2.f39691y = url;
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
        org.telegram.ui.ActionBar.d2 d2Var = this.f39663a;
        w0 w0Var = this.e;
        if (d2Var != null) {
            w0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f39663a.dismiss();
            this.f39663a = null;
            return;
        }
        w0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String hostAuthority;
        int i10;
        int i11;
        w0 w0Var = this.e;
        a1 a1Var = w0Var.N;
        if (a1Var != null && a1Var.T != null) {
            w0Var.c("onGeolocationPermissionsShowPrompt " + str);
            boolean z4 = this.f39665c;
            if (z4) {
                hostAuthority = UserObject.getUserName(w0Var.N.R);
            } else {
                hostAuthority = AndroidUtilities.getHostAuthority(w0Var.getUrl());
            }
            a1 a1Var2 = w0Var.N;
            Activity activity = a1Var2.T;
            f6 f6Var = a1Var2.e;
            String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
            int i12 = R.raw.permission_request_location;
            if (z4) {
                i10 = R.string.BotWebViewRequestGeolocationPermission;
            } else {
                i10 = R.string.WebViewRequestGeolocationPermission;
            }
            String formatString = LocaleController.formatString(i10, hostAuthority);
            if (z4) {
                i11 = R.string.BotWebViewRequestGeolocationPermissionWithHint;
            } else {
                i11 = R.string.WebViewRequestGeolocationPermissionWithHint;
            }
            org.telegram.ui.ActionBar.d2 Z = z4.Z(activity, f6Var, strArr, i12, formatString, LocaleController.formatString(i11, hostAuthority), new n0(this, callback, str, 0));
            this.f39663a = Z;
            Z.show();
            return;
        }
        w0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        f6 f6Var;
        String formatString;
        boolean[] zArr = {false};
        a1 a1Var = this.e.N;
        if (a1Var == null) {
            f6Var = null;
        } else {
            f6Var = a1Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39664b, 0, f6Var);
        if (this.f39665c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        d2Var.O = formatString;
        d2Var.Q = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new p0(zArr, jsResult, 2));
        d2Var.setOnDismissListener(new q0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        f6 f6Var;
        String formatString;
        boolean[] zArr = {false};
        a1 a1Var = this.e.N;
        if (a1Var == null) {
            f6Var = null;
        } else {
            f6Var = a1Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39664b, 0, f6Var);
        if (this.f39665c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        d2Var.O = formatString;
        d2Var.Q = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new p0(zArr, jsResult, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new p0(zArr, jsResult, 1));
        d2Var.setOnDismissListener(new q0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        f6 f6Var;
        String formatString;
        a1 a1Var = this.e.N;
        if (a1Var == null) {
            f6Var = null;
        } else {
            f6Var = a1Var.e;
        }
        boolean[] zArr = {false};
        Context context = this.f39664b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        if (this.f39665c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        d2Var.O = formatString;
        d2Var.Q = str2;
        vt vtVar = new vt(context, f6Var);
        vtVar.lineYFix = true;
        vtVar.setTextSize(1, 18.0f);
        vtVar.setTextColor(j6.v0(j6.f20012j5, f6Var));
        vtVar.setHintColor(j6.v0(j6.Xh, f6Var));
        vtVar.setFocusable(true);
        vtVar.setInputType(147457);
        vtVar.setLineColors(j6.v0(j6.f20031k6, f6Var), j6.v0(j6.f20049l6, f6Var), j6.v0(j6.f20122p7, f6Var));
        vtVar.setImeOptions(6);
        vtVar.setBackgroundDrawable(null);
        vtVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        vtVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(vtVar, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        d2Var.f19584a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m(2, zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(zArr, jsPromptResult, vtVar, 29));
        alertDialog$Builder.j(new gg.g(14, zArr, jsPromptResult));
        d2Var.L = new cg.h0(vtVar, 29);
        vtVar.setOnEditorActionListener(new r0(zArr, jsPromptResult, vtVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new o0(vtVar, 0));
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
        org.telegram.ui.ActionBar.d2 d2Var = this.f39663a;
        if (d2Var != null) {
            d2Var.dismiss();
            this.f39663a = null;
        }
        w0 w0Var = this.e;
        if (w0Var.N == null) {
            w0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        w0Var.c("onPermissionRequest " + permissionRequest);
        boolean z4 = this.f39665c;
        if (z4) {
            hostAuthority = UserObject.getUserName(w0Var.N.R);
        } else {
            hostAuthority = AndroidUtilities.getHostAuthority(w0Var.getUrl());
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            a1 a1Var = w0Var.N;
            if (a1Var.T == null) {
                permissionRequest.deny();
            } else if (a1Var.p()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        a1 a1Var2 = w0Var.N;
                        Activity activity = a1Var2.T;
                        f6 f6Var = a1Var2.e;
                        String[] strArr = {"android.permission.RECORD_AUDIO"};
                        int i16 = R.raw.permission_request_microphone;
                        if (z4) {
                            i14 = R.string.BotWebViewRequestMicrophonePermission;
                        } else {
                            i14 = R.string.WebViewRequestMicrophonePermission;
                        }
                        String formatString = LocaleController.formatString(i14, hostAuthority);
                        if (z4) {
                            i15 = R.string.BotWebViewRequestMicrophonePermissionWithHint;
                        } else {
                            i15 = R.string.WebViewRequestMicrophonePermissionWithHint;
                        }
                        org.telegram.ui.ActionBar.d2 Z = z4.Z(activity, f6Var, strArr, i16, formatString, LocaleController.formatString(i15, hostAuthority), new l0(this, permissionRequest, str, 0));
                        this.f39663a = Z;
                        Z.show();
                        return;
                    }
                    return;
                }
                a1 a1Var3 = w0Var.N;
                Activity activity2 = a1Var3.T;
                f6 f6Var2 = a1Var3.e;
                String[] strArr2 = {"android.permission.CAMERA"};
                int i17 = R.raw.permission_request_camera;
                if (z4) {
                    i12 = R.string.BotWebViewRequestCameraPermission;
                } else {
                    i12 = R.string.WebViewRequestCameraPermission;
                }
                String formatString2 = LocaleController.formatString(i12, hostAuthority);
                if (z4) {
                    i13 = R.string.BotWebViewRequestCameraPermissionWithHint;
                } else {
                    i13 = R.string.WebViewRequestCameraPermissionWithHint;
                }
                org.telegram.ui.ActionBar.d2 Z2 = z4.Z(activity2, f6Var2, strArr2, i17, formatString2, LocaleController.formatString(i13, hostAuthority), new l0(this, permissionRequest, str, 1));
                this.f39663a = Z2;
                Z2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    a1 a1Var4 = w0Var.N;
                    Activity activity3 = a1Var4.T;
                    f6 f6Var3 = a1Var4.e;
                    String[] strArr3 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                    int i18 = R.raw.permission_request_camera;
                    if (z4) {
                        i10 = R.string.BotWebViewRequestCameraMicPermission;
                    } else {
                        i10 = R.string.WebViewRequestCameraMicPermission;
                    }
                    String formatString3 = LocaleController.formatString(i10, hostAuthority);
                    if (z4) {
                        i11 = R.string.BotWebViewRequestCameraMicPermissionWithHint;
                    } else {
                        i11 = R.string.WebViewRequestCameraMicPermissionWithHint;
                    }
                    org.telegram.ui.ActionBar.d2 Z3 = z4.Z(activity3, f6Var3, strArr3, i18, formatString3, LocaleController.formatString(i11, hostAuthority), new m0(this, permissionRequest, resources, 0));
                    this.f39663a = Z3;
                    Z3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.d2 d2Var = this.f39663a;
        w0 w0Var = this.e;
        if (d2Var != null) {
            w0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f39663a.dismiss();
            this.f39663a = null;
            return;
        }
        w0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i10) {
        w0 w0Var = this.e;
        a1 a1Var = w0Var.N;
        if (a1Var != null && a1Var.f39448w != null) {
            w0Var.c("onProgressChanged " + i10 + "%");
            w0Var.N.f39448w.accept(Float.valueOf(((float) i10) / 100.0f));
            return;
        }
        w0Var.c("onProgressChanged " + i10 + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        w0 w0Var = this.e;
        HashMap hashMap = w0Var.M;
        StringBuilder sb = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb.append(str);
        w0Var.c(sb.toString());
        if (bitmap != null && (!TextUtils.equals(w0Var.getUrl(), w0Var.I) || w0Var.L == null || bitmap.getWidth() > w0Var.L.getWidth())) {
            w0Var.L = bitmap;
            w0Var.I = w0Var.getUrl();
            w0Var.J = true;
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
        w0 w0Var = this.e;
        w0Var.c("onReceivedTitle title=" + str);
        if (!w0Var.h) {
            w0Var.G = true;
            w0Var.H = str;
        }
        a1 a1Var = w0Var.N;
        if (a1Var != null) {
            a1Var.E();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z4) {
        this.e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z4);
        super.onReceivedTouchIconUrl(webView, str, z4);
    }

    @Override
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        w0 w0Var = this.e;
        Activity findActivity = AndroidUtilities.findActivity(w0Var.getContext());
        boolean z4 = false;
        if (findActivity == null) {
            w0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        a1 a1Var = w0Var.N;
        if (a1Var == null) {
            w0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = a1Var.f39450x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        w0Var.N.f39450x = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z4 = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z4) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        w0Var.c("onShowFileChooser: true");
        return true;
    }
}
