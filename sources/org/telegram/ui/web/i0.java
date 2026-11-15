package org.telegram.ui.web;

import a8.p9;
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
import c8.za;
import di.r9;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.r2;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
public final class i0 extends WebViewClient {
    public boolean f52632a = true;
    public final h0 f52633b = new h0(this, 0);
    public final boolean f52634c;
    public final Context d;
    public final s0 f52635e;

    public i0(s0 s0Var, boolean z10, Context context) {
        this.f52635e = s0Var;
        this.f52634c = z10;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        w0 w0Var;
        boolean z11 = this.f52634c;
        s0 s0Var = this.f52635e;
        if (!z11 && ((w0Var = s0Var.f52769e) == null || !TextUtils.equals(w0Var.f52857c, str))) {
            ?? tLObject = new TLObject();
            s0Var.f52769e = tLObject;
            tLObject.f52855a = Utilities.f22415c.nextLong();
            s0Var.f52769e.f52856b = System.currentTimeMillis();
            s0Var.f52769e.f52857c = v0.u(s0Var.getUrl());
            s0Var.f52769e.d = z1.a(s0Var);
            za.c(s0Var.f52769e);
        }
        s0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        v0 v0Var = s0Var.R;
        if (v0Var != null) {
            v0Var.J(!s0Var.canGoBack(), !s0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        v0 v0Var;
        s0 s0Var = this.f52635e;
        s0Var.c("onPageCommitVisible " + str);
        boolean z10 = this.f52634c;
        if (z10 && !p9.a("DOCUMENT_START_SCRIPT") && (v0Var = s0Var.R) != null) {
            boolean z11 = v0.R0;
            if (v0Var.q()) {
                s0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (!z10) {
            s0Var.O = true;
            String y22 = org.telegram.messenger.g0.y2(null, 2131624364);
            boolean z12 = r2.f26198a;
            s0Var.d(y22.replace("$DEBUG$", "true"));
            s0Var.d(org.telegram.messenger.g0.y2(null, 2131624365));
        } else {
            s0Var.O = true;
            String y23 = org.telegram.messenger.g0.y2(null, 2131624363);
            boolean z13 = r2.f26198a;
            s0Var.d(y23.replace("$DEBUG$", "true"));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        v0 v0Var;
        s0 s0Var = this.f52635e;
        s0Var.f52767b = true;
        s0Var.c("onPageFinished");
        boolean z10 = this.f52634c;
        if (z10 && !p9.a("DOCUMENT_START_SCRIPT") && (v0Var = s0Var.R) != null) {
            boolean z11 = v0.R0;
            if (v0Var.q()) {
                s0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        v0 v0Var2 = s0Var.R;
        if (v0Var2 != null) {
            v0Var2.U(str, true);
        } else {
            s0Var.c("onPageFinished: no container");
        }
        if (!z10) {
            s0Var.O = true;
            String y22 = org.telegram.messenger.g0.y2(null, 2131624364);
            boolean z12 = r2.f26198a;
            s0Var.d(y22.replace("$DEBUG$", "true"));
            s0Var.d(org.telegram.messenger.g0.y2(null, 2131624365));
        } else {
            s0Var.O = true;
            String y23 = org.telegram.messenger.g0.y2(null, 2131624363);
            boolean z13 = r2.f26198a;
            s0Var.d(y23.replace("$DEBUG$", "true"));
        }
        s0.a(s0Var);
        v0 v0Var3 = s0Var.R;
        if (v0Var3 != null) {
            if (!s0Var.F) {
                s0Var.getUrl();
            }
            v0Var3.J(!s0Var.canGoBack(), !s0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.i0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        s0 s0Var = this.f52635e;
        s0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
        if (s0Var.R != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
            org.telegram.messenger.g0.r(this.f52633b);
            s0Var.f52772r = null;
            s0Var.f52773s = false;
            s0Var.f52774w = false;
            s0Var.N = false;
            s0Var.K = false;
            s0Var.f52771n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? s0Var.getUrl() : webResourceRequest.getUrl().toString();
            v0 v0Var = s0Var.R;
            s0Var.L = null;
            v0Var.I();
            v0 v0Var2 = s0Var.R;
            s0Var.P = null;
            v0Var2.getClass();
            v0 v0Var3 = s0Var.R;
            s0Var.h = true;
            webResourceError.getErrorCode();
            v0Var3.E(true, webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null);
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
        s0 s0Var = this.f52635e;
        s0Var.c(sb3);
        if (s0Var.R != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                org.telegram.messenger.g0.r(this.f52633b);
                s0Var.f52772r = null;
                s0Var.f52773s = false;
                s0Var.f52774w = false;
                s0Var.N = false;
                s0Var.K = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = s0Var.getUrl();
                }
                s0Var.f52771n = url2;
                v0 v0Var = s0Var.R;
                s0Var.L = null;
                v0Var.I();
                v0 v0Var2 = s0Var.R;
                s0Var.P = null;
                v0Var2.getClass();
                v0 v0Var3 = s0Var.R;
                s0Var.h = true;
                webResourceResponse.getStatusCode();
                v0Var3.E(true, webResourceResponse.getReasonPhrase());
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
        this.f52635e.c(sb2.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        e6 e6Var;
        Integer valueOf;
        Boolean valueOf2;
        int i7 = Build.VERSION.SDK_INT;
        s0 s0Var = this.f52635e;
        if (i7 >= 26) {
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
            s0Var.c(sb2.toString());
        } else {
            s0Var.c("onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.g0.M1(s0Var.getContext())) {
                return true;
            }
            Context context = s0Var.getContext();
            v0 v0Var = s0Var.R;
            if (v0Var == null) {
                e6Var = null;
            } else {
                e6Var = v0Var.f52818e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = hd.M0(2131752104, null);
            t1Var.U = org.telegram.messenger.g0.U2(hd.M0(2131752105, null), new h0(this, 2));
            alertDialog$Builder.k(hd.M0(2131747831, null), null);
            t1Var.setOnDismissListener(new r9(this, 11));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        StringBuilder sb2 = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection = null;
        sb2.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb3 = sb2.toString();
        s0 s0Var = this.f52635e;
        s0Var.c(sb3);
        if (webResourceRequest != null && v0.p(webResourceRequest.getUrl())) {
            s0Var.c("proxying ton");
            this.f52632a = false;
            return v0.N(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f52634c && s0Var.f52770f != null && this.f52632a) {
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
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, List<String>> entry2 : httpURLConnection2.getHeaderFields().entrySet()) {
                        String key = entry2.getKey();
                        if (key != null) {
                            hashMap.put(key, TextUtils.join(", ", entry2.getValue()));
                            if (!s0Var.F && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                                Iterator<String> it = entry2.getValue().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String next = it.next();
                                    if (next != null && !"unsafe-none".equals(next.toLowerCase()) && !"same-site".equals(next.toLowerCase())) {
                                        s0Var.c("<!> dangerous header CORS policy: " + key + ": " + next + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                        s0Var.F = true;
                                        org.telegram.messenger.g0.h3(new h0(this, 1));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    String contentType = httpURLConnection2.getContentType();
                    String contentEncoding = httpURLConnection2.getContentEncoding();
                    if (contentType.indexOf("; ") >= 0) {
                        String[] split = contentType.split("; ");
                        if (!TextUtils.isEmpty(split[0])) {
                            contentType = split[0];
                        }
                        for (int i7 = 1; i7 < split.length; i7++) {
                            if (split[i7].startsWith("charset=")) {
                                contentEncoding = split[i7].substring(8);
                            }
                        }
                    }
                    this.f52632a = false;
                    return new WebResourceResponse(contentType, contentEncoding, httpURLConnection2.getResponseCode(), httpURLConnection2.getResponseMessage(), hashMap, httpURLConnection2.getInputStream());
                } catch (Exception e10) {
                    e = e10;
                    httpURLConnection = httpURLConnection2;
                    a8.g(e, true);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f52632a = false;
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        this.f52632a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        c0 c0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            s0 s0Var = this.f52635e;
            if (startsWith) {
                if (s0Var.f52770f != null) {
                    c0 c0Var2 = s0Var.R.f52815c;
                    if (c0Var2 != null) {
                        c0Var2.j();
                    } else {
                        Runnable runnable = s0Var.V;
                        if (runnable != null) {
                            runnable.run();
                            s0Var.V = null;
                        }
                    }
                }
                vf.c.t(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.f52634c;
            if (!z10) {
                if (vf.c.m(context, str, true)) {
                    s0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!s0Var.f52767b && !s0Var.canGoBack()) {
                        c0 c0Var3 = s0Var.R.f52815c;
                        if (c0Var3 != null) {
                            c0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = s0Var.V;
                        if (runnable2 != null) {
                            runnable2.run();
                            s0Var.V = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            s0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    s0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    vf.c.q(s0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (s0Var.R != null && vf.c.g(parse, false, null)) {
                if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (np.s1(s0Var.R.N).C4 != null && np.s1(s0Var.R.N).C4.contains(parse.getScheme())) {
                        v0 v0Var = s0Var.R;
                        if (s0Var.f52770f != null) {
                            c0 c0Var4 = v0Var.f52815c;
                            if (c0Var4 != null) {
                                c0Var4.j();
                            } else {
                                Runnable runnable3 = s0Var.V;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    s0Var.V = null;
                                }
                            }
                            v0 v0Var2 = s0Var.f52770f.R;
                            if (v0Var2 != null && (c0Var = v0Var2.f52815c) != null) {
                                c0Var.b();
                            }
                        }
                        v0Var.H(parse, null, !v0Var.f52831p0, false, false);
                    }
                    s0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
            } else {
                if (parse != null) {
                    parse.toString();
                }
                s0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
        }
        return false;
    }

    @Override
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        this.f52635e.c("onReceivedError: " + i7 + " " + str + " url=" + str2);
        super.onReceivedError(webView, i7, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        s0 s0Var = this.f52635e;
        s0Var.c("shouldInterceptRequest " + str);
        boolean z10 = v0.R0;
        if (str != null && v0.p(Uri.parse(str))) {
            s0Var.c("proxying ton");
            return v0.N("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
