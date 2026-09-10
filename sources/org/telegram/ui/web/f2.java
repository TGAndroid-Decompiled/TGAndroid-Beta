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
public final class f2 extends WebViewClient {
    public boolean f37935a = true;
    public boolean f37936b;
    public final InputStream f37937c;
    public final k2 d;

    public f2(k2 k2Var, InputStream inputStream) {
        this.d = k2Var;
        this.f37937c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        l1 l1Var;
        String str2;
        InputStream a2;
        String str3;
        l1 l1Var2;
        if (this.f37935a) {
            this.f37935a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a4.a.p("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        k2 k2Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f37936b) {
                ki.f fVar = k2Var.f37995b;
                if (fVar != null) {
                    l1Var2 = (l1) ((ArrayList) fVar.f12539b).get(0);
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
                this.f37936b = true;
                a2 = this.f37937c;
            }
        } else {
            ki.f fVar2 = k2Var.f37995b;
            if (fVar2 != null) {
                l1Var = (l1) ((HashMap) fVar2.f12540c).get(str);
            } else {
                l1Var = null;
            }
            if (l1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            m1 m1Var = (m1) l1Var.f38008a.get("content-type");
            if (m1Var == null) {
                str2 = null;
            } else {
                str2 = m1Var.f38017a;
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
