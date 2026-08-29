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
public final class a2 extends WebViewClient {
    public boolean f43978a = true;
    public boolean f43979b;
    public final InputStream f43980c;
    public final f2 d;

    public a2(f2 f2Var, InputStream inputStream) {
        this.d = f2Var;
        this.f43980c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        h1 h1Var;
        String str2;
        InputStream a2;
        String str3;
        h1 h1Var2;
        if (this.f43978a) {
            this.f43978a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a4.w.n("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        f2 f2Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f43979b) {
                com.google.firebase.messaging.s sVar = f2Var.f44035b;
                if (sVar != null) {
                    h1Var2 = (h1) ((ArrayList) sVar.f5186c).get(0);
                } else {
                    h1Var2 = null;
                }
                if (h1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = h1Var2.a();
                } catch (IOException e10) {
                    FileLog.e(e10);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f43979b = true;
                a2 = this.f43980c;
            }
        } else {
            com.google.firebase.messaging.s sVar2 = f2Var.f44035b;
            if (sVar2 != null) {
                h1Var = (h1) ((HashMap) sVar2.d).get(str);
            } else {
                h1Var = null;
            }
            if (h1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            i1 i1Var = (i1) h1Var.f44048a.get("content-type");
            if (i1Var == null) {
                str2 = null;
            } else {
                str2 = i1Var.f44066a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = h1Var.a();
                str3 = str2;
            } catch (IOException e11) {
                FileLog.e(e11);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a2);
    }
}
