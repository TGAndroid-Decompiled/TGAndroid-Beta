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
import g7.e6;
import java.util.HashMap;
import kh.i9;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ei1;
import org.telegram.ui.l4;
import org.telegram.ui.p3;
public final class s0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.c2 f44012a;
    public final Context f44013b;
    public final boolean f44014c;
    public final long d;
    public final v0 f44015e;

    public s0(v0 v0Var, Context context, boolean z10, long j10) {
        this.f44015e = v0Var;
        this.f44013b = context;
        this.f44014c = z10;
        this.d = j10;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        e0 e0Var;
        v0 v0Var = this.f44015e;
        v0Var.c("onCloseWindow " + webView);
        y0 y0Var = v0Var.M;
        if (y0Var != null && (e0Var = y0Var.f44074c) != null) {
            e0Var.y();
        } else {
            Runnable runnable = v0Var.O;
            if (runnable != null) {
                runnable.run();
                v0Var.O = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        o2 U;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        v0 v0Var = this.f44015e;
        v0Var.c(str);
        String url = v0Var.getUrl();
        if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            if (v0Var.M == null || (U = LaunchActivity.U()) == null) {
                return false;
            }
            if (U.getParentLayout() instanceof ActionBarLayout) {
                U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
            }
            l4 createArticleViewer = U.createArticleViewer(true);
            if (createArticleViewer.f40026q0 != null) {
                int i9 = 0;
                while (true) {
                    p3[] p3VarArr = createArticleViewer.f40026q0;
                    if (i9 >= p3VarArr.length) {
                        break;
                    }
                    p3 p3Var = p3VarArr[i9];
                    if (p3Var != null) {
                        p3Var.f41323f.setOpener(v0Var);
                    }
                    i9++;
                }
            }
            v0 v0Var2 = null;
            createArticleViewer.N(null, null, null, null);
            p3 p3Var2 = createArticleViewer.f40026q0[0];
            if (p3Var2 != null && p3Var2.f()) {
                if (createArticleViewer.f40026q0[0].getWebView() == null) {
                    createArticleViewer.f40026q0[0].f41323f.c();
                }
                v0Var2 = createArticleViewer.f40026q0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                v0Var2.f44046y = url;
            }
            v0Var.c("onCreateWindow: newWebView=" + v0Var2);
            if (v0Var2 != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(v0Var2);
                message.sendToTarget();
                return true;
            }
            createArticleViewer.o(true, true);
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new r0(this, webView2));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.c2 c2Var = this.f44012a;
        v0 v0Var = this.f44015e;
        if (c2Var != null) {
            v0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f44012a.dismiss();
            this.f44012a = null;
            return;
        }
        v0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String hostAuthority;
        int i9;
        int i10;
        v0 v0Var = this.f44015e;
        y0 y0Var = v0Var.M;
        if (y0Var != null && y0Var.S != null) {
            v0Var.c("onGeolocationPermissionsShowPrompt " + str);
            boolean z10 = this.f44014c;
            if (z10) {
                hostAuthority = UserObject.getUserName(v0Var.M.Q);
            } else {
                hostAuthority = AndroidUtilities.getHostAuthority(v0Var.getUrl());
            }
            y0 y0Var2 = v0Var.M;
            Activity activity = y0Var2.S;
            b6 b6Var = y0Var2.f44077e;
            String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
            int i11 = R.raw.permission_request_location;
            if (z10) {
                i9 = R.string.BotWebViewRequestGeolocationPermission;
            } else {
                i9 = R.string.WebViewRequestGeolocationPermission;
            }
            String formatString = LocaleController.formatString(i9, hostAuthority);
            if (z10) {
                i10 = R.string.BotWebViewRequestGeolocationPermissionWithHint;
            } else {
                i10 = R.string.WebViewRequestGeolocationPermissionWithHint;
            }
            org.telegram.ui.ActionBar.c2 Z = y4.Z(activity, b6Var, strArr, i11, formatString, LocaleController.formatString(i10, hostAuthority), new n0(this, callback, str, 0));
            this.f44012a = Z;
            Z.show();
            return;
        }
        v0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        b6 b6Var;
        String formatString;
        boolean[] zArr = {false};
        y0 y0Var = this.f44015e.M;
        if (y0Var == null) {
            b6Var = null;
        } else {
            b6Var = y0Var.f44077e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f44013b, 0, b6Var);
        if (this.f44014c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = formatString;
        c2Var.P = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new o0(zArr, jsResult, 2));
        c2Var.setOnDismissListener(new p0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        b6 b6Var;
        String formatString;
        boolean[] zArr = {false};
        y0 y0Var = this.f44015e.M;
        if (y0Var == null) {
            b6Var = null;
        } else {
            b6Var = y0Var.f44077e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f44013b, 0, b6Var);
        if (this.f44014c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = formatString;
        c2Var.P = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new o0(zArr, jsResult, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new o0(zArr, jsResult, 1));
        c2Var.setOnDismissListener(new p0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        b6 b6Var;
        String formatString;
        y0 y0Var = this.f44015e.M;
        if (y0Var == null) {
            b6Var = null;
        } else {
            b6Var = y0Var.f44077e;
        }
        boolean[] zArr = {false};
        Context context = this.f44013b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        if (this.f44014c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = formatString;
        c2Var.P = str2;
        mt mtVar = new mt(context, b6Var);
        mtVar.lineYFix = true;
        mtVar.setTextSize(1, 18.0f);
        mtVar.setTextColor(f6.v0(f6.f23108j5, b6Var));
        mtVar.setHintColor(f6.v0(f6.Xh, b6Var));
        mtVar.setFocusable(true);
        mtVar.setInputType(147457);
        mtVar.setLineColors(f6.v0(f6.f23127k6, b6Var), f6.v0(f6.f23144l6, b6Var), f6.v0(f6.f23212p7, b6Var));
        mtVar.setImeOptions(6);
        mtVar.setBackgroundDrawable(null);
        mtVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        mtVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(mtVar, e6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.f22761a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ei1(zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new hq0(zArr, jsPromptResult, mtVar, 3));
        alertDialog$Builder.j(new bg.j(17, zArr, jsPromptResult));
        c2Var.K = new i9(mtVar, 6);
        mtVar.setOnEditorActionListener(new q0(zArr, jsPromptResult, mtVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new m2(mtVar, 16));
        return true;
    }

    @Override
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String hostAuthority;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.c2 c2Var = this.f44012a;
        if (c2Var != null) {
            c2Var.dismiss();
            this.f44012a = null;
        }
        v0 v0Var = this.f44015e;
        if (v0Var.M == null) {
            v0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        v0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.f44014c;
        if (z10) {
            hostAuthority = UserObject.getUserName(v0Var.M.Q);
        } else {
            hostAuthority = AndroidUtilities.getHostAuthority(v0Var.getUrl());
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            y0 y0Var = v0Var.M;
            if (y0Var.S == null) {
                permissionRequest.deny();
            } else if (y0Var.p()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        y0 y0Var2 = v0Var.M;
                        Activity activity = y0Var2.S;
                        b6 b6Var = y0Var2.f44077e;
                        String[] strArr = {"android.permission.RECORD_AUDIO"};
                        int i15 = R.raw.permission_request_microphone;
                        if (z10) {
                            i13 = R.string.BotWebViewRequestMicrophonePermission;
                        } else {
                            i13 = R.string.WebViewRequestMicrophonePermission;
                        }
                        String formatString = LocaleController.formatString(i13, hostAuthority);
                        if (z10) {
                            i14 = R.string.BotWebViewRequestMicrophonePermissionWithHint;
                        } else {
                            i14 = R.string.WebViewRequestMicrophonePermissionWithHint;
                        }
                        org.telegram.ui.ActionBar.c2 Z = y4.Z(activity, b6Var, strArr, i15, formatString, LocaleController.formatString(i14, hostAuthority), new l0(this, permissionRequest, str, 0));
                        this.f44012a = Z;
                        Z.show();
                        return;
                    }
                    return;
                }
                y0 y0Var3 = v0Var.M;
                Activity activity2 = y0Var3.S;
                b6 b6Var2 = y0Var3.f44077e;
                String[] strArr2 = {"android.permission.CAMERA"};
                int i16 = R.raw.permission_request_camera;
                if (z10) {
                    i11 = R.string.BotWebViewRequestCameraPermission;
                } else {
                    i11 = R.string.WebViewRequestCameraPermission;
                }
                String formatString2 = LocaleController.formatString(i11, hostAuthority);
                if (z10) {
                    i12 = R.string.BotWebViewRequestCameraPermissionWithHint;
                } else {
                    i12 = R.string.WebViewRequestCameraPermissionWithHint;
                }
                org.telegram.ui.ActionBar.c2 Z2 = y4.Z(activity2, b6Var2, strArr2, i16, formatString2, LocaleController.formatString(i12, hostAuthority), new l0(this, permissionRequest, str, 1));
                this.f44012a = Z2;
                Z2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    y0 y0Var4 = v0Var.M;
                    Activity activity3 = y0Var4.S;
                    b6 b6Var3 = y0Var4.f44077e;
                    String[] strArr3 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                    int i17 = R.raw.permission_request_camera;
                    if (z10) {
                        i9 = R.string.BotWebViewRequestCameraMicPermission;
                    } else {
                        i9 = R.string.WebViewRequestCameraMicPermission;
                    }
                    String formatString3 = LocaleController.formatString(i9, hostAuthority);
                    if (z10) {
                        i10 = R.string.BotWebViewRequestCameraMicPermissionWithHint;
                    } else {
                        i10 = R.string.WebViewRequestCameraMicPermissionWithHint;
                    }
                    org.telegram.ui.ActionBar.c2 Z3 = y4.Z(activity3, b6Var3, strArr3, i17, formatString3, LocaleController.formatString(i10, hostAuthority), new m0(this, permissionRequest, resources, 0));
                    this.f44012a = Z3;
                    Z3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.c2 c2Var = this.f44012a;
        v0 v0Var = this.f44015e;
        if (c2Var != null) {
            v0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f44012a.dismiss();
            this.f44012a = null;
            return;
        }
        v0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i9) {
        v0 v0Var = this.f44015e;
        y0 y0Var = v0Var.M;
        if (y0Var != null && y0Var.f44099w != null) {
            v0Var.c("onProgressChanged " + i9 + "%");
            v0Var.M.f44099w.accept(Float.valueOf(((float) i9) / 100.0f));
            return;
        }
        v0Var.c("onProgressChanged " + i9 + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        v0 v0Var = this.f44015e;
        HashMap hashMap = v0Var.L;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        v0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(v0Var.getUrl(), v0Var.H) || v0Var.K == null || bitmap.getWidth() > v0Var.K.getWidth())) {
            v0Var.K = bitmap;
            v0Var.H = v0Var.getUrl();
            v0Var.I = true;
            v0.a(v0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(v0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(v0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override
    public final void onReceivedTitle(WebView webView, String str) {
        v0 v0Var = this.f44015e;
        v0Var.c("onReceivedTitle title=" + str);
        if (!v0Var.h) {
            v0Var.F = true;
            v0Var.G = str;
        }
        y0 y0Var = v0Var.M;
        if (y0Var != null) {
            y0Var.E();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        this.f44015e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z10);
        super.onReceivedTouchIconUrl(webView, str, z10);
    }

    @Override
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        v0 v0Var = this.f44015e;
        Activity findActivity = AndroidUtilities.findActivity(v0Var.getContext());
        boolean z10 = false;
        if (findActivity == null) {
            v0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        y0 y0Var = v0Var.M;
        if (y0Var == null) {
            v0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = y0Var.f44101x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        v0Var.M.f44101x = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z10 = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        v0Var.c("onShowFileChooser: true");
        return true;
    }
}
