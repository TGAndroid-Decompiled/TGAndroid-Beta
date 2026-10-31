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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p6;
import w7.m6;
public final class j0 extends WebViewClient {
    public boolean f43074a = true;
    public final i0 f43075b = new i0(this, 0);
    public final boolean f43076c;
    public final Context d;
    public final v0 e;

    public j0(v0 v0Var, boolean z10, Context context) {
        this.e = v0Var;
        this.f43076c = z10;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        a1 a1Var;
        boolean z11 = this.f43076c;
        v0 v0Var = this.e;
        if (!z11 && ((a1Var = v0Var.e) == null || !TextUtils.equals(a1Var.f42984c, str))) {
            ?? tLObject = new TLObject();
            v0Var.e = tLObject;
            tLObject.f42982a = Utilities.f14520c.nextLong();
            v0Var.e.f42983b = System.currentTimeMillis();
            v0Var.e.f42984c = z0.u(v0Var.getUrl());
            v0Var.e.d = c2.a(v0Var);
            m6.c(v0Var.e);
        }
        v0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        z0 z0Var = v0Var.Q;
        if (z0Var != null) {
            z0Var.I(!v0Var.canGoBack(), !v0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        z0 z0Var;
        v0 v0Var = this.e;
        v0Var.c("onPageCommitVisible " + str);
        boolean z10 = this.f43076c;
        if (z10 && !a.a.a("DOCUMENT_START_SCRIPT") && (z0Var = v0Var.Q) != null) {
            boolean z11 = z0.Q0;
            if (z0Var.q()) {
                v0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (!z10) {
            v0Var.N = true;
            String y22 = org.telegram.messenger.i0.y2(null, 2131624361);
            boolean z12 = v2.f18448a;
            v0Var.d(y22.replace("$DEBUG$", "true"));
            v0Var.d(org.telegram.messenger.i0.y2(null, 2131624362));
        } else {
            v0Var.N = true;
            String y23 = org.telegram.messenger.i0.y2(null, 2131624360);
            boolean z13 = v2.f18448a;
            v0Var.d(y23.replace("$DEBUG$", "true"));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        z0 z0Var;
        v0 v0Var = this.e;
        v0Var.f43209b = true;
        v0Var.c("onPageFinished");
        boolean z10 = this.f43076c;
        if (z10 && !a.a.a("DOCUMENT_START_SCRIPT") && (z0Var = v0Var.Q) != null) {
            boolean z11 = z0.Q0;
            if (z0Var.q()) {
                v0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        z0 z0Var2 = v0Var.Q;
        if (z0Var2 != null) {
            z0Var2.T(str, true);
        } else {
            v0Var.c("onPageFinished: no container");
        }
        if (!z10) {
            v0Var.N = true;
            String y22 = org.telegram.messenger.i0.y2(null, 2131624361);
            boolean z12 = v2.f18448a;
            v0Var.d(y22.replace("$DEBUG$", "true"));
            v0Var.d(org.telegram.messenger.i0.y2(null, 2131624362));
        } else {
            v0Var.N = true;
            String y23 = org.telegram.messenger.i0.y2(null, 2131624360);
            boolean z13 = v2.f18448a;
            v0Var.d(y23.replace("$DEBUG$", "true"));
        }
        v0.a(v0Var);
        z0 z0Var3 = v0Var.Q;
        if (z0Var3 != null) {
            if (!v0Var.E) {
                v0Var.getUrl();
            }
            z0Var3.I(!v0Var.canGoBack(), !v0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.j0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        v0 v0Var = this.e;
        v0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
        if (v0Var.Q != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
            org.telegram.messenger.i0.r(this.f43075b);
            v0Var.f43213r = null;
            v0Var.f43214s = false;
            v0Var.f43215w = false;
            v0Var.M = false;
            v0Var.J = false;
            v0Var.f43212n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? v0Var.getUrl() : webResourceRequest.getUrl().toString();
            z0 z0Var = v0Var.Q;
            v0Var.K = null;
            z0Var.H();
            z0 z0Var2 = v0Var.Q;
            v0Var.O = null;
            z0Var2.getClass();
            z0 z0Var3 = v0Var.Q;
            v0Var.h = true;
            webResourceError.getErrorCode();
            z0Var3.D(true, webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null);
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
        v0 v0Var = this.e;
        v0Var.c(sb3);
        if (v0Var.Q != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                org.telegram.messenger.i0.r(this.f43075b);
                v0Var.f43213r = null;
                v0Var.f43214s = false;
                v0Var.f43215w = false;
                v0Var.M = false;
                v0Var.J = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = v0Var.getUrl();
                }
                v0Var.f43212n = url2;
                z0 z0Var = v0Var.Q;
                v0Var.K = null;
                z0Var.H();
                z0 z0Var2 = v0Var.Q;
                v0Var.O = null;
                z0Var2.getClass();
                z0 z0Var3 = v0Var.Q;
                v0Var.h = true;
                webResourceResponse.getStatusCode();
                z0Var3.D(true, webResourceResponse.getReasonPhrase());
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
        this.e.c(sb2.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        p6 p6Var;
        Integer valueOf;
        Boolean valueOf2;
        int i10 = Build.VERSION.SDK_INT;
        v0 v0Var = this.e;
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
            v0Var.c(sb2.toString());
        } else {
            v0Var.c("onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.i0.M1(v0Var.getContext())) {
                return true;
            }
            Context context = v0Var.getContext();
            z0 z0Var = v0Var.Q;
            if (z0Var == null) {
                p6Var = null;
            } else {
                p6Var = z0Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = cd.L0(2131752104, null);
            x1Var.T = org.telegram.messenger.i0.T2(cd.L0(2131752105, null), new i0(this, 2));
            alertDialog$Builder.k(cd.L0(2131747847, null), null);
            x1Var.setOnDismissListener(new ag.x(this, 9));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e) {
            f8.g(e, true);
            return false;
        }
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        StringBuilder sb2 = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection = null;
        sb2.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb3 = sb2.toString();
        v0 v0Var = this.e;
        v0Var.c(sb3);
        if (webResourceRequest != null && z0.p(webResourceRequest.getUrl())) {
            v0Var.c("proxying ton");
            this.f43074a = false;
            return z0.M(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f43076c && v0Var.f43211f != null && this.f43074a) {
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
                            if (!v0Var.E && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                                Iterator<String> it = entry2.getValue().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String next = it.next();
                                    if (next != null && !"unsafe-none".equals(next.toLowerCase()) && !"same-site".equals(next.toLowerCase())) {
                                        v0Var.c("<!> dangerous header CORS policy: " + key + ": " + next + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                        v0Var.E = true;
                                        org.telegram.messenger.i0.g3(new i0(this, 1));
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
                        for (int i10 = 1; i10 < split.length; i10++) {
                            if (split[i10].startsWith("charset=")) {
                                contentEncoding = split[i10].substring(8);
                            }
                        }
                    }
                    this.f43074a = false;
                    return new WebResourceResponse(contentType, contentEncoding, httpURLConnection2.getResponseCode(), httpURLConnection2.getResponseMessage(), hashMap, httpURLConnection2.getInputStream());
                } catch (Exception e) {
                    e = e;
                    httpURLConnection = httpURLConnection2;
                    f8.g(e, true);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f43074a = false;
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            } catch (Exception e7) {
                e = e7;
            }
        }
        this.f43074a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        d0 d0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            v0 v0Var = this.e;
            if (startsWith) {
                if (v0Var.f43211f != null) {
                    d0 d0Var2 = v0Var.Q.f43261c;
                    if (d0Var2 != null) {
                        d0Var2.j();
                    } else {
                        Runnable runnable = v0Var.U;
                        if (runnable != null) {
                            runnable.run();
                            v0Var.U = null;
                        }
                    }
                }
                gf.f.r(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.f43076c;
            if (!z10) {
                if (gf.f.k(context, str, true)) {
                    v0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!v0Var.f43209b && !v0Var.canGoBack()) {
                        d0 d0Var3 = v0Var.Q.f43261c;
                        if (d0Var3 != null) {
                            d0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = v0Var.U;
                        if (runnable2 != null) {
                            runnable2.run();
                            v0Var.U = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            v0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    v0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    gf.f.o(v0Var.getContext(), parse);
                    return true;
                }
            }
            if (v0Var.Q != null && gf.f.e(parse, false, null)) {
                if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (vp.r1(v0Var.Q.M).C4 != null && vp.r1(v0Var.Q.M).C4.contains(parse.getScheme())) {
                        z0 z0Var = v0Var.Q;
                        if (v0Var.f43211f != null) {
                            d0 d0Var4 = z0Var.f43261c;
                            if (d0Var4 != null) {
                                d0Var4.j();
                            } else {
                                Runnable runnable3 = v0Var.U;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    v0Var.U = null;
                                }
                            }
                            z0 z0Var2 = v0Var.f43211f.Q;
                            if (z0Var2 != null && (d0Var = z0Var2.f43261c) != null) {
                                d0Var.b();
                            }
                        }
                        z0Var.G(parse, null, !z0Var.f43275o0, false, false);
                    }
                    v0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
            } else {
                if (parse != null) {
                    parse.toString();
                }
                v0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
        }
        return false;
    }

    @Override
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.e.c("onReceivedError: " + i10 + " " + str + " url=" + str2);
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        v0 v0Var = this.e;
        v0Var.c("shouldInterceptRequest " + str);
        boolean z10 = z0.Q0;
        if (str != null && z0.p(Uri.parse(str))) {
            v0Var.c("proxying ton");
            return z0.M("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
