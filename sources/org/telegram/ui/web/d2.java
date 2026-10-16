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
public final class d2 extends WebViewClient {
    public boolean f41022a = true;
    public boolean f41023b;
    public final InputStream f41024c;
    public final i2 d;

    public d2(i2 i2Var, InputStream inputStream) {
        this.d = i2Var;
        this.f41024c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        l1 l1Var;
        String str2;
        InputStream a2;
        String str3;
        l1 l1Var2;
        if (this.f41022a) {
            this.f41022a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a1.g.p("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        i2 i2Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f41023b) {
                pi.e eVar = i2Var.f41079b;
                if (eVar != null) {
                    l1Var2 = (l1) ((ArrayList) eVar.f42945b).get(0);
                } else {
                    l1Var2 = null;
                }
                if (l1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = l1Var2.a();
                } catch (IOException e) {
                    FileLog.e(e);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f41023b = true;
                a2 = this.f41024c;
            }
        } else {
            pi.e eVar2 = i2Var.f41079b;
            if (eVar2 != null) {
                l1Var = (l1) ((HashMap) eVar2.f42946c).get(str);
            } else {
                l1Var = null;
            }
            if (l1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            m1 m1Var = (m1) l1Var.f41112a.get("content-type");
            if (m1Var == null) {
                str2 = null;
            } else {
                str2 = m1Var.f41119a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = l1Var.a();
                str3 = str2;
            } catch (IOException e7) {
                FileLog.e(e7);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a2);
    }
}
