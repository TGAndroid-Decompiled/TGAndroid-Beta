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
import bi.s5;
import c8.ma;
import hi.t6;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.rm;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g4;
import org.telegram.ui.k3;
import org.telegram.ui.wc1;
public final class p0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.u1 f53276a;
    public final Context f53277b;
    public final boolean f53278c;
    public final long d;
    public final s0 f53279e;

    public p0(s0 s0Var, Context context, boolean z10, long j3) {
        this.f53279e = s0Var;
        this.f53277b = context;
        this.f53278c = z10;
        this.d = j3;
    }

    @Override
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onCloseWindow(WebView webView) {
        c0 c0Var;
        s0 s0Var = this.f53279e;
        s0Var.c("onCloseWindow " + webView);
        v0 v0Var = s0Var.R;
        if (v0Var != null && (c0Var = v0Var.f53347c) != null) {
            c0Var.z();
        } else {
            Runnable runnable = s0Var.V;
            if (runnable != null) {
                runnable.run();
                s0Var.V = null;
            }
        }
        super.onCloseWindow(webView);
    }

    @Override
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        h2 T;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        s0 s0Var = this.f53279e;
        s0Var.c(str);
        String url = s0Var.getUrl();
        if (mp.u1(j10.f24773t0).S2()) {
            if (s0Var.R == null || (T = LaunchActivity.T()) == null) {
                return false;
            }
            if (T.getParentLayout() instanceof ActionBarLayout) {
                T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
            }
            g4 createArticleViewer = T.createArticleViewer(true);
            if (createArticleViewer.f47935v0 != null) {
                int i7 = 0;
                while (true) {
                    k3[] k3VarArr = createArticleViewer.f47935v0;
                    if (i7 >= k3VarArr.length) {
                        break;
                    }
                    k3 k3Var = k3VarArr[i7];
                    if (k3Var != null) {
                        k3Var.f49161f.setOpener(s0Var);
                    }
                    i7++;
                }
            }
            s0 s0Var2 = null;
            createArticleViewer.L(null, null, null, null);
            k3 k3Var2 = createArticleViewer.f47935v0[0];
            if (k3Var2 != null && k3Var2.f()) {
                if (createArticleViewer.f47935v0[0].getWebView() == null) {
                    createArticleViewer.f47935v0[0].f49161f.c();
                }
                s0Var2 = createArticleViewer.f47935v0[0].getWebView();
            }
            if (!TextUtils.isEmpty(url)) {
                s0Var2.E = url;
            }
            s0Var.c("onCreateWindow: newWebView=" + s0Var2);
            if (s0Var2 != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(s0Var2);
                message.sendToTarget();
                return true;
            }
            createArticleViewer.m(true, true);
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new o0(this, webView2));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.u1 u1Var = this.f53276a;
        s0 s0Var = this.f53279e;
        if (u1Var != null) {
            s0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
            this.f53276a.dismiss();
            this.f53276a = null;
            return;
        }
        s0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
    }

    @Override
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String K0;
        int i7;
        int i10;
        s0 s0Var = this.f53279e;
        v0 v0Var = s0Var.R;
        if (v0Var != null && v0Var.f53344a0 != null) {
            s0Var.c("onGeolocationPermissionsShowPrompt " + str);
            boolean z10 = this.f53278c;
            if (z10) {
                K0 = o10.q(s0Var.R.V);
            } else {
                K0 = org.telegram.messenger.g0.K0(s0Var.getUrl(), false);
            }
            v0 v0Var2 = s0Var.R;
            Activity activity = v0Var2.f53344a0;
            i6 i6Var = v0Var2.f53350e;
            String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
            if (z10) {
                i7 = 2131752892;
            } else {
                i7 = 2131742648;
            }
            String a02 = gd.a0(null, null, i7, K0);
            if (z10) {
                i10 = 2131752891;
            } else {
                i10 = 2131742647;
            }
            org.telegram.ui.ActionBar.u1 W = b5.W(activity, i6Var, strArr, 2131624120, a02, gd.a0(null, null, i10, K0), new l0(this, callback, str, 0));
            this.f53276a = W;
            W.show();
            return;
        }
        s0Var.c("onGeolocationPermissionsShowPrompt: no container");
        callback.invoke(str, false, false);
    }

    @Override
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        i6 i6Var;
        String a02;
        boolean[] zArr = {false};
        v0 v0Var = this.f53279e.R;
        if (v0Var == null) {
            i6Var = null;
        } else {
            i6Var = v0Var.f53350e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f53277b, i6Var);
        if (this.f53278c) {
            a02 = n5.l(j10.f24773t0, this.d);
        } else {
            a02 = gd.a0(null, null, 2131742644, str);
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = a02;
        u1Var.U = str2;
        alertDialog$Builder.k(gd.M0(2131747638, null), new m0(zArr, jsResult, 2));
        u1Var.setOnDismissListener(new n0(zArr, jsResult, 1));
        alertDialog$Builder.p();
        return true;
    }

    @Override
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        i6 i6Var;
        String a02;
        boolean[] zArr = {false};
        v0 v0Var = this.f53279e.R;
        if (v0Var == null) {
            i6Var = null;
        } else {
            i6Var = v0Var.f53350e;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f53277b, i6Var);
        if (this.f53278c) {
            a02 = n5.l(j10.f24773t0, this.d);
        } else {
            a02 = gd.a0(null, null, 2131742644, str);
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = a02;
        u1Var.U = str2;
        alertDialog$Builder.h(gd.M0(2131752578, null), new m0(zArr, jsResult, 0));
        alertDialog$Builder.k(gd.M0(2131747638, null), new m0(zArr, jsResult, 1));
        u1Var.setOnDismissListener(new n0(zArr, jsResult, 0));
        alertDialog$Builder.p();
        return true;
    }

    @Override
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        i6 i6Var;
        String a02;
        v0 v0Var = this.f53279e.R;
        if (v0Var == null) {
            i6Var = null;
        } else {
            i6Var = v0Var.f53350e;
        }
        boolean[] zArr = {false};
        Context context = this.f53277b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        if (this.f53278c) {
            a02 = n5.l(j10.f24773t0, this.d);
        } else {
            a02 = gd.a0(null, null, 2131742644, str);
        }
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = a02;
        u1Var.U = str2;
        mt mtVar = new mt(context, i6Var);
        mtVar.f32936s0 = true;
        mtVar.setTextSize(1, 18.0f);
        u6.U(mtVar, n6.f29504j5, i6Var);
        u6.l(mtVar, 34, n6.Oi, i6Var);
        mtVar.setFocusable(true);
        mtVar.setInputType(147457);
        u6.F(mtVar, n6.f29525k6, n6.f29543l6, n6.f29617p7, i6Var);
        mtVar.setImeOptions(6);
        mtVar.setBackgroundDrawable(null);
        mtVar.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        mtVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(mtVar, ma.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        u1Var.f30026a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder.h(gd.M0(2131752578, null), new wc1(3, zArr, jsPromptResult));
        alertDialog$Builder.k(gd.M0(2131747638, null), new rm(zArr, jsPromptResult, mtVar, 8));
        alertDialog$Builder.j(new di.u1(15, zArr, jsPromptResult));
        u1Var.P = new t6(mtVar, 21);
        mtVar.setOnEditorActionListener(new s5(zArr, jsPromptResult, mtVar, alertDialog$Builder.p(), 1));
        org.telegram.messenger.g0.g3(new oi.a2(mtVar, 27));
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
        org.telegram.ui.ActionBar.u1 u1Var = this.f53276a;
        if (u1Var != null) {
            u1Var.dismiss();
            this.f53276a = null;
        }
        s0 s0Var = this.f53279e;
        if (s0Var.R == null) {
            s0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        s0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.f53278c;
        if (z10) {
            K0 = o10.q(s0Var.R.V);
        } else {
            K0 = org.telegram.messenger.g0.K0(s0Var.getUrl(), false);
        }
        String[] resources = permissionRequest.getResources();
        if (resources.length == 1) {
            String str = resources[0];
            v0 v0Var = s0Var.R;
            if (v0Var.f53344a0 == null) {
                permissionRequest.deny();
            } else if (v0Var.r()) {
                permissionRequest.grant(resources);
            } else {
                str.getClass();
                if (!str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        v0 v0Var2 = s0Var.R;
                        Activity activity = v0Var2.f53344a0;
                        i6 i6Var = v0Var2.f53350e;
                        String[] strArr = {"android.permission.RECORD_AUDIO"};
                        if (z10) {
                            i13 = 2131752890;
                        } else {
                            i13 = 2131742646;
                        }
                        String a02 = gd.a0(null, null, i13, K0);
                        if (z10) {
                            i14 = 2131752889;
                        } else {
                            i14 = 2131742645;
                        }
                        org.telegram.ui.ActionBar.u1 W = b5.W(activity, i6Var, strArr, 2131624121, a02, gd.a0(null, null, i14, K0), new j0(this, permissionRequest, str, 0));
                        this.f53276a = W;
                        W.show();
                        return;
                    }
                    return;
                }
                v0 v0Var3 = s0Var.R;
                Activity activity2 = v0Var3.f53344a0;
                i6 i6Var2 = v0Var3.f53350e;
                String[] strArr2 = {"android.permission.CAMERA"};
                if (z10) {
                    i11 = 2131752895;
                } else {
                    i11 = 2131742650;
                }
                String a03 = gd.a0(null, null, i11, K0);
                if (z10) {
                    i12 = 2131752894;
                } else {
                    i12 = 2131742649;
                }
                org.telegram.ui.ActionBar.u1 W2 = b5.W(activity2, i6Var2, strArr2, 2131624117, a03, gd.a0(null, null, i12, K0), new j0(this, permissionRequest, str, 1));
                this.f53276a = W2;
                W2.show();
            }
        } else if (resources.length == 2) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                    v0 v0Var4 = s0Var.R;
                    Activity activity3 = v0Var4.f53344a0;
                    i6 i6Var3 = v0Var4.f53350e;
                    String[] strArr3 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                    if (z10) {
                        i7 = 2131752897;
                    } else {
                        i7 = 2131742652;
                    }
                    String a04 = gd.a0(null, null, i7, K0);
                    if (z10) {
                        i10 = 2131752896;
                    } else {
                        i10 = 2131742651;
                    }
                    org.telegram.ui.ActionBar.u1 W3 = b5.W(activity3, i6Var3, strArr3, 2131624117, a04, gd.a0(null, null, i10, K0), new k0(this, permissionRequest, resources, 0));
                    this.f53276a = W3;
                    W3.show();
                }
            }
        }
    }

    @Override
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.u1 u1Var = this.f53276a;
        s0 s0Var = this.f53279e;
        if (u1Var != null) {
            s0Var.c("onPermissionRequestCanceled: dialog.dismiss");
            this.f53276a.dismiss();
            this.f53276a = null;
            return;
        }
        s0Var.c("onPermissionRequestCanceled: no dialog");
    }

    @Override
    public final void onProgressChanged(WebView webView, int i7) {
        s0 s0Var = this.f53279e;
        v0 v0Var = s0Var.R;
        if (v0Var != null && v0Var.f53374x != null) {
            s0Var.c("onProgressChanged " + i7 + "%");
            s0Var.R.f53374x.accept(Float.valueOf(((float) i7) / 100.0f));
            return;
        }
        s0Var.c("onProgressChanged " + i7 + "%: no container");
    }

    @Override
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        s0 s0Var = this.f53279e;
        HashMap hashMap = s0Var.Q;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        s0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(s0Var.getUrl(), s0Var.M) || s0Var.P == null || bitmap.getWidth() > s0Var.P.getWidth())) {
            s0Var.P = bitmap;
            s0Var.M = s0Var.getUrl();
            s0Var.N = true;
            s0.a(s0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(s0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(s0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override
    public final void onReceivedTitle(WebView webView, String str) {
        s0 s0Var = this.f53279e;
        s0Var.c("onReceivedTitle title=" + str);
        if (!s0Var.h) {
            s0Var.K = true;
            s0Var.L = str;
        }
        v0 v0Var = s0Var.R;
        if (v0Var != null) {
            v0Var.I();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        this.f53279e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z10);
        super.onReceivedTouchIconUrl(webView, str, z10);
    }

    @Override
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        s0 s0Var = this.f53279e;
        Activity W = org.telegram.messenger.g0.W(s0Var.getContext());
        boolean z10 = false;
        if (W == null) {
            s0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        v0 v0Var = s0Var.R;
        if (v0Var == null) {
            s0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = v0Var.f53376y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        s0Var.R.f53376y = valueCallback;
        if (fileChooserParams.getMode() == 1) {
            z10 = true;
        }
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        s0Var.c("onShowFileChooser: true");
        return true;
    }
}
