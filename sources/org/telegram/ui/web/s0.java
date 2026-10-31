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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.s4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h4;
import org.telegram.ui.l3;
import w7.b6;
public final class s0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.x1 f43187a;
    public final Context f43188b;
    public final boolean f43189c;
    public final long d;
    public final v0 e;

    public s0(v0 v0Var, Context context, boolean z10, long j10) {
        this.e = v0Var;
        this.f43188b = context;
        this.f43189c = z10;
        this.d = j10;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        d0 d0Var;
        v0 v0Var = this.e;
        v0Var.c("onCloseWindow " + webView);
        z0 z0Var = v0Var.Q;
        if (z0Var != null && (d0Var = z0Var.f43261c) != null) {
            d0Var.z();
        } else {
            Runnable runnable = v0Var.U;
            if (runnable != null) {
                runnable.run();
                v0Var.U = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        k2 T;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        v0 v0Var = this.e;
        v0Var.c(str);
        String url = v0Var.getUrl();
        if (vp.r1(d20.f15147s0).K2()) {
            if (v0Var.Q == null || (T = LaunchActivity.T()) == null) {
                return false;
            }
            if (T.getParentLayout() instanceof ActionBarLayout) {
                T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
            }
            h4 createArticleViewer = T.createArticleViewer(true);
            if (createArticleViewer.f37746u0 != null) {
                int i10 = 0;
                while (true) {
                    l3[] l3VarArr = createArticleViewer.f37746u0;
                    if (i10 >= l3VarArr.length) {
                        break;
                    }
                    l3 l3Var = l3VarArr[i10];
                    if (l3Var != null) {
                        l3Var.f39040f.setOpener(v0Var);
                    }
                    i10++;
                }
            }
            v0 v0Var2 = null;
            createArticleViewer.L(null, null, null, null);
            l3 l3Var2 = createArticleViewer.f37746u0[0];
            if (l3Var2 != null && l3Var2.f()) {
                if (createArticleViewer.f37746u0[0].getWebView() == null) {
                    createArticleViewer.f37746u0[0].f39040f.c();
                }
                v0Var2 = createArticleViewer.f37746u0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                v0Var2.D = url;
            }
            v0Var.c("onCreateWindow: newWebView=" + v0Var2);
            if (v0Var2 != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(v0Var2);
                message.sendToTarget();
                return true;
            }
            createArticleViewer.m(true, true);
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
        org.telegram.ui.ActionBar.x1 x1Var = this.f43187a;
        v0 v0Var = this.e;
        if (x1Var != null) {
            v0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f43187a.dismiss();
            this.f43187a = null;
            return;
        }
        v0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String K0;
        int i10;
        int i11;
        v0 v0Var = this.e;
        z0 z0Var = v0Var.Q;
        if (z0Var != null && z0Var.W != null) {
            v0Var.c("onGeolocationPermissionsShowPrompt " + str);
            boolean z10 = this.f43189c;
            if (z10) {
                K0 = h20.p(v0Var.Q.U);
            } else {
                K0 = org.telegram.messenger.i0.K0(v0Var.getUrl(), false);
            }
            z0 z0Var2 = v0Var.Q;
            Activity activity = z0Var2.W;
            p6 p6Var = z0Var2.e;
            String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
            if (z10) {
                i10 = 2131752903;
            } else {
                i10 = 2131742932;
            }
            String a02 = cd.a0(null, null, i10, K0);
            if (z10) {
                i11 = 2131752902;
            } else {
                i11 = 2131742931;
            }
            org.telegram.ui.ActionBar.x1 Y = s4.Y(activity, p6Var, strArr, 2131624117, a02, cd.a0(null, null, i11, K0), new n0(this, callback, str, 0));
            this.f43187a = Y;
            Y.show();
            return;
        }
        v0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        p6 p6Var;
        String a02;
        boolean[] zArr = {false};
        z0 z0Var = this.e.Q;
        if (z0Var == null) {
            p6Var = null;
        } else {
            p6Var = z0Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f43188b, p6Var);
        if (this.f43189c) {
            a02 = o5.l(d20.f15147s0, this.d);
        } else {
            a02 = cd.a0(null, null, 2131742928, str);
        }
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = a02;
        x1Var.T = str2;
        alertDialog$Builder.k(cd.L0(2131747847, null), new o0(zArr, jsResult, 2));
        x1Var.setOnDismissListener(new p0(zArr, jsResult, 1));
        alertDialog$Builder.p();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        p6 p6Var;
        String a02;
        boolean[] zArr = {false};
        z0 z0Var = this.e.Q;
        if (z0Var == null) {
            p6Var = null;
        } else {
            p6Var = z0Var.e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f43188b, p6Var);
        if (this.f43189c) {
            a02 = o5.l(d20.f15147s0, this.d);
        } else {
            a02 = cd.a0(null, null, 2131742928, str);
        }
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = a02;
        x1Var.T = str2;
        alertDialog$Builder.h(cd.L0(2131752589, null), new o0(zArr, jsResult, 0));
        alertDialog$Builder.k(cd.L0(2131747847, null), new o0(zArr, jsResult, 1));
        x1Var.setOnDismissListener(new p0(zArr, jsResult, 0));
        alertDialog$Builder.p();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        p6 p6Var;
        String a02;
        z0 z0Var = this.e.Q;
        if (z0Var == null) {
            p6Var = null;
        } else {
            p6Var = z0Var.e;
        }
        boolean[] zArr = {false};
        Context context = this.f43188b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        if (this.f43189c) {
            a02 = o5.l(d20.f15147s0, this.d);
        } else {
            a02 = cd.a0(null, null, 2131742928, str);
        }
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = a02;
        x1Var.T = str2;
        mt mtVar = new mt(context, p6Var);
        mtVar.f24014r0 = true;
        mtVar.setTextSize(1, 18.0f);
        a7.V(mtVar, t6.f21037j5, p6Var);
        a7.m(mtVar, 34, t6.Li, p6Var);
        mtVar.setFocusable(true);
        mtVar.setInputType(147457);
        a7.G(mtVar, t6.f21058k6, t6.f21076l6, t6.f21153p7, p6Var);
        mtVar.setImeOptions(6);
        mtVar.setBackgroundDrawable(null);
        mtVar.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f));
        mtVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(mtVar, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        x1Var.f21468a = org.telegram.messenger.i0.L(292.0f);
        alertDialog$Builder.h(cd.L0(2131752589, null), new k0(0, zArr, jsPromptResult));
        alertDialog$Builder.k(cd.L0(2131747847, null), new androidx.car.app.utils.a(zArr, jsPromptResult, mtVar, 29));
        alertDialog$Builder.j(new mg.g(13, zArr, jsPromptResult));
        x1Var.O = new ag.l(mtVar, 26);
        mtVar.setOnEditorActionListener(new q0(zArr, jsPromptResult, mtVar, alertDialog$Builder.p(), 0));
        org.telegram.messenger.i0.g3(new w5(mtVar, 14));
        return true;
    }

    @Override
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String K0;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.x1 x1Var = this.f43187a;
        if (x1Var != null) {
            x1Var.dismiss();
            this.f43187a = null;
        }
        v0 v0Var = this.e;
        if (v0Var.Q == null) {
            v0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        v0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.f43189c;
        if (z10) {
            K0 = h20.p(v0Var.Q.U);
        } else {
            K0 = org.telegram.messenger.i0.K0(v0Var.getUrl(), false);
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            z0 z0Var = v0Var.Q;
            if (z0Var.W == null) {
                permissionRequest.deny();
            } else if (z0Var.r()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        z0 z0Var2 = v0Var.Q;
                        Activity activity = z0Var2.W;
                        p6 p6Var = z0Var2.e;
                        String[] strArr = {"android.permission.RECORD_AUDIO"};
                        if (z10) {
                            i14 = 2131752901;
                        } else {
                            i14 = 2131742930;
                        }
                        String a02 = cd.a0(null, null, i14, K0);
                        if (z10) {
                            i15 = 2131752900;
                        } else {
                            i15 = 2131742929;
                        }
                        org.telegram.ui.ActionBar.x1 Y = s4.Y(activity, p6Var, strArr, 2131624118, a02, cd.a0(null, null, i15, K0), new l0(this, permissionRequest, str, 0));
                        this.f43187a = Y;
                        Y.show();
                        return;
                    }
                    return;
                }
                z0 z0Var3 = v0Var.Q;
                Activity activity2 = z0Var3.W;
                p6 p6Var2 = z0Var3.e;
                String[] strArr2 = {"android.permission.CAMERA"};
                if (z10) {
                    i12 = 2131752906;
                } else {
                    i12 = 2131742934;
                }
                String a03 = cd.a0(null, null, i12, K0);
                if (z10) {
                    i13 = 2131752905;
                } else {
                    i13 = 2131742933;
                }
                org.telegram.ui.ActionBar.x1 Y2 = s4.Y(activity2, p6Var2, strArr2, 2131624114, a03, cd.a0(null, null, i13, K0), new l0(this, permissionRequest, str, 1));
                this.f43187a = Y2;
                Y2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    z0 z0Var4 = v0Var.Q;
                    Activity activity3 = z0Var4.W;
                    p6 p6Var3 = z0Var4.e;
                    String[] strArr3 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                    if (z10) {
                        i10 = 2131752908;
                    } else {
                        i10 = 2131742936;
                    }
                    String a04 = cd.a0(null, null, i10, K0);
                    if (z10) {
                        i11 = 2131752907;
                    } else {
                        i11 = 2131742935;
                    }
                    org.telegram.ui.ActionBar.x1 Y3 = s4.Y(activity3, p6Var3, strArr3, 2131624114, a04, cd.a0(null, null, i11, K0), new m0(this, permissionRequest, resources, 0));
                    this.f43187a = Y3;
                    Y3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.x1 x1Var = this.f43187a;
        v0 v0Var = this.e;
        if (x1Var != null) {
            v0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f43187a.dismiss();
            this.f43187a = null;
            return;
        }
        v0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i10) {
        v0 v0Var = this.e;
        z0 z0Var = v0Var.Q;
        if (z0Var != null && z0Var.f43287x != null) {
            v0Var.c("onProgressChanged " + i10 + "%");
            v0Var.Q.f43287x.accept(Float.valueOf(((float) i10) / 100.0f));
            return;
        }
        v0Var.c("onProgressChanged " + i10 + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        v0 v0Var = this.e;
        HashMap hashMap = v0Var.P;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        v0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(v0Var.getUrl(), v0Var.L) || v0Var.O == null || bitmap.getWidth() > v0Var.O.getWidth())) {
            v0Var.O = bitmap;
            v0Var.L = v0Var.getUrl();
            v0Var.M = true;
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
        v0 v0Var = this.e;
        v0Var.c("onReceivedTitle title=" + str);
        if (!v0Var.h) {
            v0Var.J = true;
            v0Var.K = str;
        }
        z0 z0Var = v0Var.Q;
        if (z0Var != null) {
            z0Var.H();
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
        v0 v0Var = this.e;
        Activity W = org.telegram.messenger.i0.W(v0Var.getContext());
        boolean z10 = false;
        if (W == null) {
            v0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        z0 z0Var = v0Var.Q;
        if (z0Var == null) {
            v0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = z0Var.f43289y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        v0Var.Q.f43289y = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z10 = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        v0Var.c("onShowFileChooser: true");
        return true;
    }
}
