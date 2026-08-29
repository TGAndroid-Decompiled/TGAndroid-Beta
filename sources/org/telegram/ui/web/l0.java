package org.telegram.ui.web;

import android.content.Context;
import android.content.Intent;
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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
public final class l0 extends WebViewClient {
    public boolean f44106a = true;
    public final k0 f44107b = new k0(this, 0);
    public final boolean f44108c;
    public final Context d;
    public final w0 f44109e;

    public l0(w0 w0Var, boolean z10, Context context) {
        this.f44109e = w0Var;
        this.f44108c = z10;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        a1 a1Var;
        boolean z11 = this.f44108c;
        w0 w0Var = this.f44109e;
        if (!z11 && ((a1Var = w0Var.f44228e) == null || !TextUtils.equals(a1Var.f43977c, str))) {
            ?? tLObject = new TLObject();
            w0Var.f44228e = tLObject;
            tLObject.f43975a = Utilities.fastRandom.nextLong();
            w0Var.f44228e.f43976b = System.currentTimeMillis();
            w0Var.f44228e.f43977c = z0.s(w0Var.getUrl());
            w0Var.f44228e.d = j2.a(w0Var);
            b1.c(w0Var.f44228e);
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
        w0 w0Var = this.f44109e;
        w0Var.c("onPageCommitVisible " + str);
        if (!this.f44108c) {
            w0Var.J = true;
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            w0Var.J = true;
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        w0 w0Var = this.f44109e;
        w0Var.f44226b = true;
        w0Var.c("onPageFinished");
        z0 z0Var = w0Var.M;
        if (z0Var != null) {
            z0Var.O(str, true);
        } else {
            w0Var.c("onPageFinished: no container");
        }
        if (!this.f44108c) {
            w0Var.J = true;
            String readRes = AndroidUtilities.readRes(R.raw.webview_ext);
            w0Var.d(readRes.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            w0Var.J = true;
            String readRes2 = AndroidUtilities.readRes(R.raw.webview_app_ext);
            w0Var.d(readRes2.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
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
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.l0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            w0 w0Var = this.f44109e;
            w0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
            if (w0Var.M != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.f44107b);
                w0Var.f44231r = null;
                w0Var.f44232s = false;
                w0Var.v = false;
                w0Var.I = false;
                w0Var.F = false;
                w0Var.f44230n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? w0Var.getUrl() : webResourceRequest.getUrl().toString();
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
        Integer valueOf;
        Uri url;
        String url2;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        StringBuilder sb2 = new StringBuilder("onReceivedHttpError: statusCode=");
        if (webResourceResponse == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(webResourceResponse.getStatusCode());
        }
        sb2.append(valueOf);
        sb2.append(" request=");
        if (webResourceRequest == null) {
            url = null;
        } else {
            url = webResourceRequest.getUrl();
        }
        sb2.append(url);
        String sb3 = sb2.toString();
        w0 w0Var = this.f44109e;
        w0Var.c(sb3);
        if (w0Var.M != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.f44107b);
                w0Var.f44231r = null;
                w0Var.f44232s = false;
                w0Var.v = false;
                w0Var.I = false;
                w0Var.F = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = w0Var.getUrl();
                }
                w0Var.f44230n = url2;
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
        String url;
        StringBuilder sb2 = new StringBuilder("onReceivedSslError: error=");
        sb2.append(sslError);
        sb2.append(" url=");
        if (sslError == null) {
            url = null;
        } else {
            url = sslError.getUrl();
        }
        sb2.append(url);
        this.f44109e.c(sb2.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        c6 c6Var;
        Integer valueOf;
        Boolean valueOf2;
        int i10 = Build.VERSION.SDK_INT;
        w0 w0Var = this.f44109e;
        if (i10 >= 26) {
            StringBuilder sb2 = new StringBuilder("onRenderProcessGone priority=");
            if (renderProcessGoneDetail == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit());
            }
            sb2.append(valueOf);
            sb2.append(" didCrash=");
            if (renderProcessGoneDetail == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(renderProcessGoneDetail.didCrash());
            }
            sb2.append(valueOf2);
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
            if (z0Var == null) {
                c6Var = null;
            } else {
                c6Var = z0Var.f44267e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new k0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f22714a.setOnDismissListener(new cg.d0(this, 9));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        HttpURLConnection httpURLConnection;
        int i10;
        StringBuilder sb2 = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection2 = null;
        sb2.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb3 = sb2.toString();
        w0 w0Var = this.f44109e;
        w0Var.c(sb3);
        if (webResourceRequest != null && z0.o(webResourceRequest.getUrl())) {
            w0Var.c("proxying ton");
            this.f44106a = false;
            return z0.I(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f44108c && w0Var.f44229f != null && this.f44106a) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
            } catch (Exception e10) {
                e = e10;
            }
            try {
                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                if (webResourceRequest.getRequestHeaders() != null) {
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.connect();
                HashMap hashMap = new HashMap();
                Iterator<Map.Entry<String, List<String>>> it = httpURLConnection.getHeaderFields().entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, List<String>> next = it.next();
                    String key = next.getKey();
                    if (key != null) {
                        hashMap.put(key, TextUtils.join(", ", next.getValue()));
                        if (!w0Var.A && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it2 = next.getValue().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                    w0Var.c("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    w0Var.A = true;
                                    AndroidUtilities.runOnUIThread(new k0(this, 1));
                                    break;
                                }
                            }
                        }
                    }
                }
                String contentType = httpURLConnection.getContentType();
                String contentEncoding = httpURLConnection.getContentEncoding();
                if (contentType.indexOf("; ") >= 0) {
                    String[] split = contentType.split("; ");
                    if (!TextUtils.isEmpty(split[0])) {
                        contentType = split[0];
                    }
                    for (i10 = 1; i10 < split.length; i10++) {
                        if (split[i10].startsWith("charset=")) {
                            contentEncoding = split[i10].substring(8);
                        }
                    }
                }
                this.f44106a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e11) {
                e = e11;
                httpURLConnection2 = httpURLConnection;
                FileLog.e(e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.f44106a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.f44106a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f0 f0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            w0 w0Var = this.f44109e;
            if (startsWith) {
                if (w0Var.f44229f != null) {
                    f0 f0Var2 = w0Var.M.f44264c;
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
                ye.d.s(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.f44108c;
            if (!z10) {
                if (ye.d.l(context, str, true)) {
                    w0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!w0Var.f44226b && !w0Var.canGoBack()) {
                        f0 f0Var3 = w0Var.M.f44264c;
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
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            w0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    w0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    ye.d.p(w0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (w0Var.M != null && ye.d.f(parse, false, null)) {
                if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (MessagesController.getInstance(w0Var.M.I).webAppAllowedProtocols != null && MessagesController.getInstance(w0Var.M.I).webAppAllowedProtocols.contains(parse.getScheme())) {
                        if (w0Var.f44229f != null) {
                            f0 f0Var4 = w0Var.M.f44264c;
                            if (f0Var4 != null) {
                                f0Var4.j();
                            } else {
                                Runnable runnable3 = w0Var.O;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    w0Var.O = null;
                                }
                            }
                            z0 z0Var = w0Var.f44229f.M;
                            if (z0Var != null && (f0Var = z0Var.f44264c) != null) {
                                f0Var.b();
                            }
                        }
                        z0 z0Var2 = w0Var.M;
                        z0Var2.D(parse, null, !z0Var2.f44275k0, false, false);
                    }
                    w0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
            } else {
                if (parse != null) {
                    parse.toString();
                }
                w0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
        }
        return false;
    }

    @Override
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        w0 w0Var = this.f44109e;
        w0Var.c("onReceivedError: " + i10 + " " + str + " url=" + str2);
        if (Build.VERSION.SDK_INT < 23 && w0Var.M != null) {
            AndroidUtilities.cancelRunOnUIThread(this.f44107b);
            w0Var.f44231r = null;
            w0Var.f44232s = false;
            w0Var.v = false;
            w0Var.I = false;
            w0Var.F = false;
            w0Var.f44230n = w0Var.getUrl();
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
        w0 w0Var = this.f44109e;
        w0Var.c("shouldInterceptRequest " + str);
        boolean z10 = z0.I0;
        if (str != null && z0.o(Uri.parse(str))) {
            w0Var.c("proxying ton");
            return z0.I("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
