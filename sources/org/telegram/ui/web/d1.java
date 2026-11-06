package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class d1 {
    public final HashMap f51118a = new HashMap();
    public File f51119b;
    public long f51120c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new c1(this.f51120c, this.d, this.f51119b));
        HashMap hashMap = this.f51118a;
        e1 e1Var = (e1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (e1Var == null) {
            str = null;
        } else {
            str = e1Var.f51125a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        e1 e1Var2 = (e1) hashMap.get("content-transfer-encoding");
        if (e1Var2 != null) {
            str2 = e1Var2.f51125a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new f1(bufferedInputStream, 0);
        }
        return bufferedInputStream;
    }
}
