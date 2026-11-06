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
public final class r1 extends WebViewClient {
    public boolean f51282a = true;
    public boolean f51283b;
    public final InputStream f51284c;
    public final w1 d;

    public r1(w1 w1Var, InputStream inputStream) {
        this.d = w1Var;
        this.f51284c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        c1 c1Var;
        String str2;
        InputStream a10;
        String str3;
        c1 c1Var2;
        if (this.f51282a) {
            this.f51282a = false;
            String y22 = org.telegram.messenger.g0.y2(null, 2131624068);
            boolean z9 = r2.f25191a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a8.p0.p("<script>\n", y22.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        w1 w1Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f51283b) {
                ab.b0 b0Var = w1Var.f51341b;
                if (b0Var != null) {
                    c1Var2 = (c1) ((ArrayList) b0Var.f908c).get(0);
                } else {
                    c1Var2 = null;
                }
                if (c1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a10 = c1Var2.a();
                } catch (IOException e10) {
                    a8.g(e10, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f51283b = true;
                a10 = this.f51284c;
            }
        } else {
            ab.b0 b0Var2 = w1Var.f51341b;
            if (b0Var2 != null) {
                c1Var = (c1) ((HashMap) b0Var2.d).get(str);
            } else {
                c1Var = null;
            }
            if (c1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            d1 d1Var = (d1) c1Var.f51099a.get("content-type");
            if (d1Var == null) {
                str2 = null;
            } else {
                str2 = d1Var.f51106a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a10 = c1Var.a();
                str3 = str2;
            } catch (IOException e11) {
                a8.g(e11, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a10);
    }
}
