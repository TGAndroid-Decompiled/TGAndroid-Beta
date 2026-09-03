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
import org.telegram.ui.ActionBar.g6;
public final class l0 extends WebViewClient {
    public boolean f42584a = true;
    public final k0 f42585b = new k0(this, 0);
    public final boolean f42586c;
    public final Context d;
    public final x0 f42587e;

    public l0(x0 x0Var, boolean z4, Context context) {
        this.f42587e = x0Var;
        this.f42586c = z4;
        this.d = context;
    }

    @Override
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z4) {
        b1 b1Var;
        boolean z10 = this.f42586c;
        x0 x0Var = this.f42587e;
        if (!z10 && ((b1Var = x0Var.f42725e) == null || !TextUtils.equals(b1Var.f42474c, str))) {
            ?? tLObject = new TLObject();
            x0Var.f42725e = tLObject;
            tLObject.f42472a = Utilities.fastRandom.nextLong();
            x0Var.f42725e.f42473b = System.currentTimeMillis();
            x0Var.f42725e.f42474c = a1.s(x0Var.getUrl());
            x0Var.f42725e.d = l2.a(x0Var);
            c1.c(x0Var.f42725e);
        }
        x0Var.c("doUpdateVisitedHistory " + str + " " + z4);
        a1 a1Var = x0Var.N;
        if (a1Var != null) {
            a1Var.F(!x0Var.canGoBack(), !x0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z4);
    }

    @Override
    public final void onPageCommitVisible(WebView webView, String str) {
        x0 x0Var = this.f42587e;
        x0Var.c("onPageCommitVisible " + str);
        if (!this.f42586c) {
            x0Var.K = true;
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            x0Var.K = true;
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override
    public final void onPageFinished(WebView webView, String str) {
        x0 x0Var = this.f42587e;
        x0Var.f42723b = true;
        x0Var.c("onPageFinished");
        a1 a1Var = x0Var.N;
        if (a1Var != null) {
            a1Var.O(str, true);
        } else {
            x0Var.c("onPageFinished: no container");
        }
        if (!this.f42586c) {
            x0Var.K = true;
            String readRes = AndroidUtilities.readRes(R.raw.webview_ext);
            x0Var.d(readRes.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        } else {
            x0Var.K = true;
            String readRes2 = AndroidUtilities.readRes(R.raw.webview_app_ext);
            x0Var.d(readRes2.replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        }
        x0.a(x0Var);
        a1 a1Var2 = x0Var.N;
        if (a1Var2 != null) {
            if (!x0Var.B) {
                x0Var.getUrl();
            }
            a1Var2.F(!x0Var.canGoBack(), !x0Var.canGoForward());
        }
    }

    @Override
    public final void onPageStarted(android.webkit.WebView r7, java.lang.String r8, android.graphics.Bitmap r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.l0.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }

    @Override
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            x0 x0Var = this.f42587e;
            x0Var.c("onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription()));
            if (x0Var.N != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.f42585b);
                x0Var.f42728r = null;
                x0Var.f42729s = false;
                x0Var.v = false;
                x0Var.J = false;
                x0Var.G = false;
                x0Var.f42727n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? x0Var.getUrl() : webResourceRequest.getUrl().toString();
                a1 a1Var = x0Var.N;
                x0Var.H = null;
                a1Var.E();
                a1 a1Var2 = x0Var.N;
                x0Var.L = null;
                a1Var2.getClass();
                a1 a1Var3 = x0Var.N;
                x0Var.h = true;
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
        x0 x0Var = this.f42587e;
        x0Var.c(sb2);
        if (x0Var.N != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.f42585b);
                x0Var.f42728r = null;
                x0Var.f42729s = false;
                x0Var.v = false;
                x0Var.J = false;
                x0Var.G = false;
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    url2 = webResourceRequest.getUrl().toString();
                } else {
                    url2 = x0Var.getUrl();
                }
                x0Var.f42727n = url2;
                a1 a1Var = x0Var.N;
                x0Var.H = null;
                a1Var.E();
                a1 a1Var2 = x0Var.N;
                x0Var.L = null;
                a1Var2.getClass();
                a1 a1Var3 = x0Var.N;
                x0Var.h = true;
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
        this.f42587e.c(sb.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        g6 g6Var;
        Integer valueOf;
        Boolean valueOf2;
        int i10 = Build.VERSION.SDK_INT;
        x0 x0Var = this.f42587e;
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
            x0Var.c(sb.toString());
        } else {
            x0Var.c("onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(x0Var.getContext())) {
                return true;
            }
            Context context = x0Var.getContext();
            a1 a1Var = x0Var.N;
            if (a1Var == null) {
                g6Var = null;
            } else {
                g6Var = a1Var.f42436e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
            alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f21168a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new k0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f21168a.setOnDismissListener(new fg.d0(this, 9));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e6) {
            FileLog.e(e6);
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
        x0 x0Var = this.f42587e;
        x0Var.c(sb2);
        if (webResourceRequest != null && a1.o(webResourceRequest.getUrl())) {
            x0Var.c("proxying ton");
            this.f42584a = false;
            return a1.I(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.f42586c && x0Var.f42726f != null && this.f42584a) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
            } catch (Exception e6) {
                e = e6;
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
                        if (!x0Var.B && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it2 = next.getValue().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                    x0Var.c("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    x0Var.B = true;
                                    AndroidUtilities.runOnUIThread(new k0(this, 1));
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
                this.f42584a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e10) {
                e = e10;
                httpURLConnection2 = httpURLConnection;
                FileLog.e(e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.f42584a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.f42584a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f0 f0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            x0 x0Var = this.f42587e;
            if (startsWith) {
                if (x0Var.f42726f != null) {
                    f0 f0Var2 = x0Var.N.f42433c;
                    if (f0Var2 != null) {
                        f0Var2.j();
                    } else {
                        Runnable runnable = x0Var.P;
                        if (runnable != null) {
                            runnable.run();
                            x0Var.P = null;
                        }
                    }
                }
                af.g.s(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z4 = this.f42586c;
            if (!z4) {
                if (af.g.l(context, str, true)) {
                    x0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!x0Var.f42723b && !x0Var.canGoBack()) {
                        f0 f0Var3 = x0Var.N.f42433c;
                        if (f0Var3 != null) {
                            f0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = x0Var.P;
                        if (runnable2 != null) {
                            runnable2.run();
                            x0Var.P = null;
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
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    x0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    af.g.p(x0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (x0Var.N != null && af.g.f(parse, false, null)) {
                if (z4 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                    if (MessagesController.getInstance(x0Var.N.J).webAppAllowedProtocols != null && MessagesController.getInstance(x0Var.N.J).webAppAllowedProtocols.contains(parse.getScheme())) {
                        if (x0Var.f42726f != null) {
                            f0 f0Var4 = x0Var.N.f42433c;
                            if (f0Var4 != null) {
                                f0Var4.j();
                            } else {
                                Runnable runnable3 = x0Var.P;
                                if (runnable3 != null) {
                                    runnable3.run();
                                    x0Var.P = null;
                                }
                            }
                            a1 a1Var = x0Var.f42726f.N;
                            if (a1Var != null && (f0Var = a1Var.f42433c) != null) {
                                f0Var.b();
                            }
                        }
                        a1 a1Var2 = x0Var.N;
                        a1Var2.D(parse, null, !a1Var2.f42445l0, false, false);
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
        x0 x0Var = this.f42587e;
        x0Var.c("onReceivedError: " + i10 + " " + str + " url=" + str2);
        if (Build.VERSION.SDK_INT < 23 && x0Var.N != null) {
            AndroidUtilities.cancelRunOnUIThread(this.f42585b);
            x0Var.f42728r = null;
            x0Var.f42729s = false;
            x0Var.v = false;
            x0Var.J = false;
            x0Var.G = false;
            x0Var.f42727n = x0Var.getUrl();
            a1 a1Var = x0Var.N;
            x0Var.H = null;
            a1Var.E();
            a1 a1Var2 = x0Var.N;
            x0Var.L = null;
            a1Var2.getClass();
            a1 a1Var3 = x0Var.N;
            x0Var.h = true;
            a1Var3.A(str, true);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        x0 x0Var = this.f42587e;
        x0Var.c("shouldInterceptRequest " + str);
        boolean z4 = a1.J0;
        if (str != null && a1.o(Uri.parse(str))) {
            x0Var.c("proxying ton");
            return a1.I("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
