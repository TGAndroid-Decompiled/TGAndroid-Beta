package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class m1 {
    public final HashMap f42180a = new HashMap();
    public File f42181b;
    public long f42182c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new l1(this.f42181b, this.f42182c, this.d));
        HashMap hashMap = this.f42180a;
        n1 n1Var = (n1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (n1Var == null) {
            str = null;
        } else {
            str = n1Var.f42187a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        n1 n1Var2 = (n1) hashMap.get("content-transfer-encoding");
        if (n1Var2 != null) {
            str2 = n1Var2.f42187a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new o1(bufferedInputStream);
        }
        return bufferedInputStream;
    }
}
