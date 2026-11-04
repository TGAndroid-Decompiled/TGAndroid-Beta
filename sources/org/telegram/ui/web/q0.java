package org.telegram.ui.web;

import ai.v3;
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
import b8.mf;
import ci.h3;
import gi.j8;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.xs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i4;
import org.telegram.ui.l3;
import org.telegram.ui.na1;
public final class q0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.s1 f50993a;
    public final Context f50994b;
    public final boolean f50995c;
    public final long d;
    public final t0 f50996e;

    public q0(t0 t0Var, Context context, boolean z10, long j10) {
        this.f50996e = t0Var;
        this.f50994b = context;
        this.f50995c = z10;
        this.d = j10;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        d0 d0Var;
        t0 t0Var = this.f50996e;
        t0Var.c("onCloseWindow " + webView);
        w0 w0Var = t0Var.R;
        if (w0Var != null && (d0Var = w0Var.f51064c) != null) {
            d0Var.z();
        } else {
            Runnable runnable = t0Var.V;
            if (runnable != null) {
                runnable.run();
                t0Var.V = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        d2 T;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        t0 t0Var = this.f50996e;
        t0Var.c(str);
        String url = t0Var.getUrl();
        if (hp.s1(h10.f22829t0).M2()) {
            if (t0Var.R == null || (T = LaunchActivity.T()) == null) {
                return false;
            }
            if (T.getParentLayout() instanceof ActionBarLayout) {
                T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
            }
            i4 createArticleViewer = T.createArticleViewer(true);
            if (createArticleViewer.f46100v0 != null) {
                int i3 = 0;
                while (true) {
                    l3[] l3VarArr = createArticleViewer.f46100v0;
                    if (i3 >= l3VarArr.length) {
                        break;
                    }
                    l3 l3Var = l3VarArr[i3];
                    if (l3Var != null) {
                        l3Var.f47086f.setOpener(t0Var);
                    }
                    i3++;
                }
            }
            t0 t0Var2 = null;
            createArticleViewer.L(null, null, null, null);
            l3 l3Var2 = createArticleViewer.f46100v0[0];
            if (l3Var2 != null && l3Var2.f()) {
                if (createArticleViewer.f46100v0[0].getWebView() == null) {
                    createArticleViewer.f46100v0[0].f47086f.c();
                }
                t0Var2 = createArticleViewer.f46100v0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                t0Var2.E = url;
            }
            t0Var.c("onCreateWindow: newWebView=" + t0Var2);
            if (t0Var2 != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(t0Var2);
                message.sendToTarget();
                return true;
            }
            createArticleViewer.m(true, true);
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new p0(this, webView2));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.s1 s1Var = this.f50993a;
        t0 t0Var = this.f50996e;
        if (s1Var != null) {
            t0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f50993a.dismiss();
            this.f50993a = null;
            return;
        }
        t0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String K0;
        int i3;
        int i10;
        t0 t0Var = this.f50996e;
        w0 w0Var = t0Var.R;
        if (w0Var != null && w0Var.f51061a0 != null) {
            t0Var.c("onGeolocationPermissionsShowPrompt " + str);
            boolean z10 = this.f50995c;
            if (z10) {
                K0 = l10.p(t0Var.R.V);
            } else {
                K0 = org.telegram.messenger.g0.K0(t0Var.getUrl(), false);
            }
            w0 w0Var2 = t0Var.R;
            Activity activity = w0Var2.f51061a0;
            e6 e6Var = w0Var2.f51067e;
            String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
            if (z10) {
                i3 = 2131752903;
            } else {
                i3 = 2131742916;
            }
            String a02 = bd.a0(null, null, i3, K0);
            if (z10) {
                i10 = 2131752902;
            } else {
                i10 = 2131742915;
            }
            org.telegram.ui.ActionBar.s1 Y = t4.Y(activity, e6Var, strArr, 2131624119, a02, bd.a0(null, null, i10, K0), new m0(this, callback, str, 0));
            this.f50993a = Y;
            Y.show();
            return;
        }
        t0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        e6 e6Var;
        String a02;
        boolean[] zArr = {false};
        w0 w0Var = this.f50996e.R;
        if (w0Var == null) {
            e6Var = null;
        } else {
            e6Var = w0Var.f51067e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f50994b, e6Var);
        if (this.f50995c) {
            a02 = m5.l(h10.f22829t0, this.d);
        } else {
            a02 = bd.a0(null, null, 2131742912, str);
        }
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = a02;
        s1Var.U = str2;
        alertDialog$Builder.k(bd.M0(2131747839, null), new n0(zArr, jsResult, 2));
        s1Var.setOnDismissListener(new o0(zArr, jsResult, 1));
        alertDialog$Builder.p();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        e6 e6Var;
        String a02;
        boolean[] zArr = {false};
        w0 w0Var = this.f50996e.R;
        if (w0Var == null) {
            e6Var = null;
        } else {
            e6Var = w0Var.f51067e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f50994b, e6Var);
        if (this.f50995c) {
            a02 = m5.l(h10.f22829t0, this.d);
        } else {
            a02 = bd.a0(null, null, 2131742912, str);
        }
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = a02;
        s1Var.U = str2;
        alertDialog$Builder.h(bd.M0(2131752589, null), new n0(zArr, jsResult, 0));
        alertDialog$Builder.k(bd.M0(2131747839, null), new n0(zArr, jsResult, 1));
        s1Var.setOnDismissListener(new o0(zArr, jsResult, 0));
        alertDialog$Builder.p();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        e6 e6Var;
        String a02;
        w0 w0Var = this.f50996e.R;
        if (w0Var == null) {
            e6Var = null;
        } else {
            e6Var = w0Var.f51067e;
        }
        boolean[] zArr = {false};
        Context context = this.f50994b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        if (this.f50995c) {
            a02 = m5.l(h10.f22829t0, this.d);
        } else {
            a02 = bd.a0(null, null, 2131742912, str);
        }
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = a02;
        s1Var.U = str2;
        xs xsVar = new xs(context, e6Var);
        xsVar.f31433s0 = true;
        xsVar.setTextSize(1, 18.0f);
        r6.V(xsVar, k6.f27988j5, e6Var);
        r6.m(xsVar, 34, k6.Li, e6Var);
        xsVar.setFocusable(true);
        xsVar.setInputType(147457);
        r6.G(xsVar, k6.f28007k6, k6.f28026l6, k6.f28102p7, e6Var);
        xsVar.setImeOptions(6);
        xsVar.setBackgroundDrawable(null);
        xsVar.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        xsVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(xsVar, mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        s1Var.f28523a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder.h(bd.M0(2131752589, null), new na1(9, zArr, jsPromptResult));
        alertDialog$Builder.k(bd.M0(2131747839, null), new hr(zArr, jsPromptResult, xsVar, 7));
        alertDialog$Builder.j(new h3(17, zArr, jsPromptResult));
        s1Var.P = new j8(xsVar, 18);
        xsVar.setOnEditorActionListener(new v3(zArr, jsPromptResult, xsVar, alertDialog$Builder.p(), 1));
        org.telegram.messenger.g0.h3(new d4(xsVar, 18));
        return true;
    }

    @Override
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String K0;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.s1 s1Var = this.f50993a;
        if (s1Var != null) {
            s1Var.dismiss();
            this.f50993a = null;
        }
        t0 t0Var = this.f50996e;
        if (t0Var.R == null) {
            t0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        t0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.f50995c;
        if (z10) {
            K0 = l10.p(t0Var.R.V);
        } else {
            K0 = org.telegram.messenger.g0.K0(t0Var.getUrl(), false);
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            w0 w0Var = t0Var.R;
            if (w0Var.f51061a0 == null) {
                permissionRequest.deny();
            } else if (w0Var.r()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        w0 w0Var2 = t0Var.R;
                        Activity activity = w0Var2.f51061a0;
                        e6 e6Var = w0Var2.f51067e;
                        String[] strArr = {"android.permission.RECORD_AUDIO"};
                        if (z10) {
                            i13 = 2131752901;
                        } else {
                            i13 = 2131742914;
                        }
                        String a02 = bd.a0(null, null, i13, K0);
                        if (z10) {
                            i14 = 2131752900;
                        } else {
                            i14 = 2131742913;
                        }
                        org.telegram.ui.ActionBar.s1 Y = t4.Y(activity, e6Var, strArr, 2131624120, a02, bd.a0(null, null, i14, K0), new k0(this, permissionRequest, str, 0));
                        this.f50993a = Y;
                        Y.show();
                        return;
                    }
                    return;
                }
                w0 w0Var3 = t0Var.R;
                Activity activity2 = w0Var3.f51061a0;
                e6 e6Var2 = w0Var3.f51067e;
                String[] strArr2 = {"android.permission.CAMERA"};
                if (z10) {
                    i11 = 2131752906;
                } else {
                    i11 = 2131742918;
                }
                String a03 = bd.a0(null, null, i11, K0);
                if (z10) {
                    i12 = 2131752905;
                } else {
                    i12 = 2131742917;
                }
                org.telegram.ui.ActionBar.s1 Y2 = t4.Y(activity2, e6Var2, strArr2, 2131624116, a03, bd.a0(null, null, i12, K0), new k0(this, permissionRequest, str, 1));
                this.f50993a = Y2;
                Y2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    w0 w0Var4 = t0Var.R;
                    Activity activity3 = w0Var4.f51061a0;
                    e6 e6Var3 = w0Var4.f51067e;
                    String[] strArr3 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                    if (z10) {
                        i3 = 2131752908;
                    } else {
                        i3 = 2131742920;
                    }
                    String a04 = bd.a0(null, null, i3, K0);
                    if (z10) {
                        i10 = 2131752907;
                    } else {
                        i10 = 2131742919;
                    }
                    org.telegram.ui.ActionBar.s1 Y3 = t4.Y(activity3, e6Var3, strArr3, 2131624116, a04, bd.a0(null, null, i10, K0), new l0(this, permissionRequest, resources, 0));
                    this.f50993a = Y3;
                    Y3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.s1 s1Var = this.f50993a;
        t0 t0Var = this.f50996e;
        if (s1Var != null) {
            t0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f50993a.dismiss();
            this.f50993a = null;
            return;
        }
        t0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i3) {
        t0 t0Var = this.f50996e;
        w0 w0Var = t0Var.R;
        if (w0Var != null && w0Var.f51091x != null) {
            t0Var.c("onProgressChanged " + i3 + "%");
            t0Var.R.f51091x.accept(Float.valueOf(((float) i3) / 100.0f));
            return;
        }
        t0Var.c("onProgressChanged " + i3 + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        t0 t0Var = this.f50996e;
        HashMap hashMap = t0Var.Q;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        t0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(t0Var.getUrl(), t0Var.M) || t0Var.P == null || bitmap.getWidth() > t0Var.P.getWidth())) {
            t0Var.P = bitmap;
            t0Var.M = t0Var.getUrl();
            t0Var.N = true;
            t0.a(t0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(t0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(t0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override
    public final void onReceivedTitle(WebView webView, String str) {
        t0 t0Var = this.f50996e;
        t0Var.c("onReceivedTitle title=" + str);
        if (!t0Var.h) {
            t0Var.K = true;
            t0Var.L = str;
        }
        w0 w0Var = t0Var.R;
        if (w0Var != null) {
            w0Var.H();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        this.f50996e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z10);
        super.onReceivedTouchIconUrl(webView, str, z10);
    }

    @Override
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        t0 t0Var = this.f50996e;
        Activity W = org.telegram.messenger.g0.W(t0Var.getContext());
        boolean z10 = false;
        if (W == null) {
            t0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        w0 w0Var = t0Var.R;
        if (w0Var == null) {
            t0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = w0Var.f51093y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        t0Var.R.f51093y = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z10 = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        t0Var.c("onShowFileChooser: true");
        return true;
    }
}
