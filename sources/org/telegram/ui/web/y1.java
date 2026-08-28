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
public final class y1 extends WebViewClient {
    public boolean f44106a = true;
    public boolean f44107b;
    public final InputStream f44108c;
    public final d2 d;

    public y1(d2 d2Var, InputStream inputStream) {
        this.d = d2Var;
        this.f44108c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        g1 g1Var;
        String str2;
        InputStream a2;
        String str3;
        g1 g1Var2;
        if (this.f44106a) {
            this.f44106a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(aa.d.o("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        d2 d2Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f44107b) {
                com.google.firebase.messaging.t tVar = d2Var.f43838b;
                if (tVar != null) {
                    g1Var2 = (g1) ((ArrayList) tVar.f4178c).get(0);
                } else {
                    g1Var2 = null;
                }
                if (g1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = g1Var2.a();
                } catch (IOException e10) {
                    FileLog.e(e10);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f44107b = true;
                a2 = this.f44108c;
            }
        } else {
            com.google.firebase.messaging.t tVar2 = d2Var.f43838b;
            if (tVar2 != null) {
                g1Var = (g1) ((HashMap) tVar2.d).get(str);
            } else {
                g1Var = null;
            }
            if (g1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            h1 h1Var = (h1) g1Var.f43861a.get("content-type");
            if (h1Var == null) {
                str2 = null;
            } else {
                str2 = h1Var.f43877a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = g1Var.a();
                str3 = str2;
            } catch (IOException e11) {
                FileLog.e(e11);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a2);
    }
}
