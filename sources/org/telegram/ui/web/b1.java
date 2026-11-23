package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class b1 {
    public final HashMap f53108a = new HashMap();
    public File f53109b;
    public long f53110c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new a1(this.f53110c, this.d, this.f53109b));
        HashMap hashMap = this.f53108a;
        c1 c1Var = (c1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (c1Var == null) {
            str = null;
        } else {
            str = c1Var.f53114a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        c1 c1Var2 = (c1) hashMap.get("content-transfer-encoding");
        if (c1Var2 != null) {
            str2 = c1Var2.f53114a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new d1(bufferedInputStream, 0);
        }
        return bufferedInputStream;
    }
}
