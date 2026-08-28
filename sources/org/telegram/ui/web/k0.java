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
import org.telegram.ui.ActionBar.b6;
public final class k0 extends WebViewClient {
    public boolean f43916a = true;
    public final j0 f43917b = new j0(this, 0);
    public final boolean f43918c;
    public final Context d;
    public final v0 f43919e;

    public k0(v0 v0Var, boolean z10, Context context) {
        this.f43919e = v0Var;
        this.f43918c = z10;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        z0 z0Var;
        boolean z11 = this.f43918c;
        v0 v0Var = this.f43919e;
        if (!z11 && ((z0Var = v0Var.f44039e) == null || !TextUtils.equals(z0Var.f44114c, str))) {
            ?? tLObject = new TLObject();
            v0Var.f44039e = tLObject;
            tLObject.f44112a = Utilities.fastRandom.nextLong();
            v0Var.f44039e.f44113b = System.currentTimeMillis();
            v0Var.f44039e.f44114c = y0.s(v0Var.getUrl());
            v0Var.f44039e.d = h2.a(v0Var);
            a1.c(v0Var.f44039e);
        }
        v0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        y0 y0Var = v0Var.M;
        if (y0Var != null) {
            y0Var.F(!v0Var.canGoBack(), !v0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        v0 v0Var = this.f43919e;
        v0Var.c("onPageCommitVisible " + str);
        if (!this.f43918c) {
            v0Var.J = true;
            v0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            v0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            v0Var.J = true;
            v0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        v0 v0Var = this.f43919e;
        v0Var.f44037b = true;
        v0Var.c("onPageFinished");
        y0 y0Var = v0Var.M;
        if (y0Var != null) {
            y0Var.O(str, true);
        } else {
            v0Var.c("onPageFinished: no container");
        }
        if (!this.f43918c) {
            v0Var.J = true;
            String readRes = AndroidUtilities.readRes(R.raw.webview_ext);
            v0Var.d(readRes.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            v0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            v0Var.J = true;
            String readRes2 = AndroidUtilities.readRes(R.raw.webview_app_ext);
            v0Var.d(readRes2.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        v0.a(v0Var);
        y0 y0Var2 = v0Var.M;
        if (y0Var2 != null) {
            if (!v0Var.A) {
                v0Var.getUrl();
            }
            y0Var2.F(!v0Var.canGoBack(), !v0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.k0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            v0 v0Var = this.f43919e;
            v0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
            if (v0Var.M != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.f43917b);
                v0Var.f44042r = null;
                v0Var.f44043s = false;
                v0Var.v = false;
                v0Var.I = false;
                v0Var.F = false;
                v0Var.f44041n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? v0Var.getUrl() : webResourceRequest.getUrl().toString();
                y0 y0Var = v0Var.M;
                v0Var.G = null;
                y0Var.E();
                y0 y0Var2 = v0Var.M;
                v0Var.K = null;
                y0Var2.getClass();
                y0 y0Var3 = v0Var.M;
                v0Var.h = true;
                webResourceError.getErrorCode();
                y0Var3.A(webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null, true);
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
        v0 v0Var = this.f43919e;
        v0Var.c(sb3);
        if (v0Var.M != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.f43917b);
                v0Var.f44042r = null;
                v0Var.f44043s = false;
                v0Var.v = false;
                v0Var.I = false;
                v0Var.F = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = v0Var.getUrl();
                }
                v0Var.f44041n = url2;
                y0 y0Var = v0Var.M;
                v0Var.G = null;
                y0Var.E();
                y0 y0Var2 = v0Var.M;
                v0Var.K = null;
                y0Var2.getClass();
                y0 y0Var3 = v0Var.M;
                v0Var.h = true;
                webResourceResponse.getStatusCode();
                y0Var3.A(webResourceResponse.getReasonPhrase(), true);
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
        this.f43919e.c(sb2.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        b6 b6Var;
        Integer valueOf;
        Boolean valueOf2;
        int i9 = Build.VERSION.SDK_INT;
        v0 v0Var = this.f43919e;
        if (i9 >= 26) {
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
            if (!AndroidUtilities.isSafeToShow(v0Var.getContext())) {
                return true;
            }
            Context context = v0Var.getContext();
            y0 y0Var = v0Var.M;
            if (y0Var == null) {
                b6Var = null;
            } else {
                b6Var = y0Var.f44077e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new j0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f22702a.setOnDismissListener(new eh.l(this, 7));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        HttpURLConnection httpURLConnection;
        int i9;
        StringBuilder sb2 = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection2 = null;
        sb2.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb3 = sb2.toString();
        v0 v0Var = this.f43919e;
        v0Var.c(sb3);
        if (webResourceRequest != null && y0.o(webResourceRequest.getUrl())) {
            v0Var.c("proxying ton");
            this.f43916a = false;
            return y0.I(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f43918c && v0Var.f44040f != null && this.f43916a) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
            } catch (Exception e10) {
                e = e10;
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
                        if (!v0Var.A && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it2 = next.getValue().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                    v0Var.c("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    v0Var.A = true;
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
                    for (i9 = 1; i9 < split.length; i9++) {
                        if (split[i9].startsWith("charset=")) {
                            contentEncoding = split[i9].substring(8);
                        }
                    }
                }
                this.f43916a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e11) {
                e = e11;
                httpURLConnection2 = httpURLConnection;
                FileLog.e(e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.f43916a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.f43916a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        e0 e0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            v0 v0Var = this.f43919e;
            if (startsWith) {
                if (v0Var.f44040f != null) {
                    e0 e0Var2 = v0Var.M.f44074c;
                    if (e0Var2 != null) {
                        e0Var2.j();
                    } else {
                        Runnable runnable = v0Var.O;
                        if (runnable != null) {
                            runnable.run();
                            v0Var.O = null;
                        }
                    }
                }
                ve.e.s(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.f43918c;
            if (!z10) {
                if (ve.e.l(context, str, true)) {
                    v0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!v0Var.f44037b && !v0Var.canGoBack()) {
                        e0 e0Var3 = v0Var.M.f44074c;
                        if (e0Var3 != null) {
                            e0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = v0Var.O;
                        if (runnable2 != null) {
                            runnable2.run();
                            v0Var.O = null;
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
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    v0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    ve.e.p(v0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (v0Var.M != null && ve.e.f(parse, false, null)) {
                if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (MessagesController.getInstance(v0Var.M.I).webAppAllowedProtocols != null && MessagesController.getInstance(v0Var.M.I).webAppAllowedProtocols.contains(parse.getScheme())) {
                        if (v0Var.f44040f != null) {
                            e0 e0Var4 = v0Var.M.f44074c;
                            if (e0Var4 != null) {
                                e0Var4.j();
                            } else {
                                Runnable runnable3 = v0Var.O;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    v0Var.O = null;
                                }
                            }
                            y0 y0Var = v0Var.f44040f.M;
                            if (y0Var != null && (e0Var = y0Var.f44074c) != null) {
                                e0Var.b();
                            }
                        }
                        y0 y0Var2 = v0Var.M;
                        y0Var2.D(parse, null, !y0Var2.f44085k0, false, false);
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
    public final void onReceivedError(WebView webView, int i9, String str, String str2) {
        v0 v0Var = this.f43919e;
        v0Var.c("onReceivedError: " + i9 + " " + str + " url=" + str2);
        if (Build.VERSION.SDK_INT < 23 && v0Var.M != null) {
            AndroidUtilities.cancelRunOnUIThread(this.f43917b);
            v0Var.f44042r = null;
            v0Var.f44043s = false;
            v0Var.v = false;
            v0Var.I = false;
            v0Var.F = false;
            v0Var.f44041n = v0Var.getUrl();
            y0 y0Var = v0Var.M;
            v0Var.G = null;
            y0Var.E();
            y0 y0Var2 = v0Var.M;
            v0Var.K = null;
            y0Var2.getClass();
            y0 y0Var3 = v0Var.M;
            v0Var.h = true;
            y0Var3.A(str, true);
        }
        super.onReceivedError(webView, i9, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        v0 v0Var = this.f43919e;
        v0Var.c("shouldInterceptRequest " + str);
        boolean z10 = y0.I0;
        if (str != null && y0.o(Uri.parse(str))) {
            v0Var.c("proxying ton");
            return y0.I("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
