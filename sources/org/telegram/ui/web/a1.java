package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class a1 {
    public final HashMap f53064a = new HashMap();
    public File f53065b;
    public long f53066c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new z0(this.f53066c, this.d, this.f53065b));
        HashMap hashMap = this.f53064a;
        b1 b1Var = (b1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (b1Var == null) {
            str = null;
        } else {
            str = b1Var.f53073a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        b1 b1Var2 = (b1) hashMap.get("content-transfer-encoding");
        if (b1Var2 != null) {
            str2 = b1Var2.f53073a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new c1(bufferedInputStream, 0);
        }
        return bufferedInputStream;
    }
}
