package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class c1 {
    public final HashMap f51092a = new HashMap();
    public File f51093b;
    public long f51094c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new b1(this.f51094c, this.d, this.f51093b));
        HashMap hashMap = this.f51092a;
        d1 d1Var = (d1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (d1Var == null) {
            str = null;
        } else {
            str = d1Var.f51099a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        d1 d1Var2 = (d1) hashMap.get("content-transfer-encoding");
        if (d1Var2 != null) {
            str2 = d1Var2.f51099a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new e1(bufferedInputStream, 0);
        }
        return bufferedInputStream;
    }
}
