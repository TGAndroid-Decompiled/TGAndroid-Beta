package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class a1 {
    public final HashMap f52569a = new HashMap();
    public File f52570b;
    public long f52571c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new z0(this.f52571c, this.d, this.f52570b));
        HashMap hashMap = this.f52569a;
        b1 b1Var = (b1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (b1Var == null) {
            str = null;
        } else {
            str = b1Var.f52578a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        b1 b1Var2 = (b1) hashMap.get("content-transfer-encoding");
        if (b1Var2 != null) {
            str2 = b1Var2.f52578a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new c1(bufferedInputStream, 0);
        }
        return bufferedInputStream;
    }
}
