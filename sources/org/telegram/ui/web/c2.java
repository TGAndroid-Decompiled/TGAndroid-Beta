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
public final class c2 extends WebViewClient {
    public boolean f41324a = true;
    public boolean f41325b;
    public final InputStream f41326c;
    public final h2 d;

    public c2(h2 h2Var, InputStream inputStream) {
        this.d = h2Var;
        this.f41326c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        k1 k1Var;
        String str2;
        InputStream a2;
        String str3;
        k1 k1Var2;
        if (this.f41324a) {
            this.f41324a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a1.g.p("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        h2 h2Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f41325b) {
                qi.e eVar = h2Var.f41378b;
                if (eVar != null) {
                    k1Var2 = (k1) ((ArrayList) eVar.f43663b).get(0);
                } else {
                    k1Var2 = null;
                }
                if (k1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = k1Var2.a();
                } catch (IOException e) {
                    FileLog.e(e);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f41325b = true;
                a2 = this.f41326c;
            }
        } else {
            qi.e eVar2 = h2Var.f41378b;
            if (eVar2 != null) {
                k1Var = (k1) ((HashMap) eVar2.f43664c).get(str);
            } else {
                k1Var = null;
            }
            if (k1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            l1 l1Var = (l1) k1Var.f41414a.get("content-type");
            if (l1Var == null) {
                str2 = null;
            } else {
                str2 = l1Var.f41421a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = k1Var.a();
                str3 = str2;
            } catch (IOException e7) {
                FileLog.e(e7);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a2);
    }
}
