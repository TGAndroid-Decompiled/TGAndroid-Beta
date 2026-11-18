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
    public boolean f53238a = true;
    public boolean f53239b;
    public final InputStream f53240c;
    public final v1 d;

    public q1(v1 v1Var, InputStream inputStream) {
        this.d = v1Var;
        this.f53240c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        b1 b1Var;
        String str2;
        InputStream a10;
        String str3;
        b1 b1Var2;
        if (this.f53238a) {
            this.f53238a = false;
            String y22 = org.telegram.messenger.g0.y2(null, 2131624069);
            boolean z10 = s2.f26721a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a8.p0.p("<script>\n", y22.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        v1 v1Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f53239b) {
                xi.e eVar = v1Var.f53333b;
                if (eVar != null) {
                    b1Var2 = (b1) ((ArrayList) eVar.f60622b).get(0);
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
                this.f53239b = true;
                a10 = this.f53240c;
            }
        } else {
            xi.e eVar2 = v1Var.f53333b;
            if (eVar2 != null) {
                b1Var = (b1) ((HashMap) eVar2.f60623c).get(str);
            } else {
                b1Var = null;
            }
            if (b1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            c1 c1Var = (c1) b1Var.f53061a.get("content-type");
            if (c1Var == null) {
                str2 = null;
            } else {
                str2 = c1Var.f53067a;
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
