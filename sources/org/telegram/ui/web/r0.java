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
import c8.ha;
import java.util.HashMap;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.zs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g4;
import org.telegram.ui.k3;
public final class r0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.u1 f51271a;
    public final Context f51272b;
    public final boolean f51273c;
    public final long d;
    public final u0 f51274e;

    public r0(u0 u0Var, Context context, boolean z9, long j3) {
        this.f51274e = u0Var;
        this.f51272b = context;
        this.f51273c = z9;
        this.d = j3;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        d0 d0Var;
        u0 u0Var = this.f51274e;
        u0Var.c("onCloseWindow " + webView);
        x0 x0Var = u0Var.Q;
        if (x0Var != null && (d0Var = x0Var.f51345c) != null) {
            d0Var.z();
        } else {
            Runnable runnable = u0Var.U;
            if (runnable != null) {
                runnable.run();
                u0Var.U = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z9, boolean z10, Message message) {
        f2 T;
        String str = "onCreateWindow isDialog=" + z9 + " isUserGesture=" + z10 + " resultMsg=" + message;
        u0 u0Var = this.f51274e;
        u0Var.c(str);
        String url = u0Var.getUrl();
        if (qp.s1(p10.f24470s0).M2()) {
            if (u0Var.Q == null || (T = LaunchActivity.T()) == null) {
                return false;
            }
            if (T.getParentLayout() instanceof ActionBarLayout) {
                T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
            }
            g4 createArticleViewer = T.createArticleViewer(true);
            if (createArticleViewer.f45902u0 != null) {
                int i7 = 0;
                while (true) {
                    k3[] k3VarArr = createArticleViewer.f45902u0;
                    if (i7 >= k3VarArr.length) {
                        break;
                    }
                    k3 k3Var = k3VarArr[i7];
                    if (k3Var != null) {
                        k3Var.f47170f.setOpener(u0Var);
                    }
                    i7++;
                }
            }
            u0 u0Var2 = null;
            createArticleViewer.L(null, null, null, null);
            k3 k3Var2 = createArticleViewer.f45902u0[0];
            if (k3Var2 != null && k3Var2.f()) {
                if (createArticleViewer.f45902u0[0].getWebView() == null) {
                    createArticleViewer.f45902u0[0].f47170f.c();
                }
                u0Var2 = createArticleViewer.f45902u0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                u0Var2.D = url;
            }
            u0Var.c("onCreateWindow: newWebView=" + u0Var2);
            if (u0Var2 != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(u0Var2);
                message.sendToTarget();
                return true;
            }
            createArticleViewer.m(true, true);
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new q0(this, webView2));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.u1 u1Var = this.f51271a;
        u0 u0Var = this.f51274e;
        if (u1Var != null) {
            u0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f51271a.dismiss();
            this.f51271a = null;
            return;
        }
        u0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String K0;
        int i7;
        int i10;
        u0 u0Var = this.f51274e;
        x0 x0Var = u0Var.Q;
        if (x0Var != null && x0Var.W != null) {
            u0Var.c("onGeolocationPermissionsShowPrompt " + str);
            boolean z9 = this.f51273c;
            if (z9) {
                K0 = t10.p(u0Var.Q.U);
            } else {
                K0 = org.telegram.messenger.g0.K0(u0Var.getUrl(), false);
            }
            x0 x0Var2 = u0Var.Q;
            Activity activity = x0Var2.W;
            g6 g6Var = x0Var2.f51348e;
            String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
            if (z9) {
                i7 = 2131752903;
            } else {
                i7 = 2131742906;
            }
            String a02 = id.a0(null, null, i7, K0);
            if (z9) {
                i10 = 2131752902;
            } else {
                i10 = 2131742905;
            }
            org.telegram.ui.ActionBar.u1 W = v4.W(activity, g6Var, strArr, 2131624119, a02, id.a0(null, null, i10, K0), new m0(this, callback, str, 0));
            this.f51271a = W;
            W.show();
            return;
        }
        u0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        g6 g6Var;
        String a02;
        boolean[] zArr = {false};
        x0 x0Var = this.f51274e.Q;
        if (x0Var == null) {
            g6Var = null;
        } else {
            g6Var = x0Var.f51348e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f51272b, g6Var);
        if (this.f51273c) {
            a02 = m5.l(p10.f24470s0, this.d);
        } else {
            a02 = id.a0(null, null, 2131742902, str);
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = a02;
        u1Var.T = str2;
        alertDialog$Builder.k(id.M0(2131747831, null), new n0(zArr, jsResult, 2));
        u1Var.setOnDismissListener(new o0(zArr, jsResult, 1));
        alertDialog$Builder.p();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        g6 g6Var;
        String a02;
        boolean[] zArr = {false};
        x0 x0Var = this.f51274e.Q;
        if (x0Var == null) {
            g6Var = null;
        } else {
            g6Var = x0Var.f51348e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f51272b, g6Var);
        if (this.f51273c) {
            a02 = m5.l(p10.f24470s0, this.d);
        } else {
            a02 = id.a0(null, null, 2131742902, str);
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = a02;
        u1Var.T = str2;
        alertDialog$Builder.h(id.M0(2131752589, null), new n0(zArr, jsResult, 0));
        alertDialog$Builder.k(id.M0(2131747831, null), new n0(zArr, jsResult, 1));
        u1Var.setOnDismissListener(new o0(zArr, jsResult, 0));
        alertDialog$Builder.p();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        g6 g6Var;
        String a02;
        x0 x0Var = this.f51274e.Q;
        if (x0Var == null) {
            g6Var = null;
        } else {
            g6Var = x0Var.f51348e;
        }
        boolean[] zArr = {false};
        Context context = this.f51272b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
        if (this.f51273c) {
            a02 = m5.l(p10.f24470s0, this.d);
        } else {
            a02 = id.a0(null, null, 2131742902, str);
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = a02;
        u1Var.T = str2;
        zs zsVar = new zs(context, g6Var);
        zsVar.f31366r0 = true;
        zsVar.setTextSize(1, 18.0f);
        s6.U(zsVar, l6.f27973j5, g6Var);
        s6.l(zsVar, 34, l6.Li, g6Var);
        zsVar.setFocusable(true);
        zsVar.setInputType(147457);
        s6.F(zsVar, l6.f27994k6, l6.f28012l6, l6.f28086p7, g6Var);
        zsVar.setImeOptions(6);
        zsVar.setBackgroundDrawable(null);
        zsVar.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        zsVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(zsVar, ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        u1Var.f28542a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder.h(id.M0(2131752589, null), new a0(1, zArr, jsPromptResult));
        alertDialog$Builder.k(id.M0(2131747831, null), new hr(zArr, jsPromptResult, zsVar, 7));
        alertDialog$Builder.j(new u3(17, zArr, jsPromptResult));
        u1Var.O = new ii.c(zsVar, 15);
        zsVar.setOnEditorActionListener(new p0(zArr, jsPromptResult, zsVar, alertDialog$Builder.p(), 0));
        org.telegram.messenger.g0.h3(new o5(zsVar, 11));
        return true;
    }

    @Override
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String K0;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.u1 u1Var = this.f51271a;
        if (u1Var != null) {
            u1Var.dismiss();
            this.f51271a = null;
        }
        u0 u0Var = this.f51274e;
        if (u0Var.Q == null) {
            u0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        u0Var.c("onPermissionRequest " + permissionRequest);
        boolean z9 = this.f51273c;
        if (z9) {
            K0 = t10.p(u0Var.Q.U);
        } else {
            K0 = org.telegram.messenger.g0.K0(u0Var.getUrl(), false);
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            x0 x0Var = u0Var.Q;
            if (x0Var.W == null) {
                permissionRequest.deny();
            } else if (x0Var.r()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        x0 x0Var2 = u0Var.Q;
                        Activity activity = x0Var2.W;
                        g6 g6Var = x0Var2.f51348e;
                        String[] strArr = {"android.permission.RECORD_AUDIO"};
                        if (z9) {
                            i13 = 2131752901;
                        } else {
                            i13 = 2131742904;
                        }
                        String a02 = id.a0(null, null, i13, K0);
                        if (z9) {
                            i14 = 2131752900;
                        } else {
                            i14 = 2131742903;
                        }
                        org.telegram.ui.ActionBar.u1 W = v4.W(activity, g6Var, strArr, 2131624120, a02, id.a0(null, null, i14, K0), new k0(this, permissionRequest, str, 0));
                        this.f51271a = W;
                        W.show();
                        return;
                    }
                    return;
                }
                x0 x0Var3 = u0Var.Q;
                Activity activity2 = x0Var3.W;
                g6 g6Var2 = x0Var3.f51348e;
                String[] strArr2 = {"android.permission.CAMERA"};
                if (z9) {
                    i11 = 2131752906;
                } else {
                    i11 = 2131742908;
                }
                String a03 = id.a0(null, null, i11, K0);
                if (z9) {
                    i12 = 2131752905;
                } else {
                    i12 = 2131742907;
                }
                org.telegram.ui.ActionBar.u1 W2 = v4.W(activity2, g6Var2, strArr2, 2131624116, a03, id.a0(null, null, i12, K0), new k0(this, permissionRequest, str, 1));
                this.f51271a = W2;
                W2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    x0 x0Var4 = u0Var.Q;
                    Activity activity3 = x0Var4.W;
                    g6 g6Var3 = x0Var4.f51348e;
                    String[] strArr3 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                    if (z9) {
                        i7 = 2131752908;
                    } else {
                        i7 = 2131742910;
                    }
                    String a04 = id.a0(null, null, i7, K0);
                    if (z9) {
                        i10 = 2131752907;
                    } else {
                        i10 = 2131742909;
                    }
                    org.telegram.ui.ActionBar.u1 W3 = v4.W(activity3, g6Var3, strArr3, 2131624116, a04, id.a0(null, null, i10, K0), new l0(this, permissionRequest, resources, 0));
                    this.f51271a = W3;
                    W3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.u1 u1Var = this.f51271a;
        u0 u0Var = this.f51274e;
        if (u1Var != null) {
            u0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f51271a.dismiss();
            this.f51271a = null;
            return;
        }
        u0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i7) {
        u0 u0Var = this.f51274e;
        x0 x0Var = u0Var.Q;
        if (x0Var != null && x0Var.f51372x != null) {
            u0Var.c("onProgressChanged " + i7 + "%");
            u0Var.Q.f51372x.accept(Float.valueOf(((float) i7) / 100.0f));
            return;
        }
        u0Var.c("onProgressChanged " + i7 + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        u0 u0Var = this.f51274e;
        HashMap hashMap = u0Var.P;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        u0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(u0Var.getUrl(), u0Var.L) || u0Var.O == null || bitmap.getWidth() > u0Var.O.getWidth())) {
            u0Var.O = bitmap;
            u0Var.L = u0Var.getUrl();
            u0Var.M = true;
            u0.a(u0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(u0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(u0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override
    public final void onReceivedTitle(WebView webView, String str) {
        u0 u0Var = this.f51274e;
        u0Var.c("onReceivedTitle title=" + str);
        if (!u0Var.h) {
            u0Var.J = true;
            u0Var.K = str;
        }
        x0 x0Var = u0Var.Q;
        if (x0Var != null) {
            x0Var.I();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z9) {
        this.f51274e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z9);
        super.onReceivedTouchIconUrl(webView, str, z9);
    }

    @Override
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        u0 u0Var = this.f51274e;
        Activity W = org.telegram.messenger.g0.W(u0Var.getContext());
        boolean z9 = false;
        if (W == null) {
            u0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        x0 x0Var = u0Var.Q;
        if (x0Var == null) {
            u0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = x0Var.f51374y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        u0Var.Q.f51374y = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z9 = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z9) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        u0Var.c("onShowFileChooser: true");
        return true;
    }
}
