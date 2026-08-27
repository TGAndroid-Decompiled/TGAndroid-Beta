package org.telegram.ui.web;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e3;

public final class l0 extends WebViewClient {

    public boolean f43903a = true;

    public final k0 f43904b = new k0(this, 0);

    public final boolean f43905c;
    public final Context d;

    public final w0 f43906e;

    public l0(w0 w0Var, boolean z10, Context context) {
        this.f43906e = w0Var;
        this.f43905c = z10;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        a1 a1Var;
        boolean z11 = this.f43905c;
        w0 w0Var = this.f43906e;
        if (!z11 && ((a1Var = w0Var.f44026e) == null || !TextUtils.equals(a1Var.f43776c, str))) {
            a1 a1Var2 = new a1();
            w0Var.f44026e = a1Var2;
            a1Var2.f43774a = Utilities.fastRandom.nextLong();
            w0Var.f44026e.f43775b = System.currentTimeMillis();
            w0Var.f44026e.f43776c = z0.s(w0Var.getUrl());
            w0Var.f44026e.d = i2.a(w0Var);
            b1.c(w0Var.f44026e);
        }
        w0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        z0 z0Var = w0Var.M;
        if (z0Var != null) {
            z0Var.F(!w0Var.canGoBack(), !w0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        w0 w0Var = this.f43906e;
        w0Var.c("onPageCommitVisible " + str);
        if (this.f43905c) {
            w0Var.J = true;
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        } else {
            w0Var.J = true;
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        w0 w0Var = this.f43906e;
        w0Var.f44024b = true;
        w0Var.c("onPageFinished");
        z0 z0Var = w0Var.M;
        if (z0Var != null) {
            z0Var.O(str, true);
        } else {
            w0Var.c("onPageFinished: no container");
        }
        if (this.f43905c) {
            w0Var.J = true;
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        } else {
            w0Var.J = true;
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        }
        w0.a(w0Var);
        z0 z0Var2 = w0Var.M;
        if (z0Var2 != null) {
            if (!w0Var.A) {
                w0Var.getUrl();
            }
            z0Var2.F(!w0Var.canGoBack(), !w0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2;
        w0 w0Var = this.f43906e;
        z0 z0Var = w0Var.M;
        if (z0Var != null) {
            boolean z10 = z0.I0;
            if (!z0Var.p()) {
                w0Var.getSettings().setMediaPlaybackRequiresUserGesture(true);
            }
        } else {
            w0Var.getSettings().setMediaPlaybackRequiresUserGesture(true);
        }
        e3 e3Var = w0Var.B;
        if (e3Var != null) {
            e3Var.dismiss();
            w0Var.B = null;
        }
        w0Var.f44026e = null;
        w0Var.f44029r = null;
        w0Var.f44030s = false;
        w0Var.v = false;
        w0Var.I = false;
        w0Var.c("onPageStarted " + str);
        if (w0Var.M != null && w0Var.h && ((str2 = w0Var.f44028n) == null || !TextUtils.equals(str2, str))) {
            AndroidUtilities.runOnUIThread(this.f43904b, 40L);
        }
        z0 z0Var2 = w0Var.M;
        if (z0Var2 != null) {
            z0Var2.F(!w0Var.canGoBack(), true ^ w0Var.canGoForward());
        }
        super.onPageStarted(webView, str, bitmap);
        w0Var.J = false;
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            String str = "onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription());
            w0 w0Var = this.f43906e;
            w0Var.c(str);
            if (w0Var.M != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.f43904b);
                w0Var.f44029r = null;
                w0Var.f44030s = false;
                w0Var.v = false;
                w0Var.I = false;
                w0Var.F = false;
                w0Var.f44028n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? w0Var.getUrl() : webResourceRequest.getUrl().toString();
                z0 z0Var = w0Var.M;
                w0Var.G = null;
                z0Var.E();
                z0 z0Var2 = w0Var.M;
                w0Var.K = null;
                z0Var2.getClass();
                z0 z0Var3 = w0Var.M;
                w0Var.h = true;
                webResourceError.getErrorCode();
                z0Var3.A(webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null, true);
            }
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        StringBuilder sb2 = new StringBuilder("onReceivedHttpError: statusCode=");
        sb2.append(webResourceResponse == null ? null : Integer.valueOf(webResourceResponse.getStatusCode()));
        sb2.append(" request=");
        sb2.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String string = sb2.toString();
        w0 w0Var = this.f43906e;
        w0Var.c(string);
        if (w0Var.M != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.f43904b);
                w0Var.f44029r = null;
                w0Var.f44030s = false;
                w0Var.v = false;
                w0Var.I = false;
                w0Var.F = false;
                w0Var.f44028n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? w0Var.getUrl() : webResourceRequest.getUrl().toString();
                z0 z0Var = w0Var.M;
                w0Var.G = null;
                z0Var.E();
                z0 z0Var2 = w0Var.M;
                w0Var.K = null;
                z0Var2.getClass();
                z0 z0Var3 = w0Var.M;
                w0Var.h = true;
                webResourceResponse.getStatusCode();
                z0Var3.A(webResourceResponse.getReasonPhrase(), true);
            }
        }
    }

    @Override
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        StringBuilder sb2 = new StringBuilder("onReceivedSslError: error=");
        sb2.append(sslError);
        sb2.append(" url=");
        sb2.append(sslError == null ? null : sslError.getUrl());
        this.f43906e.c(sb2.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i10 = Build.VERSION.SDK_INT;
        w0 w0Var = this.f43906e;
        if (i10 >= 26) {
            StringBuilder sb2 = new StringBuilder("onRenderProcessGone priority=");
            sb2.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb2.append(" didCrash=");
            sb2.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            w0Var.c(sb2.toString());
        } else {
            w0Var.c("onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(w0Var.getContext())) {
                return true;
            }
            Context context = w0Var.getContext();
            z0 z0Var = w0Var.M;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, z0Var == null ? null : z0Var.f44064e);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new k0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f22702a.setOnDismissListener(new ag.j0(this, 9));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        int i10;
        StringBuilder sb2 = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection = null;
        sb2.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String string = sb2.toString();
        w0 w0Var = this.f43906e;
        w0Var.c(string);
        if (webResourceRequest != null && z0.o(webResourceRequest.getUrl())) {
            w0Var.c("proxying ton");
            this.f43903a = false;
            return z0.I(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f43905c && w0Var.f44027f != null && this.f43903a) {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
                try {
                    httpURLConnection2.setRequestMethod(webResourceRequest.getMethod());
                    if (webResourceRequest.getRequestHeaders() != null) {
                        for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                            httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection2.connect();
                    HashMap map = new HashMap();
                    Iterator<Map.Entry<String, List<String>>> it = httpURLConnection2.getHeaderFields().entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, List<String>> next = it.next();
                        String key = next.getKey();
                        if (key != null) {
                            map.put(key, TextUtils.join(", ", next.getValue()));
                            if (!w0Var.A && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                                for (String str : next.getValue()) {
                                    if (str != null && !"unsafe-none".equals(str.toLowerCase()) && !"same-site".equals(str.toLowerCase())) {
                                        w0Var.c("<!> dangerous header CORS policy: " + key + ": " + str + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                        w0Var.A = true;
                                        AndroidUtilities.runOnUIThread(new k0(this, 1));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    String contentType = httpURLConnection2.getContentType();
                    String contentEncoding = httpURLConnection2.getContentEncoding();
                    if (contentType.indexOf("; ") >= 0) {
                        String[] strArrSplit = contentType.split("; ");
                        if (!TextUtils.isEmpty(strArrSplit[0])) {
                            contentType = strArrSplit[0];
                        }
                        for (i10 = 1; i10 < strArrSplit.length; i10++) {
                            if (strArrSplit[i10].startsWith("charset=")) {
                                contentEncoding = strArrSplit[i10].substring(8);
                            }
                        }
                    }
                    this.f43903a = false;
                    return new WebResourceResponse(contentType, contentEncoding, httpURLConnection2.getResponseCode(), httpURLConnection2.getResponseMessage(), map, httpURLConnection2.getInputStream());
                } catch (Exception e9) {
                    e = e9;
                    httpURLConnection = httpURLConnection2;
                    FileLog.e(e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f43903a = false;
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        this.f43903a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f0 f0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean zStartsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            w0 w0Var = this.f43906e;
            if (zStartsWith) {
                if (w0Var.f44027f != null) {
                    f0 f0Var2 = w0Var.M.f44061c;
                    if (f0Var2 != null) {
                        f0Var2.j();
                    } else {
                        Runnable runnable = w0Var.O;
                        if (runnable != null) {
                            runnable.run();
                            w0Var.O = null;
                        }
                    }
                }
                we.e.s(context, str);
                return true;
            }
            Uri uri = Uri.parse(str);
            boolean z10 = this.f43905c;
            if (!z10) {
                if (we.e.l(context, str, true)) {
                    w0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!w0Var.f44024b && !w0Var.canGoBack()) {
                        f0 f0Var3 = w0Var.M.f44061c;
                        if (f0Var3 != null) {
                            f0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = w0Var.O;
                        if (runnable2 != null) {
                            runnable2.run();
                            w0Var.O = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (uri != null && uri.getScheme() != null && uri.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(uri.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            w0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                if (uri != null && uri.getScheme() != null && !"https".equals(uri.getScheme()) && !"http".equals(uri.getScheme()) && !"tonsite".equals(uri.getScheme())) {
                    w0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    we.e.p(w0Var.getContext(), uri, true, true);
                    return true;
                }
            }
            if (w0Var.M == null || !we.e.f(uri, false, null)) {
                if (uri != null) {
                    uri.toString();
                }
                w0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
            if (z10 || !"1".equals(uri.getQueryParameter("embed")) || !"t.me".equals(uri.getAuthority())) {
                if (MessagesController.getInstance(w0Var.M.I).webAppAllowedProtocols != null && MessagesController.getInstance(w0Var.M.I).webAppAllowedProtocols.contains(uri.getScheme())) {
                    if (w0Var.f44027f != null) {
                        f0 f0Var4 = w0Var.M.f44061c;
                        if (f0Var4 != null) {
                            f0Var4.j();
                        } else {
                            Runnable runnable3 = w0Var.O;
                            if (runnable3 != null) {
                                runnable3.run();
                                w0Var.O = null;
                            }
                        }
                        z0 z0Var = w0Var.f44027f.M;
                        if (z0Var != null && (f0Var = z0Var.f44061c) != null) {
                            f0Var.b();
                        }
                    }
                    z0 z0Var2 = w0Var.M;
                    z0Var2.D(uri, null, !z0Var2.f44072k0, false, false);
                }
                w0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        w0 w0Var = this.f43906e;
        w0Var.c("onReceivedError: " + i10 + " " + str + " url=" + str2);
        if (Build.VERSION.SDK_INT < 23 && w0Var.M != null) {
            AndroidUtilities.cancelRunOnUIThread(this.f43904b);
            w0Var.f44029r = null;
            w0Var.f44030s = false;
            w0Var.v = false;
            w0Var.I = false;
            w0Var.F = false;
            w0Var.f44028n = w0Var.getUrl();
            z0 z0Var = w0Var.M;
            w0Var.G = null;
            z0Var.E();
            z0 z0Var2 = w0Var.M;
            w0Var.K = null;
            z0Var2.getClass();
            z0 z0Var3 = w0Var.M;
            w0Var.h = true;
            z0Var3.A(str, true);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        w0 w0Var = this.f43906e;
        w0Var.c("shouldInterceptRequest " + str);
        boolean z10 = z0.I0;
        if (str != null && z0.o(Uri.parse(str))) {
            w0Var.c("proxying ton");
            return z0.I("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
