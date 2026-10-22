package org.telegram.ui.web;

import ai.bb;
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
import org.telegram.ui.ActionBar.d6;
public final class m0 extends WebViewClient {
    public boolean f42725a = true;
    public final l0 f42726b = new l0(this, 0);
    public final boolean f42727c;
    public final Context d;
    public final x0 e;

    public m0(x0 x0Var, boolean z10, Context context) {
        this.e = x0Var;
        this.f42727c = z10;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        b1 b1Var;
        boolean z11 = this.f42727c;
        x0 x0Var = this.e;
        if (!z11 && ((b1Var = x0Var.e) == null || !TextUtils.equals(b1Var.f42611c, str))) {
            ?? tLObject = new TLObject();
            x0Var.e = tLObject;
            tLObject.f42609a = Utilities.fastRandom.nextLong();
            x0Var.e.f42610b = System.currentTimeMillis();
            x0Var.e.f42611c = a1.u(x0Var.getUrl());
            x0Var.e.d = l2.a(x0Var);
            c1.c(x0Var.e);
        }
        x0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        a1 a1Var = x0Var.Q;
        if (a1Var != null) {
            a1Var.I(!x0Var.canGoBack(), !x0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        a1 a1Var;
        x0 x0Var = this.e;
        x0Var.c("onPageCommitVisible " + str);
        boolean z10 = this.f42727c;
        if (z10 && !a.a.a("DOCUMENT_START_SCRIPT") && (a1Var = x0Var.Q) != null) {
            boolean z11 = a1.P0;
            if (a1Var.q()) {
                x0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (!z10) {
            x0Var.N = true;
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            x0Var.N = true;
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        a1 a1Var;
        x0 x0Var = this.e;
        x0Var.f42849b = true;
        x0Var.c("onPageFinished");
        boolean z10 = this.f42727c;
        if (z10 && !a.a.a("DOCUMENT_START_SCRIPT") && (a1Var = x0Var.Q) != null) {
            boolean z11 = a1.P0;
            if (a1Var.q()) {
                x0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        a1 a1Var2 = x0Var.Q;
        if (a1Var2 != null) {
            a1Var2.T(str, true);
        } else {
            x0Var.c("onPageFinished: no container");
        }
        if (!z10) {
            x0Var.N = true;
            String readRes = AndroidUtilities.readRes(R.raw.webview_ext);
            x0Var.d(readRes.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            x0Var.N = true;
            String readRes2 = AndroidUtilities.readRes(R.raw.webview_app_ext);
            x0Var.d(readRes2.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        x0.a(x0Var);
        a1 a1Var3 = x0Var.Q;
        if (a1Var3 != null) {
            if (!x0Var.E) {
                x0Var.getUrl();
            }
            a1Var3.I(!x0Var.canGoBack(), !x0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.m0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        x0 x0Var = this.e;
        x0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
        if (x0Var.Q != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
            AndroidUtilities.cancelRunOnUIThread(this.f42726b);
            x0Var.f42853r = null;
            x0Var.f42854s = false;
            x0Var.v = false;
            x0Var.M = false;
            x0Var.J = false;
            x0Var.f42852n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? x0Var.getUrl() : webResourceRequest.getUrl().toString();
            a1 a1Var = x0Var.Q;
            x0Var.K = null;
            a1Var.H();
            a1 a1Var2 = x0Var.Q;
            x0Var.O = null;
            a1Var2.getClass();
            a1 a1Var3 = x0Var.Q;
            x0Var.h = true;
            webResourceError.getErrorCode();
            a1Var3.D(true, webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null);
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
        x0 x0Var = this.e;
        x0Var.c(sb3);
        if (x0Var.Q != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.f42726b);
                x0Var.f42853r = null;
                x0Var.f42854s = false;
                x0Var.v = false;
                x0Var.M = false;
                x0Var.J = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = x0Var.getUrl();
                }
                x0Var.f42852n = url2;
                a1 a1Var = x0Var.Q;
                x0Var.K = null;
                a1Var.H();
                a1 a1Var2 = x0Var.Q;
                x0Var.O = null;
                a1Var2.getClass();
                a1 a1Var3 = x0Var.Q;
                x0Var.h = true;
                webResourceResponse.getStatusCode();
                a1Var3.D(true, webResourceResponse.getReasonPhrase());
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
        d6 d6Var;
        Integer valueOf;
        Boolean valueOf2;
        int i10 = Build.VERSION.SDK_INT;
        x0 x0Var = this.e;
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
            x0Var.c(sb2.toString());
        } else {
            x0Var.c("onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(x0Var.getContext())) {
                return true;
            }
            Context context = x0Var.getContext();
            a1 a1Var = x0Var.Q;
            if (a1Var == null) {
                d6Var = null;
            } else {
                d6Var = a1Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20608a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new l0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f20608a.setOnDismissListener(new bb(this, 10));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
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
        x0 x0Var = this.e;
        x0Var.c(sb3);
        if (webResourceRequest != null && a1.p(webResourceRequest.getUrl())) {
            x0Var.c("proxying ton");
            this.f42725a = false;
            return a1.M(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f42727c && x0Var.f42851f != null && this.f42725a) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
            } catch (Exception e) {
                e = e;
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
                        if (!x0Var.E && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it2 = next.getValue().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                    x0Var.c("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    x0Var.E = true;
                                    AndroidUtilities.runOnUIThread(new l0(this, 1));
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
                this.f42725a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e7) {
                e = e7;
                httpURLConnection2 = httpURLConnection;
                FileLog.e(e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.f42725a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.f42725a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        g0 g0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            x0 x0Var = this.e;
            if (startsWith) {
                if (x0Var.f42851f != null) {
                    g0 g0Var2 = x0Var.Q.f42568c;
                    if (g0Var2 != null) {
                        g0Var2.j();
                    } else {
                        Runnable runnable = x0Var.U;
                        if (runnable != null) {
                            runnable.run();
                            x0Var.U = null;
                        }
                    }
                }
                pf.d.r(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.f42727c;
            if (!z10) {
                if (pf.d.k(context, str, true)) {
                    x0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!x0Var.f42849b && !x0Var.canGoBack()) {
                        g0 g0Var3 = x0Var.Q.f42568c;
                        if (g0Var3 != null) {
                            g0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = x0Var.U;
                        if (runnable2 != null) {
                            runnable2.run();
                            x0Var.U = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            x0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    x0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    pf.d.o(x0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (x0Var.Q != null && pf.d.e(parse, false, null)) {
                if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (MessagesController.getInstance(x0Var.Q.M).webAppAllowedProtocols != null && MessagesController.getInstance(x0Var.Q.M).webAppAllowedProtocols.contains(parse.getScheme())) {
                        a1 a1Var = x0Var.Q;
                        if (x0Var.f42851f != null) {
                            g0 g0Var4 = a1Var.f42568c;
                            if (g0Var4 != null) {
                                g0Var4.j();
                            } else {
                                Runnable runnable3 = x0Var.U;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    x0Var.U = null;
                                }
                            }
                            a1 a1Var2 = x0Var.f42851f.Q;
                            if (a1Var2 != null && (g0Var = a1Var2.f42568c) != null) {
                                g0Var.b();
                            }
                        }
                        a1Var.G(parse, null, !a1Var.f42582o0, false, false);
                    }
                    x0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
            } else {
                if (parse != null) {
                    parse.toString();
                }
                x0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
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
        x0 x0Var = this.e;
        x0Var.c("shouldInterceptRequest " + str);
        boolean z10 = a1.P0;
        if (str != null && a1.p(Uri.parse(str))) {
            x0Var.c("proxying ton");
            return a1.M("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
