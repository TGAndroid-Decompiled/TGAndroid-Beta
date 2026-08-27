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

public final class z1 extends WebViewClient {

    public boolean f44093a = true;

    public boolean f44094b;

    public final InputStream f44095c;
    public final e2 d;

    public z1(e2 e2Var, InputStream inputStream) {
        this.d = e2Var;
        this.f44095c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        InputStream inputStreamA;
        String str2;
        if (this.f44093a) {
            this.f44093a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a9.p.m("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        e2 e2Var = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            com.google.firebase.messaging.t tVar = e2Var.f43825b;
            h1 h1Var = tVar != null ? (h1) ((HashMap) tVar.d).get(str) : null;
            if (h1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            i1 i1Var = (i1) h1Var.f43848a.get("content-type");
            String str3 = i1Var == null ? null : i1Var.f43864a;
            if (!"text/html".equalsIgnoreCase(str3) && !"text/css".equalsIgnoreCase(str3)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                inputStreamA = h1Var.a();
                str2 = str3;
            } catch (IOException e9) {
                FileLog.e(e9);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        } else {
            str2 = "application/octet-stream";
            if (this.f44094b) {
                com.google.firebase.messaging.t tVar2 = e2Var.f43825b;
                h1 h1Var2 = tVar2 != null ? (h1) ((ArrayList) tVar2.f4620c).get(0) : null;
                if (h1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    inputStreamA = h1Var2.a();
                } catch (IOException e10) {
                    FileLog.e(e10);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f44094b = true;
                inputStreamA = this.f44095c;
            }
        }
        return new WebResourceResponse(str2, null, inputStreamA);
    }
}
