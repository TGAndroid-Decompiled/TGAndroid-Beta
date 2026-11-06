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
public final class s1 extends WebViewClient {
    public boolean f51303a = true;
    public boolean f51304b;
    public final InputStream f51305c;
    public final x1 d;

    public s1(x1 x1Var, InputStream inputStream) {
        this.d = x1Var;
        this.f51305c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        d1 d1Var;
        String str2;
        InputStream a10;
        String str3;
        d1 d1Var2;
        if (this.f51303a) {
            this.f51303a = false;
            String y22 = org.telegram.messenger.g0.y2(null, 2131624068);
            boolean z9 = r2.f25191a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a8.p0.p("<script>\n", y22.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        x1 x1Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f51304b) {
                ab.b0 b0Var = x1Var.f51397b;
                if (b0Var != null) {
                    d1Var2 = (d1) ((ArrayList) b0Var.f908c).get(0);
                } else {
                    d1Var2 = null;
                }
                if (d1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a10 = d1Var2.a();
                } catch (IOException e10) {
                    a8.g(e10, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f51304b = true;
                a10 = this.f51305c;
            }
        } else {
            ab.b0 b0Var2 = x1Var.f51397b;
            if (b0Var2 != null) {
                d1Var = (d1) ((HashMap) b0Var2.d).get(str);
            } else {
                d1Var = null;
            }
            if (d1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            e1 e1Var = (e1) d1Var.f51118a.get("content-type");
            if (e1Var == null) {
                str2 = null;
            } else {
                str2 = e1Var.f51125a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a10 = d1Var.a();
                str3 = str2;
            } catch (IOException e11) {
                a8.g(e11, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a10);
    }
}
