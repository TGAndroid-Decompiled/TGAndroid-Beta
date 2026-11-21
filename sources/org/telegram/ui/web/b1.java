package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class b1 {
    public final HashMap f53104a = new HashMap();
    public File f53105b;
    public long f53106c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new a1(this.f53106c, this.d, this.f53105b));
        HashMap hashMap = this.f53104a;
        c1 c1Var = (c1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (c1Var == null) {
            str = null;
        } else {
            str = c1Var.f53110a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        c1 c1Var2 = (c1) hashMap.get("content-transfer-encoding");
        if (c1Var2 != null) {
            str2 = c1Var2.f53110a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new d1(bufferedInputStream, 0);
        }
        return bufferedInputStream;
    }
}
