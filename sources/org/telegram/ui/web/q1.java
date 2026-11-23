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
import org.telegram.messenger.a8;
import org.telegram.messenger.s2;
public final class q1 extends WebViewClient {
    public boolean f53249a = true;
    public boolean f53250b;
    public final InputStream f53251c;
    public final v1 d;

    public q1(v1 v1Var, InputStream inputStream) {
        this.d = v1Var;
        this.f53251c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        a1 a1Var;
        String str2;
        InputStream a10;
        String str3;
        a1 a1Var2;
        if (this.f53249a) {
            this.f53249a = false;
            String y22 = org.telegram.messenger.g0.y2(null, 2131624069);
            boolean z10 = s2.f26694a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a8.p0.p("<script>\n", y22.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        v1 v1Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f53250b) {
                xi.e eVar = v1Var.f53344b;
                if (eVar != null) {
                    a1Var2 = (a1) ((ArrayList) eVar.f60632b).get(0);
                } else {
                    a1Var2 = null;
                }
                if (a1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a10 = a1Var2.a();
                } catch (IOException e10) {
                    a8.g(e10, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f53250b = true;
                a10 = this.f53251c;
            }
        } else {
            xi.e eVar2 = v1Var.f53344b;
            if (eVar2 != null) {
                a1Var = (a1) ((HashMap) eVar2.f60633c).get(str);
            } else {
                a1Var = null;
            }
            if (a1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            b1 b1Var = (b1) a1Var.f53064a.get("content-type");
            if (b1Var == null) {
                str2 = null;
            } else {
                str2 = b1Var.f53073a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a10 = a1Var.a();
                str3 = str2;
            } catch (IOException e11) {
                a8.g(e11, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a10);
    }
}
