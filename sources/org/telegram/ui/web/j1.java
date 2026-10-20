package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class j1 {
    public final HashMap f42688a = new HashMap();
    public File f42689b;
    public long f42690c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new i1(this.f42690c, this.d, this.f42689b));
        HashMap hashMap = this.f42688a;
        k1 k1Var = (k1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (k1Var == null) {
            str = null;
        } else {
            str = k1Var.f42705a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        k1 k1Var2 = (k1) hashMap.get("content-transfer-encoding");
        if (k1Var2 != null) {
            str2 = k1Var2.f42705a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new l1(bufferedInputStream, 0);
        }
        return bufferedInputStream;
    }
}
