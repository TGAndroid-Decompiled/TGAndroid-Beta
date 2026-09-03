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
    public boolean f42479a = true;
    public boolean f42480b;
    public final InputStream f42481c;
    public final h2 d;

    public c2(h2 h2Var, InputStream inputStream) {
        this.d = h2Var;
        this.f42481c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        j1 j1Var;
        String str2;
        InputStream a2;
        String str3;
        j1 j1Var2;
        if (this.f42479a) {
            this.f42479a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(android.support.v4.media.a.o("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        h2 h2Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f42480b) {
                com.google.firebase.messaging.s sVar = h2Var.f42542b;
                if (sVar != null) {
                    j1Var2 = (j1) ((ArrayList) sVar.f4081b).get(0);
                } else {
                    j1Var2 = null;
                }
                if (j1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = j1Var2.a();
                } catch (IOException e6) {
                    FileLog.e(e6);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f42480b = true;
                a2 = this.f42481c;
            }
        } else {
            com.google.firebase.messaging.s sVar2 = h2Var.f42542b;
            if (sVar2 != null) {
                j1Var = (j1) ((HashMap) sVar2.f4082c).get(str);
            } else {
                j1Var = null;
            }
            if (j1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            k1 k1Var = (k1) j1Var.f42560a.get("content-type");
            if (k1Var == null) {
                str2 = null;
            } else {
                str2 = k1Var.f42579a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = j1Var.a();
                str3 = str2;
            } catch (IOException e10) {
                FileLog.e(e10);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a2);
    }
}
