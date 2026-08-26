package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.mlkit_language_id_common.zzij;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.LaunchActivity;

public final class WebInstantView$$ExternalSyntheticLambda0 implements Utilities.Callback {
    public final int $r8$classId;
    public final Timer.Task f$0;
    public final boolean[] f$1;
    public final Timer f$2;
    public final WebInstantView f$3;
    public final Utilities.Callback f$4;

    public WebInstantView$$ExternalSyntheticLambda0(Timer.Task task, boolean[] zArr, Timer timer, WebInstantView webInstantView, Utilities.Callback callback, int i) {
        this.$r8$classId = i;
        this.f$0 = task;
        this.f$1 = zArr;
        this.f$2 = timer;
        this.f$3 = webInstantView;
        this.f$4 = callback;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Timer.Task task = this.f$0;
                boolean[] zArr = this.f$1;
                Timer timer = this.f$2;
                final WebInstantView webInstantView = this.f$3;
                Utilities.Callback callback = this.f$4;
                final InputStream inputStream = (InputStream) obj;
                Timer.done(task);
                if (!zArr[0]) {
                    Timer.Task taskStart = Timer.start(timer, "readHTML");
                    String str = webInstantView.url;
                    final WebInstantView$$ExternalSyntheticLambda0 webInstantView$$ExternalSyntheticLambda0 = new WebInstantView$$ExternalSyntheticLambda0(taskStart, zArr, timer, webInstantView, callback, 1);
                    if (inputStream != null) {
                        Context context = LaunchActivity.instance;
                        if (context == null) {
                            context = ApplicationLoader.applicationContext;
                        }
                        Activity activityFindActivity = AndroidUtilities.findActivity(context);
                        if (activityFindActivity != null) {
                            View rootView = activityFindActivity.findViewById(16908290).getRootView();
                            if (!(rootView instanceof ViewGroup)) {
                                webInstantView$$ExternalSyntheticLambda0.run(null);
                            } else {
                                final WebInstantView.AnonymousClass1 anonymousClass1 = new WebInstantView.AnonymousClass1(context);
                                ((ViewGroup) rootView).addView(anonymousClass1);
                                final WebView webView = new WebView(context);
                                WebSettings settings = webView.getSettings();
                                settings.setAllowContentAccess(false);
                                settings.setDatabaseEnabled(false);
                                settings.setAllowFileAccess(false);
                                settings.setJavaScriptEnabled(true);
                                settings.setSaveFormData(false);
                                settings.setGeolocationEnabled(false);
                                settings.setDomStorageEnabled(false);
                                settings.setAllowFileAccessFromFileURLs(false);
                                settings.setAllowUniversalAccessFromFileURLs(false);
                                webView.setWebViewClient(new WebViewClient() {
                                    public boolean firstLoad = true;
                                    public boolean streamLoaded;
                                    public final InputStream val$stream;

                                    public AnonymousClass2() {
                                        inputStream = inputStream;
                                    }

                                    @Override
                                    public final WebResourceResponse shouldInterceptRequest(WebView webView2, String str2) {
                                        InputStream inputStream2;
                                        String str3;
                                        if (this.firstLoad) {
                                            this.firstLoad = false;
                                            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(zzij.m("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
                                        }
                                        WebInstantView webInstantView2 = WebInstantView.this;
                                        if (str2 == null || !str2.endsWith("/index.html")) {
                                            MHTML mhtml = webInstantView2.mhtml;
                                            MHTML.Entry entry = mhtml != null ? (MHTML.Entry) ((HashMap) mhtml.entriesByLocation).get(str2) : null;
                                            if (entry == null) {
                                                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                                            }
                                            MHTML.HeaderValue headerValue = (MHTML.HeaderValue) entry.headers.get("content-type");
                                            String str4 = headerValue == null ? null : headerValue.value;
                                            if (!"text/html".equalsIgnoreCase(str4) && !"text/css".equalsIgnoreCase(str4)) {
                                                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                                            }
                                            try {
                                                inputStream2 = entry.getInputStream();
                                                str3 = str4;
                                            } catch (IOException e) {
                                                FileLog.e(e);
                                                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                                            }
                                        } else {
                                            str3 = "application/octet-stream";
                                            if (this.streamLoaded) {
                                                MHTML mhtml2 = webInstantView2.mhtml;
                                                MHTML.Entry entry2 = mhtml2 != null ? (MHTML.Entry) ((ArrayList) mhtml2.entries).get(0) : null;
                                                if (entry2 == null) {
                                                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                                                }
                                                try {
                                                    inputStream2 = entry2.getInputStream();
                                                } catch (IOException e2) {
                                                    FileLog.e(e2);
                                                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                                                }
                                            } else {
                                                this.streamLoaded = true;
                                                inputStream2 = inputStream;
                                            }
                                        }
                                        return new WebResourceResponse(str3, null, inputStream2);
                                    }
                                });
                                webView.setWebChromeClient(new WebInstantView.AnonymousClass3());
                                anonymousClass1.addView(webView, LayoutHelper.createFrame(-1.0f, -1));
                                final boolean[] zArr2 = {false};
                                webView.addJavascriptInterface(new Object() {
                                    public final boolean[] val$done;
                                    public final WebView val$webView;
                                    public final AnonymousClass1 val$webViewContainer;
                                    public final WebInstantView$$ExternalSyntheticLambda0 val$whenDone;

                                    public AnonymousClass4() {
                                        zArr = zArr2;
                                        webView = webView;
                                        anonymousClass1 = anonymousClass1;
                                        webInstantView$$ExternalSyntheticLambda0 = webInstantView$$ExternalSyntheticLambda0;
                                    }

                                    @JavascriptInterface
                                    public void done(String str2) {
                                        AndroidUtilities.runOnUIThread(new WebInstantView$4$$ExternalSyntheticLambda0(zArr, webView, anonymousClass1, str2, webInstantView$$ExternalSyntheticLambda0, 0));
                                    }
                                }, "Instant");
                                webView.loadUrl(str);
                            }
                        } else {
                            webInstantView$$ExternalSyntheticLambda0.run(null);
                        }
                    } else {
                        webInstantView$$ExternalSyntheticLambda0.run(null);
                    }
                    break;
                }
                break;
            default:
                WebInstantView webInstantView2 = this.f$3;
                JSONObject jSONObject = (JSONObject) obj;
                Timer.done(this.f$0);
                if (!this.f$1[0]) {
                    Timer timer2 = this.f$2;
                    Timer.Task taskStart2 = Timer.start(timer2, "parseJSON");
                    try {
                        webInstantView2.webpage = webInstantView2.parseJSON(webInstantView2.url, jSONObject);
                    } catch (Exception e) {
                        Timer.log(timer2, "error: " + e);
                        FileLog.e(e);
                    }
                    Timer.done(taskStart2);
                    this.f$4.run(webInstantView2);
                    TLRPC.TL_webPage tL_webPage = webInstantView2.webpage;
                    if (tL_webPage != null) {
                        WebInstantView.instants.put(tL_webPage, webInstantView2);
                    }
                    Timer.finish(timer2);
                    break;
                }
                break;
        }
    }
}
