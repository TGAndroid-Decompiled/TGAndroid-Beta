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
    public boolean f42196a = true;
    public boolean f42197b;
    public final InputStream f42198c;
    public final j2 d;

    public e2(j2 j2Var, InputStream inputStream) {
        this.d = j2Var;
        this.f42198c = inputStream;
    }

    @Override
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        l1 l1Var;
        String str2;
        InputStream a2;
        String str3;
        l1 l1Var2;
        if (this.f42196a) {
            this.f42196a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a4.a.q("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        j2 j2Var = this.d;
        if (str != null && str.endsWith("/index.html")) {
            str3 = "application/octet-stream";
            if (this.f42197b) {
                qi.f fVar = j2Var.f42261b;
                if (fVar != null) {
                    l1Var2 = (l1) ((ArrayList) fVar.f45542b).get(0);
                } else {
                    l1Var2 = null;
                }
                if (l1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = l1Var2.a();
                } catch (IOException e7) {
                    FileLog.e(e7);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.f42197b = true;
                a2 = this.f42198c;
            }
        } else {
            qi.f fVar2 = j2Var.f42261b;
            if (fVar2 != null) {
                l1Var = (l1) ((HashMap) fVar2.f45543c).get(str);
            } else {
                l1Var = null;
            }
            if (l1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            m1 m1Var = (m1) l1Var.f42283a.get("content-type");
            if (m1Var == null) {
                str2 = null;
            } else {
                str2 = m1Var.f42292a;
            }
            if (!"text/html".equalsIgnoreCase(str2) && !"text/css".equalsIgnoreCase(str2)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = l1Var.a();
                str3 = str2;
            } catch (IOException e10) {
                FileLog.e(e10);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        }
        return new WebResourceResponse(str3, null, a2);
    }
}
