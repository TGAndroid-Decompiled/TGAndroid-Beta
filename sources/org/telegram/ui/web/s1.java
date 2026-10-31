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
import org.telegram.messenger.f8;
import org.telegram.messenger.v2;
public final class s1 extends WebViewClient {
    public boolean f43190a = true;
    public boolean f43191b;
    public final InputStream f43192c;
    public final y1 d;

    public s1(y1 y1Var, InputStream inputStream) {
        this.d = y1Var;
        this.f43192c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        e1 e1Var;
        String str2;
        InputStream a2;
        String str3;
        e1 e1Var2;
        if (this.f43190a) {
            this.f43190a = false;
            String y22 = org.telegram.messenger.i0.y2(null, 2131624067);
            boolean z10 = v2.f18448a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a1.g.n("<script>\n", y22.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        y1 y1Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f43191b) {
                xa.n nVar = y1Var.f43252b;
                if (nVar != null) {
                    e1Var2 = (e1) ((ArrayList) nVar.f53555b).get(0);
                } else {
                    e1Var2 = null;
                }
                if (e1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = e1Var2.a();
                } catch (IOException e) {
                    f8.g(e, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f43191b = true;
                a2 = this.f43192c;
            }
        } else {
            xa.n nVar2 = y1Var.f43252b;
            if (nVar2 != null) {
                e1Var = (e1) ((HashMap) nVar2.f53556c).get(str);
            } else {
                e1Var = null;
            }
            if (e1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            f1 f1Var = (f1) e1Var.f43024a.get("content-type");
            if (f1Var == null) {
                str2 = null;
            } else {
                str2 = f1Var.f43031a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = e1Var.a();
                str3 = str2;
            } catch (IOException e7) {
                f8.g(e7, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a2);
    }
}
