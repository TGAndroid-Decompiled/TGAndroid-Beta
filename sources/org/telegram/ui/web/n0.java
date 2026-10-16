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
import bi.t4;
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
public final class n0 extends WebViewClient {
    public boolean f41128a = true;
    public final m0 f41129b = new m0(this, 0);
    public final boolean f41130c;
    public final Context d;
    public final z0 e;

    public n0(z0 z0Var, boolean z10, Context context) {
        this.e = z0Var;
        this.f41130c = z10;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        d1 d1Var;
        boolean z11 = this.f41130c;
        z0 z0Var = this.e;
        if (!z11 && ((d1Var = z0Var.e) == null || !TextUtils.equals(d1Var.f41021c, str))) {
            ?? tLObject = new TLObject();
            z0Var.e = tLObject;
            tLObject.f41019a = Utilities.fastRandom.nextLong();
            z0Var.e.f41020b = System.currentTimeMillis();
            z0Var.e.f41021c = c1.u(z0Var.getUrl());
            z0Var.e.d = m2.a(z0Var);
            e1.c(z0Var.e);
        }
        z0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        c1 c1Var = z0Var.Q;
        if (c1Var != null) {
            c1Var.I(!z0Var.canGoBack(), !z0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        c1 c1Var;
        z0 z0Var = this.e;
        z0Var.c("onPageCommitVisible " + str);
        boolean z10 = this.f41130c;
        if (z10 && !a.a.a("DOCUMENT_START_SCRIPT") && (c1Var = z0Var.Q) != null) {
            boolean z11 = c1.P0;
            if (c1Var.q()) {
                z0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (!z10) {
            z0Var.N = true;
            z0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            z0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            z0Var.N = true;
            z0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        c1 c1Var;
        z0 z0Var = this.e;
        z0Var.f41262b = true;
        z0Var.c("onPageFinished");
        boolean z10 = this.f41130c;
        if (z10 && !a.a.a("DOCUMENT_START_SCRIPT") && (c1Var = z0Var.Q) != null) {
            boolean z11 = c1.P0;
            if (c1Var.q()) {
                z0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        c1 c1Var2 = z0Var.Q;
        if (c1Var2 != null) {
            c1Var2.T(str, true);
        } else {
            z0Var.c("onPageFinished: no container");
        }
        if (!z10) {
            z0Var.N = true;
            String readRes = AndroidUtilities.readRes(R.raw.webview_ext);
            z0Var.d(readRes.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            z0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            z0Var.N = true;
            String readRes2 = AndroidUtilities.readRes(R.raw.webview_app_ext);
            z0Var.d(readRes2.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        z0.a(z0Var);
        c1 c1Var3 = z0Var.Q;
        if (c1Var3 != null) {
            if (!z0Var.E) {
                z0Var.getUrl();
            }
            c1Var3.I(!z0Var.canGoBack(), !z0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.n0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        z0 z0Var = this.e;
        z0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
        if (z0Var.Q != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
            AndroidUtilities.cancelRunOnUIThread(this.f41129b);
            z0Var.f41266r = null;
            z0Var.f41267s = false;
            z0Var.v = false;
            z0Var.M = false;
            z0Var.J = false;
            z0Var.f41265n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? z0Var.getUrl() : webResourceRequest.getUrl().toString();
            c1 c1Var = z0Var.Q;
            z0Var.K = null;
            c1Var.H();
            c1 c1Var2 = z0Var.Q;
            z0Var.O = null;
            c1Var2.getClass();
            c1 c1Var3 = z0Var.Q;
            z0Var.h = true;
            webResourceError.getErrorCode();
            c1Var3.D(true, webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null);
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
        z0 z0Var = this.e;
        z0Var.c(sb3);
        if (z0Var.Q != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.f41129b);
                z0Var.f41266r = null;
                z0Var.f41267s = false;
                z0Var.v = false;
                z0Var.M = false;
                z0Var.J = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = z0Var.getUrl();
                }
                z0Var.f41265n = url2;
                c1 c1Var = z0Var.Q;
                z0Var.K = null;
                c1Var.H();
                c1 c1Var2 = z0Var.Q;
                z0Var.O = null;
                c1Var2.getClass();
                c1 c1Var3 = z0Var.Q;
                z0Var.h = true;
                webResourceResponse.getStatusCode();
                c1Var3.D(true, webResourceResponse.getReasonPhrase());
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
        c6 c6Var;
        Integer valueOf;
        Boolean valueOf2;
        int i10 = Build.VERSION.SDK_INT;
        z0 z0Var = this.e;
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
            z0Var.c(sb2.toString());
        } else {
            z0Var.c("onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(z0Var.getContext())) {
                return true;
            }
            Context context = z0Var.getContext();
            c1 c1Var = z0Var.Q;
            if (c1Var == null) {
                c6Var = null;
            } else {
                c6Var = c1Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new m0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f19248a.setOnDismissListener(new t4(this, 7));
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
        z0 z0Var = this.e;
        z0Var.c(sb3);
        if (webResourceRequest != null && c1.p(webResourceRequest.getUrl())) {
            z0Var.c("proxying ton");
            this.f41128a = false;
            return c1.M(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f41130c && z0Var.f41264f != null && this.f41128a) {
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
                        if (!z0Var.E && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it2 = next.getValue().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                    z0Var.c("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    z0Var.E = true;
                                    AndroidUtilities.runOnUIThread(new m0(this, 1));
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
                this.f41128a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e7) {
                e = e7;
                httpURLConnection2 = httpURLConnection;
                FileLog.e(e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.f41128a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.f41128a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        h0 h0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            z0 z0Var = this.e;
            if (startsWith) {
                if (z0Var.f41264f != null) {
                    h0 h0Var2 = z0Var.Q.f40985c;
                    if (h0Var2 != null) {
                        h0Var2.j();
                    } else {
                        Runnable runnable = z0Var.U;
                        if (runnable != null) {
                            runnable.run();
                            z0Var.U = null;
                        }
                    }
                }
                pf.d.r(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.f41130c;
            if (!z10) {
                if (pf.d.k(context, str, true)) {
                    z0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!z0Var.f41262b && !z0Var.canGoBack()) {
                        h0 h0Var3 = z0Var.Q.f40985c;
                        if (h0Var3 != null) {
                            h0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = z0Var.U;
                        if (runnable2 != null) {
                            runnable2.run();
                            z0Var.U = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            z0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    z0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    pf.d.o(z0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (z0Var.Q != null && pf.d.e(parse, false, null)) {
                if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (MessagesController.getInstance(z0Var.Q.M).webAppAllowedProtocols != null && MessagesController.getInstance(z0Var.Q.M).webAppAllowedProtocols.contains(parse.getScheme())) {
                        c1 c1Var = z0Var.Q;
                        if (z0Var.f41264f != null) {
                            h0 h0Var4 = c1Var.f40985c;
                            if (h0Var4 != null) {
                                h0Var4.j();
                            } else {
                                Runnable runnable3 = z0Var.U;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    z0Var.U = null;
                                }
                            }
                            c1 c1Var2 = z0Var.f41264f.Q;
                            if (c1Var2 != null && (h0Var = c1Var2.f40985c) != null) {
                                h0Var.b();
                            }
                        }
                        c1Var.G(parse, null, !c1Var.f40999o0, false, false);
                    }
                    z0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
            } else {
                if (parse != null) {
                    parse.toString();
                }
                z0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
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
        z0 z0Var = this.e;
        z0Var.c("shouldInterceptRequest " + str);
        boolean z10 = c1.P0;
        if (str != null && c1.p(Uri.parse(str))) {
            z0Var.c("proxying ton");
            return c1.M("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
