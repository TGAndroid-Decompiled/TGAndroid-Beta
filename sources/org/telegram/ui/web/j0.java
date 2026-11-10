package org.telegram.ui.web;

import a8.n9;
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
import bi.eb;
import c8.xa;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
public final class j0 extends WebViewClient {
    public boolean f51110a = true;
    public final i0 f51111b = new i0(this, 0);
    public final boolean f51112c;
    public final Context d;
    public final u0 f51113e;

    public j0(u0 u0Var, boolean z9, Context context) {
        this.f51113e = u0Var;
        this.f51112c = z9;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z9) {
        y0 y0Var;
        boolean z10 = this.f51112c;
        u0 u0Var = this.f51113e;
        if (!z10 && ((y0Var = u0Var.f51251e) == null || !TextUtils.equals(y0Var.f51339c, str))) {
            ?? tLObject = new TLObject();
            u0Var.f51251e = tLObject;
            tLObject.f51337a = Utilities.f21340c.nextLong();
            u0Var.f51251e.f51338b = System.currentTimeMillis();
            u0Var.f51251e.f51339c = x0.u(u0Var.getUrl());
            u0Var.f51251e.d = a2.a(u0Var);
            xa.c(u0Var.f51251e);
        }
        u0Var.c("doUpdateVisitedHistory " + str + " " + z9);
        x0 x0Var = u0Var.Q;
        if (x0Var != null) {
            x0Var.J(!u0Var.canGoBack(), !u0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z9);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        x0 x0Var;
        u0 u0Var = this.f51113e;
        u0Var.c("onPageCommitVisible " + str);
        boolean z9 = this.f51112c;
        if (z9 && !n9.a("DOCUMENT_START_SCRIPT") && (x0Var = u0Var.Q) != null) {
            boolean z10 = x0.Q0;
            if (x0Var.q()) {
                u0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (!z9) {
            u0Var.N = true;
            String y22 = org.telegram.messenger.g0.y2(null, 2131624363);
            boolean z11 = r2.f25216a;
            u0Var.d(y22.replace("$DEBUG$", "true"));
            u0Var.d(org.telegram.messenger.g0.y2(null, 2131624364));
        } else {
            u0Var.N = true;
            String y23 = org.telegram.messenger.g0.y2(null, 2131624362);
            boolean z12 = r2.f25216a;
            u0Var.d(y23.replace("$DEBUG$", "true"));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        x0 x0Var;
        u0 u0Var = this.f51113e;
        u0Var.f51249b = true;
        u0Var.c("onPageFinished");
        boolean z9 = this.f51112c;
        if (z9 && !n9.a("DOCUMENT_START_SCRIPT") && (x0Var = u0Var.Q) != null) {
            boolean z10 = x0.Q0;
            if (x0Var.q()) {
                u0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        x0 x0Var2 = u0Var.Q;
        if (x0Var2 != null) {
            x0Var2.U(str, true);
        } else {
            u0Var.c("onPageFinished: no container");
        }
        if (!z9) {
            u0Var.N = true;
            String y22 = org.telegram.messenger.g0.y2(null, 2131624363);
            boolean z11 = r2.f25216a;
            u0Var.d(y22.replace("$DEBUG$", "true"));
            u0Var.d(org.telegram.messenger.g0.y2(null, 2131624364));
        } else {
            u0Var.N = true;
            String y23 = org.telegram.messenger.g0.y2(null, 2131624362);
            boolean z12 = r2.f25216a;
            u0Var.d(y23.replace("$DEBUG$", "true"));
        }
        u0.a(u0Var);
        x0 x0Var3 = u0Var.Q;
        if (x0Var3 != null) {
            if (!u0Var.E) {
                u0Var.getUrl();
            }
            x0Var3.J(!u0Var.canGoBack(), !u0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.j0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        u0 u0Var = this.f51113e;
        u0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
        if (u0Var.Q != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
            org.telegram.messenger.g0.r(this.f51111b);
            u0Var.f51254r = null;
            u0Var.f51255s = false;
            u0Var.f51256w = false;
            u0Var.M = false;
            u0Var.J = false;
            u0Var.f51253n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? u0Var.getUrl() : webResourceRequest.getUrl().toString();
            x0 x0Var = u0Var.Q;
            u0Var.K = null;
            x0Var.I();
            x0 x0Var2 = u0Var.Q;
            u0Var.O = null;
            x0Var2.getClass();
            x0 x0Var3 = u0Var.Q;
            u0Var.h = true;
            webResourceError.getErrorCode();
            x0Var3.E(true, webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null);
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
        u0 u0Var = this.f51113e;
        u0Var.c(sb3);
        if (u0Var.Q != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                org.telegram.messenger.g0.r(this.f51111b);
                u0Var.f51254r = null;
                u0Var.f51255s = false;
                u0Var.f51256w = false;
                u0Var.M = false;
                u0Var.J = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = u0Var.getUrl();
                }
                u0Var.f51253n = url2;
                x0 x0Var = u0Var.Q;
                u0Var.K = null;
                x0Var.I();
                x0 x0Var2 = u0Var.Q;
                u0Var.O = null;
                x0Var2.getClass();
                x0 x0Var3 = u0Var.Q;
                u0Var.h = true;
                webResourceResponse.getStatusCode();
                x0Var3.E(true, webResourceResponse.getReasonPhrase());
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
        this.f51113e.c(sb2.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        h6 h6Var;
        Integer valueOf;
        Boolean valueOf2;
        int i7 = Build.VERSION.SDK_INT;
        u0 u0Var = this.f51113e;
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
            u0Var.c(sb2.toString());
        } else {
            u0Var.c("onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.g0.M1(u0Var.getContext())) {
                return true;
            }
            Context context = u0Var.getContext();
            x0 x0Var = u0Var.Q;
            if (x0Var == null) {
                h6Var = null;
            } else {
                h6Var = x0Var.f51302e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = id.M0(2131752104, null);
            u1Var.T = org.telegram.messenger.g0.U2(id.M0(2131752105, null), new i0(this, 2));
            alertDialog$Builder.k(id.M0(2131747831, null), null);
            u1Var.setOnDismissListener(new eb(this, 11));
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
        u0 u0Var = this.f51113e;
        u0Var.c(sb3);
        if (webResourceRequest != null && x0.p(webResourceRequest.getUrl())) {
            u0Var.c("proxying ton");
            this.f51110a = false;
            return x0.N(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f51112c && u0Var.f51252f != null && this.f51110a) {
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
                            if (!u0Var.E && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                                Iterator<String> it = entry2.getValue().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String next = it.next();
                                    if (next != null && !"unsafe-none".equals(next.toLowerCase()) && !"same-site".equals(next.toLowerCase())) {
                                        u0Var.c("<!> dangerous header CORS policy: " + key + ": " + next + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                        u0Var.E = true;
                                        org.telegram.messenger.g0.h3(new i0(this, 1));
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
                    this.f51110a = false;
                    return new WebResourceResponse(contentType, contentEncoding, httpURLConnection2.getResponseCode(), httpURLConnection2.getResponseMessage(), hashMap, httpURLConnection2.getInputStream());
                } catch (Exception e10) {
                    e = e10;
                    httpURLConnection = httpURLConnection2;
                    a8.g(e, true);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.f51110a = false;
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        this.f51110a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        d0 d0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            u0 u0Var = this.f51113e;
            if (startsWith) {
                if (u0Var.f51252f != null) {
                    d0 d0Var2 = u0Var.Q.f51299c;
                    if (d0Var2 != null) {
                        d0Var2.j();
                    } else {
                        Runnable runnable = u0Var.U;
                        if (runnable != null) {
                            runnable.run();
                            u0Var.U = null;
                        }
                    }
                }
                vf.c.t(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z9 = this.f51112c;
            if (!z9) {
                if (vf.c.m(context, str, true)) {
                    u0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!u0Var.f51249b && !u0Var.canGoBack()) {
                        d0 d0Var3 = u0Var.Q.f51299c;
                        if (d0Var3 != null) {
                            d0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = u0Var.U;
                        if (runnable2 != null) {
                            runnable2.run();
                            u0Var.U = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            u0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    u0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    vf.c.q(u0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (u0Var.Q != null && vf.c.g(parse, false, null)) {
                if (z9 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (qp.s1(u0Var.Q.M).B4 != null && qp.s1(u0Var.Q.M).B4.contains(parse.getScheme())) {
                        x0 x0Var = u0Var.Q;
                        if (u0Var.f51252f != null) {
                            d0 d0Var4 = x0Var.f51299c;
                            if (d0Var4 != null) {
                                d0Var4.j();
                            } else {
                                Runnable runnable3 = u0Var.U;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    u0Var.U = null;
                                }
                            }
                            x0 x0Var2 = u0Var.f51252f.Q;
                            if (x0Var2 != null && (d0Var = x0Var2.f51299c) != null) {
                                d0Var.b();
                            }
                        }
                        x0Var.H(parse, null, !x0Var.f51314o0, false, false);
                    }
                    u0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
            } else {
                if (parse != null) {
                    parse.toString();
                }
                u0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
        }
        return false;
    }

    @Override
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        this.f51113e.c("onReceivedError: " + i7 + " " + str + " url=" + str2);
        super.onReceivedError(webView, i7, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        u0 u0Var = this.f51113e;
        u0Var.c("shouldInterceptRequest " + str);
        boolean z9 = x0.Q0;
        if (str != null && x0.p(Uri.parse(str))) {
            u0Var.c("proxying ton");
            return x0.N("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
