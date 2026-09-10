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
public final class n0 extends WebViewClient {
    public boolean f38023a = true;
    public final m0 f38024b = new m0(this, 0);
    public final boolean f38025c;
    public final Context d;
    public final y0 e;

    public n0(y0 y0Var, boolean z10, Context context) {
        this.e = y0Var;
        this.f38025c = z10;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        e1 e1Var;
        boolean z11 = this.f38025c;
        y0 y0Var = this.e;
        if (!z11 && ((e1Var = y0Var.e) == null || !TextUtils.equals(e1Var.f37928c, str))) {
            ?? tLObject = new TLObject();
            y0Var.e = tLObject;
            tLObject.f37926a = Utilities.fastRandom.nextLong();
            y0Var.e.f37927b = System.currentTimeMillis();
            y0Var.e.f37928c = c1.v(y0Var.getUrl());
            y0Var.e.d = o2.a(y0Var);
            f1.c(y0Var.e);
        }
        y0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        c1 c1Var = y0Var.Q;
        if (c1Var != null) {
            c1Var.J(!y0Var.canGoBack(), !y0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        c1 c1Var;
        y0 y0Var = this.e;
        y0Var.c("onPageCommitVisible " + str);
        boolean z10 = this.f38025c;
        if (z10 && !com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT") && (c1Var = y0Var.Q) != null) {
            boolean z11 = c1.P0;
            if (c1Var.r()) {
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
        c1 c1Var;
        y0 y0Var = this.e;
        y0Var.f38153b = true;
        y0Var.c("onPageFinished");
        boolean z10 = this.f38025c;
        if (z10 && !com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT") && (c1Var = y0Var.Q) != null) {
            boolean z11 = c1.P0;
            if (c1Var.r()) {
                y0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        c1 c1Var2 = y0Var.Q;
        if (c1Var2 != null) {
            c1Var2.U(str, true);
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
        c1 c1Var3 = y0Var.Q;
        if (c1Var3 != null) {
            if (!y0Var.E) {
                y0Var.getUrl();
            }
            c1Var3.J(!y0Var.canGoBack(), !y0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.n0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            y0 y0Var = this.e;
            y0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
            if (y0Var.Q != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.f38024b);
                y0Var.f38157r = null;
                y0Var.f38158s = false;
                y0Var.v = false;
                y0Var.M = false;
                y0Var.J = false;
                y0Var.f38156n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? y0Var.getUrl() : webResourceRequest.getUrl().toString();
                c1 c1Var = y0Var.Q;
                y0Var.K = null;
                c1Var.I();
                c1 c1Var2 = y0Var.Q;
                y0Var.O = null;
                c1Var2.getClass();
                c1 c1Var3 = y0Var.Q;
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
                AndroidUtilities.cancelRunOnUIThread(this.f38024b);
                y0Var.f38157r = null;
                y0Var.f38158s = false;
                y0Var.v = false;
                y0Var.M = false;
                y0Var.J = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = y0Var.getUrl();
                }
                y0Var.f38156n = url2;
                c1 c1Var = y0Var.Q;
                y0Var.K = null;
                c1Var.I();
                c1 c1Var2 = y0Var.Q;
                y0Var.O = null;
                c1Var2.getClass();
                c1 c1Var3 = y0Var.Q;
                y0Var.h = true;
                webResourceResponse.getStatusCode();
                c1Var3.E(webResourceResponse.getReasonPhrase(), true);
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
        f6 f6Var;
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
            c1 c1Var = y0Var.Q;
            if (c1Var == null) {
                f6Var = null;
            } else {
                f6Var = c1Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new m0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f17528a.setOnDismissListener(new gg.o(this, 5));
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
        if (webResourceRequest != null && c1.q(webResourceRequest.getUrl())) {
            y0Var.c("proxying ton");
            this.f38023a = false;
            return c1.N(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f38025c && y0Var.f38155f != null && this.f38023a) {
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
                this.f38023a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e7) {
                e = e7;
                httpURLConnection2 = httpURLConnection;
                FileLog.e(e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.f38023a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.f38023a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        h0 h0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            y0 y0Var = this.e;
            if (startsWith) {
                if (y0Var.f38155f != null) {
                    h0 h0Var2 = y0Var.Q.f37880c;
                    if (h0Var2 != null) {
                        h0Var2.j();
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
            boolean z10 = this.f38025c;
            if (!z10) {
                if (nf.f.l(context, str, true)) {
                    y0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!y0Var.f38153b && !y0Var.canGoBack()) {
                        h0 h0Var3 = y0Var.Q.f37880c;
                        if (h0Var3 != null) {
                            h0Var3.j();
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
                        if (y0Var.f38155f != null) {
                            h0 h0Var4 = y0Var.Q.f37880c;
                            if (h0Var4 != null) {
                                h0Var4.j();
                            } else {
                                Runnable runnable3 = y0Var.U;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    y0Var.U = null;
                                }
                            }
                            c1 c1Var = y0Var.f38155f.Q;
                            if (c1Var != null && (h0Var = c1Var.f37880c) != null) {
                                h0Var.b();
                            }
                        }
                        c1 c1Var2 = y0Var.Q;
                        c1Var2.H(parse, null, !c1Var2.f37894o0, false, false);
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
            AndroidUtilities.cancelRunOnUIThread(this.f38024b);
            y0Var.f38157r = null;
            y0Var.f38158s = false;
            y0Var.v = false;
            y0Var.M = false;
            y0Var.J = false;
            y0Var.f38156n = y0Var.getUrl();
            c1 c1Var = y0Var.Q;
            y0Var.K = null;
            c1Var.I();
            c1 c1Var2 = y0Var.Q;
            y0Var.O = null;
            c1Var2.getClass();
            c1 c1Var3 = y0Var.Q;
            y0Var.h = true;
            c1Var3.E(str, true);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        y0 y0Var = this.e;
        y0Var.c("shouldInterceptRequest " + str);
        boolean z10 = c1.P0;
        if (str != null && c1.q(Uri.parse(str))) {
            y0Var.c("proxying ton");
            return c1.N("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
