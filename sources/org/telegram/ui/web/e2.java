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
public final class e2 extends WebViewClient {
    public boolean f42079a = true;
    public boolean f42080b;
    public final InputStream f42081c;
    public final j2 d;

    public e2(j2 j2Var, InputStream inputStream) {
        this.d = j2Var;
        this.f42081c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        m1 m1Var;
        String str2;
        InputStream a2;
        String str3;
        m1 m1Var2;
        if (this.f42079a) {
            this.f42079a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a4.a.p("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        j2 j2Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f42080b) {
                fg.f fVar = j2Var.f42145b;
                if (fVar != null) {
                    m1Var2 = (m1) ((ArrayList) fVar.f9493b).get(0);
                } else {
                    m1Var2 = null;
                }
                if (m1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = m1Var2.a();
                } catch (IOException e7) {
                    FileLog.e(e7);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f42080b = true;
                a2 = this.f42081c;
            }
        } else {
            fg.f fVar2 = j2Var.f42145b;
            if (fVar2 != null) {
                m1Var = (m1) ((HashMap) fVar2.f9494c).get(str);
            } else {
                m1Var = null;
            }
            if (m1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            n1 n1Var = (n1) m1Var.f42179a.get("content-type");
            if (n1Var == null) {
                str2 = null;
            } else {
                str2 = n1Var.f42186a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = m1Var.a();
                str3 = str2;
            } catch (IOException e10) {
                FileLog.e(e10);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a2);
    }
}
