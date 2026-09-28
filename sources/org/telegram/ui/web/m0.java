package org.telegram.ui.web;

import ai.f5;
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
    public boolean f39141a = true;
    public final l0 f39142b = new l0(this, 0);
    public final boolean f39143c;
    public final Context d;
    public final y0 e;

    public m0(y0 y0Var, boolean z10, Context context) {
        this.e = y0Var;
        this.f39143c = z10;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        c1 c1Var;
        boolean z11 = this.f39143c;
        y0 y0Var = this.e;
        if (!z11 && ((c1Var = y0Var.e) == null || !TextUtils.equals(c1Var.f39041c, str))) {
            ?? tLObject = new TLObject();
            y0Var.e = tLObject;
            tLObject.f39039a = Utilities.fastRandom.nextLong();
            y0Var.e.f39040b = System.currentTimeMillis();
            y0Var.e.f39041c = b1.v(y0Var.getUrl());
            y0Var.e.d = m2.a(y0Var);
            d1.c(y0Var.e);
        }
        y0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        b1 b1Var = y0Var.Q;
        if (b1Var != null) {
            b1Var.J(!y0Var.canGoBack(), !y0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        b1 b1Var;
        y0 y0Var = this.e;
        y0Var.c("onPageCommitVisible " + str);
        boolean z10 = this.f39143c;
        if (z10 && !com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT") && (b1Var = y0Var.Q) != null) {
            boolean z11 = b1.P0;
            if (b1Var.r()) {
                y0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (!z10) {
            y0Var.N = true;
            y0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            y0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            y0Var.N = true;
            y0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        b1 b1Var;
        y0 y0Var = this.e;
        y0Var.f39276b = true;
        y0Var.c("onPageFinished");
        boolean z10 = this.f39143c;
        if (z10 && !com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT") && (b1Var = y0Var.Q) != null) {
            boolean z11 = b1.P0;
            if (b1Var.r()) {
                y0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        b1 b1Var2 = y0Var.Q;
        if (b1Var2 != null) {
            b1Var2.U(str, true);
        } else {
            y0Var.c("onPageFinished: no container");
        }
        if (!z10) {
            y0Var.N = true;
            String readRes = AndroidUtilities.readRes(R.raw.webview_ext);
            y0Var.d(readRes.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            y0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            y0Var.N = true;
            String readRes2 = AndroidUtilities.readRes(R.raw.webview_app_ext);
            y0Var.d(readRes2.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        y0.a(y0Var);
        b1 b1Var3 = y0Var.Q;
        if (b1Var3 != null) {
            if (!y0Var.E) {
                y0Var.getUrl();
            }
            b1Var3.J(!y0Var.canGoBack(), !y0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.m0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            y0 y0Var = this.e;
            y0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
            if (y0Var.Q != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.f39142b);
                y0Var.f39280r = null;
                y0Var.f39281s = false;
                y0Var.v = false;
                y0Var.M = false;
                y0Var.J = false;
                y0Var.f39279n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? y0Var.getUrl() : webResourceRequest.getUrl().toString();
                b1 b1Var = y0Var.Q;
                y0Var.K = null;
                b1Var.I();
                b1 b1Var2 = y0Var.Q;
                y0Var.O = null;
                b1Var2.getClass();
                b1 b1Var3 = y0Var.Q;
                y0Var.h = true;
                webResourceError.getErrorCode();
                b1Var3.E(webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null, true);
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
        y0 y0Var = this.e;
        y0Var.c(sb3);
        if (y0Var.Q != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.f39142b);
                y0Var.f39280r = null;
                y0Var.f39281s = false;
                y0Var.v = false;
                y0Var.M = false;
                y0Var.J = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = y0Var.getUrl();
                }
                y0Var.f39279n = url2;
                b1 b1Var = y0Var.Q;
                y0Var.K = null;
                b1Var.I();
                b1 b1Var2 = y0Var.Q;
                y0Var.O = null;
                b1Var2.getClass();
                b1 b1Var3 = y0Var.Q;
                y0Var.h = true;
                webResourceResponse.getStatusCode();
                b1Var3.E(webResourceResponse.getReasonPhrase(), true);
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
        y0 y0Var = this.e;
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
            y0Var.c(sb2.toString());
        } else {
            y0Var.c("onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(y0Var.getContext())) {
                return true;
            }
            Context context = y0Var.getContext();
            b1 b1Var = y0Var.Q;
            if (b1Var == null) {
                d6Var = null;
            } else {
                d6Var = b1Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f18661a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new l0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f18661a.setOnDismissListener(new f5(this, 7));
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
        y0 y0Var = this.e;
        y0Var.c(sb3);
        if (webResourceRequest != null && b1.q(webResourceRequest.getUrl())) {
            y0Var.c("proxying ton");
            this.f39141a = false;
            return b1.N(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f39143c && y0Var.f39278f != null && this.f39141a) {
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
                        if (!y0Var.E && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it2 = next.getValue().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                    y0Var.c("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    y0Var.E = true;
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
                this.f39141a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e7) {
                e = e7;
                httpURLConnection2 = httpURLConnection;
                FileLog.e(e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.f39141a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.f39141a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        g0 g0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            y0 y0Var = this.e;
            if (startsWith) {
                if (y0Var.f39278f != null) {
                    g0 g0Var2 = y0Var.Q.f39001c;
                    if (g0Var2 != null) {
                        g0Var2.j();
                    } else {
                        Runnable runnable = y0Var.U;
                        if (runnable != null) {
                            runnable.run();
                            y0Var.U = null;
                        }
                    }
                }
                nf.f.s(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.f39143c;
            if (!z10) {
                if (nf.f.l(context, str, true)) {
                    y0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!y0Var.f39276b && !y0Var.canGoBack()) {
                        g0 g0Var3 = y0Var.Q.f39001c;
                        if (g0Var3 != null) {
                            g0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = y0Var.U;
                        if (runnable2 != null) {
                            runnable2.run();
                            y0Var.U = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            y0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    y0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    nf.f.p(y0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (y0Var.Q != null && nf.f.f(parse, false, null)) {
                if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (MessagesController.getInstance(y0Var.Q.M).webAppAllowedProtocols != null && MessagesController.getInstance(y0Var.Q.M).webAppAllowedProtocols.contains(parse.getScheme())) {
                        b1 b1Var = y0Var.Q;
                        if (y0Var.f39278f != null) {
                            g0 g0Var4 = b1Var.f39001c;
                            if (g0Var4 != null) {
                                g0Var4.j();
                            } else {
                                Runnable runnable3 = y0Var.U;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    y0Var.U = null;
                                }
                            }
                            b1 b1Var2 = y0Var.f39278f.Q;
                            if (b1Var2 != null && (g0Var = b1Var2.f39001c) != null) {
                                g0Var.b();
                            }
                        }
                        b1Var.H(parse, null, !b1Var.f39015o0, false, false);
                    }
                    y0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
            } else {
                if (parse != null) {
                    parse.toString();
                }
                y0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
        }
        return false;
    }

    @Override
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        y0 y0Var = this.e;
        y0Var.c("onReceivedError: " + i10 + " " + str + " url=" + str2);
        if (Build.VERSION.SDK_INT < 23 && y0Var.Q != null) {
            AndroidUtilities.cancelRunOnUIThread(this.f39142b);
            y0Var.f39280r = null;
            y0Var.f39281s = false;
            y0Var.v = false;
            y0Var.M = false;
            y0Var.J = false;
            y0Var.f39279n = y0Var.getUrl();
            b1 b1Var = y0Var.Q;
            y0Var.K = null;
            b1Var.I();
            b1 b1Var2 = y0Var.Q;
            y0Var.O = null;
            b1Var2.getClass();
            b1 b1Var3 = y0Var.Q;
            y0Var.h = true;
            b1Var3.E(str, true);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        y0 y0Var = this.e;
        y0Var.c("shouldInterceptRequest " + str);
        boolean z10 = b1.P0;
        if (str != null && b1.q(Uri.parse(str))) {
            y0Var.c("proxying ton");
            return b1.N("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
