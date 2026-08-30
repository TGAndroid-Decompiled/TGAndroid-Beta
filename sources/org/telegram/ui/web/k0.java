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
public final class k0 extends WebViewClient {
    public boolean f39556a = true;
    public final j0 f39557b = new j0(this, 0);
    public final boolean f39558c;
    public final Context d;
    public final w0 e;

    public k0(w0 w0Var, boolean z4, Context context) {
        this.e = w0Var;
        this.f39558c = z4;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z4) {
        b1 b1Var;
        boolean z10 = this.f39558c;
        w0 w0Var = this.e;
        if (!z10 && ((b1Var = w0Var.e) == null || !TextUtils.equals(b1Var.f39461c, str))) {
            ?? tLObject = new TLObject();
            w0Var.e = tLObject;
            tLObject.f39459a = Utilities.fastRandom.nextLong();
            w0Var.e.f39460b = System.currentTimeMillis();
            w0Var.e.f39461c = a1.s(w0Var.getUrl());
            w0Var.e.d = k2.a(w0Var);
            c1.c(w0Var.e);
        }
        w0Var.c("doUpdateVisitedHistory " + str + " " + z4);
        a1 a1Var = w0Var.N;
        if (a1Var != null) {
            a1Var.F(!w0Var.canGoBack(), !w0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z4);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        w0 w0Var = this.e;
        w0Var.c("onPageCommitVisible " + str);
        if (!this.f39558c) {
            w0Var.K = true;
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            w0Var.K = true;
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        w0 w0Var = this.e;
        w0Var.f39683b = true;
        w0Var.c("onPageFinished");
        a1 a1Var = w0Var.N;
        if (a1Var != null) {
            a1Var.O(str, true);
        } else {
            w0Var.c("onPageFinished: no container");
        }
        if (!this.f39558c) {
            w0Var.K = true;
            String readRes = AndroidUtilities.readRes(R.raw.webview_ext);
            w0Var.d(readRes.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            w0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            w0Var.K = true;
            String readRes2 = AndroidUtilities.readRes(R.raw.webview_app_ext);
            w0Var.d(readRes2.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        w0.a(w0Var);
        a1 a1Var2 = w0Var.N;
        if (a1Var2 != null) {
            if (!w0Var.B) {
                w0Var.getUrl();
            }
            a1Var2.F(!w0Var.canGoBack(), !w0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.k0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            w0 w0Var = this.e;
            w0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
            if (w0Var.N != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.f39557b);
                w0Var.f39687r = null;
                w0Var.f39688s = false;
                w0Var.v = false;
                w0Var.J = false;
                w0Var.G = false;
                w0Var.f39686n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? w0Var.getUrl() : webResourceRequest.getUrl().toString();
                a1 a1Var = w0Var.N;
                w0Var.H = null;
                a1Var.E();
                a1 a1Var2 = w0Var.N;
                w0Var.L = null;
                a1Var2.getClass();
                a1 a1Var3 = w0Var.N;
                w0Var.h = true;
                webResourceError.getErrorCode();
                a1Var3.A(webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null, true);
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
        w0 w0Var = this.e;
        w0Var.c(sb2);
        if (w0Var.N != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.f39557b);
                w0Var.f39687r = null;
                w0Var.f39688s = false;
                w0Var.v = false;
                w0Var.J = false;
                w0Var.G = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = w0Var.getUrl();
                }
                w0Var.f39686n = url2;
                a1 a1Var = w0Var.N;
                w0Var.H = null;
                a1Var.E();
                a1 a1Var2 = w0Var.N;
                w0Var.L = null;
                a1Var2.getClass();
                a1 a1Var3 = w0Var.N;
                w0Var.h = true;
                webResourceResponse.getStatusCode();
                a1Var3.A(webResourceResponse.getReasonPhrase(), true);
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
        w0 w0Var = this.e;
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
            w0Var.c(sb.toString());
        } else {
            w0Var.c("onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(w0Var.getContext())) {
                return true;
            }
            Context context = w0Var.getContext();
            a1 a1Var = w0Var.N;
            if (a1Var == null) {
                f6Var = null;
            } else {
                f6Var = a1Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new j0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f19503a.setOnDismissListener(new eg.d0(this, 9));
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
        w0 w0Var = this.e;
        w0Var.c(sb2);
        if (webResourceRequest != null && a1.o(webResourceRequest.getUrl())) {
            w0Var.c("proxying ton");
            this.f39556a = false;
            return a1.I(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f39558c && w0Var.f39685f != null && this.f39556a) {
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
                        if (!w0Var.B && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it2 = next.getValue().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                    w0Var.c("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    w0Var.B = true;
                                    AndroidUtilities.runOnUIThread(new j0(this, 1));
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
                this.f39556a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e6) {
                e = e6;
                httpURLConnection2 = httpURLConnection;
                FileLog.e(e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.f39556a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.f39556a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        e0 e0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            w0 w0Var = this.e;
            if (startsWith) {
                if (w0Var.f39685f != null) {
                    e0 e0Var2 = w0Var.N.f39424c;
                    if (e0Var2 != null) {
                        e0Var2.j();
                    } else {
                        Runnable runnable = w0Var.P;
                        if (runnable != null) {
                            runnable.run();
                            w0Var.P = null;
                        }
                    }
                }
                af.g.s(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z4 = this.f39558c;
            if (!z4) {
                if (af.g.l(context, str, true)) {
                    w0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!w0Var.f39683b && !w0Var.canGoBack()) {
                        e0 e0Var3 = w0Var.N.f39424c;
                        if (e0Var3 != null) {
                            e0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = w0Var.P;
                        if (runnable2 != null) {
                            runnable2.run();
                            w0Var.P = null;
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
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    w0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    af.g.p(w0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (w0Var.N != null && af.g.f(parse, false, null)) {
                if (z4 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (MessagesController.getInstance(w0Var.N.J).webAppAllowedProtocols != null && MessagesController.getInstance(w0Var.N.J).webAppAllowedProtocols.contains(parse.getScheme())) {
                        if (w0Var.f39685f != null) {
                            e0 e0Var4 = w0Var.N.f39424c;
                            if (e0Var4 != null) {
                                e0Var4.j();
                            } else {
                                Runnable runnable3 = w0Var.P;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    w0Var.P = null;
                                }
                            }
                            a1 a1Var = w0Var.f39685f.N;
                            if (a1Var != null && (e0Var = a1Var.f39424c) != null) {
                                e0Var.b();
                            }
                        }
                        a1 a1Var2 = w0Var.N;
                        a1Var2.D(parse, null, !a1Var2.f39435l0, false, false);
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
        w0 w0Var = this.e;
        w0Var.c("onReceivedError: " + i10 + " " + str + " url=" + str2);
        if (Build.VERSION.SDK_INT < 23 && w0Var.N != null) {
            AndroidUtilities.cancelRunOnUIThread(this.f39557b);
            w0Var.f39687r = null;
            w0Var.f39688s = false;
            w0Var.v = false;
            w0Var.J = false;
            w0Var.G = false;
            w0Var.f39686n = w0Var.getUrl();
            a1 a1Var = w0Var.N;
            w0Var.H = null;
            a1Var.E();
            a1 a1Var2 = w0Var.N;
            w0Var.L = null;
            a1Var2.getClass();
            a1 a1Var3 = w0Var.N;
            w0Var.h = true;
            a1Var3.A(str, true);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        w0 w0Var = this.e;
        w0Var.c("shouldInterceptRequest " + str);
        boolean z4 = a1.J0;
        if (str != null && a1.o(Uri.parse(str))) {
            w0Var.c("proxying ton");
            return a1.I("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
