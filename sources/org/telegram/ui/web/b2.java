package org.telegram.ui.web;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class b2 extends WebViewClient {
    public boolean f39462a = true;
    public boolean f39463b;
    public final InputStream f39464c;
    public final g2 d;

    public b2(g2 g2Var, InputStream inputStream) {
        this.d = g2Var;
        this.f39464c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        i1 i1Var;
        String str2;
        InputStream a2;
        String str3;
        i1 i1Var2;
        if (this.f39462a) {
            this.f39462a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(android.support.v4.media.a.o("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        g2 g2Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f39463b) {
                com.google.firebase.messaging.r rVar = g2Var.f39510b;
                if (rVar != null) {
                    i1Var2 = (i1) ((ArrayList) rVar.f4029c).get(0);
                } else {
                    i1Var2 = null;
                }
                if (i1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = i1Var2.a();
                } catch (IOException e) {
                    FileLog.e(e);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f39463b = true;
                a2 = this.f39464c;
            }
        } else {
            com.google.firebase.messaging.r rVar2 = g2Var.f39510b;
            if (rVar2 != null) {
                i1Var = (i1) ((HashMap) rVar2.d).get(str);
            } else {
                i1Var = null;
            }
            if (i1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            j1 j1Var = (j1) i1Var.f39532a.get("content-type");
            if (j1Var == null) {
                str2 = null;
            } else {
                str2 = j1Var.f39543a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = i1Var.a();
                str3 = str2;
            } catch (IOException e6) {
                FileLog.e(e6);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a2);
    }
}
