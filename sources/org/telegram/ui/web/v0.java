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
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.n4;
import org.telegram.ui.r3;
public final class v0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.d2 f39629a;
    public final Context f39630b;
    public final boolean f39631c;
    public final long d;
    public final y0 e;

    public v0(y0 y0Var, Context context, boolean z4, long j10) {
        this.e = y0Var;
        this.f39630b = context;
        this.f39631c = z4;
        this.d = j10;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        g0 g0Var;
        y0 y0Var = this.e;
        y0Var.c("onCloseWindow " + webView);
        c1 c1Var = y0Var.N;
        if (c1Var != null && (g0Var = c1Var.f39385c) != null) {
            g0Var.y();
        } else {
            Runnable runnable = y0Var.R;
            if (runnable != null) {
                runnable.run();
                y0Var.R = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z10, Message message) {
        p2 U;
        String str = "onCreateWindow isDialog=" + z4 + " isUserGesture=" + z10 + " resultMsg=" + message;
        y0 y0Var = this.e;
        y0Var.c(str);
        String url = y0Var.getUrl();
        if (MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            if (y0Var.N == null || (U = LaunchActivity.U()) == null) {
                return false;
            }
            if (U.getParentLayout() instanceof ActionBarLayout) {
                U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
            }
            n4 createArticleViewer = U.createArticleViewer(true);
            if (createArticleViewer.f36375r0 != null) {
                int i10 = 0;
                while (true) {
                    r3[] r3VarArr = createArticleViewer.f36375r0;
                    if (i10 >= r3VarArr.length) {
                        break;
                    }
                    r3 r3Var = r3VarArr[i10];
                    if (r3Var != null) {
                        r3Var.f37686f.setOpener(y0Var);
                    }
                    i10++;
                }
            }
            y0 y0Var2 = null;
            createArticleViewer.N(null, null, null, null);
            r3 r3Var2 = createArticleViewer.f36375r0[0];
            if (r3Var2 != null && r3Var2.f()) {
                if (createArticleViewer.f36375r0[0].getWebView() == null) {
                    createArticleViewer.f36375r0[0].f37686f.c();
                }
                y0Var2 = createArticleViewer.f36375r0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                y0Var2.f39660y = url;
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
        org.telegram.ui.ActionBar.d2 d2Var = this.f39629a;
        y0 y0Var = this.e;
        if (d2Var != null) {
            y0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f39629a.dismiss();
            this.f39629a = null;
            return;
        }
        y0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String hostAuthority;
        int i10;
        int i11;
        y0 y0Var = this.e;
        c1 c1Var = y0Var.N;
        if (c1Var != null && c1Var.T != null) {
            y0Var.c("onGeolocationPermissionsShowPrompt " + str);
            boolean z4 = this.f39631c;
            if (z4) {
                hostAuthority = UserObject.getUserName(y0Var.N.R);
            } else {
                hostAuthority = AndroidUtilities.getHostAuthority(y0Var.getUrl());
            }
            c1 c1Var2 = y0Var.N;
            Activity activity = c1Var2.T;
            f6 f6Var = c1Var2.e;
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
            org.telegram.ui.ActionBar.d2 Z = z4.Z(activity, f6Var, strArr, i12, formatString, LocaleController.formatString(i11, hostAuthority), new p0(this, callback, str, 0));
            this.f39629a = Z;
            Z.show();
            return;
        }
        y0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        f6 f6Var;
        String formatString;
        boolean[] zArr = {false};
        c1 c1Var = this.e.N;
        if (c1Var == null) {
            f6Var = null;
        } else {
            f6Var = c1Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39630b, 0, f6Var);
        if (this.f39631c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = formatString;
        d2Var.Q = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new r0(zArr, jsResult, 2));
        d2Var.setOnDismissListener(new s0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        f6 f6Var;
        String formatString;
        boolean[] zArr = {false};
        c1 c1Var = this.e.N;
        if (c1Var == null) {
            f6Var = null;
        } else {
            f6Var = c1Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39630b, 0, f6Var);
        if (this.f39631c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = formatString;
        d2Var.Q = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r0(zArr, jsResult, 0));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new r0(zArr, jsResult, 1));
        d2Var.setOnDismissListener(new s0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        f6 f6Var;
        String formatString;
        c1 c1Var = this.e.N;
        if (c1Var == null) {
            f6Var = null;
        } else {
            f6Var = c1Var.e;
        }
        boolean[] zArr = {false};
        Context context = this.f39630b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        if (this.f39631c) {
            formatString = DialogObject.getName(this.d);
        } else {
            formatString = LocaleController.formatString(R.string.WebsiteSays, str);
        }
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = formatString;
        d2Var.Q = str2;
        ut utVar = new ut(context, f6Var);
        utVar.lineYFix = true;
        utVar.setTextSize(1, 18.0f);
        utVar.setTextColor(j6.v0(j6.f19987j5, f6Var));
        utVar.setHintColor(j6.v0(j6.Xh, f6Var));
        utVar.setFocusable(true);
        utVar.setInputType(147457);
        utVar.setLineColors(j6.v0(j6.f20006k6, f6Var), j6.v0(j6.f20024l6, f6Var), j6.v0(j6.f20097p7, f6Var));
        utVar.setImeOptions(6);
        utVar.setBackgroundDrawable(null);
        utVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        utVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(utVar, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        d2Var.f19559a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m(2, zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(zArr, jsPromptResult, utVar, 29));
        alertDialog$Builder.j(new gg.g(13, zArr, jsPromptResult));
        d2Var.L = new cg.h0(utVar, 29);
        utVar.setOnEditorActionListener(new t0(zArr, jsPromptResult, utVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new q0(utVar, 0));
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
        org.telegram.ui.ActionBar.d2 d2Var = this.f39629a;
        if (d2Var != null) {
            d2Var.dismiss();
            this.f39629a = null;
        }
        y0 y0Var = this.e;
        if (y0Var.N == null) {
            y0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        y0Var.c("onPermissionRequest " + permissionRequest);
        boolean z4 = this.f39631c;
        if (z4) {
            hostAuthority = UserObject.getUserName(y0Var.N.R);
        } else {
            hostAuthority = AndroidUtilities.getHostAuthority(y0Var.getUrl());
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            c1 c1Var = y0Var.N;
            if (c1Var.T == null) {
                permissionRequest.deny();
            } else if (c1Var.s()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        c1 c1Var2 = y0Var.N;
                        Activity activity = c1Var2.T;
                        f6 f6Var = c1Var2.e;
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
                        org.telegram.ui.ActionBar.d2 Z = z4.Z(activity, f6Var, strArr, i16, formatString, LocaleController.formatString(i15, hostAuthority), new n0(this, permissionRequest, str, 0));
                        this.f39629a = Z;
                        Z.show();
                        return;
                    }
                    return;
                }
                c1 c1Var3 = y0Var.N;
                Activity activity2 = c1Var3.T;
                f6 f6Var2 = c1Var3.e;
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
                org.telegram.ui.ActionBar.d2 Z2 = z4.Z(activity2, f6Var2, strArr2, i17, formatString2, LocaleController.formatString(i13, hostAuthority), new n0(this, permissionRequest, str, 1));
                this.f39629a = Z2;
                Z2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    c1 c1Var4 = y0Var.N;
                    Activity activity3 = c1Var4.T;
                    f6 f6Var3 = c1Var4.e;
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
                    org.telegram.ui.ActionBar.d2 Z3 = z4.Z(activity3, f6Var3, strArr3, i18, formatString3, LocaleController.formatString(i11, hostAuthority), new o0(this, permissionRequest, resources, 0));
                    this.f39629a = Z3;
                    Z3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.d2 d2Var = this.f39629a;
        y0 y0Var = this.e;
        if (d2Var != null) {
            y0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f39629a.dismiss();
            this.f39629a = null;
            return;
        }
        y0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i10) {
        y0 y0Var = this.e;
        c1 c1Var = y0Var.N;
        if (c1Var != null && c1Var.f39409w != null) {
            y0Var.c("onProgressChanged " + i10 + "%");
            y0Var.N.f39409w.accept(Float.valueOf(((float) i10) / 100.0f));
            return;
        }
        y0Var.c("onProgressChanged " + i10 + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        y0 y0Var = this.e;
        HashMap hashMap = y0Var.M;
        StringBuilder sb = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb.append(str);
        y0Var.c(sb.toString());
        if (bitmap != null && (!TextUtils.equals(y0Var.getUrl(), y0Var.I) || y0Var.L == null || bitmap.getWidth() > y0Var.L.getWidth())) {
            y0Var.L = bitmap;
            y0Var.I = y0Var.getUrl();
            y0Var.J = true;
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
        y0 y0Var = this.e;
        y0Var.c("onReceivedTitle title=" + str);
        if (!y0Var.h) {
            y0Var.G = true;
            y0Var.H = str;
        }
        c1 c1Var = y0Var.N;
        if (c1Var != null) {
            c1Var.I();
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
        y0 y0Var = this.e;
        Activity findActivity = AndroidUtilities.findActivity(y0Var.getContext());
        boolean z4 = false;
        if (findActivity == null) {
            y0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        c1 c1Var = y0Var.N;
        if (c1Var == null) {
            y0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = c1Var.f39411x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        y0Var.N.f39411x = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z4 = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z4) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        y0Var.c("onShowFileChooser: true");
        return true;
    }
}
