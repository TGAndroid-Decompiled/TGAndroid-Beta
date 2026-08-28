package org.telegram.ui.web;

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;
public final class g1 {
    public final HashMap f43861a = new HashMap();
    public File f43862b;
    public long f43863c;
    public long d;

    public final FilterInputStream a() {
        String str;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new f1(this.f43862b, this.f43863c, this.d));
        HashMap hashMap = this.f43861a;
        h1 h1Var = (h1) hashMap.get("content-transfer-encoding");
        String str2 = null;
        if (h1Var == null) {
            str = null;
        } else {
            str = h1Var.f43877a;
        }
        if ("base64".equals(str)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        h1 h1Var2 = (h1) hashMap.get("content-transfer-encoding");
        if (h1Var2 != null) {
            str2 = h1Var2.f43877a;
        }
        if ("quoted-printable".equalsIgnoreCase(str2)) {
            return new i1(bufferedInputStream);
        }
        return bufferedInputStream;
    }
}
