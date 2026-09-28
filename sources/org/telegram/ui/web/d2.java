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
    public boolean f39048a = true;
    public boolean f39049b;
    public final InputStream f39050c;
    public final i2 d;

    public d2(i2 i2Var, InputStream inputStream) {
        this.d = i2Var;
        this.f39050c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        k1 k1Var;
        String str2;
        InputStream a2;
        String str3;
        k1 k1Var2;
        if (this.f39048a) {
            this.f39048a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a4.a.q("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        i2 i2Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f39049b) {
                oi.f fVar = i2Var.f39105b;
                if (fVar != null) {
                    k1Var2 = (k1) ((ArrayList) fVar.f15760b).get(0);
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
                this.f39049b = true;
                a2 = this.f39050c;
            }
        } else {
            oi.f fVar2 = i2Var.f39105b;
            if (fVar2 != null) {
                k1Var = (k1) ((HashMap) fVar2.f15761c).get(str);
            } else {
                k1Var = null;
            }
            if (k1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            l1 l1Var = (l1) k1Var.f39127a.get("content-type");
            if (l1Var == null) {
                str2 = null;
            } else {
                str2 = l1Var.f39137a;
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
