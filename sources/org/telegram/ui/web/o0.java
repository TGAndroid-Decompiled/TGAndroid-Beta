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
import bi.r4;
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
public final class o0 extends WebViewClient {
    public boolean f42196a = true;
    public final n0 f42197b = new n0(this, 0);
    public final boolean f42198c;
    public final Context d;
    public final z0 f42199e;

    public o0(z0 z0Var, boolean z10, Context context) {
        this.f42199e = z0Var;
        this.f42198c = z10;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        e1 e1Var;
        boolean z11 = this.f42198c;
        z0 z0Var = this.f42199e;
        if (!z11 && ((e1Var = z0Var.f42330e) == null || !TextUtils.equals(e1Var.f42078c, str))) {
            ?? tLObject = new TLObject();
            z0Var.f42330e = tLObject;
            tLObject.f42076a = Utilities.fastRandom.nextLong();
            z0Var.f42330e.f42077b = System.currentTimeMillis();
            z0Var.f42330e.f42078c = d1.v(z0Var.getUrl());
            z0Var.f42330e.d = n2.a(z0Var);
            f1.c(z0Var.f42330e);
        }
        z0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        d1 d1Var = z0Var.Q;
        if (d1Var != null) {
            d1Var.J(!z0Var.canGoBack(), !z0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        d1 d1Var;
        z0 z0Var = this.f42199e;
        z0Var.c("onPageCommitVisible " + str);
        boolean z10 = this.f42198c;
        if (z10 && !com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT") && (d1Var = z0Var.Q) != null) {
            boolean z11 = d1.P0;
            if (d1Var.r()) {
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
        d1 d1Var;
        z0 z0Var = this.f42199e;
        z0Var.f42328b = true;
        z0Var.c("onPageFinished");
        boolean z10 = this.f42198c;
        if (z10 && !com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT") && (d1Var = z0Var.Q) != null) {
            boolean z11 = d1.P0;
            if (d1Var.r()) {
                z0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        d1 d1Var2 = z0Var.Q;
        if (d1Var2 != null) {
            d1Var2.U(str, true);
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
        d1 d1Var3 = z0Var.Q;
        if (d1Var3 != null) {
            if (!z0Var.E) {
                z0Var.getUrl();
            }
            d1Var3.J(!z0Var.canGoBack(), !z0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.o0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            z0 z0Var = this.f42199e;
            z0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
            if (z0Var.Q != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.f42197b);
                z0Var.f42333r = null;
                z0Var.f42334s = false;
                z0Var.v = false;
                z0Var.M = false;
                z0Var.J = false;
                z0Var.f42332n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? z0Var.getUrl() : webResourceRequest.getUrl().toString();
                d1 d1Var = z0Var.Q;
                z0Var.K = null;
                d1Var.I();
                d1 d1Var2 = z0Var.Q;
                z0Var.O = null;
                d1Var2.getClass();
                d1 d1Var3 = z0Var.Q;
                z0Var.h = true;
                webResourceError.getErrorCode();
                d1Var3.E(webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null, true);
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
        z0 z0Var = this.f42199e;
        z0Var.c(sb3);
        if (z0Var.Q != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.f42197b);
                z0Var.f42333r = null;
                z0Var.f42334s = false;
                z0Var.v = false;
                z0Var.M = false;
                z0Var.J = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = z0Var.getUrl();
                }
                z0Var.f42332n = url2;
                d1 d1Var = z0Var.Q;
                z0Var.K = null;
                d1Var.I();
                d1 d1Var2 = z0Var.Q;
                z0Var.O = null;
                d1Var2.getClass();
                d1 d1Var3 = z0Var.Q;
                z0Var.h = true;
                webResourceResponse.getStatusCode();
                d1Var3.E(webResourceResponse.getReasonPhrase(), true);
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
        this.f42199e.c(sb2.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        f6 f6Var;
        Integer valueOf;
        Boolean valueOf2;
        int i10 = Build.VERSION.SDK_INT;
        z0 z0Var = this.f42199e;
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
            d1 d1Var = z0Var.Q;
            if (d1Var == null) {
                f6Var = null;
            } else {
                f6Var = d1Var.f42042e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20198a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new n0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f20198a.setOnDismissListener(new r4(this, 7));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
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
        z0 z0Var = this.f42199e;
        z0Var.c(sb3);
        if (webResourceRequest != null && d1.q(webResourceRequest.getUrl())) {
            z0Var.c("proxying ton");
            this.f42196a = false;
            return d1.N(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f42198c && z0Var.f42331f != null && this.f42196a) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
            } catch (Exception e7) {
                e = e7;
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
                                    AndroidUtilities.runOnUIThread(new n0(this, 1));
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
                this.f42196a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e10) {
                e = e10;
                httpURLConnection2 = httpURLConnection;
                FileLog.e(e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.f42196a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.f42196a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        i0 i0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            z0 z0Var = this.f42199e;
            if (startsWith) {
                if (z0Var.f42331f != null) {
                    i0 i0Var2 = z0Var.Q.f42039c;
                    if (i0Var2 != null) {
                        i0Var2.j();
                    } else {
                        Runnable runnable = z0Var.U;
                        if (runnable != null) {
                            runnable.run();
                            z0Var.U = null;
                        }
                    }
                }
                of.f.s(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.f42198c;
            if (!z10) {
                if (of.f.l(context, str, true)) {
                    z0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!z0Var.f42328b && !z0Var.canGoBack()) {
                        i0 i0Var3 = z0Var.Q.f42039c;
                        if (i0Var3 != null) {
                            i0Var3.j();
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    z0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    of.f.p(z0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (z0Var.Q != null && of.f.f(parse, false, null)) {
                if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (MessagesController.getInstance(z0Var.Q.M).webAppAllowedProtocols != null && MessagesController.getInstance(z0Var.Q.M).webAppAllowedProtocols.contains(parse.getScheme())) {
                        if (z0Var.f42331f != null) {
                            i0 i0Var4 = z0Var.Q.f42039c;
                            if (i0Var4 != null) {
                                i0Var4.j();
                            } else {
                                Runnable runnable3 = z0Var.U;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    z0Var.U = null;
                                }
                            }
                            d1 d1Var = z0Var.f42331f.Q;
                            if (d1Var != null && (i0Var = d1Var.f42039c) != null) {
                                i0Var.b();
                            }
                        }
                        d1 d1Var2 = z0Var.Q;
                        d1Var2.H(parse, null, !d1Var2.f42054o0, false, false);
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
        z0 z0Var = this.f42199e;
        z0Var.c("onReceivedError: " + i10 + " " + str + " url=" + str2);
        if (Build.VERSION.SDK_INT < 23 && z0Var.Q != null) {
            AndroidUtilities.cancelRunOnUIThread(this.f42197b);
            z0Var.f42333r = null;
            z0Var.f42334s = false;
            z0Var.v = false;
            z0Var.M = false;
            z0Var.J = false;
            z0Var.f42332n = z0Var.getUrl();
            d1 d1Var = z0Var.Q;
            z0Var.K = null;
            d1Var.I();
            d1 d1Var2 = z0Var.Q;
            z0Var.O = null;
            d1Var2.getClass();
            d1 d1Var3 = z0Var.Q;
            z0Var.h = true;
            d1Var3.E(str, true);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        z0 z0Var = this.f42199e;
        z0Var.c("shouldInterceptRequest " + str);
        boolean z10 = d1.P0;
        if (str != null && d1.q(Uri.parse(str))) {
            z0Var.c("proxying ton");
            return d1.N("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
