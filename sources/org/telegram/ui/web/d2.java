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
    public boolean f38998a = true;
    public boolean f38999b;
    public final InputStream f39000c;
    public final j2 d;

    public d2(j2 j2Var, InputStream inputStream) {
        this.d = j2Var;
        this.f39000c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        l1 l1Var;
        String str2;
        InputStream a2;
        String str3;
        l1 l1Var2;
        if (this.f38998a) {
            this.f38998a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a4.a.p("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        j2 j2Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f38999b) {
                pi.f fVar = j2Var.f39068b;
                if (fVar != null) {
                    l1Var2 = (l1) ((ArrayList) fVar.f41366b).get(0);
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
                this.f38999b = true;
                a2 = this.f39000c;
            }
        } else {
            pi.f fVar2 = j2Var.f39068b;
            if (fVar2 != null) {
                l1Var = (l1) ((HashMap) fVar2.f41367c).get(str);
            } else {
                l1Var = null;
            }
            if (l1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            m1 m1Var = (m1) l1Var.f39089a.get("content-type");
            if (m1Var == null) {
                str2 = null;
            } else {
                str2 = m1Var.f39098a;
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
