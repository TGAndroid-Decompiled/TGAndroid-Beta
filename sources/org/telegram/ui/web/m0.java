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
import org.telegram.ui.ActionBar.f6;
public final class m0 extends WebViewClient {
    public boolean f39526a = true;
    public final l0 f39527b = new l0(this, 0);
    public final boolean f39528c;
    public final Context d;
    public final y0 e;

    public m0(y0 y0Var, boolean z4, Context context) {
        this.e = y0Var;
        this.f39528c = z4;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z4) {
        d1 d1Var;
        boolean z10 = this.f39528c;
        y0 y0Var = this.e;
        if (!z10 && ((d1Var = y0Var.e) == null || !TextUtils.equals(d1Var.f39424c, str))) {
            ?? tLObject = new TLObject();
            y0Var.e = tLObject;
            tLObject.f39422a = Utilities.fastRandom.nextLong();
            y0Var.e.f39423b = System.currentTimeMillis();
            y0Var.e.f39424c = c1.v(y0Var.getUrl());
            y0Var.e.d = l2.a(y0Var);
            e1.c(y0Var.e);
        }
        y0Var.c("doUpdateVisitedHistory " + str + " " + z4);
        c1 c1Var = y0Var.N;
        if (c1Var != null) {
            c1Var.J(!y0Var.canGoBack(), !y0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z4);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        c1 c1Var;
        y0 y0Var = this.e;
        y0Var.c("onPageCommitVisible " + str);
        boolean z4 = this.f39528c;
        if (z4 && !k7.x.a("DOCUMENT_START_SCRIPT") && (c1Var = y0Var.N) != null) {
            boolean z10 = c1.M0;
            if (c1Var.r()) {
                y0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (!z4) {
            y0Var.K = true;
            y0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            y0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            y0Var.K = true;
            y0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        c1 c1Var;
        y0 y0Var = this.e;
        y0Var.f39652b = true;
        y0Var.c("onPageFinished");
        boolean z4 = this.f39528c;
        if (z4 && !k7.x.a("DOCUMENT_START_SCRIPT") && (c1Var = y0Var.N) != null) {
            boolean z10 = c1.M0;
            if (c1Var.r()) {
                y0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        c1 c1Var2 = y0Var.N;
        if (c1Var2 != null) {
            c1Var2.U(str, true);
        } else {
            y0Var.c("onPageFinished: no container");
        }
        if (!z4) {
            y0Var.K = true;
            String readRes = AndroidUtilities.readRes(R.raw.webview_ext);
            y0Var.d(readRes.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            y0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            y0Var.K = true;
            String readRes2 = AndroidUtilities.readRes(R.raw.webview_app_ext);
            y0Var.d(readRes2.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        y0.a(y0Var);
        c1 c1Var3 = y0Var.N;
        if (c1Var3 != null) {
            if (!y0Var.B) {
                y0Var.getUrl();
            }
            c1Var3.J(!y0Var.canGoBack(), !y0Var.canGoForward());
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
            if (y0Var.N != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.f39527b);
                y0Var.f39656r = null;
                y0Var.f39657s = false;
                y0Var.v = false;
                y0Var.J = false;
                y0Var.G = false;
                y0Var.f39655n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? y0Var.getUrl() : webResourceRequest.getUrl().toString();
                c1 c1Var = y0Var.N;
                y0Var.H = null;
                c1Var.I();
                c1 c1Var2 = y0Var.N;
                y0Var.L = null;
                c1Var2.getClass();
                c1 c1Var3 = y0Var.N;
                y0Var.h = true;
                webResourceError.getErrorCode();
                c1Var3.E(webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null, true);
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
        StringBuilder sb = new StringBuilder("onReceivedHttpError: statusCode=");
        if (webResourceResponse == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(webResourceResponse.getStatusCode());
        }
        sb.append(valueOf);
        sb.append(" request=");
        if (webResourceRequest == null) {
            url = null;
        } else {
            url = webResourceRequest.getUrl();
        }
        sb.append(url);
        String sb2 = sb.toString();
        y0 y0Var = this.e;
        y0Var.c(sb2);
        if (y0Var.N != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.f39527b);
                y0Var.f39656r = null;
                y0Var.f39657s = false;
                y0Var.v = false;
                y0Var.J = false;
                y0Var.G = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = y0Var.getUrl();
                }
                y0Var.f39655n = url2;
                c1 c1Var = y0Var.N;
                y0Var.H = null;
                c1Var.I();
                c1 c1Var2 = y0Var.N;
                y0Var.L = null;
                c1Var2.getClass();
                c1 c1Var3 = y0Var.N;
                y0Var.h = true;
                webResourceResponse.getStatusCode();
                c1Var3.E(webResourceResponse.getReasonPhrase(), true);
            }
        }
    }

    @Override
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String url;
        StringBuilder sb = new StringBuilder("onReceivedSslError: error=");
        sb.append(sslError);
        sb.append(" url=");
        if (sslError == null) {
            url = null;
        } else {
            url = sslError.getUrl();
        }
        sb.append(url);
        this.e.c(sb.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        f6 f6Var;
        Integer valueOf;
        Boolean valueOf2;
        int i10 = Build.VERSION.SDK_INT;
        y0 y0Var = this.e;
        if (i10 >= 26) {
            StringBuilder sb = new StringBuilder("onRenderProcessGone priority=");
            if (renderProcessGoneDetail == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit());
            }
            sb.append(valueOf);
            sb.append(" didCrash=");
            if (renderProcessGoneDetail == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(renderProcessGoneDetail.didCrash());
            }
            sb.append(valueOf2);
            y0Var.c(sb.toString());
        } else {
            y0Var.c("onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(y0Var.getContext())) {
                return true;
            }
            Context context = y0Var.getContext();
            c1 c1Var = y0Var.N;
            if (c1Var == null) {
                f6Var = null;
            } else {
                f6Var = c1Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new l0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f19478a.setOnDismissListener(new eg.d0(this, 9));
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
        StringBuilder sb = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection2 = null;
        sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb2 = sb.toString();
        y0 y0Var = this.e;
        y0Var.c(sb2);
        if (webResourceRequest != null && c1.q(webResourceRequest.getUrl())) {
            y0Var.c("proxying ton");
            this.f39526a = false;
            return c1.N(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f39528c && y0Var.f39654f != null && this.f39526a) {
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
                        if (!y0Var.B && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it2 = next.getValue().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                    y0Var.c("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    y0Var.B = true;
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
                this.f39526a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e6) {
                e = e6;
                httpURLConnection2 = httpURLConnection;
                FileLog.e(e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.f39526a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.f39526a = false;
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
                if (y0Var.f39654f != null) {
                    g0 g0Var2 = y0Var.N.f39385c;
                    if (g0Var2 != null) {
                        g0Var2.j();
                    } else {
                        Runnable runnable = y0Var.R;
                        if (runnable != null) {
                            runnable.run();
                            y0Var.R = null;
                        }
                    }
                }
                ze.d.s(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z4 = this.f39528c;
            if (!z4) {
                if (ze.d.l(context, str, true)) {
                    y0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!y0Var.f39652b && !y0Var.canGoBack()) {
                        g0 g0Var3 = y0Var.N.f39385c;
                        if (g0Var3 != null) {
                            g0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = y0Var.R;
                        if (runnable2 != null) {
                            runnable2.run();
                            y0Var.R = null;
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
                    ze.d.p(y0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (y0Var.N != null && ze.d.f(parse, false, null)) {
                if (z4 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (MessagesController.getInstance(y0Var.N.J).webAppAllowedProtocols != null && MessagesController.getInstance(y0Var.N.J).webAppAllowedProtocols.contains(parse.getScheme())) {
                        if (y0Var.f39654f != null) {
                            g0 g0Var4 = y0Var.N.f39385c;
                            if (g0Var4 != null) {
                                g0Var4.j();
                            } else {
                                Runnable runnable3 = y0Var.R;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    y0Var.R = null;
                                }
                            }
                            c1 c1Var = y0Var.f39654f.N;
                            if (c1Var != null && (g0Var = c1Var.f39385c) != null) {
                                g0Var.b();
                            }
                        }
                        c1 c1Var2 = y0Var.N;
                        c1Var2.H(parse, null, !c1Var2.f39396l0, false, false);
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
        if (Build.VERSION.SDK_INT < 23 && y0Var.N != null) {
            AndroidUtilities.cancelRunOnUIThread(this.f39527b);
            y0Var.f39656r = null;
            y0Var.f39657s = false;
            y0Var.v = false;
            y0Var.J = false;
            y0Var.G = false;
            y0Var.f39655n = y0Var.getUrl();
            c1 c1Var = y0Var.N;
            y0Var.H = null;
            c1Var.I();
            c1 c1Var2 = y0Var.N;
            y0Var.L = null;
            c1Var2.getClass();
            c1 c1Var3 = y0Var.N;
            y0Var.h = true;
            c1Var3.E(str, true);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        y0 y0Var = this.e;
        y0Var.c("shouldInterceptRequest " + str);
        boolean z4 = c1.M0;
        if (str != null && c1.q(Uri.parse(str))) {
            y0Var.c("proxying ton");
            return c1.N("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
