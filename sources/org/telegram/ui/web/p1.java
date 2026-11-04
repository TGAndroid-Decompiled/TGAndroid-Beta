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
import org.telegram.messenger.r2;
public final class p1 extends WebViewClient {
    public boolean f50987a = true;
    public boolean f50988b;
    public final InputStream f50989c;
    public final u1 d;

    public p1(u1 u1Var, InputStream inputStream) {
        this.d = u1Var;
        this.f50989c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        b1 b1Var;
        String str2;
        InputStream a10;
        String str3;
        b1 b1Var2;
        if (this.f50987a) {
            this.f50987a = false;
            String y22 = org.telegram.messenger.g0.y2(null, 2131624068);
            boolean z10 = r2.f25040a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a1.g.q("<script>\n", y22.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        u1 u1Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f50988b) {
                za.p pVar = u1Var.f51047b;
                if (pVar != null) {
                    b1Var2 = (b1) ((ArrayList) pVar.f60312b).get(0);
                } else {
                    b1Var2 = null;
                }
                if (b1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a10 = b1Var2.a();
                } catch (IOException e10) {
                    a8.g(e10, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f50988b = true;
                a10 = this.f50989c;
            }
        } else {
            za.p pVar2 = u1Var.f51047b;
            if (pVar2 != null) {
                b1Var = (b1) ((HashMap) pVar2.f60313c).get(str);
            } else {
                b1Var = null;
            }
            if (b1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            c1 c1Var = (c1) b1Var.f50818a.get("content-type");
            if (c1Var == null) {
                str2 = null;
            } else {
                str2 = c1Var.f50824a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a10 = b1Var.a();
                str3 = str2;
            } catch (IOException e11) {
                a8.g(e11, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a10);
    }
}
